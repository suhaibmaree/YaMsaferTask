package l.s.yamsaferapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import l.s.yamsaferapp.Accommodations.Accommodation;
import l.s.yamsaferapp.R;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.MyViewHolder>{

    private Context mContext;
    private List<Accommodation> accommodationList;

    public RoomAdapter(Context mContext, List<Accommodation> accommodationList) {
        this.mContext = mContext;
        this.accommodationList = accommodationList;
    }

    public void setMovieList(List<Accommodation> accommodationList){
        this.accommodationList = accommodationList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.room_card,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(accommodationList.get(i).getName());
        myViewHolder.userrating.setText(accommodationList.get(i).getAllotment()+" Rate available");


        Glide.with(mContext)
                .load(accommodationList.get(i).getCoverImage())
                .placeholder(R.drawable.load).into(myViewHolder.cardImage);

    }

    @Override
    public int getItemCount() {
        if(accommodationList != null) {
            return accommodationList.size();
        }
        return  0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView userrating;
        public ImageView cardImage;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.card_name);
            userrating = itemView.findViewById(R.id.rate_numbers);
            cardImage = itemView.findViewById(R.id.cover_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
//

                    }
                }
            });
        }
    }

}

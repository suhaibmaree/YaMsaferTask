package l.s.yamsaferapp.Utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.List;
import l.s.yamsaferapp.Accommodations.Accommodation;
import l.s.yamsaferapp.Accommodations.Rate;
import l.s.yamsaferapp.R;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.MyViewHolder>{

    private Context mContext;
    private List<Accommodation> accommodationList;
    int flag =0;

    public RoomAdapter(Context mContext, List<Accommodation> accommodationList) {
        this.mContext = mContext;
        this.accommodationList = accommodationList;
    }

    public void setAccommodationList(List<Accommodation> accommodationList){
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
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {
        myViewHolder.name.setText(accommodationList.get(i).getName());
        myViewHolder.userrating.setText(accommodationList.get(i).getAllotment()+" Rate available");
        final Accommodation acc = accommodationList.get(i);
        if (acc.flag ==0)
            myViewHolder.arrow.setImageResource(R.drawable.arrow_down);
        else
            myViewHolder.arrow.setImageResource(R.drawable.arrow_up);


        Glide.with(mContext)
                .load(accommodationList.get(i).getCoverImage())
                .placeholder(R.drawable.load).into(myViewHolder.cardImage);

        Glide.with(mContext)
                .load(accommodationList.get(i).getCoverImage())
                .placeholder(R.drawable.load).into(myViewHolder.imageViewRate);

        myViewHolder.bind(acc);

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (acc.flag==0)
                    acc.flag=1;
                else
                    acc.flag=0;
                boolean expanded = acc.isExpanded();
                acc.setExpanded(!expanded);
                notifyItemChanged(i);
            }
        });


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
        public ImageView imageViewRate;
        public View subItem;
        public TextView Adult;
        public TextView refundable;
        public TextView Adult2;
        public TextView baseRate;
        public ImageView arrow;
        public View firstLine;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.card_name);
            userrating = itemView.findViewById(R.id.rate_numbers);
            cardImage = itemView.findViewById(R.id.cover_image);
            subItem = itemView.findViewById(R.id.subitem);
            imageViewRate = itemView.findViewById(R.id.imageViewRate);
            Adult = itemView.findViewById(R.id.Adult);
            refundable = itemView.findViewById(R.id.refundable);
            Adult2 = itemView.findViewById(R.id.Adult2);
            baseRate = itemView.findViewById(R.id.base_rate);
            arrow = itemView.findViewById(R.id.arrow);
            firstLine = itemView.findViewById(R.id.first_line);

        }

        private void bind(Accommodation acc) {
            boolean expanded = acc.isExpanded();

            String refundableText = "";
            if (acc.getRates().get(0).getIsRefundable())
                refundableText = "Refundable";
            else
                refundableText="Non-Refundable";

            subItem.setVisibility(expanded ? View.VISIBLE : View.GONE);
            cardImage.setVisibility(expanded ? View.GONE : View.VISIBLE);
            userrating.setVisibility(expanded ? View.GONE : View.VISIBLE);
            firstLine.setVisibility(expanded ? View.GONE : View.VISIBLE);

            Glide.with(mContext)
                    .load(acc.getCoverImage())
                    .placeholder(R.drawable.load).into(imageViewRate);
            Adult.setText("Up to "+acc.getRates().get(0).getAdults()+" adults");
            refundable.setText(refundableText);
            Adult2.setText(acc.getRates().get(0).getAdults()+" adult");
            baseRate.setText("₪ "+acc.getRates().get(0).getBaseRate());

        }
    }

}

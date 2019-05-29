package l.s.yamsaferapp.Fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

import l.s.yamsaferapp.Accommodations.Accommodation;
import l.s.yamsaferapp.R;
import l.s.yamsaferapp.Utils.NetworkUtils;
import l.s.yamsaferapp.Utils.RoomAdapter;

public class FragmentPayAtHotel extends Fragment {

    private static final String TAG = "PayAtHotelFragment";

    private String APIURL;
    private ArrayList<Accommodation> mAccommodations;
    private RecyclerView recyclerView;
    private RoomAdapter mRroomAdapter;
    private ProgressBar mProgressBar;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_pay_at_hotel, container, false);
        Log.d(TAG,"onCreate: Starting");
        mProgressBar = view.findViewById(R.id.indeterminateBar);
        mProgressBar.setVisibility(View.INVISIBLE);
        NetworkUtils.networkStatus(getActivity());

        FetchAccommodations fetchAccommodations = new FetchAccommodations();
        fetchAccommodations.execute();

        initViews(view);


        return view;
    }// end onCreate view


    private void initViews(View view) {

        recyclerView = view.findViewById(R.id.pay_recycler_view);
        mRroomAdapter = new RoomAdapter(getContext(), mAccommodations);
        recyclerView.setAdapter(mRroomAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

    }//end initViews


    //AsyncTask
    public class FetchAccommodations extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            APIURL = "https://api.yamsafer.me/en/api/v3/rates?checkin_date=08/13/2019&checkout_date=08/14/2019&property_id=130737&rooms=1&adults=2&children=0&children_ages=0&api_key=5c75aabcc20a33be13a4466f155d9c7c&udid=61777288&bundelId=me.yamsafer.Yamsafer&version=2.2";
            mAccommodations = new ArrayList<>();

            try {
                ArrayList<Accommodation> list;
                list = NetworkUtils.fetchData(APIURL); //Get accommodations and save it in array
                Log.d(TAG, ""+list.get(0).getName());
                for (int i = 0; i<list.size();i++){
                    if (list.get(i).getRates().get(0).getIsPromotion().equals(Boolean.FALSE)){
                        mAccommodations.add(list.get(i));
                    }
                }

            }//end try
            catch (IOException e) {
                e.printStackTrace();
            }//end catch
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(Void s) {
            super.onPostExecute(s);
            mProgressBar.setVisibility(View.INVISIBLE);
            mRroomAdapter.setAccommodationList(mAccommodations);

        }

    }//end AsyncTask

}
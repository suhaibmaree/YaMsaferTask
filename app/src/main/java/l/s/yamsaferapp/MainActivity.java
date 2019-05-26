package l.s.yamsaferapp;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.io.IOException;
import java.util.ArrayList;

import l.s.yamsaferapp.Accommodations.Accommodation;
import l.s.yamsaferapp.Fragments.FragmentPayAtHotel;
import l.s.yamsaferapp.Fragments.FragmentPrePaid;
import l.s.yamsaferapp.Main.SectionsPageAdapter;
import l.s.yamsaferapp.Utils.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: Starting");

        mViewPager = findViewById(R.id.view_pager);
        setupViewPager(mViewPager);

        //set tabs
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#81d4fa"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#ffb74d"), Color.parseColor("#66bb6a"));
        tabLayout.setupWithViewPager(mViewPager);



    }//end onCreate

    private void setupViewPager(ViewPager viewPager){

        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentPayAtHotel(),"PAY AT HOTEL");
        adapter.addFragment(new FragmentPrePaid(),"PRE-PAID");
        viewPager.setAdapter(adapter);
    }
}
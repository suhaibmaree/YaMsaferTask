package l.s.yamsaferapp.Main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitelList = new ArrayList<>();

    //useing to add fragment to fragment list
    public void addFragment(Fragment fragment,String titele){
        mFragmentList.add(fragment);
        mFragmentTitelList.add(titele);

    }//end addFragment method


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitelList.get(position);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }
    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}

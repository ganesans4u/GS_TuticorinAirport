
package gs.tuticorinairport.adapter;

import gs.tuticorinairport.FragmentAirlines;
import gs.tuticorinairport.FragmentArrivals;
import gs.tuticorinairport.FragmentDeparture;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int index) {

        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new FragmentArrivals();
        case 1:
            // Games fragment activity
            return new FragmentDeparture();
        case 2:
            // Movies fragment activity
            return new FragmentAirlines();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}
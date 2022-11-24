package pool.marbum.marbumpoll.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import pool.marbum.marbumpoll.fragments.InfoFragment;
import pool.marbum.marbumpoll.fragments.PriceFragment;
import pool.marbum.marbumpoll.fragments.RulesFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter (@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new InfoFragment();
            case 1:
                return new PriceFragment();
            case 2:
                return new RulesFragment();
            default:
                return new InfoFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

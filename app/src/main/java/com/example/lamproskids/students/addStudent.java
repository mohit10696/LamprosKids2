package com.example.lamproskids.students;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.cheekiat.indicatorsteplib.DotOnClickListener;
import com.cheekiat.indicatorsteplib.StepProgress;
import com.example.lamproskids.R;

public class addStudent extends AppCompatActivity implements fragment_addchildinfo.OnFragmentInteractionListener,fragment_addparentinfo.OnFragmentInteractionListener{

    private static final int NUM_PAGES = 2;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    StepProgress layoutProgress1;
    Fragment fragment[] = new Fragment[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        layoutProgress1 = findViewById(R.id.step_progress_1);
        mPager =  findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        layoutProgress1.setupWithViewPager(mPager);
        layoutProgress1.setDotsOnClickListener(new DotOnClickListener() {
            @Override
            public void onClick(int position) {
                mPager.setCurrentItem(position);
            }
        });
        fragment[0] = new fragment_addchildinfo();
        fragment[1] = new fragment_addparentinfo();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return  fragment[position];
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}

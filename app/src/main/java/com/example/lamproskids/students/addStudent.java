package com.example.lamproskids.students;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.cheekiat.indicatorsteplib.DotOnClickListener;
import com.cheekiat.indicatorsteplib.StepProgress;
import com.example.lamproskids.R;

public class addStudent extends AppCompatActivity implements fragment_addguardinfo.OnFragmentInteractionListener,fragment_addnotesinfo.OnFragmentInteractionListener,  fragment_addchildinfo.OnFragmentInteractionListener,fragment_addparentinfo.OnFragmentInteractionListener{

    private static final int NUM_PAGES = 4;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    StepProgress layoutProgress1;
    Button next,pre;
    int currentpage=0;
    Fragment fragment[] = new Fragment[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        setTitle("Add new Children");
        layoutProgress1 = findViewById(R.id.step_progress_1);
        next = findViewById(R.id.nextbutton);
        pre = findViewById(R.id.prebutton);
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
        fragment[2] = new fragment_addguardinfo();
        fragment[3] = new fragment_addnotesinfo();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentpage = mPager.getCurrentItem();
                if(currentpage<NUM_PAGES)
                mPager.setCurrentItem(++currentpage);
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentpage = mPager.getCurrentItem();
                if(currentpage<NUM_PAGES)
                mPager.setCurrentItem(--currentpage);
            }
        });
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position == 3)submitform();
                if(next.getText().equals("SUBMIT")&&position!=3){
                    next.setText("NEXT");
                    next.setBackground(getApplication().getResources().getDrawable(R.color.colorlogo));
                }
            }

            @Override
            public void onPageSelected(int position) {
              //  Toast.makeText(getApplicationContext(),"200",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //Toast.makeText(getApplicationContext(),"300",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void submitform() {
        next.setText("SUBMIT");
        next.setBackground(this.getResources().getDrawable(R.color.submit));
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

package com.tutorialsbuzz.recyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tutorialsbuzz.recyclerview.TabFragments.TabOneFragment;
import com.tutorialsbuzz.recyclerview.TabFragments.TabThreeFragment;
import com.tutorialsbuzz.recyclerview.TabFragments.TabTwoFragment;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons = {
            R.drawable.ic_action_person,
            R.drawable.ic_action_group,
            R.drawable.ic_action_call
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOneFragment(), "One");
        adapter.addFragment(new TabTwoFragment(), "Two");
        adapter.addFragment(new TabThreeFragment(), "Three");
        viewPager.setAdapter(adapter);

    }


}

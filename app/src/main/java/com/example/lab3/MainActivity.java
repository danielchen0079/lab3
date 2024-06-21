package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import adapter.ViewPagerAdapter;
import fragment.AttractionFragment;
import fragment.HotelFragment;
import fragment.RestaurantFragment;

public class MainActivity extends AppCompatActivity {

    private int[] rowImage = {R.drawable.rowimg1, R.drawable.rowimg2, R.drawable.rowimg3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager2 viewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this, rowImage);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Attractions");
                        break;
                    case 1:
                        tab.setText("Restaurants");
                        break;
                    case 2:
                        tab.setText("Hotels");
                        break;
                }
            }
        }).attach();
    }

    public void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}

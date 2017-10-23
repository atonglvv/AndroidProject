package com.example.ubi.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ubi.recycleviewforbook.R;
import com.example.ubi.view.RoundAngleImageView;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    @BindView(R.id.recyclerView)
    RecyclerView mRecycleView;
    @BindView(R.id.swipe_refresh_layout_recycler_view)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private ActionBarDrawerToggle mDrawerToggle;
    //    获取R.layout.nav_header_main中的R.id.imageView_nav_header 方法一
    private LinearLayout headerView;
    private RoundAngleImageView userAvatar;
    //    方法二
    //    private View headerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mToolbar.setTitle("Attitude");
        setSupportActionBar(mToolbar);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open,
                R.string.drawer_close);
        mDrawerToggle.syncState();
        mDrawerLayout.addDrawerListener(mDrawerToggle);

        //        方法一
        headerView = (LinearLayout) mNavigationView.getHeaderView(0);
        //        方法二
        //        headerView = mNavigationView.inflateHeaderView(R.layout.nav_header_main);
        userAvatar = (RoundAngleImageView) headerView.findViewById(R.id.imageView_nav_header);
        //点击Avatar跳转到PersonActivity
        userAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PersonActivity.class);
                startActivity(intent);
            }
        });

        mNavigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent intent = new Intent();

        switch (item.getItemId()) {
            case R.id.nav_person_homepage:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_scrolling:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_full_screen:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_bottom_navigation:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_settings:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_about:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_donate:
                intent.setClass(this, PersonActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}

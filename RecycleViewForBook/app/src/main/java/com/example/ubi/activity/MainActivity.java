package com.example.ubi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ubi.adapter.RecyclerViewAdapter;
import com.example.ubi.recycleviewforbook.R;
import com.example.ubi.view.RoundAngleImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;
import data.Info;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    @BindView(R.id.swipe_refresh_layout_recycler_view)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.recyclerView)
    RecyclerView mRecycleView;

    private ActionBarDrawerToggle mDrawerToggle;
    //    获取R.layout.nav_header_main中的R.id.imageView_nav_header 方法一
    private LinearLayout headerView;
    private RoundAngleImageView userAvatar;
    //    方法二
    //    private View headerView;
    private RecyclerViewAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private List<Info> infos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }
        });

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
        initInfoData();



//        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        mRecycleView.setLayoutManager(linearLayoutManager);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setItemAnimator(new DefaultItemAnimator());
        adapter = new RecyclerViewAdapter(infos,this);
        mRecycleView.setAdapter(adapter);
        Toast.makeText(this,"HelloWorld",Toast.LENGTH_SHORT).show();

    }

    private void initInfoData() {
        infos = new ArrayList<Info>();
        infos.add(new Info(R.drawable.avatar,"《英雄联盟》S7总决赛门票被炒翻27倍","今天LOL官方公布了S7总决赛门票价格，分别为。。。","2017-10-24"));
        infos.add(new Info(R.drawable.avatar,"《英雄联盟》S7总决赛门票被炒翻27倍","今天LOL官方公布了S7总决赛门票价格，分别为。。。","2017-10-24"));
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

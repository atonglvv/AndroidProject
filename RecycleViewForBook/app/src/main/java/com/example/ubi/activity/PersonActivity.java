package com.example.ubi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ubi.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Innovation on 2017/10/19.
 * vesion 1.0
 */

public class PersonActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        ButterKnife.bind(this);

        mToolbar.setTitle("个人主页");
        setSupportActionBar(mToolbar);
        //设置是否有返回箭头
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}

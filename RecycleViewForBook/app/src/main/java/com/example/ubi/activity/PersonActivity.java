package com.example.ubi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ubi.recycleviewforbook.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lt155 on 2017/10/19.
 */

public class PersonActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        ButterKnife.bind(this);

        mToolbar.setTitle("个人主页");
        setSupportActionBar(mToolbar);
    }
}

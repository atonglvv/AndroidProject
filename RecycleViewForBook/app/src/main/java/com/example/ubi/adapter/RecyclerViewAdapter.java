package com.example.ubi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ubi.recycleviewforbook.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lt155 on 2017/10/23.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_main, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_recycler)
        ImageView photo;
        @BindView(R.id.tv_recycler_item_title)
        TextView title;
        @BindView(R.id.tv_recycler_item_content)
        TextView content;
        @BindView(R.id.tv_recycler_item_time)
        TextView time;

        private RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

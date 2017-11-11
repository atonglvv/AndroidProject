package com.example.ubi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ubi.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.ubi.data.Info;

/**
 * Created by lt155 on 2017/10/23.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.InfoViewHolder>{

    private List<Info> infos = new ArrayList<Info>();
    private Context context;

    public RecyclerViewAdapter(List<Info> infos, Context context) {
        this.infos = infos;
        this.context=context;
    }

    @Override
    public RecyclerViewAdapter.InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_main, parent, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.InfoViewHolder holder, int position) {
        holder.photo.setImageResource(infos.get(position).getPhotoId());
        holder.title.setText(infos.get(position).getTitle());
        holder.content.setText(infos.get(position).getContent());
        holder.time.setText(infos.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }


    class InfoViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_recycler)
        ImageView photo;
        @BindView(R.id.tv_recycler_item_title)
        TextView title;
        @BindView(R.id.tv_recycler_item_content)
        TextView content;
        @BindView(R.id.tv_recycler_item_time)
        TextView time;

        private InfoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}

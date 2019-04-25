package com.example.minidemo.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minidemo.R;
import com.example.minidemo.model.Info;
import com.example.minidemo.recycler.viewholder.InfoViewHolder;

import java.util.List;

/**
 * @author bob
 * Date     19-4-25
 * Description
 */
class Infoadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Info> datas;
    private Context ctx;

    public Infoadapter(Context context, List<Info> datas) {
        this.ctx = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.app_recycle_item_info, viewGroup, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}

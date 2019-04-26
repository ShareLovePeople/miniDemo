package com.example.minidemo.recycler.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.minidemo.R;
import com.example.minidemo.model.BaseInfo;

import java.util.List;

/**
 * @author bob
 * Date     19-4-25
 * Description
 */
public class Infoadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<BaseInfo> data;
    private Context ctx;

    public Infoadapter(Context context, List<BaseInfo> data) {
        this.ctx = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.app_recycle_item_info, viewGroup, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        BaseInfo baseInfo = data.get(i);
        if (viewHolder instanceof InfoViewHolder) {
            InfoViewHolder infoViewHolder = (InfoViewHolder) viewHolder;
            infoViewHolder.tvTitle.setText(baseInfo.getName());
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class InfoViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView imgIcon;

        InfoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.info_title);
            imgIcon = itemView.findViewById(R.id.info_icon);
        }
    }
}

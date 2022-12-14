package com.example.quotes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewData> {
    Activity activity;
    List<ModelData> l3 =new ArrayList<>();

    public RvAdapter(MainActivity mainActivity, List l2) {
        activity = mainActivity;
        this.l3=l2;
    }
    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.list_item,parent,false);
        return new ViewData(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {
        holder.txttitle.setText(l3.get(position).getType());
        holder.imgicon.setImageResource(l3.get(position).getIcon());
        holder.lay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,quotes.class);
                intent.putExtra("imgquotes",position);
                intent.putExtra("txtquotes",position);
                activity.startActivity(intent);

            }
        });
    }
    @Override
    public int getItemCount() {
        return l3.size();
    }
    class ViewData extends RecyclerView.ViewHolder {
        RelativeLayout lay1;
        TextView txttitle;
        ImageView imgicon;
        public ViewData( View view) {
            super(view);
            txttitle=view.findViewById(R.id.txttitle);
            imgicon=view.findViewById(R.id.imgicon);
            lay1=view.findViewById(R.id.lay1);


        }
    }
    void filterlist(List<ModelData> filter) {
        l3=filter;
        notifyDataSetChanged();
    }
}

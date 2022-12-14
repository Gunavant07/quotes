package com.example.quotes;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class optionAdapter extends RecyclerView.Adapter<optionAdapter.ViewData> {
    Activity activity;
    List<ModelData> l2 =new ArrayList<ModelData>();

    public optionAdapter(MainActivity mainActivity, List<ModelData> l2) {
        activity = mainActivity;
        this.l2=l2;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(activity).inflate(R.layout.option_list,parent,false);
        return new ViewData(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        holder.txtoption.setText(l2.get(position).getOption());
        holder.card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity,optionlist.class);
                intent.putExtra("imgquote",0);
                activity.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return l2.size();
    }

    class ViewData extends RecyclerView.ViewHolder {
        TextView txtoption;
        CardView card2;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            txtoption=itemView.findViewById(R.id.txtoption);
            card2=itemView.findViewById(R.id.card2);

        }
    }
}

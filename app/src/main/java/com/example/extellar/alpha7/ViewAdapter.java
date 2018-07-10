package com.example.extellar.alpha7;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder> {
    List<Tamplate> posts;
    Context context;

    public ViewAdapter(List<Tamplate> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Tamplate item = posts.get(position);
        String s = item.getTitle().toString();
        String f = item.getContent().toString();
        holder.view1.setText(s);
        holder.view2.setText(f);


    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView view1;
        public TextView view2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view1= itemView.findViewById(R.id.textView);
            view2= itemView.findViewById(R.id.textView2);

        }
    }
}

package com.example.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Callback;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.Myviewholder> {
    private List<String> mData;
    private Context context;

    public TimeAdapter(List<String> slotsList, Callback<Model> modelCallback) {
mData=slotsList;

    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_header, parent, false);
        return new Myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        String slot = mData.get(position);
        holder.txt_time.setText(slot);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class Myviewholder extends RecyclerView.ViewHolder {
        TextView txt_time;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            txt_time=itemView.findViewById(R.id.text_header);
        }
    }
}

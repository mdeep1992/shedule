package com.example.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.Myviewholder> {


    public DayAdapter(List<Day> mData) {
        this.mData = mData;
    }

    private List<Day> mData;
    private Context context;
    private int selectedItem = 0;


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_date, parent, false);
        return new Myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        Day day = mData.get(position);
        holder.txt_title.setText(day.title);
        holder.txt_date.setText(day.date + "");
        holder.viewRoot.setSelected(selectedItem == position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        TextView txt_title;
        TextView txt_date;
        View viewRoot;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.text_day);
            txt_date = itemView.findViewById(R.id.text_date);
            viewRoot = itemView.findViewById(R.id.view_root);
            viewRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    changeSelection(getAdapterPosition());
                }
            });
        }
    }

    public void changeSelection(int pos) {
        int lastSelectedItem = selectedItem;
        selectedItem = pos;
        notifyItemChanged(lastSelectedItem);
        notifyItemChanged(selectedItem);
    }
}

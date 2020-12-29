package com.raredevelopers.abbreviations;

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.viewHolder> {

    Context context;
    String[] alphabets;

    public AlphabetAdapter(Context context, String[] alphabets) {
        this.context = context;
        this.alphabets = alphabets;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.alphabet, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int position) {
        viewHolder.iconName.setText(alphabets[position]);
    }

    @Override
    public int getItemCount() {
        return alphabets.length;
    }

    class viewHolder extends RecyclerView.ViewHolder {
        TextView iconName;

        public viewHolder(View itemView) {
            super(itemView);
            iconName = itemView.findViewById(R.id.alphabet);
        }
    }
}

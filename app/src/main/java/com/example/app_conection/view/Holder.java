package com.example.app_conection.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_conection.R;

public class Holder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView level;
    private ImageView image;

    public Holder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.name);
        this.level = itemView.findViewById(R.id.level);
        this.image = itemView.findViewById(R.id.img);
    }

    public TextView getName() {
        return name;
    }

    public TextView getLevel() {
        return level;
    }

    public ImageView getImage() {
        return image;
    }
}

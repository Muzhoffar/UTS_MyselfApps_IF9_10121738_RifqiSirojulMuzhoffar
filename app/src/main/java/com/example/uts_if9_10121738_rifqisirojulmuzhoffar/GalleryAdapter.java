package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.myviewholder> {

    ArrayList<GalleryModel> galleryModel;

    public GalleryAdapter(ArrayList<GalleryModel> galleryModel) {
        this.galleryModel = galleryModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivGallery.setImageResource(galleryModel.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivGallery = itemView.findViewById(R.id.iv_gallery);
        }
    }
}

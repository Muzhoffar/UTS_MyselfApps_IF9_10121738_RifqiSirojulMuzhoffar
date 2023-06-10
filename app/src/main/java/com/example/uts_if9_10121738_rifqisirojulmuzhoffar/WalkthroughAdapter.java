package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

/*  Tanggal Pengerjaan  : 5 Juli 2023
    Nama                : Rifqi Sirojul Muzhoffar
    NIM                 : 10121738
    Kelas               : IF-9 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WalkthroughAdapter extends RecyclerView.Adapter<WalkthroughAdapter.WalkthroughViewHolder> {

    private List<WalkthroughModel> walkthroughModels;

    public WalkthroughAdapter(List<WalkthroughModel> walkthroughModels) {
        this.walkthroughModels = walkthroughModels;
    }

    @NonNull
    @Override
    public WalkthroughViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WalkthroughViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_walkthrough, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull WalkthroughViewHolder holder, int position) {
        holder.setWalkthroughData(walkthroughModels.get(position));
    }

    @Override
    public int getItemCount() {
        return walkthroughModels.size();
    }

    class WalkthroughViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitleWalkthrough;
        private TextView tvSubtitleWalkthrough;
        private ImageView ivWalkthrough;

        public WalkthroughViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitleWalkthrough = itemView.findViewById(R.id.tv_titlewalkthrough);
            tvSubtitleWalkthrough = itemView.findViewById(R.id.tv_subtitlewalkthrough);
            ivWalkthrough = itemView.findViewById(R.id.iv_walkthrough);
        }

        void setWalkthroughData(WalkthroughModel walkthroughModel) {
            tvTitleWalkthrough.setText(walkthroughModel.getTitle());
            tvSubtitleWalkthrough.setText(walkthroughModel.getSubtitle());
            ivWalkthrough.setImageResource(walkthroughModel.getImage());
        }
    }
}

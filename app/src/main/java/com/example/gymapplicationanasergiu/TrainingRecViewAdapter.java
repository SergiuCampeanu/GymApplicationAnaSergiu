package com.example.gymapplicationanasergiu;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TrainingRecViewAdapter extends RecyclerView.Adapter<TrainingRecViewAdapter.ViewHolder>{
    private static final String TAG = "TrainingRecViewAdapter";

    private Context mContext;
    private ArrayList<GymTraining> trainings = new ArrayList<>();

    public TrainingRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public TrainingRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.training_list_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called");
        viewHolder.txtName.setText(trainings.get(i).getName());
        viewHolder.txtShortDesc.setText(trainings.get(i).getShortDesc());

        Glide.with(mContext)
                .asBitmap()
                .load(trainings.get(i).getImageURL())
                .into(viewHolder.image);

        viewHolder.parent.setOnClickListener((v) -> {
                //Todo: navigate to the other activity
                Intent intent = new Intent(mContext, TrainingActivity.class);
                intent.putExtra("training", trainings.get(i));
                mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return trainings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtName, txtShortDesc;
        private ImageView image;
        private CardView parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.trainingName);
            txtShortDesc = (TextView) itemView.findViewById(R.id.trainingShortDescription);

            image = (ImageView) itemView.findViewById(R.id.trainingImage);
            parent = (CardView) itemView.findViewById(R.id.parent);
        }
    }

    public void setTrainings(ArrayList<GymTraining> trainings) {
        this.trainings = trainings;
        notifyDataSetChanged();
    }
}
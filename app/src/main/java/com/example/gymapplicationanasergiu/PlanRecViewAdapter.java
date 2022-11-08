package com.example.gymapplicationanasergiu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlanRecViewAdapter extends RecyclerView.Adapter<PlanRecViewAdapter.ViewHolder>{
    private static final String TAG = "PlanRecViewAdapter";

    private Context mContext;
    private ArrayList<Plan> plans = new ArrayList<>();

    public PlanRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public PlanRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plan_list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: called");
        viewHolder.activityName.setText(plans.get(i).getTraining().getName());
        Glide.with(mContext)
                .asBitmap()
                .load(plans.get(i).getTraining().getImageURL())
                .into(viewHolder.activityImage);

        viewHolder.activityTime.setText(String.valueOf(plans.get(i).getMinutes()));
        viewHolder.activityShortDescription.setText(plans.get(i).getTraining().getShortDesc());
        if (plans.get(i).isAccomplished()) {
            viewHolder.emptyCheckBox.setVisibility(View.GONE);
            viewHolder.filledCheckBox.setVisibility(View.VISIBLE);
        }else{
                viewHolder.emptyCheckBox.setVisibility(View.VISIBLE);
                viewHolder.filledCheckBox.setVisibility(View.GONE);
            }

        viewHolder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: navigate to plan activity
            }
        });


        }

    @Override
    public int getItemCount() {
        return plans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView activityName, activityTime, activityShortDescription;
        private ImageView activityImage, emptyCheckBox, filledCheckBox;
        private CardView parent;

        public ViewHolder (@NonNull View itemView) {

            super(itemView);
            activityName = (TextView) itemView.findViewById(R.id.activityName);
            activityShortDescription = (TextView) itemView.findViewById(R.id.txtShortDescription);
            activityTime = (TextView) itemView.findViewById(R.id.txtTimeAmount);
            parent = (CardView) itemView.findViewById(R.id.parent);
            activityImage = (ImageView) itemView.findViewById(R.id.activityImage);
            emptyCheckBox = (ImageView) itemView.findViewById(R.id.emptyCheckBox);
            filledCheckBox = (ImageView) itemView.findViewById(R.id.filledCheckBox);
        }
    }
}

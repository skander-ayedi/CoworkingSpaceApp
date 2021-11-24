package com.example.coworkingspaceapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coworkingspaceapp.R;
import com.example.coworkingspaceapp.models.CoworkingSpace;
import com.example.coworkingspaceapp.models.Feedback;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReviewListAdapter extends RecyclerView.Adapter<ReviewListAdapter.ReviewViewHolder> {
    ArrayList<Feedback> mFeedbackList;
    private LayoutInflater mInflater;

    public ReviewListAdapter(Context context,
                             ArrayList<Feedback> feecbackList) {
        mInflater = LayoutInflater.from(context);
        this.mFeedbackList = feecbackList;




    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mItemView = mInflater.inflate(R.layout.feedback,
                parent, false);

        TextView reviewDateItemView = mItemView.findViewById(R.id.feedback_date);
        TextView reviewDescriptionItemView = mItemView.findViewById(R.id.feedback_description);
        return new ReviewViewHolder(mItemView,   reviewDateItemView,  reviewDescriptionItemView   ,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        Feedback mCurrent = mFeedbackList.get(position);
        holder.reviewDescriptionItemView.setText(mCurrent.getReview());

    }



    @Override
    public int getItemCount() {
        return mFeedbackList.size();
    }

    static class ReviewViewHolder extends RecyclerView.ViewHolder {
        public final TextView reviewDateItemView;
        public final TextView reviewDescriptionItemView;

        final ReviewListAdapter mAdapter;
        private final View reviewItemView;


        ReviewViewHolder(View reviewItemView, TextView reviewDateItemView, TextView reviewDescriptionItemView, ReviewListAdapter mAdapter) {
            super(reviewItemView);
            this.reviewDateItemView = reviewDateItemView.findViewById(R.id.feedback_description);
            this.reviewDescriptionItemView = reviewDescriptionItemView.findViewById(R.id.feedback_description);
            this.reviewItemView = reviewItemView.findViewById(R.id.imageView);
            this.mAdapter = mAdapter;
        }
    }
}

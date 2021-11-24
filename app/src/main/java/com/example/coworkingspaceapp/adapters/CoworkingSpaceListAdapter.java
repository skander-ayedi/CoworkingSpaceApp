package com.example.coworkingspaceapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coworkingspaceapp.MainActivity;
import com.example.coworkingspaceapp.MainActivity3;
import com.example.coworkingspaceapp.OnImageClickListener;
import com.example.coworkingspaceapp.R;
import com.example.coworkingspaceapp.contract.Model;
import com.example.coworkingspaceapp.models.CoworkingSpace;

import java.util.LinkedList;


public class CoworkingSpaceListAdapter extends RecyclerView.Adapter<CoworkingSpaceListAdapter.CoworkingSpaceViewHolder>  {
    LinkedList<CoworkingSpace> mCoworkingSpaceList;
    private LayoutInflater mInflater;
    private OnImageClickListener onImageClickListener;


    public CoworkingSpaceListAdapter(Context context,
                                     LinkedList<CoworkingSpace> coworkingSpaceList) {
        mInflater = LayoutInflater.from(context);
        this.mCoworkingSpaceList = coworkingSpaceList;





    }



    @NonNull
    @Override
    public CoworkingSpaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View mItemView = mInflater.inflate(R.layout.coworkingspace,
                parent, false);
        return new CoworkingSpaceViewHolder(mItemView, this);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull CoworkingSpaceViewHolder holder, int position) {
        CoworkingSpace mCurrent = mCoworkingSpaceList.get(position);
        holder.coworkingSpaceItemView.setText(mCurrent.getName());

        holder.coworkingSpaceItemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), MainActivity3.class);
                intent3.putExtra("coworking_space_position",position);



                onImageClickListener.onImageClick(position);


            }
        });

    }





    @Override
    public int getItemCount() {

        System.out.println(mCoworkingSpaceList.size());


        return mCoworkingSpaceList.size();
    }


    static class CoworkingSpaceViewHolder extends RecyclerView.ViewHolder {
        public final TextView coworkingSpaceItemView;
        final CoworkingSpaceListAdapter mAdapter;




        CoworkingSpaceViewHolder(View coworkingSpaceItemView, CoworkingSpaceListAdapter mAdapter) {
            super(coworkingSpaceItemView);
            this.coworkingSpaceItemView = coworkingSpaceItemView.findViewById(R.id.coworkingspace_name);
            this.mAdapter = mAdapter;
        }




    }
}

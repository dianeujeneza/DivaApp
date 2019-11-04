package com.moringaschool.divaapp.adapters;

import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.divaapp.util.ItemTouchHelperViewHolder;

public class FirebaseViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
    @Override
    public void onItemSelected() {
        Log.d("Animation", "onItemSelected");
        // we will add animations here
    }

    @Override
    public void onItemClear() {
        Log.d("Animation", "onItemClear");
        // we will add animations here
    }
}

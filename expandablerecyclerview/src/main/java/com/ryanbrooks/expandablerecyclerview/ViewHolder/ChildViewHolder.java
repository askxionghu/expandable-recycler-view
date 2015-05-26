package com.ryanbrooks.expandablerecyclerview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ryanbrooks.expandablerecyclerview.Adapter.ExpandableRecyclerViewAdapter;
import com.ryanbrooks.expandablerecyclerview.ClickListener.ChildItemClickListener;

/**
 * Created by Ryan Brooks on 5/21/15.
 * Doesn't do anything other than allow user to differentiate between Parent and Child VH
 */
public class ChildViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final String TAG = this.getClass().getSimpleName();

    protected ChildItemClickListener childItemClickListener;
    private int originalPosition = -1;

    public ChildViewHolder(View itemView) {
        super(itemView);
     }

    public int getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(int originalPosition) {
        this.originalPosition = originalPosition;
    }

    @Override
    public void onClick(View v) {
        if (childItemClickListener != null) {
            childItemClickListener.onChildItemClickListener(getAdapterPosition() - 1);
        }
    }
}

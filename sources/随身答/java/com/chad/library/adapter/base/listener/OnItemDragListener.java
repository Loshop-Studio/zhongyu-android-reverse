package com.chad.library.adapter.base.listener;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface OnItemDragListener {
    void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i9);

    void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i9, RecyclerView.ViewHolder viewHolder2, int i10);

    void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i9);
}

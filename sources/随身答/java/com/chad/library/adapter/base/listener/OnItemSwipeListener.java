package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int i9);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f10, float f11, boolean z9);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int i9);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int i9);
}

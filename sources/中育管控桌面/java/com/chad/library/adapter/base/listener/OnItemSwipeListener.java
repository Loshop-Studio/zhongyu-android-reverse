package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int i6);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f6, float f7, boolean z6);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int i6);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int i6);
}

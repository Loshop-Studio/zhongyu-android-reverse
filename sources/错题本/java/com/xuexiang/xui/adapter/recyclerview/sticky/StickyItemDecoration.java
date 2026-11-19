package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public RecyclerView.Adapter f3928a;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f3928a != adapter) {
            this.f3928a = adapter;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

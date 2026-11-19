package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f7019a;

    /* renamed from: b */
    public RecyclerView.Adapter f7020b;

    /* renamed from: c */
    public RecyclerView.AdapterDataObserver f7021c;

    /* renamed from: a */
    public final void m6436a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f7020b != adapter) {
            this.f7020b = adapter;
            this.f7019a = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.f7021c);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        m6436a(recyclerView);
    }
}

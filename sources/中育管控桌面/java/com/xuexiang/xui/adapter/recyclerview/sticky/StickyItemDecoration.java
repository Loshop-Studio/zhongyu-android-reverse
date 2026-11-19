package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f4485a;

    /* renamed from: b */
    public RecyclerView.Adapter f4486b;

    /* renamed from: c */
    public RecyclerView.AdapterDataObserver f4487c;

    /* renamed from: a */
    public final void m4341a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f4486b != adapter) {
            this.f4486b = adapter;
            this.f4485a = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.f4487c);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        m4341a(recyclerView);
    }
}

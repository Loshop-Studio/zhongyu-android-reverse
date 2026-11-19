package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f3105a;

    /* renamed from: b */
    public RecyclerView.Adapter f3106b;

    /* renamed from: c */
    public RecyclerView.AdapterDataObserver f3107c;

    /* renamed from: a */
    public final void m4042a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f3106b != adapter) {
            this.f3106b = adapter;
            this.f3105a = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.f3107c);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        m4042a(recyclerView);
    }
}

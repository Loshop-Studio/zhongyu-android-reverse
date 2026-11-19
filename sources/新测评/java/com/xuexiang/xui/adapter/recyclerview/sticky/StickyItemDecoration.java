package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f5764a;

    /* renamed from: b */
    public RecyclerView.Adapter f5765b;

    /* renamed from: c */
    public RecyclerView.AdapterDataObserver f5766c;

    /* renamed from: a */
    public final void m5336a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f5765b != adapter) {
            this.f5765b = adapter;
            this.f5764a = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.f5766c);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        m5336a(recyclerView);
    }
}

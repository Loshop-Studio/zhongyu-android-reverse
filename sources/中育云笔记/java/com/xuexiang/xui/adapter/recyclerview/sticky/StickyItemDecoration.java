package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes5.dex */
public class StickyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f15200a;

    /* renamed from: b */
    public int f15201b;

    /* renamed from: c */
    public int f15202c;

    /* renamed from: d */
    public int[] f15203d;

    /* renamed from: e */
    public RecyclerView.Adapter f15204e;

    /* renamed from: f */
    public StickyHeadContainer f15205f;

    /* renamed from: g */
    public boolean f15206g;

    /* renamed from: h */
    public RecyclerView.AdapterDataObserver f15207h;

    /* renamed from: a */
    public final void m12160a(RecyclerView recyclerView) {
        int iM12162c = m12162c(recyclerView.getLayoutManager());
        this.f15201b = iM12162c;
        int iM12163d = m12163d(iM12162c);
        if (iM12163d < 0 || this.f15202c == iM12163d) {
            return;
        }
        this.f15202c = iM12163d;
    }

    /* renamed from: b */
    public final void m12161b(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f15204e != adapter) {
            this.f15204e = adapter;
            this.f15202c = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.f15207h);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final int m12162c(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        this.f15203d = iArr;
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int iMin = Integer.MAX_VALUE;
        for (int i10 : this.f15203d) {
            iMin = Math.min(i10, iMin);
        }
        return iMin;
    }

    /* renamed from: d */
    public final int m12163d(int i10) {
        while (i10 >= 0) {
            if (m12165f(this.f15204e.getItemViewType(i10))) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    /* renamed from: e */
    public final boolean m12164e(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return m12165f(this.f15204e.getItemViewType(childAdapterPosition));
    }

    /* renamed from: f */
    public final boolean m12165f(int i10) {
        return this.f15200a == i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        m12161b(recyclerView);
        if (this.f15204e == null || this.f15205f == null) {
            return;
        }
        m12160a(recyclerView);
        if (this.f15206g) {
            int i10 = this.f15201b;
            int i11 = this.f15202c;
            if (i10 >= i11 && i11 != -1) {
                View viewFindChildViewUnder = recyclerView.findChildViewUnder(canvas.getWidth() / 2.0f, this.f15205f.getChildHeight() + 0.01f);
                this.f15205f.m12156c(this.f15202c);
                int childHeight = 0;
                int top2 = viewFindChildViewUnder != null ? viewFindChildViewUnder.getTop() : 0;
                if (m12164e(recyclerView, viewFindChildViewUnder) && top2 >= 0) {
                    childHeight = top2 - this.f15205f.getChildHeight();
                }
                this.f15205f.m12157d(childHeight);
                if (recyclerView.canScrollVertically(1) || childHeight == 0) {
                    return;
                }
                this.f15205f.m12155b();
                return;
            }
        }
        this.f15205f.m12154a();
    }
}

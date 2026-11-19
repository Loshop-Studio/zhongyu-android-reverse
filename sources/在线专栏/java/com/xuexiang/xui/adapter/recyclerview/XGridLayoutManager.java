package com.xuexiang.xui.adapter.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class XGridLayoutManager extends GridLayoutManager {
    private boolean mIsScrollEnabled;

    public XGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.mIsScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollHorizontally() {
        return this.mIsScrollEnabled && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollVertically() {
        return this.mIsScrollEnabled && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        try {
            super.onLayoutChildren(c0576u, c0580y);
        } catch (IndexOutOfBoundsException e4) {
            e4.printStackTrace();
        }
    }

    public XGridLayoutManager setScrollEnabled(boolean z3) {
        this.mIsScrollEnabled = z3;
        return this;
    }

    public XGridLayoutManager(Context context, int i4) {
        super(context, i4);
        this.mIsScrollEnabled = true;
    }

    public XGridLayoutManager(Context context, int i4, int i5, boolean z3) {
        super(context, i4, i5, z3);
        this.mIsScrollEnabled = true;
    }
}

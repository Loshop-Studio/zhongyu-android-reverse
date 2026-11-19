package com.xuexiang.xui.adapter.recyclerview;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: b */
    public final RecyclerViewHolder mo3425b(ViewGroup viewGroup, int i) {
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(m3426c(), viewGroup, false));
        new SparseArray();
        return recyclerViewHolder;
    }

    /* renamed from: c */
    public abstract int m3426c();
}

package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes5.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: d */
    public abstract int m12149d(int i10);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo12148b(ViewGroup viewGroup, int i10) {
        return new RecyclerViewHolder(m12153c(viewGroup, m12149d(i10)));
    }
}

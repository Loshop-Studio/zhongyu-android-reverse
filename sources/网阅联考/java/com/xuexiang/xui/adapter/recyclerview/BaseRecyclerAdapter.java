package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: d */
    public abstract int m4037d(int i4);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo4036b(ViewGroup viewGroup, int i4) {
        return new RecyclerViewHolder(m4041c(viewGroup, m4037d(i4)));
    }
}

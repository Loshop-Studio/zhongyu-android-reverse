package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: f */
    public abstract int m5330f(int i10);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo5329c(ViewGroup viewGroup, int i10) {
        return new RecyclerViewHolder(m5334d(viewGroup, m5330f(i10)));
    }
}

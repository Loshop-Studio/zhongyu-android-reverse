package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: g */
    public abstract int m6414g(int i10);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo6413d(ViewGroup viewGroup, int i10) {
        return new RecyclerViewHolder(m6418e(viewGroup, m6414g(i10)));
    }
}

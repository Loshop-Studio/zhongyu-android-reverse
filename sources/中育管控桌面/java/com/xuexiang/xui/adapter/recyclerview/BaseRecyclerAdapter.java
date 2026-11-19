package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: f */
    public abstract int m4335f(int i6);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo4334c(ViewGroup viewGroup, int i6) {
        return new RecyclerViewHolder(m4339d(viewGroup, m4335f(i6)));
    }
}

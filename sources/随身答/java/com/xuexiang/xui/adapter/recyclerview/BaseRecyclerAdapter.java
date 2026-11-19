package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    /* renamed from: e */
    public abstract int m6431e(int i9);

    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder mo6430c(ViewGroup viewGroup, int i9) {
        return new RecyclerViewHolder(m6435d(viewGroup, m6431e(i9)));
    }
}

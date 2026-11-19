package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class BaseRecyclerAdapter<T> extends XRecyclerAdapter<T, RecyclerViewHolder> {
    public BaseRecyclerAdapter() {
    }

    protected abstract int getItemLayoutId(int i4);

    public BaseRecyclerAdapter(Collection<T> collection) {
        super(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter
    public RecyclerViewHolder getViewHolder(ViewGroup viewGroup, int i4) {
        return new RecyclerViewHolder(inflateView(viewGroup, getItemLayoutId(i4)));
    }

    public BaseRecyclerAdapter(T[] tArr) {
        super(tArr);
    }
}

package com.xuexiang.xui.adapter.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: a */
    public final ArrayList f3926a = new ArrayList();

    /* renamed from: a */
    public abstract void m3427a();

    /* renamed from: b */
    public abstract RecyclerViewHolder mo3425b(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3926a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f3926a.get(i);
        m3427a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3425b(viewGroup, i);
    }
}

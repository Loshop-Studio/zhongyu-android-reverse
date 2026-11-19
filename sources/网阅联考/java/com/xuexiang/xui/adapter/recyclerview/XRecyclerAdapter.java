package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: a */
    public final List f3103a = new ArrayList();

    /* renamed from: b */
    public int f3104b = -1;

    /* renamed from: a */
    public abstract void m4040a(RecyclerView.ViewHolder viewHolder, int i4, Object obj);

    /* renamed from: b */
    public abstract RecyclerView.ViewHolder mo4036b(ViewGroup viewGroup, int i4);

    /* renamed from: c */
    public View m4041c(ViewGroup viewGroup, int i4) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3103a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        m4040a(viewHolder, i4, this.f3103a.get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return mo4036b(viewGroup, i4);
    }
}

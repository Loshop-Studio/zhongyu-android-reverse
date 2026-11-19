package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: a */
    public final List f15195a = new ArrayList();

    /* renamed from: b */
    public int f15196b = -1;

    /* renamed from: a */
    public abstract void m12152a(RecyclerView.ViewHolder viewHolder, int i10, Object obj);

    /* renamed from: b */
    public abstract RecyclerView.ViewHolder mo12148b(ViewGroup viewGroup, int i10);

    /* renamed from: c */
    public View m12153c(ViewGroup viewGroup, int i10) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15195a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        m12152a(viewHolder, i10, this.f15195a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return mo12148b(viewGroup, i10);
    }
}

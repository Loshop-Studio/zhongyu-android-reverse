package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p184n1.AbstractC9363c;

/* loaded from: classes4.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: c */
    public static boolean f7080c = false;

    /* renamed from: a */
    public final List f7081a = new ArrayList();

    /* renamed from: b */
    public int f7082b = -1;

    /* renamed from: c */
    public abstract void m6417c(RecyclerView.ViewHolder viewHolder, int i10, Object obj);

    /* renamed from: d */
    public abstract RecyclerView.ViewHolder mo6413d(ViewGroup viewGroup, int i10);

    /* renamed from: e */
    public View m6418e(ViewGroup viewGroup, int i10) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
    }

    /* renamed from: f */
    public RecyclerView.ViewHolder m6419f(ViewGroup viewGroup, int i10) {
        return mo6413d(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7081a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        m6417c(viewHolder, i10, this.f7081a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (!f7080c) {
            return m6419f(viewGroup, i10);
        }
        long jNanoTime = System.nanoTime();
        RecyclerView.ViewHolder viewHolderM6419f = m6419f(viewGroup, i10);
        AbstractC9363c.m17248b("XRecyclerAdapter", "onCreateViewHolder cost:" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) + " ms");
        return viewHolderM6419f;
    }
}

package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p197p2.AbstractC8819c;

/* loaded from: classes4.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: c */
    public static boolean f5761c = false;

    /* renamed from: a */
    public final List f5762a = new ArrayList();

    /* renamed from: b */
    public int f5763b = -1;

    /* renamed from: b */
    public abstract void m5333b(RecyclerView.ViewHolder viewHolder, int i10, Object obj);

    /* renamed from: c */
    public abstract RecyclerView.ViewHolder mo5329c(ViewGroup viewGroup, int i10);

    /* renamed from: d */
    public View m5334d(ViewGroup viewGroup, int i10) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
    }

    /* renamed from: e */
    public RecyclerView.ViewHolder m5335e(ViewGroup viewGroup, int i10) {
        return mo5329c(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5762a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        m5333b(viewHolder, i10, this.f5762a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (!f5761c) {
            return m5335e(viewGroup, i10);
        }
        long jNanoTime = System.nanoTime();
        RecyclerView.ViewHolder viewHolderM5335e = m5335e(viewGroup, i10);
        AbstractC8819c.m14778b("XRecyclerAdapter", "onCreateViewHolder cost:" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) + " ms");
        return viewHolderM5335e;
    }
}

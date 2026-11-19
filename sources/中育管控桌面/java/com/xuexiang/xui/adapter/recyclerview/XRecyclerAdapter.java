package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133q1.AbstractC7620c;

/* loaded from: classes3.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: c */
    public static boolean f4482c = false;

    /* renamed from: a */
    public final List f4483a = new ArrayList();

    /* renamed from: b */
    public int f4484b = -1;

    /* renamed from: b */
    public abstract void m4338b(RecyclerView.ViewHolder viewHolder, int i6, Object obj);

    /* renamed from: c */
    public abstract RecyclerView.ViewHolder mo4334c(ViewGroup viewGroup, int i6);

    /* renamed from: d */
    public View m4339d(ViewGroup viewGroup, int i6) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i6, viewGroup, false);
    }

    /* renamed from: e */
    public RecyclerView.ViewHolder m4340e(ViewGroup viewGroup, int i6) {
        return mo4334c(viewGroup, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4483a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i6) {
        m4338b(viewHolder, i6, this.f4483a.get(i6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i6) {
        if (!f4482c) {
            return m4340e(viewGroup, i6);
        }
        long jNanoTime = System.nanoTime();
        RecyclerView.ViewHolder viewHolderM4340e = m4340e(viewGroup, i6);
        AbstractC7620c.m9060b("XRecyclerAdapter", "onCreateViewHolder cost:" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) + " ms");
        return viewHolderM4340e;
    }
}

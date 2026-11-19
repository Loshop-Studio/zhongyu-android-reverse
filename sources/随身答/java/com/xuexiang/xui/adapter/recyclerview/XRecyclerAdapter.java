package com.xuexiang.xui.adapter.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: a */
    public final List f7017a = new ArrayList();

    /* renamed from: b */
    public int f7018b = -1;

    /* renamed from: b */
    public abstract void m6434b(RecyclerView.ViewHolder viewHolder, int i9, Object obj);

    /* renamed from: c */
    public abstract RecyclerView.ViewHolder mo6430c(ViewGroup viewGroup, int i9);

    /* renamed from: d */
    public View m6435d(ViewGroup viewGroup, int i9) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i9, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7017a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i9) {
        m6434b(viewHolder, i9, this.f7017a.get(i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i9) {
        return mo6430c(viewGroup, i9);
    }
}

package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import p190i6.AbstractC9610a;

/* loaded from: classes5.dex */
public abstract class BaseAnimationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public RecyclerView.Adapter f12255a;

    /* renamed from: b */
    public int f12256b = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;

    /* renamed from: c */
    public Interpolator f12257c = new LinearInterpolator();

    /* renamed from: d */
    public int f12258d = -1;

    /* renamed from: e */
    public boolean f12259e = true;

    public BaseAnimationAdapter(RecyclerView.Adapter adapter) {
        this.f12255a = adapter;
    }

    /* renamed from: a */
    public abstract Animator[] mo9237a(View view);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12255a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f12255a.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f12255a.getItemViewType(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f12255a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        this.f12255a.onBindViewHolder(viewHolder, i10);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (this.f12259e && adapterPosition <= this.f12258d) {
            AbstractC9610a.m18843a(viewHolder.itemView);
            return;
        }
        for (Animator animator : mo9237a(viewHolder.itemView)) {
            animator.setDuration(this.f12256b).start();
            animator.setInterpolator(this.f12257c);
        }
        this.f12258d = adapterPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f12255a.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f12255a.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        this.f12255a.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        this.f12255a.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.f12255a.onViewRecycled(viewHolder);
        super.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f12255a.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f12255a.unregisterAdapterDataObserver(adapterDataObserver);
    }
}

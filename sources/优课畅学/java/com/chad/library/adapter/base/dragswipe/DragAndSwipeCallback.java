package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import p249t0.C10085a;

/* loaded from: classes3.dex */
public class DragAndSwipeCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public C10085a f3670a;

    /* renamed from: b */
    public float f3671b = 0.1f;

    /* renamed from: c */
    public float f3672c = 0.7f;

    /* renamed from: d */
    public int f3673d = 15;

    /* renamed from: e */
    public int f3674e = 32;

    public DragAndSwipeCallback(C10085a c10085a) {
        this.f3670a = c10085a;
    }

    /* renamed from: a */
    public final boolean m3522a(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    /* renamed from: b */
    public void m3523b(int i10) {
        this.f3673d = i10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (m3522a(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            C10085a c10085a = this.f3670a;
            if (c10085a != null) {
                c10085a.m18832l(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support) == null || !((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        C10085a c10085a2 = this.f3670a;
        if (c10085a2 != null) {
            c10085a2.m18835o(viewHolder);
        }
        viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f3671b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m3522a(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.f3673d, this.f3674e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f3672c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        C10085a c10085a = this.f3670a;
        if (c10085a != null) {
            return c10085a.m18831k();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        C10085a c10085a = this.f3670a;
        return (c10085a == null || !c10085a.m18829i() || this.f3670a.m18825e()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        if (i10 != 1 || m3522a(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        canvas.save();
        if (f10 > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f10, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f10, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f10, view.getTop());
        }
        C10085a c10085a = this.f3670a;
        if (c10085a != null) {
            c10085a.m18838r(canvas, viewHolder, f10, f11, z10);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i10, RecyclerView.ViewHolder viewHolder2, int i11, int i12, int i13) {
        super.onMoved(recyclerView, viewHolder, i10, viewHolder2, i11, i12, i13);
        C10085a c10085a = this.f3670a;
        if (c10085a != null) {
            c10085a.m18833m(viewHolder, viewHolder2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        if (i10 == 2 && !m3522a(viewHolder)) {
            C10085a c10085a = this.f3670a;
            if (c10085a != null) {
                c10085a.m18834n(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i10 == 1 && !m3522a(viewHolder)) {
            C10085a c10085a2 = this.f3670a;
            if (c10085a2 != null) {
                c10085a2.m18836p(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        C10085a c10085a;
        if (m3522a(viewHolder) || (c10085a = this.f3670a) == null) {
            return;
        }
        c10085a.m18837q(viewHolder);
    }
}

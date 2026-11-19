package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import p285p1.C10599a;

/* loaded from: classes3.dex */
public class DragAndSwipeCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public C10599a f5434a;

    /* renamed from: b */
    public float f5435b = 0.1f;

    /* renamed from: c */
    public float f5436c = 0.7f;

    /* renamed from: d */
    public int f5437d = 15;

    /* renamed from: e */
    public int f5438e = 32;

    public DragAndSwipeCallback(C10599a c10599a) {
        this.f5434a = c10599a;
    }

    /* renamed from: a */
    public final boolean m4700a(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    /* renamed from: b */
    public void m4701b(int i10) {
        this.f5437d = i10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (m4700a(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            C10599a c10599a = this.f5434a;
            if (c10599a != null) {
                c10599a.m22432l(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support) == null || !((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        C10599a c10599a2 = this.f5434a;
        if (c10599a2 != null) {
            c10599a2.m22435o(viewHolder);
        }
        viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f5435b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m4700a(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.f5437d, this.f5438e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f5436c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        C10599a c10599a = this.f5434a;
        if (c10599a != null) {
            return c10599a.m22431k();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        C10599a c10599a = this.f5434a;
        return (c10599a == null || !c10599a.m22429i() || this.f5434a.m22425e()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        if (i10 != 1 || m4700a(viewHolder)) {
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
        C10599a c10599a = this.f5434a;
        if (c10599a != null) {
            c10599a.m22438r(canvas, viewHolder, f10, f11, z10);
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
        C10599a c10599a = this.f5434a;
        if (c10599a != null) {
            c10599a.m22433m(viewHolder, viewHolder2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        if (i10 == 2 && !m4700a(viewHolder)) {
            C10599a c10599a = this.f5434a;
            if (c10599a != null) {
                c10599a.m22434n(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i10 == 1 && !m4700a(viewHolder)) {
            C10599a c10599a2 = this.f5434a;
            if (c10599a2 != null) {
                c10599a2.m22436p(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        C10599a c10599a;
        if (m4700a(viewHolder) || (c10599a = this.f5434a) == null) {
            return;
        }
        c10599a.m22437q(viewHolder);
    }
}

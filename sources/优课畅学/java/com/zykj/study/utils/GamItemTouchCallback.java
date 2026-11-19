package com.zykj.study.utils;

import android.graphics.Canvas;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class GamItemTouchCallback<VH extends RecyclerView.ViewHolder> extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public final int f13741a;

    /* renamed from: b */
    public final RecyclerView.Adapter f13742b;

    /* renamed from: c */
    public int f13743c;

    /* renamed from: d */
    public int f13744d;

    /* renamed from: e */
    public float f13745e;

    /* renamed from: f */
    public boolean f13746f;

    /* renamed from: g */
    public View f13747g;

    /* renamed from: a */
    public final void m11882a(View view) {
        view.scrollTo(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        int scrollX = viewHolder.itemView.getScrollX();
        int i10 = this.f13741a;
        if (scrollX > i10) {
            viewHolder.itemView.scrollTo(i10, 0);
        } else if (viewHolder.itemView.getScrollX() < 0) {
            viewHolder.itemView.scrollTo(0, 0);
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        return ItemTouchHelper.Callback.makeMovementFlags(0, 12);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeEscapeVelocity(float f10) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas c10, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        AbstractC9133u.m16133g(c10, "c");
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        if (f10 == 0.0f) {
            this.f13743c = viewHolder.itemView.getScrollX();
            this.f13746f = true;
        }
        if (z10) {
            viewHolder.itemView.scrollTo(this.f13743c + ((int) (-f10)), 0);
            return;
        }
        if (this.f13746f) {
            this.f13746f = false;
            this.f13744d = viewHolder.itemView.getScrollX();
            this.f13745e = f10;
        }
        int scrollX = viewHolder.itemView.getScrollX();
        int i11 = this.f13741a;
        if (scrollX >= i11) {
            viewHolder.itemView.scrollTo(AbstractC8323h.m13510e(this.f13743c + ((int) (-f10)), i11), 0);
        } else {
            viewHolder.itemView.scrollTo((int) ((this.f13744d * f10) / this.f13745e), 0);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        AbstractC9133u.m16133g(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        View view;
        super.onSelectedChanged(viewHolder, i10);
        if (i10 == 1) {
            View view2 = this.f13747g;
            if (view2 != null) {
                if (!AbstractC9133u.m16128b(view2, viewHolder != null ? viewHolder.itemView : null)) {
                    m11882a(view2);
                }
            }
            if (viewHolder == null || (view = viewHolder.itemView) == null) {
                return;
            }
            this.f13747g = view;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        RecyclerView.Adapter adapter = this.f13742b;
        if (adapter != null) {
            adapter.notifyItemChanged(viewHolder.getBindingAdapterPosition());
        }
    }
}

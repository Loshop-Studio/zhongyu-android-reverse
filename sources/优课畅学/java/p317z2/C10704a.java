package p317z2;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z2.a */
/* loaded from: classes4.dex */
public class C10704a extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public boolean f21251a;

    /* renamed from: b */
    public boolean f21252b;

    /* renamed from: a */
    public void m20018a(boolean z10) {
        this.f21251a = z10;
    }

    /* renamed from: b */
    public void m20019b(boolean z10) {
        this.f21252b = z10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(15, 3) : ItemTouchHelper.Callback.makeMovementFlags(15, 12) : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(12, 3) : ItemTouchHelper.Callback.makeMovementFlags(3, 12) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.f21251a;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.f21252b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        float fAbs;
        int width;
        if (i10 == 1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            float f12 = 1.0f;
            if (layoutManager instanceof LinearLayoutManager) {
                int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
                if (orientation == 0) {
                    fAbs = Math.abs(f11);
                    width = viewHolder.itemView.getHeight();
                } else if (orientation == 1) {
                    fAbs = Math.abs(f10);
                    width = viewHolder.itemView.getWidth();
                }
                f12 = 1.0f - (fAbs / width);
            }
            viewHolder.itemView.setAlpha(f12);
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        super.onSelectedChanged(viewHolder, i10);
    }

    /* renamed from: c */
    public void m20020c(InterfaceC10705b interfaceC10705b) {
    }

    /* renamed from: d */
    public void m20021d(InterfaceC10706c interfaceC10706c) {
    }

    /* renamed from: e */
    public void m20022e(InterfaceC10707d interfaceC10707d) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
    }
}

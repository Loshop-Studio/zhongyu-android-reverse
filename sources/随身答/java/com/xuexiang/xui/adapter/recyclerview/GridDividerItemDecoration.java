package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes4.dex */
public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: e */
    public static final int[] f7009e = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f7010a;

    /* renamed from: b */
    public int f7011b;

    /* renamed from: c */
    public int f7012c;

    /* renamed from: d */
    public Paint f7013d;

    /* renamed from: a */
    public final boolean m6433a(RecyclerView recyclerView, int i9, int i10, int i11) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i12 = i11 % i10;
            int i13 = i11 / i10;
            if (i12 != 0) {
                i13++;
            }
            return i13 == (i9 / i10) + 1;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
                return i9 >= i11 - (i11 % i10);
            }
            if ((i9 + 1) % i10 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (recyclerView.getAdapter() == null) {
            if ((childLayoutPosition + 1) % this.f7011b <= 0) {
                rect.set(0, 0, 0, this.f7012c);
                return;
            } else {
                int i9 = this.f7012c;
                rect.set(0, 0, i9, i9);
                return;
            }
        }
        boolean zM6433a = m6433a(recyclerView, childLayoutPosition, this.f7011b, recyclerView.getAdapter().getItemCount());
        int i10 = this.f7011b;
        int i11 = this.f7012c;
        int i12 = ((i10 - 1) * i11) / i10;
        int i13 = (childLayoutPosition % i10) * (i11 - i12);
        int i14 = i12 - i13;
        if (zM6433a) {
            rect.set(i13, 0, i14, 0);
        } else {
            rect.set(i13, 0, i14, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = recyclerView.getChildAt(i9);
            int childLayoutPosition = (recyclerView.getChildLayoutPosition(childAt) + 1) % 3;
            if (childLayoutPosition == 0) {
                childLayoutPosition = this.f7011b;
            }
            int i10 = childLayoutPosition;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
            int i11 = bottom + this.f7012c;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            int i12 = right + this.f7012c;
            if (this.f7013d != null) {
                this.f7010a.setBounds(childAt.getLeft(), bottom, i12, i11);
                this.f7010a.draw(canvas);
            }
            if (this.f7013d != null) {
                canvas2.drawRect(childAt.getLeft(), bottom, i12, i11, this.f7013d);
            }
            if (i10 < this.f7011b) {
                if (this.f7013d != null) {
                    this.f7010a.setBounds(right, childAt.getTop(), i12, i11);
                    this.f7010a.draw(canvas);
                }
                if (this.f7013d != null) {
                    canvas2.drawRect(right, childAt.getTop(), i12, i11, this.f7013d);
                }
            }
            i9++;
            canvas2 = canvas;
        }
    }
}

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
    public static final int[] f5753e = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f5754a;

    /* renamed from: b */
    public int f5755b;

    /* renamed from: c */
    public int f5756c;

    /* renamed from: d */
    public Paint f5757d;

    /* renamed from: a */
    public final boolean m5332a(RecyclerView recyclerView, int i10, int i11, int i12) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i13 = i12 % i11;
            int i14 = i12 / i11;
            if (i13 != 0) {
                i14++;
            }
            return i14 == (i10 / i11) + 1;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
                return i10 >= i12 - (i12 % i11);
            }
            if ((i10 + 1) % i11 == 0) {
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
            if ((childLayoutPosition + 1) % this.f5755b <= 0) {
                rect.set(0, 0, 0, this.f5756c);
                return;
            } else {
                int i10 = this.f5756c;
                rect.set(0, 0, i10, i10);
                return;
            }
        }
        boolean zM5332a = m5332a(recyclerView, childLayoutPosition, this.f5755b, recyclerView.getAdapter().getItemCount());
        int i11 = this.f5755b;
        int i12 = this.f5756c;
        int i13 = ((i11 - 1) * i12) / i11;
        int i14 = (childLayoutPosition % i11) * (i12 - i13);
        int i15 = i13 - i14;
        if (zM5332a) {
            rect.set(i14, 0, i15, 0);
        } else {
            rect.set(i14, 0, i15, i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt) + 1;
            int i11 = this.f5755b;
            int i12 = childLayoutPosition % i11;
            int i13 = i12 == 0 ? i11 : i12;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
            int i14 = bottom + this.f5756c;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            int i15 = right + this.f5756c;
            if (this.f5757d != null) {
                canvas2 = canvas;
                canvas2.drawRect(childAt.getLeft(), bottom, i15, i14, this.f5757d);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f5754a;
                if (drawable != null) {
                    drawable.setBounds(childAt.getLeft(), bottom, i15, i14);
                    this.f5754a.draw(canvas);
                }
            }
            if (i13 < this.f5755b) {
                if (this.f5757d != null) {
                    canvas2.drawRect(right, childAt.getTop(), i15, i14, this.f5757d);
                } else {
                    Drawable drawable2 = this.f5754a;
                    if (drawable2 != null) {
                        drawable2.setBounds(right, childAt.getTop(), i15, i14);
                        this.f5754a.draw(canvas);
                    }
                }
            }
        }
    }
}

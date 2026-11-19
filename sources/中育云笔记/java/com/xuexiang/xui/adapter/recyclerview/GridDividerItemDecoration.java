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

/* loaded from: classes5.dex */
public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: e */
    public static final int[] f15187e = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f15188a;

    /* renamed from: b */
    public int f15189b;

    /* renamed from: c */
    public int f15190c;

    /* renamed from: d */
    public Paint f15191d;

    /* renamed from: a */
    public final boolean m12151a(RecyclerView recyclerView, int i10, int i11, int i12) {
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
            if ((childLayoutPosition + 1) % this.f15189b <= 0) {
                rect.set(0, 0, 0, this.f15190c);
                return;
            } else {
                int i10 = this.f15190c;
                rect.set(0, 0, i10, i10);
                return;
            }
        }
        boolean zM12151a = m12151a(recyclerView, childLayoutPosition, this.f15189b, recyclerView.getAdapter().getItemCount());
        int i11 = this.f15189b;
        int i12 = this.f15190c;
        int i13 = ((i11 - 1) * i12) / i11;
        int i14 = (childLayoutPosition % i11) * (i12 - i13);
        int i15 = i13 - i14;
        if (zM12151a) {
            rect.set(i14, 0, i15, 0);
        } else {
            rect.set(i14, 0, i15, i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            int childLayoutPosition = (recyclerView.getChildLayoutPosition(childAt) + 1) % 3;
            if (childLayoutPosition == 0) {
                childLayoutPosition = this.f15189b;
            }
            int i11 = childLayoutPosition;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
            int i12 = bottom + this.f15190c;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            int i13 = right + this.f15190c;
            if (this.f15191d != null) {
                this.f15188a.setBounds(childAt.getLeft(), bottom, i13, i12);
                this.f15188a.draw(canvas);
            }
            if (this.f15191d != null) {
                canvas2.drawRect(childAt.getLeft(), bottom, i13, i12, this.f15191d);
            }
            if (i11 < this.f15189b) {
                if (this.f15191d != null) {
                    this.f15188a.setBounds(right, childAt.getTop(), i13, i12);
                    this.f15188a.draw(canvas);
                }
                if (this.f15191d != null) {
                    canvas2.drawRect(right, childAt.getTop(), i13, i12, this.f15191d);
                }
            }
            i10++;
            canvas2 = canvas;
        }
    }
}

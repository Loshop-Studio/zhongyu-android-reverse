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

/* loaded from: classes3.dex */
public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: e */
    public static final int[] f4474e = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f4475a;

    /* renamed from: b */
    public int f4476b;

    /* renamed from: c */
    public int f4477c;

    /* renamed from: d */
    public Paint f4478d;

    /* renamed from: a */
    public final boolean m4337a(RecyclerView recyclerView, int i6, int i7, int i8) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i9 = i8 % i7;
            int i10 = i8 / i7;
            if (i9 != 0) {
                i10++;
            }
            return i10 == (i6 / i7) + 1;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) {
                return i6 >= i8 - (i8 % i7);
            }
            if ((i6 + 1) % i7 == 0) {
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
            if ((childLayoutPosition + 1) % this.f4476b <= 0) {
                rect.set(0, 0, 0, this.f4477c);
                return;
            } else {
                int i6 = this.f4477c;
                rect.set(0, 0, i6, i6);
                return;
            }
        }
        boolean zM4337a = m4337a(recyclerView, childLayoutPosition, this.f4476b, recyclerView.getAdapter().getItemCount());
        int i7 = this.f4476b;
        int i8 = this.f4477c;
        int i9 = ((i7 - 1) * i8) / i7;
        int i10 = (childLayoutPosition % i7) * (i8 - i9);
        int i11 = i9 - i10;
        if (zM4337a) {
            rect.set(i10, 0, i11, 0);
        } else {
            rect.set(i10, 0, i11, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt) + 1;
            int i7 = this.f4476b;
            int i8 = childLayoutPosition % i7;
            int i9 = i8 == 0 ? i7 : i8;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
            int i10 = bottom + this.f4477c;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            int i11 = right + this.f4477c;
            if (this.f4478d != null) {
                canvas2 = canvas;
                canvas2.drawRect(childAt.getLeft(), bottom, i11, i10, this.f4478d);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f4475a;
                if (drawable != null) {
                    drawable.setBounds(childAt.getLeft(), bottom, i11, i10);
                    this.f4475a.draw(canvas);
                }
            }
            if (i9 < this.f4476b) {
                if (this.f4478d != null) {
                    canvas2.drawRect(right, childAt.getTop(), i11, i10, this.f4478d);
                } else {
                    Drawable drawable2 = this.f4475a;
                    if (drawable2 != null) {
                        drawable2.setBounds(right, childAt.getTop(), i11, i10);
                        this.f4475a.draw(canvas);
                    }
                }
            }
        }
    }
}

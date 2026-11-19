package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: f */
    public static final int[] f4468f = {R.attr.listDivider};

    /* renamed from: a */
    public Paint f4469a;

    /* renamed from: b */
    public Drawable f4470b;

    /* renamed from: c */
    public int f4471c;

    /* renamed from: d */
    public int f4472d;

    /* renamed from: e */
    public int f4473e;

    public final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop() + this.f4473e;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.f4473e;
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        while (i6 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i6);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i7 = this.f4471c + right;
            Paint paint = this.f4469a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i7, measuredHeight, paint);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f4470b;
                if (drawable != null) {
                    drawable.setBounds(right, paddingTop, i7, measuredHeight);
                    this.f4470b.draw(canvas2);
                }
            }
            i6++;
            canvas = canvas2;
        }
    }

    public final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft() + this.f4473e;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.f4473e;
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        while (i6 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i6);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i7 = this.f4471c + bottom;
            Paint paint = this.f4469a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i7, paint);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f4470b;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i7);
                    this.f4470b.draw(canvas2);
                }
            }
            i6++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f4472d == 1) {
            rect.set(0, 0, 0, this.f4471c);
        } else {
            rect.set(0, 0, this.f4471c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f4472d == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

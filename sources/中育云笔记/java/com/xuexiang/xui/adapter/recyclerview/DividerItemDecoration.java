package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: f */
    public static final int[] f15181f = {R.attr.listDivider};

    /* renamed from: a */
    public Paint f15182a;

    /* renamed from: b */
    public Drawable f15183b;

    /* renamed from: c */
    public int f15184c;

    /* renamed from: d */
    public int f15185d;

    /* renamed from: e */
    public int f15186e;

    public final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop() + this.f15186e;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.f15186e;
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i11 = this.f15184c + right;
            Drawable drawable = this.f15183b;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i11, measuredHeight);
                this.f15183b.draw(canvas);
            }
            Paint paint = this.f15182a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i11, measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    public final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft() + this.f15186e;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.f15186e;
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i10);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i11 = this.f15184c + bottom;
            Drawable drawable = this.f15183b;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i11);
                this.f15183b.draw(canvas);
            }
            Paint paint = this.f15182a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i11, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f15185d == 1) {
            rect.set(0, 0, 0, this.f15184c);
        } else {
            rect.set(0, 0, this.f15184c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f15185d == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

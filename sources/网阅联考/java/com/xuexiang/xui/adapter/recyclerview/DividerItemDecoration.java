package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: f */
    public static final int[] f3089f = {R.attr.listDivider};

    /* renamed from: a */
    public Paint f3090a;

    /* renamed from: b */
    public Drawable f3091b;

    /* renamed from: c */
    public int f3092c;

    /* renamed from: d */
    public int f3093d;

    /* renamed from: e */
    public int f3094e;

    public final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop() + this.f3094e;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.f3094e;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount - 1; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i5 = this.f3092c + right;
            Drawable drawable = this.f3091b;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i5, measuredHeight);
                this.f3091b.draw(canvas);
            }
            Paint paint = this.f3090a;
            if (paint != null) {
                canvas.drawRect(right, paddingTop, i5, measuredHeight, paint);
            }
        }
    }

    public final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft() + this.f3094e;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.f3094e;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount - 1; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i5 = this.f3092c + bottom;
            Drawable drawable = this.f3091b;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i5);
                this.f3091b.draw(canvas);
            }
            Paint paint = this.f3090a;
            if (paint != null) {
                canvas.drawRect(paddingLeft, bottom, measuredWidth, i5, paint);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f3093d == 1) {
            rect.set(0, 0, 0, this.f3092c);
        } else {
            rect.set(0, 0, this.f3092c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f3093d == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

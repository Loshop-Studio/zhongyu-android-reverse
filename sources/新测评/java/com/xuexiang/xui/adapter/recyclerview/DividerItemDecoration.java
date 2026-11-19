package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: f */
    public static final int[] f5747f = {R.attr.listDivider};

    /* renamed from: a */
    public Paint f5748a;

    /* renamed from: b */
    public Drawable f5749b;

    /* renamed from: c */
    public int f5750c;

    /* renamed from: d */
    public int f5751d;

    /* renamed from: e */
    public int f5752e;

    public final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop() + this.f5752e;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.f5752e;
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i11 = this.f5750c + right;
            Paint paint = this.f5748a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i11, measuredHeight, paint);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f5749b;
                if (drawable != null) {
                    drawable.setBounds(right, paddingTop, i11, measuredHeight);
                    this.f5749b.draw(canvas2);
                }
            }
            i10++;
            canvas = canvas2;
        }
    }

    public final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft() + this.f5752e;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.f5752e;
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i10);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i11 = this.f5750c + bottom;
            Paint paint = this.f5748a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i11, paint);
            } else {
                canvas2 = canvas;
                Drawable drawable = this.f5749b;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i11);
                    this.f5749b.draw(canvas2);
                }
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f5751d == 1) {
            rect.set(0, 0, 0, this.f5750c);
        } else {
            rect.set(0, 0, this.f5750c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f5751d == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

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
    public static final int[] f7003f = {R.attr.listDivider};

    /* renamed from: a */
    public Paint f7004a;

    /* renamed from: b */
    public Drawable f7005b;

    /* renamed from: c */
    public int f7006c;

    /* renamed from: d */
    public int f7007d;

    /* renamed from: e */
    public int f7008e;

    public final void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop() + this.f7008e;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.f7008e;
        int childCount = recyclerView.getChildCount();
        int i9 = 0;
        while (i9 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i9);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i10 = this.f7006c + right;
            Drawable drawable = this.f7005b;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i10, measuredHeight);
                this.f7005b.draw(canvas);
            }
            Paint paint = this.f7004a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i10, measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
            i9++;
            canvas = canvas2;
        }
    }

    public final void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft() + this.f7008e;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.f7008e;
        int childCount = recyclerView.getChildCount();
        int i9 = 0;
        while (i9 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i9);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i10 = this.f7006c + bottom;
            Drawable drawable = this.f7005b;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i10);
                this.f7005b.draw(canvas);
            }
            Paint paint = this.f7004a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i10, paint);
            } else {
                canvas2 = canvas;
            }
            i9++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f7007d == 1) {
            rect.set(0, 0, 0, this.f7006c);
        } else {
            rect.set(0, 0, this.f7006c, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f7007d == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

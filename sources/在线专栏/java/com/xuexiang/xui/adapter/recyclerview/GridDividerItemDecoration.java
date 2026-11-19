package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.xuexiang.xui.utils.DensityUtils;

/* loaded from: classes.dex */
public class GridDividerItemDecoration extends RecyclerView.AbstractC0569n {
    private static final int[] ATTRS = {R.attr.listDivider};
    private Drawable mDivider;
    private int mDividerWidth;
    private Paint mPaint;
    private int mSpanCount;

    public GridDividerItemDecoration(Context context, int i4) {
        this.mSpanCount = i4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = this.mDivider;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerWidth = DensityUtils.dp2px(1.0f);
        }
    }

    private boolean isLastRow(RecyclerView recyclerView, int i4, int i5, int i6) {
        RecyclerView.AbstractC0570o layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? i4 >= i6 - (i6 % i5) : (i4 + 1) % i5 == 0;
            }
            return false;
        }
        int i7 = i6 % i5;
        int i8 = i6 / i5;
        if (i7 != 0) {
            i8++;
        }
        return i8 == (i4 / i5) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        super.getItemOffsets(rect, view, recyclerView, c0580y);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (recyclerView.getAdapter() == null) {
            if ((childLayoutPosition + 1) % this.mSpanCount <= 0) {
                rect.set(0, 0, 0, this.mDividerWidth);
                return;
            } else {
                int i4 = this.mDividerWidth;
                rect.set(0, 0, i4, i4);
                return;
            }
        }
        boolean zIsLastRow = isLastRow(recyclerView, childLayoutPosition, this.mSpanCount, recyclerView.getAdapter().getItemCount());
        int i5 = this.mSpanCount;
        int i6 = this.mDividerWidth;
        int i7 = ((i5 - 1) * i6) / i5;
        int i8 = (childLayoutPosition % i5) * (i6 - i7);
        int i9 = i7 - i8;
        if (zIsLastRow) {
            rect.set(i8, 0, i9, 0);
        } else {
            rect.set(i8, 0, i9, i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        super.onDraw(canvas, recyclerView, c0580y);
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt) + 1;
            int i5 = this.mSpanCount;
            int i6 = childLayoutPosition % i5;
            int i7 = i6 == 0 ? i5 : i6;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(C0358u.m2002M(childAt));
            int i8 = bottom + this.mDividerWidth;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(C0358u.m2000L(childAt));
            int i9 = right + this.mDividerWidth;
            if (this.mPaint != null) {
                canvas.drawRect(childAt.getLeft(), bottom, i9, i8, this.mPaint);
            } else {
                Drawable drawable = this.mDivider;
                if (drawable != null) {
                    drawable.setBounds(childAt.getLeft(), bottom, i9, i8);
                    this.mDivider.draw(canvas);
                }
            }
            if (i7 < this.mSpanCount) {
                if (this.mPaint != null) {
                    canvas.drawRect(right, childAt.getTop(), i9, i8, this.mPaint);
                } else {
                    Drawable drawable2 = this.mDivider;
                    if (drawable2 != null) {
                        drawable2.setBounds(right, childAt.getTop(), i9, i8);
                        this.mDivider.draw(canvas);
                    }
                }
            }
        }
    }

    public GridDividerItemDecoration setDivider(Drawable drawable) {
        this.mDivider = drawable;
        this.mDividerWidth = drawable.getIntrinsicWidth();
        return this;
    }

    public GridDividerItemDecoration(Context context, int i4, int i5) {
        this(context, i4);
        this.mDividerWidth = i5;
    }

    public GridDividerItemDecoration(Context context, int i4, int i5, int i6) {
        this(context, i4);
        this.mDividerWidth = i5;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(i6);
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}

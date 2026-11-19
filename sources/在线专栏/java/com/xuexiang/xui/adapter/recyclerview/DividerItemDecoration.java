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
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.utils.DensityUtils;

/* loaded from: classes.dex */
public class DividerItemDecoration extends RecyclerView.AbstractC0569n {
    private static final int[] ATTRS = {R.attr.listDivider};
    private Drawable mDivider;
    private int mDividerHeight;
    private int mExtraPadding;
    private int mOrientation;
    private Paint mPaint;

    public DividerItemDecoration(Context context, int i4) {
        if (i4 != 1 && i4 != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.mOrientation = i4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = this.mDivider;
        if (drawable != null) {
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHeight = DensityUtils.dp2px(1.0f);
        }
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop() + this.mExtraPadding;
        int measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.mExtraPadding;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount - 1; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i5 = this.mDividerHeight + right;
            Paint paint = this.mPaint;
            if (paint != null) {
                canvas.drawRect(right, paddingTop, i5, measuredHeight, paint);
            } else {
                Drawable drawable = this.mDivider;
                if (drawable != null) {
                    drawable.setBounds(right, paddingTop, i5, measuredHeight);
                    this.mDivider.draw(canvas);
                }
            }
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft() + this.mExtraPadding;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight()) - this.mExtraPadding;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount - 1; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i5 = this.mDividerHeight + bottom;
            Paint paint = this.mPaint;
            if (paint != null) {
                canvas.drawRect(paddingLeft, bottom, measuredWidth, i5, paint);
            } else {
                Drawable drawable = this.mDivider;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i5);
                    this.mDivider.draw(canvas);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        super.getItemOffsets(rect, view, recyclerView, c0580y);
        if (this.mOrientation == 1) {
            rect.set(0, 0, 0, this.mDividerHeight);
        } else {
            rect.set(0, 0, this.mDividerHeight, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        super.onDraw(canvas, recyclerView, c0580y);
        if (this.mOrientation == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    public DividerItemDecoration setDivider(Drawable drawable) {
        this.mDivider = drawable;
        this.mDividerHeight = drawable.getIntrinsicHeight();
        return this;
    }

    public DividerItemDecoration(Context context, int i4, int i5) {
        this(context, i4);
        this.mDividerHeight = i5;
    }

    public DividerItemDecoration(Context context, int i4, int i5, int i6) {
        this(context, i4);
        this.mDividerHeight = i5;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(i6);
        this.mPaint.setStyle(Paint.Style.FILL);
    }

    public DividerItemDecoration(Context context, int i4, int i5, int i6, int i7) {
        this(context, i4);
        this.mDividerHeight = i5;
        this.mExtraPadding = i7;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(i6);
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}

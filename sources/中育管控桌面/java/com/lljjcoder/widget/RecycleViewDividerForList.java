package com.lljjcoder.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class RecycleViewDividerForList extends RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {R.attr.listDivider};
    private Drawable mDivider;
    private int mDividerHeight;
    private boolean mLastLineShow;
    private int mOrientation;
    private Paint mPaint;

    public RecycleViewDividerForList(Context context, int i6) {
        this.mDividerHeight = 2;
        this.mLastLineShow = true;
        if (i6 != 1 && i6 != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.mOrientation = i6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        while (i6 < childCount - (!this.mLastLineShow ? 1 : 0)) {
            View childAt = recyclerView.getChildAt(i6);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i7 = this.mDividerHeight + bottom;
            Drawable drawable = this.mDivider;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i7);
                this.mDivider.draw(canvas);
            }
            Paint paint = this.mPaint;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i7, paint);
            } else {
                canvas2 = canvas;
            }
            i6++;
            canvas = canvas2;
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = recyclerView.getChildAt(i6);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i7 = this.mDividerHeight + right;
            Drawable drawable = this.mDivider;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i7, measuredHeight);
                this.mDivider.draw(canvas);
            }
            Paint paint = this.mPaint;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i7, measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
            i6++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.set(0, 0, 0, this.mDividerHeight);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.mOrientation == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    public RecycleViewDividerForList(Context context, int i6, boolean z6) {
        this.mDividerHeight = 2;
        this.mLastLineShow = true;
        if (i6 != 1 && i6 != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.mOrientation = i6;
        this.mLastLineShow = z6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public RecycleViewDividerForList(Context context, int i6, int i7) {
        this(context, i6);
        Drawable drawable = ContextCompat.getDrawable(context, i7);
        this.mDivider = drawable;
        this.mDividerHeight = drawable.getIntrinsicHeight();
    }

    public RecycleViewDividerForList(Context context, int i6, int i7, int i8) {
        this(context, i6);
        this.mDividerHeight = i7;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(i8);
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}

package com.xuexiang.xui.widget.guidview;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
class Calculator {
    private final int mBitmapHeight;
    private final int mBitmapWidth;
    private int mCircleCenterX;
    private int mCircleCenterY;
    private int mCircleRadius;
    private int mFocusHeight;
    private FocusShape mFocusShape;
    private int mFocusWidth;
    private boolean mHasFocus;

    Calculator(Activity activity, FocusShape focusShape, View view, double d4, boolean z3, int i4, int i5) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        this.mBitmapWidth = i6;
        this.mBitmapHeight = i7 - (z3 ? 0 : Utils.getStatusBarHeight(activity));
        if (view == null) {
            this.mHasFocus = false;
            return;
        }
        i4 = i4 == -1 ? z3 ? 0 : Utils.getStatusBarHeight(activity) : i4;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.mFocusWidth = view.getWidth();
        int height = view.getHeight();
        this.mFocusHeight = height;
        this.mFocusShape = focusShape;
        this.mCircleCenterX = iArr[0] + (this.mFocusWidth / 2) + i5;
        this.mCircleCenterY = (iArr[1] + (height / 2)) - i4;
        this.mCircleRadius = (int) (((int) (Math.hypot(view.getWidth(), view.getHeight()) / 2.0d)) * d4);
        this.mHasFocus = true;
    }

    float circleRadius(int i4, double d4) {
        return (float) (this.mCircleRadius + (i4 * d4));
    }

    int getBitmapHeight() {
        return this.mBitmapHeight;
    }

    int getBitmapWidth() {
        return this.mBitmapWidth;
    }

    int getCircleCenterX() {
        return this.mCircleCenterX;
    }

    int getCircleCenterY() {
        return this.mCircleCenterY;
    }

    int getFocusHeight() {
        return this.mFocusHeight;
    }

    FocusShape getFocusShape() {
        return this.mFocusShape;
    }

    int getFocusWidth() {
        return this.mFocusWidth;
    }

    int getViewRadius() {
        return this.mCircleRadius;
    }

    boolean hasFocus() {
        return this.mHasFocus;
    }

    float roundRectBottom(int i4, double d4) {
        return (float) (this.mCircleCenterY + (this.mFocusHeight / 2) + (i4 * d4));
    }

    float roundRectLeft(int i4, double d4) {
        return (float) ((this.mCircleCenterX - (this.mFocusWidth / 2)) - (i4 * d4));
    }

    float roundRectLeftCircleRadius(int i4, double d4) {
        return (float) ((this.mFocusHeight / 2) + (i4 * d4));
    }

    float roundRectRight(int i4, double d4) {
        return (float) (this.mCircleCenterX + (this.mFocusWidth / 2) + (i4 * d4));
    }

    float roundRectTop(int i4, double d4) {
        return (float) ((this.mCircleCenterY - (this.mFocusHeight / 2)) - (i4 * d4));
    }

    public void setCirclePosition(int i4, int i5, int i6) {
        this.mCircleCenterX = i4;
        this.mCircleRadius = i6;
        this.mCircleCenterY = i5;
        this.mFocusShape = FocusShape.CIRCLE;
        this.mHasFocus = true;
    }

    public void setCircleRadius(int i4) {
        this.mCircleRadius = i4;
    }

    public void setRectPosition(int i4, int i5, int i6, int i7) {
        this.mCircleCenterX = i4;
        this.mCircleCenterY = i5;
        this.mFocusWidth = i6;
        this.mFocusHeight = i7;
        this.mFocusShape = FocusShape.ROUNDED_RECTANGLE;
        this.mHasFocus = true;
    }
}

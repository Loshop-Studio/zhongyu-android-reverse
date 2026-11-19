package com.xuexiang.xui.widget.slideback;

/* loaded from: classes.dex */
public class SlideInfo {
    private float mArrowSize;
    private float mBackViewHeight;
    private float mDragRate;
    private boolean mIsAllowEdgeLeft;
    private boolean mIsAllowEdgeRight;
    private float mMaxSlideLength;
    private float mScreenWidth;
    private float mSideSlideLength;

    public float getArrowSize() {
        return this.mArrowSize;
    }

    public float getBackViewHeight() {
        return this.mBackViewHeight;
    }

    public float getDragRate() {
        return this.mDragRate;
    }

    public float getMaxSlideLength() {
        return this.mMaxSlideLength;
    }

    public float getScreenWidth() {
        return this.mScreenWidth;
    }

    public float getSideSlideLength() {
        return this.mSideSlideLength;
    }

    public boolean isAllowEdgeLeft() {
        return this.mIsAllowEdgeLeft;
    }

    public boolean isAllowEdgeRight() {
        return this.mIsAllowEdgeRight;
    }

    public SlideInfo setAllowEdgeLeft(boolean z3) {
        this.mIsAllowEdgeLeft = z3;
        return this;
    }

    public SlideInfo setAllowEdgeRight(boolean z3) {
        this.mIsAllowEdgeRight = z3;
        return this;
    }

    public SlideInfo setArrowSize(float f4) {
        this.mArrowSize = f4;
        return this;
    }

    public SlideInfo setBackViewHeight(float f4) {
        this.mBackViewHeight = f4;
        return this;
    }

    public SlideInfo setDragRate(float f4) {
        this.mDragRate = f4;
        return this;
    }

    public SlideInfo setEdgeMode(boolean z3, boolean z4) {
        this.mIsAllowEdgeLeft = z3;
        this.mIsAllowEdgeRight = z4;
        return this;
    }

    public SlideInfo setMaxSlideLength(float f4) {
        this.mMaxSlideLength = f4;
        return this;
    }

    public SlideInfo setScreenWidth(float f4) {
        this.mScreenWidth = f4;
        return this;
    }

    public SlideInfo setSideSlideLength(float f4) {
        this.mSideSlideLength = f4;
        return this;
    }

    public String toString() {
        return "SlideInfo{mBackViewHeight=" + this.mBackViewHeight + ", mArrowSize=" + this.mArrowSize + ", mMaxSlideLength=" + this.mMaxSlideLength + ", mSideSlideLength=" + this.mSideSlideLength + ", mDragRate=" + this.mDragRate + ", mIsAllowEdgeLeft=" + this.mIsAllowEdgeLeft + ", mIsAllowEdgeRight=" + this.mIsAllowEdgeRight + ", mScreenWidth=" + this.mScreenWidth + '}';
    }
}

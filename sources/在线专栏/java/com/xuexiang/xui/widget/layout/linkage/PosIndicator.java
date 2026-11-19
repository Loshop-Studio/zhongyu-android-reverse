package com.xuexiang.xui.widget.layout.linkage;

import android.graphics.PointF;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class PosIndicator {
    private static int SCROLL_ORIENTATION_HORIZONTAL = 1;
    private static int SCROLL_ORIENTATION_NONE = -1;
    private static int SCROLL_ORIENTATION_VERTICAL = 0;
    public static final String TAG = "PosIndicator";
    private boolean mConfigurationHasChanged;
    private int mCurrentPos;
    private float mDistanceToDownX;
    private float mDistanceToDownY;
    private boolean mIsDragging;
    private boolean mIsUnderTouch;
    private int mLastPos;
    private float mOffsetX;
    private float mOffsetY;
    private int mPressedPos;
    private float mSaveCurrentPosRatio;
    private int mTouchSlop;
    private int mStartPos = 0;
    public int mEndPos = 0;
    private PointF mLastMovePoint = new PointF();
    private PointF mDownPoint = new PointF();
    private PointF mReleasePoint = new PointF();
    private int mTouchAction = -1;
    private int mScrollOrientation = SCROLL_ORIENTATION_NONE;

    private void restorePosIfNeeded() {
        if (this.mConfigurationHasChanged) {
            this.mCurrentPos = (int) (this.mStartPos + ((this.mEndPos - r0) * this.mSaveCurrentPosRatio));
            UILog.dTag(TAG, "Need restore current pos, mCurrentPos: " + this.mCurrentPos);
        }
    }

    private void setDistanceToDown(float f4, float f5) {
        PointF pointF = this.mDownPoint;
        this.mDistanceToDownX = f4 - pointF.x;
        this.mDistanceToDownY = f5 - pointF.y;
    }

    private void setOffset(float f4, float f5) {
        this.mOffsetX = f4;
        this.mOffsetY = f5;
    }

    public int checkPosBoundary(int i4) {
        return Math.min(Math.max(i4, this.mStartPos), this.mEndPos);
    }

    public int getCurrentPos() {
        return this.mCurrentPos;
    }

    public float getDistanceToDownX() {
        return this.mDistanceToDownX;
    }

    public float getDistanceToDownY() {
        return this.mDistanceToDownY;
    }

    public int getEndPos() {
        return this.mEndPos;
    }

    public PointF getFingerDownPoint() {
        return this.mDownPoint;
    }

    public PointF getFingerMovePoint() {
        return this.mLastMovePoint;
    }

    public PointF getFingerReleasePoint() {
        return this.mReleasePoint;
    }

    public int getLastPos() {
        return this.mLastPos;
    }

    public float getOffsetX() {
        return this.mOffsetX;
    }

    public float getOffsetY() {
        return this.mOffsetY;
    }

    public int getPosDistanceFromStart() {
        return this.mCurrentPos - this.mStartPos;
    }

    public int getPosOffset() {
        return this.mCurrentPos - this.mLastPos;
    }

    public int getStartPos() {
        return this.mStartPos;
    }

    public int getTouchAction() {
        return this.mTouchAction;
    }

    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public boolean hasJustBackEndPos() {
        return this.mLastPos != this.mEndPos && isInEndPos();
    }

    public boolean hasJustBackStartPos() {
        return this.mLastPos != this.mStartPos && isInStartPos();
    }

    public boolean hasJustLeftEndPos() {
        return this.mLastPos == this.mEndPos && hasLeftEndPos();
    }

    public boolean hasJustLeftStartPos() {
        return this.mLastPos == this.mStartPos && hasLeftStartPos();
    }

    public boolean hasLeftEndPos() {
        return this.mCurrentPos < this.mEndPos;
    }

    public boolean hasLeftStartPos() {
        return this.mCurrentPos > this.mStartPos;
    }

    public boolean hasMovedAfterPressedDown() {
        return this.mCurrentPos != this.mPressedPos;
    }

    public void initStartAndEndPos(int i4, int i5) {
        this.mStartPos = i4;
        this.mEndPos = i5;
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public boolean isInEndPos() {
        return this.mCurrentPos == this.mEndPos;
    }

    public boolean isInStartPos() {
        return this.mCurrentPos == this.mStartPos;
    }

    public boolean isMoveDown() {
        return getOffsetY() > IGoodView.DEFAULT_TO_ALPHA;
    }

    public boolean isMoveUp() {
        return getOffsetY() < IGoodView.DEFAULT_TO_ALPHA;
    }

    public boolean isScrollHorizontal() {
        return this.mScrollOrientation == SCROLL_ORIENTATION_HORIZONTAL;
    }

    public boolean isScrollVertical() {
        return this.mScrollOrientation == SCROLL_ORIENTATION_VERTICAL;
    }

    public boolean isUnderTouch() {
        return this.mIsUnderTouch;
    }

    public void onDown(float f4, float f5) {
        this.mIsUnderTouch = true;
        this.mPressedPos = this.mCurrentPos;
        this.mLastMovePoint.set(f4, f5);
        this.mDownPoint.set(f4, f5);
        this.mTouchAction = 0;
    }

    public void onMove(float f4, float f5) {
        PointF pointF = this.mLastMovePoint;
        float f6 = f4 - pointF.x;
        float f7 = f5 - pointF.y;
        if (!this.mIsDragging) {
            float fAbs = Math.abs(f7);
            int i4 = this.mTouchSlop;
            if (fAbs > i4) {
                this.mIsDragging = true;
                f7 = f7 < IGoodView.DEFAULT_TO_ALPHA ? f7 + i4 : f7 - i4;
                this.mScrollOrientation = SCROLL_ORIENTATION_VERTICAL;
            }
        }
        if (!this.mIsDragging) {
            float fAbs2 = Math.abs(f6);
            int i5 = this.mTouchSlop;
            if (fAbs2 > i5) {
                this.mIsDragging = true;
                f6 = f6 < IGoodView.DEFAULT_TO_ALPHA ? f6 + i5 : f6 - i5;
                this.mScrollOrientation = SCROLL_ORIENTATION_HORIZONTAL;
            }
        }
        if (this.mIsDragging) {
            setOffset(f6, f7);
            setDistanceToDown(f4, f5);
            this.mLastMovePoint.set(f4, f5);
            this.mTouchAction = 2;
        }
    }

    public void onPointerDown(float f4, float f5) {
        this.mLastMovePoint.set(f4, f5);
    }

    public void onPointerUp(float f4, float f5) {
        this.mLastMovePoint.set(f4, f5);
    }

    public void onRelease(float f4, float f5) {
        this.mIsUnderTouch = false;
        this.mIsDragging = false;
        this.mReleasePoint.set(f4, f5);
        this.mTouchAction = 1;
        this.mScrollOrientation = SCROLL_ORIENTATION_NONE;
    }

    public void savePosOnConfigurationChanged() {
        int i4 = this.mCurrentPos;
        int i5 = this.mStartPos;
        this.mSaveCurrentPosRatio = ((i4 - i5) * 1.0f) / (this.mEndPos - i5);
        this.mSaveCurrentPosRatio = (Math.round(r0 * 10.0f) * 1.0f) / 10.0f;
        UILog.dTag(TAG, "savePosOnConfigurationChanged, mSaveCurrentPosRation: " + this.mSaveCurrentPosRatio);
    }

    public void setCurrentPos(int i4) {
        this.mLastPos = this.mCurrentPos;
        this.mCurrentPos = i4;
    }

    public void setTouchSlop(int i4) {
        this.mTouchSlop = i4;
    }

    public String toString() {
        return "mCurrentPos: " + this.mCurrentPos + ", mLastPos: " + this.mLastPos + ", mPressedPos: " + this.mPressedPos + ", isInStartPos: " + isInStartPos() + ", isInEndPos: " + isInEndPos();
    }

    public boolean willOverEndPos() {
        return ((int) (((float) this.mCurrentPos) - this.mOffsetY)) > this.mEndPos;
    }

    public boolean willOverStartPos() {
        return ((int) (((float) this.mCurrentPos) - this.mOffsetY)) < this.mStartPos;
    }
}

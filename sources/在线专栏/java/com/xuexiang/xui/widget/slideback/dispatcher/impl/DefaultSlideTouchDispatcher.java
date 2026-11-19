package com.xuexiang.xui.widget.slideback.dispatcher.impl;

import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.slideback.SlideInfo;
import com.xuexiang.xui.widget.slideback.callback.SlideCallBack;
import com.xuexiang.xui.widget.slideback.dispatcher.ISlideTouchEventDispatcher;
import com.xuexiang.xui.widget.slideback.dispatcher.OnSlideUpdateListener;

/* loaded from: classes.dex */
public class DefaultSlideTouchDispatcher implements ISlideTouchEventDispatcher {
    protected SlideCallBack mCallBack;
    protected OnSlideUpdateListener mOnSlideUpdateListener;
    protected SlideInfo mSlideInfo;
    protected boolean mIsSideSlideLeft = false;
    protected boolean mIsSideSlideRight = false;
    protected float mDownX = IGoodView.DEFAULT_TO_ALPHA;
    protected float mMoveXLength = IGoodView.DEFAULT_TO_ALPHA;

    @Override // com.xuexiang.xui.widget.slideback.dispatcher.ISlideTouchEventDispatcher
    public ISlideTouchEventDispatcher init(SlideInfo slideInfo, SlideCallBack slideCallBack, OnSlideUpdateListener onSlideUpdateListener) {
        this.mSlideInfo = slideInfo;
        this.mCallBack = slideCallBack;
        this.mOnSlideUpdateListener = onSlideUpdateListener;
        return this;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        SlideCallBack slideCallBack;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getRawX();
            if (this.mSlideInfo.isAllowEdgeLeft() && this.mDownX <= this.mSlideInfo.getSideSlideLength()) {
                this.mIsSideSlideLeft = true;
            } else if (this.mSlideInfo.isAllowEdgeRight() && this.mDownX >= this.mSlideInfo.getScreenWidth() - this.mSlideInfo.getSideSlideLength()) {
                this.mIsSideSlideRight = true;
            }
        } else if (action == 1) {
            if ((this.mIsSideSlideLeft || this.mIsSideSlideRight) && this.mMoveXLength / this.mSlideInfo.getDragRate() >= this.mSlideInfo.getMaxSlideLength() && (slideCallBack = this.mCallBack) != null) {
                slideCallBack.onSlide(!this.mIsSideSlideLeft ? 1 : 0);
            }
            if (this.mSlideInfo.isAllowEdgeLeft() && this.mIsSideSlideLeft) {
                updateSlideLength(true, IGoodView.DEFAULT_TO_ALPHA);
            } else if (this.mSlideInfo.isAllowEdgeRight() && this.mIsSideSlideRight) {
                updateSlideLength(false, IGoodView.DEFAULT_TO_ALPHA);
            }
            this.mIsSideSlideLeft = false;
            this.mIsSideSlideRight = false;
        } else if (action == 2 && (this.mIsSideSlideLeft || this.mIsSideSlideRight)) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.mDownX);
            this.mMoveXLength = fAbs;
            if (fAbs / this.mSlideInfo.getDragRate() <= this.mSlideInfo.getMaxSlideLength()) {
                if (this.mSlideInfo.isAllowEdgeLeft() && this.mIsSideSlideLeft) {
                    updateSlideLength(true, this.mMoveXLength / this.mSlideInfo.getDragRate());
                } else if (this.mSlideInfo.isAllowEdgeRight() && this.mIsSideSlideRight) {
                    updateSlideLength(false, this.mMoveXLength / this.mSlideInfo.getDragRate());
                }
            }
            if (this.mSlideInfo.isAllowEdgeLeft() && this.mIsSideSlideLeft) {
                updateSlidePosition(true, (int) motionEvent.getRawY());
            } else if (this.mSlideInfo.isAllowEdgeRight() && this.mIsSideSlideRight) {
                updateSlidePosition(false, (int) motionEvent.getRawY());
            }
        }
        return this.mIsSideSlideLeft || this.mIsSideSlideRight;
    }

    @Override // com.xuexiang.xui.widget.slideback.dispatcher.ISlideTouchEventDispatcher
    public void updateSlideLength(boolean z3, float f4) {
        OnSlideUpdateListener onSlideUpdateListener = this.mOnSlideUpdateListener;
        if (onSlideUpdateListener != null) {
            onSlideUpdateListener.updateSlideLength(z3, f4);
        }
    }

    @Override // com.xuexiang.xui.widget.slideback.dispatcher.ISlideTouchEventDispatcher
    public void updateSlidePosition(boolean z3, int i4) {
        OnSlideUpdateListener onSlideUpdateListener = this.mOnSlideUpdateListener;
        if (onSlideUpdateListener != null) {
            onSlideUpdateListener.updateSlidePosition(z3, i4);
        }
    }
}

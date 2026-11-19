package com.xuexiang.xui.widget.imageview.edit;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class ScaleGestureDetector {
    private static final float PRESSURE_THRESHOLD = 0.67f;
    private static final String TAG = "ScaleGestureDetector";
    private boolean mActive0MostRecent;
    private int mActiveId0;
    private int mActiveId1;
    private MotionEvent mCurrEvent;
    private float mCurrFingerDiffX;
    private float mCurrFingerDiffY;
    private float mCurrLen;
    private float mCurrPressure;
    private Vector2D mCurrSpanVector = new Vector2D();
    private float mFocusX;
    private float mFocusY;
    private boolean mGestureInProgress;
    private boolean mInvalidGesture;
    private final OnScaleGestureListener mListener;
    private MotionEvent mPrevEvent;
    private float mPrevFingerDiffX;
    private float mPrevFingerDiffY;
    private float mPrevLen;
    private float mPrevPressure;
    private float mScaleFactor;
    private long mTimeDelta;

    interface OnScaleGestureListener {
        boolean onScale(View view, ScaleGestureDetector scaleGestureDetector);

        boolean onScaleBegin(View view, ScaleGestureDetector scaleGestureDetector);

        void onScaleEnd(View view, ScaleGestureDetector scaleGestureDetector);
    }

    static class SimpleOnScaleGestureListener implements OnScaleGestureListener {
        SimpleOnScaleGestureListener() {
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(View view, ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(View view, ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(View view, ScaleGestureDetector scaleGestureDetector) {
        }
    }

    ScaleGestureDetector(OnScaleGestureListener onScaleGestureListener) {
        this.mListener = onScaleGestureListener;
    }

    private int findNewActiveIndex(MotionEvent motionEvent, int i4, int i5) {
        int pointerCount = motionEvent.getPointerCount();
        int iFindPointerIndex = motionEvent.findPointerIndex(i4);
        for (int i6 = 0; i6 < pointerCount; i6++) {
            if (i6 != i5 && i6 != iFindPointerIndex) {
                return i6;
            }
        }
        return -1;
    }

    private float getCurrentSpan() {
        if (this.mCurrLen == -1.0f) {
            float f4 = this.mCurrFingerDiffX;
            float f5 = this.mCurrFingerDiffY;
            this.mCurrLen = (float) Math.sqrt((f4 * f4) + (f5 * f5));
        }
        return this.mCurrLen;
    }

    private float getPreviousSpan() {
        if (this.mPrevLen == -1.0f) {
            float f4 = this.mPrevFingerDiffX;
            float f5 = this.mPrevFingerDiffY;
            this.mPrevLen = (float) Math.sqrt((f4 * f4) + (f5 * f5));
        }
        return this.mPrevLen;
    }

    private void reset() {
        MotionEvent motionEvent = this.mPrevEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.mPrevEvent = null;
        }
        MotionEvent motionEvent2 = this.mCurrEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.mCurrEvent = null;
        }
        this.mGestureInProgress = false;
        this.mActiveId0 = -1;
        this.mActiveId1 = -1;
        this.mInvalidGesture = false;
    }

    private void setContext(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.mCurrEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.mCurrEvent = MotionEvent.obtain(motionEvent);
        this.mCurrLen = -1.0f;
        this.mPrevLen = -1.0f;
        this.mScaleFactor = -1.0f;
        this.mCurrSpanVector.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
        MotionEvent motionEvent3 = this.mPrevEvent;
        int iFindPointerIndex = motionEvent3.findPointerIndex(this.mActiveId0);
        int iFindPointerIndex2 = motionEvent3.findPointerIndex(this.mActiveId1);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.mActiveId0);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.mActiveId1);
        if (iFindPointerIndex < 0 || iFindPointerIndex2 < 0 || iFindPointerIndex3 < 0 || iFindPointerIndex4 < 0) {
            this.mInvalidGesture = true;
            Log.e(TAG, "Invalid MotionEvent stream detected.", new Throwable());
            if (this.mGestureInProgress) {
                this.mListener.onScaleEnd(view, this);
                return;
            }
            return;
        }
        float x3 = motionEvent3.getX(iFindPointerIndex);
        float y3 = motionEvent3.getY(iFindPointerIndex);
        float x4 = motionEvent3.getX(iFindPointerIndex2);
        float y4 = motionEvent3.getY(iFindPointerIndex2);
        float x5 = motionEvent.getX(iFindPointerIndex3);
        float y5 = motionEvent.getY(iFindPointerIndex3);
        float x6 = motionEvent.getX(iFindPointerIndex4) - x5;
        float y6 = motionEvent.getY(iFindPointerIndex4) - y5;
        this.mCurrSpanVector.set(x6, y6);
        this.mPrevFingerDiffX = x4 - x3;
        this.mPrevFingerDiffY = y4 - y3;
        this.mCurrFingerDiffX = x6;
        this.mCurrFingerDiffY = y6;
        this.mFocusX = x5 + (x6 * 0.5f);
        this.mFocusY = y5 + (y6 * 0.5f);
        this.mTimeDelta = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.mCurrPressure = motionEvent.getPressure(iFindPointerIndex3) + motionEvent.getPressure(iFindPointerIndex4);
        this.mPrevPressure = motionEvent3.getPressure(iFindPointerIndex) + motionEvent3.getPressure(iFindPointerIndex2);
    }

    Vector2D getCurrentSpanVector() {
        return this.mCurrSpanVector;
    }

    public float getCurrentSpanX() {
        return this.mCurrFingerDiffX;
    }

    public float getCurrentSpanY() {
        return this.mCurrFingerDiffY;
    }

    public long getEventTime() {
        return this.mCurrEvent.getEventTime();
    }

    float getFocusX() {
        return this.mFocusX;
    }

    float getFocusY() {
        return this.mFocusY;
    }

    public float getPreviousSpanX() {
        return this.mPrevFingerDiffX;
    }

    public float getPreviousSpanY() {
        return this.mPrevFingerDiffY;
    }

    public float getScaleFactor() {
        if (this.mScaleFactor == -1.0f) {
            this.mScaleFactor = getCurrentSpan() / getPreviousSpan();
        }
        return this.mScaleFactor;
    }

    public long getTimeDelta() {
        return this.mTimeDelta;
    }

    boolean isInProgress() {
        return this.mGestureInProgress;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean onTouchEvent(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.onTouchEvent(android.view.View, android.view.MotionEvent):boolean");
    }
}

package com.xuexiang.xui.widget.imageview.photoview.gestures;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public interface IGestureDetector {
    boolean isDragging();

    boolean isScaling();

    boolean onTouchEvent(MotionEvent motionEvent);

    void setOnGestureListener(OnGestureListener onGestureListener);
}

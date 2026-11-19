package com.xuexiang.xui.widget.slideback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SlideBackInterceptLayout extends FrameLayout {
    private float mSideSlideLength;

    public SlideBackInterceptLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0 && (motionEvent.getRawX() <= this.mSideSlideLength || motionEvent.getRawX() >= ((float) getWidth()) - this.mSideSlideLength);
    }

    public void setSideSlideLength(float f4) {
        this.mSideSlideLength = f4;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSideSlideLength = IGoodView.DEFAULT_TO_ALPHA;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mSideSlideLength = IGoodView.DEFAULT_TO_ALPHA;
    }
}

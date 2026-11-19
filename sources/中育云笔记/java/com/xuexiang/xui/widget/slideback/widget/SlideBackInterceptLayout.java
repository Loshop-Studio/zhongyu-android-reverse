package com.xuexiang.xui.widget.slideback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public class SlideBackInterceptLayout extends FrameLayout {

    /* renamed from: c */
    public float f16954c;

    public SlideBackInterceptLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return motionEvent.getRawX() <= this.f16954c || motionEvent.getRawX() >= ((float) getWidth()) - this.f16954c;
        }
        return false;
    }

    public void setSideSlideLength(float f10) {
        this.f16954c = f10;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16954c = 0.0f;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16954c = 0.0f;
    }
}

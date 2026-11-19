package com.xuexiang.xui.widget.slideback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class SlideBackInterceptLayout extends FrameLayout {

    /* renamed from: a */
    public float f4880a;

    public SlideBackInterceptLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return motionEvent.getRawX() <= this.f4880a || motionEvent.getRawX() >= ((float) getWidth()) - this.f4880a;
        }
        return false;
    }

    public void setSideSlideLength(float f) {
        this.f4880a = f;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4880a = 0.0f;
    }

    public SlideBackInterceptLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4880a = 0.0f;
    }
}

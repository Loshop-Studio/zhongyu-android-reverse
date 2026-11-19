package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class FixedSpeedScroller extends Scroller {
    private int mScrollSpeed;

    public FixedSpeedScroller(Context context) {
        super(context);
        this.mScrollSpeed = 450;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7, int i8) {
        super.startScroll(i4, i5, i6, i7, this.mScrollSpeed);
    }

    public FixedSpeedScroller(Context context, Interpolator interpolator, int i4) {
        super(context, interpolator);
        this.mScrollSpeed = i4;
    }
}

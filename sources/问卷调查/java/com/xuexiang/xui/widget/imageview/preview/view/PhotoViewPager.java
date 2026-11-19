package com.xuexiang.xui.widget.imageview.preview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p000a.p068t.p069a.C0446b;

/* loaded from: classes.dex */
public class PhotoViewPager extends C0446b {
    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000a.p068t.p069a.C0446b, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}

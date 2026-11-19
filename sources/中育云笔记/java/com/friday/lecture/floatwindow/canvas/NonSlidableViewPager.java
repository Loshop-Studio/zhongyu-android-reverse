package com.friday.lecture.floatwindow.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.Keep;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

@Keep
/* loaded from: classes4.dex */
public class NonSlidableViewPager extends ViewPager {

    /* renamed from: com.friday.lecture.floatwindow.canvas.NonSlidableViewPager$a */
    public class C6140a extends Scroller {
        public C6140a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, 350);
        }
    }

    public NonSlidableViewPager(Context context) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super(context);
        setMyScroller();
    }

    private void setMyScroller() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C6140a(getContext()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NonSlidableViewPager(Context context, AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super(context, attributeSet);
        setMyScroller();
    }
}

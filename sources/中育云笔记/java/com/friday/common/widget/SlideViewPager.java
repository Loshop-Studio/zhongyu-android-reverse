package com.friday.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class SlideViewPager extends ViewPager {

    /* renamed from: c */
    public final boolean f6186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideViewPager(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        return this.f6186c && super.onInterceptTouchEvent(event);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        return this.f6186c && super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(attrs, "attrs");
    }
}

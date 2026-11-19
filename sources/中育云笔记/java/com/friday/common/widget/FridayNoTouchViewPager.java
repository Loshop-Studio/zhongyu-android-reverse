package com.friday.common.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class FridayNoTouchViewPager extends VerticalViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FridayNoTouchViewPager(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // fr.castorflex.android.verticalviewpager.VerticalViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // fr.castorflex.android.verticalviewpager.VerticalViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // fr.castorflex.android.verticalviewpager.VerticalViewPager
    public void setCurrentItem(int i10) {
        super.m18177J(i10, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FridayNoTouchViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(attrs, "attrs");
    }
}

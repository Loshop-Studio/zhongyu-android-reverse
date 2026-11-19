package com.zykj.mistake.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/widget/CustomViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "Z", "isSlidingEnabled", "()Z", "setSlidingEnabled", "(Z)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CustomViewPager extends ViewPager {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean isSlidingEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(@NotNull Context context) {
        super(context);
        AbstractC5830k.m5330g(context, "context");
        this.isSlidingEnabled = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.isSlidingEnabled && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.isSlidingEnabled && super.onTouchEvent(motionEvent);
    }

    public final void setSlidingEnabled(boolean z8) {
        this.isSlidingEnabled = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(attrs, "attrs");
        this.isSlidingEnabled = true;
    }
}

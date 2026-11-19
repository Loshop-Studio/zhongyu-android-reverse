package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0340c0;
import androidx.core.view.C0342e;
import androidx.core.view.C0358u;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;
import p164w.C3425a;

/* loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i4) {
        return i4 == 0 ? BadgeDrawable.TOP_START : i4;
    }

    abstract View findFirstDependency(List<View> list);

    final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i4 = this.overlayTop;
        return C3425a.m10443b((int) (overlapRatioForOffset * i4), 0, i4);
    }

    float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (viewFindFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i4);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.C0305e c0305e = (CoordinatorLayout.C0305e) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0305e).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c0305e).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0305e).rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0305e).bottomMargin);
        C0340c0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C0358u.m2064x(coordinatorLayout) && !C0358u.m2064x(view)) {
            rect.left += lastWindowInsets.m1872j();
            rect.right -= lastWindowInsets.m1873k();
        }
        Rect rect2 = this.tempRect2;
        C0342e.m1927a(resolveGravity(c0305e.f2581c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        View viewFindFirstDependency;
        C0340c0 lastWindowInsets;
        int i8 = view.getLayoutParams().height;
        if ((i8 != -1 && i8 != -2) || (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0358u.m2064x(viewFindFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m1874l() + lastWindowInsets.m1871i();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i4, i5, View.MeasureSpec.makeMeasureSpec(scrollRange, i8 == -1 ? 1073741824 : Integer.MIN_VALUE), i7);
        return true;
    }

    public final void setOverlayTop(int i4) {
        this.overlayTop = i4;
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}

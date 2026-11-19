package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;

/* loaded from: classes5.dex */
public class NestedFrameLayout extends FrameLayout implements NestedScrollingParent, NestedScrollingChild {

    /* renamed from: c */
    public NestedScrollingChildHelper f16413c;

    /* renamed from: d */
    public NestedScrollingParentHelper f16414d;

    public NestedFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f16413c.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16413c.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f16413c.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f16413c.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            startNestedScroll(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f16414d.getNestedScrollAxes();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f16413c.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f16413c.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        dispatchNestedPreScroll(i10, i11, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f16414d.onNestedScrollAccepted(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.f16414d.onStopNestedScroll(view);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z10) {
        this.f16413c.setNestedScrollingEnabled(z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return this.f16413c.startNestedScroll(i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f16413c.stopNestedScroll();
    }

    public NestedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public NestedFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16413c = new NestedScrollingChildHelper(this);
        this.f16414d = new NestedScrollingParentHelper(this);
        setNestedScrollingEnabled(true);
    }
}

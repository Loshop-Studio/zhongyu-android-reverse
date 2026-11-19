package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0349l;
import androidx.core.view.C0352o;
import androidx.core.view.InterfaceC0348k;

/* loaded from: classes.dex */
public class NestedFrameLayout extends FrameLayout implements InterfaceC0348k {
    private C0349l mChildHelper;
    private C0352o mParentHelper;

    public NestedFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.mChildHelper.m1953a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.mChildHelper.m1954b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.mChildHelper.m1955c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.mChildHelper.m1958f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            startNestedScroll(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mParentHelper.m1968a();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.m1960k();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.m1962m();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return dispatchNestedFling(f4, f5, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        dispatchNestedPreScroll(i4, i5, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.mParentHelper.m1969b(view, view2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return (i4 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.mParentHelper.m1971d(view);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        this.mChildHelper.m1963n(z3);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return this.mChildHelper.m1964p(i4);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mChildHelper.m1966r();
    }

    public NestedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public NestedFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mChildHelper = new C0349l(this);
        this.mParentHelper = new C0352o(this);
        setNestedScrollingEnabled(true);
    }
}

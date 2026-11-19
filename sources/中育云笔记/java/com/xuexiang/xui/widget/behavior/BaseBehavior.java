package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p164g8.InterfaceC9277a;

/* loaded from: classes5.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: c */
    public final int f15533c;

    /* renamed from: d */
    public boolean f15534d;

    /* renamed from: e */
    public boolean f15535e;

    /* renamed from: f */
    public InterfaceC9277a f15536f;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15534d = true;
        this.f15535e = true;
        this.f15533c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo12422a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        mo12422a(view);
        if (Math.abs(i11) > 2) {
            if (i11 < 0) {
                if (this.f15536f.getState() == 0) {
                    this.f15536f.show();
                }
            } else {
                if (i11 <= 0 || this.f15536f.getState() != 1) {
                    return;
                }
                this.f15536f.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        return (i10 & 2) != 0;
    }
}

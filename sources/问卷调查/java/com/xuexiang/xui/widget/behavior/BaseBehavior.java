package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p070b.p113c.p114a.p116e.p123c.InterfaceC0798a;

/* loaded from: classes.dex */
public abstract class BaseBehavior extends CoordinatorLayout.AbstractC0503c<View> {

    /* renamed from: a */
    public boolean f5153a;

    /* renamed from: b */
    public boolean f5154b;

    /* renamed from: c */
    public InterfaceC0798a f5155c;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5153a = true;
        this.f5154b = true;
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: B */
    public abstract void mo2748B(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: o */
    public void mo1678o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        mo2748B(view);
        if (Math.abs(i2) > 2) {
            if (i2 < 0) {
                if (this.f5155c.getState() == 0) {
                    this.f5155c.mo2506b();
                }
            } else {
                if (i2 <= 0 || this.f5155c.getState() != 1) {
                    return;
                }
                this.f5155c.mo2507c();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: w */
    public boolean mo1686w(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return (i & 2) != 0;
    }
}

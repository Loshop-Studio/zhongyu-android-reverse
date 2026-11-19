package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p273w2.InterfaceC9732a;

/* loaded from: classes4.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public final int f5897a;

    /* renamed from: b */
    public boolean f5898b;

    /* renamed from: c */
    public boolean f5899c;

    /* renamed from: d */
    public InterfaceC9732a f5900d;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5898b = true;
        this.f5899c = true;
        this.f5897a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo5516a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        mo5516a(view);
        if (Math.abs(i11) > 2) {
            if (i11 < 0) {
                if (this.f5900d.getState() == 0) {
                    this.f5900d.show();
                }
            } else {
                if (i11 <= 0 || this.f5900d.getState() != 1) {
                    return;
                }
                this.f5900d.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        return (i10 & 2) != 0;
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p111q0.InterfaceC4475a;

/* loaded from: classes2.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public final int f3237a;

    /* renamed from: b */
    public boolean f3238b;

    /* renamed from: c */
    public boolean f3239c;

    /* renamed from: d */
    public InterfaceC4475a f3240d;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3238b = true;
        this.f3239c = true;
        this.f3237a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo4202a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        mo4202a(view);
        if (Math.abs(i5) > 2) {
            if (i5 < 0) {
                if (this.f3240d.getState() == 0) {
                    this.f3240d.show();
                }
            } else {
                if (i5 <= 0 || this.f3240d.getState() != 1) {
                    return;
                }
                this.f3240d.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        return (i4 & 2) != 0;
    }
}

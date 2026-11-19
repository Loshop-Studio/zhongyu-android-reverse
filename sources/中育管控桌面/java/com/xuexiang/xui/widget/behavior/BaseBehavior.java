package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p182x1.InterfaceC7828a;

/* loaded from: classes3.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public final int f4621a;

    /* renamed from: b */
    public boolean f4622b;

    /* renamed from: c */
    public boolean f4623c;

    /* renamed from: d */
    public InterfaceC7828a f4624d;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4622b = true;
        this.f4623c = true;
        this.f4621a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo4526a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr) {
        mo4526a(view);
        if (Math.abs(i7) > 2) {
            if (i7 < 0) {
                if (this.f4624d.getState() == 0) {
                    this.f4624d.show();
                }
            } else {
                if (i7 <= 0 || this.f4624d.getState() != 1) {
                    return;
                }
                this.f4624d.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6) {
        return (i6 & 2) != 0;
    }
}

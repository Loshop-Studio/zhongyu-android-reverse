package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p177m3.InterfaceC8961a;

/* loaded from: classes4.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public final int f7152a;

    /* renamed from: b */
    public boolean f7153b;

    /* renamed from: c */
    public boolean f7154c;

    /* renamed from: d */
    public InterfaceC8961a f7155d;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7153b = true;
        this.f7154c = true;
        this.f7152a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo6612a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr) {
        mo6612a(view);
        if (Math.abs(i10) > 2) {
            if (i10 < 0) {
                if (this.f7155d.getState() == 0) {
                    this.f7155d.show();
                }
            } else {
                if (i10 <= 0 || this.f7155d.getState() != 1) {
                    return;
                }
                this.f7155d.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9) {
        return (i9 & 2) != 0;
    }
}

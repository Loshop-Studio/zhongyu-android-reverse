package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p041d2.InterfaceC5411a;

/* loaded from: classes3.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public boolean f4068a;

    /* renamed from: b */
    public boolean f4069b;

    /* renamed from: c */
    public InterfaceC5411a f4070c;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4068a = true;
        this.f4069b = true;
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo3461a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i8, int[] iArr) {
        mo3461a(view);
        if (Math.abs(i8) > 2) {
            if (i8 < 0) {
                if (this.f4070c.getState() == 0) {
                    this.f4070c.show();
                }
            } else {
                if (i8 <= 0 || this.f4070c.getState() != 1) {
                    return;
                }
                this.f4070c.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return (i & 2) != 0;
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p261u1.InterfaceC10164a;

/* loaded from: classes4.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public final int f7222a;

    /* renamed from: b */
    public boolean f7223b;

    /* renamed from: c */
    public boolean f7224c;

    /* renamed from: d */
    public InterfaceC10164a f7225d;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7223b = true;
        this.f7224c = true;
        this.f7222a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public abstract void mo6637a(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        mo6637a(view);
        if (Math.abs(i11) > 2) {
            if (i11 < 0) {
                if (this.f7225d.getState() == 0) {
                    this.f7225d.show();
                }
            } else {
                if (i11 <= 0 || this.f7225d.getState() != 1) {
                    return;
                }
                this.f7225d.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        return (i10 & 2) != 0;
    }
}

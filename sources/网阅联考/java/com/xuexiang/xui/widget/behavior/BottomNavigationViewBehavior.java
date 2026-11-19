package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p111q0.C4477c;

/* loaded from: classes2.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo4202a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f3239c) {
            this.f3239c = false;
            C4477c c4477cM5756c = C4477c.m5756c(view);
            this.f3240d = c4477cM5756c;
            c4477cM5756c.mo5753a(view.getY());
            this.f3240d.mo5754b(C4477c.f5241h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

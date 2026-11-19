package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p182x1.C7830c;

/* loaded from: classes3.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo4526a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f4623c) {
            this.f4623c = false;
            C7830c c7830cM9457c = C7830c.m9457c(view);
            this.f4624d = c7830cM9457c;
            c7830cM9457c.mo9454a(view.getY());
            this.f4624d.mo9455b(C7830c.f10415h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

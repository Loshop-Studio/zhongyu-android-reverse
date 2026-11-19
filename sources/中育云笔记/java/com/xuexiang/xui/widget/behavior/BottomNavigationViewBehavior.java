package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p164g8.C9279c;

/* loaded from: classes5.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo12422a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f15535e) {
            this.f15535e = false;
            C9279c c9279cM18274c = C9279c.m18274c(view);
            this.f15536f = c9279cM18274c;
            c9279cM18274c.mo18271a(view.getY());
            this.f15536f.mo18272b(C9279c.f21624h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p164g8.C9279c;

/* loaded from: classes5.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo12422a(View view) {
        if (this.f15534d) {
            this.f15534d = false;
            this.f15536f.mo18271a(view.getY());
            this.f15536f.mo18272b(C9279c.f21623g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f15535e) {
            this.f15536f = C9279c.m18274c(view);
            this.f15535e = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

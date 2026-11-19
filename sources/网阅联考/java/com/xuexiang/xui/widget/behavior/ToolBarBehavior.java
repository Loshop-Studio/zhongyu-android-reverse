package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p111q0.C4477c;

/* loaded from: classes2.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo4202a(View view) {
        if (this.f3238b) {
            this.f3238b = false;
            this.f3240d.mo5753a(view.getY());
            this.f3240d.mo5754b(C4477c.f5240g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f3239c) {
            this.f3240d = C4477c.m5756c(view);
            this.f3239c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

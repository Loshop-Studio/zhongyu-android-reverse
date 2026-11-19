package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p182x1.C7830c;

/* loaded from: classes3.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo4526a(View view) {
        if (this.f4622b) {
            this.f4622b = false;
            this.f4624d.mo9454a(view.getY());
            this.f4624d.mo9455b(C7830c.f10414g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f4623c) {
            this.f4624d = C7830c.m9457c(view);
            this.f4623c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

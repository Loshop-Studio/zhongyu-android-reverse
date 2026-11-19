package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p273w2.C9734c;

/* loaded from: classes4.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo5516a(View view) {
        if (this.f5898b) {
            this.f5898b = false;
            this.f5900d.mo16302a(view.getY());
            this.f5900d.mo16303b(C9734c.f17104g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f5899c) {
            this.f5900d = C9734c.m16305c(view);
            this.f5899c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

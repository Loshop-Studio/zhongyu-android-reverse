package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p273w2.C9734c;

/* loaded from: classes4.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo5516a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f5899c) {
            this.f5899c = false;
            C9734c c9734cM16305c = C9734c.m16305c(view);
            this.f5900d = c9734cM16305c;
            c9734cM16305c.mo16302a(view.getY());
            this.f5900d.mo16303b(C9734c.f17105h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

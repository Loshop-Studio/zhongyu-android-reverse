package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p177m3.C8963c;

/* loaded from: classes4.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo6612a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f7154c) {
            this.f7154c = false;
            C8963c c8963cM14299c = C8963c.m14299c(view);
            this.f7155d = c8963cM14299c;
            c8963cM14299c.mo14296a(view.getY());
            this.f7155d.mo14297b(C8963c.f15023h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p261u1.C10166c;

/* loaded from: classes4.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo6637a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f7224c) {
            this.f7224c = false;
            C10166c c10166cM19032c = C10166c.m19032c(view);
            this.f7225d = c10166cM19032c;
            c10166cM19032c.mo19029a(view.getY());
            this.f7225d.mo19030b(C10166c.f20293h);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

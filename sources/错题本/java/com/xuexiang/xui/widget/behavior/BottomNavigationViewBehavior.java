package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p041d2.C5415e;

/* loaded from: classes3.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public final void mo3461a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f4069b) {
            this.f4069b = false;
            this.f4070c = C5415e.m4808a(view);
            view.getY();
            this.f4070c.mo4801b(2333);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }
}

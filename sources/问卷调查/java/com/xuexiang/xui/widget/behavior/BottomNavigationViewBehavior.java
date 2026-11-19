package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p070b.p113c.p114a.p116e.p123c.C0804g;

/* loaded from: classes.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: B */
    public void mo2748B(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: d */
    public boolean mo1667d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: g */
    public boolean mo1670g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f5154b) {
            this.f5154b = false;
            this.f5155c = new C0804g(view);
            view.getY();
            this.f5155c.mo2508d(2333);
        }
        return false;
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p164g8.C9278b;

/* loaded from: classes5.dex */
public class FloatingActionButtonBehavior extends BaseBehavior {
    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo12422a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f15535e) {
            this.f15536f = C9278b.m18273c(view);
            this.f15535e = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

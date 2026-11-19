package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p261u1.C10165b;

/* loaded from: classes4.dex */
public class FloatingActionButtonBehavior extends BaseBehavior {
    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo6637a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f7224c) {
            this.f7225d = C10165b.m19031c(view);
            this.f7224c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

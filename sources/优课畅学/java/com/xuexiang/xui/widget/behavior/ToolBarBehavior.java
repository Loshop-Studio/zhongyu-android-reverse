package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p261u1.C10166c;

/* loaded from: classes4.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo6637a(View view) {
        if (this.f7223b) {
            this.f7223b = false;
            this.f7225d.mo19029a(view.getY());
            this.f7225d.mo19030b(C10166c.f20292g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f7224c) {
            this.f7225d = C10166c.m19032c(view);
            this.f7224c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p177m3.C8963c;

/* loaded from: classes4.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public void mo6612a(View view) {
        if (this.f7153b) {
            this.f7153b = false;
            this.f7155d.mo14296a(view.getY());
            this.f7155d.mo14297b(C8963c.f15022g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f7154c) {
            this.f7155d = C8963c.m14299c(view);
            this.f7154c = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

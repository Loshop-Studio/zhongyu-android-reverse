package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p041d2.C5415e;
import p041d2.InterfaceC5411a;

/* loaded from: classes3.dex */
public class ToolBarBehavior extends BaseBehavior {
    public ToolBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public final void mo3461a(View view) {
        if (this.f4068a) {
            this.f4068a = false;
            InterfaceC5411a interfaceC5411a = this.f4070c;
            view.getY();
            interfaceC5411a.getClass();
            this.f4070c.mo4801b(233);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f4069b) {
            this.f4070c = C5415e.m4808a(view);
            this.f4069b = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

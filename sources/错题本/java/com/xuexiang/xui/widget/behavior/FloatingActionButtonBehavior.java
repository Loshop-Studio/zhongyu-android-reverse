package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p041d2.C5413c;

/* loaded from: classes3.dex */
public class FloatingActionButtonBehavior extends BaseBehavior {
    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    /* renamed from: a */
    public final void mo3461a(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f4069b) {
            C5413c c5413c = new C5413c(0, false);
            c5413c.f8374b = 1;
            c5413c.f8375c = view;
            this.f4070c = c5413c;
            this.f4069b = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }
}

package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class FloatingActionButtonBehavior extends BaseBehavior {
    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.canInit) {
            this.mAnimateHelper = ScaleAnimateHelper.get(view);
            this.canInit = false;
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    protected void onNestPreScrollInit(View view) {
    }
}

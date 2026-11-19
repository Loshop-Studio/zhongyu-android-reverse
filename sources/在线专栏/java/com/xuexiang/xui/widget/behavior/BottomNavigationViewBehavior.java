package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class BottomNavigationViewBehavior extends BaseBehavior {
    public BottomNavigationViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.canInit) {
            this.canInit = false;
            TranslateAnimateHelper translateAnimateHelper = TranslateAnimateHelper.get(view);
            this.mAnimateHelper = translateAnimateHelper;
            translateAnimateHelper.setStartY(view.getY());
            this.mAnimateHelper.setMode(TranslateAnimateHelper.MODE_BOTTOM);
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }

    @Override // com.xuexiang.xui.widget.behavior.BaseBehavior
    protected void onNestPreScrollInit(View view) {
    }
}

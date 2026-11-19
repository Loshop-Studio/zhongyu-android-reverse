package com.xuexiang.xui.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class BaseBehavior extends CoordinatorLayout.Behavior<View> {
    protected boolean canInit;
    protected boolean isFirstMove;
    protected AnimateHelper mAnimateHelper;
    protected final int mTouchSlop;

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isFirstMove = true;
        this.canInit = true;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static BaseBehavior from(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0305e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorM1709f = ((CoordinatorLayout.C0305e) layoutParams).m1709f();
        if (behaviorM1709f instanceof BaseBehavior) {
            return (BaseBehavior) behaviorM1709f;
        }
        throw new IllegalArgumentException("The view is not associated with BaseBehavior");
    }

    public void hide() {
        this.mAnimateHelper.hide();
    }

    protected abstract void onNestPreScrollInit(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        onNestPreScrollInit(view);
        if (Math.abs(i5) > 2) {
            if (i5 < 0) {
                if (this.mAnimateHelper.getState() == 0) {
                    this.mAnimateHelper.show();
                }
            } else {
                if (i5 <= 0 || this.mAnimateHelper.getState() != 1) {
                    return;
                }
                this.mAnimateHelper.hide();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        return (i4 & 2) != 0;
    }

    public void show() {
        this.mAnimateHelper.show();
    }
}

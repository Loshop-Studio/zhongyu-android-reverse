package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.textview.badge.BadgeView;

/* loaded from: classes.dex */
public class TabBadgeView extends BadgeView {
    private TabBadgeView(Context context) {
        super(context);
    }

    public static TabBadgeView bindTab(TabView tabView) {
        TabBadgeView tabBadgeView;
        int i4 = 0;
        while (true) {
            if (i4 >= tabView.getChildCount()) {
                tabBadgeView = null;
                break;
            }
            View childAt = tabView.getChildAt(i4);
            if (childAt instanceof TabBadgeView) {
                tabBadgeView = (TabBadgeView) childAt;
                break;
            }
            i4++;
        }
        if (tabBadgeView == null) {
            tabBadgeView = new TabBadgeView(tabView.getContext());
            tabView.addView(tabBadgeView, new FrameLayout.LayoutParams(-1, -1));
        }
        tabBadgeView.mTargetView = tabView;
        return tabBadgeView;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.BadgeView
    protected void screenFromWindow(boolean z3) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z3) {
            this.mActivityRoot.addView(this, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        View view = this.mTargetView;
        if (view instanceof TabView) {
            ((TabView) view).addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            bindTarget(view);
        }
    }
}

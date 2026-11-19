package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.textview.badge.BadgeView;

/* loaded from: classes5.dex */
public class TabBadgeView extends BadgeView {
    public TabBadgeView(Context context) {
        super(context);
    }

    /* renamed from: F */
    public static TabBadgeView m13419F(TabView tabView) {
        TabBadgeView tabBadgeView;
        int i10 = 0;
        while (true) {
            if (i10 >= tabView.getChildCount()) {
                tabBadgeView = null;
                break;
            }
            View childAt = tabView.getChildAt(i10);
            if (childAt instanceof TabBadgeView) {
                tabBadgeView = (TabBadgeView) childAt;
                break;
            }
            i10++;
        }
        if (tabBadgeView == null) {
            tabBadgeView = new TabBadgeView(tabView.getContext());
            tabView.addView(tabBadgeView, new FrameLayout.LayoutParams(-1, -1));
        }
        tabBadgeView.f17304H = tabView;
        return tabBadgeView;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.BadgeView
    /* renamed from: C */
    public void mo13420C(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z10) {
            this.f17311O.addView(this, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        View view = this.f17304H;
        if (view instanceof TabView) {
            ((TabView) view).addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            m13567n(view);
        }
    }
}

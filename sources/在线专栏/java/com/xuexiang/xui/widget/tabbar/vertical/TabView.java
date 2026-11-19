package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.widget.textview.badge.Badge;

/* loaded from: classes.dex */
public abstract class TabView extends FrameLayout implements Checkable, ITabView {
    public TabView(Context context) {
        super(context);
    }

    public abstract Badge getBadgeView();

    @Deprecated
    public abstract ImageView getIconView();

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public TabView getTabView() {
        return this;
    }

    public abstract TextView getTitleView();
}

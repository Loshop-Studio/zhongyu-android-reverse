package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.widget.textview.badge.InterfaceC8300a;

/* loaded from: classes5.dex */
public abstract class TabView extends FrameLayout implements Checkable {
    public TabView(Context context) {
        super(context);
    }

    public abstract /* synthetic */ C8290a getBadge();

    public abstract InterfaceC8300a getBadgeView();

    public abstract /* synthetic */ C8291b getIcon();

    @Deprecated
    public abstract ImageView getIconView();

    public TabView getTabView() {
        return this;
    }

    public abstract /* synthetic */ C8292c getTitle();

    public abstract TextView getTitleView();
}

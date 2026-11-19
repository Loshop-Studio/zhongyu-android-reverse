package com.xuexiang.xui.widget.tabbar.vertical;

import com.xuexiang.xui.widget.tabbar.vertical.ITabView;

/* loaded from: classes.dex */
public interface TabAdapter {
    int getBackground(int i4);

    ITabView.TabBadge getBadge(int i4);

    int getCount();

    ITabView.TabIcon getIcon(int i4);

    ITabView.TabTitle getTitle(int i4);
}

package com.xuexiang.xui.widget.tabbar.vertical;

import android.content.Context;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p143q3.C6413a;
import p143q3.C6414b;
import p143q3.C6415c;
import p166t3.InterfaceC6584a;

/* loaded from: classes3.dex */
public abstract class TabView extends FrameLayout implements Checkable {
    public TabView(Context context) {
        super(context);
    }

    public abstract /* synthetic */ C6413a getBadge();

    public abstract InterfaceC6584a getBadgeView();

    public abstract /* synthetic */ C6414b getIcon();

    @Deprecated
    public abstract ImageView getIconView();

    public TabView getTabView() {
        return this;
    }

    public abstract /* synthetic */ C6415c getTitle();

    public abstract TextView getTitleView();
}

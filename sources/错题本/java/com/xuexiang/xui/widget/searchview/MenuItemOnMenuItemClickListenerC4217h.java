package com.xuexiang.xui.widget.searchview;

import android.view.MenuItem;

/* renamed from: com.xuexiang.xui.widget.searchview.h */
/* loaded from: classes3.dex */
public final class MenuItemOnMenuItemClickListenerC4217h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialSearchView f4864a;

    public MenuItemOnMenuItemClickListenerC4217h(MaterialSearchView materialSearchView) {
        this.f4864a = materialSearchView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f4864a.m3570e(true);
        return true;
    }
}

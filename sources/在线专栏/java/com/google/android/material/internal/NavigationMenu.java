package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;

/* loaded from: classes.dex */
public class NavigationMenu extends C0125g {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0125g, android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        C0127i c0127i = (C0127i) addInternal(i4, i5, i6, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c0127i);
        c0127i.m499x(navigationSubMenu);
        return navigationSubMenu;
    }
}

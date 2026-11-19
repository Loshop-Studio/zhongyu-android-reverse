package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.SubMenuC0136r;

/* loaded from: classes.dex */
public class NavigationSubMenu extends SubMenuC0136r {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C0127i c0127i) {
        super(context, navigationMenu, c0127i);
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public void onItemsChanged(boolean z3) {
        super.onItemsChanged(z3);
        ((C0125g) getParentMenu()).onItemsChanged(z3);
    }
}

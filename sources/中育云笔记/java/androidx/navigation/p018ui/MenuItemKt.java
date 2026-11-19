package androidx.navigation.p018ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class MenuItemKt {
    public static final boolean onNavDestinationSelected(MenuItem menuItem, NavController navController) {
        AbstractC9979u.m20294g(menuItem, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        return NavigationUI.onNavDestinationSelected(menuItem, navController);
    }
}

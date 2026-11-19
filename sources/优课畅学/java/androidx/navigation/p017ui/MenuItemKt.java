package androidx.navigation.p017ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class MenuItemKt {
    public static final boolean onNavDestinationSelected(MenuItem menuItem, NavController navController) {
        AbstractC9133u.m16133g(menuItem, "<this>");
        AbstractC9133u.m16133g(navController, "navController");
        return NavigationUI.onNavDestinationSelected(menuItem, navController);
    }
}

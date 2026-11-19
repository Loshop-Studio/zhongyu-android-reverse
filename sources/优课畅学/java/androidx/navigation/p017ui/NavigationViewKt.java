package androidx.navigation.p017ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavigationViewKt {
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        AbstractC9133u.m16133g(navigationView, "<this>");
        AbstractC9133u.m16133g(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}

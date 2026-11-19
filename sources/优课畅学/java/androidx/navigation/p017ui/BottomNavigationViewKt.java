package androidx.navigation.p017ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController) {
        AbstractC9133u.m16133g(navigationBarView, "<this>");
        AbstractC9133u.m16133g(navController, "navController");
        NavigationUI.setupWithNavController(navigationBarView, navController);
    }
}

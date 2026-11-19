package androidx.navigation.p018ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class NavigationViewKt {
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        AbstractC9979u.m20294g(navigationView, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}

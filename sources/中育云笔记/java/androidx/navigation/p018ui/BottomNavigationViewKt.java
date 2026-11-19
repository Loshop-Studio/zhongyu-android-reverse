package androidx.navigation.p018ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController) {
        AbstractC9979u.m20294g(navigationBarView, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        NavigationUI.setupWithNavController(navigationBarView, navController);
    }
}

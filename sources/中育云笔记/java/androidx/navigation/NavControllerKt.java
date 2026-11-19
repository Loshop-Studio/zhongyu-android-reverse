package androidx.navigation;

import android.content.Intent;
import androidx.annotation.IdRes;
import java.util.Map;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class NavControllerKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        return NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    @InterfaceC10770a
    public static final NavGraph createGraph(NavController navController, @IdRes int i10, @IdRes int i11, InterfaceC9540l interfaceC9540l) {
        return NavControllerKt__NavController_androidKt.createGraph(navController, i10, i11, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavController navController, Object obj, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, obj, interfaceC10469c, map, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavController navController, String str, String str2, InterfaceC9540l interfaceC9540l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, str, str2, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavController navController, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, interfaceC10469c, interfaceC10469c2, map, interfaceC9540l);
    }
}

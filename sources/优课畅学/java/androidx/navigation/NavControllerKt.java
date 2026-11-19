package androidx.navigation;

import android.content.Intent;
import androidx.annotation.IdRes;
import java.util.Map;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavControllerKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        return NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    @InterfaceC8721a
    public static final NavGraph createGraph(NavController navController, @IdRes int i10, @IdRes int i11, InterfaceC10570l interfaceC10570l) {
        return NavControllerKt__NavController_androidKt.createGraph(navController, i10, i11, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavController navController, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, interfaceC8375c, interfaceC8375c2, map, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavController navController, Object obj, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, obj, interfaceC8375c, map, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavController navController, String str, String str2, InterfaceC10570l interfaceC10570l) {
        return NavControllerKt__NavControllerKt.createGraph(navController, str, str2, interfaceC10570l);
    }
}

package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavHostKt {
    @InterfaceC8721a
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i10, @IdRes int i11, InterfaceC10570l interfaceC10570l) {
        return NavHostKt__NavHost_androidKt.createGraph(navHost, i10, i11, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavHost navHost, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavHostKt__NavHostKt.createGraph(navHost, interfaceC8375c, interfaceC8375c2, map, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavHost navHost, Object obj, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavHostKt__NavHostKt.createGraph(navHost, obj, interfaceC8375c, map, interfaceC10570l);
    }

    public static final NavGraph createGraph(NavHost navHost, String str, String str2, InterfaceC10570l interfaceC10570l) {
        return NavHostKt__NavHostKt.createGraph(navHost, str, str2, interfaceC10570l);
    }
}

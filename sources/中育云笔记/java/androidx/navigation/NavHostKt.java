package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class NavHostKt {
    @InterfaceC10770a
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i10, @IdRes int i11, InterfaceC9540l interfaceC9540l) {
        return NavHostKt__NavHost_androidKt.createGraph(navHost, i10, i11, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavHost navHost, Object obj, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavHostKt__NavHostKt.createGraph(navHost, obj, interfaceC10469c, map, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavHost navHost, String str, String str2, InterfaceC9540l interfaceC9540l) {
        return NavHostKt__NavHostKt.createGraph(navHost, str, str2, interfaceC9540l);
    }

    public static final NavGraph createGraph(NavHost navHost, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavHostKt__NavHostKt.createGraph(navHost, interfaceC10469c, interfaceC10469c2, map, interfaceC9540l);
    }
}

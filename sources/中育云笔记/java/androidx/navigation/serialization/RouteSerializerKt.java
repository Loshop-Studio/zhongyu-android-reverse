package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import ee.AbstractC9125b;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.AbstractC5447q;
import p049ce.C5436f;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(InterfaceC5432b interfaceC5432b, InterfaceC9529a interfaceC9529a) {
        if (interfaceC5432b instanceof C5436f) {
            interfaceC9529a.invoke();
        }
    }

    private static final NavType<Object> computeNavType(InterfaceC9129f interfaceC9129f, Map<InterfaceC10481o, ? extends NavType<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (NavTypeConverterKt.matchKType(interfaceC9129f, (InterfaceC10481o) next)) {
                break;
            }
        }
        InterfaceC10481o interfaceC10481o = (InterfaceC10481o) next;
        NavType<?> navType = interfaceC10481o != null ? map.get(interfaceC10481o) : null;
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(interfaceC9129f);
        }
        if (AbstractC9979u.m20289b(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        AbstractC9979u.m20292e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    private static final <T> void forEachIndexedKType(InterfaceC5432b interfaceC5432b, Map<InterfaceC10481o, ? extends NavType<?>> map, InterfaceC9545q interfaceC9545q) {
        int iMo17958c = interfaceC5432b.getDescriptor().mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            String strMo17959d = interfaceC5432b.getDescriptor().mo17959d(i10);
            NavType<Object> navTypeComputeNavType = computeNavType(interfaceC5432b.getDescriptor().mo17960e(i10), map);
            if (navTypeComputeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(strMo17959d, interfaceC5432b.getDescriptor().mo17960e(i10).mo17961f(), interfaceC5432b.getDescriptor().mo17961f(), map.toString()));
            }
            interfaceC9545q.invoke(Integer.valueOf(i10), strMo17959d, navTypeComputeNavType);
        }
    }

    public static /* synthetic */ void forEachIndexedKType$default(InterfaceC5432b interfaceC5432b, Map map, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9925a.m20088h();
        }
        forEachIndexedKType(interfaceC5432b, map, interfaceC9545q);
    }

    private static final <T> void forEachIndexedName(InterfaceC5432b interfaceC5432b, Map<String, ? extends NavType<Object>> map, InterfaceC9545q interfaceC9545q) {
        int iMo17958c = interfaceC5432b.getDescriptor().mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            String strMo17959d = interfaceC5432b.getDescriptor().mo17959d(i10);
            NavType<Object> navType = map.get(strMo17959d);
            if (navType == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strMo17959d + ']').toString());
            }
            interfaceC9545q.invoke(Integer.valueOf(i10), strMo17959d, navType);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int generateHashCode(InterfaceC5432b interfaceC5432b) {
        AbstractC9979u.m20294g(interfaceC5432b, "<this>");
        int iHashCode = interfaceC5432b.getDescriptor().mo17961f().hashCode();
        int iMo17958c = interfaceC5432b.getDescriptor().mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            iHashCode = (iHashCode * 31) + interfaceC5432b.getDescriptor().mo17959d(i10).hashCode();
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> List<NamedNavArgument> generateNavArguments(final InterfaceC5432b interfaceC5432b, final Map<InterfaceC10481o, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(interfaceC5432b, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC5432b, new InterfaceC9529a() { // from class: androidx.navigation.serialization.d
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return RouteSerializerKt.generateNavArguments$lambda$2(interfaceC5432b);
            }
        });
        int iMo17958c = interfaceC5432b.getDescriptor().mo17958c();
        ArrayList arrayList = new ArrayList(iMo17958c);
        for (final int i10 = 0; i10 < iMo17958c; i10++) {
            final String strMo17959d = interfaceC5432b.getDescriptor().mo17959d(i10);
            arrayList.add(NamedNavArgumentKt.navArgument(strMo17959d, new InterfaceC9540l() { // from class: androidx.navigation.serialization.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return RouteSerializerKt.generateNavArguments$lambda$4$lambda$3(interfaceC5432b, i10, typeMap, strMo17959d, (NavArgumentBuilder) obj);
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(InterfaceC5432b interfaceC5432b, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9925a.m20088h();
        }
        return generateNavArguments(interfaceC5432b, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q generateNavArguments$lambda$2(InterfaceC5432b interfaceC5432b) {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + interfaceC5432b + ". Arguments can only be generated from concrete classes or objects.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q generateNavArguments$lambda$4$lambda$3(InterfaceC5432b interfaceC5432b, int i10, Map map, String str, NavArgumentBuilder navArgument) {
        AbstractC9979u.m20294g(navArgument, "$this$navArgument");
        InterfaceC9129f interfaceC9129fMo17960e = interfaceC5432b.getDescriptor().mo17960e(i10);
        boolean zMo17957b = interfaceC9129fMo17960e.mo17957b();
        NavType<?> navTypeComputeNavType = computeNavType(interfaceC9129fMo17960e, map);
        if (navTypeComputeNavType == null) {
            throw new IllegalArgumentException(unknownNavTypeErrorMessage(str, interfaceC9129fMo17960e.mo17961f(), interfaceC5432b.getDescriptor().mo17961f(), map.toString()));
        }
        navArgument.setType(navTypeComputeNavType);
        navArgument.setNullable(zMo17957b);
        if (interfaceC5432b.getDescriptor().mo17962g(i10)) {
            navArgument.setUnknownDefaultValuePresent$navigation_common_release(true);
        }
        return C10786q.f26013a;
    }

    public static final <T> String generateRoutePattern(final InterfaceC5432b interfaceC5432b, Map<InterfaceC10481o, ? extends NavType<?>> typeMap, String str) {
        AbstractC9979u.m20294g(interfaceC5432b, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC5432b, new InterfaceC9529a() { // from class: androidx.navigation.serialization.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return RouteSerializerKt.generateRoutePattern$lambda$0(interfaceC5432b);
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, interfaceC5432b) : new RouteBuilder(interfaceC5432b);
        forEachIndexedKType(interfaceC5432b, typeMap, new InterfaceC9545q() { // from class: androidx.navigation.serialization.b
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRoutePattern$lambda$1(routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(InterfaceC5432b interfaceC5432b, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9925a.m20088h();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(interfaceC5432b, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q generateRoutePattern$lambda$0(InterfaceC5432b interfaceC5432b) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot generate route pattern from polymorphic class ");
        InterfaceC10469c interfaceC10469cM17955a = AbstractC9125b.m17955a(interfaceC5432b.getDescriptor());
        sb2.append(interfaceC10469cM17955a != null ? interfaceC10469cM17955a.mo20277f() : null);
        sb2.append(". Routes can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q generateRoutePattern$lambda$1(RouteBuilder routeBuilder, int i10, String argName, NavType navType) {
        AbstractC9979u.m20294g(argName, "argName");
        AbstractC9979u.m20294g(navType, "navType");
        routeBuilder.appendPattern(i10, argName, navType);
        return C10786q.f26013a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> String generateRouteWithArgs(T route, Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        InterfaceC5432b interfaceC5432bM2953c = AbstractC5447q.m2953c(AbstractC9983y.m20315b(route.getClass()));
        final Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(interfaceC5432bM2953c, typeMap).encodeToArgMap(route);
        final RouteBuilder routeBuilder = new RouteBuilder(interfaceC5432bM2953c);
        forEachIndexedName(interfaceC5432bM2953c, typeMap, new InterfaceC9545q() { // from class: androidx.navigation.serialization.c
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRouteWithArgs$lambda$5(mapEncodeToArgMap, routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q generateRouteWithArgs$lambda$5(Map map, RouteBuilder routeBuilder, int i10, String argName, NavType navType) {
        AbstractC9979u.m20294g(argName, "argName");
        AbstractC9979u.m20294g(navType, "navType");
        Object obj = map.get(argName);
        AbstractC9979u.m20291d(obj);
        routeBuilder.appendArg(i10, argName, navType, (List) obj);
        return C10786q.f26013a;
    }

    public static final boolean isValueClass(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        return AbstractC9979u.m20289b(interfaceC9129f.getKind(), AbstractC9138o.a.f21332a) && interfaceC9129f.isInline() && interfaceC9129f.mo17958c() == 1;
    }

    private static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}

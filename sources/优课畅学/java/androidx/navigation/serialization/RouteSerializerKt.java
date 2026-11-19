package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.C8736p;
import p246s8.AbstractC10067q;
import p246s8.C10056f;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10206b;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(InterfaceC10052b interfaceC10052b, InterfaceC10559a interfaceC10559a) {
        if (interfaceC10052b instanceof C10056f) {
            interfaceC10559a.invoke();
        }
    }

    private static final NavType<Object> computeNavType(InterfaceC10210f interfaceC10210f, Map<InterfaceC8387o, ? extends NavType<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (NavTypeConverterKt.matchKType(interfaceC10210f, (InterfaceC8387o) next)) {
                break;
            }
        }
        InterfaceC8387o interfaceC8387o = (InterfaceC8387o) next;
        NavType<?> navType = interfaceC8387o != null ? map.get(interfaceC8387o) : null;
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(interfaceC10210f);
        }
        if (AbstractC9133u.m16128b(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        AbstractC9133u.m16131e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    private static final <T> void forEachIndexedKType(InterfaceC10052b interfaceC10052b, Map<InterfaceC8387o, ? extends NavType<?>> map, InterfaceC10575q interfaceC10575q) {
        int iMo19086c = interfaceC10052b.getDescriptor().mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            String strMo19087d = interfaceC10052b.getDescriptor().mo19087d(i10);
            NavType<Object> navTypeComputeNavType = computeNavType(interfaceC10052b.getDescriptor().mo19088e(i10), map);
            if (navTypeComputeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(strMo19087d, interfaceC10052b.getDescriptor().mo19088e(i10).mo19089f(), interfaceC10052b.getDescriptor().mo19089f(), map.toString()));
            }
            interfaceC10575q.invoke(Integer.valueOf(i10), strMo19087d, navTypeComputeNavType);
        }
    }

    public static /* synthetic */ void forEachIndexedKType$default(InterfaceC10052b interfaceC10052b, Map map, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9080a.m15943h();
        }
        forEachIndexedKType(interfaceC10052b, map, interfaceC10575q);
    }

    private static final <T> void forEachIndexedName(InterfaceC10052b interfaceC10052b, Map<String, ? extends NavType<Object>> map, InterfaceC10575q interfaceC10575q) {
        int iMo19086c = interfaceC10052b.getDescriptor().mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            String strMo19087d = interfaceC10052b.getDescriptor().mo19087d(i10);
            NavType<Object> navType = map.get(strMo19087d);
            if (navType == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strMo19087d + ']').toString());
            }
            interfaceC10575q.invoke(Integer.valueOf(i10), strMo19087d, navType);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int generateHashCode(InterfaceC10052b interfaceC10052b) {
        AbstractC9133u.m16133g(interfaceC10052b, "<this>");
        int iHashCode = interfaceC10052b.getDescriptor().mo19089f().hashCode();
        int iMo19086c = interfaceC10052b.getDescriptor().mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            iHashCode = (iHashCode * 31) + interfaceC10052b.getDescriptor().mo19087d(i10).hashCode();
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> List<NamedNavArgument> generateNavArguments(final InterfaceC10052b interfaceC10052b, final Map<InterfaceC8387o, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(interfaceC10052b, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC10052b, new InterfaceC10559a() { // from class: androidx.navigation.serialization.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return RouteSerializerKt.generateNavArguments$lambda$2(interfaceC10052b);
            }
        });
        int iMo19086c = interfaceC10052b.getDescriptor().mo19086c();
        ArrayList arrayList = new ArrayList(iMo19086c);
        for (final int i10 = 0; i10 < iMo19086c; i10++) {
            final String strMo19087d = interfaceC10052b.getDescriptor().mo19087d(i10);
            arrayList.add(NamedNavArgumentKt.navArgument(strMo19087d, new InterfaceC10570l() { // from class: androidx.navigation.serialization.e
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return RouteSerializerKt.generateNavArguments$lambda$4$lambda$3(interfaceC10052b, i10, typeMap, strMo19087d, (NavArgumentBuilder) obj);
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(InterfaceC10052b interfaceC10052b, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9080a.m15943h();
        }
        return generateNavArguments(interfaceC10052b, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p generateNavArguments$lambda$2(InterfaceC10052b interfaceC10052b) {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + interfaceC10052b + ". Arguments can only be generated from concrete classes or objects.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p generateNavArguments$lambda$4$lambda$3(InterfaceC10052b interfaceC10052b, int i10, Map map, String str, NavArgumentBuilder navArgument) {
        AbstractC9133u.m16133g(navArgument, "$this$navArgument");
        InterfaceC10210f interfaceC10210fMo19088e = interfaceC10052b.getDescriptor().mo19088e(i10);
        boolean zMo19085b = interfaceC10210fMo19088e.mo19085b();
        NavType<?> navTypeComputeNavType = computeNavType(interfaceC10210fMo19088e, map);
        if (navTypeComputeNavType == null) {
            throw new IllegalArgumentException(unknownNavTypeErrorMessage(str, interfaceC10210fMo19088e.mo19089f(), interfaceC10052b.getDescriptor().mo19089f(), map.toString()));
        }
        navArgument.setType(navTypeComputeNavType);
        navArgument.setNullable(zMo19085b);
        if (interfaceC10052b.getDescriptor().mo19090g(i10)) {
            navArgument.setUnknownDefaultValuePresent$navigation_common_release(true);
        }
        return C8736p.f16368a;
    }

    public static final <T> String generateRoutePattern(final InterfaceC10052b interfaceC10052b, Map<InterfaceC8387o, ? extends NavType<?>> typeMap, String str) {
        AbstractC9133u.m16133g(interfaceC10052b, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC10052b, new InterfaceC10559a() { // from class: androidx.navigation.serialization.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return RouteSerializerKt.generateRoutePattern$lambda$0(interfaceC10052b);
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, interfaceC10052b) : new RouteBuilder(interfaceC10052b);
        forEachIndexedKType(interfaceC10052b, typeMap, new InterfaceC10575q() { // from class: androidx.navigation.serialization.b
            @Override // p300x7.InterfaceC10575q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRoutePattern$lambda$1(routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(InterfaceC10052b interfaceC10052b, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9080a.m15943h();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(interfaceC10052b, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p generateRoutePattern$lambda$0(InterfaceC10052b interfaceC10052b) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot generate route pattern from polymorphic class ");
        InterfaceC8375c interfaceC8375cM19083a = AbstractC10206b.m19083a(interfaceC10052b.getDescriptor());
        sb.append(interfaceC8375cM19083a != null ? interfaceC8375cM19083a.mo13672g() : null);
        sb.append(". Routes can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p generateRoutePattern$lambda$1(RouteBuilder routeBuilder, int i10, String argName, NavType navType) {
        AbstractC9133u.m16133g(argName, "argName");
        AbstractC9133u.m16133g(navType, "navType");
        routeBuilder.appendPattern(i10, argName, navType);
        return C8736p.f16368a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> String generateRouteWithArgs(T route, Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        InterfaceC10052b interfaceC10052bM18778b = AbstractC10067q.m18778b(AbstractC9137y.m16154b(route.getClass()));
        final Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(interfaceC10052bM18778b, typeMap).encodeToArgMap(route);
        final RouteBuilder routeBuilder = new RouteBuilder(interfaceC10052bM18778b);
        forEachIndexedName(interfaceC10052bM18778b, typeMap, new InterfaceC10575q() { // from class: androidx.navigation.serialization.c
            @Override // p300x7.InterfaceC10575q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRouteWithArgs$lambda$5(mapEncodeToArgMap, routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p generateRouteWithArgs$lambda$5(Map map, RouteBuilder routeBuilder, int i10, String argName, NavType navType) {
        AbstractC9133u.m16133g(argName, "argName");
        AbstractC9133u.m16133g(navType, "navType");
        Object obj = map.get(argName);
        AbstractC9133u.m16130d(obj);
        routeBuilder.appendArg(i10, argName, navType, (List) obj);
        return C8736p.f16368a;
    }

    public static final boolean isValueClass(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        return AbstractC9133u.m16128b(interfaceC10210f.getKind(), AbstractC10219o.a.f20393a) && interfaceC10210f.isInline() && interfaceC10210f.mo19086c() == 1;
    }

    private static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}

package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt {
    public static final <T> NavDeepLink navDeepLink(InterfaceC8375c route, String basePath, InterfaceC10570l deepLinkBuilder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(deepLinkBuilder, "deepLinkBuilder");
        return navDeepLink$default(route, basePath, null, deepLinkBuilder, 4, null);
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(String basePath, Map typeMap, InterfaceC10570l deepLinkBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        if ((i10 & 4) != 0) {
            deepLinkBuilder = new InterfaceC10570l() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink.1
                public final void invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    AbstractC9133u.m16133g(navDeepLinkDslBuilder, "<this>");
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((NavDeepLinkDslBuilder) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return NavDeepLinkDslBuilderKt.navDeepLink(AbstractC9137y.m16154b(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    public static final NavDeepLink navDeepLink(InterfaceC10570l deepLinkBuilder) {
        AbstractC9133u.m16133g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static final /* synthetic */ <T> NavDeepLink navDeepLink(String basePath, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l deepLinkBuilder) {
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return NavDeepLinkDslBuilderKt.navDeepLink(AbstractC9137y.m16154b(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    public static final <T> NavDeepLink navDeepLink(InterfaceC8375c route, String basePath, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l deepLinkBuilder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(basePath, route, typeMap);
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(InterfaceC8375c interfaceC8375c, String str, Map map, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = AbstractC9080a.m15943h();
        }
        return NavDeepLinkDslBuilderKt.navDeepLink(interfaceC8375c, str, map, interfaceC10570l);
    }
}

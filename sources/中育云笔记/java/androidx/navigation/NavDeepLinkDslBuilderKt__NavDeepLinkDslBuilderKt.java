package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.C10786q;

/* loaded from: classes.dex */
final /* synthetic */ class NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt {
    public static final <T> NavDeepLink navDeepLink(InterfaceC10469c route, String basePath, InterfaceC9540l deepLinkBuilder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(deepLinkBuilder, "deepLinkBuilder");
        return navDeepLink$default(route, basePath, null, deepLinkBuilder, 4, null);
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(String basePath, Map typeMap, InterfaceC9540l deepLinkBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        if ((i10 & 4) != 0) {
            deepLinkBuilder = new InterfaceC9540l() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink.1
                public final void invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    AbstractC9979u.m20294g(navDeepLinkDslBuilder, "<this>");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((NavDeepLinkDslBuilder) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return NavDeepLinkDslBuilderKt.navDeepLink(AbstractC9983y.m20315b(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    public static final NavDeepLink navDeepLink(InterfaceC9540l deepLinkBuilder) {
        AbstractC9979u.m20294g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static final /* synthetic */ <T> NavDeepLink navDeepLink(String basePath, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l deepLinkBuilder) {
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return NavDeepLinkDslBuilderKt.navDeepLink(AbstractC9983y.m20315b(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    public static final <T> NavDeepLink navDeepLink(InterfaceC10469c route, String basePath, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l deepLinkBuilder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(basePath, route, typeMap);
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(InterfaceC10469c interfaceC10469c, String str, Map map, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = AbstractC9925a.m20088h();
        }
        return NavDeepLinkDslBuilderKt.navDeepLink(interfaceC10469c, str, map, interfaceC9540l);
    }
}

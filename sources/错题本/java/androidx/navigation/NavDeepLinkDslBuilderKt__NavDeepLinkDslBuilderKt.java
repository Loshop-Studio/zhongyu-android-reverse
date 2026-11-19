package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aa\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u001d\b\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000e¢\u0006\u0002\b\u000f0\f2\u0019\b\n\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0011\u001ag\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u000b\u001a\u00020\n2\u001d\b\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000e¢\u0006\u0002\b\u000f0\f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "deepLinkBuilder", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "(Lr6/c;)Landroidx/navigation/NavDeepLink;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "basePath", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;", "Ly6/c;", "route", "(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavDeepLinkDslBuilderKt")
/* loaded from: classes2.dex */
final /* synthetic */ class NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt {
    @JvmOverloads
    @NotNull
    public static final <T> NavDeepLink navDeepLink(@NotNull InterfaceC6779c route, @NotNull String basePath, @NotNull InterfaceC6471c deepLinkBuilder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(deepLinkBuilder, "deepLinkBuilder");
        return navDeepLink$default(route, basePath, null, deepLinkBuilder, 4, null);
    }

    public static NavDeepLink navDeepLink$default(String basePath, Map typeMap, InterfaceC6471c deepLinkBuilder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        if ((i & 4) != 0) {
            deepLinkBuilder = new InterfaceC6471c() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink.1
                public final void invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    AbstractC5830k.m5330g(navDeepLinkDslBuilder, "<this>");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((NavDeepLinkDslBuilder) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    public static final NavDeepLink navDeepLink(@NotNull InterfaceC6471c deepLinkBuilder) {
        AbstractC5830k.m5330g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    @JvmOverloads
    @NotNull
    public static final <T> NavDeepLink navDeepLink(@NotNull InterfaceC6779c route, @NotNull String basePath, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c deepLinkBuilder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(basePath, route, typeMap);
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static final <T> NavDeepLink navDeepLink(String basePath, Map<InterfaceC6793q, NavType<?>> typeMap, InterfaceC6471c deepLinkBuilder) {
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(deepLinkBuilder, "deepLinkBuilder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(InterfaceC6779c interfaceC6779c, String str, Map map, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 4) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        return NavDeepLinkDslBuilderKt.navDeepLink(interfaceC6779c, str, map, interfaceC6471c);
    }
}

package androidx.navigation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(m13557d1 = {"androidx/navigation/NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt"}, m13559k = 4, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class NavDeepLinkDslBuilderKt {
    public static final NavDeepLink navDeepLink(Function1<? super NavDeepLinkDslBuilder, Unit> function1) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(function1);
    }

    @JvmOverloads
    public static final <T> NavDeepLink navDeepLink(KClass<T> kClass, String str, Map<KType, NavType<?>> map, Function1<? super NavDeepLinkDslBuilder, Unit> function1) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(kClass, str, map, function1);
    }

    @JvmOverloads
    public static final <T> NavDeepLink navDeepLink(KClass<T> kClass, String str, Function1<? super NavDeepLinkDslBuilder, Unit> function1) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(kClass, str, function1);
    }
}

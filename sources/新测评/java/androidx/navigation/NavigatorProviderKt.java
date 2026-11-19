package androidx.navigation;

import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(m13557d1 = {"androidx/navigation/NavigatorProviderKt__NavigatorProviderKt", "androidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt"}, m13559k = 4, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String str) {
        return (T) NavigatorProviderKt__NavigatorProviderKt.get(navigatorProvider, str);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        NavigatorProviderKt__NavigatorProviderKt.plusAssign(navigatorProvider, navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String str, Navigator<? extends NavDestination> navigator) {
        return NavigatorProviderKt__NavigatorProviderKt.set(navigatorProvider, str, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, KClass<T> kClass) {
        return (T) NavigatorProviderKt__NavigatorProvider_androidKt.get(navigatorProvider, kClass);
    }
}

package androidx.navigation;

import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC10469c clazz) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(AbstractC9293a.m18324a(clazz));
    }
}

package androidx.navigation;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC8375c clazz) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(AbstractC10360a.m19298a(clazz));
    }
}

package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilder_androidKt {
    @InterfaceC8721a
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, @IdRes int i10, @IdRes int i11, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i10, int i11, InterfaceC10570l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @InterfaceC8721a
    public static final void navigation(NavGraphBuilder navGraphBuilder, @IdRes int i10, @IdRes int i11, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i10, i11);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }
}

package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavHostKt__NavHost_androidKt {
    @InterfaceC8721a
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i10, @IdRes int i11, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i10, int i11, InterfaceC10570l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}

package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
final /* synthetic */ class NavHostKt__NavHost_androidKt {
    @InterfaceC10770a
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i10, @IdRes int i11, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i10, int i11, InterfaceC9540l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}

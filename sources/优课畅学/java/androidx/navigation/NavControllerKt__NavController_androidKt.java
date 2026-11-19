package androidx.navigation;

import android.content.Intent;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavControllerKt__NavController_androidKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        AbstractC9133u.m16133g(intent, "intent");
        return new NavDeepLinkRequest(intent.getData(), intent.getAction(), intent.getType());
    }

    @InterfaceC8721a
    public static final NavGraph createGraph(NavController navController, @IdRes int i10, @IdRes int i11, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navController, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, int i10, int i11, InterfaceC10570l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        AbstractC9133u.m16133g(navController, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}

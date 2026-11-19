package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* renamed from: androidx.navigation.ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt */
/* loaded from: classes3.dex */
final /* synthetic */ class C4169x70fa4890 {
    @InterfaceC8721a
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i10, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i10);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void activity$default(NavGraphBuilder navGraphBuilder, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, AbstractC9137y.m16154b(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String route, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void activity(NavGraphBuilder navGraphBuilder, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, AbstractC9137y.m16154b(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}

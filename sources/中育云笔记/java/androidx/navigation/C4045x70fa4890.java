package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

/* renamed from: androidx.navigation.ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt */
/* loaded from: classes.dex */
final /* synthetic */ class C4045x70fa4890 {
    @InterfaceC10770a
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i10, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i10);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void activity$default(NavGraphBuilder navGraphBuilder, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, AbstractC9983y.m20315b(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String route, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void activity(NavGraphBuilder navGraphBuilder, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, AbstractC9983y.m20315b(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}

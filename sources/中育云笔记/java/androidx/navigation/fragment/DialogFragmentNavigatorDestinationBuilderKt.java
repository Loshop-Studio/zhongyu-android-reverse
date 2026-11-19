package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    @InterfaceC10770a
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i10, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i10, AbstractC9983y.m20315b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(Object.class);
        AbstractC9979u.m20300m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC10469cM20315b, typeMap, AbstractC9983y.m20315b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, AbstractC9983y.m20315b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(Object.class);
        AbstractC9979u.m20300m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC10469cM20315b, typeMap, AbstractC9983y.m20315b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends DialogFragment, T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(Object.class);
        AbstractC9979u.m20300m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC10469cM20315b, typeMap, AbstractC9983y.m20315b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    @InterfaceC10770a
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i10) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i10, AbstractC9983y.m20315b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(route, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, AbstractC9983y.m20315b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment, T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC10481o, NavType<?>> typeMap) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(Object.class);
        AbstractC9979u.m20300m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC10469cM20315b, typeMap, AbstractC9983y.m20315b(DialogFragment.class)));
    }
}

package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    @InterfaceC8721a
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i10, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i10, AbstractC9137y.m16154b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(Object.class);
        AbstractC9133u.m16139m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC8375cM16154b, typeMap, AbstractC9137y.m16154b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, AbstractC9137y.m16154b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(Object.class);
        AbstractC9133u.m16139m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC8375cM16154b, typeMap, AbstractC9137y.m16154b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends DialogFragment, T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(Object.class);
        AbstractC9133u.m16139m(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC8375cM16154b, typeMap, AbstractC9137y.m16154b(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    @InterfaceC8721a
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i10) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i10, AbstractC9137y.m16154b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(route, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, AbstractC9137y.m16154b(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment, T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC8387o, NavType<?>> typeMap) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(Object.class);
        AbstractC9133u.m16139m(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, interfaceC8375cM16154b, typeMap, AbstractC9137y.m16154b(DialogFragment.class)));
    }
}

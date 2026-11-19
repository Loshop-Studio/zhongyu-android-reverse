package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(m13557d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0087\b\u001a?\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u001a!\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0086\b\u001a=\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001aD\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000e*\u00020\u00042\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010H\u0086\b\u001a`\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000e*\u00020\u00042\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u00102\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m13558d2 = {"fragment", "", "F", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", ExifInterface.GPS_DIRECTION_TRUE, "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-fragment_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,186:1\n57#1,2:187\n59#1,2:190\n80#1,2:193\n82#1,2:196\n108#1,3:199\n112#1,5:203\n108#1,9:208\n115#2:189\n115#2:192\n115#2:195\n115#2:198\n115#2:202\n115#2:217\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n40#1:187,2\n40#1:190,2\n68#1:193,2\n68#1:196,2\n94#1:199,3\n94#1:203,5\n94#1:208,9\n40#1:189\n58#1:192\n68#1:195\n81#1:198\n94#1:202\n110#1:217\n*E\n"})
/* loaded from: classes3.dex */
public final class FragmentNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i10, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, i10, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder navGraphBuilder, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, route, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder navGraphBuilder, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment, T> void fragment(NavGraphBuilder navGraphBuilder, Map<KType, NavType<?>> typeMap, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, i10, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, route, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment, T> void fragment(NavGraphBuilder navGraphBuilder, Map<KType, NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }
}

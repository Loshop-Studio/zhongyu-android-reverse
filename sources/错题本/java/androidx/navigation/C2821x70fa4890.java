package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a[\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\r*\u00020\u00002\u001d\b\u0002\u0010\u0013\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0011¢\u0006\u0002\b\u00120\u000f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m5110d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "activity", "(Landroidx/navigation/NavGraphBuilder;ILr6/c;)V", "", "route", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lr6/c;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lr6/c;)V", "navigation-runtime_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/ActivityNavigatorDestinationBuilderKt")
@SourceDebugExtension({"SMAP\nActivityNavigatorDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.android.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,127:1\n115#2:128\n115#2:129\n115#2:130\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.android.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt\n*L\n41#1:128\n50#1:129\n67#1:130\n*E\n"})
/* renamed from: androidx.navigation.ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt */
/* loaded from: classes2.dex */
final /* synthetic */ class C2821x70fa4890 {
    @Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder, @IdRes int i, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static void activity$default(NavGraphBuilder navGraphBuilder, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 1) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final <T> void activity(NavGraphBuilder navGraphBuilder, Map<InterfaceC6793q, NavType<?>> typeMap, InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }
}

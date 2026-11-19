package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ak\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0012\u001ag\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m5110d2 = {"Landroidx/navigation/NavController;", "", "startDestination", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/navigation/NavGraph;", "createGraph", "(Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavController;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;", "", "(Landroidx/navigation/NavController;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;", "navigation-runtime_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavControllerKt")
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt\n*L\n1#1,693:1\n40#2:694\n58#2:695\n76#2:696\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n*L\n658#1:694\n675#1:695\n692#1:696\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class NavControllerKt__NavControllerKt {
    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull String startDestination, @Nullable String str, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, String startDestination, String str, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull InterfaceC6779c startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, interfaceC6779c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, InterfaceC6779c startDestination, InterfaceC6779c interfaceC6779c, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6779c = null;
        }
        if ((i & 4) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull Object startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, interfaceC6779c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, Object startDestination, InterfaceC6779c interfaceC6779c, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6779c = null;
        }
        if ((i & 4) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navController, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}

package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m5110d2 = {"Landroidx/navigation/NavHost;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/navigation/NavGraph;", "createGraph", "(Landroidx/navigation/NavHost;IILr6/c;)Landroidx/navigation/NavGraph;", "navigation-runtime_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavHostKt")
@SourceDebugExtension({"SMAP\nNavHost.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.android.kt\nandroidx/navigation/NavHostKt__NavHost_androidKt\n+ 2 NavController.android.kt\nandroidx/navigation/NavControllerKt__NavController_androidKt\n+ 3 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt\n*L\n1#1,38:1\n1202#2:39\n48#3:40\n*S KotlinDebug\n*F\n+ 1 NavHost.android.kt\nandroidx/navigation/NavHostKt__NavHost_androidKt\n*L\n37#1:39\n37#1:40\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class NavHostKt__NavHost_androidKt {
    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @IdRes int i, @IdRes int i8, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navHost, "<this>");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i, i8);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i, int i8, InterfaceC6471c builder, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        AbstractC5830k.m5330g(navHost, "<this>");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i, i8);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}

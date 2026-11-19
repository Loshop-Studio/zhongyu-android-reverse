package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Navigator.Name("navigation")
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m5110d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "Landroidx/navigation/NavGraph;", "ComposeNavGraph", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005RB\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RB\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011RB\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011RB\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011RB\u0010\u001d\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006 "}, m5110d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Lr6/c;", "getEnterTransition$navigation_compose_release", "()Lr6/c;", "setEnterTransition$navigation_compose_release", "(Lr6/c;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ComposeNavGraph extends NavGraph {
        public static final int $stable = 8;

        @Nullable
        private InterfaceC6471c enterTransition;

        @Nullable
        private InterfaceC6471c exitTransition;

        @Nullable
        private InterfaceC6471c popEnterTransition;

        @Nullable
        private InterfaceC6471c popExitTransition;

        @Nullable
        private InterfaceC6471c sizeTransform;

        public ComposeNavGraph(@NotNull Navigator<? extends NavGraph> navigator) {
            super(navigator);
        }

        @Nullable
        /* renamed from: getEnterTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getEnterTransition() {
            return this.enterTransition;
        }

        @Nullable
        /* renamed from: getExitTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getExitTransition() {
            return this.exitTransition;
        }

        @Nullable
        /* renamed from: getPopEnterTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getPopEnterTransition() {
            return this.popEnterTransition;
        }

        @Nullable
        /* renamed from: getPopExitTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getPopExitTransition() {
            return this.popExitTransition;
        }

        @Nullable
        /* renamed from: getSizeTransform$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getSizeTransform() {
            return this.sizeTransform;
        }

        public final void setEnterTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.enterTransition = interfaceC6471c;
        }

        public final void setExitTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.exitTransition = interfaceC6471c;
        }

        public final void setPopEnterTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.popEnterTransition = interfaceC6471c;
        }

        public final void setPopExitTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.popExitTransition = interfaceC6471c;
        }

        public final void setSizeTransform$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.sizeTransform = interfaceC6471c;
        }
    }

    public ComposeNavGraphNavigator(@NotNull NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    @NotNull
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}

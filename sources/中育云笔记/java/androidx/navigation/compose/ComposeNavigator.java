package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p379vd.InterfaceC11612u;

@StabilityInferred(parameters = 0)
@Navigator.Name(ComposeNavigator.NAME)
/* loaded from: classes.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final String NAME = "composable";
    private final MutableState<Boolean> isPop;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public ComposeNavigator() {
        super(NAME);
        this.isPop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final InterfaceC11612u getBackStack() {
        return getState().getBackStack();
    }

    public final InterfaceC11612u getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    public final MutableState<Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z10) {
        getState().popWithTransition(navBackStackEntry, z10);
        this.isPop.setValue(Boolean.TRUE);
    }

    public final void prepareForTransition(NavBackStackEntry navBackStackEntry) {
        getState().prepareForTransition(navBackStackEntry);
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;
        private final InterfaceC9546r content;
        private InterfaceC9540l enterTransition;
        private InterfaceC9540l exitTransition;
        private InterfaceC9540l popEnterTransition;
        private InterfaceC9540l popExitTransition;
        private InterfaceC9540l sizeTransform;

        public Destination(ComposeNavigator composeNavigator, InterfaceC9546r interfaceC9546r) {
            super(composeNavigator);
            this.content = interfaceC9546r;
        }

        public final InterfaceC9546r getContent$navigation_compose_release() {
            return this.content;
        }

        public final InterfaceC9540l getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        public final InterfaceC9540l getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        public final InterfaceC9540l getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        public final InterfaceC9540l getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final InterfaceC9540l getSizeTransform$navigation_compose_release() {
            return this.sizeTransform;
        }

        public final void setEnterTransition$navigation_compose_release(InterfaceC9540l interfaceC9540l) {
            this.enterTransition = interfaceC9540l;
        }

        public final void setExitTransition$navigation_compose_release(InterfaceC9540l interfaceC9540l) {
            this.exitTransition = interfaceC9540l;
        }

        public final void setPopEnterTransition$navigation_compose_release(InterfaceC9540l interfaceC9540l) {
            this.popEnterTransition = interfaceC9540l;
        }

        public final void setPopExitTransition$navigation_compose_release(InterfaceC9540l interfaceC9540l) {
            this.popExitTransition = interfaceC9540l;
        }

        public final void setSizeTransform$navigation_compose_release(InterfaceC9540l interfaceC9540l) {
            this.sizeTransform = interfaceC9540l;
        }

        @InterfaceC10770a
        public /* synthetic */ Destination(ComposeNavigator composeNavigator, final InterfaceC9545q interfaceC9545q) {
            this(composeNavigator, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new InterfaceC9546r() { // from class: androidx.navigation.compose.ComposeNavigator.Destination.1
                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                    return C10786q.f26013a;
                }

                @Composable
                public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1587956030, i10, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:109)");
                    }
                    interfaceC9545q.invoke(navBackStackEntry, composer, Integer.valueOf((i10 >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.getLambda$127448943$navigation_compose_release());
    }
}

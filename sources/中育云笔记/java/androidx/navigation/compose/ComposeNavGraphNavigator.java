package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
@Navigator.Name("navigation")
/* loaded from: classes.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    public static final class ComposeNavGraph extends NavGraph {
        public static final int $stable = 8;
        private InterfaceC9540l enterTransition;
        private InterfaceC9540l exitTransition;
        private InterfaceC9540l popEnterTransition;
        private InterfaceC9540l popExitTransition;
        private InterfaceC9540l sizeTransform;

        public ComposeNavGraph(Navigator<? extends NavGraph> navigator) {
            super(navigator);
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
    }

    public ComposeNavGraphNavigator(NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}

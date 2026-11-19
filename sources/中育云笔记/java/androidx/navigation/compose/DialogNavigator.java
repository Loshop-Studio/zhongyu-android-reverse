package androidx.navigation.compose;

import androidx.compose.p014ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9545q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p379vd.InterfaceC11612u;

@StabilityInferred(parameters = 0)
@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final String NAME = "dialog";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public DialogNavigator() {
        super(NAME);
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    public final InterfaceC11612u getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final InterfaceC11612u getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z10) {
        getState().popWithTransition(navBackStackEntry, z10);
        int iM23948q0 = AbstractC10947g0.m23948q0((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        int i10 = 0;
        for (Object obj : (Iterable) getState().getTransitionsInProgress().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i10 > iM23948q0) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry2);
            }
            i10 = i11;
        }
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 8;
        private final InterfaceC9545q content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q, int i10, AbstractC9972n abstractC9972n) {
            this(dialogNavigator, (i10 & 2) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC9972n) null) : dialogProperties, interfaceC9545q);
        }

        public final InterfaceC9545q getContent$navigation_compose_release() {
            return this.content;
        }

        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = interfaceC9545q;
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m33800getLambda$1092249270$navigation_compose_release(), 2, null);
    }
}

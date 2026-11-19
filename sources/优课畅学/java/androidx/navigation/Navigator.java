package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p101f8.AbstractC8479q;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public abstract class Navigator<D extends NavDestination> {
    private final String _name;
    private NavigatorState _state;
    private boolean isAttached;

    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    public Navigator() {
        this._name = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NavBackStackEntry navigate$lambda$1(Navigator navigator, NavOptions navOptions, Extras extras, NavBackStackEntry backStackEntry) {
        NavDestination navDestinationNavigate;
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null || (navDestinationNavigate = navigator.navigate(destination, backStackEntry.getArguments(), navOptions, extras)) == null) {
            return null;
        }
        return AbstractC9133u.m16128b(navDestinationNavigate, destination) ? backStackEntry : navigator.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(backStackEntry.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p onLaunchSingleTop$lambda$3(NavOptionsBuilder navOptions) {
        AbstractC9133u.m16133g(navOptions, "$this$navOptions");
        navOptions.setLaunchSingleTop(true);
        return C8736p.f16368a;
    }

    public abstract D createDestination();

    public final String getName$navigation_common_release() {
        String str = this._name;
        if (str != null) {
            return str;
        }
        String strMo13672g = AbstractC9137y.m16154b(getClass()).mo13672g();
        AbstractC9133u.m16130d(strMo13672g);
        return AbstractC8661c0.m14011z0(strMo13672g, "Navigator");
    }

    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public NavDestination navigate(D destination, Bundle bundle, NavOptions navOptions, Extras extras) {
        AbstractC9133u.m16133g(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(NavigatorState state) {
        AbstractC9133u.m16133g(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new InterfaceC10570l() { // from class: androidx.navigation.i0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj);
            }
        }), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(Bundle savedState) {
        AbstractC9133u.m16133g(savedState, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(List<NavBackStackEntry> entries, final NavOptions navOptions, final Extras extras) {
        AbstractC9133u.m16133g(entries, "entries");
        Iterator it = AbstractC8479q.m13851t(AbstractC8479q.m13839B(AbstractC8778f0.m14554c0(entries), new InterfaceC10570l() { // from class: androidx.navigation.j0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Navigator.navigate$lambda$1(this.f1796a, navOptions, extras, (NavBackStackEntry) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void popBackStack(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9133u.m16133g(popUpTo, "popUpTo");
        List list = (List) getState().getBackStack().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry = null;
        while (popBackStack()) {
            navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC9133u.m16128b(navBackStackEntry, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntry != null) {
            getState().pop(navBackStackEntry, z10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Navigator(String name) {
        AbstractC9133u.m16133g(name, "name");
        this._name = name;
    }
}

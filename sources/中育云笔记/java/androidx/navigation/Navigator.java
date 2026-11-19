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
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
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
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null || (navDestinationNavigate = navigator.navigate(destination, backStackEntry.getArguments(), navOptions, extras)) == null) {
            return null;
        }
        return AbstractC9979u.m20289b(navDestinationNavigate, destination) ? backStackEntry : navigator.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(backStackEntry.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q onLaunchSingleTop$lambda$3(NavOptionsBuilder navOptions) {
        AbstractC9979u.m20294g(navOptions, "$this$navOptions");
        navOptions.setLaunchSingleTop(true);
        return C10786q.f26013a;
    }

    public abstract D createDestination();

    public final String getName$navigation_common_release() {
        String str = this._name;
        if (str != null) {
            return str;
        }
        String strMo20277f = AbstractC9983y.m20315b(getClass()).mo20277f();
        AbstractC9979u.m20291d(strMo20277f);
        return AbstractC10793c0.m23150z0(strMo20277f, "Navigator");
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
        AbstractC9979u.m20294g(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(NavigatorState state) {
        AbstractC9979u.m20294g(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new InterfaceC9540l() { // from class: androidx.navigation.i0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj);
            }
        }), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(Bundle savedState) {
        AbstractC9979u.m20294g(savedState, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(List<NavBackStackEntry> entries, final NavOptions navOptions, final Extras extras) {
        AbstractC9979u.m20294g(entries, "entries");
        Iterator it = AbstractC10669q.m22582t(AbstractC10669q.m22570B(AbstractC10947g0.m23930d0(entries), new InterfaceC9540l() { // from class: androidx.navigation.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Navigator.navigate$lambda$1(this.f1856c, navOptions, extras, (NavBackStackEntry) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void popBackStack(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        List list = (List) getState().getBackStack().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry = null;
        while (popBackStack()) {
            navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC9979u.m20289b(navBackStackEntry, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntry != null) {
            getState().pop(navBackStackEntry, z10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Navigator(String name) {
        AbstractC9979u.m20294g(name, "name");
        this._name = name;
    }
}

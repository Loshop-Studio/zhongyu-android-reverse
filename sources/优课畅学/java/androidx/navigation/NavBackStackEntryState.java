package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.internal.NavBackStackEntryStateImpl;
import androidx.navigation.internal.NavContext;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavBackStackEntryState {
    private final NavBackStackEntryStateImpl impl;

    public NavBackStackEntryState(NavBackStackEntry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        this.impl = new NavBackStackEntryStateImpl(entry, entry.getDestination().getId());
    }

    public final Bundle getArgs() {
        return this.impl.getArgs$navigation_runtime_release();
    }

    public final int getDestinationId() {
        return this.impl.getDestinationId$navigation_runtime_release();
    }

    public final String getId() {
        return this.impl.getId$navigation_runtime_release();
    }

    public final Bundle getSavedState() {
        return this.impl.getSavedState$navigation_runtime_release();
    }

    public final NavBackStackEntry instantiate(NavContext context, NavDestination destination, Lifecycle.State hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(destination, "destination");
        AbstractC9133u.m16133g(hostLifecycleState, "hostLifecycleState");
        Bundle args = getArgs();
        return this.impl.instantiate(context, destination, args != null ? prepareArgs(args, context) : null, hostLifecycleState, navControllerViewModel);
    }

    public final Bundle prepareArgs(Bundle args, NavContext context) {
        AbstractC9133u.m16133g(args, "args");
        AbstractC9133u.m16133g(context, "context");
        Context context2 = context.getContext();
        args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        return args;
    }

    public final Bundle writeToState() {
        return this.impl.writeToState$navigation_runtime_release();
    }

    public NavBackStackEntryState(Bundle state) {
        AbstractC9133u.m16133g(state, "state");
        state.setClassLoader(NavBackStackEntryState.class.getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(state);
    }
}

package androidx.navigation;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavContext;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion Companion = new Companion(null);
    private final NavContext context;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;

    /* renamed from: id */
    private final String f1633id;
    private final Bundle immutableArgs;
    private final NavBackStackEntryImpl impl;
    private final Bundle savedState;
    private final InterfaceC10773d savedStateHandle$delegate;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i10 & 16) != 0) {
                navViewModelStoreProvider = null;
            }
            if ((i10 & 32) != 0) {
                str = companion.randomUUID$navigation_common_release();
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return companion.create(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavBackStackEntry create(NavContext navContext, NavDestination destination, Bundle bundle, Lifecycle.State hostLifecycleState, NavViewModelStoreProvider navViewModelStoreProvider, String id2, Bundle bundle2) {
            AbstractC9979u.m20294g(destination, "destination");
            AbstractC9979u.m20294g(hostLifecycleState, "hostLifecycleState");
            AbstractC9979u.m20294g(id2, "id");
            return new NavBackStackEntry(navContext, destination, bundle, hostLifecycleState, navViewModelStoreProvider, id2, bundle2, null);
        }

        public final String randomUUID$navigation_common_release() {
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, AbstractC9972n abstractC9972n) {
        this(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateHandle savedStateHandle_delegate$lambda$0(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.impl.getSavedStateHandle$navigation_common_release();
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (AbstractC9979u.m20289b(this.f1633id, navBackStackEntry.f1633id) && AbstractC9979u.m20289b(this.destination, navBackStackEntry.destination) && AbstractC9979u.m20289b(getLifecycle(), navBackStackEntry.getLifecycle()) && AbstractC9979u.m20289b(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                if (AbstractC9979u.m20289b(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                    return true;
                }
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj2 = this.immutableArgs.get(str);
                        Bundle bundle2 = navBackStackEntry.immutableArgs;
                        if (!AbstractC9979u.m20289b(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle getArguments() {
        return this.impl.getArguments$navigation_common_release();
    }

    public final NavContext getContext$navigation_common_release() {
        return this.context;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras defaultViewModelCreationExtras$navigation_common_release = this.impl.getDefaultViewModelCreationExtras$navigation_common_release();
        NavContext navContext = this.context;
        Object application = navContext != null ? navContext.getApplication() : null;
        Application application2 = application instanceof Application ? (Application) application : null;
        if (application2 != null) {
            defaultViewModelCreationExtras$navigation_common_release.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application2);
        }
        return defaultViewModelCreationExtras$navigation_common_release;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.impl.getDefaultViewModelProviderFactory$navigation_common_release();
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_common_release() {
        return this.hostLifecycleState;
    }

    public final String getId() {
        return this.f1633id;
    }

    public final Bundle getImmutableArgs$navigation_common_release() {
        return this.immutableArgs;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.impl.getLifecycle$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Lifecycle.State getMaxLifecycle() {
        return this.impl.getMaxLifecycle$navigation_common_release();
    }

    public final Bundle getSavedState$navigation_common_release() {
        return this.savedState;
    }

    @MainThread
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.impl.getSavedStateRegistry$navigation_common_release();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.impl.getViewModelStore$navigation_common_release();
    }

    public final NavViewModelStoreProvider getViewModelStoreProvider$navigation_common_release() {
        return this.viewModelStoreProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(Lifecycle.Event event) {
        AbstractC9979u.m20294g(event, "event");
        this.impl.handleLifecycleEvent$navigation_common_release(event);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f1633id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(Bundle outBundle) {
        AbstractC9979u.m20294g(outBundle, "outBundle");
        this.impl.saveState$navigation_common_release(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(NavDestination navDestination) {
        AbstractC9979u.m20294g(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final void setHostLifecycleState$navigation_common_release(Lifecycle.State state) {
        AbstractC9979u.m20294g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(Lifecycle.State value) {
        AbstractC9979u.m20294g(value, "value");
        this.impl.setMaxLifecycle$navigation_common_release(value);
    }

    public String toString() {
        return this.impl.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateState() {
        this.impl.updateState$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = navContext;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.f1633id = str;
        this.savedState = bundle2;
        this.impl = new NavBackStackEntryImpl(this);
        this.savedStateHandle$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.b
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavBackStackEntry.savedStateHandle_delegate$lambda$0(this.f1636c);
            }
        });
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i10, AbstractC9972n abstractC9972n) {
        this(navContext, navDestination, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? Lifecycle.State.CREATED : state, (i10 & 16) != 0 ? null : navViewModelStoreProvider, (i10 & 32) != 0 ? Companion.randomUUID$navigation_common_release() : str, (i10 & 64) != 0 ? null : bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(NavBackStackEntry entry, Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.f1633id, entry.savedState);
        AbstractC9979u.m20294g(entry, "entry");
        this.impl.setHostLifecycleState$navigation_common_release(entry.hostLifecycleState);
        this.impl.setMaxLifecycle$navigation_common_release(entry.getMaxLifecycle());
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i10, AbstractC9972n abstractC9972n) {
        this(navBackStackEntry, (i10 & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }
}

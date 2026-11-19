package androidx.navigation.internal;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavViewModelStoreProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC9078a;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavBackStackEntryImpl {
    private final NavContext context;
    private final InterfaceC8724d defaultFactory$delegate;
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;
    private NavDestination destination;
    private final NavBackStackEntry entry;
    private Lifecycle.State hostLifecycleState;

    /* renamed from: id */
    private final String f1765id;
    private final Bundle immutableArgs;
    private final LifecycleRegistry lifecycle;
    private Lifecycle.State maxLifecycle;
    private final InterfaceC8724d navResultSavedStateFactory$delegate;
    private final Bundle savedState;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle handle) {
            AbstractC9133u.m16133g(handle, "handle");
            this.handle = handle;
        }

        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    public NavBackStackEntryImpl(NavBackStackEntry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        this.entry = entry;
        this.context = entry.getContext$navigation_common_release();
        this.destination = entry.getDestination();
        this.immutableArgs = entry.getImmutableArgs$navigation_common_release();
        this.hostLifecycleState = entry.getHostLifecycleState$navigation_common_release();
        this.viewModelStoreProvider = entry.getViewModelStoreProvider$navigation_common_release();
        this.f1765id = entry.getId();
        this.savedState = entry.getSavedState$navigation_common_release();
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(entry);
        this.defaultFactory$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.internal.b
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavBackStackEntryImpl.defaultFactory_delegate$lambda$0();
            }
        });
        this.lifecycle = new LifecycleRegistry(entry);
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory$navigation_common_release();
        this.navResultSavedStateFactory$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.internal.c
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModelFactory defaultFactory_delegate$lambda$0() {
        return new SavedStateViewModelFactory();
    }

    private final ViewModelProvider.Factory getNavResultSavedStateFactory() {
        return (ViewModelProvider.Factory) this.navResultSavedStateFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory navResultSavedStateFactory_delegate$lambda$10() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9137y.m16154b(SavedStateViewModel.class), new InterfaceC10570l() { // from class: androidx.navigation.internal.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModel navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8(CreationExtras initializer) {
        AbstractC9133u.m16133g(initializer, "$this$initializer");
        return new SavedStateViewModel(SavedStateHandleSupport.createSavedStateHandle(initializer));
    }

    public final Bundle getArguments$navigation_common_release() {
        Pair[] pairArr;
        if (this.immutableArgs == null) {
            return null;
        }
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf), this.immutableArgs);
        return bundleBundleOf;
    }

    public final NavContext getContext$navigation_common_release() {
        return this.context;
    }

    public final SavedStateViewModelFactory getDefaultFactory$navigation_common_release() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    public final MutableCreationExtras getDefaultViewModelCreationExtras$navigation_common_release() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.entry);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this.entry);
        Bundle arguments$navigation_common_release = getArguments$navigation_common_release();
        if (arguments$navigation_common_release != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments$navigation_common_release);
        }
        return mutableCreationExtras;
    }

    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory$navigation_common_release() {
        return this.defaultViewModelProviderFactory;
    }

    public final NavDestination getDestination$navigation_common_release() {
        return this.destination;
    }

    public final NavBackStackEntry getEntry() {
        return this.entry;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_common_release() {
        return this.hostLifecycleState;
    }

    public final String getId$navigation_common_release() {
        return this.f1765id;
    }

    public final Bundle getImmutableArgs$navigation_common_release() {
        return this.immutableArgs;
    }

    public final LifecycleRegistry getLifecycle$navigation_common_release() {
        return this.lifecycle;
    }

    public final Lifecycle.State getMaxLifecycle$navigation_common_release() {
        return this.maxLifecycle;
    }

    public final Bundle getSavedState$navigation_common_release() {
        return this.savedState;
    }

    public final SavedStateHandle getSavedStateHandle$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            return ((SavedStateViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, this.entry, getNavResultSavedStateFactory(), (CreationExtras) null, 4, (Object) null).get(AbstractC9137y.m16154b(SavedStateViewModel.class))).getHandle();
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
    }

    public final SavedStateRegistry getSavedStateRegistry$navigation_common_release() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final boolean getSavedStateRegistryAttached$navigation_common_release() {
        return this.savedStateRegistryAttached;
    }

    public final SavedStateRegistryController getSavedStateRegistryController$navigation_common_release() {
        return this.savedStateRegistryController;
    }

    public final ViewModelStore getViewModelStore$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.getViewModelStore(this.f1765id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final NavViewModelStoreProvider getViewModelStoreProvider$navigation_common_release() {
        return this.viewModelStoreProvider;
    }

    public final void handleLifecycleEvent$navigation_common_release(Lifecycle.Event event) {
        AbstractC9133u.m16133g(event, "event");
        this.entry.setHostLifecycleState$navigation_common_release(event.getTargetState());
        this.hostLifecycleState = event.getTargetState();
        updateState$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState$navigation_common_release(Bundle outBundle) {
        AbstractC9133u.m16133g(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    public final void setDestination$navigation_common_release(NavDestination navDestination) {
        AbstractC9133u.m16133g(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final void setHostLifecycleState$navigation_common_release(Lifecycle.State state) {
        AbstractC9133u.m16133g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    public final void setMaxLifecycle$navigation_common_release(Lifecycle.State maxState) {
        AbstractC9133u.m16133g(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState$navigation_common_release();
    }

    public final void setSavedStateRegistryAttached$navigation_common_release(boolean z10) {
        this.savedStateRegistryAttached = z10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9137y.m16154b(this.entry.getClass()).mo13672g());
        sb.append('(' + this.f1765id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final void updateState$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this.entry);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this.lifecycle.setCurrentState(this.maxLifecycle);
        }
    }
}

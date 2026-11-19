package androidx.navigation.internal;

import android.os.Bundle;
import android.view.C2766k;
import android.view.Lifecycle;
import android.view.LifecycleRegistry;
import android.view.SavedStateHandle;
import android.view.SavedStateHandleSupport;
import android.view.SavedStateRegistry;
import android.view.SavedStateRegistryController;
import android.view.SavedStateViewModelFactory;
import android.view.SavedStateWriter;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.InitializerViewModelFactoryBuilder;
import android.view.viewmodel.MutableCreationExtras;
import androidx.annotation.RestrictTo;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.navigation.C2826a;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavViewModelStoreProvider;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001qB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0014\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00103\u001a\u0004\u0018\u0001028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0017R\"\u0010:\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010*R\u001a\u0010=\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020H8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR*\u0010T\u001a\u00020+2\u0006\u0010S\u001a\u00020+8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010-\u001a\u0004\bU\u0010/\"\u0004\bV\u00101R\u001a\u0010X\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010^\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010[R\u001c\u0010`\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010*R\u0014\u0010d\u001a\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, m5110d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl;", "", "Landroidx/navigation/NavBackStackEntry;", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "handleLifecycleEvent$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$Event;)V", "handleLifecycleEvent", "updateState$navigation_common_release", "()V", "updateState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "outBundle", "saveState$navigation_common_release", "(Landroid/os/Bundle;)V", "saveState", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation/NavBackStackEntry;", "getEntry", "()Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/internal/NavContext;", "getContext$navigation_common_release", "()Landroidx/navigation/internal/NavContext;", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/navigation/NavDestination;", "getDestination$navigation_common_release", "()Landroidx/navigation/NavDestination;", "setDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "immutableArgs", "Landroid/os/Bundle;", "getImmutableArgs$navigation_common_release", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_common_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "getViewModelStoreProvider$navigation_common_release", "()Landroidx/navigation/NavViewModelStoreProvider;", "id", "Ljava/lang/String;", "getId$navigation_common_release", "savedState", "getSavedState$navigation_common_release", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistryController;", "", "savedStateRegistryAttached", "Z", "getSavedStateRegistryAttached$navigation_common_release", "()Z", "setSavedStateRegistryAttached$navigation_common_release", "(Z)V", "Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Ld6/e;", "getDefaultFactory$navigation_common_release", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/LifecycleRegistry;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle$navigation_common_release", "()Landroidx/lifecycle/LifecycleRegistry;", "maxState", "maxLifecycle", "getMaxLifecycle$navigation_common_release", "setMaxLifecycle$navigation_common_release", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory$navigation_common_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "navResultSavedStateFactory$delegate", "getNavResultSavedStateFactory", "navResultSavedStateFactory", "getArguments$navigation_common_release", "arguments", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle$navigation_common_release", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore$navigation_common_release", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "getDefaultViewModelCreationExtras$navigation_common_release", "()Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "SavedStateViewModel", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryImpl.kt\nandroidx/navigation/internal/NavBackStackEntryImpl\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,166:1\n27#2:167\n46#2:168\n32#2,4:169\n31#2,7:179\n126#3:173\n153#3,3:174\n37#4,2:177\n1#5:186\n1#5:188\n106#6:187\n32#7:189\n69#7,2:190\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryImpl.kt\nandroidx/navigation/internal/NavBackStackEntryImpl\n*L\n62#1:167\n62#1:168\n62#1:169,4\n62#1:179,7\n62#1:173\n62#1:174,3\n62#1:177,2\n62#1:186\n62#1:187\n161#1:189\n161#1:190,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryImpl {

    @Nullable
    private final NavContext context;

    /* renamed from: defaultFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e defaultFactory;

    @NotNull
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;

    @NotNull
    private NavDestination destination;

    @NotNull
    private final NavBackStackEntry entry;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @NotNull
    private final String id;

    @Nullable
    private final Bundle immutableArgs;

    @NotNull
    private final LifecycleRegistry lifecycle;

    @NotNull
    private Lifecycle.State maxLifecycle;

    /* renamed from: navResultSavedStateFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e navResultSavedStateFactory;

    @Nullable
    private final Bundle savedState;
    private boolean savedStateRegistryAttached;

    @NotNull
    private final SavedStateRegistryController savedStateRegistryController;

    @Nullable
    private final NavViewModelStoreProvider viewModelStoreProvider;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SavedStateViewModel extends ViewModel {

        @NotNull
        private final SavedStateHandle handle;

        public SavedStateViewModel(@NotNull SavedStateHandle handle) {
            AbstractC5830k.m5330g(handle, "handle");
            this.handle = handle;
        }

        @NotNull
        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    public NavBackStackEntryImpl(@NotNull NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        this.entry = entry;
        this.context = entry.getContext();
        this.destination = entry.getDestination();
        this.immutableArgs = entry.getImmutableArgs();
        this.hostLifecycleState = entry.getHostLifecycleState();
        this.viewModelStoreProvider = entry.getViewModelStoreProvider();
        this.id = entry.getId();
        this.savedState = entry.getSavedState();
        this.savedStateRegistryController = SavedStateRegistryController.INSTANCE.create(entry);
        this.defaultFactory = AbstractC5773a.m5117b(new C2766k(3));
        this.lifecycle = new LifecycleRegistry(entry);
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory$navigation_common_release();
        this.navResultSavedStateFactory = AbstractC5773a.m5117b(new C2766k(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModelFactory defaultFactory_delegate$lambda$0() {
        return new SavedStateViewModelFactory();
    }

    private final ViewModelProvider.Factory getNavResultSavedStateFactory() {
        return (ViewModelProvider.Factory) this.navResultSavedStateFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory navResultSavedStateFactory_delegate$lambda$10() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(AbstractC5832m.m5340a(SavedStateViewModel.class), new C2826a(16));
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModel navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8(CreationExtras initializer) {
        AbstractC5830k.m5330g(initializer, "$this$initializer");
        return new SavedStateViewModel(SavedStateHandleSupport.createSavedStateHandle(initializer));
    }

    @Nullable
    public final Bundle getArguments$navigation_common_release() {
        Pair[] pairArr;
        if (this.immutableArgs == null) {
            return null;
        }
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), this.immutableArgs);
        return bundleBundleOf;
    }

    @Nullable
    /* renamed from: getContext$navigation_common_release, reason: from getter */
    public final NavContext getContext() {
        return this.context;
    }

    @NotNull
    public final SavedStateViewModelFactory getDefaultFactory$navigation_common_release() {
        return (SavedStateViewModelFactory) this.defaultFactory.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MutableCreationExtras getDefaultViewModelCreationExtras$navigation_common_release() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, 0 == true ? 1 : 0);
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.entry);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this.entry);
        Bundle arguments$navigation_common_release = getArguments$navigation_common_release();
        if (arguments$navigation_common_release != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments$navigation_common_release);
        }
        return mutableCreationExtras;
    }

    @NotNull
    /* renamed from: getDefaultViewModelProviderFactory$navigation_common_release, reason: from getter */
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @NotNull
    /* renamed from: getDestination$navigation_common_release, reason: from getter */
    public final NavDestination getDestination() {
        return this.destination;
    }

    @NotNull
    public final NavBackStackEntry getEntry() {
        return this.entry;
    }

    @NotNull
    /* renamed from: getHostLifecycleState$navigation_common_release, reason: from getter */
    public final Lifecycle.State getHostLifecycleState() {
        return this.hostLifecycleState;
    }

    @NotNull
    /* renamed from: getId$navigation_common_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: getImmutableArgs$navigation_common_release, reason: from getter */
    public final Bundle getImmutableArgs() {
        return this.immutableArgs;
    }

    @NotNull
    /* renamed from: getLifecycle$navigation_common_release, reason: from getter */
    public final LifecycleRegistry getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    /* renamed from: getMaxLifecycle$navigation_common_release, reason: from getter */
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @Nullable
    /* renamed from: getSavedState$navigation_common_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @NotNull
    public final SavedStateHandle getSavedStateHandle$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.lifecycle.getState() != Lifecycle.State.DESTROYED) {
            return ((SavedStateViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.INSTANCE, this.entry, getNavResultSavedStateFactory(), (CreationExtras) null, 4, (Object) null).get(AbstractC5832m.m5340a(SavedStateViewModel.class))).getHandle();
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
    }

    @NotNull
    public final SavedStateRegistry getSavedStateRegistry$navigation_common_release() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    /* renamed from: getSavedStateRegistryAttached$navigation_common_release, reason: from getter */
    public final boolean getSavedStateRegistryAttached() {
        return this.savedStateRegistryAttached;
    }

    @NotNull
    /* renamed from: getSavedStateRegistryController$navigation_common_release, reason: from getter */
    public final SavedStateRegistryController getSavedStateRegistryController() {
        return this.savedStateRegistryController;
    }

    @NotNull
    public final ViewModelStore getViewModelStore$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.lifecycle.getState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.getViewModelStore(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @Nullable
    /* renamed from: getViewModelStoreProvider$navigation_common_release, reason: from getter */
    public final NavViewModelStoreProvider getViewModelStoreProvider() {
        return this.viewModelStoreProvider;
    }

    public final void handleLifecycleEvent$navigation_common_release(@NotNull Lifecycle.Event event) {
        AbstractC5830k.m5330g(event, "event");
        this.entry.setHostLifecycleState$navigation_common_release(event.getTargetState());
        this.hostLifecycleState = event.getTargetState();
        updateState$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState$navigation_common_release(@NotNull Bundle outBundle) {
        AbstractC5830k.m5330g(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    public final void setDestination$navigation_common_release(@NotNull NavDestination navDestination) {
        AbstractC5830k.m5330g(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final void setHostLifecycleState$navigation_common_release(@NotNull Lifecycle.State state) {
        AbstractC5830k.m5330g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    public final void setMaxLifecycle$navigation_common_release(@NotNull Lifecycle.State maxState) {
        AbstractC5830k.m5330g(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState$navigation_common_release();
    }

    public final void setSavedStateRegistryAttached$navigation_common_release(boolean z8) {
        this.savedStateRegistryAttached = z8;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC5832m.m5340a(this.entry.getClass()).m5320e());
        sb.append("(" + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
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

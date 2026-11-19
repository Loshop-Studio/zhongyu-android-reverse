package androidx.navigation;

import android.app.Application;
import android.os.Bundle;
import android.view.HasDefaultViewModelProviderFactory;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.SavedStateHandle;
import android.view.SavedStateRegistry;
import android.view.SavedStateRegistryOwner;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.MutableCreationExtras;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavContext;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001jB_\b\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001a2\n\u0010\u001f\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R*\u0010\b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00078\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010+R\"\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bB\u00107R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR#\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bL\u00107*\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020O8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bP\u0010Q*\u0004\bR\u0010NR$\u0010V\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R\u001b\u0010[\u001a\u00020W8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bX\u0010Y*\u0004\bZ\u0010NR\u001b\u0010`\u001a\u00020\\8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b]\u0010^*\u0004\b_\u0010NR\u0014\u0010d\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bf\u0010g*\u0004\bh\u0010N¨\u0006k"}, m5110d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "immutableArgs", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "", "id", "savedState", "<init>", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "updateState", "()V", "outBundle", "saveState", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/navigation/internal/NavContext;", "getContext$navigation_common_release", "()Landroidx/navigation/internal/NavContext;", "value", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "Landroid/os/Bundle;", "getImmutableArgs$navigation_common_release", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_common_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/navigation/NavViewModelStoreProvider;", "getViewModelStoreProvider$navigation_common_release", "()Landroidx/navigation/NavViewModelStoreProvider;", "Ljava/lang/String;", "getId", "getSavedState$navigation_common_release", "Landroidx/navigation/internal/NavBackStackEntryImpl;", "impl", "Landroidx/navigation/internal/NavBackStackEntryImpl;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "Ld6/e;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "getArguments", "getArguments$delegate", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getLifecycle$delegate", RequestParameters.SUBRESOURCE_LIFECYCLE, "getMaxLifecycle", "setMaxLifecycle", "maxLifecycle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "getViewModelStore$delegate", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory$delegate", "defaultViewModelProviderFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry$delegate", "savedStateRegistry", "Companion", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.android.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1734#2,3:173\n1863#2,2:176\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.android.kt\nandroidx/navigation/NavBackStackEntry\n*L\n153#1:173,3\n162#1:176,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final NavContext context;

    @NotNull
    private NavDestination destination;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @NotNull
    private final String id;

    @Nullable
    private final Bundle immutableArgs;

    @NotNull
    private final NavBackStackEntryImpl impl;

    @Nullable
    private final Bundle savedState;

    /* renamed from: savedStateHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e savedStateHandle;

    @Nullable
    private final NavViewModelStoreProvider viewModelStoreProvider;

    @Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007J\r\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0015¨\u0006\u0016"}, m5110d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "<init>", "()V", "create", "Landroidx/navigation/NavBackStackEntry;", "context", "Landroidx/navigation/internal/NavContext;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "randomUUID", "randomUUID$navigation_common_release", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i & 16) != 0) {
                navViewModelStoreProvider = null;
            }
            if ((i & 32) != 0) {
                str = companion.randomUUID$navigation_common_release();
            }
            if ((i & 64) != 0) {
                bundle2 = null;
            }
            return companion.create(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final NavBackStackEntry create(@Nullable NavContext context, @NotNull NavDestination destination, @Nullable Bundle arguments, @NotNull Lifecycle.State hostLifecycleState, @Nullable NavViewModelStoreProvider viewModelStoreProvider, @NotNull String id, @Nullable Bundle savedState) {
            AbstractC5830k.m5330g(destination, "destination");
            AbstractC5830k.m5330g(hostLifecycleState, "hostLifecycleState");
            AbstractC5830k.m5330g(id, "id");
            return new NavBackStackEntry(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id, savedState, null);
        }

        @NotNull
        public final String randomUUID$navigation_common_release() {
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, AbstractC5824e abstractC5824e) {
        this(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    private static Object getArguments$delegate(NavBackStackEntry navBackStackEntry) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navBackStackEntry.impl, NavBackStackEntryImpl.class, "arguments", "getArguments$navigation_common_release()Landroid/os/Bundle;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getDefaultViewModelProviderFactory$delegate(NavBackStackEntry navBackStackEntry) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navBackStackEntry.impl, NavBackStackEntryImpl.class, "defaultViewModelProviderFactory", "getDefaultViewModelProviderFactory$navigation_common_release()Landroidx/lifecycle/ViewModelProvider$Factory;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getLifecycle$delegate(NavBackStackEntry navBackStackEntry) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navBackStackEntry.impl, NavBackStackEntryImpl.class, RequestParameters.SUBRESOURCE_LIFECYCLE, "getLifecycle$navigation_common_release()Landroidx/lifecycle/LifecycleRegistry;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getSavedStateRegistry$delegate(NavBackStackEntry navBackStackEntry) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navBackStackEntry.impl, NavBackStackEntryImpl.class, "savedStateRegistry", "getSavedStateRegistry$navigation_common_release()Landroidx/savedstate/SavedStateRegistry;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getViewModelStore$delegate(NavBackStackEntry navBackStackEntry) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navBackStackEntry.impl, NavBackStackEntryImpl.class, "viewModelStore", "getViewModelStore$navigation_common_release()Landroidx/lifecycle/ViewModelStore;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateHandle savedStateHandle_delegate$lambda$0(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.impl.getSavedStateHandle$navigation_common_release();
    }

    public boolean equals(@Nullable Object other) {
        Set<String> setKeySet;
        if (other != null && (other instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) other;
            if (AbstractC5830k.m5325b(this.id, navBackStackEntry.id) && AbstractC5830k.m5325b(this.destination, navBackStackEntry.destination) && AbstractC5830k.m5325b(getLifecycle(), navBackStackEntry.getLifecycle()) && AbstractC5830k.m5325b(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                if (AbstractC5830k.m5325b(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                    return true;
                }
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj = this.immutableArgs.get(str);
                        Bundle bundle2 = navBackStackEntry.immutableArgs;
                        if (!AbstractC5830k.m5325b(obj, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.impl.getArguments$navigation_common_release();
    }

    @Nullable
    /* renamed from: getContext$navigation_common_release, reason: from getter */
    public final NavContext getContext() {
        return this.context;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @NotNull
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

    @Override // android.view.HasDefaultViewModelProviderFactory
    @NotNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.impl.getDefaultViewModelProviderFactory();
    }

    @NotNull
    public final NavDestination getDestination() {
        return this.destination;
    }

    @NotNull
    /* renamed from: getHostLifecycleState$navigation_common_release, reason: from getter */
    public final Lifecycle.State getHostLifecycleState() {
        return this.hostLifecycleState;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: getImmutableArgs$navigation_common_release, reason: from getter */
    public final Bundle getImmutableArgs() {
        return this.immutableArgs;
    }

    @Override // android.view.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.impl.getLifecycle();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Lifecycle.State getMaxLifecycle() {
        return this.impl.getMaxLifecycle();
    }

    @Nullable
    /* renamed from: getSavedState$navigation_common_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @MainThread
    @NotNull
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle.getValue();
    }

    @Override // android.view.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.impl.getSavedStateRegistry$navigation_common_release();
    }

    @Override // android.view.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        return this.impl.getViewModelStore$navigation_common_release();
    }

    @Nullable
    /* renamed from: getViewModelStoreProvider$navigation_common_release, reason: from getter */
    public final NavViewModelStoreProvider getViewModelStoreProvider() {
        return this.viewModelStoreProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(@NotNull Lifecycle.Event event) {
        AbstractC5830k.m5330g(event, "event");
        this.impl.handleLifecycleEvent$navigation_common_release(event);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.destination.hashCode() + (this.id.hashCode() * 31);
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((getLifecycle().hashCode() + (iHashCode * 31)) * 31);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(@NotNull Bundle outBundle) {
        AbstractC5830k.m5330g(outBundle, "outBundle");
        this.impl.saveState$navigation_common_release(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(@NotNull NavDestination navDestination) {
        AbstractC5830k.m5330g(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final void setHostLifecycleState$navigation_common_release(@NotNull Lifecycle.State state) {
        AbstractC5830k.m5330g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(@NotNull Lifecycle.State value) {
        AbstractC5830k.m5330g(value, "value");
        this.impl.setMaxLifecycle$navigation_common_release(value);
    }

    @NotNull
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
        this.id = str;
        this.savedState = bundle2;
        this.impl = new NavBackStackEntryImpl(this);
        this.savedStateHandle = AbstractC5773a.m5117b(new C2827b(this, 0));
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, AbstractC5824e abstractC5824e) {
        this(navContext, navDestination, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? Lifecycle.State.CREATED : state, (i & 16) != 0 ? null : navViewModelStoreProvider, (i & 32) != 0 ? INSTANCE.randomUUID$navigation_common_release() : str, (i & 64) != 0 ? null : bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@NotNull NavBackStackEntry entry, @Nullable Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        AbstractC5830k.m5330g(entry, "entry");
        this.impl.setHostLifecycleState$navigation_common_release(entry.hostLifecycleState);
        this.impl.setMaxLifecycle$navigation_common_release(entry.getMaxLifecycle());
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, AbstractC5824e abstractC5824e) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }
}

package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p379vd.InterfaceC11612u;

@Navigator.Name("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleEventObserver fragmentObserver;
    private final InterfaceC9540l fragmentViewObserver;
    private final List<Pair<String, Boolean>> pendingOps;
    private final Set<String> savedIds;

    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<InterfaceC9529a> completeTransition;

        public final WeakReference<InterfaceC9529a> getCompleteTransition() {
            WeakReference<InterfaceC9529a> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            AbstractC9979u.m20312y("completeTransition");
            return null;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            InterfaceC9529a interfaceC9529a = getCompleteTransition().get();
            if (interfaceC9529a != null) {
                interfaceC9529a.invoke();
            }
        }

        public final void setCompleteTransition(WeakReference<InterfaceC9529a> weakReference) {
            AbstractC9979u.m20294g(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    @NavDestination.ClassType(Fragment.class)
    public static class Destination extends NavDestination {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> fragmentNavigator) {
            super(fragmentNavigator);
            AbstractC9979u.m20294g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Destination) && super.equals(obj) && AbstractC9979u.m20289b(this._className, ((Destination) obj)._className);
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            AbstractC9979u.m20292e(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attrs) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4125R.styleable.FragmentNavigator);
            AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(C4125R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            C10786q c10786q = C10786q.f26013a;
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            AbstractC9979u.m20294g(className, "className");
            this._className = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this._className;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            AbstractC9979u.m20294g(navigatorProvider, "navigatorProvider");
        }
    }

    public static final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements;

        public static final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Builder addSharedElement(View sharedElement, String name) {
                AbstractC9979u.m20294g(sharedElement, "sharedElement");
                AbstractC9979u.m20294g(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            public final Builder addSharedElements(Map<View, String> sharedElements) {
                AbstractC9979u.m20294g(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }

        public Extras(Map<View, String> sharedElements) {
            AbstractC9979u.m20294g(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        public final Map<View, String> getSharedElements() {
            return AbstractC9925a.m20101u(this._sharedElements);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i10) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i10;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentObserver$lambda$1(this.f1803c, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new InterfaceC9540l() { // from class: androidx.navigation.fragment.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FragmentNavigator.fragmentViewObserver$lambda$3(this.f1804c, (NavBackStackEntry) obj);
            }
        };
    }

    private final void addPendingOps(final String str, boolean z10, boolean z11) {
        if (z11) {
            AbstractC10937b0.m23867L(this.pendingOps, new InterfaceC9540l() { // from class: androidx.navigation.fragment.h
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FragmentNavigator.addPendingOps$lambda$16(str, (Pair) obj));
                }
            });
        }
        this.pendingOps.add(AbstractC10776g.m22975a(str, Boolean.valueOf(z10)));
    }

    public static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        fragmentNavigator.addPendingOps(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addPendingOps$lambda$16(String str, Pair it) {
        AbstractC9979u.m20294g(it, "it");
        return AbstractC9979u.m20289b(it.m20051f(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q attachClearViewModel$lambda$12(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, FragmentNavigator fragmentNavigator, Fragment fragment) {
        for (NavBackStackEntry navBackStackEntry2 : (Iterable) navigatorState.getTransitionsInProgress().getValue()) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry2);
                Objects.toString(fragment);
            }
            navigatorState.markTransitionComplete(navBackStackEntry2);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearEntryStateViewModel attachClearViewModel$lambda$9$lambda$8(CreationExtras initializer) {
        AbstractC9979u.m20294g(initializer, "$this$initializer");
        return new ClearEntryStateViewModel();
    }

    private final void attachObservers(final NavBackStackEntry navBackStackEntry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.navigation.fragment.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachObservers$lambda$7(this.f1807c, fragment, navBackStackEntry, (LifecycleOwner) obj);
            }
        }));
        fragment.getLifecycle().addObserver(this.fragmentObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q attachObservers$lambda$7(FragmentNavigator fragmentNavigator, Fragment fragment, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner) {
        List<Pair<String, Boolean>> list = fragmentNavigator.pendingOps;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC9979u.m20289b(((Pair) it.next()).m20051f(), fragment.getTag())) {
                    z10 = true;
                    break;
                }
            }
        }
        if (lifecycleOwner != null && !z10) {
            Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                lifecycle.addObserver((LifecycleObserver) fragmentNavigator.fragmentViewObserver.invoke(navBackStackEntry));
            }
        }
        return C10786q.f26013a;
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry navBackStackEntry, NavOptions navOptions) {
        NavDestination destination = navBackStackEntry.getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle arguments = navBackStackEntry.getArguments();
        String className = ((Destination) destination).getClassName();
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        AbstractC9979u.m20293f(fragmentInstantiate, "instantiate(...)");
        fragmentInstantiate.setArguments(arguments);
        FragmentTransaction fragmentTransactionBeginTransaction = this.fragmentManager.beginTransaction();
        AbstractC9979u.m20293f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        int enterAnim = navOptions != null ? navOptions.getEnterAnim() : -1;
        int exitAnim = navOptions != null ? navOptions.getExitAnim() : -1;
        int popEnterAnim = navOptions != null ? navOptions.getPopEnterAnim() : -1;
        int popExitAnim = navOptions != null ? navOptions.getPopExitAnim() : -1;
        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim == -1) {
                exitAnim = 0;
            }
            if (popEnterAnim == -1) {
                popEnterAnim = 0;
            }
            fragmentTransactionBeginTransaction.setCustomAnimations(enterAnim, exitAnim, popEnterAnim, popExitAnim != -1 ? popExitAnim : 0);
        }
        fragmentTransactionBeginTransaction.replace(this.containerId, fragmentInstantiate, navBackStackEntry.getId());
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragmentInstantiate);
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        return fragmentTransactionBeginTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentObserver$lambda$1(FragmentNavigator fragmentNavigator, LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : (Iterable) fragmentNavigator.getState().getTransitionsInProgress().getValue()) {
                if (AbstractC9979u.m20289b(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (fragmentNavigator.isLoggingEnabled(2)) {
                    navBackStackEntry.toString();
                    Objects.toString(source);
                }
                fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver fragmentViewObserver$lambda$3(final FragmentNavigator fragmentNavigator, final NavBackStackEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentViewObserver$lambda$3$lambda$2(this.f1805c, entry, lifecycleOwner, event);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentViewObserver$lambda$3$lambda$2(FragmentNavigator fragmentNavigator, NavBackStackEntry navBackStackEntry, LifecycleOwner owner, Lifecycle.Event event) {
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && ((List) fragmentNavigator.getState().getBackStack().getValue()).contains(navBackStackEntry)) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry);
                Objects.toString(owner);
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry);
                Objects.toString(owner);
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoggingEnabled(int i10) {
        return Log.isLoggable("FragmentManager", i10) || Log.isLoggable(TAG, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$5(NavigatorState navigatorState, FragmentNavigator fragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        Object objPrevious;
        AbstractC9979u.m20294g(fragmentManager, "<unused var>");
        AbstractC9979u.m20294g(fragment, "fragment");
        List list = (List) navigatorState.getBackStack().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (AbstractC9979u.m20289b(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (fragmentNavigator.isLoggingEnabled(2)) {
            Objects.toString(fragment);
            Objects.toString(navBackStackEntry);
            Objects.toString(fragmentNavigator.fragmentManager);
        }
        if (navBackStackEntry != null) {
            fragmentNavigator.attachObservers(navBackStackEntry, fragment);
            fragmentNavigator.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, navigatorState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String popBackStack$lambda$14$lambda$13(Pair it) {
        AbstractC9979u.m20294g(it, "it");
        return (String) it.m20051f();
    }

    public final void attachClearViewModel$navigation_fragment_release(final Fragment fragment, final NavBackStackEntry entry, final NavigatorState state) {
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(entry, "entry");
        AbstractC9979u.m20294g(state, "state");
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        AbstractC9979u.m20293f(viewModelStore, "<get-viewModelStore>(...)");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9983y.m20315b(ClearEntryStateViewModel.class), new InterfaceC9540l() { // from class: androidx.navigation.fragment.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachClearViewModel$lambda$9$lambda$8((CreationExtras) obj);
            }
        });
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference<>(new InterfaceC9529a() { // from class: androidx.navigation.fragment.j
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return FragmentNavigator.attachClearViewModel$lambda$12(entry, state, this, fragment);
            }
        }));
    }

    public final InterfaceC11612u getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    public final List<Pair<String, Boolean>> getPendingOps$navigation_fragment_release() {
        return this.pendingOps;
    }

    @InterfaceC10770a
    public Fragment instantiateFragment(Context context, FragmentManager fragmentManager, String className, Bundle bundle) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(fragmentManager, "fragmentManager");
        AbstractC9979u.m20294g(className, "className");
        Fragment fragmentInstantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        AbstractC9979u.m20293f(fragmentInstantiate, "instantiate(...)");
        return fragmentInstantiate;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9979u.m20294g(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(final NavigatorState state) {
        AbstractC9979u.m20294g(state, "state");
        super.onAttach(state);
        isLoggingEnabled(2);
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.g
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.onAttach$lambda$5(state, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator.onAttach.2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeCommitted(Fragment fragment, boolean z10) {
                Object obj;
                Object objPrevious;
                AbstractC9979u.m20294g(fragment, "fragment");
                List listM23906H0 = AbstractC10947g0.m23906H0((Collection) state.getBackStack().getValue(), (Iterable) state.getTransitionsInProgress().getValue());
                ListIterator listIterator = listM23906H0.listIterator(listM23906H0.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (AbstractC9979u.m20289b(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean z11 = z10 && this.getPendingOps$navigation_fragment_release().isEmpty() && fragment.isRemoving();
                Iterator<T> it = this.getPendingOps$navigation_fragment_release().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC9979u.m20289b(((Pair) next).m20051f(), fragment.getTag())) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    this.getPendingOps$navigation_fragment_release().remove(pair);
                }
                if (!z11 && this.isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                    Objects.toString(navBackStackEntry);
                }
                boolean z12 = pair != null && ((Boolean) pair.m20052g()).booleanValue();
                if (!z10 && !z12 && navBackStackEntry == null) {
                    throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                }
                if (navBackStackEntry != null) {
                    this.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, state);
                    if (z11) {
                        if (this.isLoggingEnabled(2)) {
                            Objects.toString(fragment);
                            navBackStackEntry.toString();
                        }
                        state.popWithTransition(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeStarted(Fragment fragment, boolean z10) {
                Object objPrevious;
                AbstractC9979u.m20294g(fragment, "fragment");
                if (z10) {
                    List list = (List) state.getBackStack().getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        } else {
                            objPrevious = listIterator.previous();
                            if (AbstractC9979u.m20289b(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                    if (this.isLoggingEnabled(2)) {
                        Objects.toString(fragment);
                        Objects.toString(navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        state.prepareForTransition(navBackStackEntry);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(backStackEntry, null);
        List list = (List) getState().getBackStack().getValue();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC10947g0.m23947p0(list, AbstractC10978w.m24138p(list) - 1);
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, backStackEntry.getId(), true, false, 4, null);
            this.fragmentManager.popBackStack(backStackEntry.getId(), 1);
            addPendingOps$default(this, backStackEntry.getId(), false, false, 2, null);
            fragmentTransactionCreateFragmentTransaction.addToBackStack(backStackEntry.getId());
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        getState().onLaunchSingleTop(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(Bundle savedState) {
        AbstractC9979u.m20294g(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            AbstractC10937b0.m23857B(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(AbstractC10776g.m22975a(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().getBackStack().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC10947g0.m23944m0(list);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) AbstractC10947g0.m23947p0(list, iIndexOf - 1);
        if (navBackStackEntry2 != null) {
            addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (AbstractC10669q.m22577o(AbstractC10669q.m22570B(AbstractC10947g0.m23930d0(this.pendingOps), new InterfaceC9540l() { // from class: androidx.navigation.fragment.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return FragmentNavigator.popBackStack$lambda$14$lambda$13((Pair) obj2);
                }
            }), navBackStackEntry3.getId()) || !AbstractC9979u.m20289b(navBackStackEntry3.getId(), navBackStackEntry.getId())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            addPendingOps$default(this, ((NavBackStackEntry) arrayList.get(i10)).getId(), true, false, 4, null);
        }
        if (z10) {
            for (NavBackStackEntry navBackStackEntry4 : AbstractC10947g0.m23908J0(list2)) {
                if (AbstractC9979u.m20289b(navBackStackEntry4, navBackStackEntry)) {
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry4);
                } else {
                    this.fragmentManager.saveBackStack(navBackStackEntry4.getId());
                    this.savedIds.add(navBackStackEntry4.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(popUpTo.getId(), 1);
        }
        if (isLoggingEnabled(2)) {
            Objects.toString(popUpTo);
        }
        getState().popWithTransition(popUpTo, z10);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        boolean zIsEmpty = ((List) getState().getBackStack().getValue()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.shouldRestoreState() && this.savedIds.remove(navBackStackEntry.getId())) {
            this.fragmentManager.restoreBackStack(navBackStackEntry.getId());
            getState().pushWithTransition(navBackStackEntry);
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(navBackStackEntry, navOptions);
        if (!zIsEmpty) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) AbstractC10947g0.m23957z0((List) getState().getBackStack().getValue());
            if (navBackStackEntry2 != null) {
                addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            fragmentTransactionCreateFragmentTransaction.addToBackStack(navBackStackEntry.getId());
        }
        if (extras instanceof Extras) {
            for (Map.Entry<View, String> entry : ((Extras) extras).getSharedElements().entrySet()) {
                fragmentTransactionCreateFragmentTransaction.addSharedElement(entry.getKey(), entry.getValue());
            }
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        if (isLoggingEnabled(2)) {
            Objects.toString(navBackStackEntry);
        }
        getState().pushWithTransition(navBackStackEntry);
    }
}

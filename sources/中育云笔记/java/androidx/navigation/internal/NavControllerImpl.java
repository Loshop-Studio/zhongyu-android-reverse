package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.NavUriKt;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.SupportingPane;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.BufferOverflow;
import p049ce.AbstractC5447q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p296pd.AbstractC10666n;
import p296pd.AbstractC10669q;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10939c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p325rc.C10958m;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

/* loaded from: classes.dex */
public final class NavControllerImpl {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    public static final String TAG = "NavController";
    private final InterfaceC11603l _currentBackStack;
    private final InterfaceC11602k _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final InterfaceC11603l _visibleEntries;
    private InterfaceC9540l addToBackStackHandler;
    private final C10958m backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, C10958m> backStackStates;
    private Bundle[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final InterfaceC11612u currentBackStack;
    private int dispatchReentrantCount;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final NavController navController;
    private final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final List<NavController.OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInt> parentToChildCount;
    private InterfaceC9540l popFromBackStackHandler;
    private InterfaceC9529a updateOnBackPressedCallbackEnabledCallback;
    private NavControllerViewModel viewModel;
    private final InterfaceC11612u visibleEntries;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public NavControllerImpl(NavController navController, InterfaceC9529a updateOnBackPressedCallbackEnabledCallback) {
        AbstractC9979u.m20294g(navController, "navController");
        AbstractC9979u.m20294g(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.navController = navController;
        this.updateOnBackPressedCallbackEnabledCallback = updateOnBackPressedCallbackEnabledCallback;
        this.backQueue = new C10958m();
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this._currentBackStack = interfaceC11603lM25602a;
        this.currentBackStack = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this._visibleEntries = interfaceC11603lM25602a2;
        this.visibleEntries = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.internal.l
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavControllerImpl.lifecycleObserver$lambda$1(this.f1834c, lifecycleOwner, event);
            }
        };
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = AbstractC11608q.m25592b(1, 0, BufferOverflow.f23520d, 2, null);
    }

    private final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        Bundle bundle2;
        C10958m<NavBackStackEntry> c10958m;
        NavDestination destination;
        List<NavBackStackEntry> list2;
        NavBackStackEntry navBackStackEntry2;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        List<NavBackStackEntry> list3 = list;
        NavDestination destination2 = navBackStackEntry.getDestination();
        if (!(destination2 instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof FloatingWindow) && popBackStackInternal$navigation_runtime_release$default(this, ((NavBackStackEntry) this.backQueue.last()).getDestination().getId(), true, false, 4, (Object) null)) {
            }
        }
        C10958m c10958m2 = new C10958m();
        NavBackStackEntry navBackStackEntry3 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination2 = destination2;
            while (true) {
                AbstractC9979u.m20291d(navDestination2);
                NavGraph parent = navDestination2.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list3.listIterator(list3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = listIterator.previous();
                            if (AbstractC9979u.m20289b(navBackStackEntryPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        bundle2 = bundle;
                        destination = destination2;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, getNavContext(), parent, bundle2, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle2 = bundle;
                        destination = destination2;
                    }
                    c10958m2.addFirst(navBackStackEntryCreate$default);
                    if (this.backQueue.isEmpty() || ((NavBackStackEntry) this.backQueue.last()).getDestination() != parent) {
                        navBackStackEntry2 = navBackStackEntry;
                        list2 = list;
                        c10958m = c10958m2;
                    } else {
                        list2 = list;
                        c10958m = c10958m2;
                        navBackStackEntry2 = navBackStackEntry;
                        popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle2 = bundle;
                    c10958m = c10958m2;
                    destination = destination2;
                    list2 = list3;
                    navBackStackEntry2 = navBackStackEntry;
                }
                if (parent == null || parent == navDestination) {
                    break;
                }
                list3 = list2;
                navDestination2 = parent;
                c10958m2 = c10958m;
                destination2 = destination;
            }
        } else {
            bundle2 = bundle;
            c10958m = c10958m2;
            destination = destination2;
            list2 = list3;
            navBackStackEntry2 = navBackStackEntry;
        }
        NavDestination destination3 = c10958m.isEmpty() ? destination : ((NavBackStackEntry) c10958m.first()).getDestination();
        while (destination3 != null && findDestination$navigation_runtime_release(destination3.getId(), destination3) != destination3) {
            NavGraph parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle3 = (bundle2 == null || !SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundle2))) ? bundle2 : null;
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = listIterator2.previous();
                        if (AbstractC9979u.m20289b(navBackStackEntryPrevious.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navGraph = parent2;
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, getNavContext(), navGraph, parent2.addInDefaultArgs(bundle3), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                c10958m.addFirst(navBackStackEntryCreate$default2);
            } else {
                navGraph = parent2;
            }
            destination3 = navGraph;
        }
        if (!c10958m.isEmpty()) {
            destination = ((NavBackStackEntry) c10958m.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            NavDestination destination4 = ((NavBackStackEntry) this.backQueue.last()).getDestination();
            AbstractC9979u.m20292e(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination4).getNodes().get(destination.getId()) != null) {
                break;
            } else {
                popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) this.backQueue.m23969f();
        if (navBackStackEntry4 == null) {
            navBackStackEntry4 = (NavBackStackEntry) c10958m.m23969f();
        }
        if (!AbstractC9979u.m20289b(navBackStackEntry4 != null ? navBackStackEntry4.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination5 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = this._graph;
                AbstractC9979u.m20291d(navGraph2);
                if (AbstractC9979u.m20289b(destination5, navGraph2)) {
                    navBackStackEntry3 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry3;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                NavContext navContext = getNavContext();
                NavGraph navGraph3 = this._graph;
                AbstractC9979u.m20291d(navGraph3);
                NavGraph navGraph4 = this._graph;
                AbstractC9979u.m20291d(navGraph4);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, navContext, navGraph3, navGraph4.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            c10958m.addFirst(navBackStackEntryCreate$default3);
        }
        for (NavBackStackEntry navBackStackEntry5 : c10958m) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry5.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry5);
        }
        this.backQueue.addAll(c10958m);
        this.backQueue.add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry6 : AbstractC10947g0.m23907I0(c10958m, navBackStackEntry2)) {
            NavGraph parent3 = navBackStackEntry6.getDestination().getParent();
            if (parent3 != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry6, getBackStackEntry$navigation_runtime_release(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = AbstractC10978w.m24136n();
        }
        navControllerImpl.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q clearBackStackInternal$lambda$19(NavOptionsBuilder navOptions) {
        AbstractC9979u.m20294g(navOptions, "$this$navOptions");
        navOptions.setRestoreState(true);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q executePopOperations$lambda$10(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, NavControllerImpl navControllerImpl, boolean z10, C10958m c10958m, NavBackStackEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        ref$BooleanRef.f23398c = true;
        ref$BooleanRef2.f23398c = true;
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(entry, z10, c10958m);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$11(NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$12(NavControllerImpl navControllerImpl, NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$14(NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$15(NavControllerImpl navControllerImpl, NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    private final boolean executeRestoreState(final List<NavBackStackEntry> list, final Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            List list2 = (List) AbstractC10947g0.m23957z0(arrayList);
            if (AbstractC9979u.m20289b((list2 == null || (navBackStackEntry = (NavBackStackEntry) AbstractC10947g0.m23956y0(list2)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(AbstractC10978w.m24141s(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            List<NavBackStackEntry> list3 = (List) obj3;
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) AbstractC10947g0.m23944m0(list3)).getDestination().getNavigatorName());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            navigateInternal$navigation_runtime_release(navigator, list3, navOptions, extras, new InterfaceC9540l() { // from class: androidx.navigation.internal.m
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj4) {
                    return NavControllerImpl.executeRestoreState$lambda$57(ref$BooleanRef, list, ref$IntRef, this, bundle, (NavBackStackEntry) obj4);
                }
            });
        }
        return ref$BooleanRef.f23398c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q executeRestoreState$lambda$57(Ref$BooleanRef ref$BooleanRef, List list, Ref$IntRef ref$IntRef, NavControllerImpl navControllerImpl, Bundle bundle, NavBackStackEntry entry) {
        List<NavBackStackEntry> listM24136n;
        AbstractC9979u.m20294g(entry, "entry");
        ref$BooleanRef.f23398c = true;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            listM24136n = list.subList(ref$IntRef.f23400c, i10);
            ref$IntRef.f23400c = i10;
        } else {
            listM24136n = AbstractC10978w.m24136n();
        }
        navControllerImpl.addEntryToBackStack(entry.getDestination(), bundle, entry, listM24136n);
        return C10786q.f26013a;
    }

    public static /* synthetic */ NavDestination findDestination$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i10, NavDestination navDestination, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            navDestination = null;
        }
        return navControllerImpl.findDestination$navigation_runtime_release(i10, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavDestination navDestination, int i10, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            navDestination2 = null;
        }
        return navControllerImpl.findDestinationComprehensive$navigation_runtime_release(navDestination, i10, z10, navDestination2);
    }

    private final List<NavBackStackEntry> instantiateBackStack(C10958m c10958m) {
        NavDestination graph$navigation_runtime_release;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m23971k();
        if (navBackStackEntry == null || (graph$navigation_runtime_release = navBackStackEntry.getDestination()) == null) {
            graph$navigation_runtime_release = getGraph$navigation_runtime_release();
        }
        if (c10958m != null) {
            Iterator<E> it = c10958m.iterator();
            NavDestination navDestination = graph$navigation_runtime_release;
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 8, null);
                if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + navDestination).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestinationComprehensive$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                navDestination = navDestinationFindDestinationComprehensive$navigation_runtime_release$default;
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination navDestination, Bundle bundle) {
        int iNextIndex;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        C10958m c10958m = this.backQueue;
        ListIterator<E> listIterator = c10958m.listIterator(c10958m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((NavBackStackEntry) listIterator.previous()).getDestination() == navDestination) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (navDestination instanceof NavGraph) {
            List listM22574F = AbstractC10669q.m22574F(AbstractC10669q.m22570B(NavGraph.Companion.childHierarchy((NavGraph) navDestination), new InterfaceC9540l() { // from class: androidx.navigation.internal.i
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(NavControllerImpl.launchSingleTopInternal$lambda$47((NavDestination) obj));
                }
            }));
            if (this.backQueue.size() - iNextIndex != listM22574F.size()) {
                return false;
            }
            C10958m c10958m2 = this.backQueue;
            List listSubList = c10958m2.subList(iNextIndex, c10958m2.size());
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
            }
            if (!AbstractC9979u.m20289b(arrayList, listM22574F)) {
                return false;
            }
        } else if (currentBackStackEntry$navigation_runtime_release == null || (destination = currentBackStackEntry$navigation_runtime_release.getDestination()) == null || navDestination.getId() != destination.getId()) {
            return false;
        }
        C10958m<NavBackStackEntry> c10958m3 = new C10958m();
        while (AbstractC10978w.m24138p(this.backQueue) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC10937b0.m23870O(this.backQueue);
            unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            c10958m3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(bundle)));
        }
        for (NavBackStackEntry navBackStackEntry2 : c10958m3) {
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry2, getBackStackEntry$navigation_runtime_release(parent.getId()));
            }
            this.backQueue.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : c10958m3) {
            this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int launchSingleTopInternal$lambda$47(NavDestination it) {
        AbstractC9979u.m20294g(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(NavControllerImpl navControllerImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC9979u.m20294g(lifecycleOwner, "<unused var>");
        AbstractC9979u.m20294g(event, "event");
        navControllerImpl.hostLifecycleState = event.getTargetState();
        if (navControllerImpl._graph != null) {
            Iterator it = AbstractC10947g0.m23925a1(navControllerImpl.backQueue).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q navigate$lambda$44(Ref$BooleanRef ref$BooleanRef, NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry it) {
        AbstractC9979u.m20294g(it, "it");
        ref$BooleanRef.f23398c = true;
        addEntryToBackStack$default(navControllerImpl, navDestination, bundle, it, null, 8, null);
        return C10786q.f26013a;
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release(str, navOptions, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q navigateInternal$lambda$3(NavBackStackEntry it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    public static /* synthetic */ void navigateInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.navigation.internal.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NavControllerImpl.navigateInternal$lambda$3((NavBackStackEntry) obj2);
                }
            };
        }
        navControllerImpl.navigateInternal$navigation_runtime_release(navigator, list, navOptions, extras, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q pop$lambda$6(InterfaceC9529a interfaceC9529a) {
        interfaceC9529a.invoke();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q popBackStackInternal$lambda$4(NavBackStackEntry it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    public static /* synthetic */ void popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.navigation.internal.d
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NavControllerImpl.popBackStackInternal$lambda$4((NavBackStackEntry) obj2);
                }
            };
        }
        navControllerImpl.popBackStackInternal$navigation_runtime_release(navigator, navBackStackEntry, z10, interfaceC9540l);
    }

    public static /* synthetic */ void popEntryFromBackStack$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry, boolean z10, C10958m c10958m, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            c10958m = new C10958m();
        }
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z10, c10958m);
    }

    private final boolean restoreStateInternal(int i10, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(i10));
        AbstractC10937b0.m23863H(this.backStackMap.values(), new InterfaceC9540l() { // from class: androidx.navigation.internal.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$51(str, (String) obj));
            }
        });
        return executeRestoreState(instantiateBackStack((C10958m) AbstractC9962d0.m20253d(this.backStackStates).remove(str)), bundle, navOptions, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$51(String str, String str2) {
        return AbstractC9979u.m20289b(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$53(String str, String str2) {
        return AbstractC9979u.m20289b(str2, str);
    }

    public final void addOnDestinationChangedListener$navigation_runtime_release(NavController.OnDestinationChangedListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        listener.onDestinationChanged(this.navController, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
    }

    public final boolean clearBackStack$navigation_runtime_release(String route) {
        AbstractC9979u.m20294g(route, "route");
        return clearBackStackInternal$navigation_runtime_release(route) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(int i10) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(i10, null, NavOptionsBuilderKt.navOptions(new InterfaceC9540l() { // from class: androidx.navigation.internal.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NavControllerImpl.clearBackStackInternal$lambda$19((NavOptionsBuilder) obj);
            }
        }), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(i10, true, false);
    }

    public final NavBackStackEntry createBackStackEntry$navigation_runtime_release(NavDestination destination, Bundle bundle) {
        AbstractC9979u.m20294g(destination, "destination");
        return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, getNavContext(), destination, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
    }

    public final boolean dispatchOnDestinationChanged$navigation_runtime_release() {
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m23971k();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<NavBackStackEntry> listM23925a1 = AbstractC10947g0.m23925a1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry2 : listM23925a1) {
                Iterator<NavController.OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this.navController, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this._currentBackStackEntryFlow.mo20854a(navBackStackEntry2);
            }
            this._currentBackStack.mo20854a(AbstractC10947g0.m23925a1(this.backQueue));
            this._visibleEntries.mo20854a(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntry != null;
    }

    public final boolean executePopOperations$navigation_runtime_release(List<? extends Navigator<?>> popOperations, NavDestination foundDestination, boolean z10, boolean z11) {
        final NavControllerImpl navControllerImpl;
        final boolean z12;
        AbstractC9979u.m20294g(popOperations, "popOperations");
        AbstractC9979u.m20294g(foundDestination, "foundDestination");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final C10958m c10958m = new C10958m();
        Iterator<? extends Navigator<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                navControllerImpl = this;
                z12 = z11;
                break;
            }
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            navControllerImpl = this;
            z12 = z11;
            popBackStackInternal$navigation_runtime_release(navigator, (NavBackStackEntry) this.backQueue.last(), z12, new InterfaceC9540l() { // from class: androidx.navigation.internal.r
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NavControllerImpl.executePopOperations$lambda$10(ref$BooleanRef2, ref$BooleanRef, navControllerImpl, z12, c10958m, (NavBackStackEntry) obj);
                }
            });
            if (!ref$BooleanRef2.f23398c) {
                break;
            }
            z11 = z12;
        }
        if (z12) {
            if (!z10) {
                for (NavDestination navDestination : AbstractC10669q.m22573E(AbstractC10666n.m22565i(foundDestination, new InterfaceC9540l() { // from class: androidx.navigation.internal.e
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.executePopOperations$lambda$11((NavDestination) obj);
                    }
                }), new InterfaceC9540l() { // from class: androidx.navigation.internal.f
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavControllerImpl.executePopOperations$lambda$12(this.f1828c, (NavDestination) obj));
                    }
                })) {
                    Map<Integer, String> map = navControllerImpl.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) c10958m.m23969f();
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!c10958m.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c10958m.first();
                Iterator it2 = AbstractC10669q.m22573E(AbstractC10666n.m22565i(findDestination$navigation_runtime_release$default(this, navBackStackEntryState2.getDestinationId(), null, 2, null), new InterfaceC9540l() { // from class: androidx.navigation.internal.g
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.executePopOperations$lambda$14((NavDestination) obj);
                    }
                }), new InterfaceC9540l() { // from class: androidx.navigation.internal.h
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavControllerImpl.executePopOperations$lambda$15(this.f1829c, (NavDestination) obj));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    navControllerImpl.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryState2.getId());
                }
                if (navControllerImpl.backStackMap.values().contains(navBackStackEntryState2.getId())) {
                    navControllerImpl.backStackStates.put(navBackStackEntryState2.getId(), c10958m);
                }
            }
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        return ref$BooleanRef.f23398c;
    }

    public final NavDestination findDestination$navigation_runtime_release(int i10, NavDestination navDestination) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        AbstractC9979u.m20291d(navGraph);
        if (navGraph.getId() == i10) {
            if (navDestination == null) {
                return this._graph;
            }
            if (AbstractC9979u.m20289b(this._graph, navDestination) && navDestination.getParent() == null) {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m23971k();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            AbstractC9979u.m20291d(destination);
        }
        return findDestinationComprehensive$navigation_runtime_release(destination, i10, false, navDestination);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.navigation.NavGraph, java.lang.Object] */
    public final NavDestination findDestinationComprehensive$navigation_runtime_release(NavDestination destination, int i10, boolean z10, NavDestination navDestination) {
        AbstractC9979u.m20294g(destination, "destination");
        if (destination.getId() == i10 && (navDestination == null || (AbstractC9979u.m20289b(destination, navDestination) && AbstractC9979u.m20289b(destination.getParent(), navDestination.getParent())))) {
            return destination;
        }
        ?? parent = destination instanceof NavGraph ? (NavGraph) destination : 0;
        if (parent == 0) {
            parent = destination.getParent();
            AbstractC9979u.m20291d(parent);
        }
        return parent.findNodeComprehensive(i10, parent, z10, navDestination);
    }

    /* renamed from: findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release */
    public final String m1959x7b9ea851(int[] deepLink) {
        NavGraph navGraph;
        AbstractC9979u.m20294g(deepLink, "deepLink");
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                NavGraph navGraph3 = this._graph;
                AbstractC9979u.m20291d(navGraph3);
                if (navGraph3.getId() == i11) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                AbstractC9979u.m20291d(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i11);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.Companion.getDisplayName(getNavContext(), i11);
            }
            if (i10 != deepLink.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    AbstractC9979u.m20291d(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i10++;
        }
    }

    public final <T> String generateRouteFilled$navigation_runtime_release(T route) {
        AbstractC9979u.m20294g(route, "route");
        NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), RouteSerializerKt.generateHashCode(AbstractC5447q.m2953c(AbstractC9983y.m20315b(route.getClass()))), true, null, 8, null);
        if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
            throw new IllegalArgumentException(("Destination with route " + AbstractC9983y.m20315b(route.getClass()).mo20277f() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, NavArgument> arguments = navDestinationFindDestinationComprehensive$navigation_runtime_release$default.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10967q0.m24038e(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(route, linkedHashMap);
    }

    public final InterfaceC9540l getAddToBackStackHandler$navigation_runtime_release() {
        return this.addToBackStackHandler;
    }

    public final C10958m getBackQueue$navigation_runtime_release() {
        return this.backQueue;
    }

    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(int i10) {
        Object objPrevious;
        C10958m c10958m = this.backQueue;
        ListIterator<E> listIterator = c10958m.listIterator(c10958m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((NavBackStackEntry) objPrevious).getDestination().getId() == i10) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + getCurrentDestination$navigation_runtime_release()).toString());
    }

    public final Map<Integer, String> getBackStackMap$navigation_runtime_release() {
        return this.backStackMap;
    }

    public final Map<String, C10958m> getBackStackStates$navigation_runtime_release() {
        return this.backStackStates;
    }

    public final Bundle[] getBackStackToRestore$navigation_runtime_release() {
        return this.backStackToRestore;
    }

    public final Map<NavBackStackEntry, NavBackStackEntry> getChildToParentEntries$navigation_runtime_release() {
        return this.childToParentEntries;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InterfaceC11612u getCurrentBackStack$navigation_runtime_release() {
        return this.currentBackStack;
    }

    public final NavBackStackEntry getCurrentBackStackEntry$navigation_runtime_release() {
        return (NavBackStackEntry) this.backQueue.m23971k();
    }

    public final NavDestination getCurrentDestination$navigation_runtime_release() {
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        if (currentBackStackEntry$navigation_runtime_release != null) {
            return currentBackStackEntry$navigation_runtime_release.getDestination();
        }
        return null;
    }

    public final Map<NavBackStackEntry, Boolean> getEntrySavedState$navigation_runtime_release() {
        return this.entrySavedState;
    }

    @MainThread
    public final NavGraph getGraph$navigation_runtime_release() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC9979u.m20292e(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    public final LifecycleObserver getLifecycleObserver$navigation_runtime_release() {
        return this.lifecycleObserver;
    }

    public final LifecycleOwner getLifecycleOwner$navigation_runtime_release() {
        return this.lifecycleOwner;
    }

    public final NavContext getNavContext() {
        return this.navController.getNavContext$navigation_runtime_release();
    }

    public final NavController getNavController() {
        return this.navController;
    }

    public final NavigatorProvider getNavigatorProvider$navigation_runtime_release() {
        return this._navigatorProvider;
    }

    public final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> getNavigatorState$navigation_runtime_release() {
        return this.navigatorState;
    }

    public final Bundle getNavigatorStateToRestore$navigation_runtime_release() {
        return this.navigatorStateToRestore;
    }

    public final List<NavController.OnDestinationChangedListener> getOnDestinationChangedListeners$navigation_runtime_release() {
        return this.onDestinationChangedListeners;
    }

    public final Map<NavBackStackEntry, AtomicInt> getParentToChildCount$navigation_runtime_release() {
        return this.parentToChildCount;
    }

    public final InterfaceC9540l getPopFromBackStackHandler$navigation_runtime_release() {
        return this.popFromBackStackHandler;
    }

    public final NavBackStackEntry getPreviousBackStackEntry$navigation_runtime_release() {
        Object next;
        Iterator it = AbstractC10947g0.m23908J0(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = AbstractC10666n.m22561e(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    public final NavGraph getTopGraph$navigation_runtime_release() {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m23971k();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            AbstractC9979u.m20291d(destination);
        }
        NavGraph navGraph = destination instanceof NavGraph ? (NavGraph) destination : null;
        if (navGraph != null) {
            return navGraph;
        }
        NavGraph parent = destination.getParent();
        AbstractC9979u.m20291d(parent);
        return parent;
    }

    public final InterfaceC9529a getUpdateOnBackPressedCallbackEnabledCallback() {
        return this.updateOnBackPressedCallbackEnabledCallback;
    }

    public final NavControllerViewModel getViewModel$navigation_runtime_release() {
        return this.viewModel;
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$navigation_runtime_release(int i10) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        NavBackStackEntry backStackEntry$navigation_runtime_release = getBackStackEntry$navigation_runtime_release(i10);
        if (backStackEntry$navigation_runtime_release.getDestination() instanceof NavGraph) {
            return backStackEntry$navigation_runtime_release;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + i10 + " is on the NavController's back stack").toString());
    }

    public final InterfaceC11612u getVisibleEntries$navigation_runtime_release() {
        return this.visibleEntries;
    }

    public final InterfaceC11603l get_currentBackStack$navigation_runtime_release() {
        return this._currentBackStack;
    }

    public final InterfaceC11602k get_currentBackStackEntryFlow$navigation_runtime_release() {
        return this._currentBackStackEntryFlow;
    }

    public final NavGraph get_graph$navigation_runtime_release() {
        return this._graph;
    }

    public final NavigatorProvider get_navigatorProvider$navigation_runtime_release() {
        return this._navigatorProvider;
    }

    public final InterfaceC11603l get_visibleEntries$navigation_runtime_release() {
        return this._visibleEntries;
    }

    public final void linkChildToParent$navigation_runtime_release(NavBackStackEntry child, NavBackStackEntry parent) {
        AbstractC9979u.m20294g(child, "child");
        AbstractC9979u.m20294g(parent, "parent");
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInt(0));
        }
        AtomicInt atomicInt = this.parentToChildCount.get(parent);
        AbstractC9979u.m20291d(atomicInt);
        atomicInt.incrementAndGet$navigation_runtime_release();
    }

    public final void markTransitionComplete$navigation_runtime_release(NavController.NavControllerNavigatorState state, NavBackStackEntry entry, InterfaceC9529a superCallback) {
        NavControllerViewModel navControllerViewModel;
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(entry, "entry");
        AbstractC9979u.m20294g(superCallback, "superCallback");
        boolean zM20289b = AbstractC9979u.m20289b(this.entrySavedState.get(entry), Boolean.TRUE);
        superCallback.invoke();
        this.entrySavedState.remove(entry);
        if (this.backQueue.contains(entry)) {
            if (state.isNavigating()) {
                return;
            }
            updateBackStackLifecycle$navigation_runtime_release();
            this._currentBackStack.mo20854a(AbstractC10947g0.m23925a1(this.backQueue));
            this._visibleEntries.mo20854a(populateVisibleEntries$navigation_runtime_release());
            return;
        }
        unlinkChildFromParent$navigation_runtime_release(entry);
        if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
        }
        C10958m c10958m = this.backQueue;
        if (c10958m == null || !c10958m.isEmpty()) {
            Iterator<E> it = c10958m.iterator();
            while (it.hasNext()) {
                if (AbstractC9979u.m20289b(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                    break;
                }
            }
            if (!zM20289b && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(entry.getId());
            }
        } else if (!zM20289b) {
            navControllerViewModel.clear(entry.getId());
        }
        updateBackStackLifecycle$navigation_runtime_release();
        this._visibleEntries.mo20854a(populateVisibleEntries$navigation_runtime_release());
    }

    public final void navigate$navigation_runtime_release(Uri deepLink) {
        AbstractC9979u.m20294g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null));
    }

    public final void navigateInternal$navigation_runtime_release(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras, InterfaceC9540l handler) {
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(entries, "entries");
        AbstractC9979u.m20294g(handler, "handler");
        this.addToBackStackHandler = handler;
        navigator.navigate(entries, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    public final void onGraphCreated$navigation_runtime_release(Bundle bundle) {
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null) {
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle2);
            if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                for (String str : SavedStateReader.m33898getStringListimpl(bundleM33824constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                    Navigator navigator = this._navigatorProvider.getNavigator(str);
                    if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, str)) {
                        navigator.onRestoreState(SavedStateReader.m33881getSavedStateimpl(bundleM33824constructorimpl, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        int i10 = 0;
        if (bundleArr != null) {
            for (Bundle bundle3 : bundleArr) {
                NavBackStackEntryState navBackStackEntryState = new NavBackStackEntryState(bundle3);
                NavDestination navDestinationFindDestination$navigation_runtime_release$default = findDestination$navigation_runtime_release$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (navDestinationFindDestination$navigation_runtime_release$default == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination$navigation_runtime_release());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestination$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination$navigation_runtime_release$default.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map = this.navigatorState;
                NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = map.get(navigator2);
                if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release == null) {
                    navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator2);
                    map.put(navigator2, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release);
                }
                this.backQueue.add(navBackStackEntryInstantiate);
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent$navigation_runtime_release(navBackStackEntryInstantiate, getBackStackEntry$navigation_runtime_release(parent.getId()));
                }
            }
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            Navigator<? extends NavDestination> navigator3 = (Navigator) obj2;
            Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map2 = this.navigatorState;
            NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = map2.get(navigator3);
            if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 == null) {
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator3);
                map2.put(navigator3, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
            }
            navigator3.onAttach(navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            dispatchOnDestinationChanged$navigation_runtime_release();
        } else {
            if (this.navController.checkDeepLinkHandled$navigation_runtime_release()) {
                return;
            }
            NavGraph navGraph = this._graph;
            AbstractC9979u.m20291d(navGraph);
            navigate$navigation_runtime_release(navGraph, bundle, null, null);
        }
    }

    public final void pop$navigation_runtime_release(NavController.NavControllerNavigatorState state, NavBackStackEntry popUpTo, boolean z10, final InterfaceC9529a superCallback) {
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        AbstractC9979u.m20294g(superCallback, "superCallback");
        Navigator navigator = this._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
        this.entrySavedState.put(popUpTo, Boolean.valueOf(z10));
        if (!AbstractC9979u.m20289b(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            AbstractC9979u.m20291d(navControllerNavigatorState);
            navControllerNavigatorState.pop(popUpTo, z10);
        } else {
            InterfaceC9540l interfaceC9540l = this.popFromBackStackHandler;
            if (interfaceC9540l == null) {
                popBackStackFromNavigator$navigation_runtime_release(popUpTo, new InterfaceC9529a() { // from class: androidx.navigation.internal.p
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return NavControllerImpl.pop$lambda$6(superCallback);
                    }
                });
            } else {
                interfaceC9540l.invoke(popUpTo);
                superCallback.invoke();
            }
        }
    }

    public final boolean popBackStack$navigation_runtime_release() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination$navigation_runtime_release = getCurrentDestination$navigation_runtime_release();
        AbstractC9979u.m20291d(currentDestination$navigation_runtime_release);
        return popBackStack$navigation_runtime_release(currentDestination$navigation_runtime_release.getId(), true);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, InterfaceC9529a onComplete) {
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        AbstractC9979u.m20294g(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.Companion.m1940i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.backQueue.size()) {
            popBackStackInternal$navigation_runtime_release(((NavBackStackEntry) this.backQueue.get(i10)).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$navigation_runtime_release$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void popBackStackInternal$navigation_runtime_release(Navigator<? extends NavDestination> navigator, NavBackStackEntry popUpTo, boolean z10, InterfaceC9540l handler) {
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        AbstractC9979u.m20294g(handler, "handler");
        this.popFromBackStackHandler = handler;
        navigator.popBackStack(popUpTo, z10);
        this.popFromBackStackHandler = null;
    }

    public final void popEntryFromBackStack$navigation_runtime_release(NavBackStackEntry popUpTo, boolean z10, C10958m savedState) {
        NavControllerViewModel navControllerViewModel;
        InterfaceC11612u transitionsInProgress;
        Set set;
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        AbstractC9979u.m20294g(savedState, "savedState");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        if (!AbstractC9979u.m20289b(navBackStackEntry, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry.getDestination() + ')').toString());
        }
        AbstractC10937b0.m23870O(this.backQueue);
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider$navigation_runtime_release().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
        boolean z11 = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(navBackStackEntry)) && !this.parentToChildCount.containsKey(navBackStackEntry)) {
            z11 = false;
        }
        Lifecycle.State currentState = navBackStackEntry.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z10) {
                navBackStackEntry.setMaxLifecycle(state);
                savedState.addFirst(new NavBackStackEntryState(navBackStackEntry));
            }
            if (z11) {
                navBackStackEntry.setMaxLifecycle(state);
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            }
        }
        if (z10 || z11 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntry.getId());
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavController.NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC10937b0.m23857B(arrayList, arrayList2);
        }
        C10958m c10958m = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c10958m) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        AbstractC10937b0.m23857B(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList.get(i10);
            i10++;
            if (!(((NavBackStackEntry) obj3).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void prepareForTransition$navigation_runtime_release(NavBackStackEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        if (!this.backQueue.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.setMaxLifecycle(Lifecycle.State.STARTED);
    }

    public final void push$navigation_runtime_release(NavController.NavControllerNavigatorState state, NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        Navigator navigator = this._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
        if (!AbstractC9979u.m20289b(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
        InterfaceC9540l interfaceC9540l = this.addToBackStackHandler;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(backStackEntry);
            state.addInternal(backStackEntry);
            return;
        }
        Log.Companion.m1940i(TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
    }

    public final void removeOnDestinationChangedListener$navigation_runtime_release(NavController.OnDestinationChangedListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    public final void restoreState$navigation_runtime_release(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        this.navigatorStateToRestore = SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_NAVIGATOR_STATE) ? SavedStateReader.m33881getSavedStateimpl(bundleM33824constructorimpl, KEY_NAVIGATOR_STATE) : null;
        int i10 = 0;
        this.backStackToRestore = SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_BACK_STACK) ? (Bundle[]) SavedStateReader.m33884getSavedStateListimpl(bundleM33824constructorimpl, KEY_BACK_STACK).toArray(new Bundle[0]) : null;
        this.backStackStates.clear();
        if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_BACK_STACK_DEST_IDS) && SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_BACK_STACK_IDS)) {
            int[] iArrM33856getIntArrayimpl = SavedStateReader.m33856getIntArrayimpl(bundleM33824constructorimpl, KEY_BACK_STACK_DEST_IDS);
            List<String> listM33898getStringListimpl = SavedStateReader.m33898getStringListimpl(bundleM33824constructorimpl, KEY_BACK_STACK_IDS);
            int length = iArrM33856getIntArrayimpl.length;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                this.backStackMap.put(Integer.valueOf(iArrM33856getIntArrayimpl[i10]), !AbstractC9979u.m20289b(listM33898getStringListimpl.get(i11), "") ? listM33898getStringListimpl.get(i11) : null);
                i10++;
                i11 = i12;
            }
        }
        if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
            for (String str : SavedStateReader.m33898getStringListimpl(bundleM33824constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
                if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, KEY_BACK_STACK_STATES_PREFIX + str)) {
                    List<Bundle> listM33884getSavedStateListimpl = SavedStateReader.m33884getSavedStateListimpl(bundleM33824constructorimpl, KEY_BACK_STACK_STATES_PREFIX + str);
                    Map<String, C10958m> map = this.backStackStates;
                    C10958m c10958m = new C10958m(listM33884getSavedStateListimpl.size());
                    Iterator<Bundle> it = listM33884getSavedStateListimpl.iterator();
                    while (it.hasNext()) {
                        c10958m.add(new NavBackStackEntryState(it.next()));
                    }
                    map.put(str, c10958m);
                }
            }
        }
    }

    public final Bundle saveState$navigation_runtime_release() {
        Pair[] pairArr;
        Bundle bundleBundleOf;
        Pair[] pairArr2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        Pair[] pairArr5;
        ArrayList arrayList = new ArrayList();
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList2.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf2);
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry2 : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleOnSaveState = entry2.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                SavedStateWriter.m33937putSavedStateimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf2), key, bundleOnSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundleBundleOf = null;
        } else {
            Map mapM20088h2 = AbstractC9925a.m20088h();
            if (mapM20088h2.isEmpty()) {
                pairArr5 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapM20088h2.size());
                for (Map.Entry entry3 : mapM20088h2.entrySet()) {
                    arrayList3.add(AbstractC10776g.m22975a((String) entry3.getKey(), entry3.getValue()));
                }
                pairArr5 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length));
            Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
            SavedStateWriter.m33945putStringListimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf2), KEY_NAVIGATOR_STATE_NAMES, arrayList);
            SavedStateWriter.m33937putSavedStateimpl(bundleM33910constructorimpl, KEY_NAVIGATOR_STATE, bundleBundleOf2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM20088h3 = AbstractC9925a.m20088h();
                if (mapM20088h3.isEmpty()) {
                    pairArr4 = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapM20088h3.size());
                    for (Map.Entry entry4 : mapM20088h3.entrySet()) {
                        arrayList4.add(AbstractC10776g.m22975a((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr4 = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length));
                SavedStateWriter.m33910constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<E> it = this.backQueue.iterator();
            while (it.hasNext()) {
                arrayList5.add(new NavBackStackEntryState((NavBackStackEntry) it.next()).writeToState());
            }
            SavedStateWriter.m33939putSavedStateListimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf), KEY_BACK_STACK, arrayList5);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM20088h4 = AbstractC9925a.m20088h();
                if (mapM20088h4.isEmpty()) {
                    pairArr3 = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapM20088h4.size());
                    for (Map.Entry entry5 : mapM20088h4.entrySet()) {
                        arrayList6.add(AbstractC10776g.m22975a((String) entry5.getKey(), entry5.getValue()));
                    }
                    pairArr3 = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                SavedStateWriter.m33910constructorimpl(bundleBundleOf);
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList arrayList7 = new ArrayList();
            int i10 = 0;
            for (Map.Entry<Integer, String> entry6 : this.backStackMap.entrySet()) {
                int iIntValue = entry6.getKey().intValue();
                String value = entry6.getValue();
                int i11 = i10 + 1;
                iArr[i10] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList7.add(value);
                i10 = i11;
            }
            Bundle bundleM33910constructorimpl2 = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
            SavedStateWriter.m33928putIntArrayimpl(bundleM33910constructorimpl2, KEY_BACK_STACK_DEST_IDS, iArr);
            SavedStateWriter.m33945putStringListimpl(bundleM33910constructorimpl2, KEY_BACK_STACK_IDS, arrayList7);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM20088h5 = AbstractC9925a.m20088h();
                if (mapM20088h5.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapM20088h5.size());
                    for (Map.Entry entry7 : mapM20088h5.entrySet()) {
                        arrayList8.add(AbstractC10776g.m22975a((String) entry7.getKey(), entry7.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList8.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                SavedStateWriter.m33910constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry<String, C10958m> entry8 : this.backStackStates.entrySet()) {
                String key2 = entry8.getKey();
                C10958m value2 = entry8.getValue();
                arrayList9.add(key2);
                ArrayList arrayList10 = new ArrayList();
                Iterator<E> it2 = value2.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(((NavBackStackEntryState) it2.next()).writeToState());
                }
                SavedStateWriter.m33939putSavedStateListimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_PREFIX + key2, arrayList10);
            }
            SavedStateWriter.m33945putStringListimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_IDS, arrayList9);
        }
        return bundleBundleOf;
    }

    public final void setAddToBackStackHandler$navigation_runtime_release(InterfaceC9540l interfaceC9540l) {
        this.addToBackStackHandler = interfaceC9540l;
    }

    public final void setBackStackToRestore$navigation_runtime_release(Bundle[] bundleArr) {
        this.backStackToRestore = bundleArr;
    }

    @CallSuper
    @MainThread
    public final void setGraph$navigation_runtime_release(NavGraph graph) {
        AbstractC9979u.m20294g(graph, "graph");
        setGraph$navigation_runtime_release(graph, null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        AbstractC9979u.m20294g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setLifecycleOwner$navigation_runtime_release(LifecycleOwner owner) {
        Lifecycle lifecycle;
        AbstractC9979u.m20294g(owner, "owner");
        if (AbstractC9979u.m20289b(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigatorProvider$navigation_runtime_release(NavigatorProvider navigatorProvider) {
        AbstractC9979u.m20294g(navigatorProvider, "navigatorProvider");
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this._navigatorProvider = navigatorProvider;
    }

    public final void setNavigatorStateToRestore$navigation_runtime_release(Bundle bundle) {
        this.navigatorStateToRestore = bundle;
    }

    public final void setPopFromBackStackHandler$navigation_runtime_release(InterfaceC9540l interfaceC9540l) {
        this.popFromBackStackHandler = interfaceC9540l;
    }

    public final void setUpdateOnBackPressedCallbackEnabledCallback(InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20294g(interfaceC9529a, "<set-?>");
        this.updateOnBackPressedCallbackEnabledCallback = interfaceC9529a;
    }

    public final void setViewModel$navigation_runtime_release(NavControllerViewModel navControllerViewModel) {
        this.viewModel = navControllerViewModel;
    }

    public final void setViewModelStore$navigation_runtime_release(ViewModelStore viewModelStore) {
        AbstractC9979u.m20294g(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (AbstractC9979u.m20289b(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    public final void set_graph$navigation_runtime_release(NavGraph navGraph) {
        this._graph = navGraph;
    }

    public final void set_navigatorProvider$navigation_runtime_release(NavigatorProvider navigatorProvider) {
        AbstractC9979u.m20294g(navigatorProvider, "<set-?>");
        this._navigatorProvider = navigatorProvider;
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        AbstractC9979u.m20294g(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInt atomicInt = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInt != null ? Integer.valueOf(atomicInt.decrementAndGet$navigation_runtime_release()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInt atomicInt;
        InterfaceC11612u transitionsInProgress;
        Set set;
        List<NavBackStackEntry> listM23925a1 = AbstractC10947g0.m23925a1(this.backQueue);
        if (listM23925a1.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) AbstractC10947g0.m23956y0(listM23925a1)).getDestination();
        List listM24141s = AbstractC10978w.m24141s(destination);
        if (destination instanceof SupportingPane) {
            boolean z10 = destination instanceof FloatingWindow;
            Iterator it = AbstractC10947g0.m23936g0(AbstractC10947g0.m23908J0(listM23925a1), 1).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                if (z10 && !(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
                listM24141s.add(destination2);
                if (!(destination2 instanceof SupportingPane) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (AbstractC10947g0.m23956y0(listM24141s) instanceof FloatingWindow) {
            Iterator it2 = AbstractC10947g0.m23908J0(listM23925a1).iterator();
            while (it2.hasNext()) {
                NavDestination destination3 = ((NavBackStackEntry) it2.next()).getDestination();
                arrayList.add(destination3);
                if (!(destination3 instanceof FloatingWindow) && !(destination3 instanceof SupportingPane) && !(destination3 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : AbstractC10947g0.m23908J0(listM23925a1)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination4 = navBackStackEntry.getDestination();
            NavDestination navDestination = (NavDestination) AbstractC10947g0.m23946o0(listM24141s);
            if (navDestination != null && navDestination.getId() == destination4.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider$navigation_runtime_release().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (AbstractC9979u.m20289b((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInt = this.parentToChildCount.get(navBackStackEntry)) != null && atomicInt.get$navigation_runtime_release() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        map.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination2 = (NavDestination) AbstractC10947g0.m23946o0(arrayList);
                if (navDestination2 != null && navDestination2.getId() == destination4.getId()) {
                    AbstractC10937b0.m23868M(arrayList);
                }
                AbstractC10937b0.m23868M(listM24141s);
                NavGraph parent = destination4.getParent();
                if (parent != null) {
                    listM24141s.add(parent);
                }
            } else if (arrayList.isEmpty() || destination4.getId() != ((NavDestination) AbstractC10947g0.m23944m0(arrayList)).getId()) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                NavDestination navDestination3 = (NavDestination) AbstractC10937b0.m23868M(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent2 = navDestination3.getParent();
                if (parent2 != null && !arrayList.contains(parent2)) {
                    arrayList.add(parent2);
                }
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : listM23925a1) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release((NavControllerImpl) obj, navOptions, extras);
    }

    public final void navigate$navigation_runtime_release(Uri deepLink, NavOptions navOptions) {
        AbstractC9979u.m20294g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    public final void setGraph$navigation_runtime_release(NavGraph graph, Bundle bundle) {
        NavControllerImpl navControllerImpl;
        AbstractC9979u.m20294g(graph, "graph");
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        int i10 = 0;
        if (!AbstractC9979u.m20289b(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                ArrayList arrayList = new ArrayList(this.backStackMap.keySet());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Integer num = (Integer) obj;
                    AbstractC9979u.m20291d(num);
                    clearBackStackInternal$navigation_runtime_release(num.intValue());
                }
                navControllerImpl = this;
                popBackStackInternal$navigation_runtime_release$default(navControllerImpl, navGraph.getId(), true, false, 4, (Object) null);
            } else {
                navControllerImpl = this;
            }
            navControllerImpl._graph = graph;
            onGraphCreated$navigation_runtime_release(bundle);
            return;
        }
        int size2 = graph.getNodes().size();
        while (i10 < size2) {
            NavDestination navDestinationValueAt = graph.getNodes().valueAt(i10);
            NavGraph navGraph2 = this._graph;
            AbstractC9979u.m20291d(navGraph2);
            int iKeyAt = navGraph2.getNodes().keyAt(i10);
            NavGraph navGraph3 = this._graph;
            AbstractC9979u.m20291d(navGraph3);
            navGraph3.getNodes().replace(iKeyAt, navDestinationValueAt);
            i10++;
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> listM23880V = AbstractC10939c0.m23880V(AbstractC10669q.m22574F(NavDestination.Companion.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestinationFindNode = this._graph;
            AbstractC9979u.m20291d(navDestinationFindNode);
            for (NavDestination navDestination : listM23880V) {
                if (!AbstractC9979u.m20289b(navDestination, this._graph) || !AbstractC9979u.m20289b(navDestinationFindNode, graph)) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        navDestinationFindNode = ((NavGraph) navDestinationFindNode).findNode(navDestination.getId());
                        AbstractC9979u.m20291d(navDestinationFindNode);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestinationFindNode);
        }
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(i10, z10, z11);
    }

    public final boolean clearBackStack$navigation_runtime_release(int i10) {
        return clearBackStackInternal$navigation_runtime_release(i10) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void navigate$navigation_runtime_release(Uri deepLink, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9979u.m20294g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    public final boolean popBackStack$navigation_runtime_release(int i10, boolean z10) {
        return popBackStack$navigation_runtime_release(i10, z10, false);
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release((NavControllerImpl) obj, z10, z11);
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest request) {
        AbstractC9979u.m20294g(request, "request");
        navigate$navigation_runtime_release(request, (NavOptions) null);
    }

    public final boolean popBackStack$navigation_runtime_release(int i10, boolean z10, boolean z11) {
        return popBackStackInternal$navigation_runtime_release(i10, z10, z11) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean popBackStackInternal$navigation_runtime_release(int i10, boolean z10, boolean z11) {
        NavDestination destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC10947g0.m23908J0(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (z10 || destination.getId() != i10) {
                arrayList.add(navigator);
            }
            if (destination.getId() == i10) {
                break;
            }
        }
        if (destination == null) {
            String displayName = NavDestination.Companion.getDisplayName(getNavContext(), i10);
            Log.Companion.m1940i(TAG, "Ignoring popBackStack to destination " + displayName + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, z10, z11);
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(InterfaceC10469c route) {
        AbstractC9979u.m20294g(route, "route");
        return clearBackStack$navigation_runtime_release(RouteSerializerKt.generateHashCode(AbstractC5447q.m2953c(route)));
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest request, NavOptions navOptions) {
        AbstractC9979u.m20294g(request, "request");
        navigate$navigation_runtime_release(request, navOptions, (Navigator.Extras) null);
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(T route) {
        AbstractC9979u.m20294g(route, "route");
        return clearBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route)) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras extras) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(request, "request");
        if (this._graph != null) {
            NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(request, true, true, topGraph$navigation_runtime_release);
            if (deepLinkMatchMatchDeepLinkComprehensive != null) {
                Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
                if (bundleAddInDefaultArgs == null) {
                    Map mapM20088h = AbstractC9925a.m20088h();
                    if (mapM20088h.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapM20088h.size());
                        for (Map.Entry entry : mapM20088h.entrySet()) {
                            arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m33910constructorimpl(bundleAddInDefaultArgs);
                }
                NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
                this.navController.writeIntent$navigation_runtime_release(request, bundleAddInDefaultArgs);
                navigate$navigation_runtime_release(destination, bundleAddInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this.navController + '.').toString());
    }

    public final boolean popBackStack$navigation_runtime_release(String route, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(route, "route");
        return popBackStackInternal$navigation_runtime_release(route, z10, z11) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    private final boolean restoreStateInternal(String str) {
        NavBackStackEntryState navBackStackEntryState;
        int iHashCode = NavDestination.Companion.createRoute(str).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(iHashCode))) {
            return restoreStateInternal(iHashCode, null, null, null);
        }
        NavDestination navDestinationFindDestination$navigation_runtime_release = findDestination$navigation_runtime_release(str);
        if (navDestinationFindDestination$navigation_runtime_release != null) {
            final String str2 = this.backStackMap.get(Integer.valueOf(navDestinationFindDestination$navigation_runtime_release.getId()));
            AbstractC10937b0.m23863H(this.backStackMap.values(), new InterfaceC9540l() { // from class: androidx.navigation.internal.o
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$53(str2, (String) obj));
                }
            });
            C10958m c10958m = (C10958m) AbstractC9962d0.m20253d(this.backStackStates).remove(str2);
            NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindDestination$navigation_runtime_release.matchRoute(str);
            AbstractC9979u.m20291d(deepLinkMatchMatchRoute);
            if (deepLinkMatchMatchRoute.hasMatchingArgs((c10958m == null || (navBackStackEntryState = (NavBackStackEntryState) c10958m.m23969f()) == null) ? null : navBackStackEntryState.getArgs())) {
                return executeRestoreState(instantiateBackStack(c10958m), null, null, null);
            }
            return false;
        }
        throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + getCurrentDestination$navigation_runtime_release()).toString());
    }

    public final NavDestination findDestination$navigation_runtime_release(String route) {
        AbstractC9979u.m20294g(route, "route");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        AbstractC9979u.m20291d(navGraph);
        if (!AbstractC9979u.m20289b(navGraph.getRoute(), route)) {
            NavGraph navGraph2 = this._graph;
            AbstractC9979u.m20291d(navGraph2);
            if (navGraph2.matchRoute(route) == null) {
                return getTopGraph$navigation_runtime_release().findNode(route);
            }
        }
        return this._graph;
    }

    public final <T> boolean popBackStack$navigation_runtime_release(InterfaceC10469c route, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(route, "route");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(AbstractC5447q.m2953c(route));
        if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) != null) {
            return popBackStack$navigation_runtime_release(iGenerateHashCode, z10, z11);
        }
        throw new IllegalArgumentException(("Destination with route " + route.mo20277f() + " cannot be found in navigation graph " + getGraph$navigation_runtime_release()).toString());
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(String route) {
        AbstractC9979u.m20294g(route, "route");
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(route);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(route, true, false);
    }

    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(String route) {
        Object objPrevious;
        AbstractC9979u.m20294g(route, "route");
        C10958m c10958m = this.backQueue;
        ListIterator<E> listIterator = c10958m.listIterator(c10958m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination$navigation_runtime_release()).toString());
    }

    public final <T> boolean popBackStack$navigation_runtime_release(T route, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(route, "route");
        return popBackStackInternal$navigation_runtime_release((NavControllerImpl) route, z10, z11) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final <T> boolean popBackStackInternal$navigation_runtime_release(T route, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(route, "route");
        return popBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route), z10, z11);
    }

    public final boolean popBackStackInternal$navigation_runtime_release(String route, boolean z10, boolean z11) {
        Object objPrevious;
        AbstractC9979u.m20294g(route, "route");
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C10958m c10958m = this.backQueue;
        ListIterator<E> listIterator = c10958m.listIterator(c10958m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            boolean zHasRoute = navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments());
            if (z10 || !zHasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            }
            if (zHasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination == null) {
            Log.Companion.m1940i(TAG, "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, z10, z11);
    }

    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(InterfaceC10469c route) {
        Object objPrevious;
        AbstractC9979u.m20294g(route, "route");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(AbstractC5447q.m2953c(route));
        if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) != null) {
            List list = (List) this.currentBackStack.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((NavBackStackEntry) objPrevious).getDestination().getId() == iGenerateHashCode) {
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (navBackStackEntry != null) {
                return navBackStackEntry;
            }
            throw new IllegalArgumentException(("No destination with route " + route.mo20277f() + " is on the NavController's back stack. The current destination is " + getCurrentDestination$navigation_runtime_release()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + route.mo20277f() + " cannot be found in navigation graph " + getGraph$navigation_runtime_release()).toString());
    }

    public final void navigate$navigation_runtime_release(final NavDestination node, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        boolean z10;
        boolean z11;
        boolean zPopBackStackInternal$navigation_runtime_release;
        AbstractC9979u.m20294g(node, "node");
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (navOptions == null) {
            z10 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                AbstractC9979u.m20291d(popUpToRoute);
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(popUpToRoute, navOptions.isPopUpToInclusive(), navOptions.shouldPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteClass() != null) {
                InterfaceC10469c popUpToRouteClass = navOptions.getPopUpToRouteClass();
                AbstractC9979u.m20291d(popUpToRouteClass);
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(RouteSerializerKt.generateHashCode(AbstractC5447q.m2953c(popUpToRouteClass)), navOptions.isPopUpToInclusive(), navOptions.shouldPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                AbstractC9979u.m20291d(popUpToRouteObject);
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release((NavControllerImpl) popUpToRouteObject, navOptions.isPopUpToInclusive(), navOptions.shouldPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive(), navOptions.shouldPopUpToSaveState());
                }
                z10 = false;
            }
            z10 = zPopBackStackInternal$navigation_runtime_release;
        }
        final Bundle bundleAddInDefaultArgs = node.addInDefaultArgs(bundle);
        if (navOptions != null && navOptions.shouldRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            ref$BooleanRef.f23398c = restoreStateInternal(node.getId(), bundleAddInDefaultArgs, navOptions, extras);
            z11 = false;
        } else {
            z11 = navOptions != null && navOptions.shouldLaunchSingleTop() && launchSingleTopInternal(node, bundle);
            if (!z11) {
                navigateInternal$navigation_runtime_release(this._navigatorProvider.getNavigator(node.getNavigatorName()), AbstractC10976v.m24126e(NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, getNavContext(), node, bundleAddInDefaultArgs, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null)), navOptions, extras, new InterfaceC9540l() { // from class: androidx.navigation.internal.j
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.navigate$lambda$44(ref$BooleanRef, this, node, bundleAddInDefaultArgs, (NavBackStackEntry) obj);
                    }
                });
            }
        }
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        if (!z10 && !ref$BooleanRef.f23398c && !z11) {
            updateBackStackLifecycle$navigation_runtime_release();
        } else {
            dispatchOnDestinationChanged$navigation_runtime_release();
        }
    }

    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(T route) {
        AbstractC9979u.m20294g(route, "route");
        return getBackStackEntry$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route));
    }

    public final void navigate$navigation_runtime_release(String route, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(builder, "builder");
        navigate$navigation_runtime_release$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public final void navigate$navigation_runtime_release(String route, NavOptions navOptions, Navigator.Extras extras) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(route, "route");
        if (this._graph != null) {
            NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
            NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = topGraph$navigation_runtime_release.matchRouteComprehensive(route, true, true, topGraph$navigation_runtime_release);
            if (deepLinkMatchMatchRouteComprehensive != null) {
                NavDestination destination = deepLinkMatchMatchRouteComprehensive.getDestination();
                Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchRouteComprehensive.getMatchingArgs());
                if (bundleAddInDefaultArgs == null) {
                    Map mapM20088h = AbstractC9925a.m20088h();
                    if (mapM20088h.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapM20088h.size());
                        for (Map.Entry entry : mapM20088h.entrySet()) {
                            arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m33910constructorimpl(bundleAddInDefaultArgs);
                }
                NavDestination destination2 = deepLinkMatchMatchRouteComprehensive.getDestination();
                this.navController.writeIntent$navigation_runtime_release(NavDeepLinkRequest.Builder.Companion.fromUri(NavUriKt.NavUri(NavDestination.Companion.createRoute(destination.getRoute()))).build(), bundleAddInDefaultArgs);
                navigate$navigation_runtime_release(destination2, bundleAddInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public final <T> void navigate$navigation_runtime_release(T route, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(builder, "builder");
        navigate$navigation_runtime_release$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public final <T> void navigate$navigation_runtime_release(T route, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9979u.m20294g(route, "route");
        navigate$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route), navOptions, extras);
    }
}

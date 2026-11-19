package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavControllerImpl;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9078a;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p101f8.AbstractC8476n;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p134i7.C8791m;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public class NavController {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private Activity activity;
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;
    private final NavControllerImpl impl;
    private NavInflater inflater;
    private final NavContext navContext;
    private final InterfaceC8724d navInflater$delegate;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z10) {
            NavController.deepLinkSaveState = z10;
        }

        private Companion() {
        }
    }

    public class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            AbstractC9133u.m16133g(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8736p markTransitionComplete$lambda$1(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return C8736p.f16368a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8736p pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z10) {
            super.pop(navBackStackEntry, z10);
            return C8736p.f16368a;
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle bundle) {
            AbstractC9133u.m16133g(destination, "destination");
            return this.this$0.impl.createBackStackEntry$navigation_runtime_release(destination, bundle);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(final NavBackStackEntry entry) {
            AbstractC9133u.m16133g(entry, "entry");
            this.this$0.impl.markTransitionComplete$navigation_runtime_release(this, entry, new InterfaceC10559a() { // from class: androidx.navigation.i
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1(this.f1763a, entry);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry popUpTo, final boolean z10) {
            AbstractC9133u.m16133g(popUpTo, "popUpTo");
            this.this$0.impl.pop$navigation_runtime_release(this, popUpTo, z10, new InterfaceC10559a() { // from class: androidx.navigation.j
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.pop$lambda$0(this.f1793a, popUpTo, z10);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean z10) {
            AbstractC9133u.m16133g(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z10);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry entry) {
            AbstractC9133u.m16133g(entry, "entry");
            super.prepareForTransition(entry);
            this.this$0.impl.prepareForTransition$navigation_runtime_release(entry);
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
            this.this$0.impl.push$navigation_runtime_release(this, backStackEntry);
        }
    }

    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context) {
        Object next;
        AbstractC9133u.m16133g(context, "context");
        this.context = context;
        this.impl = new NavControllerImpl(this, new InterfaceC10559a() { // from class: androidx.navigation.e
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavController.impl$lambda$0(this.f1738a);
            }
        });
        this.navContext = new NavContext(context);
        Iterator it = AbstractC8476n.m13833h(context, new InterfaceC10570l() { // from class: androidx.navigation.f
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavController.activity$lambda$1((Context) obj);
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
        this.navInflater$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavController.navInflater_delegate$lambda$10(this.f1760a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$1(Context it) {
        AbstractC9133u.m16133g(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z10) {
        Companion.enableDeepLinkSaveState(z10);
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i10, NavDestination navDestination, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i10, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i10, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i10, z10, navDestination2);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        return this.impl.m1841x7b9ea851(iArr);
    }

    private final int getDestinationCountOnBackStack() {
        C8791m backQueue$navigation_runtime_release = this.impl.getBackQueue$navigation_runtime_release();
        int i10 = 0;
        if (backQueue$navigation_runtime_release != null && backQueue$navigation_runtime_release.isEmpty()) {
            return 0;
        }
        Iterator<E> it = backQueue$navigation_runtime_release.iterator();
        while (it.hasNext()) {
            if (!(((NavBackStackEntry) it.next()).getDestination() instanceof NavGraph) && (i10 = i10 + 1) < 0) {
                AbstractC8809v.m14779v();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p handleDeepLink$lambda$21(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptions) {
        AbstractC9133u.m16133g(navOptions, "$this$navOptions");
        navOptions.anim(new InterfaceC10570l() { // from class: androidx.navigation.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj);
            }
        });
        if (navDestination instanceof NavGraph) {
            Iterator it = NavDestination.Companion.getHierarchy(navDestination).iterator();
            while (true) {
                if (it.hasNext()) {
                    NavDestination navDestination2 = (NavDestination) it.next();
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (AbstractC9133u.m16128b(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                        break;
                    }
                } else if (deepLinkSaveState) {
                    navOptions.popUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), new InterfaceC10570l() { // from class: androidx.navigation.d
                        @Override // p300x7.InterfaceC10570l
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj);
                        }
                    });
                }
            }
        }
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p handleDeepLink$lambda$21$lambda$18(AnimBuilder anim) {
        AbstractC9133u.m16133g(anim, "$this$anim");
        anim.setEnter(0);
        anim.setExit(0);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p handleDeepLink$lambda$21$lambda$20(PopUpToBuilder popUpTo) {
        AbstractC9133u.m16133g(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavInflater navInflater_delegate$lambda$10(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime_release()) : navInflater;
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStack(str, z10, z11);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int i10, boolean z10, boolean z11) {
        return this.impl.popBackStackInternal$navigation_runtime_release(i10, z10, z11);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStackInternal(i10, z10, z11);
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        Pair[] pairArr;
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        AbstractC9133u.m16130d(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        AbstractC9133u.m16130d(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        AbstractC9133u.m16130d(intArray);
        List listM14744y1 = AbstractC8801r.m14744y1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (listM14744y1.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) AbstractC8768a0.m14493O(listM14744y1)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination navDestinationFindDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), iIntValue, false, null, 4, null);
        if (navDestinationFindDestinationComprehensive$default instanceof NavGraph) {
            iIntValue = NavGraph.Companion.findStartDestination((NavGraph) navDestinationFindDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || iIntValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
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
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        AbstractC9133u.m16130d(intent);
        SavedStateWriter.m27339putParcelableimpl(bundleM27315constructorimpl, KEY_DEEP_LINK_INTENT, intent);
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : listM14744y1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Pair[] pairArr;
        Bundle bundleAddInDefaultArgs;
        NavDestination currentDestination = getCurrentDestination();
        AbstractC9133u.m16130d(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
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
                Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
                Activity activity = this.activity;
                if (activity != null) {
                    AbstractC9133u.m16130d(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        AbstractC9133u.m16130d(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            AbstractC9133u.m16130d(activity3);
                            Intent intent = activity3.getIntent();
                            AbstractC9133u.m16132f(intent, "getIntent(...)");
                            SavedStateWriter.m27339putParcelableimpl(bundleM27315constructorimpl, KEY_DEEP_LINK_INTENT, intent);
                            NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
                            Activity activity4 = this.activity;
                            AbstractC9133u.m16130d(activity4);
                            Intent intent2 = activity4.getIntent();
                            AbstractC9133u.m16132f(intent2, "getIntent(...)");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent2), true, true, topGraph$navigation_runtime_release);
                            if ((deepLinkMatchMatchDeepLinkComprehensive != null ? deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs() : null) != null && (bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs())) != null) {
                                SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundleAddInDefaultArgs);
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundleBundleOf).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.impl.addOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime_release() {
        Activity activity;
        if (this.deepLinkHandled || (activity = this.activity) == null) {
            return false;
        }
        AbstractC9133u.m16130d(activity);
        return handleDeepLink(activity.getIntent());
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release(route);
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime_release(Navigator<? extends NavDestination> navigator) {
        AbstractC9133u.m16133g(navigator, "navigator");
        return new NavControllerNavigatorState(this, navigator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z10) {
        this.enableOnBackPressedCallback = z10;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int i10, NavDestination navDestination) {
        return this.impl.findDestination$navigation_runtime_release(i10, navDestination);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestinationComprehensive(NavDestination navDestination, @IdRes int i10, boolean z10, NavDestination navDestination2) {
        AbstractC9133u.m16133g(navDestination, "<this>");
        return this.impl.findDestinationComprehensive$navigation_runtime_release(navDestination, i10, z10, navDestination2);
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int i10) {
        return this.impl.getBackStackEntry$navigation_runtime_release(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InterfaceC9280q getCurrentBackStack() {
        return this.impl.getCurrentBackStack$navigation_runtime_release();
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime_release();
    }

    public final InterfaceC9266c getCurrentBackStackEntryFlow() {
        return AbstractC9268e.m17011a(this.impl.get_currentBackStackEntryFlow$navigation_runtime_release());
    }

    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime_release();
    }

    public final boolean getDeepLinkHandled$navigation_runtime_release() {
        return this.deepLinkHandled;
    }

    @MainThread
    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime_release();
    }

    public final NavContext getNavContext$navigation_runtime_release() {
        return this.navContext;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this.impl.getNavigatorProvider$navigation_runtime_release();
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime_release();
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i10) {
        return this.impl.getViewModelStoreOwner$navigation_runtime_release(i10);
    }

    public final InterfaceC9280q getVisibleEntries() {
        return this.impl.getVisibleEntries$navigation_runtime_release();
    }

    @MainThread
    public boolean handleDeepLink(Intent intent) {
        int[] intArray;
        Pair[] pairArr;
        NavGraph topGraph$navigation_runtime_release;
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive;
        Pair[] pairArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            } catch (Exception e10) {
                Log.e(NavControllerImpl.TAG, "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList2.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchMatchDeepLinkComprehensive = (topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release()).matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent), true, true, topGraph$navigation_runtime_release)) != null) {
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs != null) {
                SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf), bundleAddInDefaultArgs);
            }
            intArray = iArrBuildDeepLinkIds$default;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
            androidx.navigation.internal.Log.Companion.m1822i(NavControllerImpl.TAG, "Could not find destination " + strFindInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        SavedStateWriter.m27339putParcelableimpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf), KEY_DEEP_LINK_INTENT, intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapM15943h2 = AbstractC9080a.m15943h();
            if (mapM15943h2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapM15943h2.size());
                for (Map.Entry entry2 : mapM15943h2.entrySet()) {
                    arrayList3.add(AbstractC8726f.m14230a((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf2);
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundleBundleOf);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i10)) != null) {
                SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundle);
            }
            bundleArr[i10] = bundleBundleOf2;
        }
        int flags = intent.getFlags();
        int i11 = 268435456 & flags;
        if (i11 == 0 || (flags & 32768) != 0) {
            return handleDeepLink(intArray, bundleArr, i11 != 0);
        }
        intent.addFlags(32768);
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(intent);
        AbstractC9133u.m16132f(taskStackBuilderAddNextIntentWithParentStack, "addNextIntentWithParentStack(...)");
        taskStackBuilderAddNextIntentWithParentStack.startActivities();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    @MainThread
    public final <T> void navigate(T route) {
        AbstractC9133u.m16133g(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @MainThread
    public final <T> boolean popBackStack(InterfaceC8375c route, boolean z10) {
        AbstractC9133u.m16133g(route, "route");
        return popBackStack$default(this, route, z10, false, 4, (Object) null);
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.impl.removeOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    @CallSuper
    public void restoreState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime_release(bundle);
        if (bundle != null) {
            Boolean boolM27241getBooleanOrNullimpl = SavedStateReader.m27241getBooleanOrNullimpl(SavedStateReader.m27229constructorimpl(bundle), KEY_DEEP_LINK_HANDLED);
            this.deepLinkHandled = boolM27241getBooleanOrNullimpl != null ? boolM27241getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    @CallSuper
    public Bundle saveState() {
        Pair[] pairArr;
        Bundle bundleSaveState$navigation_runtime_release = this.impl.saveState$navigation_runtime_release();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime_release == null) {
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
                bundleSaveState$navigation_runtime_release = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m27315constructorimpl(bundleSaveState$navigation_runtime_release);
            }
            SavedStateWriter.m27321putBooleanimpl(SavedStateWriter.m27315constructorimpl(bundleSaveState$navigation_runtime_release), KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime_release;
    }

    public final void setDeepLinkHandled$navigation_runtime_release(boolean z10) {
        this.deepLinkHandled = z10;
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner owner) {
        AbstractC9133u.m16133g(owner, "owner");
        this.impl.setLifecycleOwner$navigation_runtime_release(owner);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider value) {
        AbstractC9133u.m16133g(value, "value");
        this.impl.setNavigatorProvider$navigation_runtime_release(value);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        if (AbstractC9133u.m16128b(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner$navigation_runtime_release = this.impl.getLifecycleOwner$navigation_runtime_release();
        if (lifecycleOwner$navigation_runtime_release == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.addCallback(lifecycleOwner$navigation_runtime_release, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner$navigation_runtime_release.getLifecycle();
        lifecycle.removeObserver(this.impl.getLifecycleObserver$navigation_runtime_release());
        lifecycle.addObserver(this.impl.getLifecycleObserver$navigation_runtime_release());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        AbstractC9133u.m16133g(viewModelStore, "viewModelStore");
        this.impl.setViewModelStore$navigation_runtime_release(viewModelStore);
    }

    public final void writeIntent$navigation_runtime_release(NavDeepLinkRequest request, Bundle args) {
        AbstractC9133u.m16133g(request, "request");
        AbstractC9133u.m16133g(args, "args");
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        SavedStateWriter.m27339putParcelableimpl(SavedStateWriter.m27315constructorimpl(args), KEY_DEEP_LINK_INTENT, intent);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navController.popBackStack(AbstractC9137y.m16154b(Object.class), z10, z11);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i10) {
        return this.impl.clearBackStack$navigation_runtime_release(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.findDestination$navigation_runtime_release(route);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release(route);
    }

    @MainThread
    public final <T> void navigate(T route, NavOptions navOptions) {
        AbstractC9133u.m16133g(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @MainThread
    public final <T> boolean popBackStack(T route, boolean z10) {
        AbstractC9133u.m16133g(route, "route");
        return popBackStack$default(this, (Object) route, z10, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(i10), null);
    }

    @MainThread
    public final /* synthetic */ <T> boolean clearBackStack() {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return clearBackStack(AbstractC9137y.m16154b(Object.class));
    }

    public final /* synthetic */ <T> NavBackStackEntry getBackStackEntry() {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getBackStackEntry(AbstractC9137y.m16154b(Object.class));
    }

    @MainThread
    public final void navigate(String route) {
        AbstractC9133u.m16133g(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z10) {
        AbstractC9133u.m16133g(route, "route");
        return popBackStack$default(this, route, z10, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10, Bundle bundle) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(i10), bundle);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, InterfaceC8375c interfaceC8375c, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStack(interfaceC8375c, z10, z11);
    }

    @MainThread
    public final <T> boolean clearBackStack(InterfaceC8375c route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release(route);
    }

    public final <T> NavBackStackEntry getBackStackEntry(InterfaceC8375c route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release(route);
    }

    @MainThread
    public final void navigate(String route, NavOptions navOptions) {
        AbstractC9133u.m16133g(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @MainThread
    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime_release();
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph, Bundle bundle) {
        AbstractC9133u.m16133g(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph, bundle);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStack((NavController) obj, z10, z11);
    }

    @MainThread
    public final <T> boolean clearBackStack(T route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release((NavControllerImpl) route);
    }

    public final <T> NavBackStackEntry getBackStackEntry(T route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release((NavControllerImpl) route);
    }

    @MainThread
    public void navigate(@IdRes int i10) {
        navigate(i10, (Bundle) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i10, boolean z10) {
        return this.impl.popBackStack$navigation_runtime_release(i10, z10);
    }

    @MainThread
    public void navigate(@IdRes int i10, Bundle bundle) {
        navigate(i10, bundle, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i10, boolean z10, boolean z11) {
        return this.impl.popBackStack$navigation_runtime_release(i10, z10, z11);
    }

    @MainThread
    public void navigate(@IdRes int i10, Bundle bundle, NavOptions navOptions) {
        navigate(i10, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(@androidx.annotation.IdRes int r11, android.os.Bundle r12, androidx.navigation.NavOptions r13, androidx.navigation.Navigator.Extras r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean z10, boolean z11) {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack(AbstractC9137y.m16154b(Object.class), z10, z11);
    }

    @MainThread
    public final <T> boolean popBackStack(InterfaceC8375c route, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, z10, z11);
    }

    @MainThread
    public final <T> boolean popBackStack(T route, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release((NavControllerImpl) route, z10, z11);
    }

    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean z10) {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack(AbstractC9137y.m16154b(Object.class), z10, false);
    }

    @MainThread
    public final boolean handleDeepLink(NavDeepLinkRequest request) {
        Pair[] pairArr;
        Pair[] pairArr2;
        AbstractC9133u.m16133g(request, "request");
        NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(request, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchDeepLinkComprehensive == null) {
            return false;
        }
        NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
        int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
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
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
        if (bundleAddInDefaultArgs != null) {
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundleAddInDefaultArgs);
        }
        int length = iArrBuildDeepLinkIds$default.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapM15943h2 = AbstractC9080a.m15943h();
            if (mapM15943h2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapM15943h2.size());
                for (Map.Entry entry2 : mapM15943h2.entrySet()) {
                    arrayList2.add(AbstractC8726f.m14230a((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf2), bundleBundleOf);
            bundleArr[i10] = bundleBundleOf2;
        }
        return handleDeepLink(iArrBuildDeepLinkIds$default, bundleArr, true);
    }

    @MainThread
    public void navigate(Uri deepLink) {
        AbstractC9133u.m16133g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions) {
        AbstractC9133u.m16133g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9133u.m16133g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request) {
        AbstractC9133u.m16133g(request, "request");
        this.impl.navigate$navigation_runtime_release(request);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        AbstractC9133u.m16133g(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9133u.m16133g(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions, extras);
    }

    @MainThread
    private final void navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        this.impl.navigate$navigation_runtime_release(navDestination, bundle, navOptions, extras);
    }

    @MainThread
    public void navigate(NavDirections directions) {
        AbstractC9133u.m16133g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections directions, NavOptions navOptions) {
        AbstractC9133u.m16133g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        AbstractC9133u.m16133g(directions, "directions");
        AbstractC9133u.m16133g(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(String route, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(builder, "builder");
        this.impl.navigate$navigation_runtime_release(route, builder);
    }

    @MainThread
    public final void navigate(String route, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9133u.m16133g(route, "route");
        this.impl.navigate$navigation_runtime_release(route, navOptions, extras);
    }

    @MainThread
    public final <T> void navigate(T route, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(builder, "builder");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, builder);
    }

    @MainThread
    public final <T> void navigate(T route, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9133u.m16133g(route, "route");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, navOptions, extras);
    }

    @MainThread
    private final boolean handleDeepLink(int[] iArr, Bundle[] bundleArr, boolean z10) {
        NavDestination navDestinationFindNode;
        NavGraph navGraph;
        int i10 = 0;
        if (z10) {
            if (!this.impl.getBackQueue$navigation_runtime_release().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph$navigation_runtime_release();
                AbstractC9133u.m16130d(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                int i12 = i10 + 1;
                Bundle bundle = bundleArr[i10];
                final NavDestination navDestinationFindDestination$default = findDestination$default(this, i11, null, 2, null);
                if (navDestinationFindDestination$default != null) {
                    navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new InterfaceC10570l() { // from class: androidx.navigation.h
                        @Override // p300x7.InterfaceC10570l
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$21(navDestinationFindDestination$default, this, (NavOptionsBuilder) obj);
                        }
                    }), (Navigator.Extras) null);
                    i10 = i12;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.navContext, i11) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this.impl.get_graph$navigation_runtime_release();
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            Bundle bundle2 = bundleArr[i13];
            if (i13 == 0) {
                navDestinationFindNode = this.impl.get_graph$navigation_runtime_release();
            } else {
                AbstractC9133u.m16130d(navGraph3);
                navDestinationFindNode = navGraph3.findNode(i14);
            }
            if (navDestinationFindNode != null) {
                if (i13 != iArr.length - 1) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationFindNode;
                            AbstractC9133u.m16130d(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                        }
                        navGraph3 = navGraph;
                    }
                } else {
                    NavOptions.Builder builder = new NavOptions.Builder();
                    NavGraph navGraph4 = this.impl.get_graph$navigation_runtime_release();
                    AbstractC9133u.m16130d(navGraph4);
                    navigate(navDestinationFindNode, bundle2, NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, (Object) null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                }
            } else {
                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.navContext, i14) + " cannot be found in graph " + navGraph3);
            }
        }
        this.deepLinkHandled = true;
        return true;
    }
}

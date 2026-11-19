package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.C4181R;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.savedstate.SavedStateRegistry;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public class NavHostFragment extends Fragment implements NavHost {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;
    private final InterfaceC8724d navHostController$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.fragment.k
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return NavHostFragment.navHostController_delegate$lambda$6(this.f1757a);
        }
    });
    private View viewParent;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i10, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i10, bundle);
        }

        public final NavHostFragment create(@NavigationRes int i10) {
            return create$default(this, i10, null, 2, null);
        }

        public final NavController findNavController(Fragment fragment) {
            Dialog dialog;
            Window window;
            AbstractC9133u.m16133g(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).getNavHostController$navigation_fragment_release();
                }
                Fragment primaryNavigationFragment = parentFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) primaryNavigationFragment).getNavHostController$navigation_fragment_release();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.findNavController(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        private Companion() {
        }

        public final NavHostFragment create(@NavigationRes int i10, Bundle bundle) {
            Bundle bundle2;
            if (i10 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.KEY_GRAPH_ID, i10);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }
    }

    public static final NavHostFragment create(@NavigationRes int i10) {
        return Companion.create(i10);
    }

    public static final NavController findNavController(Fragment fragment) {
        return Companion.findNavController(fragment);
    }

    private final int getContainerId() {
        int id = getId();
        return (id == 0 || id == -1) ? C4197R.id.nav_host_fragment_container : id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController navHostController_delegate$lambda$6(final NavHostFragment navHostFragment) {
        Context context = navHostFragment.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        final NavHostController navHostController = new NavHostController(context);
        navHostController.setLifecycleOwner(navHostFragment);
        ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
        AbstractC9133u.m16132f(viewModelStore, "<get-viewModelStore>(...)");
        navHostController.setViewModelStore(viewModelStore);
        navHostFragment.onCreateNavHostController(navHostController);
        Bundle bundleConsumeRestoredStateForKey = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_NAV_CONTROLLER_STATE);
        if (bundleConsumeRestoredStateForKey != null) {
            navHostController.restoreState(bundleConsumeRestoredStateForKey);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_NAV_CONTROLLER_STATE, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.l
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$2(navHostController);
            }
        });
        Bundle bundleConsumeRestoredStateForKey2 = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_GRAPH_ID);
        if (bundleConsumeRestoredStateForKey2 != null) {
            navHostFragment.graphId = bundleConsumeRestoredStateForKey2.getInt(KEY_GRAPH_ID);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_GRAPH_ID, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.m
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$4(this.f1759a);
            }
        });
        int i10 = navHostFragment.graphId;
        if (i10 != 0) {
            navHostController.setGraph(i10);
            return navHostController;
        }
        Bundle arguments = navHostFragment.getArguments();
        int i11 = arguments != null ? arguments.getInt(KEY_GRAPH_ID) : 0;
        Bundle bundle = arguments != null ? arguments.getBundle(KEY_START_DESTINATION_ARGS) : null;
        if (i11 != 0) {
            navHostController.setGraph(i11, bundle);
        }
        return navHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$6$lambda$5$lambda$2(NavHostController navHostController) {
        Bundle bundleSaveState = navHostController.saveState();
        if (bundleSaveState != null) {
            return bundleSaveState;
        }
        Bundle EMPTY = Bundle.EMPTY;
        AbstractC9133u.m16132f(EMPTY, "EMPTY");
        return EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$6$lambda$5$lambda$4(NavHostFragment navHostFragment) {
        int i10 = navHostFragment.graphId;
        if (i10 != 0) {
            return BundleKt.bundleOf(AbstractC8726f.m14230a(KEY_GRAPH_ID, Integer.valueOf(i10)));
        }
        Bundle bundle = Bundle.EMPTY;
        AbstractC9133u.m16130d(bundle);
        return bundle;
    }

    @InterfaceC8721a
    public Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9133u.m16132f(childFragmentManager, "getChildFragmentManager(...)");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.navigation.NavHost
    public final NavController getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController) this.navHostController$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        AbstractC9133u.m16133g(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(Bundle bundle) {
        getNavHostController$navigation_fragment_release();
        if (bundle != null && bundle.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(bundle);
    }

    @InterfaceC8721a
    @CallSuper
    public void onCreateNavController(NavController navController) {
        AbstractC9133u.m16133g(navController, "navController");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9133u.m16132f(childFragmentManager, "getChildFragmentManager(...)");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    @CallSuper
    public void onCreateNavHostController(NavHostController navHostController) {
        AbstractC9133u.m16133g(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        Context context = inflater.getContext();
        AbstractC9133u.m16132f(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == getNavHostController$navigation_fragment_release()) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C4181R.styleable.NavHost);
        AbstractC9133u.m16132f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C4181R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        C8736p c8736p = C8736p.f16368a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C4197R.styleable.NavHostFragment);
        AbstractC9133u.m16132f(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(C4197R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9133u.m16133g(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        Navigation.setViewNavController(view, getNavHostController$navigation_fragment_release());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            AbstractC9133u.m16131e(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            AbstractC9133u.m16130d(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                AbstractC9133u.m16130d(view3);
                Navigation.setViewNavController(view3, getNavHostController$navigation_fragment_release());
            }
        }
    }

    public static final NavHostFragment create(@NavigationRes int i10, Bundle bundle) {
        return Companion.create(i10, bundle);
    }
}

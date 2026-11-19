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
import androidx.navigation.C4057R;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.savedstate.SavedStateRegistry;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
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
    private final InterfaceC10773d navHostController$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.fragment.k
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return NavHostFragment.navHostController_delegate$lambda$6(this.f1817c);
        }
    });
    private View viewParent;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
            AbstractC9979u.m20294g(fragment, "fragment");
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
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? C4125R.id.nav_host_fragment_container : id2;
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
        AbstractC9979u.m20293f(viewModelStore, "<get-viewModelStore>(...)");
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
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$4(this.f1819a);
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
        AbstractC9979u.m20293f(EMPTY, "EMPTY");
        return EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$6$lambda$5$lambda$4(NavHostFragment navHostFragment) {
        int i10 = navHostFragment.graphId;
        if (i10 != 0) {
            return BundleKt.bundleOf(AbstractC10776g.m22975a(KEY_GRAPH_ID, Integer.valueOf(i10)));
        }
        Bundle bundle = Bundle.EMPTY;
        AbstractC9979u.m20291d(bundle);
        return bundle;
    }

    @InterfaceC10770a
    public Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
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
        AbstractC9979u.m20294g(context, "context");
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

    @InterfaceC10770a
    @CallSuper
    public void onCreateNavController(NavController navController) {
        AbstractC9979u.m20294g(navController, "navController");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    @CallSuper
    public void onCreateNavHostController(NavHostController navHostController) {
        AbstractC9979u.m20294g(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        Context context = inflater.getContext();
        AbstractC9979u.m20293f(context, "getContext(...)");
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
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C4057R.styleable.NavHost);
        AbstractC9979u.m20293f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C4057R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        C10786q c10786q = C10786q.f26013a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C4125R.styleable.NavHostFragment);
        AbstractC9979u.m20293f(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(C4125R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9979u.m20294g(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        Navigation.setViewNavController(view, getNavHostController$navigation_fragment_release());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            AbstractC9979u.m20292e(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            AbstractC9979u.m20291d(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                AbstractC9979u.m20291d(view3);
                Navigation.setViewNavController(view3, getNavHostController$navigation_fragment_release());
            }
        }
    }

    public static final NavHostFragment create(@NavigationRes int i10, Bundle bundle) {
        return Companion.create(i10, bundle);
    }
}

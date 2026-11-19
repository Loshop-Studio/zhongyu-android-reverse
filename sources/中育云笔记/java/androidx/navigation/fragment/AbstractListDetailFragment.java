package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.C4057R;
import androidx.navigation.fragment.NavHostFragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes.dex */
public abstract class AbstractListDetailFragment extends Fragment {
    private NavHostFragment _detailPaneNavHostFragment;
    private int graphId;
    private OnBackPressedCallback onBackPressedCallback;

    public static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        private final SlidingPaneLayout slidingPaneLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(SlidingPaneLayout slidingPaneLayout) {
            super(true);
            AbstractC9979u.m20294g(slidingPaneLayout, "slidingPaneLayout");
            this.slidingPaneLayout = slidingPaneLayout;
            slidingPaneLayout.addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.slidingPaneLayout.closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(View panel) {
            AbstractC9979u.m20294g(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(View panel) {
            AbstractC9979u.m20294g(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(View panel, float f10) {
            AbstractC9979u.m20294g(panel, "panel");
        }
    }

    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment = this._detailPaneNavHostFragment;
        if (navHostFragment != null) {
            AbstractC9979u.m20292e(navHostFragment, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return navHostFragment;
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        View viewRequireView = requireView();
        AbstractC9979u.m20292e(viewRequireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout) viewRequireView;
    }

    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int i10 = this.graphId;
        return i10 != 0 ? NavHostFragment.Companion.create$default(NavHostFragment.Companion, i10, null, 2, null) : new NavHostFragment();
    }

    public abstract View onCreateListPaneView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragmentOnCreateDetailPaneNavHostFragment;
        AbstractC9979u.m20294g(inflater, "inflater");
        if (bundle != null) {
            this.graphId = bundle.getInt(NavHostFragment.KEY_GRAPH_ID);
        }
        final SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(C4125R.id.sliding_pane_layout);
        View viewOnCreateListPaneView = onCreateListPaneView(inflater, slidingPaneLayout, bundle);
        if (!AbstractC9979u.m20289b(viewOnCreateListPaneView, slidingPaneLayout) && !AbstractC9979u.m20289b(viewOnCreateListPaneView.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewOnCreateListPaneView);
        }
        Context context = inflater.getContext();
        AbstractC9979u.m20293f(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(C4125R.id.sliding_pane_detail_container);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(C4125R.dimen.sliding_pane_detail_pane_width), -1);
        layoutParams.weight = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C4125R.id.sliding_pane_detail_container);
        if (fragmentFindFragmentById != null) {
            navHostFragmentOnCreateDetailPaneNavHostFragment = (NavHostFragment) fragmentFindFragmentById;
        } else {
            navHostFragmentOnCreateDetailPaneNavHostFragment = onCreateDetailPaneNavHostFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            AbstractC9979u.m20293f(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.add(C4125R.id.sliding_pane_detail_container, navHostFragmentOnCreateDetailPaneNavHostFragment);
            fragmentTransactionBeginTransaction.commit();
        }
        this._detailPaneNavHostFragment = navHostFragmentOnCreateDetailPaneNavHostFragment;
        this.onBackPressedCallback = new InnerOnBackPressedCallback(slidingPaneLayout);
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.navigation.fragment.AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = this.this$0.onBackPressedCallback;
                    AbstractC9979u.m20291d(onBackPressedCallback);
                    onBackPressedCallback.setEnabled(slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen());
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            AbstractC9979u.m20291d(onBackPressedCallback);
            onBackPressedCallback.setEnabled(slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        AbstractC9979u.m20291d(onBackPressedCallback2);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
        return slidingPaneLayout;
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
    }

    public void onListPaneViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9979u.m20294g(outState, "outState");
        super.onSaveInstanceState(outState);
        int i10 = this.graphId;
        if (i10 != 0) {
            outState.putInt(NavHostFragment.KEY_GRAPH_ID, i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        View childAt = getSlidingPaneLayout().getChildAt(0);
        AbstractC9979u.m20291d(childAt);
        onListPaneViewCreated(childAt, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        AbstractC9979u.m20291d(onBackPressedCallback);
        onBackPressedCallback.setEnabled(getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen());
    }
}

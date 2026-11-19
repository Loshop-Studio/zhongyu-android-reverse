package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0358u;
import androidx.fragment.app.AbstractC0476y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0495e0;
import com.taobao.accs.utl.UtilityImpl;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p099i0.C2663b;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
class C0467p {

    /* renamed from: a */
    private final C0461j f3206a;

    /* renamed from: b */
    private final C0469r f3207b;

    /* renamed from: c */
    private final Fragment f3208c;

    /* renamed from: d */
    private boolean f3209d = false;

    /* renamed from: e */
    private int f3210e = -1;

    /* renamed from: androidx.fragment.app.p$a */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f3211a;

        a(View view) {
            this.f3211a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3211a.removeOnAttachStateChangeListener(this);
            C0358u.m2045n0(this.f3211a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3213a;

        static {
            int[] iArr = new int[AbstractC0496f.c.values().length];
            f3213a = iArr;
            try {
                iArr[AbstractC0496f.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3213a[AbstractC0496f.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3213a[AbstractC0496f.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3213a[AbstractC0496f.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C0467p(C0461j c0461j, C0469r c0469r, Fragment fragment) {
        this.f3206a = c0461j;
        this.f3207b = c0469r;
        this.f3208c = fragment;
    }

    /* renamed from: l */
    private boolean m2652l(View view) {
        if (view == this.f3208c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3208c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m2653q() {
        Bundle bundle = new Bundle();
        this.f3208c.performSaveInstanceState(bundle);
        this.f3206a.m2633j(this.f3208c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3208c.mView != null) {
            m2671t();
        }
        if (this.f3208c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3208c.mSavedViewState);
        }
        if (this.f3208c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3208c.mSavedViewRegistryState);
        }
        if (!this.f3208c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3208c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: a */
    void m2654a() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0461j c0461j = this.f3206a;
        Fragment fragment2 = this.f3208c;
        c0461j.m2624a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    void m2655b() {
        int iM2684j = this.f3207b.m2684j(this.f3208c);
        Fragment fragment = this.f3208c;
        fragment.mContainer.addView(fragment.mView, iM2684j);
    }

    /* renamed from: c */
    void m2656c() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        Fragment fragment2 = fragment.mTarget;
        C0467p c0467pM2687m = null;
        if (fragment2 != null) {
            C0467p c0467pM2687m2 = this.f3207b.m2687m(fragment2.mWho);
            if (c0467pM2687m2 == null) {
                throw new IllegalStateException("Fragment " + this.f3208c + " declared target fragment " + this.f3208c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f3208c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c0467pM2687m = c0467pM2687m2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0467pM2687m = this.f3207b.m2687m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3208c + " declared target fragment " + this.f3208c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c0467pM2687m != null && (FragmentManager.f3015P || c0467pM2687m.m2664k().mState < 1)) {
            c0467pM2687m.m2665m();
        }
        Fragment fragment4 = this.f3208c;
        fragment4.mHost = fragment4.mFragmentManager.m2505v0();
        Fragment fragment5 = this.f3208c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m2510y0();
        this.f3206a.m2630g(this.f3208c, false);
        this.f3208c.performAttach();
        this.f3206a.m2625b(this.f3208c, false);
    }

    /* renamed from: d */
    int m2657d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3208c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f3210e;
        int i4 = b.f3213a[fragment2.mMaxState.ordinal()];
        if (i4 != 1) {
            iMin = i4 != 2 ? i4 != 3 ? i4 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f3208c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f3210e, 2);
                View view = this.f3208c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3210e < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f3208c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        AbstractC0476y.e.b bVarM2786l = null;
        if (FragmentManager.f3015P && (viewGroup = (fragment = this.f3208c).mContainer) != null) {
            bVarM2786l = AbstractC0476y.m2776n(viewGroup, fragment.getParentFragmentManager()).m2786l(this);
        }
        if (bVarM2786l == AbstractC0476y.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarM2786l == AbstractC0476y.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f3208c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f3208c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3208c);
        }
        return iMin;
    }

    /* renamed from: e */
    void m2658e() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f3208c.mState = 1;
            return;
        }
        this.f3206a.m2631h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f3208c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0461j c0461j = this.f3206a;
        Fragment fragment3 = this.f3208c;
        c0461j.m2626c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* renamed from: f */
    void m2659f() {
        String resourceName;
        if (this.f3208c.mFromLayout) {
            return;
        }
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3208c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = fragment2.mContainerId;
            if (i4 != 0) {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3208c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m2495p0().mo2371c(this.f3208c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f3208c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f3208c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = UtilityImpl.NET_TYPE_UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3208c.mContainerId) + " (" + resourceName + ") for fragment " + this.f3208c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f3208c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3208c.mView;
        if (view != null) {
            boolean z3 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3208c;
            fragment5.mView.setTag(C2663b.f10585a, fragment5);
            if (viewGroup != null) {
                m2655b();
            }
            Fragment fragment6 = this.f3208c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C0358u.m2012U(this.f3208c.mView)) {
                C0358u.m2045n0(this.f3208c.mView);
            } else {
                View view2 = this.f3208c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f3208c.performViewCreated();
            C0461j c0461j = this.f3206a;
            Fragment fragment7 = this.f3208c;
            c0461j.m2636m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3208c.mView.getVisibility();
            float alpha = this.f3208c.mView.getAlpha();
            if (FragmentManager.f3015P) {
                this.f3208c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f3208c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f3208c.setFocusedView(viewFindFocus);
                        if (FragmentManager.m2388H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3208c);
                        }
                    }
                    this.f3208c.mView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
                }
            } else {
                Fragment fragment9 = this.f3208c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z3 = true;
                }
                fragment9.mIsNewlyAdded = z3;
            }
        }
        this.f3208c.mState = 2;
    }

    /* renamed from: g */
    void m2660g() {
        Fragment fragmentM2680f;
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        boolean zIsChangingConfigurations = true;
        boolean z3 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z3 || this.f3207b.m2689o().m2649p(this.f3208c))) {
            String str = this.f3208c.mTargetWho;
            if (str != null && (fragmentM2680f = this.f3207b.m2680f(str)) != null && fragmentM2680f.mRetainInstance) {
                this.f3208c.mTarget = fragmentM2680f;
            }
            this.f3208c.mState = 0;
            return;
        }
        AbstractC0459h<?> abstractC0459h = this.f3208c.mHost;
        if (abstractC0459h instanceof InterfaceC0495e0) {
            zIsChangingConfigurations = this.f3207b.m2689o().m2646m();
        } else if (abstractC0459h.m2619f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC0459h.m2619f()).isChangingConfigurations();
        }
        if (z3 || zIsChangingConfigurations) {
            this.f3207b.m2689o().m2641g(this.f3208c);
        }
        this.f3208c.performDestroy();
        this.f3206a.m2627d(this.f3208c, false);
        for (C0467p c0467p : this.f3207b.m2685k()) {
            if (c0467p != null) {
                Fragment fragmentM2664k = c0467p.m2664k();
                if (this.f3208c.mWho.equals(fragmentM2664k.mTargetWho)) {
                    fragmentM2664k.mTarget = this.f3208c;
                    fragmentM2664k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f3208c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f3207b.m2680f(str2);
        }
        this.f3207b.m2691q(this);
    }

    /* renamed from: h */
    void m2661h() {
        View view;
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3208c);
        }
        Fragment fragment = this.f3208c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3208c.performDestroyView();
        this.f3206a.m2637n(this.f3208c, false);
        Fragment fragment2 = this.f3208c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f3208c.mInLayout = false;
    }

    /* renamed from: i */
    void m2662i() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3208c);
        }
        this.f3208c.performDetach();
        boolean z3 = false;
        this.f3206a.m2628e(this.f3208c, false);
        Fragment fragment = this.f3208c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z3 = true;
        }
        if (z3 || this.f3207b.m2689o().m2649p(this.f3208c)) {
            if (FragmentManager.m2388H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3208c);
            }
            this.f3208c.initState();
        }
    }

    /* renamed from: j */
    void m2663j() {
        Fragment fragment = this.f3208c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m2388H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3208c);
            }
            Fragment fragment2 = this.f3208c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3208c.mSavedFragmentState);
            View view = this.f3208c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3208c;
                fragment3.mView.setTag(C2663b.f10585a, fragment3);
                Fragment fragment4 = this.f3208c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3208c.performViewCreated();
                C0461j c0461j = this.f3206a;
                Fragment fragment5 = this.f3208c;
                c0461j.m2636m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3208c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    Fragment m2664k() {
        return this.f3208c;
    }

    /* renamed from: m */
    void m2665m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3209d) {
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m2664k());
                return;
            }
            return;
        }
        try {
            this.f3209d = true;
            while (true) {
                int iM2657d = m2657d();
                Fragment fragment = this.f3208c;
                int i4 = fragment.mState;
                if (iM2657d == i4) {
                    if (FragmentManager.f3015P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC0476y abstractC0476yM2776n = AbstractC0476y.m2776n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f3208c.mHidden) {
                                abstractC0476yM2776n.m2780c(this);
                            } else {
                                abstractC0476yM2776n.m2782e(this);
                            }
                        }
                        Fragment fragment2 = this.f3208c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m2433F0(fragment2);
                        }
                        Fragment fragment3 = this.f3208c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iM2657d <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            m2662i();
                            break;
                        case 0:
                            m2660g();
                            break;
                        case 1:
                            m2661h();
                            this.f3208c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m2388H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3208c);
                            }
                            Fragment fragment4 = this.f3208c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m2671t();
                            }
                            Fragment fragment5 = this.f3208c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                AbstractC0476y.m2776n(viewGroup3, fragment5.getParentFragmentManager()).m2781d(this);
                            }
                            this.f3208c.mState = 3;
                            break;
                        case 4:
                            m2674w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m2666n();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            m2656c();
                            break;
                        case 1:
                            m2658e();
                            break;
                        case 2:
                            m2663j();
                            m2659f();
                            break;
                        case 3:
                            m2654a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                AbstractC0476y.m2776n(viewGroup2, fragment.getParentFragmentManager()).m2779b(AbstractC0476y.e.c.m2802b(this.f3208c.mView.getVisibility()), this);
                            }
                            this.f3208c.mState = 4;
                            break;
                        case 5:
                            m2673v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m2668p();
                            break;
                    }
                }
            }
        } finally {
            this.f3209d = false;
        }
    }

    /* renamed from: n */
    void m2666n() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3208c);
        }
        this.f3208c.performPause();
        this.f3206a.m2629f(this.f3208c, false);
    }

    /* renamed from: o */
    void m2667o(ClassLoader classLoader) {
        Bundle bundle = this.f3208c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3208c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3208c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3208c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f3208c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3208c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3208c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3208c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: p */
    void m2668p() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3208c);
        }
        View focusedView = this.f3208c.getFocusedView();
        if (focusedView != null && m2652l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.m2388H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3208c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3208c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3208c.setFocusedView(null);
        this.f3208c.performResume();
        this.f3206a.m2632i(this.f3208c, false);
        Fragment fragment = this.f3208c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: r */
    Fragment.SavedState m2669r() {
        Bundle bundleM2653q;
        if (this.f3208c.mState <= -1 || (bundleM2653q = m2653q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleM2653q);
    }

    /* renamed from: s */
    FragmentState m2670s() {
        FragmentState fragmentState = new FragmentState(this.f3208c);
        Fragment fragment = this.f3208c;
        if (fragment.mState <= -1 || fragmentState.f3103m != null) {
            fragmentState.f3103m = fragment.mSavedFragmentState;
        } else {
            Bundle bundleM2653q = m2653q();
            fragmentState.f3103m = bundleM2653q;
            if (this.f3208c.mTargetWho != null) {
                if (bundleM2653q == null) {
                    fragmentState.f3103m = new Bundle();
                }
                fragmentState.f3103m.putString("android:target_state", this.f3208c.mTargetWho);
                int i4 = this.f3208c.mTargetRequestCode;
                if (i4 != 0) {
                    fragmentState.f3103m.putInt("android:target_req_state", i4);
                }
            }
        }
        return fragmentState;
    }

    /* renamed from: t */
    void m2671t() {
        if (this.f3208c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3208c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3208c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3208c.mViewLifecycleOwner.m2770e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3208c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: u */
    void m2672u(int i4) {
        this.f3210e = i4;
    }

    /* renamed from: v */
    void m2673v() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3208c);
        }
        this.f3208c.performStart();
        this.f3206a.m2634k(this.f3208c, false);
    }

    /* renamed from: w */
    void m2674w() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3208c);
        }
        this.f3208c.performStop();
        this.f3206a.m2635l(this.f3208c, false);
    }

    C0467p(C0461j c0461j, C0469r c0469r, ClassLoader classLoader, C0458g c0458g, FragmentState fragmentState) {
        this.f3206a = c0461j;
        this.f3207b = c0469r;
        Fragment fragmentMo2519a = c0458g.mo2519a(classLoader, fragmentState.f3091a);
        this.f3208c = fragmentMo2519a;
        Bundle bundle = fragmentState.f3100j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo2519a.setArguments(fragmentState.f3100j);
        fragmentMo2519a.mWho = fragmentState.f3092b;
        fragmentMo2519a.mFromLayout = fragmentState.f3093c;
        fragmentMo2519a.mRestored = true;
        fragmentMo2519a.mFragmentId = fragmentState.f3094d;
        fragmentMo2519a.mContainerId = fragmentState.f3095e;
        fragmentMo2519a.mTag = fragmentState.f3096f;
        fragmentMo2519a.mRetainInstance = fragmentState.f3097g;
        fragmentMo2519a.mRemoving = fragmentState.f3098h;
        fragmentMo2519a.mDetached = fragmentState.f3099i;
        fragmentMo2519a.mHidden = fragmentState.f3101k;
        fragmentMo2519a.mMaxState = AbstractC0496f.c.values()[fragmentState.f3102l];
        Bundle bundle2 = fragmentState.f3103m;
        if (bundle2 != null) {
            fragmentMo2519a.mSavedFragmentState = bundle2;
        } else {
            fragmentMo2519a.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentMo2519a);
        }
    }

    C0467p(C0461j c0461j, C0469r c0469r, Fragment fragment, FragmentState fragmentState) {
        this.f3206a = c0461j;
        this.f3207b = c0469r;
        this.f3208c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3103m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

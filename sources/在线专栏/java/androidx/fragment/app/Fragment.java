package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0066b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0065a;
import androidx.activity.result.InterfaceC0067c;
import androidx.core.app.AbstractC0328i;
import androidx.core.app.C0321b;
import androidx.core.view.C0344g;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0491c0;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.C0497f0;
import androidx.lifecycle.C0499g0;
import androidx.lifecycle.C0506n;
import androidx.lifecycle.C0511s;
import androidx.lifecycle.C0518z;
import androidx.lifecycle.InterfaceC0495e0;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC0519a;
import androidx.savedstate.C0650b;
import androidx.savedstate.C0652d;
import androidx.savedstate.InterfaceC0651c;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p010b.AbstractC1015a;
import p103j.InterfaceC2685a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0504l, InterfaceC0495e0, InterfaceC0651c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C0423i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C0491c0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC0459h<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0506n mLifecycleRegistry;
    AbstractC0496f.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0425k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C0650b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C0474w mViewLifecycleOwner;
    C0511s<InterfaceC0504l> mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class RunnableC0415a implements Runnable {
        RunnableC0415a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class RunnableC0416b implements Runnable {
        RunnableC0416b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class RunnableC0417c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0476y f2970a;

        RunnableC0417c(AbstractC0476y abstractC0476y) {
            this.f2970a = abstractC0476y;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2970a.m2783g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0418d extends AbstractC0456e {
        C0418d() {
        }

        @Override // androidx.fragment.app.AbstractC0456e
        /* renamed from: c */
        public View mo2371c(int i4) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0456e
        /* renamed from: d */
        public boolean mo2372d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C0419e implements InterfaceC2685a<Void, ActivityResultRegistry> {
        C0419e() {
        }

        @Override // p103j.InterfaceC2685a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC0067c ? ((InterfaceC0067c) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    class C0420f implements InterfaceC2685a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f2974a;

        C0420f(ActivityResultRegistry activityResultRegistry) {
            this.f2974a = activityResultRegistry;
        }

        @Override // p103j.InterfaceC2685a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f2974a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    class C0421g extends AbstractC0425k {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2685a f2976a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f2977b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1015a f2978c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0065a f2979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0421g(InterfaceC2685a interfaceC2685a, AtomicReference atomicReference, AbstractC1015a abstractC1015a, InterfaceC0065a interfaceC0065a) {
            super(null);
            this.f2976a = interfaceC2685a;
            this.f2977b = atomicReference;
            this.f2978c = abstractC1015a;
            this.f2979d = interfaceC0065a;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0425k
        /* renamed from: a */
        void mo2375a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f2977b.set(((ActivityResultRegistry) this.f2976a.apply(null)).m89i(strGenerateActivityResultKey, Fragment.this, this.f2978c, this.f2979d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.fragment.app.Fragment$h */
    class C0422h<I> extends AbstractC0066b<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f2981a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1015a f2982b;

        C0422h(AtomicReference atomicReference, AbstractC1015a abstractC1015a) {
            this.f2981a = atomicReference;
            this.f2982b = abstractC1015a;
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: b */
        public void mo92b(I i4, C0321b c0321b) {
            AbstractC0066b abstractC0066b = (AbstractC0066b) this.f2981a.get();
            if (abstractC0066b == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0066b.mo92b(i4, c0321b);
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: c */
        public void mo93c() {
            AbstractC0066b abstractC0066b = (AbstractC0066b) this.f2981a.getAndSet(null);
            if (abstractC0066b != null) {
                abstractC0066b.mo93c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    static class C0423i {

        /* renamed from: a */
        View f2984a;

        /* renamed from: b */
        Animator f2985b;

        /* renamed from: c */
        boolean f2986c;

        /* renamed from: d */
        int f2987d;

        /* renamed from: e */
        int f2988e;

        /* renamed from: f */
        int f2989f;

        /* renamed from: g */
        int f2990g;

        /* renamed from: h */
        int f2991h;

        /* renamed from: i */
        ArrayList<String> f2992i;

        /* renamed from: j */
        ArrayList<String> f2993j;

        /* renamed from: k */
        Object f2994k = null;

        /* renamed from: l */
        Object f2995l;

        /* renamed from: m */
        Object f2996m;

        /* renamed from: n */
        Object f2997n;

        /* renamed from: o */
        Object f2998o;

        /* renamed from: p */
        Object f2999p;

        /* renamed from: q */
        Boolean f3000q;

        /* renamed from: r */
        Boolean f3001r;

        /* renamed from: s */
        float f3002s;

        /* renamed from: t */
        View f3003t;

        /* renamed from: u */
        boolean f3004u;

        /* renamed from: v */
        InterfaceC0426l f3005v;

        /* renamed from: w */
        boolean f3006w;

        C0423i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f2995l = obj;
            this.f2996m = null;
            this.f2997n = obj;
            this.f2998o = null;
            this.f2999p = obj;
            this.f3002s = 1.0f;
            this.f3003t = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C0424j extends RuntimeException {
        public C0424j(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    private static abstract class AbstractC0425k {
        private AbstractC0425k() {
        }

        /* synthetic */ AbstractC0425k(RunnableC0415a runnableC0415a) {
            this();
        }

        /* renamed from: a */
        abstract void mo2375a();
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    interface InterfaceC0426l {
        /* renamed from: a */
        void mo2376a();

        /* renamed from: b */
        void mo2377b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0462k();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0415a();
        this.mMaxState = AbstractC0496f.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0511s<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C0423i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0423i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC0496f.c cVar = this.mMaxState;
        return (cVar == AbstractC0496f.c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0506n(this);
        this.mSavedStateRegistryController = C0650b.m3663a(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> AbstractC0066b<I> prepareCallInternal(AbstractC1015a<I, O> abstractC1015a, InterfaceC2685a<Void, ActivityResultRegistry> interfaceC2685a, InterfaceC0065a<O> interfaceC0065a) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0421g(interfaceC2685a, atomicReference, abstractC1015a, interfaceC0065a));
            return new C0422h(atomicReference, abstractC1015a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(AbstractC0425k abstractC0425k) {
        if (this.mState >= 0) {
            abstractC0425k.mo2375a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0425k);
        }
    }

    void callStartTransitionListener(boolean z3) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0423i c0423i = this.mAnimationInfo;
        InterfaceC0426l interfaceC0426l = null;
        if (c0423i != null) {
            c0423i.f3004u = false;
            InterfaceC0426l interfaceC0426l2 = c0423i.f3005v;
            c0423i.f3005v = null;
            interfaceC0426l = interfaceC0426l2;
        }
        if (interfaceC0426l != null) {
            interfaceC0426l.mo2376a();
            return;
        }
        if (!FragmentManager.f3015P || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC0476y abstractC0476yM2776n = AbstractC0476y.m2776n(viewGroup, fragmentManager);
        abstractC0476yM2776n.m2788p();
        if (z3) {
            this.mHost.m2620g().post(new RunnableC0417c(abstractC0476yM2776n));
        } else {
            abstractC0476yM2776n.m2783g();
        }
    }

    AbstractC0456e createFragmentContainer() {
        return new C0418d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0519a.m2922b(this).mo2923a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m2462X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m2486k0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h == null) {
            return null;
        }
        return (FragmentActivity) abstractC0459h.m2618e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null || (bool = c0423i.f3001r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null || (bool = c0423i.f3000q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f2984a;
    }

    Animator getAnimator() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f2985b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h == null) {
            return null;
        }
        return abstractC0459h.m2619f();
    }

    public C0491c0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m2388H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C0518z(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 0;
        }
        return c0423i.f2987d;
    }

    public Object getEnterTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f2994k;
    }

    AbstractC0328i getEnterTransitionCallback() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        Objects.requireNonNull(c0423i);
        return null;
    }

    int getExitAnim() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 0;
        }
        return c0423i.f2988e;
    }

    public Object getExitTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f2996m;
    }

    AbstractC0328i getExitTransitionCallback() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        Objects.requireNonNull(c0423i);
        return null;
    }

    View getFocusedView() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f3003t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h == null) {
            return null;
        }
        return abstractC0459h.mo2380i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0504l
    public AbstractC0496f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC0519a getLoaderManager() {
        return AbstractC0519a.m2922b(this);
    }

    int getNextTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 0;
        }
        return c0423i.f2991h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return false;
        }
        return c0423i.f2986c;
    }

    int getPopEnterAnim() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 0;
        }
        return c0423i.f2989f;
    }

    int getPopExitAnim() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 0;
        }
        return c0423i.f2990g;
    }

    float getPostOnViewCreatedAlpha() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return 1.0f;
        }
        return c0423i.f3002s;
    }

    public Object getReenterTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        Object obj = c0423i.f2997n;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        Object obj = c0423i.f2995l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.InterfaceC0651c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m3664b();
    }

    public Object getSharedElementEnterTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        return c0423i.f2998o;
    }

    public Object getSharedElementReturnTransition() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return null;
        }
        Object obj = c0423i.f2999p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0423i c0423i = this.mAnimationInfo;
        return (c0423i == null || (arrayList = c0423i.f2992i) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0423i c0423i = this.mAnimationInfo;
        return (c0423i == null || (arrayList = c0423i.f2993j) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i4) {
        return getResources().getString(i4);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m2478h0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0504l getViewLifecycleOwner() {
        C0474w c0474w = this.mViewLifecycleOwner;
        if (c0474w != null) {
            return c0474w;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<InterfaceC0504l> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0495e0
    public C0493d0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC0496f.c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m2427C0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0462k();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return false;
        }
        return c0423i.f3006w;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m2439J0(this.mParentFragment));
    }

    boolean isPostponed() {
        C0423i c0423i = this.mAnimationInfo;
        if (c0423i == null) {
            return false;
        }
        return c0423i.f3004u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m2444M0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.m2460V0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC0459h<?> abstractC0459h = this.mHost;
        Activity activityM2618e = abstractC0459h == null ? null : abstractC0459h.m2618e();
        if (activityM2618e != null) {
            this.mCalled = false;
            onAttach(activityM2618e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m2443L0(1)) {
            return;
        }
        this.mChildFragmentManager.m2428D();
    }

    public Animation onCreateAnimation(int i4, boolean z3, int i5) {
        return null;
    }

    public Animator onCreateAnimator(int i4, boolean z3, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z3) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC0459h<?> abstractC0459h = this.mHost;
        Activity activityM2618e = abstractC0459h == null ? null : abstractC0459h.m2618e();
        if (activityM2618e != null) {
            this.mCalled = false;
            onInflate(activityM2618e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z3) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z3) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z3) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m2460V0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m2511z();
        } else {
            throw new C0452a0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<AbstractC0425k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo2375a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m2485k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m2619f());
        if (this.mCalled) {
            this.mFragmentManager.m2438J(this);
            this.mChildFragmentManager.m2423A();
        } else {
            throw new C0452a0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m2425B(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2426C(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m2460V0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo2867a(new InterfaceC0501i() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
                View view;
                if (bVar != AbstractC0496f.b.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m3665c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m2891h(AbstractC0496f.b.ON_CREATE);
            return;
        }
        throw new C0452a0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z3 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z3 | this.mChildFragmentManager.m2430E(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m2460V0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0474w(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m2768c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m2767b();
            C0497f0.m2875a(this.mView, this.mViewLifecycleOwner);
            C0499g0.m2878a(this.mView, this.mViewLifecycleOwner);
            C0652d.m3667a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.m2432F();
        this.mLifecycleRegistry.m2891h(AbstractC0496f.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C0452a0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.m2434G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo2868b().m2874a(AbstractC0496f.c.CREATED)) {
            this.mViewLifecycleOwner.m2766a(AbstractC0496f.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC0519a.m2922b(this).mo2924c();
            this.mPerformedCreateView = false;
        } else {
            throw new C0452a0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m2435G0()) {
                return;
            }
            this.mChildFragmentManager.m2432F();
            this.mChildFragmentManager = new C0462k();
            return;
        }
        throw new C0452a0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m2436H();
    }

    void performMultiWindowModeChanged(boolean z3) {
        onMultiWindowModeChanged(z3);
        this.mChildFragmentManager.m2437I(z3);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2440K(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m2442L(menu);
    }

    void performPause() {
        this.mChildFragmentManager.m2445N();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2766a(AbstractC0496f.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.m2891h(AbstractC0496f.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C0452a0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z3) {
        onPictureInPictureModeChanged(z3);
        this.mChildFragmentManager.m2447O(z3);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z3 = true;
            onPrepareOptionsMenu(menu);
        }
        return z3 | this.mChildFragmentManager.m2449P(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zM2441K0 = this.mFragmentManager.m2441K0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM2441K0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM2441K0);
            onPrimaryNavigationFragmentChanged(zM2441K0);
            this.mChildFragmentManager.m2451Q();
        }
    }

    void performResume() {
        this.mChildFragmentManager.m2460V0();
        this.mChildFragmentManager.m2467b0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0452a0("Fragment " + this + " did not call through to super.onResume()");
        }
        C0506n c0506n = this.mLifecycleRegistry;
        AbstractC0496f.b bVar = AbstractC0496f.b.ON_RESUME;
        c0506n.m2891h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2766a(bVar);
        }
        this.mChildFragmentManager.m2452R();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m3666d(bundle);
        Parcelable parcelableM2488l1 = this.mChildFragmentManager.m2488l1();
        if (parcelableM2488l1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableM2488l1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.m2460V0();
        this.mChildFragmentManager.m2467b0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0452a0("Fragment " + this + " did not call through to super.onStart()");
        }
        C0506n c0506n = this.mLifecycleRegistry;
        AbstractC0496f.b bVar = AbstractC0496f.b.ON_START;
        c0506n.m2891h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2766a(bVar);
        }
        this.mChildFragmentManager.m2454S();
    }

    void performStop() {
        this.mChildFragmentManager.m2457U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2766a(AbstractC0496f.b.ON_STOP);
        }
        this.mLifecycleRegistry.m2891h(AbstractC0496f.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C0452a0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m2459V();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3004u = true;
    }

    public final <I, O> AbstractC0066b<I> registerForActivityResult(AbstractC1015a<I, O> abstractC1015a, InterfaceC0065a<O> interfaceC0065a) {
        return prepareCallInternal(abstractC1015a, new C0419e(), interfaceC0065a);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i4) {
        if (this.mHost != null) {
            getParentFragmentManager().m2446N0(this, strArr, i4);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m2484j1(parcelable);
        this.mChildFragmentManager.m2428D();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2769d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m2766a(AbstractC0496f.b.ON_CREATE);
            }
        } else {
            throw new C0452a0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z3) {
        ensureAnimationInfo().f3001r = Boolean.valueOf(z3);
    }

    public void setAllowReturnTransitionOverlap(boolean z3) {
        ensureAnimationInfo().f3000q = Boolean.valueOf(z3);
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f2984a = view;
    }

    void setAnimations(int i4, int i5, int i6, int i7) {
        if (this.mAnimationInfo == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        ensureAnimationInfo().f2987d = i4;
        ensureAnimationInfo().f2988e = i5;
        ensureAnimationInfo().f2989f = i6;
        ensureAnimationInfo().f2990g = i7;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f2985b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC0328i abstractC0328i) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2994k = obj;
    }

    public void setExitSharedElementCallback(AbstractC0328i abstractC0328i) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2996m = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f3003t = view;
    }

    public void setHasOptionsMenu(boolean z3) {
        if (this.mHasMenu != z3) {
            this.mHasMenu = z3;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo2384p();
        }
    }

    void setHideReplaced(boolean z3) {
        ensureAnimationInfo().f3006w = z3;
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f2967a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z3) {
        if (this.mMenuVisible != z3) {
            this.mMenuVisible = z3;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo2384p();
            }
        }
    }

    void setNextTransition(int i4) {
        if (this.mAnimationInfo == null && i4 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f2991h = i4;
    }

    void setOnStartEnterTransitionListener(InterfaceC0426l interfaceC0426l) {
        ensureAnimationInfo();
        C0423i c0423i = this.mAnimationInfo;
        InterfaceC0426l interfaceC0426l2 = c0423i.f3005v;
        if (interfaceC0426l == interfaceC0426l2) {
            return;
        }
        if (interfaceC0426l != null && interfaceC0426l2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0423i.f3004u) {
            c0423i.f3005v = interfaceC0426l;
        }
        if (interfaceC0426l != null) {
            interfaceC0426l.mo2377b();
        }
    }

    void setPopDirection(boolean z3) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f2986c = z3;
    }

    void setPostOnViewCreatedAlpha(float f4) {
        ensureAnimationInfo().f3002s = f4;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2997n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z3) {
        this.mRetainInstance = z3;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z3) {
            fragmentManager.m2480i(this);
        } else {
            fragmentManager.m2479h1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2995l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2998o = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0423i c0423i = this.mAnimationInfo;
        c0423i.f2992i = arrayList;
        c0423i.f2993j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2999p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i4) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z3) {
        if (!this.mUserVisibleHint && z3 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m2463X0(fragmentManager.m2506w(this));
        }
        this.mUserVisibleHint = z3;
        this.mDeferStart = this.mState < 5 && !z3;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h != null) {
            return abstractC0459h.mo2383m(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m2450P0(this, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f3004u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f3004u = false;
        } else if (Looper.myLooper() != this.mHost.m2620g().getLooper()) {
            this.mHost.m2620g().postAtFrontOfQueue(new RunnableC0416b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0414a();

        /* renamed from: a */
        final Bundle f2967a;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        class C0414a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0414a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Bundle bundle) {
            this.f2967a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeBundle(this.f2967a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f2967a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = C0458g.m2617d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e4) {
            throw new C0424j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new C0424j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new C0424j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new C0424j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    public final String getString(int i4, Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        ensureAnimationInfo().f3004u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerM2620g = fragmentManager != null ? fragmentManager.m2505v0().m2620g() : new Handler(Looper.getMainLooper());
        handlerM2620g.removeCallbacks(this.mPostponedDurationRunnable);
        handlerM2620g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> AbstractC0066b<I> registerForActivityResult(AbstractC1015a<I, O> abstractC1015a, ActivityResultRegistry activityResultRegistry, InterfaceC0065a<O> interfaceC0065a) {
        return prepareCallInternal(abstractC1015a, new C0420f(activityResultRegistry), interfaceC0065a);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h != null) {
            abstractC0459h.m2622n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m2448O0(this, intent, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC0459h<?> abstractC0459h = this.mHost;
        if (abstractC0459h != null) {
            LayoutInflater layoutInflaterMo2381j = abstractC0459h.mo2381j();
            C0344g.m1935a(layoutInflaterMo2381j, this.mChildFragmentManager.m2507w0());
            return layoutInflaterMo2381j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i4) {
        this();
        this.mContentLayoutId = i4;
    }
}

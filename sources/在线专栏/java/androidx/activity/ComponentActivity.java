package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.AbstractC0066b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0065a;
import androidx.activity.result.InterfaceC0067c;
import androidx.core.app.C0320a;
import androidx.core.app.C0321b;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0491c0;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.C0497f0;
import androidx.lifecycle.C0499g0;
import androidx.lifecycle.C0506n;
import androidx.lifecycle.C0518z;
import androidx.lifecycle.FragmentC0516x;
import androidx.lifecycle.InterfaceC0495e0;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import androidx.savedstate.C0650b;
import androidx.savedstate.C0652d;
import androidx.savedstate.InterfaceC0651c;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.InterfaceC0001b;
import p010b.AbstractC1015a;
import p157u0.C3409a;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC0495e0, InterfaceC0651c, InterfaceC0056c, InterfaceC0067c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C0000a mContextAwareHelper;
    private C0491c0.b mDefaultFactory;
    private final C0506n mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final C0650b mSavedStateRegistryController;
    private C0493d0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class RunnableC0048a implements Runnable {
        RunnableC0048a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0049b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f61a;

            /* renamed from: b */
            final /* synthetic */ AbstractC1015a.a f62b;

            a(int i4, AbstractC1015a.a aVar) {
                this.f61a = i4;
                this.f62b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0049b.this.m86c(this.f61a, this.f62b.m4765a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f64a;

            /* renamed from: b */
            final /* synthetic */ IntentSender.SendIntentException f65b;

            b(int i4, IntentSender.SendIntentException sendIntentException) {
                this.f64a = i4;
                this.f65b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0049b.this.m85b(this.f64a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f65b));
            }
        }

        C0049b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo64f(int i4, AbstractC1015a<I, O> abstractC1015a, I i5, C0321b c0321b) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1015a.a<O> aVarMo4764b = abstractC1015a.mo4764b(componentActivity, i5);
            if (aVarMo4764b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i4, aVarMo4764b));
                return;
            }
            Intent intentMo2522a = abstractC1015a.mo2522a(componentActivity, i5);
            Bundle bundleExtra = null;
            if (intentMo2522a.getExtras() != null && intentMo2522a.getExtras().getClassLoader() == null) {
                intentMo2522a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo2522a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo2522a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo2522a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo2522a.getAction())) {
                String[] stringArrayExtra = intentMo2522a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0320a.m1758n(componentActivity, stringArrayExtra, i4);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo2522a.getAction())) {
                C0320a.m1762r(componentActivity, intentMo2522a, i4, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo2522a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C0320a.m1763s(componentActivity, intentSenderRequest.m99d(), i4, intentSenderRequest.m96a(), intentSenderRequest.m97b(), intentSenderRequest.m98c(), 0, bundle);
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new b(i4, e4));
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    class C0050c implements SavedStateRegistry.InterfaceC0648b {
        C0050c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0648b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public Bundle mo65a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.mActivityResultRegistry.m88h(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    class C0051d implements InterfaceC0001b {
        C0051d() {
        }

        @Override // p000a.InterfaceC0001b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo5a(Context context) {
            Bundle bundleM3658a = ComponentActivity.this.getSavedStateRegistry().m3658a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (bundleM3658a != null) {
                ComponentActivity.this.mActivityResultRegistry.m87g(bundleM3658a);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    static final class C0052e {

        /* renamed from: a */
        Object f69a;

        /* renamed from: b */
        C0493d0 f70b;

        C0052e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0000a();
        this.mLifecycleRegistry = new C0506n(this);
        this.mSavedStateRegistryController = C0650b.m3663a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0048a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0049b();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i4 = Build.VERSION.SDK_INT;
        getLifecycle().mo2867a(new InterfaceC0501i() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
                if (bVar == AbstractC0496f.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo2867a(new InterfaceC0501i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
                if (bVar == AbstractC0496f.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m1b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m2862a();
                }
            }
        });
        getLifecycle().mo2867a(new InterfaceC0501i() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo2869c(this);
            }
        });
        if (i4 <= 23) {
            getLifecycle().mo2867a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().m3661d(ACTIVITY_RESULT_TAG, new C0050c());
        addOnContextAvailableListener(new C0051d());
    }

    private void initViewTreeOwners() {
        C0497f0.m2875a(getWindow().getDecorView(), this);
        C0499g0.m2878a(getWindow().getDecorView(), this);
        C0652d.m3667a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(InterfaceC0001b interfaceC0001b) {
        this.mContextAwareHelper.m0a(interfaceC0001b);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0052e c0052e = (C0052e) getLastNonConfigurationInstance();
            if (c0052e != null) {
                this.mViewModelStore = c0052e.f70b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0493d0();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0067c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C0491c0.b getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0518z(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0052e c0052e = (C0052e) getLastNonConfigurationInstance();
        if (c0052e != null) {
            return c0052e.f69a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC0504l
    public AbstractC0496f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0056c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.InterfaceC0651c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m3664b();
    }

    @Override // androidx.lifecycle.InterfaceC0495e0
    public C0493d0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i4, int i5, Intent intent) {
        if (this.mActivityResultRegistry.m85b(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m69c();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m3665c(bundle);
        this.mContextAwareHelper.m2c(this);
        super.onCreate(bundle);
        FragmentC0516x.m2915f(this);
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m85b(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0052e c0052e;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0493d0 c0493d0 = this.mViewModelStore;
        if (c0493d0 == null && (c0052e = (C0052e) getLastNonConfigurationInstance()) != null) {
            c0493d0 = c0052e.f70b;
        }
        if (c0493d0 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0052e c0052e2 = new C0052e();
        c0052e2.f69a = objOnRetainCustomNonConfigurationInstance;
        c0052e2.f70b = c0493d0;
        return c0052e2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0496f lifecycle = getLifecycle();
        if (lifecycle instanceof C0506n) {
            ((C0506n) lifecycle).m2893o(AbstractC0496f.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m3666d(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m3d();
    }

    public final <I, O> AbstractC0066b<I> registerForActivityResult(AbstractC1015a<I, O> abstractC1015a, ActivityResultRegistry activityResultRegistry, InterfaceC0065a<O> interfaceC0065a) {
        return activityResultRegistry.m89i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC1015a, interfaceC0065a);
    }

    public final void removeOnContextAvailableListener(InterfaceC0001b interfaceC0001b) {
        this.mContextAwareHelper.m4e(interfaceC0001b);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C3409a.m10413d()) {
                C3409a.m10410a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            C3409a.m10411b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        initViewTreeOwners();
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> AbstractC0066b<I> registerForActivityResult(AbstractC1015a<I, O> abstractC1015a, InterfaceC0065a<O> interfaceC0065a) {
        return registerForActivityResult(abstractC1015a, this.mActivityResultRegistry, interfaceC0065a);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i4) {
        this();
        this.mContentLayoutId = i4;
    }
}

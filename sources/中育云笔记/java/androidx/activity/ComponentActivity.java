package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final Companion Companion = new Companion(null);
    private ViewModelStore _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;
    private final ContextAwareHelper contextAwareHelper;
    private final InterfaceC10773d defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC10773d fullyDrawnReporter$delegate;
    private final MenuHostHelper menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC10773d onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final SavedStateRegistryController savedStateRegistryController;

    @RequiresApi(33)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            AbstractC9979u.m20294g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC9979u.m20293f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class NonConfigurationInstances {
        private Object custom;
        private ViewModelStore viewModelStore;

        public final Object getCustom() {
            return this.custom;
        }

        public final ViewModelStore getViewModelStore() {
            return this.viewModelStore;
        }

        public final void setCustom(Object obj) {
            this.custom = obj;
        }

        public final void setViewModelStore(ViewModelStore viewModelStore) {
            this.viewModelStore = viewModelStore;
        }
    }

    public interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(View view);
    }

    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
            if (runnable != null) {
                AbstractC9979u.m20291d(runnable);
                runnable.run();
                reportFullyDrawnExecutorImpl.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC9979u.m20294g(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            AbstractC9979u.m20293f(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(this.f165c);
                    }
                });
            } else if (AbstractC9979u.m20289b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final Runnable getCurrentRunnable() {
            return this.currentRunnable;
        }

        public final long getEndWatchTimeMillis() {
            return this.endWatchTimeMillis;
        }

        public final boolean getOnDrawScheduled() {
            return this.onDrawScheduled;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(Runnable runnable) {
            this.currentRunnable = runnable;
        }

        public final void setOnDrawScheduled(boolean z10) {
            this.onDrawScheduled = z10;
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(View view) {
            AbstractC9979u.m20294g(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f157c.invalidateMenu();
            }
        });
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.Companion.create(this);
        this.savedStateRegistryController = savedStateRegistryControllerCreate;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final FullyDrawnReporter invoke() {
                ComponentActivity.ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.this$0.reportFullyDrawnExecutor;
                final ComponentActivity componentActivity = this.this$0;
                return new FullyDrawnReporter(reportFullyDrawnExecutor, new InterfaceC9529a() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2.1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m26698invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26698invoke() {
                        componentActivity.reportFullyDrawn();
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ComponentActivity$activityResultRegistry$1(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(this.f158c, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$3(this.f159c, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                AbstractC9979u.m20294g(source, "source");
                AbstractC9979u.m20294g(event, "event");
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryControllerCreate.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.d
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return ComponentActivity._init_$lambda$4(this.f161a);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.e
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                ComponentActivity._init_$lambda$5(this.f162a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final SavedStateViewModelFactory invoke() {
                Application application = this.this$0.getApplication();
                ComponentActivity componentActivity = this.this$0;
                return new SavedStateViewModelFactory(application, componentActivity, componentActivity.getIntent() != null ? this.this$0.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher$delegate = AbstractC9923a.m20068a(new ComponentActivity$onBackPressedDispatcher$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        AbstractC9979u.m20294g(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC9979u.m20294g(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC9979u.m20294g(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC9979u.m20294g(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.clearAvailableContext();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        AbstractC9979u.m20294g(it, "it");
        Bundle bundleConsumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            componentActivity.activityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(onBackPressedDispatcher, this, lifecycleOwner, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC9979u.m20294g(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC9979u.m20294g(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.INSTANCE.getOnBackInvokedDispatcher(componentActivity));
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider provider) {
        AbstractC9979u.m20294g(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(OnContextAvailableListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(Consumer<Intent> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        if (getApplication() != null) {
            CreationExtras.Key<Application> key = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            AbstractC9979u.m20293f(application, "application");
            mutableCreationExtras.set(key, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @InterfaceC10770a
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        ViewModelStore viewModelStore = this._viewModelStore;
        AbstractC9979u.m20291d(viewModelStore);
        return viewModelStore;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView4, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView5, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.set(decorView5, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    @CallSuper
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.dispatchResult(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC9979u.m20294g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC9979u.m20294g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC9979u.m20294g(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z10));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(Intent intent) {
        AbstractC9979u.m20294g(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC9979u.m20294g(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC9979u.m20294g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    @CallSuper
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC9979u.m20294g(permissions, "permissions");
        AbstractC9979u.m20294g(grantResults, "grantResults");
        if (this.activityResultRegistry.dispatchResult(i10, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, permissions).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @InterfaceC10770a
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.setCustom(objOnRetainCustomNonConfigurationInstance);
        nonConfigurationInstances2.setViewModelStore(viewModelStore);
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9979u.m20294g(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            AbstractC9979u.m20292e(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.performSave(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultRegistry registry, ActivityResultCallback<O> callback) {
        AbstractC9979u.m20294g(contract, "contract");
        AbstractC9979u.m20294g(registry, "registry");
        AbstractC9979u.m20294g(callback, "callback");
        return registry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider provider) {
        AbstractC9979u.m20294g(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(OnContextAvailableListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(Consumer<Intent> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i10) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC9979u.m20294g(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC9979u.m20294g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider provider, LifecycleOwner owner) {
        AbstractC9979u.m20294g(provider, "provider");
        AbstractC9979u.m20294g(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC9979u.m20294g(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC10770a
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC9979u.m20294g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(MenuProvider provider, LifecycleOwner owner, Lifecycle.State state) {
        AbstractC9979u.m20294g(provider, "provider");
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        AbstractC9979u.m20294g(contract, "contract");
        AbstractC9979u.m20294g(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        AbstractC9979u.m20294g(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        AbstractC9979u.m20294g(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i10) {
        this();
        this.contentLayoutId = i10;
    }
}

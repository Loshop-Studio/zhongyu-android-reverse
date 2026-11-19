package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0056c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0067c;
import androidx.core.app.AbstractC0328i;
import androidx.core.app.C0320a;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.C0506n;
import androidx.lifecycle.InterfaceC0495e0;
import androidx.loader.app.AbstractC0519a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.InterfaceC0001b;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements C0320a.c, C0320a.e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C0506n mFragmentLifecycleRegistry;
    final C0457f mFragments;
    boolean mResumed;
    boolean mStopped;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    class C0427a implements SavedStateRegistry.InterfaceC0648b {
        C0427a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0648b
        /* renamed from: a */
        public Bundle mo65a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.markFragmentsCreated();
            FragmentActivity.this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_STOP);
            Parcelable parcelableM2614x = FragmentActivity.this.mFragments.m2614x();
            if (parcelableM2614x != null) {
                bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, parcelableM2614x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    class C0428b implements InterfaceC0001b {
        C0428b() {
        }

        @Override // p000a.InterfaceC0001b
        /* renamed from: a */
        public void mo5a(Context context) {
            FragmentActivity.this.mFragments.m2592a(null);
            Bundle bundleM3658a = FragmentActivity.this.getSavedStateRegistry().m3658a(FragmentActivity.FRAGMENTS_TAG);
            if (bundleM3658a != null) {
                FragmentActivity.this.mFragments.m2613w(bundleM3658a.getParcelable(FragmentActivity.FRAGMENTS_TAG));
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    class C0429c extends AbstractC0459h<FragmentActivity> implements InterfaceC0495e0, InterfaceC0056c, InterfaceC0067c, InterfaceC0464m {
        public C0429c() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.InterfaceC0464m
        /* renamed from: a */
        public void mo2378a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0459h, androidx.fragment.app.AbstractC0456e
        /* renamed from: c */
        public View mo2371c(int i4) {
            return FragmentActivity.this.findViewById(i4);
        }

        @Override // androidx.fragment.app.AbstractC0459h, androidx.fragment.app.AbstractC0456e
        /* renamed from: d */
        public boolean mo2372d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.InterfaceC0067c
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0504l
        public AbstractC0496f getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0056c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC0495e0
        public C0493d0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: h */
        public void mo2379h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: j */
        public LayoutInflater mo2381j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: l */
        public boolean mo2382l(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: m */
        public boolean mo2383m(String str) {
            return C0320a.m1761q(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: p */
        public void mo2384p() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC0459h
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public FragmentActivity mo2380i() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.mFragments = C0457f.m2591b(new C0429c());
        this.mFragmentLifecycleRegistry = new C0506n(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m3661d(FRAGMENTS_TAG, new C0427a());
        addOnContextAvailableListener(new C0428b());
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC0496f.c cVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.m2504u0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), cVar);
                }
                C0474w c0474w = fragment.mViewLifecycleOwner;
                if (c0474w != null && c0474w.getLifecycle().mo2868b().m2874a(AbstractC0496f.c.STARTED)) {
                    fragment.mViewLifecycleOwner.m2771f(cVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.mo2868b().m2874a(AbstractC0496f.c.STARTED)) {
                    fragment.mLifecycleRegistry.m2893o(cVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m2612v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC0519a.m2922b(this).mo2923a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m2610t().m2462X(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m2610t();
    }

    @Deprecated
    public AbstractC0519a getSupportLoaderManager() {
        return AbstractC0519a.m2922b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC0496f.c.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        this.mFragments.m2611u();
        super.onActivityResult(i4, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.m2611u();
        super.onConfigurationChanged(configuration);
        this.mFragments.m2594d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_CREATE);
        this.mFragments.m2596f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return i4 == 0 ? super.onCreatePanelMenu(i4, menu) | this.mFragments.m2597g(menu, getMenuInflater()) : super.onCreatePanelMenu(i4, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.m2598h();
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m2599i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.mFragments.m2601k(menuItem);
        }
        if (i4 != 6) {
            return false;
        }
        return this.mFragments.m2595e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z3) {
        this.mFragments.m2600j(z3);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.m2611u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        if (i4 == 0) {
            this.mFragments.m2602l(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m2603m();
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z3) {
        this.mFragments.m2604n(z3);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return i4 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.m2605o(menu) : super.onPreparePanel(i4, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.mFragments.m2611u();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m2611u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m2609s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_RESUME);
        this.mFragments.m2606p();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m2611u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m2593c();
        }
        this.mFragments.m2609s();
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_START);
        this.mFragments.m2607q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m2611u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m2608r();
        this.mFragmentLifecycleRegistry.m2891h(AbstractC0496f.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC0328i abstractC0328i) {
        C0320a.m1759o(this, abstractC0328i);
    }

    public void setExitSharedElementCallback(AbstractC0328i abstractC0328i) {
        C0320a.m1760p(this, abstractC0328i);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityFromFragment(fragment, intent, i4, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            C0320a.m1763s(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0320a.m1755k(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0320a.m1756l(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0320a.m1764t(this);
    }

    @Override // androidx.core.app.C0320a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i4) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        if (i4 == -1) {
            C0320a.m1762r(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i4, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i4) {
        super(i4);
        this.mFragments = C0457f.m2591b(new C0429c());
        this.mFragmentLifecycleRegistry = new C0506n(this);
        this.mStopped = true;
        init();
    }
}

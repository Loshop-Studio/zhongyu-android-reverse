package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0224l0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0320a;
import androidx.core.app.C0325f;
import androidx.core.app.C0329j;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0497f0;
import androidx.lifecycle.C0499g0;
import androidx.savedstate.C0652d;
import androidx.savedstate.SavedStateRegistry;
import p000a.InterfaceC0001b;
import p088g.AbstractC2620b;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0102c, C0329j.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0103d mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    class C0078a implements SavedStateRegistry.InterfaceC0648b {
        C0078a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0648b
        /* renamed from: a */
        public Bundle mo65a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo236v(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    class C0079b implements InterfaceC0001b {
        C0079b() {
        }

        @Override // p000a.InterfaceC0001b
        /* renamed from: a */
        public void mo5a(Context context) {
            AbstractC0103d delegate = AppCompatActivity.this.getDelegate();
            delegate.mo224o();
            delegate.mo229r(AppCompatActivity.this.getSavedStateRegistry().m3658a(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m3661d(DELEGATE_TAG, new C0078a());
        addOnContextAvailableListener(new C0079b());
    }

    private void initViewTreeOwners() {
        C0497f0.m2875a(getWindow().getDecorView(), this);
        C0499g0.m2878a(getWindow().getDecorView(), this);
        C0652d.m3667a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo211b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo215f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo107g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo116p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i4) {
        return (T) getDelegate().mo218i(i4);
    }

    public AbstractC0103d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0103d.m275g(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0100a getDrawerToggleDelegate() {
        return getDelegate().mo220k();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo222m();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C0224l0.m915b()) {
            this.mResources = new C0224l0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo223n();
    }

    @Override // androidx.core.app.C0329j.a
    public Intent getSupportParentActivityIntent() {
        return C0325f.m1779a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo225p();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo227q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C0329j c0329j) {
        c0329j.m1789b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().mo231s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo110j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    protected void onNightModeChanged(int i4) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo233t(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().mo234u();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0329j c0329j) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().mo238w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().mo239x();
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public void onSupportActionModeFinished(AbstractC2620b abstractC2620b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public void onSupportActionModeStarted(AbstractC2620b abstractC2620b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C0329j c0329jM1787d = C0329j.m1787d(this);
        onCreateSupportNavigateUpTaskStack(c0329jM1787d);
        onPrepareSupportNavigateUpTaskStack(c0329jM1787d);
        c0329jM1787d.m1791e();
        try {
            C0320a.m1754j(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        getDelegate().mo198H(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public AbstractC2620b onWindowStartingSupportActionMode(AbstractC2620b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo117q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        initViewTreeOwners();
        getDelegate().mo191B(i4);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo195F(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z3) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(i4);
        getDelegate().mo196G(i4);
    }

    public AbstractC2620b startSupportActionMode(AbstractC2620b.a aVar) {
        return getDelegate().mo199I(aVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo225p();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0325f.m1783e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().mo190A(i4);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0325f.m1784f(this, intent);
    }

    public AppCompatActivity(int i4) {
        super(i4);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo193C(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo194D(view, layoutParams);
    }
}

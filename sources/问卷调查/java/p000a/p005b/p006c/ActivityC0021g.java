package p000a.p005b.p006c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p014h.C0120z0;
import p000a.p021e.C0131c;
import p000a.p031h.p032b.C0187b;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.C0192a;
import p000a.p052k.p053b.ActivityC0326p;

/* renamed from: a.b.c.g */
/* loaded from: classes.dex */
public class ActivityC0021g extends ActivityC0326p implements InterfaceC0022h {

    /* renamed from: n */
    public AbstractC0023i f62n;

    public ActivityC0021g() {
        this.f2656e.f2360b.m1420b("androidx:appcompat", new C0019e(this));
        m1555k(new C0020f(this));
    }

    /* renamed from: m */
    private void m22m() {
        getWindow().getDecorView().setTag(C1088R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C1088R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(C1088R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22m();
        m27q().mo33c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m27q().mo34d(context));
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: b */
    public void mo23b(AbstractC0040a abstractC0040a) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        m28r();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p000a.p031h.p032b.ActivityC0191f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m28r();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: f */
    public void mo24f(AbstractC0040a abstractC0040a) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m27q().mo35e(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m27q().mo37g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = C0120z0.f877a;
        return super.getResources();
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: h */
    public AbstractC0040a mo25h(AbstractC0040a.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m27q().mo40j();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m27q().mo41k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m27q().mo43m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM725t;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0015a abstractC0015aM28r = m28r();
        if (menuItem.getItemId() == 16908332 && abstractC0015aM28r != null && (((C0033s) abstractC0015aM28r).f182e.mo267j() & 4) != 0 && (intentM725t = C0190e.m725t(this)) != null) {
            if (!shouldUpRecreateTask(intentM725t)) {
                navigateUpTo(intentM725t);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM29s = m29s();
            if (intentM29s == null) {
                intentM29s = C0190e.m725t(this);
            }
            if (intentM29s != null) {
                ComponentName component = intentM29s.getComponent();
                if (component == null) {
                    component = intentM29s.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent intentM726u = C0190e.m726u(this, component);
                        if (intentM726u == null) {
                            break;
                        }
                        arrayList.add(size, intentM726u);
                        component = intentM726u.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(intentM29s);
            }
            m31u();
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = C0192a.f1425a;
            C0192a.a.m733a(this, intentArr, null);
            try {
                int i2 = C0187b.f1402b;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m27q().mo44n(bundle);
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m27q().mo45o();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onStart() {
        super.onStart();
        m27q().mo47q();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onStop() {
        super.onStop();
        m27q().mo48r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m27q().mo54y(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        m28r();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p
    /* renamed from: p */
    public void mo26p() {
        m27q().mo40j();
    }

    /* renamed from: q */
    public AbstractC0023i m27q() {
        if (this.f62n == null) {
            C0131c<WeakReference<AbstractC0023i>> c0131c = AbstractC0023i.f63b;
            this.f62n = new LayoutInflaterFactory2C0024j(this, null, this, this);
        }
        return this.f62n;
    }

    /* renamed from: r */
    public AbstractC0015a m28r() {
        return m27q().mo38h();
    }

    /* renamed from: s */
    public Intent m29s() {
        return C0190e.m725t(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        m22m();
        m27q().mo50u(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m22m();
        m27q().mo51v(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22m();
        m27q().mo52w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m27q().mo53x(i);
    }

    /* renamed from: t */
    public void m30t() {
    }

    /* renamed from: u */
    public void m31u() {
    }
}

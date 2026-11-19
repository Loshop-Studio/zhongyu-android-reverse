package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.InterfaceC0002c;
import p000a.p001a.p002d.C0003a;
import p000a.p001a.p002d.InterfaceC0004b;
import p000a.p001a.p003e.AbstractC0008d;
import p000a.p001a.p003e.InterfaceC0009e;
import p000a.p031h.p032b.ActivityC0191f;
import p000a.p031h.p032b.C0190e;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.C0371t;
import p000a.p057m.FragmentC0366o;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0372u;
import p000a.p062p.C0404a;
import p000a.p062p.C0405b;
import p000a.p062p.InterfaceC0406c;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0191f implements InterfaceC0358g, InterfaceC0372u, InterfaceC0406c, InterfaceC0002c, InterfaceC0009e {

    /* renamed from: c */
    public final C0003a f2654c = new C0003a();

    /* renamed from: d */
    public final C0359h f2655d;

    /* renamed from: e */
    public final C0405b f2656e;

    /* renamed from: f */
    public C0371t f2657f;

    /* renamed from: g */
    public final OnBackPressedDispatcher f2658g;

    /* renamed from: h */
    public final AbstractC0008d f2659h;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0450a implements Runnable {
        public RunnableC0450a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0451b extends AbstractC0008d {
        public C0451b(ComponentActivity componentActivity) {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public class C0452c implements C0404a.b {
        public C0452c() {
        }

        @Override // p000a.p062p.C0404a.b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public Bundle mo21a() {
            Bundle bundle = new Bundle();
            AbstractC0008d abstractC0008d = ComponentActivity.this.f2659h;
            Objects.requireNonNull(abstractC0008d);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(abstractC0008d.f8c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(abstractC0008d.f8c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0008d.f10e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0008d.f13h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", abstractC0008d.f6a);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public class C0453d implements InterfaceC0004b {
        public C0453d() {
        }

        @Override // p000a.p001a.p002d.InterfaceC0004b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo2a(Context context) {
            Bundle bundleM1419a = ComponentActivity.this.f2656e.f2360b.m1419a("android:support:activity-result");
            if (bundleM1419a != null) {
                AbstractC0008d abstractC0008d = ComponentActivity.this.f2659h;
                Objects.requireNonNull(abstractC0008d);
                ArrayList<Integer> integerArrayList = bundleM1419a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = bundleM1419a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList == null || integerArrayList == null) {
                    return;
                }
                abstractC0008d.f10e = bundleM1419a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                abstractC0008d.f6a = (Random) bundleM1419a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                abstractC0008d.f13h.putAll(bundleM1419a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (abstractC0008d.f8c.containsKey(str)) {
                        Integer numRemove = abstractC0008d.f8c.remove(str);
                        if (!abstractC0008d.f13h.containsKey(str)) {
                            abstractC0008d.f7b.remove(numRemove);
                        }
                    }
                    int iIntValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    abstractC0008d.f7b.put(Integer.valueOf(iIntValue), str2);
                    abstractC0008d.f8c.put(str2, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    public static final class C0454e {

        /* renamed from: a */
        public C0371t f2666a;
    }

    public ComponentActivity() {
        C0359h c0359h = new C0359h(this);
        this.f2655d = c0359h;
        C0405b c0405b = new C0405b(this);
        this.f2656e = c0405b;
        this.f2658g = new OnBackPressedDispatcher(new RunnableC0450a());
        new AtomicInteger();
        this.f2659h = new C0451b(this);
        if (c0359h == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        c0359h.mo1275a(new InterfaceC0356e() { // from class: androidx.activity.ComponentActivity.3
            @Override // p000a.p057m.InterfaceC0356e
            /* renamed from: g */
            public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
                if (aVar == AbstractC0355d.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0359h.mo1275a(new InterfaceC0356e() { // from class: androidx.activity.ComponentActivity.4
            @Override // p000a.p057m.InterfaceC0356e
            /* renamed from: g */
            public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
                if (aVar == AbstractC0355d.a.ON_DESTROY) {
                    ComponentActivity.this.f2654c.f3b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.mo1154e().m1295a();
                }
            }
        });
        c0359h.mo1275a(new InterfaceC0356e() { // from class: androidx.activity.ComponentActivity.5
            @Override // p000a.p057m.InterfaceC0356e
            /* renamed from: g */
            public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
                ComponentActivity.this.m1556l();
                C0359h c0359h2 = ComponentActivity.this.f2655d;
                c0359h2.m1281c("removeObserver");
                c0359h2.f2170a.mo464e(this);
            }
        });
        if (i <= 23) {
            c0359h.mo1275a(new ImmLeaksCleaner(this));
        }
        c0405b.f2360b.m1420b("android:support:activity-result", new C0452c());
        m1555k(new C0453d());
    }

    @Override // p000a.p057m.InterfaceC0358g
    /* renamed from: a */
    public AbstractC0355d mo1151a() {
        return this.f2655d;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m1557m();
        super.addContentView(view, layoutParams);
    }

    @Override // p000a.p001a.InterfaceC0002c
    /* renamed from: c */
    public final OnBackPressedDispatcher mo1c() {
        return this.f2658g;
    }

    @Override // p000a.p062p.InterfaceC0406c
    /* renamed from: d */
    public final C0404a mo1153d() {
        return this.f2656e.f2360b;
    }

    @Override // p000a.p057m.InterfaceC0372u
    /* renamed from: e */
    public C0371t mo1154e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m1556l();
        return this.f2657f;
    }

    @Override // p000a.p001a.p003e.InterfaceC0009e
    /* renamed from: g */
    public final AbstractC0008d mo8g() {
        return this.f2659h;
    }

    /* renamed from: k */
    public final void m1555k(InterfaceC0004b interfaceC0004b) {
        C0003a c0003a = this.f2654c;
        if (c0003a.f3b != null) {
            interfaceC0004b.mo2a(c0003a.f3b);
        }
        c0003a.f2a.add(interfaceC0004b);
    }

    /* renamed from: l */
    public void m1556l() {
        if (this.f2657f == null) {
            C0454e c0454e = (C0454e) getLastNonConfigurationInstance();
            if (c0454e != null) {
                this.f2657f = c0454e.f2666a;
            }
            if (this.f2657f == null) {
                this.f2657f = new C0371t();
            }
        }
    }

    /* renamed from: m */
    public final void m1557m() {
        getWindow().getDecorView().setTag(C1088R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C1088R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(C1088R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f2659h.m5a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f2658g.m1558a();
    }

    @Override // p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2656e.m1423a(bundle);
        C0003a c0003a = this.f2654c;
        c0003a.f3b = this;
        Iterator<InterfaceC0004b> it = c0003a.f2a.iterator();
        while (it.hasNext()) {
            it.next().mo2a(this);
        }
        super.onCreate(bundle);
        FragmentC0366o.m1292c(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f2659h.m5a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0454e c0454e;
        C0371t c0371t = this.f2657f;
        if (c0371t == null && (c0454e = (C0454e) getLastNonConfigurationInstance()) != null) {
            c0371t = c0454e.f2666a;
        }
        if (c0371t == null) {
            return null;
        }
        C0454e c0454e2 = new C0454e();
        c0454e2.f2666a = c0371t;
        return c0454e2;
    }

    @Override // p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0359h c0359h = this.f2655d;
        if (c0359h instanceof C0359h) {
            AbstractC0355d.b bVar = AbstractC0355d.b.CREATED;
            c0359h.m1281c("setCurrentState");
            c0359h.m1283f(bVar);
        }
        super.onSaveInstanceState(bundle);
        this.f2656e.m1424b(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C0190e.m688A()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m1557m();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m1557m();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m1557m();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}

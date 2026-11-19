package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.InterfaceC0002c;
import p000a.p001a.p003e.AbstractC0008d;
import p000a.p001a.p003e.InterfaceC0009e;
import p000a.p031h.p032b.C0190e;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0372u;
import p000a.p058n.p059a.AbstractC0373a;

/* renamed from: a.k.b.p */
/* loaded from: classes.dex */
public class ActivityC0326p extends ComponentActivity {

    /* renamed from: i */
    public final C0342x f2029i;

    /* renamed from: j */
    public final C0359h f2030j;

    /* renamed from: k */
    public boolean f2031k;

    /* renamed from: l */
    public boolean f2032l;

    /* renamed from: m */
    public boolean f2033m;

    /* renamed from: a.k.b.p$a */
    public class a extends AbstractC0346z<ActivityC0326p> implements InterfaceC0372u, InterfaceC0002c, InterfaceC0009e, InterfaceC0309g0 {
        public a() {
            super(ActivityC0326p.this);
        }

        @Override // p000a.p057m.InterfaceC0358g
        /* renamed from: a */
        public AbstractC0355d mo1151a() {
            return ActivityC0326p.this.f2030j;
        }

        @Override // p000a.p052k.p053b.InterfaceC0309g0
        /* renamed from: b */
        public void mo1070b(AbstractC0301c0 abstractC0301c0, ComponentCallbacksC0320m componentCallbacksC0320m) {
            ActivityC0326p.this.m1195o();
        }

        @Override // p000a.p001a.InterfaceC0002c
        /* renamed from: c */
        public OnBackPressedDispatcher mo1c() {
            return ActivityC0326p.this.f2658g;
        }

        @Override // p000a.p057m.InterfaceC0372u
        /* renamed from: e */
        public C0371t mo1154e() {
            return ActivityC0326p.this.mo1154e();
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: f */
        public View mo1127f(int i) {
            return ActivityC0326p.this.findViewById(i);
        }

        @Override // p000a.p001a.p003e.InterfaceC0009e
        /* renamed from: g */
        public AbstractC0008d mo8g() {
            return ActivityC0326p.this.f2659h;
        }

        @Override // p000a.p052k.p053b.AbstractC0338v
        /* renamed from: h */
        public boolean mo1128h() {
            Window window = ActivityC0326p.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p000a.p052k.p053b.AbstractC0346z
        /* renamed from: i */
        public ActivityC0326p mo1196i() {
            return ActivityC0326p.this;
        }

        @Override // p000a.p052k.p053b.AbstractC0346z
        /* renamed from: j */
        public LayoutInflater mo1197j() {
            return ActivityC0326p.this.getLayoutInflater().cloneInContext(ActivityC0326p.this);
        }

        @Override // p000a.p052k.p053b.AbstractC0346z
        /* renamed from: k */
        public boolean mo1198k(ComponentCallbacksC0320m componentCallbacksC0320m) {
            return !ActivityC0326p.this.isFinishing();
        }

        @Override // p000a.p052k.p053b.AbstractC0346z
        /* renamed from: l */
        public void mo1199l() {
            ActivityC0326p.this.mo26p();
        }
    }

    public ActivityC0326p() {
        a aVar = new a();
        C0190e.m711f(aVar, "callbacks == null");
        this.f2029i = new C0342x(aVar);
        this.f2030j = new C0359h(this);
        this.f2033m = true;
        this.f2656e.f2360b.m1420b("android:support:fragments", new C0322n(this));
        m1555k(new C0324o(this));
    }

    /* renamed from: n */
    public static boolean m1194n(AbstractC0301c0 abstractC0301c0, AbstractC0355d.b bVar) {
        AbstractC0355d.b bVar2 = AbstractC0355d.b.STARTED;
        boolean zM1194n = false;
        for (ComponentCallbacksC0320m componentCallbacksC0320m : abstractC0301c0.f1808c.m1109i()) {
            if (componentCallbacksC0320m != null) {
                AbstractC0346z<?> abstractC0346z = componentCallbacksC0320m.f1996u;
                if ((abstractC0346z == null ? null : abstractC0346z.mo1196i()) != null) {
                    zM1194n |= m1194n(componentCallbacksC0320m.m1162j(), bVar);
                }
                C0343x0 c0343x0 = componentCallbacksC0320m.f1973Q;
                if (c0343x0 != null) {
                    c0343x0.m1245f();
                    if (c0343x0.f2116c.f2171b.compareTo(bVar2) >= 0) {
                        C0359h c0359h = componentCallbacksC0320m.f1973Q.f2116c;
                        c0359h.m1281c("setCurrentState");
                        c0359h.m1283f(bVar);
                        zM1194n = true;
                    }
                }
                if (componentCallbacksC0320m.f1972P.f2171b.compareTo(bVar2) >= 0) {
                    C0359h c0359h2 = componentCallbacksC0320m.f1972P;
                    c0359h2.m1281c("setCurrentState");
                    c0359h2.m1283f(bVar);
                    zM1194n = true;
                }
            }
        }
        return zM1194n;
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
        printWriter.print(this.f2031k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2032l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2033m);
        if (getApplication() != null) {
            AbstractC0373a.m1296b(this).mo1297a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2029i.f2114a.f2124e.m1065y(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: o */
    public void m1195o() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2029i.m1243a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2029i.m1243a();
        super.onConfigurationChanged(configuration);
        this.f2029i.f2114a.f2124e.m1051k(configuration);
    }

    @Override // androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2030j.m1282d(AbstractC0355d.a.ON_CREATE);
        this.f2029i.f2114a.f2124e.m1053m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0342x c0342x = this.f2029i;
        return zOnCreatePanelMenu | c0342x.f2114a.f2124e.m1054n(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f2029i.f2114a.f2124e.f1811f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2029i.f2114a.f2124e.m1055o();
        this.f2030j.m1282d(AbstractC0355d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2029i.f2114a.f2124e.m1056p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2029i.f2114a.f2124e.m1058r(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2029i.f2114a.f2124e.m1052l(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f2029i.f2114a.f2124e.m1057q(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f2029i.m1243a();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2029i.f2114a.f2124e.m1059s(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2032l = false;
        this.f2029i.f2114a.f2124e.m1063w(5);
        this.f2030j.m1282d(AbstractC0355d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f2029i.f2114a.f2124e.m1061u(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2030j.m1282d(AbstractC0355d.a.ON_RESUME);
        AbstractC0301c0 abstractC0301c0 = this.f2029i.f2114a.f2124e;
        abstractC0301c0.f1796B = false;
        abstractC0301c0.f1797C = false;
        abstractC0301c0.f1804J.f1872g = false;
        abstractC0301c0.m1063w(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.f2029i.f2114a.f2124e.m1062v(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2029i.m1243a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f2029i.m1243a();
        super.onResume();
        this.f2032l = true;
        this.f2029i.f2114a.f2124e.m1008C(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f2029i.m1243a();
        super.onStart();
        this.f2033m = false;
        if (!this.f2031k) {
            this.f2031k = true;
            AbstractC0301c0 abstractC0301c0 = this.f2029i.f2114a.f2124e;
            abstractC0301c0.f1796B = false;
            abstractC0301c0.f1797C = false;
            abstractC0301c0.f1804J.f1872g = false;
            abstractC0301c0.m1063w(4);
        }
        this.f2029i.f2114a.f2124e.m1008C(true);
        this.f2030j.m1282d(AbstractC0355d.a.ON_START);
        AbstractC0301c0 abstractC0301c02 = this.f2029i.f2114a.f2124e;
        abstractC0301c02.f1796B = false;
        abstractC0301c02.f1797C = false;
        abstractC0301c02.f1804J.f1872g = false;
        abstractC0301c02.m1063w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2029i.m1243a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2033m = true;
        while (m1194n(this.f2029i.f2114a.f2124e, AbstractC0355d.b.CREATED)) {
        }
        AbstractC0301c0 abstractC0301c0 = this.f2029i.f2114a.f2124e;
        abstractC0301c0.f1797C = true;
        abstractC0301c0.f1804J.f1872g = true;
        abstractC0301c0.m1063w(4);
        this.f2030j.m1282d(AbstractC0355d.a.ON_STOP);
    }

    @Deprecated
    /* renamed from: p */
    public void mo26p() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f2029i.f2114a.f2124e.f1811f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}

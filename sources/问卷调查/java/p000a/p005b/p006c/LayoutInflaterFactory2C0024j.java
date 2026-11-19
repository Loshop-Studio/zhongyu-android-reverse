package p000a.p005b.p006c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p006c.C0032r;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p012g.C0042c;
import p000a.p005b.p012g.C0045f;
import p000a.p005b.p012g.C0046g;
import p000a.p005b.p012g.WindowCallbackC0047h;
import p000a.p005b.p012g.p013i.C0052e;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p014h.C0069a1;
import p000a.p005b.p014h.C0085i;
import p000a.p005b.p014h.C0090k0;
import p000a.p005b.p014h.C0110u0;
import p000a.p005b.p014h.InterfaceC0119z;
import p000a.p021e.C0133e;
import p000a.p021e.C0136h;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p033c.p034b.C0201i;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;
import p000a.p031h.p043j.C0277z;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.b.c.j */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0024j extends AbstractC0023i implements C0054g.a, LayoutInflater.Factory2 {

    /* renamed from: Z */
    public static final C0136h<String, Integer> f65Z = new C0136h<>();

    /* renamed from: a0 */
    public static final int[] f66a0 = {R.attr.windowBackground};

    /* renamed from: b0 */
    public static final boolean f67b0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: c0 */
    public static final boolean f68c0 = true;

    /* renamed from: A */
    public boolean f69A;

    /* renamed from: B */
    public boolean f70B;

    /* renamed from: C */
    public boolean f71C;

    /* renamed from: D */
    public boolean f72D;

    /* renamed from: E */
    public boolean f73E;

    /* renamed from: F */
    public i[] f74F;

    /* renamed from: G */
    public i f75G;

    /* renamed from: H */
    public boolean f76H;

    /* renamed from: I */
    public boolean f77I;

    /* renamed from: J */
    public boolean f78J;

    /* renamed from: K */
    public boolean f79K;

    /* renamed from: L */
    public boolean f80L;

    /* renamed from: M */
    public int f81M;

    /* renamed from: N */
    public int f82N;

    /* renamed from: O */
    public boolean f83O;

    /* renamed from: P */
    public boolean f84P;

    /* renamed from: Q */
    public f f85Q;

    /* renamed from: R */
    public f f86R;

    /* renamed from: S */
    public boolean f87S;

    /* renamed from: T */
    public int f88T;

    /* renamed from: V */
    public boolean f90V;

    /* renamed from: W */
    public Rect f91W;

    /* renamed from: X */
    public Rect f92X;

    /* renamed from: Y */
    public C0030p f93Y;

    /* renamed from: d */
    public final Object f94d;

    /* renamed from: e */
    public final Context f95e;

    /* renamed from: f */
    public Window f96f;

    /* renamed from: g */
    public d f97g;

    /* renamed from: h */
    public final InterfaceC0022h f98h;

    /* renamed from: i */
    public AbstractC0015a f99i;

    /* renamed from: j */
    public MenuInflater f100j;

    /* renamed from: k */
    public CharSequence f101k;

    /* renamed from: l */
    public InterfaceC0119z f102l;

    /* renamed from: m */
    public b f103m;

    /* renamed from: n */
    public j f104n;

    /* renamed from: o */
    public AbstractC0040a f105o;

    /* renamed from: p */
    public ActionBarContextView f106p;

    /* renamed from: q */
    public PopupWindow f107q;

    /* renamed from: r */
    public Runnable f108r;

    /* renamed from: t */
    public boolean f110t;

    /* renamed from: u */
    public ViewGroup f111u;

    /* renamed from: v */
    public TextView f112v;

    /* renamed from: w */
    public View f113w;

    /* renamed from: x */
    public boolean f114x;

    /* renamed from: y */
    public boolean f115y;

    /* renamed from: z */
    public boolean f116z;

    /* renamed from: s */
    public C0273v f109s = null;

    /* renamed from: U */
    public final Runnable f89U = new a();

    /* renamed from: a.b.c.j$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            if ((layoutInflaterFactory2C0024j.f88T & 1) != 0) {
                layoutInflaterFactory2C0024j.m62H(0);
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j2 = LayoutInflaterFactory2C0024j.this;
            if ((layoutInflaterFactory2C0024j2.f88T & 4096) != 0) {
                layoutInflaterFactory2C0024j2.m62H(108);
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j3 = LayoutInflaterFactory2C0024j.this;
            layoutInflaterFactory2C0024j3.f87S = false;
            layoutInflaterFactory2C0024j3.f88T = 0;
        }
    }

    /* renamed from: a.b.c.j$b */
    public final class b implements InterfaceC0060m.a {
        public b() {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: c */
        public void mo82c(C0054g c0054g, boolean z) {
            LayoutInflaterFactory2C0024j.this.m58D(c0054g);
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: d */
        public boolean mo83d(C0054g c0054g) {
            Window.Callback callbackM69O = LayoutInflaterFactory2C0024j.this.m69O();
            if (callbackM69O == null) {
                return true;
            }
            callbackM69O.onMenuOpened(108, c0054g);
            return true;
        }
    }

    /* renamed from: a.b.c.j$c */
    public class c implements AbstractC0040a.a {

        /* renamed from: a */
        public AbstractC0040a.a f119a;

        /* renamed from: a.b.c.j$c$a */
        public class a extends C0275x {
            public a() {
            }

            @Override // p000a.p031h.p043j.InterfaceC0274w
            /* renamed from: a */
            public void mo88a(View view) {
                LayoutInflaterFactory2C0024j.this.f106p.setVisibility(8);
                LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0024j.f107q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0024j.f106p.getParent() instanceof View) {
                    View view2 = (View) LayoutInflaterFactory2C0024j.this.f106p.getParent();
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    view2.requestApplyInsets();
                }
                LayoutInflaterFactory2C0024j.this.f106p.m1573h();
                LayoutInflaterFactory2C0024j.this.f109s.m889d(null);
                LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j2 = LayoutInflaterFactory2C0024j.this;
                layoutInflaterFactory2C0024j2.f109s = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0024j2.f111u;
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                viewGroup.requestApplyInsets();
            }
        }

        public c(AbstractC0040a.a aVar) {
            this.f119a = aVar;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: a */
        public boolean mo84a(AbstractC0040a abstractC0040a, Menu menu) {
            ViewGroup viewGroup = LayoutInflaterFactory2C0024j.this.f111u;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            viewGroup.requestApplyInsets();
            return this.f119a.mo84a(abstractC0040a, menu);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: b */
        public void mo85b(AbstractC0040a abstractC0040a) {
            this.f119a.mo85b(abstractC0040a);
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            if (layoutInflaterFactory2C0024j.f107q != null) {
                layoutInflaterFactory2C0024j.f96f.getDecorView().removeCallbacks(LayoutInflaterFactory2C0024j.this.f108r);
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j2 = LayoutInflaterFactory2C0024j.this;
            if (layoutInflaterFactory2C0024j2.f106p != null) {
                layoutInflaterFactory2C0024j2.m63I();
                LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j3 = LayoutInflaterFactory2C0024j.this;
                C0273v c0273vM862a = C0266o.m862a(layoutInflaterFactory2C0024j3.f106p);
                c0273vM862a.m886a(0.0f);
                layoutInflaterFactory2C0024j3.f109s = c0273vM862a;
                C0273v c0273v = LayoutInflaterFactory2C0024j.this.f109s;
                a aVar = new a();
                View view = c0273v.f1632a.get();
                if (view != null) {
                    c0273v.m890e(view, aVar);
                }
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j4 = LayoutInflaterFactory2C0024j.this;
            InterfaceC0022h interfaceC0022h = layoutInflaterFactory2C0024j4.f98h;
            if (interfaceC0022h != null) {
                interfaceC0022h.mo24f(layoutInflaterFactory2C0024j4.f105o);
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j5 = LayoutInflaterFactory2C0024j.this;
            layoutInflaterFactory2C0024j5.f105o = null;
            ViewGroup viewGroup = layoutInflaterFactory2C0024j5.f111u;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            viewGroup.requestApplyInsets();
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: c */
        public boolean mo86c(AbstractC0040a abstractC0040a, MenuItem menuItem) {
            return this.f119a.mo86c(abstractC0040a, menuItem);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: d */
        public boolean mo87d(AbstractC0040a abstractC0040a, Menu menu) {
            return this.f119a.mo87d(abstractC0040a, menu);
        }
    }

    /* renamed from: a.b.c.j$d */
    public class d extends WindowCallbackC0047h {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.ActionMode m89a(android.view.ActionMode.Callback r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 521
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.d.m89a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0024j.this.m61G(keyEvent) || this.f354b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f354b
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L70
                a.b.c.j r0 = p000a.p005b.p006c.LayoutInflaterFactory2C0024j.this
                int r3 = r7.getKeyCode()
                r0.m70P()
                a.b.c.a r4 = r0.f99i
                if (r4 == 0) goto L3f
                a.b.c.s r4 = (p000a.p005b.p006c.C0033s) r4
                a.b.c.s$d r4 = r4.f186i
                if (r4 != 0) goto L1e
                goto L3b
            L1e:
                a.b.g.i.g r4 = r4.f207e
                if (r4 == 0) goto L3b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L32
                r5 = r2
                goto L33
            L32:
                r5 = r1
            L33:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L3c
            L3b:
                r3 = r1
            L3c:
                if (r3 == 0) goto L3f
                goto L6b
            L3f:
                a.b.c.j$i r3 = r0.f75G
                if (r3 == 0) goto L54
                int r4 = r7.getKeyCode()
                boolean r3 = r0.m74T(r3, r4, r7, r2)
                if (r3 == 0) goto L54
                a.b.c.j$i r7 = r0.f75G
                if (r7 == 0) goto L6b
                r7.f142l = r2
                goto L6b
            L54:
                a.b.c.j$i r3 = r0.f75G
                if (r3 != 0) goto L6d
                a.b.c.j$i r3 = r0.m68N(r1)
                r0.m75U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.m74T(r3, r4, r7, r2)
                r3.f141k = r1
                if (r7 == 0) goto L6d
            L6b:
                r7 = r2
                goto L6e
            L6d:
                r7 = r1
            L6e:
                if (r7 == 0) goto L71
            L70:
                r1 = r2
            L71:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0054g)) {
                return this.f354b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f354b.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            Objects.requireNonNull(layoutInflaterFactory2C0024j);
            if (i == 108) {
                layoutInflaterFactory2C0024j.m70P();
                AbstractC0015a abstractC0015a = layoutInflaterFactory2C0024j.f99i;
                if (abstractC0015a != null) {
                    abstractC0015a.mo14a(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f354b.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            Objects.requireNonNull(layoutInflaterFactory2C0024j);
            if (i == 108) {
                layoutInflaterFactory2C0024j.m70P();
                AbstractC0015a abstractC0015a = layoutInflaterFactory2C0024j.f99i;
                if (abstractC0015a != null) {
                    abstractC0015a.mo14a(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                i iVarM68N = layoutInflaterFactory2C0024j.m68N(i);
                if (iVarM68N.f143m) {
                    layoutInflaterFactory2C0024j.m59E(iVarM68N, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0054g c0054g = menu instanceof C0054g ? (C0054g) menu : null;
            if (i == 0 && c0054g == null) {
                return false;
            }
            if (c0054g != null) {
                c0054g.f456x = true;
            }
            boolean zOnPreparePanel = this.f354b.onPreparePanel(i, view, menu);
            if (c0054g != null) {
                c0054g.f456x = false;
            }
            return zOnPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0054g c0054g = LayoutInflaterFactory2C0024j.this.m68N(0).f138h;
            if (c0054g != null) {
                this.f354b.onProvideKeyboardShortcuts(list, c0054g, i);
            } else {
                this.f354b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(LayoutInflaterFactory2C0024j.this);
            return i != 0 ? this.f354b.onWindowStartingActionMode(callback, i) : m89a(callback);
        }
    }

    /* renamed from: a.b.c.j$e */
    public class e extends f {

        /* renamed from: c */
        public final PowerManager f123c;

        public e(Context context) {
            super();
            this.f123c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: b */
        public IntentFilter mo90b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: c */
        public int mo91c() {
            return this.f123c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: d */
        public void mo92d() {
            LayoutInflaterFactory2C0024j.this.m81z();
        }
    }

    /* renamed from: a.b.c.j$f */
    public abstract class f {

        /* renamed from: a */
        public BroadcastReceiver f125a;

        /* renamed from: a.b.c.j$f$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                f.this.mo92d();
            }
        }

        public f() {
        }

        /* renamed from: a */
        public void m93a() {
            BroadcastReceiver broadcastReceiver = this.f125a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0024j.this.f95e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f125a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo90b();

        /* renamed from: c */
        public abstract int mo91c();

        /* renamed from: d */
        public abstract void mo92d();

        /* renamed from: e */
        public void m94e() {
            m93a();
            IntentFilter intentFilterMo90b = mo90b();
            if (intentFilterMo90b == null || intentFilterMo90b.countActions() == 0) {
                return;
            }
            if (this.f125a == null) {
                this.f125a = new a();
            }
            LayoutInflaterFactory2C0024j.this.f95e.registerReceiver(this.f125a, intentFilterMo90b);
        }
    }

    /* renamed from: a.b.c.j$g */
    public class g extends f {

        /* renamed from: c */
        public final C0032r f128c;

        public g(C0032r c0032r) {
            super();
            this.f128c = c0032r;
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: b */
        public IntentFilter mo90b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: c */
        public int mo91c() {
            boolean z;
            long j;
            C0032r c0032r = this.f128c;
            C0032r.a aVar = c0032r.f173c;
            if (aVar.f175b > System.currentTimeMillis()) {
                z = aVar.f174a;
            } else {
                Location locationM110a = C0190e.m712g(c0032r.f171a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c0032r.m110a("network") : null;
                Location locationM110a2 = C0190e.m712g(c0032r.f171a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c0032r.m110a("gps") : null;
                if (locationM110a2 == null || locationM110a == null ? locationM110a2 != null : locationM110a2.getTime() > locationM110a.getTime()) {
                    locationM110a = locationM110a2;
                }
                if (locationM110a != null) {
                    C0032r.a aVar2 = c0032r.f173c;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0031q.f166d == null) {
                        C0031q.f166d = new C0031q();
                    }
                    C0031q c0031q = C0031q.f166d;
                    c0031q.m109a(jCurrentTimeMillis - 86400000, locationM110a.getLatitude(), locationM110a.getLongitude());
                    c0031q.m109a(jCurrentTimeMillis, locationM110a.getLatitude(), locationM110a.getLongitude());
                    boolean z2 = c0031q.f169c == 1;
                    long j2 = c0031q.f168b;
                    long j3 = c0031q.f167a;
                    c0031q.m109a(jCurrentTimeMillis + 86400000, locationM110a.getLatitude(), locationM110a.getLongitude());
                    long j4 = c0031q.f168b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        j = (jCurrentTimeMillis > j3 ? j4 + 0 : jCurrentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                    }
                    aVar2.f174a = z2;
                    aVar2.f175b = j;
                    z = aVar.f174a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f
        /* renamed from: d */
        public void mo92d() {
            LayoutInflaterFactory2C0024j.this.m81z();
        }
    }

    /* renamed from: a.b.c.j$h */
    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0024j.this.m61G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
                    layoutInflaterFactory2C0024j.m59E(layoutInflaterFactory2C0024j.m68N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0034a.m129a(getContext(), i));
        }
    }

    /* renamed from: a.b.c.j$i */
    public static final class i {

        /* renamed from: a */
        public int f131a;

        /* renamed from: b */
        public int f132b;

        /* renamed from: c */
        public int f133c;

        /* renamed from: d */
        public int f134d;

        /* renamed from: e */
        public ViewGroup f135e;

        /* renamed from: f */
        public View f136f;

        /* renamed from: g */
        public View f137g;

        /* renamed from: h */
        public C0054g f138h;

        /* renamed from: i */
        public C0052e f139i;

        /* renamed from: j */
        public Context f140j;

        /* renamed from: k */
        public boolean f141k;

        /* renamed from: l */
        public boolean f142l;

        /* renamed from: m */
        public boolean f143m;

        /* renamed from: n */
        public boolean f144n;

        /* renamed from: o */
        public boolean f145o = false;

        /* renamed from: p */
        public boolean f146p;

        /* renamed from: q */
        public Bundle f147q;

        public i(int i) {
            this.f131a = i;
        }

        /* renamed from: a */
        public void m95a(C0054g c0054g) {
            C0052e c0052e;
            C0054g c0054g2 = this.f138h;
            if (c0054g == c0054g2) {
                return;
            }
            if (c0054g2 != null) {
                c0054g2.m216u(this.f139i);
            }
            this.f138h = c0054g;
            if (c0054g == null || (c0052e = this.f139i) == null) {
                return;
            }
            c0054g.m197b(c0052e, c0054g.f433a);
        }
    }

    /* renamed from: a.b.c.j$j */
    public final class j implements InterfaceC0060m.a {
        public j() {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: c */
        public void mo82c(C0054g c0054g, boolean z) {
            C0054g c0054gMo206k = c0054g.mo206k();
            boolean z2 = c0054gMo206k != c0054g;
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            if (z2) {
                c0054g = c0054gMo206k;
            }
            i iVarM66L = layoutInflaterFactory2C0024j.m66L(c0054g);
            if (iVarM66L != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0024j.this.m59E(iVarM66L, z);
                } else {
                    LayoutInflaterFactory2C0024j.this.m57C(iVarM66L.f131a, iVarM66L, c0054gMo206k);
                    LayoutInflaterFactory2C0024j.this.m59E(iVarM66L, true);
                }
            }
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: d */
        public boolean mo83d(C0054g c0054g) {
            Window.Callback callbackM69O;
            if (c0054g != c0054g.mo206k()) {
                return true;
            }
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = LayoutInflaterFactory2C0024j.this;
            if (!layoutInflaterFactory2C0024j.f116z || (callbackM69O = layoutInflaterFactory2C0024j.m69O()) == null || LayoutInflaterFactory2C0024j.this.f80L) {
                return true;
            }
            callbackM69O.onMenuOpened(108, c0054g);
            return true;
        }
    }

    public LayoutInflaterFactory2C0024j(Context context, Window window, InterfaceC0022h interfaceC0022h, Object obj) {
        C0136h<String, Integer> c0136h;
        Integer orDefault;
        ActivityC0021g activityC0021g;
        this.f81M = -100;
        this.f95e = context;
        this.f98h = interfaceC0022h;
        this.f94d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof ActivityC0021g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    activityC0021g = (ActivityC0021g) context;
                    break;
                }
            }
            activityC0021g = null;
            if (activityC0021g != null) {
                this.f81M = activityC0021g.m27q().mo36f();
            }
        }
        if (this.f81M == -100 && (orDefault = (c0136h = f65Z).getOrDefault(this.f94d.getClass().getName(), null)) != null) {
            this.f81M = orDefault.intValue();
            c0136h.remove(this.f94d.getClass().getName());
        }
        if (window != null) {
            m56B(window);
        }
        C0085i.m335e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m55A(boolean r13) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.m55A(boolean):boolean");
    }

    /* renamed from: B */
    public final void m56B(Window window) {
        if (this.f96f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof d) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        d dVar = new d(callback);
        this.f97g = dVar;
        window.setCallback(dVar);
        C0110u0 c0110u0M413p = C0110u0.m413p(this.f95e, null, f66a0);
        Drawable drawableM422h = c0110u0M413p.m422h(0);
        if (drawableM422h != null) {
            window.setBackgroundDrawable(drawableM422h);
        }
        c0110u0M413p.f810b.recycle();
        this.f96f = window;
    }

    /* renamed from: C */
    public void m57C(int i2, i iVar, Menu menu) {
        if (menu == null && iVar != null) {
            menu = iVar.f138h;
        }
        if ((iVar == null || iVar.f143m) && !this.f80L) {
            this.f97g.f354b.onPanelClosed(i2, menu);
        }
    }

    /* renamed from: D */
    public void m58D(C0054g c0054g) {
        if (this.f73E) {
            return;
        }
        this.f73E = true;
        this.f102l.mo459j();
        Window.Callback callbackM69O = m69O();
        if (callbackM69O != null && !this.f80L) {
            callbackM69O.onPanelClosed(108, c0054g);
        }
        this.f73E = false;
    }

    /* renamed from: E */
    public void m59E(i iVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0119z interfaceC0119z;
        if (z && iVar.f131a == 0 && (interfaceC0119z = this.f102l) != null && interfaceC0119z.mo455e()) {
            m58D(iVar.f138h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f95e.getSystemService("window");
        if (windowManager != null && iVar.f143m && (viewGroup = iVar.f135e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m57C(iVar.f131a, iVar, null);
            }
        }
        iVar.f141k = false;
        iVar.f142l = false;
        iVar.f143m = false;
        iVar.f136f = null;
        iVar.f145o = true;
        if (this.f75G == iVar) {
            this.f75G = null;
        }
    }

    /* renamed from: F */
    public final Configuration m60F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m61G(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.m61G(android.view.KeyEvent):boolean");
    }

    /* renamed from: H */
    public void m62H(int i2) {
        i iVarM68N = m68N(i2);
        if (iVarM68N.f138h != null) {
            Bundle bundle = new Bundle();
            iVarM68N.f138h.m218w(bundle);
            if (bundle.size() > 0) {
                iVarM68N.f147q = bundle;
            }
            iVarM68N.f138h.m221z();
            iVarM68N.f138h.clear();
        }
        iVarM68N.f146p = true;
        iVarM68N.f145o = true;
        if ((i2 == 108 || i2 == 0) && this.f102l != null) {
            i iVarM68N2 = m68N(0);
            iVarM68N2.f141k = false;
            m75U(iVarM68N2, null);
        }
    }

    /* renamed from: I */
    public void m63I() {
        C0273v c0273v = this.f109s;
        if (c0273v != null) {
            c0273v.m887b();
        }
    }

    /* renamed from: J */
    public final void m64J() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int[] iArr = C0014b.f35j;
        if (this.f110t) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f95e.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo49t(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo49t(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo49t(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo49t(10);
        }
        this.f71C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m65K();
        this.f96f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f95e);
        if (this.f72D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.f70B ? C1088R.layout.abc_screen_simple_overlay_action_mode : C1088R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f71C) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C1088R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f69A = false;
            this.f116z = false;
        } else if (this.f116z) {
            TypedValue typedValue = new TypedValue();
            this.f95e.getTheme().resolveAttribute(C1088R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0042c(this.f95e, typedValue.resourceId) : this.f95e).inflate(C1088R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0119z interfaceC0119z = (InterfaceC0119z) viewGroup.findViewById(C1088R.id.decor_content_parent);
            this.f102l = interfaceC0119z;
            interfaceC0119z.setWindowCallback(m69O());
            if (this.f69A) {
                this.f102l.mo458h(109);
            }
            if (this.f114x) {
                this.f102l.mo458h(2);
            }
            if (this.f115y) {
                this.f102l.mo458h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbM2079g = C0561a.m2079g("AppCompat does not support the current theme features: { windowActionBar: ");
            sbM2079g.append(this.f116z);
            sbM2079g.append(", windowActionBarOverlay: ");
            sbM2079g.append(this.f69A);
            sbM2079g.append(", android:windowIsFloating: ");
            sbM2079g.append(this.f71C);
            sbM2079g.append(", windowActionModeOverlay: ");
            sbM2079g.append(this.f70B);
            sbM2079g.append(", windowNoTitle: ");
            sbM2079g.append(this.f72D);
            sbM2079g.append(" }");
            throw new IllegalArgumentException(sbM2079g.toString());
        }
        C0266o.m876o(viewGroup, new C0025k(this));
        if (this.f102l == null) {
            this.f112v = (TextView) viewGroup.findViewById(C1088R.id.title);
        }
        Method method = C0069a1.f552a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            e = e3;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1088R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f96f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f96f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0026l(this));
        this.f111u = viewGroup;
        Object obj = this.f94d;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f101k;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0119z interfaceC0119z2 = this.f102l;
            if (interfaceC0119z2 != null) {
                interfaceC0119z2.setWindowTitle(title);
            } else {
                AbstractC0015a abstractC0015a = this.f99i;
                if (abstractC0015a != null) {
                    ((C0033s) abstractC0015a).f182e.setWindowTitle(title);
                } else {
                    TextView textView = this.f112v;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f111u.findViewById(R.id.content);
        View decorView = this.f96f.getDecorView();
        contentFrameLayout2.f2865h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f95e.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f110t = true;
        i iVarM68N = m68N(0);
        if (this.f80L || iVarM68N.f138h != null) {
            return;
        }
        m71Q(108);
    }

    /* renamed from: K */
    public final void m65K() {
        if (this.f96f == null) {
            Object obj = this.f94d;
            if (obj instanceof Activity) {
                m56B(((Activity) obj).getWindow());
            }
        }
        if (this.f96f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: L */
    public i m66L(Menu menu) {
        i[] iVarArr = this.f74F;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.f138h == menu) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final f m67M(Context context) {
        if (this.f85Q == null) {
            if (C0032r.f170d == null) {
                Context applicationContext = context.getApplicationContext();
                C0032r.f170d = new C0032r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f85Q = new g(C0032r.f170d);
        }
        return this.f85Q;
    }

    /* renamed from: N */
    public i m68N(int i2) {
        i[] iVarArr = this.f74F;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[i2 + 1];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.f74F = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    /* renamed from: O */
    public final Window.Callback m69O() {
        return this.f96f.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m70P() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            r3.m64J()
            boolean r0 = r3.f116z
            if (r0 == 0) goto L37
            a.b.c.a r0 = r3.f99i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f94d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            a.b.c.s r0 = new a.b.c.s
            java.lang.Object r1 = r3.f94d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f69A
            r0.<init>(r1, r2)
        L1d:
            r3.f99i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            a.b.c.s r0 = new a.b.c.s
            java.lang.Object r1 = r3.f94d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            a.b.c.a r0 = r3.f99i
            if (r0 == 0) goto L37
            boolean r1 = r3.f90V
            r0.mo16c(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.m70P():void");
    }

    /* renamed from: Q */
    public final void m71Q(int i2) {
        this.f88T = (1 << i2) | this.f88T;
        if (this.f87S) {
            return;
        }
        View decorView = this.f96f.getDecorView();
        Runnable runnable = this.f89U;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        decorView.postOnAnimation(runnable);
        this.f87S = true;
    }

    /* renamed from: R */
    public int m72R(Context context, int i2) {
        f fVarM67M;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.f86R == null) {
                        this.f86R = new e(context);
                    }
                    fVarM67M = this.f86R;
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                fVarM67M = m67M(context);
            }
            return fVarM67M.mo91c();
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m73S(p000a.p005b.p006c.LayoutInflaterFactory2C0024j.i r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.m73S(a.b.c.j$i, android.view.KeyEvent):void");
    }

    /* renamed from: T */
    public final boolean m74T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        C0054g c0054g;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f141k || m75U(iVar, keyEvent)) && (c0054g = iVar.f138h) != null) {
            zPerformShortcut = c0054g.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f102l == null) {
            m59E(iVar, true);
        }
        return zPerformShortcut;
    }

    /* renamed from: U */
    public final boolean m75U(i iVar, KeyEvent keyEvent) {
        InterfaceC0119z interfaceC0119z;
        InterfaceC0119z interfaceC0119z2;
        Resources.Theme themeNewTheme;
        InterfaceC0119z interfaceC0119z3;
        InterfaceC0119z interfaceC0119z4;
        if (this.f80L) {
            return false;
        }
        if (iVar.f141k) {
            return true;
        }
        i iVar2 = this.f75G;
        if (iVar2 != null && iVar2 != iVar) {
            m59E(iVar2, false);
        }
        Window.Callback callbackM69O = m69O();
        if (callbackM69O != null) {
            iVar.f137g = callbackM69O.onCreatePanelView(iVar.f131a);
        }
        int i2 = iVar.f131a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (interfaceC0119z4 = this.f102l) != null) {
            interfaceC0119z4.mo454d();
        }
        if (iVar.f137g == null) {
            C0054g c0054g = iVar.f138h;
            if (c0054g == null || iVar.f146p) {
                if (c0054g == null) {
                    Context context = this.f95e;
                    int i3 = iVar.f131a;
                    if ((i3 == 0 || i3 == 108) && this.f102l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(C1088R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(C1088R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(C1088R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0042c c0042c = new C0042c(context, 0);
                            c0042c.getTheme().setTo(themeNewTheme);
                            context = c0042c;
                        }
                    }
                    C0054g c0054g2 = new C0054g(context);
                    c0054g2.f437e = this;
                    iVar.m95a(c0054g2);
                    if (iVar.f138h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0119z2 = this.f102l) != null) {
                    if (this.f103m == null) {
                        this.f103m = new b();
                    }
                    interfaceC0119z2.mo452b(iVar.f138h, this.f103m);
                }
                iVar.f138h.m221z();
                if (!callbackM69O.onCreatePanelMenu(iVar.f131a, iVar.f138h)) {
                    iVar.m95a(null);
                    if (z && (interfaceC0119z = this.f102l) != null) {
                        interfaceC0119z.mo452b(null, this.f103m);
                    }
                    return false;
                }
                iVar.f146p = false;
            }
            iVar.f138h.m221z();
            Bundle bundle = iVar.f147q;
            if (bundle != null) {
                iVar.f138h.m217v(bundle);
                iVar.f147q = null;
            }
            if (!callbackM69O.onPreparePanel(0, iVar.f137g, iVar.f138h)) {
                if (z && (interfaceC0119z3 = this.f102l) != null) {
                    interfaceC0119z3.mo452b(null, this.f103m);
                }
                iVar.f138h.m220y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.f144n = z2;
            iVar.f138h.setQwertyMode(z2);
            iVar.f138h.m220y();
        }
        iVar.f141k = true;
        iVar.f142l = false;
        this.f75G = iVar;
        return true;
    }

    /* renamed from: V */
    public final boolean m76V() {
        ViewGroup viewGroup;
        if (this.f110t && (viewGroup = this.f111u) != null) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final void m77W() {
        if (this.f110t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: X */
    public final int m78X(C0277z c0277z, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        Context context;
        int i2;
        int iM899d = c0277z.m899d();
        ActionBarContextView actionBarContextView = this.f106p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f106p.getLayoutParams();
            if (this.f106p.isShown()) {
                if (this.f91W == null) {
                    this.f91W = new Rect();
                    this.f92X = new Rect();
                }
                Rect rect2 = this.f91W;
                Rect rect3 = this.f92X;
                rect2.set(c0277z.m897b(), c0277z.m899d(), c0277z.m898c(), c0277z.m896a());
                C0069a1.m280a(this.f111u, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C0277z c0277zM868g = C0266o.m868g(this.f111u);
                int iM897b = c0277zM868g == null ? 0 : c0277zM868g.m897b();
                int iM898c = c0277zM868g == null ? 0 : c0277zM868g.m898c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f113w != null) {
                    View view = this.f113w;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iM897b || marginLayoutParams2.rightMargin != iM898c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iM897b;
                            marginLayoutParams2.rightMargin = iM898c;
                            this.f113w.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f95e);
                    this.f113w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM897b;
                    layoutParams.rightMargin = iM898c;
                    this.f111u.addView(this.f113w, -1, layoutParams);
                }
                View view3 = this.f113w;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f113w;
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        context = this.f95e;
                        i2 = C1088R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f95e;
                        i2 = C1088R.color.abc_decor_view_status_guard;
                    }
                    Object obj = C0192a.f1425a;
                    view4.setBackgroundColor(C0192a.d.m741a(context, i2));
                }
                if (!this.f70B && z) {
                    iM899d = 0;
                }
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.f106p.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f113w;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM899d;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.a
    /* renamed from: a */
    public void mo79a(C0054g c0054g) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0119z interfaceC0119z = this.f102l;
        if (interfaceC0119z == null || !interfaceC0119z.mo456f() || (ViewConfiguration.get(this.f95e).hasPermanentMenuKey() && !this.f102l.mo453c())) {
            i iVarM68N = m68N(0);
            iVarM68N.f145o = true;
            m59E(iVarM68N, false);
            m73S(iVarM68N, null);
            return;
        }
        Window.Callback callbackM69O = m69O();
        if (this.f102l.mo455e()) {
            this.f102l.mo457g();
            if (this.f80L) {
                return;
            }
            callbackM69O.onPanelClosed(108, m68N(0).f138h);
            return;
        }
        if (callbackM69O == null || this.f80L) {
            return;
        }
        if (this.f87S && (1 & this.f88T) != 0) {
            this.f96f.getDecorView().removeCallbacks(this.f89U);
            this.f89U.run();
        }
        i iVarM68N2 = m68N(0);
        C0054g c0054g2 = iVarM68N2.f138h;
        if (c0054g2 == null || iVarM68N2.f146p || !callbackM69O.onPreparePanel(0, iVarM68N2.f137g, c0054g2)) {
            return;
        }
        callbackM69O.onMenuOpened(108, iVarM68N2.f138h);
        this.f102l.mo451a();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.a
    /* renamed from: b */
    public boolean mo80b(C0054g c0054g, MenuItem menuItem) {
        i iVarM66L;
        Window.Callback callbackM69O = m69O();
        if (callbackM69O == null || this.f80L || (iVarM66L = m66L(c0054g.mo206k())) == null) {
            return false;
        }
        return callbackM69O.onMenuItemSelected(iVarM66L.f131a, menuItem);
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: c */
    public void mo33c(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
        ((ViewGroup) this.f111u.findViewById(R.id.content)).addView(view, layoutParams);
        this.f97g.f354b.onContentChanged();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: d */
    public Context mo34d(Context context) {
        Configuration configuration;
        int i2 = Build.VERSION.SDK_INT;
        this.f77I = true;
        int i3 = this.f81M;
        if (i3 == -100) {
            i3 = -100;
        }
        int iM72R = m72R(context, i3);
        if (f68c0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m60F(context, iM72R, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0042c) {
            try {
                ((C0042c) context).m152a(m60F(context, iM72R, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f67b0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                if (i2 >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 192;
                int i23 = configuration4.screenLayout & 192;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (i2 >= 26) {
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                }
                int i32 = configuration3.uiMode & 15;
                int i33 = configuration4.uiMode & 15;
                if (i32 != i33) {
                    configuration.uiMode |= i33;
                }
                int i34 = configuration3.uiMode & 48;
                int i35 = configuration4.uiMode & 48;
                if (i34 != i35) {
                    configuration.uiMode |= i35;
                }
                int i36 = configuration3.screenWidthDp;
                int i37 = configuration4.screenWidthDp;
                if (i36 != i37) {
                    configuration.screenWidthDp = i37;
                }
                int i38 = configuration3.screenHeightDp;
                int i39 = configuration4.screenHeightDp;
                if (i38 != i39) {
                    configuration.screenHeightDp = i39;
                }
                int i40 = configuration3.smallestScreenWidthDp;
                int i41 = configuration4.smallestScreenWidthDp;
                if (i40 != i41) {
                    configuration.smallestScreenWidthDp = i41;
                }
                int i42 = configuration3.densityDpi;
                int i43 = configuration4.densityDpi;
                if (i42 != i43) {
                    configuration.densityDpi = i43;
                }
            }
        }
        Configuration configurationM60F = m60F(context, iM72R, configuration);
        C0042c c0042c = new C0042c(context, C1088R.style.Theme_AppCompat_Empty);
        c0042c.m152a(configurationM60F);
        boolean z = context.getTheme() != null;
        if (z) {
            Resources.Theme theme = c0042c.getTheme();
            if (i2 >= 29) {
                theme.rebase();
            } else {
                synchronized (C0201i.f1450a) {
                    if (!C0201i.f1452c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            C0201i.f1451b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        C0201i.f1452c = true;
                    }
                    Method method = C0201i.f1451b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            C0201i.f1451b = null;
                        }
                    }
                }
            }
        }
        return c0042c;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: e */
    public <T extends View> T mo35e(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
        return (T) this.f96f.findViewById(i2);
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: f */
    public int mo36f() {
        return this.f81M;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: g */
    public MenuInflater mo37g() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f100j == null) {
            m70P();
            AbstractC0015a abstractC0015a = this.f99i;
            this.f100j = new C0045f(abstractC0015a != null ? abstractC0015a.mo15b() : this.f95e);
        }
        return this.f100j;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: h */
    public AbstractC0015a mo38h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m70P();
        return this.f99i;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: i */
    public void mo39i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f95e);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0024j) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: j */
    public void mo40j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m70P();
        AbstractC0015a abstractC0015a = this.f99i;
        m71Q(0);
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: k */
    public void mo41k(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f116z && this.f110t) {
            m70P();
            AbstractC0015a abstractC0015a = this.f99i;
            if (abstractC0015a != null) {
                C0033s c0033s = (C0033s) abstractC0015a;
                c0033s.m113f(c0033s.f178a.getResources().getBoolean(C1088R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0085i c0085iM333a = C0085i.m333a();
        Context context = this.f95e;
        synchronized (c0085iM333a) {
            C0090k0 c0090k0 = c0085iM333a.f677a;
            synchronized (c0090k0) {
                C0133e<WeakReference<Drawable.ConstantState>> c0133e = c0090k0.f701d.get(context);
                if (c0133e != null) {
                    c0133e.m492b();
                }
            }
        }
        m55A(false);
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: l */
    public void mo42l(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.f77I = true;
        m55A(false);
        m65K();
        Object obj = this.f94d;
        if (obj instanceof Activity) {
            String strM727v = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strM727v = C0190e.m727v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strM727v != null) {
                AbstractC0015a abstractC0015a = this.f99i;
                if (abstractC0015a == null) {
                    this.f90V = true;
                } else {
                    abstractC0015a.mo16c(true);
                }
            }
            synchronized (AbstractC0023i.f64c) {
                AbstractC0023i.m32s(this);
                AbstractC0023i.f63b.add(new WeakReference<>(this));
            }
        }
        this.f78J = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43m() {
        /*
            r3 = this;
            a.e.h<java.lang.String, java.lang.Integer> r0 = p000a.p005b.p006c.LayoutInflaterFactory2C0024j.f65Z
            java.lang.Object r1 = r3.f94d
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L13
            java.lang.Object r1 = p000a.p005b.p006c.AbstractC0023i.f64c
            monitor-enter(r1)
            p000a.p005b.p006c.AbstractC0023i.m32s(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        L13:
            boolean r1 = r3.f87S
            if (r1 == 0) goto L22
            android.view.Window r1 = r3.f96f
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r3.f89U
            r1.removeCallbacks(r2)
        L22:
            r1 = 0
            r3.f79K = r1
            r1 = 1
            r3.f80L = r1
            int r1 = r3.f81M
            r2 = -100
            if (r1 == r2) goto L50
            java.lang.Object r1 = r3.f94d
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L50
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r3.f94d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f81M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5d
        L50:
            java.lang.Object r1 = r3.f94d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5d:
            a.b.c.a r0 = r3.f99i
            if (r0 == 0) goto L64
            java.util.Objects.requireNonNull(r0)
        L64:
            a.b.c.j$f r0 = r3.f85Q
            if (r0 == 0) goto L6b
            r0.m93a()
        L6b:
            a.b.c.j$f r0 = r3.f86R
            if (r0 == 0) goto L72
            r0.m93a()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.mo43m():void");
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: n */
    public void mo44n(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: o */
    public void mo45o() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m70P();
        AbstractC0015a abstractC0015a = this.f99i;
        if (abstractC0015a != null) {
            ((C0033s) abstractC0015a).f198u = true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:118:0x01ec
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p006c.LayoutInflaterFactory2C0024j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: p */
    public void mo46p(Bundle bundle) {
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: q */
    public void mo47q() {
        this.f79K = true;
        m81z();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: r */
    public void mo48r() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f79K = false;
        m70P();
        AbstractC0015a abstractC0015a = this.f99i;
        if (abstractC0015a != null) {
            C0033s c0033s = (C0033s) abstractC0015a;
            c0033s.f198u = false;
            C0046g c0046g = c0033s.f197t;
            if (c0046g != null) {
                c0046g.m161a();
            }
        }
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: t */
    public boolean mo49t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f72D && i2 == 108) {
            return false;
        }
        if (this.f116z && i2 == 1) {
            this.f116z = false;
        }
        if (i2 == 1) {
            m77W();
            this.f72D = true;
            return true;
        }
        if (i2 == 2) {
            m77W();
            this.f114x = true;
            return true;
        }
        if (i2 == 5) {
            m77W();
            this.f115y = true;
            return true;
        }
        if (i2 == 10) {
            m77W();
            this.f70B = true;
            return true;
        }
        if (i2 == 108) {
            m77W();
            this.f116z = true;
            return true;
        }
        if (i2 != 109) {
            return this.f96f.requestFeature(i2);
        }
        m77W();
        this.f69A = true;
        return true;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: u */
    public void mo50u(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
        ViewGroup viewGroup = (ViewGroup) this.f111u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f95e).inflate(i2, viewGroup);
        this.f97g.f354b.onContentChanged();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: v */
    public void mo51v(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
        ViewGroup viewGroup = (ViewGroup) this.f111u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f97g.f354b.onContentChanged();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: w */
    public void mo52w(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m64J();
        ViewGroup viewGroup = (ViewGroup) this.f111u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f97g.f354b.onContentChanged();
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: x */
    public void mo53x(int i2) {
        this.f82N = i2;
    }

    @Override // p000a.p005b.p006c.AbstractC0023i
    /* renamed from: y */
    public final void mo54y(CharSequence charSequence) {
        this.f101k = charSequence;
        InterfaceC0119z interfaceC0119z = this.f102l;
        if (interfaceC0119z != null) {
            interfaceC0119z.setWindowTitle(charSequence);
            return;
        }
        AbstractC0015a abstractC0015a = this.f99i;
        if (abstractC0015a != null) {
            ((C0033s) abstractC0015a).f182e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f112v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: z */
    public boolean m81z() {
        return m55A(true);
    }
}

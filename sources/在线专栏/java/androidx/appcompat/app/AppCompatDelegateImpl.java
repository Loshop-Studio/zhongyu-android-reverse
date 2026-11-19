package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0123e;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0211f;
import androidx.appcompat.widget.C0214g0;
import androidx.appcompat.widget.C0224l0;
import androidx.appcompat.widget.C0226m0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0229o;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.C0253g;
import androidx.core.app.C0325f;
import androidx.core.content.C0332a;
import androidx.core.view.C0336a0;
import androidx.core.view.C0340c0;
import androidx.core.view.C0343f;
import androidx.core.view.C0344g;
import androidx.core.view.C0358u;
import androidx.core.view.C0362y;
import androidx.core.view.InterfaceC0353p;
import androidx.core.widget.C0376j;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0504l;
import anet.channel.entity.EventType;
import com.p068uc.crashsdk.export.LogType;
import com.p071ut.device.AidConstants;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p011b0.C1020c;
import p015c.C1038a;
import p015c.C1040c;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1046i;
import p015c.C1047j;
import p073d.C2443a;
import p088g.AbstractC2620b;
import p088g.C2622d;
import p088g.C2623e;
import p088g.C2624f;
import p088g.C2625g;
import p088g.WindowCallbackC2627i;
import p148s.C3368f;

/* loaded from: classes.dex */
class AppCompatDelegateImpl extends AbstractC0103d implements C0125g.a, LayoutInflater.Factory2 {

    /* renamed from: f0 */
    private static final C0253g<String, Integer> f239f0 = new C0253g<>();

    /* renamed from: g0 */
    private static final boolean f240g0 = false;

    /* renamed from: h0 */
    private static final int[] f241h0 = {R.attr.windowBackground};

    /* renamed from: i0 */
    private static final boolean f242i0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: j0 */
    private static final boolean f243j0 = true;

    /* renamed from: A */
    boolean f244A;

    /* renamed from: B */
    boolean f245B;

    /* renamed from: C */
    boolean f246C;

    /* renamed from: D */
    boolean f247D;

    /* renamed from: E */
    boolean f248E;

    /* renamed from: F */
    private boolean f249F;

    /* renamed from: G */
    private PanelFeatureState[] f250G;

    /* renamed from: H */
    private PanelFeatureState f251H;

    /* renamed from: I */
    private boolean f252I;

    /* renamed from: J */
    private boolean f253J;

    /* renamed from: K */
    private boolean f254K;

    /* renamed from: L */
    private boolean f255L;

    /* renamed from: M */
    boolean f256M;

    /* renamed from: N */
    private int f257N;

    /* renamed from: S */
    private int f258S;

    /* renamed from: T */
    private boolean f259T;

    /* renamed from: U */
    private boolean f260U;

    /* renamed from: V */
    private AbstractC0095o f261V;

    /* renamed from: W */
    private AbstractC0095o f262W;

    /* renamed from: X */
    boolean f263X;

    /* renamed from: Y */
    int f264Y;

    /* renamed from: Z */
    private final Runnable f265Z;

    /* renamed from: a0 */
    private boolean f266a0;

    /* renamed from: b0 */
    private Rect f267b0;

    /* renamed from: c0 */
    private Rect f268c0;

    /* renamed from: d */
    final Object f269d;

    /* renamed from: d0 */
    private C0106g f270d0;

    /* renamed from: e */
    final Context f271e;

    /* renamed from: e0 */
    private C0107h f272e0;

    /* renamed from: f */
    Window f273f;

    /* renamed from: g */
    private C0093m f274g;

    /* renamed from: h */
    final InterfaceC0102c f275h;

    /* renamed from: i */
    ActionBar f276i;

    /* renamed from: j */
    MenuInflater f277j;

    /* renamed from: k */
    private CharSequence f278k;

    /* renamed from: l */
    private InterfaceC0229o f279l;

    /* renamed from: m */
    private C0087g f280m;

    /* renamed from: n */
    private C0099s f281n;

    /* renamed from: o */
    AbstractC2620b f282o;

    /* renamed from: p */
    ActionBarContextView f283p;

    /* renamed from: q */
    PopupWindow f284q;

    /* renamed from: r */
    Runnable f285r;

    /* renamed from: s */
    C0362y f286s;

    /* renamed from: t */
    private boolean f287t;

    /* renamed from: u */
    private boolean f288u;

    /* renamed from: v */
    ViewGroup f289v;

    /* renamed from: w */
    private TextView f290w;

    /* renamed from: x */
    private View f291x;

    /* renamed from: y */
    private boolean f292y;

    /* renamed from: z */
    private boolean f293z;

    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f294a;

        /* renamed from: b */
        int f295b;

        /* renamed from: c */
        int f296c;

        /* renamed from: d */
        int f297d;

        /* renamed from: e */
        int f298e;

        /* renamed from: f */
        int f299f;

        /* renamed from: g */
        ViewGroup f300g;

        /* renamed from: h */
        View f301h;

        /* renamed from: i */
        View f302i;

        /* renamed from: j */
        C0125g f303j;

        /* renamed from: k */
        C0123e f304k;

        /* renamed from: l */
        Context f305l;

        /* renamed from: m */
        boolean f306m;

        /* renamed from: n */
        boolean f307n;

        /* renamed from: o */
        boolean f308o;

        /* renamed from: p */
        public boolean f309p;

        /* renamed from: q */
        boolean f310q = false;

        /* renamed from: r */
        boolean f311r;

        /* renamed from: s */
        Bundle f312s;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0080a();

            /* renamed from: a */
            int f313a;

            /* renamed from: b */
            boolean f314b;

            /* renamed from: c */
            Bundle f315c;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            class C0080a implements Parcelable.ClassLoaderCreator<SavedState> {
                C0080a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m247a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m247a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i4) {
                    return new SavedState[i4];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m247a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f313a = parcel.readInt();
                boolean z3 = parcel.readInt() == 1;
                savedState.f314b = z3;
                if (z3) {
                    savedState.f315c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f313a);
                parcel.writeInt(this.f314b ? 1 : 0);
                if (this.f314b) {
                    parcel.writeBundle(this.f315c);
                }
            }
        }

        PanelFeatureState(int i4) {
            this.f294a = i4;
        }

        /* renamed from: a */
        InterfaceC0132n m243a(InterfaceC0131m.a aVar) {
            if (this.f303j == null) {
                return null;
            }
            if (this.f304k == null) {
                C0123e c0123e = new C0123e(this.f305l, C1044g.f5891l);
                this.f304k = c0123e;
                c0123e.setCallback(aVar);
                this.f303j.addMenuPresenter(this.f304k);
            }
            return this.f304k.m465b(this.f300g);
        }

        /* renamed from: b */
        public boolean m244b() {
            if (this.f301h == null) {
                return false;
            }
            return this.f302i != null || this.f304k.m464a().getCount() > 0;
        }

        /* renamed from: c */
        void m245c(C0125g c0125g) {
            C0123e c0123e;
            C0125g c0125g2 = this.f303j;
            if (c0125g == c0125g2) {
                return;
            }
            if (c0125g2 != null) {
                c0125g2.removeMenuPresenter(this.f304k);
            }
            this.f303j = c0125g;
            if (c0125g == null || (c0123e = this.f304k) == null) {
                return;
            }
            c0125g.addMenuPresenter(c0123e);
        }

        /* renamed from: d */
        void m246d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C1038a.f5737a, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            }
            themeNewTheme.resolveAttribute(C1038a.f5727F, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                themeNewTheme.applyStyle(i5, true);
            } else {
                themeNewTheme.applyStyle(C1046i.f5919c, true);
            }
            C2622d c2622d = new C2622d(context, 0);
            c2622d.getTheme().setTo(themeNewTheme);
            this.f305l = c2622d;
            TypedArray typedArrayObtainStyledAttributes = c2622d.obtainStyledAttributes(C1047j.f5928B0);
            this.f295b = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5943E0, 0);
            this.f299f = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5938D0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    class RunnableC0081a implements Runnable {
        RunnableC0081a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f264Y & 1) != 0) {
                appCompatDelegateImpl.m209X(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f264Y & 4096) != 0) {
                appCompatDelegateImpl2.m209X(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f263X = false;
            appCompatDelegateImpl3.f264Y = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0082b implements InterfaceC0353p {
        C0082b() {
        }

        @Override // androidx.core.view.InterfaceC0353p
        public C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iM1874l = c0340c0.m1874l();
            int iM202N0 = AppCompatDelegateImpl.this.m202N0(c0340c0, null);
            if (iM1874l != iM202N0) {
                c0340c0 = c0340c0.m1878q(c0340c0.m1872j(), iM202N0, c0340c0.m1873k(), c0340c0.m1871i());
            }
            return C0358u.m2023c0(view, c0340c0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0083c implements ContentFrameLayout.InterfaceC0168a {
        C0083c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0168a
        /* renamed from: a */
        public void mo251a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0168a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m207V();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class RunnableC0084d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        class a extends C0336a0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f283p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f286s.m2126f(null);
                AppCompatDelegateImpl.this.f286s = null;
            }

            @Override // androidx.core.view.C0336a0, androidx.core.view.InterfaceC0363z
            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f283p.setVisibility(0);
            }
        }

        RunnableC0084d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f284q.showAtLocation(appCompatDelegateImpl.f283p, 55, 0, 0);
            AppCompatDelegateImpl.this.m210Y();
            if (!AppCompatDelegateImpl.this.m197G0()) {
                AppCompatDelegateImpl.this.f283p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f283p.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f283p.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f286s = C0358u.m2022c(appCompatDelegateImpl2.f283p).m2121a(1.0f);
                AppCompatDelegateImpl.this.f286s.m2126f(new a());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0085e extends C0336a0 {
        C0085e() {
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f283p.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f286s.m2126f(null);
            AppCompatDelegateImpl.this.f286s = null;
        }

        @Override // androidx.core.view.C0336a0, androidx.core.view.InterfaceC0363z
        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f283p.setVisibility(0);
            AppCompatDelegateImpl.this.f283p.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f283p.getParent() instanceof View) {
                C0358u.m2045n0((View) AppCompatDelegateImpl.this.f283p.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    private class C0086f implements InterfaceC0100a {
        C0086f() {
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    private final class C0087g implements InterfaceC0131m.a {
        C0087g() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        /* renamed from: a */
        public boolean mo252a(C0125g c0125g) {
            Window.Callback callbackM219i0 = AppCompatDelegateImpl.this.m219i0();
            if (callbackM219i0 == null) {
                return true;
            }
            callbackM219i0.onMenuOpened(108, c0125g);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        public void onCloseMenu(C0125g c0125g, boolean z3) {
            AppCompatDelegateImpl.this.m203O(c0125g);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    class C0088h implements AbstractC2620b.a {

        /* renamed from: a */
        private AbstractC2620b.a f324a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h$a */
        class a extends C0336a0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f283p.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f284q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f283p.getParent() instanceof View) {
                    C0358u.m2045n0((View) AppCompatDelegateImpl.this.f283p.getParent());
                }
                AppCompatDelegateImpl.this.f283p.m541k();
                AppCompatDelegateImpl.this.f286s.m2126f(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f286s = null;
                C0358u.m2045n0(appCompatDelegateImpl2.f289v);
            }
        }

        public C0088h(AbstractC2620b.a aVar) {
            this.f324a = aVar;
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: a */
        public boolean mo253a(AbstractC2620b abstractC2620b, Menu menu) {
            C0358u.m2045n0(AppCompatDelegateImpl.this.f289v);
            return this.f324a.mo253a(abstractC2620b, menu);
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: b */
        public boolean mo254b(AbstractC2620b abstractC2620b, Menu menu) {
            return this.f324a.mo254b(abstractC2620b, menu);
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: c */
        public boolean mo255c(AbstractC2620b abstractC2620b, MenuItem menuItem) {
            return this.f324a.mo255c(abstractC2620b, menuItem);
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: d */
        public void mo256d(AbstractC2620b abstractC2620b) {
            this.f324a.mo256d(abstractC2620b);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f284q != null) {
                appCompatDelegateImpl.f273f.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f285r);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f283p != null) {
                appCompatDelegateImpl2.m210Y();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f286s = C0358u.m2022c(appCompatDelegateImpl3.f283p).m2121a(IGoodView.DEFAULT_TO_ALPHA);
                AppCompatDelegateImpl.this.f286s.m2126f(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            InterfaceC0102c interfaceC0102c = appCompatDelegateImpl4.f275h;
            if (interfaceC0102c != null) {
                interfaceC0102c.onSupportActionModeFinished(appCompatDelegateImpl4.f282o);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f282o = null;
            C0358u.m2045n0(appCompatDelegateImpl5.f289v);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    static class C0089i {
        /* renamed from: a */
        static Context m257a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m258b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4 = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i4 != i5) {
                configuration3.densityDpi = i5;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    static class C0090j {
        /* renamed from: a */
        static boolean m259a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    static class C0091k {
        /* renamed from: a */
        static void m260a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    static class C0092l {
        /* renamed from: a */
        static void m261a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4 = configuration.colorMode & 3;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 3)) {
                configuration3.colorMode |= i5 & 3;
            }
            int i6 = configuration.colorMode & 12;
            int i7 = configuration2.colorMode;
            if (i6 != (i7 & 12)) {
                configuration3.colorMode |= i7 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    private class C0094n extends AbstractC0095o {

        /* renamed from: c */
        private final PowerManager f328c;

        C0094n(Context context) {
            super();
            this.f328c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: b */
        IntentFilter mo263b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: c */
        public int mo264c() {
            return C0090j.m259a(this.f328c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: d */
        public void mo265d() {
            AppCompatDelegateImpl.this.mo213c();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    abstract class AbstractC0095o {

        /* renamed from: a */
        private BroadcastReceiver f330a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0095o.this.mo265d();
            }
        }

        AbstractC0095o() {
        }

        /* renamed from: a */
        void m266a() {
            BroadcastReceiver broadcastReceiver = this.f330a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f271e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f330a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo263b();

        /* renamed from: c */
        abstract int mo264c();

        /* renamed from: d */
        abstract void mo265d();

        /* renamed from: e */
        void m267e() {
            m266a();
            IntentFilter intentFilterMo263b = mo263b();
            if (intentFilterMo263b == null || intentFilterMo263b.countActions() == 0) {
                return;
            }
            if (this.f330a == null) {
                this.f330a = new a();
            }
            AppCompatDelegateImpl.this.f271e.registerReceiver(this.f330a, intentFilterMo263b);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    private class C0096p extends AbstractC0095o {

        /* renamed from: c */
        private final C0111l f333c;

        C0096p(C0111l c0111l) {
            super();
            this.f333c = c0111l;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: b */
        IntentFilter mo263b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: c */
        public int mo264c() {
            return this.f333c.m301d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0095o
        /* renamed from: d */
        public void mo265d() {
            AppCompatDelegateImpl.this.mo213c();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    private static class C0097q {
        /* renamed from: a */
        static void m268a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    private class C0098r extends ContentFrameLayout {
        public C0098r(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m269b(int i4, int i5) {
            return i4 < -5 || i5 < -5 || i4 > getWidth() + 5 || i5 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m208W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m269b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.m204Q(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(C2443a.m8169d(getContext(), i4));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    private final class C0099s implements InterfaceC0131m.a {
        C0099s() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        /* renamed from: a */
        public boolean mo252a(C0125g c0125g) {
            Window.Callback callbackM219i0;
            if (c0125g != c0125g.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f244A || (callbackM219i0 = appCompatDelegateImpl.m219i0()) == null || AppCompatDelegateImpl.this.f256M) {
                return true;
            }
            callbackM219i0.onMenuOpened(108, c0125g);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        public void onCloseMenu(C0125g c0125g, boolean z3) {
            C0125g rootMenu = c0125g.getRootMenu();
            boolean z4 = rootMenu != c0125g;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z4) {
                c0125g = rootMenu;
            }
            PanelFeatureState panelFeatureStateM212b0 = appCompatDelegateImpl.m212b0(c0125g);
            if (panelFeatureStateM212b0 != null) {
                if (!z4) {
                    AppCompatDelegateImpl.this.m205R(panelFeatureStateM212b0, z3);
                } else {
                    AppCompatDelegateImpl.this.m201N(panelFeatureStateM212b0.f294a, panelFeatureStateM212b0, rootMenu);
                    AppCompatDelegateImpl.this.m205R(panelFeatureStateM212b0, true);
                }
            }
        }
    }

    AppCompatDelegateImpl(Activity activity, InterfaceC0102c interfaceC0102c) {
        this(activity, null, interfaceC0102c, activity);
    }

    /* renamed from: A0 */
    private void m159A0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f308o || this.f256M) {
            return;
        }
        if (panelFeatureState.f294a == 0) {
            if ((this.f271e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackM219i0 = m219i0();
        if (callbackM219i0 != null && !callbackM219i0.onMenuOpened(panelFeatureState.f294a, panelFeatureState.f303j)) {
            m205R(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f271e.getSystemService("window");
        if (windowManager != null && m161D0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f300g;
            if (viewGroup != null && !panelFeatureState.f310q) {
                View view = panelFeatureState.f302i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i4 = -1;
                }
                panelFeatureState.f307n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i4, -2, panelFeatureState.f297d, panelFeatureState.f298e, AidConstants.EVENT_REQUEST_FAILED, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f296c;
                layoutParams2.windowAnimations = panelFeatureState.f299f;
                windowManager.addView(panelFeatureState.f300g, layoutParams2);
                panelFeatureState.f308o = true;
            }
            if (viewGroup == null) {
                if (!m184l0(panelFeatureState) || panelFeatureState.f300g == null) {
                    return;
                }
            } else if (panelFeatureState.f310q && viewGroup.getChildCount() > 0) {
                panelFeatureState.f300g.removeAllViews();
            }
            if (!m183k0(panelFeatureState) || !panelFeatureState.m244b()) {
                panelFeatureState.f310q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f301h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f300g.setBackgroundResource(panelFeatureState.f295b);
            ViewParent parent = panelFeatureState.f301h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f301h);
            }
            panelFeatureState.f300g.addView(panelFeatureState.f301h, layoutParams3);
            if (!panelFeatureState.f301h.hasFocus()) {
                panelFeatureState.f301h.requestFocus();
            }
            i4 = -2;
            panelFeatureState.f307n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i4, -2, panelFeatureState.f297d, panelFeatureState.f298e, AidConstants.EVENT_REQUEST_FAILED, 8519680, -3);
            layoutParams22.gravity = panelFeatureState.f296c;
            layoutParams22.windowAnimations = panelFeatureState.f299f;
            windowManager.addView(panelFeatureState.f300g, layoutParams22);
            panelFeatureState.f308o = true;
        }
    }

    /* renamed from: C0 */
    private boolean m160C0(PanelFeatureState panelFeatureState, int i4, KeyEvent keyEvent, int i5) {
        C0125g c0125g;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f306m || m161D0(panelFeatureState, keyEvent)) && (c0125g = panelFeatureState.f303j) != null) {
            zPerformShortcut = c0125g.performShortcut(i4, keyEvent, i5);
        }
        if (zPerformShortcut && (i5 & 1) == 0 && this.f279l == null) {
            m205R(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    /* renamed from: D0 */
    private boolean m161D0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        InterfaceC0229o interfaceC0229o;
        InterfaceC0229o interfaceC0229o2;
        InterfaceC0229o interfaceC0229o3;
        if (this.f256M) {
            return false;
        }
        if (panelFeatureState.f306m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f251H;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m205R(panelFeatureState2, false);
        }
        Window.Callback callbackM219i0 = m219i0();
        if (callbackM219i0 != null) {
            panelFeatureState.f302i = callbackM219i0.onCreatePanelView(panelFeatureState.f294a);
        }
        int i4 = panelFeatureState.f294a;
        boolean z3 = i4 == 0 || i4 == 108;
        if (z3 && (interfaceC0229o3 = this.f279l) != null) {
            interfaceC0229o3.mo553c();
        }
        if (panelFeatureState.f302i == null && (!z3 || !(m192B0() instanceof C0109j))) {
            C0125g c0125g = panelFeatureState.f303j;
            if (c0125g == null || panelFeatureState.f311r) {
                if (c0125g == null && (!m185m0(panelFeatureState) || panelFeatureState.f303j == null)) {
                    return false;
                }
                if (z3 && this.f279l != null) {
                    if (this.f280m == null) {
                        this.f280m = new C0087g();
                    }
                    this.f279l.mo551a(panelFeatureState.f303j, this.f280m);
                }
                panelFeatureState.f303j.stopDispatchingItemsChanged();
                if (!callbackM219i0.onCreatePanelMenu(panelFeatureState.f294a, panelFeatureState.f303j)) {
                    panelFeatureState.m245c(null);
                    if (z3 && (interfaceC0229o = this.f279l) != null) {
                        interfaceC0229o.mo551a(null, this.f280m);
                    }
                    return false;
                }
                panelFeatureState.f311r = false;
            }
            panelFeatureState.f303j.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f312s;
            if (bundle != null) {
                panelFeatureState.f303j.restoreActionViewStates(bundle);
                panelFeatureState.f312s = null;
            }
            if (!callbackM219i0.onPreparePanel(0, panelFeatureState.f302i, panelFeatureState.f303j)) {
                if (z3 && (interfaceC0229o2 = this.f279l) != null) {
                    interfaceC0229o2.mo551a(null, this.f280m);
                }
                panelFeatureState.f303j.startDispatchingItemsChanged();
                return false;
            }
            boolean z4 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f309p = z4;
            panelFeatureState.f303j.setQwertyMode(z4);
            panelFeatureState.f303j.startDispatchingItemsChanged();
        }
        panelFeatureState.f306m = true;
        panelFeatureState.f307n = false;
        this.f251H = panelFeatureState;
        return true;
    }

    /* renamed from: E0 */
    private void m162E0(boolean z3) {
        InterfaceC0229o interfaceC0229o = this.f279l;
        if (interfaceC0229o == null || !interfaceC0229o.mo557g() || (ViewConfiguration.get(this.f271e).hasPermanentMenuKey() && !this.f279l.mo554d())) {
            PanelFeatureState panelFeatureStateM216g0 = m216g0(0, true);
            panelFeatureStateM216g0.f310q = true;
            m205R(panelFeatureStateM216g0, false);
            m159A0(panelFeatureStateM216g0, null);
            return;
        }
        Window.Callback callbackM219i0 = m219i0();
        if (this.f279l.mo552b() && z3) {
            this.f279l.mo555e();
            if (this.f256M) {
                return;
            }
            callbackM219i0.onPanelClosed(108, m216g0(0, true).f303j);
            return;
        }
        if (callbackM219i0 == null || this.f256M) {
            return;
        }
        if (this.f263X && (this.f264Y & 1) != 0) {
            this.f273f.getDecorView().removeCallbacks(this.f265Z);
            this.f265Z.run();
        }
        PanelFeatureState panelFeatureStateM216g02 = m216g0(0, true);
        C0125g c0125g = panelFeatureStateM216g02.f303j;
        if (c0125g == null || panelFeatureStateM216g02.f311r || !callbackM219i0.onPreparePanel(0, panelFeatureStateM216g02.f302i, c0125g)) {
            return;
        }
        callbackM219i0.onMenuOpened(108, panelFeatureStateM216g02.f303j);
        this.f279l.mo556f();
    }

    /* renamed from: F0 */
    private int m163F0(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i4 != 9) {
            return i4;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: H0 */
    private boolean m164H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f273f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0358u.m2012U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: J */
    private boolean m165J(boolean z3) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.f256M) {
            return false;
        }
        int iM171M = m171M();
        boolean zM170L0 = m170L0(m228q0(this.f271e, iM171M), z3);
        if (iM171M == 0) {
            m181f0(this.f271e).m267e();
        } else {
            AbstractC0095o abstractC0095o = this.f261V;
            if (abstractC0095o != null) {
                abstractC0095o.m266a();
            }
        }
        if (iM171M == 3) {
            m180e0(this.f271e).m267e();
        } else {
            AbstractC0095o abstractC0095o2 = this.f262W;
            if (abstractC0095o2 != null) {
                abstractC0095o2.m266a();
            }
        }
        return zM170L0;
    }

    /* renamed from: J0 */
    private void m166J0() {
        if (this.f288u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: K */
    private void m167K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f289v.findViewById(R.id.content);
        View decorView = this.f273f.getDecorView();
        contentFrameLayout.m641a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f271e.obtainStyledAttributes(C1047j.f5928B0);
        typedArrayObtainStyledAttributes.getValue(C1047j.f5988N0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C1047j.f5993O0, contentFrameLayout.getMinWidthMinor());
        int i4 = C1047j.f5978L0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedWidthMajor());
        }
        int i5 = C1047j.f5983M0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedWidthMinor());
        }
        int i6 = C1047j.f5968J0;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            typedArrayObtainStyledAttributes.getValue(i6, contentFrameLayout.getFixedHeightMajor());
        }
        int i7 = C1047j.f5973K0;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: K0 */
    private AppCompatActivity m168K0() {
        for (Context baseContext = this.f271e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: L */
    private void m169L(Window window) {
        if (this.f273f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0093m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0093m c0093m = new C0093m(callback);
        this.f274g = c0093m;
        window.setCallback(c0093m);
        C0214g0 c0214g0M814u = C0214g0.m814u(this.f271e, null, f241h0);
        Drawable drawableM823h = c0214g0M814u.m823h(0);
        if (drawableM823h != null) {
            window.setBackgroundDrawable(drawableM823h);
        }
        c0214g0M814u.m835w();
        this.f273f = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m170L0(int r7, boolean r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            android.content.Context r0 = r6.f271e
            r1 = 0
            android.content.res.Configuration r0 = r6.m175S(r0, r7, r1)
            boolean r2 = r6.m187o0()
            android.content.Context r3 = r6.f271e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f253J
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.f242i0
            if (r8 != 0) goto L30
            boolean r8 = r6.f254K
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f269d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f269d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0320a.m1757m(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m172M0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f269d
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L5e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m170L0(int, boolean):boolean");
    }

    /* renamed from: M */
    private int m171M() {
        int i4 = this.f257N;
        return i4 != -100 ? i4 : AbstractC0103d.m277j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M0 */
    private void m172M0(int i4, boolean z3, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.f271e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            C0108i.m286a(resources);
        }
        int i6 = this.f258S;
        if (i6 != 0) {
            this.f271e.setTheme(i6);
            if (i5 >= 23) {
                this.f271e.getTheme().applyStyle(this.f258S, true);
            }
        }
        if (z3) {
            Object obj = this.f269d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0504l) {
                    if (((InterfaceC0504l) activity).getLifecycle().mo2868b().m2874a(AbstractC0496f.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f255L) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: O0 */
    private void m173O0(View view) {
        view.setBackgroundColor((C0358u.m2006O(view) & 8192) != 0 ? C0332a.m1804b(this.f271e, C1040c.f5765b) : C0332a.m1804b(this.f271e, C1040c.f5764a));
    }

    /* renamed from: P */
    private void m174P() {
        AbstractC0095o abstractC0095o = this.f261V;
        if (abstractC0095o != null) {
            abstractC0095o.m266a();
        }
        AbstractC0095o abstractC0095o2 = this.f262W;
        if (abstractC0095o2 != null) {
            abstractC0095o2.m266a();
        }
    }

    /* renamed from: S */
    private Configuration m175S(Context context, int i4, Configuration configuration) {
        int i5 = i4 != 1 ? i4 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = IGoodView.DEFAULT_TO_ALPHA;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: T */
    private ViewGroup m176T() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f271e.obtainStyledAttributes(C1047j.f5928B0);
        int i4 = C1047j.f5953G0;
        if (!typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C1047j.f5998P0, false)) {
            mo190A(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i4, false)) {
            mo190A(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C1047j.f5958H0, false)) {
            mo190A(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C1047j.f5963I0, false)) {
            mo190A(10);
        }
        this.f247D = typedArrayObtainStyledAttributes.getBoolean(C1047j.f5933C0, false);
        typedArrayObtainStyledAttributes.recycle();
        m178a0();
        this.f273f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f271e);
        if (this.f248E) {
            viewGroup = this.f246C ? (ViewGroup) layoutInflaterFrom.inflate(C1044g.f5896q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C1044g.f5895p, (ViewGroup) null);
        } else if (this.f247D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C1044g.f5887h, (ViewGroup) null);
            this.f245B = false;
            this.f244A = false;
        } else if (this.f244A) {
            TypedValue typedValue = new TypedValue();
            this.f271e.getTheme().resolveAttribute(C1038a.f5742f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2622d(this.f271e, typedValue.resourceId) : this.f271e).inflate(C1044g.f5897r, (ViewGroup) null);
            InterfaceC0229o interfaceC0229o = (InterfaceC0229o) viewGroup.findViewById(C1043f.f5870q);
            this.f279l = interfaceC0229o;
            interfaceC0229o.setWindowCallback(m219i0());
            if (this.f245B) {
                this.f279l.mo558h(109);
            }
            if (this.f292y) {
                this.f279l.mo558h(2);
            }
            if (this.f293z) {
                this.f279l.mo558h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f244A + ", windowActionBarOverlay: " + this.f245B + ", android:windowIsFloating: " + this.f247D + ", windowActionModeOverlay: " + this.f246C + ", windowNoTitle: " + this.f248E + " }");
        }
        C0358u.m1985D0(viewGroup, new C0082b());
        if (this.f279l == null) {
            this.f290w = (TextView) viewGroup.findViewById(C1043f.f5850S);
        }
        C0226m0.m948c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1043f.f5855b);
        ViewGroup viewGroup2 = (ViewGroup) this.f273f.findViewById(R.id.content);
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
        this.f273f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0083c());
        return viewGroup;
    }

    /* renamed from: Z */
    private void m177Z() {
        if (this.f288u) {
            return;
        }
        this.f289v = m176T();
        CharSequence charSequenceM217h0 = m217h0();
        if (!TextUtils.isEmpty(charSequenceM217h0)) {
            InterfaceC0229o interfaceC0229o = this.f279l;
            if (interfaceC0229o != null) {
                interfaceC0229o.setWindowTitle(charSequenceM217h0);
            } else if (m192B0() != null) {
                m192B0().mo120t(charSequenceM217h0);
            } else {
                TextView textView = this.f290w;
                if (textView != null) {
                    textView.setText(charSequenceM217h0);
                }
            }
        }
        m167K();
        m242z0(this.f289v);
        this.f288u = true;
        PanelFeatureState panelFeatureStateM216g0 = m216g0(0, false);
        if (this.f256M) {
            return;
        }
        if (panelFeatureStateM216g0 == null || panelFeatureStateM216g0.f303j == null) {
            m186n0(108);
        }
    }

    /* renamed from: a0 */
    private void m178a0() {
        if (this.f273f == null) {
            Object obj = this.f269d;
            if (obj instanceof Activity) {
                m169L(((Activity) obj).getWindow());
            }
        }
        if (this.f273f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: c0 */
    private static Configuration m179c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = IGoodView.DEFAULT_TO_ALPHA;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                C0091k.m260a(configuration, configuration2, configuration3);
            } else if (!C1020c.m4773a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i9 = configuration.touchscreen;
            int i10 = configuration2.touchscreen;
            if (i9 != i10) {
                configuration3.touchscreen = i10;
            }
            int i11 = configuration.keyboard;
            int i12 = configuration2.keyboard;
            if (i11 != i12) {
                configuration3.keyboard = i12;
            }
            int i13 = configuration.keyboardHidden;
            int i14 = configuration2.keyboardHidden;
            if (i13 != i14) {
                configuration3.keyboardHidden = i14;
            }
            int i15 = configuration.navigation;
            int i16 = configuration2.navigation;
            if (i15 != i16) {
                configuration3.navigation = i16;
            }
            int i17 = configuration.navigationHidden;
            int i18 = configuration2.navigationHidden;
            if (i17 != i18) {
                configuration3.navigationHidden = i18;
            }
            int i19 = configuration.orientation;
            int i20 = configuration2.orientation;
            if (i19 != i20) {
                configuration3.orientation = i20;
            }
            int i21 = configuration.screenLayout & 15;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 15)) {
                configuration3.screenLayout |= i22 & 15;
            }
            int i23 = configuration.screenLayout & 192;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 192)) {
                configuration3.screenLayout |= i24 & 192;
            }
            int i25 = configuration.screenLayout & 48;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 48)) {
                configuration3.screenLayout |= i26 & 48;
            }
            int i27 = configuration.screenLayout & LogType.UNEXP_OTHER;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & LogType.UNEXP_OTHER)) {
                configuration3.screenLayout |= i28 & LogType.UNEXP_OTHER;
            }
            if (i8 >= 26) {
                C0092l.m261a(configuration, configuration2, configuration3);
            }
            int i29 = configuration.uiMode & 15;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 15)) {
                configuration3.uiMode |= i30 & 15;
            }
            int i31 = configuration.uiMode & 48;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 48)) {
                configuration3.uiMode |= i32 & 48;
            }
            int i33 = configuration.screenWidthDp;
            int i34 = configuration2.screenWidthDp;
            if (i33 != i34) {
                configuration3.screenWidthDp = i34;
            }
            int i35 = configuration.screenHeightDp;
            int i36 = configuration2.screenHeightDp;
            if (i35 != i36) {
                configuration3.screenHeightDp = i36;
            }
            int i37 = configuration.smallestScreenWidthDp;
            int i38 = configuration2.smallestScreenWidthDp;
            if (i37 != i38) {
                configuration3.smallestScreenWidthDp = i38;
            }
            C0089i.m258b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: e0 */
    private AbstractC0095o m180e0(Context context) {
        if (this.f262W == null) {
            this.f262W = new C0094n(context);
        }
        return this.f262W;
    }

    /* renamed from: f0 */
    private AbstractC0095o m181f0(Context context) {
        if (this.f261V == null) {
            this.f261V = new C0096p(C0111l.m296a(context));
        }
        return this.f261V;
    }

    /* renamed from: j0 */
    private void m182j0() {
        m177Z();
        if (this.f244A && this.f276i == null) {
            Object obj = this.f269d;
            if (obj instanceof Activity) {
                this.f276i = new C0112m((Activity) this.f269d, this.f245B);
            } else if (obj instanceof Dialog) {
                this.f276i = new C0112m((Dialog) this.f269d);
            }
            ActionBar actionBar = this.f276i;
            if (actionBar != null) {
                actionBar.mo118r(this.f266a0);
            }
        }
    }

    /* renamed from: k0 */
    private boolean m183k0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f302i;
        if (view != null) {
            panelFeatureState.f301h = view;
            return true;
        }
        if (panelFeatureState.f303j == null) {
            return false;
        }
        if (this.f281n == null) {
            this.f281n = new C0099s();
        }
        View view2 = (View) panelFeatureState.m243a(this.f281n);
        panelFeatureState.f301h = view2;
        return view2 != null;
    }

    /* renamed from: l0 */
    private boolean m184l0(PanelFeatureState panelFeatureState) {
        panelFeatureState.m246d(m214d0());
        panelFeatureState.f300g = new C0098r(panelFeatureState.f305l);
        panelFeatureState.f296c = 81;
        return true;
    }

    /* renamed from: m0 */
    private boolean m185m0(PanelFeatureState panelFeatureState) {
        Context context = this.f271e;
        int i4 = panelFeatureState.f294a;
        if ((i4 == 0 || i4 == 108) && this.f279l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C1038a.f5742f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C1038a.f5743g, typedValue, true);
            } else {
                theme.resolveAttribute(C1038a.f5743g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C2622d c2622d = new C2622d(context, 0);
                c2622d.getTheme().setTo(themeNewTheme);
                context = c2622d;
            }
        }
        C0125g c0125g = new C0125g(context);
        c0125g.setCallback(this);
        panelFeatureState.m245c(c0125g);
        return true;
    }

    /* renamed from: n0 */
    private void m186n0(int i4) {
        this.f264Y = (1 << i4) | this.f264Y;
        if (this.f263X) {
            return;
        }
        C0358u.m2035i0(this.f273f.getDecorView(), this.f265Z);
        this.f263X = true;
    }

    /* renamed from: o0 */
    private boolean m187o0() throws PackageManager.NameNotFoundException {
        if (!this.f260U && (this.f269d instanceof Activity)) {
            PackageManager packageManager = this.f271e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i4 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f271e, this.f269d.getClass()), i4 >= 29 ? 269221888 : i4 >= 24 ? 786432 : 0);
                this.f259T = (activityInfo == null || (activityInfo.configChanges & EventType.AUTH_SUCC) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f259T = false;
            }
        }
        this.f260U = true;
        return this.f259T;
    }

    /* renamed from: t0 */
    private boolean m188t0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateM216g0 = m216g0(i4, true);
        if (panelFeatureStateM216g0.f308o) {
            return false;
        }
        return m161D0(panelFeatureStateM216g0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m189w0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            g.b r0 = r4.f282o
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.m216g0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.o r5 = r4.f279l
            if (r5 == 0) goto L43
            boolean r5 = r5.mo557g()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f271e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.o r5 = r4.f279l
            boolean r5 = r5.mo552b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f256M
            if (r5 != 0) goto L62
            boolean r5 = r4.m161D0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.o r5 = r4.f279l
            boolean r0 = r5.mo556f()
            goto L68
        L3c:
            androidx.appcompat.widget.o r5 = r4.f279l
            boolean r0 = r5.mo555e()
            goto L68
        L43:
            boolean r5 = r2.f308o
            if (r5 != 0) goto L64
            boolean r3 = r2.f307n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f306m
            if (r5 == 0) goto L62
            boolean r5 = r2.f311r
            if (r5 == 0) goto L5b
            r2.f306m = r1
            boolean r5 = r4.m161D0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.m159A0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.m205R(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f271e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m189w0(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: A */
    public boolean mo190A(int i4) {
        int iM163F0 = m163F0(i4);
        if (this.f248E && iM163F0 == 108) {
            return false;
        }
        if (this.f244A && iM163F0 == 1) {
            this.f244A = false;
        }
        if (iM163F0 == 1) {
            m166J0();
            this.f248E = true;
            return true;
        }
        if (iM163F0 == 2) {
            m166J0();
            this.f292y = true;
            return true;
        }
        if (iM163F0 == 5) {
            m166J0();
            this.f293z = true;
            return true;
        }
        if (iM163F0 == 10) {
            m166J0();
            this.f246C = true;
            return true;
        }
        if (iM163F0 == 108) {
            m166J0();
            this.f244A = true;
            return true;
        }
        if (iM163F0 != 109) {
            return this.f273f.requestFeature(iM163F0);
        }
        m166J0();
        this.f245B = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: B */
    public void mo191B(int i4) {
        m177Z();
        ViewGroup viewGroup = (ViewGroup) this.f289v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f271e).inflate(i4, viewGroup);
        this.f274g.m8810a().onContentChanged();
    }

    /* renamed from: B0 */
    final ActionBar m192B0() {
        return this.f276i;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: C */
    public void mo193C(View view) {
        m177Z();
        ViewGroup viewGroup = (ViewGroup) this.f289v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f274g.m8810a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: D */
    public void mo194D(View view, ViewGroup.LayoutParams layoutParams) {
        m177Z();
        ViewGroup viewGroup = (ViewGroup) this.f289v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f274g.m8810a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: F */
    public void mo195F(Toolbar toolbar) {
        if (this.f269d instanceof Activity) {
            ActionBar actionBarMo223n = mo223n();
            if (actionBarMo223n instanceof C0112m) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f277j = null;
            if (actionBarMo223n != null) {
                actionBarMo223n.mo114n();
            }
            if (toolbar != null) {
                C0109j c0109j = new C0109j(toolbar, m217h0(), this.f274g);
                this.f276i = c0109j;
                this.f273f.setCallback(c0109j.m292w());
            } else {
                this.f276i = null;
                this.f273f.setCallback(this.f274g);
            }
            mo225p();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: G */
    public void mo196G(int i4) {
        this.f258S = i4;
    }

    /* renamed from: G0 */
    final boolean m197G0() {
        ViewGroup viewGroup;
        return this.f288u && (viewGroup = this.f289v) != null && C0358u.m2013V(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: H */
    public final void mo198H(CharSequence charSequence) {
        this.f278k = charSequence;
        InterfaceC0229o interfaceC0229o = this.f279l;
        if (interfaceC0229o != null) {
            interfaceC0229o.setWindowTitle(charSequence);
            return;
        }
        if (m192B0() != null) {
            m192B0().mo120t(charSequence);
            return;
        }
        TextView textView = this.f290w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: I */
    public AbstractC2620b mo199I(AbstractC2620b.a aVar) {
        InterfaceC0102c interfaceC0102c;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC2620b abstractC2620b = this.f282o;
        if (abstractC2620b != null) {
            abstractC2620b.mo327a();
        }
        C0088h c0088h = new C0088h(aVar);
        ActionBar actionBarMo223n = mo223n();
        if (actionBarMo223n != null) {
            AbstractC2620b abstractC2620bMo121u = actionBarMo223n.mo121u(c0088h);
            this.f282o = abstractC2620bMo121u;
            if (abstractC2620bMo121u != null && (interfaceC0102c = this.f275h) != null) {
                interfaceC0102c.onSupportActionModeStarted(abstractC2620bMo121u);
            }
        }
        if (this.f282o == null) {
            this.f282o = m200I0(c0088h);
        }
        return this.f282o;
    }

    /* renamed from: I0 */
    AbstractC2620b m200I0(AbstractC2620b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC2620b abstractC2620bOnWindowStartingSupportActionMode;
        Context c2622d;
        InterfaceC0102c interfaceC0102c;
        m210Y();
        AbstractC2620b abstractC2620b = this.f282o;
        if (abstractC2620b != null) {
            abstractC2620b.mo327a();
        }
        if (!(aVar instanceof C0088h)) {
            aVar = new C0088h(aVar);
        }
        InterfaceC0102c interfaceC0102c2 = this.f275h;
        if (interfaceC0102c2 == null || this.f256M) {
            abstractC2620bOnWindowStartingSupportActionMode = null;
        } else {
            try {
                abstractC2620bOnWindowStartingSupportActionMode = interfaceC0102c2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (abstractC2620bOnWindowStartingSupportActionMode != null) {
            this.f282o = abstractC2620bOnWindowStartingSupportActionMode;
        } else {
            if (this.f283p == null) {
                if (this.f247D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f271e.getTheme();
                    theme.resolveAttribute(C1038a.f5742f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f271e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c2622d = new C2622d(this.f271e, 0);
                        c2622d.getTheme().setTo(themeNewTheme);
                    } else {
                        c2622d = this.f271e;
                    }
                    this.f283p = new ActionBarContextView(c2622d);
                    PopupWindow popupWindow = new PopupWindow(c2622d, (AttributeSet) null, C1038a.f5745i);
                    this.f284q = popupWindow;
                    C0376j.m2185b(popupWindow, 2);
                    this.f284q.setContentView(this.f283p);
                    this.f284q.setWidth(-1);
                    c2622d.getTheme().resolveAttribute(C1038a.f5738b, typedValue, true);
                    this.f283p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c2622d.getResources().getDisplayMetrics()));
                    this.f284q.setHeight(-2);
                    this.f285r = new RunnableC0084d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f289v.findViewById(C1043f.f5861h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m214d0()));
                        this.f283p = (ActionBarContextView) viewStubCompat.m731a();
                    }
                }
            }
            if (this.f283p != null) {
                m210Y();
                this.f283p.m541k();
                C2623e c2623e = new C2623e(this.f283p.getContext(), this.f283p, aVar, this.f284q == null);
                if (aVar.mo254b(c2623e, c2623e.mo329c())) {
                    c2623e.mo333i();
                    this.f283p.m539h(c2623e);
                    this.f282o = c2623e;
                    if (m197G0()) {
                        this.f283p.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
                        C0362y c0362yM2121a = C0358u.m2022c(this.f283p).m2121a(1.0f);
                        this.f286s = c0362yM2121a;
                        c0362yM2121a.m2126f(new C0085e());
                    } else {
                        this.f283p.setAlpha(1.0f);
                        this.f283p.setVisibility(0);
                        this.f283p.sendAccessibilityEvent(32);
                        if (this.f283p.getParent() instanceof View) {
                            C0358u.m2045n0((View) this.f283p.getParent());
                        }
                    }
                    if (this.f284q != null) {
                        this.f273f.getDecorView().post(this.f285r);
                    }
                } else {
                    this.f282o = null;
                }
            }
        }
        AbstractC2620b abstractC2620b2 = this.f282o;
        if (abstractC2620b2 != null && (interfaceC0102c = this.f275h) != null) {
            interfaceC0102c.onSupportActionModeStarted(abstractC2620b2);
        }
        return this.f282o;
    }

    /* renamed from: N */
    void m201N(int i4, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i4 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f250G;
                if (i4 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i4];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f303j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f308o) && !this.f256M) {
            this.f274g.m8810a().onPanelClosed(i4, menu);
        }
    }

    /* renamed from: N0 */
    final int m202N0(C0340c0 c0340c0, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z3;
        boolean z4;
        int iM1874l = c0340c0 != null ? c0340c0.m1874l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f283p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f283p.getLayoutParams();
            if (this.f283p.isShown()) {
                if (this.f267b0 == null) {
                    this.f267b0 = new Rect();
                    this.f268c0 = new Rect();
                }
                Rect rect2 = this.f267b0;
                Rect rect3 = this.f268c0;
                if (c0340c0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0340c0.m1872j(), c0340c0.m1874l(), c0340c0.m1873k(), c0340c0.m1871i());
                }
                C0226m0.m946a(this.f289v, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                C0340c0 c0340c0M1994I = C0358u.m1994I(this.f289v);
                int iM1872j = c0340c0M1994I == null ? 0 : c0340c0M1994I.m1872j();
                int iM1873k = c0340c0M1994I == null ? 0 : c0340c0M1994I.m1873k();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z4 = true;
                }
                if (i4 <= 0 || this.f291x != null) {
                    View view = this.f291x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != iM1872j || marginLayoutParams2.rightMargin != iM1873k) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = iM1872j;
                            marginLayoutParams2.rightMargin = iM1873k;
                            this.f291x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f271e);
                    this.f291x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM1872j;
                    layoutParams.rightMargin = iM1873k;
                    this.f289v.addView(this.f291x, -1, layoutParams);
                }
                View view3 = this.f291x;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    m173O0(this.f291x);
                }
                if (!this.f246C && z) {
                    iM1874l = 0;
                }
                z3 = z;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z) {
                this.f283p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f291x;
        if (view4 != null) {
            view4.setVisibility(z3 ? 0 : 8);
        }
        return iM1874l;
    }

    /* renamed from: O */
    void m203O(C0125g c0125g) {
        if (this.f249F) {
            return;
        }
        this.f249F = true;
        this.f279l.mo559i();
        Window.Callback callbackM219i0 = m219i0();
        if (callbackM219i0 != null && !this.f256M) {
            callbackM219i0.onPanelClosed(108, c0125g);
        }
        this.f249F = false;
    }

    /* renamed from: Q */
    void m204Q(int i4) {
        m205R(m216g0(i4, true), true);
    }

    /* renamed from: R */
    void m205R(PanelFeatureState panelFeatureState, boolean z3) {
        ViewGroup viewGroup;
        InterfaceC0229o interfaceC0229o;
        if (z3 && panelFeatureState.f294a == 0 && (interfaceC0229o = this.f279l) != null && interfaceC0229o.mo552b()) {
            m203O(panelFeatureState.f303j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f271e.getSystemService("window");
        if (windowManager != null && panelFeatureState.f308o && (viewGroup = panelFeatureState.f300g) != null) {
            windowManager.removeView(viewGroup);
            if (z3) {
                m201N(panelFeatureState.f294a, panelFeatureState, null);
            }
        }
        panelFeatureState.f306m = false;
        panelFeatureState.f307n = false;
        panelFeatureState.f308o = false;
        panelFeatureState.f301h = null;
        panelFeatureState.f310q = true;
        if (this.f251H == panelFeatureState) {
            this.f251H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U */
    public View m206U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        boolean zM164H0 = false;
        if (this.f270d0 == null) {
            String string = this.f271e.obtainStyledAttributes(C1047j.f5928B0).getString(C1047j.f5948F0);
            if (string == null) {
                this.f270d0 = new C0106g();
            } else {
                try {
                    this.f270d0 = (C0106g) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f270d0 = new C0106g();
                }
            }
        }
        boolean z4 = f240g0;
        if (z4) {
            if (this.f272e0 == null) {
                this.f272e0 = new C0107h();
            }
            if (this.f272e0.m285a(attributeSet)) {
                z3 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zM164H0 = m164H0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zM164H0 = true;
                }
                z3 = zM164H0;
            }
        } else {
            z3 = false;
        }
        return this.f270d0.createView(view, str, context, attributeSet, z3, z4, true, C0224l0.m915b());
    }

    /* renamed from: V */
    void m207V() {
        C0125g c0125g;
        InterfaceC0229o interfaceC0229o = this.f279l;
        if (interfaceC0229o != null) {
            interfaceC0229o.mo559i();
        }
        if (this.f284q != null) {
            this.f273f.getDecorView().removeCallbacks(this.f285r);
            if (this.f284q.isShowing()) {
                try {
                    this.f284q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f284q = null;
        }
        m210Y();
        PanelFeatureState panelFeatureStateM216g0 = m216g0(0, false);
        if (panelFeatureStateM216g0 == null || (c0125g = panelFeatureStateM216g0.f303j) == null) {
            return;
        }
        c0125g.close();
    }

    /* renamed from: W */
    boolean m208W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f269d;
        if (((obj instanceof C0343f.a) || (obj instanceof DialogC0104e)) && (decorView = this.f273f.getDecorView()) != null && C0343f.m1932d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f274g.m8810a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m232s0(keyCode, keyEvent) : m237v0(keyCode, keyEvent);
    }

    /* renamed from: X */
    void m209X(int i4) {
        PanelFeatureState panelFeatureStateM216g0;
        PanelFeatureState panelFeatureStateM216g02 = m216g0(i4, true);
        if (panelFeatureStateM216g02.f303j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateM216g02.f303j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateM216g02.f312s = bundle;
            }
            panelFeatureStateM216g02.f303j.stopDispatchingItemsChanged();
            panelFeatureStateM216g02.f303j.clear();
        }
        panelFeatureStateM216g02.f311r = true;
        panelFeatureStateM216g02.f310q = true;
        if ((i4 != 108 && i4 != 0) || this.f279l == null || (panelFeatureStateM216g0 = m216g0(0, false)) == null) {
            return;
        }
        panelFeatureStateM216g0.f306m = false;
        m161D0(panelFeatureStateM216g0, null);
    }

    /* renamed from: Y */
    void m210Y() {
        C0362y c0362y = this.f286s;
        if (c0362y != null) {
            c0362y.m2122b();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: b */
    public void mo211b(View view, ViewGroup.LayoutParams layoutParams) {
        m177Z();
        ((ViewGroup) this.f289v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f274g.m8810a().onContentChanged();
    }

    /* renamed from: b0 */
    PanelFeatureState m212b0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f250G;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i4 = 0; i4 < length; i4++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
            if (panelFeatureState != null && panelFeatureState.f303j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: c */
    public boolean mo213c() {
        return m165J(true);
    }

    /* renamed from: d0 */
    final Context m214d0() {
        ActionBar actionBarMo223n = mo223n();
        Context contextMo111k = actionBarMo223n != null ? actionBarMo223n.mo111k() : null;
        return contextMo111k == null ? this.f271e : contextMo111k;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: f */
    public Context mo215f(Context context) {
        this.f253J = true;
        int iM228q0 = m228q0(context, m171M());
        if (f243j0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0097q.m268a((ContextThemeWrapper) context, m175S(context, iM228q0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C2622d) {
            try {
                ((C2622d) context).m8784a(m175S(context, iM228q0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f242i0) {
            return super.mo215f(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = IGoodView.DEFAULT_TO_ALPHA;
        Configuration configuration2 = C0089i.m257a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM175S = m175S(context, iM228q0, configuration2.equals(configuration3) ? null : m179c0(configuration2, configuration3));
        C2622d c2622d = new C2622d(context, C1046i.f5920d);
        c2622d.m8784a(configurationM175S);
        boolean z3 = false;
        try {
            z3 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z3) {
            C3368f.d.m10242a(c2622d.getTheme());
        }
        return super.mo215f(c2622d);
    }

    /* renamed from: g0 */
    protected PanelFeatureState m216g0(int i4, boolean z3) {
        PanelFeatureState[] panelFeatureStateArr = this.f250G;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i4) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i4 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f250G = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i4);
        panelFeatureStateArr[i4] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: h0 */
    final CharSequence m217h0() {
        Object obj = this.f269d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f278k;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: i */
    public <T extends View> T mo218i(int i4) {
        m177Z();
        return (T) this.f273f.findViewById(i4);
    }

    /* renamed from: i0 */
    final Window.Callback m219i0() {
        return this.f273f.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: k */
    public final InterfaceC0100a mo220k() {
        return new C0086f();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: l */
    public int mo221l() {
        return this.f257N;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: m */
    public MenuInflater mo222m() {
        if (this.f277j == null) {
            m182j0();
            ActionBar actionBar = this.f276i;
            this.f277j = new C2625g(actionBar != null ? actionBar.mo111k() : this.f271e);
        }
        return this.f277j;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: n */
    public ActionBar mo223n() {
        m182j0();
        return this.f276i;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: o */
    public void mo224o() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f271e);
        if (layoutInflaterFrom.getFactory() == null) {
            C0344g.m1935a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m206U(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.C0125g.a
    public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateM212b0;
        Window.Callback callbackM219i0 = m219i0();
        if (callbackM219i0 == null || this.f256M || (panelFeatureStateM212b0 = m212b0(c0125g.getRootMenu())) == null) {
            return false;
        }
        return callbackM219i0.onMenuItemSelected(panelFeatureStateM212b0.f294a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0125g.a
    public void onMenuModeChange(C0125g c0125g) {
        m162E0(true);
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: p */
    public void mo225p() {
        ActionBar actionBarMo223n = mo223n();
        if (actionBarMo223n == null || !actionBarMo223n.mo112l()) {
            m186n0(0);
        }
    }

    /* renamed from: p0 */
    public boolean m226p0() {
        return this.f287t;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: q */
    public void mo227q(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        ActionBar actionBarMo223n;
        if (this.f244A && this.f288u && (actionBarMo223n = mo223n()) != null) {
            actionBarMo223n.mo113m(configuration);
        }
        C0211f.m791b().m798g(this.f271e);
        m165J(false);
    }

    /* renamed from: q0 */
    int m228q0(Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m181f0(context).mo264c();
                }
                return -1;
            }
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    return m180e0(context).mo264c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i4;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: r */
    public void mo229r(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.f253J = true;
        m165J(false);
        m178a0();
        Object obj = this.f269d;
        if (obj instanceof Activity) {
            String strM1781c = null;
            try {
                strM1781c = C0325f.m1781c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strM1781c != null) {
                ActionBar actionBarM192B0 = m192B0();
                if (actionBarM192B0 == null) {
                    this.f266a0 = true;
                } else {
                    actionBarM192B0.mo118r(true);
                }
            }
            AbstractC0103d.m273a(this);
        }
        this.f254K = true;
    }

    /* renamed from: r0 */
    boolean m230r0() {
        AbstractC2620b abstractC2620b = this.f282o;
        if (abstractC2620b != null) {
            abstractC2620b.mo327a();
            return true;
        }
        ActionBar actionBarMo223n = mo223n();
        return actionBarMo223n != null && actionBarMo223n.mo108h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo231s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f269d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0103d.m278y(r3)
        L9:
            boolean r0 = r3.f263X
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f273f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f265Z
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f255L = r0
            r0 = 1
            r3.f256M = r0
            int r0 = r3.f257N
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f269d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f239f0
            java.lang.Object r1 = r3.f269d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f257N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f239f0
            java.lang.Object r1 = r3.f269d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.ActionBar r0 = r3.f276i
            if (r0 == 0) goto L5e
            r0.mo114n()
        L5e:
            r3.m174P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo231s():void");
    }

    /* renamed from: s0 */
    boolean m232s0(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            this.f252I = (keyEvent.getFlags() & 128) != 0;
        } else if (i4 == 82) {
            m188t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: t */
    public void mo233t(Bundle bundle) {
        m177Z();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: u */
    public void mo234u() {
        ActionBar actionBarMo223n = mo223n();
        if (actionBarMo223n != null) {
            actionBarMo223n.mo119s(true);
        }
    }

    /* renamed from: u0 */
    boolean m235u0(int i4, KeyEvent keyEvent) {
        ActionBar actionBarMo223n = mo223n();
        if (actionBarMo223n != null && actionBarMo223n.mo115o(i4, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f251H;
        if (panelFeatureState != null && m160C0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f251H;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f307n = true;
            }
            return true;
        }
        if (this.f251H == null) {
            PanelFeatureState panelFeatureStateM216g0 = m216g0(0, true);
            m161D0(panelFeatureStateM216g0, keyEvent);
            boolean zM160C0 = m160C0(panelFeatureStateM216g0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateM216g0.f306m = false;
            if (zM160C0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: v */
    public void mo236v(Bundle bundle) {
    }

    /* renamed from: v0 */
    boolean m237v0(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            boolean z3 = this.f252I;
            this.f252I = false;
            PanelFeatureState panelFeatureStateM216g0 = m216g0(0, false);
            if (panelFeatureStateM216g0 != null && panelFeatureStateM216g0.f308o) {
                if (!z3) {
                    m205R(panelFeatureStateM216g0, true);
                }
                return true;
            }
            if (m230r0()) {
                return true;
            }
        } else if (i4 == 82) {
            m189w0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: w */
    public void mo238w() {
        this.f255L = true;
        mo213c();
    }

    @Override // androidx.appcompat.app.AbstractC0103d
    /* renamed from: x */
    public void mo239x() {
        this.f255L = false;
        ActionBar actionBarMo223n = mo223n();
        if (actionBarMo223n != null) {
            actionBarMo223n.mo119s(false);
        }
    }

    /* renamed from: x0 */
    void m240x0(int i4) {
        ActionBar actionBarMo223n;
        if (i4 != 108 || (actionBarMo223n = mo223n()) == null) {
            return;
        }
        actionBarMo223n.mo109i(true);
    }

    /* renamed from: y0 */
    void m241y0(int i4) {
        if (i4 == 108) {
            ActionBar actionBarMo223n = mo223n();
            if (actionBarMo223n != null) {
                actionBarMo223n.mo109i(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            PanelFeatureState panelFeatureStateM216g0 = m216g0(i4, true);
            if (panelFeatureStateM216g0.f308o) {
                m205R(panelFeatureStateM216g0, false);
            }
        }
    }

    /* renamed from: z0 */
    void m242z0(ViewGroup viewGroup) {
    }

    AppCompatDelegateImpl(Dialog dialog, InterfaceC0102c interfaceC0102c) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0102c, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, InterfaceC0102c interfaceC0102c, Object obj) {
        C0253g<String, Integer> c0253g;
        Integer num;
        AppCompatActivity appCompatActivityM168K0;
        this.f286s = null;
        this.f287t = true;
        this.f257N = -100;
        this.f265Z = new RunnableC0081a();
        this.f271e = context;
        this.f275h = interfaceC0102c;
        this.f269d = obj;
        if (this.f257N == -100 && (obj instanceof Dialog) && (appCompatActivityM168K0 = m168K0()) != null) {
            this.f257N = appCompatActivityM168K0.getDelegate().mo221l();
        }
        if (this.f257N == -100 && (num = (c0253g = f239f0).get(obj.getClass().getName())) != null) {
            this.f257N = num.intValue();
            c0253g.remove(obj.getClass().getName());
        }
        if (window != null) {
            m169L(window);
        }
        C0211f.m793h();
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    class C0093m extends WindowCallbackC2627i {
        C0093m(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m262b(ActionMode.Callback callback) {
            C2624f.a aVar = new C2624f.a(AppCompatDelegateImpl.this.f271e, callback);
            AbstractC2620b abstractC2620bMo199I = AppCompatDelegateImpl.this.mo199I(aVar);
            if (abstractC2620bMo199I != null) {
                return aVar.m8788e(abstractC2620bMo199I);
            }
            return null;
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m208W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.m235u0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 != 0 || (menu instanceof C0125g)) {
                return super.onCreatePanelMenu(i4, menu);
            }
            return false;
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            AppCompatDelegateImpl.this.m240x0(i4);
            return true;
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public void onPanelClosed(int i4, Menu menu) {
            super.onPanelClosed(i4, menu);
            AppCompatDelegateImpl.this.m241y0(i4);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean onPreparePanel(int i4, View view, Menu menu) {
            C0125g c0125g = menu instanceof C0125g ? (C0125g) menu : null;
            if (i4 == 0 && c0125g == null) {
                return false;
            }
            if (c0125g != null) {
                c0125g.setOverrideVisibleItems(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i4, view, menu);
            if (c0125g != null) {
                c0125g.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            C0125g c0125g;
            PanelFeatureState panelFeatureStateM216g0 = AppCompatDelegateImpl.this.m216g0(0, true);
            if (panelFeatureStateM216g0 == null || (c0125g = panelFeatureStateM216g0.f303j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, c0125g, i4);
            }
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return AppCompatDelegateImpl.this.m226p0() ? m262b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            if (AppCompatDelegateImpl.this.m226p0() && i4 == 0) {
                return m262b(callback);
            }
            return super.onWindowStartingActionMode(callback, i4);
        }
    }
}

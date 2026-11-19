package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p011b0.C1020c;
import p011b0.C1025h;
import p152t.C3386e;

/* renamed from: androidx.core.view.c0 */
/* loaded from: classes.dex */
public class C0340c0 {

    /* renamed from: b */
    public static final C0340c0 f2699b;

    /* renamed from: a */
    private final l f2700a;

    /* renamed from: androidx.core.view.c0$a */
    static class a {

        /* renamed from: a */
        private static Field f2701a;

        /* renamed from: b */
        private static Field f2702b;

        /* renamed from: c */
        private static Field f2703c;

        /* renamed from: d */
        private static boolean f2704d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2701a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2702b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2703c = declaredField3;
                declaredField3.setAccessible(true);
                f2704d = true;
            } catch (ReflectiveOperationException e4) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }

        /* renamed from: a */
        public static C0340c0 m1884a(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f2704d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2701a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2702b.get(obj);
                        Rect rect2 = (Rect) f2703c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0340c0 c0340c0M1885a = new b().m1886b(C3386e.m10306c(rect)).m1887c(C3386e.m10306c(rect2)).m1885a();
                            c0340c0M1885a.m1881t(c0340c0M1885a);
                            c0340c0M1885a.m1866d(view.getRootView());
                            return c0340c0M1885a;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.c0$e */
    private static class e extends d {
        e() {
        }

        e(C0340c0 c0340c0) {
            super(c0340c0);
        }
    }

    /* renamed from: androidx.core.view.c0$f */
    private static class f {

        /* renamed from: a */
        private final C0340c0 f2713a;

        /* renamed from: b */
        C3386e[] f2714b;

        f() {
            this(new C0340c0((C0340c0) null));
        }

        /* renamed from: a */
        protected final void m1895a() {
            C3386e[] c3386eArr = this.f2714b;
            if (c3386eArr != null) {
                C3386e c3386eM1868f = c3386eArr[m.m1920a(1)];
                C3386e c3386eM1868f2 = this.f2714b[m.m1920a(2)];
                if (c3386eM1868f2 == null) {
                    c3386eM1868f2 = this.f2713a.m1868f(2);
                }
                if (c3386eM1868f == null) {
                    c3386eM1868f = this.f2713a.m1868f(1);
                }
                mo1891f(C3386e.m10304a(c3386eM1868f, c3386eM1868f2));
                C3386e c3386e = this.f2714b[m.m1920a(16)];
                if (c3386e != null) {
                    mo1893e(c3386e);
                }
                C3386e c3386e2 = this.f2714b[m.m1920a(32)];
                if (c3386e2 != null) {
                    mo1892c(c3386e2);
                }
                C3386e c3386e3 = this.f2714b[m.m1920a(64)];
                if (c3386e3 != null) {
                    mo1894g(c3386e3);
                }
            }
        }

        /* renamed from: b */
        C0340c0 mo1889b() {
            throw null;
        }

        /* renamed from: c */
        void mo1892c(C3386e c3386e) {
        }

        /* renamed from: d */
        void mo1890d(C3386e c3386e) {
            throw null;
        }

        /* renamed from: e */
        void mo1893e(C3386e c3386e) {
        }

        /* renamed from: f */
        void mo1891f(C3386e c3386e) {
            throw null;
        }

        /* renamed from: g */
        void mo1894g(C3386e c3386e) {
        }

        f(C0340c0 c0340c0) {
            this.f2713a = c0340c0;
        }
    }

    /* renamed from: androidx.core.view.c0$i */
    private static class i extends h {
        i(C0340c0 c0340c0, WindowInsets windowInsets) {
            super(c0340c0, windowInsets);
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: a */
        C0340c0 mo1915a() {
            return C0340c0.m1861w(this.f2721c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C0340c0.g, androidx.core.view.C0340c0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2721c, iVar.f2721c) && Objects.equals(this.f2725g, iVar.f2725g);
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: f */
        C0341d mo1916f() {
            return C0341d.m1922e(this.f2721c.getDisplayCutout());
        }

        @Override // androidx.core.view.C0340c0.l
        public int hashCode() {
            return this.f2721c.hashCode();
        }

        i(C0340c0 c0340c0, i iVar) {
            super(c0340c0, iVar);
        }
    }

    /* renamed from: androidx.core.view.c0$k */
    private static class k extends j {

        /* renamed from: r */
        static final C0340c0 f2730r = C0340c0.m1861w(WindowInsets.CONSUMED);

        k(C0340c0 c0340c0, WindowInsets windowInsets) {
            super(c0340c0, windowInsets);
        }

        @Override // androidx.core.view.C0340c0.g, androidx.core.view.C0340c0.l
        /* renamed from: d */
        final void mo1900d(View view) {
        }

        @Override // androidx.core.view.C0340c0.g, androidx.core.view.C0340c0.l
        /* renamed from: g */
        public C3386e mo1902g(int i4) {
            return C3386e.m10307d(this.f2721c.getInsets(n.m1921a(i4)));
        }

        k(C0340c0 c0340c0, k kVar) {
            super(c0340c0, kVar);
        }
    }

    /* renamed from: androidx.core.view.c0$l */
    private static class l {

        /* renamed from: b */
        static final C0340c0 f2731b = new b().m1885a().m1863a().m1864b().m1865c();

        /* renamed from: a */
        final C0340c0 f2732a;

        l(C0340c0 c0340c0) {
            this.f2732a = c0340c0;
        }

        /* renamed from: a */
        C0340c0 mo1915a() {
            return this.f2732a;
        }

        /* renamed from: b */
        C0340c0 mo1910b() {
            return this.f2732a;
        }

        /* renamed from: c */
        C0340c0 mo1911c() {
            return this.f2732a;
        }

        /* renamed from: d */
        void mo1900d(View view) {
        }

        /* renamed from: e */
        void mo1901e(C0340c0 c0340c0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo1905o() == lVar.mo1905o() && mo1913n() == lVar.mo1913n() && C1020c.m4773a(mo1903k(), lVar.mo1903k()) && C1020c.m4773a(mo1912i(), lVar.mo1912i()) && C1020c.m4773a(mo1916f(), lVar.mo1916f());
        }

        /* renamed from: f */
        C0341d mo1916f() {
            return null;
        }

        /* renamed from: g */
        C3386e mo1902g(int i4) {
            return C3386e.f11899e;
        }

        /* renamed from: h */
        C3386e mo1917h() {
            return mo1903k();
        }

        public int hashCode() {
            return C1020c.m4774b(Boolean.valueOf(mo1905o()), Boolean.valueOf(mo1913n()), mo1903k(), mo1912i(), mo1916f());
        }

        /* renamed from: i */
        C3386e mo1912i() {
            return C3386e.f11899e;
        }

        /* renamed from: j */
        C3386e mo1918j() {
            return mo1903k();
        }

        /* renamed from: k */
        C3386e mo1903k() {
            return C3386e.f11899e;
        }

        /* renamed from: l */
        C3386e mo1919l() {
            return mo1903k();
        }

        /* renamed from: m */
        C0340c0 mo1904m(int i4, int i5, int i6, int i7) {
            return f2731b;
        }

        /* renamed from: n */
        boolean mo1913n() {
            return false;
        }

        /* renamed from: o */
        boolean mo1905o() {
            return false;
        }

        /* renamed from: p */
        public void mo1906p(C3386e[] c3386eArr) {
        }

        /* renamed from: q */
        void mo1907q(C3386e c3386e) {
        }

        /* renamed from: r */
        void mo1908r(C0340c0 c0340c0) {
        }

        /* renamed from: s */
        public void mo1914s(C3386e c3386e) {
        }
    }

    /* renamed from: androidx.core.view.c0$m */
    public static final class m {
        /* renamed from: a */
        static int m1920a(int i4) {
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 == 8) {
                return 3;
            }
            if (i4 == 16) {
                return 4;
            }
            if (i4 == 32) {
                return 5;
            }
            if (i4 == 64) {
                return 6;
            }
            if (i4 == 128) {
                return 7;
            }
            if (i4 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i4);
        }
    }

    /* renamed from: androidx.core.view.c0$n */
    private static final class n {
        /* renamed from: a */
        static int m1921a(int i4) {
            int iStatusBars;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i5 |= iStatusBars;
                }
            }
            return i5;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2699b = k.f2730r;
        } else {
            f2699b = l.f2731b;
        }
    }

    private C0340c0(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f2700a = new k(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f2700a = new j(this, windowInsets);
        } else if (i4 >= 28) {
            this.f2700a = new i(this, windowInsets);
        } else {
            this.f2700a = new h(this, windowInsets);
        }
    }

    /* renamed from: o */
    static C3386e m1860o(C3386e c3386e, int i4, int i5, int i6, int i7) {
        int iMax = Math.max(0, c3386e.f11900a - i4);
        int iMax2 = Math.max(0, c3386e.f11901b - i5);
        int iMax3 = Math.max(0, c3386e.f11902c - i6);
        int iMax4 = Math.max(0, c3386e.f11903d - i7);
        return (iMax == i4 && iMax2 == i5 && iMax3 == i6 && iMax4 == i7) ? c3386e : C3386e.m10305b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: w */
    public static C0340c0 m1861w(WindowInsets windowInsets) {
        return m1862x(windowInsets, null);
    }

    /* renamed from: x */
    public static C0340c0 m1862x(WindowInsets windowInsets, View view) {
        C0340c0 c0340c0 = new C0340c0((WindowInsets) C1025h.m4782f(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0340c0.m1881t(C0358u.m1994I(view));
            c0340c0.m1866d(view.getRootView());
        }
        return c0340c0;
    }

    @Deprecated
    /* renamed from: a */
    public C0340c0 m1863a() {
        return this.f2700a.mo1915a();
    }

    @Deprecated
    /* renamed from: b */
    public C0340c0 m1864b() {
        return this.f2700a.mo1910b();
    }

    @Deprecated
    /* renamed from: c */
    public C0340c0 m1865c() {
        return this.f2700a.mo1911c();
    }

    /* renamed from: d */
    void m1866d(View view) {
        this.f2700a.mo1900d(view);
    }

    /* renamed from: e */
    public C0341d m1867e() {
        return this.f2700a.mo1916f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0340c0) {
            return C1020c.m4773a(this.f2700a, ((C0340c0) obj).f2700a);
        }
        return false;
    }

    /* renamed from: f */
    public C3386e m1868f(int i4) {
        return this.f2700a.mo1902g(i4);
    }

    @Deprecated
    /* renamed from: g */
    public C3386e m1869g() {
        return this.f2700a.mo1917h();
    }

    @Deprecated
    /* renamed from: h */
    public C3386e m1870h() {
        return this.f2700a.mo1912i();
    }

    public int hashCode() {
        l lVar = this.f2700a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m1871i() {
        return this.f2700a.mo1903k().f11903d;
    }

    @Deprecated
    /* renamed from: j */
    public int m1872j() {
        return this.f2700a.mo1903k().f11900a;
    }

    @Deprecated
    /* renamed from: k */
    public int m1873k() {
        return this.f2700a.mo1903k().f11902c;
    }

    @Deprecated
    /* renamed from: l */
    public int m1874l() {
        return this.f2700a.mo1903k().f11901b;
    }

    @Deprecated
    /* renamed from: m */
    public boolean m1875m() {
        return !this.f2700a.mo1903k().equals(C3386e.f11899e);
    }

    /* renamed from: n */
    public C0340c0 m1876n(int i4, int i5, int i6, int i7) {
        return this.f2700a.mo1904m(i4, i5, i6, i7);
    }

    /* renamed from: p */
    public boolean m1877p() {
        return this.f2700a.mo1913n();
    }

    @Deprecated
    /* renamed from: q */
    public C0340c0 m1878q(int i4, int i5, int i6, int i7) {
        return new b(this).m1887c(C3386e.m10305b(i4, i5, i6, i7)).m1885a();
    }

    /* renamed from: r */
    void m1879r(C3386e[] c3386eArr) {
        this.f2700a.mo1906p(c3386eArr);
    }

    /* renamed from: s */
    void m1880s(C3386e c3386e) {
        this.f2700a.mo1907q(c3386e);
    }

    /* renamed from: t */
    void m1881t(C0340c0 c0340c0) {
        this.f2700a.mo1908r(c0340c0);
    }

    /* renamed from: u */
    void m1882u(C3386e c3386e) {
        this.f2700a.mo1914s(c3386e);
    }

    /* renamed from: v */
    public WindowInsets m1883v() {
        l lVar = this.f2700a;
        if (lVar instanceof g) {
            return ((g) lVar).f2721c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.c0$c */
    private static class c extends f {

        /* renamed from: e */
        private static Field f2706e = null;

        /* renamed from: f */
        private static boolean f2707f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f2708g = null;

        /* renamed from: h */
        private static boolean f2709h = false;

        /* renamed from: c */
        private WindowInsets f2710c;

        /* renamed from: d */
        private C3386e f2711d;

        c() {
            this.f2710c = m1888h();
        }

        /* renamed from: h */
        private static WindowInsets m1888h() {
            if (!f2707f) {
                try {
                    f2706e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f2707f = true;
            }
            Field field = f2706e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
                }
            }
            if (!f2709h) {
                try {
                    f2708g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
                }
                f2709h = true;
            }
            Constructor<WindowInsets> constructor = f2708g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: b */
        C0340c0 mo1889b() {
            m1895a();
            C0340c0 c0340c0M1861w = C0340c0.m1861w(this.f2710c);
            c0340c0M1861w.m1879r(this.f2714b);
            c0340c0M1861w.m1882u(this.f2711d);
            return c0340c0M1861w;
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: d */
        void mo1890d(C3386e c3386e) {
            this.f2711d = c3386e;
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: f */
        void mo1891f(C3386e c3386e) {
            WindowInsets windowInsets = this.f2710c;
            if (windowInsets != null) {
                this.f2710c = windowInsets.replaceSystemWindowInsets(c3386e.f11900a, c3386e.f11901b, c3386e.f11902c, c3386e.f11903d);
            }
        }

        c(C0340c0 c0340c0) {
            super(c0340c0);
            this.f2710c = c0340c0.m1883v();
        }
    }

    /* renamed from: androidx.core.view.c0$d */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f2712c;

        d() {
            this.f2712c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: b */
        C0340c0 mo1889b() {
            m1895a();
            C0340c0 c0340c0M1861w = C0340c0.m1861w(this.f2712c.build());
            c0340c0M1861w.m1879r(this.f2714b);
            return c0340c0M1861w;
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: c */
        void mo1892c(C3386e c3386e) {
            this.f2712c.setMandatorySystemGestureInsets(c3386e.m10308e());
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: d */
        void mo1890d(C3386e c3386e) {
            this.f2712c.setStableInsets(c3386e.m10308e());
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: e */
        void mo1893e(C3386e c3386e) {
            this.f2712c.setSystemGestureInsets(c3386e.m10308e());
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: f */
        void mo1891f(C3386e c3386e) {
            this.f2712c.setSystemWindowInsets(c3386e.m10308e());
        }

        @Override // androidx.core.view.C0340c0.f
        /* renamed from: g */
        void mo1894g(C3386e c3386e) {
            this.f2712c.setTappableElementInsets(c3386e.m10308e());
        }

        d(C0340c0 c0340c0) {
            WindowInsets.Builder builder;
            super(c0340c0);
            WindowInsets windowInsetsM1883v = c0340c0.m1883v();
            if (windowInsetsM1883v != null) {
                builder = new WindowInsets.Builder(windowInsetsM1883v);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2712c = builder;
        }
    }

    /* renamed from: androidx.core.view.c0$h */
    private static class h extends g {

        /* renamed from: n */
        private C3386e f2726n;

        h(C0340c0 c0340c0, WindowInsets windowInsets) {
            super(c0340c0, windowInsets);
            this.f2726n = null;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: b */
        C0340c0 mo1910b() {
            return C0340c0.m1861w(this.f2721c.consumeStableInsets());
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: c */
        C0340c0 mo1911c() {
            return C0340c0.m1861w(this.f2721c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: i */
        final C3386e mo1912i() {
            if (this.f2726n == null) {
                this.f2726n = C3386e.m10305b(this.f2721c.getStableInsetLeft(), this.f2721c.getStableInsetTop(), this.f2721c.getStableInsetRight(), this.f2721c.getStableInsetBottom());
            }
            return this.f2726n;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: n */
        boolean mo1913n() {
            return this.f2721c.isConsumed();
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: s */
        public void mo1914s(C3386e c3386e) {
            this.f2726n = c3386e;
        }

        h(C0340c0 c0340c0, h hVar) {
            super(c0340c0, hVar);
            this.f2726n = null;
            this.f2726n = hVar.f2726n;
        }
    }

    /* renamed from: androidx.core.view.c0$g */
    private static class g extends l {

        /* renamed from: h */
        private static boolean f2715h = false;

        /* renamed from: i */
        private static Method f2716i;

        /* renamed from: j */
        private static Class<?> f2717j;

        /* renamed from: k */
        private static Class<?> f2718k;

        /* renamed from: l */
        private static Field f2719l;

        /* renamed from: m */
        private static Field f2720m;

        /* renamed from: c */
        final WindowInsets f2721c;

        /* renamed from: d */
        private C3386e[] f2722d;

        /* renamed from: e */
        private C3386e f2723e;

        /* renamed from: f */
        private C0340c0 f2724f;

        /* renamed from: g */
        C3386e f2725g;

        g(C0340c0 c0340c0, WindowInsets windowInsets) {
            super(c0340c0);
            this.f2723e = null;
            this.f2721c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C3386e m1896t(int i4, boolean z3) {
            C3386e c3386eM10304a = C3386e.f11899e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    c3386eM10304a = C3386e.m10304a(c3386eM10304a, m1909u(i5, z3));
                }
            }
            return c3386eM10304a;
        }

        /* renamed from: v */
        private C3386e m1897v() {
            C0340c0 c0340c0 = this.f2724f;
            return c0340c0 != null ? c0340c0.m1870h() : C3386e.f11899e;
        }

        /* renamed from: w */
        private C3386e m1898w(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2715h) {
                m1899x();
            }
            Method method = f2716i;
            if (method != null && f2718k != null && f2719l != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2719l.get(f2720m.get(objInvoke));
                    if (rect != null) {
                        return C3386e.m10306c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e4) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m1899x() throws ClassNotFoundException {
            try {
                f2716i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f2717j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2718k = cls;
                f2719l = cls.getDeclaredField("mVisibleInsets");
                f2720m = f2717j.getDeclaredField("mAttachInfo");
                f2719l.setAccessible(true);
                f2720m.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f2715h = true;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: d */
        void mo1900d(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            C3386e c3386eM1898w = m1898w(view);
            if (c3386eM1898w == null) {
                c3386eM1898w = C3386e.f11899e;
            }
            mo1907q(c3386eM1898w);
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: e */
        void mo1901e(C0340c0 c0340c0) {
            c0340c0.m1881t(this.f2724f);
            c0340c0.m1880s(this.f2725g);
        }

        @Override // androidx.core.view.C0340c0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2725g, ((g) obj).f2725g);
            }
            return false;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: g */
        public C3386e mo1902g(int i4) {
            return m1896t(i4, false);
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: k */
        final C3386e mo1903k() {
            if (this.f2723e == null) {
                this.f2723e = C3386e.m10305b(this.f2721c.getSystemWindowInsetLeft(), this.f2721c.getSystemWindowInsetTop(), this.f2721c.getSystemWindowInsetRight(), this.f2721c.getSystemWindowInsetBottom());
            }
            return this.f2723e;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: m */
        C0340c0 mo1904m(int i4, int i5, int i6, int i7) {
            b bVar = new b(C0340c0.m1861w(this.f2721c));
            bVar.m1887c(C0340c0.m1860o(mo1903k(), i4, i5, i6, i7));
            bVar.m1886b(C0340c0.m1860o(mo1912i(), i4, i5, i6, i7));
            return bVar.m1885a();
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: o */
        boolean mo1905o() {
            return this.f2721c.isRound();
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: p */
        public void mo1906p(C3386e[] c3386eArr) {
            this.f2722d = c3386eArr;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: q */
        void mo1907q(C3386e c3386e) {
            this.f2725g = c3386e;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: r */
        void mo1908r(C0340c0 c0340c0) {
            this.f2724f = c0340c0;
        }

        /* renamed from: u */
        protected C3386e m1909u(int i4, boolean z3) {
            C3386e c3386eM1870h;
            int i5;
            if (i4 == 1) {
                return z3 ? C3386e.m10305b(0, Math.max(m1897v().f11901b, mo1903k().f11901b), 0, 0) : C3386e.m10305b(0, mo1903k().f11901b, 0, 0);
            }
            if (i4 == 2) {
                if (z3) {
                    C3386e c3386eM1897v = m1897v();
                    C3386e c3386eMo1912i = mo1912i();
                    return C3386e.m10305b(Math.max(c3386eM1897v.f11900a, c3386eMo1912i.f11900a), 0, Math.max(c3386eM1897v.f11902c, c3386eMo1912i.f11902c), Math.max(c3386eM1897v.f11903d, c3386eMo1912i.f11903d));
                }
                C3386e c3386eMo1903k = mo1903k();
                C0340c0 c0340c0 = this.f2724f;
                c3386eM1870h = c0340c0 != null ? c0340c0.m1870h() : null;
                int iMin = c3386eMo1903k.f11903d;
                if (c3386eM1870h != null) {
                    iMin = Math.min(iMin, c3386eM1870h.f11903d);
                }
                return C3386e.m10305b(c3386eMo1903k.f11900a, 0, c3386eMo1903k.f11902c, iMin);
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return mo1918j();
                }
                if (i4 == 32) {
                    return mo1917h();
                }
                if (i4 == 64) {
                    return mo1919l();
                }
                if (i4 != 128) {
                    return C3386e.f11899e;
                }
                C0340c0 c0340c02 = this.f2724f;
                C0341d c0341dM1867e = c0340c02 != null ? c0340c02.m1867e() : mo1916f();
                return c0341dM1867e != null ? C3386e.m10305b(c0341dM1867e.m1924b(), c0341dM1867e.m1926d(), c0341dM1867e.m1925c(), c0341dM1867e.m1923a()) : C3386e.f11899e;
            }
            C3386e[] c3386eArr = this.f2722d;
            c3386eM1870h = c3386eArr != null ? c3386eArr[m.m1920a(8)] : null;
            if (c3386eM1870h != null) {
                return c3386eM1870h;
            }
            C3386e c3386eMo1903k2 = mo1903k();
            C3386e c3386eM1897v2 = m1897v();
            int i6 = c3386eMo1903k2.f11903d;
            if (i6 > c3386eM1897v2.f11903d) {
                return C3386e.m10305b(0, 0, 0, i6);
            }
            C3386e c3386e = this.f2725g;
            return (c3386e == null || c3386e.equals(C3386e.f11899e) || (i5 = this.f2725g.f11903d) <= c3386eM1897v2.f11903d) ? C3386e.f11899e : C3386e.m10305b(0, 0, 0, i5);
        }

        g(C0340c0 c0340c0, g gVar) {
            this(c0340c0, new WindowInsets(gVar.f2721c));
        }
    }

    /* renamed from: androidx.core.view.c0$j */
    private static class j extends i {

        /* renamed from: o */
        private C3386e f2727o;

        /* renamed from: p */
        private C3386e f2728p;

        /* renamed from: q */
        private C3386e f2729q;

        j(C0340c0 c0340c0, WindowInsets windowInsets) {
            super(c0340c0, windowInsets);
            this.f2727o = null;
            this.f2728p = null;
            this.f2729q = null;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: h */
        C3386e mo1917h() {
            if (this.f2728p == null) {
                this.f2728p = C3386e.m10307d(this.f2721c.getMandatorySystemGestureInsets());
            }
            return this.f2728p;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: j */
        C3386e mo1918j() {
            if (this.f2727o == null) {
                this.f2727o = C3386e.m10307d(this.f2721c.getSystemGestureInsets());
            }
            return this.f2727o;
        }

        @Override // androidx.core.view.C0340c0.l
        /* renamed from: l */
        C3386e mo1919l() {
            if (this.f2729q == null) {
                this.f2729q = C3386e.m10307d(this.f2721c.getTappableElementInsets());
            }
            return this.f2729q;
        }

        @Override // androidx.core.view.C0340c0.g, androidx.core.view.C0340c0.l
        /* renamed from: m */
        C0340c0 mo1904m(int i4, int i5, int i6, int i7) {
            return C0340c0.m1861w(this.f2721c.inset(i4, i5, i6, i7));
        }

        @Override // androidx.core.view.C0340c0.h, androidx.core.view.C0340c0.l
        /* renamed from: s */
        public void mo1914s(C3386e c3386e) {
        }

        j(C0340c0 c0340c0, j jVar) {
            super(c0340c0, jVar);
            this.f2727o = null;
            this.f2728p = null;
            this.f2729q = null;
        }
    }

    /* renamed from: androidx.core.view.c0$b */
    public static final class b {

        /* renamed from: a */
        private final f f2705a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f2705a = new e();
            } else if (i4 >= 29) {
                this.f2705a = new d();
            } else {
                this.f2705a = new c();
            }
        }

        /* renamed from: a */
        public C0340c0 m1885a() {
            return this.f2705a.mo1889b();
        }

        @Deprecated
        /* renamed from: b */
        public b m1886b(C3386e c3386e) {
            this.f2705a.mo1890d(c3386e);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m1887c(C3386e c3386e) {
            this.f2705a.mo1891f(c3386e);
            return this;
        }

        public b(C0340c0 c0340c0) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f2705a = new e(c0340c0);
            } else if (i4 >= 29) {
                this.f2705a = new d(c0340c0);
            } else {
                this.f2705a = new c(c0340c0);
            }
        }
    }

    public C0340c0(C0340c0 c0340c0) {
        if (c0340c0 != null) {
            l lVar = c0340c0.f2700a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && (lVar instanceof k)) {
                this.f2700a = new k(this, (k) lVar);
            } else if (i4 >= 29 && (lVar instanceof j)) {
                this.f2700a = new j(this, (j) lVar);
            } else if (i4 >= 28 && (lVar instanceof i)) {
                this.f2700a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f2700a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f2700a = new g(this, (g) lVar);
            } else {
                this.f2700a = new l(this);
            }
            lVar.mo1901e(this);
            return;
        }
        this.f2700a = new l(this);
    }
}

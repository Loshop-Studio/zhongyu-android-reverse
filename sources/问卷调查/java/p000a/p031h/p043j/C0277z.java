package p000a.p031h.p043j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p000a.p031h.p035d.C0203b;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.j.z */
/* loaded from: classes.dex */
public class C0277z {

    /* renamed from: b */
    public static final C0277z f1638b;

    /* renamed from: a */
    public final j f1639a;

    /* renamed from: a.h.j.z$a */
    public static class a extends d {

        /* renamed from: d */
        public static Field f1640d = null;

        /* renamed from: e */
        public static boolean f1641e = false;

        /* renamed from: f */
        public static Constructor<WindowInsets> f1642f = null;

        /* renamed from: g */
        public static boolean f1643g = false;

        /* renamed from: b */
        public WindowInsets f1644b;

        /* renamed from: c */
        public C0203b f1645c;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r7 = this;
                r7.<init>()
                boolean r0 = p000a.p031h.p043j.C0277z.a.f1641e
                r1 = 1
                java.lang.String r2 = "WindowInsetsCompat"
                if (r0 != 0) goto L1d
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r3 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L15
                p000a.p031h.p043j.C0277z.a.f1640d = r0     // Catch: java.lang.ReflectiveOperationException -> L15
                goto L1b
            L15:
                r0 = move-exception
                java.lang.String r3 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r3, r0)
            L1b:
                p000a.p031h.p043j.C0277z.a.f1641e = r1
            L1d:
                java.lang.reflect.Field r0 = p000a.p031h.p043j.C0277z.a.f1640d
                r3 = 0
                if (r0 == 0) goto L37
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L31
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L31
                if (r0 == 0) goto L37
                android.view.WindowInsets r4 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L31
                r4.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L31
                r3 = r4
                goto L6e
            L31:
                r0 = move-exception
                java.lang.String r4 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r4, r0)
            L37:
                boolean r0 = p000a.p031h.p043j.C0277z.a.f1643g
                r4 = 0
                if (r0 != 0) goto L53
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L4b
                java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
                r5[r4] = r6     // Catch: java.lang.ReflectiveOperationException -> L4b
                java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L4b
                p000a.p031h.p043j.C0277z.a.f1642f = r0     // Catch: java.lang.ReflectiveOperationException -> L4b
                goto L51
            L4b:
                r0 = move-exception
                java.lang.String r5 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r5, r0)
            L51:
                p000a.p031h.p043j.C0277z.a.f1643g = r1
            L53:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = p000a.p031h.p043j.C0277z.a.f1642f
                if (r0 == 0) goto L6e
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L68
                android.graphics.Rect r5 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L68
                r5.<init>()     // Catch: java.lang.ReflectiveOperationException -> L68
                r1[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L68
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L68
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L68
                r3 = r0
                goto L6e
            L68:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r1, r0)
            L6e:
                r7.f1644b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p043j.C0277z.a.<init>():void");
        }

        public a(C0277z c0277z) {
            super(c0277z);
            this.f1644b = c0277z.m902h();
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: a */
        public C0277z mo903a() {
            C0277z c0277zM894i = C0277z.m894i(this.f1644b);
            c0277zM894i.f1639a.mo910l(null);
            c0277zM894i.f1639a.mo916n(this.f1645c);
            return c0277zM894i;
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: b */
        public void mo904b(C0203b c0203b) {
            this.f1645c = c0203b;
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: c */
        public void mo905c(C0203b c0203b) {
            WindowInsets windowInsets = this.f1644b;
            if (windowInsets != null) {
                this.f1644b = windowInsets.replaceSystemWindowInsets(c0203b.f1454a, c0203b.f1455b, c0203b.f1456c, c0203b.f1457d);
            }
        }
    }

    /* renamed from: a.h.j.z$b */
    public static class b extends d {

        /* renamed from: b */
        public final WindowInsets.Builder f1646b;

        public b() {
            this.f1646b = new WindowInsets.Builder();
        }

        public b(C0277z c0277z) {
            super(c0277z);
            WindowInsets windowInsetsM902h = c0277z.m902h();
            this.f1646b = windowInsetsM902h != null ? new WindowInsets.Builder(windowInsetsM902h) : new WindowInsets.Builder();
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: a */
        public C0277z mo903a() {
            C0277z c0277zM894i = C0277z.m894i(this.f1646b.build());
            c0277zM894i.f1639a.mo910l(null);
            return c0277zM894i;
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: b */
        public void mo904b(C0203b c0203b) {
            this.f1646b.setStableInsets(c0203b.m760c());
        }

        @Override // p000a.p031h.p043j.C0277z.d
        /* renamed from: c */
        public void mo905c(C0203b c0203b) {
            this.f1646b.setSystemWindowInsets(c0203b.m760c());
        }
    }

    /* renamed from: a.h.j.z$c */
    public static class c extends b {
        public c() {
        }

        public c(C0277z c0277z) {
            super(c0277z);
        }
    }

    /* renamed from: a.h.j.z$d */
    public static class d {

        /* renamed from: a */
        public final C0277z f1647a;

        public d() {
            this.f1647a = new C0277z((C0277z) null);
        }

        public d(C0277z c0277z) {
            this.f1647a = c0277z;
        }

        /* renamed from: a */
        public C0277z mo903a() {
            throw null;
        }

        /* renamed from: b */
        public void mo904b(C0203b c0203b) {
            throw null;
        }

        /* renamed from: c */
        public void mo905c(C0203b c0203b) {
            throw null;
        }
    }

    /* renamed from: a.h.j.z$e */
    public static class e extends j {

        /* renamed from: h */
        public static boolean f1648h = false;

        /* renamed from: i */
        public static Method f1649i;

        /* renamed from: j */
        public static Class<?> f1650j;

        /* renamed from: k */
        public static Class<?> f1651k;

        /* renamed from: l */
        public static Field f1652l;

        /* renamed from: m */
        public static Field f1653m;

        /* renamed from: c */
        public final WindowInsets f1654c;

        /* renamed from: d */
        public C0203b[] f1655d;

        /* renamed from: e */
        public C0203b f1656e;

        /* renamed from: f */
        public C0277z f1657f;

        /* renamed from: g */
        public C0203b f1658g;

        public e(C0277z c0277z, WindowInsets windowInsets) {
            super(c0277z);
            this.f1656e = null;
            this.f1654c = windowInsets;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: d */
        public void mo906d(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1648h) {
                try {
                    f1649i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    f1650j = Class.forName("android.view.ViewRootImpl");
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    f1651k = cls;
                    f1652l = cls.getDeclaredField("mVisibleInsets");
                    f1653m = f1650j.getDeclaredField("mAttachInfo");
                    f1652l.setAccessible(true);
                    f1653m.setAccessible(true);
                } catch (ReflectiveOperationException e2) {
                    StringBuilder sbM2079g = C0561a.m2079g("Failed to get visible insets. (Reflection error). ");
                    sbM2079g.append(e2.getMessage());
                    Log.e("WindowInsetsCompat", sbM2079g.toString(), e2);
                }
                f1648h = true;
            }
            Method method = f1649i;
            C0203b c0203bM758a = null;
            if (method != null && f1651k != null && f1652l != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    } else {
                        Rect rect = (Rect) f1652l.get(f1653m.get(objInvoke));
                        if (rect != null) {
                            c0203bM758a = C0203b.m758a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                    }
                } catch (ReflectiveOperationException e3) {
                    StringBuilder sbM2079g2 = C0561a.m2079g("Failed to get visible insets. (Reflection error). ");
                    sbM2079g2.append(e3.getMessage());
                    Log.e("WindowInsetsCompat", sbM2079g2.toString(), e3);
                }
            }
            if (c0203bM758a == null) {
                c0203bM758a = C0203b.f1453e;
            }
            this.f1658g = c0203bM758a;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1658g, ((e) obj).f1658g);
            }
            return false;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: h */
        public final C0203b mo907h() {
            if (this.f1656e == null) {
                this.f1656e = C0203b.m758a(this.f1654c.getSystemWindowInsetLeft(), this.f1654c.getSystemWindowInsetTop(), this.f1654c.getSystemWindowInsetRight(), this.f1654c.getSystemWindowInsetBottom());
            }
            return this.f1656e;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: i */
        public C0277z mo908i(int i, int i2, int i3, int i4) {
            C0277z c0277zM894i = C0277z.m894i(this.f1654c);
            int i5 = Build.VERSION.SDK_INT;
            d cVar = i5 >= 30 ? new c(c0277zM894i) : i5 >= 29 ? new b(c0277zM894i) : new a(c0277zM894i);
            cVar.mo905c(C0277z.m893e(mo907h(), i, i2, i3, i4));
            cVar.mo904b(C0277z.m893e(mo914g(), i, i2, i3, i4));
            return cVar.mo903a();
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: k */
        public boolean mo909k() {
            return this.f1654c.isRound();
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: l */
        public void mo910l(C0203b[] c0203bArr) {
            this.f1655d = c0203bArr;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: m */
        public void mo911m(C0277z c0277z) {
            this.f1657f = c0277z;
        }
    }

    /* renamed from: a.h.j.z$f */
    public static class f extends e {

        /* renamed from: n */
        public C0203b f1659n;

        public f(C0277z c0277z, WindowInsets windowInsets) {
            super(c0277z, windowInsets);
            this.f1659n = null;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: b */
        public C0277z mo912b() {
            return C0277z.m894i(this.f1654c.consumeStableInsets());
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: c */
        public C0277z mo913c() {
            return C0277z.m894i(this.f1654c.consumeSystemWindowInsets());
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: g */
        public final C0203b mo914g() {
            if (this.f1659n == null) {
                this.f1659n = C0203b.m758a(this.f1654c.getStableInsetLeft(), this.f1654c.getStableInsetTop(), this.f1654c.getStableInsetRight(), this.f1654c.getStableInsetBottom());
            }
            return this.f1659n;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: j */
        public boolean mo915j() {
            return this.f1654c.isConsumed();
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: n */
        public void mo916n(C0203b c0203b) {
            this.f1659n = c0203b;
        }
    }

    /* renamed from: a.h.j.z$g */
    public static class g extends f {
        public g(C0277z c0277z, WindowInsets windowInsets) {
            super(c0277z, windowInsets);
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: a */
        public C0277z mo917a() {
            return C0277z.m894i(this.f1654c.consumeDisplayCutout());
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: e */
        public C0255d mo918e() {
            DisplayCutout displayCutout = this.f1654c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0255d(displayCutout);
        }

        @Override // p000a.p031h.p043j.C0277z.e, p000a.p031h.p043j.C0277z.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f1654c, gVar.f1654c) && Objects.equals(this.f1658g, gVar.f1658g);
        }

        @Override // p000a.p031h.p043j.C0277z.j
        public int hashCode() {
            return this.f1654c.hashCode();
        }
    }

    /* renamed from: a.h.j.z$h */
    public static class h extends g {

        /* renamed from: o */
        public C0203b f1660o;

        /* renamed from: p */
        public C0203b f1661p;

        /* renamed from: q */
        public C0203b f1662q;

        public h(C0277z c0277z, WindowInsets windowInsets) {
            super(c0277z, windowInsets);
            this.f1660o = null;
            this.f1661p = null;
            this.f1662q = null;
        }

        @Override // p000a.p031h.p043j.C0277z.j
        /* renamed from: f */
        public C0203b mo919f() {
            if (this.f1661p == null) {
                this.f1661p = C0203b.m759b(this.f1654c.getMandatorySystemGestureInsets());
            }
            return this.f1661p;
        }

        @Override // p000a.p031h.p043j.C0277z.e, p000a.p031h.p043j.C0277z.j
        /* renamed from: i */
        public C0277z mo908i(int i, int i2, int i3, int i4) {
            return C0277z.m894i(this.f1654c.inset(i, i2, i3, i4));
        }

        @Override // p000a.p031h.p043j.C0277z.f, p000a.p031h.p043j.C0277z.j
        /* renamed from: n */
        public void mo916n(C0203b c0203b) {
        }
    }

    /* renamed from: a.h.j.z$i */
    public static class i extends h {

        /* renamed from: r */
        public static final C0277z f1663r = C0277z.m894i(WindowInsets.CONSUMED);

        public i(C0277z c0277z, WindowInsets windowInsets) {
            super(c0277z, windowInsets);
        }

        @Override // p000a.p031h.p043j.C0277z.e, p000a.p031h.p043j.C0277z.j
        /* renamed from: d */
        public final void mo906d(View view) {
        }
    }

    /* renamed from: a.h.j.z$j */
    public static class j {

        /* renamed from: b */
        public static final C0277z f1664b;

        /* renamed from: a */
        public final C0277z f1665a;

        static {
            int i = Build.VERSION.SDK_INT;
            f1664b = (i >= 30 ? new c() : i >= 29 ? new b() : new a()).mo903a().f1639a.mo917a().f1639a.mo912b().f1639a.mo913c();
        }

        public j(C0277z c0277z) {
            this.f1665a = c0277z;
        }

        /* renamed from: a */
        public C0277z mo917a() {
            return this.f1665a;
        }

        /* renamed from: b */
        public C0277z mo912b() {
            return this.f1665a;
        }

        /* renamed from: c */
        public C0277z mo913c() {
            return this.f1665a;
        }

        /* renamed from: d */
        public void mo906d(View view) {
        }

        /* renamed from: e */
        public C0255d mo918e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return mo909k() == jVar.mo909k() && mo915j() == jVar.mo915j() && Objects.equals(mo907h(), jVar.mo907h()) && Objects.equals(mo914g(), jVar.mo914g()) && Objects.equals(mo918e(), jVar.mo918e());
        }

        /* renamed from: f */
        public C0203b mo919f() {
            return mo907h();
        }

        /* renamed from: g */
        public C0203b mo914g() {
            return C0203b.f1453e;
        }

        /* renamed from: h */
        public C0203b mo907h() {
            return C0203b.f1453e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(mo909k()), Boolean.valueOf(mo915j()), mo907h(), mo914g(), mo918e());
        }

        /* renamed from: i */
        public C0277z mo908i(int i, int i2, int i3, int i4) {
            return f1664b;
        }

        /* renamed from: j */
        public boolean mo915j() {
            return false;
        }

        /* renamed from: k */
        public boolean mo909k() {
            return false;
        }

        /* renamed from: l */
        public void mo910l(C0203b[] c0203bArr) {
        }

        /* renamed from: m */
        public void mo911m(C0277z c0277z) {
        }

        /* renamed from: n */
        public void mo916n(C0203b c0203b) {
        }
    }

    static {
        f1638b = Build.VERSION.SDK_INT >= 30 ? i.f1663r : j.f1664b;
    }

    public C0277z(C0277z c0277z) {
        this.f1639a = new j(this);
    }

    public C0277z(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f1639a = i2 >= 30 ? new i(this, windowInsets) : i2 >= 29 ? new h(this, windowInsets) : i2 >= 28 ? new g(this, windowInsets) : new f(this, windowInsets);
    }

    /* renamed from: e */
    public static C0203b m893e(C0203b c0203b, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0203b.f1454a - i2);
        int iMax2 = Math.max(0, c0203b.f1455b - i3);
        int iMax3 = Math.max(0, c0203b.f1456c - i4);
        int iMax4 = Math.max(0, c0203b.f1457d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0203b : C0203b.m758a(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: i */
    public static C0277z m894i(WindowInsets windowInsets) {
        return m895j(windowInsets, null);
    }

    /* renamed from: j */
    public static C0277z m895j(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        C0277z c0277z = new C0277z(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c0277z.f1639a.mo911m(C0266o.m868g(view));
            c0277z.f1639a.mo906d(view.getRootView());
        }
        return c0277z;
    }

    @Deprecated
    /* renamed from: a */
    public int m896a() {
        return this.f1639a.mo907h().f1457d;
    }

    @Deprecated
    /* renamed from: b */
    public int m897b() {
        return this.f1639a.mo907h().f1454a;
    }

    @Deprecated
    /* renamed from: c */
    public int m898c() {
        return this.f1639a.mo907h().f1456c;
    }

    @Deprecated
    /* renamed from: d */
    public int m899d() {
        return this.f1639a.mo907h().f1455b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0277z) {
            return Objects.equals(this.f1639a, ((C0277z) obj).f1639a);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m900f() {
        return this.f1639a.mo915j();
    }

    @Deprecated
    /* renamed from: g */
    public C0277z m901g(int i2, int i3, int i4, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        d cVar = i6 >= 30 ? new c(this) : i6 >= 29 ? new b(this) : new a(this);
        cVar.mo905c(C0203b.m758a(i2, i3, i4, i5));
        return cVar.mo903a();
    }

    /* renamed from: h */
    public WindowInsets m902h() {
        j jVar = this.f1639a;
        if (jVar instanceof e) {
            return ((e) jVar).f1654c;
        }
        return null;
    }

    public int hashCode() {
        j jVar = this.f1639a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}

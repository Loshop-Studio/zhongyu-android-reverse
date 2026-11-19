package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C2898a;
import com.bumptech.glide.request.C2899b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p016c0.AbstractC2750a;
import p016c0.C2753d;
import p016c0.InterfaceC2751b;
import p016c0.InterfaceC2752c;
import p047d0.InterfaceC3698h;
import p062g0.AbstractC3744d;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p093m.AbstractC4354c;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes2.dex */
public class C2861f extends AbstractC2750a {

    /* renamed from: O */
    public static final C2753d f604O = (C2753d) ((C2753d) ((C2753d) new C2753d().m1592h(AbstractC4354c.f4867c)).m1576X(Priority.LOW)).m1587e0(true);

    /* renamed from: A */
    public final Context f605A;

    /* renamed from: B */
    public final ComponentCallbacks2C2862g f606B;

    /* renamed from: C */
    public final Class f607C;

    /* renamed from: D */
    public final ComponentCallbacks2C2858c f608D;

    /* renamed from: E */
    public final C2860e f609E;

    /* renamed from: F */
    public AbstractC2863h f610F;

    /* renamed from: G */
    public Object f611G;

    /* renamed from: H */
    public List f612H;

    /* renamed from: I */
    public C2861f f613I;

    /* renamed from: J */
    public C2861f f614J;

    /* renamed from: K */
    public Float f615K;

    /* renamed from: L */
    public boolean f616L = true;

    /* renamed from: M */
    public boolean f617M;

    /* renamed from: N */
    public boolean f618N;

    /* renamed from: com.bumptech.glide.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f619a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f620b;

        static {
            int[] iArr = new int[Priority.values().length];
            f620b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f620b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f620b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f620b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f619a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f619a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f619a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f619a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f619a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f619a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f619a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f619a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2861f(ComponentCallbacks2C2858c componentCallbacks2C2858c, ComponentCallbacks2C2862g componentCallbacks2C2862g, Class cls, Context context) {
        this.f608D = componentCallbacks2C2858c;
        this.f606B = componentCallbacks2C2862g;
        this.f607C = cls;
        this.f605A = context;
        this.f610F = componentCallbacks2C2862g.m1740q(cls);
        this.f609E = componentCallbacks2C2858c.m1694i();
        m1722r0(componentCallbacks2C2862g.m1738o());
        mo1579a(componentCallbacks2C2862g.m1739p());
    }

    /* renamed from: A0 */
    public final C2861f m1712A0(Object obj) {
        this.f611G = obj;
        this.f617M = true;
        return this;
    }

    /* renamed from: B0 */
    public final InterfaceC2751b m1713B0(Object obj, InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, AbstractC2750a abstractC2750a, RequestCoordinator requestCoordinator, AbstractC2863h abstractC2863h, Priority priority, int i4, int i5, Executor executor) {
        Context context = this.f605A;
        C2860e c2860e = this.f609E;
        return SingleRequest.m2028x(context, c2860e, obj, this.f611G, this.f607C, abstractC2750a, i4, i5, priority, interfaceC3698h, interfaceC2752c, this.f612H, requestCoordinator, c2860e.m1708f(), abstractC2863h.m1752c(), executor);
    }

    /* renamed from: C0 */
    public C2861f m1714C0(float f4) {
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f615K = Float.valueOf(f4);
        return this;
    }

    /* renamed from: k0 */
    public C2861f m1715k0(InterfaceC2752c interfaceC2752c) {
        if (interfaceC2752c != null) {
            if (this.f612H == null) {
                this.f612H = new ArrayList();
            }
            this.f612H.add(interfaceC2752c);
        }
        return this;
    }

    @Override // p016c0.AbstractC2750a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C2861f mo1579a(AbstractC2750a abstractC2750a) {
        AbstractC3749i.m4768d(abstractC2750a);
        return (C2861f) super.mo1579a(abstractC2750a);
    }

    /* renamed from: m0 */
    public final InterfaceC2751b m1717m0(InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, AbstractC2750a abstractC2750a, Executor executor) {
        return m1718n0(new Object(), interfaceC3698h, interfaceC2752c, null, this.f610F, abstractC2750a.m1609v(), abstractC2750a.m1606s(), abstractC2750a.m1605r(), abstractC2750a, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n0 */
    public final InterfaceC2751b m1718n0(Object obj, InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, RequestCoordinator requestCoordinator, AbstractC2863h abstractC2863h, Priority priority, int i4, int i5, AbstractC2750a abstractC2750a, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator c2898a;
        if (this.f614J != null) {
            c2898a = new C2898a(obj, requestCoordinator);
            requestCoordinator2 = c2898a;
        } else {
            requestCoordinator2 = null;
            c2898a = requestCoordinator;
        }
        InterfaceC2751b interfaceC2751bM1719o0 = m1719o0(obj, interfaceC3698h, interfaceC2752c, c2898a, abstractC2863h, priority, i4, i5, abstractC2750a, executor);
        if (requestCoordinator2 == null) {
            return interfaceC2751bM1719o0;
        }
        int iM1606s = this.f614J.m1606s();
        int iM1605r = this.f614J.m1605r();
        if (AbstractC3750j.m4787r(i4, i5) && !this.f614J.m1567L()) {
            iM1606s = abstractC2750a.m1606s();
            iM1605r = abstractC2750a.m1605r();
        }
        C2861f c2861f = this.f614J;
        C2898a c2898a2 = requestCoordinator2;
        c2898a2.m2050o(interfaceC2751bM1719o0, c2861f.m1718n0(obj, interfaceC3698h, interfaceC2752c, c2898a2, c2861f.f610F, c2861f.m1609v(), iM1606s, iM1605r, this.f614J, executor));
        return c2898a2;
    }

    /* renamed from: o0 */
    public final InterfaceC2751b m1719o0(Object obj, InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, RequestCoordinator requestCoordinator, AbstractC2863h abstractC2863h, Priority priority, int i4, int i5, AbstractC2750a abstractC2750a, Executor executor) {
        C2861f c2861f = this.f613I;
        if (c2861f == null) {
            if (this.f615K == null) {
                return m1713B0(obj, interfaceC3698h, interfaceC2752c, abstractC2750a, requestCoordinator, abstractC2863h, priority, i4, i5, executor);
            }
            C2899b c2899b = new C2899b(obj, requestCoordinator);
            c2899b.m2054n(m1713B0(obj, interfaceC3698h, interfaceC2752c, abstractC2750a, c2899b, abstractC2863h, priority, i4, i5, executor), m1713B0(obj, interfaceC3698h, interfaceC2752c, abstractC2750a.mo1588f().m1585d0(this.f615K.floatValue()), c2899b, abstractC2863h, m1721q0(priority), i4, i5, executor));
            return c2899b;
        }
        if (this.f618N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC2863h abstractC2863h2 = c2861f.f616L ? abstractC2863h : c2861f.f610F;
        Priority priorityM1609v = c2861f.m1561E() ? this.f613I.m1609v() : m1721q0(priority);
        int iM1606s = this.f613I.m1606s();
        int iM1605r = this.f613I.m1605r();
        if (AbstractC3750j.m4787r(i4, i5) && !this.f613I.m1567L()) {
            iM1606s = abstractC2750a.m1606s();
            iM1605r = abstractC2750a.m1605r();
        }
        C2899b c2899b2 = new C2899b(obj, requestCoordinator);
        InterfaceC2751b interfaceC2751bM1713B0 = m1713B0(obj, interfaceC3698h, interfaceC2752c, abstractC2750a, c2899b2, abstractC2863h, priority, i4, i5, executor);
        this.f618N = true;
        C2861f c2861f2 = this.f613I;
        InterfaceC2751b interfaceC2751bM1718n0 = c2861f2.m1718n0(obj, interfaceC3698h, interfaceC2752c, c2899b2, abstractC2863h2, priorityM1609v, iM1606s, iM1605r, c2861f2, executor);
        this.f618N = false;
        c2899b2.m2054n(interfaceC2751bM1713B0, interfaceC2751bM1718n0);
        return c2899b2;
    }

    @Override // p016c0.AbstractC2750a
    /* renamed from: p0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2861f mo1588f() {
        C2861f c2861f = (C2861f) super.mo1588f();
        c2861f.f610F = c2861f.f610F.clone();
        return c2861f;
    }

    /* renamed from: q0 */
    public final Priority m1721q0(Priority priority) {
        int i4 = a.f620b[priority.ordinal()];
        if (i4 == 1) {
            return Priority.NORMAL;
        }
        if (i4 == 2) {
            return Priority.HIGH;
        }
        if (i4 == 3 || i4 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m1609v());
    }

    /* renamed from: r0 */
    public final void m1722r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m1715k0((InterfaceC2752c) it.next());
        }
    }

    /* renamed from: s0 */
    public InterfaceC3698h m1723s0(InterfaceC3698h interfaceC3698h) {
        return m1725u0(interfaceC3698h, null, AbstractC3744d.m4750b());
    }

    /* renamed from: t0 */
    public final InterfaceC3698h m1724t0(InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, AbstractC2750a abstractC2750a, Executor executor) {
        AbstractC3749i.m4768d(interfaceC3698h);
        if (!this.f617M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2751b interfaceC2751bM1717m0 = m1717m0(interfaceC3698h, interfaceC2752c, abstractC2750a, executor);
        InterfaceC2751b interfaceC2751bMo4675h = interfaceC3698h.mo4675h();
        if (interfaceC2751bM1717m0.mo1615d(interfaceC2751bMo4675h) && !m1727w0(abstractC2750a, interfaceC2751bMo4675h)) {
            if (!((InterfaceC2751b) AbstractC3749i.m4768d(interfaceC2751bMo4675h)).isRunning()) {
                interfaceC2751bMo4675h.mo1617h();
            }
            return interfaceC3698h;
        }
        this.f606B.m1737n(interfaceC3698h);
        interfaceC3698h.mo4673d(interfaceC2751bM1717m0);
        this.f606B.m1748y(interfaceC3698h, interfaceC2751bM1717m0);
        return interfaceC3698h;
    }

    /* renamed from: u0 */
    public InterfaceC3698h m1725u0(InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, Executor executor) {
        return m1724t0(interfaceC3698h, interfaceC2752c, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p047d0.AbstractC3699i m1726v0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p062g0.AbstractC3750j.m4770a()
            p062g0.AbstractC3749i.m4768d(r4)
            boolean r0 = r3.m1566K()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m1564I()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C2861f.a.f619a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            c0.a r0 = r3.mo1588f()
            c0.a r0 = r0.m1570O()
            goto L4d
        L31:
            c0.a r0 = r3.mo1588f()
            c0.a r0 = r0.m1571P()
            goto L4d
        L3a:
            c0.a r0 = r3.mo1588f()
            c0.a r0 = r0.m1570O()
            goto L4d
        L43:
            c0.a r0 = r3.mo1588f()
            c0.a r0 = r0.m1569N()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.e r1 = r3.f609E
            java.lang.Class r2 = r3.f607C
            d0.i r4 = r1.m1703a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p062g0.AbstractC3744d.m4750b()
            d0.h r4 = r3.m1724t0(r4, r1, r0, r2)
            d0.i r4 = (p047d0.AbstractC3699i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2861f.m1726v0(android.widget.ImageView):d0.i");
    }

    /* renamed from: w0 */
    public final boolean m1727w0(AbstractC2750a abstractC2750a, InterfaceC2751b interfaceC2751b) {
        return !abstractC2750a.m1560D() && interfaceC2751b.mo1618j();
    }

    /* renamed from: x0 */
    public C2861f m1728x0(InterfaceC2752c interfaceC2752c) {
        this.f612H = null;
        return m1715k0(interfaceC2752c);
    }

    /* renamed from: y0 */
    public C2861f m1729y0(Object obj) {
        return m1712A0(obj);
    }

    /* renamed from: z0 */
    public C2861f m1730z0(String str) {
        return m1712A0(str);
    }
}

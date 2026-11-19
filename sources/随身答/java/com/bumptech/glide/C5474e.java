package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C5511a;
import com.bumptech.glide.request.C5512b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p002a1.AbstractC0009a;
import p002a1.C0012d;
import p002a1.InterfaceC0010b;
import p002a1.InterfaceC0011c;
import p019b1.InterfaceC5097h;
import p091e1.AbstractC7832d;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p152k0.AbstractC8252c;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C5474e extends AbstractC0009a implements Cloneable {

    /* renamed from: O */
    public static final C0012d f3258O = (C0012d) ((C0012d) ((C0012d) new C0012d().m53i(AbstractC8252c.f14325c)).m35W(Priority.LOW)).m44d0(true);

    /* renamed from: A */
    public final Context f3259A;

    /* renamed from: B */
    public final ComponentCallbacks2C5475f f3260B;

    /* renamed from: C */
    public final Class f3261C;

    /* renamed from: D */
    public final ComponentCallbacks2C5471b f3262D;

    /* renamed from: E */
    public final C5473d f3263E;

    /* renamed from: F */
    public AbstractC5476g f3264F;

    /* renamed from: G */
    public Object f3265G;

    /* renamed from: H */
    public List f3266H;

    /* renamed from: I */
    public C5474e f3267I;

    /* renamed from: J */
    public C5474e f3268J;

    /* renamed from: K */
    public Float f3269K;

    /* renamed from: L */
    public boolean f3270L = true;

    /* renamed from: M */
    public boolean f3271M;

    /* renamed from: N */
    public boolean f3272N;

    /* renamed from: com.bumptech.glide.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3273a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3274b;

        static {
            int[] iArr = new int[Priority.values().length];
            f3274b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3274b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3274b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3274b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f3273a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3273a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3273a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3273a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3273a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3273a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3273a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3273a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5474e(ComponentCallbacks2C5471b componentCallbacks2C5471b, ComponentCallbacks2C5475f componentCallbacks2C5475f, Class cls, Context context) {
        this.f3262D = componentCallbacks2C5471b;
        this.f3260B = componentCallbacks2C5475f;
        this.f3261C = cls;
        this.f3259A = context;
        this.f3264F = componentCallbacks2C5475f.m3064p(cls);
        this.f3263E = componentCallbacks2C5471b.m3020i();
        m3047q0(componentCallbacks2C5475f.m3062n());
        mo40b(componentCallbacks2C5475f.m3063o());
    }

    /* renamed from: A0 */
    public final InterfaceC0010b m3038A0(Object obj, InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, AbstractC0009a abstractC0009a, RequestCoordinator requestCoordinator, AbstractC5476g abstractC5476g, Priority priority, int i9, int i10, Executor executor) {
        Context context = this.f3259A;
        C5473d c5473d = this.f3263E;
        return SingleRequest.m3350w(context, c5473d, obj, this.f3265G, this.f3261C, abstractC0009a, i9, i10, priority, interfaceC5097h, interfaceC0011c, this.f3266H, requestCoordinator, c5473d.m3034f(), abstractC5476g.m3077d(), executor);
    }

    /* renamed from: B0 */
    public C5474e m3039B0(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3269K = Float.valueOf(f10);
        return this;
    }

    /* renamed from: j0 */
    public C5474e m3040j0(InterfaceC0011c interfaceC0011c) {
        if (interfaceC0011c != null) {
            if (this.f3266H == null) {
                this.f3266H = new ArrayList();
            }
            this.f3266H.add(interfaceC0011c);
        }
        return this;
    }

    @Override // p002a1.AbstractC0009a
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C5474e mo40b(AbstractC0009a abstractC0009a) {
        AbstractC7837i.m12256d(abstractC0009a);
        return (C5474e) super.mo40b(abstractC0009a);
    }

    /* renamed from: l0 */
    public final InterfaceC0010b m3042l0(InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, AbstractC0009a abstractC0009a, Executor executor) {
        return m3043m0(new Object(), interfaceC5097h, interfaceC0011c, null, this.f3264F, abstractC0009a.m68x(), abstractC0009a.m65u(), abstractC0009a.m64t(), abstractC0009a, executor);
    }

    /* renamed from: m0 */
    public final InterfaceC0010b m3043m0(Object obj, InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, RequestCoordinator requestCoordinator, AbstractC5476g abstractC5476g, Priority priority, int i9, int i10, AbstractC0009a abstractC0009a, Executor executor) {
        C5511a c5511a;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        InterfaceC5097h interfaceC5097h2;
        InterfaceC0011c interfaceC0011c2;
        AbstractC5476g abstractC5476g2;
        Priority priority2;
        int i11;
        int i12;
        AbstractC0009a abstractC0009a2;
        Executor executor2;
        C5474e c5474e;
        if (this.f3268J != null) {
            c5511a = new C5511a(obj, requestCoordinator);
            requestCoordinator2 = c5511a;
            c5474e = this;
            obj2 = obj;
            interfaceC5097h2 = interfaceC5097h;
            interfaceC0011c2 = interfaceC0011c;
            abstractC5476g2 = abstractC5476g;
            priority2 = priority;
            i11 = i9;
            i12 = i10;
            abstractC0009a2 = abstractC0009a;
            executor2 = executor;
        } else {
            c5511a = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            interfaceC5097h2 = interfaceC5097h;
            interfaceC0011c2 = interfaceC0011c;
            abstractC5476g2 = abstractC5476g;
            priority2 = priority;
            i11 = i9;
            i12 = i10;
            abstractC0009a2 = abstractC0009a;
            executor2 = executor;
            c5474e = this;
        }
        InterfaceC0010b interfaceC0010bM3044n0 = c5474e.m3044n0(obj2, interfaceC5097h2, interfaceC0011c2, requestCoordinator2, abstractC5476g2, priority2, i11, i12, abstractC0009a2, executor2);
        if (c5511a == null) {
            return interfaceC0010bM3044n0;
        }
        int iM65u = this.f3268J.m65u();
        int iM64t = this.f3268J.m64t();
        if (AbstractC7838j.m12275r(i9, i10) && !this.f3268J.m26N()) {
            iM65u = abstractC0009a.m65u();
            iM64t = abstractC0009a.m64t();
        }
        C5474e c5474e2 = this.f3268J;
        C5511a c5511a2 = c5511a;
        c5511a2.m3371n(interfaceC0010bM3044n0, c5474e2.m3043m0(obj, interfaceC5097h, interfaceC0011c, c5511a2, c5474e2.f3264F, c5474e2.m68x(), iM65u, iM64t, this.f3268J, executor));
        return c5511a2;
    }

    /* renamed from: n0 */
    public final InterfaceC0010b m3044n0(Object obj, InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, RequestCoordinator requestCoordinator, AbstractC5476g abstractC5476g, Priority priority, int i9, int i10, AbstractC0009a abstractC0009a, Executor executor) {
        C5474e c5474e = this.f3267I;
        if (c5474e == null) {
            if (this.f3269K == null) {
                return m3038A0(obj, interfaceC5097h, interfaceC0011c, abstractC0009a, requestCoordinator, abstractC5476g, priority, i9, i10, executor);
            }
            C5512b c5512b = new C5512b(obj, requestCoordinator);
            c5512b.m3375m(m3038A0(obj, interfaceC5097h, interfaceC0011c, abstractC0009a, c5512b, abstractC5476g, priority, i9, i10, executor), m3038A0(obj, interfaceC5097h, interfaceC0011c, abstractC0009a.mo49g().m42c0(this.f3269K.floatValue()), c5512b, abstractC5476g, m3046p0(priority), i9, i10, executor));
            return c5512b;
        }
        if (this.f3272N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5476g abstractC5476g2 = c5474e.f3270L ? abstractC5476g : c5474e.f3264F;
        Priority priorityM68x = c5474e.m20G() ? this.f3267I.m68x() : m3046p0(priority);
        int iM65u = this.f3267I.m65u();
        int iM64t = this.f3267I.m64t();
        if (AbstractC7838j.m12275r(i9, i10) && !this.f3267I.m26N()) {
            iM65u = abstractC0009a.m65u();
            iM64t = abstractC0009a.m64t();
        }
        C5512b c5512b2 = new C5512b(obj, requestCoordinator);
        InterfaceC0010b interfaceC0010bM3038A0 = m3038A0(obj, interfaceC5097h, interfaceC0011c, abstractC0009a, c5512b2, abstractC5476g, priority, i9, i10, executor);
        this.f3272N = true;
        C5474e c5474e2 = this.f3267I;
        InterfaceC0010b interfaceC0010bM3043m0 = c5474e2.m3043m0(obj, interfaceC5097h, interfaceC0011c, c5512b2, abstractC5476g2, priorityM68x, iM65u, iM64t, c5474e2, executor);
        this.f3272N = false;
        c5512b2.m3375m(interfaceC0010bM3038A0, interfaceC0010bM3043m0);
        return c5512b2;
    }

    @Override // p002a1.AbstractC0009a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5474e mo49g() {
        C5474e c5474e = (C5474e) super.mo49g();
        c5474e.f3264F = c5474e.f3264F.clone();
        return c5474e;
    }

    /* renamed from: p0 */
    public final Priority m3046p0(Priority priority) {
        int i9 = a.f3274b[priority.ordinal()];
        if (i9 == 1) {
            return Priority.NORMAL;
        }
        if (i9 == 2) {
            return Priority.HIGH;
        }
        if (i9 == 3 || i9 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m68x());
    }

    /* renamed from: q0 */
    public final void m3047q0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m3040j0((InterfaceC0011c) it.next());
        }
    }

    /* renamed from: r0 */
    public InterfaceC5097h m3048r0(InterfaceC5097h interfaceC5097h) {
        return m3050t0(interfaceC5097h, null, AbstractC7832d.m12238b());
    }

    /* renamed from: s0 */
    public final InterfaceC5097h m3049s0(InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, AbstractC0009a abstractC0009a, Executor executor) {
        AbstractC7837i.m12256d(interfaceC5097h);
        if (!this.f3271M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC0010b interfaceC0010bM3042l0 = m3042l0(interfaceC5097h, interfaceC0011c, abstractC0009a, executor);
        InterfaceC0010b interfaceC0010bMo2137a = interfaceC5097h.mo2137a();
        if (interfaceC0010bM3042l0.mo73g(interfaceC0010bMo2137a) && !m3052v0(abstractC0009a, interfaceC0010bMo2137a)) {
            if (!((InterfaceC0010b) AbstractC7837i.m12256d(interfaceC0010bMo2137a)).isRunning()) {
                interfaceC0010bMo2137a.mo74i();
            }
            return interfaceC5097h;
        }
        this.f3260B.m3061m(interfaceC5097h);
        interfaceC5097h.mo2138d(interfaceC0010bM3042l0);
        this.f3260B.m3072x(interfaceC5097h, interfaceC0010bM3042l0);
        return interfaceC5097h;
    }

    /* renamed from: t0 */
    public InterfaceC5097h m3050t0(InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, Executor executor) {
        return m3049s0(interfaceC5097h, interfaceC0011c, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p019b1.AbstractC5098i m3051u0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p091e1.AbstractC7838j.m12258a()
            p091e1.AbstractC7837i.m12256d(r4)
            boolean r0 = r3.m25M()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m23K()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C5474e.a.f3273a
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
            a1.a r0 = r3.mo49g()
            a1.a r0 = r0.m29Q()
            goto L4d
        L31:
            a1.a r0 = r3.mo49g()
            a1.a r0 = r0.m30R()
            goto L4d
        L3a:
            a1.a r0 = r3.mo49g()
            a1.a r0 = r0.m29Q()
            goto L4d
        L43:
            a1.a r0 = r3.mo49g()
            a1.a r0 = r0.m28P()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f3263E
            java.lang.Class r2 = r3.f3261C
            b1.i r4 = r1.m3029a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p091e1.AbstractC7832d.m12238b()
            b1.h r4 = r3.m3049s0(r4, r1, r0, r2)
            b1.i r4 = (p019b1.AbstractC5098i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5474e.m3051u0(android.widget.ImageView):b1.i");
    }

    /* renamed from: v0 */
    public final boolean m3052v0(AbstractC0009a abstractC0009a, InterfaceC0010b interfaceC0010b) {
        return !abstractC0009a.m19F() && interfaceC0010b.isComplete();
    }

    /* renamed from: w0 */
    public C5474e m3053w0(InterfaceC0011c interfaceC0011c) {
        this.f3266H = null;
        return m3040j0(interfaceC0011c);
    }

    /* renamed from: x0 */
    public C5474e m3054x0(Object obj) {
        return m3056z0(obj);
    }

    /* renamed from: y0 */
    public C5474e m3055y0(String str) {
        return m3056z0(str);
    }

    /* renamed from: z0 */
    public final C5474e m3056z0(Object obj) {
        this.f3265G = obj;
        this.f3271M = true;
        return this;
    }
}

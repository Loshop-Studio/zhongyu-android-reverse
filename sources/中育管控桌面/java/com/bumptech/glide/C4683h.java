package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C4742a;
import com.bumptech.glide.request.C4743b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p016b1.AbstractC4402d;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p067h0.AbstractC6433c;
import p181x0.AbstractC7823a;
import p181x0.C7826d;
import p181x0.InterfaceC7824b;
import p181x0.InterfaceC7825c;
import p188y0.InterfaceC7894h;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes3.dex */
public class C4683h extends AbstractC7823a implements Cloneable {

    /* renamed from: O */
    public static final C7826d f2218O = (C7826d) ((C7826d) ((C7826d) new C7826d().mo7356j(AbstractC6433c.f8114c)).mo7347Y(Priority.LOW)).mo7353f0(true);

    /* renamed from: A */
    public final Context f2219A;

    /* renamed from: B */
    public final ComponentCallbacks2C4684i f2220B;

    /* renamed from: C */
    public final Class f2221C;

    /* renamed from: D */
    public final ComponentCallbacks2C4678c f2222D;

    /* renamed from: E */
    public final C4680e f2223E;

    /* renamed from: F */
    public AbstractC4685j f2224F;

    /* renamed from: G */
    public Object f2225G;

    /* renamed from: H */
    public List f2226H;

    /* renamed from: I */
    public C4683h f2227I;

    /* renamed from: J */
    public C4683h f2228J;

    /* renamed from: K */
    public Float f2229K;

    /* renamed from: L */
    public boolean f2230L = true;

    /* renamed from: M */
    public boolean f2231M;

    /* renamed from: N */
    public boolean f2232N;

    /* renamed from: com.bumptech.glide.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2233a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2234b;

        static {
            int[] iArr = new int[Priority.values().length];
            f2234b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2234b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2234b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2234b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f2233a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2233a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2233a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2233a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2233a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2233a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2233a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2233a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C4683h(ComponentCallbacks2C4678c componentCallbacks2C4678c, ComponentCallbacks2C4684i componentCallbacks2C4684i, Class cls, Context context) {
        this.f2222D = componentCallbacks2C4678c;
        this.f2220B = componentCallbacks2C4684i;
        this.f2221C = cls;
        this.f2219A = context;
        this.f2224F = componentCallbacks2C4684i.m2542r(cls);
        this.f2223E = componentCallbacks2C4678c.m2484i();
        m2523s0(componentCallbacks2C4684i.m2540p());
        mo2514b(componentCallbacks2C4684i.m2541q());
    }

    /* renamed from: A0 */
    public C4683h mo2510A0(String str) {
        return m2511B0(str);
    }

    /* renamed from: B0 */
    public final C4683h m2511B0(Object obj) {
        if (m9418F()) {
            return clone().m2511B0(obj);
        }
        this.f2225G = obj;
        this.f2231M = true;
        return (C4683h) m9432b0();
    }

    /* renamed from: C0 */
    public final InterfaceC7824b m2512C0(Object obj, InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, AbstractC7823a abstractC7823a, RequestCoordinator requestCoordinator, AbstractC4685j abstractC4685j, Priority priority, int i6, int i7, Executor executor) {
        Context context = this.f2219A;
        C4680e c4680e = this.f2223E;
        return SingleRequest.m2895x(context, c4680e, obj, this.f2225G, this.f2221C, abstractC7823a, i6, i7, priority, interfaceC7894h, interfaceC7825c, this.f2226H, requestCoordinator, c4680e.m2498f(), abstractC4685j.m2553d(), executor);
    }

    /* renamed from: D0 */
    public C4683h mo2513D0(float f6) {
        if (m9418F()) {
            return clone().mo2513D0(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f2229K = Float.valueOf(f6);
        return (C4683h) m9432b0();
    }

    @Override // p181x0.AbstractC7823a
    public boolean equals(Object obj) {
        if (obj instanceof C4683h) {
            C4683h c4683h = (C4683h) obj;
            if (super.equals(c4683h) && Objects.equals(this.f2221C, c4683h.f2221C) && this.f2224F.equals(c4683h.f2224F) && Objects.equals(this.f2225G, c4683h.f2225G) && Objects.equals(this.f2226H, c4683h.f2226H) && Objects.equals(this.f2227I, c4683h.f2227I) && Objects.equals(this.f2228J, c4683h.f2228J) && Objects.equals(this.f2229K, c4683h.f2229K) && this.f2230L == c4683h.f2230L && this.f2231M == c4683h.f2231M) {
                return true;
            }
        }
        return false;
    }

    @Override // p181x0.AbstractC7823a
    public int hashCode() {
        return AbstractC4409k.m1455p(this.f2231M, AbstractC4409k.m1455p(this.f2230L, AbstractC4409k.m1454o(this.f2229K, AbstractC4409k.m1454o(this.f2228J, AbstractC4409k.m1454o(this.f2227I, AbstractC4409k.m1454o(this.f2226H, AbstractC4409k.m1454o(this.f2225G, AbstractC4409k.m1454o(this.f2224F, AbstractC4409k.m1454o(this.f2221C, super.hashCode())))))))));
    }

    /* renamed from: l0 */
    public C4683h mo2516l0(InterfaceC7825c interfaceC7825c) {
        if (m9418F()) {
            return clone().mo2516l0(interfaceC7825c);
        }
        if (interfaceC7825c != null) {
            if (this.f2226H == null) {
                this.f2226H = new ArrayList();
            }
            this.f2226H.add(interfaceC7825c);
        }
        return (C4683h) m9432b0();
    }

    @Override // p181x0.AbstractC7823a
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C4683h mo2514b(AbstractC7823a abstractC7823a) {
        AbstractC4408j.m1438d(abstractC7823a);
        return (C4683h) super.mo2514b(abstractC7823a);
    }

    /* renamed from: n0 */
    public final InterfaceC7824b m2518n0(InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, AbstractC7823a abstractC7823a, Executor executor) {
        return m2519o0(new Object(), interfaceC7894h, interfaceC7825c, null, this.f2224F, abstractC7823a.m9447x(), abstractC7823a.m9444u(), abstractC7823a.m9443t(), abstractC7823a, executor);
    }

    /* renamed from: o0 */
    public final InterfaceC7824b m2519o0(Object obj, InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, RequestCoordinator requestCoordinator, AbstractC4685j abstractC4685j, Priority priority, int i6, int i7, AbstractC7823a abstractC7823a, Executor executor) {
        C4742a c4742a;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        InterfaceC7894h interfaceC7894h2;
        InterfaceC7825c interfaceC7825c2;
        AbstractC4685j abstractC4685j2;
        Priority priority2;
        int i8;
        int i9;
        AbstractC7823a abstractC7823a2;
        Executor executor2;
        C4683h c4683h;
        if (this.f2228J != null) {
            c4742a = new C4742a(obj, requestCoordinator);
            requestCoordinator2 = c4742a;
            c4683h = this;
            obj2 = obj;
            interfaceC7894h2 = interfaceC7894h;
            interfaceC7825c2 = interfaceC7825c;
            abstractC4685j2 = abstractC4685j;
            priority2 = priority;
            i8 = i6;
            i9 = i7;
            abstractC7823a2 = abstractC7823a;
            executor2 = executor;
        } else {
            c4742a = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            interfaceC7894h2 = interfaceC7894h;
            interfaceC7825c2 = interfaceC7825c;
            abstractC4685j2 = abstractC4685j;
            priority2 = priority;
            i8 = i6;
            i9 = i7;
            abstractC7823a2 = abstractC7823a;
            executor2 = executor;
            c4683h = this;
        }
        InterfaceC7824b interfaceC7824bM2520p0 = c4683h.m2520p0(obj2, interfaceC7894h2, interfaceC7825c2, requestCoordinator2, abstractC4685j2, priority2, i8, i9, abstractC7823a2, executor2);
        if (c4742a == null) {
            return interfaceC7824bM2520p0;
        }
        int iM9444u = this.f2228J.m9444u();
        int iM9443t = this.f2228J.m9443t();
        if (AbstractC4409k.m1459t(i6, i7) && !this.f2228J.m9427P()) {
            iM9444u = abstractC7823a.m9444u();
            iM9443t = abstractC7823a.m9443t();
        }
        C4683h c4683h2 = this.f2228J;
        C4742a c4742a2 = c4742a;
        c4742a2.m2925n(interfaceC7824bM2520p0, c4683h2.m2519o0(obj, interfaceC7894h, interfaceC7825c, c4742a2, c4683h2.f2224F, c4683h2.m9447x(), iM9444u, iM9443t, this.f2228J, executor));
        return c4742a2;
    }

    /* renamed from: p0 */
    public final InterfaceC7824b m2520p0(Object obj, InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, RequestCoordinator requestCoordinator, AbstractC4685j abstractC4685j, Priority priority, int i6, int i7, AbstractC7823a abstractC7823a, Executor executor) {
        C4683h c4683h = this.f2227I;
        if (c4683h == null) {
            if (this.f2229K == null) {
                return m2512C0(obj, interfaceC7894h, interfaceC7825c, abstractC7823a, requestCoordinator, abstractC4685j, priority, i6, i7, executor);
            }
            C4743b c4743b = new C4743b(obj, requestCoordinator);
            c4743b.m2929m(m2512C0(obj, interfaceC7894h, interfaceC7825c, abstractC7823a, c4743b, abstractC4685j, priority, i6, i7, executor), m2512C0(obj, interfaceC7894h, interfaceC7825c, abstractC7823a.clone().mo7351e0(this.f2229K.floatValue()), c4743b, abstractC4685j, m2522r0(priority), i6, i7, executor));
            return c4743b;
        }
        if (this.f2232N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC4685j abstractC4685j2 = c4683h.f2230L ? abstractC4685j : c4683h.f2224F;
        Priority priorityM9447x = c4683h.m9421I() ? this.f2227I.m9447x() : m2522r0(priority);
        int iM9444u = this.f2227I.m9444u();
        int iM9443t = this.f2227I.m9443t();
        if (AbstractC4409k.m1459t(i6, i7) && !this.f2227I.m9427P()) {
            iM9444u = abstractC7823a.m9444u();
            iM9443t = abstractC7823a.m9443t();
        }
        C4743b c4743b2 = new C4743b(obj, requestCoordinator);
        InterfaceC7824b interfaceC7824bM2512C0 = m2512C0(obj, interfaceC7894h, interfaceC7825c, abstractC7823a, c4743b2, abstractC4685j, priority, i6, i7, executor);
        this.f2232N = true;
        C4683h c4683h2 = this.f2227I;
        InterfaceC7824b interfaceC7824bM2519o0 = c4683h2.m2519o0(obj, interfaceC7894h, interfaceC7825c, c4743b2, abstractC4685j2, priorityM9447x, iM9444u, iM9443t, c4683h2, executor);
        this.f2232N = false;
        c4743b2.m2929m(interfaceC7824bM2512C0, interfaceC7824bM2519o0);
        return c4743b2;
    }

    @Override // p181x0.AbstractC7823a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C4683h clone() {
        C4683h c4683h = (C4683h) super.clone();
        c4683h.f2224F = c4683h.f2224F.clone();
        if (c4683h.f2226H != null) {
            c4683h.f2226H = new ArrayList(c4683h.f2226H);
        }
        C4683h c4683h2 = c4683h.f2227I;
        if (c4683h2 != null) {
            c4683h.f2227I = c4683h2.clone();
        }
        C4683h c4683h3 = c4683h.f2228J;
        if (c4683h3 != null) {
            c4683h.f2228J = c4683h3.clone();
        }
        return c4683h;
    }

    /* renamed from: r0 */
    public final Priority m2522r0(Priority priority) {
        int i6 = a.f2234b[priority.ordinal()];
        if (i6 == 1) {
            return Priority.NORMAL;
        }
        if (i6 == 2) {
            return Priority.HIGH;
        }
        if (i6 == 3 || i6 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m9447x());
    }

    /* renamed from: s0 */
    public final void m2523s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2516l0((InterfaceC7825c) it.next());
        }
    }

    /* renamed from: t0 */
    public InterfaceC7894h m2524t0(InterfaceC7894h interfaceC7894h) {
        return m2525u0(interfaceC7894h, null, AbstractC4402d.m1419b());
    }

    /* renamed from: u0 */
    public InterfaceC7894h m2525u0(InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, Executor executor) {
        return m2526v0(interfaceC7894h, interfaceC7825c, this, executor);
    }

    /* renamed from: v0 */
    public final InterfaceC7894h m2526v0(InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, AbstractC7823a abstractC7823a, Executor executor) {
        AbstractC4408j.m1438d(interfaceC7894h);
        if (!this.f2231M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC7824b interfaceC7824bM2518n0 = m2518n0(interfaceC7894h, interfaceC7825c, abstractC7823a, executor);
        InterfaceC7824b interfaceC7824bMo9681a = interfaceC7894h.mo9681a();
        if (interfaceC7824bM2518n0.mo2902g(interfaceC7824bMo9681a) && !m2528x0(abstractC7823a, interfaceC7824bMo9681a)) {
            if (!((InterfaceC7824b) AbstractC4408j.m1438d(interfaceC7824bMo9681a)).isRunning()) {
                interfaceC7824bMo9681a.mo2904i();
            }
            return interfaceC7894h;
        }
        this.f2220B.m2538n(interfaceC7894h);
        interfaceC7894h.mo9683h(interfaceC7824bM2518n0);
        this.f2220B.m2550z(interfaceC7894h, interfaceC7824bM2518n0);
        return interfaceC7894h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p188y0.AbstractC7895i m2527w0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p016b1.AbstractC4409k.m1440a()
            p016b1.AbstractC4408j.m1438d(r4)
            boolean r0 = r3.m9426O()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m9424M()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C4683h.a.f2233a
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
            x0.a r0 = r3.clone()
            x0.a r0 = r0.mo7343S()
            goto L4d
        L31:
            x0.a r0 = r3.clone()
            x0.a r0 = r0.mo7344T()
            goto L4d
        L3a:
            x0.a r0 = r3.clone()
            x0.a r0 = r0.mo7343S()
            goto L4d
        L43:
            x0.a r0 = r3.clone()
            x0.a r0 = r0.mo7342R()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.e r1 = r3.f2223E
            java.lang.Class r2 = r3.f2221C
            y0.i r4 = r1.m2493a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p016b1.AbstractC4402d.m1419b()
            y0.h r4 = r3.m2526v0(r4, r1, r0, r2)
            y0.i r4 = (p188y0.AbstractC7895i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C4683h.m2527w0(android.widget.ImageView):y0.i");
    }

    /* renamed from: x0 */
    public final boolean m2528x0(AbstractC7823a abstractC7823a, InterfaceC7824b interfaceC7824b) {
        return !abstractC7823a.m9420H() && interfaceC7824b.isComplete();
    }

    /* renamed from: y0 */
    public C4683h mo2529y0(InterfaceC7825c interfaceC7825c) {
        if (m9418F()) {
            return clone().mo2529y0(interfaceC7825c);
        }
        this.f2226H = null;
        return mo2516l0(interfaceC7825c);
    }

    /* renamed from: z0 */
    public C4683h mo2530z0(Object obj) {
        return m2511B0(obj);
    }
}

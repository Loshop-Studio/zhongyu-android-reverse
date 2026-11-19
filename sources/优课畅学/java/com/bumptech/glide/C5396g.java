package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C5455a;
import com.bumptech.glide.request.C5456b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p069d0.AbstractC8269a;
import p069d0.C8272d;
import p069d0.InterfaceC8270b;
import p069d0.InterfaceC8271c;
import p081e0.InterfaceC8344i;
import p116h0.AbstractC8700d;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p182n.AbstractC9350c;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes3.dex */
public class C5396g extends AbstractC8269a implements Cloneable {

    /* renamed from: O */
    public static final C8272d f2860O = (C8272d) ((C8272d) ((C8272d) new C8272d().m13393j(AbstractC9350c.f18466c)).m13378Y(Priority.LOW)).m13387f0(true);

    /* renamed from: A */
    public final Context f2861A;

    /* renamed from: B */
    public final ComponentCallbacks2C5397h f2862B;

    /* renamed from: C */
    public final Class f2863C;

    /* renamed from: D */
    public final ComponentCallbacks2C5391b f2864D;

    /* renamed from: E */
    public final C5393d f2865E;

    /* renamed from: F */
    public AbstractC5398i f2866F;

    /* renamed from: G */
    public Object f2867G;

    /* renamed from: H */
    public List f2868H;

    /* renamed from: I */
    public C5396g f2869I;

    /* renamed from: J */
    public C5396g f2870J;

    /* renamed from: K */
    public Float f2871K;

    /* renamed from: L */
    public boolean f2872L = true;

    /* renamed from: M */
    public boolean f2873M;

    /* renamed from: N */
    public boolean f2874N;

    /* renamed from: com.bumptech.glide.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2875a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2876b;

        static {
            int[] iArr = new int[Priority.values().length];
            f2876b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2876b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2876b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2876b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f2875a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2875a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2875a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2875a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2875a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2875a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2875a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2875a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5396g(ComponentCallbacks2C5391b componentCallbacks2C5391b, ComponentCallbacks2C5397h componentCallbacks2C5397h, Class cls, Context context) {
        this.f2864D = componentCallbacks2C5391b;
        this.f2862B = componentCallbacks2C5397h;
        this.f2863C = cls;
        this.f2861A = context;
        this.f2866F = componentCallbacks2C5397h.m2806r(cls);
        this.f2865E = componentCallbacks2C5391b.m2746i();
        m2786s0(componentCallbacks2C5397h.m2804p());
        mo2777c(componentCallbacks2C5397h.m2805q());
    }

    /* renamed from: A0 */
    public C5396g m2772A0(Object obj) {
        return m2774C0(obj);
    }

    /* renamed from: B0 */
    public C5396g m2773B0(String str) {
        return m2774C0(str);
    }

    /* renamed from: C0 */
    public final C5396g m2774C0(Object obj) {
        if (m13360F()) {
            return clone().m2774C0(obj);
        }
        this.f2867G = obj;
        this.f2873M = true;
        return (C5396g) m13381b0();
    }

    /* renamed from: D0 */
    public final InterfaceC8270b m2775D0(Object obj, InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, AbstractC8269a abstractC8269a, RequestCoordinator requestCoordinator, AbstractC5398i abstractC5398i, Priority priority, int i10, int i11, Executor executor) {
        Context context = this.f2861A;
        C5393d c5393d = this.f2865E;
        return SingleRequest.m3159x(context, c5393d, obj, this.f2867G, this.f2863C, abstractC8269a, i10, i11, priority, interfaceC8344i, interfaceC8271c, this.f2868H, requestCoordinator, c5393d.m2760f(), abstractC5398i.m2819e(), executor);
    }

    /* renamed from: E0 */
    public C5396g m2776E0(float f10) {
        if (m13360F()) {
            return clone().m2776E0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f2871K = Float.valueOf(f10);
        return (C5396g) m13381b0();
    }

    @Override // p069d0.AbstractC8269a
    public boolean equals(Object obj) {
        if (obj instanceof C5396g) {
            C5396g c5396g = (C5396g) obj;
            if (super.equals(c5396g) && Objects.equals(this.f2863C, c5396g.f2863C) && this.f2866F.equals(c5396g.f2866F) && Objects.equals(this.f2867G, c5396g.f2867G) && Objects.equals(this.f2868H, c5396g.f2868H) && Objects.equals(this.f2869I, c5396g.f2869I) && Objects.equals(this.f2870J, c5396g.f2870J) && Objects.equals(this.f2871K, c5396g.f2871K) && this.f2872L == c5396g.f2872L && this.f2873M == c5396g.f2873M) {
                return true;
            }
        }
        return false;
    }

    @Override // p069d0.AbstractC8269a
    public int hashCode() {
        return AbstractC8707k.m14199q(this.f2873M, AbstractC8707k.m14199q(this.f2872L, AbstractC8707k.m14198p(this.f2871K, AbstractC8707k.m14198p(this.f2870J, AbstractC8707k.m14198p(this.f2869I, AbstractC8707k.m14198p(this.f2868H, AbstractC8707k.m14198p(this.f2867G, AbstractC8707k.m14198p(this.f2866F, AbstractC8707k.m14198p(this.f2863C, super.hashCode())))))))));
    }

    /* renamed from: l0 */
    public C5396g m2779l0(InterfaceC8271c interfaceC8271c) {
        if (m13360F()) {
            return clone().m2779l0(interfaceC8271c);
        }
        if (interfaceC8271c != null) {
            if (this.f2868H == null) {
                this.f2868H = new ArrayList();
            }
            this.f2868H.add(interfaceC8271c);
        }
        return (C5396g) m13381b0();
    }

    @Override // p069d0.AbstractC8269a
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C5396g mo2777c(AbstractC8269a abstractC8269a) {
        AbstractC8706j.m14181d(abstractC8269a);
        return (C5396g) super.mo2777c(abstractC8269a);
    }

    /* renamed from: n0 */
    public final InterfaceC8270b m2781n0(InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, AbstractC8269a abstractC8269a, Executor executor) {
        return m2782o0(new Object(), interfaceC8344i, interfaceC8271c, null, this.f2866F, abstractC8269a.m13409x(), abstractC8269a.m13406u(), abstractC8269a.m13405t(), abstractC8269a, executor);
    }

    /* renamed from: o0 */
    public final InterfaceC8270b m2782o0(Object obj, InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, RequestCoordinator requestCoordinator, AbstractC5398i abstractC5398i, Priority priority, int i10, int i11, AbstractC8269a abstractC8269a, Executor executor) {
        C5455a c5455a;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        InterfaceC8344i interfaceC8344i2;
        InterfaceC8271c interfaceC8271c2;
        AbstractC5398i abstractC5398i2;
        Priority priority2;
        int i12;
        int i13;
        AbstractC8269a abstractC8269a2;
        Executor executor2;
        C5396g c5396g;
        if (this.f2870J != null) {
            c5455a = new C5455a(obj, requestCoordinator);
            requestCoordinator2 = c5455a;
            c5396g = this;
            obj2 = obj;
            interfaceC8344i2 = interfaceC8344i;
            interfaceC8271c2 = interfaceC8271c;
            abstractC5398i2 = abstractC5398i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC8269a2 = abstractC8269a;
            executor2 = executor;
        } else {
            c5455a = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            interfaceC8344i2 = interfaceC8344i;
            interfaceC8271c2 = interfaceC8271c;
            abstractC5398i2 = abstractC5398i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC8269a2 = abstractC8269a;
            executor2 = executor;
            c5396g = this;
        }
        InterfaceC8270b interfaceC8270bM2783p0 = c5396g.m2783p0(obj2, interfaceC8344i2, interfaceC8271c2, requestCoordinator2, abstractC5398i2, priority2, i12, i13, abstractC8269a2, executor2);
        if (c5455a == null) {
            return interfaceC8270bM2783p0;
        }
        int iM13406u = this.f2870J.m13406u();
        int iM13405t = this.f2870J.m13405t();
        if (AbstractC8707k.m14203u(i10, i11) && !this.f2870J.m13369P()) {
            iM13406u = abstractC8269a.m13406u();
            iM13405t = abstractC8269a.m13405t();
        }
        C5396g c5396g2 = this.f2870J;
        C5455a c5455a2 = c5455a;
        c5455a2.m3189n(interfaceC8270bM2783p0, c5396g2.m2782o0(obj, interfaceC8344i, interfaceC8271c, c5455a2, c5396g2.f2866F, c5396g2.m13409x(), iM13406u, iM13405t, this.f2870J, executor));
        return c5455a2;
    }

    /* renamed from: p0 */
    public final InterfaceC8270b m2783p0(Object obj, InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, RequestCoordinator requestCoordinator, AbstractC5398i abstractC5398i, Priority priority, int i10, int i11, AbstractC8269a abstractC8269a, Executor executor) {
        C5396g c5396g = this.f2869I;
        if (c5396g == null) {
            if (this.f2871K == null) {
                return m2775D0(obj, interfaceC8344i, interfaceC8271c, abstractC8269a, requestCoordinator, abstractC5398i, priority, i10, i11, executor);
            }
            C5456b c5456b = new C5456b(obj, requestCoordinator);
            c5456b.m3193m(m2775D0(obj, interfaceC8344i, interfaceC8271c, abstractC8269a, c5456b, abstractC5398i, priority, i10, i11, executor), m2775D0(obj, interfaceC8344i, interfaceC8271c, abstractC8269a.clone().m13385e0(this.f2871K.floatValue()), c5456b, abstractC5398i, m2785r0(priority), i10, i11, executor));
            return c5456b;
        }
        if (this.f2874N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5398i abstractC5398i2 = c5396g.f2872L ? abstractC5398i : c5396g.f2866F;
        Priority priorityM13409x = c5396g.m13363I() ? this.f2869I.m13409x() : m2785r0(priority);
        int iM13406u = this.f2869I.m13406u();
        int iM13405t = this.f2869I.m13405t();
        if (AbstractC8707k.m14203u(i10, i11) && !this.f2869I.m13369P()) {
            iM13406u = abstractC8269a.m13406u();
            iM13405t = abstractC8269a.m13405t();
        }
        C5456b c5456b2 = new C5456b(obj, requestCoordinator);
        InterfaceC8270b interfaceC8270bM2775D0 = m2775D0(obj, interfaceC8344i, interfaceC8271c, abstractC8269a, c5456b2, abstractC5398i, priority, i10, i11, executor);
        this.f2874N = true;
        C5396g c5396g2 = this.f2869I;
        InterfaceC8270b interfaceC8270bM2782o0 = c5396g2.m2782o0(obj, interfaceC8344i, interfaceC8271c, c5456b2, abstractC5398i2, priorityM13409x, iM13406u, iM13405t, c5396g2, executor);
        this.f2874N = false;
        c5456b2.m3193m(interfaceC8270bM2775D0, interfaceC8270bM2782o0);
        return c5456b2;
    }

    @Override // p069d0.AbstractC8269a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C5396g clone() {
        C5396g c5396g = (C5396g) super.clone();
        c5396g.f2866F = c5396g.f2866F.clone();
        if (c5396g.f2868H != null) {
            c5396g.f2868H = new ArrayList(c5396g.f2868H);
        }
        C5396g c5396g2 = c5396g.f2869I;
        if (c5396g2 != null) {
            c5396g.f2869I = c5396g2.clone();
        }
        C5396g c5396g3 = c5396g.f2870J;
        if (c5396g3 != null) {
            c5396g.f2870J = c5396g3.clone();
        }
        return c5396g;
    }

    /* renamed from: r0 */
    public final Priority m2785r0(Priority priority) {
        int i10 = a.f2876b[priority.ordinal()];
        if (i10 == 1) {
            return Priority.NORMAL;
        }
        if (i10 == 2) {
            return Priority.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m13409x());
    }

    /* renamed from: s0 */
    public final void m2786s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m2779l0((InterfaceC8271c) it.next());
        }
    }

    /* renamed from: t0 */
    public InterfaceC8344i m2787t0(InterfaceC8344i interfaceC8344i) {
        return m2789v0(interfaceC8344i, null, AbstractC8700d.m14162b());
    }

    /* renamed from: u0 */
    public final InterfaceC8344i m2788u0(InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, AbstractC8269a abstractC8269a, Executor executor) {
        AbstractC8706j.m14181d(interfaceC8344i);
        if (!this.f2873M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC8270b interfaceC8270bM2781n0 = m2781n0(interfaceC8344i, interfaceC8271c, abstractC8269a, executor);
        InterfaceC8270b interfaceC8270bMo13551e = interfaceC8344i.mo13551e();
        if (interfaceC8270bM2781n0.mo3166g(interfaceC8270bMo13551e) && !m2791x0(abstractC8269a, interfaceC8270bMo13551e)) {
            if (!((InterfaceC8270b) AbstractC8706j.m14181d(interfaceC8270bMo13551e)).isRunning()) {
                interfaceC8270bMo13551e.mo3168i();
            }
            return interfaceC8344i;
        }
        this.f2862B.m2802n(interfaceC8344i);
        interfaceC8344i.mo13552g(interfaceC8270bM2781n0);
        this.f2862B.m2794A(interfaceC8344i, interfaceC8270bM2781n0);
        return interfaceC8344i;
    }

    /* renamed from: v0 */
    public InterfaceC8344i m2789v0(InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, Executor executor) {
        return m2788u0(interfaceC8344i, interfaceC8271c, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p081e0.AbstractC8345j m2790w0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p116h0.AbstractC8707k.m14183a()
            p116h0.AbstractC8706j.m14181d(r4)
            boolean r0 = r3.m13368O()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m13366M()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C5396g.a.f2875a
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
            d0.a r0 = r3.clone()
            d0.a r0 = r0.m13372S()
            goto L4d
        L31:
            d0.a r0 = r3.clone()
            d0.a r0 = r0.m13373T()
            goto L4d
        L3a:
            d0.a r0 = r3.clone()
            d0.a r0 = r0.m13372S()
            goto L4d
        L43:
            d0.a r0 = r3.clone()
            d0.a r0 = r0.m13371R()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f2865E
            java.lang.Class r2 = r3.f2863C
            e0.j r4 = r1.m2755a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p116h0.AbstractC8700d.m14162b()
            e0.i r4 = r3.m2788u0(r4, r1, r0, r2)
            e0.j r4 = (p081e0.AbstractC8345j) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5396g.m2790w0(android.widget.ImageView):e0.j");
    }

    /* renamed from: x0 */
    public final boolean m2791x0(AbstractC8269a abstractC8269a, InterfaceC8270b interfaceC8270b) {
        return !abstractC8269a.m13362H() && interfaceC8270b.isComplete();
    }

    /* renamed from: y0 */
    public C5396g m2792y0(InterfaceC8271c interfaceC8271c) {
        if (m13360F()) {
            return clone().m2792y0(interfaceC8271c);
        }
        this.f2868H = null;
        return m2779l0(interfaceC8271c);
    }

    /* renamed from: z0 */
    public C5396g m2793z0(File file) {
        return m2774C0(file);
    }
}

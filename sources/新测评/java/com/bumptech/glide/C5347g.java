package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C5406a;
import com.bumptech.glide.request.C5407b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p073e1.AbstractC7324a;
import p073e1.C7327d;
import p073e1.InterfaceC7325b;
import p073e1.InterfaceC7326c;
import p084f1.InterfaceC7431h;
import p117i1.AbstractC7645d;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p184o0.AbstractC8683c;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes3.dex */
public class C5347g extends AbstractC7324a implements Cloneable {

    /* renamed from: O */
    public static final C7327d f3427O = (C7327d) ((C7327d) ((C7327d) new C7327d().m11682h(AbstractC8683c.f14424c)).m11669Y(Priority.LOW)).m11679f0(true);

    /* renamed from: A */
    public final Context f3428A;

    /* renamed from: B */
    public final ComponentCallbacks2C5348h f3429B;

    /* renamed from: C */
    public final Class f3430C;

    /* renamed from: D */
    public final ComponentCallbacks2C5342b f3431D;

    /* renamed from: E */
    public final C5344d f3432E;

    /* renamed from: F */
    public AbstractC5349i f3433F;

    /* renamed from: G */
    public Object f3434G;

    /* renamed from: H */
    public List f3435H;

    /* renamed from: I */
    public C5347g f3436I;

    /* renamed from: J */
    public C5347g f3437J;

    /* renamed from: K */
    public Float f3438K;

    /* renamed from: L */
    public boolean f3439L = true;

    /* renamed from: M */
    public boolean f3440M;

    /* renamed from: N */
    public boolean f3441N;

    /* renamed from: com.bumptech.glide.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3442a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3443b;

        static {
            int[] iArr = new int[Priority.values().length];
            f3443b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3443b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3443b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3443b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f3442a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3442a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3442a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3442a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3442a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3442a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3442a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3442a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5347g(ComponentCallbacks2C5342b componentCallbacks2C5342b, ComponentCallbacks2C5348h componentCallbacks2C5348h, Class cls, Context context) {
        this.f3431D = componentCallbacks2C5342b;
        this.f3429B = componentCallbacks2C5348h;
        this.f3430C = cls;
        this.f3428A = context;
        this.f3433F = componentCallbacks2C5348h.m3361q(cls);
        this.f3432E = componentCallbacks2C5342b.m3305i();
        m3344s0(componentCallbacks2C5348h.m3359o());
        mo3335b(componentCallbacks2C5348h.m3360p());
    }

    /* renamed from: A0 */
    public C5347g m3331A0(String str) {
        return m3332B0(str);
    }

    /* renamed from: B0 */
    public final C5347g m3332B0(Object obj) {
        if (m11651F()) {
            return clone().m3332B0(obj);
        }
        this.f3434G = obj;
        this.f3440M = true;
        return (C5347g) m11672b0();
    }

    /* renamed from: C0 */
    public final InterfaceC7325b m3333C0(Object obj, InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, AbstractC7324a abstractC7324a, RequestCoordinator requestCoordinator, AbstractC5349i abstractC5349i, Priority priority, int i10, int i11, Executor executor) {
        Context context = this.f3428A;
        C5344d c5344d = this.f3432E;
        return SingleRequest.m3715x(context, c5344d, obj, this.f3434G, this.f3430C, abstractC7324a, i10, i11, priority, interfaceC7431h, interfaceC7326c, this.f3435H, requestCoordinator, c5344d.m3319f(), abstractC5349i.m3372c(), executor);
    }

    /* renamed from: D0 */
    public C5347g m3334D0(float f10) {
        if (m11651F()) {
            return clone().m3334D0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3438K = Float.valueOf(f10);
        return (C5347g) m11672b0();
    }

    @Override // p073e1.AbstractC7324a
    public boolean equals(Object obj) {
        if (obj instanceof C5347g) {
            C5347g c5347g = (C5347g) obj;
            if (super.equals(c5347g) && Objects.equals(this.f3430C, c5347g.f3430C) && this.f3433F.equals(c5347g.f3433F) && Objects.equals(this.f3434G, c5347g.f3434G) && Objects.equals(this.f3435H, c5347g.f3435H) && Objects.equals(this.f3436I, c5347g.f3436I) && Objects.equals(this.f3437J, c5347g.f3437J) && Objects.equals(this.f3438K, c5347g.f3438K) && this.f3439L == c5347g.f3439L && this.f3440M == c5347g.f3440M) {
                return true;
            }
        }
        return false;
    }

    @Override // p073e1.AbstractC7324a
    public int hashCode() {
        return AbstractC7652k.m12700p(this.f3440M, AbstractC7652k.m12700p(this.f3439L, AbstractC7652k.m12699o(this.f3438K, AbstractC7652k.m12699o(this.f3437J, AbstractC7652k.m12699o(this.f3436I, AbstractC7652k.m12699o(this.f3435H, AbstractC7652k.m12699o(this.f3434G, AbstractC7652k.m12699o(this.f3433F, AbstractC7652k.m12699o(this.f3430C, super.hashCode())))))))));
    }

    /* renamed from: l0 */
    public C5347g m3337l0(InterfaceC7326c interfaceC7326c) {
        if (m11651F()) {
            return clone().m3337l0(interfaceC7326c);
        }
        if (interfaceC7326c != null) {
            if (this.f3435H == null) {
                this.f3435H = new ArrayList();
            }
            this.f3435H.add(interfaceC7326c);
        }
        return (C5347g) m11672b0();
    }

    @Override // p073e1.AbstractC7324a
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C5347g mo3335b(AbstractC7324a abstractC7324a) {
        AbstractC7651j.m12683d(abstractC7324a);
        return (C5347g) super.mo3335b(abstractC7324a);
    }

    /* renamed from: n0 */
    public final InterfaceC7325b m3339n0(InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, AbstractC7324a abstractC7324a, Executor executor) {
        return m3340o0(new Object(), interfaceC7431h, interfaceC7326c, null, this.f3433F, abstractC7324a.m11700x(), abstractC7324a.m11697u(), abstractC7324a.m11696t(), abstractC7324a, executor);
    }

    /* renamed from: o0 */
    public final InterfaceC7325b m3340o0(Object obj, InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, RequestCoordinator requestCoordinator, AbstractC5349i abstractC5349i, Priority priority, int i10, int i11, AbstractC7324a abstractC7324a, Executor executor) {
        C5406a c5406a;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        InterfaceC7431h interfaceC7431h2;
        InterfaceC7326c interfaceC7326c2;
        AbstractC5349i abstractC5349i2;
        Priority priority2;
        int i12;
        int i13;
        AbstractC7324a abstractC7324a2;
        Executor executor2;
        C5347g c5347g;
        if (this.f3437J != null) {
            c5406a = new C5406a(obj, requestCoordinator);
            requestCoordinator2 = c5406a;
            c5347g = this;
            obj2 = obj;
            interfaceC7431h2 = interfaceC7431h;
            interfaceC7326c2 = interfaceC7326c;
            abstractC5349i2 = abstractC5349i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC7324a2 = abstractC7324a;
            executor2 = executor;
        } else {
            c5406a = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            interfaceC7431h2 = interfaceC7431h;
            interfaceC7326c2 = interfaceC7326c;
            abstractC5349i2 = abstractC5349i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC7324a2 = abstractC7324a;
            executor2 = executor;
            c5347g = this;
        }
        InterfaceC7325b interfaceC7325bM3341p0 = c5347g.m3341p0(obj2, interfaceC7431h2, interfaceC7326c2, requestCoordinator2, abstractC5349i2, priority2, i12, i13, abstractC7324a2, executor2);
        if (c5406a == null) {
            return interfaceC7325bM3341p0;
        }
        int iM11697u = this.f3437J.m11697u();
        int iM11696t = this.f3437J.m11696t();
        if (AbstractC7652k.m12704t(i10, i11) && !this.f3437J.m11660P()) {
            iM11697u = abstractC7324a.m11697u();
            iM11696t = abstractC7324a.m11696t();
        }
        C5347g c5347g2 = this.f3437J;
        C5406a c5406a2 = c5406a;
        c5406a2.m3745n(interfaceC7325bM3341p0, c5347g2.m3340o0(obj, interfaceC7431h, interfaceC7326c, c5406a2, c5347g2.f3433F, c5347g2.m11700x(), iM11697u, iM11696t, this.f3437J, executor));
        return c5406a2;
    }

    /* renamed from: p0 */
    public final InterfaceC7325b m3341p0(Object obj, InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, RequestCoordinator requestCoordinator, AbstractC5349i abstractC5349i, Priority priority, int i10, int i11, AbstractC7324a abstractC7324a, Executor executor) {
        C5347g c5347g = this.f3436I;
        if (c5347g == null) {
            if (this.f3438K == null) {
                return m3333C0(obj, interfaceC7431h, interfaceC7326c, abstractC7324a, requestCoordinator, abstractC5349i, priority, i10, i11, executor);
            }
            C5407b c5407b = new C5407b(obj, requestCoordinator);
            c5407b.m3749m(m3333C0(obj, interfaceC7431h, interfaceC7326c, abstractC7324a, c5407b, abstractC5349i, priority, i10, i11, executor), m3333C0(obj, interfaceC7431h, interfaceC7326c, abstractC7324a.clone().m11678e0(this.f3438K.floatValue()), c5407b, abstractC5349i, m3343r0(priority), i10, i11, executor));
            return c5407b;
        }
        if (this.f3441N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5349i abstractC5349i2 = c5347g.f3439L ? abstractC5349i : c5347g.f3433F;
        Priority priorityM11700x = c5347g.m11654I() ? this.f3436I.m11700x() : m3343r0(priority);
        int iM11697u = this.f3436I.m11697u();
        int iM11696t = this.f3436I.m11696t();
        if (AbstractC7652k.m12704t(i10, i11) && !this.f3436I.m11660P()) {
            iM11697u = abstractC7324a.m11697u();
            iM11696t = abstractC7324a.m11696t();
        }
        C5407b c5407b2 = new C5407b(obj, requestCoordinator);
        InterfaceC7325b interfaceC7325bM3333C0 = m3333C0(obj, interfaceC7431h, interfaceC7326c, abstractC7324a, c5407b2, abstractC5349i, priority, i10, i11, executor);
        this.f3441N = true;
        C5347g c5347g2 = this.f3436I;
        InterfaceC7325b interfaceC7325bM3340o0 = c5347g2.m3340o0(obj, interfaceC7431h, interfaceC7326c, c5407b2, abstractC5349i2, priorityM11700x, iM11697u, iM11696t, c5347g2, executor);
        this.f3441N = false;
        c5407b2.m3749m(interfaceC7325bM3333C0, interfaceC7325bM3340o0);
        return c5407b2;
    }

    @Override // p073e1.AbstractC7324a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C5347g clone() {
        C5347g c5347g = (C5347g) super.clone();
        c5347g.f3433F = c5347g.f3433F.clone();
        if (c5347g.f3435H != null) {
            c5347g.f3435H = new ArrayList(c5347g.f3435H);
        }
        C5347g c5347g2 = c5347g.f3436I;
        if (c5347g2 != null) {
            c5347g.f3436I = c5347g2.clone();
        }
        C5347g c5347g3 = c5347g.f3437J;
        if (c5347g3 != null) {
            c5347g.f3437J = c5347g3.clone();
        }
        return c5347g;
    }

    /* renamed from: r0 */
    public final Priority m3343r0(Priority priority) {
        int i10 = a.f3443b[priority.ordinal()];
        if (i10 == 1) {
            return Priority.NORMAL;
        }
        if (i10 == 2) {
            return Priority.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m11700x());
    }

    /* renamed from: s0 */
    public final void m3344s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m3337l0((InterfaceC7326c) it.next());
        }
    }

    /* renamed from: t0 */
    public InterfaceC7431h m3345t0(InterfaceC7431h interfaceC7431h) {
        return m3347v0(interfaceC7431h, null, AbstractC7645d.m12664b());
    }

    /* renamed from: u0 */
    public final InterfaceC7431h m3346u0(InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, AbstractC7324a abstractC7324a, Executor executor) {
        AbstractC7651j.m12683d(interfaceC7431h);
        if (!this.f3440M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC7325b interfaceC7325bM3339n0 = m3339n0(interfaceC7431h, interfaceC7326c, abstractC7324a, executor);
        InterfaceC7325b interfaceC7325bMo11957a = interfaceC7431h.mo11957a();
        if (interfaceC7325bM3339n0.mo3720e(interfaceC7325bMo11957a) && !m3349x0(abstractC7324a, interfaceC7325bMo11957a)) {
            if (!((InterfaceC7325b) AbstractC7651j.m12683d(interfaceC7325bMo11957a)).isRunning()) {
                interfaceC7325bMo11957a.mo3725j();
            }
            return interfaceC7431h;
        }
        this.f3429B.m3357m(interfaceC7431h);
        interfaceC7431h.mo11958c(interfaceC7325bM3339n0);
        this.f3429B.m3369y(interfaceC7431h, interfaceC7325bM3339n0);
        return interfaceC7431h;
    }

    /* renamed from: v0 */
    public InterfaceC7431h m3347v0(InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, Executor executor) {
        return m3346u0(interfaceC7431h, interfaceC7326c, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p084f1.AbstractC7432i m3348w0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p117i1.AbstractC7652k.m12685a()
            p117i1.AbstractC7651j.m12683d(r4)
            boolean r0 = r3.m11659O()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m11657M()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C5347g.a.f3442a
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
            e1.a r0 = r3.clone()
            e1.a r0 = r0.m11663S()
            goto L4d
        L31:
            e1.a r0 = r3.clone()
            e1.a r0 = r0.m11664T()
            goto L4d
        L3a:
            e1.a r0 = r3.clone()
            e1.a r0 = r0.m11663S()
            goto L4d
        L43:
            e1.a r0 = r3.clone()
            e1.a r0 = r0.m11662R()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f3432E
            java.lang.Class r2 = r3.f3430C
            f1.i r4 = r1.m3314a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p117i1.AbstractC7645d.m12664b()
            f1.h r4 = r3.m3346u0(r4, r1, r0, r2)
            f1.i r4 = (p084f1.AbstractC7432i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5347g.m3348w0(android.widget.ImageView):f1.i");
    }

    /* renamed from: x0 */
    public final boolean m3349x0(AbstractC7324a abstractC7324a, InterfaceC7325b interfaceC7325b) {
        return !abstractC7324a.m11653H() && interfaceC7325b.isComplete();
    }

    /* renamed from: y0 */
    public C5347g m3350y0(InterfaceC7326c interfaceC7326c) {
        if (m11651F()) {
            return clone().m3350y0(interfaceC7326c);
        }
        this.f3435H = null;
        return m3337l0(interfaceC7326c);
    }

    /* renamed from: z0 */
    public C5347g m3351z0(Object obj) {
        return m3332B0(obj);
    }
}

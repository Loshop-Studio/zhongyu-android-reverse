package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.C5874a;
import com.bumptech.glide.request.C5875b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a1.InterfaceC0037h;
import p039c1.C5219a;
import p109d1.AbstractC8903d;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p198j0.AbstractC9650c;
import p428z0.AbstractC11952a;
import p428z0.C11955d;
import p428z0.InterfaceC11953b;
import p428z0.InterfaceC11954c;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes3.dex */
public class C5815g extends AbstractC11952a implements Cloneable {

    /* renamed from: Q */
    public static final C11955d f4630Q = (C11955d) ((C11955d) ((C11955d) new C11955d().m26549h(AbstractC9650c.f22357c)).m26536X(Priority.LOW)).m26548g0(true);

    /* renamed from: C */
    public final Context f4631C;

    /* renamed from: D */
    public final ComponentCallbacks2C5816h f4632D;

    /* renamed from: E */
    public final Class f4633E;

    /* renamed from: F */
    public final ComponentCallbacks2C5810b f4634F;

    /* renamed from: G */
    public final C5812d f4635G;

    /* renamed from: H */
    public AbstractC5817i f4636H;

    /* renamed from: I */
    public Object f4637I;

    /* renamed from: J */
    public List f4638J;

    /* renamed from: K */
    public C5815g f4639K;

    /* renamed from: L */
    public C5815g f4640L;

    /* renamed from: M */
    public Float f4641M;

    /* renamed from: N */
    public boolean f4642N = true;

    /* renamed from: O */
    public boolean f4643O;

    /* renamed from: P */
    public boolean f4644P;

    /* renamed from: com.bumptech.glide.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4645a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4646b;

        static {
            int[] iArr = new int[Priority.values().length];
            f4646b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4646b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4646b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4646b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f4645a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4645a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4645a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4645a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4645a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4645a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4645a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4645a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5815g(ComponentCallbacks2C5810b componentCallbacks2C5810b, ComponentCallbacks2C5816h componentCallbacks2C5816h, Class cls, Context context) {
        this.f4634F = componentCallbacks2C5810b;
        this.f4632D = componentCallbacks2C5816h;
        this.f4633E = cls;
        this.f4631C = context;
        this.f4636H = componentCallbacks2C5816h.m4013q(cls);
        this.f4635G = componentCallbacks2C5810b.m3955i();
        m3999w0(componentCallbacks2C5816h.m4011o());
        mo3989b(componentCallbacks2C5816h.m4012p());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p002a1.AbstractC0038i m3981A0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p109d1.AbstractC8910k.m17470a()
            p109d1.AbstractC8909j.m17468d(r4)
            boolean r0 = r3.m26526N()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m26524L()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C5815g.a.f4645a
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
            z0.a r0 = r3.clone()
            z0.a r0 = r0.m26530R()
            goto L4d
        L31:
            z0.a r0 = r3.clone()
            z0.a r0 = r0.m26531S()
            goto L4d
        L3a:
            z0.a r0 = r3.clone()
            z0.a r0 = r0.m26530R()
            goto L4d
        L43:
            z0.a r0 = r3.clone()
            z0.a r0 = r0.m26529Q()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f4635G
            java.lang.Class r2 = r3.f4633E
            a1.i r4 = r1.m3964a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p109d1.AbstractC8903d.m17449b()
            a1.h r4 = r3.m4002z0(r4, r1, r0, r2)
            a1.i r4 = (p002a1.AbstractC0038i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5815g.m3981A0(android.widget.ImageView):a1.i");
    }

    /* renamed from: B0 */
    public final boolean m3982B0(AbstractC11952a abstractC11952a, InterfaceC11953b interfaceC11953b) {
        return !abstractC11952a.m26520G() && interfaceC11953b.isComplete();
    }

    /* renamed from: C0 */
    public C5815g m3983C0(InterfaceC11954c interfaceC11954c) {
        if (m26518E()) {
            return clone().m3983C0(interfaceC11954c);
        }
        this.f4638J = null;
        return m3991o0(interfaceC11954c);
    }

    /* renamed from: D0 */
    public C5815g m3984D0(Integer num) {
        return m3993q0(m3987G0(num));
    }

    /* renamed from: E0 */
    public C5815g m3985E0(Object obj) {
        return m3987G0(obj);
    }

    /* renamed from: F0 */
    public C5815g m3986F0(String str) {
        return m3987G0(str);
    }

    /* renamed from: G0 */
    public final C5815g m3987G0(Object obj) {
        if (m26518E()) {
            return clone().m3987G0(obj);
        }
        this.f4637I = obj;
        this.f4643O = true;
        return (C5815g) m26541c0();
    }

    /* renamed from: H0 */
    public final InterfaceC11953b m3988H0(Object obj, InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, AbstractC11952a abstractC11952a, RequestCoordinator requestCoordinator, AbstractC5817i abstractC5817i, Priority priority, int i10, int i11, Executor executor) {
        Context context = this.f4631C;
        C5812d c5812d = this.f4635G;
        return SingleRequest.m4362x(context, c5812d, obj, this.f4637I, this.f4633E, abstractC11952a, i10, i11, priority, interfaceC0037h, interfaceC11954c, this.f4638J, requestCoordinator, c5812d.m3969f(), abstractC5817i.m4025d(), executor);
    }

    @Override // p428z0.AbstractC11952a
    public boolean equals(Object obj) {
        if (obj instanceof C5815g) {
            C5815g c5815g = (C5815g) obj;
            if (super.equals(c5815g) && Objects.equals(this.f4633E, c5815g.f4633E) && this.f4636H.equals(c5815g.f4636H) && Objects.equals(this.f4637I, c5815g.f4637I) && Objects.equals(this.f4638J, c5815g.f4638J) && Objects.equals(this.f4639K, c5815g.f4639K) && Objects.equals(this.f4640L, c5815g.f4640L) && Objects.equals(this.f4641M, c5815g.f4641M) && this.f4642N == c5815g.f4642N && this.f4643O == c5815g.f4643O) {
                return true;
            }
        }
        return false;
    }

    @Override // p428z0.AbstractC11952a
    public int hashCode() {
        return AbstractC8910k.m17486q(this.f4643O, AbstractC8910k.m17486q(this.f4642N, AbstractC8910k.m17485p(this.f4641M, AbstractC8910k.m17485p(this.f4640L, AbstractC8910k.m17485p(this.f4639K, AbstractC8910k.m17485p(this.f4638J, AbstractC8910k.m17485p(this.f4637I, AbstractC8910k.m17485p(this.f4636H, AbstractC8910k.m17485p(this.f4633E, super.hashCode())))))))));
    }

    /* renamed from: o0 */
    public C5815g m3991o0(InterfaceC11954c interfaceC11954c) {
        if (m26518E()) {
            return clone().m3991o0(interfaceC11954c);
        }
        if (interfaceC11954c != null) {
            if (this.f4638J == null) {
                this.f4638J = new ArrayList();
            }
            this.f4638J.add(interfaceC11954c);
        }
        return (C5815g) m26541c0();
    }

    @Override // p428z0.AbstractC11952a
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C5815g mo3989b(AbstractC11952a abstractC11952a) {
        AbstractC8909j.m17468d(abstractC11952a);
        return (C5815g) super.mo3989b(abstractC11952a);
    }

    /* renamed from: q0 */
    public final C5815g m3993q0(C5815g c5815g) {
        return (C5815g) ((C5815g) c5815g.m26550h0(this.f4631C.getTheme())).m26545e0(C5219a.m2796c(this.f4631C));
    }

    /* renamed from: r0 */
    public final InterfaceC11953b m3994r0(InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, AbstractC11952a abstractC11952a, Executor executor) {
        return m3995s0(new Object(), interfaceC0037h, interfaceC11954c, null, this.f4636H, abstractC11952a.m26571w(), abstractC11952a.m26568t(), abstractC11952a.m26567s(), abstractC11952a, executor);
    }

    /* renamed from: s0 */
    public final InterfaceC11953b m3995s0(Object obj, InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, RequestCoordinator requestCoordinator, AbstractC5817i abstractC5817i, Priority priority, int i10, int i11, AbstractC11952a abstractC11952a, Executor executor) {
        C5874a c5874a;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        InterfaceC0037h interfaceC0037h2;
        InterfaceC11954c interfaceC11954c2;
        AbstractC5817i abstractC5817i2;
        Priority priority2;
        int i12;
        int i13;
        AbstractC11952a abstractC11952a2;
        Executor executor2;
        C5815g c5815g;
        if (this.f4640L != null) {
            c5874a = new C5874a(obj, requestCoordinator);
            requestCoordinator2 = c5874a;
            c5815g = this;
            obj2 = obj;
            interfaceC0037h2 = interfaceC0037h;
            interfaceC11954c2 = interfaceC11954c;
            abstractC5817i2 = abstractC5817i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC11952a2 = abstractC11952a;
            executor2 = executor;
        } else {
            c5874a = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            interfaceC0037h2 = interfaceC0037h;
            interfaceC11954c2 = interfaceC11954c;
            abstractC5817i2 = abstractC5817i;
            priority2 = priority;
            i12 = i10;
            i13 = i11;
            abstractC11952a2 = abstractC11952a;
            executor2 = executor;
            c5815g = this;
        }
        InterfaceC11953b interfaceC11953bM3996t0 = c5815g.m3996t0(obj2, interfaceC0037h2, interfaceC11954c2, requestCoordinator2, abstractC5817i2, priority2, i12, i13, abstractC11952a2, executor2);
        if (c5874a == null) {
            return interfaceC11953bM3996t0;
        }
        int iM26568t = this.f4640L.m26568t();
        int iM26567s = this.f4640L.m26567s();
        if (AbstractC8910k.m17490u(i10, i11) && !this.f4640L.m26527O()) {
            iM26568t = abstractC11952a.m26568t();
            iM26567s = abstractC11952a.m26567s();
        }
        C5815g c5815g2 = this.f4640L;
        C5874a c5874a2 = c5874a;
        c5874a2.m4391n(interfaceC11953bM3996t0, c5815g2.m3995s0(obj, interfaceC0037h, interfaceC11954c, c5874a2, c5815g2.f4636H, c5815g2.m26571w(), iM26568t, iM26567s, this.f4640L, executor));
        return c5874a2;
    }

    /* renamed from: t0 */
    public final InterfaceC11953b m3996t0(Object obj, InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, RequestCoordinator requestCoordinator, AbstractC5817i abstractC5817i, Priority priority, int i10, int i11, AbstractC11952a abstractC11952a, Executor executor) {
        C5815g c5815g = this.f4639K;
        if (c5815g == null) {
            if (this.f4641M == null) {
                return m3988H0(obj, interfaceC0037h, interfaceC11954c, abstractC11952a, requestCoordinator, abstractC5817i, priority, i10, i11, executor);
            }
            C5875b c5875b = new C5875b(obj, requestCoordinator);
            c5875b.m4395m(m3988H0(obj, interfaceC0037h, interfaceC11954c, abstractC11952a, c5875b, abstractC5817i, priority, i10, i11, executor), m3988H0(obj, interfaceC0037h, interfaceC11954c, abstractC11952a.clone().m26546f0(this.f4641M.floatValue()), c5875b, abstractC5817i, m3998v0(priority), i10, i11, executor));
            return c5875b;
        }
        if (this.f4644P) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5817i abstractC5817i2 = c5815g.f4642N ? abstractC5817i : c5815g.f4636H;
        Priority priorityM26571w = c5815g.m26521H() ? this.f4639K.m26571w() : m3998v0(priority);
        int iM26568t = this.f4639K.m26568t();
        int iM26567s = this.f4639K.m26567s();
        if (AbstractC8910k.m17490u(i10, i11) && !this.f4639K.m26527O()) {
            iM26568t = abstractC11952a.m26568t();
            iM26567s = abstractC11952a.m26567s();
        }
        C5875b c5875b2 = new C5875b(obj, requestCoordinator);
        InterfaceC11953b interfaceC11953bM3988H0 = m3988H0(obj, interfaceC0037h, interfaceC11954c, abstractC11952a, c5875b2, abstractC5817i, priority, i10, i11, executor);
        this.f4644P = true;
        C5815g c5815g2 = this.f4639K;
        InterfaceC11953b interfaceC11953bM3995s0 = c5815g2.m3995s0(obj, interfaceC0037h, interfaceC11954c, c5875b2, abstractC5817i2, priorityM26571w, iM26568t, iM26567s, c5815g2, executor);
        this.f4644P = false;
        c5875b2.m4395m(interfaceC11953bM3988H0, interfaceC11953bM3995s0);
        return c5875b2;
    }

    @Override // p428z0.AbstractC11952a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C5815g clone() {
        C5815g c5815g = (C5815g) super.clone();
        c5815g.f4636H = c5815g.f4636H.clone();
        if (c5815g.f4638J != null) {
            c5815g.f4638J = new ArrayList(c5815g.f4638J);
        }
        C5815g c5815g2 = c5815g.f4639K;
        if (c5815g2 != null) {
            c5815g.f4639K = c5815g2.clone();
        }
        C5815g c5815g3 = c5815g.f4640L;
        if (c5815g3 != null) {
            c5815g.f4640L = c5815g3.clone();
        }
        return c5815g;
    }

    /* renamed from: v0 */
    public final Priority m3998v0(Priority priority) {
        int i10 = a.f4646b[priority.ordinal()];
        if (i10 == 1) {
            return Priority.NORMAL;
        }
        if (i10 == 2) {
            return Priority.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m26571w());
    }

    /* renamed from: w0 */
    public final void m3999w0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m3991o0((InterfaceC11954c) it.next());
        }
    }

    /* renamed from: x0 */
    public InterfaceC0037h m4000x0(InterfaceC0037h interfaceC0037h) {
        return m4001y0(interfaceC0037h, null, AbstractC8903d.m17449b());
    }

    /* renamed from: y0 */
    public InterfaceC0037h m4001y0(InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, Executor executor) {
        return m4002z0(interfaceC0037h, interfaceC11954c, this, executor);
    }

    /* renamed from: z0 */
    public final InterfaceC0037h m4002z0(InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, AbstractC11952a abstractC11952a, Executor executor) {
        AbstractC8909j.m17468d(interfaceC0037h);
        if (!this.f4643O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC11953b interfaceC11953bM3994r0 = m3994r0(interfaceC0037h, interfaceC11954c, abstractC11952a, executor);
        InterfaceC11953b interfaceC11953bMo65a = interfaceC0037h.mo65a();
        if (interfaceC11953bM3994r0.mo4370i(interfaceC11953bMo65a) && !m3982B0(abstractC11952a, interfaceC11953bMo65a)) {
            if (!((InterfaceC11953b) AbstractC8909j.m17468d(interfaceC11953bMo65a)).isRunning()) {
                interfaceC11953bMo65a.mo4369h();
            }
            return interfaceC0037h;
        }
        this.f4632D.m4009m(interfaceC0037h);
        interfaceC0037h.mo68h(interfaceC11953bM3994r0);
        this.f4632D.m4022z(interfaceC0037h, interfaceC11953bM3994r0);
        return interfaceC0037h;
    }
}

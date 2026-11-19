package p312y8;

import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p010a9.C0053d;
import p040c9.AbstractC5275a;
import p078d9.InterfaceC8324a;
import p090e9.C8389a;
import p102f9.AbstractC8486c;
import p312y8.InterfaceC10681h;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;

/* renamed from: y8.e */
/* loaded from: classes5.dex */
public class C10678e implements InterfaceC10681h {

    /* renamed from: a */
    public final DanmakuContext f21189a;

    /* renamed from: b */
    public final AbstractC10730a f21190b;

    /* renamed from: c */
    public InterfaceC10741l f21191c;

    /* renamed from: d */
    public AbstractC5275a f21192d;

    /* renamed from: e */
    public InterfaceC10681h.a f21193e;

    /* renamed from: f */
    public final InterfaceC8324a f21194f;

    /* renamed from: g */
    public C10734e f21195g;

    /* renamed from: i */
    public boolean f21197i;

    /* renamed from: l */
    public boolean f21200l;

    /* renamed from: m */
    public long f21201m;

    /* renamed from: n */
    public long f21202n;

    /* renamed from: o */
    public int f21203o;

    /* renamed from: p */
    public boolean f21204p;

    /* renamed from: q */
    public AbstractC10732c f21205q;

    /* renamed from: s */
    public InterfaceC10741l f21207s;

    /* renamed from: h */
    public InterfaceC10741l f21196h = new C0053d(4);

    /* renamed from: j */
    public long f21198j = 0;

    /* renamed from: k */
    public final InterfaceC8324a.b f21199k = new InterfaceC8324a.b();

    /* renamed from: r */
    public C0053d f21206r = new C0053d(4);

    /* renamed from: t */
    public DanmakuContext.InterfaceC9347a f21208t = new a();

    /* renamed from: y8.e$a */
    public class a implements DanmakuContext.InterfaceC9347a {
        public a() {
        }
    }

    /* renamed from: y8.e$b */
    public class b implements InterfaceC8324a.a {
        public b() {
        }

        @Override // p078d9.InterfaceC8324a.a
        /* renamed from: a */
        public void mo13531a(AbstractC10732c abstractC10732c) {
            InterfaceC10681h.a aVar = C10678e.this.f21193e;
            if (aVar != null) {
                aVar.mo19947a(abstractC10732c);
            }
        }
    }

    public C10678e(C10734e c10734e, DanmakuContext danmakuContext, InterfaceC10681h.a aVar) {
        if (danmakuContext == null) {
            throw new IllegalArgumentException("context is null");
        }
        this.f21189a = danmakuContext;
        this.f21190b = danmakuContext.m17216b();
        this.f21193e = aVar;
        C8389a c8389a = new C8389a(danmakuContext);
        this.f21194f = c8389a;
        c8389a.mo13528c(new b());
        c8389a.mo13529d(danmakuContext.m17220f() || danmakuContext.m17219e());
        mo19821o(c10734e);
        if (danmakuContext.m17218d()) {
            danmakuContext.f18454z.m19871d("1017_Filter");
        } else {
            danmakuContext.f18454z.m19874g("1017_Filter");
        }
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: a */
    public synchronized void mo19816a(AbstractC10732c abstractC10732c) {
        boolean zMo182e;
        boolean zMo182e2;
        InterfaceC10681h.a aVar;
        try {
            if (this.f21191c == null) {
                return;
            }
            if (abstractC10732c.f21318y) {
                this.f21206r.mo182e(abstractC10732c);
                m19966r(10);
            }
            abstractC10732c.f21311r = this.f21191c.size();
            if (this.f21201m > abstractC10732c.m20043b() || abstractC10732c.m20043b() > this.f21202n) {
                zMo182e = !abstractC10732c.f21318y;
            } else {
                synchronized (this.f21196h) {
                    zMo182e = this.f21196h.mo182e(abstractC10732c);
                }
            }
            synchronized (this.f21191c) {
                zMo182e2 = this.f21191c.mo182e(abstractC10732c);
            }
            if (!zMo182e) {
                this.f21202n = 0L;
                this.f21201m = 0L;
            }
            if (zMo182e2 && (aVar = this.f21193e) != null) {
                aVar.mo19950d(abstractC10732c);
            }
            AbstractC10732c abstractC10732c2 = this.f21205q;
            if (abstractC10732c2 == null || (abstractC10732c2 != null && abstractC10732c.m20043b() > this.f21205q.m20043b())) {
                this.f21205q = abstractC10732c;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: b */
    public void mo19817b(int i10) {
        this.f21203o = i10;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: c */
    public synchronized InterfaceC8324a.b mo19818c(AbstractC10730a abstractC10730a) {
        return m19963m(abstractC10730a, this.f21195g);
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: d */
    public InterfaceC10741l mo19956d(long j10) {
        long j11 = this.f21189a.f18428A.f155e;
        InterfaceC10741l interfaceC10741lMo178a = this.f21191c.mo178a((j10 - j11) - 100, j10 + j11);
        C0053d c0053d = new C0053d();
        if (interfaceC10741lMo178a != null && !interfaceC10741lMo178a.isEmpty()) {
            InterfaceC10740k it = interfaceC10741lMo178a.iterator();
            while (it.hasNext()) {
                AbstractC10732c next = it.next();
                if (next.mo20063v() && !next.m20060s()) {
                    c0053d.mo182e(next);
                }
            }
        }
        return c0053d;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: e */
    public void mo19957e() {
        this.f21202n = 0L;
        this.f21201m = 0L;
        this.f21204p = false;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: f */
    public void mo19819f(long j10) {
        AbstractC10732c abstractC10732cLast;
        m19967s();
        this.f21189a.f18453y.m20078f();
        this.f21189a.f18453y.m20074b();
        this.f21189a.f18453y.m20077e();
        this.f21189a.f18453y.m20076d();
        this.f21207s = new C0053d(4);
        if (j10 < 1000) {
            j10 = 0;
        }
        this.f21198j = j10;
        this.f21199k.m13535d();
        this.f21199k.f15800o = this.f21198j;
        InterfaceC10741l interfaceC10741l = this.f21191c;
        if (interfaceC10741l == null || (abstractC10732cLast = interfaceC10741l.last()) == null || abstractC10732cLast.m20064w()) {
            return;
        }
        this.f21205q = abstractC10732cLast;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: g */
    public void mo19958g(AbstractC5275a abstractC5275a) {
        this.f21192d = abstractC5275a;
        this.f21200l = false;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: h */
    public void mo19959h() {
        this.f21197i = true;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: i */
    public void mo19820i() {
        this.f21189a.m17222h();
        InterfaceC8324a interfaceC8324a = this.f21194f;
        if (interfaceC8324a != null) {
            interfaceC8324a.release();
        }
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: j */
    public void mo19960j(long j10) {
        m19967s();
        this.f21189a.f18453y.m20078f();
        this.f21189a.f18453y.m20074b();
        this.f21198j = j10;
    }

    @Override // p312y8.InterfaceC10681h
    /* renamed from: k */
    public void mo19961k() {
        this.f21204p = true;
    }

    /* renamed from: l */
    public final void m19962l(InterfaceC8324a.b bVar, InterfaceC10741l interfaceC10741l, InterfaceC10741l interfaceC10741l2) {
        bVar.m13535d();
        bVar.f15787b.m20069b(AbstractC8486c.m13880b());
        bVar.f15788c = 0;
        bVar.f15789d = (interfaceC10741l != null ? interfaceC10741l.size() : 0) + (interfaceC10741l2 != null ? interfaceC10741l2.size() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p078d9.InterfaceC8324a.b m19963m(p323z8.AbstractC10730a r23, p323z8.C10734e r24) {
        /*
            r22 = this;
            r0 = r22
            boolean r1 = r0.f21197i
            r2 = 0
            if (r1 == 0) goto Le
            d9.a r1 = r0.f21194f
            r1.mo13530e()
            r0.f21197i = r2
        Le:
            z8.l r1 = r0.f21191c
            r3 = 0
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r23.mo139p()
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            p312y8.AbstractC10677d.m19951a(r1)
            boolean r1 = r0.f21204p
            if (r1 == 0) goto L23
            d9.a$b r1 = r0.f21199k
            return r1
        L23:
            d9.a$b r9 = r0.f21199k
            r1 = r24
            long r4 = r1.f21320a
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r0.f21189a
            a9.c r1 = r1.f18428A
            long r6 = r1.f155e
            long r10 = r4 - r6
            r12 = 100
            long r10 = r10 - r12
            long r6 = r6 + r4
            z8.l r1 = r0.f21196h
            long r12 = r0.f21201m
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 > 0) goto L47
            long r14 = r0.f21202n
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 <= 0) goto L44
            goto L47
        L44:
            r10 = r12
        L45:
            r6 = r1
            goto L57
        L47:
            z8.l r1 = r0.f21191c
            z8.l r1 = r1.mo180c(r10, r6)
            if (r1 == 0) goto L51
            r0.f21196h = r1
        L51:
            r0.f21201m = r10
            r0.f21202n = r6
            r14 = r6
            goto L45
        L57:
            z8.l r1 = r0.f21207s
            r0.m19962l(r9, r1, r6)
            r4 = 1
            if (r1 == 0) goto L78
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L78
            d9.a$b r5 = r0.f21199k
            r5.f15786a = r4
            d9.a r7 = r0.f21194f
            r19 = 0
            r17 = r23
            r18 = r1
            r21 = r5
            r16 = r7
            r16.mo13526a(r17, r18, r19, r21)
        L78:
            d9.a$b r1 = r0.f21199k
            r1.f15786a = r2
            if (r6 == 0) goto Lba
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto Lba
            d9.a r4 = r0.f21194f
            z8.a r5 = r0.f21190b
            long r7 = r0.f21198j
            r4.mo13526a(r5, r6, r7, r9)
            r0.m19964n(r9)
            boolean r1 = r9.f15801p
            if (r1 == 0) goto Lb9
            z8.c r1 = r0.f21205q
            if (r1 == 0) goto La7
            boolean r1 = r1.m20064w()
            if (r1 == 0) goto La7
            r0.f21205q = r3
            y8.h$a r1 = r0.f21193e
            if (r1 == 0) goto La7
            r1.mo19949c()
        La7:
            long r1 = r9.f15799n
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lb1
            r9.f15799n = r10
        Lb1:
            long r1 = r9.f15800o
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lb9
            r9.f15800o = r14
        Lb9:
            return r9
        Lba:
            r9.f15801p = r4
            r9.f15799n = r10
            r9.f15800o = r14
            return r9
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p312y8.C10678e.m19963m(z8.a, z8.e):d9.a$b");
    }

    /* renamed from: n */
    public final void m19964n(InterfaceC8324a.b bVar) {
        boolean z10 = bVar.f15796k == 0;
        bVar.f15801p = z10;
        if (z10) {
            bVar.f15799n = -1L;
        }
        AbstractC10732c abstractC10732c = bVar.f15790e;
        bVar.f15790e = null;
        bVar.f15800o = abstractC10732c != null ? abstractC10732c.m20043b() : -1L;
        bVar.f15798m = bVar.f15787b.m20069b(AbstractC8486c.m13880b());
    }

    /* renamed from: o */
    public void mo19821o(C10734e c10734e) {
        this.f21195g = c10734e;
    }

    /* renamed from: p */
    public void m19965p(AbstractC5275a abstractC5275a) {
        InterfaceC10741l interfaceC10741lM2198a = abstractC5275a.m2203f(this.f21189a).m2204g(this.f21190b).m2205h(this.f21195g).m2198a();
        this.f21191c = interfaceC10741lM2198a;
        if (interfaceC10741lM2198a != null && !interfaceC10741lM2198a.isEmpty() && this.f21191c.first().f21290H == null) {
            InterfaceC10740k it = this.f21191c.iterator();
            while (it.hasNext()) {
                AbstractC10732c next = it.next();
                if (next != null) {
                    next.f21290H = this.f21189a.f18453y;
                }
            }
        }
        this.f21189a.f18453y.m20073a();
        InterfaceC10741l interfaceC10741l = this.f21191c;
        if (interfaceC10741l != null) {
            this.f21205q = interfaceC10741l.last();
        }
    }

    @Override // p312y8.InterfaceC10681h
    public void prepare() {
        m19965p(this.f21192d);
        this.f21202n = 0L;
        this.f21201m = 0L;
        InterfaceC10681h.a aVar = this.f21193e;
        if (aVar != null) {
            aVar.mo19948b();
            this.f21200l = true;
        }
    }

    /* renamed from: r */
    public synchronized void m19966r(int i10) {
        AbstractC10732c next;
        boolean zM20064w;
        InterfaceC10741l interfaceC10741l = this.f21191c;
        if (interfaceC10741l != null && !interfaceC10741l.isEmpty() && !this.f21206r.isEmpty()) {
            long jM13880b = AbstractC8486c.m13880b();
            InterfaceC10740k it = this.f21206r.iterator();
            while (it.hasNext() && (zM20064w = (next = it.next()).m20064w())) {
                it.remove();
                this.f21191c.mo179b(next);
                mo19822q(next);
                if (!zM20064w || AbstractC8486c.m13880b() - jM13880b > i10) {
                    break;
                }
            }
        }
    }

    /* renamed from: s */
    public void m19967s() {
        if (this.f21196h != null) {
            this.f21196h = new C0053d();
        }
        InterfaceC8324a interfaceC8324a = this.f21194f;
        if (interfaceC8324a != null) {
            interfaceC8324a.clear();
        }
    }

    @Override // p312y8.InterfaceC10681h
    public void start() {
        this.f21189a.m17221g(this.f21208t);
    }

    /* renamed from: q */
    public void mo19822q(AbstractC10732c abstractC10732c) {
    }
}

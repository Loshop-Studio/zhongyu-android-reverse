package p312y8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p010a9.C0053d;
import p010a9.C0054e;
import p010a9.C0056g;
import p029b9.AbstractC5216e;
import p029b9.InterfaceC5213b;
import p078d9.InterfaceC8324a;
import p102f9.AbstractC8485b;
import p312y8.InterfaceC10681h;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10739j;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;
import p323z8.InterfaceC10743n;
import tv.cjump.jni.NativeBitmapFactory;

/* renamed from: y8.a */
/* loaded from: classes5.dex */
public class C10674a extends C10678e {

    /* renamed from: u */
    public int f21115u;

    /* renamed from: v */
    public a f21116v;

    /* renamed from: w */
    public C10734e f21117w;

    /* renamed from: x */
    public final Object f21118x;

    /* renamed from: y */
    public int f21119y;

    /* renamed from: y8.a$a */
    public class a implements InterfaceC10739j {

        /* renamed from: a */
        public HandlerThread f21120a;

        /* renamed from: b */
        public C0053d f21121b = new C0053d();

        /* renamed from: c */
        public C0056g f21122c;

        /* renamed from: d */
        public InterfaceC5213b f21123d;

        /* renamed from: e */
        public int f21124e;

        /* renamed from: f */
        public int f21125f;

        /* renamed from: g */
        public int f21126g;

        /* renamed from: h */
        public HandlerC10818a f21127h;

        /* renamed from: i */
        public boolean f21128i;

        /* renamed from: y8.a$a$a, reason: collision with other inner class name */
        public class HandlerC10818a extends Handler {

            /* renamed from: a */
            public boolean f21130a;

            /* renamed from: b */
            public boolean f21131b;

            /* renamed from: c */
            public boolean f21132c;

            /* renamed from: d */
            public boolean f21133d;

            public HandlerC10818a(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            public final void m19855a(AbstractC10732c abstractC10732c) {
                if (abstractC10732c.m20064w()) {
                    return;
                }
                if (abstractC10732c.m20043b() <= C10674a.this.f21117w.f21320a + C10674a.this.f21189a.f18428A.f155e || abstractC10732c.f21318y) {
                    if (abstractC10732c.f21307n == 0 && abstractC10732c.m20056o()) {
                        return;
                    }
                    InterfaceC10743n interfaceC10743nM20046e = abstractC10732c.m20046e();
                    if (interfaceC10743nM20046e == null || interfaceC10743nM20046e.get() == null) {
                        m19857c(abstractC10732c, true);
                    }
                }
            }

            /* renamed from: b */
            public void m19856b() {
                sendEmptyMessage(1);
                sendEmptyMessageDelayed(4, C10674a.this.f21189a.f18428A.f155e);
            }

            /* renamed from: c */
            public final byte m19857c(AbstractC10732c abstractC10732c, boolean z10) {
                C0054e c0054e;
                if (!abstractC10732c.m20058q()) {
                    abstractC10732c.mo20067z(C10674a.this.f21190b, true);
                }
                C0054e c0054e2 = null;
                try {
                    AbstractC10732c abstractC10732cM19851w = a.this.m19851w(abstractC10732c, true, 20);
                    c0054e = abstractC10732cM19851w != null ? (C0054e) abstractC10732cM19851w.f21317x : null;
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                }
                try {
                    if (c0054e != null) {
                        c0054e.m200k();
                        abstractC10732c.f21317x = c0054e;
                        C10674a.this.f21116v.m19834A(abstractC10732c, 0, z10);
                        return (byte) 0;
                    }
                    AbstractC10732c abstractC10732cM19851w2 = a.this.m19851w(abstractC10732c, false, 50);
                    if (abstractC10732cM19851w2 != null) {
                        c0054e = (C0054e) abstractC10732cM19851w2.f21317x;
                    }
                    if (c0054e != null) {
                        abstractC10732cM19851w2.f21317x = null;
                        abstractC10732c.f21317x = AbstractC8485b.m13871a(abstractC10732c, C10674a.this.f21190b, c0054e);
                        C10674a.this.f21116v.m19834A(abstractC10732c, 0, z10);
                        return (byte) 0;
                    }
                    if (!z10) {
                        if (a.this.f21125f + AbstractC8485b.m13876f((int) abstractC10732c.f21308o, (int) abstractC10732c.f21309p) > a.this.f21124e) {
                            return (byte) 1;
                        }
                    }
                    C0054e c0054eM13871a = AbstractC8485b.m13871a(abstractC10732c, C10674a.this.f21190b, (C0054e) a.this.f21123d.acquire());
                    abstractC10732c.f21317x = c0054eM13871a;
                    boolean zM19834A = C10674a.this.f21116v.m19834A(abstractC10732c, a.this.m19839F(abstractC10732c), z10);
                    if (!zM19834A) {
                        m19864j(abstractC10732c, c0054eM13871a);
                    }
                    return !zM19834A ? (byte) 1 : (byte) 0;
                } catch (Exception unused3) {
                    c0054e2 = c0054e;
                    m19864j(abstractC10732c, c0054e2);
                    return (byte) 1;
                } catch (OutOfMemoryError unused4) {
                    c0054e2 = c0054e;
                    m19864j(abstractC10732c, c0054e2);
                    return (byte) 1;
                }
            }

            /* renamed from: d */
            public boolean m19858d(AbstractC10732c abstractC10732c) {
                C0054e c0054eM13871a;
                if (!abstractC10732c.m20058q()) {
                    abstractC10732c.mo20067z(C10674a.this.f21190b, true);
                }
                try {
                    c0054eM13871a = (C0054e) a.this.f21123d.acquire();
                    try {
                        c0054eM13871a = AbstractC8485b.m13871a(abstractC10732c, C10674a.this.f21190b, c0054eM13871a);
                        abstractC10732c.f21317x = c0054eM13871a;
                        return true;
                    } catch (Exception unused) {
                        if (c0054eM13871a != null) {
                            a.this.f21123d.mo2108a(c0054eM13871a);
                        }
                        abstractC10732c.f21317x = null;
                        return false;
                    } catch (OutOfMemoryError unused2) {
                        if (c0054eM13871a != null) {
                            a.this.f21123d.mo2108a(c0054eM13871a);
                        }
                        abstractC10732c.f21317x = null;
                        return false;
                    }
                } catch (Exception unused3) {
                    c0054eM13871a = null;
                } catch (OutOfMemoryError unused4) {
                    c0054eM13871a = null;
                }
            }

            /* renamed from: e */
            public final long m19859e() {
                long j10 = C10674a.this.f21117w.f21320a;
                a aVar = a.this;
                C10674a c10674a = C10674a.this;
                if (j10 <= c10674a.f21195g.f21320a - c10674a.f21189a.f18428A.f155e) {
                    aVar.m19849u();
                    C10674a.this.f21117w.m20069b(C10674a.this.f21195g.f21320a);
                    sendEmptyMessage(3);
                    return 0L;
                }
                float fM19853y = aVar.m19853y();
                AbstractC10732c abstractC10732cFirst = a.this.f21121b.first();
                long jM20043b = abstractC10732cFirst != null ? abstractC10732cFirst.m20043b() - C10674a.this.f21195g.f21320a : 0L;
                C10674a c10674a2 = C10674a.this;
                long j11 = c10674a2.f21189a.f18428A.f155e;
                long j12 = 2 * j11;
                if (fM19853y < 0.6f && jM20043b > j11) {
                    c10674a2.f21117w.m20069b(C10674a.this.f21195g.f21320a);
                    removeMessages(3);
                    sendEmptyMessage(3);
                    return 0L;
                }
                if (fM19853y > 0.4f && jM20043b < (-j12)) {
                    removeMessages(4);
                    sendEmptyMessage(4);
                    return 0L;
                }
                if (fM19853y >= 0.9f) {
                    return 0L;
                }
                long j13 = c10674a2.f21117w.f21320a - C10674a.this.f21195g.f21320a;
                if (abstractC10732cFirst != null && abstractC10732cFirst.m20064w()) {
                    C10674a c10674a3 = C10674a.this;
                    if (j13 < (-c10674a3.f21189a.f18428A.f155e)) {
                        c10674a3.f21117w.m20069b(C10674a.this.f21195g.f21320a);
                        sendEmptyMessage(8);
                        sendEmptyMessage(3);
                        return 0L;
                    }
                }
                if (j13 > j12) {
                    return 0L;
                }
                removeMessages(3);
                sendEmptyMessage(3);
                return 0L;
            }

            /* renamed from: f */
            public void m19860f(boolean z10) {
                this.f21131b = !z10;
            }

            /* renamed from: g */
            public void m19861g() {
                this.f21130a = true;
                removeCallbacksAndMessages(null);
                sendEmptyMessage(6);
            }

            /* renamed from: h */
            public final void m19862h() {
                InterfaceC10741l interfaceC10741lMo178a;
                try {
                    C10674a c10674a = C10674a.this;
                    long j10 = c10674a.f21195g.f21320a;
                    long j11 = c10674a.f21189a.f18428A.f155e;
                    interfaceC10741lMo178a = c10674a.f21191c.mo178a(j10 - j11, (2 * j11) + j10);
                } catch (Exception unused) {
                    interfaceC10741lMo178a = null;
                }
                if (interfaceC10741lMo178a == null || interfaceC10741lMo178a.isEmpty()) {
                    return;
                }
                InterfaceC10740k it = interfaceC10741lMo178a.iterator();
                while (it.hasNext() && !this.f21130a) {
                    AbstractC10732c next = it.next();
                    if (!next.m20055n()) {
                        DanmakuContext danmakuContext = C10674a.this.f21189a;
                        danmakuContext.f18454z.m19869b(next, 0, 0, null, true, danmakuContext);
                    }
                    if (!next.m20056o()) {
                        if (!next.m20058q()) {
                            next.mo20067z(C10674a.this.f21190b, true);
                        }
                        if (!next.m20062u()) {
                            next.m20038A(C10674a.this.f21190b, true);
                        }
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void handleMessage(android.os.Message r9) {
                /*
                    Method dump skipped, instructions count: 470
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p312y8.C10674a.a.HandlerC10818a.handleMessage(android.os.Message):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x0187 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
            /* renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long m19863i(boolean r25) {
                /*
                    Method dump skipped, instructions count: 446
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p312y8.C10674a.a.HandlerC10818a.m19863i(boolean):long");
            }

            /* renamed from: j */
            public final void m19864j(AbstractC10732c abstractC10732c, C0054e c0054e) {
                if (c0054e == null) {
                    c0054e = (C0054e) abstractC10732c.f21317x;
                }
                abstractC10732c.f21317x = null;
                if (c0054e == null) {
                    return;
                }
                c0054e.destroy();
                a.this.f21123d.mo2108a(c0054e);
            }

            /* renamed from: k */
            public void m19865k(long j10) {
                removeMessages(3);
                this.f21132c = true;
                sendEmptyMessage(19);
                C10674a.this.f21117w.m20069b(C10674a.this.f21195g.f21320a + j10);
                sendEmptyMessage(3);
            }

            /* renamed from: l */
            public void m19866l() {
                this.f21133d = true;
            }

            /* renamed from: m */
            public void m19867m() {
                sendEmptyMessage(19);
                this.f21130a = false;
                removeMessages(16);
                sendEmptyMessage(16);
                sendEmptyMessageDelayed(4, C10674a.this.f21189a.f18428A.f155e);
            }
        }

        public a(int i10, int i11) {
            C0056g c0056g = new C0056g();
            this.f21122c = c0056g;
            this.f21123d = AbstractC5216e.m2109a(c0056g, 800);
            this.f21128i = false;
            this.f21125f = 0;
            this.f21124e = i10;
            this.f21126g = i11;
        }

        /* renamed from: A */
        public final boolean m19834A(AbstractC10732c abstractC10732c, int i10, boolean z10) {
            while (true) {
                if (this.f21125f + i10 <= this.f21124e || this.f21121b.size() <= 0) {
                    break;
                }
                AbstractC10732c abstractC10732cFirst = this.f21121b.first();
                if (abstractC10732cFirst.m20064w()) {
                    m19847s(false, abstractC10732cFirst, abstractC10732c);
                    this.f21121b.mo179b(abstractC10732cFirst);
                } else if (!z10) {
                    return false;
                }
            }
            this.f21121b.mo182e(abstractC10732c);
            this.f21125f += i10;
            return true;
        }

        /* renamed from: B */
        public void m19835B(long j10) {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a != null) {
                handlerC10818a.m19865k(j10);
            }
        }

        /* renamed from: C */
        public void m19836C() {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a == null) {
                return;
            }
            handlerC10818a.removeMessages(4);
            this.f21127h.sendEmptyMessage(4);
        }

        /* renamed from: D */
        public void m19837D() {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a != null) {
                handlerC10818a.m19867m();
            } else {
                m19841m();
            }
        }

        /* renamed from: E */
        public void m19838E(long j10) {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a == null) {
                return;
            }
            handlerC10818a.m19866l();
            this.f21127h.removeMessages(3);
            this.f21127h.obtainMessage(5, Long.valueOf(j10)).sendToTarget();
        }

        /* renamed from: F */
        public int m19839F(AbstractC10732c abstractC10732c) {
            InterfaceC10743n interfaceC10743n = abstractC10732c.f21317x;
            if (interfaceC10743n == null || interfaceC10743n.hasReferences()) {
                return 0;
            }
            return abstractC10732c.f21317x.size();
        }

        @Override // p323z8.InterfaceC10739j
        /* renamed from: a */
        public void mo19840a(AbstractC10732c abstractC10732c) {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a != null) {
                if (!abstractC10732c.f21318y) {
                    handlerC10818a.obtainMessage(2, abstractC10732c).sendToTarget();
                } else if (!abstractC10732c.f21319z) {
                    handlerC10818a.obtainMessage(18, abstractC10732c).sendToTarget();
                } else {
                    if (abstractC10732c.m20064w()) {
                        return;
                    }
                    this.f21127h.m19858d(abstractC10732c);
                }
            }
        }

        /* renamed from: m */
        public void m19841m() {
            this.f21128i = false;
            if (this.f21120a == null) {
                HandlerThread handlerThread = new HandlerThread("DFM Cache-Building Thread");
                this.f21120a = handlerThread;
                handlerThread.start();
            }
            if (this.f21127h == null) {
                this.f21127h = new HandlerC10818a(this.f21120a.getLooper());
            }
            this.f21127h.m19856b();
        }

        /* renamed from: n */
        public final long m19842n(AbstractC10732c abstractC10732c) {
            InterfaceC10743n interfaceC10743n = abstractC10732c.f21317x;
            if (interfaceC10743n == null) {
                return 0L;
            }
            if (interfaceC10743n.hasReferences()) {
                interfaceC10743n.mo194e();
                abstractC10732c.f21317x = null;
                return 0L;
            }
            long jM19839F = m19839F(abstractC10732c);
            interfaceC10743n.destroy();
            abstractC10732c.f21317x = null;
            return jM19839F;
        }

        /* renamed from: o */
        public final void m19843o() {
            while (true) {
                C0054e c0054e = (C0054e) this.f21123d.acquire();
                if (c0054e == null) {
                    return;
                } else {
                    c0054e.destroy();
                }
            }
        }

        /* renamed from: p */
        public final void m19844p() {
            m19845q(C10674a.this.f21195g.f21320a);
        }

        /* renamed from: q */
        public final void m19845q(long j10) {
            InterfaceC10740k it = this.f21121b.iterator();
            while (it.hasNext() && !this.f21128i) {
                AbstractC10732c next = it.next();
                if (!next.m20064w()) {
                    return;
                }
                synchronized (C10674a.this.f21118x) {
                    try {
                        C10674a.this.f21118x.wait(30L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                m19847s(false, next, null);
                it.remove();
            }
        }

        /* renamed from: r */
        public void m19846r() throws InterruptedException {
            this.f21128i = true;
            synchronized (C10674a.this.f21118x) {
                C10674a.this.f21118x.notifyAll();
            }
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a != null) {
                handlerC10818a.m19861g();
                this.f21127h = null;
            }
            HandlerThread handlerThread = this.f21120a;
            if (handlerThread != null) {
                try {
                    handlerThread.join();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                this.f21120a.quit();
                this.f21120a = null;
            }
        }

        /* renamed from: s */
        public void m19847s(boolean z10, AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
            InterfaceC10743n interfaceC10743nM20046e = abstractC10732c.m20046e();
            if (interfaceC10743nM20046e != null) {
                long jM19842n = m19842n(abstractC10732c);
                if (abstractC10732c.m20064w()) {
                    C10674a.this.f21189a.m17216b().mo138o().m162e(abstractC10732c);
                }
                if (jM19842n <= 0) {
                    return;
                }
                this.f21125f = (int) (this.f21125f - jM19842n);
                this.f21123d.mo2108a((C0054e) interfaceC10743nM20046e);
            }
        }

        /* renamed from: t */
        public final void m19848t() {
            C0053d c0053d = this.f21121b;
            if (c0053d != null) {
                InterfaceC10740k it = c0053d.iterator();
                while (it.hasNext()) {
                    m19847s(true, it.next(), null);
                }
                this.f21121b.clear();
            }
            this.f21125f = 0;
        }

        /* renamed from: u */
        public final void m19849u() {
            m19850v(false);
        }

        /* renamed from: v */
        public final void m19850v(boolean z10) {
            C0053d c0053d = this.f21121b;
            if (c0053d != null) {
                InterfaceC10740k it = c0053d.iterator();
                while (it.hasNext()) {
                    AbstractC10732c next = it.next();
                    InterfaceC10743n interfaceC10743n = next.f21317x;
                    boolean z11 = interfaceC10743n != null && interfaceC10743n.hasReferences();
                    if (z10 && z11) {
                        if (interfaceC10743n.get() != null) {
                            this.f21125f -= interfaceC10743n.size();
                            interfaceC10743n.destroy();
                        }
                        m19847s(true, next, null);
                        it.remove();
                    } else if (next.m20060s()) {
                        m19847s(true, next, null);
                        it.remove();
                    }
                }
            }
            this.f21125f = 0;
        }

        /* renamed from: w */
        public final AbstractC10732c m19851w(AbstractC10732c abstractC10732c, boolean z10, int i10) {
            InterfaceC10740k it = this.f21121b.iterator();
            int i11 = 0;
            int iMo126c = !z10 ? C10674a.this.f21190b.mo126c() * 2 : 0;
            while (it.hasNext()) {
                int i12 = i11 + 1;
                if (i11 >= i10) {
                    return null;
                }
                AbstractC10732c next = it.next();
                InterfaceC10743n interfaceC10743nM20046e = next.m20046e();
                if (interfaceC10743nM20046e != null && interfaceC10743nM20046e.get() != null) {
                    if (next.f21308o != abstractC10732c.f21308o || next.f21309p != abstractC10732c.f21309p || next.f21303j != abstractC10732c.f21303j || next.f21305l != abstractC10732c.f21305l || next.f21299f != abstractC10732c.f21299f || !next.f21296c.equals(abstractC10732c.f21296c) || next.f21298e != abstractC10732c.f21298e) {
                        if (z10) {
                            continue;
                        } else {
                            if (!next.m20064w()) {
                                return null;
                            }
                            if (interfaceC10743nM20046e.hasReferences()) {
                                continue;
                            } else {
                                float fMo195f = interfaceC10743nM20046e.mo195f() - abstractC10732c.f21308o;
                                float fMo191b = interfaceC10743nM20046e.mo191b() - abstractC10732c.f21309p;
                                if (fMo195f >= 0.0f) {
                                    float f10 = iMo126c;
                                    if (fMo195f > f10 || fMo191b < 0.0f || fMo191b > f10) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    return next;
                }
                i11 = i12;
            }
            return null;
        }

        /* renamed from: x */
        public long m19852x() {
            AbstractC10732c abstractC10732cFirst;
            C0053d c0053d = this.f21121b;
            if (c0053d == null || c0053d.size() <= 0 || (abstractC10732cFirst = this.f21121b.first()) == null) {
                return 0L;
            }
            return abstractC10732cFirst.m20043b();
        }

        /* renamed from: y */
        public float m19853y() {
            int i10 = this.f21124e;
            if (i10 == 0) {
                return 0.0f;
            }
            return this.f21125f / i10;
        }

        /* renamed from: z */
        public void m19854z(int i10) {
            HandlerC10818a handlerC10818a = this.f21127h;
            if (handlerC10818a != null) {
                handlerC10818a.m19860f(i10 == 1);
            }
        }
    }

    public C10674a(C10734e c10734e, DanmakuContext danmakuContext, InterfaceC10681h.a aVar, int i10) throws NoSuchFieldException, SecurityException {
        super(c10734e, danmakuContext, aVar);
        this.f21115u = 2;
        this.f21118x = new Object();
        NativeBitmapFactory.m18963g();
        this.f21115u = i10;
        if (NativeBitmapFactory.m18962f()) {
            this.f21115u = i10 * 2;
        }
        a aVar2 = new a(i10, 3);
        this.f21116v = aVar2;
        this.f21194f.mo13527b(aVar2);
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    /* renamed from: a */
    public void mo19816a(AbstractC10732c abstractC10732c) {
        super.mo19816a(abstractC10732c);
        a aVar = this.f21116v;
        if (aVar == null) {
            return;
        }
        aVar.mo19840a(abstractC10732c);
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    /* renamed from: b */
    public void mo19817b(int i10) {
        super.mo19817b(i10);
        a aVar = this.f21116v;
        if (aVar != null) {
            aVar.m19854z(i10);
        }
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    /* renamed from: c */
    public InterfaceC8324a.b mo19818c(AbstractC10730a abstractC10730a) {
        a aVar;
        InterfaceC8324a.b bVarMo19818c = super.mo19818c(abstractC10730a);
        synchronized (this.f21118x) {
            this.f21118x.notify();
        }
        if (bVarMo19818c != null && (aVar = this.f21116v) != null && bVarMo19818c.f15796k - bVarMo19818c.f15797l < -20) {
            aVar.m19836C();
            this.f21116v.m19835B(-this.f21189a.f18428A.f155e);
        }
        return bVarMo19818c;
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    /* renamed from: f */
    public void mo19819f(long j10) throws NoSuchFieldException, SecurityException {
        super.mo19819f(j10);
        if (this.f21116v == null) {
            start();
        }
        this.f21116v.m19838E(j10);
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    /* renamed from: i */
    public void mo19820i() throws InterruptedException {
        super.mo19820i();
        m19967s();
        this.f21194f.mo13527b(null);
        a aVar = this.f21116v;
        if (aVar != null) {
            aVar.m19846r();
            this.f21116v = null;
        }
        NativeBitmapFactory.m18964h();
    }

    @Override // p312y8.C10678e
    /* renamed from: o */
    public void mo19821o(C10734e c10734e) {
        this.f21195g = c10734e;
        C10734e c10734e2 = new C10734e();
        this.f21117w = c10734e2;
        c10734e2.m20069b(c10734e.f21320a);
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    public void prepare() {
        m19965p(this.f21192d);
        this.f21116v.m19841m();
    }

    @Override // p312y8.C10678e
    /* renamed from: q */
    public void mo19822q(AbstractC10732c abstractC10732c) {
        super.mo19822q(abstractC10732c);
        a aVar = this.f21116v;
        if (aVar != null) {
            int i10 = this.f21119y + 1;
            this.f21119y = i10;
            if (i10 > 5) {
                aVar.m19836C();
                this.f21119y = 0;
                return;
            }
            return;
        }
        InterfaceC10743n interfaceC10743nM20046e = abstractC10732c.m20046e();
        if (interfaceC10743nM20046e != null) {
            if (interfaceC10743nM20046e.hasReferences()) {
                interfaceC10743nM20046e.mo194e();
            } else {
                interfaceC10743nM20046e.destroy();
            }
            abstractC10732c.f21317x = null;
        }
    }

    @Override // p312y8.C10678e, p312y8.InterfaceC10681h
    public void start() throws NoSuchFieldException, SecurityException {
        super.start();
        NativeBitmapFactory.m18963g();
        a aVar = this.f21116v;
        if (aVar != null) {
            aVar.m19837D();
            return;
        }
        a aVar2 = new a(this.f21115u, 3);
        this.f21116v = aVar2;
        aVar2.m19841m();
        this.f21194f.mo13527b(this.f21116v);
    }
}

package p312y8;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import java.util.LinkedList;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p040c9.AbstractC5275a;
import p078d9.InterfaceC8324a;
import p102f9.AbstractC8484a;
import p102f9.AbstractC8486c;
import p312y8.InterfaceC10681h;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10741l;
import tv.cjump.jni.DeviceUtils;

/* renamed from: y8.c */
/* loaded from: classes5.dex */
public class HandlerC10676c extends Handler {

    /* renamed from: A */
    public boolean f21153A;

    /* renamed from: a */
    public DanmakuContext f21154a;

    /* renamed from: b */
    public long f21155b;

    /* renamed from: c */
    public boolean f21156c;

    /* renamed from: d */
    public long f21157d;

    /* renamed from: e */
    public boolean f21158e;

    /* renamed from: f */
    public d f21159f;

    /* renamed from: g */
    public C10734e f21160g;

    /* renamed from: h */
    public AbstractC5275a f21161h;

    /* renamed from: i */
    public InterfaceC10681h f21162i;

    /* renamed from: j */
    public InterfaceC10680g f21163j;

    /* renamed from: k */
    public boolean f21164k;

    /* renamed from: l */
    public AbstractC10730a f21165l;

    /* renamed from: m */
    public final InterfaceC8324a.b f21166m;

    /* renamed from: n */
    public LinkedList f21167n;

    /* renamed from: o */
    public AbstractC10682i f21168o;

    /* renamed from: p */
    public final boolean f21169p;

    /* renamed from: q */
    public long f21170q;

    /* renamed from: r */
    public long f21171r;

    /* renamed from: s */
    public long f21172s;

    /* renamed from: t */
    public long f21173t;

    /* renamed from: u */
    public long f21174u;

    /* renamed from: v */
    public boolean f21175v;

    /* renamed from: w */
    public long f21176w;

    /* renamed from: x */
    public long f21177x;

    /* renamed from: y */
    public boolean f21178y;

    /* renamed from: z */
    public boolean f21179z;

    /* renamed from: y8.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC10676c.this.f21155b = 0L;
            HandlerC10676c.this.f21158e = true;
            if (HandlerC10676c.this.f21159f != null) {
                HandlerC10676c.this.f21159f.mo12509b();
            }
        }
    }

    /* renamed from: y8.c$b */
    public class b extends AbstractC10682i {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jM13880b = AbstractC8486c.m13880b();
            while (!m19968a() && !HandlerC10676c.this.f21156c) {
                long jM13880b2 = AbstractC8486c.m13880b();
                if (HandlerC10676c.this.f21172s - (AbstractC8486c.m13880b() - jM13880b) > 1) {
                    AbstractC8486c.m13879a(1L);
                } else {
                    long jM19933Q = HandlerC10676c.this.m19933Q(jM13880b2);
                    if (jM19933Q < 0) {
                        AbstractC8486c.m13879a(60 - jM19933Q);
                    } else {
                        long jMo14127a = HandlerC10676c.this.f21163j.mo14127a();
                        if (jMo14127a > HandlerC10676c.this.f21171r) {
                            HandlerC10676c.this.f21160g.m20068a(jMo14127a);
                            HandlerC10676c.this.f21167n.clear();
                        }
                        if (!HandlerC10676c.this.f21164k) {
                            HandlerC10676c.this.m19937U(10000000L);
                        } else if (HandlerC10676c.this.f21166m.f15801p && HandlerC10676c.this.f21153A) {
                            long j10 = HandlerC10676c.this.f21166m.f15800o - HandlerC10676c.this.f21160g.f21320a;
                            if (j10 > 500) {
                                HandlerC10676c.this.m19921E();
                                HandlerC10676c.this.m19937U(j10 - 10);
                            }
                        }
                    }
                    jM13880b = jM13880b2;
                }
            }
        }
    }

    /* renamed from: y8.c$c */
    public class c implements InterfaceC10681h.a {

        /* renamed from: a */
        public final /* synthetic */ Runnable f21182a;

        public c(Runnable runnable) {
            this.f21182a = runnable;
        }

        @Override // p312y8.InterfaceC10681h.a
        /* renamed from: a */
        public void mo19947a(AbstractC10732c abstractC10732c) {
            if (HandlerC10676c.this.f21159f != null) {
                HandlerC10676c.this.f21159f.mo12511d(abstractC10732c);
            }
        }

        @Override // p312y8.InterfaceC10681h.a
        /* renamed from: b */
        public void mo19948b() {
            HandlerC10676c.this.m19917A();
            this.f21182a.run();
        }

        @Override // p312y8.InterfaceC10681h.a
        /* renamed from: c */
        public void mo19949c() {
            if (HandlerC10676c.this.f21159f != null) {
                HandlerC10676c.this.f21159f.mo12508a();
            }
        }

        @Override // p312y8.InterfaceC10681h.a
        /* renamed from: d */
        public void mo19950d(AbstractC10732c abstractC10732c) {
            if (abstractC10732c.m20064w()) {
                return;
            }
            long jM20043b = abstractC10732c.m20043b() - HandlerC10676c.this.f21160g.f21320a;
            if (jM20043b > 0) {
                HandlerC10676c.this.sendEmptyMessageDelayed(11, jM20043b);
            } else if (HandlerC10676c.this.f21179z) {
                HandlerC10676c.this.m19921E();
            }
        }
    }

    /* renamed from: y8.c$d */
    public interface d {
        /* renamed from: a */
        void mo12508a();

        /* renamed from: b */
        void mo12509b();

        /* renamed from: c */
        void mo12510c(C10734e c10734e);

        /* renamed from: d */
        void mo12511d(AbstractC10732c abstractC10732c);
    }

    public HandlerC10676c(Looper looper, InterfaceC10680g interfaceC10680g, boolean z10) {
        super(looper);
        this.f21155b = 0L;
        this.f21156c = true;
        this.f21160g = new C10734e();
        this.f21164k = true;
        this.f21166m = new InterfaceC8324a.b();
        this.f21167n = new LinkedList();
        this.f21170q = 30L;
        this.f21171r = 60L;
        this.f21172s = 16L;
        this.f21169p = Runtime.getRuntime().availableProcessors() > 3;
        this.f21153A = true ^ DeviceUtils.m18953f();
        m19939s(interfaceC10680g);
        if (z10) {
            m19932P(null);
        } else {
            m19946z(false);
        }
        this.f21164k = z10;
    }

    /* renamed from: A */
    public final void m19917A() {
        long jMax = Math.max(33L, (long) (16 * 2.5f));
        this.f21170q = jMax;
        this.f21171r = (long) (jMax * 2.5f);
        long jMax2 = Math.max(16L, 15L);
        this.f21172s = jMax2;
        this.f21173t = jMax2 + 3;
    }

    /* renamed from: B */
    public boolean m19918B() {
        return this.f21158e;
    }

    /* renamed from: C */
    public boolean m19919C() {
        return this.f21156c;
    }

    /* renamed from: D */
    public void m19920D(int i10, int i11) {
        AbstractC10730a abstractC10730a = this.f21165l;
        if (abstractC10730a == null) {
            return;
        }
        if (abstractC10730a.getWidth() == i10 && this.f21165l.getHeight() == i11) {
            return;
        }
        this.f21165l.mo132i(i10, i11);
        obtainMessage(10, Boolean.TRUE).sendToTarget();
    }

    /* renamed from: E */
    public final void m19921E() {
        if (this.f21179z) {
            InterfaceC10681h interfaceC10681h = this.f21162i;
            if (interfaceC10681h != null) {
                interfaceC10681h.mo19957e();
            }
            if (this.f21169p) {
                synchronized (this) {
                    this.f21167n.clear();
                }
                synchronized (this.f21162i) {
                    this.f21162i.notifyAll();
                }
            } else {
                this.f21167n.clear();
                removeMessages(2);
                sendEmptyMessage(2);
            }
            this.f21179z = false;
        }
    }

    /* renamed from: F */
    public void m19922F() {
        removeMessages(3);
        m19934R();
        sendEmptyMessage(7);
    }

    /* renamed from: G */
    public void m19923G() {
        sendEmptyMessage(5);
    }

    /* renamed from: H */
    public final void m19924H(Runnable runnable) {
        if (this.f21162i == null) {
            this.f21162i = m19940t(this.f21163j.mo14129c(), this.f21160g, this.f21163j.getContext(), this.f21163j.getWidth(), this.f21163j.getHeight(), this.f21163j.isHardwareAccelerated(), new c(runnable));
        } else {
            runnable.run();
        }
    }

    /* renamed from: I */
    public void m19925I() {
        sendEmptyMessage(6);
    }

    /* renamed from: J */
    public final void m19926J() throws InterruptedException {
        AbstractC10682i abstractC10682i = this.f21168o;
        if (abstractC10682i != null) {
            this.f21168o = null;
            synchronized (this.f21162i) {
                this.f21162i.notifyAll();
            }
            abstractC10682i.m19969b();
            try {
                abstractC10682i.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: K */
    public final synchronized void m19927K() {
        this.f21167n.addLast(Long.valueOf(AbstractC8486c.m13880b()));
        if (this.f21167n.size() > 500) {
            this.f21167n.removeFirst();
        }
    }

    /* renamed from: L */
    public void m19928L() {
        removeMessages(7);
        sendEmptyMessage(3);
    }

    /* renamed from: M */
    public void m19929M(d dVar) {
        this.f21159f = dVar;
    }

    /* renamed from: N */
    public void m19930N(DanmakuContext danmakuContext) {
        this.f21154a = danmakuContext;
    }

    /* renamed from: O */
    public void m19931O(AbstractC5275a abstractC5275a) {
        this.f21161h = abstractC5275a;
    }

    /* renamed from: P */
    public void m19932P(Long l10) {
        if (this.f21164k) {
            return;
        }
        this.f21164k = true;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(8, l10).sendToTarget();
    }

    /* renamed from: Q */
    public final long m19933Q(long j10) {
        long j11 = 0;
        if (!this.f21175v && !this.f21178y) {
            this.f21178y = true;
            long j12 = j10 - this.f21157d;
            if (!this.f21164k || this.f21166m.f15801p || this.f21179z) {
                this.f21160g.m20069b(j12);
                this.f21177x = 0L;
            } else {
                long j13 = j12 - this.f21160g.f21320a;
                long jMax = Math.max(this.f21172s, m19942v());
                if (j13 <= 2000) {
                    long j14 = this.f21166m.f15798m;
                    long j15 = this.f21170q;
                    if (j14 <= j15 && jMax <= j15) {
                        long j16 = this.f21172s;
                        long jMin = Math.min(this.f21170q, Math.max(j16, jMax + (j13 / j16)));
                        long j17 = this.f21174u;
                        long j18 = jMin - j17;
                        if (j18 > 3 && j18 < 8 && j17 >= this.f21172s && j17 <= this.f21170q) {
                            jMin = j17;
                        }
                        this.f21174u = jMin;
                        j11 = j13 - jMin;
                        j13 = jMin;
                    }
                }
                this.f21177x = j11;
                this.f21160g.m20068a(j13);
                j11 = j13;
            }
            d dVar = this.f21159f;
            if (dVar != null) {
                dVar.mo12510c(this.f21160g);
            }
            this.f21178y = false;
        }
        return j11;
    }

    /* renamed from: R */
    public final void m19934R() {
        if (this.f21179z) {
            m19933Q(AbstractC8486c.m13880b());
        }
    }

    /* renamed from: S */
    public final void m19935S() {
        if (this.f21156c) {
            return;
        }
        long jM19933Q = m19933Q(AbstractC8486c.m13880b());
        if (jM19933Q < 0) {
            removeMessages(2);
            sendEmptyMessageDelayed(2, 60 - jM19933Q);
            return;
        }
        long jMo14127a = this.f21163j.mo14127a();
        removeMessages(2);
        if (jMo14127a > this.f21171r) {
            this.f21160g.m20068a(jMo14127a);
            this.f21167n.clear();
        }
        if (!this.f21164k) {
            m19937U(10000000L);
            return;
        }
        InterfaceC8324a.b bVar = this.f21166m;
        if (bVar.f15801p && this.f21153A) {
            long j10 = bVar.f15800o - this.f21160g.f21320a;
            if (j10 > 500) {
                m19937U(j10 - 10);
                return;
            }
        }
        long j11 = this.f21172s;
        if (jMo14127a < j11) {
            sendEmptyMessageDelayed(2, j11 - jMo14127a);
        } else {
            sendEmptyMessage(2);
        }
    }

    /* renamed from: T */
    public final void m19936T() {
        if (this.f21168o != null) {
            return;
        }
        b bVar = new b("DFM Update");
        this.f21168o = bVar;
        bVar.start();
    }

    /* renamed from: U */
    public final void m19937U(long j10) {
        this.f21166m.f15802q = AbstractC8486c.m13880b();
        this.f21179z = true;
        if (!this.f21169p) {
            if (j10 == 10000000) {
                removeMessages(11);
                removeMessages(2);
                return;
            } else {
                removeMessages(11);
                removeMessages(2);
                sendEmptyMessageDelayed(11, j10);
                return;
            }
        }
        if (this.f21168o == null) {
            return;
        }
        try {
            synchronized (this.f21162i) {
                try {
                    if (j10 == 10000000) {
                        this.f21162i.wait();
                    } else {
                        this.f21162i.wait(j10);
                    }
                    sendEmptyMessage(11);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r12) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p312y8.HandlerC10676c.handleMessage(android.os.Message):void");
    }

    /* renamed from: r */
    public void m19938r(AbstractC10732c abstractC10732c) {
        if (this.f21162i != null) {
            abstractC10732c.f21290H = this.f21154a.f18453y;
            abstractC10732c.m20040C(this.f21160g);
            this.f21162i.mo19816a(abstractC10732c);
            obtainMessage(11).sendToTarget();
        }
    }

    /* renamed from: s */
    public final void m19939s(InterfaceC10680g interfaceC10680g) {
        this.f21163j = interfaceC10680g;
    }

    /* renamed from: t */
    public final InterfaceC10681h m19940t(boolean z10, C10734e c10734e, Context context, int i10, int i11, boolean z11, InterfaceC10681h.a aVar) {
        AbstractC10730a abstractC10730aM17216b = this.f21154a.m17216b();
        this.f21165l = abstractC10730aM17216b;
        abstractC10730aM17216b.mo132i(i10, i11);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f21165l.mo127d(displayMetrics.density, displayMetrics.densityDpi, displayMetrics.scaledDensity);
        this.f21165l.mo124a(this.f21154a.f18431c);
        this.f21165l.mo136m(z11);
        InterfaceC10681h c10674a = z10 ? new C10674a(c10734e, this.f21154a, aVar, (AbstractC8484a.m13870a(context) * 1048576) / 3) : new C10678e(c10734e, this.f21154a, aVar);
        c10674a.mo19958g(this.f21161h);
        c10674a.prepare();
        obtainMessage(10, Boolean.FALSE).sendToTarget();
        return c10674a;
    }

    /* renamed from: u */
    public InterfaceC8324a.b m19941u(Canvas canvas) {
        if (this.f21162i == null) {
            return this.f21166m;
        }
        if (!this.f21156c && !this.f21179z) {
            this.f21154a.getClass();
        }
        this.f21165l.mo140q(canvas);
        this.f21166m.m13536e(this.f21162i.mo19818c(this.f21165l));
        m19927K();
        return this.f21166m;
    }

    /* renamed from: v */
    public final synchronized long m19942v() {
        int size = this.f21167n.size();
        if (size <= 0) {
            return 0L;
        }
        return (((Long) this.f21167n.getLast()).longValue() - ((Long) this.f21167n.getFirst()).longValue()) / size;
    }

    /* renamed from: w */
    public DanmakuContext m19943w() {
        return this.f21154a;
    }

    /* renamed from: x */
    public long m19944x() {
        long jM13880b;
        long j10;
        if (!this.f21158e) {
            return 0L;
        }
        if (this.f21175v) {
            return this.f21176w;
        }
        if (this.f21156c || !this.f21179z) {
            jM13880b = this.f21160g.f21320a;
            j10 = this.f21177x;
        } else {
            jM13880b = AbstractC8486c.m13880b();
            j10 = this.f21157d;
        }
        return jM13880b - j10;
    }

    /* renamed from: y */
    public InterfaceC10741l m19945y() {
        InterfaceC10681h interfaceC10681h = this.f21162i;
        if (interfaceC10681h != null) {
            return interfaceC10681h.mo19956d(m19944x());
        }
        return null;
    }

    /* renamed from: z */
    public long m19946z(boolean z10) {
        if (!this.f21164k) {
            return this.f21160g.f21320a;
        }
        this.f21164k = false;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(9, Boolean.valueOf(z10)).sendToTarget();
        return this.f21160g.f21320a;
    }
}

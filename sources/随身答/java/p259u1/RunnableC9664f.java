package p259u1;

import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9419c;
import p229r1.InterfaceC9425i;
import p239s1.InterfaceC9465a;
import p249t1.C9607a;
import p269v1.C9751d;
import p279w1.C9796a;
import p279w1.C9797b;
import p279w1.C9800e;
import p279w1.InterfaceC9798c;
import p279w1.InterfaceC9799d;
import p289x1.C9864a;
import p289x1.C9865b;

/* renamed from: u1.f */
/* loaded from: classes4.dex */
public class RunnableC9664f implements Runnable {

    /* renamed from: q */
    public static final ExecutorService f17043q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9353c.m15322y("OkDownload Cancel Block", false));

    /* renamed from: a */
    public final int f17044a;

    /* renamed from: b */
    public final C6593a f17045b;

    /* renamed from: c */
    public final C9419c f17046c;

    /* renamed from: d */
    public final C9662d f17047d;

    /* renamed from: i */
    public long f17052i;

    /* renamed from: j */
    public volatile InterfaceC9465a f17053j;

    /* renamed from: k */
    public long f17054k;

    /* renamed from: l */
    public volatile Thread f17055l;

    /* renamed from: n */
    public final InterfaceC9425i f17057n;

    /* renamed from: e */
    public final List f17048e = new ArrayList();

    /* renamed from: f */
    public final List f17049f = new ArrayList();

    /* renamed from: g */
    public int f17050g = 0;

    /* renamed from: h */
    public int f17051h = 0;

    /* renamed from: o */
    public final AtomicBoolean f17058o = new AtomicBoolean(false);

    /* renamed from: p */
    public final Runnable f17059p = new a();

    /* renamed from: m */
    public final C9607a f17056m = C9315d.m15182k().m15184b();

    /* renamed from: u1.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC9664f.this.m16093q();
        }
    }

    public RunnableC9664f(int i9, C6593a c6593a, C9419c c9419c, C9662d c9662d, InterfaceC9425i interfaceC9425i) {
        this.f17044a = i9;
        this.f17045b = c6593a;
        this.f17047d = c9662d;
        this.f17046c = c9419c;
        this.f17057n = interfaceC9425i;
    }

    /* renamed from: b */
    public static RunnableC9664f m16077b(int i9, C6593a c6593a, C9419c c9419c, C9662d c9662d, InterfaceC9425i interfaceC9425i) {
        return new RunnableC9664f(i9, c6593a, c9419c, c9662d, interfaceC9425i);
    }

    /* renamed from: a */
    public void m16078a() {
        if (this.f17058o.get() || this.f17055l == null) {
            return;
        }
        this.f17055l.interrupt();
    }

    /* renamed from: c */
    public void m16079c() {
        if (this.f17054k == 0) {
            return;
        }
        this.f17056m.m15841a().mo15174f(this.f17045b, this.f17044a, this.f17054k);
        this.f17054k = 0L;
    }

    /* renamed from: d */
    public int m16080d() {
        return this.f17044a;
    }

    /* renamed from: e */
    public C9662d m16081e() {
        return this.f17047d;
    }

    /* renamed from: f */
    public synchronized InterfaceC9465a m16082f() {
        try {
            if (this.f17047d.m16046f()) {
                throw InterruptException.f5333a;
            }
            if (this.f17053j == null) {
                String strM16044d = this.f17047d.m16044d();
                if (strM16044d == null) {
                    strM16044d = this.f17046c.m15531l();
                }
                AbstractC9353c.m15306i("DownloadChain", "create connection on url: " + strM16044d);
                this.f17053j = C9315d.m15182k().m15185c().mo15643a(strM16044d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17053j;
    }

    /* renamed from: g */
    public InterfaceC9425i m16083g() {
        return this.f17057n;
    }

    /* renamed from: h */
    public C9419c m16084h() {
        return this.f17046c;
    }

    /* renamed from: i */
    public C9751d m16085i() {
        return this.f17047d.m16042b();
    }

    /* renamed from: j */
    public long m16086j() {
        return this.f17052i;
    }

    /* renamed from: k */
    public C6593a m16087k() {
        return this.f17045b;
    }

    /* renamed from: l */
    public void m16088l(long j9) {
        this.f17054k += j9;
    }

    /* renamed from: m */
    public boolean m16089m() {
        return this.f17058o.get();
    }

    /* renamed from: n */
    public long m16090n() {
        if (this.f17051h == this.f17049f.size()) {
            this.f17051h--;
        }
        return m16092p();
    }

    /* renamed from: o */
    public InterfaceC9465a.a m16091o() {
        if (this.f17047d.m16046f()) {
            throw InterruptException.f5333a;
        }
        List list = this.f17048e;
        int i9 = this.f17050g;
        this.f17050g = i9 + 1;
        return ((InterfaceC9798c) list.get(i9)).mo16602b(this);
    }

    /* renamed from: p */
    public long m16092p() throws InterruptException {
        if (this.f17047d.m16046f()) {
            throw InterruptException.f5333a;
        }
        List list = this.f17049f;
        int i9 = this.f17051h;
        this.f17051h = i9 + 1;
        return ((InterfaceC9799d) list.get(i9)).mo16601a(this);
    }

    /* renamed from: q */
    public synchronized void m16093q() {
        try {
            if (this.f17053j != null) {
                this.f17053j.release();
                AbstractC9353c.m15306i("DownloadChain", "release connection " + this.f17053j + " task[" + this.f17045b.mo4589c() + "] block[" + this.f17044a + "]");
            }
            this.f17053j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public void m16094r() {
        f17043q.execute(this.f17059p);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m16089m()) {
            throw new IllegalAccessError("The chain has been finished!");
        }
        this.f17055l = Thread.currentThread();
        try {
            m16097u();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f17058o.set(true);
            m16094r();
            throw th;
        }
        this.f17058o.set(true);
        m16094r();
    }

    /* renamed from: s */
    public void m16095s() {
        this.f17050g = 1;
        m16093q();
    }

    /* renamed from: t */
    public void m16096t(long j9) {
        this.f17052i = j9;
    }

    /* renamed from: u */
    public void m16097u() throws InterruptException {
        C9607a c9607aM15184b = C9315d.m15182k().m15184b();
        C9800e c9800e = new C9800e();
        C9796a c9796a = new C9796a();
        this.f17048e.add(c9800e);
        this.f17048e.add(c9796a);
        this.f17048e.add(new C9865b());
        this.f17048e.add(new C9864a());
        this.f17050g = 0;
        InterfaceC9465a.a aVarM16091o = m16091o();
        if (this.f17047d.m16046f()) {
            throw InterruptException.f5333a;
        }
        c9607aM15184b.m15841a().mo15173d(this.f17045b, this.f17044a, m16086j());
        C9797b c9797b = new C9797b(this.f17044a, aVarM16091o.mo15640e(), m16085i(), this.f17045b);
        this.f17049f.add(c9800e);
        this.f17049f.add(c9796a);
        this.f17049f.add(c9797b);
        this.f17051h = 0;
        c9607aM15184b.m15841a().mo15172c(this.f17045b, this.f17044a, m16092p());
    }
}

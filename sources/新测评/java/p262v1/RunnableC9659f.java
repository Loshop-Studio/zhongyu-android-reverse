package p262v1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9126c;
import p229s1.InterfaceC9132i;
import p240t1.InterfaceC9377a;
import p251u1.C9534a;
import p272w1.C9730d;
import p282x1.C9839a;
import p282x1.C9840b;
import p282x1.C9843e;
import p282x1.InterfaceC9841c;
import p282x1.InterfaceC9842d;
import p292y1.C9901a;
import p292y1.C9902b;

/* renamed from: v1.f */
/* loaded from: classes4.dex */
public class RunnableC9659f implements Runnable {

    /* renamed from: q */
    public static final ExecutorService f16891q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC8999c.m15141y("OkDownload Cancel Block", false));

    /* renamed from: a */
    public final int f16892a;

    /* renamed from: b */
    public final C6327a f16893b;

    /* renamed from: c */
    public final C9126c f16894c;

    /* renamed from: d */
    public final C9657d f16895d;

    /* renamed from: i */
    public long f16900i;

    /* renamed from: j */
    public volatile InterfaceC9377a f16901j;

    /* renamed from: k */
    public long f16902k;

    /* renamed from: l */
    public volatile Thread f16903l;

    /* renamed from: n */
    public final InterfaceC9132i f16905n;

    /* renamed from: e */
    public final List f16896e = new ArrayList();

    /* renamed from: f */
    public final List f16897f = new ArrayList();

    /* renamed from: g */
    public int f16898g = 0;

    /* renamed from: h */
    public int f16899h = 0;

    /* renamed from: o */
    public final AtomicBoolean f16906o = new AtomicBoolean(false);

    /* renamed from: p */
    public final Runnable f16907p = new a();

    /* renamed from: m */
    public final C9534a f16904m = C8879d.m14905k().m14907b();

    /* renamed from: v1.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC9659f.this.m16132q();
        }
    }

    public RunnableC9659f(int i10, C6327a c6327a, C9126c c9126c, C9657d c9657d, InterfaceC9132i interfaceC9132i) {
        this.f16892a = i10;
        this.f16893b = c6327a;
        this.f16895d = c9657d;
        this.f16894c = c9126c;
        this.f16905n = interfaceC9132i;
    }

    /* renamed from: b */
    public static RunnableC9659f m16116b(int i10, C6327a c6327a, C9126c c9126c, C9657d c9657d, InterfaceC9132i interfaceC9132i) {
        return new RunnableC9659f(i10, c6327a, c9126c, c9657d, interfaceC9132i);
    }

    /* renamed from: a */
    public void m16117a() {
        if (this.f16906o.get() || this.f16903l == null) {
            return;
        }
        this.f16903l.interrupt();
    }

    /* renamed from: c */
    public void m16118c() {
        if (this.f16902k == 0) {
            return;
        }
        this.f16904m.m15910a().mo14898g(this.f16893b, this.f16892a, this.f16902k);
        this.f16902k = 0L;
    }

    /* renamed from: d */
    public int m16119d() {
        return this.f16892a;
    }

    /* renamed from: e */
    public C9657d m16120e() {
        return this.f16895d;
    }

    /* renamed from: f */
    public synchronized InterfaceC9377a m16121f() {
        try {
            if (this.f16895d.m16085f()) {
                throw InterruptException.f4725a;
            }
            if (this.f16901j == null) {
                String strM16083d = this.f16895d.m16083d();
                if (strM16083d == null) {
                    strM16083d = this.f16894c.m15477l();
                }
                AbstractC8999c.m15125i("DownloadChain", "create connection on url: " + strM16083d);
                this.f16901j = C8879d.m14905k().m14908c().mo15679a(strM16083d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16901j;
    }

    /* renamed from: g */
    public InterfaceC9132i m16122g() {
        return this.f16905n;
    }

    /* renamed from: h */
    public C9126c m16123h() {
        return this.f16894c;
    }

    /* renamed from: i */
    public C9730d m16124i() {
        return this.f16895d.m16081b();
    }

    /* renamed from: j */
    public long m16125j() {
        return this.f16900i;
    }

    /* renamed from: k */
    public C6327a m16126k() {
        return this.f16893b;
    }

    /* renamed from: l */
    public void m16127l(long j10) {
        this.f16902k += j10;
    }

    /* renamed from: m */
    public boolean m16128m() {
        return this.f16906o.get();
    }

    /* renamed from: n */
    public long m16129n() {
        if (this.f16899h == this.f16897f.size()) {
            this.f16899h--;
        }
        return m16131p();
    }

    /* renamed from: o */
    public InterfaceC9377a.a m16130o() {
        if (this.f16895d.m16085f()) {
            throw InterruptException.f4725a;
        }
        List list = this.f16896e;
        int i10 = this.f16898g;
        this.f16898g = i10 + 1;
        return ((InterfaceC9841c) list.get(i10)).mo16482a(this);
    }

    /* renamed from: p */
    public long m16131p() throws InterruptException {
        if (this.f16895d.m16085f()) {
            throw InterruptException.f4725a;
        }
        List list = this.f16897f;
        int i10 = this.f16899h;
        this.f16899h = i10 + 1;
        return ((InterfaceC9842d) list.get(i10)).mo16483b(this);
    }

    /* renamed from: q */
    public synchronized void m16132q() {
        try {
            if (this.f16901j != null) {
                this.f16901j.release();
                AbstractC8999c.m15125i("DownloadChain", "release connection " + this.f16901j + " task[" + this.f16893b.mo4385c() + "] block[" + this.f16892a + "]");
            }
            this.f16901j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public void m16133r() {
        f16891q.execute(this.f16907p);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m16128m()) {
            throw new IllegalAccessError("The chain has been finished!");
        }
        this.f16903l = Thread.currentThread();
        try {
            m16136u();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f16906o.set(true);
            m16133r();
            throw th;
        }
        this.f16906o.set(true);
        m16133r();
    }

    /* renamed from: s */
    public void m16134s() {
        this.f16898g = 1;
        m16132q();
    }

    /* renamed from: t */
    public void m16135t(long j10) {
        this.f16900i = j10;
    }

    /* renamed from: u */
    public void m16136u() throws InterruptException {
        C9534a c9534aM14907b = C8879d.m14905k().m14907b();
        C9843e c9843e = new C9843e();
        C9839a c9839a = new C9839a();
        this.f16896e.add(c9843e);
        this.f16896e.add(c9839a);
        this.f16896e.add(new C9902b());
        this.f16896e.add(new C9901a());
        this.f16898g = 0;
        InterfaceC9377a.a aVarM16130o = m16130o();
        if (this.f16895d.m16085f()) {
            throw InterruptException.f4725a;
        }
        c9534aM14907b.m15910a().mo14897e(this.f16893b, this.f16892a, m16125j());
        C9840b c9840b = new C9840b(this.f16892a, aVarM16130o.mo15676e(), m16124i(), this.f16893b);
        this.f16897f.add(c9843e);
        this.f16897f.add(c9839a);
        this.f16897f.add(c9840b);
        this.f16899h = 0;
        c9534aM14907b.m15910a().mo14896d(this.f16893b, this.f16892a, m16131p());
    }
}

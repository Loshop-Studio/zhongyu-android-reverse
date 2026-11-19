package p281oe;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import je.AbstractC9735o;
import je.C9720a;
import je.C9733m;
import je.C9738r;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9726f;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import me.C10261a;
import okhttp3.CertificatePinner;
import okhttp3.internal.connection.RealConnection;
import okio.AsyncTimeout;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import pe.C10674a;
import pe.C10675b;
import pe.C10680g;
import pe.C10683j;
import se.C11192j;

/* renamed from: oe.e */
/* loaded from: classes6.dex */
public final class C10487e implements InterfaceC9725e {

    /* renamed from: c */
    public final C9742v f24900c;

    /* renamed from: d */
    public final C9743w f24901d;

    /* renamed from: e */
    public final boolean f24902e;

    /* renamed from: f */
    public final C10488f f24903f;

    /* renamed from: g */
    public final AbstractC9735o f24904g;

    /* renamed from: h */
    public final c f24905h;

    /* renamed from: i */
    public final AtomicBoolean f24906i;

    /* renamed from: j */
    public Object f24907j;

    /* renamed from: k */
    public C10486d f24908k;

    /* renamed from: l */
    public RealConnection f24909l;

    /* renamed from: m */
    public boolean f24910m;

    /* renamed from: n */
    public C10485c f24911n;

    /* renamed from: o */
    public boolean f24912o;

    /* renamed from: p */
    public boolean f24913p;

    /* renamed from: q */
    public boolean f24914q;

    /* renamed from: r */
    public volatile boolean f24915r;

    /* renamed from: s */
    public volatile C10485c f24916s;

    /* renamed from: t */
    public volatile RealConnection f24917t;

    /* renamed from: oe.e$a */
    public final class a implements Runnable {

        /* renamed from: c */
        public final InterfaceC9726f f24918c;

        /* renamed from: d */
        public volatile AtomicInteger f24919d;

        /* renamed from: e */
        public final /* synthetic */ C10487e f24920e;

        public a(C10487e c10487e, InterfaceC9726f responseCallback) {
            AbstractC9979u.m20294g(responseCallback, "responseCallback");
            this.f24920e = c10487e;
            this.f24918c = responseCallback;
            this.f24919d = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m21913a(ExecutorService executorService) {
            AbstractC9979u.m20294g(executorService, "executorService");
            C9733m c9733mM19526p = this.f24920e.m21898l().m19526p();
            if (AbstractC9920d.f23248h && Thread.holdsLock(c9733mM19526p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9733mM19526p);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f24920e.m21907u(interruptedIOException);
                    this.f24918c.mo7268a(this.f24920e, interruptedIOException);
                    this.f24920e.m21898l().m19526p().m19348f(this);
                }
            } catch (Throwable th) {
                this.f24920e.m21898l().m19526p().m19348f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final C10487e m21914b() {
            return this.f24920e;
        }

        /* renamed from: c */
        public final AtomicInteger m21915c() {
            return this.f24919d;
        }

        /* renamed from: d */
        public final String m21916d() {
            return this.f24920e.m21903q().m19592j().m19419i();
        }

        /* renamed from: e */
        public final void m21917e(a other) {
            AbstractC9979u.m20294g(other, "other");
            this.f24919d = other.f24919d;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            C9733m c9733mM19526p;
            String str = "OkHttp " + this.f24920e.m21908v();
            C10487e c10487e = this.f24920e;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c10487e.f24905h.enter();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f24918c.mo7269b(c10487e, c10487e.m21904r());
                            c9733mM19526p = c10487e.m21898l().m19526p();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                C11192j.f26882a.m24899g().m24892j("Callback failure for " + c10487e.m21890B(), 4, e10);
                            } else {
                                this.f24918c.mo7268a(c10487e, e10);
                            }
                            c9733mM19526p = c10487e.m21898l().m19526p();
                            c9733mM19526p.m19348f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            c10487e.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC10771b.m22973a(iOException, th);
                                this.f24918c.mo7268a(c10487e, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c10487e.m21898l().m19526p().m19348f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th = th4;
                }
                c9733mM19526p.m19348f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: oe.e$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f24921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10487e referent, Object obj) {
            super(referent);
            AbstractC9979u.m20294g(referent, "referent");
            this.f24921a = obj;
        }

        /* renamed from: a */
        public final Object m21918a() {
            return this.f24921a;
        }
    }

    /* renamed from: oe.e$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            C10487e.this.cancel();
        }
    }

    public C10487e(C9742v client, C9743w originalRequest, boolean z10) {
        AbstractC9979u.m20294g(client, "client");
        AbstractC9979u.m20294g(originalRequest, "originalRequest");
        this.f24900c = client;
        this.f24901d = originalRequest;
        this.f24902e = z10;
        this.f24903f = client.m19523m().m19324a();
        this.f24904g = client.m19528r().mo19383a(this);
        c cVar = new c();
        cVar.timeout(client.m19519i(), TimeUnit.MILLISECONDS);
        this.f24905h = cVar;
        this.f24906i = new AtomicBoolean();
        this.f24914q = true;
    }

    /* renamed from: A */
    public final IOException m21889A(IOException iOException) {
        if (this.f24910m || !this.f24905h.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: B */
    public final String m21890B() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f24902e ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(m21908v());
        return sb2.toString();
    }

    @Override // je.InterfaceC9725e
    /* renamed from: a */
    public void mo19318a(InterfaceC9726f responseCallback) {
        AbstractC9979u.m20294g(responseCallback, "responseCallback");
        if (!this.f24906i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m21893g();
        this.f24900c.m19526p().m19343a(new a(this, responseCallback));
    }

    @Override // je.InterfaceC9725e
    public void cancel() {
        if (this.f24915r) {
            return;
        }
        this.f24915r = true;
        C10485c c10485c = this.f24916s;
        if (c10485c != null) {
            c10485c.m21857b();
        }
        RealConnection realConnection = this.f24917t;
        if (realConnection != null) {
            realConnection.m21994e();
        }
        this.f24904g.m19362f(this);
    }

    /* renamed from: e */
    public final void m21891e(RealConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        if (!AbstractC9920d.f23248h || Thread.holdsLock(connection)) {
            if (this.f24909l != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f24909l = connection;
            connection.m22004o().add(new b(this, this.f24907j));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // je.InterfaceC9725e
    public C9745y execute() {
        if (!this.f24906i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f24905h.enter();
        m21893g();
        try {
            this.f24900c.m19526p().m19344b(this);
            return m21904r();
        } finally {
            this.f24900c.m19526p().m19349g(this);
        }
    }

    /* renamed from: f */
    public final IOException m21892f(IOException iOException) throws IOException {
        Socket socketM21909w;
        boolean z10 = AbstractC9920d.f23248h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f24909l;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketM21909w = m21909w();
            }
            if (this.f24909l == null) {
                if (socketM21909w != null) {
                    AbstractC9920d.m20032n(socketM21909w);
                }
                this.f24904g.m19367k(this, realConnection);
            } else if (socketM21909w != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM21889A = m21889A(iOException);
        if (iOException == null) {
            this.f24904g.m19359c(this);
            return iOExceptionM21889A;
        }
        AbstractC9735o abstractC9735o = this.f24904g;
        AbstractC9979u.m20291d(iOExceptionM21889A);
        abstractC9735o.m19360d(this, iOExceptionM21889A);
        return iOExceptionM21889A;
    }

    /* renamed from: g */
    public final void m21893g() {
        this.f24907j = C11192j.f26882a.m24899g().mo24863h("response.body().close()");
        this.f24904g.m19361e(this);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C10487e clone() {
        return new C10487e(this.f24900c, this.f24901d, this.f24902e);
    }

    /* renamed from: i */
    public final C9720a m21895i(C9738r c9738r) {
        SSLSocketFactory sSLSocketFactoryM19513I;
        HostnameVerifier hostnameVerifierM19532v;
        CertificatePinner certificatePinnerM19521k;
        if (c9738r.m19420j()) {
            sSLSocketFactoryM19513I = this.f24900c.m19513I();
            hostnameVerifierM19532v = this.f24900c.m19532v();
            certificatePinnerM19521k = this.f24900c.m19521k();
        } else {
            sSLSocketFactoryM19513I = null;
            hostnameVerifierM19532v = null;
            certificatePinnerM19521k = null;
        }
        return new C9720a(c9738r.m19419i(), c9738r.m19424n(), this.f24900c.m19527q(), this.f24900c.m19512H(), sSLSocketFactoryM19513I, hostnameVerifierM19532v, certificatePinnerM19521k, this.f24900c.m19508D(), this.f24900c.m19507C(), this.f24900c.m19506B(), this.f24900c.m19524n(), this.f24900c.m19509E());
    }

    @Override // je.InterfaceC9725e
    public boolean isCanceled() {
        return this.f24915r;
    }

    /* renamed from: j */
    public final void m21896j(C9743w request, boolean z10) {
        AbstractC9979u.m20294g(request, "request");
        if (this.f24911n != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f24913p) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f24912o) {
                throw new IllegalStateException("Check failed.");
            }
            C10786q c10786q = C10786q.f26013a;
        }
        if (z10) {
            this.f24908k = new C10486d(this.f24903f, m21895i(request.m19592j()), this, this.f24904g);
        }
    }

    /* renamed from: k */
    public final void m21897k(boolean z10) {
        C10485c c10485c;
        synchronized (this) {
            if (!this.f24914q) {
                throw new IllegalStateException("released");
            }
            C10786q c10786q = C10786q.f26013a;
        }
        if (z10 && (c10485c = this.f24916s) != null) {
            c10485c.m21859d();
        }
        this.f24911n = null;
    }

    /* renamed from: l */
    public final C9742v m21898l() {
        return this.f24900c;
    }

    /* renamed from: m */
    public final RealConnection m21899m() {
        return this.f24909l;
    }

    /* renamed from: n */
    public final AbstractC9735o m21900n() {
        return this.f24904g;
    }

    /* renamed from: o */
    public final boolean m21901o() {
        return this.f24902e;
    }

    /* renamed from: p */
    public final C10485c m21902p() {
        return this.f24911n;
    }

    /* renamed from: q */
    public final C9743w m21903q() {
        return this.f24901d;
    }

    /* renamed from: r */
    public final C9745y m21904r() {
        ArrayList arrayList = new ArrayList();
        AbstractC10937b0.m23857B(arrayList, this.f24900c.m19533w());
        arrayList.add(new C10683j(this.f24900c));
        arrayList.add(new C10674a(this.f24900c.m19525o()));
        this.f24900c.m19518h();
        arrayList.add(new C10261a(null));
        arrayList.add(C10483a.f24867a);
        if (!this.f24902e) {
            AbstractC10937b0.m23857B(arrayList, this.f24900c.m19535y());
        }
        arrayList.add(new C10675b(this.f24902e));
        try {
            try {
                C9745y c9745yMo19477a = new C10680g(this, arrayList, 0, null, this.f24901d, this.f24900c.m19522l(), this.f24900c.m19510F(), this.f24900c.m19515K()).mo19477a(this.f24901d);
                if (isCanceled()) {
                    AbstractC9920d.m20031m(c9745yMo19477a);
                    throw new IOException("Canceled");
                }
                m21907u(null);
                return c9745yMo19477a;
            } catch (IOException e10) {
                IOException iOExceptionM21907u = m21907u(e10);
                AbstractC9979u.m20292e(iOExceptionM21907u, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM21907u;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m21907u(null);
            }
            throw th;
        }
    }

    @Override // je.InterfaceC9725e
    public C9743w request() {
        return this.f24901d;
    }

    /* renamed from: s */
    public final C10485c m21905s(C10680g chain) throws IOException {
        AbstractC9979u.m20294g(chain, "chain");
        synchronized (this) {
            if (!this.f24914q) {
                throw new IllegalStateException("released");
            }
            if (this.f24913p) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f24912o) {
                throw new IllegalStateException("Check failed.");
            }
            C10786q c10786q = C10786q.f26013a;
        }
        C10486d c10486d = this.f24908k;
        AbstractC9979u.m20291d(c10486d);
        C10485c c10485c = new C10485c(this, this.f24904g, c10486d, c10486d.m21879a(this.f24900c, chain));
        this.f24911n = c10485c;
        this.f24916s = c10485c;
        synchronized (this) {
            this.f24912o = true;
            this.f24913p = true;
        }
        if (this.f24915r) {
            throw new IOException("Canceled");
        }
        return c10485c;
    }

    /* renamed from: t */
    public final IOException m21906t(C10485c exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        AbstractC9979u.m20294g(exchange, "exchange");
        if (AbstractC9979u.m20289b(exchange, this.f24916s)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f24912o) {
                            if (z11 || !this.f24913p) {
                                z13 = false;
                            }
                            C10786q c10786q = C10786q.f26013a;
                        }
                        if (z10) {
                            this.f24912o = false;
                        }
                        if (z11) {
                            this.f24913p = false;
                        }
                        boolean z14 = this.f24912o;
                        boolean z15 = (z14 || this.f24913p) ? false : true;
                        if (!z14 && !this.f24913p && !this.f24914q) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        C10786q c10786q2 = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    C10786q c10786q22 = C10786q.f26013a;
                }
            }
            if (z12) {
                this.f24916s = null;
                RealConnection realConnection = this.f24909l;
                if (realConnection != null) {
                    realConnection.m22009t();
                }
            }
            if (z13) {
                return m21892f(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: u */
    public final IOException m21907u(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f24914q) {
                    this.f24914q = false;
                    if (!this.f24912o && !this.f24913p) {
                        z10 = true;
                    }
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? m21892f(iOException) : iOException;
    }

    /* renamed from: v */
    public final String m21908v() {
        return this.f24901d.m19592j().m19426p();
    }

    /* renamed from: w */
    public final Socket m21909w() {
        RealConnection realConnection = this.f24909l;
        AbstractC9979u.m20291d(realConnection);
        if (AbstractC9920d.f23248h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM22004o = realConnection.m22004o();
        Iterator it = listM22004o.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC9979u.m20289b(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM22004o.remove(i10);
        this.f24909l = null;
        if (listM22004o.isEmpty()) {
            realConnection.m21986C(System.nanoTime());
            if (this.f24903f.m21921c(realConnection)) {
                return realConnection.m21988E();
            }
        }
        return null;
    }

    /* renamed from: x */
    public final boolean m21910x() {
        C10486d c10486d = this.f24908k;
        AbstractC9979u.m20291d(c10486d);
        return c10486d.m21883e();
    }

    /* renamed from: y */
    public final void m21911y(RealConnection realConnection) {
        this.f24917t = realConnection;
    }

    /* renamed from: z */
    public final void m21912z() {
        if (this.f24910m) {
            throw new IllegalStateException("Check failed.");
        }
        this.f24910m = true;
        this.f24905h.exit();
    }
}

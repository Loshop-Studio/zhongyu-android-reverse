package p092f9;

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
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.internal.connection.RealConnection;
import okio.AsyncTimeout;
import p011a9.AbstractC0052o;
import p011a9.C0037a;
import p011a9.C0050m;
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0043f;
import p028b9.AbstractC5070d;
import p070d9.C7313a;
import p103g9.C7600a;
import p103g9.C7601b;
import p103g9.C7606g;
import p103g9.C7609j;
import p136j9.C7828j;

/* renamed from: f9.e */
/* loaded from: classes5.dex */
public final class C7501e implements InterfaceC0042e {

    /* renamed from: a */
    public final C0059v f12319a;

    /* renamed from: b */
    public final C0060w f12320b;

    /* renamed from: c */
    public final boolean f12321c;

    /* renamed from: d */
    public final C7502f f12322d;

    /* renamed from: e */
    public final AbstractC0052o f12323e;

    /* renamed from: f */
    public final c f12324f;

    /* renamed from: g */
    public final AtomicBoolean f12325g;

    /* renamed from: h */
    public Object f12326h;

    /* renamed from: i */
    public C7500d f12327i;

    /* renamed from: j */
    public RealConnection f12328j;

    /* renamed from: k */
    public boolean f12329k;

    /* renamed from: l */
    public C7499c f12330l;

    /* renamed from: m */
    public boolean f12331m;

    /* renamed from: n */
    public boolean f12332n;

    /* renamed from: o */
    public boolean f12333o;

    /* renamed from: p */
    public volatile boolean f12334p;

    /* renamed from: q */
    public volatile C7499c f12335q;

    /* renamed from: r */
    public volatile RealConnection f12336r;

    /* renamed from: f9.e$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC0043f f12337a;

        /* renamed from: b */
        public volatile AtomicInteger f12338b;

        /* renamed from: c */
        public final /* synthetic */ C7501e f12339c;

        public a(C7501e c7501e, InterfaceC0043f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f12339c = c7501e;
            this.f12337a = responseCallback;
            this.f12338b = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m12187a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            C0050m c0050mM317q = this.f12339c.m12173l().m317q();
            if (AbstractC5070d.f2640h && Thread.holdsLock(c0050mM317q)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c0050mM317q);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f12339c.m12182v(interruptedIOException);
                    this.f12337a.mo111b(this.f12339c, interruptedIOException);
                    this.f12339c.m12173l().m317q().m139f(this);
                }
            } catch (Throwable th) {
                this.f12339c.m12173l().m317q().m139f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final C7501e m12188b() {
            return this.f12339c;
        }

        /* renamed from: c */
        public final AtomicInteger m12189c() {
            return this.f12338b;
        }

        /* renamed from: d */
        public final String m12190d() {
            return this.f12339c.m12178r().m381j().m210i();
        }

        /* renamed from: e */
        public final void m12191e(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f12338b = other.f12338b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z9;
            Throwable th;
            IOException e10;
            C0050m c0050mM317q;
            String str = "OkHttp " + this.f12339c.m12183w();
            C7501e c7501e = this.f12339c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c7501e.f12324f.enter();
                try {
                    try {
                        z9 = true;
                        try {
                            this.f12337a.mo110a(c7501e, c7501e.m12179s());
                            c0050mM317q = c7501e.m12173l().m317q();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z9) {
                                C7828j.f13560a.m13291g().m13284j("Callback failure for " + c7501e.m12165C(), 4, e10);
                            } else {
                                this.f12337a.mo111b(c7501e, e10);
                            }
                            c0050mM317q = c7501e.m12173l().m317q();
                            c0050mM317q.m139f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            c7501e.cancel();
                            if (!z9) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f12337a.mo111b(c7501e, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c7501e.m12173l().m317q().m139f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z9 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z9 = false;
                    th = th4;
                }
                c0050mM317q.m139f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: f9.e$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f12340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7501e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f12340a = obj;
        }

        /* renamed from: a */
        public final Object m12192a() {
            return this.f12340a;
        }
    }

    /* renamed from: f9.e$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            C7501e.this.cancel();
        }
    }

    public C7501e(C0059v client, C0060w originalRequest, boolean z9) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12319a = client;
        this.f12320b = originalRequest;
        this.f12321c = z9;
        this.f12322d = client.m314m().m115a();
        this.f12323e = client.m319s().mo174a(this);
        c cVar = new c();
        cVar.timeout(client.m310h(), TimeUnit.MILLISECONDS);
        this.f12324f = cVar;
        this.f12325g = new AtomicBoolean();
        this.f12333o = true;
    }

    /* renamed from: A */
    public final void m12163A() {
        if (this.f12329k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12329k = true;
        this.f12324f.exit();
    }

    /* renamed from: B */
    public final IOException m12164B(IOException iOException) {
        if (this.f12329k || !this.f12324f.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: C */
    public final String m12165C() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f12321c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m12183w());
        return sb.toString();
    }

    @Override // p011a9.InterfaceC0042e
    /* renamed from: a */
    public C0060w mo107a() {
        return this.f12320b;
    }

    @Override // p011a9.InterfaceC0042e
    public void cancel() {
        if (this.f12334p) {
            return;
        }
        this.f12334p = true;
        C7499c c7499c = this.f12335q;
        if (c7499c != null) {
            c7499c.m12131b();
        }
        RealConnection realConnection = this.f12336r;
        if (realConnection != null) {
            realConnection.m14433d();
        }
        this.f12323e.m153f(this);
    }

    /* renamed from: d */
    public final void m12166d(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC5070d.f2640h || Thread.holdsLock(connection)) {
            if (this.f12328j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f12328j = connection;
            connection.m14443n().add(new b(this, this.f12326h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* renamed from: e */
    public final IOException m12167e(IOException iOException) throws IOException {
        Socket socketM12184x;
        boolean z9 = AbstractC5070d.f2640h;
        if (z9 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f12328j;
        if (realConnection != null) {
            if (z9 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketM12184x = m12184x();
            }
            if (this.f12328j == null) {
                if (socketM12184x != null) {
                    AbstractC5070d.m2649n(socketM12184x);
                }
                this.f12323e.m158k(this, realConnection);
            } else if (socketM12184x != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM12164B = m12164B(iOException);
        if (iOException == null) {
            this.f12323e.m150c(this);
            return iOExceptionM12164B;
        }
        AbstractC0052o abstractC0052o = this.f12323e;
        Intrinsics.checkNotNull(iOExceptionM12164B);
        abstractC0052o.m151d(this, iOExceptionM12164B);
        return iOExceptionM12164B;
    }

    @Override // p011a9.InterfaceC0042e
    public C0062y execute() {
        if (!this.f12325g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f12324f.enter();
        m12168f();
        try {
            this.f12319a.m317q().m135b(this);
            return m12179s();
        } finally {
            this.f12319a.m317q().m140g(this);
        }
    }

    /* renamed from: f */
    public final void m12168f() {
        this.f12326h = C7828j.f13560a.m13291g().mo13255h("response.body().close()");
        this.f12323e.m152e(this);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7501e clone() {
        return new C7501e(this.f12319a, this.f12320b, this.f12321c);
    }

    /* renamed from: h */
    public final C0037a m12170h(C0055r c0055r) {
        SSLSocketFactory sSLSocketFactoryM304J;
        HostnameVerifier hostnameVerifierM323w;
        CertificatePinner certificatePinnerM312k;
        if (c0055r.m211j()) {
            sSLSocketFactoryM304J = this.f12319a.m304J();
            hostnameVerifierM323w = this.f12319a.m323w();
            certificatePinnerM312k = this.f12319a.m312k();
        } else {
            sSLSocketFactoryM304J = null;
            hostnameVerifierM323w = null;
            certificatePinnerM312k = null;
        }
        return new C0037a(c0055r.m210i(), c0055r.m215n(), this.f12319a.m318r(), this.f12319a.m303I(), sSLSocketFactoryM304J, hostnameVerifierM323w, certificatePinnerM312k, this.f12319a.m299E(), this.f12319a.m298D(), this.f12319a.m297C(), this.f12319a.m315n(), this.f12319a.m300F());
    }

    /* renamed from: i */
    public final void m12171i(C0060w request, boolean z9) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f12330l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f12332n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f12331m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z9) {
            this.f12327i = new C7500d(this.f12322d, m12170h(request.m381j()), this, this.f12323e);
        }
    }

    @Override // p011a9.InterfaceC0042e
    public boolean isCanceled() {
        return this.f12334p;
    }

    /* renamed from: k */
    public final void m12172k(boolean z9) {
        C7499c c7499c;
        synchronized (this) {
            if (!this.f12333o) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z9 && (c7499c = this.f12335q) != null) {
            c7499c.m12133d();
        }
        this.f12330l = null;
    }

    /* renamed from: l */
    public final C0059v m12173l() {
        return this.f12319a;
    }

    /* renamed from: m */
    public final RealConnection m12174m() {
        return this.f12328j;
    }

    /* renamed from: n */
    public final AbstractC0052o m12175n() {
        return this.f12323e;
    }

    @Override // p011a9.InterfaceC0042e
    /* renamed from: o */
    public void mo108o(InterfaceC0043f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f12325g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m12168f();
        this.f12319a.m317q().m134a(new a(this, responseCallback));
    }

    /* renamed from: p */
    public final boolean m12176p() {
        return this.f12321c;
    }

    /* renamed from: q */
    public final C7499c m12177q() {
        return this.f12330l;
    }

    /* renamed from: r */
    public final C0060w m12178r() {
        return this.f12320b;
    }

    /* renamed from: s */
    public final C0062y m12179s() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f12319a.m324x());
        arrayList.add(new C7609j(this.f12319a));
        arrayList.add(new C7600a(this.f12319a.m316p()));
        this.f12319a.m309g();
        arrayList.add(new C7313a(null));
        arrayList.add(C7497a.f12286a);
        if (!this.f12321c) {
            CollectionsKt.addAll(arrayList, this.f12319a.m326z());
        }
        arrayList.add(new C7601b(this.f12321c));
        C7606g c7606g = new C7606g(this, arrayList, 0, null, this.f12320b, this.f12319a.m313l(), this.f12319a.m301G(), this.f12319a.m306L());
        boolean z9 = false;
        try {
            try {
                C0062y c0062yMo269b = c7606g.mo269b(this.f12320b);
                if (isCanceled()) {
                    AbstractC5070d.m2648m(c0062yMo269b);
                    throw new IOException("Canceled");
                }
                m12182v(null);
                return c0062yMo269b;
            } catch (IOException e10) {
                z9 = true;
                IOException iOExceptionM12182v = m12182v(e10);
                Intrinsics.checkNotNull(iOExceptionM12182v, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM12182v;
            }
        } catch (Throwable th) {
            if (!z9) {
                m12182v(null);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final C7499c m12180t(C7606g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f12333o) {
                throw new IllegalStateException("released");
            }
            if (this.f12332n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f12331m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        C7500d c7500d = this.f12327i;
        Intrinsics.checkNotNull(c7500d);
        C7499c c7499c = new C7499c(this, this.f12323e, c7500d, c7500d.m12153a(this.f12319a, chain));
        this.f12330l = c7499c;
        this.f12335q = c7499c;
        synchronized (this) {
            this.f12331m = true;
            this.f12332n = true;
        }
        if (this.f12334p) {
            throw new IOException("Canceled");
        }
        return c7499c;
    }

    /* renamed from: u */
    public final IOException m12181u(C7499c exchange, boolean z9, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f12335q)) {
            synchronized (this) {
                z11 = false;
                if (z9) {
                    try {
                        if (!this.f12331m) {
                            if (z10 || !this.f12332n) {
                                z12 = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z9) {
                            this.f12331m = false;
                        }
                        if (z10) {
                            this.f12332n = false;
                        }
                        boolean z13 = this.f12331m;
                        boolean z14 = (z13 || this.f12332n) ? false : true;
                        if (!z13 && !this.f12332n && !this.f12333o) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                    Unit unit22 = Unit.INSTANCE;
                }
            }
            if (z11) {
                this.f12335q = null;
                RealConnection realConnection = this.f12328j;
                if (realConnection != null) {
                    realConnection.m14448s();
                }
            }
            if (z12) {
                return m12167e(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: v */
    public final IOException m12182v(IOException iOException) {
        boolean z9;
        synchronized (this) {
            try {
                z9 = false;
                if (this.f12333o) {
                    this.f12333o = false;
                    if (!this.f12331m && !this.f12332n) {
                        z9 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9 ? m12167e(iOException) : iOException;
    }

    /* renamed from: w */
    public final String m12183w() {
        return this.f12320b.m381j().m217p();
    }

    /* renamed from: x */
    public final Socket m12184x() {
        RealConnection realConnection = this.f12328j;
        Intrinsics.checkNotNull(realConnection);
        if (AbstractC5070d.f2640h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM14443n = realConnection.m14443n();
        Iterator it = listM14443n.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM14443n.remove(i10);
        this.f12328j = null;
        if (listM14443n.isEmpty()) {
            realConnection.m14425B(System.nanoTime());
            if (this.f12322d.m12195c(realConnection)) {
                return realConnection.m14427D();
            }
        }
        return null;
    }

    /* renamed from: y */
    public final boolean m12185y() {
        C7500d c7500d = this.f12327i;
        Intrinsics.checkNotNull(c7500d);
        return c7500d.m12157e();
    }

    /* renamed from: z */
    public final void m12186z(RealConnection realConnection) {
        this.f12336r = realConnection;
    }
}

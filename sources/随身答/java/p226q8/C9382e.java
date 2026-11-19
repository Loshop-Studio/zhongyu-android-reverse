package p226q8;

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
import p172l8.AbstractC8916o;
import p172l8.C8901a;
import p172l8.C8914m;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8907f;
import p182m8.AbstractC9045d;
import p202o8.C9232a;
import p236r8.C9439a;
import p236r8.C9440b;
import p236r8.C9445g;
import p236r8.C9448j;
import p266u8.C9734j;

/* renamed from: q8.e */
/* loaded from: classes5.dex */
public final class C9382e implements InterfaceC8906e {

    /* renamed from: a */
    public final C8923v f16327a;

    /* renamed from: b */
    public final C8924w f16328b;

    /* renamed from: c */
    public final boolean f16329c;

    /* renamed from: d */
    public final C9383f f16330d;

    /* renamed from: e */
    public final AbstractC8916o f16331e;

    /* renamed from: f */
    public final c f16332f;

    /* renamed from: g */
    public final AtomicBoolean f16333g;

    /* renamed from: h */
    public Object f16334h;

    /* renamed from: i */
    public C9381d f16335i;

    /* renamed from: j */
    public RealConnection f16336j;

    /* renamed from: k */
    public boolean f16337k;

    /* renamed from: l */
    public C9380c f16338l;

    /* renamed from: m */
    public boolean f16339m;

    /* renamed from: n */
    public boolean f16340n;

    /* renamed from: o */
    public boolean f16341o;

    /* renamed from: p */
    public volatile boolean f16342p;

    /* renamed from: q */
    public volatile C9380c f16343q;

    /* renamed from: r */
    public volatile RealConnection f16344r;

    /* renamed from: q8.e$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC8907f f16345a;

        /* renamed from: b */
        public volatile AtomicInteger f16346b;

        /* renamed from: c */
        public final /* synthetic */ C9382e f16347c;

        public a(C9382e c9382e, InterfaceC8907f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f16347c = c9382e;
            this.f16345a = responseCallback;
            this.f16346b = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m15419a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            C8914m c8914mM14073q = this.f16347c.m15405m().m14073q();
            if (AbstractC9045d.f15231h && Thread.holdsLock(c8914mM14073q)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c8914mM14073q);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f16347c.m15414v(interruptedIOException);
                    this.f16345a.mo2463a(this.f16347c, interruptedIOException);
                    this.f16347c.m15405m().m14073q().m13896f(this);
                }
            } catch (Throwable th) {
                this.f16347c.m15405m().m14073q().m13896f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final C9382e m15420b() {
            return this.f16347c;
        }

        /* renamed from: c */
        public final AtomicInteger m15421c() {
            return this.f16346b;
        }

        /* renamed from: d */
        public final String m15422d() {
            return this.f16347c.m15410r().m14137j().m13966i();
        }

        /* renamed from: e */
        public final void m15423e(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f16346b = other.f16346b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z9;
            Throwable th;
            IOException e10;
            C8914m c8914mM14073q;
            String str = "OkHttp " + this.f16347c.m15415w();
            C9382e c9382e = this.f16347c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c9382e.f16332f.enter();
                try {
                    try {
                        z9 = true;
                        try {
                            this.f16345a.mo2464b(c9382e, c9382e.m15411s());
                            c8914mM14073q = c9382e.m15405m().m14073q();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z9) {
                                C9734j.f17200a.m16271g().m16264j("Callback failure for " + c9382e.m15397C(), 4, e10);
                            } else {
                                this.f16345a.mo2463a(c9382e, e10);
                            }
                            c8914mM14073q = c9382e.m15405m().m14073q();
                            c8914mM14073q.m13896f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            c9382e.cancel();
                            if (!z9) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f16345a.mo2463a(c9382e, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c9382e.m15405m().m14073q().m13896f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z9 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z9 = false;
                    th = th4;
                }
                c8914mM14073q.m13896f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: q8.e$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f16348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9382e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f16348a = obj;
        }

        /* renamed from: a */
        public final Object m15424a() {
            return this.f16348a;
        }
    }

    /* renamed from: q8.e$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() throws IOException {
            C9382e.this.cancel();
        }
    }

    public C9382e(C8923v client, C8924w originalRequest, boolean z9) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f16327a = client;
        this.f16328b = originalRequest;
        this.f16329c = z9;
        this.f16330d = client.m14070n().m13872a();
        this.f16331e = client.m14075s().mo13930a(this);
        c cVar = new c();
        cVar.timeout(client.m14066i(), TimeUnit.MILLISECONDS);
        this.f16332f = cVar;
        this.f16333g = new AtomicBoolean();
        this.f16341o = true;
    }

    /* renamed from: A */
    public final void m15395A() {
        if (this.f16337k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f16337k = true;
        this.f16332f.exit();
    }

    /* renamed from: B */
    public final IOException m15396B(IOException iOException) {
        if (this.f16337k || !this.f16332f.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: C */
    public final String m15397C() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f16329c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m15415w());
        return sb.toString();
    }

    @Override // p172l8.InterfaceC8906e
    /* renamed from: a */
    public C8924w mo13866a() {
        return this.f16328b;
    }

    @Override // p172l8.InterfaceC8906e
    public void cancel() throws IOException {
        if (this.f16342p) {
            return;
        }
        this.f16342p = true;
        C9380c c9380c = this.f16343q;
        if (c9380c != null) {
            c9380c.m15363b();
        }
        RealConnection realConnection = this.f16344r;
        if (realConnection != null) {
            realConnection.m14867d();
        }
        this.f16331e.m13909f(this);
    }

    /* renamed from: e */
    public final void m15398e(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC9045d.f15231h || Thread.holdsLock(connection)) {
            if (this.f16336j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f16336j = connection;
            connection.m14877n().add(new b(this, this.f16334h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // p172l8.InterfaceC8906e
    public C8926y execute() {
        if (!this.f16333g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f16332f.enter();
        m15400g();
        try {
            this.f16327a.m14073q().m13892b(this);
            return m15411s();
        } finally {
            this.f16327a.m14073q().m13897g(this);
        }
    }

    /* renamed from: f */
    public final IOException m15399f(IOException iOException) throws IOException {
        Socket socketM15416x;
        boolean z9 = AbstractC9045d.f15231h;
        if (z9 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f16336j;
        if (realConnection != null) {
            if (z9 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketM15416x = m15416x();
            }
            if (this.f16336j == null) {
                if (socketM15416x != null) {
                    AbstractC9045d.m14498n(socketM15416x);
                }
                this.f16331e.m13914k(this, realConnection);
            } else if (socketM15416x != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM15396B = m15396B(iOException);
        if (iOException == null) {
            this.f16331e.m13906c(this);
            return iOExceptionM15396B;
        }
        AbstractC8916o abstractC8916o = this.f16331e;
        Intrinsics.checkNotNull(iOExceptionM15396B);
        abstractC8916o.m13907d(this, iOExceptionM15396B);
        return iOExceptionM15396B;
    }

    /* renamed from: g */
    public final void m15400g() {
        this.f16334h = C9734j.f17200a.m16271g().mo16235h("response.body().close()");
        this.f16331e.m13908e(this);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9382e clone() {
        return new C9382e(this.f16327a, this.f16328b, this.f16329c);
    }

    /* renamed from: i */
    public final C8901a m15402i(C8919r c8919r) {
        SSLSocketFactory sSLSocketFactoryM14060J;
        HostnameVerifier hostnameVerifierM14079w;
        CertificatePinner certificatePinnerM14068l;
        if (c8919r.m13967j()) {
            sSLSocketFactoryM14060J = this.f16327a.m14060J();
            hostnameVerifierM14079w = this.f16327a.m14079w();
            certificatePinnerM14068l = this.f16327a.m14068l();
        } else {
            sSLSocketFactoryM14060J = null;
            hostnameVerifierM14079w = null;
            certificatePinnerM14068l = null;
        }
        return new C8901a(c8919r.m13966i(), c8919r.m13971n(), this.f16327a.m14074r(), this.f16327a.m14059I(), sSLSocketFactoryM14060J, hostnameVerifierM14079w, certificatePinnerM14068l, this.f16327a.m14055E(), this.f16327a.m14054D(), this.f16327a.m14053C(), this.f16327a.m14071o(), this.f16327a.m14056F());
    }

    @Override // p172l8.InterfaceC8906e
    public boolean isCanceled() {
        return this.f16342p;
    }

    /* renamed from: j */
    public final void m15403j(C8924w request, boolean z9) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f16338l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f16340n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f16339m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z9) {
            this.f16335i = new C9381d(this.f16330d, m15402i(request.m14137j()), this, this.f16331e);
        }
    }

    @Override // p172l8.InterfaceC8906e
    /* renamed from: k */
    public void mo13867k(InterfaceC8907f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f16333g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m15400g();
        this.f16327a.m14073q().m13891a(new a(this, responseCallback));
    }

    /* renamed from: l */
    public final void m15404l(boolean z9) {
        C9380c c9380c;
        synchronized (this) {
            if (!this.f16341o) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z9 && (c9380c = this.f16343q) != null) {
            c9380c.m15365d();
        }
        this.f16338l = null;
    }

    /* renamed from: m */
    public final C8923v m15405m() {
        return this.f16327a;
    }

    /* renamed from: n */
    public final RealConnection m15406n() {
        return this.f16336j;
    }

    /* renamed from: o */
    public final AbstractC8916o m15407o() {
        return this.f16331e;
    }

    /* renamed from: p */
    public final boolean m15408p() {
        return this.f16329c;
    }

    /* renamed from: q */
    public final C9380c m15409q() {
        return this.f16338l;
    }

    /* renamed from: r */
    public final C8924w m15410r() {
        return this.f16328b;
    }

    /* renamed from: s */
    public final C8926y m15411s() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f16327a.m14080x());
        arrayList.add(new C9448j(this.f16327a));
        arrayList.add(new C9439a(this.f16327a.m14072p()));
        this.f16327a.m14065h();
        arrayList.add(new C9232a(null));
        arrayList.add(C9378a.f16294a);
        if (!this.f16329c) {
            CollectionsKt.addAll(arrayList, this.f16327a.m14082z());
        }
        arrayList.add(new C9440b(this.f16329c));
        C9445g c9445g = new C9445g(this, arrayList, 0, null, this.f16328b, this.f16327a.m14069m(), this.f16327a.m14057G(), this.f16327a.m14062L());
        boolean z9 = false;
        try {
            try {
                C8926y c8926yMo14025b = c9445g.mo14025b(this.f16328b);
                if (isCanceled()) {
                    AbstractC9045d.m14497m(c8926yMo14025b);
                    throw new IOException("Canceled");
                }
                m15414v(null);
                return c8926yMo14025b;
            } catch (IOException e10) {
                z9 = true;
                IOException iOExceptionM15414v = m15414v(e10);
                Intrinsics.checkNotNull(iOExceptionM15414v, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM15414v;
            }
        } catch (Throwable th) {
            if (!z9) {
                m15414v(null);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final C9380c m15412t(C9445g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f16341o) {
                throw new IllegalStateException("released");
            }
            if (this.f16340n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f16339m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        C9381d c9381d = this.f16335i;
        Intrinsics.checkNotNull(c9381d);
        C9380c c9380c = new C9380c(this, this.f16331e, c9381d, c9381d.m15385a(this.f16327a, chain));
        this.f16338l = c9380c;
        this.f16343q = c9380c;
        synchronized (this) {
            this.f16339m = true;
            this.f16340n = true;
        }
        if (this.f16342p) {
            throw new IOException("Canceled");
        }
        return c9380c;
    }

    /* renamed from: u */
    public final IOException m15413u(C9380c exchange, boolean z9, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f16343q)) {
            synchronized (this) {
                z11 = false;
                if (z9) {
                    try {
                        if (!this.f16339m) {
                            if (z10 || !this.f16340n) {
                                z12 = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z9) {
                            this.f16339m = false;
                        }
                        if (z10) {
                            this.f16340n = false;
                        }
                        boolean z13 = this.f16339m;
                        boolean z14 = (z13 || this.f16340n) ? false : true;
                        if (!z13 && !this.f16340n && !this.f16341o) {
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
                this.f16343q = null;
                RealConnection realConnection = this.f16336j;
                if (realConnection != null) {
                    realConnection.m14882s();
                }
            }
            if (z12) {
                return m15399f(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: v */
    public final IOException m15414v(IOException iOException) {
        boolean z9;
        synchronized (this) {
            try {
                z9 = false;
                if (this.f16341o) {
                    this.f16341o = false;
                    if (!this.f16339m && !this.f16340n) {
                        z9 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9 ? m15399f(iOException) : iOException;
    }

    /* renamed from: w */
    public final String m15415w() {
        return this.f16328b.m14137j().m13973p();
    }

    /* renamed from: x */
    public final Socket m15416x() {
        RealConnection realConnection = this.f16336j;
        Intrinsics.checkNotNull(realConnection);
        if (AbstractC9045d.f15231h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM14877n = realConnection.m14877n();
        Iterator it = listM14877n.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i9++;
        }
        if (i9 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM14877n.remove(i9);
        this.f16336j = null;
        if (listM14877n.isEmpty()) {
            realConnection.m14859B(System.nanoTime());
            if (this.f16330d.m15427c(realConnection)) {
                return realConnection.m14861D();
            }
        }
        return null;
    }

    /* renamed from: y */
    public final boolean m15417y() {
        C9381d c9381d = this.f16335i;
        Intrinsics.checkNotNull(c9381d);
        return c9381d.m15389e();
    }

    /* renamed from: z */
    public final void m15418z(RealConnection realConnection) {
        this.f16344r = realConnection;
    }
}

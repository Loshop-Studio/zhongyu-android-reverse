package p137w2;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.internal.connection.RealConnection;
import okio.AsyncTimeout;
import p004a3.C0021k;
import p117r2.AbstractC4514q;
import p117r2.C4495a;
import p117r2.C4512o;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.C4522y;
import p117r2.InterfaceC4502e;
import p117r2.InterfaceC4503f;
import p121s2.AbstractC4550b;
import p141x2.C4670g;

/* renamed from: w2.e */
/* loaded from: classes2.dex */
public final class C4645e implements InterfaceC4502e {

    /* renamed from: a */
    public final C4647g f5900a;

    /* renamed from: b */
    public final AbstractC4514q f5901b;

    /* renamed from: c */
    public final c f5902c;

    /* renamed from: d */
    public final AtomicBoolean f5903d;

    /* renamed from: e */
    public Object f5904e;

    /* renamed from: f */
    public C4644d f5905f;

    /* renamed from: g */
    public RealConnection f5906g;

    /* renamed from: h */
    public boolean f5907h;

    /* renamed from: i */
    public C4643c f5908i;

    /* renamed from: j */
    public boolean f5909j;

    /* renamed from: k */
    public boolean f5910k;

    /* renamed from: l */
    public boolean f5911l;

    /* renamed from: m */
    public volatile boolean f5912m;

    /* renamed from: n */
    public volatile C4643c f5913n;

    /* renamed from: o */
    public volatile RealConnection f5914o;

    /* renamed from: p */
    public final C4521x f5915p;

    /* renamed from: q */
    public final C4522y f5916q;

    /* renamed from: r */
    public final boolean f5917r;

    /* renamed from: w2.e$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public volatile AtomicInteger f5918a;

        /* renamed from: b */
        public final InterfaceC4503f f5919b;

        /* renamed from: c */
        public final /* synthetic */ C4645e f5920c;

        public a(C4645e c4645e, InterfaceC4503f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f5920c = c4645e;
            this.f5919b = responseCallback;
            this.f5918a = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m6529a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            C4512o c4512oM6081m = this.f5920c.m6513k().m6081m();
            if (AbstractC4550b.f5708h && Thread.holdsLock(c4512oM6081m)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(c4512oM6081m);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f5920c.m6522t(interruptedIOException);
                    this.f5919b.mo5087a(this.f5920c, interruptedIOException);
                    this.f5920c.m6513k().m6081m().m5921e(this);
                }
            } catch (Throwable th) {
                this.f5920c.m6513k().m6081m().m5921e(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final C4645e m6530b() {
            return this.f5920c;
        }

        /* renamed from: c */
        public final AtomicInteger m6531c() {
            return this.f5918a;
        }

        /* renamed from: d */
        public final String m6532d() {
            return this.f5920c.m6518p().m6141j().m5987i();
        }

        /* renamed from: e */
        public final void m6533e(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f5918a = other.f5918a;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            Throwable th;
            IOException e4;
            C4512o c4512oM6081m;
            String str = "OkHttp " + this.f5920c.m6523u();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f5920c.f5902c.enter();
                try {
                    try {
                        z3 = true;
                    } catch (Throwable th2) {
                        this.f5920c.m6513k().m6081m().m5921e(this);
                        throw th2;
                    }
                } catch (IOException e5) {
                    z3 = false;
                    e4 = e5;
                } catch (Throwable th3) {
                    z3 = false;
                    th = th3;
                }
                try {
                    this.f5919b.mo5088b(this.f5920c, this.f5920c.m6519q());
                    c4512oM6081m = this.f5920c.m6513k().m6081m();
                } catch (IOException e6) {
                    e4 = e6;
                    if (z3) {
                        C0021k.f39c.m71g().m64j("Callback failure for " + this.f5920c.m6505A(), 4, e4);
                    } else {
                        this.f5919b.mo5087a(this.f5920c, e4);
                    }
                    c4512oM6081m = this.f5920c.m6513k().m6081m();
                    c4512oM6081m.m5921e(this);
                } catch (Throwable th4) {
                    th = th4;
                    this.f5920c.cancel();
                    if (!z3) {
                        IOException iOException = new IOException("canceled due to " + th);
                        ExceptionsKt__ExceptionsKt.addSuppressed(iOException, th);
                        this.f5919b.mo5087a(this.f5920c, iOException);
                    }
                    throw th;
                }
                c4512oM6081m.m5921e(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* renamed from: w2.e$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f5921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4645e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f5921a = obj;
        }

        /* renamed from: a */
        public final Object m6534a() {
            return this.f5921a;
        }
    }

    /* renamed from: w2.e$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() throws IOException {
            C4645e.this.cancel();
        }
    }

    public C4645e(C4521x client, C4522y originalRequest, boolean z3) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f5915p = client;
        this.f5916q = originalRequest;
        this.f5917r = z3;
        this.f5900a = client.m6078j().m5883a();
        this.f5901b = client.m6083o().mo5953a(this);
        c cVar = new c();
        cVar.timeout(client.m6075g(), TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f5902c = cVar;
        this.f5903d = new AtomicBoolean();
        this.f5911l = true;
    }

    /* renamed from: A */
    public final String m6505A() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5868T() ? "canceled " : "");
        sb.append(this.f5917r ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m6523u());
        return sb.toString();
    }

    @Override // p117r2.InterfaceC4502e
    /* renamed from: S */
    public C4522y mo5867S() {
        return this.f5916q;
    }

    @Override // p117r2.InterfaceC4502e
    /* renamed from: T */
    public boolean mo5868T() {
        return this.f5912m;
    }

    @Override // p117r2.InterfaceC4502e
    /* renamed from: b */
    public void mo5869b(InterfaceC4503f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f5903d.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m6508f();
        this.f5915p.m6081m().m5917a(new a(this, responseCallback));
    }

    @Override // p117r2.InterfaceC4502e
    public void cancel() throws IOException {
        if (this.f5912m) {
            return;
        }
        this.f5912m = true;
        C4643c c4643c = this.f5913n;
        if (c4643c != null) {
            c4643c.m6474b();
        }
        RealConnection realConnection = this.f5914o;
        if (realConnection != null) {
            realConnection.m5595d();
        }
        this.f5901b.m5932f(this);
    }

    /* renamed from: d */
    public final void m6506d(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC4550b.f5708h || Thread.holdsLock(connection)) {
            if (!(this.f5906g == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f5906g = connection;
            connection.m5605n().add(new b(this, this.f5904e));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: e */
    public final IOException m6507e(IOException iOException) throws IOException {
        Socket socketM6524v;
        boolean z3 = AbstractC4550b.f5708h;
        if (z3 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        RealConnection realConnection = this.f5906g;
        if (realConnection != null) {
            if (z3 && Thread.holdsLock(realConnection)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "Thread.currentThread()");
                sb2.append(threadCurrentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(realConnection);
                throw new AssertionError(sb2.toString());
            }
            synchronized (realConnection) {
                socketM6524v = m6524v();
            }
            if (this.f5906g == null) {
                if (socketM6524v != null) {
                    AbstractC4550b.m6229k(socketM6524v);
                }
                this.f5901b.m5937k(this, realConnection);
            } else {
                if (!(socketM6524v == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        IOException iOExceptionM6528z = m6528z(iOException);
        if (iOException != null) {
            AbstractC4514q abstractC4514q = this.f5901b;
            Intrinsics.checkNotNull(iOExceptionM6528z);
            abstractC4514q.m5930d(this, iOExceptionM6528z);
        } else {
            this.f5901b.m5929c(this);
        }
        return iOExceptionM6528z;
    }

    /* renamed from: f */
    public final void m6508f() {
        this.f5904e = C0021k.f39c.m71g().mo35h("response.body().close()");
        this.f5901b.m5931e(this);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4645e clone() {
        return new C4645e(this.f5915p, this.f5916q, this.f5917r);
    }

    /* renamed from: h */
    public final C4495a m6510h(C4517t c4517t) {
        SSLSocketFactory sSLSocketFactoryM6070D;
        HostnameVerifier hostnameVerifierM6087s;
        CertificatePinner certificatePinnerM6076h;
        if (c4517t.m5988j()) {
            sSLSocketFactoryM6070D = this.f5915p.m6070D();
            hostnameVerifierM6087s = this.f5915p.m6087s();
            certificatePinnerM6076h = this.f5915p.m6076h();
        } else {
            sSLSocketFactoryM6070D = null;
            hostnameVerifierM6087s = null;
            certificatePinnerM6076h = null;
        }
        return new C4495a(c4517t.m5987i(), c4517t.m5992n(), this.f5915p.m6082n(), this.f5915p.m6069C(), sSLSocketFactoryM6070D, hostnameVerifierM6087s, certificatePinnerM6076h, this.f5915p.m6093y(), this.f5915p.m6092x(), this.f5915p.m6091w(), this.f5915p.m6079k(), this.f5915p.m6094z());
    }

    /* renamed from: i */
    public final void m6511i(C4522y request, boolean z3) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.f5908i == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f5910k)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f5909j)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z3) {
            this.f5905f = new C4644d(this.f5900a, m6510h(request.m6141j()), this, this.f5901b);
        }
    }

    /* renamed from: j */
    public final void m6512j(boolean z3) {
        C4643c c4643c;
        synchronized (this) {
            if (!this.f5911l) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z3 && (c4643c = this.f5913n) != null) {
            c4643c.m6476d();
        }
        this.f5908i = null;
    }

    /* renamed from: k */
    public final C4521x m6513k() {
        return this.f5915p;
    }

    /* renamed from: l */
    public final RealConnection m6514l() {
        return this.f5906g;
    }

    /* renamed from: m */
    public final AbstractC4514q m6515m() {
        return this.f5901b;
    }

    /* renamed from: n */
    public final boolean m6516n() {
        return this.f5917r;
    }

    /* renamed from: o */
    public final C4643c m6517o() {
        return this.f5908i;
    }

    /* renamed from: p */
    public final C4522y m6518p() {
        return this.f5916q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p117r2.C4496a0 m6519q() throws java.lang.Throwable {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.x r0 = r12.f5915p
            java.util.List r0 = r0.m6088t()
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            x2.j r0 = new x2.j
            r2.x r1 = r12.f5915p
            r0.<init>(r1)
            r2.add(r0)
            x2.a r0 = new x2.a
            r2.x r1 = r12.f5915p
            r2.m r1 = r1.m6080l()
            r0.<init>(r1)
            r2.add(r0)
            u2.a r0 = new u2.a
            r2.x r1 = r12.f5915p
            r1.m6074f()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            w2.a r0 = p137w2.C4641a.f5868a
            r2.add(r0)
            boolean r0 = r12.f5917r
            if (r0 != 0) goto L46
            r2.x r0 = r12.f5915p
            java.util.List r0 = r0.m6089u()
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L46:
            x2.b r0 = new x2.b
            boolean r1 = r12.f5917r
            r0.<init>(r1)
            r2.add(r0)
            x2.g r10 = new x2.g
            r3 = 0
            r4 = 0
            r2.y r5 = r12.f5916q
            r2.x r0 = r12.f5915p
            int r6 = r0.m6077i()
            r2.x r0 = r12.f5915p
            int r7 = r0.m6067A()
            r2.x r0 = r12.f5915p
            int r8 = r0.m6072F()
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r2.y r1 = r12.f5916q     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r2.a0 r1 = r10.mo6046a(r1)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            boolean r2 = r12.mo5868T()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            if (r2 != 0) goto L7e
            r12.m6522t(r9)
            return r1
        L7e:
            p121s2.AbstractC4550b.m6228j(r1)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            throw r1     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
        L89:
            r1 = move-exception
            goto La0
        L8b:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.m6522t(r0)     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L9b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9b:
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        La0:
            if (r0 != 0) goto La5
            r12.m6522t(r9)
        La5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p137w2.C4645e.m6519q():r2.a0");
    }

    /* renamed from: r */
    public final C4643c m6520r(C4670g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f5911l) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f5910k)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f5909j)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        C4644d c4644d = this.f5905f;
        Intrinsics.checkNotNull(c4644d);
        C4643c c4643c = new C4643c(this, this.f5901b, c4644d, c4644d.m6495a(this.f5915p, chain));
        this.f5908i = c4643c;
        this.f5913n = c4643c;
        synchronized (this) {
            this.f5909j = true;
            this.f5910k = true;
        }
        if (this.f5912m) {
            throw new IOException("Canceled");
        }
        return c4643c;
    }

    /* renamed from: s */
    public final IOException m6521s(C4643c exchange, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        boolean z6 = true;
        if (!Intrinsics.areEqual(exchange, this.f5913n)) {
            return iOException;
        }
        synchronized (this) {
            z5 = false;
            if (z3) {
                try {
                    if (!this.f5909j) {
                        if (z4 || !this.f5910k) {
                            z6 = false;
                        }
                    }
                    if (z3) {
                        this.f5909j = false;
                    }
                    if (z4) {
                        this.f5910k = false;
                    }
                    boolean z7 = this.f5909j;
                    boolean z8 = (z7 || this.f5910k) ? false : true;
                    if (z7 || this.f5910k || this.f5911l) {
                        z6 = false;
                    }
                    z5 = z8;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z4) {
                }
                z6 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z5) {
            this.f5913n = null;
            RealConnection realConnection = this.f5906g;
            if (realConnection != null) {
                realConnection.m5610s();
            }
        }
        return z6 ? m6507e(iOException) : iOException;
    }

    /* renamed from: t */
    public final IOException m6522t(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f5911l) {
                this.f5911l = false;
                if (!this.f5909j && !this.f5910k) {
                    z3 = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z3 ? m6507e(iOException) : iOException;
    }

    /* renamed from: u */
    public final String m6523u() {
        return this.f5916q.m6141j().m5994p();
    }

    /* renamed from: v */
    public final Socket m6524v() {
        RealConnection realConnection = this.f5906g;
        Intrinsics.checkNotNull(realConnection);
        if (AbstractC4550b.f5708h && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        List listM5605n = realConnection.m5605n();
        Iterator it = listM5605n.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (Intrinsics.areEqual((C4645e) ((Reference) it.next()).get(), this)) {
                break;
            }
            i4++;
        }
        if (!(i4 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listM5605n.remove(i4);
        this.f5906g = null;
        if (listM5605n.isEmpty()) {
            realConnection.m5587B(System.nanoTime());
            if (this.f5900a.m6537c(realConnection)) {
                return realConnection.m5589D();
            }
        }
        return null;
    }

    /* renamed from: w */
    public final boolean m6525w() {
        C4644d c4644d = this.f5905f;
        Intrinsics.checkNotNull(c4644d);
        return c4644d.m6499e();
    }

    /* renamed from: x */
    public final void m6526x(RealConnection realConnection) {
        this.f5914o = realConnection;
    }

    /* renamed from: y */
    public final void m6527y() {
        if (!(!this.f5907h)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5907h = true;
        this.f5902c.exit();
    }

    /* renamed from: z */
    public final IOException m6528z(IOException iOException) {
        if (this.f5907h || !this.f5902c.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}

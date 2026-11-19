package p093k5;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;
import okio.AsyncTimeout;
import p058f5.AbstractC6379r;
import p058f5.C6356a0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6377p;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6365f;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;
import p079i5.C6549a;
import p093k5.InterfaceC6698u;
import p102l5.C7347a;
import p102l5.C7348b;
import p102l5.C7353g;
import p102l5.C7356j;

/* renamed from: k5.n */
/* loaded from: classes4.dex */
public final class C6691n implements InterfaceC6363e, Cloneable {

    /* renamed from: a */
    public final C6356a0 f8888a;

    /* renamed from: b */
    public final C6358b0 f8889b;

    /* renamed from: c */
    public final boolean f8890c;

    /* renamed from: d */
    public final C6693p f8891d;

    /* renamed from: e */
    public final AbstractC6379r f8892e;

    /* renamed from: f */
    public final c f8893f;

    /* renamed from: g */
    public final AtomicBoolean f8894g;

    /* renamed from: h */
    public Object f8895h;

    /* renamed from: i */
    public InterfaceC6686i f8896i;

    /* renamed from: j */
    public C6692o f8897j;

    /* renamed from: k */
    public boolean f8898k;

    /* renamed from: l */
    public C6685h f8899l;

    /* renamed from: m */
    public boolean f8900m;

    /* renamed from: n */
    public boolean f8901n;

    /* renamed from: o */
    public boolean f8902o;

    /* renamed from: p */
    public volatile boolean f8903p;

    /* renamed from: q */
    public volatile C6685h f8904q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f8905r;

    /* renamed from: k5.n$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC6365f f8906a;

        /* renamed from: b */
        public volatile AtomicInteger f8907b;

        /* renamed from: c */
        public final /* synthetic */ C6691n f8908c;

        public a(C6691n c6691n, InterfaceC6365f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f8908c = c6691n;
            this.f8906a = responseCallback;
            this.f8907b = new AtomicInteger(0);
        }

        /* renamed from: c */
        public static /* synthetic */ void m7802c(a aVar, RejectedExecutionException rejectedExecutionException, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.m7804b(rejectedExecutionException);
        }

        /* renamed from: a */
        public final void m7803a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            AbstractC6427k.m7017e(this.f8908c.m7788l().m6515o());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e6) {
                    m7804b(e6);
                    this.f8908c.m7788l().m6515o().m6756f(this);
                }
            } catch (Throwable th) {
                this.f8908c.m7788l().m6515o().m6756f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final void m7804b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f8908c.m7798w(interruptedIOException);
            this.f8906a.mo6712b(this.f8908c, interruptedIOException);
        }

        /* renamed from: d */
        public final C6691n m7805d() {
            return this.f8908c;
        }

        /* renamed from: e */
        public final AtomicInteger m7806e() {
            return this.f8907b;
        }

        /* renamed from: f */
        public final String m7807f() {
            return this.f8908c.m7793q().m6588l().m6823h();
        }

        /* renamed from: g */
        public final void m7808g(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f8907b = other.f8907b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            Throwable th;
            IOException e6;
            C6377p c6377pM6515o;
            String str = "OkHttp " + this.f8908c.m7799x();
            C6691n c6691n = this.f8908c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c6691n.f8893f.enter();
                try {
                    try {
                        z6 = true;
                        try {
                            this.f8906a.mo6711a(c6691n, c6691n.m7795s());
                            c6377pM6515o = c6691n.m7788l().m6515o();
                        } catch (IOException e7) {
                            e6 = e7;
                            if (z6) {
                                AbstractC7536c.f9994a.m8931e().mo8919l("Callback failure for " + c6691n.m7781C(), 4, e6);
                            } else {
                                this.f8906a.mo6712b(c6691n, e6);
                            }
                            c6377pM6515o = c6691n.m7788l().m6515o();
                            c6377pM6515o.m6756f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            c6691n.cancel();
                            if (!z6) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f8906a.mo6712b(c6691n, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c6691n.m7788l().m6515o().m6756f(this);
                        throw th3;
                    }
                } catch (IOException e8) {
                    z6 = false;
                    e6 = e8;
                } catch (Throwable th4) {
                    z6 = false;
                    th = th4;
                }
                c6377pM6515o.m6756f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: k5.n$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f8909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6691n referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f8909a = obj;
        }

        /* renamed from: a */
        public final Object m7809a() {
            return this.f8909a;
        }
    }

    /* renamed from: k5.n$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            C6691n.this.cancel();
        }
    }

    public C6691n(C6356a0 client, C6358b0 originalRequest, boolean z6) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f8888a = client;
        this.f8889b = originalRequest;
        this.f8890c = z6;
        this.f8891d = client.m6512l().m6732c();
        this.f8892e = client.m6517q().mo6793a(this);
        c cVar = new c();
        cVar.timeout(client.m6508h(), TimeUnit.MILLISECONDS);
        this.f8893f = cVar;
        this.f8894g = new AtomicBoolean();
        this.f8902o = true;
        this.f8905r = new CopyOnWriteArrayList();
    }

    /* renamed from: v */
    public static /* synthetic */ IOException m7778v(C6691n c6691n, C6685h c6685h, boolean z6, boolean z7, IOException iOException, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        if ((i6 & 4) != 0) {
            z7 = false;
        }
        return c6691n.m7797u(c6685h, z6, z7, iOException);
    }

    /* renamed from: A */
    public final void m7779A() {
        if (this.f8898k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f8898k = true;
        this.f8893f.exit();
    }

    /* renamed from: B */
    public final IOException m7780B(IOException iOException) {
        if (this.f8898k || !this.f8893f.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: C */
    public final String m7781C() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f8890c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m7799x());
        return sb.toString();
    }

    @Override // p058f5.InterfaceC6363e
    /* renamed from: a */
    public C6358b0 mo6699a() {
        return this.f8889b;
    }

    @Override // p058f5.InterfaceC6363e
    /* renamed from: c */
    public void mo6700c(InterfaceC6365f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f8894g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m7784h();
        this.f8888a.m6515o().m6751a(new a(this, responseCallback));
    }

    @Override // p058f5.InterfaceC6363e
    public void cancel() {
        if (this.f8903p) {
            return;
        }
        this.f8903p = true;
        C6685h c6685h = this.f8904q;
        if (c6685h != null) {
            c6685h.m7737d();
        }
        Iterator it = this.f8905r.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC6698u.b) it.next()).cancel();
        }
        this.f8892e.m6772f(this);
    }

    /* renamed from: e */
    public final void m7782e(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC6427k.f8100b || Thread.holdsLock(connection)) {
            if (this.f8897j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f8897j = connection;
            connection.m7815h().add(new b(this, this.f8895h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // p058f5.InterfaceC6363e
    public C6362d0 execute() {
        if (!this.f8894g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f8893f.enter();
        m7784h();
        try {
            this.f8888a.m6515o().m6752b(this);
            return m7795s();
        } finally {
            this.f8888a.m6515o().m6757g(this);
        }
    }

    /* renamed from: f */
    public final IOException m7783f(IOException iOException) throws IOException {
        Socket socketM7800y;
        boolean z6 = AbstractC6427k.f8100b;
        if (z6 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        C6692o c6692o = this.f8897j;
        if (c6692o != null) {
            if (z6 && Thread.holdsLock(c6692o)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c6692o);
            }
            synchronized (c6692o) {
                socketM7800y = m7800y();
            }
            if (this.f8897j == null) {
                if (socketM7800y != null) {
                    AbstractC6427k.m7020h(socketM7800y);
                }
                this.f8892e.m6777k(this, c6692o);
                c6692o.m7816i().m7731g(c6692o, this);
                if (socketM7800y != null) {
                    c6692o.m7816i().m7730f(c6692o);
                }
            } else if (socketM7800y != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM7780B = m7780B(iOException);
        if (iOException == null) {
            this.f8892e.m6769c(this);
            return iOExceptionM7780B;
        }
        AbstractC6379r abstractC6379r = this.f8892e;
        Intrinsics.checkNotNull(iOExceptionM7780B);
        abstractC6379r.m6770d(this, iOExceptionM7780B);
        return iOExceptionM7780B;
    }

    /* renamed from: h */
    public final void m7784h() {
        this.f8895h = AbstractC7536c.f9994a.m8931e().mo8911j("response.body().close()");
        this.f8892e.m6771e(this);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC6363e clone() {
        return new C6691n(this.f8888a, this.f8889b, this.f8890c);
    }

    @Override // p058f5.InterfaceC6363e
    public boolean isCanceled() {
        return this.f8903p;
    }

    /* renamed from: j */
    public final void m7786j(C6358b0 request, boolean z6, C7353g chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.f8899l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f8901n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f8900m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z6) {
            C6694q c6694q = new C6694q(this.f8888a.m6522v(), this.f8891d, this.f8888a.m6496G(), this.f8888a.m6502M(), chain.m8346f(), chain.m8348h(), this.f8888a.m6491B(), this.f8888a.m6497H(), this.f8888a.m6518r(), this.f8888a.m6505e(request.m6588l()), this.f8888a.m6521u(), new C6678a(this, this.f8891d.m7837d(), chain));
            this.f8896i = this.f8888a.m6518r() ? new C6688k(c6694q, this.f8888a.m6522v()) : new C6700w(c6694q);
        }
    }

    /* renamed from: k */
    public final void m7787k(boolean z6) {
        C6685h c6685h;
        synchronized (this) {
            if (!this.f8902o) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z6 && (c6685h = this.f8904q) != null) {
            c6685h.m7739f();
        }
        this.f8899l = null;
    }

    /* renamed from: l */
    public final C6356a0 m7788l() {
        return this.f8888a;
    }

    /* renamed from: m */
    public final C6692o m7789m() {
        return this.f8897j;
    }

    /* renamed from: n */
    public final AbstractC6379r m7790n() {
        return this.f8892e;
    }

    /* renamed from: o */
    public final boolean m7791o() {
        return this.f8890c;
    }

    /* renamed from: p */
    public final C6685h m7792p() {
        return this.f8899l;
    }

    /* renamed from: q */
    public final C6358b0 m7793q() {
        return this.f8889b;
    }

    /* renamed from: r */
    public final CopyOnWriteArrayList m7794r() {
        return this.f8905r;
    }

    /* renamed from: s */
    public final C6362d0 m7795s() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f8888a.m6524x());
        arrayList.add(new C7356j(this.f8888a));
        arrayList.add(new C7347a(this.f8888a.m6514n()));
        this.f8888a.m6507g();
        arrayList.add(new C6549a(null));
        arrayList.add(C6679b.f8827a);
        if (!this.f8890c) {
            CollectionsKt.addAll(arrayList, this.f8888a.m6526z());
        }
        arrayList.add(new C7348b(this.f8890c));
        C7353g c7353g = new C7353g(this, arrayList, 0, null, this.f8889b, this.f8888a.m6511k(), this.f8888a.m6496G(), this.f8888a.m6502M());
        boolean z6 = false;
        try {
            try {
                C6362d0 c6362d0Mo6872b = c7353g.mo6872b(this.f8889b);
                if (isCanceled()) {
                    AbstractC6424h.m6992f(c6362d0Mo6872b);
                    throw new IOException("Canceled");
                }
                m7798w(null);
                return c6362d0Mo6872b;
            } catch (IOException e6) {
                z6 = true;
                IOException iOExceptionM7798w = m7798w(e6);
                Intrinsics.checkNotNull(iOExceptionM7798w, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM7798w;
            }
        } catch (Throwable th) {
            if (!z6) {
                m7798w(null);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final C6685h m7796t(C7353g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f8902o) {
                throw new IllegalStateException("released");
            }
            if (this.f8901n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f8900m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC6686i interfaceC6686i = this.f8896i;
        Intrinsics.checkNotNull(interfaceC6686i);
        C6685h c6685h = new C6685h(this, this.f8892e, interfaceC6686i, interfaceC6686i.mo7759a().m7825r(this.f8888a, chain));
        this.f8899l = c6685h;
        this.f8904q = c6685h;
        synchronized (this) {
            this.f8900m = true;
            this.f8901n = true;
        }
        if (this.f8903p) {
            throw new IOException("Canceled");
        }
        return c6685h;
    }

    /* renamed from: u */
    public final IOException m7797u(C6685h exchange, boolean z6, boolean z7, IOException iOException) {
        boolean z8;
        boolean z9;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f8904q)) {
            synchronized (this) {
                z8 = false;
                if (z6) {
                    try {
                        if (!this.f8900m) {
                            if (z7 || !this.f8901n) {
                                z9 = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z6) {
                            this.f8900m = false;
                        }
                        if (z7) {
                            this.f8901n = false;
                        }
                        boolean z10 = this.f8900m;
                        boolean z11 = (z10 || this.f8901n) ? false : true;
                        if (!z10 && !this.f8901n && !this.f8902o) {
                            z8 = true;
                        }
                        z9 = z8;
                        z8 = z11;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z7) {
                    }
                    z9 = false;
                    Unit unit22 = Unit.INSTANCE;
                }
            }
            if (z8) {
                this.f8904q = null;
                C6692o c6692o = this.f8897j;
                if (c6692o != null) {
                    c6692o.m7821n();
                }
            }
            if (z9) {
                return m7783f(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: w */
    public final IOException m7798w(IOException iOException) {
        boolean z6;
        synchronized (this) {
            try {
                z6 = false;
                if (this.f8902o) {
                    this.f8902o = false;
                    if (!this.f8900m && !this.f8901n) {
                        z6 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6 ? m7783f(iOException) : iOException;
    }

    /* renamed from: x */
    public final String m7799x() {
        return this.f8889b.m6588l().m6830o();
    }

    /* renamed from: y */
    public final Socket m7800y() {
        C6692o c6692o = this.f8897j;
        Intrinsics.checkNotNull(c6692o);
        if (AbstractC6427k.f8100b && !Thread.holdsLock(c6692o)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c6692o);
        }
        List listM7815h = c6692o.m7815h();
        Iterator it = listM7815h.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i6 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM7815h.remove(i6);
        this.f8897j = null;
        if (listM7815h.isEmpty()) {
            c6692o.m7829v(System.nanoTime());
            if (this.f8891d.m7836c(c6692o)) {
                return c6692o.m7831x();
            }
        }
        return null;
    }

    /* renamed from: z */
    public final boolean m7801z() {
        C6685h c6685h = this.f8904q;
        if (c6685h == null || !c6685h.m7746m()) {
            return false;
        }
        InterfaceC6686i interfaceC6686i = this.f8896i;
        Intrinsics.checkNotNull(interfaceC6686i);
        InterfaceC6698u interfaceC6698uMo7760b = interfaceC6686i.mo7760b();
        C6685h c6685h2 = this.f8904q;
        return interfaceC6698uMo7760b.mo7774f(c6685h2 != null ? c6685h2.m7743j() : null);
    }
}

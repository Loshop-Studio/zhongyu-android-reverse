package p192n9;

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
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import okio.AsyncTimeout;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p134i7.AbstractC8768a0;
import p136i9.AbstractC8920r;
import p136i9.C8897a0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8918p;
import p136i9.InterfaceC8904e;
import p136i9.InterfaceC8906f;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;
import p170l9.C9284a;
import p192n9.InterfaceC9494u;
import p203o9.C9546a;
import p203o9.C9547b;
import p203o9.C9552g;
import p203o9.C9555j;

/* renamed from: n9.n */
/* loaded from: classes5.dex */
public final class C9487n implements InterfaceC8904e, Cloneable {

    /* renamed from: a */
    public final C8897a0 f18758a;

    /* renamed from: b */
    public final C8899b0 f18759b;

    /* renamed from: c */
    public final boolean f18760c;

    /* renamed from: d */
    public final C9489p f18761d;

    /* renamed from: e */
    public final AbstractC8920r f18762e;

    /* renamed from: f */
    public final c f18763f;

    /* renamed from: g */
    public final AtomicBoolean f18764g;

    /* renamed from: h */
    public Object f18765h;

    /* renamed from: i */
    public InterfaceC9482i f18766i;

    /* renamed from: j */
    public C9488o f18767j;

    /* renamed from: k */
    public boolean f18768k;

    /* renamed from: l */
    public C9481h f18769l;

    /* renamed from: m */
    public boolean f18770m;

    /* renamed from: n */
    public boolean f18771n;

    /* renamed from: o */
    public boolean f18772o;

    /* renamed from: p */
    public volatile boolean f18773p;

    /* renamed from: q */
    public volatile C9481h f18774q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f18775r;

    /* renamed from: n9.n$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC8906f f18776a;

        /* renamed from: b */
        public volatile AtomicInteger f18777b;

        /* renamed from: c */
        public final /* synthetic */ C9487n f18778c;

        public a(C9487n c9487n, InterfaceC8906f responseCallback) {
            AbstractC9133u.m16133g(responseCallback, "responseCallback");
            this.f18778c = c9487n;
            this.f18776a = responseCallback;
            this.f18777b = new AtomicInteger(0);
        }

        /* renamed from: c */
        public static /* synthetic */ void m17535c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.m17537b(rejectedExecutionException);
        }

        /* renamed from: a */
        public final void m17536a(ExecutorService executorService) {
            AbstractC9133u.m16133g(executorService, "executorService");
            AbstractC9041k.m15775e(this.f18778c.m17521l().m14979o());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    m17537b(e10);
                    this.f18778c.m17521l().m14979o().m15217f(this);
                }
            } catch (Throwable th) {
                this.f18778c.m17521l().m14979o().m15217f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final void m17537b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f18778c.m17531w(interruptedIOException);
            this.f18776a.mo2321a(this.f18778c, interruptedIOException);
        }

        /* renamed from: d */
        public final C9487n m17538d() {
            return this.f18778c;
        }

        /* renamed from: e */
        public final AtomicInteger m17539e() {
            return this.f18777b;
        }

        /* renamed from: f */
        public final String m17540f() {
            return this.f18778c.m17526q().m15052l().m15284h();
        }

        /* renamed from: g */
        public final void m17541g(a other) {
            AbstractC9133u.m16133g(other, "other");
            this.f18777b = other.f18777b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            C8918p c8918pM14979o;
            String str = "OkHttp " + this.f18778c.m17532x();
            C9487n c9487n = this.f18778c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c9487n.f18763f.enter();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f18776a.mo2322b(c9487n, c9487n.m17528s());
                            c8918pM14979o = c9487n.m17521l().m14979o();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                AbstractC9570c.f19216a.m18112e().mo18100l("Callback failure for " + c9487n.m17514C(), 4, e10);
                            } else {
                                this.f18776a.mo2321a(c9487n, e10);
                            }
                            c8918pM14979o = c9487n.m17521l().m14979o();
                            c8918pM14979o.m15217f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            c9487n.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC8722b.m14228a(iOException, th);
                                this.f18776a.mo2321a(c9487n, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c9487n.m17521l().m14979o().m15217f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th = th4;
                }
                c8918pM14979o.m15217f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: n9.n$b */
    public static final class b extends WeakReference {

        /* renamed from: a */
        public final Object f18779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9487n referent, Object obj) {
            super(referent);
            AbstractC9133u.m16133g(referent, "referent");
            this.f18779a = obj;
        }

        /* renamed from: a */
        public final Object m17542a() {
            return this.f18779a;
        }
    }

    /* renamed from: n9.n$c */
    public static final class c extends AsyncTimeout {
        public c() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            C9487n.this.cancel();
        }
    }

    public C9487n(C8897a0 client, C8899b0 originalRequest, boolean z10) {
        AbstractC9133u.m16133g(client, "client");
        AbstractC9133u.m16133g(originalRequest, "originalRequest");
        this.f18758a = client;
        this.f18759b = originalRequest;
        this.f18760c = z10;
        this.f18761d = client.m14976l().m15193c();
        this.f18762e = client.m14981q().mo15254a(this);
        c cVar = new c();
        cVar.timeout(client.m14972h(), TimeUnit.MILLISECONDS);
        this.f18763f = cVar;
        this.f18764g = new AtomicBoolean();
        this.f18772o = true;
        this.f18775r = new CopyOnWriteArrayList();
    }

    /* renamed from: v */
    public static /* synthetic */ IOException m17511v(C9487n c9487n, C9481h c9481h, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c9487n.m17530u(c9481h, z10, z11, iOException);
    }

    /* renamed from: A */
    public final void m17512A() {
        if (this.f18768k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f18768k = true;
        this.f18763f.exit();
    }

    /* renamed from: B */
    public final IOException m17513B(IOException iOException) {
        if (this.f18768k || !this.f18763f.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: C */
    public final String m17514C() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f18760c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m17532x());
        return sb.toString();
    }

    @Override // p136i9.InterfaceC8904e
    /* renamed from: a */
    public C8899b0 mo15162a() {
        return this.f18759b;
    }

    @Override // p136i9.InterfaceC8904e
    /* renamed from: b */
    public void mo15163b(InterfaceC8906f responseCallback) {
        AbstractC9133u.m16133g(responseCallback, "responseCallback");
        if (!this.f18764g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m17517h();
        this.f18758a.m14979o().m15212a(new a(this, responseCallback));
    }

    @Override // p136i9.InterfaceC8904e
    public void cancel() {
        if (this.f18773p) {
            return;
        }
        this.f18773p = true;
        C9481h c9481h = this.f18774q;
        if (c9481h != null) {
            c9481h.m17470d();
        }
        Iterator it = this.f18775r.iterator();
        AbstractC9133u.m16132f(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC9494u.b) it.next()).cancel();
        }
        this.f18762e.m15233f(this);
    }

    @Override // p136i9.InterfaceC8904e
    public C8903d0 execute() {
        if (!this.f18764g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f18763f.enter();
        m17517h();
        try {
            this.f18758a.m14979o().m15213b(this);
            return m17528s();
        } finally {
            this.f18758a.m14979o().m15218g(this);
        }
    }

    /* renamed from: f */
    public final void m17515f(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        if (!AbstractC9041k.f17265b || Thread.holdsLock(connection)) {
            if (this.f18767j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f18767j = connection;
            connection.m17548h().add(new b(this, this.f18765h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* renamed from: g */
    public final IOException m17516g(IOException iOException) throws IOException {
        Socket socketM17533y;
        boolean z10 = AbstractC9041k.f17265b;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        C9488o c9488o = this.f18767j;
        if (c9488o != null) {
            if (z10 && Thread.holdsLock(c9488o)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9488o);
            }
            synchronized (c9488o) {
                socketM17533y = m17533y();
            }
            if (this.f18767j == null) {
                if (socketM17533y != null) {
                    AbstractC9041k.m15778h(socketM17533y);
                }
                this.f18762e.m15238k(this, c9488o);
                c9488o.m17549i().m17464g(c9488o, this);
                if (socketM17533y != null) {
                    c9488o.m17549i().m17463f(c9488o);
                }
            } else if (socketM17533y != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionM17513B = m17513B(iOException);
        if (iOException == null) {
            this.f18762e.m15230c(this);
            return iOExceptionM17513B;
        }
        AbstractC8920r abstractC8920r = this.f18762e;
        AbstractC9133u.m16130d(iOExceptionM17513B);
        abstractC8920r.m15231d(this, iOExceptionM17513B);
        return iOExceptionM17513B;
    }

    /* renamed from: h */
    public final void m17517h() {
        this.f18765h = AbstractC9570c.f19216a.m18112e().mo18092j("response.body().close()");
        this.f18762e.m15232e(this);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC8904e clone() {
        return new C9487n(this.f18758a, this.f18759b, this.f18760c);
    }

    @Override // p136i9.InterfaceC8904e
    public boolean isCanceled() {
        return this.f18773p;
    }

    /* renamed from: j */
    public final void m17519j(C8899b0 request, boolean z10, C9552g chain) {
        AbstractC9133u.m16133g(request, "request");
        AbstractC9133u.m16133g(chain, "chain");
        if (this.f18769l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f18771n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f18770m) {
                throw new IllegalStateException("Check failed.");
            }
            C8736p c8736p = C8736p.f16368a;
        }
        if (z10) {
            C9490q c9490q = new C9490q(this.f18758a.m14986v(), this.f18761d, this.f18758a.m14960G(), this.f18758a.m14966M(), chain.m17851f(), chain.m17853h(), this.f18758a.m14955B(), this.f18758a.m14961H(), this.f18758a.m14982r(), this.f18758a.m14969e(request.m15052l()), this.f18758a.m14985u(), new C9474a(this, this.f18761d.m17570d(), chain));
            this.f18766i = this.f18758a.m14982r() ? new C9484k(c9490q, this.f18758a.m14986v()) : new C9496w(c9490q);
        }
    }

    /* renamed from: k */
    public final void m17520k(boolean z10) {
        C9481h c9481h;
        synchronized (this) {
            if (!this.f18772o) {
                throw new IllegalStateException("released");
            }
            C8736p c8736p = C8736p.f16368a;
        }
        if (z10 && (c9481h = this.f18774q) != null) {
            c9481h.m17472f();
        }
        this.f18769l = null;
    }

    /* renamed from: l */
    public final C8897a0 m17521l() {
        return this.f18758a;
    }

    /* renamed from: m */
    public final C9488o m17522m() {
        return this.f18767j;
    }

    /* renamed from: n */
    public final AbstractC8920r m17523n() {
        return this.f18762e;
    }

    /* renamed from: o */
    public final boolean m17524o() {
        return this.f18760c;
    }

    /* renamed from: p */
    public final C9481h m17525p() {
        return this.f18769l;
    }

    /* renamed from: q */
    public final C8899b0 m17526q() {
        return this.f18759b;
    }

    /* renamed from: r */
    public final CopyOnWriteArrayList m17527r() {
        return this.f18775r;
    }

    /* renamed from: s */
    public final C8903d0 m17528s() {
        ArrayList arrayList = new ArrayList();
        AbstractC8768a0.m14481C(arrayList, this.f18758a.m14988x());
        arrayList.add(new C9555j(this.f18758a));
        arrayList.add(new C9546a(this.f18758a.m14978n()));
        this.f18758a.m14971g();
        arrayList.add(new C9284a(null));
        arrayList.add(C9475b.f18697a);
        if (!this.f18760c) {
            AbstractC8768a0.m14481C(arrayList, this.f18758a.m14990z());
        }
        arrayList.add(new C9547b(this.f18760c));
        C9552g c9552g = new C9552g(this, arrayList, 0, null, this.f18759b, this.f18758a.m14975k(), this.f18758a.m14960G(), this.f18758a.m14966M());
        boolean z10 = false;
        try {
            try {
                C8903d0 c8903d0Mo15333b = c9552g.mo15333b(this.f18759b);
                if (isCanceled()) {
                    AbstractC9038h.m15750f(c8903d0Mo15333b);
                    throw new IOException("Canceled");
                }
                m17531w(null);
                return c8903d0Mo15333b;
            } catch (IOException e10) {
                z10 = true;
                IOException iOExceptionM17531w = m17531w(e10);
                AbstractC9133u.m16131e(iOExceptionM17531w, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM17531w;
            }
        } catch (Throwable th) {
            if (!z10) {
                m17531w(null);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final C9481h m17529t(C9552g chain) throws IOException {
        AbstractC9133u.m16133g(chain, "chain");
        synchronized (this) {
            if (!this.f18772o) {
                throw new IllegalStateException("released");
            }
            if (this.f18771n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f18770m) {
                throw new IllegalStateException("Check failed.");
            }
            C8736p c8736p = C8736p.f16368a;
        }
        InterfaceC9482i interfaceC9482i = this.f18766i;
        AbstractC9133u.m16130d(interfaceC9482i);
        C9481h c9481h = new C9481h(this, this.f18762e, interfaceC9482i, interfaceC9482i.mo17492a().m17558r(this.f18758a, chain));
        this.f18769l = c9481h;
        this.f18774q = c9481h;
        synchronized (this) {
            this.f18770m = true;
            this.f18771n = true;
        }
        if (this.f18773p) {
            throw new IOException("Canceled");
        }
        return c9481h;
    }

    /* renamed from: u */
    public final IOException m17530u(C9481h exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        AbstractC9133u.m16133g(exchange, "exchange");
        if (AbstractC9133u.m16128b(exchange, this.f18774q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f18770m) {
                            if (z11 || !this.f18771n) {
                                z13 = false;
                            }
                            C8736p c8736p = C8736p.f16368a;
                        }
                        if (z10) {
                            this.f18770m = false;
                        }
                        if (z11) {
                            this.f18771n = false;
                        }
                        boolean z14 = this.f18770m;
                        boolean z15 = (z14 || this.f18771n) ? false : true;
                        if (!z14 && !this.f18771n && !this.f18772o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        C8736p c8736p2 = C8736p.f16368a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    C8736p c8736p22 = C8736p.f16368a;
                }
            }
            if (z12) {
                this.f18774q = null;
                C9488o c9488o = this.f18767j;
                if (c9488o != null) {
                    c9488o.m17554n();
                }
            }
            if (z13) {
                return m17516g(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: w */
    public final IOException m17531w(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f18772o) {
                    this.f18772o = false;
                    if (!this.f18770m && !this.f18771n) {
                        z10 = true;
                    }
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? m17516g(iOException) : iOException;
    }

    /* renamed from: x */
    public final String m17532x() {
        return this.f18759b.m15052l().m15291o();
    }

    /* renamed from: y */
    public final Socket m17533y() {
        C9488o c9488o = this.f18767j;
        AbstractC9133u.m16130d(c9488o);
        if (AbstractC9041k.f17265b && !Thread.holdsLock(c9488o)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c9488o);
        }
        List listM17548h = c9488o.m17548h();
        Iterator it = listM17548h.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC9133u.m16128b(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listM17548h.remove(i10);
        this.f18767j = null;
        if (listM17548h.isEmpty()) {
            c9488o.m17562v(System.nanoTime());
            if (this.f18761d.m17569c(c9488o)) {
                return c9488o.m17564x();
            }
        }
        return null;
    }

    /* renamed from: z */
    public final boolean m17534z() {
        C9481h c9481h = this.f18774q;
        if (c9481h == null || !c9481h.m17479m()) {
            return false;
        }
        InterfaceC9482i interfaceC9482i = this.f18766i;
        AbstractC9133u.m16130d(interfaceC9482i);
        InterfaceC9494u interfaceC9494uMo17493b = interfaceC9482i.mo17493b();
        C9481h c9481h2 = this.f18774q;
        return interfaceC9494uMo17493b.mo17507e(c9481h2 != null ? c9481h2.m17476j() : null);
    }
}

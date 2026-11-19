package ca;

import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p136i9.AbstractC8905e0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8927y;
import p136i9.InterfaceC8904e;
import p136i9.InterfaceC8906f;

/* renamed from: ca.t */
/* loaded from: classes5.dex */
public final class C5303t implements InterfaceC5282d {

    /* renamed from: a */
    public final C5279b0 f2536a;

    /* renamed from: b */
    public final Object f2537b;

    /* renamed from: c */
    public final Object[] f2538c;

    /* renamed from: d */
    public final InterfaceC8904e.a f2539d;

    /* renamed from: e */
    public final InterfaceC5290h f2540e;

    /* renamed from: f */
    public volatile boolean f2541f;

    /* renamed from: g */
    public InterfaceC8904e f2542g;

    /* renamed from: h */
    public Throwable f2543h;

    /* renamed from: i */
    public boolean f2544i;

    /* renamed from: ca.t$a */
    public class a implements InterfaceC8906f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5286f f2545a;

        public a(InterfaceC5286f interfaceC5286f) {
            this.f2545a = interfaceC5286f;
        }

        @Override // p136i9.InterfaceC8906f
        /* renamed from: a */
        public void mo2321a(InterfaceC8904e interfaceC8904e, IOException iOException) {
            m2323c(iOException);
        }

        @Override // p136i9.InterfaceC8906f
        /* renamed from: b */
        public void mo2322b(InterfaceC8904e interfaceC8904e, C8903d0 c8903d0) {
            try {
                try {
                    this.f2545a.mo2274b(C5303t.this, C5303t.this.m2320g(c8903d0));
                } catch (Throwable th) {
                    AbstractC5291h0.m2300t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC5291h0.m2300t(th2);
                m2323c(th2);
            }
        }

        /* renamed from: c */
        public final void m2323c(Throwable th) {
            try {
                this.f2545a.mo2273a(C5303t.this, th);
            } catch (Throwable th2) {
                AbstractC5291h0.m2300t(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: ca.t$b */
    public static final class b extends AbstractC8905e0 {

        /* renamed from: a */
        public final AbstractC8905e0 f2547a;

        /* renamed from: b */
        public final BufferedSource f2548b;

        /* renamed from: c */
        public IOException f2549c;

        /* renamed from: ca.t$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j10) throws IOException {
                try {
                    return super.read(buffer, j10);
                } catch (IOException e10) {
                    b.this.f2549c = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC8905e0 abstractC8905e0) {
            this.f2547a = abstractC8905e0;
            this.f2548b = Okio.buffer(new a(abstractC8905e0.source()));
        }

        /* renamed from: b */
        public void m2324b() throws IOException {
            IOException iOException = this.f2549c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p136i9.AbstractC8905e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2547a.close();
        }

        @Override // p136i9.AbstractC8905e0
        public long contentLength() {
            return this.f2547a.contentLength();
        }

        @Override // p136i9.AbstractC8905e0
        public C8927y contentType() {
            return this.f2547a.contentType();
        }

        @Override // p136i9.AbstractC8905e0
        public BufferedSource source() {
            return this.f2548b;
        }
    }

    /* renamed from: ca.t$c */
    public static final class c extends AbstractC8905e0 {

        /* renamed from: a */
        public final C8927y f2551a;

        /* renamed from: b */
        public final long f2552b;

        public c(C8927y c8927y, long j10) {
            this.f2551a = c8927y;
            this.f2552b = j10;
        }

        @Override // p136i9.AbstractC8905e0
        public long contentLength() {
            return this.f2552b;
        }

        @Override // p136i9.AbstractC8905e0
        public C8927y contentType() {
            return this.f2551a;
        }

        @Override // p136i9.AbstractC8905e0
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C5303t(C5279b0 c5279b0, Object obj, Object[] objArr, InterfaceC8904e.a aVar, InterfaceC5290h interfaceC5290h) {
        this.f2536a = c5279b0;
        this.f2537b = obj;
        this.f2538c = objArr;
        this.f2539d = aVar;
        this.f2540e = interfaceC5290h;
    }

    @Override // ca.InterfaceC5282d
    /* renamed from: a */
    public synchronized C8899b0 mo2248a() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m2319f().mo15162a();
    }

    @Override // ca.InterfaceC5282d
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5303t m27379clone() {
        return new C5303t(this.f2536a, this.f2537b, this.f2538c, this.f2539d, this.f2540e);
    }

    @Override // ca.InterfaceC5282d
    public void cancel() {
        InterfaceC8904e interfaceC8904e;
        this.f2541f = true;
        synchronized (this) {
            interfaceC8904e = this.f2542g;
        }
        if (interfaceC8904e != null) {
            interfaceC8904e.cancel();
        }
    }

    @Override // ca.InterfaceC5282d
    /* renamed from: d */
    public void mo2249d(InterfaceC5286f interfaceC5286f) {
        InterfaceC8904e interfaceC8904e;
        Throwable th;
        Objects.requireNonNull(interfaceC5286f, "callback == null");
        synchronized (this) {
            try {
                if (this.f2544i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f2544i = true;
                interfaceC8904e = this.f2542g;
                th = this.f2543h;
                if (interfaceC8904e == null && th == null) {
                    try {
                        InterfaceC8904e interfaceC8904eM2318e = m2318e();
                        this.f2542g = interfaceC8904eM2318e;
                        interfaceC8904e = interfaceC8904eM2318e;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5291h0.m2300t(th);
                        this.f2543h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC5286f.mo2273a(this, th);
            return;
        }
        if (this.f2541f) {
            interfaceC8904e.cancel();
        }
        interfaceC8904e.mo15163b(new a(interfaceC5286f));
    }

    /* renamed from: e */
    public final InterfaceC8904e m2318e() {
        InterfaceC8904e interfaceC8904eMo14968a = this.f2539d.mo14968a(this.f2536a.m2228a(this.f2537b, this.f2538c));
        if (interfaceC8904eMo14968a != null) {
            return interfaceC8904eMo14968a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: f */
    public final InterfaceC8904e m2319f() throws IOException {
        InterfaceC8904e interfaceC8904e = this.f2542g;
        if (interfaceC8904e != null) {
            return interfaceC8904e;
        }
        Throwable th = this.f2543h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC8904e interfaceC8904eM2318e = m2318e();
            this.f2542g = interfaceC8904eM2318e;
            return interfaceC8904eM2318e;
        } catch (IOException | Error | RuntimeException e10) {
            AbstractC5291h0.m2300t(e10);
            this.f2543h = e10;
            throw e10;
        }
    }

    /* renamed from: g */
    public C5281c0 m2320g(C8903d0 c8903d0) throws IOException {
        AbstractC8905e0 abstractC8905e0M15124b = c8903d0.m15124b();
        C8903d0 c8903d0M15145c = c8903d0.m15137p().m15144b(new c(abstractC8905e0M15124b.contentType(), abstractC8905e0M15124b.contentLength())).m15145c();
        int iM15128f = c8903d0M15145c.m15128f();
        if (iM15128f < 200 || iM15128f >= 300) {
            try {
                return C5281c0.m2241c(AbstractC5291h0.m2281a(abstractC8905e0M15124b), c8903d0M15145c);
            } finally {
                abstractC8905e0M15124b.close();
            }
        }
        if (iM15128f == 204 || iM15128f == 205) {
            abstractC8905e0M15124b.close();
            return C5281c0.m2242g(null, c8903d0M15145c);
        }
        b bVar = new b(abstractC8905e0M15124b);
        try {
            return C5281c0.m2242g(this.f2540e.convert(bVar), c8903d0M15145c);
        } catch (RuntimeException e10) {
            bVar.m2324b();
            throw e10;
        }
    }

    @Override // ca.InterfaceC5282d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f2541f) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC8904e interfaceC8904e = this.f2542g;
                if (interfaceC8904e == null || !interfaceC8904e.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }
}

package p038c9;

import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p172l8.AbstractC8927z;
import p172l8.C8921t;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8907f;

/* renamed from: c9.l */
/* loaded from: classes5.dex */
public final class C5286l implements InterfaceC5274b {

    /* renamed from: a */
    public final C5297w f2562a;

    /* renamed from: b */
    public final Object[] f2563b;

    /* renamed from: c */
    public final InterfaceC8906e.a f2564c;

    /* renamed from: d */
    public final InterfaceC5280f f2565d;

    /* renamed from: e */
    public volatile boolean f2566e;

    /* renamed from: f */
    public InterfaceC8906e f2567f;

    /* renamed from: g */
    public Throwable f2568g;

    /* renamed from: h */
    public boolean f2569h;

    /* renamed from: c9.l$a */
    public class a implements InterfaceC8907f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5278d f2570a;

        public a(InterfaceC5278d interfaceC5278d) {
            this.f2570a = interfaceC5278d;
        }

        @Override // p172l8.InterfaceC8907f
        /* renamed from: a */
        public void mo2463a(InterfaceC8906e interfaceC8906e, IOException iOException) {
            m2465c(iOException);
        }

        @Override // p172l8.InterfaceC8907f
        /* renamed from: b */
        public void mo2464b(InterfaceC8906e interfaceC8906e, C8926y c8926y) {
            try {
                try {
                    this.f2570a.mo237b(C5286l.this, C5286l.this.m2462f(c8926y));
                } catch (Throwable th) {
                    AbstractC5277c0.m2443s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC5277c0.m2443s(th2);
                m2465c(th2);
            }
        }

        /* renamed from: c */
        public final void m2465c(Throwable th) {
            try {
                this.f2570a.mo236a(C5286l.this, th);
            } catch (Throwable th2) {
                AbstractC5277c0.m2443s(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: c9.l$b */
    public static final class b extends AbstractC8927z {

        /* renamed from: a */
        public final AbstractC8927z f2572a;

        /* renamed from: b */
        public final BufferedSource f2573b;

        /* renamed from: c */
        public IOException f2574c;

        /* renamed from: c9.l$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j9) throws IOException {
                try {
                    return super.read(buffer, j9);
                } catch (IOException e10) {
                    b.this.f2574c = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC8927z abstractC8927z) {
            this.f2572a = abstractC8927z;
            this.f2573b = Okio.buffer(new a(abstractC8927z.source()));
        }

        /* renamed from: c */
        public void m2466c() throws IOException {
            IOException iOException = this.f2574c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p172l8.AbstractC8927z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2572a.close();
        }

        @Override // p172l8.AbstractC8927z
        public long contentLength() {
            return this.f2572a.contentLength();
        }

        @Override // p172l8.AbstractC8927z
        public C8921t contentType() {
            return this.f2572a.contentType();
        }

        @Override // p172l8.AbstractC8927z
        public BufferedSource source() {
            return this.f2573b;
        }
    }

    /* renamed from: c9.l$c */
    public static final class c extends AbstractC8927z {

        /* renamed from: a */
        public final C8921t f2576a;

        /* renamed from: b */
        public final long f2577b;

        public c(C8921t c8921t, long j9) {
            this.f2576a = c8921t;
            this.f2577b = j9;
        }

        @Override // p172l8.AbstractC8927z
        public long contentLength() {
            return this.f2577b;
        }

        @Override // p172l8.AbstractC8927z
        public C8921t contentType() {
            return this.f2576a;
        }

        @Override // p172l8.AbstractC8927z
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C5286l(C5297w c5297w, Object[] objArr, InterfaceC8906e.a aVar, InterfaceC5280f interfaceC5280f) {
        this.f2562a = c5297w;
        this.f2563b = objArr;
        this.f2564c = aVar;
        this.f2565d = interfaceC5280f;
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: a */
    public synchronized C8924w mo233a() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m2461e().mo13866a();
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5286l m24658clone() {
        return new C5286l(this.f2562a, this.f2563b, this.f2564c, this.f2565d);
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: c */
    public void mo234c(InterfaceC5278d interfaceC5278d) {
        InterfaceC8906e interfaceC8906e;
        Throwable th;
        Objects.requireNonNull(interfaceC5278d, "callback == null");
        synchronized (this) {
            try {
                if (this.f2569h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f2569h = true;
                interfaceC8906e = this.f2567f;
                th = this.f2568g;
                if (interfaceC8906e == null && th == null) {
                    try {
                        InterfaceC8906e interfaceC8906eM2460d = m2460d();
                        this.f2567f = interfaceC8906eM2460d;
                        interfaceC8906e = interfaceC8906eM2460d;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5277c0.m2443s(th);
                        this.f2568g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC5278d.mo236a(this, th);
            return;
        }
        if (this.f2566e) {
            interfaceC8906e.cancel();
        }
        interfaceC8906e.mo13867k(new a(interfaceC5278d));
    }

    @Override // p038c9.InterfaceC5274b
    public void cancel() {
        InterfaceC8906e interfaceC8906e;
        this.f2566e = true;
        synchronized (this) {
            interfaceC8906e = this.f2567f;
        }
        if (interfaceC8906e != null) {
            interfaceC8906e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC8906e m2460d() {
        InterfaceC8906e interfaceC8906eMo13868b = this.f2564c.mo13868b(this.f2562a.m2506a(this.f2563b));
        if (interfaceC8906eMo13868b != null) {
            return interfaceC8906eMo13868b;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: e */
    public final InterfaceC8906e m2461e() throws IOException {
        InterfaceC8906e interfaceC8906e = this.f2567f;
        if (interfaceC8906e != null) {
            return interfaceC8906e;
        }
        Throwable th = this.f2568g;
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
            InterfaceC8906e interfaceC8906eM2460d = m2460d();
            this.f2567f = interfaceC8906eM2460d;
            return interfaceC8906eM2460d;
        } catch (IOException | Error | RuntimeException e10) {
            AbstractC5277c0.m2443s(e10);
            this.f2568g = e10;
            throw e10;
        }
    }

    /* renamed from: f */
    public C5298x m2462f(C8926y c8926y) throws IOException {
        AbstractC8927z abstractC8927zM14170a = c8926y.m14170a();
        C8926y c8926yM14191c = c8926y.m14183s().m14190b(new c(abstractC8927zM14170a.contentType(), abstractC8927zM14170a.contentLength())).m14191c();
        int iM14174i = c8926yM14191c.m14174i();
        if (iM14174i < 200 || iM14174i >= 300) {
            try {
                return C5298x.m2517c(AbstractC5277c0.m2425a(abstractC8927zM14170a), c8926yM14191c);
            } finally {
                abstractC8927zM14170a.close();
            }
        }
        if (iM14174i == 204 || iM14174i == 205) {
            abstractC8927zM14170a.close();
            return C5298x.m2519i(null, c8926yM14191c);
        }
        b bVar = new b(abstractC8927zM14170a);
        try {
            return C5298x.m2519i(this.f2565d.convert(bVar), c8926yM14191c);
        } catch (RuntimeException e10) {
            bVar.m2466c();
            throw e10;
        }
    }

    @Override // p038c9.InterfaceC5274b
    public boolean isCanceled() {
        boolean z9 = true;
        if (this.f2566e) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC8906e interfaceC8906e = this.f2567f;
                if (interfaceC8906e == null || !interfaceC8906e.isCanceled()) {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }
}

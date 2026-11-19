package p122df;

import java.io.IOException;
import java.util.Objects;
import je.AbstractC9746z;
import je.C9740t;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9726f;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* renamed from: df.t */
/* loaded from: classes6.dex */
public final class C9053t implements InterfaceC9032d {

    /* renamed from: c */
    public final C9029b0 f21145c;

    /* renamed from: d */
    public final Object f21146d;

    /* renamed from: e */
    public final Object[] f21147e;

    /* renamed from: f */
    public final InterfaceC9725e.a f21148f;

    /* renamed from: g */
    public final InterfaceC9040h f21149g;

    /* renamed from: h */
    public volatile boolean f21150h;

    /* renamed from: i */
    public InterfaceC9725e f21151i;

    /* renamed from: j */
    public Throwable f21152j;

    /* renamed from: k */
    public boolean f21153k;

    /* renamed from: df.t$a */
    public class a implements InterfaceC9726f {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9036f f21154c;

        public a(InterfaceC9036f interfaceC9036f) {
            this.f21154c = interfaceC9036f;
        }

        @Override // je.InterfaceC9726f
        /* renamed from: a */
        public void mo7268a(InterfaceC9725e interfaceC9725e, IOException iOException) {
            m17779c(iOException);
        }

        @Override // je.InterfaceC9726f
        /* renamed from: b */
        public void mo7269b(InterfaceC9725e interfaceC9725e, C9745y c9745y) {
            try {
                try {
                    this.f21154c.mo17735b(C9053t.this, C9053t.this.m17778f(c9745y));
                } catch (Throwable th) {
                    AbstractC9041h0.m17758t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC9041h0.m17758t(th2);
                m17779c(th2);
            }
        }

        /* renamed from: c */
        public final void m17779c(Throwable th) {
            try {
                this.f21154c.mo17734a(C9053t.this, th);
            } catch (Throwable th2) {
                AbstractC9041h0.m17758t(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: df.t$b */
    public static final class b extends AbstractC9746z {

        /* renamed from: c */
        public final AbstractC9746z f21156c;

        /* renamed from: d */
        public final BufferedSource f21157d;

        /* renamed from: e */
        public IOException f21158e;

        /* renamed from: df.t$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j10) throws IOException {
                try {
                    return super.read(buffer, j10);
                } catch (IOException e10) {
                    b.this.f21158e = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC9746z abstractC9746z) {
            this.f21156c = abstractC9746z;
            this.f21157d = Okio.buffer(new a(abstractC9746z.source()));
        }

        @Override // je.AbstractC9746z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21156c.close();
        }

        @Override // je.AbstractC9746z
        public long contentLength() {
            return this.f21156c.contentLength();
        }

        @Override // je.AbstractC9746z
        public C9740t contentType() {
            return this.f21156c.contentType();
        }

        /* renamed from: f */
        public void m17780f() throws IOException {
            IOException iOException = this.f21158e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // je.AbstractC9746z
        public BufferedSource source() {
            return this.f21157d;
        }
    }

    /* renamed from: df.t$c */
    public static final class c extends AbstractC9746z {

        /* renamed from: c */
        public final C9740t f21160c;

        /* renamed from: d */
        public final long f21161d;

        public c(C9740t c9740t, long j10) {
            this.f21160c = c9740t;
            this.f21161d = j10;
        }

        @Override // je.AbstractC9746z
        public long contentLength() {
            return this.f21161d;
        }

        @Override // je.AbstractC9746z
        public C9740t contentType() {
            return this.f21160c;
        }

        @Override // je.AbstractC9746z
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C9053t(C9029b0 c9029b0, Object obj, Object[] objArr, InterfaceC9725e.a aVar, InterfaceC9040h interfaceC9040h) {
        this.f21145c = c9029b0;
        this.f21146d = obj;
        this.f21147e = objArr;
        this.f21148f = aVar;
        this.f21149g = interfaceC9040h;
    }

    @Override // p122df.InterfaceC9032d
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C9053t m34159clone() {
        return new C9053t(this.f21145c, this.f21146d, this.f21147e, this.f21148f, this.f21149g);
    }

    @Override // p122df.InterfaceC9032d
    /* renamed from: c */
    public void mo17710c(InterfaceC9036f interfaceC9036f) {
        InterfaceC9725e interfaceC9725e;
        Throwable th;
        Objects.requireNonNull(interfaceC9036f, "callback == null");
        synchronized (this) {
            try {
                if (this.f21153k) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f21153k = true;
                interfaceC9725e = this.f21151i;
                th = this.f21152j;
                if (interfaceC9725e == null && th == null) {
                    try {
                        InterfaceC9725e interfaceC9725eM17776d = m17776d();
                        this.f21151i = interfaceC9725eM17776d;
                        interfaceC9725e = interfaceC9725eM17776d;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC9041h0.m17758t(th);
                        this.f21152j = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC9036f.mo17734a(this, th);
            return;
        }
        if (this.f21150h) {
            interfaceC9725e.cancel();
        }
        interfaceC9725e.mo19318a(new a(interfaceC9036f));
    }

    @Override // p122df.InterfaceC9032d
    public void cancel() {
        InterfaceC9725e interfaceC9725e;
        this.f21150h = true;
        synchronized (this) {
            interfaceC9725e = this.f21151i;
        }
        if (interfaceC9725e != null) {
            interfaceC9725e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC9725e m17776d() {
        InterfaceC9725e interfaceC9725eMo19319b = this.f21148f.mo19319b(this.f21145c.m17689a(this.f21146d, this.f21147e));
        if (interfaceC9725eMo19319b != null) {
            return interfaceC9725eMo19319b;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: e */
    public final InterfaceC9725e m17777e() throws IOException {
        InterfaceC9725e interfaceC9725e = this.f21151i;
        if (interfaceC9725e != null) {
            return interfaceC9725e;
        }
        Throwable th = this.f21152j;
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
            InterfaceC9725e interfaceC9725eM17776d = m17776d();
            this.f21151i = interfaceC9725eM17776d;
            return interfaceC9725eM17776d;
        } catch (IOException | Error | RuntimeException e10) {
            AbstractC9041h0.m17758t(e10);
            this.f21152j = e10;
            throw e10;
        }
    }

    /* renamed from: f */
    public C9031c0 m17778f(C9745y c9745y) throws IOException {
        AbstractC9746z abstractC9746zM19628e = c9745y.m19628e();
        C9745y c9745yM19648c = c9745y.m19641v().m19647b(new c(abstractC9746zM19628e.contentType(), abstractC9746zM19628e.contentLength())).m19648c();
        int iM19632j = c9745yM19648c.m19632j();
        if (iM19632j < 200 || iM19632j >= 300) {
            try {
                return C9031c0.m17702c(AbstractC9041h0.m17739a(abstractC9746zM19628e), c9745yM19648c);
            } finally {
                abstractC9746zM19628e.close();
            }
        }
        if (iM19632j == 204 || iM19632j == 205) {
            abstractC9746zM19628e.close();
            return C9031c0.m17703h(null, c9745yM19648c);
        }
        b bVar = new b(abstractC9746zM19628e);
        try {
            return C9031c0.m17703h(this.f21149g.convert(bVar), c9745yM19648c);
        } catch (RuntimeException e10) {
            bVar.m17780f();
            throw e10;
        }
    }

    @Override // p122df.InterfaceC9032d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f21150h) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC9725e interfaceC9725e = this.f21151i;
                if (interfaceC9725e == null || !interfaceC9725e.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // p122df.InterfaceC9032d
    public synchronized C9743w request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m17777e().request();
    }
}

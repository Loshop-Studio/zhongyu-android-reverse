package p226r9;

import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p011a9.AbstractC0063z;
import p011a9.C0057t;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0043f;

/* renamed from: r9.t */
/* loaded from: classes5.dex */
public final class C9079t implements InterfaceC9058d {

    /* renamed from: a */
    public final C9055b0 f15642a;

    /* renamed from: b */
    public final Object f15643b;

    /* renamed from: c */
    public final Object[] f15644c;

    /* renamed from: d */
    public final InterfaceC0042e.a f15645d;

    /* renamed from: e */
    public final InterfaceC9066h f15646e;

    /* renamed from: f */
    public volatile boolean f15647f;

    /* renamed from: g */
    public InterfaceC0042e f15648g;

    /* renamed from: h */
    public Throwable f15649h;

    /* renamed from: i */
    public boolean f15650i;

    /* renamed from: r9.t$a */
    public class a implements InterfaceC0043f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9062f f15651a;

        public a(InterfaceC9062f interfaceC9062f) {
            this.f15651a = interfaceC9062f;
        }

        @Override // p011a9.InterfaceC0043f
        /* renamed from: a */
        public void mo110a(InterfaceC0042e interfaceC0042e, C0062y c0062y) {
            try {
                try {
                    this.f15651a.mo15271a(C9079t.this, C9079t.this.m15318e(c0062y));
                } catch (Throwable th) {
                    AbstractC9067h0.m15298t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC9067h0.m15298t(th2);
                m15319c(th2);
            }
        }

        @Override // p011a9.InterfaceC0043f
        /* renamed from: b */
        public void mo111b(InterfaceC0042e interfaceC0042e, IOException iOException) {
            m15319c(iOException);
        }

        /* renamed from: c */
        public final void m15319c(Throwable th) {
            try {
                this.f15651a.mo15272b(C9079t.this, th);
            } catch (Throwable th2) {
                AbstractC9067h0.m15298t(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: r9.t$b */
    public static final class b extends AbstractC0063z {

        /* renamed from: a */
        public final AbstractC0063z f15653a;

        /* renamed from: b */
        public final BufferedSource f15654b;

        /* renamed from: c */
        public IOException f15655c;

        /* renamed from: r9.t$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j10) throws IOException {
                try {
                    return super.read(buffer, j10);
                } catch (IOException e10) {
                    b.this.f15655c = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC0063z abstractC0063z) {
            this.f15653a = abstractC0063z;
            this.f15654b = Okio.buffer(new a(abstractC0063z.source()));
        }

        @Override // p011a9.AbstractC0063z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f15653a.close();
        }

        @Override // p011a9.AbstractC0063z
        public long contentLength() {
            return this.f15653a.contentLength();
        }

        @Override // p011a9.AbstractC0063z
        public C0057t contentType() {
            return this.f15653a.contentType();
        }

        /* renamed from: f */
        public void m15320f() throws IOException {
            IOException iOException = this.f15655c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p011a9.AbstractC0063z
        public BufferedSource source() {
            return this.f15654b;
        }
    }

    /* renamed from: r9.t$c */
    public static final class c extends AbstractC0063z {

        /* renamed from: a */
        public final C0057t f15657a;

        /* renamed from: b */
        public final long f15658b;

        public c(C0057t c0057t, long j10) {
            this.f15657a = c0057t;
            this.f15658b = j10;
        }

        @Override // p011a9.AbstractC0063z
        public long contentLength() {
            return this.f15658b;
        }

        @Override // p011a9.AbstractC0063z
        public C0057t contentType() {
            return this.f15657a;
        }

        @Override // p011a9.AbstractC0063z
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C9079t(C9055b0 c9055b0, Object obj, Object[] objArr, InterfaceC0042e.a aVar, InterfaceC9066h interfaceC9066h) {
        this.f15642a = c9055b0;
        this.f15643b = obj;
        this.f15644c = objArr;
        this.f15645d = aVar;
        this.f15646e = interfaceC9066h;
    }

    @Override // p226r9.InterfaceC9058d
    /* renamed from: a */
    public synchronized C0060w mo15246a() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m15317d().mo107a();
    }

    @Override // p226r9.InterfaceC9058d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9079t clone() {
        return new C9079t(this.f15642a, this.f15643b, this.f15644c, this.f15645d, this.f15646e);
    }

    /* renamed from: c */
    public final InterfaceC0042e m15316c() {
        InterfaceC0042e interfaceC0042eMo109b = this.f15645d.mo109b(this.f15642a.m15227a(this.f15643b, this.f15644c));
        if (interfaceC0042eMo109b != null) {
            return interfaceC0042eMo109b;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // p226r9.InterfaceC9058d
    public void cancel() {
        InterfaceC0042e interfaceC0042e;
        this.f15647f = true;
        synchronized (this) {
            interfaceC0042e = this.f15648g;
        }
        if (interfaceC0042e != null) {
            interfaceC0042e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC0042e m15317d() throws IOException {
        InterfaceC0042e interfaceC0042e = this.f15648g;
        if (interfaceC0042e != null) {
            return interfaceC0042e;
        }
        Throwable th = this.f15649h;
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
            InterfaceC0042e interfaceC0042eM15316c = m15316c();
            this.f15648g = interfaceC0042eM15316c;
            return interfaceC0042eM15316c;
        } catch (IOException | Error | RuntimeException e10) {
            AbstractC9067h0.m15298t(e10);
            this.f15649h = e10;
            throw e10;
        }
    }

    /* renamed from: e */
    public C9057c0 m15318e(C0062y c0062y) throws IOException {
        AbstractC0063z abstractC0063zM414a = c0062y.m414a();
        C0062y c0062yM435c = c0062y.m427s().m434b(new c(abstractC0063zM414a.contentType(), abstractC0063zM414a.contentLength())).m435c();
        int iM418i = c0062yM435c.m418i();
        if (iM418i < 200 || iM418i >= 300) {
            try {
                return C9057c0.m15240c(AbstractC9067h0.m15279a(abstractC0063zM414a), c0062yM435c);
            } finally {
                abstractC0063zM414a.close();
            }
        }
        if (iM418i == 204 || iM418i == 205) {
            abstractC0063zM414a.close();
            return C9057c0.m15241f(null, c0062yM435c);
        }
        b bVar = new b(abstractC0063zM414a);
        try {
            return C9057c0.m15241f(this.f15646e.convert(bVar), c0062yM435c);
        } catch (RuntimeException e10) {
            bVar.m15320f();
            throw e10;
        }
    }

    @Override // p226r9.InterfaceC9058d
    public boolean isCanceled() {
        boolean z9 = true;
        if (this.f15647f) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC0042e interfaceC0042e = this.f15648g;
                if (interfaceC0042e == null || !interfaceC0042e.isCanceled()) {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // p226r9.InterfaceC9058d
    /* renamed from: j */
    public void mo15247j(InterfaceC9062f interfaceC9062f) {
        InterfaceC0042e interfaceC0042e;
        Throwable th;
        Objects.requireNonNull(interfaceC9062f, "callback == null");
        synchronized (this) {
            try {
                if (this.f15650i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f15650i = true;
                interfaceC0042e = this.f15648g;
                th = this.f15649h;
                if (interfaceC0042e == null && th == null) {
                    try {
                        InterfaceC0042e interfaceC0042eM15316c = m15316c();
                        this.f15648g = interfaceC0042eM15316c;
                        interfaceC0042e = interfaceC0042eM15316c;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC9067h0.m15298t(th);
                        this.f15649h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC9062f.mo15272b(this, th);
            return;
        }
        if (this.f15647f) {
            interfaceC0042e.cancel();
        }
        interfaceC0042e.mo108o(new a(interfaceC9062f));
    }
}

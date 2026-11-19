package p200z5;

import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p058f5.AbstractC6364e0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6386y;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6365f;

/* renamed from: z5.t */
/* loaded from: classes4.dex */
public final class C7979t implements InterfaceC7958d {

    /* renamed from: a */
    public final C7955b0 f10797a;

    /* renamed from: b */
    public final Object f10798b;

    /* renamed from: c */
    public final Object[] f10799c;

    /* renamed from: d */
    public final InterfaceC6363e.a f10800d;

    /* renamed from: e */
    public final InterfaceC7966h f10801e;

    /* renamed from: f */
    public volatile boolean f10802f;

    /* renamed from: g */
    public InterfaceC6363e f10803g;

    /* renamed from: h */
    public Throwable f10804h;

    /* renamed from: i */
    public boolean f10805i;

    /* renamed from: z5.t$a */
    public class a implements InterfaceC6365f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7962f f10806a;

        public a(InterfaceC7962f interfaceC7962f) {
            this.f10806a = interfaceC7962f;
        }

        @Override // p058f5.InterfaceC6365f
        /* renamed from: a */
        public void mo6711a(InterfaceC6363e interfaceC6363e, C6362d0 c6362d0) {
            try {
                try {
                    this.f10806a.mo9121a(C7979t.this, C7979t.this.m9860f(c6362d0));
                } catch (Throwable th) {
                    AbstractC7967h0.m9840t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC7967h0.m9840t(th2);
                m9861c(th2);
            }
        }

        @Override // p058f5.InterfaceC6365f
        /* renamed from: b */
        public void mo6712b(InterfaceC6363e interfaceC6363e, IOException iOException) {
            m9861c(iOException);
        }

        /* renamed from: c */
        public final void m9861c(Throwable th) {
            try {
                this.f10806a.mo9122b(C7979t.this, th);
            } catch (Throwable th2) {
                AbstractC7967h0.m9840t(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: z5.t$b */
    public static final class b extends AbstractC6364e0 {

        /* renamed from: a */
        public final AbstractC6364e0 f10808a;

        /* renamed from: b */
        public final BufferedSource f10809b;

        /* renamed from: c */
        public IOException f10810c;

        /* renamed from: z5.t$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j6) throws IOException {
                try {
                    return super.read(buffer, j6);
                } catch (IOException e6) {
                    b.this.f10810c = e6;
                    throw e6;
                }
            }
        }

        public b(AbstractC6364e0 abstractC6364e0) {
            this.f10808a = abstractC6364e0;
            this.f10809b = Okio.buffer(new a(abstractC6364e0.source()));
        }

        /* renamed from: c */
        public void m9862c() throws IOException {
            IOException iOException = this.f10810c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p058f5.AbstractC6364e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10808a.close();
        }

        @Override // p058f5.AbstractC6364e0
        public long contentLength() {
            return this.f10808a.contentLength();
        }

        @Override // p058f5.AbstractC6364e0
        public C6386y contentType() {
            return this.f10808a.contentType();
        }

        @Override // p058f5.AbstractC6364e0
        public BufferedSource source() {
            return this.f10809b;
        }
    }

    /* renamed from: z5.t$c */
    public static final class c extends AbstractC6364e0 {

        /* renamed from: a */
        public final C6386y f10812a;

        /* renamed from: b */
        public final long f10813b;

        public c(C6386y c6386y, long j6) {
            this.f10812a = c6386y;
            this.f10813b = j6;
        }

        @Override // p058f5.AbstractC6364e0
        public long contentLength() {
            return this.f10813b;
        }

        @Override // p058f5.AbstractC6364e0
        public C6386y contentType() {
            return this.f10812a;
        }

        @Override // p058f5.AbstractC6364e0
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C7979t(C7955b0 c7955b0, Object obj, Object[] objArr, InterfaceC6363e.a aVar, InterfaceC7966h interfaceC7966h) {
        this.f10797a = c7955b0;
        this.f10798b = obj;
        this.f10799c = objArr;
        this.f10800d = aVar;
        this.f10801e = interfaceC7966h;
    }

    @Override // p200z5.InterfaceC7958d
    /* renamed from: a */
    public synchronized C6358b0 mo9790a() {
        try {
        } catch (IOException e6) {
            throw new RuntimeException("Unable to create request.", e6);
        }
        return m9859e().mo6699a();
    }

    @Override // p200z5.InterfaceC7958d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7979t clone() {
        return new C7979t(this.f10797a, this.f10798b, this.f10799c, this.f10800d, this.f10801e);
    }

    @Override // p200z5.InterfaceC7958d
    public void cancel() {
        InterfaceC6363e interfaceC6363e;
        this.f10802f = true;
        synchronized (this) {
            interfaceC6363e = this.f10803g;
        }
        if (interfaceC6363e != null) {
            interfaceC6363e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC6363e m9858d() {
        InterfaceC6363e interfaceC6363eMo6504a = this.f10800d.mo6504a(this.f10797a.m9770a(this.f10798b, this.f10799c));
        if (interfaceC6363eMo6504a != null) {
            return interfaceC6363eMo6504a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: e */
    public final InterfaceC6363e m9859e() throws IOException {
        InterfaceC6363e interfaceC6363e = this.f10803g;
        if (interfaceC6363e != null) {
            return interfaceC6363e;
        }
        Throwable th = this.f10804h;
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
            InterfaceC6363e interfaceC6363eM9858d = m9858d();
            this.f10803g = interfaceC6363eM9858d;
            return interfaceC6363eM9858d;
        } catch (IOException | Error | RuntimeException e6) {
            AbstractC7967h0.m9840t(e6);
            this.f10804h = e6;
            throw e6;
        }
    }

    /* renamed from: f */
    public C7957c0 m9860f(C6362d0 c6362d0) throws IOException {
        AbstractC6364e0 abstractC6364e0M6661c = c6362d0.m6661c();
        C6362d0 c6362d0M6682c = c6362d0.m6674t().m6681b(new c(abstractC6364e0M6661c.contentType(), abstractC6364e0M6661c.contentLength())).m6682c();
        int iM6665j = c6362d0M6682c.m6665j();
        if (iM6665j < 200 || iM6665j >= 300) {
            try {
                return C7957c0.m9783c(AbstractC7967h0.m9821a(abstractC6364e0M6661c), c6362d0M6682c);
            } finally {
                abstractC6364e0M6661c.close();
            }
        }
        if (iM6665j == 204 || iM6665j == 205) {
            abstractC6364e0M6661c.close();
            return C7957c0.m9784g(null, c6362d0M6682c);
        }
        b bVar = new b(abstractC6364e0M6661c);
        try {
            return C7957c0.m9784g(this.f10801e.convert(bVar), c6362d0M6682c);
        } catch (RuntimeException e6) {
            bVar.m9862c();
            throw e6;
        }
    }

    @Override // p200z5.InterfaceC7958d
    /* renamed from: g */
    public void mo9791g(InterfaceC7962f interfaceC7962f) {
        InterfaceC6363e interfaceC6363e;
        Throwable th;
        Objects.requireNonNull(interfaceC7962f, "callback == null");
        synchronized (this) {
            try {
                if (this.f10805i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f10805i = true;
                interfaceC6363e = this.f10803g;
                th = this.f10804h;
                if (interfaceC6363e == null && th == null) {
                    try {
                        InterfaceC6363e interfaceC6363eM9858d = m9858d();
                        this.f10803g = interfaceC6363eM9858d;
                        interfaceC6363e = interfaceC6363eM9858d;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC7967h0.m9840t(th);
                        this.f10804h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC7962f.mo9122b(this, th);
            return;
        }
        if (this.f10802f) {
            interfaceC6363e.cancel();
        }
        interfaceC6363e.mo6700c(new a(interfaceC7962f));
    }

    @Override // p200z5.InterfaceC7958d
    public boolean isCanceled() {
        boolean z6 = true;
        if (this.f10802f) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC6363e interfaceC6363e = this.f10803g;
                if (interfaceC6363e == null || !interfaceC6363e.isCanceled()) {
                    z6 = false;
                }
            } finally {
            }
        }
        return z6;
    }
}

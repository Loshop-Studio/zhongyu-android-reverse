package p080j3;

import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4519v;
import p117r2.C4522y;
import p117r2.InterfaceC4502e;
import p117r2.InterfaceC4503f;

/* renamed from: j3.o */
/* loaded from: classes2.dex */
public final class C3828o implements InterfaceC3807b {

    /* renamed from: a */
    public final C3810c0 f4671a;

    /* renamed from: b */
    public final Object[] f4672b;

    /* renamed from: c */
    public final InterfaceC4502e.a f4673c;

    /* renamed from: d */
    public final InterfaceC3821i f4674d;

    /* renamed from: e */
    public volatile boolean f4675e;

    /* renamed from: f */
    public InterfaceC4502e f4676f;

    /* renamed from: g */
    public Throwable f4677g;

    /* renamed from: h */
    public boolean f4678h;

    /* renamed from: j3.o$a */
    public class a implements InterfaceC4503f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3811d f4679a;

        public a(InterfaceC3811d interfaceC3811d) {
            this.f4679a = interfaceC3811d;
        }

        @Override // p117r2.InterfaceC4503f
        /* renamed from: a */
        public void mo5087a(InterfaceC4502e interfaceC4502e, IOException iOException) {
            m5089c(iOException);
        }

        @Override // p117r2.InterfaceC4503f
        /* renamed from: b */
        public void mo5088b(InterfaceC4502e interfaceC4502e, C4496a0 c4496a0) {
            try {
                try {
                    this.f4679a.mo5015a(C3828o.this, C3828o.this.m5086e(c4496a0));
                } catch (Throwable th) {
                    AbstractC3822i0.m5071s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                AbstractC3822i0.m5071s(th2);
                m5089c(th2);
            }
        }

        /* renamed from: c */
        public final void m5089c(Throwable th) {
            try {
                this.f4679a.mo5016b(C3828o.this, th);
            } catch (Throwable th2) {
                AbstractC3822i0.m5071s(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: j3.o$b */
    public static final class b extends AbstractC4498b0 {

        /* renamed from: c */
        public final AbstractC4498b0 f4681c;

        /* renamed from: d */
        public final BufferedSource f4682d;

        /* renamed from: e */
        public IOException f4683e;

        /* renamed from: j3.o$b$a */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j4) throws IOException {
                try {
                    return super.read(buffer, j4);
                } catch (IOException e4) {
                    b.this.f4683e = e4;
                    throw e4;
                }
            }
        }

        public b(AbstractC4498b0 abstractC4498b0) {
            this.f4681c = abstractC4498b0;
            this.f4682d = Okio.buffer(new a(abstractC4498b0.mo5092f()));
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: c */
        public long mo5090c() {
            return this.f4681c.mo5090c();
        }

        @Override // p117r2.AbstractC4498b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4681c.close();
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: d */
        public C4519v mo5091d() {
            return this.f4681c.mo5091d();
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: f */
        public BufferedSource mo5092f() {
            return this.f4682d;
        }

        /* renamed from: h */
        public void m5093h() throws IOException {
            IOException iOException = this.f4683e;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: j3.o$c */
    public static final class c extends AbstractC4498b0 {

        /* renamed from: c */
        public final C4519v f4685c;

        /* renamed from: d */
        public final long f4686d;

        public c(C4519v c4519v, long j4) {
            this.f4685c = c4519v;
            this.f4686d = j4;
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: c */
        public long mo5090c() {
            return this.f4686d;
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: d */
        public C4519v mo5091d() {
            return this.f4685c;
        }

        @Override // p117r2.AbstractC4498b0
        /* renamed from: f */
        public BufferedSource mo5092f() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C3828o(C3810c0 c3810c0, Object[] objArr, InterfaceC4502e.a aVar, InterfaceC3821i interfaceC3821i) {
        this.f4671a = c3810c0;
        this.f4672b = objArr;
        this.f4673c = aVar;
        this.f4674d = interfaceC3821i;
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: S */
    public synchronized C4522y mo4982S() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return m5085d().mo5867S();
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: T */
    public boolean mo4983T() {
        boolean z3 = true;
        if (this.f4675e) {
            return true;
        }
        synchronized (this) {
            InterfaceC4502e interfaceC4502e = this.f4676f;
            if (interfaceC4502e == null || !interfaceC4502e.mo5868T()) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: U */
    public void mo4984U(InterfaceC3811d interfaceC3811d) {
        InterfaceC4502e interfaceC4502e;
        Throwable th;
        Objects.requireNonNull(interfaceC3811d, "callback == null");
        synchronized (this) {
            if (this.f4678h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f4678h = true;
            interfaceC4502e = this.f4676f;
            th = this.f4677g;
            if (interfaceC4502e == null && th == null) {
                try {
                    InterfaceC4502e interfaceC4502eM5084c = m5084c();
                    this.f4676f = interfaceC4502eM5084c;
                    interfaceC4502e = interfaceC4502eM5084c;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC3822i0.m5071s(th);
                    this.f4677g = th;
                }
            }
        }
        if (th != null) {
            interfaceC3811d.mo5016b(this, th);
            return;
        }
        if (this.f4675e) {
            interfaceC4502e.cancel();
        }
        interfaceC4502e.mo5869b(new a(interfaceC3811d));
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3828o m11783clone() {
        return new C3828o(this.f4671a, this.f4672b, this.f4673c, this.f4674d);
    }

    /* renamed from: c */
    public final InterfaceC4502e m5084c() {
        InterfaceC4502e interfaceC4502eMo5870a = this.f4673c.mo5870a(this.f4671a.m5004a(this.f4672b));
        if (interfaceC4502eMo5870a != null) {
            return interfaceC4502eMo5870a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // p080j3.InterfaceC3807b
    public void cancel() {
        InterfaceC4502e interfaceC4502e;
        this.f4675e = true;
        synchronized (this) {
            interfaceC4502e = this.f4676f;
        }
        if (interfaceC4502e != null) {
            interfaceC4502e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC4502e m5085d() throws IOException {
        InterfaceC4502e interfaceC4502e = this.f4676f;
        if (interfaceC4502e != null) {
            return interfaceC4502e;
        }
        Throwable th = this.f4677g;
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
            InterfaceC4502e interfaceC4502eM5084c = m5084c();
            this.f4676f = interfaceC4502eM5084c;
            return interfaceC4502eM5084c;
        } catch (IOException | Error | RuntimeException e4) {
            AbstractC3822i0.m5071s(e4);
            this.f4677g = e4;
            throw e4;
        }
    }

    /* renamed from: e */
    public C3812d0 m5086e(C4496a0 c4496a0) throws IOException {
        AbstractC4498b0 abstractC4498b0M5800a = c4496a0.m5800a();
        C4496a0 c4496a0M5820c = c4496a0.m5812n().m5819b(new c(abstractC4498b0M5800a.mo5091d(), abstractC4498b0M5800a.mo5090c())).m5820c();
        int iM5804e = c4496a0M5820c.m5804e();
        if (iM5804e < 200 || iM5804e >= 300) {
            try {
                return C3812d0.m5017c(AbstractC3822i0.m5053a(abstractC4498b0M5800a), c4496a0M5820c);
            } finally {
                abstractC4498b0M5800a.close();
            }
        }
        if (iM5804e == 204 || iM5804e == 205) {
            abstractC4498b0M5800a.close();
            return C3812d0.m5019h(null, c4496a0M5820c);
        }
        b bVar = new b(abstractC4498b0M5800a);
        try {
            return C3812d0.m5019h(this.f4674d.mo4967a(bVar), c4496a0M5820c);
        } catch (RuntimeException e4) {
            bVar.m5093h();
            throw e4;
        }
    }
}

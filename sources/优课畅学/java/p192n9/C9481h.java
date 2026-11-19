package p192n9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p136i9.AbstractC8901c0;
import p136i9.AbstractC8905e0;
import p136i9.AbstractC8920r;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p203o9.C9553h;
import p203o9.InterfaceC9549d;

/* renamed from: n9.h */
/* loaded from: classes5.dex */
public final class C9481h {

    /* renamed from: a */
    public final C9487n f18730a;

    /* renamed from: b */
    public final AbstractC8920r f18731b;

    /* renamed from: c */
    public final InterfaceC9482i f18732c;

    /* renamed from: d */
    public final InterfaceC9549d f18733d;

    /* renamed from: e */
    public boolean f18734e;

    /* renamed from: f */
    public boolean f18735f;

    /* renamed from: n9.h$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        public final long f18736a;

        /* renamed from: b */
        public boolean f18737b;

        /* renamed from: c */
        public long f18738c;

        /* renamed from: d */
        public boolean f18739d;

        /* renamed from: e */
        public final /* synthetic */ C9481h f18740e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9481h c9481h, Sink delegate, long j10) {
            super(delegate);
            AbstractC9133u.m16133g(delegate, "delegate");
            this.f18740e = c9481h;
            this.f18736a = j10;
        }

        /* renamed from: a */
        private final IOException m17490a(IOException iOException) {
            if (this.f18737b) {
                return iOException;
            }
            this.f18737b = true;
            return C9481h.m17468c(this.f18740e, this.f18738c, false, true, iOException, 2, null);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18739d) {
                return;
            }
            this.f18739d = true;
            long j10 = this.f18736a;
            if (j10 != -1 && this.f18738c != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e10) {
                throw m17490a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m17490a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            AbstractC9133u.m16133g(source, "source");
            if (this.f18739d) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f18736a;
            if (j11 == -1 || this.f18738c + j10 <= j11) {
                try {
                    super.write(source, j10);
                    this.f18738c += j10;
                    return;
                } catch (IOException e10) {
                    throw m17490a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f18736a + " bytes but received " + (this.f18738c + j10));
        }
    }

    /* renamed from: n9.h$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        public final long f18741a;

        /* renamed from: b */
        public long f18742b;

        /* renamed from: c */
        public boolean f18743c;

        /* renamed from: d */
        public boolean f18744d;

        /* renamed from: e */
        public boolean f18745e;

        /* renamed from: f */
        public final /* synthetic */ C9481h f18746f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9481h c9481h, Source delegate, long j10) {
            super(delegate);
            AbstractC9133u.m16133g(delegate, "delegate");
            this.f18746f = c9481h;
            this.f18741a = j10;
            this.f18743c = true;
            if (j10 == 0) {
                m17491a(null);
            }
        }

        /* renamed from: a */
        public final IOException m17491a(IOException iOException) {
            if (this.f18744d) {
                return iOException;
            }
            this.f18744d = true;
            if (iOException == null && this.f18743c) {
                this.f18743c = false;
                this.f18746f.m17477k().m15250w(this.f18746f.m17475i());
            }
            return C9481h.m17468c(this.f18746f, this.f18742b, true, false, iOException, 4, null);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18745e) {
                return;
            }
            this.f18745e = true;
            try {
                super.close();
            } catch (IOException e10) {
                throw m17491a(e10);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            if (this.f18745e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f18743c) {
                    this.f18743c = false;
                    this.f18746f.m17477k().m15250w(this.f18746f.m17475i());
                }
                if (j11 == -1) {
                    m17491a(null);
                    return -1L;
                }
                long j12 = this.f18742b + j11;
                long j13 = this.f18741a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f18741a + " bytes but received " + j12);
                }
                this.f18742b = j12;
                if (this.f18746f.f18733d.mo17830d()) {
                    m17491a(null);
                }
                return j11;
            } catch (IOException e10) {
                throw m17491a(e10);
            }
        }
    }

    public C9481h(C9487n call, AbstractC8920r eventListener, InterfaceC9482i finder, InterfaceC9549d codec) {
        AbstractC9133u.m16133g(call, "call");
        AbstractC9133u.m16133g(eventListener, "eventListener");
        AbstractC9133u.m16133g(finder, "finder");
        AbstractC9133u.m16133g(codec, "codec");
        this.f18730a = call;
        this.f18731b = eventListener;
        this.f18732c = finder;
        this.f18733d = codec;
    }

    /* renamed from: c */
    public static /* synthetic */ IOException m17468c(C9481h c9481h, long j10, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return c9481h.m17469b(j10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, iOException);
    }

    /* renamed from: b */
    public final IOException m17469b(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            m17488v(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f18731b.m15246s(this.f18730a, iOException);
            } else {
                this.f18731b.m15244q(this.f18730a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f18731b.m15251x(this.f18730a, iOException);
            } else {
                this.f18731b.m15249v(this.f18730a, j10);
            }
        }
        return this.f18730a.m17530u(this, z11, z10, iOException);
    }

    /* renamed from: d */
    public final void m17470d() {
        this.f18733d.cancel();
    }

    /* renamed from: e */
    public final Sink m17471e(C8899b0 request, boolean z10) {
        AbstractC9133u.m16133g(request, "request");
        this.f18734e = z10;
        AbstractC8901c0 abstractC8901c0M15041a = request.m15041a();
        AbstractC9133u.m16130d(abstractC8901c0M15041a);
        long jContentLength = abstractC8901c0M15041a.contentLength();
        this.f18731b.m15245r(this.f18730a);
        return new a(this, this.f18733d.mo17828b(request, jContentLength), jContentLength);
    }

    /* renamed from: f */
    public final void m17472f() {
        this.f18733d.cancel();
        this.f18730a.m17530u(this, true, true, null);
    }

    /* renamed from: g */
    public final void m17473g() {
        try {
            this.f18733d.mo17827a();
        } catch (IOException e10) {
            this.f18731b.m15246s(this.f18730a, e10);
            m17488v(e10);
            throw e10;
        }
    }

    /* renamed from: h */
    public final void m17474h() {
        try {
            this.f18733d.mo17833g();
        } catch (IOException e10) {
            this.f18731b.m15246s(this.f18730a, e10);
            m17488v(e10);
            throw e10;
        }
    }

    /* renamed from: i */
    public final C9487n m17475i() {
        return this.f18730a;
    }

    /* renamed from: j */
    public final C9488o m17476j() {
        InterfaceC9549d.a aVarMo17834h = this.f18733d.mo17834h();
        C9488o c9488o = aVarMo17834h instanceof C9488o ? (C9488o) aVarMo17834h : null;
        if (c9488o != null) {
            return c9488o;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* renamed from: k */
    public final AbstractC8920r m17477k() {
        return this.f18731b;
    }

    /* renamed from: l */
    public final InterfaceC9482i m17478l() {
        return this.f18732c;
    }

    /* renamed from: m */
    public final boolean m17479m() {
        return this.f18735f;
    }

    /* renamed from: n */
    public final boolean m17480n() {
        return !AbstractC9133u.m16128b(this.f18732c.mo17493b().mo17503a().m14950l().m15284h(), this.f18733d.mo17834h().mo17446d().m15174a().m14950l().m15284h());
    }

    /* renamed from: o */
    public final boolean m17481o() {
        return this.f18734e;
    }

    /* renamed from: p */
    public final void m17482p() {
        this.f18733d.mo17834h().mo17444b();
    }

    /* renamed from: q */
    public final void m17483q() {
        C9487n.m17511v(this.f18730a, this, true, false, null, 4, null);
    }

    /* renamed from: r */
    public final AbstractC8905e0 m17484r(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        try {
            String strM15123k = C8903d0.m15123k(response, HttpHeaders.CONTENT_TYPE, null, 2, null);
            long jMo17835i = this.f18733d.mo17835i(response);
            return new C9553h(strM15123k, jMo17835i, Okio.buffer(new b(this, this.f18733d.mo17829c(response), jMo17835i)));
        } catch (IOException e10) {
            this.f18731b.m15251x(this.f18730a, e10);
            m17488v(e10);
            throw e10;
        }
    }

    /* renamed from: s */
    public final C8903d0.a m17485s(boolean z10) {
        try {
            C8903d0.a aVarMo17831e = this.f18733d.mo17831e(z10);
            if (aVarMo17831e == null) {
                return aVarMo17831e;
            }
            aVarMo17831e.m15153k(this);
            return aVarMo17831e;
        } catch (IOException e10) {
            this.f18731b.m15251x(this.f18730a, e10);
            m17488v(e10);
            throw e10;
        }
    }

    /* renamed from: t */
    public final void m17486t(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        this.f18731b.m15252y(this.f18730a, response);
    }

    /* renamed from: u */
    public final void m17487u() {
        this.f18731b.m15253z(this.f18730a);
    }

    /* renamed from: v */
    public final void m17488v(IOException iOException) {
        this.f18735f = true;
        this.f18733d.mo17834h().mo17448f(this.f18730a, iOException);
    }

    /* renamed from: w */
    public final void m17489w(C8899b0 request) {
        AbstractC9133u.m16133g(request, "request");
        try {
            this.f18731b.m15248u(this.f18730a);
            this.f18733d.mo17832f(request);
            this.f18731b.m15247t(this.f18730a, request);
        } catch (IOException e10) {
            this.f18731b.m15246s(this.f18730a, e10);
            m17488v(e10);
            throw e10;
        }
    }
}

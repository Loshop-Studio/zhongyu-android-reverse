package p226q8;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p172l8.AbstractC8916o;
import p172l8.AbstractC8925x;
import p172l8.AbstractC8927z;
import p172l8.C8924w;
import p172l8.C8926y;
import p236r8.C9446h;
import p236r8.InterfaceC9442d;

/* renamed from: q8.c */
/* loaded from: classes5.dex */
public final class C9380c {

    /* renamed from: a */
    public final C9382e f16299a;

    /* renamed from: b */
    public final AbstractC8916o f16300b;

    /* renamed from: c */
    public final C9381d f16301c;

    /* renamed from: d */
    public final InterfaceC9442d f16302d;

    /* renamed from: e */
    public boolean f16303e;

    /* renamed from: f */
    public boolean f16304f;

    /* renamed from: g */
    public final RealConnection f16305g;

    /* renamed from: q8.c$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        public final long f16306a;

        /* renamed from: b */
        public boolean f16307b;

        /* renamed from: c */
        public long f16308c;

        /* renamed from: d */
        public boolean f16309d;

        /* renamed from: e */
        public final /* synthetic */ C9380c f16310e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9380c c9380c, Sink delegate, long j9) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f16310e = c9380c;
            this.f16306a = j9;
        }

        /* renamed from: a */
        private final IOException m15383a(IOException iOException) {
            if (this.f16307b) {
                return iOException;
            }
            this.f16307b = true;
            return this.f16310e.m15362a(this.f16308c, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16309d) {
                return;
            }
            this.f16309d = true;
            long j9 = this.f16306a;
            if (j9 != -1 && this.f16308c != j9) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m15383a(null);
            } catch (IOException e10) {
                throw m15383a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m15383a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f16309d) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f16306a;
            if (j10 == -1 || this.f16308c + j9 <= j10) {
                try {
                    super.write(source, j9);
                    this.f16308c += j9;
                    return;
                } catch (IOException e10) {
                    throw m15383a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f16306a + " bytes but received " + (this.f16308c + j9));
        }
    }

    /* renamed from: q8.c$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        public final long f16311a;

        /* renamed from: b */
        public long f16312b;

        /* renamed from: c */
        public boolean f16313c;

        /* renamed from: d */
        public boolean f16314d;

        /* renamed from: e */
        public boolean f16315e;

        /* renamed from: f */
        public final /* synthetic */ C9380c f16316f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9380c c9380c, Source delegate, long j9) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f16316f = c9380c;
            this.f16311a = j9;
            this.f16313c = true;
            if (j9 == 0) {
                m15384a(null);
            }
        }

        /* renamed from: a */
        public final IOException m15384a(IOException iOException) {
            if (this.f16314d) {
                return iOException;
            }
            this.f16314d = true;
            if (iOException == null && this.f16313c) {
                this.f16313c = false;
                this.f16316f.m15370i().m13925v(this.f16316f.m15368g());
            }
            return this.f16316f.m15362a(this.f16312b, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16315e) {
                return;
            }
            this.f16315e = true;
            try {
                super.close();
                m15384a(null);
            } catch (IOException e10) {
                throw m15384a(e10);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f16315e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, j9);
                if (this.f16313c) {
                    this.f16313c = false;
                    this.f16316f.m15370i().m13925v(this.f16316f.m15368g());
                }
                if (j10 == -1) {
                    m15384a(null);
                    return -1L;
                }
                long j11 = this.f16312b + j10;
                long j12 = this.f16311a;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f16311a + " bytes but received " + j11);
                }
                this.f16312b = j11;
                if (j11 == j12) {
                    m15384a(null);
                }
                return j10;
            } catch (IOException e10) {
                throw m15384a(e10);
            }
        }
    }

    public C9380c(C9382e call, AbstractC8916o eventListener, C9381d finder, InterfaceC9442d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f16299a = call;
        this.f16300b = eventListener;
        this.f16301c = finder;
        this.f16302d = codec;
        this.f16305g = codec.mo15581b();
    }

    /* renamed from: a */
    public final IOException m15362a(long j9, boolean z9, boolean z10, IOException iOException) {
        if (iOException != null) {
            m15381t(iOException);
        }
        if (z10) {
            if (iOException != null) {
                this.f16300b.m13921r(this.f16299a, iOException);
            } else {
                this.f16300b.m13919p(this.f16299a, j9);
            }
        }
        if (z9) {
            if (iOException != null) {
                this.f16300b.m13926w(this.f16299a, iOException);
            } else {
                this.f16300b.m13924u(this.f16299a, j9);
            }
        }
        return this.f16299a.m15413u(this, z10, z9, iOException);
    }

    /* renamed from: b */
    public final void m15363b() {
        this.f16302d.cancel();
    }

    /* renamed from: c */
    public final Sink m15364c(C8924w request, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f16303e = z9;
        AbstractC8925x abstractC8925xM14128a = request.m14128a();
        Intrinsics.checkNotNull(abstractC8925xM14128a);
        long jContentLength = abstractC8925xM14128a.contentLength();
        this.f16300b.m13920q(this.f16299a);
        return new a(this, this.f16302d.mo15582c(request, jContentLength), jContentLength);
    }

    /* renamed from: d */
    public final void m15365d() {
        this.f16302d.cancel();
        this.f16299a.m15413u(this, true, true, null);
    }

    /* renamed from: e */
    public final void m15366e() throws IOException {
        try {
            this.f16302d.mo15580a();
        } catch (IOException e10) {
            this.f16300b.m13921r(this.f16299a, e10);
            m15381t(e10);
            throw e10;
        }
    }

    /* renamed from: f */
    public final void m15367f() throws IOException {
        try {
            this.f16302d.mo15587h();
        } catch (IOException e10) {
            this.f16300b.m13921r(this.f16299a, e10);
            m15381t(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public final C9382e m15368g() {
        return this.f16299a;
    }

    /* renamed from: h */
    public final RealConnection m15369h() {
        return this.f16305g;
    }

    /* renamed from: i */
    public final AbstractC8916o m15370i() {
        return this.f16300b;
    }

    /* renamed from: j */
    public final C9381d m15371j() {
        return this.f16301c;
    }

    /* renamed from: k */
    public final boolean m15372k() {
        return this.f16304f;
    }

    /* renamed from: l */
    public final boolean m15373l() {
        return !Intrinsics.areEqual(this.f16301c.m15388d().m13844l().m13966i(), this.f16305g.m14889z().m13845a().m13844l().m13966i());
    }

    /* renamed from: m */
    public final boolean m15374m() {
        return this.f16303e;
    }

    /* renamed from: n */
    public final void m15375n() {
        this.f16302d.mo15581b().m14888y();
    }

    /* renamed from: o */
    public final void m15376o() {
        this.f16299a.m15413u(this, true, false, null);
    }

    /* renamed from: p */
    public final AbstractC8927z m15377p(C8926y response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM14169n = C8926y.m14169n(response, HttpHeaders.CONTENT_TYPE, null, 2, null);
            long jMo15583d = this.f16302d.mo15583d(response);
            return new C9446h(strM14169n, jMo15583d, Okio.buffer(new b(this, this.f16302d.mo15584e(response), jMo15583d)));
        } catch (IOException e10) {
            this.f16300b.m13926w(this.f16299a, e10);
            m15381t(e10);
            throw e10;
        }
    }

    /* renamed from: q */
    public final C8926y.a m15378q(boolean z9) throws IOException {
        try {
            C8926y.a aVarMo15585f = this.f16302d.mo15585f(z9);
            if (aVarMo15585f == null) {
                return aVarMo15585f;
            }
            aVarMo15585f.m14200l(this);
            return aVarMo15585f;
        } catch (IOException e10) {
            this.f16300b.m13926w(this.f16299a, e10);
            m15381t(e10);
            throw e10;
        }
    }

    /* renamed from: r */
    public final void m15379r(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f16300b.m13927x(this.f16299a, response);
    }

    /* renamed from: s */
    public final void m15380s() {
        this.f16300b.m13928y(this.f16299a);
    }

    /* renamed from: t */
    public final void m15381t(IOException iOException) {
        this.f16304f = true;
        this.f16301c.m15392h(iOException);
        this.f16302d.mo15581b().m14864G(this.f16299a, iOException);
    }

    /* renamed from: u */
    public final void m15382u(C8924w request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f16300b.m13923t(this.f16299a);
            this.f16302d.mo15586g(request);
            this.f16300b.m13922s(this.f16299a, request);
        } catch (IOException e10) {
            this.f16300b.m13921r(this.f16299a, e10);
            m15381t(e10);
            throw e10;
        }
    }
}

package p092f9;

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
import p011a9.AbstractC0052o;
import p011a9.AbstractC0061x;
import p011a9.AbstractC0063z;
import p011a9.C0060w;
import p011a9.C0062y;
import p103g9.C7607h;
import p103g9.InterfaceC7603d;

/* renamed from: f9.c */
/* loaded from: classes5.dex */
public final class C7499c {

    /* renamed from: a */
    public final C7501e f12291a;

    /* renamed from: b */
    public final AbstractC0052o f12292b;

    /* renamed from: c */
    public final C7500d f12293c;

    /* renamed from: d */
    public final InterfaceC7603d f12294d;

    /* renamed from: e */
    public boolean f12295e;

    /* renamed from: f */
    public boolean f12296f;

    /* renamed from: g */
    public final RealConnection f12297g;

    /* renamed from: f9.c$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        public final long f12298a;

        /* renamed from: b */
        public boolean f12299b;

        /* renamed from: c */
        public long f12300c;

        /* renamed from: d */
        public boolean f12301d;

        /* renamed from: e */
        public final /* synthetic */ C7499c f12302e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7499c c7499c, Sink delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f12302e = c7499c;
            this.f12298a = j10;
        }

        /* renamed from: a */
        private final IOException m12151a(IOException iOException) {
            if (this.f12299b) {
                return iOException;
            }
            this.f12299b = true;
            return this.f12302e.m12130a(this.f12300c, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12301d) {
                return;
            }
            this.f12301d = true;
            long j10 = this.f12298a;
            if (j10 != -1 && this.f12300c != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m12151a(null);
            } catch (IOException e10) {
                throw m12151a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m12151a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f12301d) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f12298a;
            if (j11 == -1 || this.f12300c + j10 <= j11) {
                try {
                    super.write(source, j10);
                    this.f12300c += j10;
                    return;
                } catch (IOException e10) {
                    throw m12151a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f12298a + " bytes but received " + (this.f12300c + j10));
        }
    }

    /* renamed from: f9.c$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        public final long f12303a;

        /* renamed from: b */
        public long f12304b;

        /* renamed from: c */
        public boolean f12305c;

        /* renamed from: d */
        public boolean f12306d;

        /* renamed from: e */
        public boolean f12307e;

        /* renamed from: f */
        public final /* synthetic */ C7499c f12308f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7499c c7499c, Source delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f12308f = c7499c;
            this.f12303a = j10;
            this.f12305c = true;
            if (j10 == 0) {
                m12152a(null);
            }
        }

        /* renamed from: a */
        public final IOException m12152a(IOException iOException) {
            if (this.f12306d) {
                return iOException;
            }
            this.f12306d = true;
            if (iOException == null && this.f12305c) {
                this.f12305c = false;
                this.f12308f.m12138i().m169v(this.f12308f.m12136g());
            }
            return this.f12308f.m12130a(this.f12304b, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f12307e) {
                return;
            }
            this.f12307e = true;
            try {
                super.close();
                m12152a(null);
            } catch (IOException e10) {
                throw m12152a(e10);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f12307e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f12305c) {
                    this.f12305c = false;
                    this.f12308f.m12138i().m169v(this.f12308f.m12136g());
                }
                if (j11 == -1) {
                    m12152a(null);
                    return -1L;
                }
                long j12 = this.f12304b + j11;
                long j13 = this.f12303a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f12303a + " bytes but received " + j12);
                }
                this.f12304b = j12;
                if (j12 == j13) {
                    m12152a(null);
                }
                return j11;
            } catch (IOException e10) {
                throw m12152a(e10);
            }
        }
    }

    public C7499c(C7501e call, AbstractC0052o eventListener, C7500d finder, InterfaceC7603d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f12291a = call;
        this.f12292b = eventListener;
        this.f12293c = finder;
        this.f12294d = codec;
        this.f12297g = codec.mo12496d();
    }

    /* renamed from: a */
    public final IOException m12130a(long j10, boolean z9, boolean z10, IOException iOException) {
        if (iOException != null) {
            m12149t(iOException);
        }
        if (z10) {
            if (iOException != null) {
                this.f12292b.m165r(this.f12291a, iOException);
            } else {
                this.f12292b.m163p(this.f12291a, j10);
            }
        }
        if (z9) {
            if (iOException != null) {
                this.f12292b.m170w(this.f12291a, iOException);
            } else {
                this.f12292b.m168u(this.f12291a, j10);
            }
        }
        return this.f12291a.m12181u(this, z10, z9, iOException);
    }

    /* renamed from: b */
    public final void m12131b() {
        this.f12294d.cancel();
    }

    /* renamed from: c */
    public final Sink m12132c(C0060w request, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12295e = z9;
        AbstractC0061x abstractC0061xM372a = request.m372a();
        Intrinsics.checkNotNull(abstractC0061xM372a);
        long jContentLength = abstractC0061xM372a.contentLength();
        this.f12292b.m164q(this.f12291a);
        return new a(this, this.f12294d.mo12495c(request, jContentLength), jContentLength);
    }

    /* renamed from: d */
    public final void m12133d() {
        this.f12294d.cancel();
        this.f12291a.m12181u(this, true, true, null);
    }

    /* renamed from: e */
    public final void m12134e() throws IOException {
        try {
            this.f12294d.mo12493a();
        } catch (IOException e10) {
            this.f12292b.m165r(this.f12291a, e10);
            m12149t(e10);
            throw e10;
        }
    }

    /* renamed from: f */
    public final void m12135f() throws IOException {
        try {
            this.f12294d.mo12500h();
        } catch (IOException e10) {
            this.f12292b.m165r(this.f12291a, e10);
            m12149t(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public final C7501e m12136g() {
        return this.f12291a;
    }

    /* renamed from: h */
    public final RealConnection m12137h() {
        return this.f12297g;
    }

    /* renamed from: i */
    public final AbstractC0052o m12138i() {
        return this.f12292b;
    }

    /* renamed from: j */
    public final C7500d m12139j() {
        return this.f12293c;
    }

    /* renamed from: k */
    public final boolean m12140k() {
        return this.f12296f;
    }

    /* renamed from: l */
    public final boolean m12141l() {
        return !Intrinsics.areEqual(this.f12293c.m12156d().m85l().m210i(), this.f12297g.m14455z().m86a().m85l().m210i());
    }

    /* renamed from: m */
    public final boolean m12142m() {
        return this.f12295e;
    }

    /* renamed from: n */
    public final void m12143n() {
        this.f12294d.mo12496d().m14454y();
    }

    /* renamed from: o */
    public final void m12144o() {
        this.f12291a.m12181u(this, true, false, null);
    }

    /* renamed from: p */
    public final AbstractC0063z m12145p(C0062y response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM413n = C0062y.m413n(response, HttpHeaders.CONTENT_TYPE, null, 2, null);
            long jMo12497e = this.f12294d.mo12497e(response);
            return new C7607h(strM413n, jMo12497e, Okio.buffer(new b(this, this.f12294d.mo12499g(response), jMo12497e)));
        } catch (IOException e10) {
            this.f12292b.m170w(this.f12291a, e10);
            m12149t(e10);
            throw e10;
        }
    }

    /* renamed from: q */
    public final C0062y.a m12146q(boolean z9) throws IOException {
        try {
            C0062y.a aVarMo12498f = this.f12294d.mo12498f(z9);
            if (aVarMo12498f == null) {
                return aVarMo12498f;
            }
            aVarMo12498f.m444l(this);
            return aVarMo12498f;
        } catch (IOException e10) {
            this.f12292b.m170w(this.f12291a, e10);
            m12149t(e10);
            throw e10;
        }
    }

    /* renamed from: r */
    public final void m12147r(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f12292b.m171x(this.f12291a, response);
    }

    /* renamed from: s */
    public final void m12148s() {
        this.f12292b.m172y(this.f12291a);
    }

    /* renamed from: t */
    public final void m12149t(IOException iOException) {
        this.f12296f = true;
        this.f12293c.m12160h(iOException);
        this.f12294d.mo12496d().m14430G(this.f12291a, iOException);
    }

    /* renamed from: u */
    public final void m12150u(C0060w request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f12292b.m167t(this.f12291a);
            this.f12294d.mo12494b(request);
            this.f12292b.m166s(this.f12291a, request);
        } catch (IOException e10) {
            this.f12292b.m165r(this.f12291a, e10);
            m12149t(e10);
            throw e10;
        }
    }
}

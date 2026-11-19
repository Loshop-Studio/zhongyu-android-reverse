package p281oe;

import java.io.IOException;
import java.net.ProtocolException;
import je.AbstractC9735o;
import je.AbstractC9744x;
import je.AbstractC9746z;
import je.C9743w;
import je.C9745y;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import pe.C10681h;
import pe.InterfaceC10677d;

/* renamed from: oe.c */
/* loaded from: classes6.dex */
public final class C10485c {

    /* renamed from: a */
    public final C10487e f24872a;

    /* renamed from: b */
    public final AbstractC9735o f24873b;

    /* renamed from: c */
    public final C10486d f24874c;

    /* renamed from: d */
    public final InterfaceC10677d f24875d;

    /* renamed from: e */
    public boolean f24876e;

    /* renamed from: f */
    public boolean f24877f;

    /* renamed from: g */
    public final RealConnection f24878g;

    /* renamed from: oe.c$a */
    public final class a extends ForwardingSink {

        /* renamed from: c */
        public final long f24879c;

        /* renamed from: d */
        public boolean f24880d;

        /* renamed from: e */
        public long f24881e;

        /* renamed from: f */
        public boolean f24882f;

        /* renamed from: g */
        public final /* synthetic */ C10485c f24883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10485c c10485c, Sink delegate, long j10) {
            super(delegate);
            AbstractC9979u.m20294g(delegate, "delegate");
            this.f24883g = c10485c;
            this.f24879c = j10;
        }

        /* renamed from: a */
        private final IOException m21877a(IOException iOException) {
            if (this.f24880d) {
                return iOException;
            }
            this.f24880d = true;
            return this.f24883g.m21856a(this.f24881e, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f24882f) {
                return;
            }
            this.f24882f = true;
            long j10 = this.f24879c;
            if (j10 != -1 && this.f24881e != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m21877a(null);
            } catch (IOException e10) {
                throw m21877a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m21877a(e10);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            AbstractC9979u.m20294g(source, "source");
            if (this.f24882f) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f24879c;
            if (j11 == -1 || this.f24881e + j10 <= j11) {
                try {
                    super.write(source, j10);
                    this.f24881e += j10;
                    return;
                } catch (IOException e10) {
                    throw m21877a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f24879c + " bytes but received " + (this.f24881e + j10));
        }
    }

    /* renamed from: oe.c$b */
    public final class b extends ForwardingSource {

        /* renamed from: c */
        public final long f24884c;

        /* renamed from: d */
        public long f24885d;

        /* renamed from: e */
        public boolean f24886e;

        /* renamed from: f */
        public boolean f24887f;

        /* renamed from: g */
        public boolean f24888g;

        /* renamed from: h */
        public final /* synthetic */ C10485c f24889h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10485c c10485c, Source delegate, long j10) {
            super(delegate);
            AbstractC9979u.m20294g(delegate, "delegate");
            this.f24889h = c10485c;
            this.f24884c = j10;
            this.f24886e = true;
            if (j10 == 0) {
                m21878a(null);
            }
        }

        /* renamed from: a */
        public final IOException m21878a(IOException iOException) {
            if (this.f24887f) {
                return iOException;
            }
            this.f24887f = true;
            if (iOException == null && this.f24886e) {
                this.f24886e = false;
                this.f24889h.m21864i().m19378v(this.f24889h.m21862g());
            }
            return this.f24889h.m21856a(this.f24885d, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f24888g) {
                return;
            }
            this.f24888g = true;
            try {
                super.close();
                m21878a(null);
            } catch (IOException e10) {
                throw m21878a(e10);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            if (this.f24888g) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f24886e) {
                    this.f24886e = false;
                    this.f24889h.m21864i().m19378v(this.f24889h.m21862g());
                }
                if (j11 == -1) {
                    m21878a(null);
                    return -1L;
                }
                long j12 = this.f24885d + j11;
                long j13 = this.f24884c;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f24884c + " bytes but received " + j12);
                }
                this.f24885d = j12;
                if (j12 == j13) {
                    m21878a(null);
                }
                return j11;
            } catch (IOException e10) {
                throw m21878a(e10);
            }
        }
    }

    public C10485c(C10487e call, AbstractC9735o eventListener, C10486d finder, InterfaceC10677d codec) {
        AbstractC9979u.m20294g(call, "call");
        AbstractC9979u.m20294g(eventListener, "eventListener");
        AbstractC9979u.m20294g(finder, "finder");
        AbstractC9979u.m20294g(codec, "codec");
        this.f24872a = call;
        this.f24873b = eventListener;
        this.f24874c = finder;
        this.f24875d = codec;
        this.f24878g = codec.getConnection();
    }

    /* renamed from: a */
    public final IOException m21856a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            m21875t(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f24873b.m19374r(this.f24872a, iOException);
            } else {
                this.f24873b.m19372p(this.f24872a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f24873b.m19379w(this.f24872a, iOException);
            } else {
                this.f24873b.m19377u(this.f24872a, j10);
            }
        }
        return this.f24872a.m21906t(this, z11, z10, iOException);
    }

    /* renamed from: b */
    public final void m21857b() {
        this.f24875d.cancel();
    }

    /* renamed from: c */
    public final Sink m21858c(C9743w request, boolean z10) {
        AbstractC9979u.m20294g(request, "request");
        this.f24876e = z10;
        AbstractC9744x abstractC9744xM19583a = request.m19583a();
        AbstractC9979u.m20291d(abstractC9744xM19583a);
        long jContentLength = abstractC9744xM19583a.contentLength();
        this.f24873b.m19373q(this.f24872a);
        return new a(this, this.f24875d.mo22607b(request, jContentLength), jContentLength);
    }

    /* renamed from: d */
    public final void m21859d() {
        this.f24875d.cancel();
        this.f24872a.m21906t(this, true, true, null);
    }

    /* renamed from: e */
    public final void m21860e() throws IOException {
        try {
            this.f24875d.mo22606a();
        } catch (IOException e10) {
            this.f24873b.m19374r(this.f24872a, e10);
            m21875t(e10);
            throw e10;
        }
    }

    /* renamed from: f */
    public final void m21861f() throws IOException {
        try {
            this.f24875d.mo22612g();
        } catch (IOException e10) {
            this.f24873b.m19374r(this.f24872a, e10);
            m21875t(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public final C10487e m21862g() {
        return this.f24872a;
    }

    /* renamed from: h */
    public final RealConnection m21863h() {
        return this.f24878g;
    }

    /* renamed from: i */
    public final AbstractC9735o m21864i() {
        return this.f24873b;
    }

    /* renamed from: j */
    public final C10486d m21865j() {
        return this.f24874c;
    }

    /* renamed from: k */
    public final boolean m21866k() {
        return this.f24877f;
    }

    /* renamed from: l */
    public final boolean m21867l() {
        return !AbstractC9979u.m20289b(this.f24874c.m21882d().m19296l().m19419i(), this.f24878g.m21984A().m19297a().m19296l().m19419i());
    }

    /* renamed from: m */
    public final boolean m21868m() {
        return this.f24876e;
    }

    /* renamed from: n */
    public final void m21869n() {
        this.f24875d.getConnection().m22015z();
    }

    /* renamed from: o */
    public final void m21870o() {
        this.f24872a.m21906t(this, true, false, null);
    }

    /* renamed from: p */
    public final AbstractC9746z m21871p(C9745y response) throws IOException {
        AbstractC9979u.m20294g(response, "response");
        try {
            String strM19626p = C9745y.m19626p(response, "Content-Type", null, 2, null);
            long jMo22609d = this.f24875d.mo22609d(response);
            return new C10681h(strM19626p, jMo22609d, Okio.buffer(new b(this, this.f24875d.mo22610e(response), jMo22609d)));
        } catch (IOException e10) {
            this.f24873b.m19379w(this.f24872a, e10);
            m21875t(e10);
            throw e10;
        }
    }

    /* renamed from: q */
    public final C9745y.a m21872q(boolean z10) throws IOException {
        try {
            C9745y.a aVarMo22611f = this.f24875d.mo22611f(z10);
            if (aVarMo22611f == null) {
                return aVarMo22611f;
            }
            aVarMo22611f.m19657l(this);
            return aVarMo22611f;
        } catch (IOException e10) {
            this.f24873b.m19379w(this.f24872a, e10);
            m21875t(e10);
            throw e10;
        }
    }

    /* renamed from: r */
    public final void m21873r(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        this.f24873b.m19380x(this.f24872a, response);
    }

    /* renamed from: s */
    public final void m21874s() {
        this.f24873b.m19381y(this.f24872a);
    }

    /* renamed from: t */
    public final void m21875t(IOException iOException) {
        this.f24877f = true;
        this.f24874c.m21886h(iOException);
        this.f24875d.getConnection().m21991H(this.f24872a, iOException);
    }

    /* renamed from: u */
    public final void m21876u(C9743w request) throws IOException {
        AbstractC9979u.m20294g(request, "request");
        try {
            this.f24873b.m19376t(this.f24872a);
            this.f24875d.mo22608c(request);
            this.f24873b.m19375s(this.f24872a, request);
        } catch (IOException e10) {
            this.f24873b.m19374r(this.f24872a, e10);
            m21875t(e10);
            throw e10;
        }
    }
}

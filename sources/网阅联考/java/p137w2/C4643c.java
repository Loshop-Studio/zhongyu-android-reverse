package p137w2;

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
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4514q;
import p117r2.AbstractC4523z;
import p117r2.C4496a0;
import p117r2.C4522y;
import p141x2.C4671h;
import p141x2.InterfaceC4667d;

/* renamed from: w2.c */
/* loaded from: classes2.dex */
public final class C4643c {

    /* renamed from: a */
    public boolean f5873a;

    /* renamed from: b */
    public final RealConnection f5874b;

    /* renamed from: c */
    public final C4645e f5875c;

    /* renamed from: d */
    public final AbstractC4514q f5876d;

    /* renamed from: e */
    public final C4644d f5877e;

    /* renamed from: f */
    public final InterfaceC4667d f5878f;

    /* renamed from: w2.c$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        public boolean f5879a;

        /* renamed from: b */
        public long f5880b;

        /* renamed from: c */
        public boolean f5881c;

        /* renamed from: d */
        public final long f5882d;

        /* renamed from: e */
        public final /* synthetic */ C4643c f5883e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4643c c4643c, Sink delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f5883e = c4643c;
            this.f5882d = j4;
        }

        /* renamed from: a */
        public final IOException m6493a(IOException iOException) {
            if (this.f5879a) {
                return iOException;
            }
            this.f5879a = true;
            return this.f5883e.m6473a(this.f5880b, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f5881c) {
                return;
            }
            this.f5881c = true;
            long j4 = this.f5882d;
            if (j4 != -1 && this.f5880b != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m6493a(null);
            } catch (IOException e4) {
                throw m6493a(e4);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                throw m6493a(e4);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f5881c)) {
                throw new IllegalStateException("closed".toString());
            }
            long j5 = this.f5882d;
            if (j5 == -1 || this.f5880b + j4 <= j5) {
                try {
                    super.write(source, j4);
                    this.f5880b += j4;
                    return;
                } catch (IOException e4) {
                    throw m6493a(e4);
                }
            }
            throw new ProtocolException("expected " + this.f5882d + " bytes but received " + (this.f5880b + j4));
        }
    }

    /* renamed from: w2.c$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        public long f5884a;

        /* renamed from: b */
        public boolean f5885b;

        /* renamed from: c */
        public boolean f5886c;

        /* renamed from: d */
        public boolean f5887d;

        /* renamed from: e */
        public final long f5888e;

        /* renamed from: f */
        public final /* synthetic */ C4643c f5889f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4643c c4643c, Source delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f5889f = c4643c;
            this.f5888e = j4;
            this.f5885b = true;
            if (j4 == 0) {
                m6494a(null);
            }
        }

        /* renamed from: a */
        public final IOException m6494a(IOException iOException) {
            if (this.f5886c) {
                return iOException;
            }
            this.f5886c = true;
            if (iOException == null && this.f5885b) {
                this.f5885b = false;
                this.f5889f.m6481i().m5948v(this.f5889f.m6479g());
            }
            return this.f5889f.m6473a(this.f5884a, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f5887d) {
                return;
            }
            this.f5887d = true;
            try {
                super.close();
                m6494a(null);
            } catch (IOException e4) {
                throw m6494a(e4);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f5887d)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j5 = delegate().read(sink, j4);
                if (this.f5885b) {
                    this.f5885b = false;
                    this.f5889f.m6481i().m5948v(this.f5889f.m6479g());
                }
                if (j5 == -1) {
                    m6494a(null);
                    return -1L;
                }
                long j6 = this.f5884a + j5;
                long j7 = this.f5888e;
                if (j7 != -1 && j6 > j7) {
                    throw new ProtocolException("expected " + this.f5888e + " bytes but received " + j6);
                }
                this.f5884a = j6;
                if (j6 == j7) {
                    m6494a(null);
                }
                return j5;
            } catch (IOException e4) {
                throw m6494a(e4);
            }
        }
    }

    public C4643c(C4645e call, AbstractC4514q eventListener, C4644d finder, InterfaceC4667d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f5875c = call;
        this.f5876d = eventListener;
        this.f5877e = finder;
        this.f5878f = codec;
        this.f5874b = codec.mo6571f();
    }

    /* renamed from: a */
    public final IOException m6473a(long j4, boolean z3, boolean z4, IOException iOException) {
        if (iOException != null) {
            m6491s(iOException);
        }
        if (z4) {
            if (iOException != null) {
                this.f5876d.m5944r(this.f5875c, iOException);
            } else {
                this.f5876d.m5942p(this.f5875c, j4);
            }
        }
        if (z3) {
            if (iOException != null) {
                this.f5876d.m5949w(this.f5875c, iOException);
            } else {
                this.f5876d.m5947u(this.f5875c, j4);
            }
        }
        return this.f5875c.m6521s(this, z4, z3, iOException);
    }

    /* renamed from: b */
    public final void m6474b() {
        this.f5878f.cancel();
    }

    /* renamed from: c */
    public final Sink m6475c(C4522y request, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5873a = z3;
        AbstractC4523z abstractC4523zM6132a = request.m6132a();
        Intrinsics.checkNotNull(abstractC4523zM6132a);
        long jContentLength = abstractC4523zM6132a.contentLength();
        this.f5876d.m5943q(this.f5875c);
        return new a(this, this.f5878f.mo6568c(request, jContentLength), jContentLength);
    }

    /* renamed from: d */
    public final void m6476d() {
        this.f5878f.cancel();
        this.f5875c.m6521s(this, true, true, null);
    }

    /* renamed from: e */
    public final void m6477e() throws IOException {
        try {
            this.f5878f.mo6567b();
        } catch (IOException e4) {
            this.f5876d.m5944r(this.f5875c, e4);
            m6491s(e4);
            throw e4;
        }
    }

    /* renamed from: f */
    public final void m6478f() throws IOException {
        try {
            this.f5878f.mo6572g();
        } catch (IOException e4) {
            this.f5876d.m5944r(this.f5875c, e4);
            m6491s(e4);
            throw e4;
        }
    }

    /* renamed from: g */
    public final C4645e m6479g() {
        return this.f5875c;
    }

    /* renamed from: h */
    public final RealConnection m6480h() {
        return this.f5874b;
    }

    /* renamed from: i */
    public final AbstractC4514q m6481i() {
        return this.f5876d;
    }

    /* renamed from: j */
    public final C4644d m6482j() {
        return this.f5877e;
    }

    /* renamed from: k */
    public final boolean m6483k() {
        return !Intrinsics.areEqual(this.f5877e.m6498d().m5798l().m5987i(), this.f5874b.m5617z().m5847a().m5798l().m5987i());
    }

    /* renamed from: l */
    public final boolean m6484l() {
        return this.f5873a;
    }

    /* renamed from: m */
    public final void m6485m() {
        this.f5878f.mo6571f().m5616y();
    }

    /* renamed from: n */
    public final void m6486n() {
        this.f5875c.m6521s(this, true, false, null);
    }

    /* renamed from: o */
    public final AbstractC4498b0 m6487o(C4496a0 response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM5799i = C4496a0.m5799i(response, "Content-Type", null, 2, null);
            long jMo6566a = this.f5878f.mo6566a(response);
            return new C4671h(strM5799i, jMo6566a, Okio.buffer(new b(this, this.f5878f.mo6573h(response), jMo6566a)));
        } catch (IOException e4) {
            this.f5876d.m5949w(this.f5875c, e4);
            m6491s(e4);
            throw e4;
        }
    }

    /* renamed from: p */
    public final C4496a0.a m6488p(boolean z3) throws IOException {
        try {
            C4496a0.a aVarMo6570e = this.f5878f.mo6570e(z3);
            if (aVarMo6570e != null) {
                aVarMo6570e.m5829l(this);
            }
            return aVarMo6570e;
        } catch (IOException e4) {
            this.f5876d.m5949w(this.f5875c, e4);
            m6491s(e4);
            throw e4;
        }
    }

    /* renamed from: q */
    public final void m6489q(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f5876d.m5950x(this.f5875c, response);
    }

    /* renamed from: r */
    public final void m6490r() {
        this.f5876d.m5951y(this.f5875c);
    }

    /* renamed from: s */
    public final void m6491s(IOException iOException) {
        this.f5877e.m6502h(iOException);
        this.f5878f.mo6571f().m5592G(this.f5875c, iOException);
    }

    /* renamed from: t */
    public final void m6492t(C4522y request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f5876d.m5946t(this.f5875c);
            this.f5878f.mo6569d(request);
            this.f5876d.m5945s(this.f5875c, request);
        } catch (IOException e4) {
            this.f5876d.m5944r(this.f5875c, e4);
            m6491s(e4);
            throw e4;
        }
    }
}

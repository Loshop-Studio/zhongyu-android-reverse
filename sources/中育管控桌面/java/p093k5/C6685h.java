package p093k5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p058f5.AbstractC6360c0;
import p058f5.AbstractC6364e0;
import p058f5.AbstractC6379r;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p102l5.C7354h;
import p102l5.InterfaceC7350d;

/* renamed from: k5.h */
/* loaded from: classes4.dex */
public final class C6685h {

    /* renamed from: a */
    public final C6691n f8860a;

    /* renamed from: b */
    public final AbstractC6379r f8861b;

    /* renamed from: c */
    public final InterfaceC6686i f8862c;

    /* renamed from: d */
    public final InterfaceC7350d f8863d;

    /* renamed from: e */
    public boolean f8864e;

    /* renamed from: f */
    public boolean f8865f;

    /* renamed from: k5.h$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        public final long f8866a;

        /* renamed from: b */
        public boolean f8867b;

        /* renamed from: c */
        public long f8868c;

        /* renamed from: d */
        public boolean f8869d;

        /* renamed from: e */
        public final /* synthetic */ C6685h f8870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6685h c6685h, Sink delegate, long j6) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f8870e = c6685h;
            this.f8866a = j6;
        }

        /* renamed from: a */
        private final IOException m7757a(IOException iOException) {
            if (this.f8867b) {
                return iOException;
            }
            this.f8867b = true;
            return C6685h.m7735c(this.f8870e, this.f8868c, false, true, iOException, 2, null);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f8869d) {
                return;
            }
            this.f8869d = true;
            long j6 = this.f8866a;
            if (j6 != -1 && this.f8868c != j6) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e6) {
                throw m7757a(e6);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e6) {
                throw m7757a(e6);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f8869d) {
                throw new IllegalStateException("closed");
            }
            long j7 = this.f8866a;
            if (j7 == -1 || this.f8868c + j6 <= j7) {
                try {
                    super.write(source, j6);
                    this.f8868c += j6;
                    return;
                } catch (IOException e6) {
                    throw m7757a(e6);
                }
            }
            throw new ProtocolException("expected " + this.f8866a + " bytes but received " + (this.f8868c + j6));
        }
    }

    /* renamed from: k5.h$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        public final long f8871a;

        /* renamed from: b */
        public long f8872b;

        /* renamed from: c */
        public boolean f8873c;

        /* renamed from: d */
        public boolean f8874d;

        /* renamed from: e */
        public boolean f8875e;

        /* renamed from: f */
        public final /* synthetic */ C6685h f8876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6685h c6685h, Source delegate, long j6) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f8876f = c6685h;
            this.f8871a = j6;
            this.f8873c = true;
            if (j6 == 0) {
                m7758a(null);
            }
        }

        /* renamed from: a */
        public final IOException m7758a(IOException iOException) {
            if (this.f8874d) {
                return iOException;
            }
            this.f8874d = true;
            if (iOException == null && this.f8873c) {
                this.f8873c = false;
                this.f8876f.m7744k().m6789w(this.f8876f.m7742i());
            }
            return C6685h.m7735c(this.f8876f, this.f8872b, true, false, iOException, 4, null);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f8875e) {
                return;
            }
            this.f8875e = true;
            try {
                super.close();
            } catch (IOException e6) {
                throw m7758a(e6);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f8875e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j7 = delegate().read(sink, j6);
                if (this.f8873c) {
                    this.f8873c = false;
                    this.f8876f.m7744k().m6789w(this.f8876f.m7742i());
                }
                if (j7 == -1) {
                    m7758a(null);
                    return -1L;
                }
                long j8 = this.f8872b + j7;
                long j9 = this.f8871a;
                if (j9 != -1 && j8 > j9) {
                    throw new ProtocolException("expected " + this.f8871a + " bytes but received " + j8);
                }
                this.f8872b = j8;
                if (this.f8876f.f8863d.mo8325d()) {
                    m7758a(null);
                }
                return j7;
            } catch (IOException e6) {
                throw m7758a(e6);
            }
        }
    }

    public C6685h(C6691n call, AbstractC6379r eventListener, InterfaceC6686i finder, InterfaceC7350d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f8860a = call;
        this.f8861b = eventListener;
        this.f8862c = finder;
        this.f8863d = codec;
    }

    /* renamed from: c */
    public static /* synthetic */ IOException m7735c(C6685h c6685h, long j6, boolean z6, boolean z7, IOException iOException, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = -1;
        }
        return c6685h.m7736b(j6, (i6 & 2) != 0 ? false : z6, (i6 & 4) != 0 ? false : z7, iOException);
    }

    /* renamed from: b */
    public final IOException m7736b(long j6, boolean z6, boolean z7, IOException iOException) {
        if (iOException != null) {
            m7755v(iOException);
        }
        if (z7) {
            if (iOException != null) {
                this.f8861b.m6785s(this.f8860a, iOException);
            } else {
                this.f8861b.m6783q(this.f8860a, j6);
            }
        }
        if (z6) {
            if (iOException != null) {
                this.f8861b.m6790x(this.f8860a, iOException);
            } else {
                this.f8861b.m6788v(this.f8860a, j6);
            }
        }
        return this.f8860a.m7797u(this, z7, z6, iOException);
    }

    /* renamed from: d */
    public final void m7737d() {
        this.f8863d.cancel();
    }

    /* renamed from: e */
    public final Sink m7738e(C6358b0 request, boolean z6) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f8864e = z6;
        AbstractC6360c0 abstractC6360c0M6577a = request.m6577a();
        Intrinsics.checkNotNull(abstractC6360c0M6577a);
        long jContentLength = abstractC6360c0M6577a.contentLength();
        this.f8861b.m6784r(this.f8860a);
        return new a(this, this.f8863d.mo8324c(request, jContentLength), jContentLength);
    }

    /* renamed from: f */
    public final void m7739f() {
        this.f8863d.cancel();
        this.f8860a.m7797u(this, true, true, null);
    }

    /* renamed from: g */
    public final void m7740g() {
        try {
            this.f8863d.mo8322a();
        } catch (IOException e6) {
            this.f8861b.m6785s(this.f8860a, e6);
            m7755v(e6);
            throw e6;
        }
    }

    /* renamed from: h */
    public final void m7741h() {
        try {
            this.f8863d.mo8329h();
        } catch (IOException e6) {
            this.f8861b.m6785s(this.f8860a, e6);
            m7755v(e6);
            throw e6;
        }
    }

    /* renamed from: i */
    public final C6691n m7742i() {
        return this.f8860a;
    }

    /* renamed from: j */
    public final C6692o m7743j() {
        InterfaceC7350d.a aVarMo8330i = this.f8863d.mo8330i();
        C6692o c6692o = aVarMo8330i instanceof C6692o ? (C6692o) aVarMo8330i : null;
        if (c6692o != null) {
            return c6692o;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* renamed from: k */
    public final AbstractC6379r m7744k() {
        return this.f8861b;
    }

    /* renamed from: l */
    public final InterfaceC6686i m7745l() {
        return this.f8862c;
    }

    /* renamed from: m */
    public final boolean m7746m() {
        return this.f8865f;
    }

    /* renamed from: n */
    public final boolean m7747n() {
        return !Intrinsics.areEqual(this.f8862c.mo7760b().mo7770a().m6486l().m6823h(), this.f8863d.mo8330i().mo7714e().m6713a().m6486l().m6823h());
    }

    /* renamed from: o */
    public final boolean m7748o() {
        return this.f8864e;
    }

    /* renamed from: p */
    public final void m7749p() {
        this.f8863d.mo8330i().mo7711b();
    }

    /* renamed from: q */
    public final void m7750q() {
        C6691n.m7778v(this.f8860a, this, true, false, null, 4, null);
    }

    /* renamed from: r */
    public final AbstractC6364e0 m7751r(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM6660o = C6362d0.m6660o(response, HttpHeaders.CONTENT_TYPE, null, 2, null);
            long jMo8323b = this.f8863d.mo8323b(response);
            return new C7354h(strM6660o, jMo8323b, Okio.buffer(new b(this, this.f8863d.mo8328g(response), jMo8323b)));
        } catch (IOException e6) {
            this.f8861b.m6790x(this.f8860a, e6);
            m7755v(e6);
            throw e6;
        }
    }

    /* renamed from: s */
    public final C6362d0.a m7752s(boolean z6) {
        try {
            C6362d0.a aVarMo8327f = this.f8863d.mo8327f(z6);
            if (aVarMo8327f == null) {
                return aVarMo8327f;
            }
            aVarMo8327f.m6690k(this);
            return aVarMo8327f;
        } catch (IOException e6) {
            this.f8861b.m6790x(this.f8860a, e6);
            m7755v(e6);
            throw e6;
        }
    }

    /* renamed from: t */
    public final void m7753t(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f8861b.m6791y(this.f8860a, response);
    }

    /* renamed from: u */
    public final void m7754u() {
        this.f8861b.m6792z(this.f8860a);
    }

    /* renamed from: v */
    public final void m7755v(IOException iOException) {
        this.f8865f = true;
        this.f8863d.mo8330i().mo7713d(this.f8860a, iOException);
    }

    /* renamed from: w */
    public final void m7756w(C6358b0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f8861b.m6787u(this.f8860a);
            this.f8863d.mo8326e(request);
            this.f8861b.m6786t(this.f8860a, request);
        } catch (IOException e6) {
            this.f8861b.m6785s(this.f8860a, e6);
            m7755v(e6);
            throw e6;
        }
    }
}

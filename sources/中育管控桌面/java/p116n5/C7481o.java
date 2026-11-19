package p116n5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.http2.C7531c;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p058f5.C6356a0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6383v;
import p065g5.AbstractC6427k;
import p102l5.AbstractC7351e;
import p102l5.C7353g;
import p102l5.C7355i;
import p102l5.C7357k;
import p102l5.InterfaceC7350d;

/* renamed from: n5.o */
/* loaded from: classes4.dex */
public final class C7481o implements InterfaceC7350d {

    /* renamed from: g */
    public static final a f9616g = new a(null);

    /* renamed from: h */
    public static final List f9617h = AbstractC6427k.m7024l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f9618i = AbstractC6427k.m7024l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final InterfaceC7350d.a f9619a;

    /* renamed from: b */
    public final C7353g f9620b;

    /* renamed from: c */
    public final C7531c f9621c;

    /* renamed from: d */
    public volatile C7482p f9622d;

    /* renamed from: e */
    public final Protocol f9623e;

    /* renamed from: f */
    public volatile boolean f9624f;

    /* renamed from: n5.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m8549a(C6358b0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C6383v c6383vM6582f = request.m6582f();
            ArrayList arrayList = new ArrayList(c6383vM6582f.size() + 4);
            arrayList.add(new C7467a(C7467a.f9570g, request.m6584h()));
            arrayList.add(new C7467a(C7467a.f9571h, C7355i.f9343a.m8354c(request.m6588l())));
            String strM6581e = request.m6581e(HttpHeaders.HOST);
            if (strM6581e != null) {
                arrayList.add(new C7467a(C7467a.f9573j, strM6581e));
            }
            arrayList.add(new C7467a(C7467a.f9572i, request.m6588l().m6832q()));
            int size = c6383vM6582f.size();
            for (int i6 = 0; i6 < size; i6++) {
                String strM6801c = c6383vM6582f.m6801c(i6);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strM6801c.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!C7481o.f9617h.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(c6383vM6582f.m6804g(i6), "trailers"))) {
                    arrayList.add(new C7467a(lowerCase, c6383vM6582f.m6804g(i6)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C6362d0.a m8550b(C6383v headerBlock, Protocol protocol) throws ProtocolException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            C6383v.a aVar = new C6383v.a();
            int size = headerBlock.size();
            C7357k c7357kM8361a = null;
            for (int i6 = 0; i6 < size; i6++) {
                String strM6801c = headerBlock.m6801c(i6);
                String strM6804g = headerBlock.m6804g(i6);
                if (Intrinsics.areEqual(strM6801c, ":status")) {
                    c7357kM8361a = C7357k.f9346d.m8361a("HTTP/1.1 " + strM6804g);
                } else if (!C7481o.f9618i.contains(strM6801c)) {
                    aVar.m6809d(strM6801c, strM6804g);
                }
            }
            if (c7357kM8361a != null) {
                return new C6362d0.a().m6694o(protocol).m6685f(c7357kM8361a.f9348b).m6691l(c7357kM8361a.f9349c).m6689j(aVar.m6811f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public C7481o(C6356a0 client, InterfaceC7350d.a carrier, C7353g chain, C7531c http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f9619a = carrier;
        this.f9620b = chain;
        this.f9621c = http2Connection;
        List listM6492C = client.m6492C();
        Protocol protocol = Protocol.f9720g;
        this.f9623e = listM6492C.contains(protocol) ? protocol : Protocol.f9719f;
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: a */
    public void mo8322a() {
        C7482p c7482p = this.f9622d;
        Intrinsics.checkNotNull(c7482p);
        c7482p.getSink().close();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: b */
    public long mo8323b(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC7351e.m8332b(response)) {
            return AbstractC6427k.m7023k(response);
        }
        return 0L;
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: c */
    public Sink mo8324c(C6358b0 request, long j6) {
        Intrinsics.checkNotNullParameter(request, "request");
        C7482p c7482p = this.f9622d;
        Intrinsics.checkNotNull(c7482p);
        return c7482p.getSink();
    }

    @Override // p102l5.InterfaceC7350d
    public void cancel() {
        this.f9624f = true;
        C7482p c7482p = this.f9622d;
        if (c7482p != null) {
            c7482p.m8561g(ErrorCode.f9887k);
        }
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: d */
    public boolean mo8325d() {
        C7482p c7482p = this.f9622d;
        return c7482p != null && c7482p.m8576v();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: e */
    public void mo8326e(C6358b0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f9622d != null) {
            return;
        }
        this.f9622d = this.f9621c.m8807R(f9616g.m8549a(request), request.m6577a() != null);
        if (this.f9624f) {
            C7482p c7482p = this.f9622d;
            Intrinsics.checkNotNull(c7482p);
            c7482p.m8561g(ErrorCode.f9887k);
            throw new IOException("Canceled");
        }
        C7482p c7482p2 = this.f9622d;
        Intrinsics.checkNotNull(c7482p2);
        Timeout timeoutM8577w = c7482p2.m8577w();
        long jM8348h = this.f9620b.m8348h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM8577w.timeout(jM8348h, timeUnit);
        C7482p c7482p3 = this.f9622d;
        Intrinsics.checkNotNull(c7482p3);
        c7482p3.m8555D().timeout(this.f9620b.m8350j(), timeUnit);
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: f */
    public C6362d0.a mo8327f(boolean z6) throws IOException {
        C7482p c7482p = this.f9622d;
        if (c7482p == null) {
            throw new IOException("stream wasn't created");
        }
        C6362d0.a aVarM8550b = f9616g.m8550b(c7482p.m8553B(z6), this.f9623e);
        if (z6 && aVarM8550b.m6686g() == 100) {
            return null;
        }
        return aVarM8550b;
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: g */
    public Source mo8328g(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C7482p c7482p = this.f9622d;
        Intrinsics.checkNotNull(c7482p);
        return c7482p.getSource();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: h */
    public void mo8329h() {
        this.f9621c.flush();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: i */
    public InterfaceC7350d.a mo8330i() {
        return this.f9619a;
    }
}

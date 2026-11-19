package p125i9;

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
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.C8741b;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p011a9.C0054q;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p028b9.AbstractC5070d;
import p103g9.AbstractC7604e;
import p103g9.C7606g;
import p103g9.C7608i;
import p103g9.C7610k;
import p103g9.InterfaceC7603d;

/* renamed from: i9.c */
/* loaded from: classes5.dex */
public final class C7718c implements InterfaceC7603d {

    /* renamed from: g */
    public static final a f13104g = new a(null);

    /* renamed from: h */
    public static final List f13105h = AbstractC5070d.m2658w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f13106i = AbstractC5070d.m2658w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final RealConnection f13107a;

    /* renamed from: b */
    public final C7606g f13108b;

    /* renamed from: c */
    public final C8741b f13109c;

    /* renamed from: d */
    public volatile C7719d f13110d;

    /* renamed from: e */
    public final Protocol f13111e;

    /* renamed from: f */
    public volatile boolean f13112f;

    /* renamed from: i9.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m12898a(C0060w request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C0054q c0054qM376e = request.m376e();
            ArrayList arrayList = new ArrayList(c0054qM376e.size() + 4);
            arrayList.add(new C7716a(C7716a.f13092g, request.m378g()));
            arrayList.add(new C7716a(C7716a.f13093h, C7608i.f12761a.m12524c(request.m381j())));
            String strM375d = request.m375d(HttpHeaders.HOST);
            if (strM375d != null) {
                arrayList.add(new C7716a(C7716a.f13095j, strM375d));
            }
            arrayList.add(new C7716a(C7716a.f13094i, request.m381j().m219r()));
            int size = c0054qM376e.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM181b = c0054qM376e.m181b(i10);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strM181b.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C7718c.f13105h.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(c0054qM376e.m184f(i10), "trailers"))) {
                    arrayList.add(new C7716a(lowerCase, c0054qM376e.m184f(i10)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C0062y.a m12899b(C0054q headerBlock, Protocol protocol) throws ProtocolException, NumberFormatException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            C0054q.a aVar = new C0054q.a();
            int size = headerBlock.size();
            C7610k c7610kM12531a = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strM181b = headerBlock.m181b(i10);
                String strM184f = headerBlock.m184f(i10);
                if (Intrinsics.areEqual(strM181b, ":status")) {
                    c7610kM12531a = C7610k.f12764d.m12531a("HTTP/1.1 " + strM184f);
                } else if (!C7718c.f13106i.contains(strM181b)) {
                    aVar.m189d(strM181b, strM184f);
                }
            }
            if (c7610kM12531a != null) {
                return new C0062y.a().m448p(protocol).m439g(c7610kM12531a.f12766b).m445m(c7610kM12531a.f12767c).m443k(aVar.m191f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public C7718c(C0059v client, RealConnection connection, C7606g chain, C8741b http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f13107a = connection;
        this.f13108b = chain;
        this.f13109c = http2Connection;
        List listM297C = client.m297C();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f13111e = listM297C.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: a */
    public void mo12493a() throws IOException {
        C7719d c7719d = this.f13110d;
        Intrinsics.checkNotNull(c7719d);
        c7719d.m12918n().close();
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: b */
    public void mo12494b(C0060w request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f13110d != null) {
            return;
        }
        this.f13110d = this.f13109c.m14521L(f13104g.m12898a(request), request.m372a() != null);
        if (this.f13112f) {
            C7719d c7719d = this.f13110d;
            Intrinsics.checkNotNull(c7719d);
            c7719d.m12910f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C7719d c7719d2 = this.f13110d;
        Intrinsics.checkNotNull(c7719d2);
        Timeout timeoutM12926v = c7719d2.m12926v();
        long jM12518h = this.f13108b.m12518h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM12926v.timeout(jM12518h, timeUnit);
        C7719d c7719d3 = this.f13110d;
        Intrinsics.checkNotNull(c7719d3);
        c7719d3.m12904E().timeout(this.f13108b.m12520j(), timeUnit);
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: c */
    public Sink mo12495c(C0060w request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        C7719d c7719d = this.f13110d;
        Intrinsics.checkNotNull(c7719d);
        return c7719d.m12918n();
    }

    @Override // p103g9.InterfaceC7603d
    public void cancel() {
        this.f13112f = true;
        C7719d c7719d = this.f13110d;
        if (c7719d != null) {
            c7719d.m12910f(ErrorCode.CANCEL);
        }
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: d */
    public RealConnection mo12496d() {
        return this.f13107a;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: e */
    public long mo12497e(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC7604e.m12502b(response)) {
            return AbstractC5070d.m2657v(response);
        }
        return 0L;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: f */
    public C0062y.a mo12498f(boolean z9) throws NumberFormatException, IOException {
        C7719d c7719d = this.f13110d;
        if (c7719d == null) {
            throw new IOException("stream wasn't created");
        }
        C0062y.a aVarM12899b = f13104g.m12899b(c7719d.m12902C(), this.f13111e);
        if (z9 && aVarM12899b.m440h() == 100) {
            return null;
        }
        return aVarM12899b;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: g */
    public Source mo12499g(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C7719d c7719d = this.f13110d;
        Intrinsics.checkNotNull(c7719d);
        return c7719d.m12920p();
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: h */
    public void mo12500h() {
        this.f13109c.flush();
    }
}

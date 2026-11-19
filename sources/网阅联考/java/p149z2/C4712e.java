package p149z2;

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
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p117r2.C4496a0;
import p117r2.C4516s;
import p117r2.C4521x;
import p117r2.C4522y;
import p121s2.AbstractC4550b;
import p141x2.AbstractC4668e;
import p141x2.C4670g;
import p141x2.C4672i;
import p141x2.C4674k;
import p141x2.InterfaceC4667d;

/* renamed from: z2.e */
/* loaded from: classes2.dex */
public final class C4712e implements InterfaceC4667d {

    /* renamed from: a */
    public volatile C4714g f6214a;

    /* renamed from: b */
    public final Protocol f6215b;

    /* renamed from: c */
    public volatile boolean f6216c;

    /* renamed from: d */
    public final RealConnection f6217d;

    /* renamed from: e */
    public final C4670g f6218e;

    /* renamed from: f */
    public final C4711d f6219f;

    /* renamed from: i */
    public static final a f6213i = new a(null);

    /* renamed from: g */
    public static final List f6211g = AbstractC4550b.m6238t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f6212h = AbstractC4550b.m6238t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: z2.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m6824a(C4522y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C4516s c4516sM6136e = request.m6136e();
            ArrayList arrayList = new ArrayList(c4516sM6136e.size() + 4);
            arrayList.add(new C4708a(C4708a.f6069f, request.m6138g()));
            arrayList.add(new C4708a(C4708a.f6070g, C4672i.f5981a.m6597c(request.m6141j())));
            String strM6135d = request.m6135d("Host");
            if (strM6135d != null) {
                arrayList.add(new C4708a(C4708a.f6072i, strM6135d));
            }
            arrayList.add(new C4708a(C4708a.f6071h, request.m6141j().m5996r()));
            int size = c4516sM6136e.size();
            for (int i4 = 0; i4 < size; i4++) {
                String strM5960b = c4516sM6136e.m5960b(i4);
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (strM5960b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strM5960b.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C4712e.f6211g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(c4516sM6136e.m5962e(i4), "trailers"))) {
                    arrayList.add(new C4708a(lowerCase, c4516sM6136e.m5962e(i4)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C4496a0.a m6825b(C4516s headerBlock, Protocol protocol) throws ProtocolException, NumberFormatException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            C4516s.a aVar = new C4516s.a();
            int size = headerBlock.size();
            C4674k c4674kM6604a = null;
            for (int i4 = 0; i4 < size; i4++) {
                String strM5960b = headerBlock.m5960b(i4);
                String strM5962e = headerBlock.m5962e(i4);
                if (Intrinsics.areEqual(strM5960b, ":status")) {
                    c4674kM6604a = C4674k.f5984d.m6604a("HTTP/1.1 " + strM5962e);
                } else if (!C4712e.f6212h.contains(strM5960b)) {
                    aVar.m5967d(strM5960b, strM5962e);
                }
            }
            if (c4674kM6604a != null) {
                return new C4496a0.a().m5833p(protocol).m5824g(c4674kM6604a.f5986b).m5830m(c4674kM6604a.f5987c).m5828k(aVar.m5968e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C4712e(C4521x client, RealConnection connection, C4670g chain, C4711d http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f6217d = connection;
        this.f6218e = chain;
        this.f6219f = http2Connection;
        List listM6091w = client.m6091w();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f6215b = listM6091w.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: a */
    public long mo6566a(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC4668e.m6575b(response)) {
            return AbstractC4550b.m6237s(response);
        }
        return 0L;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: b */
    public void mo6567b() throws IOException {
        C4714g c4714g = this.f6214a;
        Intrinsics.checkNotNull(c4714g);
        c4714g.m6867n().close();
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: c */
    public Sink mo6568c(C4522y request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        C4714g c4714g = this.f6214a;
        Intrinsics.checkNotNull(c4714g);
        return c4714g.m6867n();
    }

    @Override // p141x2.InterfaceC4667d
    public void cancel() {
        this.f6216c = true;
        C4714g c4714g = this.f6214a;
        if (c4714g != null) {
            c4714g.m6859f(ErrorCode.CANCEL);
        }
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: d */
    public void mo6569d(C4522y request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f6214a != null) {
            return;
        }
        this.f6214a = this.f6219f.m6769H(f6213i.m6824a(request), request.m6132a() != null);
        if (this.f6216c) {
            C4714g c4714g = this.f6214a;
            Intrinsics.checkNotNull(c4714g);
            c4714g.m6859f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C4714g c4714g2 = this.f6214a;
        Intrinsics.checkNotNull(c4714g2);
        Timeout timeoutM6875v = c4714g2.m6875v();
        long jM6591g = this.f6218e.m6591g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM6875v.timeout(jM6591g, timeUnit);
        C4714g c4714g3 = this.f6214a;
        Intrinsics.checkNotNull(c4714g3);
        c4714g3.m6853E().timeout(this.f6218e.m6593i(), timeUnit);
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: e */
    public C4496a0.a mo6570e(boolean z3) throws ProtocolException, NumberFormatException {
        C4714g c4714g = this.f6214a;
        Intrinsics.checkNotNull(c4714g);
        C4496a0.a aVarM6825b = f6213i.m6825b(c4714g.m6851C(), this.f6215b);
        if (z3 && aVarM6825b.m5825h() == 100) {
            return null;
        }
        return aVarM6825b;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: f */
    public RealConnection mo6571f() {
        return this.f6217d;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: g */
    public void mo6572g() {
        this.f6219f.flush();
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: h */
    public Source mo6573h(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C4714g c4714g = this.f6214a;
        Intrinsics.checkNotNull(c4714g);
        return c4714g.m6869p();
    }
}

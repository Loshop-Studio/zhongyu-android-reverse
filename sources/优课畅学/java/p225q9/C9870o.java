package p225q9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.Protocol;
import okhttp3.internal.http2.C9565c;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p136i9.C8897a0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8924v;
import p147j9.AbstractC9041k;
import p203o9.AbstractC9550e;
import p203o9.C9552g;
import p203o9.C9554i;
import p203o9.C9556k;
import p203o9.InterfaceC9549d;

/* renamed from: q9.o */
/* loaded from: classes5.dex */
public final class C9870o implements InterfaceC9549d {

    /* renamed from: g */
    public static final a f19710g = new a(null);

    /* renamed from: h */
    public static final List f19711h = AbstractC9041k.m15782l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f19712i = AbstractC9041k.m15782l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final InterfaceC9549d.a f19713a;

    /* renamed from: b */
    public final C9552g f19714b;

    /* renamed from: c */
    public final C9565c f19715c;

    /* renamed from: d */
    public volatile C9871p f19716d;

    /* renamed from: e */
    public final Protocol f19717e;

    /* renamed from: f */
    public volatile boolean f19718f;

    /* renamed from: q9.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final List m18382a(C8899b0 request) {
            AbstractC9133u.m16133g(request, "request");
            C8924v c8924vM15046f = request.m15046f();
            ArrayList arrayList = new ArrayList(c8924vM15046f.size() + 4);
            arrayList.add(new C9856a(C9856a.f19664g, request.m15048h()));
            arrayList.add(new C9856a(C9856a.f19665h, C9554i.f18930a.m17859c(request.m15052l())));
            String strM15045e = request.m15045e(HttpHeaders.HOST);
            if (strM15045e != null) {
                arrayList.add(new C9856a(C9856a.f19667j, strM15045e));
            }
            arrayList.add(new C9856a(C9856a.f19666i, request.m15052l().m15293q()));
            int size = c8924vM15046f.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM15262c = c8924vM15046f.m15262c(i10);
                Locale US = Locale.US;
                AbstractC9133u.m16132f(US, "US");
                String lowerCase = strM15262c.toLowerCase(US);
                AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
                if (!C9870o.f19711h.contains(lowerCase) || (AbstractC9133u.m16128b(lowerCase, "te") && AbstractC9133u.m16128b(c8924vM15046f.m15265g(i10), "trailers"))) {
                    arrayList.add(new C9856a(lowerCase, c8924vM15046f.m15265g(i10)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C8903d0.a m18383b(C8924v headerBlock, Protocol protocol) throws ProtocolException {
            AbstractC9133u.m16133g(headerBlock, "headerBlock");
            AbstractC9133u.m16133g(protocol, "protocol");
            C8924v.a aVar = new C8924v.a();
            int size = headerBlock.size();
            C9556k c9556kM17866a = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strM15262c = headerBlock.m15262c(i10);
                String strM15265g = headerBlock.m15265g(i10);
                if (AbstractC9133u.m16128b(strM15262c, ":status")) {
                    c9556kM17866a = C9556k.f18933d.m17866a("HTTP/1.1 " + strM15265g);
                } else if (!C9870o.f19712i.contains(strM15262c)) {
                    aVar.m15270d(strM15262c, strM15265g);
                }
            }
            if (c9556kM17866a != null) {
                return new C8903d0.a().m15157o(protocol).m15148f(c9556kM17866a.f18935b).m15154l(c9556kM17866a.f18936c).m15152j(aVar.m15272f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public C9870o(C8897a0 client, InterfaceC9549d.a carrier, C9552g chain, C9565c http2Connection) {
        AbstractC9133u.m16133g(client, "client");
        AbstractC9133u.m16133g(carrier, "carrier");
        AbstractC9133u.m16133g(chain, "chain");
        AbstractC9133u.m16133g(http2Connection, "http2Connection");
        this.f19713a = carrier;
        this.f19714b = chain;
        this.f19715c = http2Connection;
        List listM14956C = client.m14956C();
        Protocol protocol = Protocol.f18942g;
        this.f19717e = listM14956C.contains(protocol) ? protocol : Protocol.f18941f;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: a */
    public void mo17827a() {
        C9871p c9871p = this.f19716d;
        AbstractC9133u.m16130d(c9871p);
        c9871p.getSink().close();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: b */
    public Sink mo17828b(C8899b0 request, long j10) {
        AbstractC9133u.m16133g(request, "request");
        C9871p c9871p = this.f19716d;
        AbstractC9133u.m16130d(c9871p);
        return c9871p.getSink();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: c */
    public Source mo17829c(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        C9871p c9871p = this.f19716d;
        AbstractC9133u.m16130d(c9871p);
        return c9871p.getSource();
    }

    @Override // p203o9.InterfaceC9549d
    public void cancel() {
        this.f19718f = true;
        C9871p c9871p = this.f19716d;
        if (c9871p != null) {
            c9871p.m18394g(ErrorCode.f19109k);
        }
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: d */
    public boolean mo17830d() {
        C9871p c9871p = this.f19716d;
        return c9871p != null && c9871p.m18409v();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: e */
    public C8903d0.a mo17831e(boolean z10) throws IOException {
        C9871p c9871p = this.f19716d;
        if (c9871p == null) {
            throw new IOException("stream wasn't created");
        }
        C8903d0.a aVarM18383b = f19710g.m18383b(c9871p.m18386B(z10), this.f19717e);
        if (z10 && aVarM18383b.m15149g() == 100) {
            return null;
        }
        return aVarM18383b;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: f */
    public void mo17832f(C8899b0 request) throws IOException {
        AbstractC9133u.m16133g(request, "request");
        if (this.f19716d != null) {
            return;
        }
        this.f19716d = this.f19715c.m17985N(f19710g.m18382a(request), request.m15041a() != null);
        if (this.f19718f) {
            C9871p c9871p = this.f19716d;
            AbstractC9133u.m16130d(c9871p);
            c9871p.m18394g(ErrorCode.f19109k);
            throw new IOException("Canceled");
        }
        C9871p c9871p2 = this.f19716d;
        AbstractC9133u.m16130d(c9871p2);
        Timeout timeoutM18410w = c9871p2.m18410w();
        long jM17853h = this.f19714b.m17853h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM18410w.timeout(jM17853h, timeUnit);
        C9871p c9871p3 = this.f19716d;
        AbstractC9133u.m16130d(c9871p3);
        c9871p3.m18388D().timeout(this.f19714b.m17855j(), timeUnit);
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: g */
    public void mo17833g() {
        this.f19715c.flush();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: h */
    public InterfaceC9549d.a mo17834h() {
        return this.f19713a;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: i */
    public long mo17835i(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        if (AbstractC9550e.m17837b(response)) {
            return AbstractC9041k.m15781k(response);
        }
        return 0L;
    }
}

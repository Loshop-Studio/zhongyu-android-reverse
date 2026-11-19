package p117r2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;

/* renamed from: r2.q */
/* loaded from: classes2.dex */
public abstract class AbstractC4514q {

    /* renamed from: b */
    public static final b f5524b = new b(null);

    /* renamed from: a */
    public static final AbstractC4514q f5523a = new a();

    /* renamed from: r2.q$a */
    public static final class a extends AbstractC4514q {
    }

    /* renamed from: r2.q$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r2.q$c */
    public interface c {
        /* renamed from: a */
        AbstractC4514q mo5953a(InterfaceC4502e interfaceC4502e);
    }

    /* renamed from: A */
    public void m5925A(InterfaceC4502e call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: B */
    public void m5926B(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: a */
    public void m5927a(InterfaceC4502e call, C4496a0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m5928b(InterfaceC4502e call, C4496a0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: c */
    public void m5929c(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: d */
    public void m5930d(InterfaceC4502e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: e */
    public void m5931e(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: f */
    public void m5932f(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: g */
    public void m5933g(InterfaceC4502e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: h */
    public void m5934h(InterfaceC4502e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: i */
    public void m5935i(InterfaceC4502e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: j */
    public void m5936j(InterfaceC4502e call, InterfaceC4506i connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: k */
    public void m5937k(InterfaceC4502e call, InterfaceC4506i connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: l */
    public void m5938l(InterfaceC4502e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    /* renamed from: m */
    public void m5939m(InterfaceC4502e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    /* renamed from: n */
    public void m5940n(InterfaceC4502e call, C4517t url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    /* renamed from: o */
    public void m5941o(InterfaceC4502e call, C4517t url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    /* renamed from: p */
    public void m5942p(InterfaceC4502e call, long j4) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: q */
    public void m5943q(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: r */
    public void m5944r(InterfaceC4502e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: s */
    public void m5945s(InterfaceC4502e call, C4522y request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    /* renamed from: t */
    public void m5946t(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: u */
    public void m5947u(InterfaceC4502e call, long j4) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: v */
    public void m5948v(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: w */
    public void m5949w(InterfaceC4502e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: x */
    public void m5950x(InterfaceC4502e call, C4496a0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: y */
    public void m5951y(InterfaceC4502e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: z */
    public void m5952z(InterfaceC4502e call, C4496a0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }
}

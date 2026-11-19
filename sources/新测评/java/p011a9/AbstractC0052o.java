package p011a9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;

/* renamed from: a9.o */
/* loaded from: classes5.dex */
public abstract class AbstractC0052o {

    /* renamed from: a */
    public static final b f156a = new b(null);

    /* renamed from: b */
    public static final AbstractC0052o f157b = new a();

    /* renamed from: a9.o$a */
    public static final class a extends AbstractC0052o {
    }

    /* renamed from: a9.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: a9.o$c */
    public interface c {
        /* renamed from: a */
        AbstractC0052o mo174a(InterfaceC0042e interfaceC0042e);
    }

    /* renamed from: A */
    public void m146A(InterfaceC0042e call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: B */
    public void m147B(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: a */
    public void m148a(InterfaceC0042e call, C0062y cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m149b(InterfaceC0042e call, C0062y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: c */
    public void m150c(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: d */
    public void m151d(InterfaceC0042e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: e */
    public void m152e(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: f */
    public void m153f(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: g */
    public void m154g(InterfaceC0042e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: h */
    public void m155h(InterfaceC0042e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: i */
    public void m156i(InterfaceC0042e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: j */
    public void m157j(InterfaceC0042e call, InterfaceC0045h connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: k */
    public void m158k(InterfaceC0042e call, InterfaceC0045h connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: l */
    public void m159l(InterfaceC0042e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    /* renamed from: m */
    public void m160m(InterfaceC0042e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    /* renamed from: n */
    public void m161n(InterfaceC0042e call, C0055r url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    /* renamed from: o */
    public void m162o(InterfaceC0042e call, C0055r url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    /* renamed from: p */
    public void m163p(InterfaceC0042e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: q */
    public void m164q(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: r */
    public void m165r(InterfaceC0042e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: s */
    public void m166s(InterfaceC0042e call, C0060w request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    /* renamed from: t */
    public void m167t(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: u */
    public void m168u(InterfaceC0042e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: v */
    public void m169v(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: w */
    public void m170w(InterfaceC0042e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: x */
    public void m171x(InterfaceC0042e call, C0062y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: y */
    public void m172y(InterfaceC0042e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: z */
    public void m173z(InterfaceC0042e call, C0062y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }
}

package p172l8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;

/* renamed from: l8.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8916o {

    /* renamed from: a */
    public static final b f14784a = new b(null);

    /* renamed from: b */
    public static final AbstractC8916o f14785b = new a();

    /* renamed from: l8.o$a */
    public static final class a extends AbstractC8916o {
    }

    /* renamed from: l8.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: l8.o$c */
    public interface c {
        /* renamed from: a */
        AbstractC8916o mo13930a(InterfaceC8906e interfaceC8906e);
    }

    /* renamed from: A */
    public void m13902A(InterfaceC8906e call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: B */
    public void m13903B(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: a */
    public void m13904a(InterfaceC8906e call, C8926y cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m13905b(InterfaceC8906e call, C8926y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: c */
    public void m13906c(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: d */
    public void m13907d(InterfaceC8906e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: e */
    public void m13908e(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: f */
    public void m13909f(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: g */
    public void m13910g(InterfaceC8906e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: h */
    public void m13911h(InterfaceC8906e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: i */
    public void m13912i(InterfaceC8906e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: j */
    public void m13913j(InterfaceC8906e call, InterfaceC8909h connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: k */
    public void m13914k(InterfaceC8906e call, InterfaceC8909h connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: l */
    public void m13915l(InterfaceC8906e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    /* renamed from: m */
    public void m13916m(InterfaceC8906e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    /* renamed from: n */
    public void m13917n(InterfaceC8906e call, C8919r url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    /* renamed from: o */
    public void m13918o(InterfaceC8906e call, C8919r url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    /* renamed from: p */
    public void m13919p(InterfaceC8906e call, long j9) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: q */
    public void m13920q(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: r */
    public void m13921r(InterfaceC8906e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: s */
    public void m13922s(InterfaceC8906e call, C8924w request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    /* renamed from: t */
    public void m13923t(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: u */
    public void m13924u(InterfaceC8906e call, long j9) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: v */
    public void m13925v(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: w */
    public void m13926w(InterfaceC8906e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: x */
    public void m13927x(InterfaceC8906e call, C8926y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: y */
    public void m13928y(InterfaceC8906e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: z */
    public void m13929z(InterfaceC8906e call, C8926y response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }
}

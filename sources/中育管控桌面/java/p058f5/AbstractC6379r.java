package p058f5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7527c;
import okhttp3.Protocol;

/* renamed from: f5.r */
/* loaded from: classes4.dex */
public abstract class AbstractC6379r {

    /* renamed from: a */
    public static final b f7950a = new b(null);

    /* renamed from: b */
    public static final AbstractC6379r f7951b = new a();

    /* renamed from: f5.r$a */
    public static final class a extends AbstractC6379r {
    }

    /* renamed from: f5.r$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: f5.r$c */
    public interface c {
        /* renamed from: a */
        AbstractC6379r mo6793a(InterfaceC6363e interfaceC6363e);
    }

    /* renamed from: A */
    public void m6763A(InterfaceC6363e call, IOException exception, boolean z6) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    /* renamed from: B */
    public void m6764B(InterfaceC6363e call, C6362d0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: C */
    public void m6765C(InterfaceC6363e call, C7527c c7527c) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: D */
    public void m6766D(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: a */
    public void m6767a(InterfaceC6363e call, C6362d0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m6768b(InterfaceC6363e call, C6362d0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: c */
    public void m6769c(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: d */
    public void m6770d(InterfaceC6363e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: e */
    public void m6771e(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: f */
    public void m6772f(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: g */
    public void m6773g(InterfaceC6363e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: h */
    public void m6774h(InterfaceC6363e call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: i */
    public void m6775i(InterfaceC6363e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    /* renamed from: j */
    public void m6776j(InterfaceC6363e call, InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: k */
    public void m6777k(InterfaceC6363e call, InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: l */
    public void m6778l(InterfaceC6363e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    /* renamed from: m */
    public void m6779m(InterfaceC6363e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    /* renamed from: n */
    public void m6780n(InterfaceC6363e call, C6362d0 networkResponse, C6358b0 c6358b0) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
    }

    /* renamed from: o */
    public void m6781o(InterfaceC6363e call, C6384w url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    /* renamed from: p */
    public void m6782p(InterfaceC6363e call, C6384w url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    /* renamed from: q */
    public void m6783q(InterfaceC6363e call, long j6) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: r */
    public void m6784r(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: s */
    public void m6785s(InterfaceC6363e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: t */
    public void m6786t(InterfaceC6363e call, C6358b0 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    /* renamed from: u */
    public void m6787u(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: v */
    public void m6788v(InterfaceC6363e call, long j6) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: w */
    public void m6789w(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: x */
    public void m6790x(InterfaceC6363e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    /* renamed from: y */
    public void m6791y(InterfaceC6363e call, C6362d0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* renamed from: z */
    public void m6792z(InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}

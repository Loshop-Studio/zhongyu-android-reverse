package p039c9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p011a9.C0037a;
import p011a9.C0038a0;
import p011a9.C0044g;
import p011a9.C0049l;
import p011a9.C0055r;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0039b;
import p011a9.InterfaceC0051n;

/* renamed from: c9.a */
/* loaded from: classes5.dex */
public final class C5165a implements InterfaceC0039b {

    /* renamed from: d */
    public final InterfaceC0051n f2758d;

    /* renamed from: c9.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2759a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2759a = iArr;
        }
    }

    public C5165a(InterfaceC0051n defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f2758d = defaultDns;
    }

    @Override // p011a9.InterfaceC0039b
    /* renamed from: a */
    public C0060w mo90a(C0038a0 c0038a0, C0062y response) {
        Proxy proxy;
        InterfaceC0051n interfaceC0051nM76c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C0037a c0037aM86a;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C0044g> listM417h = response.m417h();
        C0060w c0060wM431w = response.m431w();
        C0055r c0055rM381j = c0060wM431w.m381j();
        boolean z9 = response.m418i() == 407;
        if (c0038a0 == null || (proxy = c0038a0.m87b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C0044g c0044g : listM417h) {
            if (StringsKt.equals("Basic", c0044g.m114c(), true)) {
                if (c0038a0 == null || (c0037aM86a = c0038a0.m86a()) == null || (interfaceC0051nM76c = c0037aM86a.m76c()) == null) {
                    interfaceC0051nM76c = this.f2758d;
                }
                if (z9) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m2814b(proxy, c0055rM381j, interfaceC0051nM76c), inetSocketAddress.getPort(), c0055rM381j.m219r(), c0044g.m113b(), c0044g.m114c(), c0055rM381j.m221t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM210i = c0055rM381j.m210i();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM210i, m2814b(proxy, c0055rM381j, interfaceC0051nM76c), c0055rM381j.m215n(), c0055rM381j.m219r(), c0044g.m113b(), c0044g.m114c(), c0055rM381j.m221t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z9 ? "Proxy-Authorization" : HttpHeaders.AUTHORIZATION;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return c0060wM431w.m379h().m389h(str, C0049l.m133a(userName, new String(password), c0044g.m112a())).m384b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m2814b(Proxy proxy, C0055r c0055r, InterfaceC0051n interfaceC0051n) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f2759a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(interfaceC0051n.mo145a(c0055r.m210i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ C5165a(InterfaceC0051n interfaceC0051n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? InterfaceC0051n.f154b : interfaceC0051n);
    }
}

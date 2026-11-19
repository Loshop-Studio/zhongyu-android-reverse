package p125t2;

import com.zykj.http.interceptor.HeadInterceptor;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p117r2.C4495a;
import p117r2.C4496a0;
import p117r2.C4500c0;
import p117r2.C4504g;
import p117r2.C4511n;
import p117r2.C4517t;
import p117r2.C4522y;
import p117r2.InterfaceC4497b;
import p117r2.InterfaceC4513p;

/* renamed from: t2.b */
/* loaded from: classes2.dex */
public final class C4599b implements InterfaceC4497b {

    /* renamed from: d */
    public final InterfaceC4513p f5802d;

    public C4599b(InterfaceC4513p defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f5802d = defaultDns;
    }

    @Override // p117r2.InterfaceC4497b
    /* renamed from: a */
    public C4522y mo5837a(C4500c0 c4500c0, C4496a0 response) {
        Proxy proxy;
        InterfaceC4513p interfaceC4513pM5789c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C4495a c4495aM5847a;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C4504g> listM5803d = response.m5803d();
        C4522y c4522yM5816r = response.m5816r();
        C4517t c4517tM6141j = c4522yM5816r.m6141j();
        boolean z3 = response.m5804e() == 407;
        if (c4500c0 == null || (proxy = c4500c0.m5848b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C4504g c4504g : listM5803d) {
            if (StringsKt__StringsJVMKt.equals("Basic", c4504g.m5873c(), true)) {
                if (c4500c0 == null || (c4495aM5847a = c4500c0.m5847a()) == null || (interfaceC4513pM5789c = c4495aM5847a.m5789c()) == null) {
                    interfaceC4513pM5789c = this.f5802d;
                }
                if (z3) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m6340b(proxy, c4517tM6141j, interfaceC4513pM5789c), inetSocketAddress.getPort(), c4517tM6141j.m5996r(), c4504g.m5872b(), c4504g.m5873c(), c4517tM6141j.m5998t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM5987i = c4517tM6141j.m5987i();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM5987i, m6340b(proxy, c4517tM6141j, interfaceC4513pM5789c), c4517tM6141j.m5992n(), c4517tM6141j.m5996r(), c4504g.m5872b(), c4504g.m5873c(), c4517tM6141j.m5998t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z3 ? "Proxy-Authorization" : HeadInterceptor.AUTH_KEY;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return c4522yM5816r.m6139h().m6144c(str, C4511n.m5916a(userName, new String(password), c4504g.m5871a())).m6143b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m6340b(Proxy proxy, C4517t c4517t, InterfaceC4513p interfaceC4513p) {
        Proxy.Type type = proxy.type();
        if (type != null && AbstractC4598a.f5801a[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt___CollectionsKt.first(interfaceC4513p.mo5924a(c4517t.m5987i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "(address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ C4599b(InterfaceC4513p interfaceC4513p, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? InterfaceC4513p.f5521a : interfaceC4513p);
    }
}

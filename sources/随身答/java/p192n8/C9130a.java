package p192n8;

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
import p172l8.C8901a;
import p172l8.C8902a0;
import p172l8.C8908g;
import p172l8.C8913l;
import p172l8.C8919r;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8903b;
import p172l8.InterfaceC8915n;

/* renamed from: n8.a */
/* loaded from: classes5.dex */
public final class C9130a implements InterfaceC8903b {

    /* renamed from: d */
    public final InterfaceC8915n f15368d;

    /* renamed from: n8.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15369a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15369a = iArr;
        }
    }

    public C9130a(InterfaceC8915n defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f15368d = defaultDns;
    }

    @Override // p172l8.InterfaceC8903b
    /* renamed from: a */
    public C8924w mo13849a(C8902a0 c8902a0, C8926y response) {
        Proxy proxy;
        InterfaceC8915n interfaceC8915nM13835c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C8901a c8901aM13845a;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C8908g> listM14173h = response.m14173h();
        C8924w c8924wM14187w = response.m14187w();
        C8919r c8919rM14137j = c8924wM14187w.m14137j();
        boolean z9 = response.m14174i() == 407;
        if (c8902a0 == null || (proxy = c8902a0.m13846b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C8908g c8908g : listM14173h) {
            if (StringsKt.equals("Basic", c8908g.m13871c(), true)) {
                if (c8902a0 == null || (c8901aM13845a = c8902a0.m13845a()) == null || (interfaceC8915nM13835c = c8901aM13845a.m13835c()) == null) {
                    interfaceC8915nM13835c = this.f15368d;
                }
                if (z9) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m14654b(proxy, c8919rM14137j, interfaceC8915nM13835c), inetSocketAddress.getPort(), c8919rM14137j.m13975r(), c8908g.m13870b(), c8908g.m13871c(), c8919rM14137j.m13977t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM13966i = c8919rM14137j.m13966i();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM13966i, m14654b(proxy, c8919rM14137j, interfaceC8915nM13835c), c8919rM14137j.m13971n(), c8919rM14137j.m13975r(), c8908g.m13870b(), c8908g.m13871c(), c8919rM14137j.m13977t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z9 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return c8924wM14187w.m14135h().m14145h(str, C8913l.m13890a(userName, new String(password), c8908g.m13869a())).m14140b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m14654b(Proxy proxy, C8919r c8919r, InterfaceC8915n interfaceC8915n) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f15369a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(interfaceC8915n.mo13901a(c8919r.m13966i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ C9130a(InterfaceC8915n interfaceC8915n, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? InterfaceC8915n.f14782b : interfaceC8915n);
    }
}

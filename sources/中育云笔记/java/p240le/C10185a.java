package p240le;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import je.C9720a;
import je.C9721a0;
import je.C9727g;
import je.C9732l;
import je.C9738r;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9722b;
import je.InterfaceC9734n;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;

/* renamed from: le.a */
/* loaded from: classes6.dex */
public final class C10185a implements InterfaceC9722b {

    /* renamed from: d */
    public final InterfaceC9734n f24229d;

    /* renamed from: le.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24230a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24230a = iArr;
        }
    }

    public C10185a(InterfaceC9734n defaultDns) {
        AbstractC9979u.m20294g(defaultDns, "defaultDns");
        this.f24229d = defaultDns;
    }

    @Override // je.InterfaceC9722b
    /* renamed from: a */
    public C9743w mo19301a(C9721a0 c9721a0, C9745y response) {
        Proxy proxy;
        InterfaceC9734n interfaceC9734nM19287c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C9720a c9720aM19297a;
        AbstractC9979u.m20294g(response, "response");
        List<C9727g> listM19631i = response.m19631i();
        C9743w c9743wM19645z = response.m19645z();
        C9738r c9738rM19592j = c9743wM19645z.m19592j();
        boolean z10 = response.m19632j() == 407;
        if (c9721a0 == null || (proxy = c9721a0.m19298b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C9727g c9727g : listM19631i) {
            if (AbstractC10819z.m23230C("Basic", c9727g.m19322c(), true)) {
                if (c9721a0 == null || (c9720aM19297a = c9721a0.m19297a()) == null || (interfaceC9734nM19287c = c9720aM19297a.m19287c()) == null) {
                    interfaceC9734nM19287c = this.f24229d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    AbstractC9979u.m20292e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC9979u.m20293f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m21260b(proxy, c9738rM19592j, interfaceC9734nM19287c), inetSocketAddress.getPort(), c9738rM19592j.m19428r(), c9727g.m19321b(), c9727g.m19322c(), c9738rM19592j.m19430t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM19419i = c9738rM19592j.m19419i();
                    AbstractC9979u.m20293f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM19419i, m21260b(proxy, c9738rM19592j, interfaceC9734nM19287c), c9738rM19592j.m19424n(), c9738rM19592j.m19428r(), c9727g.m19321b(), c9727g.m19322c(), c9738rM19592j.m19430t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC9979u.m20293f(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC9979u.m20293f(password, "auth.password");
                    return c9743wM19645z.m19590h().m19600h(str, C9732l.m19342a(userName, new String(password), c9727g.m19320a())).m19595b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m21260b(Proxy proxy, C9738r c9738r, InterfaceC9734n interfaceC9734n) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f24230a[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC10947g0.m23944m0(interfaceC9734n.mo19354a(c9738r.m19419i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC9979u.m20292e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC9979u.m20293f(address, "address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ C10185a(InterfaceC9734n interfaceC9734n, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? InterfaceC9734n.f22735b : interfaceC9734n);
    }
}

package p158k9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8778f0;
import p136i9.C8896a;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8907f0;
import p136i9.C8911i;
import p136i9.C8917o;
import p136i9.C8925w;
import p136i9.InterfaceC8898b;
import p136i9.InterfaceC8919q;

/* renamed from: k9.a */
/* loaded from: classes5.dex */
public final class C9075a implements InterfaceC8898b {

    /* renamed from: d */
    public final InterfaceC8919q f17335d;

    /* renamed from: k9.a$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17336a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17336a = iArr;
        }
    }

    public C9075a(InterfaceC8919q defaultDns) {
        AbstractC9133u.m16133g(defaultDns, "defaultDns");
        this.f17335d = defaultDns;
    }

    @Override // p136i9.InterfaceC8898b
    /* renamed from: a */
    public C8899b0 mo15040a(C8907f0 c8907f0, C8903d0 response) {
        Proxy proxyM15175b;
        InterfaceC8919q interfaceC8919qM14941c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C8896a c8896aM15174a;
        AbstractC9133u.m16133g(response, "response");
        List<C8911i> listM15127e = response.m15127e();
        C8899b0 c8899b0M15141t = response.m15141t();
        C8925w c8925wM15052l = c8899b0M15141t.m15052l();
        boolean z10 = response.m15128f() == 407;
        if (c8907f0 == null || (proxyM15175b = c8907f0.m15175b()) == null) {
            proxyM15175b = Proxy.NO_PROXY;
        }
        for (C8911i c8911i : listM15127e) {
            if (AbstractC8687z.m14093A("Basic", c8911i.m15190c(), true)) {
                if (c8907f0 == null || (c8896aM15174a = c8907f0.m15174a()) == null || (interfaceC8919qM14941c = c8896aM15174a.m14941c()) == null) {
                    interfaceC8919qM14941c = this.f17335d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyM15175b.address();
                    AbstractC9133u.m16131e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC9133u.m16130d(proxyM15175b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m15899b(proxyM15175b, c8925wM15052l, interfaceC8919qM14941c), inetSocketAddress.getPort(), c8925wM15052l.m15293q(), c8911i.m15189b(), c8911i.m15190c(), c8925wM15052l.m15295s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM15284h = c8925wM15052l.m15284h();
                    AbstractC9133u.m16130d(proxyM15175b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM15284h, m15899b(proxyM15175b, c8925wM15052l, interfaceC8919qM14941c), c8925wM15052l.m15289m(), c8925wM15052l.m15293q(), c8911i.m15189b(), c8911i.m15190c(), c8925wM15052l.m15295s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : HttpHeaders.AUTHORIZATION;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC9133u.m16132f(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC9133u.m16132f(password, "getPassword(...)");
                    return c8899b0M15141t.m15049i().m15067o(str, C8917o.m15211a(userName, new String(password), c8911i.m15188a())).m15055b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m15899b(Proxy proxy, C8925w c8925w, InterfaceC8919q interfaceC8919q) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f17336a[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC8778f0.m14566l0(interfaceC8919q.mo15223a(c8925w.m15284h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC9133u.m16131e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC9133u.m16132f(address, "getAddress(...)");
        return address;
    }

    public /* synthetic */ C9075a(InterfaceC8919q interfaceC8919q, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? InterfaceC8919q.f16780b : interfaceC8919q);
    }
}

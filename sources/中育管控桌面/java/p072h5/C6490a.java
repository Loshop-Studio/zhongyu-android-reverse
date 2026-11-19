package p072h5;

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
import p058f5.C6355a;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6366f0;
import p058f5.C6370i;
import p058f5.C6376o;
import p058f5.C6384w;
import p058f5.InterfaceC6357b;
import p058f5.InterfaceC6378q;

/* renamed from: h5.a */
/* loaded from: classes4.dex */
public final class C6490a implements InterfaceC6357b {

    /* renamed from: d */
    public final InterfaceC6378q f8295d;

    /* renamed from: h5.a$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8296a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8296a = iArr;
        }
    }

    public C6490a(InterfaceC6378q defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f8295d = defaultDns;
    }

    @Override // p058f5.InterfaceC6357b
    /* renamed from: a */
    public C6358b0 mo6576a(C6366f0 c6366f0, C6362d0 response) {
        Proxy proxyM6714b;
        InterfaceC6378q interfaceC6378qM6477c;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C6355a c6355aM6713a;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C6370i> listM6664i = response.m6664i();
        C6358b0 c6358b0M6678x = response.m6678x();
        C6384w c6384wM6588l = c6358b0M6678x.m6588l();
        boolean z6 = response.m6665j() == 407;
        if (c6366f0 == null || (proxyM6714b = c6366f0.m6714b()) == null) {
            proxyM6714b = Proxy.NO_PROXY;
        }
        for (C6370i c6370i : listM6664i) {
            if (StringsKt.equals("Basic", c6370i.m6729c(), true)) {
                if (c6366f0 == null || (c6355aM6713a = c6366f0.m6713a()) == null || (interfaceC6378qM6477c = c6355aM6713a.m6477c()) == null) {
                    interfaceC6378qM6477c = this.f8295d;
                }
                if (z6) {
                    SocketAddress socketAddressAddress = proxyM6714b.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNull(proxyM6714b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m7185b(proxyM6714b, c6384wM6588l, interfaceC6378qM6477c), inetSocketAddress.getPort(), c6384wM6588l.m6832q(), c6370i.m6728b(), c6370i.m6729c(), c6384wM6588l.m6834s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM6823h = c6384wM6588l.m6823h();
                    Intrinsics.checkNotNull(proxyM6714b);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM6823h, m7185b(proxyM6714b, c6384wM6588l, interfaceC6378qM6477c), c6384wM6588l.m6828m(), c6384wM6588l.m6832q(), c6370i.m6728b(), c6370i.m6729c(), c6384wM6588l.m6834s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z6 ? "Proxy-Authorization" : HttpHeaders.AUTHORIZATION;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "getPassword(...)");
                    return c6358b0M6678x.m6585i().m6603o(str, C6376o.m6750a(userName, new String(password), c6370i.m6727a())).m6591b();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final InetAddress m7185b(Proxy proxy, C6384w c6384w, InterfaceC6378q interfaceC6378q) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f8296a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(interfaceC6378q.mo6762a(c6384w.m6823h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        return address;
    }

    public /* synthetic */ C6490a(InterfaceC6378q interfaceC6378q, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? InterfaceC6378q.f7948b : interfaceC6378q);
    }
}

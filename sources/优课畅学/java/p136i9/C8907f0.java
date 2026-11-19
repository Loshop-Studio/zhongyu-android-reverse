package p136i9;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.Protocol;
import p113g8.AbstractC8661c0;
import p147j9.AbstractC9036f;

/* renamed from: i9.f0 */
/* loaded from: classes5.dex */
public final class C8907f0 {

    /* renamed from: a */
    public final C8896a f16727a;

    /* renamed from: b */
    public final Proxy f16728b;

    /* renamed from: c */
    public final InetSocketAddress f16729c;

    public C8907f0(C8896a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC9133u.m16133g(address, "address");
        AbstractC9133u.m16133g(proxy, "proxy");
        AbstractC9133u.m16133g(socketAddress, "socketAddress");
        this.f16727a = address;
        this.f16728b = proxy;
        this.f16729c = socketAddress;
    }

    /* renamed from: a */
    public final C8896a m15174a() {
        return this.f16727a;
    }

    /* renamed from: b */
    public final Proxy m15175b() {
        return this.f16728b;
    }

    /* renamed from: c */
    public final boolean m15176c() {
        if (this.f16728b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f16727a.m14949k() != null || this.f16727a.m14944f().contains(Protocol.f18942g);
    }

    /* renamed from: d */
    public final InetSocketAddress m15177d() {
        return this.f16729c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8907f0)) {
            return false;
        }
        C8907f0 c8907f0 = (C8907f0) obj;
        return AbstractC9133u.m16128b(c8907f0.f16727a, this.f16727a) && AbstractC9133u.m16128b(c8907f0.f16728b, this.f16728b) && AbstractC9133u.m16128b(c8907f0.f16729c, this.f16729c);
    }

    public int hashCode() {
        return ((((527 + this.f16727a.hashCode()) * 31) + this.f16728b.hashCode()) * 31) + this.f16729c.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String strM15284h = this.f16727a.m14950l().m15284h();
        InetAddress address = this.f16729c.getAddress();
        String strM15738k = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC9036f.m15738k(hostAddress);
        if (AbstractC8661c0.m13971R(strM15284h, ':', false, 2, null)) {
            sb.append("[");
            sb.append(strM15284h);
            sb.append("]");
        } else {
            sb.append(strM15284h);
        }
        if (this.f16727a.m14950l().m15289m() != this.f16729c.getPort() || AbstractC9133u.m16128b(strM15284h, strM15738k)) {
            sb.append(":");
            sb.append(this.f16727a.m14950l().m15289m());
        }
        if (!AbstractC9133u.m16128b(strM15284h, strM15738k)) {
            if (AbstractC9133u.m16128b(this.f16728b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM15738k == null) {
                sb.append("<unresolved>");
            } else if (AbstractC8661c0.m13971R(strM15738k, ':', false, 2, null)) {
                sb.append("[");
                sb.append(strM15738k);
                sb.append("]");
            } else {
                sb.append(strM15738k);
            }
            sb.append(":");
            sb.append(this.f16729c.getPort());
        }
        return sb.toString();
    }
}

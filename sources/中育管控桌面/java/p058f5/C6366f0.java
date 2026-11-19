package p058f5;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import p065g5.AbstractC6422f;

/* renamed from: f5.f0 */
/* loaded from: classes4.dex */
public final class C6366f0 {

    /* renamed from: a */
    public final C6355a f7895a;

    /* renamed from: b */
    public final Proxy f7896b;

    /* renamed from: c */
    public final InetSocketAddress f7897c;

    public C6366f0(C6355a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f7895a = address;
        this.f7896b = proxy;
        this.f7897c = socketAddress;
    }

    /* renamed from: a */
    public final C6355a m6713a() {
        return this.f7895a;
    }

    /* renamed from: b */
    public final Proxy m6714b() {
        return this.f7896b;
    }

    /* renamed from: c */
    public final boolean m6715c() {
        if (this.f7896b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f7895a.m6485k() != null || this.f7895a.m6480f().contains(Protocol.f9720g);
    }

    /* renamed from: d */
    public final InetSocketAddress m6716d() {
        return this.f7897c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6366f0)) {
            return false;
        }
        C6366f0 c6366f0 = (C6366f0) obj;
        return Intrinsics.areEqual(c6366f0.f7895a, this.f7895a) && Intrinsics.areEqual(c6366f0.f7896b, this.f7896b) && Intrinsics.areEqual(c6366f0.f7897c, this.f7897c);
    }

    public int hashCode() {
        return ((((527 + this.f7895a.hashCode()) * 31) + this.f7896b.hashCode()) * 31) + this.f7897c.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String strM6823h = this.f7895a.m6486l().m6823h();
        InetAddress address = this.f7897c.getAddress();
        String strM6980k = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC6422f.m6980k(hostAddress);
        if (StringsKt.contains$default((CharSequence) strM6823h, ':', false, 2, (Object) null)) {
            sb.append("[");
            sb.append(strM6823h);
            sb.append("]");
        } else {
            sb.append(strM6823h);
        }
        if (this.f7895a.m6486l().m6828m() != this.f7897c.getPort() || Intrinsics.areEqual(strM6823h, strM6980k)) {
            sb.append(":");
            sb.append(this.f7895a.m6486l().m6828m());
        }
        if (!Intrinsics.areEqual(strM6823h, strM6980k)) {
            if (Intrinsics.areEqual(this.f7896b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM6980k == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.contains$default((CharSequence) strM6980k, ':', false, 2, (Object) null)) {
                sb.append("[");
                sb.append(strM6980k);
                sb.append("]");
            } else {
                sb.append(strM6980k);
            }
            sb.append(":");
            sb.append(this.f7897c.getPort());
        }
        return sb.toString();
    }
}

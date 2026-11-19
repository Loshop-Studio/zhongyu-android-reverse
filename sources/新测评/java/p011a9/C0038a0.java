package p011a9;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9.a0 */
/* loaded from: classes5.dex */
public final class C0038a0 {

    /* renamed from: a */
    public final C0037a f94a;

    /* renamed from: b */
    public final Proxy f95b;

    /* renamed from: c */
    public final InetSocketAddress f96c;

    public C0038a0(C0037a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f94a = address;
        this.f95b = proxy;
        this.f96c = socketAddress;
    }

    /* renamed from: a */
    public final C0037a m86a() {
        return this.f94a;
    }

    /* renamed from: b */
    public final Proxy m87b() {
        return this.f95b;
    }

    /* renamed from: c */
    public final boolean m88c() {
        return this.f94a.m84k() != null && this.f95b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m89d() {
        return this.f96c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0038a0)) {
            return false;
        }
        C0038a0 c0038a0 = (C0038a0) obj;
        return Intrinsics.areEqual(c0038a0.f94a, this.f94a) && Intrinsics.areEqual(c0038a0.f95b, this.f95b) && Intrinsics.areEqual(c0038a0.f96c, this.f96c);
    }

    public int hashCode() {
        return ((((527 + this.f94a.hashCode()) * 31) + this.f95b.hashCode()) * 31) + this.f96c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f96c + '}';
    }
}

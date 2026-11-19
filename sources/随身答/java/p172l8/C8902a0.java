package p172l8;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l8.a0 */
/* loaded from: classes5.dex */
public final class C8902a0 {

    /* renamed from: a */
    public final C8901a f14722a;

    /* renamed from: b */
    public final Proxy f14723b;

    /* renamed from: c */
    public final InetSocketAddress f14724c;

    public C8902a0(C8901a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f14722a = address;
        this.f14723b = proxy;
        this.f14724c = socketAddress;
    }

    /* renamed from: a */
    public final C8901a m13845a() {
        return this.f14722a;
    }

    /* renamed from: b */
    public final Proxy m13846b() {
        return this.f14723b;
    }

    /* renamed from: c */
    public final boolean m13847c() {
        return this.f14722a.m13843k() != null && this.f14723b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m13848d() {
        return this.f14724c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8902a0)) {
            return false;
        }
        C8902a0 c8902a0 = (C8902a0) obj;
        return Intrinsics.areEqual(c8902a0.f14722a, this.f14722a) && Intrinsics.areEqual(c8902a0.f14723b, this.f14723b) && Intrinsics.areEqual(c8902a0.f14724c, this.f14724c);
    }

    public int hashCode() {
        return ((((527 + this.f14722a.hashCode()) * 31) + this.f14723b.hashCode()) * 31) + this.f14724c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f14724c + '}';
    }
}

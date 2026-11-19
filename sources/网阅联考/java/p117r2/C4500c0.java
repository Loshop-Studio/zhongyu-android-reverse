package p117r2;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r2.c0 */
/* loaded from: classes2.dex */
public final class C4500c0 {

    /* renamed from: a */
    public final C4495a f5329a;

    /* renamed from: b */
    public final Proxy f5330b;

    /* renamed from: c */
    public final InetSocketAddress f5331c;

    public C4500c0(C4495a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f5329a = address;
        this.f5330b = proxy;
        this.f5331c = socketAddress;
    }

    /* renamed from: a */
    public final C4495a m5847a() {
        return this.f5329a;
    }

    /* renamed from: b */
    public final Proxy m5848b() {
        return this.f5330b;
    }

    /* renamed from: c */
    public final boolean m5849c() {
        return this.f5329a.m5797k() != null && this.f5330b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m5850d() {
        return this.f5331c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4500c0) {
            C4500c0 c4500c0 = (C4500c0) obj;
            if (Intrinsics.areEqual(c4500c0.f5329a, this.f5329a) && Intrinsics.areEqual(c4500c0.f5330b, this.f5330b) && Intrinsics.areEqual(c4500c0.f5331c, this.f5331c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f5329a.hashCode()) * 31) + this.f5330b.hashCode()) * 31) + this.f5331c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f5331c + '}';
    }
}

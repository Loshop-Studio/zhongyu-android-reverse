package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.n0 */
/* loaded from: classes4.dex */
public final class C6325n0 {

    /* renamed from: a */
    public final C6284a f10256a;

    /* renamed from: b */
    public final Proxy f10257b;

    /* renamed from: c */
    public final InetSocketAddress f10258c;

    public C6325n0(C6284a c6284a, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC5830k.m5330g(socketAddress, "socketAddress");
        this.f10256a = c6284a;
        this.f10257b = proxy;
        this.f10258c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6325n0)) {
            return false;
        }
        C6325n0 c6325n0 = (C6325n0) obj;
        return AbstractC5830k.m5325b(c6325n0.f10256a, this.f10256a) && AbstractC5830k.m5325b(c6325n0.f10257b, this.f10257b) && AbstractC5830k.m5325b(c6325n0.f10258c, this.f10258c);
    }

    public final int hashCode() {
        return this.f10258c.hashCode() + ((this.f10257b.hashCode() + ((this.f10256a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f10258c + '}';
    }
}

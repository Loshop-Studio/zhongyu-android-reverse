package je;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: je.a0 */
/* loaded from: classes6.dex */
public final class C9721a0 {

    /* renamed from: a */
    public final C9720a f22675a;

    /* renamed from: b */
    public final Proxy f22676b;

    /* renamed from: c */
    public final InetSocketAddress f22677c;

    public C9721a0(C9720a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC9979u.m20294g(address, "address");
        AbstractC9979u.m20294g(proxy, "proxy");
        AbstractC9979u.m20294g(socketAddress, "socketAddress");
        this.f22675a = address;
        this.f22676b = proxy;
        this.f22677c = socketAddress;
    }

    /* renamed from: a */
    public final C9720a m19297a() {
        return this.f22675a;
    }

    /* renamed from: b */
    public final Proxy m19298b() {
        return this.f22676b;
    }

    /* renamed from: c */
    public final boolean m19299c() {
        return this.f22675a.m19295k() != null && this.f22676b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m19300d() {
        return this.f22677c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9721a0)) {
            return false;
        }
        C9721a0 c9721a0 = (C9721a0) obj;
        return AbstractC9979u.m20289b(c9721a0.f22675a, this.f22675a) && AbstractC9979u.m20289b(c9721a0.f22676b, this.f22676b) && AbstractC9979u.m20289b(c9721a0.f22677c, this.f22677c);
    }

    public int hashCode() {
        return ((((527 + this.f22675a.hashCode()) * 31) + this.f22676b.hashCode()) * 31) + this.f22677c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f22677c + '}';
    }
}

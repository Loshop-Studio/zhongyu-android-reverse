package p168e.p169q.p176h;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p070b.p113c.p114a.C0787a;

/* renamed from: e.q.h.a */
/* loaded from: classes.dex */
public final class C1072a extends ProxySelector {

    /* renamed from: a */
    public static final C1072a f5642a = new C1072a();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C0787a.m2489w(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}

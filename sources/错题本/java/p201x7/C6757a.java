package p201x7;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.AbstractC5806u;

/* renamed from: x7.a */
/* loaded from: classes4.dex */
public final class C6757a extends ProxySelector {

    /* renamed from: a */
    public static final C6757a f11428a = new C6757a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC5806u.m5286y(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}

package p280v9;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p134i7.AbstractC8807u;

/* renamed from: v9.a */
/* loaded from: classes5.dex */
public final class C10258a extends ProxySelector {

    /* renamed from: a */
    public static final C10258a f20490a = new C10258a();

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return AbstractC8807u.m14755e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}

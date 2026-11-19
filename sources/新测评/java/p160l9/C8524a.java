package p160l9;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: l9.a */
/* loaded from: classes5.dex */
public final class C8524a extends ProxySelector {

    /* renamed from: a */
    public static final C8524a f14155a = new C8524a();

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}

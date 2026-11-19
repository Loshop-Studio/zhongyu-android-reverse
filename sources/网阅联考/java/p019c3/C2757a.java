package p019c3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* renamed from: c3.a */
/* loaded from: classes2.dex */
public final class C2757a extends ProxySelector {

    /* renamed from: a */
    public static final C2757a f521a = new C2757a();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return CollectionsKt__CollectionsJVMKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}

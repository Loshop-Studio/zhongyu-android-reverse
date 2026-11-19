package p366ue;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p325rc.AbstractC10976v;

/* renamed from: ue.a */
/* loaded from: classes6.dex */
public final class C11399a extends ProxySelector {

    /* renamed from: a */
    public static final C11399a f27220a = new C11399a();

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return AbstractC10976v.m24126e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}

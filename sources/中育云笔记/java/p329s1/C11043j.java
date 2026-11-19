package p329s1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: s1.j */
/* loaded from: classes3.dex */
public class C11043j extends ProxySelector {

    /* renamed from: d */
    public static final List f26658d = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: a */
    public final ProxySelector f26659a;

    /* renamed from: b */
    public final String f26660b;

    /* renamed from: c */
    public final int f26661c;

    public C11043j(ProxySelector proxySelector, String str, int i10) {
        this.f26659a = (ProxySelector) AbstractC11045l.m24467d(proxySelector);
        this.f26660b = (String) AbstractC11045l.m24467d(str);
        this.f26661c = i10;
    }

    /* renamed from: a */
    public static void m24455a(String str, int i10) {
        ProxySelector.setDefault(new C11043j(ProxySelector.getDefault(), str, i10));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f26659a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        return (this.f26660b.equals(uri.getHost()) && this.f26661c == uri.getPort()) ? f26658d : this.f26659a.select(uri);
    }
}

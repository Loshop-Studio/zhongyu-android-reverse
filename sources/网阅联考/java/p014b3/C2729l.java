package p014b3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.l */
/* loaded from: classes2.dex */
public final class C2729l implements InterfaceC2730m {

    /* renamed from: a */
    public InterfaceC2730m f490a;

    /* renamed from: b */
    public final a f491b;

    /* renamed from: b3.l$a */
    public interface a {
        /* renamed from: a */
        boolean mo1526a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC2730m mo1527b(SSLSocket sSLSocket);
    }

    public C2729l(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f491b = socketAdapterFactory;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: a */
    public boolean mo1507a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f491b.mo1526a(sslSocket);
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: b */
    public boolean mo1508b() {
        return true;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: c */
    public String mo1509c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        InterfaceC2730m interfaceC2730mM1535e = m1535e(sslSocket);
        if (interfaceC2730mM1535e != null) {
            return interfaceC2730mM1535e.mo1509c(sslSocket);
        }
        return null;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: d */
    public void mo1510d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        InterfaceC2730m interfaceC2730mM1535e = m1535e(sslSocket);
        if (interfaceC2730mM1535e != null) {
            interfaceC2730mM1535e.mo1510d(sslSocket, str, protocols);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC2730m m1535e(SSLSocket sSLSocket) {
        if (this.f490a == null && this.f491b.mo1526a(sSLSocket)) {
            this.f490a = this.f491b.mo1527b(sSLSocket);
        }
        return this.f490a;
    }
}

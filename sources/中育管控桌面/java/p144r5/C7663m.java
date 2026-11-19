package p144r5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r5.m */
/* loaded from: classes4.dex */
public final class C7663m implements InterfaceC7664n {

    /* renamed from: a */
    public final a f10114a;

    /* renamed from: b */
    public InterfaceC7664n f10115b;

    /* renamed from: r5.m$a */
    public interface a {
        /* renamed from: a */
        boolean mo9099a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC7664n mo9100b(SSLSocket sSLSocket);
    }

    public C7663m(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f10114a = socketAdapterFactory;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: a */
    public boolean mo9081a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f10114a.mo9099a(sslSocket);
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: b */
    public String mo9082b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        InterfaceC7664n interfaceC7664nM9110d = m9110d(sslSocket);
        if (interfaceC7664nM9110d != null) {
            return interfaceC7664nM9110d.mo9082b(sslSocket);
        }
        return null;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: c */
    public void mo9083c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        InterfaceC7664n interfaceC7664nM9110d = m9110d(sslSocket);
        if (interfaceC7664nM9110d != null) {
            interfaceC7664nM9110d.mo9083c(sslSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC7664n m9110d(SSLSocket sSLSocket) {
        try {
            if (this.f10115b == null && this.f10114a.mo9099a(sSLSocket)) {
                this.f10115b = this.f10114a.mo9100b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10115b;
    }

    @Override // p144r5.InterfaceC7664n
    public boolean isSupported() {
        return true;
    }
}

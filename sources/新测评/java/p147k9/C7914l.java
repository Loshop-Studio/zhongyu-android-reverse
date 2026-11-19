package p147k9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k9.l */
/* loaded from: classes5.dex */
public final class C7914l implements InterfaceC7915m {

    /* renamed from: a */
    public final a f13801a;

    /* renamed from: b */
    public InterfaceC7915m f13802b;

    /* renamed from: k9.l$a */
    public interface a {
        /* renamed from: a */
        boolean mo13544a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC7915m mo13545b(SSLSocket sSLSocket);
    }

    public C7914l(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f13801a = socketAdapterFactory;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: a */
    public boolean mo13526a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f13801a.mo13544a(sslSocket);
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: b */
    public String mo13527b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        InterfaceC7915m interfaceC7915mM13553d = m13553d(sslSocket);
        if (interfaceC7915mM13553d != null) {
            return interfaceC7915mM13553d.mo13527b(sslSocket);
        }
        return null;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: c */
    public void mo13528c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        InterfaceC7915m interfaceC7915mM13553d = m13553d(sslSocket);
        if (interfaceC7915mM13553d != null) {
            interfaceC7915mM13553d.mo13528c(sslSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC7915m m13553d(SSLSocket sSLSocket) {
        try {
            if (this.f13802b == null && this.f13801a.mo13544a(sSLSocket)) {
                this.f13802b = this.f13801a.mo13545b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13802b;
    }

    @Override // p147k9.InterfaceC7915m
    public boolean isSupported() {
        return true;
    }
}

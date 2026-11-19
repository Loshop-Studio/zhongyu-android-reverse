package p269u9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: u9.m */
/* loaded from: classes5.dex */
public final class C10233m implements InterfaceC10234n {

    /* renamed from: a */
    public final a f20421a;

    /* renamed from: b */
    public InterfaceC10234n f20422b;

    /* renamed from: u9.m$a */
    public interface a {
        /* renamed from: a */
        boolean mo19135a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC10234n mo19136b(SSLSocket sSLSocket);
    }

    public C10233m(a socketAdapterFactory) {
        AbstractC9133u.m16133g(socketAdapterFactory, "socketAdapterFactory");
        this.f20421a = socketAdapterFactory;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: a */
    public boolean mo19117a(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        return this.f20421a.mo19135a(sslSocket);
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: b */
    public String mo19118b(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        InterfaceC10234n interfaceC10234nM19146d = m19146d(sslSocket);
        if (interfaceC10234nM19146d != null) {
            return interfaceC10234nM19146d.mo19118b(sslSocket);
        }
        return null;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: c */
    public void mo19119c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        InterfaceC10234n interfaceC10234nM19146d = m19146d(sslSocket);
        if (interfaceC10234nM19146d != null) {
            interfaceC10234nM19146d.mo19119c(sslSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC10234n m19146d(SSLSocket sSLSocket) {
        try {
            if (this.f20422b == null && this.f20421a.mo19135a(sSLSocket)) {
                this.f20422b = this.f20421a.mo19136b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20422b;
    }

    @Override // p269u9.InterfaceC10234n
    public boolean isSupported() {
        return true;
    }
}

package p351te;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: te.l */
/* loaded from: classes6.dex */
public final class C11289l implements InterfaceC11290m {

    /* renamed from: a */
    public final a f27112a;

    /* renamed from: b */
    public InterfaceC11290m f27113b;

    /* renamed from: te.l$a */
    public interface a {
        /* renamed from: a */
        boolean mo25234a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC11290m mo25235b(SSLSocket sSLSocket);
    }

    public C11289l(a socketAdapterFactory) {
        AbstractC9979u.m20294g(socketAdapterFactory, "socketAdapterFactory");
        this.f27112a = socketAdapterFactory;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: a */
    public boolean mo25216a(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return this.f27112a.mo25234a(sslSocket);
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: b */
    public String mo25217b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        InterfaceC11290m interfaceC11290mM25243d = m25243d(sslSocket);
        if (interfaceC11290mM25243d != null) {
            return interfaceC11290mM25243d.mo25217b(sslSocket);
        }
        return null;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: c */
    public void mo25218c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        InterfaceC11290m interfaceC11290mM25243d = m25243d(sslSocket);
        if (interfaceC11290mM25243d != null) {
            interfaceC11290mM25243d.mo25218c(sslSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC11290m m25243d(SSLSocket sSLSocket) {
        try {
            if (this.f27113b == null && this.f27112a.mo25234a(sSLSocket)) {
                this.f27113b = this.f27112a.mo25235b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27113b;
    }

    @Override // p351te.InterfaceC11290m
    public boolean isSupported() {
        return true;
    }
}

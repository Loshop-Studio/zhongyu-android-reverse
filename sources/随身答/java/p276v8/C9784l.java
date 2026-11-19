package p276v8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.l */
/* loaded from: classes5.dex */
public final class C9784l implements InterfaceC9785m {

    /* renamed from: a */
    public final a f17408a;

    /* renamed from: b */
    public InterfaceC9785m f17409b;

    /* renamed from: v8.l$a */
    public interface a {
        /* renamed from: a */
        boolean mo16577a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC9785m mo16578b(SSLSocket sSLSocket);
    }

    public C9784l(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f17408a = socketAdapterFactory;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: a */
    public boolean mo16559a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f17408a.mo16577a(sslSocket);
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: b */
    public String mo16560b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        InterfaceC9785m interfaceC9785mM16586d = m16586d(sslSocket);
        if (interfaceC9785mM16586d != null) {
            return interfaceC9785mM16586d.mo16560b(sslSocket);
        }
        return null;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: c */
    public void mo16561c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        InterfaceC9785m interfaceC9785mM16586d = m16586d(sslSocket);
        if (interfaceC9785mM16586d != null) {
            interfaceC9785mM16586d.mo16561c(sslSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC9785m m16586d(SSLSocket sSLSocket) {
        try {
            if (this.f17409b == null && this.f17408a.mo16577a(sSLSocket)) {
                this.f17409b = this.f17408a.mo16578b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17409b;
    }

    @Override // p276v8.InterfaceC9785m
    public boolean isSupported() {
        return true;
    }
}

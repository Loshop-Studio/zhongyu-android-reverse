package p269u9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p269u9.C10233m;

/* renamed from: u9.k */
/* loaded from: classes5.dex */
public final class C10231k implements InterfaceC10234n {

    /* renamed from: a */
    public static final b f20415a;

    /* renamed from: b */
    public static final C10233m.a f20416b;

    /* renamed from: c */
    public static final boolean f20417c;

    /* renamed from: u9.k$a */
    public static final class a implements C10233m.a {
        @Override // p269u9.C10233m.a
        /* renamed from: a */
        public boolean mo19135a(SSLSocket sslSocket) {
            AbstractC9133u.m16133g(sslSocket, "sslSocket");
            C10231k.f20415a.m19140b();
            return false;
        }

        @Override // p269u9.C10233m.a
        /* renamed from: b */
        public InterfaceC10234n mo19136b(SSLSocket sslSocket) {
            AbstractC9133u.m16133g(sslSocket, "sslSocket");
            return new C10231k();
        }
    }

    /* renamed from: u9.k$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C10233m.a m19139a() {
            return C10231k.f20416b;
        }

        /* renamed from: b */
        public final boolean m19140b() {
            return C10231k.f20417c;
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f20415a = bVar;
        f20416b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f20417c = z10;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: a */
    public boolean mo19117a(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        return false;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: b */
    public String mo19118b(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || AbstractC9133u.m16128b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: c */
    public void mo19119c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        if (mo19117a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) AbstractC9570c.f19216a.m18109b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p269u9.InterfaceC10234n
    public boolean isSupported() {
        return f20417c;
    }
}

package p269u9;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;

/* renamed from: u9.e */
/* loaded from: classes5.dex */
public final class C10225e implements InterfaceC10234n {

    /* renamed from: a */
    public static final a f20399a = new a(null);

    /* renamed from: u9.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10234n m19120a() {
            if (m19121b()) {
                return new C10225e();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m19121b() {
            return AbstractC9570c.f19216a.m18113f() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: a */
    public boolean mo19117a(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: b */
    public String mo19118b(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!AbstractC9133u.m16128b(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: c */
    public void mo19119c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) AbstractC9570c.f19216a.m18109b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p269u9.InterfaceC10234n
    public boolean isSupported() {
        return f20399a.m19121b();
    }
}

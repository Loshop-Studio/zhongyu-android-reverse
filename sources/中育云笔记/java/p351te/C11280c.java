package p351te;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import se.C11192j;

/* renamed from: te.c */
/* loaded from: classes6.dex */
public final class C11280c implements InterfaceC11290m {

    /* renamed from: a */
    public static final a f27088a = new a(null);

    /* renamed from: te.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC11290m m25219a() {
            if (m25220b()) {
                return new C11280c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m25220b() {
            return C11192j.f26882a.m24900h() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: a */
    public boolean mo25216a(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: b */
    public String mo25217b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC9979u.m20289b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: c */
    public void mo25218c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C11192j.f26882a.m24894b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p351te.InterfaceC11290m
    public boolean isSupported() {
        return f27088a.m25220b();
    }
}

package p144r5;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;

/* renamed from: r5.e */
/* loaded from: classes4.dex */
public final class C7655e implements InterfaceC7664n {

    /* renamed from: a */
    public static final a f10092a = new a(null);

    /* renamed from: r5.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7664n m9084a() {
            if (m9085b()) {
                return new C7655e();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m9085b() {
            return AbstractC7536c.f9994a.m8932f() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: a */
    public boolean mo9081a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: b */
    public String mo9082b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!Intrinsics.areEqual(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: c */
    public void mo9083c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) AbstractC7536c.f9994a.m8928b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }

    @Override // p144r5.InterfaceC7664n
    public boolean isSupported() {
        return f10092a.m9085b();
    }
}

package p147k9;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p136j9.C7828j;

/* renamed from: k9.c */
/* loaded from: classes5.dex */
public final class C7905c implements InterfaceC7915m {

    /* renamed from: a */
    public static final a f13777a = new a(null);

    /* renamed from: k9.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7915m m13529a() {
            if (m13530b()) {
                return new C7905c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13530b() {
            return C7828j.f13560a.m13292h() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: a */
    public boolean mo13526a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: b */
    public String mo13527b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: c */
    public void mo13528c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C7828j.f13560a.m13286b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p147k9.InterfaceC7915m
    public boolean isSupported() {
        return f13777a.m13530b();
    }
}

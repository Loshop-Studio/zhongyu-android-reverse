package p276v8;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p266u8.C9734j;

/* renamed from: v8.c */
/* loaded from: classes5.dex */
public final class C9775c implements InterfaceC9785m {

    /* renamed from: a */
    public static final a f17384a = new a(null);

    /* renamed from: v8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC9785m m16562a() {
            if (m16563b()) {
                return new C9775c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16563b() {
            return C9734j.f17200a.m16272h() && Build.VERSION.SDK_INT >= 29;
        }

        public a() {
        }
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: a */
    public boolean mo16559a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: b */
    public String mo16560b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: c */
    public void mo16561c(SSLSocket sslSocket, String str, List protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C9734j.f17200a.m16266b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // p276v8.InterfaceC9785m
    public boolean isSupported() {
        return f17384a.m16563b();
    }
}

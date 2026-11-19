package p014b3;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p004a3.C0021k;

/* renamed from: b3.c */
/* loaded from: classes2.dex */
public final class C2720c implements InterfaceC2730m {

    /* renamed from: a */
    public static final a f466a = new a(null);

    /* renamed from: b3.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC2730m m1511a() {
            if (m1512b()) {
                return new C2720c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m1512b() {
            return C0021k.f39c.m72h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: a */
    public boolean mo1507a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: b */
    public boolean mo1508b() {
        return f466a.m1512b();
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: c */
    public String mo1509c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: d */
    public void mo1510d(SSLSocket sslSocket, String str, List protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            Object[] array = C0021k.f39c.m66b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sslParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}

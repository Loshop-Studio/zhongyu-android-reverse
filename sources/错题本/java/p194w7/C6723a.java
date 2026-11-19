package p194w7;

import android.net.ssl.SSLSockets;
import android.os.Build;
import io.reactivex.internal.operators.observable.C5707c;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;
import p185v7.C6685n;

/* renamed from: w7.a */
/* loaded from: classes4.dex */
public final class C6723a implements InterfaceC6735m {
    @Override // p194w7.InterfaceC6735m
    /* renamed from: a */
    public final boolean mo6410a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: b */
    public final String mo6411b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: c */
    public final void mo6412c(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        AbstractC5830k.m5330g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C6685n c6685n = C6685n.f11276a;
            sSLParameters.setApplicationProtocols((String[]) C5707c.m5077k(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p194w7.InterfaceC6735m
    public final boolean isSupported() {
        C6685n c6685n = C6685n.f11276a;
        return C5707c.m5079n() && Build.VERSION.SDK_INT >= 29;
    }
}

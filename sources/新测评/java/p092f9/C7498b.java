package p092f9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C8736b;

/* renamed from: f9.b */
/* loaded from: classes5.dex */
public final class C7498b {

    /* renamed from: a */
    public final List f12287a;

    /* renamed from: b */
    public int f12288b;

    /* renamed from: c */
    public boolean f12289c;

    /* renamed from: d */
    public boolean f12290d;

    public C7498b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f12287a = connectionSpecs;
    }

    /* renamed from: a */
    public final C8736b m12127a(SSLSocket sslSocket) throws UnknownServiceException {
        C8736b c8736b;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f12288b;
        int size = this.f12287a.size();
        while (true) {
            if (i10 >= size) {
                c8736b = null;
                break;
            }
            c8736b = (C8736b) this.f12287a.get(i10);
            if (c8736b.m14412e(sslSocket)) {
                this.f12288b = i10 + 1;
                break;
            }
            i10++;
        }
        if (c8736b != null) {
            this.f12289c = m12129c(sslSocket);
            c8736b.m14410c(sslSocket, this.f12290d);
            return c8736b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f12290d);
        sb.append(", modes=");
        sb.append(this.f12287a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean m12128b(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f12290d = true;
        if (!this.f12289c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }

    /* renamed from: c */
    public final boolean m12129c(SSLSocket sSLSocket) {
        int size = this.f12287a.size();
        for (int i10 = this.f12288b; i10 < size; i10++) {
            if (((C8736b) this.f12287a.get(i10)).m14412e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}

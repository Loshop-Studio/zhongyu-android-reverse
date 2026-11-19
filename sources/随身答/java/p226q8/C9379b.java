package p226q8;

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
import okhttp3.C9239b;

/* renamed from: q8.b */
/* loaded from: classes5.dex */
public final class C9379b {

    /* renamed from: a */
    public final List f16295a;

    /* renamed from: b */
    public int f16296b;

    /* renamed from: c */
    public boolean f16297c;

    /* renamed from: d */
    public boolean f16298d;

    public C9379b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f16295a = connectionSpecs;
    }

    /* renamed from: a */
    public final C9239b m15359a(SSLSocket sslSocket) throws UnknownServiceException {
        C9239b c9239b;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i9 = this.f16296b;
        int size = this.f16295a.size();
        while (true) {
            if (i9 >= size) {
                c9239b = null;
                break;
            }
            c9239b = (C9239b) this.f16295a.get(i9);
            if (c9239b.m14846e(sslSocket)) {
                this.f16296b = i9 + 1;
                break;
            }
            i9++;
        }
        if (c9239b != null) {
            this.f16297c = m15361c(sslSocket);
            c9239b.m14844c(sslSocket, this.f16298d);
            return c9239b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f16298d);
        sb.append(", modes=");
        sb.append(this.f16295a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean m15360b(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f16298d = true;
        if (!this.f16297c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }

    /* renamed from: c */
    public final boolean m15361c(SSLSocket sSLSocket) {
        int size = this.f16295a.size();
        for (int i9 = this.f16296b; i9 < size; i9++) {
            if (((C9239b) this.f16295a.get(i9)).m14846e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}

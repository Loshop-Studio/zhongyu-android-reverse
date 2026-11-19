package p281oe;

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
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.C10496b;

/* renamed from: oe.b */
/* loaded from: classes6.dex */
public final class C10484b {

    /* renamed from: a */
    public final List f24868a;

    /* renamed from: b */
    public int f24869b;

    /* renamed from: c */
    public boolean f24870c;

    /* renamed from: d */
    public boolean f24871d;

    public C10484b(List connectionSpecs) {
        AbstractC9979u.m20294g(connectionSpecs, "connectionSpecs");
        this.f24868a = connectionSpecs;
    }

    /* renamed from: a */
    public final C10496b m21853a(SSLSocket sslSocket) throws UnknownServiceException {
        C10496b c10496b;
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        int i10 = this.f24869b;
        int size = this.f24868a.size();
        while (true) {
            if (i10 >= size) {
                c10496b = null;
                break;
            }
            c10496b = (C10496b) this.f24868a.get(i10);
            if (c10496b.m21972e(sslSocket)) {
                this.f24869b = i10 + 1;
                break;
            }
            i10++;
        }
        if (c10496b != null) {
            this.f24870c = m21855c(sslSocket);
            c10496b.m21970c(sslSocket, this.f24871d);
            return c10496b;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f24871d);
        sb2.append(", modes=");
        sb2.append(this.f24868a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC9979u.m20291d(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC9979u.m20293f(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m21854b(IOException e10) {
        AbstractC9979u.m20294g(e10, "e");
        this.f24871d = true;
        if (!this.f24870c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }

    /* renamed from: c */
    public final boolean m21855c(SSLSocket sSLSocket) {
        int size = this.f24868a.size();
        for (int i10 = this.f24869b; i10 < size; i10++) {
            if (((C10496b) this.f24868a.get(i10)).m21972e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}

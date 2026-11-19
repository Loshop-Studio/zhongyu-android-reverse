package p137w2;

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
import p117r2.C4508k;

/* renamed from: w2.b */
/* loaded from: classes2.dex */
public final class C4642b {

    /* renamed from: a */
    public int f5869a;

    /* renamed from: b */
    public boolean f5870b;

    /* renamed from: c */
    public boolean f5871c;

    /* renamed from: d */
    public final List f5872d;

    public C4642b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f5872d = connectionSpecs;
    }

    /* renamed from: a */
    public final C4508k m6470a(SSLSocket sslSocket) throws UnknownServiceException, CloneNotSupportedException {
        C4508k c4508k;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = this.f5869a;
        int size = this.f5872d.size();
        while (true) {
            if (i4 >= size) {
                c4508k = null;
                break;
            }
            c4508k = (C4508k) this.f5872d.get(i4);
            if (c4508k.m5888e(sslSocket)) {
                this.f5869a = i4 + 1;
                break;
            }
            i4++;
        }
        if (c4508k != null) {
            this.f5870b = m6472c(sslSocket);
            c4508k.m5886c(sslSocket, this.f5871c);
            return c4508k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f5871c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f5872d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean m6471b(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f5871c = true;
        return (!this.f5870b || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException) || ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }

    /* renamed from: c */
    public final boolean m6472c(SSLSocket sSLSocket) {
        int size = this.f5872d.size();
        for (int i4 = this.f5869a; i4 < size; i4++) {
            if (((C4508k) this.f5872d.get(i4)).m5888e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}

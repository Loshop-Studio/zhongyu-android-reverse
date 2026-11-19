package p093k5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k5.r */
/* loaded from: classes4.dex */
public abstract class AbstractC6695r {
    /* renamed from: a */
    public static final boolean m7851a(IOException e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
        if ((e6 instanceof ProtocolException) || (e6 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e6 instanceof SSLHandshakeException) && (e6.getCause() instanceof CertificateException)) || (e6 instanceof SSLPeerUnverifiedException) || !(e6 instanceof SSLException)) ? false : true;
    }
}

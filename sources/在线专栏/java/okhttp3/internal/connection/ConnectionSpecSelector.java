package okhttp3.internal.connection;

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
import kotlin.jvm.internal.C2769l;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> connectionSpecs) {
        C2769l.m9241e(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i4 = this.nextModeIndex; i4 < size; i4++) {
            if (this.connectionSpecs.get(i4).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sslSocket) throws IOException, CloneNotSupportedException {
        ConnectionSpec connectionSpec;
        C2769l.m9241e(sslSocket, "sslSocket");
        int i4 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i4 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i4);
            if (connectionSpec.isCompatible(sslSocket)) {
                this.nextModeIndex = i4 + 1;
                break;
            }
            i4++;
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sslSocket);
            connectionSpec.apply$okhttp(sslSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.connectionSpecs);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        C2769l.m9239c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        C2769l.m9240d(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean connectionFailed(@NotNull IOException e4) {
        C2769l.m9241e(e4, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException) || ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }
}

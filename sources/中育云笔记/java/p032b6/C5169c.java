package p032b6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p114d6.AbstractC8993c;
import p114d6.AbstractC8996f;

/* renamed from: b6.c */
/* loaded from: classes5.dex */
public class C5169c extends SSLSocketFactory {

    /* renamed from: a */
    public SSLContext f3012a;

    /* renamed from: b */
    public SSLSocket f3013b = null;

    /* renamed from: c */
    public String[] f3014c;

    /* renamed from: d */
    public X509TrustManager f3015d;

    /* renamed from: e */
    public String[] f3016e;

    /* renamed from: f */
    public String[] f3017f;

    /* renamed from: g */
    public String[] f3018g;

    public C5169c(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws KeyManagementException {
        this.f3012a = null;
        this.f3012a = AbstractC5167a.m2679f();
        m2687b(x509TrustManager);
        this.f3012a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    /* renamed from: a */
    public final void m2686a(Socket socket) {
        boolean zM2678e;
        boolean zM2681h = false;
        if (AbstractC8993c.m17551a(this.f3018g)) {
            zM2678e = false;
        } else {
            AbstractC8996f.m17564e("SSLFNew", "set protocols");
            zM2678e = AbstractC5167a.m2678e((SSLSocket) socket, this.f3018g);
        }
        if (!AbstractC8993c.m17551a(this.f3017f) || !AbstractC8993c.m17551a(this.f3016e)) {
            AbstractC8996f.m17564e("SSLFNew", "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            AbstractC5167a.m2677d(sSLSocket);
            zM2681h = !AbstractC8993c.m17551a(this.f3017f) ? AbstractC5167a.m2681h(sSLSocket, this.f3017f) : AbstractC5167a.m2675b(sSLSocket, this.f3016e);
        }
        if (!zM2678e) {
            AbstractC8996f.m17564e("SSLFNew", "set default protocols");
            AbstractC5167a.m2677d((SSLSocket) socket);
        }
        if (zM2681h) {
            return;
        }
        AbstractC8996f.m17564e("SSLFNew", "set default cipher");
        AbstractC5167a.m2676c((SSLSocket) socket);
    }

    /* renamed from: b */
    public void m2687b(X509TrustManager x509TrustManager) {
        this.f3015d = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        AbstractC8996f.m17564e("SSLFNew", "createSocket: host , port");
        Socket socketCreateSocket = this.f3012a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            m2686a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f3013b = sSLSocket;
            this.f3014c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f3014c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        AbstractC8996f.m17564e("SSLFNew", "createSocket");
        Socket socketCreateSocket = this.f3012a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            m2686a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f3013b = sSLSocket;
            this.f3014c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}

package p118i2;

import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p129j2.AbstractC7788h;

/* renamed from: i2.f */
/* loaded from: classes4.dex */
public class C7658f extends SSLSocketFactory {

    /* renamed from: b */
    public String f12916b;

    /* renamed from: a */
    public Method f12915a = null;

    /* renamed from: c */
    public HostnameVerifier f12917c = HttpsURLConnection.getDefaultHostnameVerifier();

    public C7658f(String str) {
        this.f12916b = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f12916b) || !(obj instanceof C7658f)) {
            return false;
        }
        String str = ((C7658f) obj).f12916b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12916b.equals(str);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z9) throws SSLPeerUnverifiedException {
        AbstractC7788h.m13181g("", "peerHost", this.f12916b, "host", str, "port", Integer.valueOf(i10), "autoClose", Boolean.valueOf(z9));
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        sSLCertificateSocketFactory.setTrustManagers(C7655c.m12710a());
        AbstractC7788h.m13179e("", "createSocket");
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f12916b, i10, true);
        AbstractC7788h.m13179e("", "createSocket end");
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f12916b);
        SSLSession session = sSLSocket.getSession();
        if (this.f12917c.verify(this.f12916b, session)) {
            AbstractC7788h.m13181g("", "SSLSession PeerHost", session.getPeerHost());
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.f12916b);
    }
}

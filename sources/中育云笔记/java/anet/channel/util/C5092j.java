package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.util.j */
/* loaded from: classes3.dex */
public class C5092j extends SSLSocketFactory {

    /* renamed from: a */
    private final String f2768a = "awcn.TlsSniSocketFactory";

    /* renamed from: b */
    private Method f2769b = null;

    /* renamed from: c */
    private String f2770c;

    public C5092j(String str) {
        this.f2770c = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
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
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        if (this.f2770c == null) {
            this.f2770c = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m2530i("awcn.TlsSniSocketFactory", "customized createSocket", null, Constants.KEY_HOST, this.f2770c);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z10) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i10);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f2770c);
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
    }
}

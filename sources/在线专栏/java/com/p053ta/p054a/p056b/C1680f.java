package com.p053ta.p054a.p056b;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import android.text.TextUtils;
import com.p053ta.p054a.p057c.C1688f;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.ta.a.b.f */
/* loaded from: classes.dex */
class C1680f extends SSLSocketFactory {

    /* renamed from: c */
    private String f7439c;

    /* renamed from: a */
    private Method f7438a = null;
    private HostnameVerifier hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();

    public C1680f(String str) {
        this.f7439c = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) throws IOException {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z3) throws IOException {
        SSLSocket sSLSocket;
        C1688f.m5773b("", "peerHost", this.f7439c, Constants.KEY_HOST, str, "port", Integer.valueOf(i4), "autoClose", Boolean.valueOf(z3));
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24) {
            sSLCertificateSocketFactory.setTrustManagers(C1681g.getTrustManagers());
        } else {
            sSLCertificateSocketFactory.setTrustManagers(C1677c.getTrustManagers());
        }
        C1688f.m5770a("", "createSocket");
        if (i5 < 23) {
            InetAddress inetAddress = socket.getInetAddress();
            if (z3) {
                socket.close();
            }
            sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i4);
        } else {
            sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f7439c, i4, true);
        }
        C1688f.m5770a("", "createSocket end");
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f7439c);
        SSLSession session = sSLSocket.getSession();
        if (this.hostnameVerifier.verify(this.f7439c, session)) {
            C1688f.m5773b("", "SSLSession PeerHost", session.getPeerHost());
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.f7439c);
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f7439c) || !(obj instanceof C1680f)) {
            return false;
        }
        String str = ((C1680f) obj).f7439c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f7439c.equals(str);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}

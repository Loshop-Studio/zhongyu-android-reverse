package com.p074ta.p075a.p077b;

import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import com.p074ta.p075a.p078c.C7585f;
import com.taobao.accs.common.Constants;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.ta.a.b.f */
/* loaded from: classes5.dex */
class C7577f extends SSLSocketFactory {

    /* renamed from: c */
    private String f12837c;

    /* renamed from: a */
    private Method f12836a = null;
    private HostnameVerifier hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();

    public C7577f(String str) {
        this.f12837c = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f12837c) || !(obj instanceof C7577f)) {
            return false;
        }
        String str = ((C7577f) obj).f12837c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12837c.equals(str);
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
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws SSLPeerUnverifiedException {
        C7585f.m9799b("", "peerHost", this.f12837c, Constants.KEY_HOST, str, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(i10), "autoClose", Boolean.valueOf(z10));
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        sSLCertificateSocketFactory.setTrustManagers(C7574c.getTrustManagers());
        C7585f.m9796a("", "createSocket");
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f12837c, i10, true);
        C7585f.m9796a("", "createSocket end");
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f12837c);
        SSLSession session = sSLSocket.getSession();
        if (this.hostnameVerifier.verify(this.f12837c, session)) {
            C7585f.m9799b("", "SSLSession PeerHost", session.getPeerHost());
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.f12837c);
    }
}

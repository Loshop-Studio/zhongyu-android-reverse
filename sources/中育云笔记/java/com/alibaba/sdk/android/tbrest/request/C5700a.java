package com.alibaba.sdk.android.tbrest.request;

import android.net.SSLCertificateSocketFactory;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.alibaba.sdk.android.tbrest.request.a */
/* loaded from: classes3.dex */
public class C5700a extends SSLSocketFactory {

    /* renamed from: a */
    private Method f4475a = null;

    /* renamed from: f */
    private String f4476f;

    public C5700a(String str) {
        this.f4476f = str;
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
        if (this.f4476f == null) {
            this.f4476f = str;
        }
        LogUtil.m3869d(Constants.KEY_HOST + this.f4476f + IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT + i10 + "autoClose" + z10);
        InetAddress inetAddress = socket.getInetAddress();
        if (z10) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i10);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f4476f);
        sSLSocket.getSession();
        return sSLSocket;
    }
}

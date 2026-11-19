package org.android.spdy;

/* loaded from: classes.dex */
public interface SessionCb {
    void bioPingRecvCallback(SpdySession spdySession, int i4);

    byte[] getSSLMeta(SpdySession spdySession);

    int putSSLMeta(SpdySession spdySession, byte[] bArr);

    void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i4, int i5);

    void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i4, int i5, int i6, int i7, byte[] bArr);

    void spdyPingRecvCallback(SpdySession spdySession, long j4, Object obj);

    void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i4);

    void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo);

    void spdySessionFailedError(SpdySession spdySession, int i4, Object obj);
}

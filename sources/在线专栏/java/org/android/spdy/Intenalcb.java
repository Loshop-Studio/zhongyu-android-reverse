package org.android.spdy;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface Intenalcb {
    void bioPingRecvCallback(SpdySession spdySession, int i4);

    byte[] getSSLMeta(SpdySession spdySession);

    int putSSLMeta(SpdySession spdySession, byte[] bArr);

    void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i4, int i5);

    void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i4, int i5, int i6, int i7, byte[] bArr);

    void spdyDataChunkRecvCB(SpdySession spdySession, boolean z3, long j4, SpdyByteArray spdyByteArray, int i4);

    void spdyDataRecvCallback(SpdySession spdySession, boolean z3, long j4, int i4, int i5);

    void spdyDataSendCallback(SpdySession spdySession, boolean z3, long j4, int i4, int i5);

    void spdyOnStreamResponse(SpdySession spdySession, long j4, Map<String, List<String>> map, int i4);

    void spdyPingRecvCallback(SpdySession spdySession, long j4, Object obj);

    void spdyRequestRecvCallback(SpdySession spdySession, long j4, int i4);

    void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i4);

    void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo);

    void spdySessionFailedError(SpdySession spdySession, int i4, Object obj);

    void spdySessionOnWritable(SpdySession spdySession, Object obj, int i4);

    void spdyStreamCloseCallback(SpdySession spdySession, long j4, int i4, int i5, SuperviseData superviseData);
}

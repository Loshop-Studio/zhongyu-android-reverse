package org.android.spdy;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface Spdycb {
    void spdyDataChunkRecvCB(SpdySession spdySession, boolean z3, long j4, SpdyByteArray spdyByteArray, Object obj);

    void spdyDataRecvCallback(SpdySession spdySession, boolean z3, long j4, int i4, Object obj);

    void spdyDataSendCallback(SpdySession spdySession, boolean z3, long j4, int i4, Object obj);

    void spdyOnStreamResponse(SpdySession spdySession, long j4, Map<String, List<String>> map, Object obj);

    void spdyRequestRecvCallback(SpdySession spdySession, long j4, Object obj);

    void spdyStreamCloseCallback(SpdySession spdySession, long j4, int i4, Object obj, SuperviseData superviseData);
}

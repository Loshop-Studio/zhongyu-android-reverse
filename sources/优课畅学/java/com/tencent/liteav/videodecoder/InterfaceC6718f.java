package com.tencent.liteav.videodecoder;

import com.tencent.liteav.basic.structs.TXSVideoFrame;

/* renamed from: com.tencent.liteav.videodecoder.f */
/* loaded from: classes4.dex */
public interface InterfaceC6718f {
    void onDecodeFailed(int i10);

    void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i10, int i11, long j10, long j11, int i12);

    void onVideoSizeChange(int i10, int i11);
}

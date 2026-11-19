package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videodecoder.b */
/* loaded from: classes4.dex */
public interface InterfaceC6714b {
    int GetDecodeCost();

    int config(Surface surface);

    void decode(TXSNALPacket tXSNALPacket);

    void enableLimitDecCache(boolean z10);

    boolean isHevc();

    void setListener(InterfaceC6718f interfaceC6718f);

    void setNotifyListener(WeakReference<InterfaceC6559b> weakReference);

    int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, boolean z11);

    void stop();
}

package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class TXCVideoFfmpegDecoder implements InterfaceC6714b {
    private boolean mFirstDec;
    private InterfaceC6718f mListener;
    private long mNativeDecoder;
    private long mNativeNotify;
    private ByteBuffer mPps;
    private byte[] mRawData;
    private ByteBuffer mSps;
    private int mVideoHeight;
    private int mVideoWidth;

    static {
        C6592e.m5058f();
        nativeClassInit();
    }

    private static native void nativeClassInit();

    private native boolean nativeDecode(byte[] bArr, long j10, long j11, long j12);

    private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> weakReference, boolean z10);

    private native void nativeLoadRawData(byte[] bArr, long j10, int i10);

    private native void nativeRelease();

    private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> weakReference, long j10, int i10, int i11, long j11, long j12, int i12) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int GetDecodeCost() {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int config(Surface surface) {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void decode(TXSNALPacket tXSNALPacket) {
        if (this.mFirstDec) {
            ByteBuffer byteBuffer = this.mSps;
            if (byteBuffer != null && this.mPps != null) {
                byte[] bArrArray = byteBuffer.array();
                byte[] bArrArray2 = this.mPps.array();
                byte[] bArr = new byte[bArrArray.length + bArrArray2.length];
                System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                System.arraycopy(bArrArray2, 0, bArr, bArrArray.length, bArrArray2.length);
                nativeDecode(bArr, tXSNALPacket.pts - 1, tXSNALPacket.dts - 1, tXSNALPacket.rotation);
            }
            this.mFirstDec = false;
        }
        nativeDecode(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void enableLimitDecCache(boolean z10) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public boolean isHevc() {
        return false;
    }

    public void loadNativeData(byte[] bArr, long j10, int i10) {
        nativeLoadRawData(bArr, j10, i10);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void setListener(InterfaceC6718f interfaceC6718f) {
        this.mListener = interfaceC6718f;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void setNotifyListener(WeakReference<InterfaceC6559b> weakReference) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, boolean z11) {
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mFirstDec = true;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        nativeInit(new WeakReference<>(this), z10);
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void stop() {
        nativeRelease();
    }

    public void config(JSONArray jSONArray) {
    }
}

package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.beauty.p050a.C6599a;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class TXCSWVideoEncoder extends C6722b {
    private static final boolean DEBUG = false;
    private static final String TAG = "TXCSWVideoEncoder";
    private C6565f mRawFrameFilter;
    private C6565f mResizeFilter;
    private long mNativeEncoder = 0;
    private int mBitrate = 0;
    private long mPTS = 0;
    private int mPushIdx = 0;
    private int mRendIdx = 0;
    private int mPopIdx = 0;

    static {
        C6592e.m5058f();
        nativeClassInit();
    }

    public static long getAndIncreaseGopIndex() {
        return nativeGetAndIncreaseGopIndex();
    }

    public static long getAndIncreateSeq() {
        return nativeGetAndIncreaseSeq();
    }

    private static native void nativeClassInit();

    private native void nativeEnableNearestRPS(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncode(long j10, int i10, int i11, int i12, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncodeSync(long j10, int i10, int i11, int i12, long j11);

    private static native long nativeGetAndIncreaseGopIndex();

    private static native long nativeGetAndIncreaseSeq();

    private native long nativeGetRealFPS(long j10);

    private native long nativeInit(WeakReference<TXCSWVideoEncoder> weakReference);

    private native void nativeRelease(long j10);

    private native void nativeRestartIDR(long j10);

    private native void nativeSetBitrate(long j10, int i10);

    private native void nativeSetBitrateFromQos(long j10, int i10, int i11);

    private native void nativeSetEncodeIdrFpsFromQos(long j10, int i10);

    private native void nativeSetFPS(long j10, int i10);

    private native void nativeSetID(long j10, String str);

    private native void nativeSetRPSRefBitmap(long j10, int i10, int i11, long j11);

    private native void nativeSignalEOSAndFlush(long j10);

    private native int nativeStart(long j10, TXSVideoEncoderParam tXSVideoEncoderParam);

    private native void nativeStop(long j10);

    private native long nativegetRealBitrate(long j10);

    private static void onEncodeFinishedFromNative(WeakReference<TXCSWVideoEncoder> weakReference, int i10, long j10, long j11) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.onEncodeFinished(i10, j10, j11);
        }
    }

    private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> weakReference, byte[] bArr, int i10, long j10, long j11, long j12, long j13, long j14, long j15, int i11) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.callDelegate(bArr, i10, j10, j11, j12, j13, j14, j15, i11, null, null);
        }
    }

    private long pushVideoFrameInternal(int i10, int i11, int i12, long j10, final boolean z10) {
        C6565f c6565f = this.mResizeFilter;
        C6565f c6599a = this.mRawFrameFilter;
        if (this.mGLContextExternal == null) {
            return 0L;
        }
        this.mInputWidth = i11;
        this.mInputHeight = i12;
        if (c6565f == null) {
            c6565f = new C6565f();
            this.mResizeFilter = c6565f;
            c6565f.mo4842a();
            c6565f.m4840a(true);
        }
        C6565f c6565f2 = c6565f;
        c6565f2.mo4835a(this.mOutputWidth, this.mOutputHeight);
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        int i13 = (720 - this.mRotation) % 360;
        c6565f2.m4836a(i11, i12, i13, null, ((i13 == 90 || i13 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i13 == 90 || i13 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, false);
        c6565f2.m4843b(i10);
        final int iM4855l = c6565f2.m4855l();
        int[] iArr = new int[1];
        this.mPTS = j10;
        if (c6599a == null) {
            String str = TAG;
            TXCLog.m4994i(str, "pushVideoFrameInternal->create mRawFrameFilter");
            c6599a = new C6599a(1);
            this.mRawFrameFilter = c6599a;
            c6599a.m4840a(true);
            if (!c6599a.mo4842a()) {
                TXCLog.m4994i(str, "pushVideoFrameInternal->destroy mRawFrameFilter, init failed!");
                this.mRawFrameFilter = null;
                return 10000004L;
            }
            c6599a.mo4835a(this.mOutputWidth, this.mOutputHeight);
            c6599a.m4838a(new C6565f.a() { // from class: com.tencent.liteav.videoencoder.TXCSWVideoEncoder.1
                @Override // com.tencent.liteav.basic.p048c.C6565f.a
                /* renamed from: a */
                public void mo4699a(int i14) {
                    synchronized (TXCSWVideoEncoder.this) {
                        try {
                            TXCSWVideoEncoder tXCSWVideoEncoder = TXCSWVideoEncoder.this;
                            InterfaceC6723c interfaceC6723c = tXCSWVideoEncoder.mListener;
                            if (interfaceC6723c != null) {
                                interfaceC6723c.mo4720b(tXCSWVideoEncoder.mStreamType);
                            }
                            if (z10) {
                                TXCSWVideoEncoder tXCSWVideoEncoder2 = TXCSWVideoEncoder.this;
                                long j11 = tXCSWVideoEncoder2.mNativeEncoder;
                                int i15 = iM4855l;
                                TXCSWVideoEncoder tXCSWVideoEncoder3 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder2.nativeEncodeSync(j11, i15, tXCSWVideoEncoder3.mOutputWidth, tXCSWVideoEncoder3.mOutputHeight, tXCSWVideoEncoder3.mPTS);
                            } else {
                                TXCSWVideoEncoder tXCSWVideoEncoder4 = TXCSWVideoEncoder.this;
                                long j12 = tXCSWVideoEncoder4.mNativeEncoder;
                                int i16 = iM4855l;
                                TXCSWVideoEncoder tXCSWVideoEncoder5 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder4.nativeEncode(j12, i16, tXCSWVideoEncoder5.mOutputWidth, tXCSWVideoEncoder5.mOutputHeight, tXCSWVideoEncoder5.mPTS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        c6599a.m4843b(iM4855l);
        int i14 = iArr[0];
        if (i14 == 0) {
            return 0L;
        }
        callDelegate(i14);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void enableNearestRPS(int i10) {
        synchronized (this) {
            nativeEnableNearestRPS(this.mNativeEncoder, i10);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long getRealBitrate() {
        long jNativegetRealBitrate;
        synchronized (this) {
            jNativegetRealBitrate = nativegetRealBitrate(this.mNativeEncoder);
        }
        return jNativegetRealBitrate;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public double getRealFPS() {
        double dNativeGetRealFPS;
        synchronized (this) {
            dNativeGetRealFPS = nativeGetRealFPS(this.mNativeEncoder);
        }
        return dNativeGetRealFPS;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrame(int i10, int i11, int i12, long j10) {
        return pushVideoFrameInternal(i10, i11, i12, j10, false);
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrameAsync(int i10, int i11, int i12, long j10) {
        return pushVideoFrameInternal(i10, i11, i12, j10, true);
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrameSync(int i10, int i11, int i12, long j10) {
        return pushVideoFrameInternal(i10, i11, i12, j10, true);
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void restartIDR() {
        synchronized (this) {
            nativeRestartIDR(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setBitrate(int i10) {
        this.mBitrate = i10;
        synchronized (this) {
            nativeSetBitrate(this.mNativeEncoder, i10);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setBitrateFromQos(int i10, int i11) {
        this.mBitrate = i10;
        synchronized (this) {
            nativeSetBitrateFromQos(this.mNativeEncoder, i10, i11);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setEncodeIdrFpsFromQos(int i10) {
        synchronized (this) {
            nativeSetEncodeIdrFpsFromQos(this.mNativeEncoder, i10);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setFPS(int i10) {
        synchronized (this) {
            nativeSetFPS(this.mNativeEncoder, i10);
        }
    }

    @Override // com.tencent.liteav.basic.module.C6584a
    public void setID(String str) {
        super.setID(str);
        synchronized (this) {
            nativeSetID(this.mNativeEncoder, str);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setRPSRefBitmap(int i10, int i11, long j10) throws Throwable {
        synchronized (this) {
            try {
                try {
                    nativeSetRPSRefBitmap(this.mNativeEncoder, i10, i11, j10);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void signalEOSAndFlush() {
        synchronized (this) {
            nativeSignalEOSAndFlush(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        int i10 = tXSVideoEncoderParam.width;
        int i11 = ((i10 + 7) / 8) * 8;
        int i12 = tXSVideoEncoderParam.height;
        int i13 = ((i12 + 1) / 2) * 2;
        if (i11 != i10 || i13 != i12) {
            String str = TAG;
            TXCLog.m4998w(str, "Encode Resolution not supportted, transforming...");
            TXCLog.m4998w(str, tXSVideoEncoderParam.width + "x" + tXSVideoEncoderParam.height + "-> " + i11 + "x" + i13);
        }
        tXSVideoEncoderParam.width = i11;
        tXSVideoEncoderParam.height = i13;
        this.mOutputWidth = i11;
        this.mOutputHeight = i13;
        this.mInputWidth = i11;
        this.mInputHeight = i13;
        this.mRawFrameFilter = null;
        this.mResizeFilter = null;
        synchronized (this) {
            long jNativeInit = nativeInit(new WeakReference<>(this));
            this.mNativeEncoder = jNativeInit;
            nativeSetBitrate(jNativeInit, this.mBitrate);
            nativeSetID(this.mNativeEncoder, getID());
            nativeStart(this.mNativeEncoder, tXSVideoEncoderParam);
        }
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void stop() {
        long j10;
        TXCLog.m4994i(TAG, "stop->enter with mRawFrameFilter:" + this.mRawFrameFilter);
        this.mGLContextExternal = null;
        synchronized (this) {
            j10 = this.mNativeEncoder;
            this.mNativeEncoder = 0L;
        }
        nativeStop(j10);
        nativeRelease(j10);
        C6565f c6565f = this.mRawFrameFilter;
        if (c6565f != null) {
            c6565f.m4847d();
            this.mRawFrameFilter = null;
        }
        C6565f c6565f2 = this.mResizeFilter;
        if (c6565f2 != null) {
            c6565f2.m4847d();
            this.mResizeFilter = null;
        }
        super.stop();
    }
}

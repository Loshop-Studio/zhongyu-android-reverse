package com.tencent.liteav.videoencoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.AudioStats;
import com.tencent.liteav.basic.module.C6584a;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* renamed from: com.tencent.liteav.videoencoder.b */
/* loaded from: classes4.dex */
public class C6722b extends C6584a {
    protected C6565f mEncodeFilter;
    protected boolean mInit;
    protected C6565f mInputFilter;
    protected InterfaceC6723c mListener = null;
    protected int mInputWidth = 0;
    protected int mInputHeight = 0;
    protected int mOutputWidth = 0;
    protected int mOutputHeight = 0;
    protected int mInputTextureID = -1;
    protected Object mGLContextExternal = null;
    private long mVideoGOPEncode = 0;
    private boolean mEncodeFirstGOP = false;
    protected int mStreamType = 2;
    protected int mRotation = 0;
    protected JSONArray mEncFmt = null;
    protected boolean mEnableXMirror = false;

    public void callDelegate(int i10) {
        callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, i10, null, null);
    }

    public void enableNearestRPS(int i10) {
    }

    public int getEncodeCost() {
        return 0;
    }

    public long getRealBitrate() {
        return 0L;
    }

    public double getRealFPS() {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public int getVideoHeight() {
        return this.mOutputHeight;
    }

    public int getVideoWidth() {
        return this.mOutputWidth;
    }

    public void onEncodeFinished(int i10, long j10, long j11) {
        InterfaceC6723c interfaceC6723c = this.mListener;
        if (interfaceC6723c != null) {
            interfaceC6723c.mo4711a(i10, j10, j11);
        }
    }

    public long pushVideoFrame(int i10, int i11, int i12, long j10) {
        return 10000002L;
    }

    public long pushVideoFrameAsync(int i10, int i11, int i12, long j10) {
        return 10000002L;
    }

    public long pushVideoFrameSync(int i10, int i11, int i12, long j10) {
        return 10000002L;
    }

    public void restartIDR() {
    }

    public void setBitrate(int i10) {
    }

    public void setBitrateFromQos(int i10, int i11) {
    }

    public void setEncodeIdrFpsFromQos(int i10) {
    }

    public void setFPS(int i10) {
    }

    public void setListener(InterfaceC6723c interfaceC6723c) {
        this.mListener = interfaceC6723c;
    }

    public void setRPSRefBitmap(int i10, int i11, long j10) {
    }

    public void setRotation(int i10) {
        this.mRotation = i10;
    }

    public void setXMirror(boolean z10) {
        this.mEnableXMirror = z10;
    }

    public void signalEOSAndFlush() {
    }

    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        if (tXSVideoEncoderParam != null) {
            int i10 = tXSVideoEncoderParam.width;
            this.mOutputWidth = i10;
            int i11 = tXSVideoEncoderParam.height;
            this.mOutputHeight = i11;
            this.mInputWidth = i10;
            this.mInputHeight = i11;
            this.mGLContextExternal = tXSVideoEncoderParam.glContext;
            this.mStreamType = tXSVideoEncoderParam.streamType;
            this.mEncFmt = tXSVideoEncoderParam.encFmt;
        }
        this.mVideoGOPEncode = 0L;
        this.mEncodeFirstGOP = false;
        return 10000002;
    }

    public void stop() {
    }

    public void callDelegate(byte[] bArr, int i10, long j10, long j11, long j12, long j13, long j14, long j15, int i11, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer == null ? null : byteBuffer.asReadOnlyBuffer();
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo != null ? new MediaCodec.BufferInfo() : null;
        if (bufferInfo2 != null) {
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        }
        InterfaceC6723c interfaceC6723c = this.mListener;
        if (interfaceC6723c != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i10;
            tXSNALPacket.gopIndex = j10;
            tXSNALPacket.gopFrameIndex = j11;
            tXSNALPacket.frameIndex = j12;
            tXSNALPacket.refFremeIndex = j13;
            tXSNALPacket.pts = j14;
            tXSNALPacket.dts = j15;
            tXSNALPacket.buffer = byteBufferAsReadOnlyBuffer;
            tXSNALPacket.streamType = this.mStreamType;
            if (bufferInfo2 != null) {
                tXSNALPacket.info = bufferInfo2;
            }
            interfaceC6723c.mo4716a(tXSNALPacket, i11);
            if (i10 == 0) {
                long j16 = this.mVideoGOPEncode;
                if (j16 != 0) {
                    this.mEncodeFirstGOP = true;
                    setStatusValue(4006, Long.valueOf(j16));
                }
                this.mVideoGOPEncode = 1L;
                return;
            }
            long j17 = this.mVideoGOPEncode + 1;
            this.mVideoGOPEncode = j17;
            if (this.mEncodeFirstGOP) {
                return;
            }
            setStatusValue(4006, Long.valueOf(j17));
        }
    }

    public void callDelegate(MediaFormat mediaFormat) {
        InterfaceC6723c interfaceC6723c = this.mListener;
        if (interfaceC6723c != null) {
            interfaceC6723c.mo4713a(mediaFormat);
        }
    }
}

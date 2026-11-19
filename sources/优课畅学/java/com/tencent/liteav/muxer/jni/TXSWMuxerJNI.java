package com.tencent.liteav.muxer.jni;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class TXSWMuxerJNI {

    /* renamed from: a */
    private long f5725a;

    /* renamed from: b */
    private volatile boolean f5726b = true;

    /* renamed from: c */
    private volatile boolean f5727c;

    public static class AVOptions {
        public int videoWidth = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int videoHeight = 540;
        public int videoGOP = 12;
        public int audioSampleRate = 0;
        public int audioChannels = 0;
    }

    public TXSWMuxerJNI() {
        this.f5725a = -1L;
        this.f5725a = init();
    }

    private native long init();

    private native void release(long j10);

    private native void setAVParams(long j10, AVOptions aVOptions);

    private native void setAudioCSD(long j10, byte[] bArr);

    private native void setDstPath(long j10, String str);

    private native void setVideoCSD(long j10, byte[] bArr, byte[] bArr2);

    private native int start(long j10);

    private native int stop(long j10);

    private native int writeFrame(long j10, byte[] bArr, int i10, int i11, int i12, int i13, long j11);

    /* renamed from: a */
    public void m5227a(AVOptions aVOptions) {
        if (this.f5726b) {
            setAVParams(this.f5725a, aVOptions);
        } else {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* renamed from: b */
    public int m5231b() {
        if (!this.f5726b) {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f5727c) {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        this.f5727c = false;
        int iStop = stop(this.f5725a);
        if (iStop != 0) {
            TXCLog.m4991e("TXSWMuxerJNI", "Stop Muxer Error!!!");
        }
        return iStop;
    }

    /* renamed from: c */
    public void m5232c() {
        if (!this.f5726b) {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return;
        }
        release(this.f5725a);
        this.f5726b = false;
        this.f5727c = false;
    }

    /* renamed from: a */
    public void m5228a(String str) {
        if (this.f5726b) {
            setDstPath(this.f5725a, str);
        } else {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* renamed from: a */
    public void m5230a(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11) {
        if (this.f5726b) {
            setVideoCSD(this.f5725a, m5224b(byteBuffer, i10), m5224b(byteBuffer2, i11));
        } else {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* renamed from: b */
    private byte[] m5224b(ByteBuffer byteBuffer, int i10) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: a */
    public void m5229a(ByteBuffer byteBuffer, int i10) {
        if (this.f5726b) {
            setAudioCSD(this.f5725a, m5224b(byteBuffer, i10));
        } else {
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* renamed from: a */
    public int m5226a(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10) {
        if (this.f5726b) {
            if (this.f5727c) {
                int iWriteFrame = writeFrame(this.f5725a, m5224b(byteBuffer, i12), i10, i11, i12, i13, j10);
                if (iWriteFrame != 0) {
                    TXCLog.m4991e("TXSWMuxerJNI", "Muxer write frame error!");
                }
                return iWriteFrame;
            }
            TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }

    /* renamed from: a */
    public int m5225a() {
        if (this.f5726b) {
            int iStart = start(this.f5725a);
            if (iStart == 0) {
                this.f5727c = true;
                return iStart;
            }
            TXCLog.m4991e("TXSWMuxerJNI", "Start Muxer Error!!!");
            return iStart;
        }
        TXCLog.m4991e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }
}

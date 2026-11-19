package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.muxer.jni.TXSWMuxerJNI;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(18)
/* renamed from: com.tencent.liteav.muxer.d */
/* loaded from: classes4.dex */
public class C6613d implements InterfaceC6610a {

    /* renamed from: a */
    public static float f5705a = 0.5f;

    /* renamed from: b */
    public static float f5706b = 0.8f;

    /* renamed from: c */
    public static float f5707c = 1.25f;

    /* renamed from: d */
    public static float f5708d = 2.0f;

    /* renamed from: f */
    private TXSWMuxerJNI f5710f;

    /* renamed from: e */
    private int f5709e = 2;

    /* renamed from: g */
    private String f5711g = null;

    /* renamed from: h */
    private MediaFormat f5712h = null;

    /* renamed from: i */
    private MediaFormat f5713i = null;

    /* renamed from: j */
    private int f5714j = 0;

    /* renamed from: k */
    private int f5715k = 0;

    /* renamed from: l */
    private boolean f5716l = false;

    /* renamed from: m */
    private boolean f5717m = false;

    /* renamed from: n */
    private ConcurrentLinkedQueue<a> f5718n = new ConcurrentLinkedQueue<>();

    /* renamed from: o */
    private ConcurrentLinkedQueue<a> f5719o = new ConcurrentLinkedQueue<>();

    /* renamed from: p */
    private long f5720p = -1;

    /* renamed from: q */
    private long f5721q = -1;

    /* renamed from: r */
    private long f5722r = -1;

    /* renamed from: com.tencent.liteav.muxer.d$a */
    public static class a {

        /* renamed from: a */
        ByteBuffer f5723a;

        /* renamed from: b */
        MediaCodec.BufferInfo f5724b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f5723a = byteBuffer;
            this.f5724b = bufferInfo;
        }

        /* renamed from: a */
        public ByteBuffer m5222a() {
            return this.f5723a;
        }

        /* renamed from: b */
        public MediaCodec.BufferInfo m5223b() {
            return this.f5724b;
        }
    }

    /* renamed from: d */
    private ByteBuffer m5213d() {
        ByteBuffer byteBuffer = this.f5713i.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return byteBuffer;
    }

    /* renamed from: e */
    private ByteBuffer m5215e() {
        return this.f5712h.getByteBuffer("csd-0");
    }

    /* renamed from: f */
    private ByteBuffer m5216f() {
        return this.f5712h.getByteBuffer("csd-1");
    }

    /* renamed from: g */
    private long m5217g() {
        a aVarPeek;
        long j10 = this.f5718n.size() > 0 ? this.f5718n.peek().m5223b().presentationTimeUs : 0L;
        if (this.f5719o.size() > 0 && (aVarPeek = this.f5719o.peek()) != null && aVarPeek.m5223b() != null) {
            long j11 = this.f5719o.peek().m5223b().presentationTimeUs;
            if (j10 > j11) {
                return j11;
            }
        }
        return j10;
    }

    /* renamed from: h */
    private void m5218h() {
        while (this.f5718n.size() > 0) {
            a aVarPoll = this.f5718n.poll();
            m5212c(aVarPoll.m5222a(), aVarPoll.m5223b());
        }
        while (this.f5719o.size() > 0) {
            a aVarPoll2 = this.f5719o.poll();
            m5214d(aVarPoll2.m5222a(), aVarPoll2.m5223b());
        }
    }

    /* renamed from: i */
    private void m5219i() {
        while (this.f5718n.size() > 0) {
            a aVarPoll = this.f5718n.poll();
            m5210a(aVarPoll.m5223b().presentationTimeUs);
            m5212c(aVarPoll.m5222a(), aVarPoll.m5223b());
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized void mo5193a(MediaFormat mediaFormat) {
        TXCLog.m4989d("TXCMP4SWMuxer", "addVideoTrack:" + mediaFormat);
        this.f5712h = mediaFormat;
        this.f5718n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public synchronized void mo5197b(MediaFormat mediaFormat) {
        TXCLog.m4989d("TXCMP4SWMuxer", "addAudioTrack:" + mediaFormat);
        this.f5713i = mediaFormat;
        this.f5719o.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: c */
    public synchronized boolean mo5199c() {
        return this.f5712h != null;
    }

    /* renamed from: d */
    private void m5214d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f10;
        float f11;
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = this.f5720p;
        long j12 = j10 - j11;
        if (j11 >= 0 && j12 >= 0) {
            if (j12 < this.f5722r) {
                TXCLog.m4991e("TXCMP4SWMuxer", "audio is not in chronological order. current audio's pts pts(" + j12 + ") must larger than pre audio's pts(" + this.f5722r + ")");
                j12 = this.f5722r + 1;
            } else {
                this.f5722r = j12;
            }
            int i10 = this.f5709e;
            if (i10 != 2) {
                if (i10 == 3) {
                    f10 = j12;
                    f11 = f5706b;
                } else if (i10 == 4) {
                    f10 = j12;
                    f11 = f5705a;
                } else if (i10 == 1) {
                    f10 = j12;
                    f11 = f5707c;
                } else if (i10 == 0) {
                    f10 = j12;
                    f11 = f5708d;
                }
                j12 = (long) (f10 * f11);
            }
            bufferInfo.presentationTimeUs = j12;
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f5710f.m5226a(byteBuffer, 0, bufferInfo.offset, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
                return;
            } catch (IllegalArgumentException e10) {
                TXCLog.m4991e("TXCMP4SWMuxer", "write sample IllegalArgumentException: " + e10);
                return;
            } catch (IllegalStateException e11) {
                TXCLog.m4991e("TXCMP4SWMuxer", "write sample IllegalStateException: " + e11);
                return;
            }
        }
        TXCLog.m4998w("TXCMP4SWMuxer", "drop sample. first frame offset timeus = " + this.f5720p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
    }

    /* renamed from: c */
    private void m5212c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f10;
        float f11;
        long j10 = bufferInfo.presentationTimeUs - this.f5720p;
        if (j10 < 0) {
            TXCLog.m4991e("TXCMP4SWMuxer", "pts error! first frame offset timeus = " + this.f5720p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j10 = this.f5721q;
            if (j10 <= 0) {
                j10 = 0;
            }
        }
        if (j10 < this.f5721q) {
            TXCLog.m4998w("TXCMP4SWMuxer", "video is not in chronological order. current frame's pts(" + j10 + ") smaller than pre frame's pts(" + this.f5721q + ")");
        } else {
            this.f5721q = j10;
        }
        int i10 = this.f5709e;
        if (i10 != 2) {
            if (i10 == 3) {
                f10 = j10;
                f11 = f5706b;
            } else if (i10 == 4) {
                f10 = j10;
                f11 = f5705a;
            } else if (i10 == 1) {
                f10 = j10;
                f11 = f5707c;
            } else if (i10 == 0) {
                f10 = j10;
                f11 = f5708d;
            }
            j10 = (long) (f10 * f11);
        }
        bufferInfo.presentationTimeUs = j10;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f5710f.m5226a(byteBuffer, 1, bufferInfo.offset, bufferInfo.size, bufferInfo.flags == 1 ? 1 : 0, bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 1) != 0) {
                this.f5717m = true;
            }
        } catch (IllegalArgumentException e10) {
            TXCLog.m4991e("TXCMP4SWMuxer", "write frame IllegalArgumentException: " + e10);
        } catch (IllegalStateException e11) {
            TXCLog.m4991e("TXCMP4SWMuxer", "write frame IllegalStateException: " + e11);
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized int mo5192a() {
        String str = this.f5711g;
        if (str != null && !str.isEmpty()) {
            if (!mo5199c()) {
                TXCLog.m4991e("TXCMP4SWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f5710f != null) {
                TXCLog.m4998w("TXCMP4SWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.m4989d("TXCMP4SWMuxer", "start");
            this.f5710f = new TXSWMuxerJNI();
            TXSWMuxerJNI.AVOptions aVOptions = new TXSWMuxerJNI.AVOptions();
            MediaFormat mediaFormat = this.f5712h;
            if (mediaFormat != null) {
                int integer = mediaFormat.getInteger("width");
                aVOptions.videoHeight = this.f5712h.getInteger("height");
                aVOptions.videoWidth = integer;
                aVOptions.videoGOP = this.f5712h.containsKey("i-frame-interval") ? this.f5712h.getInteger("i-frame-interval") : 3;
            }
            MediaFormat mediaFormat2 = this.f5713i;
            if (mediaFormat2 != null) {
                int integer2 = mediaFormat2.getInteger("channel-count");
                int integer3 = this.f5713i.getInteger("sample-rate");
                aVOptions.audioChannels = integer2;
                aVOptions.audioSampleRate = integer3;
            }
            ByteBuffer byteBufferM5215e = m5215e();
            ByteBuffer byteBufferM5216f = m5216f();
            ByteBuffer byteBufferM5213d = this.f5713i != null ? m5213d() : null;
            if (byteBufferM5215e != null && byteBufferM5216f != null) {
                if (this.f5713i != null && byteBufferM5213d == null) {
                    TXCLog.m4991e("TXCMP4SWMuxer", "audio format contains error csd!");
                    return -3;
                }
                this.f5710f.m5230a(byteBufferM5215e, byteBufferM5215e.capacity(), byteBufferM5216f, byteBufferM5216f.capacity());
                if (this.f5713i != null) {
                    this.f5710f.m5229a(byteBufferM5213d, byteBufferM5213d.capacity());
                }
                this.f5710f.m5227a(aVOptions);
                this.f5710f.m5228a(this.f5711g);
                this.f5710f.m5225a();
                this.f5720p = -1L;
                this.f5716l = true;
                this.f5717m = false;
                this.f5721q = -1L;
                this.f5722r = -1L;
                return 0;
            }
            TXCLog.m4991e("TXCMP4SWMuxer", "video format contains error csd!");
            return -3;
        }
        TXCLog.m4991e("TXCMP4SWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public synchronized int mo5196b() {
        if (this.f5710f != null) {
            m5218h();
            TXCLog.m4989d("TXCMP4SWMuxer", "stop. start flag = " + this.f5716l + ", video key frame set = " + this.f5717m);
            try {
                try {
                    if (this.f5716l && this.f5717m) {
                        this.f5710f.m5231b();
                    }
                    this.f5710f.m5232c();
                    this.f5716l = false;
                    this.f5710f = null;
                    this.f5717m = false;
                    this.f5718n.clear();
                    this.f5719o.clear();
                    this.f5712h = null;
                    this.f5713i = null;
                    this.f5721q = -1L;
                    this.f5722r = -1L;
                } catch (Exception e10) {
                    TXCLog.m4991e("TXCMP4SWMuxer", "muxer stop/release exception: " + e10);
                    this.f5716l = false;
                    this.f5710f = null;
                    this.f5717m = false;
                    this.f5718n.clear();
                    this.f5719o.clear();
                    this.f5712h = null;
                    this.f5713i = null;
                    this.f5721q = -1L;
                    this.f5722r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f5716l = false;
                this.f5710f = null;
                this.f5717m = false;
                this.f5718n.clear();
                this.f5719o.clear();
                this.f5712h = null;
                this.f5713i = null;
                this.f5721q = -1L;
                this.f5722r = -1L;
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public synchronized void mo5198b(byte[] bArr, int i10, int i11, long j10, int i12) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i11);
        byteBufferAllocateDirect.put(bArr, i10, i11);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j10;
        bufferInfo.offset = 0;
        bufferInfo.size = i11;
        bufferInfo.flags = i12;
        m5220a(byteBufferAllocateDirect, bufferInfo);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized void mo5194a(String str) {
        try {
            this.f5711g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f5711g);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    TXCLog.m4992e("TXCMP4SWMuxer", "create new file failed.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m5221b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m5211a(false, byteBuffer, bufferInfo);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized void mo5195a(byte[] bArr, int i10, int i11, long j10, int i12) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i11);
        byteBufferAllocateDirect.put(bArr, i10, i11);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j10;
        bufferInfo.offset = 0;
        bufferInfo.size = i11;
        bufferInfo.flags = i12;
        m5221b(byteBufferAllocateDirect, bufferInfo);
    }

    /* renamed from: a */
    public synchronized void m5220a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f5710f == null) {
            m5211a(true, byteBuffer, bufferInfo);
            TXCLog.m4998w("TXCMP4SWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f5720p < 0) {
            m5211a(true, byteBuffer, bufferInfo);
            this.f5720p = m5217g();
            TXCLog.m4989d("TXCMP4SWMuxer", "first frame offset = " + this.f5720p);
            m5219i();
        } else {
            m5210a(bufferInfo.presentationTimeUs);
            m5212c(byteBuffer, bufferInfo);
        }
    }

    /* renamed from: a */
    private void m5211a(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (byteBuffer == null || bufferInfo == null) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        if (bufferInfo.size > 0) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.size);
        }
        byteBufferAllocateDirect.rewind();
        byteBufferAllocateDirect.put(byteBuffer);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        a aVar = new a(byteBufferAllocateDirect, bufferInfo2);
        if (z10) {
            if (this.f5718n.size() < 200) {
                this.f5718n.add(aVar);
                return;
            } else {
                TXCLog.m4991e("TXCMP4SWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            }
        }
        this.f5719o.add(aVar);
    }

    /* renamed from: a */
    private void m5210a(long j10) {
        while (this.f5719o.size() > 0) {
            if (this.f5719o.peek().m5223b() == null) {
                TXCLog.m4991e("TXCMP4SWMuxer", "flushAudioCache, bufferInfo is null");
                this.f5719o.remove();
            } else {
                if (this.f5719o.peek().m5223b().presentationTimeUs >= j10) {
                    return;
                }
                a aVarPoll = this.f5719o.poll();
                m5214d(aVarPoll.m5222a(), aVarPoll.m5223b());
            }
        }
    }
}

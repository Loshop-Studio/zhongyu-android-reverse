package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(18)
/* renamed from: com.tencent.liteav.muxer.b */
/* loaded from: classes4.dex */
public class C6611b implements InterfaceC6610a {

    /* renamed from: a */
    public static float f5683a = 0.5f;

    /* renamed from: b */
    public static float f5684b = 0.8f;

    /* renamed from: c */
    public static float f5685c = 1.25f;

    /* renamed from: d */
    public static float f5686d = 2.0f;

    /* renamed from: f */
    private MediaMuxer f5688f;

    /* renamed from: e */
    private int f5687e = 2;

    /* renamed from: g */
    private String f5689g = null;

    /* renamed from: h */
    private MediaFormat f5690h = null;

    /* renamed from: i */
    private MediaFormat f5691i = null;

    /* renamed from: j */
    private int f5692j = 0;

    /* renamed from: k */
    private int f5693k = 0;

    /* renamed from: l */
    private boolean f5694l = false;

    /* renamed from: m */
    private boolean f5695m = false;

    /* renamed from: n */
    private ConcurrentLinkedQueue<a> f5696n = new ConcurrentLinkedQueue<>();

    /* renamed from: o */
    private ConcurrentLinkedQueue<a> f5697o = new ConcurrentLinkedQueue<>();

    /* renamed from: p */
    private long f5698p = -1;

    /* renamed from: q */
    private long f5699q = -1;

    /* renamed from: r */
    private long f5700r = -1;

    /* renamed from: com.tencent.liteav.muxer.b$a */
    public static class a {

        /* renamed from: a */
        ByteBuffer f5701a;

        /* renamed from: b */
        MediaCodec.BufferInfo f5702b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f5701a = byteBuffer;
            this.f5702b = bufferInfo;
        }

        /* renamed from: a */
        public ByteBuffer m5207a() {
            return this.f5701a;
        }

        /* renamed from: b */
        public MediaCodec.BufferInfo m5208b() {
            return this.f5702b;
        }
    }

    /* renamed from: d */
    private void m5203d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f10;
        float f11;
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = this.f5698p;
        long j12 = j10 - j11;
        if (j11 < 0 || j12 < 0) {
            TXCLog.m4998w("TXCMP4HWMuxer", "drop sample. first frame offset timeus = " + this.f5698p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j12 < this.f5700r) {
            TXCLog.m4991e("TXCMP4HWMuxer", "audio is not in chronological order. current audio's pts pts(" + j12 + ") must larger than pre audio's pts(" + this.f5700r + ")");
            j12 = this.f5700r + 1;
        } else {
            this.f5700r = j12;
        }
        int i10 = this.f5687e;
        if (i10 != 2) {
            if (i10 == 3) {
                f10 = j12;
                f11 = f5684b;
            } else if (i10 == 4) {
                f10 = j12;
                f11 = f5683a;
            } else if (i10 == 1) {
                f10 = j12;
                f11 = f5685c;
            } else if (i10 == 0) {
                f10 = j12;
                f11 = f5686d;
            }
            j12 = (long) (f10 * f11);
        }
        bufferInfo.presentationTimeUs = j12;
        try {
            this.f5688f.writeSampleData(this.f5692j, byteBuffer, bufferInfo);
        } catch (IllegalArgumentException e10) {
            TXCLog.m4991e("TXCMP4HWMuxer", "write sample IllegalArgumentException: " + e10);
        } catch (IllegalStateException e11) {
            TXCLog.m4991e("TXCMP4HWMuxer", "write sample IllegalStateException: " + e11);
        }
    }

    /* renamed from: e */
    private void m5204e() {
        while (this.f5696n.size() > 0) {
            a aVarPoll = this.f5696n.poll();
            m5201c(aVarPoll.m5207a(), aVarPoll.m5208b());
        }
        while (this.f5697o.size() > 0) {
            a aVarPoll2 = this.f5697o.poll();
            m5203d(aVarPoll2.m5207a(), aVarPoll2.m5208b());
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized void mo5193a(MediaFormat mediaFormat) {
        TXCLog.m4989d("TXCMP4HWMuxer", "addVideoTrack:" + mediaFormat);
        this.f5690h = mediaFormat;
        this.f5696n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public synchronized void mo5197b(MediaFormat mediaFormat) {
        TXCLog.m4989d("TXCMP4HWMuxer", "addAudioTrack:" + mediaFormat);
        this.f5691i = mediaFormat;
        this.f5697o.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: c */
    public synchronized boolean mo5199c() {
        return this.f5690h != null;
    }

    /* renamed from: c */
    private void m5201c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f10;
        float f11;
        long j10 = bufferInfo.presentationTimeUs - this.f5698p;
        if (j10 < 0) {
            TXCLog.m4991e("TXCMP4HWMuxer", "pts error! first frame offset timeus = " + this.f5698p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j10 = this.f5699q;
            if (j10 <= 0) {
                j10 = 0;
            }
        }
        if (j10 < this.f5699q) {
            TXCLog.m4998w("TXCMP4HWMuxer", "video is not in chronological order. current frame's pts(" + j10 + ") smaller than pre frame's pts(" + this.f5699q + ")");
        } else {
            this.f5699q = j10;
        }
        int i10 = this.f5687e;
        if (i10 != 2) {
            if (i10 == 3) {
                f10 = j10;
                f11 = f5684b;
            } else if (i10 == 4) {
                f10 = j10;
                f11 = f5683a;
            } else if (i10 == 1) {
                f10 = j10;
                f11 = f5685c;
            } else if (i10 == 0) {
                f10 = j10;
                f11 = f5686d;
            }
            j10 = (long) (f10 * f11);
        }
        bufferInfo.presentationTimeUs = j10;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f5688f.writeSampleData(this.f5693k, byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f5695m = true;
            }
        } catch (IllegalArgumentException e10) {
            TXCLog.m4991e("TXCMP4HWMuxer", "write frame IllegalArgumentException: " + e10);
        } catch (IllegalStateException e11) {
            TXCLog.m4991e("TXCMP4HWMuxer", "write frame IllegalStateException: " + e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int mo5192a() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.muxer.C6611b.mo5192a():int");
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public synchronized int mo5196b() {
        if (this.f5688f != null) {
            TXCLog.m4989d("TXCMP4HWMuxer", "stop. start flag = " + this.f5694l + ", video key frame set = " + this.f5695m);
            try {
                try {
                    if (this.f5694l && this.f5695m) {
                        this.f5688f.stop();
                    }
                    this.f5688f.release();
                    this.f5694l = false;
                    this.f5688f = null;
                    this.f5695m = false;
                    this.f5696n.clear();
                    this.f5697o.clear();
                    this.f5690h = null;
                    this.f5691i = null;
                    this.f5699q = -1L;
                    this.f5700r = -1L;
                } catch (Exception e10) {
                    TXCLog.m4991e("TXCMP4HWMuxer", "muxer stop/release exception: " + e10);
                    this.f5694l = false;
                    this.f5688f = null;
                    this.f5695m = false;
                    this.f5696n.clear();
                    this.f5697o.clear();
                    this.f5690h = null;
                    this.f5691i = null;
                    this.f5699q = -1L;
                    this.f5700r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f5694l = false;
                this.f5688f = null;
                this.f5695m = false;
                this.f5696n.clear();
                this.f5697o.clear();
                this.f5690h = null;
                this.f5691i = null;
                this.f5699q = -1L;
                this.f5700r = -1L;
                throw th;
            }
        }
        return 0;
    }

    /* renamed from: d */
    private long m5202d() {
        a aVarPeek;
        long j10 = this.f5696n.size() > 0 ? this.f5696n.peek().m5208b().presentationTimeUs : 0L;
        if (this.f5697o.size() > 0 && (aVarPeek = this.f5697o.peek()) != null && aVarPeek.m5208b() != null) {
            long j11 = this.f5697o.peek().m5208b().presentationTimeUs;
            if (j10 > j11) {
                return j11;
            }
        }
        return j10;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public synchronized void mo5194a(String str) {
        try {
            this.f5689g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f5689g);
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
                    TXCLog.m4992e("TXCMP4HWMuxer", "create new file failed.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
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
        m5205a(byteBufferAllocateDirect, bufferInfo);
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
        m5206b(byteBufferAllocateDirect, bufferInfo);
    }

    /* renamed from: b */
    public synchronized void m5206b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f5688f != null && this.f5698p >= 0) {
            m5203d(byteBuffer, bufferInfo);
            return;
        }
        TXCLog.m4989d("TXCMP4HWMuxer", "cache sample before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
        m5200a(false, byteBuffer, bufferInfo);
    }

    /* renamed from: a */
    public synchronized void m5205a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f5688f == null) {
            m5200a(true, byteBuffer, bufferInfo);
            TXCLog.m4998w("TXCMP4HWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f5698p < 0) {
            m5200a(true, byteBuffer, bufferInfo);
            this.f5698p = m5202d();
            TXCLog.m4989d("TXCMP4HWMuxer", "first frame offset = " + this.f5698p);
            m5204e();
        } else {
            m5201c(byteBuffer, bufferInfo);
        }
    }

    /* renamed from: a */
    private void m5200a(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
            if (this.f5696n.size() >= 200) {
                TXCLog.m4991e("TXCMP4HWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            } else {
                this.f5696n.add(aVar);
                return;
            }
        }
        if (this.f5697o.size() >= 600) {
            TXCLog.m4991e("TXCMP4HWMuxer", "drop audio frame. audio cache size is larger than 600");
        } else {
            this.f5697o.add(aVar);
        }
    }
}

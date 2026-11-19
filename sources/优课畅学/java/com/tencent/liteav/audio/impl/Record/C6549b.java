package com.tencent.liteav.audio.impl.Record;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.audio.InterfaceC6545e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: com.tencent.liteav.audio.impl.Record.b */
/* loaded from: classes4.dex */
public class C6549b extends Thread {

    /* renamed from: a */
    private MediaCodec.BufferInfo f5108a;

    /* renamed from: b */
    private MediaCodecInfo f5109b;

    /* renamed from: c */
    private MediaFormat f5110c;

    /* renamed from: d */
    private MediaCodec f5111d;

    /* renamed from: e */
    private Vector<byte[]> f5112e;

    /* renamed from: f */
    private WeakReference<InterfaceC6545e> f5113f;

    /* renamed from: g */
    private volatile boolean f5114g;

    /* renamed from: h */
    private volatile boolean f5115h;

    /* renamed from: i */
    private final Object f5116i;

    /* renamed from: j */
    private long f5117j;

    /* renamed from: k */
    private int f5118k;

    /* renamed from: l */
    private int f5119l;

    /* renamed from: m */
    private int f5120m;

    /* renamed from: n */
    private byte[] f5121n;

    static {
        C6592e.m5058f();
    }

    @TargetApi(16)
    public C6549b() {
        super("TXAudioRecordThread");
        this.f5114g = false;
        this.f5115h = false;
        this.f5116i = new Object();
        this.f5117j = 0L;
        this.f5118k = 48000;
        this.f5119l = 1;
        this.f5120m = 16;
    }

    /* renamed from: b */
    private void m4746b() {
        MediaCodecInfo mediaCodecInfoM4744a = m4744a("audio/mp4a-latm");
        this.f5109b = mediaCodecInfoM4744a;
        if (mediaCodecInfoM4744a == null) {
            TXCLog.m4991e("AudioCenter:TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
            return;
        }
        TXCLog.m4994i("AudioCenter:TXCAudioHWEncoder", "selected codec: " + this.f5109b.getName());
        int i10 = this.f5118k;
        int i11 = TXRecordCommon.AUDIO_SAMPLERATE_32000;
        if (i10 >= 32000) {
            i11 = 64000;
        }
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i10, this.f5119l);
        this.f5110c = mediaFormatCreateAudioFormat;
        mediaFormatCreateAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i11);
        this.f5110c.setInteger("channel-count", this.f5119l);
        this.f5110c.setInteger("sample-rate", this.f5118k);
        this.f5110c.setInteger("aac-profile", 2);
        TXCLog.m4994i("AudioCenter:TXCAudioHWEncoder", "format: " + this.f5110c);
        try {
            m4749d();
        } catch (Exception e10) {
            TXCLog.m4992e("AudioCenter:TXCAudioHWEncoder", "start media codec failed.", e10);
        }
        start();
    }

    /* renamed from: c */
    private void m4748c() {
        this.f5115h = true;
    }

    @TargetApi(16)
    /* renamed from: d */
    private void m4749d() throws IOException {
        if (this.f5111d != null) {
            return;
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f5111d = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(this.f5110c, (Surface) null, (MediaCrypto) null, 1);
        this.f5111d.start();
        TXCLog.m4994i("AudioCenter:TXCAudioHWEncoder", "prepare finishing");
        this.f5114g = true;
    }

    /* renamed from: e */
    private void m4750e() {
        MediaCodec mediaCodec = this.f5111d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f5111d.release();
            this.f5111d = null;
        }
        this.f5114g = false;
    }

    /* renamed from: f */
    private long m4751f() {
        long timeTick = TXCTimeUtil.getTimeTick();
        long j10 = this.f5117j;
        return timeTick < j10 ? (j10 - timeTick) + timeTick : timeTick;
    }

    /* renamed from: a */
    public void m4753a(int i10, int i11, int i12, int i13, WeakReference<InterfaceC6545e> weakReference) {
        this.f5113f = weakReference;
        this.f5108a = new MediaCodec.BufferInfo();
        this.f5112e = new Vector<>();
        this.f5118k = i11;
        this.f5119l = i12;
        this.f5120m = i13;
        m4746b();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        boolean zIsEmpty;
        byte[] bArrRemove;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1024);
        while (!this.f5115h) {
            if (this.f5114g) {
                synchronized (this.f5112e) {
                    zIsEmpty = this.f5112e.isEmpty();
                }
                if (zIsEmpty) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.f5112e) {
                        bArrRemove = this.f5112e.remove(0);
                    }
                    if (bArrRemove != null) {
                        try {
                            byteBufferAllocateDirect.clear();
                            if (bArrRemove.length > byteBufferAllocateDirect.capacity()) {
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrRemove.length);
                            }
                            byteBufferAllocateDirect.clear();
                            byteBufferAllocateDirect.put(bArrRemove);
                            byteBufferAllocateDirect.flip();
                            m4745a(byteBufferAllocateDirect, bArrRemove.length, m4751f());
                        } catch (Exception e10) {
                            TXCLog.m4992e("AudioCenter:TXCAudioHWEncoder", "encode frame failed.", e10);
                        }
                    }
                }
            } else {
                synchronized (this.f5116i) {
                    try {
                        this.f5116i.wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        m4750e();
    }

    /* renamed from: a */
    public void m4754a(byte[] bArr, long j10) {
        Vector<byte[]> vector = this.f5112e;
        if (vector != null && bArr != null) {
            synchronized (vector) {
                try {
                    Vector<byte[]> vector2 = this.f5112e;
                    if (vector2 == null) {
                        return;
                    } else {
                        vector2.add(bArr);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f5116i) {
            this.f5116i.notify();
        }
    }

    /* renamed from: b */
    private void m4747b(byte[] bArr, long j10) {
        InterfaceC6545e interfaceC6545e;
        WeakReference<InterfaceC6545e> weakReference = this.f5113f;
        if (weakReference == null || (interfaceC6545e = weakReference.get()) == null) {
            return;
        }
        interfaceC6545e.mo4721b(bArr, j10, this.f5118k, this.f5119l, this.f5120m);
    }

    /* renamed from: a */
    public void m4752a() {
        m4748c();
    }

    /* renamed from: a */
    private void m4745a(ByteBuffer byteBuffer, int i10, long j10) throws MediaCodec.CryptoException {
        int iDequeueOutputBuffer;
        if (this.f5115h) {
            return;
        }
        ByteBuffer[] inputBuffers = this.f5111d.getInputBuffers();
        int iDequeueInputBuffer = this.f5111d.dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
            byteBuffer2.clear();
            if (byteBuffer != null) {
                byteBuffer2.put(byteBuffer);
            }
            if (i10 <= 0) {
                TXCLog.m4994i("AudioCenter:TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
                this.f5111d.queueInputBuffer(iDequeueInputBuffer, 0, 0, j10, 4);
            } else {
                this.f5111d.queueInputBuffer(iDequeueInputBuffer, 0, i10, j10, 0);
            }
        }
        ByteBuffer[] outputBuffers = this.f5111d.getOutputBuffers();
        do {
            iDequeueOutputBuffer = this.f5111d.dequeueOutputBuffer(this.f5108a, WorkRequest.MIN_BACKOFF_MILLIS);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = this.f5111d.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    this.f5111d.getOutputFormat();
                } else if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = outputBuffers[iDequeueOutputBuffer];
                    if ((this.f5108a.flags & 2) != 0) {
                        TXCLog.m4989d("AudioCenter:TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
                        this.f5108a.size = 0;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f5108a;
                    if (bufferInfo.size != 0) {
                        bufferInfo.presentationTimeUs = m4751f();
                        byte[] bArr = new byte[byteBuffer3.limit()];
                        this.f5121n = bArr;
                        byteBuffer3.get(bArr);
                        m4747b(this.f5121n, this.f5108a.presentationTimeUs);
                        this.f5117j = this.f5108a.presentationTimeUs;
                    }
                    this.f5111d.releaseOutputBuffer(iDequeueOutputBuffer, false);
                }
            }
        } while (iDequeueOutputBuffer >= 0);
    }

    /* renamed from: a */
    private static final MediaCodecInfo m4744a(String str) {
        TXCLog.m4996v("AudioCenter:TXCAudioHWEncoder", "selectAudioCodec:");
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i11 = 0; i11 < supportedTypes.length; i11++) {
                    TXCLog.m4994i("AudioCenter:TXCAudioHWEncoder", "supportedType:" + codecInfoAt.getName() + ",MIME=" + supportedTypes[i11]);
                    if (supportedTypes[i11].equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }
}

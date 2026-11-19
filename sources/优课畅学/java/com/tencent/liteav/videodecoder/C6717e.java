package com.tencent.liteav.videodecoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.liteav.videodecoder.e */
/* loaded from: classes4.dex */
public class C6717e implements InterfaceC6714b {

    /* renamed from: r */
    private InterfaceC6718f f6372r;

    /* renamed from: u */
    private WeakReference<InterfaceC6559b> f6375u;

    /* renamed from: a */
    private MediaCodec.BufferInfo f6355a = new MediaCodec.BufferInfo();

    /* renamed from: b */
    private MediaCodec f6356b = null;

    /* renamed from: c */
    private String f6357c = "video/avc";

    /* renamed from: d */
    private int f6358d = 540;

    /* renamed from: e */
    private int f6359e = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

    /* renamed from: f */
    private long f6360f = 0;

    /* renamed from: g */
    private long f6361g = 0;

    /* renamed from: h */
    private boolean f6362h = true;

    /* renamed from: i */
    private boolean f6363i = false;

    /* renamed from: j */
    private boolean f6364j = false;

    /* renamed from: k */
    private Surface f6365k = null;

    /* renamed from: l */
    private int f6366l = 0;

    /* renamed from: m */
    private ArrayList<TXSNALPacket> f6367m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<Long> f6368n = new ArrayList<>();

    /* renamed from: o */
    private long f6369o = 0;

    /* renamed from: p */
    private int f6370p = 0;

    /* renamed from: q */
    private JSONArray f6371q = null;

    /* renamed from: s */
    private C6716d f6373s = new C6716d();

    /* renamed from: t */
    private boolean f6374t = false;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @android.annotation.TargetApi(16)
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5713b() throws android.media.MediaCodec.CryptoException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.C6717e.m5713b():void");
    }

    /* renamed from: c */
    private void m5714c() {
        int i10;
        MediaFormat outputFormat = this.f6356b.getOutputFormat();
        TXCLog.m4994i("MediaCodecDecoder", "decode output format changed: " + outputFormat);
        int iAbs = Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
        int iAbs2 = Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
        int integer = outputFormat.getInteger("width");
        int integer2 = outputFormat.getInteger("height");
        int iMin = Math.min(iAbs, integer);
        int iMin2 = Math.min(iAbs2, integer2);
        int i11 = this.f6358d;
        if (iMin == i11 && iMin2 == (i10 = this.f6359e)) {
            if (this.f6362h) {
                this.f6362h = false;
                InterfaceC6718f interfaceC6718f = this.f6372r;
                if (interfaceC6718f != null) {
                    interfaceC6718f.onVideoSizeChange(i11, i10);
                    return;
                }
                return;
            }
            return;
        }
        this.f6358d = iMin;
        this.f6359e = iMin2;
        try {
            InterfaceC6718f interfaceC6718f2 = this.f6372r;
            if (interfaceC6718f2 != null) {
                interfaceC6718f2.onVideoSizeChange(iMin, iMin2);
            }
        } catch (Exception e10) {
            TXCLog.m4992e("MediaCodecDecoder", "onVideoSizeChange failed.", e10);
        }
        TXCLog.m4994i("MediaCodecDecoder", "decode: video size change to w:" + iMin + ",h:" + iMin2);
    }

    /* renamed from: d */
    private void m5715d() {
        if (this.f6360f == 0) {
            TXCLog.m4998w("MediaCodecDecoder", "decode first frame sucess");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f6360f;
        if (j10 > 0 && jCurrentTimeMillis > j10 + 1000) {
            long j11 = this.f6361g;
            if (jCurrentTimeMillis > 2000 + j11 && j11 != 0) {
                TXCLog.m4991e("MediaCodecDecoder", "frame interval[" + (jCurrentTimeMillis - this.f6360f) + "] > 1000");
                this.f6361g = jCurrentTimeMillis;
            }
        }
        if (this.f6361g == 0) {
            this.f6361g = jCurrentTimeMillis;
        }
        this.f6360f = jCurrentTimeMillis;
    }

    /* renamed from: e */
    private boolean m5716e() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc")) {
                    TXCLog.m4991e("MediaCodecDecoder", "decode: video/hevc MediaCodecInfo: " + mediaCodecInfo.getName() + ",encoder:" + mediaCodecInfo.isEncoder());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m5717f() {
        if (this.f6363i) {
            return;
        }
        TXCLog.m4998w("MediaCodecDecoder", "decode: hw decode error, hevc: " + this.f6364j);
        if (this.f6364j) {
            C6592e.m5041a(this.f6375u, -2304, "h265 Decoding failed");
        } else {
            C6592e.m5041a(this.f6375u, 2106, "Failed to enable hardware decoding，use software decoding.");
        }
        this.f6363i = true;
        InterfaceC6718f interfaceC6718f = this.f6372r;
        if (interfaceC6718f != null) {
            interfaceC6718f.onDecodeFailed(-1);
        }
    }

    /* renamed from: g */
    private void m5718g() {
        int i10 = this.f6366l;
        if (i10 < 40) {
            this.f6366l = i10 + 1;
        } else {
            m5717f();
            this.f6366l = 0;
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int GetDecodeCost() {
        return this.f6370p;
    }

    /* renamed from: a */
    public void m5720a(JSONArray jSONArray) {
        this.f6371q = jSONArray;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int config(Surface surface) {
        if (surface == null) {
            return -1;
        }
        this.f6365k = surface;
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void decode(TXSNALPacket tXSNALPacket) throws JSONException, IOException {
        m5712a(tXSNALPacket.codecId == 1);
        m5711a(tXSNALPacket);
        this.f6367m.add(tXSNALPacket);
        while (!this.f6367m.isEmpty()) {
            int size = this.f6367m.size();
            try {
                m5713b();
            } catch (Exception e10) {
                TXCLog.m4991e("MediaCodecDecoder", "decode: doDecode Exception!! " + e10.toString());
            }
            if (size == this.f6367m.size()) {
                return;
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void enableLimitDecCache(boolean z10) {
        this.f6374t = z10;
        TXCLog.m4994i("MediaCodecDecoder", "decode: enable limit dec cache: " + z10);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public boolean isHevc() {
        return this.f6364j;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void setListener(InterfaceC6718f interfaceC6718f) {
        this.f6372r = interfaceC6718f;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void setNotifyListener(WeakReference<InterfaceC6559b> weakReference) {
        this.f6375u = weakReference;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, boolean z11) {
        return m5708a(byteBuffer, byteBuffer2, z11);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC6714b
    public void stop() {
        m5709a();
    }

    /* renamed from: a */
    public void m5719a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f6358d = i10;
        this.f6359e = i11;
        TXCLog.m4998w("MediaCodecDecoder", "decode: init with video size: " + this.f6358d + ", " + this.f6359e);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m5708a(java.nio.ByteBuffer r8, java.nio.ByteBuffer r9, boolean r10) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.C6717e.m5708a(java.nio.ByteBuffer, java.nio.ByteBuffer, boolean):int");
    }

    /* renamed from: a */
    private void m5709a() {
        MediaCodec mediaCodec = this.f6356b;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                    TXCLog.m4998w("MediaCodecDecoder", "decode: stop decoder sucess");
                } catch (Exception e10) {
                    TXCLog.m4991e("MediaCodecDecoder", "decode: stop decoder Exception: " + e10.toString());
                    try {
                        try {
                            this.f6356b.release();
                            TXCLog.m4998w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Exception e11) {
                            TXCLog.m4991e("MediaCodecDecoder", "decode: release decoder exception: " + e11.toString());
                        }
                    } finally {
                    }
                }
                try {
                    try {
                        this.f6356b.release();
                        TXCLog.m4998w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e12) {
                        TXCLog.m4991e("MediaCodecDecoder", "decode: release decoder exception: " + e12.toString());
                    }
                    this.f6367m.clear();
                    this.f6360f = 0L;
                    this.f6362h = true;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    try {
                        this.f6356b.release();
                        TXCLog.m4998w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e13) {
                        TXCLog.m4991e("MediaCodecDecoder", "decode: release decoder exception: " + e13.toString());
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private void m5710a(int i10, long j10, long j11, int i11) {
        this.f6356b.releaseOutputBuffer(i10, true);
        if ((this.f6355a.flags & 4) != 0) {
            TXCLog.m4994i("MediaCodecDecoder", "output EOS");
        }
        try {
            InterfaceC6718f interfaceC6718f = this.f6372r;
            if (interfaceC6718f != null) {
                interfaceC6718f.onDecodeFrame(null, this.f6358d, this.f6359e, j10, j11, i11);
            }
        } catch (Exception e10) {
            TXCLog.m4992e("MediaCodecDecoder", "onDecodeFrame failed.", e10);
        }
        m5715d();
    }

    /* renamed from: a */
    private void m5712a(boolean z10) throws JSONException, IOException {
        if (this.f6364j != z10) {
            this.f6364j = z10;
            if (this.f6363i) {
                return;
            }
            if (z10 && !m5716e()) {
                m5709a();
                m5717f();
            } else {
                m5709a();
                m5708a(null, null, this.f6364j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5711a(com.tencent.liteav.basic.structs.TXSNALPacket r9) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.C6717e.m5711a(com.tencent.liteav.basic.structs.TXSNALPacket):void");
    }
}

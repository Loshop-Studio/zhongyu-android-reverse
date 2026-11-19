package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.p048c.C6560a;
import com.tencent.liteav.basic.p048c.C6561b;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.basic.p048c.C6568i;
import com.tencent.liteav.basic.p048c.EnumC6567h;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.util.C6593f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.videoencoder.a */
/* loaded from: classes4.dex */
public class C6721a extends C6722b {

    /* renamed from: G */
    private int f6385G;

    /* renamed from: H */
    private int f6386H;

    /* renamed from: I */
    private int f6387I;

    /* renamed from: J */
    private int f6388J;

    /* renamed from: K */
    private int f6389K;

    /* renamed from: L */
    private boolean f6390L;

    /* renamed from: W */
    private ArrayList<Long> f6401W;

    /* renamed from: n */
    private boolean f6423n;

    /* renamed from: r */
    private C6593f f6427r;

    /* renamed from: w */
    private Object f6432w;

    /* renamed from: a */
    private int f6405a = 0;

    /* renamed from: b */
    private long f6411b = 0;

    /* renamed from: c */
    private double f6412c = AudioStats.AUDIO_AMPLITUDE_NONE;

    /* renamed from: d */
    private long f6413d = 0;

    /* renamed from: e */
    private long f6414e = 0;

    /* renamed from: f */
    private int f6415f = 0;

    /* renamed from: g */
    private boolean f6416g = false;

    /* renamed from: h */
    private boolean f6417h = true;

    /* renamed from: i */
    private long f6418i = 0;

    /* renamed from: j */
    private long f6419j = 0;

    /* renamed from: k */
    private long f6420k = 0;

    /* renamed from: l */
    private long f6421l = 0;

    /* renamed from: m */
    private long f6422m = 0;

    /* renamed from: o */
    private long f6424o = 0;

    /* renamed from: p */
    private long f6425p = 0;

    /* renamed from: q */
    private MediaCodec f6426q = null;

    /* renamed from: s */
    private Runnable f6428s = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.10
        @Override // java.lang.Runnable
        public void run() {
            C6721a.this.m5750e();
        }
    };

    /* renamed from: t */
    private Runnable f6429t = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.11
        @Override // java.lang.Runnable
        public void run() {
            C6721a.this.m5738b(10);
        }
    };

    /* renamed from: u */
    private Runnable f6430u = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.2
        @Override // java.lang.Runnable
        public void run() {
            C6721a.this.m5738b(1);
        }
    };

    /* renamed from: v */
    private ArrayDeque<Long> f6431v = new ArrayDeque<>(10);

    /* renamed from: x */
    private Surface f6433x = null;

    /* renamed from: y */
    private boolean f6434y = true;

    /* renamed from: z */
    private boolean f6435z = true;

    /* renamed from: A */
    private boolean f6379A = false;

    /* renamed from: B */
    private ByteBuffer[] f6380B = null;

    /* renamed from: C */
    private byte[] f6381C = null;

    /* renamed from: D */
    private volatile long f6382D = 0;

    /* renamed from: E */
    private long f6383E = 0;

    /* renamed from: F */
    private long f6384F = 0;

    /* renamed from: M */
    private boolean f6391M = true;

    /* renamed from: N */
    private boolean f6392N = false;

    /* renamed from: O */
    private int f6393O = 0;

    /* renamed from: P */
    private int f6394P = 0;

    /* renamed from: Q */
    private int f6395Q = 0;

    /* renamed from: R */
    private long f6396R = 0;

    /* renamed from: S */
    private int f6397S = 0;

    /* renamed from: T */
    private int f6398T = 0;

    /* renamed from: U */
    private int f6399U = -1;

    /* renamed from: V */
    private boolean f6400V = false;

    /* renamed from: X */
    private int f6402X = 0;

    /* renamed from: Y */
    private long f6403Y = 0;

    /* renamed from: Z */
    private int f6404Z = 3;

    /* renamed from: aa */
    private int f6406aa = 0;

    /* renamed from: ab */
    private boolean f6407ab = false;

    /* renamed from: ac */
    private boolean f6408ac = true;

    /* renamed from: ad */
    private long f6409ad = 0;

    /* renamed from: ae */
    private Runnable f6410ae = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.3
        @Override // java.lang.Runnable
        public void run() throws Exception {
            C6721a.this.f6409ad = System.currentTimeMillis();
            C6721a.this.m5737b();
            C6721a.this.m5746d();
            C6721a.this.m5744c();
        }
    };

    public C6721a() {
        this.f6427r = null;
        this.f6427r = new C6593f("HWVideoEncoder");
    }

    /* renamed from: d */
    public static /* synthetic */ int m5745d(C6721a c6721a) {
        int i10 = c6721a.f6393O;
        c6721a.f6393O = i10 + 1;
        return i10;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public int getEncodeCost() {
        return this.f6402X;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long getRealBitrate() {
        return this.f6411b;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public double getRealFPS() {
        return this.f6412c;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrame(int i10, int i11, int i12, long j10) {
        if (this.f6435z) {
            return 10000004L;
        }
        GLES20.glFinish();
        this.f6395Q++;
        this.f6382D = j10;
        this.f6399U = i10;
        this.mInputWidth = i11;
        this.mInputHeight = i12;
        if (this.f6390L) {
            m5751f();
        }
        if (!this.f6391M || this.f6400V) {
            this.f6398T++;
            this.f6427r.m5065b(this.f6429t);
            this.f6400V = false;
        }
        int i13 = this.f6393O;
        if (i13 > this.f6394P + 30) {
            TXCLog.m4991e("TXCHWVideoEncoder", String.format("hw encoder error when render[%d] pop[%d]", Integer.valueOf(i13), Integer.valueOf(this.f6394P)));
            InterfaceC6723c interfaceC6723c = this.mListener;
            if (interfaceC6723c != null) {
                interfaceC6723c.mo4709a(this.mStreamType);
            }
        }
        if (this.f6396R + CoroutineLiveDataKt.DEFAULT_TIMEOUT >= System.currentTimeMillis()) {
            return 0L;
        }
        this.f6396R = System.currentTimeMillis();
        int i14 = this.f6397S;
        if (i14 != 0 && i14 == this.f6393O) {
            TXCLog.m4994i("TXCHWVideoEncoder", String.format("hw encoder error when push[%d] render task[%d] render[%d] pop[%d]", Integer.valueOf(this.f6395Q), Integer.valueOf(this.f6398T), Integer.valueOf(this.f6393O), Integer.valueOf(this.f6394P)));
            InterfaceC6723c interfaceC6723c2 = this.mListener;
            if (interfaceC6723c2 != null) {
                interfaceC6723c2.mo4709a(this.mStreamType);
            }
        }
        this.f6397S = this.f6393O;
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrameAsync(final int i10, int i11, int i12, final long j10) {
        if (this.f6435z) {
            return 10000004L;
        }
        GLES20.glFinish();
        if (this.f6390L) {
            m5751f();
        }
        this.f6427r.m5062a().post(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.8
            @Override // java.lang.Runnable
            public void run() {
                int iM5721a;
                if (C6721a.this.f6434y || C6721a.this.f6432w == null) {
                    return;
                }
                int i13 = i10;
                long j11 = j10;
                C6721a.this.m5727a(j11);
                C6721a c6721a = C6721a.this;
                int i14 = (720 - c6721a.mRotation) % 360;
                c6721a.mEncodeFilter.m4836a(c6721a.mInputWidth, c6721a.mInputHeight, i14, null, ((i14 == 90 || i14 == 270) ? c6721a.mOutputHeight : c6721a.mOutputWidth) / ((i14 == 90 || i14 == 270) ? c6721a.mOutputWidth : c6721a.mOutputHeight), c6721a.mEnableXMirror, true);
                C6721a.this.mEncodeFilter.m4832a(i13);
                if (C6721a.this.f6432w instanceof C6561b) {
                    ((C6561b) C6721a.this.f6432w).m4802a(j11 * AnimationKt.MillisToNanos);
                    ((C6561b) C6721a.this.f6432w).m4805d();
                }
                if (C6721a.this.f6432w instanceof C6560a) {
                    ((C6560a) C6721a.this.f6432w).m4792a();
                }
                C6721a c6721a2 = C6721a.this;
                InterfaceC6723c interfaceC6723c = c6721a2.mListener;
                if (interfaceC6723c != null) {
                    interfaceC6723c.mo4720b(c6721a2.mStreamType);
                }
                do {
                    iM5721a = C6721a.this.m5721a(1);
                } while (iM5721a > 0);
                if (iM5721a != -1 && iM5721a != -2) {
                    C6721a.m5745d(C6721a.this);
                    return;
                }
                if (iM5721a == -1) {
                    C6721a.this.callDelegate(10000005);
                }
                C6721a.this.f6434y = true;
                C6721a.this.m5750e();
            }
        });
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public long pushVideoFrameSync(int i10, int i11, int i12, long j10) {
        if (this.f6435z) {
            return 10000004L;
        }
        GLES20.glFinish();
        this.f6382D = j10;
        this.f6399U = i10;
        if (this.f6390L) {
            m5751f();
        }
        this.f6427r.m5063a(this.f6430u);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setBitrate(final int i10) {
        this.f6405a = i10;
        this.f6427r.m5065b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.6
            @Override // java.lang.Runnable
            public void run() {
                C6721a.this.m5743c(i10);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setBitrateFromQos(final int i10, int i11) {
        this.f6405a = i10;
        this.f6427r.m5065b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.7
            @Override // java.lang.Runnable
            public void run() {
                C6721a.this.m5743c(i10);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setEncodeIdrFpsFromQos(int i10) {
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void setFPS(final int i10) {
        this.f6427r.m5065b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.5
            @Override // java.lang.Runnable
            public void run() throws Exception {
                C6721a.this.m5747d(i10);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void signalEOSAndFlush() {
        if (this.f6435z) {
            return;
        }
        this.f6427r.m5063a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (C6721a.this.f6426q == null) {
                    return;
                }
                try {
                    C6721a.this.f6426q.signalEndOfInputStream();
                } catch (Exception e10) {
                    TXCLog.m4992e("TXCHWVideoEncoder", "signalEndOfInputStream failed.", e10);
                }
                while (C6721a.this.m5721a(10) >= 0) {
                }
                C6721a.this.m5750e();
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public int start(final TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        final boolean[] zArr = new boolean[1];
        synchronized (this) {
            this.f6427r.m5063a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.1
                /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r17 = this;
                        r0 = r17
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r2 = r1.encoderMode
                        r3 = 3
                        r4 = 2
                        java.lang.String r5 = "unknown"
                        r6 = 1
                        if (r2 == r6) goto L1a
                        if (r2 == r4) goto L17
                        if (r2 == r3) goto L13
                        r13 = r5
                        goto L1d
                    L13:
                        java.lang.String r2 = "CQ"
                    L15:
                        r13 = r2
                        goto L1d
                    L17:
                        java.lang.String r2 = "VBR"
                        goto L15
                    L1a:
                        java.lang.String r2 = "CBR"
                        goto L15
                    L1d:
                        int r1 = r1.encoderProfile
                        if (r1 == r6) goto L2d
                        if (r1 == r4) goto L2a
                        if (r1 == r3) goto L27
                    L25:
                        r14 = r5
                        goto L30
                    L27:
                        java.lang.String r5 = "High"
                        goto L25
                    L2a:
                        java.lang.String r5 = "Main"
                        goto L25
                    L2d:
                        java.lang.String r5 = "Baseline"
                        goto L25
                    L30:
                        com.tencent.liteav.videoencoder.a r1 = com.tencent.liteav.videoencoder.C6721a.this
                        int r1 = r1.hashCode()
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r1 = r1.width
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r1 = r1.height
                        java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r1 = r1.fps
                        java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r1 = r1.bitrate
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        int r1 = r1.gop
                        java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r1 = r2
                        boolean r2 = r1.bMultiRef
                        if (r2 == 0) goto L6c
                        java.lang.String r2 = "true"
                    L6a:
                        r15 = r2
                        goto L6f
                    L6c:
                        java.lang.String r2 = "false"
                        goto L6a
                    L6f:
                        int r1 = r1.streamType
                        java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
                        java.lang.Object[] r1 = new java.lang.Object[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
                        java.lang.String r2 = "VideoEncoder[%d]: Start [type:hardware][resolution:%d*%d][fps:%d][bitrate:%dkbps][gop:%d][rateControl:%s][profile:%s][rps:%s][streamType:%d]"
                        java.lang.String r1 = java.lang.String.format(r2, r1)
                        java.lang.String r2 = ""
                        r3 = 0
                        com.tencent.liteav.basic.module.Monitor.m5001a(r4, r1, r2, r3)
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "start:"
                        r2.append(r4)
                        r2.append(r1)
                        java.lang.String r1 = r2.toString()
                        java.lang.String r2 = "TXCHWVideoEncoder"
                        com.tencent.liteav.basic.log.TXCLog.m4994i(r2, r1)
                        com.tencent.liteav.videoencoder.a r1 = com.tencent.liteav.videoencoder.C6721a.this
                        boolean r2 = r1.mInit
                        if (r2 == 0) goto La4
                        com.tencent.liteav.videoencoder.C6721a.m5728a(r1)
                    La4:
                        boolean[] r1 = r3
                        com.tencent.liteav.videoencoder.a r2 = com.tencent.liteav.videoencoder.C6721a.this
                        com.tencent.liteav.videoencoder.TXSVideoEncoderParam r4 = r2
                        boolean r2 = com.tencent.liteav.videoencoder.C6721a.m5733a(r2, r4)
                        r1[r3] = r2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.C6721a.AnonymousClass1.run():void");
                }
            });
        }
        if (zArr[0]) {
            Monitor.m5001a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        if (!zArr[0]) {
            callDelegate(10000004);
        }
        return zArr[0] ? 0 : 10000004;
    }

    @Override // com.tencent.liteav.videoencoder.C6722b
    public void stop() {
        this.f6435z = true;
        synchronized (this) {
            this.f6427r.m5063a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.4
                @Override // java.lang.Runnable
                public void run() {
                    C6721a c6721a = C6721a.this;
                    if (c6721a.mInit) {
                        Monitor.m5001a(2, String.format("VideoEncoder[%d]: Stop, streamType:%d", Integer.valueOf(c6721a.hashCode()), Integer.valueOf(C6721a.this.mStreamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                        C6721a.this.m5750e();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5750e() {
        if (this.mInit) {
            this.f6434y = true;
            this.f6435z = true;
            m5737b();
            m5746d();
            this.f6399U = -1;
            this.f6411b = 0L;
            this.f6412c = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.f6413d = 0L;
            this.f6414e = 0L;
            this.f6415f = 0;
            this.f6418i = 0L;
            this.f6419j = 0L;
            this.f6420k = 0L;
            this.f6421l = 0L;
            this.f6422m = 0L;
            this.f6424o = 0L;
            this.f6425p = 0L;
            this.mGLContextExternal = null;
            this.f6380B = null;
            this.f6381C = null;
            this.f6382D = 0L;
            this.mOutputWidth = 0;
            this.mOutputHeight = 0;
            this.mInit = false;
            this.mListener = null;
            this.f6431v.clear();
            this.f6401W.clear();
            this.f6402X = 0;
        }
    }

    /* renamed from: f */
    private void m5751f() {
        if (this.f6426q != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f6426q.setParameters(bundle);
        }
    }

    /* renamed from: g */
    private void m5753g() {
        if (this.f6403Y > 0) {
            int i10 = this.f6387I;
            int i11 = i10 - ((int) this.f6412c);
            int i12 = i10 / 2;
            if (i12 < 5) {
                i12 = 5;
            }
            if (i11 <= i12) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f6403Y;
                int i13 = this.f6404Z;
                if (jCurrentTimeMillis > (4 - i13) * 2000) {
                    long j10 = this.f6406aa - this.f6411b;
                    long j11 = this.f6418i / 2;
                    if (j11 < 100) {
                        j11 = 100;
                    }
                    if (j10 <= j11) {
                        int i14 = i13 - 1;
                        this.f6404Z = i14;
                        if (i14 <= 0) {
                            this.f6403Y = 0L;
                            return;
                        }
                        return;
                    }
                    this.f6407ab = true;
                    String str = "real bitrate is too much lower than target bitrate![targetBr:" + this.f6406aa + "] [realBr:" + this.f6411b + "]. restart encoder. [module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + "]";
                    TXCLog.m4991e("TXCHWVideoEncoder", str);
                    Monitor.m5001a(3, str, "", 0);
                    C6593f c6593f = this.f6427r;
                    if (c6593f != null) {
                        c6593f.m5065b(this.f6410ae);
                    }
                    this.f6403Y = 0L;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m5744c() throws Exception {
        char c10;
        Surface surface;
        MediaFormat mediaFormatM5726a;
        this.f6408ac = C6573c.m4883a().m4908a("Video", "CheckVideoEncDownBps") > 0;
        this.f6393O = 0;
        this.f6394P = 0;
        this.f6396R = 0L;
        this.f6397S = 0;
        this.f6395Q = 0;
        this.f6398T = 0;
        try {
            mediaFormatM5726a = m5726a(this.mOutputWidth, this.mOutputHeight, this.f6405a, this.f6387I, this.f6386H, this.f6388J, this.f6389K, this.f6392N);
        } catch (Exception e10) {
            e = e10;
            c10 = 1;
        }
        if (mediaFormatM5726a == null) {
            this.f6434y = true;
            return false;
        }
        this.f6426q = MediaCodec.createEncoderByType("video/avc");
        c10 = 2;
        try {
            if (this.mEncFmt != null) {
                for (int i10 = 0; i10 < this.mEncFmt.length(); i10++) {
                    try {
                        JSONObject jSONObject = this.mEncFmt.getJSONObject(i10);
                        mediaFormatM5726a.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                    } catch (Exception e11) {
                        TXCLog.m4998w("TXCHWVideoEncoder", "config custom format error " + e11.toString());
                    }
                }
            }
            try {
                this.f6426q.configure(mediaFormatM5726a, (Surface) null, (MediaCrypto) null, 1);
                TXCLog.m4994i("TXCHWVideoEncoder", "configure format =  " + mediaFormatM5726a.toString());
            } catch (Exception e12) {
                e12.printStackTrace();
                if (this.f6392N) {
                    try {
                        this.f6426q.configure(m5726a(this.mOutputWidth, this.mOutputHeight, this.f6405a, this.f6387I, this.f6386H, this.f6388J, this.f6389K, false), (Surface) null, (MediaCrypto) null, 1);
                    } catch (Exception e13) {
                        if ((e13 instanceof IllegalArgumentException) || (e13 instanceof MediaCodec.CodecException)) {
                            this.f6426q.configure(m5725a(this.mOutputWidth, this.mOutputHeight, this.f6405a, this.f6387I, this.f6386H), (Surface) null, (MediaCrypto) null, 1);
                        }
                        e12.printStackTrace();
                    }
                } else {
                    if (!(e12 instanceof IllegalArgumentException) && !(e12 instanceof MediaCodec.CodecException)) {
                        throw e12;
                    }
                    this.f6426q.configure(m5725a(this.mOutputWidth, this.mOutputHeight, this.f6405a, this.f6387I, this.f6386H), (Surface) null, (MediaCrypto) null, 1);
                }
            }
            this.f6433x = this.f6426q.createInputSurface();
            this.f6426q.start();
        } catch (Exception e14) {
            e = e14;
        }
        try {
            this.f6380B = this.f6426q.getOutputBuffers();
        } catch (Exception e15) {
            e = e15;
            c10 = 5;
            TXCLog.m4992e("TXCHWVideoEncoder", "create encode format failed.", e);
            if (c10 >= 5) {
                try {
                    MediaCodec mediaCodec = this.f6426q;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                    }
                } catch (Exception unused) {
                }
            }
            this.f6426q = null;
            Surface surface2 = this.f6433x;
            if (surface2 != null) {
                surface2.release();
            }
            this.f6433x = null;
            if (this.f6426q == null) {
            }
            this.f6434y = true;
            return false;
        }
        if (this.f6426q == null && this.f6380B != null && (surface = this.f6433x) != null) {
            if (m5731a(surface, this.mOutputWidth, this.mOutputHeight)) {
                return true;
            }
            this.f6434y = true;
            return false;
        }
        this.f6434y = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5746d() {
        MediaCodec mediaCodec = this.f6426q;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                try {
                    mediaCodec.stop();
                    this.f6426q.release();
                    Surface surface = this.f6433x;
                    if (surface != null) {
                        surface.release();
                    }
                    this.f6433x = null;
                } catch (Throwable th) {
                    try {
                        this.f6426q.release();
                        Surface surface2 = this.f6433x;
                        if (surface2 != null) {
                            surface2.release();
                        }
                        this.f6433x = null;
                    } catch (Exception e10) {
                        TXCLog.m4992e("TXCHWVideoEncoder", "release encoder failed.", e10);
                    }
                    throw th;
                }
            } catch (IllegalStateException e11) {
                TXCLog.m4992e("TXCHWVideoEncoder", "stop encoder failed.", e11);
                this.f6426q.release();
                Surface surface3 = this.f6433x;
                if (surface3 != null) {
                    surface3.release();
                }
                this.f6433x = null;
            }
        } catch (Exception e12) {
            TXCLog.m4992e("TXCHWVideoEncoder", "release encoder failed.", e12);
        }
        this.f6426q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5737b() {
        TXCLog.m4994i("TXCHWVideoEncoder", "HWVideoEncode destroyGL");
        C6565f c6565f = this.mEncodeFilter;
        if (c6565f != null) {
            c6565f.m4847d();
            this.mEncodeFilter = null;
        }
        Object obj = this.f6432w;
        if (obj instanceof C6560a) {
            ((C6560a) obj).m4794c();
            this.f6432w = null;
        }
        Object obj2 = this.f6432w;
        if (obj2 instanceof C6561b) {
            ((C6561b) obj2).m4804c();
            this.f6432w = null;
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private MediaFormat m5725a(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 0 || i11 == 0 || i12 == 0 || i13 == 0) {
            return null;
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i11);
        mediaFormatCreateVideoFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i12 * 1024);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i13);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i14);
        return mediaFormatCreateVideoFormat;
    }

    @TargetApi(16)
    /* renamed from: a */
    private MediaFormat m5726a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        MediaFormat mediaFormatM5725a = m5725a(i10, i11, i12, i13, i14);
        if (mediaFormatM5725a == null) {
            return null;
        }
        MediaCodecInfo mediaCodecInfoM5724a = m5724a("video/avc");
        if (mediaCodecInfoM5724a != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoM5724a.getCapabilitiesForType("video/avc");
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
            if (z10 || encoderCapabilities.isBitrateModeSupported(i15)) {
                mediaFormatM5725a.setInteger("bitrate-mode", i15);
            } else if (this.f6390L) {
                if (encoderCapabilities.isBitrateModeSupported(1)) {
                    mediaFormatM5725a.setInteger("bitrate-mode", 1);
                } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                    mediaFormatM5725a.setInteger("bitrate-mode", 2);
                }
            } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                mediaFormatM5725a.setInteger("bitrate-mode", 2);
            }
            mediaFormatM5725a.setInteger("complexity", ((Integer) encoderCapabilities.getComplexityRange().clamp(5)).intValue());
            int i17 = 0;
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                int i18 = codecProfileLevel.profile;
                if (i18 <= i16 && i18 > i17) {
                    mediaFormatM5725a.setInteger("profile", i18);
                    mediaFormatM5725a.setInteger("level", codecProfileLevel.level);
                    i17 = i18;
                }
            }
        }
        return mediaFormatM5725a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* renamed from: b */
    public void m5738b(int i10) {
        int iM5721a;
        if (this.f6434y || this.f6432w == null) {
            return;
        }
        int i11 = this.f6399U;
        if (this.f6391M) {
            this.f6399U = -1;
            if (i11 == -1) {
                this.f6400V = true;
                return;
            } else {
                this.f6398T++;
                this.f6427r.m5064a(this.f6429t, 1000 / this.f6387I);
            }
        }
        m5727a(this.f6382D);
        int i12 = (720 - this.mRotation) % 360;
        this.mEncodeFilter.m4836a(this.mInputWidth, this.mInputHeight, i12, null, ((i12 == 90 || i12 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i12 == 90 || i12 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, true);
        this.mEncodeFilter.m4832a(i11);
        Object obj = this.f6432w;
        if (obj instanceof C6561b) {
            ((C6561b) obj).m4802a(this.f6382D * AnimationKt.MillisToNanos);
            ((C6561b) this.f6432w).m4805d();
        }
        Object obj2 = this.f6432w;
        if (obj2 instanceof C6560a) {
            ((C6560a) obj2).m4792a();
        }
        do {
            iM5721a = m5721a(i10);
        } while (iM5721a > 0);
        if (iM5721a != -1 && iM5721a != -2) {
            this.f6393O++;
            return;
        }
        if (iM5721a == -1) {
            callDelegate(10000005);
        }
        this.f6434y = true;
        m5750e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5747d(int i10) throws Exception {
        if (i10 == 0 || this.f6387I == i10) {
            return;
        }
        TXCLog.m4994i("TXCHWVideoEncoder", "set fps " + i10 + ", restart encoder.");
        m5737b();
        m5746d();
        this.f6387I = i10;
        m5744c();
    }

    @TargetApi(16)
    /* renamed from: a */
    private static MediaCodecInfo m5724a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5727a(long j10) {
        this.f6431v.add(Long.valueOf(j10));
    }

    /* renamed from: a */
    private long m5723a() {
        Long lPoll = this.f6431v.poll();
        if (lPoll == null) {
            return 0L;
        }
        return lPoll.longValue();
    }

    /* renamed from: a */
    private boolean m5731a(Surface surface, int i10, int i11) {
        if (surface == null) {
            return false;
        }
        TXCLog.m4994i("TXCHWVideoEncoder", "HWVideoEncode createGL: " + this.mGLContextExternal);
        Object obj = this.mGLContextExternal;
        if (obj != null && (obj instanceof EGLContext)) {
            this.f6432w = C6561b.m4798a(null, (EGLContext) obj, surface, i10, i11);
        } else {
            this.f6432w = C6560a.m4788a(null, (javax.microedition.khronos.egl.EGLContext) obj, surface, i10, i11);
        }
        if (this.f6432w == null) {
            return false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C6565f c6565f = new C6565f();
        this.mEncodeFilter = c6565f;
        c6565f.m4841a(C6568i.f5283e, C6568i.m4866a(EnumC6567h.NORMAL, false, false));
        if (!this.mEncodeFilter.mo4842a()) {
            this.mEncodeFilter = null;
            return false;
        }
        GLES20.glViewport(0, 0, i10, i11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5743c(int i10) {
        long j10 = this.f6418i;
        int i11 = this.f6405a;
        if (j10 == i11) {
            return;
        }
        boolean z10 = false;
        if (i11 < j10 && this.f6408ac) {
            if (this.f6407ab) {
                String str = "restart video hw encoder when down bps。[module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + "]";
                TXCLog.m4998w("TXCHWVideoEncoder", str);
                Monitor.m5001a(2, str, "", 0);
                z10 = true;
            } else {
                this.f6404Z = 3;
                this.f6403Y = System.currentTimeMillis();
                this.f6406aa = this.f6405a;
            }
        }
        this.f6418i = this.f6405a;
        if (this.f6426q != null) {
            if (z10) {
                this.f6427r.m5062a().removeCallbacks(this.f6410ae);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j11 = this.f6409ad;
                if (jCurrentTimeMillis - j11 >= 2000) {
                    this.f6410ae.run();
                    return;
                } else {
                    this.f6427r.m5064a(this.f6410ae, 2000 - (jCurrentTimeMillis - j11));
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.f6405a * 1024);
            this.f6426q.setParameters(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* renamed from: a */
    public boolean m5732a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int i10;
        this.f6435z = false;
        this.f6434y = false;
        this.f6411b = 0L;
        this.f6412c = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.f6413d = 0L;
        this.f6414e = 0L;
        this.f6415f = 0;
        this.f6418i = 0L;
        this.f6419j = tXSVideoEncoderParam.baseGopIndex;
        this.f6420k = 0L;
        this.f6421l = tXSVideoEncoderParam.baseFrameIndex;
        this.f6422m = 0L;
        this.f6424o = 0L;
        this.f6425p = 0L;
        this.f6380B = null;
        this.f6381C = null;
        this.f6382D = 0L;
        this.f6385G = -1;
        this.mOutputWidth = tXSVideoEncoderParam.width;
        this.mOutputHeight = tXSVideoEncoderParam.height;
        this.f6386H = tXSVideoEncoderParam.gop;
        this.f6387I = tXSVideoEncoderParam.fps;
        TXCLog.m4994i("TXCHWVideoEncoder", "init with fps " + this.f6387I);
        this.f6390L = tXSVideoEncoderParam.fullIFrame;
        this.f6423n = tXSVideoEncoderParam.syncOutput;
        this.f6379A = tXSVideoEncoderParam.enableEGL14;
        this.f6392N = tXSVideoEncoderParam.forceSetBitrateMode;
        this.f6431v.clear();
        this.f6391M = tXSVideoEncoderParam.bLimitFps;
        if (tXSVideoEncoderParam.width != 0 && (i10 = tXSVideoEncoderParam.height) != 0 && tXSVideoEncoderParam.fps != 0 && tXSVideoEncoderParam.gop != 0) {
            this.f6416g = tXSVideoEncoderParam.annexb;
            this.f6417h = tXSVideoEncoderParam.appendSpsPps;
            if (this.f6405a == 0) {
                this.f6405a = (int) (Math.sqrt((r2 * r2 * 1.0d) + (i10 * i10)) * 1.2d);
            }
            this.f6418i = this.f6405a;
            this.f6415f = tXSVideoEncoderParam.fps;
            int i11 = tXSVideoEncoderParam.encoderMode;
            int i12 = 2;
            if (i11 != 1) {
                if (i11 == 2) {
                    i12 = 1;
                } else if (i11 == 3) {
                    i12 = 0;
                }
            }
            if (C6573c.m4883a().m4912c() == 1) {
                tXSVideoEncoderParam.encoderProfile = 1;
            }
            this.f6388J = i12;
            this.f6389K = 1;
            if (!m5744c()) {
                return false;
            }
            this.mInit = true;
            if (this.f6391M) {
                this.f6399U = -1;
                this.f6427r.m5065b(this.f6429t);
            }
            this.f6401W = new ArrayList<>();
            this.f6402X = 0;
            return true;
        }
        this.f6434y = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m5721a(int r36) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.C6721a.m5721a(int):int");
    }

    /* renamed from: a */
    private byte[] m5735a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 20];
        int i10 = 0;
        int i11 = 0;
        int iM5722a = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            if (b10 == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 1) {
                bArr2 = bArr;
                iM5722a = m5722a(i10, i11, bArr3, bArr2, iM5722a);
                i10 += 3;
            } else {
                bArr2 = bArr;
                if (b10 == 0 && bArr2[i10 + 1] == 0 && bArr2[i10 + 2] == 0 && bArr2[i10 + 3] == 1) {
                    iM5722a = m5722a(i10, i11, bArr3, bArr2, iM5722a);
                    i10 += 4;
                }
                if (i10 != length - 4 && (bArr2[i10 + 1] != 0 || bArr2[i10 + 2] != 0 || bArr2[i10 + 3] != 1)) {
                    i10 = length;
                    break;
                }
                i10++;
                bArr = bArr2;
            }
            i11 = i10;
            if (i10 != length - 4) {
            }
            i10++;
            bArr = bArr2;
        }
        bArr2 = bArr;
        int iM5722a2 = m5722a(i10, i11, bArr3, bArr2, iM5722a);
        byte[] bArr4 = new byte[iM5722a2];
        System.arraycopy(bArr3, 0, bArr4, 0, iM5722a2);
        return bArr4;
    }

    /* renamed from: a */
    private int m5722a(int i10, int i11, byte[] bArr, byte[] bArr2, int i12) {
        if (i11 > 0 && i10 > i11) {
            int i13 = i10 - i11;
            try {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[4]);
                byteBufferWrap.asIntBuffer().put(i13);
                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                System.arraycopy(byteBufferWrap.array(), 0, bArr, i12, 4);
                System.arraycopy(bArr2, i11, bArr, i12 + 4, i13);
                return i12 + i13 + 4;
            } catch (Exception unused) {
                TXCLog.m4991e("TXCHWVideoEncoder", "setNalData exception");
            }
        }
        return i12;
    }
}

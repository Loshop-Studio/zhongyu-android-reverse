package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import androidx.work.WorkRequest;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.audio.InterfaceC6543c;
import com.tencent.liteav.audio.InterfaceC6544d;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p046a.C6556a;
import com.tencent.liteav.basic.p046a.EnumC6557b;
import com.tencent.liteav.basic.p047b.InterfaceC6558a;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.structs.C6585a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.InterfaceC6645h;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.p045a.C6527a;
import com.tencent.liteav.renderer.C6673a;
import com.tencent.liteav.renderer.C6680h;
import com.tencent.liteav.renderer.InterfaceC6679g;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.tencent.liteav.c */
/* loaded from: classes4.dex */
public class C6600c extends AbstractC6606i implements TXCRenderAndDec.InterfaceC6524a, TXCRenderAndDec.InterfaceC6525b, InterfaceC6543c, InterfaceC6544d, InterfaceC6559b, InterfaceC6645h, C6673a.a, InterfaceC6679g {

    /* renamed from: A */
    private C6680h f5555A;

    /* renamed from: B */
    private C6680h f5556B;

    /* renamed from: C */
    private float[] f5557C;

    /* renamed from: D */
    private float[] f5558D;

    /* renamed from: E */
    private String f5559E;

    /* renamed from: F */
    private int f5560F;

    /* renamed from: G */
    private boolean f5561G;

    /* renamed from: H */
    private EnumC6557b f5562H;

    /* renamed from: I */
    private Object f5563I;

    /* renamed from: J */
    private InterfaceC6558a f5564J;

    /* renamed from: K */
    private TXLivePlayer.ITXAudioRawDataListener f5565K;

    /* renamed from: L */
    private String f5566L;

    /* renamed from: M */
    private boolean f5567M;

    /* renamed from: N */
    private long f5568N;

    /* renamed from: O */
    private long f5569O;

    /* renamed from: P */
    private a f5570P;

    /* renamed from: a */
    private TXCRenderAndDec f5571a;

    /* renamed from: f */
    private C6673a f5572f;

    /* renamed from: g */
    private TXCStreamDownloader f5573g;

    /* renamed from: h */
    private Handler f5574h;

    /* renamed from: i */
    private TextureView f5575i;

    /* renamed from: j */
    private boolean f5576j;

    /* renamed from: k */
    private boolean f5577k;

    /* renamed from: l */
    private int f5578l;

    /* renamed from: m */
    private int f5579m;

    /* renamed from: n */
    private int f5580n;

    /* renamed from: o */
    private boolean f5581o;

    /* renamed from: p */
    private Surface f5582p;

    /* renamed from: q */
    private int f5583q;

    /* renamed from: r */
    private int f5584r;

    /* renamed from: s */
    private int f5585s;

    /* renamed from: t */
    private boolean f5586t;

    /* renamed from: u */
    private boolean f5587u;

    /* renamed from: v */
    private C6527a f5588v;

    /* renamed from: w */
    private TXRecordCommon.ITXVideoRecordListener f5589w;

    /* renamed from: x */
    private C6554b f5590x;

    /* renamed from: y */
    private int f5591y;

    /* renamed from: z */
    private int f5592z;

    /* renamed from: com.tencent.liteav.c$a */
    public static class a implements Runnable {

        /* renamed from: a */
        private WeakReference<C6600c> f5603a;

        public a(C6600c c6600c) {
            this.f5603a = new WeakReference<>(c6600c);
        }

        @Override // java.lang.Runnable
        public void run() {
            C6600c c6600c = this.f5603a.get();
            if (c6600c == null) {
                return;
            }
            c6600c.m5122h();
            c6600c.m5091v();
        }
    }

    public C6600c(Context context) {
        super(context);
        this.f5571a = null;
        this.f5572f = null;
        this.f5573g = null;
        this.f5576j = false;
        this.f5577k = false;
        this.f5578l = 100;
        this.f5579m = 0;
        this.f5580n = 0;
        this.f5581o = false;
        this.f5583q = 2;
        this.f5584r = 48000;
        this.f5585s = 16;
        this.f5586t = false;
        this.f5587u = false;
        this.f5591y = 0;
        this.f5592z = 0;
        this.f5555A = null;
        this.f5556B = null;
        this.f5557C = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.f5558D = new float[16];
        this.f5559E = "";
        this.f5561G = false;
        this.f5562H = EnumC6557b.UNKNOWN;
        this.f5563I = null;
        this.f5564J = new InterfaceC6558a() { // from class: com.tencent.liteav.c.1
            @Override // com.tencent.liteav.basic.p047b.InterfaceC6558a
            /* renamed from: a */
            public void mo4786a(String str, int i10, String str2, String str3) {
                TXCLog.m4994i("TXCLivePlayer", "onEvent => id:" + str + " code:" + i10 + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC6559b> weakReference = C6600c.this.f5682e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("EVT_ID", i10);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, sb.toString());
                    }
                    C6600c.this.onNotifyEvent(i10, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.p047b.InterfaceC6558a
            /* renamed from: b */
            public void mo4787b(String str, int i10, String str2, String str3) {
                TXCLog.m4991e("TXCLivePlayer", "onError => id:" + str + " code:" + i10 + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC6559b> weakReference = C6600c.this.f5682e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("EVT_ID", i10);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, sb.toString());
                    }
                    C6600c.this.onNotifyEvent(i10, bundle);
                }
            }
        };
        this.f5566L = "";
        this.f5567M = false;
        this.f5568N = 0L;
        this.f5569O = 0L;
        this.f5570P = null;
        C6573c.m4883a().m4909a(context);
        TXCAudioEngine.CreateInstance(context, C6573c.m4883a().m4911b());
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.f5564J));
        long jM4908a = C6573c.m4883a().m4908a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice(jM4908a == 1 || jM4908a == -1);
        this.f5574h = new Handler(Looper.getMainLooper());
        C6673a c6673a = new C6673a();
        this.f5572f = c6673a;
        c6673a.m5492a((InterfaceC6559b) this);
        this.f5570P = new a(this);
    }

    /* renamed from: j */
    private void m5080j() {
        if (this.f5588v == null) {
            this.f5591y = this.f5572f.m5506i();
            this.f5592z = this.f5572f.m5507j();
            C6527a.a aVarM5082l = m5082l();
            C6527a c6527a = new C6527a(this.f5680c);
            this.f5588v = c6527a;
            c6527a.m4714a(aVarM5082l);
            this.f5588v.m4715a(new C6527a.b() { // from class: com.tencent.liteav.c.2
                @Override // com.tencent.liteav.p045a.C6527a.b
                /* renamed from: a */
                public void mo4722a(int i10, String str, String str2, String str3) {
                    if (C6600c.this.f5589w != null) {
                        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                        if (i10 == 0) {
                            tXRecordResult.retCode = 0;
                        } else {
                            tXRecordResult.retCode = -1;
                        }
                        tXRecordResult.descMsg = str;
                        tXRecordResult.videoPath = str2;
                        tXRecordResult.coverPath = str3;
                        C6600c.this.f5589w.onRecordComplete(tXRecordResult);
                    }
                    C6600c.this.f5572f.m5431a((InterfaceC6679g) null);
                    C6600c.this.f5572f.m5430a((C6673a.a) null);
                }

                @Override // com.tencent.liteav.p045a.C6527a.b
                /* renamed from: a */
                public void mo4723a(long j10) {
                    if (C6600c.this.f5589w != null) {
                        C6600c.this.f5589w.onRecordProgress(j10);
                    }
                }
            });
        }
        if (this.f5555A == null) {
            C6680h c6680h = new C6680h(Boolean.TRUE);
            this.f5555A = c6680h;
            c6680h.m5523b();
            this.f5555A.m5525b(this.f5591y, this.f5592z);
            this.f5555A.m5519a(this.f5591y, this.f5592z);
        }
        if (this.f5556B == null) {
            C6680h c6680h2 = new C6680h(Boolean.FALSE);
            this.f5556B = c6680h2;
            c6680h2.m5523b();
            this.f5556B.m5525b(this.f5572f.m5504g(), this.f5572f.m5505h());
            this.f5556B.m5519a(this.f5572f.m5504g(), this.f5572f.m5505h());
            Matrix.setIdentityM(this.f5558D, 0);
        }
    }

    /* renamed from: k */
    private void m5081k() {
        C6680h c6680h = this.f5555A;
        if (c6680h != null) {
            c6680h.m5526c();
            this.f5555A = null;
        }
        C6680h c6680h2 = this.f5556B;
        if (c6680h2 != null) {
            c6680h2.m5526c();
            this.f5556B = null;
        }
    }

    /* renamed from: l */
    private C6527a.a m5082l() {
        int i10;
        int i11 = this.f5591y;
        if (i11 <= 0 || (i10 = this.f5592z) <= 0) {
            i11 = 480;
            i10 = TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR;
        }
        C6527a.a aVar = new C6527a.a();
        aVar.f5076a = i11;
        aVar.f5077b = i10;
        aVar.f5078c = 20;
        aVar.f5079d = (int) (Math.sqrt((i11 * i11 * 1.0d) + (i10 * i10)) * 1.2d);
        aVar.f5083h = this.f5583q;
        aVar.f5084i = this.f5584r;
        aVar.f5085j = this.f5585s;
        aVar.f5081f = C6527a.m4705a(this.f5680c, ".mp4");
        aVar.f5082g = C6527a.m4705a(this.f5680c, ".jpg");
        aVar.f5080e = this.f5572f.m5433b();
        TXCLog.m4989d("TXCLivePlayer", "record config: " + aVar);
        return aVar;
    }

    /* renamed from: m */
    private void m5083m() {
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stop();
            this.f5571a.setVideoRender(null);
            this.f5571a.setDecListener(null);
            this.f5571a.setNotifyListener(null);
            this.f5571a = null;
        }
    }

    /* renamed from: n */
    private void m5084n() {
        boolean z10 = this.f5560F == 5;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(this.f5561G, 300);
        mo5107a(this.f5565K);
        if (this.f5560F == 5) {
            TXCAudioEngine tXCAudioEngine = TXCAudioEngine.getInstance();
            String str = this.f5566L;
            boolean z11 = !this.f5679b.f5610g;
            float f10 = C6556a.f5159b;
            tXCAudioEngine.setRemoteAudioCacheParams(str, z11, (int) (f10 * 1000.0f), (int) (f10 * 1000.0f), (int) (C6556a.f5160c * 1000.0f));
        } else {
            TXCAudioEngine tXCAudioEngine2 = TXCAudioEngine.getInstance();
            String str2 = this.f5566L;
            C6601d c6601d = this.f5679b;
            tXCAudioEngine2.setRemoteAudioCacheParams(str2, !c6601d.f5610g, (int) (c6601d.f5604a * 1000.0f), (int) (c6601d.f5606c * 1000.0f), (int) (c6601d.f5605b * 1000.0f));
        }
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f5566L, this.f5576j);
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f5566L, this.f5577k);
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f5566L, this.f5578l);
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f5566L, this);
        m5094y();
        TXCAudioEngine.getInstance().startRemoteAudio(this.f5566L, z10);
    }

    /* renamed from: o */
    private void m5085o() {
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f5566L, null);
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f5566L, null);
        TXCAudioEngine.getInstance().stopRemoteAudio(this.f5566L);
    }

    /* renamed from: p */
    private void m5086p() {
        TXCStreamDownloader tXCStreamDownloader = this.f5573g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setListener(null);
            this.f5573g.setNotifyListener(null);
            this.f5573g.stop();
            this.f5573g = null;
        }
    }

    /* renamed from: r */
    private void m5087r() {
        C6554b c6554b = new C6554b(this.f5680c);
        this.f5590x = c6554b;
        c6554b.m4778a(this.f5559E);
        this.f5590x.m4779a(this.f5560F == 5);
        this.f5590x.m4784d(this.f5566L);
        this.f5590x.m4785e(this.f5573g.getRTMPProxyUserId());
        this.f5590x.m4776a();
    }

    /* renamed from: s */
    private void m5088s() {
        C6554b c6554b = this.f5590x;
        if (c6554b != null) {
            c6554b.m4780b();
            this.f5590x = null;
        }
    }

    /* renamed from: t */
    private void m5089t() {
        this.f5567M = false;
        m5094y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m5090u() {
        if (this.f5568N > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (this.f5568N / 1000));
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) this.f5568N);
            onNotifyEvent(2005, bundle);
        }
        Handler handler = this.f5574h;
        if (handler == null || !this.f5567M) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (C6600c.this.f5567M) {
                    C6600c.this.m5090u();
                }
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m5091v() {
        Handler handler = this.f5574h;
        if (handler != null) {
            handler.postDelayed(this.f5570P, 2000L);
        }
    }

    /* renamed from: w */
    private void m5092w() {
        Handler handler = this.f5574h;
        if (handler != null) {
            handler.removeCallbacks(this.f5570P);
        }
    }

    /* renamed from: x */
    private void m5093x() {
        ArrayList arrayList = new ArrayList();
        String str = this.f5566L;
        if (str != null) {
            arrayList.add(str);
        }
        C6526a.m4702a("18446744073709551615", arrayList);
    }

    /* renamed from: y */
    private void m5094y() {
        if (this.f5586t || this.f5565K != null || this.f5567M) {
            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f5566L, this);
        }
        if (this.f5586t || this.f5565K != null || this.f5567M) {
            return;
        }
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f5566L, null);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: f */
    public boolean mo5120f() {
        return true;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: g */
    public void mo5121g() {
        this.f5569O = 0L;
        if (this.f5567M) {
            return;
        }
        this.f5567M = true;
        m5094y();
        Handler handler = this.f5574h;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C6600c.this.f5567M) {
                        C6600c.this.m5090u();
                    }
                }
            }, 1000L);
        }
    }

    /* renamed from: h */
    public void m5122h() {
        m5093x();
        int[] iArrM5047a = C6592e.m5047a();
        String str = (iArrM5047a[0] / 10) + "/" + (iArrM5047a[1] / 10) + "%";
        int iM5012c = TXCStatus.m5012c(this.f5566L, 7102);
        int iM5012c2 = TXCStatus.m5012c(this.f5566L, 7101);
        String strM5009b = TXCStatus.m5009b(this.f5566L, 7110);
        int iM5014d = (int) TXCStatus.m5014d(this.f5566L, 6002);
        Bundle bundle = new Bundle();
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, c6673a.m5506i());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, this.f5572f.m5507j());
        }
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, (int) tXCRenderAndDec.getVideoCacheDuration());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, (int) this.f5571a.getVideoCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, this.f5571a.getVideoDecCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, (int) this.f5571a.getAVPlayInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, (int) this.f5571a.getAVNetRecvInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((TXCStatus.m5012c(this.f5566L, 7120) * 10) / (iM5014d == 0 ? 15 : iM5014d)) / 10.0f) + 0.5d));
        }
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.m5012c(this.f5566L, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + "," + TXCStatus.m5012c(this.f5566L, TXLiteAVCode.EVT_VIDEO_DECODER_CACHE_TOO_MANY_FRAMES) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + "," + TXCAudioEngine.getInstance().getPlayChannels());
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, TXCStatus.m5012c(this.f5566L, 2007));
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_JITTER, TXCStatus.m5012c(this.f5566L, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, ((float) TXCStatus.m5012c(this.f5566L, TXLiteAVCode.EVT_HW_DECODER_START_SUCC)) / 1000.0f);
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, iM5012c2 + iM5012c);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, iM5014d);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE, iM5012c2);
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE, iM5012c);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_SERVER_IP, strM5009b);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, str);
        C6592e.m5040a(this.f5682e, 15001, bundle);
        TXCRenderAndDec tXCRenderAndDec2 = this.f5571a;
        if (tXCRenderAndDec2 != null) {
            tXCRenderAndDec2.updateLoadInfo();
        }
        C6554b c6554b = this.f5590x;
        if (c6554b != null) {
            c6554b.m4783d();
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: i */
    public int mo5123i() {
        return TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(this.f5566L);
    }

    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    public void onNotifyEvent(final int i10, final Bundle bundle) {
        if (2003 == i10 || 2026 == i10) {
            if (this.f5587u) {
                m5071a(2004, "Video play started");
                this.f5587u = false;
            }
            if (2026 == i10) {
                TXCStatus.m5008a(this.f5566L, 2033, Long.valueOf(TXCTimeUtil.getTimeTick()));
                return;
            }
        }
        if (2025 == i10) {
            m5071a(2004, "Video play started");
            return;
        }
        if (2023 == i10 || 2024 == i10) {
            m5071a(2007, "Video play loading");
            return;
        }
        Handler handler = this.f5574h;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.c.6
                @Override // java.lang.Runnable
                public void run() {
                    C6592e.m5040a(C6600c.this.f5682e, i10, bundle);
                    if (i10 != 2103 || C6600c.this.f5571a == null) {
                        return;
                    }
                    C6600c.this.f5571a.restartDecoder();
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullAudio(C6585a c6585a) {
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        if (this.f5581o) {
            try {
                TXCRenderAndDec tXCRenderAndDec = this.f5571a;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.decVideo(tXSNALPacket);
                }
            } catch (Exception e10) {
                TXCLog.m4991e("TXCLivePlayer", "decode video failed." + e10.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.renderer.C6673a.a
    public void onTextureProcess(int i10, int i11, int i12, int i13) {
        C6680h c6680h;
        C6527a c6527a = this.f5588v;
        if (this.f5586t && c6527a != null && (c6680h = this.f5556B) != null) {
            c6680h.m5521a(this.f5557C);
            c6527a.m4710a(this.f5556B.m5528d(i10), TXCTimeUtil.getTimeTick());
            this.f5556B.m5521a(this.f5558D);
            this.f5556B.m5527c(i10);
        }
        if (this.f5586t) {
            m5080j();
        } else {
            m5081k();
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5108a(TXCloudVideoView tXCloudVideoView) {
        TextureView videoView;
        TXCloudVideoView tXCloudVideoView2 = this.f5681d;
        if (tXCloudVideoView2 != null && tXCloudVideoView2 != tXCloudVideoView && (videoView = tXCloudVideoView2.getVideoView()) != null) {
            this.f5681d.removeView(videoView);
        }
        super.mo5108a(tXCloudVideoView);
        TXCloudVideoView tXCloudVideoView3 = this.f5681d;
        if (tXCloudVideoView3 != null) {
            TextureView videoView2 = tXCloudVideoView3.getVideoView();
            this.f5575i = videoView2;
            if (videoView2 == null) {
                this.f5575i = new TextureView(this.f5681d.getContext());
            }
            this.f5681d.addVideoView(this.f5575i);
        }
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            c6673a.m5491a(this.f5575i);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5111b() throws ClassNotFoundException {
        mo5097a(this.f5559E, this.f5560F);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public boolean mo5116c() {
        return this.f5581o;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: d */
    public int mo5117d(int i10) {
        if (this.f5586t) {
            TXCLog.m4991e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
            return -1;
        }
        this.f5586t = true;
        this.f5572f.m5431a((InterfaceC6679g) this);
        this.f5572f.m5430a((C6673a.a) this);
        m5094y();
        TXCDRApi.txReportDAU(this.f5680c, C6574a.f5391av);
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: e */
    public int mo5119e() {
        if (!this.f5586t) {
            TXCLog.m4998w("TXCLivePlayer", "stopRecord: no recording task exist");
            return -1;
        }
        this.f5586t = false;
        m5094y();
        C6527a c6527a = this.f5588v;
        if (c6527a != null) {
            c6527a.m4708a();
            this.f5588v = null;
        }
        return 0;
    }

    /* renamed from: f */
    private void m5079f(int i10) {
        TextureView textureView = this.f5575i;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.f5680c);
        this.f5571a = tXCRenderAndDec;
        tXCRenderAndDec.setNotifyListener(this);
        this.f5571a.setVideoRender(this.f5572f);
        this.f5571a.setDecListener(this);
        this.f5571a.setRenderAndDecDelegate(this);
        this.f5571a.setConfig(this.f5679b);
        this.f5571a.setID(this.f5566L);
        this.f5571a.start(i10 == 5);
        this.f5571a.setRenderMode(this.f5580n);
        this.f5571a.setRenderRotation(this.f5579m);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5112b(int i10) {
        this.f5579m = i10;
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderRotation(i10);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public void mo5115c(boolean z10) {
        this.f5577k = z10;
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f5566L, z10);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public void mo5114c(int i10) {
        this.f5578l = i10;
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f5566L, this.f5578l);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5113b(boolean z10) {
        this.f5576j = z10;
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f5566L, this.f5576j);
    }

    /* renamed from: c */
    private int m5074c(String str, int i10) {
        if (i10 == 0) {
            this.f5573g = new TXCStreamDownloader(this.f5680c, 1);
        } else if (i10 == 5) {
            this.f5573g = new TXCStreamDownloader(this.f5680c, 4);
        } else {
            this.f5573g = new TXCStreamDownloader(this.f5680c, 0);
            if (!TextUtils.isEmpty(this.f5679b.f5615l)) {
                this.f5573g.setFlvSessionKey(this.f5679b.f5615l);
            }
        }
        this.f5573g.setID(this.f5566L);
        this.f5573g.setListener(this);
        this.f5573g.setNotifyListener(this);
        this.f5573g.setHeaders(this.f5679b.f5620q);
        if (i10 == 5) {
            this.f5573g.setRetryTimes(5);
            this.f5573g.setRetryInterval(1);
        } else {
            this.f5573g.setRetryTimes(this.f5679b.f5608e);
            this.f5573g.setRetryInterval(this.f5679b.f5609f);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f5573g;
        C6601d c6601d = this.f5679b;
        return tXCStreamDownloader.start(str, c6601d.f5612i, c6601d.f5616m, c6601d.f5613j, c6601d.f5614k);
    }

    /* renamed from: b */
    private void m5073b(String str) {
        String str2 = String.format("%s-%d", str, Long.valueOf(TXCTimeUtil.getTimeTick() % WorkRequest.MIN_BACKOFF_MILLIS));
        this.f5566L = str2;
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setID(str2);
        }
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            c6673a.setID(this.f5566L);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f5573g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setID(this.f5566L);
        }
        C6554b c6554b = this.f5590x;
        if (c6554b != null) {
            c6554b.m4784d(this.f5566L);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: d */
    public TextureView mo5118d() {
        return this.f5575i;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5103a(Surface surface) {
        this.f5582p = surface;
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            c6673a.m5490a(surface);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5101a(int i10, int i11) {
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            c6673a.m5500c(i10, i11);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5105a(C6601d c6601d) {
        super.mo5105a(c6601d);
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setConfig(c6601d);
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC6525b
    /* renamed from: b */
    public void mo4701b(String str, int i10) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!this.f5581o || (tXCStreamDownloader = this.f5573g) == null) {
            return;
        }
        tXCStreamDownloader.requestKeyFrame(this.f5559E);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public int mo5097a(String str, int i10) throws ClassNotFoundException {
        C6673a c6673a;
        if (mo5116c()) {
            TXCLog.m4998w("TXCLivePlayer", "play: ignore start play when is playing");
            return -2;
        }
        C6601d c6601d = this.f5679b;
        if (c6601d != null && c6601d.f5606c > c6601d.f5605b) {
            TXCLog.m4991e("TXCLivePlayer", "play: can not start play while invalid cache config [minAutoAdjustCacheTime(" + this.f5679b.f5606c + ") > maxAutoAdjustCacheTime(" + this.f5679b.f5605b + ")]!!!!!!");
            return -1;
        }
        float f10 = c6601d.f5604a;
        if (f10 > c6601d.f5605b || f10 < c6601d.f5606c) {
            TXCLog.m4998w("TXCLivePlayer", "play: invalid cacheTime " + this.f5679b.f5604a + ", need between minAutoAdjustCacheTime " + this.f5679b.f5606c + " and maxAutoAdjustCacheTime " + this.f5679b.f5605b + " , fix to maxAutoAdjustCacheTime");
            C6601d c6601d2 = this.f5679b;
            c6601d2.f5604a = c6601d2.f5605b;
        }
        this.f5559E = str;
        this.f5560F = i10;
        m5073b(str);
        this.f5581o = true;
        this.f5587u = true;
        m5079f(i10);
        m5084n();
        int iM5074c = m5074c(str, i10);
        if (iM5074c != 0) {
            this.f5581o = false;
            m5086p();
            m5083m();
            m5085o();
            TextureView textureView = this.f5575i;
            if (textureView != null) {
                textureView.setVisibility(8);
                return iM5074c;
            }
        } else {
            mo5103a(this.f5582p);
            m5087r();
            m5091v();
            if (this.f5562H == EnumC6557b.TEXTURE_2D && this.f5575i == null && (c6673a = this.f5572f) != null) {
                c6673a.mo5437c(this.f5563I);
            }
            TXCDRApi.txReportDAU(this.f5680c, C6574a.f5425bt);
            try {
                Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
                TXCDRApi.txReportDAU(this.f5680c, C6574a.f5401bE);
            } catch (Exception unused) {
            }
        }
        return iM5074c;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public int mo5098a(boolean z10) {
        C6673a c6673a;
        if (!mo5116c()) {
            TXCLog.m4998w("TXCLivePlayer", "play: ignore stop play when not started");
            return -2;
        }
        TXCLog.m4996v("TXCLivePlayer", "play: stop");
        this.f5581o = false;
        m5086p();
        m5083m();
        TextureView textureView = this.f5575i;
        if (textureView != null && z10) {
            textureView.setVisibility(8);
        }
        C6673a c6673a2 = this.f5572f;
        if (c6673a2 != null) {
            c6673a2.m5490a((Surface) null);
        }
        if (this.f5575i == null && (c6673a = this.f5572f) != null) {
            c6673a.mo5440e();
        }
        m5085o();
        m5088s();
        m5092w();
        m5089t();
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public int mo5096a(String str) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!mo5116c() || (tXCStreamDownloader = this.f5573g) == null) {
            return -1;
        }
        boolean zSwitchStream = tXCStreamDownloader.switchStream(str);
        if (this.f5571a != null) {
            TXCLog.m4998w("TXCLivePlayer", " stream_switch video cache " + this.f5571a.getVideoCacheDuration() + " audio cache " + TXCStatus.m5012c(this.f5566L, 2007));
        }
        if (!zSwitchStream) {
            return -2;
        }
        this.f5559E = str;
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5099a() {
        mo5098a(false);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5100a(int i10) {
        this.f5580n = i10;
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderMode(i10);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5102a(Context context, int i10) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setAudioRoute(i10);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5109a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f5589w = iTXVideoRecordListener;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5107a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.f5565K = iTXAudioRawDataListener;
        m5094y();
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5106a(InterfaceC6607j interfaceC6607j, EnumC6557b enumC6557b, Object obj) {
        C6673a c6673a;
        this.f5562H = enumC6557b;
        this.f5563I = obj;
        if (mo5116c() && this.f5562H == EnumC6557b.TEXTURE_2D && this.f5575i == null && interfaceC6607j != null && (c6673a = this.f5572f) != null) {
            c6673a.mo5437c(this.f5563I);
        }
        TXCRenderAndDec tXCRenderAndDec = this.f5571a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setVideoFrameListener(interfaceC6607j, enumC6557b);
        } else {
            TXCLog.m4998w("TXCLivePlayer", "setVideoFrameListener->enter with renderAndDec is empty");
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5104a(InterfaceC6570k interfaceC6570k) {
        C6673a c6673a = this.f5572f;
        if (c6673a != null) {
            c6673a.m5493a(interfaceC6570k);
        }
    }

    /* renamed from: a */
    private void m5071a(final int i10, String str) {
        if (this.f5682e != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("EVT_ID", i10);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            if (str != null) {
                bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
            }
            Handler handler = this.f5574h;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.c.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C6592e.m5040a(C6600c.this.f5682e, i10, bundle);
                    }
                });
            }
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC6679g
    /* renamed from: a */
    public int mo5095a(int i10, float[] fArr) {
        C6680h c6680h;
        C6527a c6527a = this.f5588v;
        if (this.f5586t && c6527a != null && (c6680h = this.f5555A) != null) {
            int iM5528d = c6680h.m5528d(i10);
            c6527a.m4710a(iM5528d, TXCTimeUtil.getTimeTick());
            this.f5572f.mo5427a(iM5528d, this.f5591y, this.f5592z, false, 0);
        }
        if (this.f5586t) {
            m5080j();
            return i10;
        }
        m5081k();
        return i10;
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC6524a
    /* renamed from: a */
    public void mo4700a(SurfaceTexture surfaceTexture) {
        m5081k();
        mo5119e();
    }

    @Override // com.tencent.liteav.audio.InterfaceC6544d
    /* renamed from: a */
    public void mo4736a(String str, byte[] bArr, long j10, int i10, int i11) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener;
        this.f5584r = i10;
        this.f5583q = i11;
        if (this.f5588v != null) {
            if (j10 <= 0) {
                j10 = TXCTimeUtil.getTimeTick();
            }
            this.f5588v.m4717a(bArr, j10);
        }
        if (this.f5569O <= 0 && (iTXAudioRawDataListener = this.f5565K) != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i10, i11, 16);
        }
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener2 = this.f5565K;
        if (iTXAudioRawDataListener2 != null) {
            iTXAudioRawDataListener2.onPcmDataAvailable(bArr, j10);
        }
        long j11 = this.f5569O;
        if (j11 <= 0) {
            this.f5569O = j10;
        } else {
            this.f5568N = j10 - j11;
        }
    }

    @Override // com.tencent.liteav.audio.InterfaceC6543c
    /* renamed from: a */
    public void mo4735a(String str, int i10, String str2) {
        onNotifyEvent(i10, null);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5110a(boolean z10, int i10) {
        this.f5561G = z10;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z10, i10);
    }
}

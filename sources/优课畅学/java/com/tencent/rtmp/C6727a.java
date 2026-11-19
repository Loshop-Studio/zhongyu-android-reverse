package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.AbstractC6606i;
import com.tencent.liteav.C6601d;
import com.tencent.liteav.C6602e;
import com.tencent.liteav.C6608k;
import com.tencent.liteav.InterfaceC6607j;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p046a.EnumC6557b;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.rtmp.a */
/* loaded from: classes4.dex */
public class C6727a implements InterfaceC6559b {

    /* renamed from: A */
    private long f6458A;

    /* renamed from: B */
    private String f6459B;

    /* renamed from: I */
    private TXLivePlayer.ITXAudioRawDataListener f6466I;

    /* renamed from: a */
    private TXCloudVideoView f6467a;

    /* renamed from: b */
    private Surface f6468b;

    /* renamed from: c */
    private int f6469c;

    /* renamed from: d */
    private int f6470d;

    /* renamed from: f */
    private TXLivePlayConfig f6472f;

    /* renamed from: i */
    private int f6475i;

    /* renamed from: j */
    private int f6476j;

    /* renamed from: r */
    private Context f6484r;

    /* renamed from: s */
    private Handler f6485s;

    /* renamed from: t */
    private AbstractC6606i f6486t;

    /* renamed from: y */
    private C6602e f6491y;

    /* renamed from: z */
    private boolean f6492z;

    /* renamed from: g */
    private boolean f6473g = false;

    /* renamed from: h */
    private boolean f6474h = true;

    /* renamed from: k */
    private String f6477k = "";

    /* renamed from: l */
    private boolean f6478l = false;

    /* renamed from: m */
    private int f6479m = 100;

    /* renamed from: n */
    private TXLivePlayer.ITXVideoRawDataListener f6480n = null;

    /* renamed from: o */
    private byte[] f6481o = null;

    /* renamed from: p */
    private Object f6482p = null;

    /* renamed from: q */
    private TXLivePlayer.ITXLivePlayVideoRenderListener f6483q = null;

    /* renamed from: u */
    private boolean f6487u = true;

    /* renamed from: v */
    private float f6488v = 1.0f;

    /* renamed from: w */
    private boolean f6489w = false;

    /* renamed from: x */
    private int f6490x = 0;

    /* renamed from: C */
    private int f6460C = -1;

    /* renamed from: D */
    private Vector<String> f6461D = new Vector<>();

    /* renamed from: E */
    private long f6462E = 0;

    /* renamed from: F */
    private TXLivePlayer.ITXAudioVolumeEvaluationListener f6463F = null;

    /* renamed from: G */
    private int f6464G = 0;

    /* renamed from: H */
    private a f6465H = null;

    /* renamed from: e */
    private ITXLivePlayListener f6471e = null;

    /* renamed from: com.tencent.rtmp.a$a */
    public class a implements Runnable {

        /* renamed from: b */
        private int f6502b;

        private a() {
            this.f6502b = 300;
        }

        /* renamed from: a */
        public void m5809a(int i10) {
            this.f6502b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6727a.this.f6486t != null && C6727a.this.f6486t.mo5116c()) {
                int iMo5123i = C6727a.this.f6486t.mo5123i();
                if (C6727a.this.f6463F != null) {
                    C6727a.this.f6463F.onAudioVolumeEvaluationNotify(iMo5123i);
                }
            }
            if (C6727a.this.f6485s == null || this.f6502b <= 0) {
                return;
            }
            C6727a.this.f6485s.postDelayed(C6727a.this.f6465H, this.f6502b);
        }
    }

    public C6727a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6484r = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
        this.f6485s = new Handler(Looper.getMainLooper());
        TXCCommonUtil.setAppContext(this.f6484r);
        TXCLog.init();
    }

    /* renamed from: h */
    private boolean m5775h() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3 A[PHI: r3
      0x00b3: PHI (r3v1 int) = (r3v0 int), (r3v0 int), (r3v2 int), (r3v2 int) binds: [B:23:0x0049, B:42:0x006f, B:60:0x0095, B:62:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8 A[PHI: r2
      0x00b8: PHI (r2v3 int) = 
      (r2v2 int)
      (r2v4 int)
      (r2v5 int)
      (r2v6 int)
      (r2v7 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v13 int)
      (r2v17 int)
     binds: [B:25:0x004d, B:27:0x0051, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:35:0x0061, B:37:0x0065, B:39:0x0069, B:41:0x006d, B:44:0x0073, B:46:0x0077, B:54:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba  */
    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotifyEvent(int r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.C6727a.onNotifyEvent(int, android.os.Bundle):void");
    }

    /* renamed from: f */
    private void m5771f() {
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            int i10 = this.f6464G;
            abstractC6606i.mo5110a(i10 > 0, i10);
            if (this.f6464G > 0) {
                if (this.f6465H == null) {
                    this.f6465H = new a();
                }
                this.f6465H.m5809a(this.f6464G);
                Handler handler = this.f6485s;
                if (handler != null) {
                    handler.removeCallbacks(this.f6465H);
                    this.f6485s.postDelayed(this.f6465H, this.f6464G);
                }
            }
        }
    }

    /* renamed from: g */
    private void m5774g() {
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5110a(false, 0);
        }
        Handler handler = this.f6485s;
        if (handler != null) {
            handler.removeCallbacks(this.f6465H);
        }
        this.f6465H = null;
        this.f6464G = 0;
    }

    /* renamed from: b */
    public void m5795b() {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api pause " + this);
        if (this.f6486t != null) {
            TXCLog.m4998w(TXLivePlayer.TAG, "pause play");
            this.f6486t.mo5099a();
        }
    }

    /* renamed from: c */
    public void m5799c() {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api resume " + this);
        if (this.f6486t != null) {
            TXCLog.m4998w(TXLivePlayer.TAG, "resume play");
            this.f6486t.mo5111b();
            if (this.f6486t.mo5120f()) {
                C6602e c6602e = this.f6491y;
                long jM5138a = c6602e != null ? c6602e.m5138a() : 0L;
                this.f6458A = jM5138a;
                if (jM5138a > 0) {
                    this.f6486t.mo5121g();
                }
            }
            m5803d(this.f6490x);
        }
    }

    /* renamed from: d */
    public void m5803d(int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setAudioRoute " + i10);
        this.f6490x = i10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5102a(this.f6484r, i10);
        }
    }

    /* renamed from: e */
    public void m5806e(int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i10);
        if (i10 <= 0) {
            this.f6464G = 0;
            m5774g();
        } else {
            if (i10 < 100) {
                i10 = 100;
            }
            this.f6464G = i10;
            m5771f();
        }
    }

    /* renamed from: a */
    public void m5785a(TXLivePlayConfig tXLivePlayConfig) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setConfig " + this);
        this.f6472f = tXLivePlayConfig;
        if (tXLivePlayConfig == null) {
            this.f6472f = new TXLivePlayConfig();
        }
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            C6601d c6601dM5188q = abstractC6606i.m5188q();
            if (c6601dM5188q == null) {
                c6601dM5188q = new C6601d();
            }
            TXLivePlayConfig tXLivePlayConfig2 = this.f6472f;
            c6601dM5188q.f5604a = tXLivePlayConfig2.mCacheTime;
            c6601dM5188q.f5610g = tXLivePlayConfig2.mAutoAdjustCacheTime;
            c6601dM5188q.f5606c = tXLivePlayConfig2.mMinAutoAdjustCacheTime;
            c6601dM5188q.f5605b = tXLivePlayConfig2.mMaxAutoAdjustCacheTime;
            c6601dM5188q.f5607d = tXLivePlayConfig2.mVideoBlockThreshold;
            c6601dM5188q.f5608e = tXLivePlayConfig2.mConnectRetryCount;
            c6601dM5188q.f5609f = tXLivePlayConfig2.mConnectRetryInterval;
            c6601dM5188q.f5612i = tXLivePlayConfig2.mEnableNearestIP;
            c6601dM5188q.f5616m = tXLivePlayConfig2.mRtmpChannelType;
            c6601dM5188q.f5611h = this.f6473g;
            c6601dM5188q.f5617n = tXLivePlayConfig2.mCacheFolderPath;
            c6601dM5188q.f5618o = tXLivePlayConfig2.mMaxCacheItems;
            c6601dM5188q.f5613j = tXLivePlayConfig2.mEnableMessage;
            c6601dM5188q.f5614k = tXLivePlayConfig2.mEnableMetaData;
            c6601dM5188q.f5615l = tXLivePlayConfig2.mFlvSessionKey;
            c6601dM5188q.f5620q = tXLivePlayConfig2.mHeaders;
            this.f6486t.mo5105a(c6601dM5188q);
        }
    }

    /* renamed from: b */
    public void m5796b(int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setRenderRotation " + i10);
        this.f6476j = i10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5112b(i10);
        }
    }

    /* renamed from: d */
    public int m5802d() {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api stopRecord " + this);
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            return abstractC6606i.mo5119e();
        }
        return -1;
    }

    /* renamed from: e */
    public int m5805e() {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api resumeLive " + this);
        if (!this.f6492z) {
            return -1;
        }
        this.f6492z = false;
        return m5778a(this.f6459B, 1);
    }

    /* renamed from: g */
    public void m5808g(int i10) {
        TXCLog.m4989d(TXLivePlayer.TAG, "liteav_api seek " + i10);
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            if (!abstractC6606i.mo5120f() && !this.f6492z) {
                this.f6486t.mo5169e(i10);
                return;
            }
            C6602e c6602e = this.f6491y;
            String strM5139a = c6602e != null ? c6602e.m5139a(i10) : "";
            if (!TextUtils.isEmpty(strM5139a)) {
                boolean z10 = m5778a(strM5139a, 3) == 0;
                this.f6492z = z10;
                if (z10) {
                    this.f6458A = i10 * 1000;
                    return;
                }
                return;
            }
            ITXLivePlayListener iTXLivePlayListener = this.f6471e;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onPlayEvent(-2301, new Bundle());
            }
        }
    }

    @Deprecated
    /* renamed from: d */
    public void m5804d(boolean z10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setAutoPlay " + z10);
        this.f6487u = z10;
    }

    /* renamed from: b */
    public boolean m5798b(boolean z10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api enableHardwareDecode " + z10);
        if (z10 && m5775h()) {
            TXCLog.m4991e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
            return false;
        }
        this.f6473g = z10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i == null) {
            return true;
        }
        C6601d c6601dM5188q = abstractC6606i.m5188q();
        if (c6601dM5188q == null) {
            c6601dM5188q = new C6601d();
        }
        c6601dM5188q.f5611h = this.f6473g;
        this.f6486t.mo5105a(c6601dM5188q);
        return true;
    }

    /* renamed from: c */
    public void m5801c(boolean z10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setMute " + z10);
        this.f6478l = z10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5113b(z10);
        }
    }

    /* renamed from: f */
    public int m5807f(int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api startRecord " + this);
        if (!m5792a()) {
            TXCLog.m4991e(TXLivePlayer.TAG, "startRecord: there is no playing stream");
            return -1;
        }
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            return abstractC6606i.mo5117d(i10);
        }
        return -1;
    }

    /* renamed from: c */
    public void m5800c(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 100) {
            i10 = 100;
        }
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setVolume volume = " + i10);
        this.f6479m = i10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5114c(i10);
        }
    }

    /* renamed from: c */
    private String m5768c(String str, int i10) throws UnsupportedEncodingException {
        if (i10 != 6) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder(bytes.length);
                for (int i11 = 0; i11 < bytes.length; i11++) {
                    int i12 = bytes[i11];
                    if (i12 < 0) {
                        i12 += 256;
                    }
                    if (i12 > 32 && i12 < 127 && i12 != 34 && i12 != 37 && i12 != 60 && i12 != 62 && i12 != 91 && i12 != 125 && i12 != 92 && i12 != 93 && i12 != 94 && i12 != 96 && i12 != 123 && i12 != 124) {
                        sb.append((char) i12);
                    } else {
                        sb.append(String.format("%%%02X", Integer.valueOf(i12)));
                    }
                }
                str = sb.toString();
            } catch (Exception e10) {
                TXCLog.m4992e(TXLivePlayer.TAG, "check play url failed.", e10);
            }
        }
        return str.trim();
    }

    /* renamed from: b */
    public void m5797b(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("api")) {
                TXCLog.m4991e(TXLivePlayer.TAG, "callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            String string = jSONObject.getString("api");
            JSONObject jSONObject2 = jSONObject.has("params") ? jSONObject.getJSONObject("params") : null;
            if (!string.equals("muteRemoteAudioInSpeaker")) {
                TXCLog.m4991e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: " + string);
                return;
            }
            if (jSONObject2 == null) {
                TXCLog.m4991e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]");
                return;
            }
            if (!jSONObject2.has("enable")) {
                TXCLog.m4991e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]: enable");
                return;
            }
            int i10 = jSONObject2.getInt("enable");
            AbstractC6606i abstractC6606i = this.f6486t;
            if (abstractC6606i != null) {
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                abstractC6606i.mo5115c(z10);
            }
        } catch (Exception unused) {
            TXCLog.m4991e(TXLivePlayer.TAG, "callExperimentalAPI[failed]: " + str);
        }
    }

    /* renamed from: a */
    public void m5784a(ITXLivePlayListener iTXLivePlayListener) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setPlayListener " + this);
        this.f6471e = iTXLivePlayListener;
    }

    /* renamed from: a */
    public void m5790a(TXCloudVideoView tXCloudVideoView) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setPlayerView old view : " + this.f6467a + ", new view : " + tXCloudVideoView + ", " + this);
        this.f6467a = tXCloudVideoView;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5108a(tXCloudVideoView);
        }
    }

    /* renamed from: b */
    public int m5794b(String str, int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api prepareLiveSeek " + this);
        if (this.f6491y == null) {
            this.f6491y = new C6602e();
        }
        C6602e c6602e = this.f6491y;
        if (c6602e != null) {
            return c6602e.m5137a(this.f6477k, str, i10, new C6602e.a() { // from class: com.tencent.rtmp.a.4
                @Override // com.tencent.liteav.C6602e.a
                /* renamed from: a */
                public void mo5140a(long j10) {
                    C6727a.this.f6458A = j10;
                    if (C6727a.this.f6486t != null) {
                        C6727a.this.f6486t.mo5121g();
                    }
                }
            });
        }
        return -1;
    }

    /* renamed from: a */
    public int m5778a(String str, int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api startPlay " + this);
        if (TextUtils.isEmpty(str)) {
            TXCLog.m4991e(TXLivePlayer.TAG, "start play error when url is empty " + this);
            return -1;
        }
        if (!TextUtils.isEmpty(this.f6477k)) {
            if (this.f6477k.equalsIgnoreCase(str) && m5792a()) {
                TXCLog.m4991e(TXLivePlayer.TAG, "start play error when new url is the same with old url  " + this);
                if (this.f6492z) {
                    onNotifyEvent(2004, new Bundle());
                }
                return this.f6492z ? 0 : -1;
            }
            TXCLog.m4998w(TXLivePlayer.TAG, " stop old play when new url is not the same with old url  " + this);
            AbstractC6606i abstractC6606i = this.f6486t;
            if (abstractC6606i != null) {
                abstractC6606i.mo5098a(false);
            }
            this.f6477k = "";
        }
        TXCDRApi.initCrashReport(this.f6484r);
        TXCLog.m4994i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TXLivePlayer.TAG, "=====  StartPlay url = " + str + " playType = " + i10 + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.m4994i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        int i11 = this.f6460C;
        if (i11 == -1 || i11 != i10) {
            this.f6486t = C6608k.m5190a(this.f6484r, i10);
        }
        this.f6460C = i10;
        if (this.f6486t == null) {
            return -2;
        }
        this.f6477k = m5768c(str, i10);
        m5785a(this.f6472f);
        TXCloudVideoView tXCloudVideoView = this.f6467a;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f6467a.setVisibility(0);
        }
        this.f6486t.mo5108a(this.f6467a);
        this.f6486t.m5187a(this);
        this.f6486t.mo5170e(this.f6487u);
        Surface surface = this.f6468b;
        if (surface != null) {
            this.f6486t.mo5103a(surface);
            this.f6486t.mo5101a(this.f6469c, this.f6470d);
        }
        this.f6486t.mo5097a(this.f6477k, i10);
        this.f6486t.mo5113b(this.f6478l);
        this.f6486t.mo5114c(this.f6479m);
        this.f6486t.mo5166b(this.f6488v);
        this.f6486t.mo5112b(this.f6476j);
        this.f6486t.mo5100a(this.f6475i);
        m5803d(this.f6490x);
        this.f6486t.mo5107a(this.f6466I);
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.f6480n;
        if (iTXVideoRawDataListener != null) {
            m5789a(iTXVideoRawDataListener);
        }
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.f6483q;
        if (iTXLivePlayVideoRenderListener != null) {
            m5776a(iTXLivePlayVideoRenderListener, this.f6482p);
        }
        if (this.f6486t.mo5120f()) {
            this.f6459B = this.f6477k;
            C6602e c6602e = this.f6491y;
            long jM5138a = c6602e != null ? c6602e.m5138a() : 0L;
            this.f6458A = jM5138a;
            if (jM5138a > 0) {
                this.f6486t.mo5121g();
            }
        }
        m5771f();
        return 0;
    }

    /* renamed from: a */
    public int m5779a(boolean z10) {
        TXCloudVideoView tXCloudVideoView;
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api stopPlay " + z10 + ", " + this);
        if (z10 && (tXCloudVideoView = this.f6467a) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        m5774g();
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5098a(z10);
        }
        this.f6477k = "";
        this.f6458A = 0L;
        this.f6491y = null;
        this.f6492z = false;
        return 0;
    }

    /* renamed from: a */
    public boolean m5792a() {
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            return abstractC6606i.mo5116c();
        }
        return false;
    }

    /* renamed from: a */
    public void m5783a(Surface surface) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setSurface old : " + this.f6468b + ", new : " + surface + ", " + this);
        this.f6468b = surface;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5103a(surface);
        }
    }

    /* renamed from: a */
    public void m5782a(int i10, int i11) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setSurfaceSize " + i10 + "x" + i11 + ", " + this);
        this.f6469c = i10;
        this.f6470d = i11;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5101a(i10, i11);
        }
    }

    /* renamed from: a */
    public void m5781a(int i10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setRenderMode " + i10);
        this.f6475i = i10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5100a(i10);
        }
    }

    /* renamed from: a */
    public int m5777a(String str) {
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            return abstractC6606i.mo5096a(str);
        }
        return -1;
    }

    /* renamed from: a */
    public void m5787a(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f6463F = iTXAudioVolumeEvaluationListener;
    }

    /* renamed from: a */
    public void m5791a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setVideoRecordListener");
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5109a(iTXVideoRecordListener);
        }
    }

    /* renamed from: a */
    public void m5788a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api snapshot " + iTXSnapshotListener);
        if (this.f6489w || iTXSnapshotListener == null) {
            return;
        }
        this.f6489w = true;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5104a(new InterfaceC6570k() { // from class: com.tencent.rtmp.a.1
                @Override // com.tencent.liteav.basic.p048c.InterfaceC6570k
                /* renamed from: a */
                public void mo4871a(Bitmap bitmap) {
                    C6727a.this.m5762a(iTXSnapshotListener, bitmap);
                }
            });
        } else {
            this.f6489w = false;
        }
    }

    /* renamed from: a */
    public boolean m5793a(byte[] bArr) {
        String str = this.f6477k;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (this.f6473g) {
            TXLog.m5757e(TXLivePlayer.TAG, "can not addVideoRawData because of hw decode has set!");
            return false;
        }
        if (this.f6486t == null) {
            TXCLog.m4991e(TXLivePlayer.TAG, "player hasn't created or not instanceof live player");
            return false;
        }
        this.f6481o = bArr;
        return true;
    }

    /* renamed from: a */
    public int m5776a(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        if (obj != null && !(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
            TXCLog.m4998w(TXLivePlayer.TAG, "liteav_api setVideoRenderListener error when glContext error " + obj);
            return -1;
        }
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setVideoRenderListener " + iTXLivePlayVideoRenderListener + ", context " + obj);
        this.f6482p = obj;
        this.f6483q = iTXLivePlayVideoRenderListener;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i == null) {
            return 0;
        }
        if (iTXLivePlayVideoRenderListener != null) {
            abstractC6606i.mo5106a(new InterfaceC6607j() { // from class: com.tencent.rtmp.a.2
                @Override // com.tencent.liteav.InterfaceC6607j
                /* renamed from: a */
                public void mo5189a(String str, int i10, TXSVideoFrame tXSVideoFrame) {
                    TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener2;
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0 || (iTXLivePlayVideoRenderListener2 = C6727a.this.f6483q) == null) {
                        return;
                    }
                    TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
                    tXLiteAVTexture.textureId = tXSVideoFrame.textureId;
                    tXLiteAVTexture.width = tXSVideoFrame.width;
                    tXLiteAVTexture.height = tXSVideoFrame.height;
                    tXLiteAVTexture.eglContext = tXSVideoFrame.eglContext;
                    iTXLivePlayVideoRenderListener2.onRenderVideoFrame(tXLiteAVTexture);
                }
            }, EnumC6557b.TEXTURE_2D, obj);
            return 0;
        }
        abstractC6606i.mo5106a(null, EnumC6557b.UNKNOWN, null);
        return 0;
    }

    /* renamed from: a */
    public void m5789a(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setVideoRawDataListener " + iTXVideoRawDataListener);
        this.f6480n = iTXVideoRawDataListener;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i == null) {
            return;
        }
        if (iTXVideoRawDataListener != null) {
            abstractC6606i.mo5106a(new InterfaceC6607j() { // from class: com.tencent.rtmp.a.3
                @Override // com.tencent.liteav.InterfaceC6607j
                /* renamed from: a */
                public void mo5189a(String str, int i10, TXSVideoFrame tXSVideoFrame) {
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0) {
                        return;
                    }
                    byte[] bArr = C6727a.this.f6481o;
                    C6727a.this.f6481o = null;
                    TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener2 = C6727a.this.f6480n;
                    if (iTXVideoRawDataListener2 == null || bArr == null) {
                        return;
                    }
                    if (bArr.length < ((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2) {
                        TXCLog.m4991e(TXLivePlayer.TAG, "raw data buffer length is too large");
                        return;
                    }
                    tXSVideoFrame.loadYUVArray(bArr);
                    iTXVideoRawDataListener2.onVideoRawDataAvailable(bArr, tXSVideoFrame.width, tXSVideoFrame.height, (int) tXSVideoFrame.pts);
                    tXSVideoFrame.release();
                }
            }, EnumC6557b.I420, null);
        } else {
            abstractC6606i.mo5106a(null, EnumC6557b.UNKNOWN, null);
        }
    }

    /* renamed from: a */
    public void m5786a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setAudioRawDataListener " + iTXAudioRawDataListener);
        this.f6466I = iTXAudioRawDataListener;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5107a(iTXAudioRawDataListener);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m5780a(float f10) {
        TXCLog.m4994i(TXLivePlayer.TAG, "liteav_api setRate " + f10);
        this.f6488v = f10;
        AbstractC6606i abstractC6606i = this.f6486t;
        if (abstractC6606i != null) {
            abstractC6606i.mo5166b(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5762a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.a.5
            @Override // java.lang.Runnable
            public void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                C6727a.this.f6489w = false;
            }
        });
    }
}

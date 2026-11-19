package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.strategy.IConnStrategy;
import anet.channel.util.HttpConstant;
import com.alibaba.sdk.android.error.ErrorCode;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C7623d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p085ut.monitor.SessionMonitor;
import com.taobao.accs.p085ut.p086a.C7669c;
import com.taobao.accs.p085ut.p086a.C7670d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C7680f;
import com.taobao.accs.utl.C7683i;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import com.tendcloud.tenddata.C7863av;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.taobao.accs.net.w */
/* loaded from: classes5.dex */
public class C7663w extends AbstractC7642b implements SessionCb, Spdycb {

    /* renamed from: A */
    private final Object f13127A;

    /* renamed from: B */
    private long f13128B;

    /* renamed from: C */
    private long f13129C;

    /* renamed from: D */
    private long f13130D;

    /* renamed from: E */
    private long f13131E;

    /* renamed from: F */
    private int f13132F;

    /* renamed from: G */
    private String f13133G;

    /* renamed from: H */
    private SessionMonitor f13134H;

    /* renamed from: I */
    private C7669c f13135I;

    /* renamed from: J */
    private boolean f13136J;

    /* renamed from: K */
    private String f13137K;

    /* renamed from: L */
    private boolean f13138L;

    /* renamed from: M */
    private C7647g f13139M;

    /* renamed from: N */
    private String f13140N;

    /* renamed from: n */
    protected ScheduledFuture<?> f13141n;

    /* renamed from: o */
    protected String f13142o;

    /* renamed from: p */
    protected int f13143p;

    /* renamed from: q */
    protected String f13144q;

    /* renamed from: r */
    protected int f13145r;

    /* renamed from: s */
    private int f13146s;

    /* renamed from: t */
    private final LinkedList<Message> f13147t;

    /* renamed from: u */
    private a f13148u;

    /* renamed from: v */
    private boolean f13149v;

    /* renamed from: w */
    private String f13150w;

    /* renamed from: x */
    private String f13151x;

    /* renamed from: y */
    private SpdyAgent f13152y;

    /* renamed from: z */
    private SpdySession f13153z;

    /* renamed from: com.taobao.accs.net.w$a */
    public class a extends Thread {

        /* renamed from: a */
        public int f13154a;

        /* renamed from: b */
        long f13155b;

        /* renamed from: d */
        private final String f13157d;

        public a(String str) {
            super(str);
            this.f13157d = getName();
            this.f13154a = 0;
        }

        /* renamed from: a */
        private void m10100a(boolean z10) throws InterruptedException {
            if (C7663w.this.f13146s == 1) {
                if (C7663w.this.f13146s != 1 || System.currentTimeMillis() - this.f13155b <= CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
                    return;
                }
                this.f13154a = 0;
                return;
            }
            ALog.m10116d(C7663w.this.mo10031d(), "tryConnect", "force", Boolean.valueOf(z10));
            if (z10) {
                this.f13154a = 0;
            }
            ALog.m10119i(this.f13157d, "tryConnect", "force", Boolean.valueOf(z10), "failTimes", Integer.valueOf(this.f13154a));
            if (C7663w.this.f13146s != 1 && this.f13154a >= 4) {
                C7663w.this.f13136J = true;
                ALog.m10118e(this.f13157d, "tryConnect fail", "maxTimes", 4);
                return;
            }
            if (C7663w.this.f13146s != 1) {
                if (C7663w.this.f13054c == 1 && this.f13154a == 0) {
                    ALog.m10119i(this.f13157d, "tryConnect in app, no sleep", new Object[0]);
                } else {
                    ALog.m10119i(this.f13157d, "tryConnect, need sleep", new Object[0]);
                    try {
                        Thread.sleep(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
                C7663w.this.f13137K = "";
                if (this.f13154a == 3) {
                    C7663w.this.f13139M.m10057b(C7663w.this.m10098r());
                }
                C7663w.this.m10087d((String) null);
                C7663w.this.f13134H.setRetryTimes(this.f13154a);
                if (C7663w.this.f13146s == 1) {
                    this.f13155b = System.currentTimeMillis();
                    return;
                }
                this.f13154a++;
                ALog.m10118e(this.f13157d, "try connect fail, ready for reconnect", new Object[0]);
                m10100a(false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: all -> 0x0046, TryCatch #1 {, blocks: (B:7:0x0027, B:9:0x0033, B:17:0x0050, B:19:0x0065, B:21:0x0077, B:23:0x007f, B:14:0x004a, B:15:0x004d), top: B:209:0x0027, inners: #6 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C7663w.a.run():void");
        }
    }

    public C7663w(Context context, int i10, String str) {
        super(context, i10, str);
        this.f13146s = 3;
        this.f13147t = new LinkedList<>();
        this.f13149v = true;
        this.f13152y = null;
        this.f13153z = null;
        this.f13127A = new Object();
        this.f13132F = -1;
        this.f13133G = null;
        this.f13136J = false;
        this.f13137K = "";
        this.f13138L = false;
        this.f13139M = new C7647g(m10098r());
        m10096w();
    }

    /* renamed from: t */
    private int m10093t() {
        boolean zM10038k = m10038k();
        if (AccsClientConfig.mEnv == 2) {
            return 0;
        }
        int channelPubKey = this.f13060i.getChannelPubKey();
        if (channelPubKey <= 0) {
            return zM10038k ? 4 : 3;
        }
        ALog.m10119i(mo10031d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
        return channelPubKey;
    }

    /* renamed from: u */
    private void m10094u() {
        if (this.f13153z == null) {
            m10085c(3);
            return;
        }
        try {
            String strEncode = URLEncoder.encode(UtilityImpl.getDeviceId(this.f13055d));
            String strM10129a = UtilityImpl.m10129a(m10036i(), this.f13060i.getAppSecret(), UtilityImpl.getDeviceId(this.f13055d));
            String strM10030c = m10030c(this.f13150w);
            ALog.m10119i(mo10031d(), BaseMonitor.ALARM_POINT_AUTH, "url", strM10030c);
            this.f13151x = strM10030c;
            if (m10079a(strEncode, m10036i(), strM10129a)) {
                new URL(strM10030c);
                SpdyRequest spdyRequest = new SpdyRequest(new URL(strM10030c), "GET", RequestPriority.DEFAULT_PRIORITY, 80000, AbstractC7642b.ACCS_RECEIVE_TIMEOUT);
                spdyRequest.setDomain(m10098r());
                this.f13153z.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), m10098r(), this);
                return;
            }
            ErrorCode errorCodeBuild = AccsErrorCode.SPDY_AUTH_PARAM_ERROR.copy().detail("device " + strEncode + " key " + m10036i() + " sign " + strM10129a).build();
            ALog.m10118e(mo10031d(), "auth param error!", Constants.KEY_HTTP_CODE, errorCodeBuild);
            m10075a(errorCodeBuild);
        } catch (Throwable th) {
            ALog.m10117e(mo10031d(), "auth exception ", th, new Object[0]);
            m10075a(AccsErrorCode.SPDY_AUTH_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public synchronized void m10095v() {
        if (this.f13054c == 1) {
            return;
        }
        this.f13128B = System.currentTimeMillis();
        this.f13129C = System.nanoTime();
        AbstractC7646f.m10044a(this.f13055d).m10047a();
    }

    /* renamed from: w */
    private void m10096w() {
        try {
            SpdyAgent.enableDebug = true;
            this.f13152y = SpdyAgent.getInstance(this.f13055d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (!SpdyAgent.checkLoadSucc()) {
                ALog.m10118e(mo10031d(), "initClient", new Object[0]);
                C7680f.m10171b();
                return;
            }
            C7680f.m10170a();
            if (!m10038k()) {
                this.f13152y.setAccsSslCallback(new C7641aa(this));
            }
            if (OrangeAdapter.isTnetLogOff(false)) {
                return;
            }
            String str = this.f13054c == 0 ? "service" : "inapp";
            ALog.m10116d(mo10031d(), "into--[setTnetLogPath]", new Object[0]);
            String strM10148d = UtilityImpl.m10148d(this.f13055d, str);
            ALog.m10116d(mo10031d(), "config tnet log path:" + strM10148d, new Object[0]);
            if (TextUtils.isEmpty(strM10148d)) {
                return;
            }
            this.f13152y.configLogFile(strM10148d, UtilityImpl.TNET_FILE_SIZE, 5);
        } catch (Throwable th) {
            ALog.m10117e(mo10031d(), "initClient", th, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
        ALog.m10122w(mo10031d(), "bioPingRecvCallback uniId:" + i10, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        return UtilityImpl.m10138a(this.f13055d, this.f13053b, spdySession.getDomain());
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: h */
    public boolean mo10035h() {
        return false;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: l */
    public boolean mo10039l() {
        return this.f13146s == 1;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: m */
    public int mo10040m() {
        return 0;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: n */
    public void mo10041n() {
        m10097q();
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: o */
    public void mo10042o() {
        mo10021a(true, false);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        return UtilityImpl.m10124a(this.f13055d, this.f13053b, spdySession.getDomain(), bArr);
    }

    /* renamed from: q */
    public void m10097q() {
        ALog.m10118e(mo10031d(), " force close!", new Object[0]);
        try {
            this.f13153z.closeSession();
            this.f13134H.setCloseType(1);
        } catch (Exception unused) {
        }
        m10085c(3);
    }

    /* renamed from: r */
    public String m10098r() {
        String channelHost = this.f13060i.getChannelHost();
        ALog.m10119i(mo10031d(), "getChannelHost", Constants.KEY_HOST, channelHost);
        return channelHost == null ? "" : channelHost;
    }

    /* renamed from: s */
    public boolean m10099s() {
        return this.f13149v;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        m10026b(i10);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        m10095v();
        ALog.m10119i(mo10031d(), "onFrame", "type", Integer.valueOf(i11), "len", Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (byte b10 : bArr) {
                sb2.append(Integer.toHexString(b10 & C7863av.f14384i));
                sb2.append(" ");
            }
            ALog.m10116d(mo10031d(), ((Object) sb2) + " log time:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        }
        if (i11 == 200) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f13056e.m9949a(bArr);
                C7670d c7670dM9958g = this.f13056e.m9958g();
                if (c7670dM9958g != null) {
                    c7670dM9958g.f13188c = String.valueOf(jCurrentTimeMillis2);
                    c7670dM9958g.f13192g = this.f13054c == 0 ? "service" : "inapp";
                    c7670dM9958g.m10110a();
                }
            } catch (Throwable th) {
                ALog.m10117e(mo10031d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.m10130a(th));
            }
            ALog.m10116d(mo10031d(), "try handle msg", new Object[0]);
            m10034g();
        } else {
            ALog.m10118e(mo10031d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.m10116d(mo10031d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
        ALog.m10116d(mo10031d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.m10116d(mo10031d(), "spdyDataRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.m10116d(mo10031d(), "spdyDataSendCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) throws NumberFormatException {
        this.f13128B = System.currentTimeMillis();
        this.f13129C = System.nanoTime();
        try {
            Map<String, String> mapM10132a = UtilityImpl.m10132a(map);
            ALog.m10116d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int i10 = Integer.parseInt(mapM10132a.get(HttpConstant.STATUS));
            if (i10 == 200) {
                ALog.m10119i(mo10031d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(i10));
                m10085c(1);
                String str = mapM10132a.get("x-at");
                if (!TextUtils.isEmpty(str)) {
                    this.f13062k = str;
                }
                SessionMonitor sessionMonitor = this.f13134H;
                sessionMonitor.auth_time = sessionMonitor.connection_stop_date > 0 ? System.currentTimeMillis() - this.f13134H.connection_stop_date : 0L;
                String str2 = this.f13054c == 0 ? "service" : "inapp";
                UTMini.getInstance().commitEvent(66001, "CONNECTED 200 " + str2, this.f13151x, this.f13137K, Integer.valueOf(Constants.SDK_VERSION_CODE), "0");
                AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_AUTH, "");
            } else {
                ALog.m10118e(mo10031d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(i10));
                m10075a(AccsErrorCode.NETWORKSDK_SPDY_RES_ERROR.copy().detail("channel code " + i10).build());
            }
        } catch (Exception e10) {
            ALog.m10118e(mo10031d(), e10.toString(), new Object[0]);
            m10097q();
            this.f13134H.setCloseReason("exception");
        }
        ALog.m10116d(mo10031d(), "spdyOnStreamResponse", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.m10116d(mo10031d(), "spdyPingRecvCallback uniId:" + j10, new Object[0]);
        if (j10 < 0) {
            return;
        }
        this.f13056e.m9952b();
        AbstractC7646f.m10044a(this.f13055d).m10051e();
        AbstractC7646f.m10044a(this.f13055d).m10047a();
        this.f13134H.onPingCBReceive();
        if (this.f13134H.ping_rec_times % 2 == 0) {
            UtilityImpl.m10134a(this.f13055d, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.m10116d(mo10031d(), "spdyRequestRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        ALog.m10118e(mo10031d(), "spdySessionCloseCallback", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m10118e(mo10031d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        m10085c(3);
        this.f13134H.onCloseConnect();
        if (this.f13134H.getConCloseDate() > 0 && this.f13134H.getConStopDate() > 0) {
            this.f13134H.getConCloseDate();
            this.f13134H.getConStopDate();
        }
        this.f13134H.setCloseReason(this.f13134H.getCloseReason() + "tnet error:" + i10);
        if (superviseConnectInfo != null) {
            this.f13134H.live_time = superviseConnectInfo.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.f13134H);
        for (Message message : this.f13056e.m9956e()) {
            if (message.m9908e() != null) {
                message.m9908e().setFailReason("session close");
                AppMonitor.getInstance().commitStat(message.m9908e());
            }
        }
        String str = this.f13054c == 0 ? "service" : "inapp";
        ALog.m10116d(mo10031d(), "spdySessionCloseCallback, conKeepTime:" + this.f13134H.live_time + " connectType:" + str, new Object[0]);
        UTMini uTMini = UTMini.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DISCONNECT CLOSE ");
        sb2.append(str);
        uTMini.commitEvent(66001, sb2.toString(), Integer.valueOf(i10), Long.valueOf(this.f13134H.live_time), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13151x, this.f13137K);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.f13132F = superviseConnectInfo.connectTime;
        int i10 = superviseConnectInfo.handshakeTime;
        ALog.m10119i(mo10031d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.f13132F), "sslTime", Integer.valueOf(i10), "reuse", Integer.valueOf(superviseConnectInfo.sessionTicketReused));
        m10094u();
        this.f13134H.setRet(true);
        this.f13134H.onConnectStop();
        SessionMonitor sessionMonitor = this.f13134H;
        sessionMonitor.tcp_time = this.f13132F;
        sessionMonitor.ssl_time = i10;
        String str = this.f13054c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo.sessionTicketReused, String.valueOf(this.f13132F), String.valueOf(i10), Integer.valueOf(Constants.SDK_VERSION_CODE), String.valueOf(superviseConnectInfo.sessionTicketReused), this.f13151x, this.f13137K);
        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_CONNECT, "");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m10118e(mo10031d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        a aVar = this.f13148u;
        int i11 = aVar != null ? aVar.f13154a : 0;
        ALog.m10118e(mo10031d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i11), "errorId", Integer.valueOf(i10));
        this.f13136J = false;
        this.f13138L = true;
        m10085c(3);
        this.f13134H.setFailReason(i10);
        this.f13134H.onConnectStop();
        String str = this.f13054c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13151x, this.f13137K);
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i11, i10 + "", "");
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
        ALog.m10116d(mo10031d(), "spdyStreamCloseCallback", new Object[0]);
        if (i10 != 0) {
            ALog.m10118e(mo10031d(), "spdyStreamCloseCallback", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10));
            m10075a(AccsErrorCode.NETWORKSDK_SPDY_CLOSE_ERROR.copy().detail("channel code " + i10).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10087d(String str) {
        SessionInfo sessionInfo;
        int i10 = this.f13146s;
        if (i10 == 2 || i10 == 1) {
            return;
        }
        if (this.f13139M == null) {
            this.f13139M = new C7647g(m10098r());
        }
        List<IConnStrategy> listM10055a = this.f13139M.m10055a(m10098r());
        if (listM10055a == null || listM10055a.size() <= 0) {
            if (str != null) {
                this.f13142o = str;
            } else {
                this.f13142o = m10098r();
            }
            this.f13143p = System.currentTimeMillis() % 2 == 0 ? 80 : 443;
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_DNS, "localdns", AudioStats.AUDIO_AMPLITUDE_NONE);
            ALog.m10119i(mo10031d(), "connect get ip from amdc fail!!", new Object[0]);
        } else {
            for (IConnStrategy iConnStrategy : listM10055a) {
                if (iConnStrategy != null) {
                    ALog.m10119i(mo10031d(), BaseMonitor.ALARM_POINT_CONNECT, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, iConnStrategy.getIp(), IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(iConnStrategy.getPort()));
                }
            }
            if (this.f13138L) {
                this.f13139M.m10056b();
                this.f13138L = false;
            }
            IConnStrategy iConnStrategyM10053a = this.f13139M.m10053a();
            this.f13142o = iConnStrategyM10053a == null ? m10098r() : iConnStrategyM10053a.getIp();
            this.f13143p = iConnStrategyM10053a != null ? iConnStrategyM10053a.getPort() : 443;
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_DNS, "httpdns", AudioStats.AUDIO_AMPLITUDE_NONE);
            ALog.m10119i(mo10031d(), "connect from amdc succ", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f13142o, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f13143p), "originPos", Integer.valueOf(this.f13139M.m10058c()));
        }
        if (Utils.isIPV6Address(this.f13142o)) {
            this.f13150w = "https://[" + this.f13142o + "]:" + this.f13143p + "/accs/";
        } else {
            this.f13150w = "https://" + this.f13142o + ":" + this.f13143p + "/accs/";
        }
        ALog.m10119i(mo10031d(), BaseMonitor.ALARM_POINT_CONNECT, "URL", this.f13150w);
        this.f13140N = String.valueOf(System.currentTimeMillis());
        if (this.f13134H != null) {
            AppMonitor.getInstance().commitStat(this.f13134H);
        }
        SessionMonitor sessionMonitor = new SessionMonitor();
        this.f13134H = sessionMonitor;
        sessionMonitor.setConnectType(this.f13054c == 0 ? "service" : "inapp");
        if (this.f13152y != null) {
            try {
                this.f13130D = System.currentTimeMillis();
                this.f13131E = System.nanoTime();
                this.f13144q = UtilityImpl.m10128a(this.f13055d);
                this.f13145r = UtilityImpl.m10139b(this.f13055d);
                this.f13128B = System.currentTimeMillis();
                this.f13134H.onStartConnect();
                m10085c(2);
                synchronized (this.f13127A) {
                    try {
                        if (TextUtils.isEmpty(this.f13144q) || this.f13145r < 0 || !this.f13136J) {
                            ALog.m10119i(mo10031d(), "connect normal", new Object[0]);
                            sessionInfo = new SessionInfo(this.f13142o, this.f13143p, m10098r() + BundleUtil.UNDERLINE_TAG + this.f13053b, null, 0, this.f13140N, this, 4226);
                            this.f13137K = "";
                        } else {
                            ALog.m10119i(mo10031d(), BaseMonitor.ALARM_POINT_CONNECT, "proxy", this.f13144q, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f13145r));
                            sessionInfo = new SessionInfo(this.f13142o, this.f13143p, m10098r() + BundleUtil.UNDERLINE_TAG + this.f13053b, this.f13144q, this.f13145r, this.f13140N, this, 4226);
                            this.f13137K = this.f13144q + ":" + this.f13145r;
                        }
                        sessionInfo.setPubKeySeqNum(m10093t());
                        sessionInfo.setConnectionTimeoutMs(AbstractC7642b.ACCS_RECEIVE_TIMEOUT);
                        this.f13153z = this.f13152y.createSession(sessionInfo);
                        this.f13134H.connection_stop_date = 0L;
                        this.f13127A.wait();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        this.f13136J = false;
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    } finally {
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: c */
    public C7669c mo10029c() {
        if (this.f13135I == null) {
            this.f13135I = new C7669c();
        }
        C7669c c7669c = this.f13135I;
        c7669c.f13176b = this.f13054c;
        c7669c.f13178d = this.f13147t.size();
        this.f13135I.f13183i = UtilityImpl.m10156g(this.f13055d);
        C7669c c7669c2 = this.f13135I;
        c7669c2.f13180f = this.f13137K;
        c7669c2.f13175a = this.f13146s;
        SessionMonitor sessionMonitor = this.f13134H;
        c7669c2.f13177c = sessionMonitor != null && sessionMonitor.getRet();
        this.f13135I.f13184j = m10099s();
        C7669c c7669c3 = this.f13135I;
        C7623d c7623d = this.f13056e;
        c7669c3.f13179e = c7623d != null ? c7623d.m9955d() : 0;
        C7669c c7669c4 = this.f13135I;
        c7669c4.f13181g = this.f13151x;
        return c7669c4;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: e */
    public void mo10032e() {
        super.mo10032e();
        this.f13149v = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7665y(this));
        ALog.m10118e(mo10031d(), "shut down", new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: b */
    public void mo10025b() {
        this.f13136J = false;
        this.f13057f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10015a() {
        this.f13149v = true;
        ALog.m10116d(mo10031d(), "start", new Object[0]);
        mo10016a(this.f13055d);
        if (this.f13148u == null) {
            ALog.m10119i(mo10031d(), "start thread", new Object[0]);
            a aVar = new a("NetworkThread_" + this.f13064m);
            this.f13148u = aVar;
            aVar.setPriority(2);
            this.f13148u.start();
        }
        mo10021a(false, false);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: b */
    public String mo10024b(String str) {
        return "https://" + this.f13060i.getChannelHost();
    }

    /* renamed from: c */
    private synchronized void m10085c(int i10) {
        ALog.m10119i(mo10031d(), "notifyStatus start", NotificationCompat.CATEGORY_STATUS, m10014a(i10));
        if (i10 == this.f13146s) {
            ALog.m10116d(mo10031d(), "ignore notifyStatus", new Object[0]);
            return;
        }
        this.f13146s = i10;
        if (i10 == 1) {
            AbstractC7646f.m10044a(this.f13055d).m10052f();
            m10095v();
            ScheduledFuture<?> scheduledFuture = this.f13141n;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            synchronized (this.f13127A) {
                try {
                    this.f13127A.notifyAll();
                } catch (Exception unused) {
                }
            }
            synchronized (this.f13147t) {
                try {
                    this.f13147t.notifyAll();
                } catch (Exception unused2) {
                }
            }
            ALog.m10119i(mo10031d(), "notifyStatus end", NotificationCompat.CATEGORY_STATUS, m10014a(i10));
        }
        if (i10 == 2) {
            ScheduledFuture<?> scheduledFuture2 = this.f13141n;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7666z(this, this.f13140N), 120000L, TimeUnit.MILLISECONDS);
        } else if (i10 == 3) {
            ALog.m10122w(mo10031d(), "notifyStatus", NotificationCompat.CATEGORY_STATUS, m10014a(i10));
            m10095v();
            AbstractC7646f.m10044a(this.f13055d).m10050d();
            synchronized (this.f13127A) {
                try {
                    this.f13127A.notifyAll();
                } catch (Exception unused3) {
                }
            }
            this.f13056e.m9943a(AccsErrorCode.SPDY_CON_DISCONNECTED.copy().detail(C7683i.m10179a().m10183b()).build());
            mo10021a(false, true);
        }
        ALog.m10119i(mo10031d(), "notifyStatus end", NotificationCompat.CATEGORY_STATUS, m10014a(i10));
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10018a(Message message, boolean z10) {
        if (this.f13149v && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() <= 1000) {
                    ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7664x(this, message, z10), message.f12936Q, TimeUnit.MILLISECONDS);
                    if (message.m9901a() == 1 && message.f12934O != null) {
                        if (message.m9906c()) {
                            mo10023a(message.f12934O);
                        }
                        this.f13056e.f12983a.put(message.f12934O, scheduledFutureSchedule);
                    }
                    if (message.m9908e() != null) {
                        message.m9908e().setDeviceId(UtilityImpl.getDeviceId(this.f13055d));
                        message.m9908e().setConnType(this.f13054c);
                        message.m9908e().onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                int size = ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size();
                this.f13056e.m9945a(message, AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail("channel " + size).build());
                ALog.m10118e(mo10031d(), "send queue full count:" + size, new Object[0]);
                return;
            } catch (Throwable th) {
                ALog.m10117e(mo10031d(), "send error", th, new Object[0]);
                this.f13056e.m9945a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
                return;
            }
        }
        ALog.m10118e(mo10031d(), "not running or msg null! " + this.f13149v, new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10021a(boolean z10, boolean z11) {
        ALog.m10116d(mo10031d(), "try ping, force:" + z10, new Object[0]);
        if (this.f13054c == 1) {
            ALog.m10116d(mo10031d(), "INAPP, skip", new Object[0]);
        } else {
            m10028b(Message.m9888a(z10, (int) (z11 ? Math.random() * 10.0d * 1000.0d : AudioStats.AUDIO_AMPLITUDE_NONE)), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10076a(Message message) {
        if (message.f12962t == null || this.f13147t.size() == 0) {
            return;
        }
        for (int size = this.f13147t.size() - 1; size >= 0; size--) {
            Message message2 = this.f13147t.get(size);
            if (message2 != null && message2.f12962t != null && message2.m9909f().equals(message.m9909f())) {
                switch (message.f12962t.intValue()) {
                    case 1:
                    case 2:
                        if (message2.f12962t.intValue() == 1 || message2.f12962t.intValue() == 2) {
                            this.f13147t.remove(size);
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        if (message2.f12962t.intValue() == 3 || message2.f12962t.intValue() == 4) {
                            this.f13147t.remove(size);
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                        if (message2.f12962t.intValue() == 5 || message2.f12962t.intValue() == 6) {
                            this.f13147t.remove(size);
                            break;
                        }
                        break;
                }
                ALog.m10116d(mo10031d(), "clearRepeatControlCommand message:" + message2.f12962t + MqttTopic.TOPIC_LEVEL_SEPARATOR + message2.m9909f(), new Object[0]);
            }
        }
        C7623d c7623d = this.f13056e;
        if (c7623d != null) {
            c7623d.m9953b(message);
        }
    }

    /* renamed from: a */
    private boolean m10079a(String str, String str2, String str3) {
        int i10 = 1;
        if (Utils.getMode() == 2 || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
            return true;
        }
        m10085c(3);
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                i10 = 2;
            } else if (TextUtils.isEmpty(str3)) {
                i10 = 3;
            }
        }
        this.f13134H.setFailReason(i10);
        this.f13134H.onConnectStop();
        String str4 = this.f13054c == 0 ? "service" : "inapp";
        a aVar = this.f13148u;
        int i11 = aVar != null ? aVar.f13154a : 0;
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str4, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13151x, this.f13137K);
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i11, i10 + "", "");
        return false;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: d */
    public String mo10031d() {
        return "SilenceConn_" + this.f13064m;
    }

    /* renamed from: a */
    private void m10075a(ErrorCode errorCode) {
        this.f13062k = null;
        m10097q();
        a aVar = this.f13148u;
        int i10 = aVar != null ? aVar.f13154a : 0;
        this.f13134H.setCloseReason("code not 200 is" + errorCode.getCodeInt());
        this.f13138L = true;
        String str = this.f13054c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED NO 200 " + str, errorCode, Integer.valueOf(i10), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13151x, this.f13137K);
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_AUTH, "", errorCode + "", "");
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10020a(String str, boolean z10, String str2) {
        try {
            m10085c(4);
            m10097q();
            this.f13134H.setCloseReason(str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public boolean mo10023a(String str) {
        boolean z10;
        String str2;
        synchronized (this.f13147t) {
            try {
                z10 = true;
                int size = this.f13147t.size() - 1;
                while (true) {
                    if (size >= 0) {
                        Message message = this.f13147t.get(size);
                        if (message != null && message.m9901a() == 1 && (str2 = message.f12934O) != null && str2.equals(str)) {
                            this.f13147t.remove(size);
                            break;
                        }
                        size--;
                    } else {
                        z10 = false;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10016a(Context context) {
        if (this.f13058g) {
            return;
        }
        super.mo10016a(context);
        GlobalAppRuntimeInfo.setBackground(false);
        this.f13058g = true;
        ALog.m10119i(mo10031d(), "init awcn success!", new Object[0]);
    }
}

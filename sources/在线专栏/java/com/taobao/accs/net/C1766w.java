package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.strategy.IConnStrategy;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C1726d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p064ut.monitor.SessionMonitor;
import com.taobao.accs.p064ut.p065a.C1772c;
import com.taobao.accs.p064ut.p065a.C1773d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C1783f;
import com.taobao.accs.utl.C1786i;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
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

/* renamed from: com.taobao.accs.net.w */
/* loaded from: classes.dex */
public class C1766w extends AbstractC1745b implements SessionCb, Spdycb {

    /* renamed from: A */
    private final Object f7729A;

    /* renamed from: B */
    private long f7730B;

    /* renamed from: C */
    private long f7731C;

    /* renamed from: D */
    private long f7732D;

    /* renamed from: E */
    private long f7733E;

    /* renamed from: F */
    private int f7734F;

    /* renamed from: G */
    private String f7735G;

    /* renamed from: H */
    private SessionMonitor f7736H;

    /* renamed from: I */
    private C1772c f7737I;

    /* renamed from: J */
    private boolean f7738J;

    /* renamed from: K */
    private String f7739K;

    /* renamed from: L */
    private boolean f7740L;

    /* renamed from: M */
    private C1750g f7741M;

    /* renamed from: N */
    private String f7742N;

    /* renamed from: n */
    protected ScheduledFuture<?> f7743n;

    /* renamed from: o */
    protected String f7744o;

    /* renamed from: p */
    protected int f7745p;

    /* renamed from: q */
    protected String f7746q;

    /* renamed from: r */
    protected int f7747r;

    /* renamed from: s */
    private int f7748s;

    /* renamed from: t */
    private final LinkedList<Message> f7749t;

    /* renamed from: u */
    private a f7750u;

    /* renamed from: v */
    private boolean f7751v;

    /* renamed from: w */
    private String f7752w;

    /* renamed from: x */
    private String f7753x;

    /* renamed from: y */
    private SpdyAgent f7754y;

    /* renamed from: z */
    private SpdySession f7755z;

    /* renamed from: com.taobao.accs.net.w$a */
    private class a extends Thread {

        /* renamed from: a */
        public int f7756a;

        /* renamed from: b */
        long f7757b;

        /* renamed from: d */
        private final String f7759d;

        public a(String str) {
            super(str);
            this.f7759d = getName();
            this.f7756a = 0;
        }

        /* renamed from: a */
        private void m6074a(boolean z3) throws InterruptedException {
            if (C1766w.this.f7748s == 1) {
                if (C1766w.this.f7748s != 1 || System.currentTimeMillis() - this.f7757b <= 5000) {
                    return;
                }
                this.f7756a = 0;
                return;
            }
            ALog.m6090d(C1766w.this.mo6005d(), "tryConnect", "force", Boolean.valueOf(z3));
            if (z3) {
                this.f7756a = 0;
            }
            ALog.m6093i(this.f7759d, "tryConnect", "force", Boolean.valueOf(z3), "failTimes", Integer.valueOf(this.f7756a));
            if (C1766w.this.f7748s != 1 && this.f7756a >= 4) {
                C1766w.this.f7738J = true;
                ALog.m6092e(this.f7759d, "tryConnect fail", "maxTimes", 4);
                return;
            }
            if (C1766w.this.f7748s != 1) {
                if (C1766w.this.f7656c == 1 && this.f7756a == 0) {
                    ALog.m6093i(this.f7759d, "tryConnect in app, no sleep", new Object[0]);
                } else {
                    ALog.m6093i(this.f7759d, "tryConnect, need sleep", new Object[0]);
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                }
                C1766w.this.f7739K = "";
                if (this.f7756a == 3) {
                    C1766w.this.f7741M.m6031b(C1766w.this.m6072r());
                }
                C1766w.this.m6061d((String) null);
                C1766w.this.f7736H.setRetryTimes(this.f7756a);
                if (C1766w.this.f7748s == 1) {
                    this.f7757b = System.currentTimeMillis();
                    return;
                }
                this.f7756a++;
                ALog.m6092e(this.f7759d, "try connect fail, ready for reconnect", new Object[0]);
                m6074a(false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[Catch: all -> 0x04fa, TryCatch #14 {, blocks: (B:7:0x0027, B:9:0x0033, B:15:0x004d, B:17:0x0062, B:19:0x0074, B:21:0x007c, B:12:0x0047, B:13:0x004a), top: B:221:0x0027, inners: #0 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C1766w.a.run():void");
        }
    }

    public C1766w(Context context, int i4, String str) {
        super(context, i4, str);
        this.f7748s = 3;
        this.f7749t = new LinkedList<>();
        this.f7751v = true;
        this.f7754y = null;
        this.f7755z = null;
        this.f7729A = new Object();
        this.f7734F = -1;
        this.f7735G = null;
        this.f7738J = false;
        this.f7739K = "";
        this.f7740L = false;
        this.f7741M = new C1750g(m6072r());
        m6070w();
    }

    /* renamed from: t */
    private int m6067t() {
        boolean zM6012k = m6012k();
        if (AccsClientConfig.mEnv == 2) {
            return 0;
        }
        int channelPubKey = this.f7662i.getChannelPubKey();
        if (channelPubKey <= 0) {
            return zM6012k ? 4 : 3;
        }
        ALog.m6093i(mo6005d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
        return channelPubKey;
    }

    /* renamed from: u */
    private void m6068u() {
        if (this.f7755z == null) {
            m6059c(3);
            return;
        }
        try {
            String strEncode = URLEncoder.encode(UtilityImpl.getDeviceId(this.f7657d));
            String strM6103a = UtilityImpl.m6103a(m6010i(), this.f7662i.getAppSecret(), UtilityImpl.getDeviceId(this.f7657d));
            String strM6004c = m6004c(this.f7752w);
            ALog.m6093i(mo6005d(), BaseMonitor.ALARM_POINT_AUTH, AgooConstants.OPEN_URL, strM6004c);
            this.f7753x = strM6004c;
            if (m6053a(strEncode, m6010i(), strM6103a)) {
                new URL(strM6004c);
                SpdyRequest spdyRequest = new SpdyRequest(new URL(strM6004c), "GET", RequestPriority.DEFAULT_PRIORITY, 80000, AbstractC1745b.ACCS_RECEIVE_TIMEOUT);
                spdyRequest.setDomain(m6072r());
                this.f7755z.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), m6072r(), this);
                return;
            }
            ErrorCode errorCodeBuild = AccsErrorCode.SPDY_AUTH_PARAM_ERROR.copy().detail("device " + strEncode + " key " + m6010i() + " sign " + strM6103a).build();
            ALog.m6092e(mo6005d(), "auth param error!", Constants.KEY_HTTP_CODE, errorCodeBuild);
            m6049a(errorCodeBuild);
        } catch (Throwable th) {
            ALog.m6091e(mo6005d(), "auth exception ", th, new Object[0]);
            m6049a(AccsErrorCode.SPDY_AUTH_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public synchronized void m6069v() {
        if (this.f7656c == 1) {
            return;
        }
        this.f7730B = System.currentTimeMillis();
        this.f7731C = System.nanoTime();
        AbstractC1749f.m6018a(this.f7657d).m6021a();
    }

    /* renamed from: w */
    private void m6070w() {
        try {
            SpdyAgent.enableDebug = true;
            this.f7754y = SpdyAgent.getInstance(this.f7657d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (!SpdyAgent.checkLoadSucc()) {
                ALog.m6092e(mo6005d(), "initClient", new Object[0]);
                C1783f.m6145b();
                return;
            }
            C1783f.m6144a();
            if (!m6012k()) {
                this.f7754y.setAccsSslCallback(new C1744aa(this));
            }
            if (OrangeAdapter.isTnetLogOff(false)) {
                return;
            }
            String str = this.f7656c == 0 ? "service" : "inapp";
            ALog.m6090d(mo6005d(), "into--[setTnetLogPath]", new Object[0]);
            String strM6122d = UtilityImpl.m6122d(this.f7657d, str);
            ALog.m6090d(mo6005d(), "config tnet log path:" + strM6122d, new Object[0]);
            if (TextUtils.isEmpty(strM6122d)) {
                return;
            }
            this.f7754y.configLogFile(strM6122d, UtilityImpl.TNET_FILE_SIZE, 5);
        } catch (Throwable th) {
            ALog.m6091e(mo6005d(), "initClient", th, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i4) {
        ALog.m6096w(mo6005d(), "bioPingRecvCallback uniId:" + i4, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        return UtilityImpl.m6112a(this.f7657d, this.f7655b, spdySession.getDomain());
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: h */
    protected boolean mo6009h() {
        return false;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: l */
    public boolean mo6013l() {
        return this.f7748s == 1;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: m */
    public int mo6014m() {
        return 0;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: n */
    public void mo6015n() {
        m6071q();
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: o */
    public void mo6016o() {
        mo5995a(true, false);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        return UtilityImpl.m6098a(this.f7657d, this.f7655b, spdySession.getDomain(), bArr);
    }

    /* renamed from: q */
    public void m6071q() {
        ALog.m6092e(mo6005d(), " force close!", new Object[0]);
        try {
            this.f7755z.closeSession();
            this.f7736H.setCloseType(1);
        } catch (Exception unused) {
        }
        m6059c(3);
    }

    /* renamed from: r */
    public String m6072r() {
        String channelHost = this.f7662i.getChannelHost();
        ALog.m6093i(mo6005d(), "getChannelHost", Constants.KEY_HOST, channelHost);
        return channelHost == null ? "" : channelHost;
    }

    /* renamed from: s */
    public boolean m6073s() {
        return this.f7751v;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i4, int i5) {
        m6000b(i4);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i4, int i5, int i6, int i7, byte[] bArr) {
        m6069v();
        ALog.m6093i(mo6005d(), "onFrame", "type", Integer.valueOf(i5), "len", Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (byte b4 : bArr) {
                sb.append(Integer.toHexString(b4 & 255));
                sb.append(" ");
            }
            ALog.m6090d(mo6005d(), ((Object) sb) + " log time:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        }
        if (i5 == 200) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f7658e.m5923a(bArr);
                C1773d c1773dM5932g = this.f7658e.m5932g();
                if (c1773dM5932g != null) {
                    c1773dM5932g.f7790c = String.valueOf(jCurrentTimeMillis2);
                    c1773dM5932g.f7794g = this.f7656c == 0 ? "service" : "inapp";
                    c1773dM5932g.m6084a();
                }
            } catch (Throwable th) {
                ALog.m6091e(mo6005d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.m6104a(th));
            }
            ALog.m6090d(mo6005d(), "try handle msg", new Object[0]);
            m6008g();
        } else {
            ALog.m6092e(mo6005d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.m6090d(mo6005d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z3, long j4, SpdyByteArray spdyByteArray, Object obj) {
        ALog.m6090d(mo6005d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z3, long j4, int i4, Object obj) {
        ALog.m6090d(mo6005d(), "spdyDataRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z3, long j4, int i4, Object obj) {
        ALog.m6090d(mo6005d(), "spdyDataSendCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j4, Map<String, List<String>> map, Object obj) throws NumberFormatException {
        this.f7730B = System.currentTimeMillis();
        this.f7731C = System.nanoTime();
        try {
            Map<String, String> mapM6106a = UtilityImpl.m6106a(map);
            ALog.m6090d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int i4 = Integer.parseInt(mapM6106a.get(":status"));
            if (i4 == 200) {
                ALog.m6093i(mo6005d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(i4));
                m6059c(1);
                String str = mapM6106a.get("x-at");
                if (!TextUtils.isEmpty(str)) {
                    this.f7664k = str;
                }
                SessionMonitor sessionMonitor = this.f7736H;
                sessionMonitor.auth_time = sessionMonitor.connection_stop_date > 0 ? System.currentTimeMillis() - this.f7736H.connection_stop_date : 0L;
                String str2 = this.f7656c == 0 ? "service" : "inapp";
                UTMini.getInstance().commitEvent(66001, "CONNECTED 200 " + str2, this.f7753x, this.f7739K, Integer.valueOf(Constants.SDK_VERSION_CODE), MessageService.MSG_DB_READY_REPORT);
                AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_AUTH, "");
            } else {
                ALog.m6092e(mo6005d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(i4));
                m6049a(AccsErrorCode.NETWORKSDK_SPDY_RES_ERROR.copy().detail("channel code " + i4).build());
            }
        } catch (Exception e4) {
            ALog.m6092e(mo6005d(), e4.toString(), new Object[0]);
            m6071q();
            this.f7736H.setCloseReason("exception");
        }
        ALog.m6090d(mo6005d(), "spdyOnStreamResponse", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j4, Object obj) {
        ALog.m6090d(mo6005d(), "spdyPingRecvCallback uniId:" + j4, new Object[0]);
        if (j4 < 0) {
            return;
        }
        this.f7658e.m5926b();
        AbstractC1749f.m6018a(this.f7657d).m6025e();
        AbstractC1749f.m6018a(this.f7657d).m6021a();
        this.f7736H.onPingCBReceive();
        if (this.f7736H.ping_rec_times % 2 == 0) {
            UtilityImpl.m6108a(this.f7657d, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j4, Object obj) {
        ALog.m6090d(mo6005d(), "spdyRequestRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i4) {
        ALog.m6092e(mo6005d(), "spdySessionCloseCallback", Constants.KEY_ERROR_CODE, Integer.valueOf(i4));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e4) {
                ALog.m6092e(mo6005d(), "session cleanUp has exception: " + e4, new Object[0]);
            }
        }
        m6059c(3);
        this.f7736H.onCloseConnect();
        if (this.f7736H.getConCloseDate() > 0 && this.f7736H.getConStopDate() > 0) {
            this.f7736H.getConCloseDate();
            this.f7736H.getConStopDate();
        }
        this.f7736H.setCloseReason(this.f7736H.getCloseReason() + "tnet error:" + i4);
        if (superviseConnectInfo != null) {
            this.f7736H.live_time = superviseConnectInfo.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.f7736H);
        for (Message message : this.f7658e.m5930e()) {
            if (message.m5882e() != null) {
                message.m5882e().setFailReason("session close");
                AppMonitor.getInstance().commitStat(message.m5882e());
            }
        }
        String str = this.f7656c == 0 ? "service" : "inapp";
        ALog.m6090d(mo6005d(), "spdySessionCloseCallback, conKeepTime:" + this.f7736H.live_time + " connectType:" + str, new Object[0]);
        UTMini uTMini = UTMini.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("DISCONNECT CLOSE ");
        sb.append(str);
        uTMini.commitEvent(66001, sb.toString(), Integer.valueOf(i4), Long.valueOf(this.f7736H.live_time), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7753x, this.f7739K);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.f7734F = superviseConnectInfo.connectTime;
        int i4 = superviseConnectInfo.handshakeTime;
        ALog.m6093i(mo6005d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.f7734F), "sslTime", Integer.valueOf(i4), "reuse", Integer.valueOf(superviseConnectInfo.sessionTicketReused));
        m6068u();
        this.f7736H.setRet(true);
        this.f7736H.onConnectStop();
        SessionMonitor sessionMonitor = this.f7736H;
        sessionMonitor.tcp_time = this.f7734F;
        sessionMonitor.ssl_time = i4;
        String str = this.f7656c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo.sessionTicketReused, String.valueOf(this.f7734F), String.valueOf(i4), Integer.valueOf(Constants.SDK_VERSION_CODE), String.valueOf(superviseConnectInfo.sessionTicketReused), this.f7753x, this.f7739K);
        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_CONNECT, "");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i4, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e4) {
                ALog.m6092e(mo6005d(), "session cleanUp has exception: " + e4, new Object[0]);
            }
        }
        a aVar = this.f7750u;
        int i5 = aVar != null ? aVar.f7756a : 0;
        ALog.m6092e(mo6005d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i5), "errorId", Integer.valueOf(i4));
        this.f7738J = false;
        this.f7740L = true;
        m6059c(3);
        this.f7736H.setFailReason(i4);
        this.f7736H.onConnectStop();
        String str = this.f7656c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7753x, this.f7739K);
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i5, i4 + "", "");
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j4, int i4, Object obj, SuperviseData superviseData) {
        ALog.m6090d(mo6005d(), "spdyStreamCloseCallback", new Object[0]);
        if (i4 != 0) {
            ALog.m6092e(mo6005d(), "spdyStreamCloseCallback", "statusCode", Integer.valueOf(i4));
            m6049a(AccsErrorCode.NETWORKSDK_SPDY_CLOSE_ERROR.copy().detail("channel code " + i4).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6061d(String str) {
        SessionInfo sessionInfo;
        int i4 = this.f7748s;
        if (i4 == 2 || i4 == 1) {
            return;
        }
        if (this.f7741M == null) {
            this.f7741M = new C1750g(m6072r());
        }
        List<IConnStrategy> listM6029a = this.f7741M.m6029a(m6072r());
        int port = Constants.PORT;
        if (listM6029a == null || listM6029a.size() <= 0) {
            if (str != null) {
                this.f7744o = str;
            } else {
                this.f7744o = m6072r();
            }
            if (System.currentTimeMillis() % 2 == 0) {
                port = 80;
            }
            this.f7745p = port;
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_DNS, "localdns", 0.0d);
            ALog.m6093i(mo6005d(), "connect get ip from amdc fail!!", new Object[0]);
        } else {
            for (IConnStrategy iConnStrategy : listM6029a) {
                if (iConnStrategy != null) {
                    ALog.m6093i(mo6005d(), BaseMonitor.ALARM_POINT_CONNECT, "ip", iConnStrategy.getIp(), "port", Integer.valueOf(iConnStrategy.getPort()));
                }
            }
            if (this.f7740L) {
                this.f7741M.m6030b();
                this.f7740L = false;
            }
            IConnStrategy iConnStrategyM6027a = this.f7741M.m6027a();
            this.f7744o = iConnStrategyM6027a == null ? m6072r() : iConnStrategyM6027a.getIp();
            if (iConnStrategyM6027a != null) {
                port = iConnStrategyM6027a.getPort();
            }
            this.f7745p = port;
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_DNS, "httpdns", 0.0d);
            ALog.m6093i(mo6005d(), "connect from amdc succ", "ip", this.f7744o, "port", Integer.valueOf(this.f7745p), "originPos", Integer.valueOf(this.f7741M.m6032c()));
        }
        if (Utils.isIPV6Address(this.f7744o)) {
            this.f7752w = "https://[" + this.f7744o + "]:" + this.f7745p + "/accs/";
        } else {
            this.f7752w = "https://" + this.f7744o + ":" + this.f7745p + "/accs/";
        }
        ALog.m6093i(mo6005d(), BaseMonitor.ALARM_POINT_CONNECT, "URL", this.f7752w);
        this.f7742N = String.valueOf(System.currentTimeMillis());
        if (this.f7736H != null) {
            AppMonitor.getInstance().commitStat(this.f7736H);
        }
        SessionMonitor sessionMonitor = new SessionMonitor();
        this.f7736H = sessionMonitor;
        sessionMonitor.setConnectType(this.f7656c == 0 ? "service" : "inapp");
        if (this.f7754y != null) {
            try {
                this.f7732D = System.currentTimeMillis();
                this.f7733E = System.nanoTime();
                this.f7746q = UtilityImpl.m6102a(this.f7657d);
                this.f7747r = UtilityImpl.m6113b(this.f7657d);
                this.f7730B = System.currentTimeMillis();
                this.f7736H.onStartConnect();
                m6059c(2);
                synchronized (this.f7729A) {
                    try {
                        if (TextUtils.isEmpty(this.f7746q) || this.f7747r < 0 || !this.f7738J) {
                            ALog.m6093i(mo6005d(), "connect normal", new Object[0]);
                            sessionInfo = new SessionInfo(this.f7744o, this.f7745p, m6072r() + "_" + this.f7655b, null, 0, this.f7742N, this, 4226);
                            this.f7739K = "";
                        } else {
                            ALog.m6093i(mo6005d(), BaseMonitor.ALARM_POINT_CONNECT, "proxy", this.f7746q, "port", Integer.valueOf(this.f7747r));
                            sessionInfo = new SessionInfo(this.f7744o, this.f7745p, m6072r() + "_" + this.f7655b, this.f7746q, this.f7747r, this.f7742N, this, 4226);
                            this.f7739K = this.f7746q + ":" + this.f7747r;
                        }
                        sessionInfo.setPubKeySeqNum(m6067t());
                        sessionInfo.setConnectionTimeoutMs(AbstractC1745b.ACCS_RECEIVE_TIMEOUT);
                        this.f7755z = this.f7754y.createSession(sessionInfo);
                        this.f7736H.connection_stop_date = 0L;
                        this.f7729A.wait();
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        this.f7738J = false;
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: c */
    public C1772c mo6003c() {
        if (this.f7737I == null) {
            this.f7737I = new C1772c();
        }
        C1772c c1772c = this.f7737I;
        c1772c.f7778b = this.f7656c;
        c1772c.f7780d = this.f7749t.size();
        this.f7737I.f7785i = UtilityImpl.m6130g(this.f7657d);
        C1772c c1772c2 = this.f7737I;
        c1772c2.f7782f = this.f7739K;
        c1772c2.f7777a = this.f7748s;
        SessionMonitor sessionMonitor = this.f7736H;
        c1772c2.f7779c = sessionMonitor != null && sessionMonitor.getRet();
        this.f7737I.f7786j = m6073s();
        C1772c c1772c3 = this.f7737I;
        C1726d c1726d = this.f7658e;
        c1772c3.f7781e = c1726d != null ? c1726d.m5929d() : 0;
        C1772c c1772c4 = this.f7737I;
        c1772c4.f7783g = this.f7753x;
        return c1772c4;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: e */
    public void mo6006e() {
        super.mo6006e();
        this.f7751v = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1768y(this));
        ALog.m6092e(mo6005d(), "shut down", new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: b */
    public void mo5999b() {
        this.f7738J = false;
        this.f7659f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public void mo5989a() {
        this.f7751v = true;
        ALog.m6090d(mo6005d(), "start", new Object[0]);
        mo5990a(this.f7657d);
        if (this.f7750u == null) {
            ALog.m6093i(mo6005d(), "start thread", new Object[0]);
            a aVar = new a("NetworkThread_" + this.f7666m);
            this.f7750u = aVar;
            aVar.setPriority(2);
            this.f7750u.start();
        }
        mo5995a(false, false);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: b */
    public String mo5998b(String str) {
        return "https://" + this.f7662i.getChannelHost();
    }

    /* renamed from: c */
    private synchronized void m6059c(int i4) {
        ALog.m6093i(mo6005d(), "notifyStatus start", "status", m5988a(i4));
        if (i4 == this.f7748s) {
            ALog.m6090d(mo6005d(), "ignore notifyStatus", new Object[0]);
            return;
        }
        this.f7748s = i4;
        if (i4 == 1) {
            AbstractC1749f.m6018a(this.f7657d).m6026f();
            m6069v();
            ScheduledFuture<?> scheduledFuture = this.f7743n;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            synchronized (this.f7729A) {
                try {
                    this.f7729A.notifyAll();
                } catch (Exception unused) {
                }
            }
            synchronized (this.f7749t) {
                try {
                    this.f7749t.notifyAll();
                } catch (Exception unused2) {
                }
            }
            ALog.m6093i(mo6005d(), "notifyStatus end", "status", m5988a(i4));
        }
        if (i4 == 2) {
            ScheduledFuture<?> scheduledFuture2 = this.f7743n;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1769z(this, this.f7742N), 120000L, TimeUnit.MILLISECONDS);
        } else if (i4 == 3) {
            ALog.m6096w(mo6005d(), "notifyStatus", "status", m5988a(i4));
            m6069v();
            AbstractC1749f.m6018a(this.f7657d).m6024d();
            synchronized (this.f7729A) {
                try {
                    this.f7729A.notifyAll();
                } catch (Exception unused3) {
                }
            }
            this.f7658e.m5917a(AccsErrorCode.SPDY_CON_DISCONNECTED.copy().detail(C1786i.m6153a().m6157b()).build());
            mo5995a(false, true);
        }
        ALog.m6093i(mo6005d(), "notifyStatus end", "status", m5988a(i4));
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5992a(Message message, boolean z3) {
        if (this.f7751v && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() <= 1000) {
                    ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1767x(this, message, z3), message.f7538Q, TimeUnit.MILLISECONDS);
                    if (message.m5875a() == 1 && message.f7536O != null) {
                        if (message.m5880c()) {
                            mo5997a(message.f7536O);
                        }
                        this.f7658e.f7585a.put(message.f7536O, scheduledFutureSchedule);
                    }
                    if (message.m5882e() != null) {
                        message.m5882e().setDeviceId(UtilityImpl.getDeviceId(this.f7657d));
                        message.m5882e().setConnType(this.f7656c);
                        message.m5882e().onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                int size = ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size();
                this.f7658e.m5919a(message, AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail("channel " + size).build());
                ALog.m6092e(mo6005d(), "send queue full count:" + size, new Object[0]);
                return;
            } catch (Throwable th) {
                ALog.m6091e(mo6005d(), "send error", th, new Object[0]);
                this.f7658e.m5919a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
                return;
            }
        }
        ALog.m6092e(mo6005d(), "not running or msg null! " + this.f7751v, new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public void mo5995a(boolean z3, boolean z4) {
        ALog.m6090d(mo6005d(), "try ping, force:" + z3, new Object[0]);
        if (this.f7656c == 1) {
            ALog.m6090d(mo6005d(), "INAPP, skip", new Object[0]);
        } else {
            m6002b(Message.m5862a(z3, (int) (z4 ? Math.random() * 10.0d * 1000.0d : 0.0d)), z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6050a(Message message) {
        if (message.f7564t == null || this.f7749t.size() == 0) {
            return;
        }
        for (int size = this.f7749t.size() - 1; size >= 0; size--) {
            Message message2 = this.f7749t.get(size);
            if (message2 != null && message2.f7564t != null && message2.m5883f().equals(message.m5883f())) {
                switch (message.f7564t.intValue()) {
                    case 1:
                    case 2:
                        if (message2.f7564t.intValue() == 1 || message2.f7564t.intValue() == 2) {
                            this.f7749t.remove(size);
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        if (message2.f7564t.intValue() == 3 || message2.f7564t.intValue() == 4) {
                            this.f7749t.remove(size);
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                        if (message2.f7564t.intValue() == 5 || message2.f7564t.intValue() == 6) {
                            this.f7749t.remove(size);
                            break;
                        }
                        break;
                }
                ALog.m6090d(mo6005d(), "clearRepeatControlCommand message:" + message2.f7564t + "/" + message2.m5883f(), new Object[0]);
            }
        }
        C1726d c1726d = this.f7658e;
        if (c1726d != null) {
            c1726d.m5927b(message);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m6053a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            int r0 = com.taobao.accs.utl.Utils.getMode()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L9
            return r2
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r3 = 0
            if (r0 != 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto Lae
        L1c:
            r0 = 3
            r11.m6059c(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L28
        L26:
            r0 = 1
            goto L36
        L28:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L30
            r0 = 2
            goto L36
        L30:
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            if (r12 == 0) goto L26
        L36:
            com.taobao.accs.ut.monitor.SessionMonitor r12 = r11.f7736H
            r12.setFailReason(r0)
            com.taobao.accs.ut.monitor.SessionMonitor r12 = r11.f7736H
            r12.onConnectStop()
            int r12 = r11.f7656c
            if (r12 != 0) goto L47
            java.lang.String r12 = "service"
            goto L49
        L47:
            java.lang.String r12 = "inapp"
        L49:
            com.taobao.accs.net.w$a r13 = r11.f7750u
            if (r13 == 0) goto L50
            int r13 = r13.f7756a
            goto L51
        L50:
            r13 = 0
        L51:
            com.taobao.accs.utl.UTMini r4 = com.taobao.accs.utl.UTMini.getInstance()
            r5 = 66001(0x101d1, float:9.2487E-41)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r6 = "DISCONNECT "
            r14.append(r6)
            r14.append(r12)
            java.lang.String r6 = r14.toString()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r12 = 222(0xde, float:3.11E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.String[] r10 = new java.lang.String[r1]
            java.lang.String r12 = r11.f7753x
            r10[r3] = r12
            java.lang.String r12 = r11.f7739K
            r10[r2] = r12
            r4.commitEvent(r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "retrytimes:"
            r12.append(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r14 = ""
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "accs"
            java.lang.String r1 = "connect"
            com.taobao.accs.utl.AppMonitorAdapter.commitAlarmFail(r0, r1, r12, r13, r14)
            r2 = 0
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C1766w.m6053a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: d */
    protected String mo6005d() {
        return "SilenceConn_" + this.f7666m;
    }

    /* renamed from: a */
    private void m6049a(ErrorCode errorCode) {
        this.f7664k = null;
        m6071q();
        a aVar = this.f7750u;
        int i4 = aVar != null ? aVar.f7756a : 0;
        this.f7736H.setCloseReason("code not 200 is" + errorCode.getCodeInt());
        this.f7740L = true;
        String str = this.f7656c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED NO 200 " + str, errorCode, Integer.valueOf(i4), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7753x, this.f7739K);
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_AUTH, "", errorCode + "", "");
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5994a(String str, boolean z3, String str2) {
        try {
            m6059c(4);
            m6071q();
            this.f7736H.setCloseReason(str2);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public boolean mo5997a(String str) {
        boolean z3;
        String str2;
        synchronized (this.f7749t) {
            z3 = true;
            int size = this.f7749t.size() - 1;
            while (true) {
                if (size >= 0) {
                    Message message = this.f7749t.get(size);
                    if (message != null && message.m5875a() == 1 && (str2 = message.f7536O) != null && str2.equals(str)) {
                        this.f7749t.remove(size);
                        break;
                    }
                    size--;
                } else {
                    z3 = false;
                    break;
                }
            }
        }
        return z3;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5990a(Context context) {
        if (this.f7660g) {
            return;
        }
        super.mo5990a(context);
        GlobalAppRuntimeInfo.setBackground(false);
        this.f7660g = true;
        ALog.m6093i(mo6005d(), "init awcn success!", new Object[0]);
    }
}

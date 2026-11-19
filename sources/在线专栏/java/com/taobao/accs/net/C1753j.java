package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.ISessionListener;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.logger.ILog;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsState;
import com.taobao.accs.ConnectionListener;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.p064ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p064ut.p065a.C1772c;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyErrorException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.j */
/* loaded from: classes.dex */
public class C1753j extends AbstractC1745b implements DataFrameCb, ISessionListener {

    /* renamed from: n */
    private boolean f7689n;

    /* renamed from: o */
    private long f7690o;

    /* renamed from: p */
    private ScheduledFuture<?> f7691p;

    /* renamed from: q */
    private ScheduledFuture<?> f7692q;

    /* renamed from: r */
    private boolean f7693r;

    /* renamed from: s */
    private ErrorCode f7694s;

    /* renamed from: t */
    private final ILog f7695t;

    /* renamed from: u */
    private final Runnable f7696u;

    /* renamed from: v */
    private final Runnable f7697v;

    /* renamed from: w */
    private final Runnable f7698w;

    /* renamed from: x */
    private final Set<String> f7699x;

    /* renamed from: com.taobao.accs.net.j$a */
    public static class a implements IAuth {

        /* renamed from: a */
        private final String f7700a;

        /* renamed from: b */
        private int f7701b;

        /* renamed from: c */
        private String f7702c;

        /* renamed from: d */
        private final AbstractC1745b f7703d;

        /* renamed from: e */
        private final ILog f7704e;

        public a(AbstractC1745b abstractC1745b, String str) {
            this.f7702c = abstractC1745b.mo6005d();
            this.f7700a = abstractC1745b.m6004c("https://" + str + "/accs/");
            this.f7701b = abstractC1745b.f7656c;
            this.f7703d = abstractC1745b;
            this.f7704e = AccsLogger.getLogger(abstractC1745b.mo6005d());
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            this.f7704e.mo5089i(BaseMonitor.ALARM_POINT_AUTH, "URL", this.f7700a);
            session.request(new Request.Builder().setUrl(this.f7700a).build(), new C1762s(this, authCallback));
        }
    }

    public C1753j(Context context, int i4, String str) throws SpdyErrorException, UnsatisfiedLinkError {
        super(context, i4, str);
        this.f7689n = true;
        this.f7690o = 3600000L;
        this.f7693r = false;
        this.f7694s = null;
        this.f7696u = new RunnableC1754k(this);
        this.f7697v = new RunnableC1755l(this);
        RunnableC1760q runnableC1760q = new RunnableC1760q(this);
        this.f7698w = runnableC1760q;
        this.f7699x = Collections.synchronizedSet(new HashSet());
        ILog logger = AccsLogger.getLogger(mo6005d());
        this.f7695t = logger;
        if (!OrangeAdapter.isTnetLogOff(true)) {
            String strM6122d = UtilityImpl.m6122d(this.f7657d, "inapp");
            logger.mo5083d("config tnet log path:" + strM6122d);
            if (!TextUtils.isEmpty(strM6122d)) {
                Session.configTnetALog(context, strM6122d, UtilityImpl.TNET_FILE_SIZE, 5);
            }
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null || !configByTag.isChannelLoopStart()) {
            logger.mo5083d("channel delay start");
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(runnableC1760q, 120000L, TimeUnit.MILLISECONDS);
        } else {
            logger.mo5083d("channel loop start");
            ThreadPoolExecutorFactory.getScheduledExecutor().scheduleWithFixedDelay(runnableC1760q, 120000L, configByTag.getLoopInterval(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m6038q() {
        if (this.f7662i.isAccsHeartbeatEnable()) {
            ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
            Runnable runnable = this.f7697v;
            long j4 = this.f7690o;
            this.f7691p = scheduledExecutor.scheduleAtFixedRate(runnable, j4, j4, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m6039r() {
        m6040s();
        this.f7695t.mo5088i("startReconnectTask");
        this.f7692q = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleWithFixedDelay(this.f7696u, 120L, 120L, TimeUnit.SECONDS);
    }

    /* renamed from: s */
    private void m6040s() {
        ScheduledFuture<?> scheduledFuture = this.f7692q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f7692q = null;
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public void mo5995a(boolean z3, boolean z4) {
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: c */
    public C1772c mo6003c() {
        return null;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: e */
    public void mo6006e() {
        this.f7695t.mo5085e("shut down");
        this.f7689n = false;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: l */
    public boolean mo6013l() {
        return this.f7693r;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: m */
    public int mo6014m() {
        ErrorCode errorCode = this.f7694s;
        if (errorCode != null) {
            return errorCode.getCodeInt();
        }
        return 0;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: n */
    public void mo6015n() {
        try {
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f7662i.getAppKey());
            if (sessionCenter == null) {
                return;
            }
            String inappHost = this.f7662i.getInappHost();
            sessionCenter.unregisterSessionInfo(inappHost);
            if (this.f7699x.contains(inappHost)) {
                this.f7699x.remove(inappHost);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: o */
    public void mo6016o() {
        this.f7695t.mo5088i("reconnect begin");
        this.f7660g = false;
        mo5990a(this.f7657d);
        ThreadPoolExecutorFactory.getSendScheduledExecutor().execute(new RunnableC1761r(this));
    }

    @Override // anet.channel.ISessionListener
    public void onConnectionChanged(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
        String stringExtra = intent.getStringExtra(Constants.KEY_HOST);
        ErrorCode errorCode = Constants.getErrorCode(intent);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if (booleanExtra) {
            this.f7695t.mo5089i("InAppConnection Available. last status", Boolean.valueOf(this.f7693r));
            m6040s();
            if (!this.f7693r) {
                m6001b(this.f7657d);
            }
        } else {
            if (errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                errorCode = UtilityImpl.m6130g(this.f7657d) ? AccsErrorCode.INAPP_CON_DISCONNECTED.copy().detail(AccsErrorCode.getAllDetails("lost connect")).build() : AccsErrorCode.NO_NETWORK.copy().detail(AccsErrorCode.getAllDetails("lost connect")).build();
            }
            this.f7695t.mo5087e("InAppConnection Not Available ", "error", errorCode);
            m6039r();
        }
        this.f7693r = booleanExtra;
        this.f7694s = errorCode;
        if (errorCode == null || errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
            AccsState.getInstance().m5817b(AccsState.CONNECTION_CHANGE, "h" + stringExtra + C1851ai.f8297at + booleanExtra);
        } else {
            AccsState.getInstance().m5817b(AccsState.CONNECTION_CHANGE, "h" + stringExtra + C1851ai.f8297at + booleanExtra + C1851ai.f8255aD + errorCode.getCodeInt());
            AccsState.getInstance().m5817b(AccsState.RECENT_ERRORS, Integer.valueOf(errorCode.getCodeInt()));
        }
        m6034a(booleanExtra, errorCode);
    }

    @Override // anet.channel.DataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i4, int i5) {
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1758o(this, i5, i4, bArr, tnetSpdySession));
    }

    @Override // anet.channel.DataFrameCb
    public void onException(int i4, int i5, boolean z3, String str) {
        this.f7695t.mo5087e("onException", Constants.KEY_DATA_ID, Integer.valueOf(i4), "errorId", Integer.valueOf(i5), "needRetry", Boolean.valueOf(z3), "detail", str);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1759p(this, i5, str, i4, z3));
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public synchronized void mo5989a() {
        this.f7695t.mo5083d("start");
        this.f7689n = true;
        mo5990a(this.f7657d);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: b */
    public void mo5999b() {
        this.f7659f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: d */
    protected String mo6005d() {
        return "InAppConn_" + this.f7666m;
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5992a(Message message, boolean z3) {
        if (this.f7689n && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() <= 1000) {
                    long j4 = message.f7538Q;
                    if (j4 <= 0) {
                        j4 = 1;
                    }
                    ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new RunnableC1756m(this, message), j4, TimeUnit.MILLISECONDS);
                    if (message.m5875a() == 1 && message.f7536O != null) {
                        if (message.m5880c() && mo5997a(message.f7536O)) {
                            this.f7658e.m5927b(message);
                        }
                        this.f7658e.f7585a.put(message.f7536O, scheduledFutureSchedule);
                    }
                    NetPerformanceMonitor netPerformanceMonitorM5882e = message.m5882e();
                    if (netPerformanceMonitorM5882e != null) {
                        netPerformanceMonitorM5882e.setDeviceId(UtilityImpl.getDeviceId(this.f7657d));
                        netPerformanceMonitorM5882e.setConnType(this.f7656c);
                        netPerformanceMonitorM5882e.onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                int size = ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size();
                ErrorCode errorCodeBuild = AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail("inapp " + size).build();
                this.f7658e.m5919a(message, errorCodeBuild);
                this.f7695t.mo5087e("send queue full", "err", errorCodeBuild);
                return;
            } catch (Throwable th) {
                this.f7695t.mo5086e("send error", th);
                this.f7658e.m5919a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
                return;
            }
        }
        this.f7695t.mo5090w("not running or msg null! " + this.f7689n);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5993a(String str, boolean z3, long j4) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1757n(this, str, j4, z3), j4, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5994a(String str, boolean z3, String str2) {
        Session session;
        try {
            Message messageM5925b = this.f7658e.m5925b(str);
            if (messageM5925b != null && messageM5925b.f7550f != null && (session = SessionCenter.getInstance(this.f7662i.getAppKey()).get(messageM5925b.f7550f.toString(), 0L)) != null) {
                if (z3) {
                    session.close(true);
                } else {
                    session.ping(true);
                }
            }
        } catch (Exception e4) {
            this.f7695t.mo5086e("onTimeOut", e4);
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    public boolean mo5997a(String str) {
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f7658e.f7585a.get(str);
        boolean zCancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (zCancel) {
            this.f7695t.mo5089i("cancel", "customDataId", str);
        }
        return zCancel;
    }

    /* renamed from: a */
    public void m6043a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            this.f7695t.mo5085e("onReceiveAccsHeartbeatResp response data is null");
            return;
        }
        this.f7695t.mo5089i("onReceiveAccsHeartbeatResp", Constants.KEY_DATA, jSONObject);
        try {
            int i4 = jSONObject.getInt("timeInterval");
            if (i4 == -1) {
                ScheduledFuture<?> scheduledFuture = this.f7691p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            } else {
                long j4 = i4 * 1000;
                if (this.f7690o != j4) {
                    if (i4 == 0) {
                        j4 = 3600000;
                    }
                    this.f7690o = j4;
                    ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
                    Runnable runnable = this.f7697v;
                    long j5 = this.f7690o;
                    this.f7691p = scheduledExecutor.scheduleAtFixedRate(runnable, j5, j5, TimeUnit.MILLISECONDS);
                }
            }
        } catch (JSONException e4) {
            this.f7695t.mo5086e("onReceiveAccsHeartbeatResp", e4);
        }
    }

    @Override // com.taobao.accs.net.AbstractC1745b
    /* renamed from: a */
    protected void mo5990a(Context context) {
        try {
            if (this.f7660g) {
                return;
            }
            super.mo5990a(context);
            String inappHost = this.f7662i.getInappHost();
            boolean z3 = false;
            if (mo6009h() && this.f7662i.isKeepalive()) {
                z3 = true;
            } else {
                this.f7695t.mo5083d("initAwcn close keep alive");
            }
            m6041a(SessionCenter.getInstance(this.f7662i.getAppKey()), inappHost, z3);
            this.f7660g = true;
            this.f7695t.mo5088i("initAwcn success!");
        } catch (Throwable th) {
            this.f7695t.mo5086e("initAwcn", th);
        }
    }

    /* renamed from: a */
    public void m6041a(SessionCenter sessionCenter, String str, boolean z3) {
        if (this.f7699x.contains(str)) {
            return;
        }
        SessionInfo sessionInfoCreate = SessionInfo.create(str, z3, true, new a(this, str), null, this);
        sessionCenter.registerAccsSessionListener(this);
        sessionCenter.registerPublicKey(str, this.f7662i.getInappPubKey());
        sessionCenter.registerSessionInfo(sessionInfoCreate);
        this.f7699x.add(str);
        this.f7695t.mo5089i("registerSessionInfo", Constants.KEY_HOST, str);
    }

    /* renamed from: a */
    public void m6042a(AccsClientConfig accsClientConfig) {
        if (accsClientConfig == null) {
            this.f7695t.mo5088i("updateConfig null");
            return;
        }
        if (accsClientConfig.equals(this.f7662i)) {
            this.f7695t.mo5088i("updateConfig not any changed");
            return;
        }
        try {
            boolean z3 = false;
            this.f7695t.mo5089i("updateConfig", "old", this.f7662i, "new", accsClientConfig);
            String inappHost = this.f7662i.getInappHost();
            String inappHost2 = accsClientConfig.getInappHost();
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f7662i.getAppKey());
            if (sessionCenter == null) {
                this.f7695t.mo5083d("old session not exist, no need update");
                return;
            }
            sessionCenter.unregisterSessionInfo(inappHost);
            if (this.f7699x.contains(inappHost)) {
                this.f7699x.remove(inappHost);
            }
            String appKey = this.f7662i.getAppKey();
            this.f7662i = accsClientConfig;
            this.f7655b = accsClientConfig.getAppKey();
            this.f7666m = this.f7662i.getTag();
            if (!appKey.equals(this.f7655b)) {
                sessionCenter = SessionCenter.getInstance(this.f7655b);
            }
            if (mo6009h() && this.f7662i.isKeepalive()) {
                z3 = true;
            } else {
                this.f7695t.mo5088i("updateConfig close keepalive");
            }
            m6041a(sessionCenter, inappHost2, z3);
            this.f7695t.mo5088i("updateConfig done");
        } catch (Throwable th) {
            this.f7695t.mo5086e("updateConfig", th);
        }
    }

    /* renamed from: a */
    private void m6034a(boolean z3, ErrorCode errorCode) {
        try {
            for (ConnectionListener connectionListener : ACCSClient.getAccsClient(this.f7666m).getConnectionListeners()) {
                if (z3) {
                    connectionListener.onConnect();
                } else {
                    connectionListener.onDisconnect(errorCode.getCodeInt(), errorCode.getMsg());
                }
            }
        } catch (AccsException e4) {
            e4.printStackTrace();
        }
    }
}

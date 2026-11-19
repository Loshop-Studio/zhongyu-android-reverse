package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
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
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p085ut.p086a.C7669c;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.j */
/* loaded from: classes5.dex */
public class C7650j extends AbstractC7642b implements DataFrameCb, ISessionListener {

    /* renamed from: n */
    private boolean f13087n;

    /* renamed from: o */
    private long f13088o;

    /* renamed from: p */
    private ScheduledFuture<?> f13089p;

    /* renamed from: q */
    private ScheduledFuture<?> f13090q;

    /* renamed from: r */
    private boolean f13091r;

    /* renamed from: s */
    private ErrorCode f13092s;

    /* renamed from: t */
    private final ILog f13093t;

    /* renamed from: u */
    private final Runnable f13094u;

    /* renamed from: v */
    private final Runnable f13095v;

    /* renamed from: w */
    private final Runnable f13096w;

    /* renamed from: x */
    private final Set<String> f13097x;

    /* renamed from: com.taobao.accs.net.j$a */
    public static class a implements IAuth {

        /* renamed from: a */
        private final String f13098a;

        /* renamed from: b */
        private int f13099b;

        /* renamed from: c */
        private String f13100c;

        /* renamed from: d */
        private final AbstractC7642b f13101d;

        /* renamed from: e */
        private final ILog f13102e;

        public a(AbstractC7642b abstractC7642b, String str) {
            this.f13100c = abstractC7642b.mo10031d();
            this.f13098a = abstractC7642b.m10030c("https://" + str + "/accs/");
            this.f13099b = abstractC7642b.f13054c;
            this.f13101d = abstractC7642b;
            this.f13102e = AccsLogger.getLogger(abstractC7642b.mo10031d());
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            this.f13102e.mo3539i(BaseMonitor.ALARM_POINT_AUTH, "URL", this.f13098a);
            session.request(new Request.Builder().setUrl(this.f13098a).build(), new C7659s(this, authCallback));
        }
    }

    public C7650j(Context context, int i10, String str) {
        super(context, i10, str);
        this.f13087n = true;
        this.f13088o = 3600000L;
        this.f13091r = false;
        this.f13092s = null;
        this.f13094u = new RunnableC7651k(this);
        this.f13095v = new RunnableC7652l(this);
        RunnableC7657q runnableC7657q = new RunnableC7657q(this);
        this.f13096w = runnableC7657q;
        this.f13097x = Collections.synchronizedSet(new HashSet());
        ILog logger = AccsLogger.getLogger(mo10031d());
        this.f13093t = logger;
        if (!OrangeAdapter.isTnetLogOff(true)) {
            String strM10148d = UtilityImpl.m10148d(this.f13055d, "inapp");
            logger.mo3533d("config tnet log path:" + strM10148d);
            if (!TextUtils.isEmpty(strM10148d)) {
                Session.configTnetALog(context, strM10148d, UtilityImpl.TNET_FILE_SIZE, 5);
            }
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null || !configByTag.isChannelLoopStart()) {
            logger.mo3533d("channel delay start");
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(runnableC7657q, 120000L, TimeUnit.MILLISECONDS);
        } else {
            logger.mo3533d("channel loop start");
            ThreadPoolExecutorFactory.getScheduledExecutor().scheduleWithFixedDelay(runnableC7657q, 120000L, configByTag.getLoopInterval(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m10064q() {
        if (this.f13060i.isAccsHeartbeatEnable()) {
            ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
            Runnable runnable = this.f13095v;
            long j10 = this.f13088o;
            this.f13089p = scheduledExecutor.scheduleAtFixedRate(runnable, j10, j10, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m10065r() {
        m10066s();
        this.f13093t.mo3538i("startReconnectTask");
        this.f13090q = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleWithFixedDelay(this.f13094u, 120L, 120L, TimeUnit.SECONDS);
    }

    /* renamed from: s */
    private void m10066s() {
        ScheduledFuture<?> scheduledFuture = this.f13090q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f13090q = null;
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10021a(boolean z10, boolean z11) {
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: c */
    public C7669c mo10029c() {
        return null;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: e */
    public void mo10032e() {
        this.f13093t.mo3535e("shut down");
        this.f13087n = false;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: l */
    public boolean mo10039l() {
        return this.f13091r;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: m */
    public int mo10040m() {
        ErrorCode errorCode = this.f13092s;
        if (errorCode != null) {
            return errorCode.getCodeInt();
        }
        return 0;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: n */
    public void mo10041n() {
        try {
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f13060i.getAppKey());
            if (sessionCenter == null) {
                return;
            }
            String inappHost = this.f13060i.getInappHost();
            sessionCenter.unregisterSessionInfo(inappHost);
            if (this.f13097x.contains(inappHost)) {
                this.f13097x.remove(inappHost);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: o */
    public void mo10042o() {
        this.f13093t.mo3538i("reconnect begin");
        this.f13058g = false;
        mo10016a(this.f13055d);
        ThreadPoolExecutorFactory.getSendScheduledExecutor().execute(new RunnableC7658r(this));
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
            this.f13093t.mo3539i("InAppConnection Available. last status", Boolean.valueOf(this.f13091r));
            m10066s();
            if (!this.f13091r) {
                m10027b(this.f13055d);
            }
        } else {
            if (errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                errorCode = UtilityImpl.m10156g(this.f13055d) ? AccsErrorCode.INAPP_CON_DISCONNECTED.copy().detail(AccsErrorCode.getAllDetails("lost connect")).build() : AccsErrorCode.NO_NETWORK.copy().detail(AccsErrorCode.getAllDetails("lost connect")).build();
            }
            this.f13093t.mo3537e("InAppConnection Not Available ", "error", errorCode);
            m10065r();
        }
        this.f13091r = booleanExtra;
        this.f13092s = errorCode;
        if (errorCode == null || errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
            AccsState.getInstance().m9843b(AccsState.CONNECTION_CHANGE, "h" + stringExtra + "a" + booleanExtra);
        } else {
            AccsState.getInstance().m9843b(AccsState.CONNECTION_CHANGE, "h" + stringExtra + "a" + booleanExtra + "c" + errorCode.getCodeInt());
            AccsState.getInstance().m9843b(AccsState.RECENT_ERRORS, Integer.valueOf(errorCode.getCodeInt()));
        }
        m10060a(booleanExtra, errorCode);
    }

    @Override // anet.channel.DataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i10, int i11) {
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7655o(this, i11, i10, bArr, tnetSpdySession));
    }

    @Override // anet.channel.DataFrameCb
    public void onException(int i10, int i11, boolean z10, String str) {
        this.f13093t.mo3537e("onException", Constants.KEY_DATA_ID, Integer.valueOf(i10), "errorId", Integer.valueOf(i11), "needRetry", Boolean.valueOf(z10), "detail", str);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7656p(this, i11, str, i10, z10));
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: b */
    public void mo10025b() {
        this.f13057f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: d */
    public String mo10031d() {
        return "InAppConn_" + this.f13064m;
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public synchronized void mo10015a() {
        this.f13093t.mo3533d("start");
        this.f13087n = true;
        mo10016a(this.f13055d);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10018a(Message message, boolean z10) {
        if (this.f13087n && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() <= 1000) {
                    long j10 = message.f12936Q;
                    if (j10 <= 0) {
                        j10 = 1;
                    }
                    ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new RunnableC7653m(this, message), j10, TimeUnit.MILLISECONDS);
                    if (message.m9901a() == 1 && message.f12934O != null) {
                        if (message.m9906c() && mo10023a(message.f12934O)) {
                            this.f13056e.m9953b(message);
                        }
                        this.f13056e.f12983a.put(message.f12934O, scheduledFutureSchedule);
                    }
                    NetPerformanceMonitor netPerformanceMonitorM9908e = message.m9908e();
                    if (netPerformanceMonitorM9908e != null) {
                        netPerformanceMonitorM9908e.setDeviceId(UtilityImpl.getDeviceId(this.f13055d));
                        netPerformanceMonitorM9908e.setConnType(this.f13054c);
                        netPerformanceMonitorM9908e.onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                int size = ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size();
                ErrorCode errorCodeBuild = AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail("inapp " + size).build();
                this.f13056e.m9945a(message, errorCodeBuild);
                this.f13093t.mo3537e("send queue full", NotificationCompat.CATEGORY_ERROR, errorCodeBuild);
                return;
            } catch (Throwable th) {
                this.f13093t.mo3536e("send error", th);
                this.f13056e.m9945a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
                return;
            }
        }
        this.f13093t.mo3540w("not running or msg null! " + this.f13087n);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10019a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7654n(this, str, j10, z10), j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10020a(String str, boolean z10, String str2) {
        Session session;
        try {
            Message messageM9951b = this.f13056e.m9951b(str);
            if (messageM9951b == null || messageM9951b.f12948f == null || (session = SessionCenter.getInstance(this.f13060i.getAppKey()).get(messageM9951b.f12948f.toString(), 0L)) == null) {
                return;
            }
            if (z10) {
                session.close(true);
            } else {
                session.ping(true);
            }
        } catch (Exception e10) {
            this.f13093t.mo3536e("onTimeOut", e10);
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public boolean mo10023a(String str) {
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f13056e.f12983a.get(str);
        boolean zCancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (zCancel) {
            this.f13093t.mo3539i("cancel", "customDataId", str);
        }
        return zCancel;
    }

    /* renamed from: a */
    public void m10069a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            this.f13093t.mo3535e("onReceiveAccsHeartbeatResp response data is null");
            return;
        }
        this.f13093t.mo3539i("onReceiveAccsHeartbeatResp", "data", jSONObject);
        try {
            int i10 = jSONObject.getInt("timeInterval");
            if (i10 == -1) {
                ScheduledFuture<?> scheduledFuture = this.f13089p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    return;
                }
                return;
            }
            long j10 = i10 * 1000;
            if (this.f13088o != j10) {
                if (i10 == 0) {
                    j10 = 3600000;
                }
                this.f13088o = j10;
                ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
                Runnable runnable = this.f13095v;
                long j11 = this.f13088o;
                this.f13089p = scheduledExecutor.scheduleAtFixedRate(runnable, j11, j11, TimeUnit.MILLISECONDS);
            }
        } catch (JSONException e10) {
            this.f13093t.mo3536e("onReceiveAccsHeartbeatResp", e10);
        }
    }

    @Override // com.taobao.accs.net.AbstractC7642b
    /* renamed from: a */
    public void mo10016a(Context context) {
        boolean z10;
        try {
            if (this.f13058g) {
                return;
            }
            super.mo10016a(context);
            String inappHost = this.f13060i.getInappHost();
            if (mo10035h() && this.f13060i.isKeepalive()) {
                z10 = true;
            } else {
                this.f13093t.mo3533d("initAwcn close keep alive");
                z10 = false;
            }
            m10067a(SessionCenter.getInstance(this.f13060i.getAppKey()), inappHost, z10);
            this.f13058g = true;
            this.f13093t.mo3538i("initAwcn success!");
        } catch (Throwable th) {
            this.f13093t.mo3536e("initAwcn", th);
        }
    }

    /* renamed from: a */
    public void m10067a(SessionCenter sessionCenter, String str, boolean z10) {
        if (this.f13097x.contains(str)) {
            return;
        }
        SessionInfo sessionInfoCreate = SessionInfo.create(str, z10, true, new a(this, str), null, this);
        sessionCenter.registerAccsSessionListener(this);
        sessionCenter.registerPublicKey(str, this.f13060i.getInappPubKey());
        sessionCenter.registerSessionInfo(sessionInfoCreate);
        this.f13097x.add(str);
        this.f13093t.mo3539i("registerSessionInfo", Constants.KEY_HOST, str);
    }

    /* renamed from: a */
    public void m10068a(AccsClientConfig accsClientConfig) {
        boolean z10;
        if (accsClientConfig == null) {
            this.f13093t.mo3538i("updateConfig null");
            return;
        }
        if (!accsClientConfig.equals(this.f13060i)) {
            try {
                this.f13093t.mo3539i("updateConfig", "old", this.f13060i, "new", accsClientConfig);
                String inappHost = this.f13060i.getInappHost();
                String inappHost2 = accsClientConfig.getInappHost();
                SessionCenter sessionCenter = SessionCenter.getInstance(this.f13060i.getAppKey());
                if (sessionCenter == null) {
                    this.f13093t.mo3533d("old session not exist, no need update");
                    return;
                }
                sessionCenter.unregisterSessionInfo(inappHost);
                if (this.f13097x.contains(inappHost)) {
                    this.f13097x.remove(inappHost);
                }
                String appKey = this.f13060i.getAppKey();
                this.f13060i = accsClientConfig;
                this.f13053b = accsClientConfig.getAppKey();
                this.f13064m = this.f13060i.getTag();
                if (!appKey.equals(this.f13053b)) {
                    sessionCenter = SessionCenter.getInstance(this.f13053b);
                }
                if (mo10035h() && this.f13060i.isKeepalive()) {
                    z10 = true;
                } else {
                    this.f13093t.mo3538i("updateConfig close keepalive");
                    z10 = false;
                }
                m10067a(sessionCenter, inappHost2, z10);
                this.f13093t.mo3538i("updateConfig done");
                return;
            } catch (Throwable th) {
                this.f13093t.mo3536e("updateConfig", th);
                return;
            }
        }
        this.f13093t.mo3538i("updateConfig not any changed");
    }

    /* renamed from: a */
    private void m10060a(boolean z10, ErrorCode errorCode) {
        try {
            for (ConnectionListener connectionListener : ACCSClient.getAccsClient(this.f13064m).getConnectionListeners()) {
                if (z10) {
                    connectionListener.onConnect();
                } else {
                    connectionListener.onDisconnect(errorCode.getCodeInt(), errorCode.getMsg());
                }
            }
        } catch (AccsException e10) {
            e10.printStackTrace();
        }
    }
}

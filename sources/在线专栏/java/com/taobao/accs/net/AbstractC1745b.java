package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsException;
import com.taobao.accs.client.C1717c;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C1726d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p064ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p064ut.p065a.C1772c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.b */
/* loaded from: classes.dex */
public abstract class AbstractC1745b {
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;

    /* renamed from: a */
    public String f7654a;

    /* renamed from: b */
    public String f7655b;

    /* renamed from: c */
    protected int f7656c;

    /* renamed from: d */
    protected Context f7657d;

    /* renamed from: e */
    protected C1726d f7658e;

    /* renamed from: h */
    public C1717c f7661h;

    /* renamed from: i */
    public AccsClientConfig f7662i;

    /* renamed from: j */
    protected String f7663j;

    /* renamed from: m */
    public String f7666m;

    /* renamed from: o */
    private Runnable f7668o;

    /* renamed from: p */
    private ScheduledFuture<?> f7669p;

    /* renamed from: f */
    protected int f7659f = 0;

    /* renamed from: n */
    private long f7667n = 0;

    /* renamed from: g */
    protected volatile boolean f7660g = false;

    /* renamed from: k */
    protected String f7664k = null;

    /* renamed from: l */
    protected LinkedHashMap<Integer, Message> f7665l = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            return size() > 10;
        }
    };

    protected AbstractC1745b(Context context, int i4, String str) {
        this.f7655b = "";
        this.f7656c = i4;
        this.f7657d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            ALog.m6092e(mo6005d(), "BaseConnection config null!!", new Object[0]);
            try {
                configByTag = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppKey(context)).setTag(str).build();
            } catch (AccsException e4) {
                ALog.m6091e(mo6005d(), "BaseConnection build config", e4, new Object[0]);
            }
        }
        this.f7666m = configByTag.getTag();
        this.f7655b = configByTag.getAppKey();
        this.f7662i = configByTag;
        C1726d c1726d = new C1726d(context, this);
        this.f7658e = c1726d;
        c1726d.f7586b = this.f7656c;
        ALog.m6090d(mo6005d(), "new connection", new Object[0]);
    }

    /* renamed from: a */
    protected String m5988a(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 4 ? "DISCONNECTED" : "DISCONNECTING" : "CONNECTING" : "CONNECTED";
    }

    /* renamed from: a */
    public abstract void mo5989a();

    /* renamed from: a */
    protected abstract void mo5992a(Message message, boolean z3);

    /* renamed from: a */
    protected void mo5993a(String str, boolean z3, long j4) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1746c(this, str, j4, z3), j4, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    protected abstract void mo5994a(String str, boolean z3, String str2);

    /* renamed from: a */
    public abstract void mo5995a(boolean z3, boolean z4);

    /* renamed from: a */
    public abstract boolean mo5997a(String str);

    /* renamed from: b */
    public abstract void mo5999b();

    /* renamed from: b */
    public void m6002b(Message message, boolean z3) {
        long jM5950a = message.m5875a() != 2 ? this.f7658e.f7588d.m5950a(message.f7529H, message.f7543V) : 0L;
        if (jM5950a == -1) {
            ALog.m6092e(mo6005d(), "sendMessage ready server limit high", Constants.KEY_DATA_ID, message.f7561q);
            this.f7658e.m5919a(message, AccsErrorCode.SERVIER_HIGH_LIMIT);
            return;
        }
        if (jM5950a == -1000) {
            ALog.m6092e(mo6005d(), "sendMessage ready server limit high for brush", Constants.KEY_DATA_ID, message.f7561q);
            this.f7658e.m5919a(message, AccsErrorCode.SERVIER_HIGH_LIMIT_BRUSH);
            return;
        }
        if (jM5950a > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j4 = this.f7667n;
            if (jCurrentTimeMillis > j4) {
                message.f7538Q = jM5950a;
            } else {
                message.f7538Q = (j4 + jM5950a) - System.currentTimeMillis();
            }
            this.f7667n = System.currentTimeMillis() + message.f7538Q;
            ALog.m6092e(mo6005d(), "sendMessage ready delayed", Constants.KEY_DATA_ID, message.f7561q, "type", Message.C1722c.m5891b(message.m5875a()), "delay", Long.valueOf(message.f7538Q));
        } else if ("accs".equals(message.f7529H)) {
            ALog.m6093i(mo6005d(), "sendMessage ready", Constants.KEY_DATA_ID, message.f7561q, "type", Message.C1722c.m5891b(message.m5875a()), "delay", Long.valueOf(message.f7538Q));
        } else if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m6090d(mo6005d(), "sendMessage ready", Constants.KEY_DATA_ID, message.f7561q, "type", Message.C1722c.m5891b(message.m5875a()), "delay", Long.valueOf(message.f7538Q));
        }
        try {
            if (TextUtils.isEmpty(this.f7663j)) {
                this.f7663j = UtilityImpl.getDeviceId(this.f7657d);
            }
            if (message.m5884g()) {
                this.f7658e.m5919a(message, AccsErrorCode.REQ_TIME_OUT.copy().msg("重试或者延期时超时，不发送").detail(AccsErrorCode.getAllDetails(null)).build());
            } else {
                mo5992a(message, z3);
            }
        } catch (RejectedExecutionException unused) {
            int size = ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size();
            this.f7658e.m5919a(message, AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail(" " + size).build());
            ALog.m6092e(mo6005d(), "sendMessage ready queue full", "size", Integer.valueOf(size));
        }
    }

    /* renamed from: c */
    public abstract C1772c mo6003c();

    /* renamed from: c */
    protected String m6004c(String str) {
        String deviceId = UtilityImpl.getDeviceId(this.f7657d);
        try {
            deviceId = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.m6091e(mo6005d(), "buildAuthUrl", th, new Object[0]);
        }
        String strM6103a = UtilityImpl.m6103a(m6010i(), this.f7662i.getAppSecret(), UtilityImpl.getDeviceId(this.f7657d));
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("auth?1=");
        sb.append(deviceId);
        sb.append("&2=");
        sb.append(strM6103a);
        sb.append("&3=");
        sb.append(m6010i());
        if (this.f7664k != null) {
            sb.append("&4=");
            sb.append(this.f7664k);
        }
        sb.append("&5=");
        sb.append(this.f7656c);
        sb.append("&6=");
        sb.append(UtilityImpl.m6125e(this.f7657d));
        sb.append("&7=");
        sb.append(UtilityImpl.m6114b());
        sb.append("&8=");
        sb.append(this.f7656c == 1 ? "1.1.2" : Integer.valueOf(Constants.SDK_VERSION_CODE));
        sb.append("&9=");
        sb.append(System.currentTimeMillis());
        sb.append("&10=");
        sb.append(1);
        sb.append("&11=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&12=");
        sb.append(this.f7657d.getPackageName());
        sb.append("&13=");
        sb.append(UtilityImpl.m6132i(this.f7657d));
        sb.append("&14=");
        sb.append(this.f7654a);
        sb.append("&15=");
        sb.append(UtilityImpl.m6115b(Build.MODEL));
        sb.append("&16=");
        sb.append(UtilityImpl.m6115b(Build.BRAND));
        sb.append("&17=");
        sb.append(Constants.SDK_VERSION_CODE);
        sb.append("&19=");
        sb.append(!m6012k() ? 1 : 0);
        sb.append("&20=");
        sb.append(this.f7662i.getStoreId());
        return sb.toString();
    }

    /* renamed from: d */
    protected abstract String mo6005d();

    /* renamed from: e */
    public void mo6006e() {
    }

    /* renamed from: f */
    protected void m6007f() {
        if (this.f7668o == null) {
            this.f7668o = new RunnableC1747d(this);
        }
        m6008g();
        this.f7669p = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f7668o, 40000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    protected void m6008g() {
        ScheduledFuture<?> scheduledFuture = this.f7669p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: h */
    protected boolean mo6009h() {
        return true;
    }

    /* renamed from: i */
    public String m6010i() {
        return this.f7655b;
    }

    /* renamed from: j */
    public C1717c m6011j() {
        if (this.f7661h == null) {
            ALog.m6090d(mo6005d(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.f7666m);
            this.f7661h = new C1717c(this.f7657d, this.f7666m, this.f7662i.getInappHost(), this.f7655b);
        }
        return this.f7661h;
    }

    /* renamed from: k */
    public boolean m6012k() {
        return 2 == this.f7662i.getSecurity();
    }

    /* renamed from: l */
    public abstract boolean mo6013l();

    /* renamed from: m */
    public abstract int mo6014m();

    /* renamed from: n */
    public abstract void mo6015n();

    /* renamed from: o */
    public abstract void mo6016o();

    /* renamed from: p */
    public void m6017p() {
        C1717c c1717c = this.f7661h;
        if (c1717c != null) {
            c1717c.m5843a();
        }
        this.f7660g = false;
    }

    /* renamed from: a */
    protected boolean m5996a(Message message, int i4) {
        int i5;
        boolean z3 = true;
        try {
            i5 = message.f7539R;
        } catch (Throwable th) {
            th = th;
            z3 = false;
        }
        if (i5 > 3) {
            return false;
        }
        message.f7539R = i5 + 1;
        message.f7538Q = i4;
        ALog.m6092e(mo6005d(), "reSend dataid:" + message.f7561q + " retryTimes:" + message.f7539R, new Object[0]);
        m6002b(message, true);
        try {
            if (message.m5882e() != null) {
                message.m5882e().take_date = 0L;
                message.m5882e().to_tnet_date = 0L;
                NetPerformanceMonitor netPerformanceMonitorM5882e = message.m5882e();
                int i6 = message.f7539R;
                netPerformanceMonitorM5882e.retry_times = i6;
                if (i6 == 1) {
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "total", 0.0d);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            ALog.m6091e(mo6005d(), "reSend error", th, new Object[0]);
            this.f7658e.m5919a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
            return z3;
        }
        return z3;
    }

    /* renamed from: a */
    protected void mo5990a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            int i4 = AccsClientConfig.mEnv;
            if (i4 == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (i4 == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            try {
                AwcnConfig.setSendConnectInfoByService(false);
            } catch (Throwable unused) {
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f7655b).setAppSecret(this.f7662i.getAppSecret()).setAuthCode(this.f7662i.getAuthCode()).setEnv(env).setTag(this.f7662i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.f7662i.getInappPubKey() == 10 || this.f7662i.getInappPubKey() == 11) {
                str = "open";
            }
            StrategyTemplate.getInstance().registerConnProtocol(this.f7662i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
        } catch (Throwable th) {
            ALog.m6091e(mo6005d(), "initAwcn", th, new Object[0]);
        }
    }

    /* renamed from: b */
    protected void m6000b(int i4) {
        if (i4 < 0) {
            ALog.m6092e(mo6005d(), "reSendAck", Constants.KEY_DATA_ID, Integer.valueOf(i4));
            Message message = this.f7665l.get(Integer.valueOf(i4));
            if (message != null) {
                m5996a(message, 5000);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, 0.0d);
            }
        }
    }

    /* renamed from: b */
    public String mo5998b(String str) {
        String inappHost = this.f7662i.getInappHost();
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(TextUtils.isEmpty(str) ? "" : str);
        sb.append(inappHost);
        String string = sb.toString();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb2.append(str);
            sb2.append(inappHost);
            return sb2.toString();
        } catch (Throwable th) {
            ALog.m6091e("InAppConnection", "getHost", th, new Object[0]);
            return string;
        }
    }

    /* renamed from: a */
    public void m5991a(Message message, ErrorCode errorCode) {
        this.f7658e.m5919a(message, errorCode);
    }

    /* renamed from: b */
    public void m6001b(Context context) {
        try {
            ThreadPoolExecutorFactory.schedule(new RunnableC1748e(this, context), 10000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.m6095w(mo6005d(), "startChannelService", th, new Object[0]);
        }
    }
}

package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import androidx.work.WorkRequest;
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
import com.taobao.accs.client.C7614c;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C7623d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p085ut.p086a.C7669c;
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
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* renamed from: com.taobao.accs.net.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7642b {
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;

    /* renamed from: a */
    public String f13052a;

    /* renamed from: b */
    public String f13053b;

    /* renamed from: c */
    protected int f13054c;

    /* renamed from: d */
    protected Context f13055d;

    /* renamed from: e */
    protected C7623d f13056e;

    /* renamed from: h */
    public C7614c f13059h;

    /* renamed from: i */
    public AccsClientConfig f13060i;

    /* renamed from: j */
    protected String f13061j;

    /* renamed from: m */
    public String f13064m;

    /* renamed from: o */
    private Runnable f13066o;

    /* renamed from: p */
    private ScheduledFuture<?> f13067p;

    /* renamed from: f */
    protected int f13057f = 0;

    /* renamed from: n */
    private long f13065n = 0;

    /* renamed from: g */
    protected volatile boolean f13058g = false;

    /* renamed from: k */
    protected String f13062k = null;

    /* renamed from: l */
    protected LinkedHashMap<Integer, Message> f13063l = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection$1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            return size() > 10;
        }
    };

    public AbstractC7642b(Context context, int i10, String str) {
        this.f13053b = "";
        this.f13054c = i10;
        this.f13055d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            ALog.m10118e(mo10031d(), "BaseConnection config null!!", new Object[0]);
            try {
                configByTag = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppKey(context)).setTag(str).build();
            } catch (AccsException e10) {
                ALog.m10117e(mo10031d(), "BaseConnection build config", e10, new Object[0]);
            }
        }
        this.f13064m = configByTag.getTag();
        this.f13053b = configByTag.getAppKey();
        this.f13060i = configByTag;
        C7623d c7623d = new C7623d(context, this);
        this.f13056e = c7623d;
        c7623d.f12984b = this.f13054c;
        ALog.m10116d(mo10031d(), "new connection", new Object[0]);
    }

    /* renamed from: a */
    public String m10014a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? "DISCONNECTED" : "DISCONNECTING" : "CONNECTING" : "CONNECTED";
    }

    /* renamed from: a */
    public abstract void mo10015a();

    /* renamed from: a */
    public abstract void mo10018a(Message message, boolean z10);

    /* renamed from: a */
    public abstract void mo10020a(String str, boolean z10, String str2);

    /* renamed from: a */
    public abstract void mo10021a(boolean z10, boolean z11);

    /* renamed from: a */
    public abstract boolean mo10023a(String str);

    /* renamed from: b */
    public abstract void mo10025b();

    /* renamed from: b */
    public void m10028b(Message message, boolean z10) {
        long jM9976a = message.m9901a() != 2 ? this.f13056e.f12986d.m9976a(message.f12927H, message.f12941V) : 0L;
        if (jM9976a == -1) {
            ALog.m10118e(mo10031d(), "sendMessage ready server limit high", Constants.KEY_DATA_ID, message.f12959q);
            this.f13056e.m9945a(message, AccsErrorCode.SERVIER_HIGH_LIMIT);
            return;
        }
        if (jM9976a == -1000) {
            ALog.m10118e(mo10031d(), "sendMessage ready server limit high for brush", Constants.KEY_DATA_ID, message.f12959q);
            this.f13056e.m9945a(message, AccsErrorCode.SERVIER_HIGH_LIMIT_BRUSH);
            return;
        }
        if (jM9976a > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f13065n;
            if (jCurrentTimeMillis > j10) {
                message.f12936Q = jM9976a;
            } else {
                message.f12936Q = (j10 + jM9976a) - System.currentTimeMillis();
            }
            this.f13065n = System.currentTimeMillis() + message.f12936Q;
            ALog.m10118e(mo10031d(), "sendMessage ready delayed", Constants.KEY_DATA_ID, message.f12959q, "type", Message.C7619c.m9917b(message.m9901a()), "delay", Long.valueOf(message.f12936Q));
        } else if ("accs".equals(message.f12927H)) {
            ALog.m10119i(mo10031d(), "sendMessage ready", Constants.KEY_DATA_ID, message.f12959q, "type", Message.C7619c.m9917b(message.m9901a()), "delay", Long.valueOf(message.f12936Q));
        } else if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m10116d(mo10031d(), "sendMessage ready", Constants.KEY_DATA_ID, message.f12959q, "type", Message.C7619c.m9917b(message.m9901a()), "delay", Long.valueOf(message.f12936Q));
        }
        try {
            if (TextUtils.isEmpty(this.f13061j)) {
                this.f13061j = UtilityImpl.getDeviceId(this.f13055d);
            }
            if (message.m9910g()) {
                this.f13056e.m9945a(message, AccsErrorCode.REQ_TIME_OUT.copy().msg("重试或者延期时超时，不发送").detail(AccsErrorCode.getAllDetails(null)).build());
            } else {
                mo10018a(message, z10);
            }
        } catch (RejectedExecutionException unused) {
            int size = ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size();
            this.f13056e.m9945a(message, AccsErrorCode.MESSAGE_QUEUE_FULL.copy().detail(" " + size).build());
            ALog.m10118e(mo10031d(), "sendMessage ready queue full", "size", Integer.valueOf(size));
        }
    }

    /* renamed from: c */
    public abstract C7669c mo10029c();

    /* renamed from: c */
    public String m10030c(String str) {
        String deviceId = UtilityImpl.getDeviceId(this.f13055d);
        try {
            deviceId = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.m10117e(mo10031d(), "buildAuthUrl", th, new Object[0]);
        }
        String strM10129a = UtilityImpl.m10129a(m10036i(), this.f13060i.getAppSecret(), UtilityImpl.getDeviceId(this.f13055d));
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(str);
        sb2.append("auth?1=");
        sb2.append(deviceId);
        sb2.append("&2=");
        sb2.append(strM10129a);
        sb2.append("&3=");
        sb2.append(m10036i());
        if (this.f13062k != null) {
            sb2.append("&4=");
            sb2.append(this.f13062k);
        }
        sb2.append("&5=");
        sb2.append(this.f13054c);
        sb2.append("&6=");
        sb2.append(UtilityImpl.m10151e(this.f13055d));
        sb2.append("&7=");
        sb2.append(UtilityImpl.m10140b());
        sb2.append("&8=");
        sb2.append(this.f13054c == 1 ? "1.1.2" : Integer.valueOf(Constants.SDK_VERSION_CODE));
        sb2.append("&9=");
        sb2.append(System.currentTimeMillis());
        sb2.append("&10=");
        sb2.append(1);
        sb2.append("&11=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("&12=");
        sb2.append(this.f13055d.getPackageName());
        sb2.append("&13=");
        sb2.append(UtilityImpl.m10158i(this.f13055d));
        sb2.append("&14=");
        sb2.append(this.f13052a);
        sb2.append("&15=");
        sb2.append(UtilityImpl.m10141b(Build.MODEL));
        sb2.append("&16=");
        sb2.append(UtilityImpl.m10141b(Build.BRAND));
        sb2.append("&17=");
        sb2.append(Constants.SDK_VERSION_CODE);
        sb2.append("&19=");
        sb2.append(!m10038k() ? 1 : 0);
        sb2.append("&20=");
        sb2.append(this.f13060i.getStoreId());
        return sb2.toString();
    }

    /* renamed from: d */
    public abstract String mo10031d();

    /* renamed from: e */
    public void mo10032e() {
    }

    /* renamed from: f */
    public void m10033f() {
        if (this.f13066o == null) {
            this.f13066o = new RunnableC7644d(this);
        }
        m10034g();
        this.f13067p = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f13066o, 40000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    public void m10034g() {
        ScheduledFuture<?> scheduledFuture = this.f13067p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: h */
    public boolean mo10035h() {
        return true;
    }

    /* renamed from: i */
    public String m10036i() {
        return this.f13053b;
    }

    /* renamed from: j */
    public C7614c m10037j() {
        if (this.f13059h == null) {
            ALog.m10116d(mo10031d(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.f13064m);
            this.f13059h = new C7614c(this.f13055d, this.f13064m, this.f13060i.getInappHost(), this.f13053b);
        }
        return this.f13059h;
    }

    /* renamed from: k */
    public boolean m10038k() {
        return 2 == this.f13060i.getSecurity();
    }

    /* renamed from: l */
    public abstract boolean mo10039l();

    /* renamed from: m */
    public abstract int mo10040m();

    /* renamed from: n */
    public abstract void mo10041n();

    /* renamed from: o */
    public abstract void mo10042o();

    /* renamed from: p */
    public void m10043p() {
        C7614c c7614c = this.f13059h;
        if (c7614c != null) {
            c7614c.m9869a();
        }
        this.f13058g = false;
    }

    /* renamed from: a */
    public void mo10019a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7643c(this, str, j10, z10), j10, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public boolean m10022a(Message message, int i10) {
        boolean z10;
        try {
            int i11 = message.f12937R;
            if (i11 > 3) {
                return false;
            }
            z10 = true;
            message.f12937R = i11 + 1;
            message.f12936Q = i10;
            ALog.m10118e(mo10031d(), "reSend dataid:" + message.f12959q + " retryTimes:" + message.f12937R, new Object[0]);
            m10028b(message, true);
            try {
                if (message.m9908e() != null) {
                    message.m9908e().take_date = 0L;
                    message.m9908e().to_tnet_date = 0L;
                    NetPerformanceMonitor netPerformanceMonitorM9908e = message.m9908e();
                    int i12 = message.f12937R;
                    netPerformanceMonitorM9908e.retry_times = i12;
                    if (i12 == 1) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "total", AudioStats.AUDIO_AMPLITUDE_NONE);
                        return true;
                    }
                }
                return true;
            } catch (Throwable th) {
                th = th;
                ALog.m10117e(mo10031d(), "reSend error", th, new Object[0]);
                this.f13056e.m9945a(message, AccsErrorCode.SEND_LOCAL_EXCEPTION.copy().detail(AccsErrorCode.getExceptionInfo(th)).build());
                return z10;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
    }

    /* renamed from: a */
    public void mo10016a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            int i10 = AccsClientConfig.mEnv;
            if (i10 == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (i10 == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            try {
                AwcnConfig.setSendConnectInfoByService(false);
            } catch (Throwable unused) {
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f13053b).setAppSecret(this.f13060i.getAppSecret()).setAuthCode(this.f13060i.getAuthCode()).setEnv(env).setTag(this.f13060i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.f13060i.getInappPubKey() == 10 || this.f13060i.getInappPubKey() == 11) {
                str = "open";
            }
            StrategyTemplate.getInstance().registerConnProtocol(this.f13060i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
        } catch (Throwable th) {
            ALog.m10117e(mo10031d(), "initAwcn", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public void m10026b(int i10) {
        if (i10 < 0) {
            ALog.m10118e(mo10031d(), "reSendAck", Constants.KEY_DATA_ID, Integer.valueOf(i10));
            Message message = this.f13063l.get(Integer.valueOf(i10));
            if (message != null) {
                m10022a(message, DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, AudioStats.AUDIO_AMPLITUDE_NONE);
            }
        }
    }

    /* renamed from: b */
    public String mo10024b(String str) {
        String inappHost = this.f13060i.getInappHost();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(TextUtils.isEmpty(str) ? "" : str);
        sb2.append(inappHost);
        String string = sb2.toString();
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb3.append(str);
            sb3.append(inappHost);
            return sb3.toString();
        } catch (Throwable th) {
            ALog.m10117e("InAppConnection", "getHost", th, new Object[0]);
            return string;
        }
    }

    /* renamed from: b */
    public void m10027b(Context context) {
        try {
            ThreadPoolExecutorFactory.schedule(new RunnableC7645e(this, context), WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.m10121w(mo10031d(), "startChannelService", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m10017a(Message message, ErrorCode errorCode) {
        this.f13056e.m9945a(message, errorCode);
    }
}

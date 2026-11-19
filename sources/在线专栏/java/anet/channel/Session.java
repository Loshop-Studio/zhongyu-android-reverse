package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.C0889a;
import anet.channel.entity.C0890b;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.entity.EventType;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* loaded from: classes.dex */
public abstract class Session implements Comparable<Session> {

    /* renamed from: v */
    static ExecutorService f4989v = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public Context f4990a;

    /* renamed from: c */
    public String f4992c;

    /* renamed from: d */
    public String f4993d;

    /* renamed from: e */
    public String f4994e;

    /* renamed from: f */
    public String f4995f;

    /* renamed from: g */
    public int f4996g;

    /* renamed from: h */
    public String f4997h;

    /* renamed from: i */
    public int f4998i;

    /* renamed from: j */
    public ConnType f4999j;

    /* renamed from: k */
    public IConnStrategy f5000k;

    /* renamed from: m */
    public boolean f5002m;

    /* renamed from: o */
    protected Runnable f5004o;

    /* renamed from: p */
    public final String f5005p;

    /* renamed from: q */
    public final SessionStatistic f5006q;

    /* renamed from: r */
    public int f5007r;

    /* renamed from: s */
    public int f5008s;

    /* renamed from: x */
    private Future<?> f5012x;

    /* renamed from: b */
    Map<EventCb, Integer> f4991b = new LinkedHashMap();

    /* renamed from: w */
    private boolean f5011w = false;

    /* renamed from: l */
    public String f5001l = null;

    /* renamed from: n */
    public int f5003n = 6;

    /* renamed from: t */
    public boolean f5009t = false;

    /* renamed from: u */
    protected boolean f5010u = true;

    /* renamed from: y */
    private List<Long> f5013y = null;

    /* renamed from: z */
    private long f5014z = 0;

    /* renamed from: anet.channel.Session$a */
    public static class C0845a {
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;

        /* renamed from: a */
        static final String[] f5015a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        /* renamed from: a */
        static String m4348a(int i4) {
            return f5015a[i4];
        }
    }

    public Session(Context context, C0889a c0889a) {
        boolean z3 = false;
        this.f5002m = false;
        this.f4990a = context;
        String strM4446a = c0889a.m4446a();
        this.f4994e = strM4446a;
        this.f4995f = strM4446a;
        this.f4996g = c0889a.m4447b();
        this.f4999j = c0889a.m4448c();
        String strM4451f = c0889a.m4451f();
        this.f4992c = strM4451f;
        this.f4993d = strM4451f.substring(strM4451f.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f5008s = c0889a.m4450e();
        this.f5007r = c0889a.m4449d();
        IConnStrategy iConnStrategy = c0889a.f5142a;
        this.f5000k = iConnStrategy;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z3 = true;
        }
        this.f5002m = z3;
        this.f5005p = c0889a.m4453h();
        SessionStatistic sessionStatistic = new SessionStatistic(c0889a);
        this.f5006q = sessionStatistic;
        sessionStatistic.host = this.f4993d;
    }

    public static void configTnetALog(Context context, String str, int i4, int i5) throws SpdyErrorException, UnsatisfiedLinkError {
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent == null || !SpdyAgent.checkLoadSucc()) {
            ALog.m4638e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        } else {
            spdyAgent.configLogFile(str, i4, i5);
        }
    }

    /* renamed from: a */
    protected void m4347a() {
        Future<?> future;
        if (this.f5004o == null || (future = this.f5012x) == null) {
            return;
        }
        future.cancel(true);
    }

    public void checkAvailable() {
        ping(true);
    }

    public abstract void close();

    public void close(boolean z3) {
        this.f5009t = z3;
        close();
    }

    public void connect() {
    }

    public IConnStrategy getConnStrategy() {
        return this.f5000k;
    }

    public ConnType getConnType() {
        return this.f4999j;
    }

    public String getHost() {
        return this.f4992c;
    }

    public String getIp() {
        return this.f4994e;
    }

    public int getPort() {
        return this.f4996g;
    }

    public String getRealHost() {
        return this.f4993d;
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public String getUnit() {
        return this.f5001l;
    }

    public void handleCallbacks(int i4, C0890b c0890b) {
        f4989v.submit(new RunnableC0855b(this, i4, c0890b));
    }

    public void handleResponseCode(Request request, int i4) {
        if (request.getHeaders().containsKey(HttpConstant.X_PV) && i4 >= 500 && i4 < 600) {
            synchronized (this) {
                if (this.f5013y == null) {
                    this.f5013y = new LinkedList();
                }
                if (this.f5013y.size() < 5) {
                    this.f5013y.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long jLongValue = this.f5013y.remove(0).longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - jLongValue <= 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f5013y.clear();
                    } else {
                        this.f5013y.add(Long.valueOf(jCurrentTimeMillis));
                    }
                }
            }
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey(HttpConstant.X_SWITCH_UNIT)) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.X_SWITCH_UNIT);
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (StringUtils.isStringEqual(this.f5001l, singleHeaderFieldByKey)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f5014z > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                    this.f5014z = jCurrentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public abstract boolean isAvailable();

    public synchronized void notifyStatus(int i4, C0890b c0890b) {
        ALog.m4638e("awcn.Session", "notifyStatus", this.f5005p, "status", C0845a.m4348a(i4));
        if (i4 == this.f5003n) {
            ALog.m4639i("awcn.Session", "ignore notifyStatus", this.f5005p, new Object[0]);
            return;
        }
        this.f5003n = i4;
        if (i4 == 0) {
            handleCallbacks(1, c0890b);
        } else if (i4 == 2) {
            handleCallbacks(256, c0890b);
        } else if (i4 == 4) {
            this.f5001l = StrategyCenter.getInstance().getUnitByHost(this.f4993d);
            handleCallbacks(EventType.AUTH_SUCC, c0890b);
        } else if (i4 == 5) {
            handleCallbacks(1024, c0890b);
        } else if (i4 == 6) {
            onDisconnect();
            if (!this.f5011w) {
                handleCallbacks(2, c0890b);
            }
        }
    }

    public void onDisconnect() {
    }

    public void ping(boolean z3) {
    }

    public void ping(boolean z3, int i4) {
    }

    public void registerEventcb(int i4, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f4991b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i4));
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i4, byte[] bArr, int i5) {
    }

    public void setPingTimeout(int i4) {
        if (this.f5004o == null) {
            this.f5004o = getRecvTimeOutRunnable();
        }
        m4347a();
        Runnable runnable = this.f5004o;
        if (runnable != null) {
            this.f5012x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i4, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.f5005p + '|' + this.f4999j + ']';
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        return ConnType.compare(this.f4999j, session.f4999j);
    }
}

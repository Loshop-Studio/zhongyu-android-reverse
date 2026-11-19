package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import anet.channel.entity.C5012a;
import anet.channel.entity.C5013b;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
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
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* loaded from: classes3.dex */
public abstract class Session implements Comparable<Session> {

    /* renamed from: v */
    static ExecutorService f2267v = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public Context f2268a;

    /* renamed from: c */
    public String f2270c;

    /* renamed from: d */
    public String f2271d;

    /* renamed from: e */
    public String f2272e;

    /* renamed from: f */
    public String f2273f;

    /* renamed from: g */
    public int f2274g;

    /* renamed from: h */
    public String f2275h;

    /* renamed from: i */
    public int f2276i;

    /* renamed from: j */
    public ConnType f2277j;

    /* renamed from: k */
    public IConnStrategy f2278k;

    /* renamed from: m */
    public boolean f2280m;

    /* renamed from: o */
    protected Runnable f2282o;

    /* renamed from: p */
    public final String f2283p;

    /* renamed from: q */
    public final SessionStatistic f2284q;

    /* renamed from: r */
    public int f2285r;

    /* renamed from: s */
    public int f2286s;

    /* renamed from: x */
    private Future<?> f2290x;

    /* renamed from: b */
    Map<EventCb, Integer> f2269b = new LinkedHashMap();

    /* renamed from: w */
    private boolean f2289w = false;

    /* renamed from: l */
    public String f2279l = null;

    /* renamed from: n */
    public int f2281n = 6;

    /* renamed from: t */
    public boolean f2287t = false;

    /* renamed from: u */
    protected boolean f2288u = true;

    /* renamed from: y */
    private List<Long> f2291y = null;

    /* renamed from: z */
    private long f2292z = 0;

    /* renamed from: anet.channel.Session$a */
    public static class C4968a {
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;

        /* renamed from: a */
        static final String[] f2293a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        /* renamed from: a */
        public static String m2239a(int i10) {
            return f2293a[i10];
        }
    }

    public Session(Context context, C5012a c5012a) {
        boolean z10 = false;
        this.f2280m = false;
        this.f2268a = context;
        String strM2337a = c5012a.m2337a();
        this.f2272e = strM2337a;
        this.f2273f = strM2337a;
        this.f2274g = c5012a.m2338b();
        this.f2277j = c5012a.m2339c();
        String strM2342f = c5012a.m2342f();
        this.f2270c = strM2342f;
        this.f2271d = strM2342f.substring(strM2342f.indexOf("://") + 3);
        this.f2286s = c5012a.m2341e();
        this.f2285r = c5012a.m2340d();
        IConnStrategy iConnStrategy = c5012a.f2420a;
        this.f2278k = iConnStrategy;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z10 = true;
        }
        this.f2280m = z10;
        this.f2283p = c5012a.m2344h();
        SessionStatistic sessionStatistic = new SessionStatistic(c5012a);
        this.f2284q = sessionStatistic;
        sessionStatistic.host = this.f2271d;
    }

    public static void configTnetALog(Context context, String str, int i10, int i11) {
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent == null || !SpdyAgent.checkLoadSucc()) {
            ALog.m2529e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        } else {
            spdyAgent.configLogFile(str, i10, i11);
        }
    }

    /* renamed from: a */
    public void m2238a() {
        Future<?> future;
        if (this.f2282o == null || (future = this.f2290x) == null) {
            return;
        }
        future.cancel(true);
    }

    public void checkAvailable() {
        ping(true);
    }

    public abstract void close();

    public void close(boolean z10) {
        this.f2287t = z10;
        close();
    }

    public void connect() {
    }

    public IConnStrategy getConnStrategy() {
        return this.f2278k;
    }

    public ConnType getConnType() {
        return this.f2277j;
    }

    public String getHost() {
        return this.f2270c;
    }

    public String getIp() {
        return this.f2272e;
    }

    public int getPort() {
        return this.f2274g;
    }

    public String getRealHost() {
        return this.f2271d;
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public String getUnit() {
        return this.f2279l;
    }

    public void handleCallbacks(int i10, C5013b c5013b) {
        f2267v.submit(new RunnableC4978b(this, i10, c5013b));
    }

    public void handleResponseCode(Request request, int i10) {
        if (request.getHeaders().containsKey(HttpConstant.X_PV) && i10 >= 500 && i10 < 600) {
            synchronized (this) {
                try {
                    if (this.f2291y == null) {
                        this.f2291y = new LinkedList();
                    }
                    if (this.f2291y.size() < 5) {
                        this.f2291y.add(Long.valueOf(System.currentTimeMillis()));
                    } else {
                        long jLongValue = this.f2291y.remove(0).longValue();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - jLongValue <= 60000) {
                            StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                            this.f2291y.clear();
                        } else {
                            this.f2291y.add(Long.valueOf(jCurrentTimeMillis));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
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
                if (StringUtils.isStringEqual(this.f2279l, singleHeaderFieldByKey)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f2292z > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                    this.f2292z = jCurrentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public abstract boolean isAvailable();

    public synchronized void notifyStatus(int i10, C5013b c5013b) {
        ALog.m2529e("awcn.Session", "notifyStatus", this.f2283p, NotificationCompat.CATEGORY_STATUS, C4968a.m2239a(i10));
        if (i10 == this.f2281n) {
            ALog.m2530i("awcn.Session", "ignore notifyStatus", this.f2283p, new Object[0]);
            return;
        }
        this.f2281n = i10;
        if (i10 == 0) {
            handleCallbacks(1, c5013b);
        } else if (i10 == 2) {
            handleCallbacks(256, c5013b);
        } else if (i10 == 4) {
            this.f2279l = StrategyCenter.getInstance().getUnitByHost(this.f2271d);
            handleCallbacks(512, c5013b);
        } else if (i10 == 5) {
            handleCallbacks(1024, c5013b);
        } else if (i10 == 6) {
            onDisconnect();
            if (!this.f2289w) {
                handleCallbacks(2, c5013b);
            }
        }
    }

    public void onDisconnect() {
    }

    public void ping(boolean z10) {
    }

    public void registerEventcb(int i10, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f2269b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i10));
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
    }

    public void setPingTimeout(int i10) {
        if (this.f2282o == null) {
            this.f2282o = getRecvTimeOutRunnable();
        }
        m2238a();
        Runnable runnable = this.f2282o;
        if (runnable != null) {
            this.f2290x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i10, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.f2283p + '|' + this.f2277j + ']';
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        return ConnType.compare(this.f2277j, session.f2277j);
    }

    public void ping(boolean z10, int i10) {
    }
}

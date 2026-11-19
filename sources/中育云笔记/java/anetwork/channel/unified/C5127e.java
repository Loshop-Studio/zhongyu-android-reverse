package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C5012a;
import anet.channel.entity.C5014c;
import anet.channel.entity.ENV;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C5044d;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.entity.C5121g;
import anetwork.channel.http.NetworkSdkSetting;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.util.RequestConstant;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anetwork.channel.unified.e */
/* loaded from: classes3.dex */
class C5127e implements IUnifiedTask {
    public static final int MAX_RSP_BUFFER_LENGTH = 131072;
    public static final String TAG = "anet.NetworkTask";

    /* renamed from: a */
    C5132j f2927a;

    /* renamed from: b */
    Cache f2928b;

    /* renamed from: c */
    Cache.Entry f2929c;

    /* renamed from: e */
    String f2931e;

    /* renamed from: h */
    volatile AtomicBoolean f2934h;

    /* renamed from: d */
    ByteArrayOutputStream f2930d = null;

    /* renamed from: f */
    volatile Cancelable f2932f = null;

    /* renamed from: g */
    volatile boolean f2933g = false;

    /* renamed from: i */
    int f2935i = 0;

    /* renamed from: j */
    int f2936j = 0;

    /* renamed from: k */
    boolean f2937k = false;

    /* renamed from: l */
    boolean f2938l = false;

    /* renamed from: m */
    a f2939m = null;

    public C5127e(C5132j c5132j, Cache cache, Cache.Entry entry) {
        this.f2928b = null;
        this.f2929c = null;
        this.f2931e = DispatchConstants.OTHER;
        this.f2934h = null;
        this.f2927a = c5132j;
        this.f2934h = c5132j.f2963d;
        this.f2928b = cache;
        this.f2929c = entry;
        this.f2931e = c5132j.f2960a.m2625h().get(HttpConstant.F_REFER);
    }

    /* renamed from: b */
    private Session m2644b() {
        Session throwsException;
        SessionCenter sessionCenterM2639a = m2639a();
        HttpUrl httpUrlM2623f = this.f2927a.f2960a.m2623f();
        boolean zContainsNonDefaultPort = httpUrlM2623f.containsNonDefaultPort();
        C5121g c5121g = this.f2927a.f2960a;
        RequestStatistic requestStatistic = c5121g.f2904b;
        if (c5121g.f2908f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f2927a.f2960a.f2903a != 0 || zContainsNonDefaultPort) {
            return m2637a(null, sessionCenterM2639a, httpUrlM2623f, zContainsNonDefaultPort);
        }
        HttpUrl httpUrlM2641a = m2641a(httpUrlM2623f);
        try {
            throwsException = sessionCenterM2639a.getThrowsException(httpUrlM2641a, C5014c.f2428a, 0L);
        } catch (NoAvailStrategyException unused) {
            return m2637a(null, sessionCenterM2639a, httpUrlM2623f, zContainsNonDefaultPort);
        } catch (Exception unused2) {
            throwsException = null;
        }
        if (throwsException == null) {
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5129g(this, sessionCenterM2639a, httpUrlM2641a, requestStatistic, httpUrlM2623f, zContainsNonDefaultPort), ThreadPoolExecutorFactory.Priority.NORMAL);
            return null;
        }
        ALog.m2530i(TAG, "tryGetSession", this.f2927a.f2962c, "Session", throwsException);
        requestStatistic.spdyRequestSend = true;
        return throwsException;
    }

    /* renamed from: c */
    private void m2645c() {
        SessionCenter sessionCenterM2639a = m2639a();
        HttpUrl httpUrlM2623f = this.f2927a.f2960a.m2623f();
        boolean zContainsNonDefaultPort = httpUrlM2623f.containsNonDefaultPort();
        C5121g c5121g = this.f2927a.f2960a;
        RequestStatistic requestStatistic = c5121g.f2904b;
        Request requestM2615a = c5121g.m2615a();
        if (this.f2927a.f2960a.f2908f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f2927a.f2960a.f2903a != 0 || zContainsNonDefaultPort) {
            m2642a(m2637a(null, sessionCenterM2639a, httpUrlM2623f, zContainsNonDefaultPort), requestM2615a);
            return;
        }
        sessionCenterM2639a.asyncGet(m2641a(httpUrlM2623f), C5014c.f2428a, 3000L, new C5130h(this, requestStatistic, System.currentTimeMillis(), requestM2615a, sessionCenterM2639a, httpUrlM2623f, zContainsNonDefaultPort));
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f2933g = true;
        if (this.f2932f != null) {
            this.f2932f.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2933g) {
            return;
        }
        RequestStatistic requestStatistic = this.f2927a.f2960a.f2904b;
        requestStatistic.f_refer = this.f2931e;
        if (!NetworkStatusHelper.isConnected()) {
            if (NetworkConfigCenter.isRequestDelayRetryForNoNetwork() && requestStatistic.statusCode != -200) {
                requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
                ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5128f(this), 1000L, TimeUnit.MILLISECONDS);
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.m2530i(TAG, "network unavailable", this.f2927a.f2962c, "NetworkStatus", NetworkStatusHelper.getStatus());
            }
            this.f2934h.set(true);
            this.f2927a.m2648a();
            requestStatistic.isDone.set(true);
            requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
            requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_NO_NETWORK);
            requestStatistic.rspEnd = System.currentTimeMillis();
            this.f2927a.f2961b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_NO_NETWORK, (String) null, this.f2927a.f2960a.m2615a()));
            return;
        }
        if (!NetworkConfigCenter.isBgRequestForbidden() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || AppLifecycle.isGoingForeground || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= NetworkConfigCenter.getBgForbidRequestThreshold() || NetworkConfigCenter.isUrlInWhiteList(this.f2927a.f2960a.m2623f()) || NetworkConfigCenter.isBizInWhiteList(this.f2927a.f2960a.m2615a().getBizId()) || this.f2927a.f2960a.m2615a().isAllowRequestInBg()) {
            if (ALog.isPrintLog(2)) {
                C5132j c5132j = this.f2927a;
                ALog.m2530i(TAG, "exec request", c5132j.f2962c, "retryTimes", Integer.valueOf(c5132j.f2960a.f2903a));
            }
            if (NetworkConfigCenter.isGetSessionAsyncEnable()) {
                m2645c();
                return;
            }
            try {
                Session sessionM2644b = m2644b();
                if (sessionM2644b == null) {
                    return;
                }
                m2642a(sessionM2644b, this.f2927a.f2960a.m2615a());
                return;
            } catch (Exception e10) {
                ALog.m2528e(TAG, "send request failed.", this.f2927a.f2962c, e10, new Object[0]);
                return;
            }
        }
        this.f2934h.set(true);
        this.f2927a.m2648a();
        if (ALog.isPrintLog(2)) {
            C5132j c5132j2 = this.f2927a;
            ALog.m2530i(TAG, "request forbidden in background", c5132j2.f2962c, "url", c5132j2.f2960a.m2623f());
        }
        requestStatistic.isDone.set(true);
        requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG;
        requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG);
        requestStatistic.rspEnd = System.currentTimeMillis();
        this.f2927a.f2961b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, (String) null, this.f2927a.f2960a.m2615a()));
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, null, "rt");
        exceptionStatistic.host = this.f2927a.f2960a.m2623f().host();
        exceptionStatistic.url = this.f2927a.f2960a.m2624g();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    /* renamed from: anetwork.channel.unified.e$a */
    public static class a {

        /* renamed from: a */
        int f2940a;

        /* renamed from: b */
        Map<String, List<String>> f2941b;

        /* renamed from: c */
        List<ByteArray> f2942c = new ArrayList();

        public a(int i10, Map<String, List<String>> map) {
            this.f2940a = i10;
            this.f2941b = map;
        }

        /* renamed from: a */
        public void m2647a() {
            Iterator<ByteArray> it = this.f2942c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
        }

        /* renamed from: a */
        public int m2646a(Callback callback, int i10) {
            callback.onResponseCode(this.f2940a, this.f2941b);
            Iterator<ByteArray> it = this.f2942c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                callback.onDataReceiveSize(i11, i10, it.next());
                i11++;
            }
            return i11;
        }
    }

    /* renamed from: a */
    private HttpUrl m2641a(HttpUrl httpUrl) {
        HttpUrl httpUrl2;
        String str = this.f2927a.f2960a.m2625h().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (httpUrl2 = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : httpUrl2;
    }

    /* renamed from: a */
    private SessionCenter m2639a() {
        String strM2616a = this.f2927a.f2960a.m2616a(RequestConstant.APPKEY);
        if (TextUtils.isEmpty(strM2616a)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String strM2616a2 = this.f2927a.f2960a.m2616a(RequestConstant.ENVIRONMENT);
        if (RequestConstant.ENV_PRE.equalsIgnoreCase(strM2616a2)) {
            env = ENV.PREPARE;
        } else if (RequestConstant.ENV_TEST.equalsIgnoreCase(strM2616a2)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.CURRENT_ENV) {
            NetworkSdkSetting.CURRENT_ENV = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(strM2616a, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(strM2616a).setEnv(env).setAuthCode(this.f2927a.f2960a.m2616a(RequestConstant.AUTH_CODE)).build();
        }
        return SessionCenter.getInstance(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Session m2637a(Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z10) {
        C5121g c5121g = this.f2927a.f2960a;
        RequestStatistic requestStatistic = c5121g.f2904b;
        if (session == null && c5121g.m2622e() && !z10 && !NetworkStatusHelper.isProxy()) {
            session = sessionCenter.get(httpUrl, C5014c.f2429b, 0L);
        }
        if (session == null) {
            ALog.m2530i(TAG, "create HttpSession with local DNS", this.f2927a.f2962c, new Object[0]);
            session = new C5044d(GlobalAppRuntimeInfo.getContext(), new C5012a(StringUtils.concatString(httpUrl.scheme(), "://", httpUrl.host()), this.f2927a.f2962c, null));
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.m2530i(TAG, "tryGetHttpSession", this.f2927a.f2962c, "Session", session);
        return session;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private anet.channel.request.Request m2640a(anet.channel.request.Request r7) {
        /*
            r6 = this;
            anetwork.channel.unified.j r0 = r6.f2927a
            anetwork.channel.entity.g r0 = r0.f2960a
            boolean r0 = r0.m2626i()
            if (r0 == 0) goto L3c
            anetwork.channel.unified.j r0 = r6.f2927a
            anetwork.channel.entity.g r0 = r0.f2960a
            java.lang.String r0 = r0.m2624g()
            java.lang.String r0 = anetwork.channel.cookie.CookieManager.getCookie(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3c
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
            java.util.Map r2 = r7.getHeaders()
            java.lang.String r3 = "Cookie"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L38
            java.lang.String r4 = "; "
            java.lang.String r0 = anet.channel.util.StringUtils.concatString(r2, r4, r0)
        L38:
            r1.addHeader(r3, r0)
            goto L3d
        L3c:
            r1 = 0
        L3d:
            anetwork.channel.cache.Cache$Entry r0 = r6.f2929c
            if (r0 == 0) goto L65
            if (r1 != 0) goto L47
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
        L47:
            anetwork.channel.cache.Cache$Entry r0 = r6.f2929c
            java.lang.String r0 = r0.etag
            if (r0 == 0) goto L52
            java.lang.String r2 = "If-None-Match"
            r1.addHeader(r2, r0)
        L52:
            anetwork.channel.cache.Cache$Entry r0 = r6.f2929c
            long r2 = r0.lastModified
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L65
            java.lang.String r0 = "If-Modified-Since"
            java.lang.String r2 = anetwork.channel.cache.C5106a.m2577a(r2)
            r1.addHeader(r0, r2)
        L65:
            anetwork.channel.unified.j r0 = r6.f2927a
            anetwork.channel.entity.g r0 = r0.f2960a
            int r0 = r0.f2903a
            if (r0 != 0) goto L82
            java.lang.String r0 = "weex"
            java.lang.String r2 = r6.f2931e
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L82
            if (r1 != 0) goto L7d
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
        L7d:
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setReadTimeout(r0)
        L82:
            if (r1 != 0) goto L85
            return r7
        L85:
            anet.channel.request.Request r7 = r1.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.C5127e.m2640a(anet.channel.request.Request):anet.channel.request.Request");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2642a(Session session, Request request) {
        if (session == null || this.f2933g) {
            return;
        }
        Request requestM2640a = m2640a(request);
        RequestStatistic requestStatistic = this.f2927a.f2960a.f2904b;
        requestStatistic.reqStart = System.currentTimeMillis();
        this.f2932f = session.request(requestM2640a, new C5131i(this, requestM2640a, requestStatistic));
    }
}

package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0889a;
import anet.channel.entity.C0891c;
import anet.channel.entity.ENV;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C0921d;
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
import anetwork.channel.entity.C0998g;
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
import org.android.agoo.common.AgooConstants;

/* renamed from: anetwork.channel.unified.e */
/* loaded from: classes.dex */
class C1004e implements IUnifiedTask {
    public static final int MAX_RSP_BUFFER_LENGTH = 131072;
    public static final String TAG = "anet.NetworkTask";

    /* renamed from: a */
    C1009j f5649a;

    /* renamed from: b */
    Cache f5650b;

    /* renamed from: c */
    Cache.Entry f5651c;

    /* renamed from: e */
    String f5653e;

    /* renamed from: h */
    volatile AtomicBoolean f5656h;

    /* renamed from: d */
    ByteArrayOutputStream f5652d = null;

    /* renamed from: f */
    volatile Cancelable f5654f = null;

    /* renamed from: g */
    volatile boolean f5655g = false;

    /* renamed from: i */
    int f5657i = 0;

    /* renamed from: j */
    int f5658j = 0;

    /* renamed from: k */
    boolean f5659k = false;

    /* renamed from: l */
    boolean f5660l = false;

    /* renamed from: m */
    a f5661m = null;

    C1004e(C1009j c1009j, Cache cache, Cache.Entry entry) {
        this.f5650b = null;
        this.f5651c = null;
        this.f5653e = DispatchConstants.OTHER;
        this.f5656h = null;
        this.f5649a = c1009j;
        this.f5656h = c1009j.f5685d;
        this.f5650b = cache;
        this.f5651c = entry;
        this.f5653e = c1009j.f5682a.m4734h().get(HttpConstant.F_REFER);
    }

    /* renamed from: b */
    private Session m4753b() {
        Session throwsException;
        SessionCenter sessionCenterM4748a = m4748a();
        HttpUrl httpUrlM4732f = this.f5649a.f5682a.m4732f();
        boolean zContainsNonDefaultPort = httpUrlM4732f.containsNonDefaultPort();
        C0998g c0998g = this.f5649a.f5682a;
        RequestStatistic requestStatistic = c0998g.f5626b;
        if (c0998g.f5630f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f5649a.f5682a.f5625a != 0 || zContainsNonDefaultPort) {
            return m4746a(null, sessionCenterM4748a, httpUrlM4732f, zContainsNonDefaultPort);
        }
        HttpUrl httpUrlM4750a = m4750a(httpUrlM4732f);
        try {
            throwsException = sessionCenterM4748a.getThrowsException(httpUrlM4750a, C0891c.f5150a, 0L);
        } catch (NoAvailStrategyException unused) {
            return m4746a(null, sessionCenterM4748a, httpUrlM4732f, zContainsNonDefaultPort);
        } catch (Exception unused2) {
            throwsException = null;
        }
        if (throwsException == null) {
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC1006g(this, sessionCenterM4748a, httpUrlM4750a, requestStatistic, httpUrlM4732f, zContainsNonDefaultPort), ThreadPoolExecutorFactory.Priority.NORMAL);
            return null;
        }
        ALog.m4639i(TAG, "tryGetSession", this.f5649a.f5684c, "Session", throwsException);
        requestStatistic.spdyRequestSend = true;
        return throwsException;
    }

    /* renamed from: c */
    private void m4754c() {
        SessionCenter sessionCenterM4748a = m4748a();
        HttpUrl httpUrlM4732f = this.f5649a.f5682a.m4732f();
        boolean zContainsNonDefaultPort = httpUrlM4732f.containsNonDefaultPort();
        C0998g c0998g = this.f5649a.f5682a;
        RequestStatistic requestStatistic = c0998g.f5626b;
        Request requestM4724a = c0998g.m4724a();
        if (this.f5649a.f5682a.f5630f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f5649a.f5682a.f5625a != 0 || zContainsNonDefaultPort) {
            m4751a(m4746a(null, sessionCenterM4748a, httpUrlM4732f, zContainsNonDefaultPort), requestM4724a);
            return;
        }
        sessionCenterM4748a.asyncGet(m4750a(httpUrlM4732f), C0891c.f5150a, 3000L, new C1007h(this, requestStatistic, System.currentTimeMillis(), requestM4724a, sessionCenterM4748a, httpUrlM4732f, zContainsNonDefaultPort));
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f5655g = true;
        if (this.f5654f != null) {
            this.f5654f.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5655g) {
            return;
        }
        RequestStatistic requestStatistic = this.f5649a.f5682a.f5626b;
        requestStatistic.f_refer = this.f5653e;
        if (!NetworkStatusHelper.isConnected()) {
            if (NetworkConfigCenter.isRequestDelayRetryForNoNetwork() && requestStatistic.statusCode != -200) {
                requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
                ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC1005f(this), 1000L, TimeUnit.MILLISECONDS);
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.m4639i(TAG, "network unavailable", this.f5649a.f5684c, "NetworkStatus", NetworkStatusHelper.getStatus());
            }
            this.f5656h.set(true);
            this.f5649a.m4757a();
            requestStatistic.isDone.set(true);
            requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
            requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_NO_NETWORK);
            requestStatistic.rspEnd = System.currentTimeMillis();
            this.f5649a.f5683b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_NO_NETWORK, (String) null, this.f5649a.f5682a.m4724a()));
            return;
        }
        if (!NetworkConfigCenter.isBgRequestForbidden() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || AppLifecycle.isGoingForeground || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= NetworkConfigCenter.getBgForbidRequestThreshold() || NetworkConfigCenter.isUrlInWhiteList(this.f5649a.f5682a.m4732f()) || NetworkConfigCenter.isBizInWhiteList(this.f5649a.f5682a.m4724a().getBizId()) || this.f5649a.f5682a.m4724a().isAllowRequestInBg()) {
            if (ALog.isPrintLog(2)) {
                C1009j c1009j = this.f5649a;
                ALog.m4639i(TAG, "exec request", c1009j.f5684c, "retryTimes", Integer.valueOf(c1009j.f5682a.f5625a));
            }
            if (NetworkConfigCenter.isGetSessionAsyncEnable()) {
                m4754c();
                return;
            }
            try {
                Session sessionM4753b = m4753b();
                if (sessionM4753b == null) {
                    return;
                }
                m4751a(sessionM4753b, this.f5649a.f5682a.m4724a());
                return;
            } catch (Exception e4) {
                ALog.m4637e(TAG, "send request failed.", this.f5649a.f5684c, e4, new Object[0]);
                return;
            }
        }
        this.f5656h.set(true);
        this.f5649a.m4757a();
        if (ALog.isPrintLog(2)) {
            C1009j c1009j2 = this.f5649a;
            ALog.m4639i(TAG, "request forbidden in background", c1009j2.f5684c, AgooConstants.OPEN_URL, c1009j2.f5682a.m4732f());
        }
        requestStatistic.isDone.set(true);
        requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG;
        requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG);
        requestStatistic.rspEnd = System.currentTimeMillis();
        this.f5649a.f5683b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, (String) null, this.f5649a.f5682a.m4724a()));
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, null, "rt");
        exceptionStatistic.host = this.f5649a.f5682a.m4732f().host();
        exceptionStatistic.url = this.f5649a.f5682a.m4733g();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anetwork.channel.unified.e$a */
    static class a {

        /* renamed from: a */
        int f5662a;

        /* renamed from: b */
        Map<String, List<String>> f5663b;

        /* renamed from: c */
        List<ByteArray> f5664c = new ArrayList();

        a(int i4, Map<String, List<String>> map) {
            this.f5662a = i4;
            this.f5663b = map;
        }

        /* renamed from: a */
        void m4756a() {
            Iterator<ByteArray> it = this.f5664c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
        }

        /* renamed from: a */
        int m4755a(Callback callback, int i4) {
            callback.onResponseCode(this.f5662a, this.f5663b);
            Iterator<ByteArray> it = this.f5664c.iterator();
            int i5 = 1;
            while (it.hasNext()) {
                callback.onDataReceiveSize(i5, i4, it.next());
                i5++;
            }
            return i5;
        }
    }

    /* renamed from: a */
    private HttpUrl m4750a(HttpUrl httpUrl) {
        HttpUrl httpUrl2;
        String str = this.f5649a.f5682a.m4734h().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (httpUrl2 = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : httpUrl2;
    }

    /* renamed from: a */
    private SessionCenter m4748a() {
        String strM4725a = this.f5649a.f5682a.m4725a(RequestConstant.APPKEY);
        if (TextUtils.isEmpty(strM4725a)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String strM4725a2 = this.f5649a.f5682a.m4725a(RequestConstant.ENVIRONMENT);
        if (RequestConstant.ENV_PRE.equalsIgnoreCase(strM4725a2)) {
            env = ENV.PREPARE;
        } else if (RequestConstant.ENV_TEST.equalsIgnoreCase(strM4725a2)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.CURRENT_ENV) {
            NetworkSdkSetting.CURRENT_ENV = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(strM4725a, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(strM4725a).setEnv(env).setAuthCode(this.f5649a.f5682a.m4725a(RequestConstant.AUTH_CODE)).build();
        }
        return SessionCenter.getInstance(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Session m4746a(Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z3) {
        C0998g c0998g = this.f5649a.f5682a;
        RequestStatistic requestStatistic = c0998g.f5626b;
        if (session == null && c0998g.m4731e() && !z3 && !NetworkStatusHelper.isProxy()) {
            session = sessionCenter.get(httpUrl, C0891c.f5151b, 0L);
        }
        if (session == null) {
            ALog.m4639i(TAG, "create HttpSession with local DNS", this.f5649a.f5684c, new Object[0]);
            session = new C0921d(GlobalAppRuntimeInfo.getContext(), new C0889a(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.f5649a.f5684c, null));
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.m4639i(TAG, "tryGetHttpSession", this.f5649a.f5684c, "Session", session);
        return session;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private anet.channel.request.Request m4749a(anet.channel.request.Request r7) {
        /*
            r6 = this;
            anetwork.channel.unified.j r0 = r6.f5649a
            anetwork.channel.entity.g r0 = r0.f5682a
            boolean r0 = r0.m4735i()
            if (r0 == 0) goto L3c
            anetwork.channel.unified.j r0 = r6.f5649a
            anetwork.channel.entity.g r0 = r0.f5682a
            java.lang.String r0 = r0.m4733g()
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
            anetwork.channel.cache.Cache$Entry r0 = r6.f5651c
            if (r0 == 0) goto L66
            if (r1 != 0) goto L48
            anet.channel.request.Request$Builder r0 = r7.newBuilder()
            r1 = r0
        L48:
            anetwork.channel.cache.Cache$Entry r0 = r6.f5651c
            java.lang.String r0 = r0.etag
            if (r0 == 0) goto L53
            java.lang.String r2 = "If-None-Match"
            r1.addHeader(r2, r0)
        L53:
            anetwork.channel.cache.Cache$Entry r0 = r6.f5651c
            long r2 = r0.lastModified
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L66
            java.lang.String r0 = anetwork.channel.cache.C0983a.m4686a(r2)
            java.lang.String r2 = "If-Modified-Since"
            r1.addHeader(r2, r0)
        L66:
            anetwork.channel.unified.j r0 = r6.f5649a
            anetwork.channel.entity.g r0 = r0.f5682a
            int r0 = r0.f5625a
            if (r0 != 0) goto L84
            java.lang.String r0 = r6.f5653e
            java.lang.String r2 = "weex"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L84
            if (r1 != 0) goto L7f
            anet.channel.request.Request$Builder r0 = r7.newBuilder()
            r1 = r0
        L7f:
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setReadTimeout(r0)
        L84:
            if (r1 != 0) goto L87
            goto L8b
        L87:
            anet.channel.request.Request r7 = r1.build()
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.C1004e.m4749a(anet.channel.request.Request):anet.channel.request.Request");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4751a(Session session, Request request) {
        if (session == null || this.f5655g) {
            return;
        }
        Request requestM4749a = m4749a(request);
        RequestStatistic requestStatistic = this.f5649a.f5682a.f5626b;
        requestStatistic.reqStart = System.currentTimeMillis();
        this.f5654f = session.request(requestM4749a, new C1008i(this, requestM4749a, requestStatistic));
    }
}

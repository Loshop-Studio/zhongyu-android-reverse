package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.detect.C0880n;
import anet.channel.entity.C0891c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.p009e.C0882a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0968i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1896c;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.android.agoo.common.AgooConstants;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* loaded from: classes.dex */
public class SessionCenter {
    public static final String TAG = "awcn.SessionCenter";

    /* renamed from: a */
    static Map<Config, SessionCenter> f5016a = new HashMap();

    /* renamed from: j */
    private static boolean f5017j = false;

    /* renamed from: b */
    Context f5018b;

    /* renamed from: c */
    String f5019c;

    /* renamed from: d */
    Config f5020d;

    /* renamed from: e */
    final C0881e f5021e = new C0881e();

    /* renamed from: f */
    final LruCache<String, SessionRequest> f5022f = new LruCache<>(32);

    /* renamed from: g */
    final C0861c f5023g = new C0861c();

    /* renamed from: h */
    final AccsSessionManager f5024h;

    /* renamed from: i */
    final C0846a f5025i;

    private SessionCenter(Config config) {
        C0846a c0846a = new C0846a(this, null);
        this.f5025i = c0846a;
        this.f5018b = GlobalAppRuntimeInfo.getContext();
        this.f5020d = config;
        this.f5019c = config.getAppkey();
        c0846a.m4358a();
        this.f5024h = new AccsSessionManager(this);
        if (config.getAppkey().equals("[default]")) {
            return;
        }
        AmdcRuntimeInfo.setSign(new C0864d(this, config.getAppkey(), config.getSecurity()));
    }

    public static void checkAndStartAccsSession() {
        Iterator<SessionCenter> it = f5016a.values().iterator();
        while (it.hasNext()) {
            it.next().f5024h.checkAndStartSession();
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        Config configByTag;
        configByTag = Config.getConfigByTag(str);
        if (configByTag == null) {
            throw new RuntimeException("tag not exist!");
        }
        return getInstance(configByTag);
    }

    public static synchronized void init(Context context) {
        if (context == null) {
            ALog.m4638e(TAG, "context is null!", null, new Object[0]);
            throw new NullPointerException("init failed. context is null");
        }
        GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
        if (!f5017j) {
            Map<Config, SessionCenter> map = f5016a;
            Config config = Config.DEFAULT_CONFIG;
            map.put(config, new SessionCenter(config));
            AppLifecycle.initialize();
            NetworkStatusHelper.startListener(context);
            if (!AwcnConfig.isTbNextLaunch()) {
                StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
            }
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                C0880n.m4420a();
                C0882a.m4430a();
            }
            f5017j = true;
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        try {
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.m4639i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = f5016a.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.f5020d.getEnv() != env) {
                    ALog.m4639i(TAG, "remove instance", value.f5019c, RequestConstant.ENVIRONMENT, value.f5020d.getEnv());
                    value.f5024h.forceCloseSession(false);
                    value.f5025i.m4359b();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            ALog.m4637e(TAG, "switch env error.", null, th, new Object[0]);
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i4, long j4, SessionGetCallback sessionGetCallback) {
        Objects.requireNonNull(sessionGetCallback, "cb is null");
        if (j4 <= 0) {
            throw new InvalidParameterException("timeout must > 0");
        }
        try {
            m4357b(httpUrl, i4, j4, sessionGetCallback);
        } catch (Exception unused) {
            sessionGetCallback.onSessionGetFail();
        }
    }

    /* renamed from: b */
    protected void m4357b(HttpUrl httpUrl, int i4, long j4, SessionGetCallback sessionGetCallback) throws Exception {
        SessionInfo sessionInfoM4391b;
        if (!f5017j) {
            ALog.m4638e(TAG, "getInternal not inited!", this.f5019c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        }
        if (sessionGetCallback == null) {
            throw new InvalidParameterException("sessionGetCallback is null");
        }
        String str = this.f5019c;
        Object[] objArr = new Object[6];
        objArr[0] = C1851ai.f8256aE;
        objArr[1] = httpUrl.urlString();
        objArr[2] = "sessionType";
        objArr[3] = i4 == C0891c.f5150a ? "LongLink" : "ShortLink";
        objArr[4] = "timeout";
        objArr[5] = Long.valueOf(j4);
        ALog.m4636d(TAG, "getInternal", str, objArr);
        SessionRequest sessionRequestM4349a = m4349a(httpUrl);
        Session sessionM4422a = this.f5021e.m4422a(sessionRequestM4349a, i4);
        if (sessionM4422a != null) {
            ALog.m4636d(TAG, "get internal hit cache session", this.f5019c, C1896c.f8597aw, sessionM4422a);
            sessionGetCallback.onSessionGetSuccess(sessionM4422a);
            return;
        }
        if (this.f5020d == Config.DEFAULT_CONFIG && i4 != C0891c.f5151b) {
            sessionGetCallback.onSessionGetFail();
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground() && i4 == C0891c.f5150a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoM4391b = this.f5023g.m4391b(httpUrl.host())) != null && sessionInfoM4391b.isAccs) {
            ALog.m4641w(TAG, "app background, forbid to create accs session", this.f5019c, new Object[0]);
            throw new ConnectException("accs session connecting forbidden in background");
        }
        sessionRequestM4349a.m4376b(this.f5018b, i4, C0968i.m4663a(this.f5019c), sessionGetCallback, j4);
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f5024h.forceCloseSession(true);
    }

    public Session get(String str, long j4) {
        return get(HttpUrl.parse(str), C0891c.f5152c, j4);
    }

    public Session getThrowsException(String str, long j4) throws Exception {
        return m4355a(HttpUrl.parse(str), C0891c.f5152c, j4, null);
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        this.f5024h.registerListener(iSessionListener);
    }

    public void registerPublicKey(String str, int i4) {
        this.f5023g.m4390a(str, i4);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f5023g.m4389a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f5024h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        this.f5024h.unregisterListener(iSessionListener);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo sessionInfoM4387a = this.f5023g.m4387a(str);
        if (sessionInfoM4387a == null || !sessionInfoM4387a.isKeepAlive) {
            return;
        }
        this.f5024h.checkAndStartSession();
    }

    /* renamed from: anet.channel.SessionCenter$a */
    private class C0846a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a */
        boolean f5026a;

        private C0846a() {
            this.f5026a = false;
        }

        /* renamed from: a */
        void m4358a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* renamed from: b */
        void m4359b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.m4639i(SessionCenter.TAG, "[background]", SessionCenter.this.f5019c, new Object[0]);
            if (!SessionCenter.f5017j) {
                ALog.m4638e(SessionCenter.TAG, "background not inited!", SessionCenter.this.f5019c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg() && "OPPO".equalsIgnoreCase(Build.BRAND)) {
                    ALog.m4639i(SessionCenter.TAG, "close session for OPPO", SessionCenter.this.f5019c, new Object[0]);
                    SessionCenter.this.f5024h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            ALog.m4639i(SessionCenter.TAG, "[forground]", SessionCenter.this.f5019c, new Object[0]);
            if (SessionCenter.this.f5018b == null || this.f5026a) {
                return;
            }
            this.f5026a = true;
            try {
                if (!SessionCenter.f5017j) {
                    ALog.m4638e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.f5019c, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime == 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= 60000) {
                        SessionCenter.this.f5024h.checkAndStartSession();
                    } else {
                        SessionCenter.this.f5024h.forceCloseSession(true);
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f5026a = false;
                    throw th;
                }
                this.f5026a = false;
            } catch (Exception unused2) {
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.m4638e(SessionCenter.TAG, "onNetworkStatusChanged.", SessionCenter.this.f5019c, "networkStatus", networkStatus);
            List<SessionRequest> listM4423a = SessionCenter.this.f5021e.m4423a();
            if (!listM4423a.isEmpty()) {
                for (SessionRequest sessionRequest : listM4423a) {
                    ALog.m4636d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.f5019c, new Object[0]);
                    sessionRequest.m4373a((String) null);
                }
            }
            SessionCenter.this.f5024h.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(C0947l.d dVar) {
            SessionCenter.this.m4352a(dVar);
            SessionCenter.this.f5024h.checkAndStartSession();
        }

        /* synthetic */ C0846a(SessionCenter sessionCenter, C0864d c0864d) {
            this();
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j4) {
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0891c.f5150a : C0891c.f5151b, j4);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j4) throws Exception {
        return m4355a(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0891c.f5150a : C0891c.f5151b, j4, null);
    }

    /* renamed from: a */
    private SessionRequest m4349a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String strScheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            strScheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, strScheme);
        }
        return m4356a(StringUtils.concatString(strScheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j4) {
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0891c.f5150a : C0891c.f5151b, j4);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i4, long j4) throws Exception {
        return m4355a(httpUrl, i4, j4, null);
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        if (config != null) {
            if (!f5017j && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            sessionCenter = f5016a.get(config);
            if (sessionCenter == null) {
                sessionCenter = new SessionCenter(config);
                f5016a.put(config, sessionCenter);
            }
        } else {
            throw new NullPointerException("config is null!");
        }
        return sessionCenter;
    }

    public Session get(HttpUrl httpUrl, int i4, long j4) {
        try {
            return m4355a(httpUrl, i4, j4, null);
        } catch (NoAvailStrategyException e4) {
            ALog.m4639i(TAG, "[Get]" + e4.getMessage(), this.f5019c, null, AgooConstants.OPEN_URL, httpUrl.urlString());
            return null;
        } catch (ConnectException e5) {
            ALog.m4638e(TAG, "[Get]connect exception", this.f5019c, "errMsg", e5.getMessage(), AgooConstants.OPEN_URL, httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e6) {
            ALog.m4637e(TAG, "[Get]param url is invalid", this.f5019c, e6, AgooConstants.OPEN_URL, httpUrl);
            return null;
        } catch (TimeoutException e7) {
            ALog.m4637e(TAG, "[Get]timeout exception", this.f5019c, e7, AgooConstants.OPEN_URL, httpUrl.urlString());
            return null;
        } catch (Exception e8) {
            ALog.m4637e(TAG, "[Get]" + e8.getMessage(), this.f5019c, null, AgooConstants.OPEN_URL, httpUrl.urlString());
            return null;
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j4) throws Exception {
        return m4355a(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0891c.f5150a : C0891c.f5151b, j4, null);
    }

    /* renamed from: a */
    protected Session m4355a(HttpUrl httpUrl, int i4, long j4, SessionGetCallback sessionGetCallback) throws Exception {
        SessionInfo sessionInfoM4391b;
        if (!f5017j) {
            ALog.m4638e(TAG, "getInternal not inited!", this.f5019c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl != null) {
            String str = this.f5019c;
            Object[] objArr = new Object[6];
            objArr[0] = C1851ai.f8256aE;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i4 == C0891c.f5150a ? "LongLink" : "ShortLink";
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j4);
            ALog.m4636d(TAG, "getInternal", str, objArr);
            SessionRequest sessionRequestM4349a = m4349a(httpUrl);
            Session sessionM4422a = this.f5021e.m4422a(sessionRequestM4349a, i4);
            if (sessionM4422a != null) {
                ALog.m4636d(TAG, "get internal hit cache session", this.f5019c, C1896c.f8597aw, sessionM4422a);
            } else {
                if (this.f5020d == Config.DEFAULT_CONFIG && i4 != C0891c.f5151b) {
                    if (sessionGetCallback == null) {
                        return null;
                    }
                    sessionGetCallback.onSessionGetFail();
                    return null;
                }
                if (GlobalAppRuntimeInfo.isAppBackground() && i4 == C0891c.f5150a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoM4391b = this.f5023g.m4391b(httpUrl.host())) != null && sessionInfoM4391b.isAccs) {
                    ALog.m4641w(TAG, "app background, forbid to create accs session", this.f5019c, new Object[0]);
                    throw new ConnectException("accs session connecting forbidden in background");
                }
                sessionRequestM4349a.m4369a(this.f5018b, i4, C0968i.m4663a(this.f5019c), sessionGetCallback, j4);
                if (sessionGetCallback == null && j4 > 0 && (i4 == C0891c.f5152c || sessionRequestM4349a.m4375b() == i4)) {
                    sessionRequestM4349a.m4368a(j4);
                    sessionM4422a = this.f5021e.m4422a(sessionRequestM4349a, i4);
                    if (sessionM4422a == null) {
                        throw new ConnectException("session connecting failed or timeout");
                    }
                }
            }
            return sessionM4422a;
        }
        throw new InvalidParameterException("httpUrl is null");
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        if (!f5017j && (appContext = Utils.getAppContext()) != null) {
            init(appContext);
        }
        SessionCenter sessionCenter = null;
        for (Map.Entry<Config, SessionCenter> entry : f5016a.entrySet()) {
            SessionCenter value = entry.getValue();
            if (entry.getKey() != Config.DEFAULT_CONFIG) {
                return value;
            }
            sessionCenter = value;
        }
        return sessionCenter;
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        init(context, str, GlobalAppRuntimeInfo.getEnv());
    }

    public static synchronized void init(Context context, String str, ENV env) {
        if (context != null) {
            Config config = Config.getConfig(str, env);
            if (config == null) {
                config = new Config.Builder().setAppkey(str).setEnv(env).build();
            }
            init(context, config);
        } else {
            ALog.m4638e(TAG, "context is null!", null, new Object[0]);
            throw new NullPointerException("init failed. context is null");
        }
    }

    /* renamed from: b */
    private void m4354b(C0947l.b bVar) {
        boolean z3;
        boolean z4;
        ALog.m4639i(TAG, "find effectNow", this.f5019c, Constants.KEY_HOST, bVar.f5418a);
        C0947l.a[] aVarArr = bVar.f5425h;
        String[] strArr = bVar.f5423f;
        for (Session session : this.f5021e.m4424a(m4356a(StringUtils.buildKey(bVar.f5420c, bVar.f5418a)))) {
            if (!session.getConnType().isHttpType()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= strArr.length) {
                        z3 = false;
                        break;
                    } else {
                        if (session.getIp().equals(strArr[i4])) {
                            z3 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (z3) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= aVarArr.length) {
                            z4 = false;
                            break;
                        } else {
                            if (session.getPort() == aVarArr[i5].f5410a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i5])))) {
                                z4 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (!z4) {
                        if (ALog.isPrintLog(2)) {
                            ALog.m4639i(TAG, "aisle not match", session.f5005p, "port", Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                        }
                        session.close(true);
                    }
                } else {
                    if (ALog.isPrintLog(2)) {
                        ALog.m4639i(TAG, "ip not match", session.f5005p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                }
            }
        }
    }

    public static synchronized void init(Context context, Config config) {
        if (context == null) {
            ALog.m4638e(TAG, "context is null!", null, new Object[0]);
            throw new NullPointerException("init failed. context is null");
        }
        if (config != null) {
            init(context);
            if (!f5016a.containsKey(config)) {
                f5016a.put(config, new SessionCenter(config));
            }
        } else {
            ALog.m4638e(TAG, "paramter config is null!", null, new Object[0]);
            throw new NullPointerException("init failed. config is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4352a(C0947l.d dVar) {
        try {
            for (C0947l.b bVar : dVar.f5433b) {
                if (bVar.f5428k) {
                    m4354b(bVar);
                }
                if (bVar.f5422e != null) {
                    m4351a(bVar);
                }
            }
        } catch (Exception e4) {
            ALog.m4637e(TAG, "checkStrategy failed", this.f5019c, e4, new Object[0]);
        }
    }

    /* renamed from: a */
    private void m4351a(C0947l.b bVar) {
        for (Session session : this.f5021e.m4424a(m4356a(StringUtils.buildKey(bVar.f5420c, bVar.f5418a)))) {
            if (!StringUtils.isStringEqual(session.f5001l, bVar.f5422e)) {
                ALog.m4639i(TAG, "unit change", session.f5005p, "session unit", session.f5001l, "unit", bVar.f5422e);
                session.close(true);
            }
        }
    }

    /* renamed from: a */
    protected SessionRequest m4356a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f5022f) {
            sessionRequest = this.f5022f.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.f5022f.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }
}

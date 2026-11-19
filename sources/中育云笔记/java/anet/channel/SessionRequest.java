package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C5012a;
import anet.channel.entity.C5014c;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventType;
import anet.channel.session.C5044d;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C5076c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C5085c;
import anet.channel.util.C5091i;
import anet.channel.util.HttpUrl;
import com.huawei.hms.framework.common.BundleUtil;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class SessionRequest {

    /* renamed from: a */
    SessionCenter f2306a;

    /* renamed from: b */
    C5004e f2307b;

    /* renamed from: c */
    SessionInfo f2308c;

    /* renamed from: e */
    volatile Session f2310e;

    /* renamed from: i */
    private String f2314i;

    /* renamed from: j */
    private String f2315j;

    /* renamed from: k */
    private volatile Future f2316k;

    /* renamed from: d */
    volatile boolean f2309d = false;

    /* renamed from: f */
    volatile boolean f2311f = false;

    /* renamed from: g */
    HashMap<SessionGetCallback, RunnableC4972c> f2312g = new HashMap<>();

    /* renamed from: h */
    SessionConnStat f2313h = null;

    /* renamed from: l */
    private Object f2317l = new Object();

    public interface IConnCb {
        void onDisConnect(Session session, long j10, int i10);

        void onFailed(Session session, long j10, int i10, int i11);

        void onSuccess(Session session, long j10);
    }

    /* renamed from: anet.channel.SessionRequest$a */
    public class C4970a implements IConnCb {

        /* renamed from: a */
        boolean f2318a = false;

        /* renamed from: c */
        private Context f2320c;

        /* renamed from: d */
        private List<C5012a> f2321d;

        /* renamed from: e */
        private C5012a f2322e;

        public C4970a(Context context, List<C5012a> list, C5012a c5012a) {
            this.f2320c = context;
            this.f2321d = list;
            this.f2322e = c5012a;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j10, int i10) {
            SessionInfo sessionInfo;
            boolean zIsAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.m2527d("awcn.SessionRequest", "Connect Disconnect", this.f2322e.m2344h(), "session", session, Constants.KEY_HOST, SessionRequest.this.m2258a(), "appIsBg", Boolean.valueOf(zIsAppBackground), "isHandleFinish", Boolean.valueOf(this.f2318a));
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f2307b.m2317b(sessionRequest, session);
            if (this.f2318a) {
                return;
            }
            this.f2318a = true;
            if (session.f2287t) {
                if (zIsAppBackground && ((sessionInfo = SessionRequest.this.f2308c) == null || !sessionInfo.isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                    ALog.m2529e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f2322e.m2344h(), "session", session);
                    return;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    ALog.m2529e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f2322e.m2344h(), "session", session);
                    return;
                }
                try {
                    ALog.m2527d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f2322e.m2344h(), new Object[0]);
                    SessionInfo sessionInfo2 = SessionRequest.this.f2308c;
                    ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5023i(this, session), (long) (Math.random() * ((sessionInfo2 == null || !sessionInfo2.isAccs) ? 10000 : AwcnConfig.getAccsReconnectionDelayPeriod())), TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j10, int i10, int i11) {
            Session session2;
            if (ALog.isPrintLog(1)) {
                session2 = session;
                ALog.m2527d("awcn.SessionRequest", "Connect failed", this.f2322e.m2344h(), "session", session2, Constants.KEY_HOST, SessionRequest.this.m2258a(), "isHandleFinish", Boolean.valueOf(this.f2318a));
            } else {
                session2 = session;
            }
            if (SessionRequest.this.f2311f) {
                SessionRequest.this.f2311f = false;
                return;
            }
            if (this.f2318a) {
                return;
            }
            this.f2318a = true;
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f2307b.m2317b(sessionRequest, session2);
            if (!session2.f2288u || !NetworkStatusHelper.isConnected() || this.f2321d.isEmpty()) {
                SessionRequest.this.m2269c();
                SessionRequest.this.m2262a(session2, i10, i11);
                synchronized (SessionRequest.this.f2312g) {
                    try {
                        for (Map.Entry<SessionGetCallback, RunnableC4972c> entry : SessionRequest.this.f2312g.entrySet()) {
                            RunnableC4972c value = entry.getValue();
                            if (value.f2326b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetFail();
                            }
                        }
                        SessionRequest.this.f2312g.clear();
                    } finally {
                    }
                }
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.SessionRequest", "use next connInfo to create session", this.f2322e.m2344h(), Constants.KEY_HOST, SessionRequest.this.m2258a());
            }
            C5012a c5012a = this.f2322e;
            if (c5012a.f2421b == c5012a.f2422c && (i11 == -2003 || i11 == -2410)) {
                ListIterator<C5012a> listIterator = this.f2321d.listIterator();
                while (listIterator.hasNext()) {
                    if (session2.getIp().equals(listIterator.next().f2420a.getIp())) {
                        listIterator.remove();
                    }
                }
            }
            if (C5076c.m2522b(session2.getIp())) {
                ListIterator<C5012a> listIterator2 = this.f2321d.listIterator();
                while (listIterator2.hasNext()) {
                    if (C5076c.m2522b(listIterator2.next().f2420a.getIp())) {
                        listIterator2.remove();
                    }
                }
            }
            if (!this.f2321d.isEmpty()) {
                C5012a c5012aRemove = this.f2321d.remove(0);
                SessionRequest sessionRequest2 = SessionRequest.this;
                Context context = this.f2320c;
                sessionRequest2.m2253a(context, c5012aRemove, sessionRequest2.new C4970a(context, this.f2321d, c5012aRemove), c5012aRemove.m2344h());
                return;
            }
            SessionRequest.this.m2269c();
            SessionRequest.this.m2262a(session2, i10, i11);
            synchronized (SessionRequest.this.f2312g) {
                try {
                    for (Map.Entry<SessionGetCallback, RunnableC4972c> entry2 : SessionRequest.this.f2312g.entrySet()) {
                        RunnableC4972c value2 = entry2.getValue();
                        if (value2.f2326b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value2);
                            entry2.getKey().onSessionGetFail();
                        }
                    }
                    SessionRequest.this.f2312g.clear();
                } finally {
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j10) {
            ALog.m2527d("awcn.SessionRequest", "Connect Success", this.f2322e.m2344h(), "session", session, Constants.KEY_HOST, SessionRequest.this.m2258a());
            try {
                if (SessionRequest.this.f2311f) {
                    SessionRequest.this.f2311f = false;
                    session.close(false);
                    return;
                }
                SessionRequest sessionRequest = SessionRequest.this;
                sessionRequest.f2307b.m2316a(sessionRequest, session);
                SessionRequest.this.m2261a(session);
                synchronized (SessionRequest.this.f2312g) {
                    try {
                        for (Map.Entry<SessionGetCallback, RunnableC4972c> entry : SessionRequest.this.f2312g.entrySet()) {
                            RunnableC4972c value = entry.getValue();
                            if (value.f2326b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetSuccess(session);
                            }
                        }
                        SessionRequest.this.f2312g.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e10) {
                ALog.m2528e("awcn.SessionRequest", "[onSuccess]:", this.f2322e.m2344h(), e10, new Object[0]);
            } finally {
                SessionRequest.this.m2269c();
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$b */
    public class RunnableC4971b implements Runnable {

        /* renamed from: a */
        String f2323a;

        public RunnableC4971b(String str) {
            this.f2323a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SessionRequest.this.f2309d) {
                ALog.m2529e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f2323a, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.f2313h;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.f2313h.start;
                if (SessionRequest.this.f2310e != null) {
                    SessionRequest.this.f2310e.f2288u = false;
                    SessionRequest.this.f2310e.close();
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f2313h.syncValueFromSession(sessionRequest.f2310e);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f2313h);
                SessionRequest.this.m2265a(false);
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$c */
    public class RunnableC4972c implements Runnable {

        /* renamed from: a */
        SessionGetCallback f2325a;

        /* renamed from: b */
        AtomicBoolean f2326b = new AtomicBoolean(false);

        public RunnableC4972c(SessionGetCallback sessionGetCallback) {
            this.f2325a = null;
            this.f2325a = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2326b.compareAndSet(false, true)) {
                ALog.m2529e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f2312g) {
                    SessionRequest.this.f2312g.remove(this.f2325a);
                }
                this.f2325a.onSessionGetFail();
            }
        }
    }

    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.f2314i = str;
        String strSubstring = str.substring(str.indexOf("://") + 3);
        this.f2315j = strSubstring;
        this.f2306a = sessionCenter;
        this.f2308c = sessionCenter.f2301g.m2282b(strSubstring);
        this.f2307b = sessionCenter.f2299e;
    }

    /* renamed from: b */
    public synchronized void m2267b(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session sessionM2313a = this.f2307b.m2313a(this, i10);
        if (sessionM2313a != null) {
            ALog.m2527d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            sessionGetCallback.onSessionGetSuccess(sessionM2313a);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C5091i.m2554a(null);
        }
        ALog.m2527d("awcn.SessionRequest", "SessionRequest start", str, Constants.KEY_HOST, this.f2314i, "type", Integer.valueOf(i10));
        if (this.f2309d) {
            ALog.m2527d("awcn.SessionRequest", "session connecting", str, Constants.KEY_HOST, m2258a());
            if (m2266b() == i10) {
                RunnableC4972c runnableC4972c = new RunnableC4972c(sessionGetCallback);
                synchronized (this.f2312g) {
                    this.f2312g.put(sessionGetCallback, runnableC4972c);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC4972c, j10, TimeUnit.MILLISECONDS);
            } else {
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        m2265a(true);
        this.f2316k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC4971b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f2313h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m2269c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listM2251a = m2251a(i10, str);
        if (listM2251a.isEmpty()) {
            ALog.m2530i("awcn.SessionRequest", "no avalible strategy, can't create session", str, Constants.KEY_HOST, this.f2314i, "type", Integer.valueOf(i10));
            m2269c();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<C5012a> listM2252a = m2252a(listM2251a, str);
        try {
            C5012a c5012aRemove = listM2252a.remove(0);
            m2253a(context, c5012aRemove, new C4970a(context, listM2252a, c5012aRemove), c5012aRemove.m2344h());
            RunnableC4972c runnableC4972c2 = new RunnableC4972c(sessionGetCallback);
            synchronized (this.f2312g) {
                this.f2312g.put(sessionGetCallback, runnableC4972c2);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(runnableC4972c2, j10, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            m2269c();
        }
        return;
    }

    /* renamed from: c */
    public void m2269c() {
        m2265a(false);
        synchronized (this.f2317l) {
            this.f2317l.notifyAll();
        }
    }

    /* renamed from: a */
    public String m2258a() {
        return this.f2314i;
    }

    /* renamed from: a */
    public void m2265a(boolean z10) {
        this.f2309d = z10;
        if (z10) {
            return;
        }
        if (this.f2316k != null) {
            this.f2316k.cancel(true);
            this.f2316k = null;
        }
        this.f2310e = null;
    }

    /* renamed from: c */
    private void m2257c(Session session, int i10, String str) {
        SessionInfo sessionInfo = this.f2308c;
        if (sessionInfo == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m2529e("awcn.SessionRequest", "sendConnectInfoToAccsByCallBack", null, new Object[0]);
        Intent intent = new Intent("com.taobao.ACCS_CONNECT_INFO");
        intent.putExtra("command", 103);
        intent.putExtra(Constants.KEY_HOST, session.getHost());
        intent.putExtra(Constants.KEY_CENTER_HOST, true);
        boolean zIsAvailable = session.isAvailable();
        if (!zIsAvailable) {
            intent.putExtra(Constants.KEY_ERROR_CODE, i10);
            intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
        }
        intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
        intent.putExtra(Constants.KEY_TYPE_INAPP, true);
        this.f2306a.f2302h.notifyListener(intent);
    }

    /* renamed from: a */
    public synchronized void m2260a(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session sessionM2313a = this.f2307b.m2313a(this, i10);
        if (sessionM2313a != null) {
            ALog.m2527d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(sessionM2313a);
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C5091i.m2554a(null);
        }
        ALog.m2527d("awcn.SessionRequest", "SessionRequest start", str, Constants.KEY_HOST, this.f2314i, "type", Integer.valueOf(i10));
        if (this.f2309d) {
            ALog.m2527d("awcn.SessionRequest", "session connecting", str, Constants.KEY_HOST, m2258a());
            if (sessionGetCallback != null) {
                if (m2266b() == i10) {
                    RunnableC4972c runnableC4972c = new RunnableC4972c(sessionGetCallback);
                    synchronized (this.f2312g) {
                        this.f2312g.put(sessionGetCallback, runnableC4972c);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC4972c, j10, TimeUnit.MILLISECONDS);
                } else {
                    sessionGetCallback.onSessionGetFail();
                }
            }
            return;
        }
        m2265a(true);
        this.f2316k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC4971b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f2313h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m2269c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listM2251a = m2251a(i10, str);
        if (!listM2251a.isEmpty()) {
            List<C5012a> listM2252a = m2252a(listM2251a, str);
            try {
                C5012a c5012aRemove = listM2252a.remove(0);
                m2253a(context, c5012aRemove, new C4970a(context, listM2252a, c5012aRemove), c5012aRemove.m2344h());
                if (sessionGetCallback != null) {
                    RunnableC4972c runnableC4972c2 = new RunnableC4972c(sessionGetCallback);
                    synchronized (this.f2312g) {
                        this.f2312g.put(sessionGetCallback, runnableC4972c2);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC4972c2, j10, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable unused) {
                m2269c();
            }
            return;
        }
        ALog.m2530i("awcn.SessionRequest", "no avalible strategy, can't create session", str, Constants.KEY_HOST, this.f2314i, "type", Integer.valueOf(i10));
        m2269c();
        throw new NoAvailStrategyException("no avalible strategy");
    }

    /* renamed from: b */
    public void m2268b(boolean z10) {
        ALog.m2527d("awcn.SessionRequest", "closeSessions", this.f2306a.f2297c, Constants.KEY_HOST, this.f2314i, "autoCreate", Boolean.valueOf(z10));
        if (!z10 && this.f2310e != null) {
            this.f2310e.f2288u = false;
            this.f2310e.close(false);
        }
        List<Session> listM2315a = this.f2307b.m2315a(this);
        if (listM2315a != null) {
            for (Session session : listM2315a) {
                if (session != null) {
                    session.close(z10);
                }
            }
        }
    }

    /* renamed from: a */
    public void m2261a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f2314i;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f2313h.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f2313h;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f2313h.start;
        AppMonitor.getInstance().commitStat(this.f2313h);
    }

    /* renamed from: b */
    public int m2266b() {
        Session session = this.f2310e;
        if (session != null) {
            return session.f2277j.getType();
        }
        return -1;
    }

    /* renamed from: b */
    private void m2256b(Session session, int i10, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context == null || (sessionInfo = this.f2308c) == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m2529e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, new Object[0]);
        try {
            Intent intent = new Intent(Constants.ACTION_RECEIVE);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, "com.taobao.accs.data.MsgDistributeService");
            intent.putExtra("command", 103);
            intent.putExtra(Constants.KEY_HOST, session.getHost());
            intent.putExtra(Constants.KEY_CENTER_HOST, true);
            boolean zIsAvailable = session.isAvailable();
            if (!zIsAvailable) {
                intent.putExtra(Constants.KEY_ERROR_CODE, i10);
                intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
            }
            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
            if (Build.VERSION.SDK_INT >= 26) {
                context.bindService(intent, new ServiceConnectionC5019h(this, intent, context), 1);
            } else {
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m2528e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m2262a(Session session, int i10, int i11) {
        if (256 != i10 || i11 == -2613 || i11 == -2601) {
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f2314i;
        alarmObject.errorCode = String.valueOf(i11);
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        SessionConnStat sessionConnStat = this.f2313h;
        sessionConnStat.ret = 0;
        sessionConnStat.appendErrorTrace(i11);
        this.f2313h.errorCode = String.valueOf(i11);
        this.f2313h.totalTime = System.currentTimeMillis() - this.f2313h.start;
        this.f2313h.syncValueFromSession(session);
        AppMonitor.getInstance().commitStat(this.f2313h);
    }

    /* renamed from: a */
    private List<IConnStrategy> m2251a(int i10, String str) {
        List<IConnStrategy> connStrategyListByHost = Collections.EMPTY_LIST;
        try {
            HttpUrl httpUrl = HttpUrl.parse(m2258a());
            if (httpUrl == null) {
                return connStrategyListByHost;
            }
            connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(httpUrl.host());
            if (!connStrategyListByHost.isEmpty()) {
                boolean zEqualsIgnoreCase = "https".equalsIgnoreCase(httpUrl.scheme());
                boolean zM2540b = C5085c.m2540b();
                ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
                while (listIterator.hasNext()) {
                    IConnStrategy next = listIterator.next();
                    ConnType connTypeValueOf = ConnType.valueOf(next.getProtocol());
                    if (connTypeValueOf != null) {
                        if (connTypeValueOf.isSSL() == zEqualsIgnoreCase && (i10 == C5014c.f2430c || connTypeValueOf.getType() == i10)) {
                            if (zM2540b && C5076c.m2522b(next.getIp())) {
                                listIterator.remove();
                            }
                        }
                        listIterator.remove();
                    }
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", connStrategyListByHost);
            }
            return connStrategyListByHost;
        } catch (Throwable th) {
            ALog.m2528e("awcn.SessionRequest", "", str, th, new Object[0]);
            return connStrategyListByHost;
        }
    }

    /* renamed from: a */
    private List<C5012a> m2252a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            IConnStrategy iConnStrategy = list.get(i11);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i12 = 0; i12 <= retryTimes; i12++) {
                i10++;
                C5012a c5012a = new C5012a(m2258a(), str + BundleUtil.UNDERLINE_TAG + i10, iConnStrategy);
                c5012a.f2421b = i12;
                c5012a.f2422c = retryTimes;
                arrayList.add(c5012a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2253a(Context context, C5012a c5012a, IConnCb iConnCb, String str) {
        ConnType connTypeM2339c = c5012a.m2339c();
        if (context != null && !connTypeM2339c.isHttpType()) {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, c5012a);
            tnetSpdySession.initConfig(this.f2306a.f2298d);
            tnetSpdySession.initSessionInfo(this.f2308c);
            tnetSpdySession.setTnetPublicKey(this.f2306a.f2301g.m2283c(this.f2315j));
            this.f2310e = tnetSpdySession;
        } else {
            this.f2310e = new C5044d(context, c5012a);
        }
        ALog.m2530i("awcn.SessionRequest", "create connection...", str, "Host", m2258a(), "Type", c5012a.m2339c(), "IP", c5012a.m2337a(), "Port", Integer.valueOf(c5012a.m2338b()), "heartbeat", Integer.valueOf(c5012a.m2343g()), "session", this.f2310e);
        m2254a(this.f2310e, iConnCb, System.currentTimeMillis());
        this.f2310e.connect();
        SessionConnStat sessionConnStat = this.f2313h;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        SessionConnStat sessionConnStat2 = this.f2313h;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", c5012a.m2337a());
        }
    }

    /* renamed from: a */
    private void m2254a(Session session, IConnCb iConnCb, long j10) {
        if (iConnCb == null) {
            return;
        }
        session.registerEventcb(EventType.ALL, new C5015f(this, iConnCb, j10));
        session.registerEventcb(1792, new C5018g(this, session));
    }

    /* renamed from: a */
    public void m2264a(String str) {
        ALog.m2527d("awcn.SessionRequest", "reCreateSession", str, Constants.KEY_HOST, this.f2314i);
        m2268b(true);
    }

    /* renamed from: a */
    public void m2259a(long j10) {
        ALog.m2527d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j10));
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f2317l) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + j10;
                while (this.f2309d) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 >= jCurrentTimeMillis) {
                        break;
                    } else {
                        this.f2317l.wait(jCurrentTimeMillis - jCurrentTimeMillis2);
                    }
                }
                if (this.f2309d) {
                    throw new TimeoutException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2263a(Session session, int i10, String str) {
        if (AwcnConfig.isSendConnectInfoByService()) {
            m2256b(session, i10, str);
        }
        m2257c(session, i10, str);
    }
}

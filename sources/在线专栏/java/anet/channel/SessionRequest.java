package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0889a;
import anet.channel.entity.C0891c;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventType;
import anet.channel.session.C0921d;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0953c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0962c;
import anet.channel.util.C0968i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C1896c;
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

/* loaded from: classes.dex */
class SessionRequest {

    /* renamed from: a */
    SessionCenter f5028a;

    /* renamed from: b */
    C0881e f5029b;

    /* renamed from: c */
    SessionInfo f5030c;

    /* renamed from: e */
    volatile Session f5032e;

    /* renamed from: i */
    private String f5036i;

    /* renamed from: j */
    private String f5037j;

    /* renamed from: k */
    private volatile Future f5038k;

    /* renamed from: d */
    volatile boolean f5031d = false;

    /* renamed from: f */
    volatile boolean f5033f = false;

    /* renamed from: g */
    HashMap<SessionGetCallback, RunnableC0849c> f5034g = new HashMap<>();

    /* renamed from: h */
    SessionConnStat f5035h = null;

    /* renamed from: l */
    private Object f5039l = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    interface IConnCb {
        void onDisConnect(Session session, long j4, int i4);

        void onFailed(Session session, long j4, int i4, int i5);

        void onSuccess(Session session, long j4);
    }

    /* renamed from: anet.channel.SessionRequest$a */
    class C0847a implements IConnCb {

        /* renamed from: a */
        boolean f5040a = false;

        /* renamed from: c */
        private Context f5042c;

        /* renamed from: d */
        private List<C0889a> f5043d;

        /* renamed from: e */
        private C0889a f5044e;

        C0847a(Context context, List<C0889a> list, C0889a c0889a) {
            this.f5042c = context;
            this.f5043d = list;
            this.f5044e = c0889a;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j4, int i4) {
            SessionInfo sessionInfo;
            boolean zIsAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.m4636d("awcn.SessionRequest", "Connect Disconnect", this.f5044e.m4453h(), C1896c.f8597aw, session, Constants.KEY_HOST, SessionRequest.this.m4367a(), "appIsBg", Boolean.valueOf(zIsAppBackground), "isHandleFinish", Boolean.valueOf(this.f5040a));
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f5029b.m4426b(sessionRequest, session);
            if (this.f5040a) {
                return;
            }
            this.f5040a = true;
            if (session.f5009t) {
                if (zIsAppBackground && ((sessionInfo = SessionRequest.this.f5030c) == null || !sessionInfo.isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                    ALog.m4638e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f5044e.m4453h(), C1896c.f8597aw, session);
                    return;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    ALog.m4638e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f5044e.m4453h(), C1896c.f8597aw, session);
                    return;
                }
                try {
                    ALog.m4636d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f5044e.m4453h(), new Object[0]);
                    int accsReconnectionDelayPeriod = 10000;
                    SessionInfo sessionInfo2 = SessionRequest.this.f5030c;
                    if (sessionInfo2 != null && sessionInfo2.isAccs) {
                        accsReconnectionDelayPeriod = AwcnConfig.getAccsReconnectionDelayPeriod();
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0900i(this, session), (long) (Math.random() * accsReconnectionDelayPeriod), TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j4, int i4, int i5) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.SessionRequest", "Connect failed", this.f5044e.m4453h(), C1896c.f8597aw, session, Constants.KEY_HOST, SessionRequest.this.m4367a(), "isHandleFinish", Boolean.valueOf(this.f5040a));
            }
            if (SessionRequest.this.f5033f) {
                SessionRequest.this.f5033f = false;
                return;
            }
            if (this.f5040a) {
                return;
            }
            this.f5040a = true;
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f5029b.m4426b(sessionRequest, session);
            if (!session.f5010u || !NetworkStatusHelper.isConnected() || this.f5043d.isEmpty()) {
                SessionRequest.this.m4378c();
                SessionRequest.this.m4371a(session, i4, i5);
                synchronized (SessionRequest.this.f5034g) {
                    for (Map.Entry<SessionGetCallback, RunnableC0849c> entry : SessionRequest.this.f5034g.entrySet()) {
                        RunnableC0849c value = entry.getValue();
                        if (value.f5048b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value);
                            entry.getKey().onSessionGetFail();
                        }
                    }
                    SessionRequest.this.f5034g.clear();
                }
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.SessionRequest", "use next connInfo to create session", this.f5044e.m4453h(), Constants.KEY_HOST, SessionRequest.this.m4367a());
            }
            C0889a c0889a = this.f5044e;
            if (c0889a.f5143b == c0889a.f5144c && (i5 == -2003 || i5 == -2410)) {
                ListIterator<C0889a> listIterator = this.f5043d.listIterator();
                while (listIterator.hasNext()) {
                    if (session.getIp().equals(listIterator.next().f5142a.getIp())) {
                        listIterator.remove();
                    }
                }
            }
            if (C0953c.m4631b(session.getIp())) {
                ListIterator<C0889a> listIterator2 = this.f5043d.listIterator();
                while (listIterator2.hasNext()) {
                    if (C0953c.m4631b(listIterator2.next().f5142a.getIp())) {
                        listIterator2.remove();
                    }
                }
            }
            if (!this.f5043d.isEmpty()) {
                C0889a c0889aRemove = this.f5043d.remove(0);
                SessionRequest sessionRequest2 = SessionRequest.this;
                Context context = this.f5042c;
                sessionRequest2.m4362a(context, c0889aRemove, sessionRequest2.new C0847a(context, this.f5043d, c0889aRemove), c0889aRemove.m4453h());
                return;
            }
            SessionRequest.this.m4378c();
            SessionRequest.this.m4371a(session, i4, i5);
            synchronized (SessionRequest.this.f5034g) {
                for (Map.Entry<SessionGetCallback, RunnableC0849c> entry2 : SessionRequest.this.f5034g.entrySet()) {
                    RunnableC0849c value2 = entry2.getValue();
                    if (value2.f5048b.compareAndSet(false, true)) {
                        ThreadPoolExecutorFactory.removeScheduleTask(value2);
                        entry2.getKey().onSessionGetFail();
                    }
                }
                SessionRequest.this.f5034g.clear();
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j4) {
            ALog.m4636d("awcn.SessionRequest", "Connect Success", this.f5044e.m4453h(), C1896c.f8597aw, session, Constants.KEY_HOST, SessionRequest.this.m4367a());
            try {
                if (SessionRequest.this.f5033f) {
                    SessionRequest.this.f5033f = false;
                    session.close(false);
                    return;
                }
                SessionRequest sessionRequest = SessionRequest.this;
                sessionRequest.f5029b.m4425a(sessionRequest, session);
                SessionRequest.this.m4370a(session);
                synchronized (SessionRequest.this.f5034g) {
                    for (Map.Entry<SessionGetCallback, RunnableC0849c> entry : SessionRequest.this.f5034g.entrySet()) {
                        RunnableC0849c value = entry.getValue();
                        if (value.f5048b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value);
                            entry.getKey().onSessionGetSuccess(session);
                        }
                    }
                    SessionRequest.this.f5034g.clear();
                }
            } catch (Exception e4) {
                ALog.m4637e("awcn.SessionRequest", "[onSuccess]:", this.f5044e.m4453h(), e4, new Object[0]);
            } finally {
                SessionRequest.this.m4378c();
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$b */
    private class RunnableC0848b implements Runnable {

        /* renamed from: a */
        String f5045a;

        RunnableC0848b(String str) {
            this.f5045a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SessionRequest.this.f5031d) {
                ALog.m4638e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f5045a, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.f5035h;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.f5035h.start;
                if (SessionRequest.this.f5032e != null) {
                    SessionRequest.this.f5032e.f5010u = false;
                    SessionRequest.this.f5032e.close();
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f5035h.syncValueFromSession(sessionRequest.f5032e);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f5035h);
                SessionRequest.this.m4374a(false);
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$c */
    protected class RunnableC0849c implements Runnable {

        /* renamed from: a */
        SessionGetCallback f5047a;

        /* renamed from: b */
        AtomicBoolean f5048b = new AtomicBoolean(false);

        protected RunnableC0849c(SessionGetCallback sessionGetCallback) {
            this.f5047a = null;
            this.f5047a = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5048b.compareAndSet(false, true)) {
                ALog.m4638e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f5034g) {
                    SessionRequest.this.f5034g.remove(this.f5047a);
                }
                this.f5047a.onSessionGetFail();
            }
        }
    }

    SessionRequest(String str, SessionCenter sessionCenter) {
        this.f5036i = str;
        String strSubstring = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f5037j = strSubstring;
        this.f5028a = sessionCenter;
        this.f5030c = sessionCenter.f5023g.m4391b(strSubstring);
        this.f5029b = sessionCenter.f5021e;
    }

    /* renamed from: b */
    protected synchronized void m4376b(Context context, int i4, String str, SessionGetCallback sessionGetCallback, long j4) {
        Session sessionM4422a = this.f5029b.m4422a(this, i4);
        if (sessionM4422a != null) {
            ALog.m4636d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            sessionGetCallback.onSessionGetSuccess(sessionM4422a);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C0968i.m4663a(null);
        }
        ALog.m4636d("awcn.SessionRequest", "SessionRequest start", str, Constants.KEY_HOST, this.f5036i, "type", Integer.valueOf(i4));
        if (this.f5031d) {
            ALog.m4636d("awcn.SessionRequest", "session connecting", str, Constants.KEY_HOST, m4367a());
            if (m4375b() == i4) {
                RunnableC0849c runnableC0849c = new RunnableC0849c(sessionGetCallback);
                synchronized (this.f5034g) {
                    this.f5034g.put(sessionGetCallback, runnableC0849c);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC0849c, j4, TimeUnit.MILLISECONDS);
            } else {
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        m4374a(true);
        this.f5038k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0848b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f5035h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m4378c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listM4360a = m4360a(i4, str);
        if (listM4360a.isEmpty()) {
            ALog.m4639i("awcn.SessionRequest", "no avalible strategy, can't create session", str, Constants.KEY_HOST, this.f5036i, "type", Integer.valueOf(i4));
            m4378c();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<C0889a> listM4361a = m4361a(listM4360a, str);
        try {
            C0889a c0889aRemove = listM4361a.remove(0);
            m4362a(context, c0889aRemove, new C0847a(context, listM4361a, c0889aRemove), c0889aRemove.m4453h());
            RunnableC0849c runnableC0849c2 = new RunnableC0849c(sessionGetCallback);
            synchronized (this.f5034g) {
                this.f5034g.put(sessionGetCallback, runnableC0849c2);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(runnableC0849c2, j4, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            m4378c();
        }
        return;
    }

    /* renamed from: c */
    void m4378c() {
        m4374a(false);
        synchronized (this.f5039l) {
            this.f5039l.notifyAll();
        }
    }

    /* renamed from: a */
    protected String m4367a() {
        return this.f5036i;
    }

    /* renamed from: a */
    void m4374a(boolean z3) {
        this.f5031d = z3;
        if (z3) {
            return;
        }
        if (this.f5038k != null) {
            this.f5038k.cancel(true);
            this.f5038k = null;
        }
        this.f5032e = null;
    }

    /* renamed from: c */
    private void m4366c(Session session, int i4, String str) {
        SessionInfo sessionInfo = this.f5030c;
        if (sessionInfo == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m4638e("awcn.SessionRequest", "sendConnectInfoToAccsByCallBack", null, new Object[0]);
        Intent intent = new Intent("com.taobao.ACCS_CONNECT_INFO");
        intent.putExtra("command", 103);
        intent.putExtra(Constants.KEY_HOST, session.getHost());
        intent.putExtra(Constants.KEY_CENTER_HOST, true);
        boolean zIsAvailable = session.isAvailable();
        if (!zIsAvailable) {
            intent.putExtra(Constants.KEY_ERROR_CODE, i4);
            intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
        }
        intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
        intent.putExtra(Constants.KEY_TYPE_INAPP, true);
        this.f5028a.f5024h.notifyListener(intent);
    }

    /* renamed from: a */
    protected synchronized void m4369a(Context context, int i4, String str, SessionGetCallback sessionGetCallback, long j4) {
        Session sessionM4422a = this.f5029b.m4422a(this, i4);
        if (sessionM4422a != null) {
            ALog.m4636d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(sessionM4422a);
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C0968i.m4663a(null);
        }
        ALog.m4636d("awcn.SessionRequest", "SessionRequest start", str, Constants.KEY_HOST, this.f5036i, "type", Integer.valueOf(i4));
        if (this.f5031d) {
            ALog.m4636d("awcn.SessionRequest", "session connecting", str, Constants.KEY_HOST, m4367a());
            if (sessionGetCallback != null) {
                if (m4375b() == i4) {
                    RunnableC0849c runnableC0849c = new RunnableC0849c(sessionGetCallback);
                    synchronized (this.f5034g) {
                        this.f5034g.put(sessionGetCallback, runnableC0849c);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0849c, j4, TimeUnit.MILLISECONDS);
                } else {
                    sessionGetCallback.onSessionGetFail();
                }
            }
            return;
        }
        m4374a(true);
        this.f5038k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0848b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f5035h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m4378c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listM4360a = m4360a(i4, str);
        if (!listM4360a.isEmpty()) {
            List<C0889a> listM4361a = m4361a(listM4360a, str);
            try {
                C0889a c0889aRemove = listM4361a.remove(0);
                m4362a(context, c0889aRemove, new C0847a(context, listM4361a, c0889aRemove), c0889aRemove.m4453h());
                if (sessionGetCallback != null) {
                    RunnableC0849c runnableC0849c2 = new RunnableC0849c(sessionGetCallback);
                    synchronized (this.f5034g) {
                        this.f5034g.put(sessionGetCallback, runnableC0849c2);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0849c2, j4, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable unused) {
                m4378c();
            }
            return;
        }
        ALog.m4639i("awcn.SessionRequest", "no avalible strategy, can't create session", str, Constants.KEY_HOST, this.f5036i, "type", Integer.valueOf(i4));
        m4378c();
        throw new NoAvailStrategyException("no avalible strategy");
    }

    /* renamed from: b */
    protected void m4377b(boolean z3) {
        ALog.m4636d("awcn.SessionRequest", "closeSessions", this.f5028a.f5019c, Constants.KEY_HOST, this.f5036i, "autoCreate", Boolean.valueOf(z3));
        if (!z3 && this.f5032e != null) {
            this.f5032e.f5010u = false;
            this.f5032e.close(false);
        }
        List<Session> listM4424a = this.f5029b.m4424a(this);
        if (listM4424a != null) {
            for (Session session : listM4424a) {
                if (session != null) {
                    session.close(z3);
                }
            }
        }
    }

    /* renamed from: a */
    void m4370a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f5036i;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f5035h.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f5035h;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f5035h.start;
        AppMonitor.getInstance().commitStat(this.f5035h);
    }

    /* renamed from: b */
    protected int m4375b() {
        Session session = this.f5032e;
        if (session != null) {
            return session.f4999j.getType();
        }
        return -1;
    }

    /* renamed from: b */
    private void m4365b(Session session, int i4, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context == null || (sessionInfo = this.f5030c) == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m4638e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, new Object[0]);
        try {
            Intent intent = new Intent(Constants.ACTION_RECEIVE);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, "com.taobao.accs.data.MsgDistributeService");
            intent.putExtra("command", 103);
            intent.putExtra(Constants.KEY_HOST, session.getHost());
            intent.putExtra(Constants.KEY_CENTER_HOST, true);
            boolean zIsAvailable = session.isAvailable();
            if (!zIsAvailable) {
                intent.putExtra(Constants.KEY_ERROR_CODE, i4);
                intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
            }
            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
            if (Build.VERSION.SDK_INT >= 26) {
                context.bindService(intent, new ServiceConnectionC0896h(this, intent, context), 1);
            } else {
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m4637e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, th, new Object[0]);
        }
    }

    /* renamed from: a */
    void m4371a(Session session, int i4, int i5) {
        if (256 != i4 || i5 == -2613 || i5 == -2601) {
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f5036i;
        alarmObject.errorCode = String.valueOf(i5);
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        SessionConnStat sessionConnStat = this.f5035h;
        sessionConnStat.ret = 0;
        sessionConnStat.appendErrorTrace(i5);
        this.f5035h.errorCode = String.valueOf(i5);
        this.f5035h.totalTime = System.currentTimeMillis() - this.f5035h.start;
        this.f5035h.syncValueFromSession(session);
        AppMonitor.getInstance().commitStat(this.f5035h);
    }

    /* renamed from: a */
    private List<IConnStrategy> m4360a(int i4, String str) {
        HttpUrl httpUrl;
        List<IConnStrategy> connStrategyListByHost = Collections.EMPTY_LIST;
        try {
            httpUrl = HttpUrl.parse(m4367a());
        } catch (Throwable th) {
            ALog.m4637e("awcn.SessionRequest", "", str, th, new Object[0]);
        }
        if (httpUrl == null) {
            return connStrategyListByHost;
        }
        connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(httpUrl.host());
        if (!connStrategyListByHost.isEmpty()) {
            boolean zEqualsIgnoreCase = HttpConstant.HTTPS.equalsIgnoreCase(httpUrl.scheme());
            boolean zM4649b = C0962c.m4649b();
            ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                ConnType connTypeValueOf = ConnType.valueOf(next.getProtocol());
                if (connTypeValueOf != null) {
                    if (connTypeValueOf.isSSL() == zEqualsIgnoreCase && (i4 == C0891c.f5152c || connTypeValueOf.getType() == i4)) {
                        if (zM4649b && C0953c.m4631b(next.getIp())) {
                            listIterator.remove();
                        }
                    }
                    listIterator.remove();
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", connStrategyListByHost);
        }
        return connStrategyListByHost;
    }

    /* renamed from: a */
    private List<C0889a> m4361a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            IConnStrategy iConnStrategy = list.get(i5);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i6 = 0; i6 <= retryTimes; i6++) {
                i4++;
                C0889a c0889a = new C0889a(m4367a(), str + "_" + i4, iConnStrategy);
                c0889a.f5143b = i6;
                c0889a.f5144c = retryTimes;
                arrayList.add(c0889a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4362a(Context context, C0889a c0889a, IConnCb iConnCb, String str) {
        ConnType connTypeM4448c = c0889a.m4448c();
        if (context != null && !connTypeM4448c.isHttpType()) {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, c0889a);
            tnetSpdySession.initConfig(this.f5028a.f5020d);
            tnetSpdySession.initSessionInfo(this.f5030c);
            tnetSpdySession.setTnetPublicKey(this.f5028a.f5023g.m4392c(this.f5037j));
            this.f5032e = tnetSpdySession;
        } else {
            this.f5032e = new C0921d(context, c0889a);
        }
        ALog.m4639i("awcn.SessionRequest", "create connection...", str, "Host", m4367a(), "Type", c0889a.m4448c(), "IP", c0889a.m4446a(), "Port", Integer.valueOf(c0889a.m4447b()), "heartbeat", Integer.valueOf(c0889a.m4452g()), C1896c.f8597aw, this.f5032e);
        m4363a(this.f5032e, iConnCb, System.currentTimeMillis());
        this.f5032e.connect();
        SessionConnStat sessionConnStat = this.f5035h;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        SessionConnStat sessionConnStat2 = this.f5035h;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", c0889a.m4446a());
        }
    }

    /* renamed from: a */
    private void m4363a(Session session, IConnCb iConnCb, long j4) {
        if (iConnCb == null) {
            return;
        }
        session.registerEventcb(EventType.ALL, new C0892f(this, iConnCb, j4));
        session.registerEventcb(1792, new C0895g(this, session));
    }

    /* renamed from: a */
    protected void m4373a(String str) {
        ALog.m4636d("awcn.SessionRequest", "reCreateSession", str, Constants.KEY_HOST, this.f5036i);
        m4377b(true);
    }

    /* renamed from: a */
    protected void m4368a(long j4) throws InterruptedException, TimeoutException {
        ALog.m4636d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j4));
        if (j4 <= 0) {
            return;
        }
        synchronized (this.f5039l) {
            long jCurrentTimeMillis = System.currentTimeMillis() + j4;
            while (this.f5031d) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 >= jCurrentTimeMillis) {
                    break;
                } else {
                    this.f5039l.wait(jCurrentTimeMillis - jCurrentTimeMillis2);
                }
            }
            if (this.f5031d) {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: a */
    void m4372a(Session session, int i4, String str) {
        if (AwcnConfig.isSendConnectInfoByService()) {
            m4365b(session, i4, str);
        }
        m4366c(session, i4, str);
    }
}

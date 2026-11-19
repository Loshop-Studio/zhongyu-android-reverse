package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.taobao.accs.common.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
class AccsSessionManager {

    /* renamed from: c */
    private static CopyOnWriteArraySet<ISessionListener> f2217c = new CopyOnWriteArraySet<>();

    /* renamed from: a */
    SessionCenter f2218a;

    /* renamed from: b */
    Set<String> f2219b = Collections.EMPTY_SET;

    public AccsSessionManager(SessionCenter sessionCenter) {
        this.f2218a = null;
        this.f2218a = sessionCenter;
    }

    /* renamed from: b */
    private boolean m2229b() {
        return !(GlobalAppRuntimeInfo.isAppBackground() && AwcnConfig.isAccsSessionCreateForbiddenInBg()) && NetworkStatusHelper.isConnected();
    }

    public synchronized void checkAndStartSession() {
        try {
            Collection<SessionInfo> collectionM2279a = this.f2218a.f2301g.m2279a();
            Set<String> treeSet = Collections.EMPTY_SET;
            if (!collectionM2279a.isEmpty()) {
                treeSet = new TreeSet<>();
            }
            for (SessionInfo sessionInfo : collectionM2279a) {
                if (sessionInfo.isKeepAlive) {
                    treeSet.add(StringUtils.concatString(StrategyCenter.getInstance().getSchemeByHost(sessionInfo.host, sessionInfo.isAccs ? "https" : HttpConstant.HTTP), "://", sessionInfo.host));
                }
            }
            for (String str : this.f2219b) {
                if (!treeSet.contains(str)) {
                    m2228a(str);
                }
            }
            if (m2229b()) {
                for (String str2 : treeSet) {
                    try {
                        this.f2218a.get(str2, ConnType.TypeLevel.SPDY, 0L);
                    } catch (Exception unused) {
                        ALog.m2529e("start session failed", null, Constants.KEY_HOST, str2);
                    }
                }
                this.f2219b = treeSet;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void forceCloseSession(boolean z10) {
        try {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.AccsSessionManager", "forceCloseSession", this.f2218a.f2297c, "reCreate", Boolean.valueOf(z10));
            }
            Iterator<String> it = this.f2219b.iterator();
            while (it.hasNext()) {
                m2228a(it.next());
            }
            if (z10) {
                checkAndStartSession();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void notifyListener(Intent intent) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC4973a(this, intent));
    }

    public void registerListener(ISessionListener iSessionListener) {
        if (iSessionListener != null) {
            f2217c.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        f2217c.remove(iSessionListener);
    }

    /* renamed from: a */
    private void m2228a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m2527d("awcn.AccsSessionManager", "closeSessions", this.f2218a.f2297c, Constants.KEY_HOST, str);
        this.f2218a.m2247a(str).m2268b(false);
    }
}

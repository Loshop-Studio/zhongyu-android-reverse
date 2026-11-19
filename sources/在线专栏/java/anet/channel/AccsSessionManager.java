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

/* loaded from: classes.dex */
class AccsSessionManager {

    /* renamed from: c */
    private static CopyOnWriteArraySet<ISessionListener> f4939c = new CopyOnWriteArraySet<>();

    /* renamed from: a */
    SessionCenter f4940a;

    /* renamed from: b */
    Set<String> f4941b = Collections.EMPTY_SET;

    AccsSessionManager(SessionCenter sessionCenter) {
        this.f4940a = null;
        this.f4940a = sessionCenter;
    }

    /* renamed from: b */
    private boolean m4338b() {
        return !(GlobalAppRuntimeInfo.isAppBackground() && AwcnConfig.isAccsSessionCreateForbiddenInBg()) && NetworkStatusHelper.isConnected();
    }

    public synchronized void checkAndStartSession() {
        Collection<SessionInfo> collectionM4388a = this.f4940a.f5023g.m4388a();
        Set<String> treeSet = Collections.EMPTY_SET;
        if (!collectionM4388a.isEmpty()) {
            treeSet = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : collectionM4388a) {
            if (sessionInfo.isKeepAlive) {
                treeSet.add(StringUtils.concatString(StrategyCenter.getInstance().getSchemeByHost(sessionInfo.host, sessionInfo.isAccs ? HttpConstant.HTTPS : HttpConstant.HTTP), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str : this.f4941b) {
            if (!treeSet.contains(str)) {
                m4337a(str);
            }
        }
        if (m4338b()) {
            for (String str2 : treeSet) {
                try {
                    this.f4940a.get(str2, ConnType.TypeLevel.SPDY, 0L);
                } catch (Exception unused) {
                    ALog.m4638e("start session failed", null, Constants.KEY_HOST, str2);
                }
            }
            this.f4941b = treeSet;
        }
    }

    public synchronized void forceCloseSession(boolean z3) {
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.AccsSessionManager", "forceCloseSession", this.f4940a.f5019c, "reCreate", Boolean.valueOf(z3));
        }
        Iterator<String> it = this.f4941b.iterator();
        while (it.hasNext()) {
            m4337a(it.next());
        }
        if (z3) {
            checkAndStartSession();
        }
    }

    public void notifyListener(Intent intent) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0850a(this, intent));
    }

    public void registerListener(ISessionListener iSessionListener) {
        if (iSessionListener != null) {
            f4939c.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        f4939c.remove(iSessionListener);
    }

    /* renamed from: a */
    private void m4337a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m4636d("awcn.AccsSessionManager", "closeSessions", this.f4940a.f5019c, Constants.KEY_HOST, str);
        this.f4940a.m4356a(str).m4377b(false);
    }
}

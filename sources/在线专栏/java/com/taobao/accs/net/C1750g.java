package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.accs.net.g */
/* loaded from: classes.dex */
public class C1750g {

    /* renamed from: a */
    private int f7685a = 0;

    /* renamed from: b */
    private final List<IConnStrategy> f7686b = new ArrayList();

    public C1750g(String str) {
        HttpDispatcher.getInstance().addListener(new C1751h(this));
        m6029a(str);
    }

    /* renamed from: a */
    public List<IConnStrategy> m6029a(String str) {
        List<IConnStrategy> connStrategyListByHost;
        if ((this.f7685a == 0 || this.f7686b.isEmpty()) && (connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str)) != null && !connStrategyListByHost.isEmpty()) {
            this.f7686b.clear();
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                ConnType connTypeValueOf = ConnType.valueOf(iConnStrategy.getProtocol());
                if (connTypeValueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && connTypeValueOf.isSSL()) {
                    this.f7686b.add(iConnStrategy);
                }
            }
        }
        return this.f7686b;
    }

    /* renamed from: b */
    public void m6030b() {
        this.f7685a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m6090d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f7685a, new Object[0]);
        }
    }

    /* renamed from: c */
    public int m6032c() {
        return this.f7685a;
    }

    /* renamed from: b */
    public void m6031b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    /* renamed from: a */
    public IConnStrategy m6027a() {
        return m6028a(this.f7686b);
    }

    /* renamed from: a */
    public IConnStrategy m6028a(List<IConnStrategy> list) {
        if (list != null && !list.isEmpty()) {
            int i4 = this.f7685a;
            if (i4 < 0 || i4 >= list.size()) {
                this.f7685a = 0;
            }
            return list.get(this.f7685a);
        }
        ALog.m6090d("HttpDnsProvider", "strategies null or 0", new Object[0]);
        return null;
    }
}

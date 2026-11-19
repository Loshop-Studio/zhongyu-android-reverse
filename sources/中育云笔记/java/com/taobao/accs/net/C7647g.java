package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.accs.net.g */
/* loaded from: classes5.dex */
public class C7647g {

    /* renamed from: a */
    private int f13083a = 0;

    /* renamed from: b */
    private final List<IConnStrategy> f13084b = new ArrayList();

    public C7647g(String str) {
        HttpDispatcher.getInstance().addListener(new C7648h(this));
        m10055a(str);
    }

    /* renamed from: a */
    public List<IConnStrategy> m10055a(String str) {
        List<IConnStrategy> connStrategyListByHost;
        if ((this.f13083a == 0 || this.f13084b.isEmpty()) && (connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str)) != null && !connStrategyListByHost.isEmpty()) {
            this.f13084b.clear();
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                ConnType connTypeValueOf = ConnType.valueOf(iConnStrategy.getProtocol());
                if (connTypeValueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && connTypeValueOf.isSSL()) {
                    this.f13084b.add(iConnStrategy);
                }
            }
        }
        return this.f13084b;
    }

    /* renamed from: b */
    public void m10056b() {
        this.f13083a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m10116d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f13083a, new Object[0]);
        }
    }

    /* renamed from: c */
    public int m10058c() {
        return this.f13083a;
    }

    /* renamed from: b */
    public void m10057b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    /* renamed from: a */
    public IConnStrategy m10053a() {
        return m10054a(this.f13084b);
    }

    /* renamed from: a */
    public IConnStrategy m10054a(List<IConnStrategy> list) {
        if (list != null && !list.isEmpty()) {
            int i10 = this.f13083a;
            if (i10 < 0 || i10 >= list.size()) {
                this.f13083a = 0;
            }
            return list.get(this.f13083a);
        }
        ALog.m10116d("HttpDnsProvider", "strategies null or 0", new Object[0]);
        return null;
    }
}

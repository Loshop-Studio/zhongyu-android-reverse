package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.p024e.C5005a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C5076c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class StrategyTable implements Serializable {

    /* renamed from: e */
    protected static Comparator<StrategyCollection> f2646e = new C5073o();

    /* renamed from: a */
    protected String f2647a;

    /* renamed from: b */
    protected volatile String f2648b;

    /* renamed from: c */
    Map<String, Long> f2649c;

    /* renamed from: d */
    protected transient boolean f2650d = false;

    /* renamed from: f */
    private HostLruCache f2651f;

    /* renamed from: g */
    private volatile transient int f2652g;

    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i10) {
            super(i10);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f2628d) {
                return true;
            }
            Iterator<Map.Entry<String, StrategyCollection>> it = entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().f2628d) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    public StrategyTable(String str) {
        this.f2647a = str;
        m2487a();
    }

    /* renamed from: b */
    private void m2484b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f2647a)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                this.f2651f.put(str, new StrategyCollection(str));
            }
        }
    }

    /* renamed from: c */
    private void m2486c() {
        TreeSet treeSet;
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f2647a)) {
                synchronized (this.f2651f) {
                    try {
                        treeSet = null;
                        for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                            if (!this.f2651f.containsKey(str)) {
                                this.f2651f.put(str, new StrategyCollection(str));
                                if (treeSet == null) {
                                    treeSet = new TreeSet();
                                }
                                treeSet.add(str);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (treeSet != null) {
                    m2483a(treeSet);
                }
            }
        } catch (Exception e10) {
            ALog.m2528e("awcn.StrategyTable", "checkInitHost failed", this.f2647a, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m2487a() {
        if (this.f2651f == null) {
            this.f2651f = new HostLruCache(256);
            m2484b();
        }
        Iterator<StrategyCollection> it = this.f2651f.values().iterator();
        while (it.hasNext()) {
            it.next().checkInit();
        }
        ALog.m2530i("awcn.StrategyTable", "strategy map", null, "size", Integer.valueOf(this.f2651f.size()));
        this.f2652g = GlobalAppRuntimeInfo.isTargetProcess() ? 0 : -1;
        if (this.f2649c == null) {
            this.f2649c = new ConcurrentHashMap();
        }
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f2651f) {
            strategyCollection = this.f2651f.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            m2482a(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.f2627c;
        }
        return null;
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || !C5076c.m2523c(str)) {
            return Collections.EMPTY_LIST;
        }
        m2486c();
        synchronized (this.f2651f) {
            try {
                strategyCollection = this.f2651f.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.f2651f.put(str, strategyCollection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (strategyCollection.f2626b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m2482a(str);
        }
        return strategyCollection.queryStrategyList();
    }

    public void update(C5070l.d dVar) {
        C5070l.b[] bVarArr;
        String str;
        ALog.m2530i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f2647a, new Object[0]);
        try {
            this.f2648b = dVar.f2710a;
            this.f2652g = dVar.f2715f;
            bVarArr = dVar.f2711b;
        } catch (Throwable th) {
            ALog.m2528e("awcn.StrategyTable", "fail to update strategyTable", this.f2647a, th, new Object[0]);
        }
        if (bVarArr == null) {
            return;
        }
        synchronized (this.f2651f) {
            for (C5070l.b bVar : bVarArr) {
                try {
                    if (bVar != null && (str = bVar.f2696a) != null) {
                        if (bVar.f2705j) {
                            this.f2651f.remove(str);
                        } else {
                            StrategyCollection strategyCollection = this.f2651f.get(str);
                            if (strategyCollection == null) {
                                strategyCollection = new StrategyCollection(bVar.f2696a);
                                this.f2651f.put(bVar.f2696a, strategyCollection);
                            }
                            strategyCollection.update(bVar);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f2650d = true;
        if (ALog.isPrintLog(1)) {
            StringBuilder sb2 = new StringBuilder("uniqueId : ");
            sb2.append(this.f2647a);
            sb2.append("\n-------------------------domains:------------------------------------");
            ALog.m2527d("awcn.StrategyTable", sb2.toString(), null, new Object[0]);
            synchronized (this.f2651f) {
                try {
                    for (Map.Entry<String, StrategyCollection> entry : this.f2651f.entrySet()) {
                        sb2.setLength(0);
                        sb2.append(entry.getKey());
                        sb2.append(" = ");
                        sb2.append(entry.getValue().toString());
                        ALog.m2527d("awcn.StrategyTable", sb2.toString(), null, new Object[0]);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    private void m2485b(Set<String> set) {
        TreeSet treeSet = new TreeSet(f2646e);
        synchronized (this.f2651f) {
            treeSet.addAll(this.f2651f.values());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                return;
            }
            strategyCollection.f2626b = 30000 + jCurrentTimeMillis;
            set.add(strategyCollection.f2625a);
        }
    }

    /* renamed from: a */
    private void m2482a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        m2483a(treeSet);
    }

    /* renamed from: a */
    public void m2489a(String str, boolean z10) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f2651f) {
            try {
                strategyCollection = this.f2651f.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.f2651f.put(str, strategyCollection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10 || strategyCollection.f2626b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m2482a(str);
        }
    }

    /* renamed from: a */
    private void m2483a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        if ((GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0) || !NetworkStatusHelper.isConnected()) {
            ALog.m2530i("awcn.StrategyTable", "app in background or no network", this.f2647a, new Object[0]);
            return;
        }
        int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
        if (amdcLimitLevel == 3) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f2651f) {
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    StrategyCollection strategyCollection = this.f2651f.get(it.next());
                    if (strategyCollection != null) {
                        strategyCollection.f2626b = 30000 + jCurrentTimeMillis;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (amdcLimitLevel == 0) {
            m2485b(set);
        }
        HttpDispatcher.getInstance().sendAmdcRequest(set, this.f2652g);
    }

    /* renamed from: a */
    public void m2488a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        String str2;
        IConnStrategy iConnStrategy2;
        ConnEvent connEvent2;
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            str2 = str;
            iConnStrategy2 = iConnStrategy;
            connEvent2 = connEvent;
            ALog.m2527d("awcn.StrategyTable", "[notifyConnEvent]", null, "Host", str2, "IConnStrategy", iConnStrategy2, "ConnEvent", connEvent2);
        } else {
            str2 = str;
            iConnStrategy2 = iConnStrategy;
            connEvent2 = connEvent;
        }
        String str3 = iConnStrategy2.getProtocol().protocol;
        if (ConnType.HTTP3.equals(str3) || ConnType.HTTP3_PLAIN.equals(str3)) {
            C5005a.m2324a(connEvent2.isSuccess);
            ALog.m2529e("awcn.StrategyTable", "enable http3", null, "uniqueId", this.f2647a, "enable", Boolean.valueOf(connEvent2.isSuccess));
        }
        if (!connEvent2.isSuccess && C5076c.m2522b(iConnStrategy2.getIp())) {
            this.f2649c.put(str2, Long.valueOf(System.currentTimeMillis()));
            ALog.m2529e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f2647a, Constants.KEY_HOST, str2);
        }
        synchronized (this.f2651f) {
            strategyCollection = this.f2651f.get(str2);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy2, connEvent2);
        }
    }

    /* renamed from: a */
    public boolean m2490a(String str, long j10) {
        Long l10 = this.f2649c.get(str);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() + j10 >= System.currentTimeMillis()) {
            return true;
        }
        this.f2649c.remove(str);
        return false;
    }
}

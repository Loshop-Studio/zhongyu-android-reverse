package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.p009e.C0882a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0953c;
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

/* loaded from: classes.dex */
class StrategyTable implements Serializable {

    /* renamed from: e */
    protected static Comparator<StrategyCollection> f5368e = new C0950o();

    /* renamed from: a */
    protected String f5369a;

    /* renamed from: b */
    protected volatile String f5370b;

    /* renamed from: c */
    Map<String, Long> f5371c;

    /* renamed from: d */
    protected transient boolean f5372d = false;

    /* renamed from: f */
    private HostLruCache f5373f;

    /* renamed from: g */
    private volatile transient int f5374g;

    private static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i4) {
            super(i4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f5350d) {
                return true;
            }
            Iterator<Map.Entry<String, StrategyCollection>> it = entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().f5350d) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    protected StrategyTable(String str) {
        this.f5369a = str;
        m4596a();
    }

    /* renamed from: b */
    private void m4593b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f5369a)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                this.f5373f.put(str, new StrategyCollection(str));
            }
        }
    }

    /* renamed from: c */
    private void m4595c() {
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f5369a)) {
                TreeSet treeSet = null;
                synchronized (this.f5373f) {
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.f5373f.containsKey(str)) {
                            this.f5373f.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    m4592a(treeSet);
                }
            }
        } catch (Exception e4) {
            ALog.m4637e("awcn.StrategyTable", "checkInitHost failed", this.f5369a, e4, new Object[0]);
        }
    }

    /* renamed from: a */
    protected void m4596a() {
        if (this.f5373f == null) {
            this.f5373f = new HostLruCache(256);
            m4593b();
        }
        Iterator<StrategyCollection> it = this.f5373f.values().iterator();
        while (it.hasNext()) {
            it.next().checkInit();
        }
        ALog.m4639i("awcn.StrategyTable", "strategy map", null, "size", Integer.valueOf(this.f5373f.size()));
        this.f5374g = GlobalAppRuntimeInfo.isTargetProcess() ? 0 : -1;
        if (this.f5371c == null) {
            this.f5371c = new ConcurrentHashMap();
        }
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f5373f) {
            strategyCollection = this.f5373f.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            m4591a(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.f5349c;
        }
        return null;
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || !C0953c.m4632c(str)) {
            return Collections.EMPTY_LIST;
        }
        m4595c();
        synchronized (this.f5373f) {
            strategyCollection = this.f5373f.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f5373f.put(str, strategyCollection);
            }
        }
        if (strategyCollection.f5348b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m4591a(str);
        }
        return strategyCollection.queryStrategyList();
    }

    public void update(C0947l.d dVar) {
        C0947l.b[] bVarArr;
        String str;
        ALog.m4639i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f5369a, new Object[0]);
        try {
            this.f5370b = dVar.f5432a;
            this.f5374g = dVar.f5437f;
            bVarArr = dVar.f5433b;
        } catch (Throwable th) {
            ALog.m4637e("awcn.StrategyTable", "fail to update strategyTable", this.f5369a, th, new Object[0]);
        }
        if (bVarArr == null) {
            return;
        }
        synchronized (this.f5373f) {
            for (C0947l.b bVar : bVarArr) {
                if (bVar != null && (str = bVar.f5418a) != null) {
                    if (bVar.f5427j) {
                        this.f5373f.remove(str);
                    } else {
                        StrategyCollection strategyCollection = this.f5373f.get(str);
                        if (strategyCollection == null) {
                            strategyCollection = new StrategyCollection(bVar.f5418a);
                            this.f5373f.put(bVar.f5418a, strategyCollection);
                        }
                        strategyCollection.update(bVar);
                    }
                }
            }
        }
        this.f5372d = true;
        if (ALog.isPrintLog(1)) {
            StringBuilder sb = new StringBuilder("uniqueId : ");
            sb.append(this.f5369a);
            sb.append("\n-------------------------domains:------------------------------------");
            ALog.m4636d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
            synchronized (this.f5373f) {
                for (Map.Entry<String, StrategyCollection> entry : this.f5373f.entrySet()) {
                    sb.setLength(0);
                    sb.append(entry.getKey());
                    sb.append(" = ");
                    sb.append(entry.getValue().toString());
                    ALog.m4636d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    private void m4594b(Set<String> set) {
        TreeSet treeSet = new TreeSet(f5368e);
        synchronized (this.f5373f) {
            treeSet.addAll(this.f5373f.values());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                return;
            }
            strategyCollection.f5348b = 30000 + jCurrentTimeMillis;
            set.add(strategyCollection.f5347a);
        }
    }

    /* renamed from: a */
    private void m4591a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        m4592a(treeSet);
    }

    /* renamed from: a */
    protected void m4598a(String str, boolean z3) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f5373f) {
            strategyCollection = this.f5373f.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f5373f.put(str, strategyCollection);
            }
        }
        if (z3 || strategyCollection.f5348b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m4591a(str);
        }
    }

    /* renamed from: a */
    private void m4592a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        if ((GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0) || !NetworkStatusHelper.isConnected()) {
            ALog.m4639i("awcn.StrategyTable", "app in background or no network", this.f5369a, new Object[0]);
            return;
        }
        int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
        if (amdcLimitLevel == 3) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f5373f) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                StrategyCollection strategyCollection = this.f5373f.get(it.next());
                if (strategyCollection != null) {
                    strategyCollection.f5348b = 30000 + jCurrentTimeMillis;
                }
            }
        }
        if (amdcLimitLevel == 0) {
            m4594b(set);
        }
        HttpDispatcher.getInstance().sendAmdcRequest(set, this.f5374g);
    }

    /* renamed from: a */
    void m4597a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.StrategyTable", "[notifyConnEvent]", null, "Host", str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
            C0882a.m4433a(connEvent.isSuccess);
            ALog.m4638e("awcn.StrategyTable", "enable http3", null, "uniqueId", this.f5369a, "enable", Boolean.valueOf(connEvent.isSuccess));
        }
        if (!connEvent.isSuccess && C0953c.m4631b(iConnStrategy.getIp())) {
            this.f5371c.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.m4638e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f5369a, Constants.KEY_HOST, str);
        }
        synchronized (this.f5373f) {
            strategyCollection = this.f5373f.get(str);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }

    /* renamed from: a */
    boolean m4599a(String str, long j4) {
        Long l3 = this.f5371c.get(str);
        if (l3 == null) {
            return false;
        }
        if (l3.longValue() + j4 >= System.currentTimeMillis()) {
            return true;
        }
        this.f5371c.remove(str);
        return false;
    }
}

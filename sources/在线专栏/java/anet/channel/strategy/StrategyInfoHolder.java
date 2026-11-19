package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.utils.C0951a;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    Map<String, StrategyTable> f5358a = new LruStrategyMap();

    /* renamed from: b */
    volatile StrategyConfig f5359b = null;

    /* renamed from: c */
    final C0933a f5360c = new C0933a();

    /* renamed from: d */
    private final StrategyTable f5361d = new StrategyTable("Unknown");

    /* renamed from: e */
    private final Set<String> f5362e = new HashSet();

    /* renamed from: f */
    private volatile String f5363f = "";

    /* JADX INFO: Access modifiers changed from: private */
    static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            C0951a.m4625a(new RunnableC0941f(this, entry));
            return true;
        }
    }

    private StrategyInfoHolder() {
        try {
            m4579e();
            m4581g();
        } catch (Throwable unused) {
        }
        m4580f();
    }

    /* renamed from: a */
    public static StrategyInfoHolder m4577a() {
        return new StrategyInfoHolder();
    }

    /* renamed from: e */
    private void m4579e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f5363f = m4578a(NetworkStatusHelper.getStatus());
    }

    /* renamed from: f */
    private void m4580f() {
        Iterator<Map.Entry<String, StrategyTable>> it = this.f5358a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m4596a();
        }
        synchronized (this) {
            if (this.f5359b == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.m4576b();
                strategyConfig.m4573a(this);
                this.f5359b = strategyConfig;
            }
        }
    }

    /* renamed from: g */
    private void m4581g() {
        ALog.m4639i("awcn.StrategyInfoHolder", RequestParameters.X_OSS_RESTORE, null, new Object[0]);
        String str = this.f5363f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                m4583a(str, true);
            }
            this.f5359b = (StrategyConfig) C0948m.m4615a("StrategyConfig", null);
            if (this.f5359b != null) {
                this.f5359b.m4576b();
                this.f5359b.m4573a(this);
            }
        }
        C0951a.m4625a(new RunnableC0936d(this, str));
    }

    /* renamed from: b */
    void m4584b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    /* renamed from: c */
    void m4585c() {
        synchronized (this) {
            for (StrategyTable strategyTable : this.f5358a.values()) {
                if (strategyTable.f5372d) {
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    String str = strategyTable.f5369a;
                    strategyStatObject.writeStrategyFileId = str;
                    C0948m.m4618a(strategyTable, str, strategyStatObject);
                    strategyTable.f5372d = false;
                }
            }
            C0948m.m4618a(this.f5359b.m4571a(), "StrategyConfig", null);
        }
    }

    /* renamed from: d */
    StrategyTable m4586d() {
        StrategyTable strategyTable = this.f5361d;
        String str = this.f5363f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f5358a) {
                strategyTable = this.f5358a.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.f5358a.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f5363f = m4578a(networkStatus);
        String str = this.f5363f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f5358a) {
            if (!this.f5358a.containsKey(str)) {
                C0951a.m4625a(new RunnableC0940e(this, str));
            }
        }
    }

    /* renamed from: a */
    protected void m4583a(String str, boolean z3) {
        synchronized (this.f5362e) {
            if (this.f5362e.contains(str)) {
                return;
            }
            this.f5362e.add(str);
            StrategyStatObject strategyStatObject = null;
            if (z3) {
                strategyStatObject = new StrategyStatObject(0);
                strategyStatObject.readStrategyFileId = str;
            }
            StrategyTable strategyTable = (StrategyTable) C0948m.m4615a(str, strategyStatObject);
            if (strategyTable != null) {
                strategyTable.m4596a();
                synchronized (this.f5358a) {
                    this.f5358a.put(strategyTable.f5369a, strategyTable);
                }
            }
            synchronized (this.f5362e) {
                this.f5362e.remove(str);
            }
            if (z3) {
                strategyStatObject.isSucceed = strategyTable != null ? 1 : 0;
                AppMonitor.getInstance().commitStat(strategyStatObject);
            }
        }
    }

    /* renamed from: a */
    private String m4578a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String strMd5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            return "WIFI$" + (TextUtils.isEmpty(strMd5ToHex) ? "" : strMd5ToHex);
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
    }

    /* renamed from: a */
    void m4582a(C0947l.d dVar) {
        int i4 = dVar.f5438g;
        if (i4 != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(i4, dVar.f5439h);
        }
        m4586d().update(dVar);
        this.f5359b.m4574a(dVar);
    }
}

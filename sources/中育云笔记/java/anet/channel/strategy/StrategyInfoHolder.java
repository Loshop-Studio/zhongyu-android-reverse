package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.utils.C5074a;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    Map<String, StrategyTable> f2636a = new LruStrategyMap();

    /* renamed from: b */
    volatile StrategyConfig f2637b = null;

    /* renamed from: c */
    final C5056a f2638c = new C5056a();

    /* renamed from: d */
    private final StrategyTable f2639d = new StrategyTable("Unknown");

    /* renamed from: e */
    private final Set<String> f2640e = new HashSet();

    /* renamed from: f */
    private volatile String f2641f = "";

    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            C5074a.m2516a(new RunnableC5064f(this, entry));
            return true;
        }
    }

    private StrategyInfoHolder() {
        try {
            m2470e();
            m2472g();
            m2471f();
        } catch (Throwable unused) {
            m2471f();
        }
    }

    /* renamed from: a */
    public static StrategyInfoHolder m2468a() {
        return new StrategyInfoHolder();
    }

    /* renamed from: e */
    private void m2470e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f2641f = m2469a(NetworkStatusHelper.getStatus());
    }

    /* renamed from: f */
    private void m2471f() {
        Iterator<Map.Entry<String, StrategyTable>> it = this.f2636a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m2487a();
        }
        synchronized (this) {
            try {
                if (this.f2637b == null) {
                    StrategyConfig strategyConfig = new StrategyConfig();
                    strategyConfig.m2467b();
                    strategyConfig.m2464a(this);
                    this.f2637b = strategyConfig;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    private void m2472g() {
        ALog.m2530i("awcn.StrategyInfoHolder", RequestParameters.X_OSS_RESTORE, null, new Object[0]);
        String str = this.f2641f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                m2474a(str, true);
            }
            this.f2637b = (StrategyConfig) C5071m.m2506a("StrategyConfig", null);
            if (this.f2637b != null) {
                this.f2637b.m2467b();
                this.f2637b.m2464a(this);
            }
        }
        C5074a.m2516a(new RunnableC5059d(this, str));
    }

    /* renamed from: b */
    public void m2475b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    /* renamed from: c */
    public void m2476c() {
        synchronized (this) {
            try {
                for (StrategyTable strategyTable : this.f2636a.values()) {
                    if (strategyTable.f2650d) {
                        StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                        String str = strategyTable.f2647a;
                        strategyStatObject.writeStrategyFileId = str;
                        C5071m.m2509a(strategyTable, str, strategyStatObject);
                        strategyTable.f2650d = false;
                    }
                }
                C5071m.m2509a(this.f2637b.m2462a(), "StrategyConfig", null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public StrategyTable m2477d() {
        StrategyTable strategyTable;
        StrategyTable strategyTable2 = this.f2639d;
        String str = this.f2641f;
        if (TextUtils.isEmpty(str)) {
            return strategyTable2;
        }
        synchronized (this.f2636a) {
            strategyTable = this.f2636a.get(str);
            if (strategyTable == null) {
                strategyTable = new StrategyTable(str);
                this.f2636a.put(str, strategyTable);
            }
        }
        return strategyTable;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f2641f = m2469a(networkStatus);
        String str = this.f2641f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f2636a) {
            try {
                if (!this.f2636a.containsKey(str)) {
                    C5074a.m2516a(new RunnableC5063e(this, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2474a(String str, boolean z10) {
        StrategyStatObject strategyStatObject;
        synchronized (this.f2640e) {
            if (this.f2640e.contains(str)) {
                return;
            }
            this.f2640e.add(str);
            if (z10) {
                strategyStatObject = new StrategyStatObject(0);
                strategyStatObject.readStrategyFileId = str;
            } else {
                strategyStatObject = null;
            }
            StrategyTable strategyTable = (StrategyTable) C5071m.m2506a(str, strategyStatObject);
            if (strategyTable != null) {
                strategyTable.m2487a();
                synchronized (this.f2636a) {
                    this.f2636a.put(strategyTable.f2647a, strategyTable);
                }
            }
            synchronized (this.f2640e) {
                this.f2640e.remove(str);
            }
            if (z10) {
                strategyStatObject.isSucceed = strategyTable != null ? 1 : 0;
                AppMonitor.getInstance().commitStat(strategyStatObject);
            }
        }
    }

    /* renamed from: a */
    private String m2469a(NetworkStatusHelper.NetworkStatus networkStatus) {
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
    public void m2473a(C5070l.d dVar) {
        int i10 = dVar.f2716g;
        if (i10 != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(i10, dVar.f2717h);
        }
        m2477d().update(dVar);
        this.f2637b.m2465a(dVar);
    }
}

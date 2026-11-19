package anet.channel.strategy;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
class StrategyCollection implements Serializable {

    /* renamed from: a */
    String f2625a;

    /* renamed from: b */
    volatile long f2626b;

    /* renamed from: c */
    volatile String f2627c;

    /* renamed from: d */
    boolean f2628d;

    /* renamed from: e */
    int f2629e;

    /* renamed from: f */
    private StrategyList f2630f;

    /* renamed from: g */
    private transient long f2631g;

    /* renamed from: h */
    private transient boolean f2632h;

    public StrategyCollection() {
        this.f2630f = null;
        this.f2626b = 0L;
        this.f2627c = null;
        this.f2628d = false;
        this.f2629e = 0;
        this.f2631g = 0L;
        this.f2632h = true;
    }

    public synchronized void checkInit() {
        if (System.currentTimeMillis() - this.f2626b > 172800000) {
            this.f2630f = null;
            return;
        }
        StrategyList strategyList = this.f2630f;
        if (strategyList != null) {
            strategyList.checkInit();
        }
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > this.f2626b;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyList strategyList = this.f2630f;
        if (strategyList != null) {
            strategyList.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f2630f.shouldRefresh()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f2631g > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f2625a);
                    this.f2631g = jCurrentTimeMillis;
                }
            }
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f2630f == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.f2632h) {
            this.f2632h = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f2625a, this.f2629e);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        return this.f2630f.getStrategyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("\nStrategyList = ");
        sb2.append(this.f2626b);
        StrategyList strategyList = this.f2630f;
        if (strategyList != null) {
            sb2.append(strategyList.toString());
        } else if (this.f2627c != null) {
            sb2.append('[');
            sb2.append(this.f2625a);
            sb2.append("=>");
            sb2.append(this.f2627c);
            sb2.append(']');
        } else {
            sb2.append("[]");
        }
        return sb2.toString();
    }

    public synchronized void update(C5070l.b bVar) {
        C5070l.e[] eVarArr;
        C5070l.a[] aVarArr;
        this.f2626b = System.currentTimeMillis() + (bVar.f2697b * 1000);
        if (!bVar.f2696a.equalsIgnoreCase(this.f2625a)) {
            ALog.m2529e("StrategyCollection", "update error!", null, Constants.KEY_HOST, this.f2625a, "dnsInfo.host", bVar.f2696a);
            return;
        }
        int i10 = this.f2629e;
        int i11 = bVar.f2707l;
        if (i10 != i11) {
            this.f2629e = i11;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f2625a, i11);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.f2627c = bVar.f2699d;
        String[] strArr = bVar.f2701f;
        if ((strArr != null && strArr.length != 0 && (aVarArr = bVar.f2703h) != null && aVarArr.length != 0) || ((eVarArr = bVar.f2704i) != null && eVarArr.length != 0)) {
            if (this.f2630f == null) {
                this.f2630f = new StrategyList();
            }
            this.f2630f.update(bVar);
            return;
        }
        this.f2630f = null;
    }

    public StrategyCollection(String str) {
        this.f2630f = null;
        this.f2626b = 0L;
        this.f2627c = null;
        this.f2628d = false;
        this.f2629e = 0;
        this.f2631g = 0L;
        this.f2632h = true;
        this.f2625a = str;
        this.f2628d = DispatchConstants.isAmdcServerDomain(str);
    }
}

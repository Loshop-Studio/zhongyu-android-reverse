package anet.channel.strategy;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
class StrategyCollection implements Serializable {

    /* renamed from: a */
    String f5347a;

    /* renamed from: b */
    volatile long f5348b;

    /* renamed from: c */
    volatile String f5349c;

    /* renamed from: d */
    boolean f5350d;

    /* renamed from: e */
    int f5351e;

    /* renamed from: f */
    private StrategyList f5352f;

    /* renamed from: g */
    private transient long f5353g;

    /* renamed from: h */
    private transient boolean f5354h;

    public StrategyCollection() {
        this.f5352f = null;
        this.f5348b = 0L;
        this.f5349c = null;
        this.f5350d = false;
        this.f5351e = 0;
        this.f5353g = 0L;
        this.f5354h = true;
    }

    public synchronized void checkInit() {
        if (System.currentTimeMillis() - this.f5348b > 172800000) {
            this.f5352f = null;
            return;
        }
        StrategyList strategyList = this.f5352f;
        if (strategyList != null) {
            strategyList.checkInit();
        }
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > this.f5348b;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyList strategyList = this.f5352f;
        if (strategyList != null) {
            strategyList.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f5352f.shouldRefresh()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f5353g > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f5347a);
                    this.f5353g = jCurrentTimeMillis;
                }
            }
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f5352f == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.f5354h) {
            this.f5354h = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f5347a, this.f5351e);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        return this.f5352f.getStrategyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyList = ");
        sb.append(this.f5348b);
        StrategyList strategyList = this.f5352f;
        if (strategyList != null) {
            sb.append(strategyList.toString());
        } else if (this.f5349c != null) {
            sb.append('[');
            sb.append(this.f5347a);
            sb.append("=>");
            sb.append(this.f5349c);
            sb.append(']');
        } else {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb.toString();
    }

    public synchronized void update(C0947l.b bVar) {
        C0947l.e[] eVarArr;
        C0947l.a[] aVarArr;
        this.f5348b = System.currentTimeMillis() + (bVar.f5419b * 1000);
        if (!bVar.f5418a.equalsIgnoreCase(this.f5347a)) {
            ALog.m4638e("StrategyCollection", "update error!", null, Constants.KEY_HOST, this.f5347a, "dnsInfo.host", bVar.f5418a);
            return;
        }
        int i4 = this.f5351e;
        int i5 = bVar.f5429l;
        if (i4 != i5) {
            this.f5351e = i5;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f5347a, i5);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.f5349c = bVar.f5421d;
        String[] strArr = bVar.f5423f;
        if ((strArr != null && strArr.length != 0 && (aVarArr = bVar.f5425h) != null && aVarArr.length != 0) || ((eVarArr = bVar.f5426i) != null && eVarArr.length != 0)) {
            if (this.f5352f == null) {
                this.f5352f = new StrategyList();
            }
            this.f5352f.update(bVar);
            return;
        }
        this.f5352f = null;
    }

    protected StrategyCollection(String str) {
        this.f5352f = null;
        this.f5348b = 0L;
        this.f5349c = null;
        this.f5350d = false;
        this.f5351e = 0;
        this.f5353g = 0L;
        this.f5354h = true;
        this.f5347a = str;
        this.f5350d = DispatchConstants.isAmdcServerDomain(str);
    }
}

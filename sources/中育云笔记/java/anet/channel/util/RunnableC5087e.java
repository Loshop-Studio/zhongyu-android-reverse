package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.util.e */
/* loaded from: classes3.dex */
class RunnableC5087e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC5086d f2759a;

    public RunnableC5087e(RunnableC5086d runnableC5086d) {
        this.f2759a = runnableC5086d;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5088f c5088fM2549k;
        try {
            if (this.f2759a.f2757a.equals(C5085c.m2539b(NetworkStatusHelper.getStatus()))) {
                ALog.m2529e("awcn.Inet64Util", "startIpStackDetect double check", null, new Object[0]);
                int iM2548j = C5085c.m2548j();
                RunnableC5086d runnableC5086d = this.f2759a;
                if (runnableC5086d.f2758b.ipStackType != iM2548j) {
                    C5085c.f2756e.put(runnableC5086d.f2757a, Integer.valueOf(iM2548j));
                    NetTypeStat netTypeStat = this.f2759a.f2758b;
                    netTypeStat.lastIpStackType = netTypeStat.ipStackType;
                    netTypeStat.ipStackType = iM2548j;
                }
                if ((iM2548j == 2 || iM2548j == 3) && (c5088fM2549k = C5085c.m2549k()) != null) {
                    C5085c.f2755d.put(this.f2759a.f2757a, c5088fM2549k);
                    this.f2759a.f2758b.nat64Prefix = c5088fM2549k.toString();
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    AppMonitor.getInstance().commitStat(this.f2759a.f2758b);
                }
            }
        } catch (Exception unused) {
        }
    }
}

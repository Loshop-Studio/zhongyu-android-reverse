package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.util.e */
/* loaded from: classes.dex */
class RunnableC0964e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0963d f5481a;

    RunnableC0964e(RunnableC0963d runnableC0963d) {
        this.f5481a = runnableC0963d;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0965f c0965fM4658k;
        try {
            if (this.f5481a.f5479a.equals(C0962c.m4648b(NetworkStatusHelper.getStatus()))) {
                ALog.m4638e("awcn.Inet64Util", "startIpStackDetect double check", null, new Object[0]);
                int iM4657j = C0962c.m4657j();
                RunnableC0963d runnableC0963d = this.f5481a;
                if (runnableC0963d.f5480b.ipStackType != iM4657j) {
                    C0962c.f5478e.put(runnableC0963d.f5479a, Integer.valueOf(iM4657j));
                    NetTypeStat netTypeStat = this.f5481a.f5480b;
                    netTypeStat.lastIpStackType = netTypeStat.ipStackType;
                    netTypeStat.ipStackType = iM4657j;
                }
                if ((iM4657j == 2 || iM4657j == 3) && (c0965fM4658k = C0962c.m4658k()) != null) {
                    C0962c.f5477d.put(this.f5481a.f5479a, c0965fM4658k);
                    this.f5481a.f5480b.nat64Prefix = c0965fM4658k.toString();
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    AppMonitor.getInstance().commitStat(this.f5481a.f5480b);
                }
            }
        } catch (Exception unused) {
        }
    }
}

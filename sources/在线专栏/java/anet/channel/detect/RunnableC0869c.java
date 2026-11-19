package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.c */
/* loaded from: classes.dex */
class RunnableC0869c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RequestStatistic f5096a;

    /* renamed from: b */
    final /* synthetic */ ExceptionDetector f5097b;

    RunnableC0869c(ExceptionDetector exceptionDetector, RequestStatistic requestStatistic) {
        this.f5097b = exceptionDetector;
        this.f5096a = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            RequestStatistic requestStatistic = this.f5096a;
            if (requestStatistic == null) {
                return;
            }
            if (!TextUtils.isEmpty(requestStatistic.f5309ip) && this.f5096a.ret == 0) {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(this.f5096a.host)) {
                    this.f5097b.f5081b = this.f5096a.f5309ip;
                } else if ("msgacs.m.taobao.com".equalsIgnoreCase(this.f5096a.host)) {
                    this.f5097b.f5082c = this.f5096a.f5309ip;
                } else if ("gw.alicdn.com".equalsIgnoreCase(this.f5096a.host)) {
                    this.f5097b.f5083d = this.f5096a.f5309ip;
                }
            }
            if (!TextUtils.isEmpty(this.f5096a.url)) {
                this.f5097b.f5084e.add(Pair.create(this.f5096a.url, Integer.valueOf(this.f5096a.statusCode)));
            }
            if (this.f5097b.m4407c()) {
                this.f5097b.m4406b();
            }
        } catch (Throwable th) {
            ALog.m4637e("anet.ExceptionDetector", "network detect fail.", null, th, new Object[0]);
        }
    }
}

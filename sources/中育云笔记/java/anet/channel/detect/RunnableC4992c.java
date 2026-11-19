package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.c */
/* loaded from: classes3.dex */
class RunnableC4992c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RequestStatistic f2374a;

    /* renamed from: b */
    final /* synthetic */ ExceptionDetector f2375b;

    public RunnableC4992c(ExceptionDetector exceptionDetector, RequestStatistic requestStatistic) {
        this.f2375b = exceptionDetector;
        this.f2374a = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            RequestStatistic requestStatistic = this.f2374a;
            if (requestStatistic == null) {
                return;
            }
            if (!TextUtils.isEmpty(requestStatistic.f2587ip) && this.f2374a.ret == 0) {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(this.f2374a.host)) {
                    this.f2375b.f2359b = this.f2374a.f2587ip;
                } else if ("msgacs.m.taobao.com".equalsIgnoreCase(this.f2374a.host)) {
                    this.f2375b.f2360c = this.f2374a.f2587ip;
                } else if ("gw.alicdn.com".equalsIgnoreCase(this.f2374a.host)) {
                    this.f2375b.f2361d = this.f2374a.f2587ip;
                }
            }
            if (!TextUtils.isEmpty(this.f2374a.url)) {
                this.f2375b.f2362e.add(Pair.create(this.f2374a.url, Integer.valueOf(this.f2374a.statusCode)));
            }
            if (this.f2375b.m2298c()) {
                this.f2375b.m2297b();
            }
        } catch (Throwable th) {
            ALog.m2528e("anet.ExceptionDetector", "network detect fail.", null, th, new Object[0]);
        }
    }
}

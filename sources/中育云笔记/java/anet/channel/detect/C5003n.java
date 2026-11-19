package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anet.channel.detect.n */
/* loaded from: classes3.dex */
public class C5003n {

    /* renamed from: a */
    private static C4993d f2394a = new C4993d();

    /* renamed from: b */
    private static ExceptionDetector f2395b = new ExceptionDetector();

    /* renamed from: c */
    private static C5000k f2396c = new C5000k();

    /* renamed from: d */
    private static AtomicBoolean f2397d = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m2311a() {
        try {
            if (f2397d.compareAndSet(false, true)) {
                ALog.m2530i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
                f2394a.m2306b();
                f2395b.m2295a();
                f2396c.m2310a();
            }
        } catch (Exception e10) {
            ALog.m2528e("awcn.NetworkDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m2312a(RequestStatistic requestStatistic) {
        if (f2397d.get()) {
            f2395b.m2296a(requestStatistic);
        }
    }
}

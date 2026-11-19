package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anet.channel.detect.n */
/* loaded from: classes.dex */
public class C0880n {

    /* renamed from: a */
    private static C0870d f5116a = new C0870d();

    /* renamed from: b */
    private static ExceptionDetector f5117b = new ExceptionDetector();

    /* renamed from: c */
    private static C0877k f5118c = new C0877k();

    /* renamed from: d */
    private static AtomicBoolean f5119d = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m4420a() {
        try {
            if (f5119d.compareAndSet(false, true)) {
                ALog.m4639i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
                f5116a.m4415b();
                f5117b.m4404a();
                f5118c.m4419a();
            }
        } catch (Exception e4) {
            ALog.m4637e("awcn.NetworkDetector", "[registerListener]error", null, e4, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4421a(RequestStatistic requestStatistic) {
        if (f5119d.get()) {
            f5117b.m4405a(requestStatistic);
        }
    }
}

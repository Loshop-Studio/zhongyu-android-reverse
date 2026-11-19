package p145q5;

import io.reactivex.internal.operators.observable.RunnableC5713i;
import java.util.concurrent.TimeUnit;
import p159s5.InterfaceC6559b;

/* renamed from: q5.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6439j {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    /* renamed from: a */
    public abstract AbstractC6438i mo5086a();

    /* renamed from: b */
    public InterfaceC6559b mo5087b(RunnableC5713i runnableC5713i) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AbstractC6438i abstractC6438iMo5086a = mo5086a();
        RunnableC6437h runnableC6437h = new RunnableC6437h(runnableC5713i, abstractC6438iMo5086a);
        abstractC6438iMo5086a.mo5084a(runnableC6437h, timeUnit);
        return runnableC6437h;
    }
}

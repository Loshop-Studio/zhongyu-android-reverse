package p168e.p169q.p172e;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.C1045b;
import p168e.p169q.p171d.C1048b;
import p168e.p169q.p171d.C1049c;

/* renamed from: e.q.e.a */
/* loaded from: classes.dex */
public final class C1050a {

    /* renamed from: a */
    public final long f5601a;

    /* renamed from: b */
    public final C1048b f5602b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue<Object> f5603c;

    /* renamed from: d */
    public final int f5604d;

    public C1050a(C1049c c1049c, int i, long j, TimeUnit timeUnit) {
        int i2;
        C1011d.m2809e(c1049c, "taskRunner");
        C1011d.m2809e(timeUnit, "timeUnit");
        this.f5604d = i;
        this.f5601a = timeUnit.toNanos(j);
        synchronized (c1049c) {
            i2 = c1049c.f5592a;
            c1049c.f5592a = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        this.f5602b = new C1048b(c1049c, sb.toString());
        C1011d.m2809e(C1045b.f5578c + " ConnectionPool", "name");
        this.f5603c = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }
}

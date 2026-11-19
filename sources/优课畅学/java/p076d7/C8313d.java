package p076d7;

import io.reactivex.internal.schedulers.C8972a;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import p244s6.AbstractC10049f;

/* renamed from: d7.d */
/* loaded from: classes5.dex */
public final class C8313d extends AbstractC10049f {

    /* renamed from: c */
    public static final RxThreadFactory f15752c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    public final ThreadFactory f15753b;

    public C8313d() {
        this(f15752c);
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new C8972a(this.f15753b);
    }

    public C8313d(ThreadFactory threadFactory) {
        this.f15753b = threadFactory;
    }
}

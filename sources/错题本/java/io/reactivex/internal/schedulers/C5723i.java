package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p145q5.AbstractC6438i;
import p145q5.AbstractC6439j;

/* renamed from: io.reactivex.internal.schedulers.i */
/* loaded from: classes.dex */
public final class C5723i extends AbstractC6439j {

    /* renamed from: b */
    public static final RxThreadFactory f9048b = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a */
    public final ThreadFactory f9049a = f9048b;

    @Override // p145q5.AbstractC6439j
    /* renamed from: a */
    public final AbstractC6438i mo5086a() {
        return new C5724j(this.f9049a);
    }
}

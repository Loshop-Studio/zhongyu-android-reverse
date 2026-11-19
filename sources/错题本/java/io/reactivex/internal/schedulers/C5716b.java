package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;

/* renamed from: io.reactivex.internal.schedulers.b */
/* loaded from: classes.dex */
public final class C5716b {

    /* renamed from: a */
    public final int f9021a;

    /* renamed from: b */
    public final C5717c[] f9022b;

    /* renamed from: c */
    public long f9023c;

    public C5716b(int i, ThreadFactory threadFactory) {
        this.f9021a = i;
        this.f9022b = new C5717c[i];
        for (int i8 = 0; i8 < i; i8++) {
            this.f9022b[i8] = new C5717c(threadFactory);
        }
    }
}

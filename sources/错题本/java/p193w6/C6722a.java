package p193w6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC5830k;
import p184v6.AbstractC6669a;

/* renamed from: w6.a */
/* loaded from: classes2.dex */
public final class C6722a extends AbstractC6669a {
    @Override // p184v6.AbstractC6669a
    /* renamed from: a */
    public final Random mo6329a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC5830k.m5329f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // p184v6.AbstractC6671c
    public final double nextDouble(double d9) {
        return ThreadLocalRandom.current().nextDouble(d9);
    }

    @Override // p184v6.AbstractC6671c
    public final int nextInt(int i, int i8) {
        return ThreadLocalRandom.current().nextInt(i, i8);
    }

    @Override // p184v6.AbstractC6671c
    public final long nextLong(long j7) {
        return ThreadLocalRandom.current().nextLong(j7);
    }

    @Override // p184v6.AbstractC6671c
    public final long nextLong(long j7, long j8) {
        return ThreadLocalRandom.current().nextLong(j7, j8);
    }
}

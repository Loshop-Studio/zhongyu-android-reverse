package p184v6;

import java.util.Random;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: v6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6669a extends AbstractC6671c {
    /* renamed from: a */
    public abstract Random mo6329a();

    @Override // p184v6.AbstractC6671c
    public final int nextBits(int i) {
        return ((-i) >> 31) & (mo6329a().nextInt() >>> (32 - i));
    }

    @Override // p184v6.AbstractC6671c
    public final boolean nextBoolean() {
        return mo6329a().nextBoolean();
    }

    @Override // p184v6.AbstractC6671c
    public final byte[] nextBytes(byte[] array) {
        AbstractC5830k.m5330g(array, "array");
        mo6329a().nextBytes(array);
        return array;
    }

    @Override // p184v6.AbstractC6671c
    public final double nextDouble() {
        return mo6329a().nextDouble();
    }

    @Override // p184v6.AbstractC6671c
    public final float nextFloat() {
        return mo6329a().nextFloat();
    }

    @Override // p184v6.AbstractC6671c
    public final int nextInt() {
        return mo6329a().nextInt();
    }

    @Override // p184v6.AbstractC6671c
    public final long nextLong() {
        return mo6329a().nextLong();
    }

    @Override // p184v6.AbstractC6671c
    public final int nextInt(int i) {
        return mo6329a().nextInt(i);
    }
}

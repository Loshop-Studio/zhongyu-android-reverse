package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5783d0;

/* renamed from: kotlin.jvm.internal.b */
/* loaded from: classes2.dex */
public final class C5821b extends AbstractC5783d0 {

    /* renamed from: a */
    public final long[] f9215a;

    /* renamed from: b */
    public int f9216b;

    public C5821b(long[] array) {
        AbstractC5830k.m5330g(array, "array");
        this.f9215a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9216b < this.f9215a.length;
    }

    @Override // kotlin.collections.AbstractC5783d0
    public final long nextLong() {
        try {
            long[] jArr = this.f9215a;
            int i = this.f9216b;
            this.f9216b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f9216b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}

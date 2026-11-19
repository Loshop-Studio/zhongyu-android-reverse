package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p325rc.AbstractC10949h0;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes6.dex */
public final class C9955a extends AbstractC10949h0 {

    /* renamed from: c */
    public final double[] f23403c;

    /* renamed from: d */
    public int f23404d;

    public C9955a(double[] array) {
        AbstractC9979u.m20294g(array, "array");
        this.f23403c = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23404d < this.f23403c.length;
    }

    @Override // p325rc.AbstractC10949h0
    public double nextDouble() {
        try {
            double[] dArr = this.f23403c;
            int i10 = this.f23404d;
            this.f23404d = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23404d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

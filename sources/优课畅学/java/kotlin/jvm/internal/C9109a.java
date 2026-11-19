package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p134i7.AbstractC8780g0;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes5.dex */
public final class C9109a extends AbstractC8780g0 {

    /* renamed from: a */
    public final double[] f17474a;

    /* renamed from: b */
    public int f17475b;

    public C9109a(double[] array) {
        AbstractC9133u.m16133g(array, "array");
        this.f17474a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17475b < this.f17474a.length;
    }

    @Override // p134i7.AbstractC8780g0
    public double nextDouble() {
        try {
            double[] dArr = this.f17474a;
            int i10 = this.f17475b;
            this.f17475b = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17475b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

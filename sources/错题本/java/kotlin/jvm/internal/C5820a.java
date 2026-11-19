package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5781c0;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes2.dex */
public final class C5820a extends AbstractC5781c0 {

    /* renamed from: a */
    public final int[] f9213a;

    /* renamed from: b */
    public int f9214b;

    public C5820a(int[] array) {
        AbstractC5830k.m5330g(array, "array");
        this.f9213a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9214b < this.f9213a.length;
    }

    @Override // kotlin.collections.AbstractC5781c0
    public final int nextInt() {
        try {
            int[] iArr = this.f9213a;
            int i = this.f9214b;
            this.f9214b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f9214b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}

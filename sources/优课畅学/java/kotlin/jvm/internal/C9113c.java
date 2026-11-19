package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p134i7.AbstractC8792m0;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes5.dex */
public final class C9113c extends AbstractC8792m0 {

    /* renamed from: a */
    public final int[] f17480a;

    /* renamed from: b */
    public int f17481b;

    public C9113c(int[] array) {
        AbstractC9133u.m16133g(array, "array");
        this.f17480a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17481b < this.f17480a.length;
    }

    @Override // p134i7.AbstractC8792m0
    public int nextInt() {
        try {
            int[] iArr = this.f17480a;
            int i10 = this.f17481b;
            this.f17481b = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17481b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

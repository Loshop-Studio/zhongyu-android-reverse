package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p325rc.AbstractC10961n0;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes6.dex */
public final class C9959c extends AbstractC10961n0 {

    /* renamed from: c */
    public final int[] f23409c;

    /* renamed from: d */
    public int f23410d;

    public C9959c(int[] array) {
        AbstractC9979u.m20294g(array, "array");
        this.f23409c = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23410d < this.f23409c.length;
    }

    @Override // p325rc.AbstractC10961n0
    public int nextInt() {
        try {
            int[] iArr = this.f23409c;
            int i10 = this.f23410d;
            this.f23410d = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23410d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

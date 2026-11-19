package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p134i7.AbstractC8784i0;

/* renamed from: kotlin.jvm.internal.b */
/* loaded from: classes5.dex */
public final class C9111b extends AbstractC8784i0 {

    /* renamed from: a */
    public final float[] f17477a;

    /* renamed from: b */
    public int f17478b;

    public C9111b(float[] array) {
        AbstractC9133u.m16133g(array, "array");
        this.f17477a = array;
    }

    @Override // p134i7.AbstractC8784i0
    /* renamed from: a */
    public float mo14583a() {
        try {
            float[] fArr = this.f17477a;
            int i10 = this.f17478b;
            this.f17478b = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17478b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17478b < this.f17477a.length;
    }
}

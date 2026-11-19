package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.collections.i0 */
/* loaded from: classes2.dex */
public final class C5793i0 extends AbstractC5786f implements RandomAccess {

    /* renamed from: a */
    public final Object[] f9187a;

    /* renamed from: b */
    public final int f9188b;

    /* renamed from: c */
    public int f9189c;

    /* renamed from: d */
    public int f9190d;

    public C5793i0(Object[] objArr, int i) {
        this.f9187a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f9188b = objArr.length;
            this.f9190d = i;
        } else {
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM94s.append(objArr.length);
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
    }

    /* renamed from: a */
    public final void m5160a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > size()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM94s.append(size());
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        if (i > 0) {
            int i8 = this.f9189c;
            int i9 = this.f9188b;
            int i10 = (i8 + i) % i9;
            Object[] objArr = this.f9187a;
            if (i8 > i10) {
                Arrays.fill(objArr, i8, i9, (Object) null);
                Arrays.fill(objArr, 0, i10, (Object) null);
            } else {
                Arrays.fill(objArr, i8, i10, (Object) null);
            }
            this.f9189c = i10;
            this.f9190d = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final Object get(int i) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5143b(i, size);
        return this.f9187a[(this.f9189c + i) % this.f9188b];
    }

    @Override // kotlin.collections.AbstractC5786f, kotlin.collections.AbstractC5775a
    public final int getSize() {
        return this.f9190d;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C5791h0(this);
    }

    @Override // kotlin.collections.AbstractC5775a, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        AbstractC5830k.m5330g(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC5830k.m5329f(array, "copyOf(...)");
        }
        int size = size();
        int i = this.f9189c;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            objArr = this.f9187a;
            if (i9 >= size || i >= this.f9188b) {
                break;
            }
            array[i9] = objArr[i];
            i9++;
            i++;
        }
        while (i9 < size) {
            array[i9] = objArr[i8];
            i9++;
            i8++;
        }
        if (size < array.length) {
            array[size] = null;
        }
        return array;
    }

    @Override // kotlin.collections.AbstractC5775a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

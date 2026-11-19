package p160d.p161e;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p160d.p162f.p164b.C1008a;
import p160d.p162f.p164b.C1009b;
import p160d.p162f.p164b.C1011d;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: d.e.c */
/* loaded from: classes.dex */
public final class C0997c<T> implements Collection<T> {

    /* renamed from: b */
    public final T[] f5475b;

    /* renamed from: c */
    public final boolean f5476c;

    public C0997c(T[] tArr, boolean z) {
        C1011d.m2809e(tArr, "values");
        this.f5475b = tArr;
        this.f5476c = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        int i;
        T[] tArr = this.f5475b;
        C1011d.m2809e(tArr, "$this$contains");
        C1011d.m2809e(tArr, "$this$indexOf");
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (C1011d.m2805a(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C1011d.m2809e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f5475b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        T[] tArr = this.f5475b;
        C1011d.m2809e(tArr, "array");
        return new C1008a(tArr);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5475b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f5475b;
        boolean z = this.f5476c;
        C1011d.m2809e(tArr, "$this$copyToArrayOfAny");
        if (z && C1011d.m2805a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C1011d.m2808d(objArrCopyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C1009b.m2804b(this, tArr);
    }
}

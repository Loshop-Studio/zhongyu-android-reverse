package p045d6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6560a;

/* renamed from: d6.m */
/* loaded from: classes.dex */
public final class C5437m implements Collection, InterfaceC6560a {

    /* renamed from: a */
    public final int[] f8399a;

    public /* synthetic */ C5437m(int[] iArr) {
        this.f8399a = iArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C5436l)) {
            return false;
        }
        int i = ((C5436l) obj).f8398a;
        int[] iArr = this.f8399a;
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (i == iArr[i8]) {
                break;
            }
            i8++;
        }
        return i8 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C5436l) {
                    int i = ((C5436l) obj).f8398a;
                    int[] iArr = this.f8399a;
                    int length = iArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            i8 = -1;
                            break;
                        }
                        if (i == iArr[i8]) {
                            break;
                        }
                        i8++;
                    }
                    if (i8 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C5437m) {
            return AbstractC5830k.m5325b(this.f8399a, ((C5437m) obj).f8399a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f8399a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8399a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5434j(this.f8399a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8399a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC5829j.m5322a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f8399a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC5830k.m5330g(array, "array");
        return AbstractC5829j.m5323b(this, array);
    }
}

package p045d6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6560a;

/* renamed from: d6.k */
/* loaded from: classes.dex */
public final class C5435k implements Collection, InterfaceC6560a {

    /* renamed from: a */
    public final byte[] f8397a;

    public /* synthetic */ C5435k(byte[] bArr) {
        this.f8397a = bArr;
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
        if (!(obj instanceof C5433i)) {
            return false;
        }
        byte b6 = ((C5433i) obj).f8393a;
        byte[] bArr = this.f8397a;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (b6 == bArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C5433i) {
                    byte b6 = ((C5433i) obj).f8393a;
                    byte[] bArr = this.f8397a;
                    int length = bArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (b6 == bArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C5435k) {
            return AbstractC5830k.m5325b(this.f8397a, ((C5435k) obj).f8397a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f8397a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8397a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5434j(this.f8397a, 0);
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
        return this.f8397a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC5829j.m5322a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f8397a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC5830k.m5330g(array, "array");
        return AbstractC5829j.m5323b(this, array);
    }
}

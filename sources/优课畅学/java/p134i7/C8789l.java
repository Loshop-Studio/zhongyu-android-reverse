package p134i7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: i7.l */
/* loaded from: classes5.dex */
public final class C8789l implements Collection, InterfaceC10668a {

    /* renamed from: a */
    public final Object[] f16465a;

    /* renamed from: b */
    public final boolean f16466b;

    public C8789l(Object[] values, boolean z10) {
        AbstractC9133u.m16133g(values, "values");
        this.f16465a = values;
        this.f16466b = z10;
    }

    /* renamed from: a */
    public int m14588a() {
        return this.f16465a.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC8801r.m14721n0(this.f16465a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f16465a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC9117e.m16110a(this.f16465a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m14588a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        return AbstractC9125m.m16123b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC8807u.m14752b(this.f16465a, this.f16466b);
    }
}

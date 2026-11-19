package p325rc;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.l */
/* loaded from: classes6.dex */
public final class C10956l implements Collection, InterfaceC9624a {

    /* renamed from: c */
    public final Object[] f26458c;

    /* renamed from: d */
    public final boolean f26459d;

    public C10956l(Object[] values, boolean z10) {
        AbstractC9979u.m20294g(values, "values");
        this.f26458c = values;
        this.f26459d = z10;
    }

    /* renamed from: a */
    public int m23964a() {
        return this.f26458c.length;
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
        return AbstractC10968r.m24090m0(this.f26458c, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        return this.f26458c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC9963e.m20268a(this.f26458c);
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
        return m23964a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC10976v.m24123b(this.f26458c, this.f26459d);
    }
}

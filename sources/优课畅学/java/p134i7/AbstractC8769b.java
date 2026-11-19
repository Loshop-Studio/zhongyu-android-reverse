package p134i7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: i7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8769b implements Collection, InterfaceC10668a {
    /* renamed from: b */
    public static final CharSequence m14498b(AbstractC8769b abstractC8769b, Object obj) {
        return obj == abstractC8769b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC9133u.m16128b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection<?> collection = elements;
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

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    public String toString() {
        return AbstractC8778f0.m14576v0(this, ", ", "[", "]", 0, null, new InterfaceC10570l() { // from class: i7.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8769b.m14498b(this.f16448a, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9133u.m16133g(array, "array");
        return (T[]) AbstractC9125m.m16123b(this, array);
    }
}

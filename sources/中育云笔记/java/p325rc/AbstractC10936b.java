package p325rc;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: rc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10936b implements Collection, InterfaceC9624a {
    /* renamed from: c */
    public static final CharSequence m23856c(AbstractC10936b abstractC10936b, Object obj) {
        return obj == abstractC10936b ? "(this Collection)" : String.valueOf(obj);
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
            if (AbstractC9979u.m20289b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        return AbstractC9971m.m20283a(this);
    }

    public String toString() {
        return AbstractC10947g0.m23954w0(this, ", ", "[", "]", 0, null, new InterfaceC9540l() { // from class: rc.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10936b.m23856c(this.f26442c, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9979u.m20294g(array, "array");
        return (T[]) AbstractC9971m.m20284b(this, array);
    }
}

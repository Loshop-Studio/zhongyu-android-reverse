package kotlin.collections;

import id.InterfaceC9624a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.C10951i0;

/* loaded from: classes6.dex */
public final class EmptySet implements Set, Serializable, InterfaceC9624a {

    /* renamed from: c */
    public static final EmptySet f23282c = new EmptySet();

    private EmptySet() {
    }

    private final Object readResolve() {
        return f23282c;
    }

    /* renamed from: a */
    public boolean m20084a(Void element) {
        AbstractC9979u.m20294g(element, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int m20085c() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m20084a((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C10951i0.f26455c;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m20085c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }
}

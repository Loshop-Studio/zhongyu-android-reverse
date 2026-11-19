package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8785j;
import p311y7.InterfaceC10673f;

/* renamed from: kotlin.collections.builders.b */
/* loaded from: classes5.dex */
public final class C9094b extends AbstractC8785j implements Set, InterfaceC10673f {

    /* renamed from: a */
    public final MapBuilder f17432a;

    public C9094b(MapBuilder backing) {
        AbstractC9133u.m16133g(backing, "backing");
        this.f17432a = backing;
    }

    @Override // p134i7.AbstractC8785j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17432a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f17432a.containsKey(obj);
    }

    @Override // p134i7.AbstractC8785j
    public int getSize() {
        return this.f17432a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17432a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17432a.m16013E();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f17432a.m16021N(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17432a.m16028m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17432a.m16028m();
        return super.retainAll(elements);
    }
}

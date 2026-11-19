package p053e6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5792i;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: e6.j */
/* loaded from: classes2.dex */
public final class C5466j extends AbstractC5792i {

    /* renamed from: a */
    public final MapBuilder f8437a;

    public C5466j(MapBuilder mapBuilder) {
        this.f8437a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8437a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8437a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC5792i
    public final int getSize() {
        return this.f8437a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f8437a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8437a.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8437a.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8437a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8437a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}

package p053e6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5797l;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: e6.i */
/* loaded from: classes2.dex */
public final class C5465i extends AbstractC5797l {

    /* renamed from: a */
    public final MapBuilder f8436a;

    public C5465i(MapBuilder mapBuilder) {
        this.f8436a = mapBuilder;
    }

    @Override // kotlin.collections.AbstractC5797l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8436a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8436a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC5797l
    public final int getSize() {
        return this.f8436a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8436a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f8436a.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f8436a.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8436a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8436a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}

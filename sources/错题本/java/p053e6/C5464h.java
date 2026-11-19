package p053e6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC5797l;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: e6.h */
/* loaded from: classes2.dex */
public final class C5464h extends AbstractC5797l {

    /* renamed from: a */
    public final MapBuilder f8435a;

    public C5464h(MapBuilder mapBuilder) {
        this.f8435a = mapBuilder;
    }

    @Override // kotlin.collections.AbstractC5797l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        AbstractC5830k.m5330g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8435a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        AbstractC5830k.m5330g(element, "element");
        return this.f8435a.containsEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return this.f8435a.containsAllEntries$kotlin_stdlib(elements);
    }

    @Override // kotlin.collections.AbstractC5797l
    public final int getSize() {
        return this.f8435a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8435a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f8435a.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        AbstractC5830k.m5330g(element, "element");
        return this.f8435a.removeEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8435a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        this.f8435a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}

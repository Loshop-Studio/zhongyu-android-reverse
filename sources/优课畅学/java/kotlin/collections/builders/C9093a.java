package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p145j7.AbstractC9024a;

/* renamed from: kotlin.collections.builders.a */
/* loaded from: classes5.dex */
public final class C9093a extends AbstractC9024a {

    /* renamed from: a */
    public final MapBuilder f17431a;

    public C9093a(MapBuilder backing) {
        AbstractC9133u.m16133g(backing, "backing");
        this.f17431a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17431a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return this.f17431a.m16030o(elements);
    }

    @Override // p145j7.AbstractC9024a
    public boolean containsEntry(Map.Entry element) {
        AbstractC9133u.m16133g(element, "element");
        return this.f17431a.m16031p(element);
    }

    @Override // p134i7.AbstractC8785j
    public int getSize() {
        return this.f17431a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17431a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17431a.m16033t();
    }

    @Override // p145j7.AbstractC9024a
    public boolean remove(Map.Entry element) {
        AbstractC9133u.m16133g(element, "element");
        return this.f17431a.m16018K(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17431a.m16028m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17431a.m16028m();
        return super.retainAll(elements);
    }

    @Override // p134i7.AbstractC8785j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry element) {
        AbstractC9133u.m16133g(element, "element");
        throw new UnsupportedOperationException();
    }
}

package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8779g;
import p311y7.InterfaceC10669b;

/* renamed from: kotlin.collections.builders.c */
/* loaded from: classes5.dex */
public final class C9095c extends AbstractC8779g implements Collection, InterfaceC10669b {

    /* renamed from: a */
    public final MapBuilder f17433a;

    public C9095c(MapBuilder backing) {
        AbstractC9133u.m16133g(backing, "backing");
        this.f17433a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f17433a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f17433a.containsValue(obj);
    }

    @Override // p134i7.AbstractC8779g
    public int getSize() {
        return this.f17433a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f17433a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f17433a.m16024Q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f17433a.m16022O(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17433a.m16028m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17433a.m16028m();
        return super.retainAll(elements);
    }
}

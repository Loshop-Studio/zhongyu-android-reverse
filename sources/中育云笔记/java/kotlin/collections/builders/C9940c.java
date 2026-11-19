package kotlin.collections.builders;

import id.InterfaceC9625b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10946g;

/* renamed from: kotlin.collections.builders.c */
/* loaded from: classes6.dex */
public final class C9940c extends AbstractC10946g implements Collection, InterfaceC9625b {

    /* renamed from: c */
    public final MapBuilder f23346c;

    public C9940c(MapBuilder backing) {
        AbstractC9979u.m20294g(backing, "backing");
        this.f23346c = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f23346c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f23346c.containsValue(obj);
    }

    @Override // p325rc.AbstractC10946g
    public int getSize() {
        return this.f23346c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f23346c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f23346c.m20176Z();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f23346c.m20174X(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23346c.m20180r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23346c.m20180r();
        return super.retainAll(elements);
    }
}

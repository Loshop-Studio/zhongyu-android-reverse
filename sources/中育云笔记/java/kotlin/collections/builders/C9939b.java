package kotlin.collections.builders;

import id.InterfaceC9629f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10952j;

/* renamed from: kotlin.collections.builders.b */
/* loaded from: classes6.dex */
public final class C9939b extends AbstractC10952j implements Set, InterfaceC9629f {

    /* renamed from: c */
    public final MapBuilder f23345c;

    public C9939b(MapBuilder backing) {
        AbstractC9979u.m20294g(backing, "backing");
        this.f23345c = backing;
    }

    @Override // p325rc.AbstractC10952j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23345c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f23345c.containsKey(obj);
    }

    @Override // p325rc.AbstractC10952j
    public int getSize() {
        return this.f23345c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f23345c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f23345c.m20165N();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f23345c.m20173W(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23345c.m20180r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23345c.m20180r();
        return super.retainAll(elements);
    }
}

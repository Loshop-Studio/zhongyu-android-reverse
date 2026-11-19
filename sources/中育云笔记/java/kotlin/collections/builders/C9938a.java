package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import sc.AbstractC11087a;

/* renamed from: kotlin.collections.builders.a */
/* loaded from: classes6.dex */
public final class C9938a extends AbstractC11087a {

    /* renamed from: c */
    public final MapBuilder f23344c;

    public C9938a(MapBuilder backing) {
        AbstractC9979u.m20294g(backing, "backing");
        this.f23344c = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23344c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return this.f23344c.m20182u(elements);
    }

    @Override // sc.AbstractC11087a
    public boolean containsEntry(Map.Entry element) {
        AbstractC9979u.m20294g(element, "element");
        return this.f23344c.m20183v(element);
    }

    @Override // p325rc.AbstractC10952j
    public int getSize() {
        return this.f23344c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f23344c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f23344c.m20154C();
    }

    @Override // sc.AbstractC11087a
    public boolean remove(Map.Entry element) {
        AbstractC9979u.m20294g(element, "element");
        return this.f23344c.m20170T(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23344c.m20180r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23344c.m20180r();
        return super.retainAll(elements);
    }

    @Override // p325rc.AbstractC10952j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry element) {
        AbstractC9979u.m20294g(element, "element");
        throw new UnsupportedOperationException();
    }
}

package p125n7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p160s6.InterfaceC6560a;

@Serializable(with = C6231f.class)
/* renamed from: n7.d */
/* loaded from: classes4.dex */
public final class C6229d extends AbstractC6235j implements List<AbstractC6235j>, InterfaceC6560a {

    @NotNull
    public static final C6228c Companion = new C6228c();

    /* renamed from: a */
    public final List f9969a;

    public C6229d(List content) {
        AbstractC5830k.m5330g(content, "content");
        this.f9969a = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC6235j abstractC6235j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC6235j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC6235j)) {
            return false;
        }
        AbstractC6235j element = (AbstractC6235j) obj;
        AbstractC5830k.m5330g(element, "element");
        return this.f9969a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return this.f9969a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC5830k.m5325b(this.f9969a, obj);
    }

    @Override // java.util.List
    public final AbstractC6235j get(int i) {
        return (AbstractC6235j) this.f9969a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f9969a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC6235j)) {
            return -1;
        }
        AbstractC6235j element = (AbstractC6235j) obj;
        AbstractC5830k.m5330g(element, "element");
        return this.f9969a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f9969a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f9969a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC6235j)) {
            return -1;
        }
        AbstractC6235j element = (AbstractC6235j) obj;
        AbstractC5830k.m5330g(element, "element");
        return this.f9969a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC6235j> listIterator() {
        return this.f9969a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC6235j remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC6235j> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC6235j set(int i, AbstractC6235j abstractC6235j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f9969a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC6235j> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC6235j> subList(int i, int i8) {
        return this.f9969a.subList(i, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5829j.m5322a(this);
    }

    public final String toString() {
        return AbstractC5805t.m5234n0(this.f9969a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<AbstractC6235j> listIterator(int i) {
        return this.f9969a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC5830k.m5330g(array, "array");
        return AbstractC5829j.m5323b(this, array);
    }
}

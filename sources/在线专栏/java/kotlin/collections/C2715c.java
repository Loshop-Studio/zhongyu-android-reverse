package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C2758b;
import kotlin.jvm.internal.C2763f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.c */
/* loaded from: classes.dex */
final class C2715c<T> implements Collection<T>, InterfaceC3498a {

    /* renamed from: a */
    @NotNull
    private final T[] f10703a;

    /* renamed from: b */
    private final boolean f10704b;

    public C2715c(@NotNull T[] values, boolean z3) {
        C2769l.m9241e(values, "values");
        this.f10703a = values;
        this.f10704b = z3;
    }

    /* renamed from: a */
    public int m9053a() {
        return this.f10703a.length;
    }

    @Override // java.util.Collection
    public boolean add(T t3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C2725h.m9094n(this.f10703a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        C2769l.m9241e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f10703a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return C2758b.m9220a(this.f10703a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m9053a();
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return C2729k.m9134a(this.f10703a, this.f10704b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C2769l.m9241e(array, "array");
        return (T[]) C2763f.m9233b(this, array);
    }
}

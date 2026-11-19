package androidx.paging.internal;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class CopyOnWriteArrayList<T> implements Iterable<T>, InterfaceC9624a {
    private final java.util.concurrent.CopyOnWriteArrayList<T> delegate = new java.util.concurrent.CopyOnWriteArrayList<>();

    public final boolean add(T t10) {
        return this.delegate.add(t10);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterator<T> it = this.delegate.iterator();
        AbstractC9979u.m20293f(it, "iterator(...)");
        return it;
    }

    public final boolean remove(T t10) {
        return this.delegate.remove(t10);
    }
}

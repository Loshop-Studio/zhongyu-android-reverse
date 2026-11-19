package androidx.compose.runtime.external.kotlinx.collections.immutable;

import id.InterfaceC9625b;
import java.util.Collection;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    public interface Builder<E> extends Collection<E>, InterfaceC9625b {
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    PersistentCollection<E> add(E e10);

    @Override // java.util.Collection
    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.Collection
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    PersistentCollection<E> remove(E e10);

    PersistentCollection<E> removeAll(InterfaceC9540l interfaceC9540l);

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}

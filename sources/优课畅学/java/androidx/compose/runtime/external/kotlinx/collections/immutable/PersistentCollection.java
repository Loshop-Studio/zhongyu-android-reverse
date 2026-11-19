package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10669b;

/* loaded from: classes2.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    public interface Builder<E> extends Collection<E>, InterfaceC10669b {
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

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    PersistentCollection<E> removeAll(InterfaceC10570l interfaceC10570l);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}

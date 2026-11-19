package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import id.InterfaceC9629f;
import java.util.Collection;
import java.util.Set;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, InterfaceC9629f {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentSet<E> build();
    }

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> add(E e10);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> addAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> remove(E e10);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(InterfaceC9540l interfaceC9540l);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> retainAll(Collection<? extends E> collection);
}

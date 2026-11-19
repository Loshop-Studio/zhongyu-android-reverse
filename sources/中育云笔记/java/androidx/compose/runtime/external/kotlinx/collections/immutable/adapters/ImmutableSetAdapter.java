package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E> {
    public static final int $stable = 0;

    public ImmutableSetAdapter(Set<? extends E> set) {
        super(set);
    }
}

package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LinkedValue<V> {
    public static final int $stable = 8;
    private final Object next;
    private final Object previous;
    private final V value;

    public LinkedValue(V v10, Object obj, Object obj2) {
        this.value = v10;
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    public final LinkedValue<V> withNext(Object obj) {
        return new LinkedValue<>(this.value, this.previous, obj);
    }

    public final LinkedValue<V> withPrevious(Object obj) {
        return new LinkedValue<>(this.value, obj, this.next);
    }

    public final LinkedValue<V> withValue(V v10) {
        return new LinkedValue<>(v10, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkedValue(V v10) {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this(v10, endOfChain, endOfChain);
    }

    public LinkedValue(V v10, Object obj) {
        this(v10, obj, EndOfChain.INSTANCE);
    }
}

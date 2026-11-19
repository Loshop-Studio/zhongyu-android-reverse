package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final InterfaceC9540l compute;

    public ComputedValueHolder(InterfaceC9540l interfaceC9540l) {
        this.compute = interfaceC9540l;
    }

    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = computedValueHolder.compute;
        }
        return computedValueHolder.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.compute;
    }

    public final ComputedValueHolder<T> copy(InterfaceC9540l interfaceC9540l) {
        return new ComputedValueHolder<>(interfaceC9540l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && AbstractC9979u.m20289b(this.compute, ((ComputedValueHolder) obj).compute);
    }

    public final InterfaceC9540l getCompute() {
        return this.compute;
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return (T) this.compute.invoke(persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, null, this.compute, false);
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }
}

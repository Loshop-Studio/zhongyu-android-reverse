package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final InterfaceC10570l compute;

    public ComputedValueHolder(InterfaceC10570l interfaceC10570l) {
        this.compute = interfaceC10570l;
    }

    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = computedValueHolder.compute;
        }
        return computedValueHolder.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.compute;
    }

    public final ComputedValueHolder<T> copy(InterfaceC10570l interfaceC10570l) {
        return new ComputedValueHolder<>(interfaceC10570l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && AbstractC9133u.m16128b(this.compute, ((ComputedValueHolder) obj).compute);
    }

    public final InterfaceC10570l getCompute() {
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

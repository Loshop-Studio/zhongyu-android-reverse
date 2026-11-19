package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class StaticValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t10) {
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final StaticValueHolder<T> copy(T t10) {
        return new StaticValueHolder<>(t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && AbstractC9979u.m20289b(this.value, ((StaticValueHolder) obj).value);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t10 = this.value;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        T t10 = this.value;
        return new ProvidedValue<>(compositionLocal, t10, t10 == null, null, null, null, false);
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}

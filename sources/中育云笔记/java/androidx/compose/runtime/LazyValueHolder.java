package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9923a;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;
    private final InterfaceC10773d current$delegate;

    public LazyValueHolder(InterfaceC9529a interfaceC9529a) {
        this.current$delegate = AbstractC9923a.m20068a(interfaceC9529a);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return getCurrent();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new KotlinNothingValueException();
    }
}

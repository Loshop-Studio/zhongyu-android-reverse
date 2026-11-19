package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9078a;
import kotlin.KotlinNothingValueException;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;
    private final InterfaceC8724d current$delegate;

    public LazyValueHolder(InterfaceC10559a interfaceC10559a) {
        this.current$delegate = AbstractC9078a.m15924b(interfaceC10559a);
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

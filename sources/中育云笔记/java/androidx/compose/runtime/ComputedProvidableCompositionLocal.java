package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final ComputedValueHolder<T> defaultValueHolder;

    public ComputedProvidableCompositionLocal(InterfaceC9540l interfaceC9540l) {
        super(new InterfaceC9529a() { // from class: androidx.compose.runtime.ComputedProvidableCompositionLocal.1
            @Override // p181hd.InterfaceC9529a
            public final T invoke() {
                ComposerKt.composeRuntimeError("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            }
        });
        this.defaultValueHolder = new ComputedValueHolder<>(interfaceC9540l);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T t10) {
        return new ProvidedValue<>(this, t10, t10 == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ComputedValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }
}

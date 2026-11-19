package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    public StaticProvidableCompositionLocal(InterfaceC10559a interfaceC10559a) {
        super(interfaceC10559a);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T t10) {
        return new ProvidedValue<>(this, t10, t10 == null, null, null, null, false);
    }
}

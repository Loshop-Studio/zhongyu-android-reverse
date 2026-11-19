package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final SnapshotMutationPolicy<T> policy;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy<T> snapshotMutationPolicy, InterfaceC9529a interfaceC9529a) {
        super(interfaceC9529a);
        this.policy = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T t10) {
        return new ProvidedValue<>(this, t10, t10 == null, this.policy, null, null, true);
    }
}

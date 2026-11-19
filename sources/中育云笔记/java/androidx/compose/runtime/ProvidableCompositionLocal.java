package androidx.compose.runtime;

import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

@Stable
/* loaded from: classes2.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(InterfaceC9529a interfaceC9529a) {
        super(interfaceC9529a, null);
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime_release()) {
            return providedValue.getCompute$runtime_release() != null ? new ComputedValueHolder(providedValue.getCompute$runtime_release()) : providedValue.getState$runtime_release() != null ? new DynamicValueHolder(providedValue.getState$runtime_release()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime_release());
        }
        MutableState<T> state$runtime_release = providedValue.getState$runtime_release();
        if (state$runtime_release == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime_release = providedValue.getMutationPolicy$runtime_release();
            if (mutationPolicy$runtime_release == null) {
                mutationPolicy$runtime_release = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime_release = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime_release);
        }
        return new DynamicValueHolder(state$runtime_release);
    }

    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T t10);

    public final ProvidedValue<T> provides(T t10) {
        return defaultProvidedValue$runtime_release(t10);
    }

    public final ProvidedValue<T> providesComputed(InterfaceC9540l interfaceC9540l) {
        return new ProvidedValue<>(this, null, false, null, null, interfaceC9540l, false);
    }

    public final ProvidedValue<T> providesDefault(T t10) {
        return defaultProvidedValue$runtime_release(t10).ifNotAlreadyProvided$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.DynamicValueHolder) = (r5v5 androidx.compose.runtime.DynamicValueHolder), (r5v6 androidx.compose.runtime.DynamicValueHolder) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.ValueHolder<T> updatedStateOf$runtime_release(androidx.compose.runtime.ProvidedValue<T> r4, androidx.compose.runtime.ValueHolder<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.isDynamic$runtime_release()
            if (r0 == 0) goto L47
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.getState()
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.isStatic$runtime_release()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.getValue()
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L47
            hd.l r0 = r4.getCompute$runtime_release()
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            hd.l r2 = r5.getCompute()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            androidx.compose.runtime.ValueHolder r4 = r3.valueHolderOf(r4)
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.updatedStateOf$runtime_release(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }
}

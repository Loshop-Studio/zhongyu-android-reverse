package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(final ProvidedValue<?>[] providedValueArr, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:361)");
        }
        composerStartRestartGroup.startProviders(providedValueArr);
        interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        composerStartRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i11) {
                    ProvidedValue<?>[] providedValueArr2 = providedValueArr;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr2, providedValueArr2.length), interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, InterfaceC9529a interfaceC9529a) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, interfaceC9529a);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, interfaceC9529a);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(InterfaceC9540l interfaceC9540l) {
        return new ComputedProvidableCompositionLocal(interfaceC9540l);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(InterfaceC9529a interfaceC9529a) {
        return new StaticProvidableCompositionLocal(interfaceC9529a);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(final ProvidedValue<?> providedValue, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:381)");
        }
        composerStartRestartGroup.startProvider(providedValue);
        interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        composerStartRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i11) {
                    CompositionLocalKt.CompositionLocalProvider(providedValue, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(final CompositionLocalContext compositionLocalContext, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1853897736);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:399)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), interfaceC9544p, composerStartRestartGroup, i11 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    CompositionLocalKt.CompositionLocalProvider(compositionLocalContext, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}

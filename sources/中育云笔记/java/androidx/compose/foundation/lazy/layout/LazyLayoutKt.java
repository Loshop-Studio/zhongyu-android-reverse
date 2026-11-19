package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.SubcomposeLayoutKt;
import androidx.compose.p014ui.layout.SubcomposeLayoutState;
import androidx.compose.p014ui.layout.SubcomposeMeasureScope;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(final InterfaceC9529a interfaceC9529a, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC9529a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (i14 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9529a, composerStartRestartGroup, i12 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-1488997347, true, new InterfaceC9545q() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((SaveableStateHolder) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer2, int i15) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i15, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:56)");
                    }
                    final State<InterfaceC9529a> state = stateRememberUpdatedState;
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public final LazyLayoutItemProvider invoke() {
                                return (LazyLayoutItemProvider) state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                    if (lazyLayoutPrefetchState != null) {
                        composer2.startReplaceGroup(204281539);
                        final PrefetchScheduler prefetchScheduler$foundation_release = lazyLayoutPrefetchState.getPrefetchScheduler$foundation_release();
                        if (prefetchScheduler$foundation_release == null) {
                            composer2.startReplaceGroup(6591363);
                            prefetchScheduler$foundation_release = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer2, 0);
                        } else {
                            composer2.startReplaceGroup(6590278);
                        }
                        composer2.endReplaceGroup();
                        Object obj = lazyLayoutPrefetchState;
                        Object[] objArr = {obj, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation_release};
                        boolean zChanged = composer2.changed(obj) | composer2.changedInstance(lazyLayoutItemContentFactory) | composer2.changedInstance(subcomposeLayoutState) | composer2.changedInstance(prefetchScheduler$foundation_release);
                        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    lazyLayoutPrefetchState2.setPrefetchHandleProvider$foundation_release(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation_release));
                                    final LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lazyLayoutPrefetchState3.setPrefetchHandleProvider$foundation_release(null);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(objArr, (InterfaceC9540l) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(204710145);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierTraversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
                    boolean zChanged2 = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(interfaceC9544p);
                    final InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return m27633invoke0kLqBqw((SubcomposeMeasureScope) obj2, ((Constraints) obj3).m33460unboximpl());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m27633invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                                return (MeasureResult) interfaceC9544p2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m33441boximpl(j10));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifierTraversablePrefetchState, (InterfaceC9544p) objRememberedValue4, composer2, SubcomposeLayoutState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    LazyLayoutKt.LazyLayout(interfaceC9529a, modifier2, lazyLayoutPrefetchState2, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }
}

package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.LookaheadScope;
import androidx.compose.p014ui.layout.LookaheadScopeKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;
    private static final SpringSpec<Rect> DefaultSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
    private static final SharedTransitionScope.OverlayClip ParentClip = new SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
            if (parentSharedContentState != null) {
                return parentSharedContentState.getClipPathInOverlay();
            }
            return null;
        }
    };
    private static final InterfaceC9544p DefaultClipInOverlayDuringTransition = new InterfaceC9544p() { // from class: androidx.compose.animation.SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1
        @Override // p181hd.InterfaceC9544p
        public final Void invoke(LayoutDirection layoutDirection, Density density) {
            return null;
        }
    };
    private static final BoundsTransform DefaultBoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.c
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec transform(Rect rect, Rect rect2) {
            return SharedTransitionScopeKt.DefaultBoundsTransform$lambda$0(rect, rect2);
        }
    };
    private static final MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> cachedScaleToBoundsImplMap = new MutableScatterMap<>(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect rect, Rect rect2) {
        return DefaultSpring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalSharedTransitionApi
    public static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        if (!getShouldCache(contentScale) || !getShouldCache(alignment)) {
            return new ScaleToBoundsImpl(contentScale, alignment);
        }
        MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> mutableScatterMap = cachedScaleToBoundsImplMap;
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap2 = mutableScatterMap.get(contentScale);
        if (mutableScatterMap2 == null) {
            mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
            mutableScatterMap.set(contentScale, mutableScatterMap2);
        }
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap3 = mutableScatterMap2;
        ScaleToBoundsImpl scaleToBoundsImpl = mutableScatterMap3.get(alignment);
        if (scaleToBoundsImpl == null) {
            scaleToBoundsImpl = new ScaleToBoundsImpl(contentScale, alignment);
            mutableScatterMap3.set(alignment, scaleToBoundsImpl);
        }
        return scaleToBoundsImpl;
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionLayout(final Modifier modifier, final InterfaceC9545q interfaceC9545q, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(2043053727);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043053727, i12, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
            }
            SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(-130587847, true, new InterfaceC9546r() { // from class: androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionLayout.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((SharedTransitionScope) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier2, Composer composer2, int i14) {
                    int i15;
                    if ((i14 & 6) == 0) {
                        i15 = (composer2.changed(sharedTransitionScope) ? 4 : 2) | i14;
                    } else {
                        i15 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        i15 |= composer2.changed(modifier2) ? 32 : 16;
                    }
                    if (!composer2.shouldExecute((i15 & 147) != 146, i15 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-130587847, i15, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:102)");
                    }
                    Modifier modifierThen = modifier.then(modifier2);
                    InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    interfaceC9545q2.invoke(sharedTransitionScope, composer2, Integer.valueOf(i15 & 14));
                    composer2.endNode();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SharedTransitionScopeKt.SharedTransitionLayout(modifier, interfaceC9545q, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionScope(final InterfaceC9546r interfaceC9546r, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2093217917);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9546r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2093217917, i11, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
            }
            LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(-863967934, true, new InterfaceC9545q() { // from class: androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionScope.1
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((LookaheadScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(LookaheadScope lookaheadScope, Composer composer2, int i12) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-863967934, i12, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)");
                    }
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composer2);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SharedTransitionScopeImpl(lookaheadScope, interfaceC11122i0);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) objRememberedValue2;
                    InterfaceC9546r interfaceC9546r2 = interfaceC9546r;
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC9545q() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1
                            {
                                super(3);
                            }

                            @Override // p181hd.InterfaceC9545q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return m26820invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
                            }

                            /* renamed from: invoke-3p2s80s, reason: not valid java name */
                            public final MeasureResult m26820invoke3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
                                int width = placeableMo32229measureBRTryo0.getWidth();
                                int height = placeableMo32229measureBRTryo0.getHeight();
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        LayoutCoordinates coordinates = placementScope.getCoordinates();
                                        if (coordinates != null) {
                                            if (measureScope.isLookingAhead()) {
                                                sharedTransitionScopeImpl2.setNullableLookaheadRoot$animation_release(coordinates);
                                            } else {
                                                sharedTransitionScopeImpl2.setRoot$animation_release(coordinates);
                                            }
                                        }
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierLayout = LayoutModifierKt.layout(companion2, (InterfaceC9545q) objRememberedValue3);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$2$1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ContentDrawScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(ContentDrawScope contentDrawScope) {
                                contentDrawScope.drawContent();
                                sharedTransitionScopeImpl.drawInOverlay$animation_release(contentDrawScope);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    interfaceC9546r2.invoke(sharedTransitionScopeImpl, DrawModifierKt.drawWithContent(modifierLayout, (InterfaceC9540l) objRememberedValue4), composer2, 6);
                    C10786q c10786q = C10786q.f26013a;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        sharedTransitionScopeImpl2.onDispose$animation_release();
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    EffectsKt.DisposableEffect(c10786q, (InterfaceC9540l) objRememberedValue5, composer2, 54);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionScope.2
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
                    SharedTransitionScopeKt.SharedTransitionScope(interfaceC9546r, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getCachedScaleToBoundsImplMap$annotations() {
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getParentClip$annotations() {
    }

    private static final boolean getShouldCache(Alignment alignment) {
        Alignment.Companion companion = Alignment.Companion;
        return alignment == companion.getTopStart() || alignment == companion.getTopCenter() || alignment == companion.getTopEnd() || alignment == companion.getCenterStart() || alignment == companion.getCenter() || alignment == companion.getCenterEnd() || alignment == companion.getBottomStart() || alignment == companion.getBottomCenter() || alignment == companion.getBottomEnd();
    }

    private static final boolean getShouldCache(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.Companion;
        return contentScale == companion.getFillWidth() || contentScale == companion.getFillHeight() || contentScale == companion.getFillBounds() || contentScale == companion.getFit() || contentScale == companion.getCrop() || contentScale == companion.getNone() || contentScale == companion.getInside();
    }
}

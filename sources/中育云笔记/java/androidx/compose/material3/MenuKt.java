package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.InspectionModeKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    public static final int InTransitionDuration = 120;
    private static final float MenuListItemContainerHeight;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = C3186Dp.m33501constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = C3186Dp.m33501constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = C3186Dp.m33501constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = C3186Dp.m33501constructorimpl(280);

    static {
        float f10 = 48;
        MenuVerticalMargin = C3186Dp.m33501constructorimpl(f10);
        MenuListItemContainerHeight = C3186Dp.m33501constructorimpl(f10);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m28837DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final ScrollState scrollState, final Shape shape, final long j10, final float f10, final float f11, final BorderStroke borderStroke, final InterfaceC9545q interfaceC9545q, Composer composer, final int i10) {
        int i11;
        boolean z10;
        Object obj;
        int i12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-151448888);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(scrollState) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= composerStartRestartGroup.changed(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= composerStartRestartGroup.changed(borderStroke) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-151448888, i11, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | ((i11 >> 3) & 14), 0);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new InterfaceC9545q() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke((Transition.Segment<Boolean>) obj2, (Composer) obj3, ((Number) obj4).intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i13) {
                    composer3.startReplaceGroup(1033023423);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1033023423, i13, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
                    }
                    TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(MenuKt.InTransitionDuration, 0, EasingKt.getLinearOutSlowInEasing(), 2, null) : AnimationSpecKt.tween$default(1, 74, null, 4, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            C9974p c9974p = C9974p.f23424a;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(c9974p);
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(2139028452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(2139028452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f13), (FiniteAnimationSpec) menuKt$DropdownMenuContent$scale$2.invoke((Object) transitionUpdateTransition.getSegment(), (Object) composerStartRestartGroup, (Object) 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new InterfaceC9545q() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke((Transition.Segment<Boolean>) obj2, (Composer) obj3, ((Number) obj4).intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i13) {
                    composer3.startReplaceGroup(-1355418157);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355418157, i13, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
                    }
                    TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(30, 0, null, 6, null) : AnimationSpecKt.tween$default(75, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(c9974p);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-249413128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-249413128);
            if (ComposerKt.isTraceInProgress()) {
                z10 = false;
                ComposerKt.traceEventStart(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            } else {
                z10 = false;
            }
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f15), (FiniteAnimationSpec) menuKt$DropdownMenuContent$alpha$2.invoke((Object) transitionUpdateTransition.getSegment(), (Object) composerStartRestartGroup, (Object) 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            final boolean zBooleanValue5 = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composerStartRestartGroup.changed(zBooleanValue5) | composerStartRestartGroup.changed(stateCreateTransitionAnimation) | (((i11 & 112) == 32 || ((i11 & 64) != 0 && composerStartRestartGroup.changedInstance(mutableTransitionState))) ? true : z10) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z11 = zChanged | z10;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                i12 = i11;
                obj = new InterfaceC9540l() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((GraphicsLayerScope) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                        float fDropdownMenuContent_Qj0Zi0g$lambda$1 = 0.8f;
                        float fDropdownMenuContent_Qj0Zi0g$lambda$3 = 1.0f;
                        graphicsLayerScope.setScaleX(!zBooleanValue5 ? MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$1(stateCreateTransitionAnimation) : mutableTransitionState.getTargetState().booleanValue() ? 1.0f : 0.8f);
                        if (!zBooleanValue5) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$1 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$1(stateCreateTransitionAnimation);
                        } else if (mutableTransitionState.getTargetState().booleanValue()) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$1 = 1.0f;
                        }
                        graphicsLayerScope.setScaleY(fDropdownMenuContent_Qj0Zi0g$lambda$1);
                        if (!zBooleanValue5) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$3 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$3(stateCreateTransitionAnimation2);
                        } else if (!mutableTransitionState.getTargetState().booleanValue()) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$3 = 0.0f;
                        }
                        graphicsLayerScope.setAlpha(fDropdownMenuContent_Qj0Zi0g$lambda$3);
                        graphicsLayerScope.mo31070setTransformOrigin__ExYCQ(mutableState.getValue().m31268unboximpl());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
                i12 = i11;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            SurfaceKt.m29151SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion, (InterfaceC9540l) obj), shape, j10, 0L, f10, f11, borderStroke, ComposableLambdaKt.rememberComposableLambda(1573559053, true, new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i15) {
                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573559053, i15, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m27460paddingVpY3zN4$default(modifier, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
                    InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer3);
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    interfaceC9545q2.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i15) {
                    MenuKt.m28837DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j10, f10, f11, borderStroke, interfaceC9545q, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent_Qj0Zi0g$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent_Qj0Zi0g$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(final InterfaceC9544p interfaceC9544p, final InterfaceC9529a interfaceC9529a, final Modifier modifier, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final boolean z10, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(menuItemColors) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i11, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m27509sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m26984clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m29009rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z10, null, null, interfaceC9529a, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuListItemContainerHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1065051884, true, new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1065051884, i12, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
                    }
                    composer2.startReplaceGroup(1264683960);
                    if (interfaceC9544p2 != null) {
                        ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(menuItemColors.m28834leadingIconColorvNxB06k$material3_release(z10)));
                        final InterfaceC9544p interfaceC9544p4 = interfaceC9544p2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(2035552199, true, new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C10786q.f26013a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2035552199, i13, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                                }
                                Modifier modifierM27490defaultMinSizeVpY3zN4$default = SizeKt.m27490defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m29920getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                InterfaceC9544p interfaceC9544p5 = interfaceC9544p4;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM27490defaultMinSizeVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                InterfaceC9529a constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer3);
                                Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                interfaceC9544p5.invoke(composer3, 0);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    }
                    composer2.endReplaceGroup();
                    ProvidedValue<Color> providedValueProvides2 = ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(menuItemColors.m28835textColorvNxB06k$material3_release(z10)));
                    final RowScope rowScope = rowScopeInstance;
                    final InterfaceC9544p interfaceC9544p5 = interfaceC9544p2;
                    final InterfaceC9544p interfaceC9544p6 = interfaceC9544p3;
                    final InterfaceC9544p interfaceC9544p7 = interfaceC9544p;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1728894036, true, new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer3, int i13) {
                            if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1728894036, i13, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                            }
                            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null), interfaceC9544p5 != null ? MenuKt.DropdownMenuItemHorizontalPadding : C3186Dp.m33501constructorimpl(0), 0.0f, interfaceC9544p6 != null ? MenuKt.DropdownMenuItemHorizontalPadding : C3186Dp.m33501constructorimpl(0), 0.0f, 10, null);
                            InterfaceC9544p interfaceC9544p8 = interfaceC9544p7;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM27462paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            InterfaceC9529a constructor2 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer3);
                            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            interfaceC9544p8.invoke(composer3, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    int i13 = ProvidedValue.$stable;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, composableLambdaRememberComposableLambda, composer2, i13 | 48);
                    if (interfaceC9544p3 != null) {
                        ProvidedValue<Color> providedValueProvides3 = ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(menuItemColors.m28836trailingIconColorvNxB06k$material3_release(z10)));
                        final InterfaceC9544p interfaceC9544p8 = interfaceC9544p3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides3, ComposableLambdaKt.rememberComposableLambda(580312062, true, new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C10786q.f26013a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer3, int i14) {
                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(580312062, i14, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                                }
                                Modifier modifierM27490defaultMinSizeVpY3zN4$default = SizeKt.m27490defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m29928getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                InterfaceC9544p interfaceC9544p9 = interfaceC9544p8;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM27490defaultMinSizeVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                InterfaceC9529a constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer3);
                                Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                interfaceC9544p9.invoke(composer3, 0);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, i13 | 48);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.MenuKt.DropdownMenuItemContent.2
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
                    MenuKt.DropdownMenuItemContent(interfaceC9544p, interfaceC9529a, modifier, interfaceC9544p2, interfaceC9544p3, z10, menuItemColors, paddingValues, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(androidx.compose.p014ui.unit.IntRect r5, androidx.compose.p014ui.unit.IntRect r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = androidx.compose.p014ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}

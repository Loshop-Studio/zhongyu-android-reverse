package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
    private static final float NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
    private static final float IndicatorVerticalOffset = C3186Dp.m33501constructorimpl(12);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItem-SHbi2eg, reason: not valid java name */
    public static final void m28913NavigationItemSHbi2eg(final boolean z10, final InterfaceC9529a interfaceC9529a, final InterfaceC9544p interfaceC9544p, final TextStyle textStyle, final Shape shape, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z11, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final int i10, MutableInteractionSource mutableInteractionSource, Composer composer, final int i11, final int i12) {
        int i13;
        Shape shape2;
        int i14;
        boolean z12;
        MutableInteractionSource mutableInteractionSource2;
        int i15;
        InteractionSource interactionSource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(547979956);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            shape2 = shape;
            i13 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((i11 & ProfileVerifier.CompilationStatus.f1974xf2722a21) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.changed(f11) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(f12) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(f13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(f14) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(f15) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(navigationItemColors) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 16384 : 8192;
        }
        if ((i12 & ProfileVerifier.CompilationStatus.f1974xf2722a21) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        int i16 = i14;
        if ((i13 & 306783379) == 306783378 && (4793491 & i16) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547979956, i13, i16, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            int i17 = i13;
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
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
                public final void invoke(Composer composer3, int i18) {
                    if ((i18 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-44329638, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                    }
                    long jM28902iconColorWaAFU9c = navigationItemColors.m28902iconColorWaAFU9c(z10, z11);
                    Modifier modifierClearAndSetSemantics = interfaceC9544p2 != null ? SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }
                    }) : Modifier.Companion;
                    InterfaceC9544p interfaceC9544p4 = interfaceC9544p;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierClearAndSetSemantics);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion.getConstructor();
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
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(jM28902iconColorWaAFU9c)), interfaceC9544p4, composer3, ProvidedValue.$stable);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1735402128);
            if (interfaceC9544p3 != null) {
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
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
                    public final void invoke(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836184859, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final InterfaceC9544p interfaceC9544p4 = interfaceC9544p3;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(870803363, true, new InterfaceC9545q() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            {
                                super(3);
                            }

                            @Override // p181hd.InterfaceC9545q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return C10786q.f26013a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(BoxScope boxScope, Composer composer4, int i19) {
                                if ((i19 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(870803363, i19, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                interfaceC9544p4.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final InterfaceC9544p interfaceC9544p5 = composableLambdaRememberComposableLambda;
                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, null, ComposableLambdaKt.rememberComposableLambda(-1365557663, true, new InterfaceC9545q() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            {
                                super(3);
                            }

                            @Override // p181hd.InterfaceC9545q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return C10786q.f26013a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(BoxScope boxScope, Composer composer4, int i19) {
                                if ((i19 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1365557663, i19, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                interfaceC9544p5.invoke(composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1735395524);
            ComposableLambda composableLambdaRememberComposableLambda2 = null;
            if (interfaceC9544p2 == null) {
                z12 = true;
            } else {
                z12 = true;
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-254668050, true, new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
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
                    public final void invoke(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-254668050, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.m29517ProvideContentColorTextStyle3JVO9M(navigationItemColors.m28903textColorWaAFU9c(z10, z11), textStyle, interfaceC9544p2, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda2;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            mutableInteractionSource2 = mutableInteractionSource;
            Modifier modifierM27489defaultMinSizeVpY3zN4 = SizeKt.m27489defaultMinSizeVpY3zN4(SelectableKt.m27721selectableO2vRcR0(modifier, z10, mutableInteractionSource2, null, z11, Role.m32721boximpl(Role.Companion.m32735getTabo7Vup1c()), interfaceC9529a), NavigationItemMinWidth, NavigationItemMinHeight);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m28922invokeozmzZPI(((IntSize) obj).m33676unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m28922invokeozmzZPI(long j10) {
                        mutableIntState.setIntValue(IntSize.m33672getWidthimpl(j10));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM27489defaultMinSizeVpY3zN4, (InterfaceC9540l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), z12);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(-1634400795);
            if (NavigationItemIconPosition.m28907equalsimpl0(i10, NavigationItemIconPosition.Companion.m28912getTopxw1Ddg())) {
                i15 = 29360128;
                long jOffset = OffsetKt.Offset((mutableIntState.getIntValue() - r8.mo27093roundToPx0680j_4(f10)) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(IndicatorVerticalOffset));
                C10786q c10786q = C10786q.f26013a;
                boolean zChanged = ((i16 & 29360128) == 8388608) | composerStartRestartGroup.changed(jOffset);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MappedInteractionSource(mutableInteractionSource2, jOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                interactionSource = (MappedInteractionSource) objRememberedValue3;
            } else {
                i15 = 29360128;
                interactionSource = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            InteractionSource interactionSource2 = interactionSource != null ? interactionSource : mutableInteractionSource2;
            long jM28898getSelectedIndicatorColor0d7_KjU = navigationItemColors.m28898getSelectedIndicatorColor0d7_KjU();
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9529a() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Float invoke() {
                        return stateAnimateFloatAsState.getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i18 = i17 << 3;
            m28914NavigationItemLayoutKmRXDg(interactionSource2, jM28898getSelectedIndicatorColor0d7_KjU, shape2, composableLambda, i10, composableLambda2, (InterfaceC9529a) objRememberedValue4, f11, f12, f13, f14, f15, composerStartRestartGroup, ((i17 >> 6) & 896) | ((i16 >> 6) & 57344) | (i18 & i15) | (234881024 & i18) | (i18 & 1879048192), ((i17 >> 27) & 14) | ((i16 << 3) & 112));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i19) {
                    NavigationItemKt.m28913NavigationItemSHbi2eg(z10, interfaceC9529a, interfaceC9544p, textStyle, shape, f10, f11, f12, f13, f14, f15, navigationItemColors, modifier, z11, interfaceC9544p2, interfaceC9544p3, i10, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    public static final void m28914NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j10, final Shape shape, final InterfaceC9544p interfaceC9544p, final int i10, final InterfaceC9544p interfaceC9544p2, InterfaceC9529a interfaceC9529a, final float f10, final float f11, final float f12, final float f13, final float f14, Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        ?? r02;
        int i15;
        Object topIconOrIconOnlyMeasurePolicy;
        Composer composer2;
        final InterfaceC9529a interfaceC9529a2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757687417);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(f11) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(f12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(f13) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(f14) ? 32 : 16;
        }
        int i16 = i14;
        if ((i13 & 306783379) == 306783378 && (i16 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC9529a2 = interfaceC9529a;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757687417, i13, i16, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (interfaceC9544p2 == null || NavigationItemIconPosition.m28907equalsimpl0(i10, NavigationItemIconPosition.Companion.m28912getTopxw1Ddg())) {
                r02 = 0;
                i15 = i13;
                composer2 = composerStartRestartGroup;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(interfaceC9544p2 != null, interfaceC9529a, f10, f11, f12, f14, null);
                interfaceC9529a2 = interfaceC9529a;
            } else {
                r02 = 0;
                i15 = i13;
                interfaceC9529a2 = interfaceC9529a;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(interfaceC9529a2, f10, f11, f13, null);
                composer2 = composerStartRestartGroup;
            }
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r02);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, topIconOrIconOnlyMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            composerStartRestartGroup = composer2;
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m29009rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, r02);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IndicatorLayoutIdTag);
            boolean z10 = (i15 & 3670016) == 1048576 ? true : r02;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((GraphicsLayerScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setAlpha(((Number) interfaceC9529a2.invoke()).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(BackgroundKt.m26949backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (InterfaceC9540l) objRememberedValue), j10, shape), composerStartRestartGroup, r02);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r02);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r02);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            InterfaceC9529a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-776741606);
            if (interfaceC9544p2 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                InterfaceC9529a constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                interfaceC9544p2.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 15) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i17) {
                    NavigationItemKt.m28914NavigationItemLayoutKmRXDg(interactionSource, j10, shape, interfaceC9544p, i10, interfaceC9544p2, interfaceC9529a3, f10, f11, f12, f13, f14, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemMinHeight;
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemMinWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m28919placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j10) {
        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeable2.getWidth());
        int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeable2.getHeight());
        final int width = (iM33471constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height = (iM33470constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        final int width2 = (iM33471constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height2 = (iM33470constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width3 = (iM33471constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int height3 = (iM33470constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM33471constrainWidthK40F9xA, iM33470constrainHeightK40F9xA, null, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width3, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final MeasureResult m28920placeLabelAndStartIconnru01g4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, float f10) {
        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeable3.getWidth());
        int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeable3.getHeight());
        final int width = (iM33471constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int height = (iM33470constrainHeightK40F9xA - placeable4.getHeight()) / 2;
        final int height2 = (iM33470constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        final int height3 = (iM33470constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM33471constrainWidthK40F9xA - ((placeable2.getWidth() + measureScope.mo27093roundToPx0680j_4(f10)) + placeable.getWidth())) / 2;
        final int width3 = placeable2.getWidth() + width2 + measureScope.mo27093roundToPx0680j_4(f10);
        final int width4 = (iM33471constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height4 = (iM33470constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM33471constrainWidthK40F9xA, iM33470constrainHeightK40F9xA, null, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, height4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final MeasureResult m28921placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, float f10, float f11, float f12) {
        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j10, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j10, AbstractC9719c.m19282d(placeable3.getHeight() + measureScope.mo27099toPx0680j_4(f10) + placeable.getHeight() + (measureScope.mo27099toPx0680j_4(f12) * 2)));
        final int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(f12 + f11));
        final int width = (iM33471constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int width2 = (iM33471constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int iMo27093roundToPx0680j_42 = iMo27093roundToPx0680j_4 - measureScope.mo27093roundToPx0680j_4(f11);
        final int width3 = (iM33471constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height = iMo27093roundToPx0680j_4 + placeable2.getHeight() + measureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(f10 + f11));
        final int width4 = (iM33471constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        return MeasureScope.layout$default(measureScope, iM33471constrainWidthK40F9xA, iM33470constrainHeightK40F9xA, null, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width2, iMo27093roundToPx0680j_42, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, iMo27093roundToPx0680j_4, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, iMo27093roundToPx0680j_42, 0.0f, 4, null);
            }
        }, 4, null);
    }
}

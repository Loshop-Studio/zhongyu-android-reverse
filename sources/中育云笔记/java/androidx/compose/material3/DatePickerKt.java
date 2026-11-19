package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.CustomAccessibilityAction;
import androidx.compose.p014ui.semantics.LiveRegionMode;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.C3186Dp;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = C3186Dp.m33501constructorimpl(48);
    private static final float MonthYearHeight = C3186Dp.m33501constructorimpl(56);

    static {
        float f10 = 12;
        DatePickerHorizontalPadding = C3186Dp.m33501constructorimpl(f10);
        DatePickerModeTogglePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(0.0f, 0.0f, C3186Dp.m33501constructorimpl(f10), C3186Dp.m33501constructorimpl(f10), 3, null);
        float f11 = 24;
        float f12 = 16;
        DatePickerTitlePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f12), C3186Dp.m33501constructorimpl(f10), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(C3186Dp.m33501constructorimpl(f11), 0.0f, C3186Dp.m33501constructorimpl(f10), C3186Dp.m33501constructorimpl(f10), 2, null);
        YearsVerticalPadding = C3186Dp.m33501constructorimpl(f12);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m28608DateEntryContainerau3_HiA(final Modifier modifier, final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f10, final InterfaceC9544p interfaceC9544p4, Composer composer, final int i10) {
        int i11;
        InterfaceC9544p interfaceC9544p5;
        InterfaceC9544p interfaceC9544p6;
        InterfaceC9544p interfaceC9544p7;
        DatePickerColors datePickerColors2;
        TextStyle textStyle2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1507356255);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC9544p5 = interfaceC9544p;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p5) ? 32 : 16;
        } else {
            interfaceC9544p5 = interfaceC9544p;
        }
        if ((i10 & 384) == 0) {
            interfaceC9544p6 = interfaceC9544p2;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p6) ? 256 : 128;
        } else {
            interfaceC9544p6 = interfaceC9544p2;
        }
        if ((i10 & 3072) == 0) {
            interfaceC9544p7 = interfaceC9544p3;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p7) ? 2048 : 1024;
        } else {
            interfaceC9544p7 = interfaceC9544p3;
        }
        if ((i10 & 24576) == 0) {
            datePickerColors2 = datePickerColors;
            i11 |= composerStartRestartGroup.changed(datePickerColors2) ? 16384 : 8192;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((196608 & i10) == 0) {
            textStyle2 = textStyle;
            i11 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i11, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)");
            }
            Modifier modifierM26950backgroundbw27NRU$default = BackgroundKt.m26950backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(SizeKt.m27509sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m29755getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), datePickerColors2.m28579getContainerColor0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM26950backgroundbw27NRU$default);
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            final InterfaceC9544p interfaceC9544p8 = interfaceC9544p5;
            final InterfaceC9544p interfaceC9544p9 = interfaceC9544p6;
            final InterfaceC9544p interfaceC9544p10 = interfaceC9544p7;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final TextStyle textStyle3 = textStyle2;
            m28609DatePickerHeaderpc5RIQQ(Modifier.Companion, interfaceC9544p, datePickerColors2.m28598getTitleContentColor0d7_KjU(), datePickerColors2.m28591getHeadlineContentColor0d7_KjU(), f10, ComposableLambdaKt.rememberComposableLambda(-229007058, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
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
                public final void invoke(Composer composer3, int i12) {
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229007058, i12, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1326)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    final InterfaceC9544p interfaceC9544p11 = interfaceC9544p9;
                    InterfaceC9544p interfaceC9544p12 = interfaceC9544p10;
                    InterfaceC9544p interfaceC9544p13 = interfaceC9544p8;
                    DatePickerColors datePickerColors4 = datePickerColors3;
                    TextStyle textStyle4 = textStyle3;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion3.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor2 = companion4.getConstructor();
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
                    Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Arrangement.Horizontal start = (interfaceC9544p11 == null || interfaceC9544p12 == null) ? interfaceC9544p11 != null ? arrangement.getStart() : arrangement.getEnd() : arrangement.getSpaceBetween();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    InterfaceC9529a constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composer3);
                    Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1287344744);
                    if (interfaceC9544p11 != null) {
                        TextKt.ProvideTextStyle(textStyle4, ComposableLambdaKt.rememberComposableLambda(-962031352, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
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
                            public final void invoke(Composer composer4, int i13) {
                                if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-962031352, i13, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1340)");
                                }
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                                InterfaceC9544p interfaceC9544p14 = interfaceC9544p11;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierWeight$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                                InterfaceC9529a constructor4 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composer4);
                                Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                InterfaceC9544p setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                interfaceC9544p14.invoke(composer4, 0);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1287336668);
                    if (interfaceC9544p12 != null) {
                        interfaceC9544p12.invoke(composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.startReplaceGroup(1995137078);
                    if (interfaceC9544p13 != null || interfaceC9544p11 != null || interfaceC9544p12 != null) {
                        DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors4.m28590getDividerColor0d7_KjU(), composer3, 0, 3);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 112) | 196614 | (57344 & (i11 >> 6)));
            composer2 = composerStartRestartGroup;
            interfaceC9544p4.invoke(composer2, Integer.valueOf((i11 >> 21) & 14));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i12) {
                    DatePickerKt.m28608DateEntryContainerau3_HiA(modifier, interfaceC9544p, interfaceC9544p2, interfaceC9544p3, datePickerColors, textStyle, f10, interfaceC9544p4, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePicker(final androidx.compose.material3.DatePickerState r25, androidx.compose.p014ui.Modifier r26, androidx.compose.material3.DatePickerFormatter r27, p181hd.InterfaceC9544p r28, p181hd.InterfaceC9544p r29, boolean r30, androidx.compose.material3.DatePickerColors r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, hd.p, hd.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DatePickerContent(final Long l10, final long j10, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-434467002);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(c10405j) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i11, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1491)");
            }
            final CalendarMonth month = calendarModel.getMonth(j10);
            int iM21752e = AbstractC10410o.m21752e(month.indexIn(c10405j), 0);
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iM21752e, 0, composerStartRestartGroup, 0, 2);
            Integer numValueOf = Integer.valueOf(iM21752e);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(iM21752e);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                obj = null;
                objRememberedValue = new DatePickerKt$DatePickerContent$1$1(lazyListStateRememberLazyListState, iM21752e, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                obj = null;
            }
            EffectsKt.LaunchedEffect(numValueOf, (InterfaceC9544p) objRememberedValue, composerStartRestartGroup, 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) null, (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2
                @Override // p181hd.InterfaceC9529a
                public final MutableState<Boolean> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion4.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f10 = DatePickerHorizontalPadding;
            int i12 = i11;
            Modifier modifierM27460paddingVpY3zN4$default = PaddingKt.m27460paddingVpY3zN4$default(companion2, f10, 0.0f, 2, null);
            boolean canScrollForward = lazyListStateRememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
            boolean zDatePickerContent$lambda$10 = DatePickerContent$lambda$10(mutableState);
            String monthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j10), localeDefaultLocale);
            if (monthYear == null) {
                monthYear = "-";
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", m26211f = "DatePicker.kt", m26212l = {1527}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1 */
                    public static final class C21131 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C21131(LazyListState lazyListState, InterfaceC11588c<? super C21131> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C21131(this.$monthsListState, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    AbstractC9924b.m20071b(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                                    this.label = 1;
                                    if (LazyListState.animateScrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
                                        return objM25952f;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC9924b.m20071b(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C21131) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m28617invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m28617invoke() {
                        AbstractC11117h.m24726d(coroutineScope, null, null, new C21131(lazyListStateRememberLazyListState, null), 3, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue3;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", m26211f = "DatePicker.kt", m26212l = {1539}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1 */
                    public static final class C21141 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C21141(LazyListState lazyListState, InterfaceC11588c<? super C21141> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C21141(this.$monthsListState, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    AbstractC9924b.m20071b(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                                    this.label = 1;
                                    if (LazyListState.animateScrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
                                        return objM25952f;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC9924b.m20071b(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C21141) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m28618invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m28618invoke() {
                        AbstractC11117h.m24726d(coroutineScope, null, null, new C21141(lazyListStateRememberLazyListState, null), 3, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InterfaceC9529a interfaceC9529a2 = (InterfaceC9529a) objRememberedValue4;
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m28619invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m28619invoke() {
                        DatePickerKt.DatePickerContent$lambda$11(mutableState, !DatePickerKt.DatePickerContent$lambda$10(r0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            InterfaceC9529a interfaceC9529a3 = (InterfaceC9529a) objRememberedValue5;
            int i13 = 234881024 & i12;
            MonthsNavigation(modifierM27460paddingVpY3zN4$default, canScrollForward, canScrollBackward, zDatePickerContent$lambda$10, monthYear, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, datePickerColors, composerStartRestartGroup, i13 | 6);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            InterfaceC9529a constructor2 = companion4.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM27460paddingVpY3zN4$default2 = PaddingKt.m27460paddingVpY3zN4$default(companion2, f10, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27460paddingVpY3zN4$default2);
            InterfaceC9529a constructor3 = companion4.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, ((i12 >> 24) & 14) | ((i12 >> 9) & 112));
            HorizontalMonthsList(lazyListStateRememberLazyListState, l10, interfaceC9540l, interfaceC9540l2, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composerStartRestartGroup, ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | i13);
            composerStartRestartGroup.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$10(mutableState), ClipKt.clipToBounds(companion2), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new InterfaceC9545q() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    invoke((AnimatedVisibilityScope) obj2, (Composer) obj3, ((Number) obj4).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i14) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1193716082, i14, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1576)");
                    }
                    Strings.Companion companion5 = Strings.Companion;
                    final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_picker_year_picker_pane_title), composer2, 0);
                    Modifier.Companion companion6 = Modifier.Companion;
                    boolean zChanged3 = composer2.changed(strM29589getString2EP1pXo);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((SemanticsPropertyReceiver) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM29589getString2EP1pXo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion6, false, (InterfaceC9540l) objRememberedValue6, 1, null);
                    long j11 = j10;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final InterfaceC11122i0 interfaceC11122i0 = coroutineScope;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final C10405j c10405j2 = c10405j;
                    final CalendarMonth calendarMonth = month;
                    SelectableDates selectableDates2 = selectableDates;
                    CalendarModel calendarModel2 = calendarModel;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor4 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composer2);
                    Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyColumnMeasurePolicy3, companion7.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM27460paddingVpY3zN4$default3 = PaddingKt.m27460paddingVpY3zN4$default(SizeKt.m27494requiredHeight3ABfNKs(companion6, C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7) - DividerDefaults.INSTANCE.m28661getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
                    boolean zChanged4 = composer2.changed(mutableState2) | composer2.changedInstance(interfaceC11122i0) | composer2.changed(lazyListState) | composer2.changedInstance(c10405j2) | composer2.changed(calendarMonth);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        Object obj2 = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                            @InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", m26211f = "DatePicker.kt", m26212l = {1597}, m26213m = "invokeSuspend")
                            /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1 */
                            public static final class C21151 extends SuspendLambda implements InterfaceC9544p {
                                final /* synthetic */ CalendarMonth $displayedMonth;
                                final /* synthetic */ LazyListState $monthsListState;
                                final /* synthetic */ int $year;
                                final /* synthetic */ C10405j $yearRange;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C21151(LazyListState lazyListState, int i10, C10405j c10405j, CalendarMonth calendarMonth, InterfaceC11588c<? super C21151> interfaceC11588c) {
                                    super(2, interfaceC11588c);
                                    this.$monthsListState = lazyListState;
                                    this.$year = i10;
                                    this.$yearRange = c10405j;
                                    this.$displayedMonth = calendarMonth;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                    return new C21151(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, interfaceC11588c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object objM25952f = AbstractC11725a.m25952f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9924b.m20071b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int iM21733b = (((this.$year - this.$yearRange.m21733b()) * 12) + this.$displayedMonth.getMonth()) - 1;
                                        this.label = 1;
                                        if (LazyListState.scrollToItem$default(lazyListState, iM21733b, 0, this, 2, null) == objM25952f) {
                                            return objM25952f;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        AbstractC9924b.m20071b(obj);
                                    }
                                    return C10786q.f26013a;
                                }

                                @Override // p181hd.InterfaceC9544p
                                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                    return ((C21151) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                invoke(((Number) obj3).intValue());
                                return C10786q.f26013a;
                            }

                            public final void invoke(int i15) {
                                DatePickerKt.DatePickerContent$lambda$11(mutableState2, !DatePickerKt.DatePickerContent$lambda$10(r0));
                                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C21151(lazyListState, i15, c10405j2, calendarMonth, null), 3, null);
                            }
                        };
                        composer2.updateRememberedValue(obj2);
                        objRememberedValue7 = obj2;
                    }
                    DatePickerKt.YearPicker(modifierM27460paddingVpY3zN4$default3, j11, (InterfaceC9540l) objRememberedValue7, selectableDates2, calendarModel2, c10405j2, datePickerColors2, composer2, 6);
                    DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors2.m28590getDividerColor0d7_KjU(), composer2, 0, 3);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 200112, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.DatePickerContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    DatePickerKt.DatePickerContent(l10, j10, interfaceC9540l, interfaceC9540l2, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$11(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m28609DatePickerHeaderpc5RIQQ(final Modifier modifier, final InterfaceC9544p interfaceC9544p, final long j10, final long j11, final float f10, final InterfaceC9544p interfaceC9544p2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-996037719);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i11, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1621)");
            }
            Modifier modifierThen = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(interfaceC9544p != null ? SizeKt.m27490defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f10, 1, null) : Modifier.Companion);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(594325590);
            if (interfaceC9544p != null) {
                ProvideContentColorTextStyleKt.m29517ProvideContentColorTextStyle3JVO9M(j10, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1936268514, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
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
                            ComposerKt.traceEventStart(1936268514, i12, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1636)");
                        }
                        Alignment bottomStart = Alignment.Companion.getBottomStart();
                        InterfaceC9544p interfaceC9544p3 = interfaceC9544p;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        InterfaceC9529a constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer2);
                        Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        interfaceC9544p3.invoke(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 6) & 14) | 384);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j11)), interfaceC9544p2, composerStartRestartGroup, ProvidedValue.$stable | ((i11 >> 12) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
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
                    DatePickerKt.m28609DatePickerHeaderpc5RIQQ(modifier, interfaceC9544p, j10, j11, f10, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ExperimentalMaterial3Api
    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m28610DatePickerStatesHin3Bw(Locale locale, Long l10, Long l11, C10405j c10405j, int i10, SelectableDates selectableDates) {
        return new DatePickerStateImpl(l10, l11, c10405j, i10, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m28611DatePickerStatesHin3Bw$default(Locale locale, Long l10, Long l11, C10405j c10405j, int i10, SelectableDates selectableDates, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = null;
        }
        if ((i11 & 4) != 0) {
            l11 = l10;
        }
        if ((i11 & 8) != 0) {
            c10405j = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i11 & 16) != 0) {
            i10 = DisplayMode.Companion.m28660getPickerjFl4v0();
        }
        if ((i11 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        C10405j c10405j2 = c10405j;
        return m28610DatePickerStatesHin3Bw(locale, l10, l11, c10405j2, i10, selectableDates2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Day(final Modifier modifier, final boolean z10, final InterfaceC9529a interfaceC9529a, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final String str, final DatePickerColors datePickerColors, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            z15 = z11;
            i11 |= composerStartRestartGroup.changed(z15) ? 2048 : 1024;
        } else {
            z15 = z11;
        }
        if ((i10 & 24576) == 0) {
            z16 = z12;
            i11 |= composerStartRestartGroup.changed(z16) ? 16384 : 8192;
        } else {
            z16 = z12;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z13) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            z17 = z14;
            i11 |= composerStartRestartGroup.changed(z17) ? 1048576 : 524288;
        } else {
            z17 = z14;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            datePickerColors2 = datePickerColors;
            i11 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((805306368 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 536870912 : 268435456;
        }
        int i12 = i11;
        if ((306783379 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i12, -1, "androidx.compose.material3.Day (DatePicker.kt:1941)");
            }
            boolean z18 = (29360128 & i12) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z18 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32728getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (InterfaceC9540l) objRememberedValue);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Shape value = ShapesKt.getValue(datePickerModalTokens.getDateContainerShape(), composerStartRestartGroup, 6);
            int i13 = i12 >> 3;
            int i14 = i12 >> 15;
            long jM30888unboximpl = datePickerColors2.dayContainerColor$material3_release(z10, z16, z15, composerStartRestartGroup, (i14 & 7168) | (i13 & 14) | ((i12 >> 9) & 112) | (i13 & 896)).getValue().m30888unboximpl();
            int i15 = i12 >> 12;
            SurfaceKt.m29152Surfaced85dljk(z10, interfaceC9529a, modifierSemantics, z12, value, jM30888unboximpl, datePickerColors.dayContentColor$material3_release(z13, z10, z17, z12, composerStartRestartGroup, (i14 & 14) | (i12 & 112) | (i15 & 896) | (i13 & 7168) | (i15 & 57344)).getValue().m30888unboximpl(), 0.0f, 0.0f, (!z13 || z10) ? null : BorderStrokeKt.m26979BorderStrokecXLIe8U(datePickerModalTokens.m29760getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m28600getTodayDateBorderColor0d7_KjU()), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-2031780827, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.Day.2
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
                public final void invoke(Composer composer2, int i16) {
                    if ((i16 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2031780827, i16, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1980)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.INSTANCE;
                    Modifier modifierM27499requiredSizeVpY3zN4 = SizeKt.m27499requiredSizeVpY3zN4(companion, datePickerModalTokens2.m29759getDateStateLayerWidthD9Ej5fM(), datePickerModalTokens2.m29758getDateStateLayerHeightD9Ej5fM());
                    Alignment center = Alignment.Companion.getCenter();
                    InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM27499requiredSizeVpY3zN4);
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
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    interfaceC9544p2.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i13 & 7294, 48, 1408);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.Day.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i16) {
                    DatePickerKt.Day(modifier, z10, interfaceC9529a, z11, z12, z13, z14, str, datePickerColors, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m28612DisplayModeToggleButtontER2X8s(Modifier modifier, final int i10, final InterfaceC9540l interfaceC9540l, Composer composer, final int i11) {
        int i12;
        boolean z10;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1393846115);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i12, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)");
            }
            if (DisplayMode.m28655equalsimpl0(i10, DisplayMode.Companion.m28660getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(-411219388);
                z10 = (i12 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28620invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28620invoke() {
                            interfaceC9540l.invoke(DisplayMode.m28652boximpl(DisplayMode.Companion.m28659getInputjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifier2 = modifier;
                IconButtonKt.IconButton((InterfaceC9529a) objRememberedValue, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m28543getLambda1$material3_release(), composerStartRestartGroup, ((i12 << 3) & 112) | ProfileVerifier.CompilationStatus.f1974xf2722a21, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-410937381);
                z10 = (i12 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28621invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28621invoke() {
                            interfaceC9540l.invoke(DisplayMode.m28652boximpl(DisplayMode.Companion.m28660getPickerjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifier2 = modifier;
                IconButtonKt.IconButton((InterfaceC9529a) objRememberedValue2, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m28544getLambda2$material3_release(), composerStartRestartGroup, ((i12 << 3) & 112) | ProfileVerifier.CompilationStatus.f1974xf2722a21, 28);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    DatePickerKt.m28612DisplayModeToggleButtontER2X8s(modifier2, i10, interfaceC9540l, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalMonthsList(LazyListState lazyListState, final Long l10, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        Long l11;
        final InterfaceC9540l interfaceC9540l3;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Object datePickerKt$HorizontalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994757941);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l11 = l10;
            i11 |= composerStartRestartGroup.changed(l11) ? 32 : 16;
        } else {
            l11 = l10;
        }
        if ((i10 & 384) == 0) {
            interfaceC9540l3 = interfaceC9540l;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l3) ? 256 : 128;
        } else {
            interfaceC9540l3 = interfaceC9540l;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(c10405j) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            selectableDates2 = selectableDates;
            i11 |= composerStartRestartGroup.changed(selectableDates2) ? 8388608 : 4194304;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i10) == 0) {
            datePickerColors2 = datePickerColors;
            i11 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994757941, i11, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(c10405j);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(c10405j.m21733b(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final SelectableDates selectableDates3 = selectableDates2;
            final Long l12 = l11;
            int i12 = i11;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1
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
                public final void invoke(Composer composer2, int i13) {
                    if ((i13 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1504086906, i13, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1666)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.1
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.2
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState3, null, composer2, 384, 2);
                    boolean zChangedInstance = composer2.changedInstance(c10405j) | composer2.changedInstance(calendarModel) | composer2.changed(calendarMonth) | composer2.changed(interfaceC9540l3) | composer2.changed(today) | composer2.changed(l12) | composer2.changedInstance(datePickerFormatter) | composer2.changed(selectableDates3) | composer2.changed(datePickerColors3);
                    final C10405j c10405j2 = c10405j;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final InterfaceC9540l interfaceC9540l4 = interfaceC9540l3;
                    final CalendarDate calendarDate = today;
                    final Long l13 = l12;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LazyListScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(c10405j2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final InterfaceC9540l interfaceC9540l5 = interfaceC9540l4;
                                final CalendarDate calendarDate2 = calendarDate;
                                final Long l14 = l13;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(1137566309, true, new InterfaceC9546r() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p181hd.InterfaceC9546r
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                        return C10786q.f26013a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(LazyItemScope lazyItemScope, int i14, Composer composer3, int i15) {
                                        int i16;
                                        if ((i15 & 6) == 0) {
                                            i16 = i15 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i16 = i15;
                                        }
                                        if ((i15 & 48) == 0) {
                                            i16 |= composer3.changed(i14) ? 32 : 16;
                                        }
                                        if ((i16 & 147) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1137566309, i16, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1678)");
                                        }
                                        CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i14);
                                        Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                                        InterfaceC9540l interfaceC9540l6 = interfaceC9540l5;
                                        CalendarDate calendarDate3 = calendarDate2;
                                        Long l15 = l14;
                                        DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                        SelectableDates selectableDates6 = selectableDates5;
                                        DatePickerColors datePickerColors6 = datePickerColors5;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillParentMaxWidth$default);
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
                                        DatePickerKt.Month(calendarMonthPlusMonths, interfaceC9540l6, calendarDate3.getUtcTimeMillis(), l15, null, null, datePickerFormatter4, selectableDates6, datePickerColors6, composer3, 221184);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    LazyDslKt.LazyRow(modifierSemantics$default, lazyListState3, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3_release, false, (InterfaceC9540l) objRememberedValue2, composer2, 0, Opcodes.NEWARRAY);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i13 = i12 & 14;
            boolean zChangedInstance = (i13 == 4) | ((i12 & 7168) == 2048) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(c10405j);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, interfaceC9540l2, calendarModel, c10405j, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (InterfaceC9544p) datePickerKt$HorizontalMonthsList$2$1, composerStartRestartGroup, i13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.3
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
                    DatePickerKt.HorizontalMonthsList(lazyListState2, l10, interfaceC9540l, interfaceC9540l2, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0315  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Month(final androidx.compose.material3.internal.CalendarMonth r30, final p181hd.InterfaceC9540l r31, final long r32, final java.lang.Long r34, final java.lang.Long r35, final androidx.compose.material3.SelectedRangeInfo r36, final androidx.compose.material3.DatePickerFormatter r37, final androidx.compose.material3.SelectableDates r38, final androidx.compose.material3.DatePickerColors r39, androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.Month(androidx.compose.material3.internal.CalendarMonth, hd.l, long, java.lang.Long, java.lang.Long, androidx.compose.material3.SelectedRangeInfo, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MonthsNavigation(final Modifier modifier, final boolean z10, final boolean z11, final boolean z12, final String str, final InterfaceC9529a interfaceC9529a, final InterfaceC9529a interfaceC9529a2, final InterfaceC9529a interfaceC9529a3, DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        InterfaceC9529a interfaceC9529a4;
        InterfaceC9529a interfaceC9529a5;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-773929258);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(z12) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            interfaceC9529a4 = interfaceC9529a2;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a4) ? 1048576 : 524288;
        } else {
            interfaceC9529a4 = interfaceC9529a2;
        }
        if ((12582912 & i10) == 0) {
            interfaceC9529a5 = interfaceC9529a3;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a5) ? 8388608 : 4194304;
        } else {
            interfaceC9529a5 = interfaceC9529a3;
        }
        if ((100663296 & i10) == 0) {
            datePickerColors2 = datePickerColors;
            i11 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773929258, i11, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)");
            }
            Modifier modifierM27494requiredHeight3ABfNKs = SizeKt.m27494requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(z12 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27494requiredHeight3ABfNKs);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final InterfaceC9529a interfaceC9529a6 = interfaceC9529a4;
            final InterfaceC9529a interfaceC9529a7 = interfaceC9529a5;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(datePickerColors2.m28592getNavigationContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-962805198, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
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
                        ComposerKt.traceEventStart(-962805198, i12, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2163)");
                    }
                    InterfaceC9529a interfaceC9529a8 = interfaceC9529a7;
                    boolean z13 = z12;
                    final String str2 = str;
                    DatePickerKt.YearPickerMenuButton(interfaceC9529a8, z13, null, ComposableLambdaKt.rememberComposableLambda(1377272806, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
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
                                ComposerKt.traceEventStart(1377272806, i13, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2167)");
                            }
                            String str3 = str2;
                            Modifier.Companion companion2 = Modifier.Companion;
                            boolean zChanged = composer3.changed(str3);
                            final String str4 = str2;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((SemanticsPropertyReceiver) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m32746setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m32720getPolite0phEisY());
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            TextKt.m29301Text4IGK_g(str3, SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC9540l) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer3, 0, 0, 131068);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 4);
                    if (!z12) {
                        InterfaceC9529a interfaceC9529a9 = interfaceC9529a6;
                        boolean z14 = z11;
                        InterfaceC9529a interfaceC9529a10 = interfaceC9529a;
                        boolean z15 = z10;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        InterfaceC9529a constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer2);
                        Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        ComposableSingletons$DatePickerKt composableSingletons$DatePickerKt = ComposableSingletons$DatePickerKt.INSTANCE;
                        IconButtonKt.IconButton(interfaceC9529a9, null, z14, null, null, composableSingletons$DatePickerKt.m28545getLambda3$material3_release(), composer2, ProfileVerifier.CompilationStatus.f1974xf2722a21, 26);
                        IconButtonKt.IconButton(interfaceC9529a10, null, z15, null, null, composableSingletons$DatePickerKt.m28546getLambda4$material3_release(), composer2, ProfileVerifier.CompilationStatus.f1974xf2722a21, 26);
                        composer2.endNode();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final DatePickerColors datePickerColors3 = datePickerColors2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.MonthsNavigation.2
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
                    DatePickerKt.MonthsNavigation(modifier, z10, z11, z12, str, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, datePickerColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    public static final void m28613SwitchableDateEntryContentd7iavvg(final Long l10, final long j10, final int i10, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i11) {
        int i12;
        InterfaceC9540l interfaceC9540l3;
        InterfaceC9540l interfaceC9540l4;
        CalendarModel calendarModel2;
        C10405j c10405j2;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-895379221);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            interfaceC9540l3 = interfaceC9540l;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l3) ? 2048 : 1024;
        } else {
            interfaceC9540l3 = interfaceC9540l;
        }
        if ((i11 & 24576) == 0) {
            interfaceC9540l4 = interfaceC9540l2;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l4) ? 16384 : 8192;
        } else {
            interfaceC9540l4 = interfaceC9540l2;
        }
        if ((196608 & i11) == 0) {
            calendarModel2 = calendarModel;
            i12 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 131072 : 65536;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((1572864 & i11) == 0) {
            c10405j2 = c10405j;
            i12 |= composerStartRestartGroup.changedInstance(c10405j2) ? 1048576 : 524288;
        } else {
            c10405j2 = c10405j;
        }
        if ((12582912 & i11) == 0) {
            i12 |= (16777216 & i11) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            selectableDates2 = selectableDates;
            i12 |= composerStartRestartGroup.changed(selectableDates2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((805306368 & i11) == 0) {
            datePickerColors2 = datePickerColors;
            i12 |= composerStartRestartGroup.changed(datePickerColors2) ? 536870912 : 268435456;
        } else {
            datePickerColors2 = datePickerColors;
        }
        int i13 = i12;
        if ((306783379 & i13) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895379221, i13, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)");
            }
            final int i14 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(48));
            DisplayMode displayModeM28652boximpl = DisplayMode.m28652boximpl(i10);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(i14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final ContentTransform invoke(AnimatedContentTransitionScope<DisplayMode> animatedContentTransitionScope) {
                        ContentTransform contentTransform;
                        if (DisplayMode.m28655equalsimpl0(animatedContentTransitionScope.getTargetState().m28658unboximpl(), DisplayMode.Companion.m28659getInputjFl4v0())) {
                            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.1
                                public final Integer invoke(int i15) {
                                    return Integer.valueOf(i15);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null));
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
                            final int i15 = i14;
                            contentTransform = AnimatedContentKt.togetherWith(enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final Integer invoke(int i16) {
                                    return Integer.valueOf(i15);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null)));
                        } else {
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 50, null, 5, null);
                            final int i16 = i14;
                            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }

                                public final Integer invoke(int i17) {
                                    return Integer.valueOf(i16);
                                }
                            }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically$default(null, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.4
                                public final Integer invoke(int i17) {
                                    return Integer.valueOf(i17);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null)));
                        }
                        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.5
                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m28623invokeTemP2vQ(((IntSize) obj).m33676unboximpl(), ((IntSize) obj2).m33676unboximpl());
                            }

                            /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                            public final FiniteAnimationSpec<IntSize> m28623invokeTemP2vQ(long j11, long j12) {
                                return AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier(), 2, null);
                            }
                        }));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final InterfaceC9540l interfaceC9540l5 = interfaceC9540l3;
            final InterfaceC9540l interfaceC9540l6 = interfaceC9540l4;
            final CalendarModel calendarModel3 = calendarModel2;
            final C10405j c10405j3 = c10405j2;
            final SelectableDates selectableDates3 = selectableDates2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            composer2 = composerStartRestartGroup;
            AnimatedContentKt.AnimatedContent(displayModeM28652boximpl, modifierSemantics$default, (InterfaceC9540l) objRememberedValue, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(-459778869, true, new InterfaceC9546r() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    m28624invokefYndouo((AnimatedContentScope) obj, ((DisplayMode) obj2).m28658unboximpl(), (Composer) obj3, ((Number) obj4).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* renamed from: invoke-fYndouo, reason: not valid java name */
                public final void m28624invokefYndouo(AnimatedContentScope animatedContentScope, int i15, Composer composer3, int i16) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-459778869, i16, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1452)");
                    }
                    DisplayMode.Companion companion = DisplayMode.Companion;
                    if (DisplayMode.m28655equalsimpl0(i15, companion.m28660getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-1870116901);
                        DatePickerKt.DatePickerContent(l10, j10, interfaceC9540l5, interfaceC9540l6, calendarModel3, c10405j3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m28655equalsimpl0(i15, companion.m28659getInputjFl4v0())) {
                        composer3.startReplaceGroup(-1870098348);
                        DateInputKt.DateInputContent(l10, interfaceC9540l5, calendarModel3, c10405j3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2138080579);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i13 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i15) {
                    DatePickerKt.m28613SwitchableDateEntryContentd7iavvg(l10, j10, i10, interfaceC9540l, interfaceC9540l2, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i10) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i11, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i12 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i13 = i12; i13 < size; i13++) {
                arrayList.add(weekdayNames.get(i13));
            }
            ?? r82 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList.add(weekdayNames.get(i14));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m27490defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(396197267);
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                final Pair pair = (Pair) arrayList.get(i15);
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChanged = composerStartRestartGroup.changed(pair);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) pair.m20051f());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (InterfaceC9540l) objRememberedValue);
                float f10 = RecommendedSizeForAccessibility;
                Modifier modifierM27507sizeVpY3zN4 = SizeKt.m27507sizeVpY3zN4(modifierClearAndSetSemantics, f10, f10);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), r82);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r82);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27507sizeVpY3zN4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                InterfaceC9529a constructor2 = companion3.getConstructor();
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
                Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer3 = composerStartRestartGroup;
                TextKt.m29301Text4IGK_g((String) pair.m20052g(), SizeKt.wrapContentSize$default(companion2, null, false, 3, null), datePickerColors.m28601getWeekdayContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m33378boximpl(TextAlign.Companion.m33385getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC9540l) null, value, composer3, 48, 0, 65016);
                composer3.endNode();
                i15++;
                composerStartRestartGroup = composer3;
                arrayList = arrayList;
                r82 = 0;
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer4, int i16) {
                    DatePickerKt.WeekDays(datePickerColors, calendarModel, composer4, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Year(final Modifier modifier, final boolean z10, final boolean z11, final InterfaceC9529a interfaceC9529a, final boolean z12, final String str, final DatePickerColors datePickerColors, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Object objM26979BorderStrokecXLIe8U;
        Composer composerStartRestartGroup = composer.startRestartGroup(238547184);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238547184, i11, -1, "androidx.compose.material3.Year (DatePicker.kt:2097)");
            }
            int i12 = i11 & 112;
            boolean z13 = ((i11 & 896) == 256) | (i12 == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z13 || objRememberedValue == Composer.Companion.getEmpty()) {
                objM26979BorderStrokecXLIe8U = (!z11 || z10) ? null : BorderStrokeKt.m26979BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m29760getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m28600getTodayDateBorderColor0d7_KjU());
                composerStartRestartGroup.updateRememberedValue(objM26979BorderStrokecXLIe8U);
            } else {
                objM26979BorderStrokecXLIe8U = objRememberedValue;
            }
            BorderStroke borderStroke = (BorderStroke) objM26979BorderStrokecXLIe8U;
            boolean z14 = (458752 & i11) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z14 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32728getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i13 = i11 >> 3;
            int i14 = i13 & 14;
            int i15 = i11 >> 9;
            int i16 = i11 >> 6;
            SurfaceKt.m29152Surfaced85dljk(z10, interfaceC9529a, SemanticsModifierKt.semantics(modifier, true, (InterfaceC9540l) objRememberedValue2), z12, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z10, z12, composerStartRestartGroup, i14 | (i15 & 112) | ((i11 >> 12) & 896)).getValue().m30888unboximpl(), datePickerColors.yearContentColor$material3_release(z11, z10, z12, composerStartRestartGroup, (i16 & 14) | i12 | (i16 & 896) | (i15 & 7168)).getValue().m30888unboximpl(), 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-1573188346, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.Year.2
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
                public final void invoke(Composer composer2, int i17) {
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1573188346, i17, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2130)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    Alignment center = Alignment.Companion.getCenter();
                    InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    interfaceC9544p2.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i14 | (i16 & 112) | (i13 & 7168), 48, 1408);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.Year.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i17) {
                    DatePickerKt.Year(modifier, z10, z11, interfaceC9529a, z12, str, datePickerColors, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void YearPicker(final Modifier modifier, final long j10, final InterfaceC9540l interfaceC9540l, final SelectableDates selectableDates, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        Modifier modifier2;
        int i11;
        InterfaceC9540l interfaceC9540l2;
        SelectableDates selectableDates2;
        CalendarModel calendarModel2;
        C10405j c10405j2;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1286899812);
        if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            interfaceC9540l2 = interfaceC9540l;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 256 : 128;
        } else {
            interfaceC9540l2 = interfaceC9540l;
        }
        if ((i10 & 3072) == 0) {
            selectableDates2 = selectableDates;
            i11 |= composerStartRestartGroup.changed(selectableDates2) ? 2048 : 1024;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i10 & 24576) == 0) {
            calendarModel2 = calendarModel;
            i11 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 16384 : 8192;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((196608 & i10) == 0) {
            c10405j2 = c10405j;
            i11 |= composerStartRestartGroup.changedInstance(c10405j2) ? 131072 : 65536;
        } else {
            c10405j2 = c10405j;
        }
        if ((1572864 & i10) == 0) {
            datePickerColors2 = datePickerColors;
            i11 |= composerStartRestartGroup.changed(datePickerColors2) ? 1048576 : 524288;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286899812, i11, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)");
            }
            final Modifier modifier3 = modifier2;
            final InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
            final SelectableDates selectableDates3 = selectableDates2;
            final CalendarModel calendarModel3 = calendarModel2;
            final C10405j c10405j3 = c10405j2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1
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
                        ComposerKt.traceEventStart(1301915789, i12, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2005)");
                    }
                    CalendarModel calendarModel4 = calendarModel3;
                    final int year = calendarModel4.getMonth(calendarModel4.getToday()).getYear();
                    final int year2 = calendarModel3.getMonth(j10).getYear();
                    final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - c10405j3.m21733b()) - 3), 0, composer2, 0, 2);
                    long jM28579getContainerColor0d7_KjU = datePickerColors3.m28579getContainerColor0d7_KjU();
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    final InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    Strings.Companion companion2 = Strings.Companion;
                    final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_picker_scroll_to_earlier_years), composer2, 0);
                    final String strM29589getString2EP1pXo2 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_picker_scroll_to_later_years), composer2, 0);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m26950backgroundbw27NRU$default(modifier3, jM28579getContainerColor0d7_KjU, null, 2, null), false, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM27339spacedBy0680j_4 = arrangement.m27339spacedBy0680j_4(DatePickerKt.YearsVerticalPadding);
                    boolean zChangedInstance = composer2.changedInstance(c10405j3) | composer2.changed(lazyGridStateRememberLazyGridState) | composer2.changedInstance(coroutineScope) | composer2.changed(strM29589getString2EP1pXo) | composer2.changed(strM29589getString2EP1pXo2) | composer2.changed(year2) | composer2.changed(year) | composer2.changed(interfaceC9540l3) | composer2.changed(selectableDates3) | composer2.changed(datePickerColors3);
                    final C10405j c10405j4 = c10405j3;
                    final InterfaceC9540l interfaceC9540l4 = interfaceC9540l3;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        Object obj = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LazyGridScope) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(LazyGridScope lazyGridScope) {
                                int iM23934f0 = AbstractC10947g0.m23934f0(c10405j4);
                                final C10405j c10405j5 = c10405j4;
                                final LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                                final InterfaceC11122i0 interfaceC11122i0 = coroutineScope;
                                final String str = strM29589getString2EP1pXo;
                                final String str2 = strM29589getString2EP1pXo2;
                                final int i13 = year2;
                                final int i14 = year;
                                final InterfaceC9540l interfaceC9540l5 = interfaceC9540l4;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyGridScope.items$default(lazyGridScope, iM23934f0, null, null, null, ComposableLambdaKt.composableLambdaInstance(1040623618, true, new InterfaceC9546r() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p181hd.InterfaceC9546r
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        invoke((LazyGridItemScope) obj2, ((Number) obj3).intValue(), (Composer) obj4, ((Number) obj5).intValue());
                                        return C10786q.f26013a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(LazyGridItemScope lazyGridItemScope, final int i15, Composer composer3, int i16) {
                                        int i17;
                                        if ((i16 & 48) == 0) {
                                            i17 = i16 | (composer3.changed(i15) ? 32 : 16);
                                        } else {
                                            i17 = i16;
                                        }
                                        if ((i17 & 145) == 144 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1040623618, i17, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2034)");
                                        }
                                        final int iM21733b = i15 + c10405j5.m21733b();
                                        final String localString$default = CalendarLocale_jvmKt.toLocalString$default(iM21733b, 0, 0, false, 7, null);
                                        Modifier.Companion companion3 = Modifier.Companion;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                        Modifier modifierM27499requiredSizeVpY3zN4 = SizeKt.m27499requiredSizeVpY3zN4(companion3, datePickerModalTokens.m29767getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m29766getSelectionYearContainerHeightD9Ej5fM());
                                        boolean zChanged = ((i17 & 112) == 32) | composer3.changed(lazyGridState) | composer3.changedInstance(interfaceC11122i0) | composer3.changed(str) | composer3.changed(str2);
                                        final LazyGridState lazyGridState2 = lazyGridState;
                                        final InterfaceC11122i0 interfaceC11122i02 = interfaceC11122i0;
                                        final String str3 = str;
                                        final String str4 = str2;
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                            InterfaceC9540l interfaceC9540l6 = new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // p181hd.InterfaceC9540l
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SemanticsPropertyReceiver) obj2);
                                                    return C10786q.f26013a;
                                                }

                                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    LazyGridItemInfo lazyGridItemInfo;
                                                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, (lazyGridState2.getFirstVisibleItemIndex() == i15 || ((lazyGridItemInfo = (LazyGridItemInfo) AbstractC10947g0.m23957z0(lazyGridState2.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i15)) ? DatePickerKt.customScrollActions(lazyGridState2, interfaceC11122i02, str3, str4) : AbstractC10978w.m24136n());
                                                }
                                            };
                                            composer3.updateRememberedValue(interfaceC9540l6);
                                            objRememberedValue3 = interfaceC9540l6;
                                        }
                                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM27499requiredSizeVpY3zN4, false, (InterfaceC9540l) objRememberedValue3, 1, null);
                                        boolean z10 = iM21733b == i13;
                                        boolean z11 = iM21733b == i14;
                                        boolean zChanged2 = composer3.changed(interfaceC9540l5) | composer3.changed(iM21733b);
                                        final InterfaceC9540l interfaceC9540l7 = interfaceC9540l5;
                                        Object objRememberedValue4 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                            objRememberedValue4 = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // p181hd.InterfaceC9529a
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m28625invoke();
                                                    return C10786q.f26013a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m28625invoke() {
                                                    interfaceC9540l7.invoke(Integer.valueOf(iM21733b));
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue4);
                                        }
                                        InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue4;
                                        boolean zIsSelectableYear = selectableDates5.isSelectableYear(iM21733b);
                                        Strings.Companion companion4 = Strings.Companion;
                                        String str5 = String.format(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_picker_navigate_to_year_description), composer3, 0), Arrays.copyOf(new Object[]{localString$default}, 1));
                                        AbstractC9979u.m20293f(str5, "format(this, *args)");
                                        DatePickerKt.Year(modifierSemantics$default2, z10, z11, interfaceC9529a, zIsSelectableYear, str5, datePickerColors5, ComposableLambdaKt.rememberComposableLambda(882189459, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3
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
                                            public final void invoke(Composer composer4, int i18) {
                                                if ((i18 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(882189459, i18, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2074)");
                                                }
                                                TextKt.m29301Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3.1
                                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // p181hd.InterfaceC9540l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SemanticsPropertyReceiver) obj2);
                                                        return C10786q.f26013a;
                                                    }
                                                }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m33378boximpl(TextAlign.Companion.m33385getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer4, 0, 0, 130556);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582912);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 14, null);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue2 = obj;
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierSemantics$default, lazyGridStateRememberLazyGridState, null, false, horizontalOrVerticalM27339spacedBy0680j_4, spaceEvenly, null, false, (InterfaceC9540l) objRememberedValue2, composer2, 1769472, 408);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.2
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
                    DatePickerKt.YearPicker(modifier, j10, interfaceC9540l, selectableDates, calendarModel, c10405j, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void YearPickerMenuButton(final p181hd.InterfaceC9529a r19, final boolean r20, androidx.compose.p014ui.Modifier r21, final p181hd.InterfaceC9544p r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(hd.a, boolean, androidx.compose.ui.Modifier, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyGridState lazyGridState, final InterfaceC11122i0 interfaceC11122i0, String str, String str2) {
        return AbstractC10978w.m24139q(new CustomAccessibilityAction(str, new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1

            @InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", m26211f = "DatePicker.kt", m26212l = {2242}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1 */
            public static final class C21401 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21401(LazyGridState lazyGridState, InterfaceC11588c<? super C21401> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C21401(this.$state, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() - 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C21401) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                boolean z10;
                if (lazyGridState.getCanScrollBackward()) {
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C21401(lazyGridState, null), 3, null);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }), new CustomAccessibilityAction(str2, new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1

            @InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", m26211f = "DatePicker.kt", m26212l = {2250}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1 */
            public static final class C21391 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21391(LazyGridState lazyGridState, InterfaceC11588c<? super C21391> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C21391(this.$state, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() + 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C21391) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                boolean z10;
                if (lazyGridState.getCanScrollForward()) {
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C21391(lazyGridState, null), 3, null);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }));
    }

    @Composable
    private static final String dayContentDescription(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i10, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)");
        }
        StringBuilder sb2 = new StringBuilder();
        composer.startReplaceGroup(-647730741);
        if (z10) {
            if (z12) {
                composer.startReplaceGroup(-647727716);
                Strings.Companion companion = Strings.Companion;
                sb2.append(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z13) {
                composer.startReplaceGroup(-647723718);
                Strings.Companion companion2 = Strings.Companion;
                sb2.append(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z14) {
                composer.startReplaceGroup(-647719783);
                Strings.Companion companion3 = Strings.Companion;
                sb2.append(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1395591750);
                composer.endReplaceGroup();
            }
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-647717033);
        if (z11) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Strings.Companion companion4 = Strings.Companion;
            sb2.append(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_picker_today_description), composer, 0));
        }
        composer.endReplaceGroup();
        String string = sb2.length() == 0 ? null : sb2.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final int numberOfMonthsInRange(C10405j c10405j) {
        return ((c10405j.m21734c() - c10405j.m21733b()) + 1) * 12;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m28615rememberDatePickerStateEU0dCGE(Long l10, Long l11, C10405j c10405j, int i10, SelectableDates selectableDates, Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            l10 = null;
        }
        final Long l12 = l10;
        final Long l13 = (i12 & 2) != 0 ? l12 : l11;
        if ((i12 & 4) != 0) {
            c10405j = DatePickerDefaults.INSTANCE.getYearRange();
        }
        final C10405j c10405j2 = c10405j;
        if ((i12 & 8) != 0) {
            i10 = DisplayMode.Companion.m28660getPickerjFl4v0();
        }
        final int i13 = i10;
        if ((i12 & 16) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        final SelectableDates selectableDates2 = selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i11, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.Companion.Saver(selectableDates2, localeDefaultLocale);
        boolean zChangedInstance = ((((57344 & i11) ^ 24576) > 16384 && composer.changed(selectableDates2)) || (i11 & 24576) == 16384) | ((((i11 & 14) ^ 6) > 4 && composer.changed(l12)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(l13)) || (i11 & 48) == 32) | composer.changedInstance(c10405j2) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(i13)) || (i11 & 3072) == 2048) | composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt$rememberDatePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final DatePickerStateImpl invoke() {
                    return new DatePickerStateImpl(l12, l13, c10405j2, i13, selectableDates2, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        datePickerStateImpl.setSelectableDates(selectableDates2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerStateImpl;
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final InterfaceC9540l interfaceC9540l, final CalendarModel calendarModel, final C10405j c10405j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
            }
        }).collect(new InterfaceC11595d() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.3
            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c2) {
                return emit(((Number) obj).intValue(), (InterfaceC11588c<? super C10786q>) interfaceC11588c2);
            }

            public final Object emit(int i10, InterfaceC11588c<? super C10786q> interfaceC11588c2) {
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
                interfaceC9540l.invoke(AbstractC11826a.m26209d(calendarModel.getMonth(c10405j.m21733b() + firstVisibleItemIndex, (lazyListState.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return C10786q.f26013a;
            }
        }, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }
}

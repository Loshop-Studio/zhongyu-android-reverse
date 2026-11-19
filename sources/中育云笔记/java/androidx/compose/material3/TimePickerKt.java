package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.ZIndexModifierKt;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.input.key.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.KeyInputModifierKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.KeyboardType;
import androidx.compose.p014ui.text.input.PlatformImeOptions;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.p014ui.unit.DpOffset;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
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
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p310qd.AbstractC10790b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = C3186Dp.m33501constructorimpl(101);
    private static final float InnerCircleRadius = C3186Dp.m33501constructorimpl(69);
    private static final float ClockDisplayBottomMargin = C3186Dp.m33501constructorimpl(36);
    private static final float SupportLabelTop = C3186Dp.m33501constructorimpl(7);
    private static final float MaxDistance = C3186Dp.m33501constructorimpl(74);
    private static final float MinimumInteractiveSize = C3186Dp.m33501constructorimpl(48);
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f10 = 24;
        ClockFaceBottomMargin = C3186Dp.m33501constructorimpl(f10);
        DisplaySeparatorWidth = C3186Dp.m33501constructorimpl(f10);
        TimeInputBottomPadding = C3186Dp.m33501constructorimpl(f10);
        IntList intListIntListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListIntListOf;
        MutableIntList mutableIntList = new MutableIntList(intListIntListOf.getSize());
        int[] iArr = intListIntListOf.content;
        int i10 = intListIntListOf._size;
        for (int i11 = 0; i11 < i10; i11++) {
            mutableIntList.add((iArr[i11] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = C3186Dp.m33501constructorimpl(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m29327CircularLayoutuFdPcIQ(Modifier modifier, final float f10, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
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
            i12 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i12, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            boolean z10 = (i12 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j10) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float fMo27099toPx0680j_4 = measureScope.mo27099toPx0680j_4(f10);
                        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size; i15++) {
                            Measurable measurable3 = list.get(i15);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            arrayList2.add(((Measurable) arrayList.get(i16)).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i17);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i17++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i14 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i14);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i14++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        Placeable placeableMo32229measureBRTryo0 = measurable5 != null ? measurable5.mo32229measureBRTryo0(jM33444copyZbe2FdA$default) : null;
                        final Placeable placeableMo32229measureBRTryo02 = measurable6 != null ? measurable6.mo32229measureBRTryo0(jM33444copyZbe2FdA$default) : null;
                        final Placeable placeable = placeableMo32229measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList2;
                                long j11 = j10;
                                float f11 = fMo27099toPx0680j_4;
                                float f12 = size5;
                                int size6 = list2.size();
                                int i18 = 0;
                                while (i18 < size6) {
                                    Placeable placeable3 = list2.get(i18);
                                    double d10 = f11;
                                    double d11 = (i18 * f12) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, AbstractC9719c.m19281c((Math.cos(d11) * d10) + ((Constraints.m33454getMaxWidthimpl(j11) / 2) - (placeable3.getWidth() / 2))), AbstractC9719c.m19281c((d10 * Math.sin(d11)) + ((Constraints.m33453getMaxHeightimpl(j11) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
                                    i18++;
                                    list2 = list2;
                                    j11 = j11;
                                }
                                Placeable placeable4 = placeableMo32229measureBRTryo02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, (Constraints.m33456getMinWidthimpl(j10) - placeableMo32229measureBRTryo02.getWidth()) / 2, (Constraints.m33455getMinHeightimpl(j10) - placeableMo32229measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i14 = ((i12 >> 6) & 14) | ((i12 << 3) & 112);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            int i15 = ((i14 << 6) & 896) | 6;
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
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
                    TimePickerKt.m29327CircularLayoutuFdPcIQ(modifier2, f10, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i11, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composerStartRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
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
                        ComposerKt.traceEventStart(-477913269, i12, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
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
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                    Modifier modifierM27507sizeVpY3zN4 = SizeKt.m27507sizeVpY3zN4(companion, timePickerTokens.m30165getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m30164getTimeSelectorContainerHeightD9Ej5fM());
                    int hourForDisplay = TimePickerKt.getHourForDisplay(timePickerState2);
                    TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.Companion;
                    TimePickerKt.m29330TimeSelectorSAnMeKU(modifierM27507sizeVpY3zN4, hourForDisplay, timePickerState2, companion3.m29362getHouryecRtBI(), timePickerColors2, composer2, 3078);
                    TimePickerKt.DisplaySeparator(SizeKt.m27507sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m30161getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m29330TimeSelectorSAnMeKU(SizeKt.m27507sizeVpY3zN4(companion, timePickerTokens.m30165getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m30164getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m29363getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
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
                    TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1170157036);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, i11, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.Crossfade(analogTimePickerState.getClockFaceValues(), drawSelector(SizeKt.m27505size3ABfNKs(BackgroundKt.m26949backgroundbw27NRU(Modifier.Companion, timePickerColors.m29307getClockDialColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z10, analogTimePickerState.mo28338getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m30153getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors), AnimationSpecKt.tween$default(200, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new InterfaceC9545q() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((IntList) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(final IntList intList, Composer composer2, int i12) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022006568, i12, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m27505size3ABfNKs(Modifier.Companion, TimePickerTokens.INSTANCE.m30153getClockDialContainerSizeD9Ej5fM()), false, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.1
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    float f10 = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                    final boolean z11 = z10;
                    TimePickerKt.m29327CircularLayoutuFdPcIQ(modifierSemantics$default, f10, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2
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
                                ComposerKt.traceEventStart(-320307952, i13, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                            }
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(timePickerColors2.m29305clockDialContentColorvNxB06k$material3_release(false)));
                            final IntList intList2 = intList;
                            final AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                            final boolean z12 = z11;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1992872400, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
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
                                public final void invoke(Composer composer4, int i14) {
                                    if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1992872400, i14, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.startReplaceGroup(1547046870);
                                    int size = intList2.getSize();
                                    AnalogTimePickerState analogTimePickerState4 = analogTimePickerState3;
                                    IntList intList3 = intList2;
                                    boolean z13 = z12;
                                    for (final int i15 = 0; i15 < size; i15++) {
                                        int i16 = (!analogTimePickerState4.is24hour() || TimePickerSelectionMode.m29358equalsimpl0(analogTimePickerState4.mo28338getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI())) ? intList3.get(i15) : intList3.get(i15) % 12;
                                        Modifier.Companion companion = Modifier.Companion;
                                        boolean zChanged = composer4.changed(i15);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                            objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i15);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        boolean z14 = z13;
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (InterfaceC9540l) objRememberedValue, 1, null), analogTimePickerState4, i16, z14, composer4, 0);
                                        z13 = z14;
                                    }
                                    composer4.endReplaceGroup();
                                    if (TimePickerSelectionMode.m29358equalsimpl0(analogTimePickerState3.mo28338getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m29362getHouryecRtBI()) && analogTimePickerState3.is24hour()) {
                                        Modifier modifierM26949backgroundbw27NRU = BackgroundKt.m26949backgroundbw27NRU(SizeKt.m27505size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m30153getClockDialContainerSizeD9Ej5fM()), Color.Companion.m30913getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                        float f11 = TimePickerKt.InnerCircleRadius;
                                        final AnalogTimePickerState analogTimePickerState5 = analogTimePickerState3;
                                        final boolean z15 = z12;
                                        TimePickerKt.m29327CircularLayoutuFdPcIQ(modifierM26949backgroundbw27NRU, f11, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
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
                                            public final void invoke(Composer composer5, int i17) {
                                                if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i17, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.getSize();
                                                AnalogTimePickerState analogTimePickerState6 = analogTimePickerState5;
                                                boolean z16 = z15;
                                                for (final int i18 = 0; i18 < size2; i18++) {
                                                    int i19 = TimePickerKt.ExtraHours.get(i18);
                                                    Modifier.Companion companion2 = Modifier.Companion;
                                                    boolean zChanged2 = composer5.changed(i18);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i18);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC9540l) objRememberedValue2, 1, null), analogTimePickerState6, i19, z16, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
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
                    TimePickerKt.ClockFace(analogTimePickerState, timePickerColors, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockText(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i10, final boolean z10, Composer composer, final int i11) {
        int i12;
        Modifier modifier2;
        boolean z11;
        ?? r15;
        Alignment alignment;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206784607);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i12, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composerStartRestartGroup, 6);
            final float fMo27099toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(MaxDistance);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m30626boximpl(Offset.Companion.m30653getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m33620boximpl(IntOffset.Companion.m33640getZeronOccac()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            final String strM29338numberContentDescriptiondSwYdS4 = m29338numberContentDescriptiondSwYdS4(analogTimePickerState.mo28338getSelectionyecRtBI(), analogTimePickerState.is24hour(), i10, composerStartRestartGroup, i12 & 896);
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i10, 0, 0, false, 7, null);
            boolean zM20289b = TimePickerSelectionMode.m29358equalsimpl0(analogTimePickerState.mo28338getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI()) ? AbstractC9979u.m20289b(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getMinute(), 0, 0, false, 7, null), localString$default) : AbstractC9979u.m20289b(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierM27505size3ABfNKs = SizeKt.m27505size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(LayoutCoordinates layoutCoordinates) {
                        MutableState<IntOffset> mutableState3 = mutableState2;
                        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
                        TimePickerKt.ClockText$lambda$33(mutableState3, parentCoordinates != null ? IntSizeKt.m33678getCenterozmzZPI(parentCoordinates.mo32237getSizeYbymL2g()) : IntOffset.Companion.m33640getZeronOccac());
                        TimePickerKt.ClockText$lambda$30(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m30667getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierFocusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM27505size3ABfNKs, (InterfaceC9540l) objRememberedValue4), false, null, 3, null);
            boolean zChangedInstance = ((i12 & 7168) == 2048) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(analogTimePickerState) | composerStartRestartGroup.changed(fMo27099toPx0680j_4) | composerStartRestartGroup.changed(zM20289b);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                modifier2 = modifierFocusable$default;
                final boolean z12 = zM20289b;
                z11 = true;
                r15 = 0;
                alignment = center;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
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
                        final InterfaceC11122i0 interfaceC11122i0 = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f10 = fMo27099toPx0680j_4;
                        final boolean z13 = z10;
                        final MutableState<Offset> mutableState3 = mutableState;
                        final MutableState<IntOffset> mutableState4 = mutableState2;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

                            @InterfaceC11829d(m26210c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", m26211f = "TimePicker.kt", m26212l = {1674}, m26213m = "invokeSuspend")
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
                                final /* synthetic */ AnalogTimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnalogTimePickerState analogTimePickerState, float f10, boolean z10, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                                    super(2, interfaceC11588c);
                                    this.$state = analogTimePickerState;
                                    this.$maxDist = f10;
                                    this.$autoSwitchToMinute = z10;
                                    this.$center$delegate = mutableState;
                                    this.$parentCenter$delegate = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                    return new AnonymousClass1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, interfaceC11588c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object objM25952f = AbstractC11725a.m25952f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9924b.m20071b(obj);
                                        AnalogTimePickerState analogTimePickerState = this.$state;
                                        float fM30637getXimpl = Offset.m30637getXimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float fM30638getYimpl = Offset.m30638getYimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float f10 = this.$maxDist;
                                        boolean z10 = this.$autoSwitchToMinute;
                                        long jClockText$lambda$32 = TimePickerKt.ClockText$lambda$32(this.$parentCenter$delegate);
                                        this.label = 1;
                                        if (TimePickerKt.m29339onTaprOwcSBo(analogTimePickerState, fM30637getXimpl, fM30638getYimpl, f10, z10, jClockText$lambda$32, this) == objM25952f) {
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
                                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public final Boolean invoke() {
                                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(analogTimePickerState2, f10, z13, mutableState3, mutableState4, null), 3, null);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC9540l);
                objRememberedValue5 = interfaceC9540l;
            } else {
                modifier2 = modifierFocusable$default;
                r15 = 0;
                alignment = center;
                z11 = true;
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier2, z11, (InterfaceC9540l) objRememberedValue5);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, r15);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r15);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
            Modifier.Companion companion3 = Modifier.Companion;
            boolean zChanged = composerStartRestartGroup.changed(strM29338numberContentDescriptiondSwYdS4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29338numberContentDescriptiondSwYdS4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m29301Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion3, (InterfaceC9540l) objRememberedValue6), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, value, composer2, 0, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i13) {
                    TimePickerKt.ClockText(modifier, analogTimePickerState, i10, z10, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().m30647unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j10) {
        mutableState.setValue(Offset.m30626boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$32(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m33638unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$33(MutableState<IntOffset> mutableState, long j10) {
        mutableState.setValue(IntOffset.m33620boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i11, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            TextStyle textStyleM32979copyp1EtxEg$default = TextStyle.m32979copyp1EtxEg$default((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m33385getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m33353getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m33374getBothEVpEnUU(), (AbstractC9972n) null), 0, 0, null, 15695871, null);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.1
                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C10786q.f26013a;
                }
            });
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m29301Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, textStyleM32979copyp1EtxEg$default, composer2, 6, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
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
                    TimePickerKt.DisplaySeparator(modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i11, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i11 & Opcodes.IAND);
            composerStartRestartGroup.startReplaceGroup(919638492);
            if (!timePickerState.is24hour()) {
                Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i12 = i11 << 3;
                HorizontalPeriodToggle(SizeKt.m27507sizeVpY3zN4(companion, timePickerTokens.m30159getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m30158getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i12 & 896) | (i12 & 112) | 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
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
                    TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i10) {
        int i11;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i11, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable = list.get(i12);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, measureScope.mo27093roundToPx0680j_4(TimePickerTokens.INSTANCE.m30160getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Measurable measurable2 = list.get(i13);
                                    if (!AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    arrayList2.add(((Measurable) arrayList.get(i14)).mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, Constraints.m33454getMaxWidthimpl(j10) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), arrayList2.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, arrayList2.get(0).getWidth() - (placeableMo32229measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC9979u.m20292e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
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
                    TimePickerKt.HorizontalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(final androidx.compose.material3.AnalogTimePickerState r18, androidx.compose.p014ui.Modifier r19, androidx.compose.material3.TimePickerColors r20, final boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i10) {
        int i11;
        Shape shape3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            shape3 = shape2;
            i11 |= composerStartRestartGroup.changed(shape3) ? 131072 : 65536;
        } else {
            shape3 = shape2;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i11, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM26979BorderStrokecXLIe8U = BorderStrokeKt.m26979BorderStrokecXLIe8U(timePickerTokens.m30160getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m29311getPeriodSelectorBorderColor0d7_KjU());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC9979u.m20292e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.Companion;
            final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_period_toggle_description), composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(strM29589getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
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
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29589getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (InterfaceC9540l) objRememberedValue, 1, null)), borderStrokeM26979BorderStrokecXLIe8U, cornerBasedShape);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            boolean z10 = !timePickerState.isAfternoon();
            int i12 = i11 & 112;
            boolean z11 = i12 == 32 || ((i11 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m29341invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m29341invoke() {
                        timePickerState.setAfternoon(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i13 = (i11 << 3) & 7168;
            int i14 = i11;
            ToggleItem(z10, shape, (InterfaceC9529a) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m28572getLambda1$material3_release(), composerStartRestartGroup, ((i11 >> 9) & 112) | 24576 | i13);
            SpacerKt.Spacer(BackgroundKt.m26950backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.m29311getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            boolean z12 = false;
            boolean zIsAfternoon = timePickerState.isAfternoon();
            if (i12 == 32 || ((i14 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) {
                z12 = true;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m29342invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m29342invoke() {
                        timePickerState.setAfternoon(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ToggleItem(zIsAfternoon, shape3, (InterfaceC9529a) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m28573getLambda2$material3_release(), composerStartRestartGroup, ((i14 >> 12) & 112) | 24576 | i13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
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
                    TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeInput(final androidx.compose.material3.TimePickerState r7, androidx.compose.p014ui.Modifier r8, androidx.compose.material3.TimePickerColors r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            r0 = -760850373(0xffffffffd2a6583b, float:-3.5722242E11)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto Le
            r1 = r11 | 6
            goto L27
        Le:
            r1 = r11 & 6
            if (r1 != 0) goto L26
            r1 = r11 & 8
            if (r1 != 0) goto L1b
            boolean r1 = r10.changed(r7)
            goto L1f
        L1b:
            boolean r1 = r10.changedInstance(r7)
        L1f:
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r1 | r11
            goto L27
        L26:
            r1 = r11
        L27:
            r2 = r12 & 2
            if (r2 == 0) goto L2e
            r1 = r1 | 48
            goto L3e
        L2e:
            r3 = r11 & 48
            if (r3 != 0) goto L3e
            boolean r3 = r10.changed(r8)
            if (r3 == 0) goto L3b
            r3 = 32
            goto L3d
        L3b:
            r3 = 16
        L3d:
            r1 = r1 | r3
        L3e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L52
            r3 = r12 & 4
            if (r3 != 0) goto L4f
            boolean r3 = r10.changed(r9)
            if (r3 == 0) goto L4f
            r3 = 256(0x100, float:3.59E-43)
            goto L51
        L4f:
            r3 = 128(0x80, float:1.8E-43)
        L51:
            r1 = r1 | r3
        L52:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L65
            boolean r3 = r10.getSkipping()
            if (r3 != 0) goto L5f
            goto L65
        L5f:
            r10.skipToGroupEnd()
        L62:
            r3 = r8
            r4 = r9
            goto Lb1
        L65:
            r10.startDefaults()
            r3 = r11 & 1
            r4 = 6
            if (r3 == 0) goto L7e
            boolean r3 = r10.getDefaultsInvalid()
            if (r3 == 0) goto L74
            goto L7e
        L74:
            r10.skipToGroupEnd()
            r2 = r12 & 4
            if (r2 == 0) goto L8d
        L7b:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L8d
        L7e:
            if (r2 == 0) goto L82
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p014ui.Modifier.Companion
        L82:
            r2 = r12 & 4
            if (r2 == 0) goto L8d
            androidx.compose.material3.TimePickerDefaults r9 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            androidx.compose.material3.TimePickerColors r9 = r9.colors(r10, r4)
            goto L7b
        L8d:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInput (TimePicker.kt:260)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L9c:
            int r0 = r1 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r1 << r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            TimeInputImpl(r8, r9, r7, r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L62
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L62
        Lb1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 == 0) goto Lc2
            androidx.compose.material3.TimePickerKt$TimeInput$1 r1 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>()
            r8.updateScope(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i11, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.Companion;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            int i12 = i11 & 896;
            boolean z10 = i12 == 256 || ((i11 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(timePickerState), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (AbstractC9972n) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composerStartRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            boolean z11 = i12 == 256 || ((i11 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (AbstractC9972n) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (InterfaceC9529a) objRememberedValue2, composerStartRestartGroup, 0, 4);
            int i13 = i11;
            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.m32979copyp1EtxEg$default(TypographyKt.getValue(timeInputTokens.getTimeFieldLabelTextFont(), composerStartRestartGroup, 6), timePickerColors.m29324timeSelectorContentColorvNxB06k$material3_release(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m33385getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
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
                public final void invoke(Composer composer2, int i14) {
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306700887, i14, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                    }
                    final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                    final TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable2;
                    Modifier.Companion companion4 = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor2 = companion5.getConstructor();
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
                    Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean zChanged = composer2.changed(mutableState) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m29343invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m29343invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                int iM31961getUtf16CodePointZmokQxo = KeyEvent_androidKt.m31961getUtf16CodePointZmokQxo(keyEvent);
                                if (48 <= iM31961getUtf16CodePointZmokQxo && iM31961getUtf16CodePointZmokQxo < 58 && TextRange.m32966getStartimpl(TimePickerKt.TimeInputImpl$lambda$6(mutableState).m33214getSelectiond9O1mEE()) == 2 && TimePickerKt.TimeInputImpl$lambda$6(mutableState).getText().length() == 2) {
                                    timePickerState2.mo28339setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI());
                                }
                                return Boolean.FALSE;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion4, (InterfaceC9540l) objRememberedValue3);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$6 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                    boolean zChangedInstance = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(TextFieldValue textFieldValue) {
                                int iM29362getHouryecRtBI = TimePickerSelectionMode.Companion.m29362getHouryecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                int i15 = timePickerState2.is24hour() ? 23 : 12;
                                final MutableState<TextFieldValue> mutableState3 = mutableState;
                                TimePickerKt.m29340timeInputOnChangez7XvuPQ(iM29362getHouryecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$62, i15, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    InterfaceC9540l interfaceC9540l = (InterfaceC9540l) objRememberedValue4;
                    TimePickerSelectionMode.Companion companion6 = TimePickerSelectionMode.Companion;
                    int iM29362getHouryecRtBI = companion6.m29362getHouryecRtBI();
                    ImeAction.Companion companion7 = ImeAction.Companion;
                    int iM33148getNexteUduSuo = companion7.m33148getNexteUduSuo();
                    KeyboardType.Companion companion8 = KeyboardType.Companion;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion8.m33202getNumberPjHm6EE(), iM33148getNexteUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (AbstractC9972n) null);
                    boolean zChangedInstance2 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo28339setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    TimePickerKt.m29329TimePickerTextField1vLObsk(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$6, interfaceC9540l, timePickerState2, iM29362getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (InterfaceC9540l) objRememberedValue5, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    TimePickerKt.DisplaySeparator(SizeKt.m27507sizeVpY3zN4(companion4, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m30147getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
                    boolean zChanged2 = composer2.changed(mutableState2) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m29344invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m29344invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                boolean z12 = KeyEvent_androidKt.m31961getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m32966getStartimpl(TimePickerKt.TimeInputImpl$lambda$9(mutableState2).m33214getSelectiond9O1mEE()) == 0;
                                if (z12) {
                                    timePickerState2.mo28339setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m29362getHouryecRtBI());
                                }
                                return Boolean.valueOf(z12);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (InterfaceC9540l) objRememberedValue6);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$9 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                    boolean zChangedInstance3 = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState2);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(TextFieldValue textFieldValue) {
                                int iM29363getMinuteyecRtBI = TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$92 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                                final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                TimePickerKt.m29340timeInputOnChangez7XvuPQ(iM29363getMinuteyecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$92, 59, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    InterfaceC9540l interfaceC9540l2 = (InterfaceC9540l) objRememberedValue7;
                    int iM29363getMinuteyecRtBI = companion6.m29363getMinuteyecRtBI();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion8.m33202getNumberPjHm6EE(), companion7.m33146getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (AbstractC9972n) null);
                    boolean zChangedInstance4 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo28339setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    TimePickerKt.m29329TimePickerTextField1vLObsk(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$9, interfaceC9540l2, timePickerState2, iM29363getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (InterfaceC9540l) objRememberedValue8, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.startReplaceGroup(511443242);
            if (!timePickerState.is24hour()) {
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierM27462paddingqDBjuR0$default2 = PaddingKt.m27462paddingqDBjuR0$default(companion4, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default2);
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
                VerticalPeriodToggle(SizeKt.m27507sizeVpY3zN4(companion4, timeInputTokens.m30148getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m30147getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, ((i13 >> 3) & 112) | 6 | ((i13 << 3) & 896));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
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
                    TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29328TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r13, androidx.compose.p014ui.Modifier r14, androidx.compose.material3.TimePickerColors r15, int r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m29328TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    public static final TimePickerState TimePickerState(int i10, int i11, boolean z10) {
        return new TimePickerStateImpl(i10, i11, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29329TimePickerTextField1vLObsk(final androidx.compose.p014ui.Modifier r112, final androidx.compose.p014ui.text.input.TextFieldValue r113, final p181hd.InterfaceC9540l r114, androidx.compose.material3.TimePickerState r115, final int r116, androidx.compose.foundation.text.KeyboardOptions r117, androidx.compose.foundation.text.KeyboardActions r118, final androidx.compose.material3.TimePickerColors r119, androidx.compose.runtime.Composer r120, final int r121, final int r122) {
        /*
            Method dump skipped, instructions count: 1527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m29329TimePickerTextField1vLObsk(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, hd.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    public static final void m29330TimeSelectorSAnMeKU(final Modifier modifier, final int i10, final TimePickerState timePickerState, final int i11, final TimePickerColors timePickerColors, Composer composer, final int i12) {
        int i13;
        int iM29519constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= (i12 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i13, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean zM29358equalsimpl0 = TimePickerSelectionMode.m29358equalsimpl0(timePickerState.mo28338getSelectionyecRtBI(), i11);
            if (TimePickerSelectionMode.m29358equalsimpl0(i11, TimePickerSelectionMode.Companion.m29362getHouryecRtBI())) {
                Strings.Companion companion = Strings.Companion;
                iM29519constructorimpl = Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.Companion;
                iM29519constructorimpl = Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_minute_selection);
            }
            final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(iM29519constructorimpl, composerStartRestartGroup, 0);
            long jM29323timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m29323timeSelectorContainerColorvNxB06k$material3_release(zM29358equalsimpl0);
            final long jM29324timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m29324timeSelectorContentColorvNxB06k$material3_release(zM29358equalsimpl0);
            boolean zChanged = composerStartRestartGroup.changed(strM29589getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
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
                        SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32733getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29589getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (InterfaceC9540l) objRememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            boolean z10 = ((i13 & 896) == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) | ((i13 & 7168) == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m29345invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m29345invoke() {
                        if (TimePickerSelectionMode.m29358equalsimpl0(i11, timePickerState.mo28338getSelectionyecRtBI())) {
                            return;
                        }
                        timePickerState.mo28339setSelection6_8s6DQ(i11);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m29152Surfaced85dljk(zM29358equalsimpl0, (InterfaceC9529a) objRememberedValue2, modifierSemantics, false, value, jM29323timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (InterfaceC9544p) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
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
                public final void invoke(Composer composer3, int i14) {
                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1477282471, i14, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                    }
                    final String strM29338numberContentDescriptiondSwYdS4 = TimePickerKt.m29338numberContentDescriptiondSwYdS4(i11, timePickerState.is24hour(), i10, composer3, 0);
                    Alignment center = Alignment.Companion.getCenter();
                    int i15 = i10;
                    long j10 = jM29324timeSelectorContentColorvNxB06k$material3_release;
                    Modifier.Companion companion3 = Modifier.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion4.getConstructor();
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
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    boolean zChanged2 = composer3.changed(strM29338numberContentDescriptiondSwYdS4);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29338numberContentDescriptiondSwYdS4);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m29301Text4IGK_g(CalendarLocale_jvmKt.toLocalString$default(i15, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion3, false, (InterfaceC9540l) objRememberedValue3, 1, null), j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer3, 0, 0, 131064);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i14) {
                    TimePickerKt.m29330TimeSelectorSAnMeKU(modifier, i10, timePickerState, i11, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ToggleItem(final boolean z10, final Shape shape, final InterfaceC9529a interfaceC9529a, final TimePickerColors timePickerColors, final InterfaceC9545q interfaceC9545q, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i11, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long jM29322periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m29322periodSelectorContentColorvNxB06k$material3_release(z10);
            long jM29321periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m29321periodSelectorContainerColorvNxB06k$material3_release(z10);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, z10 ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z11 = (i11 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
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
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z10);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton(interfaceC9529a, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (InterfaceC9540l) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m28400textButtonColorsro_MJ88(jM29321periodSelectorContainerColorvNxB06k$material3_release, jM29322periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m27451PaddingValues0680j_4(C3186Dp.m33501constructorimpl(0)), null, interfaceC9545q, composerStartRestartGroup, ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168) | ((i11 << 15) & 1879048192), 356);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
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
                    TimePickerKt.ToggleItem(z10, shape, interfaceC9529a, timePickerColors, interfaceC9545q, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i11, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i11 & Opcodes.IAND);
            composerStartRestartGroup.startReplaceGroup(-709485014);
            if (!timePickerState.is24hour()) {
                Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i12 = i11 << 3;
                VerticalPeriodToggle(SizeKt.m27507sizeVpY3zN4(companion, timePickerTokens.m30162getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m30161getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i12 & 896) | (i12 & 112) | 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
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
                    TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i10) {
        int i11;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i11, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable = list.get(i12);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, measureScope.mo27093roundToPx0680j_4(TimePickerTokens.INSTANCE.m30160getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Measurable measurable2 = list.get(i13);
                                    if (!AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    arrayList2.add(((Measurable) arrayList.get(i14)).mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, Constraints.m33453getMaxHeightimpl(j10) / 2, 3, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), 0, arrayList2.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, arrayList2.get(0).getHeight() - (placeableMo32229measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC9979u.m20292e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
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
                    TimePickerKt.VerticalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(final androidx.compose.material3.AnalogTimePickerState r9, androidx.compose.p014ui.Modifier r10, androidx.compose.material3.TimePickerColors r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f10, float f11) {
        float fAtan2 = ((float) Math.atan2(f10, f11)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    private static final float dist(float f10, float f11, int i10, int i11) {
        return (float) Math.hypot(i10 - f10, i11 - f11);
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                long jOffset = OffsetKt.Offset(contentDrawScope.mo27099toPx0680j_4(DpOffset.m33562getXD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))), contentDrawScope.mo27099toPx0680j_4(DpOffset.m33564getYD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))));
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f10 = 2;
                float fMo27099toPx0680j_4 = contentDrawScope.mo27099toPx0680j_4(timePickerTokens.m30155getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f10;
                long jM29316getSelectorColor0d7_KjU = timePickerColors.m29316getSelectorColor0d7_KjU();
                long jM30904getBlack0d7_KjU = Color.Companion.m30904getBlack0d7_KjU();
                BlendMode.Companion companion = BlendMode.Companion;
                DrawScope.m31410drawCircleVaOC9Bg$default(contentDrawScope, jM30904getBlack0d7_KjU, fMo27099toPx0680j_4, jOffset, 0.0f, null, null, companion.m30793getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m31410drawCircleVaOC9Bg$default(contentDrawScope, jM29316getSelectorColor0d7_KjU, fMo27099toPx0680j_4, jOffset, 0.0f, null, null, companion.m30821getXor0nO6VwU(), 56, null);
                DrawScope.m31415drawLineNGM6Ib0$default(contentDrawScope, jM29316getSelectorColor0d7_KjU, androidx.compose.p014ui.geometry.SizeKt.m30716getCenteruvyYCjk(contentDrawScope.mo31429getSizeNHjbRc()), Offset.m30641minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fMo27099toPx0680j_4, ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * fMo27099toPx0680j_4)), contentDrawScope.mo27099toPx0680j_4(timePickerTokens.m30156getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m30820getSrcOver0nO6VwU(), 240, null);
                DrawScope.m31410drawCircleVaOC9Bg$default(contentDrawScope, jM29316getSelectorColor0d7_KjU, contentDrawScope.mo27099toPx0680j_4(timePickerTokens.m30154getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f10, androidx.compose.p014ui.geometry.SizeKt.m30716getCenteruvyYCjk(contentDrawScope.mo31429getSizeNHjbRc()), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                DrawScope.m31410drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m29305clockDialContentColorvNxB06k$material3_release(true), fMo27099toPx0680j_4, jOffset, 0.0f, null, null, companion.m30803getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.is24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState.isAfternoon() ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f10 = 2;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(timePickerTokens.m30155getClockDialSelectorHandleContainerSizeD9Ej5fM() / f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(((analogTimePickerState.is24hour() && analogTimePickerState.isAfternoon() && TimePickerSelectionMode.m29358equalsimpl0(analogTimePickerState.mo28338getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m29362getHouryecRtBI())) ? InnerCircleRadius : OuterCircleSizeRadius) - fM33501constructorimpl) + fM33501constructorimpl);
        return DpKt.m33522DpOffsetYgX7TsA(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fM33501constructorimpl2) + C3186Dp.m33501constructorimpl(timePickerTokens.m30153getClockDialContainerSizeD9Ej5fM() / f10)), C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(fM33501constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle()))) + C3186Dp.m33501constructorimpl(timePickerTokens.m30153getClockDialContainerSizeD9Ej5fM() / f10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m29337moveSelectord3b8Pxo(TimePickerState timePickerState, float f10, float f11, float f12, long j10) {
        if (TimePickerSelectionMode.m29358equalsimpl0(timePickerState.mo28338getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m29362getHouryecRtBI()) && timePickerState.is24hour()) {
            timePickerState.setAfternoon(dist(f10, f11, IntOffset.m33629getXimpl(j10), IntOffset.m33630getYimpl(j10)) < f12);
        }
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m29338numberContentDescriptiondSwYdS4(int i10, boolean z10, int i11, Composer composer, int i12) {
        int iM29519constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i12, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.m29358equalsimpl0(i10, TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.Companion;
            iM29519constructorimpl = Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_minute_suffix);
        } else if (z10) {
            Strings.Companion companion2 = Strings.Companion;
            iM29519constructorimpl = Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.Companion;
            iM29519constructorimpl = Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_hour_suffix);
        }
        String strM29590getStringqBjtwXw = Strings_androidKt.m29590getStringqBjtwXw(iM29519constructorimpl, new Object[]{Integer.valueOf(i11)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM29590getStringqBjtwXw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: onTap-rOwcSBo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m29339onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState r11, float r12, float r13, float r14, boolean r15, long r16, vc.InterfaceC11588c<? super p309qc.C10786q> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m29339onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, vc.c):java.lang.Object");
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final TimePickerState rememberTimePickerState(int i10, int i11, boolean z10, Composer composer, int i12, int i13) {
        final int i14 = (i13 & 1) != 0 ? 0 : i10;
        final int i15 = (i13 & 2) != 0 ? 0 : i11;
        final boolean zIs24HourFormat = (i13 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i12, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.Companion.Saver();
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i14)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i15)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(zIs24HourFormat)) || (i12 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final TimePickerStateImpl invoke() {
                    return new TimePickerStateImpl(i14, i15, zIs24HourFormat);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-z7XvuPQ, reason: not valid java name */
    public static final void m29340timeInputOnChangez7XvuPQ(int i10, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i11, InterfaceC9540l interfaceC9540l) {
        if (AbstractC9979u.m20289b(textFieldValue.getText(), textFieldValue2.getText())) {
            interfaceC9540l.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m29358equalsimpl0(i10, TimePickerSelectionMode.Companion.m29362getHouryecRtBI())) {
                timePickerState.setHour(0);
            } else {
                timePickerState.setMinute(0);
            }
            interfaceC9540l.invoke(TextFieldValue.m33210copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int iM23079g = (textFieldValue.getText().length() == 3 && TextRange.m32966getStartimpl(textFieldValue.m33214getSelectiond9O1mEE()) == 1) ? AbstractC10790b.m23079g(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (iM23079g <= i11) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.Companion;
                if (TimePickerSelectionMode.m29358equalsimpl0(i10, companion.m29362getHouryecRtBI())) {
                    timePickerState.setHour(iM23079g);
                    if (iM23079g > 1 && !timePickerState.is24hour()) {
                        timePickerState.mo28339setSelection6_8s6DQ(companion.m29363getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(iM23079g);
                }
                interfaceC9540l.invoke(textFieldValue.getText().length() <= 2 ? textFieldValue : TextFieldValue.m33210copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    @Stable
    private static final Modifier visible(Modifier modifier, final boolean z10) {
        return modifier.then(new VisibleModifier(z10, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}

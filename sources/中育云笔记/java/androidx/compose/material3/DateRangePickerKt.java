package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.semantics.CustomAccessibilityAction;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9924b;
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
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(C3186Dp.m33501constructorimpl(24), C3186Dp.m33501constructorimpl(20), 0.0f, C3186Dp.m33501constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = C3186Dp.m33501constructorimpl(60);

    static {
        float f10 = 64;
        float f11 = 12;
        DateRangePickerTitlePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(C3186Dp.m33501constructorimpl(f10), 0.0f, C3186Dp.m33501constructorimpl(f11), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(C3186Dp.m33501constructorimpl(f10), 0.0f, C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f11), 2, null);
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
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
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
    public static final void DateRangePicker(final androidx.compose.material3.DateRangePickerState r25, androidx.compose.p014ui.Modifier r26, androidx.compose.material3.DatePickerFormatter r27, p181hd.InterfaceC9544p r28, p181hd.InterfaceC9544p r29, boolean r30, androidx.compose.material3.DatePickerColors r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, hd.p, hd.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangePickerContent(final Long l10, final Long l11, final long j10, final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        Long l12;
        InterfaceC9544p interfaceC9544p2;
        InterfaceC9540l interfaceC9540l2;
        SelectableDates selectableDates2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-787063721);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l12 = l11;
            i11 |= composerStartRestartGroup.changed(l12) ? 32 : 16;
        } else {
            l12 = l11;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC9544p2 = interfaceC9544p;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 2048 : 1024;
        } else {
            interfaceC9544p2 = interfaceC9544p;
        }
        if ((i10 & 24576) == 0) {
            interfaceC9540l2 = interfaceC9540l;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 16384 : 8192;
        } else {
            interfaceC9540l2 = interfaceC9540l;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(c10405j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            selectableDates2 = selectableDates;
            i11 |= composerStartRestartGroup.changed(selectableDates2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i11, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:719)");
            }
            int iM21752e = AbstractC10410o.m21752e(calendarModel.getMonth(j10).indexIn(c10405j), 0);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iM21752e, 0, composerStartRestartGroup, 0, 2);
            Integer numValueOf = Integer.valueOf(iM21752e);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(iM21752e);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                obj = null;
                objRememberedValue = new DateRangePickerKt$DateRangePickerContent$1$1(lazyListStateRememberLazyListState, iM21752e, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                obj = null;
            }
            EffectsKt.LaunchedEffect(numValueOf, (InterfaceC9544p) objRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierM27460paddingVpY3zN4$default = PaddingKt.m27460paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27460paddingVpY3zN4$default);
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
            DatePickerKt.WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, ((i11 >> 27) & 14) | ((i11 >> 12) & 112));
            VerticalMonthsList(lazyListStateRememberLazyListState, l10, l12, interfaceC9544p2, interfaceC9540l2, calendarModel, c10405j, datePickerFormatter, selectableDates2, datePickerColors, composerStartRestartGroup, ((i11 << 3) & 1008) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (1879048192 & i11));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    DateRangePickerKt.DateRangePickerContent(l10, l11, j10, interfaceC9544p, interfaceC9540l, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ExperimentalMaterial3Api
    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m28632DateRangePickerStateHVP43zI(Locale locale, Long l10, Long l11, Long l12, C10405j c10405j, int i10, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l10, l11, l12, c10405j, i10, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m28633DateRangePickerStateHVP43zI$default(Locale locale, Long l10, Long l11, Long l12, C10405j c10405j, int i10, SelectableDates selectableDates, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        if ((i11 & 8) != 0) {
            l12 = l10;
        }
        if ((i11 & 16) != 0) {
            c10405j = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i11 & 32) != 0) {
            i10 = DisplayMode.Companion.m28660getPickerjFl4v0();
        }
        if ((i11 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m28632DateRangePickerStateHVP43zI(locale, l10, l11, l12, c10405j, i10, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m28634SwitchableDateEntryContentRN2D1Q(final Long l10, final Long l11, final long j10, final int i10, final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i11, final int i12) {
        int i13;
        Long l12;
        long j11;
        InterfaceC9544p interfaceC9544p2;
        InterfaceC9540l interfaceC9540l2;
        CalendarModel calendarModel2;
        C10405j c10405j2;
        int i14;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532789335);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            l12 = l11;
            i13 |= composerStartRestartGroup.changed(l12) ? 32 : 16;
        } else {
            l12 = l11;
        }
        if ((i11 & 384) == 0) {
            j11 = j10;
            i13 |= composerStartRestartGroup.changed(j11) ? 256 : 128;
        } else {
            j11 = j10;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            interfaceC9544p2 = interfaceC9544p;
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 16384 : 8192;
        } else {
            interfaceC9544p2 = interfaceC9544p;
        }
        if ((196608 & i11) == 0) {
            interfaceC9540l2 = interfaceC9540l;
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 131072 : 65536;
        } else {
            interfaceC9540l2 = interfaceC9540l;
        }
        if ((1572864 & i11) == 0) {
            calendarModel2 = calendarModel;
            i13 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 1048576 : 524288;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((12582912 & i11) == 0) {
            c10405j2 = c10405j;
            i13 |= composerStartRestartGroup.changedInstance(c10405j2) ? 8388608 : 4194304;
        } else {
            c10405j2 = c10405j;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= (i11 & 134217728) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i13, i14, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:665)");
            }
            final Long l13 = l12;
            final InterfaceC9544p interfaceC9544p3 = interfaceC9544p2;
            final C10405j c10405j3 = c10405j2;
            final long j12 = j11;
            final InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
            final CalendarModel calendarModel3 = calendarModel2;
            composer2 = composerStartRestartGroup;
            CrossfadeKt.Crossfade(DisplayMode.m28652boximpl(i10), SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new InterfaceC9545q() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m28639invokeQujVXRc(((DisplayMode) obj).m28658unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m28639invokeQujVXRc(int i15, Composer composer3, int i16) {
                    int i17;
                    if ((i16 & 6) == 0) {
                        i17 = i16 | (composer3.changed(i15) ? 4 : 2);
                    } else {
                        i17 = i16;
                    }
                    if ((i17 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026642619, i17, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:677)");
                    }
                    DisplayMode.Companion companion = DisplayMode.Companion;
                    if (DisplayMode.m28655equalsimpl0(i15, companion.m28660getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-1871299185);
                        DateRangePickerKt.DateRangePickerContent(l10, l13, j12, interfaceC9544p3, interfaceC9540l3, calendarModel3, c10405j3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m28655equalsimpl0(i15, companion.m28659getInputjFl4v0())) {
                        composer3.startReplaceGroup(-1871277944);
                        DateRangeInputKt.DateRangeInputContent(l10, l13, interfaceC9544p3, calendarModel3, c10405j3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(2120399965);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i13 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
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
                    DateRangePickerKt.m28634SwitchableDateEntryContentRN2D1Q(l10, l11, j10, i10, interfaceC9544p, interfaceC9540l, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalMonthsList(LazyListState lazyListState, final Long l10, final Long l11, final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        Long l12;
        Long l13;
        InterfaceC9544p interfaceC9544p2;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1257365001);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l12 = l10;
            i11 |= composerStartRestartGroup.changed(l12) ? 32 : 16;
        } else {
            l12 = l10;
        }
        if ((i10 & 384) == 0) {
            l13 = l11;
            i11 |= composerStartRestartGroup.changed(l13) ? 256 : 128;
        } else {
            l13 = l11;
        }
        if ((i10 & 3072) == 0) {
            interfaceC9544p2 = interfaceC9544p;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 2048 : 1024;
        } else {
            interfaceC9544p2 = interfaceC9544p;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(c10405j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i11, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:767)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(c10405j);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(c10405j.m21733b(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            final Long l14 = l12;
            final InterfaceC9544p interfaceC9544p3 = interfaceC9544p2;
            int i12 = i11;
            final Long l15 = l13;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
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
                        ComposerKt.traceEventStart(1090773432, i13, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:777)");
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    Strings.Companion companion2 = Strings.Companion;
                    String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_scroll_to_previous_month), composer2, 0);
                    String strM29589getString2EP1pXo2 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_scroll_to_next_month), composer2, 0);
                    boolean zChanged2 = composer2.changed(l14) | composer2.changed(l15) | composer2.changed(interfaceC9544p3);
                    final Long l16 = l14;
                    final Long l17 = l15;
                    final InterfaceC9544p interfaceC9544p4 = interfaceC9544p3;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Number) obj).longValue());
                                return C10786q.f26013a;
                            }

                            public final void invoke(long j10) {
                                DateRangePickerKt.updateDateSelection(j10, l16, l17, interfaceC9544p4);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final InterfaceC9540l interfaceC9540l2 = (InterfaceC9540l) objRememberedValue3;
                    final List listCustomScrollActions = DateRangePickerKt.customScrollActions(lazyListState2, coroutineScope, strM29589getString2EP1pXo, strM29589getString2EP1pXo2);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC9529a() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC9529a() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                @Override // p181hd.InterfaceC9529a
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    boolean zChangedInstance = composer2.changedInstance(c10405j) | composer2.changedInstance(calendarModel) | composer2.changed(calendarMonth) | composer2.changedInstance(datePickerFormatter) | composer2.changedInstance(listCustomScrollActions) | composer2.changed(datePickerColors) | composer2.changed(l14) | composer2.changed(l15) | composer2.changed(interfaceC9540l2) | composer2.changed(today) | composer2.changed(selectableDates);
                    final C10405j c10405j2 = c10405j;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Long l18 = l14;
                    final Long l19 = l15;
                    final CalendarDate calendarDate = today;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        Object obj = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LazyListScope) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(c10405j2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Long l20 = l18;
                                final Long l21 = l19;
                                final InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
                                final CalendarDate calendarDate2 = calendarDate;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                final List<CustomAccessibilityAction> list = listCustomScrollActions;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new InterfaceC9546r() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p181hd.InterfaceC9546r
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        invoke((LazyItemScope) obj2, ((Number) obj3).intValue(), (Composer) obj4, ((Number) obj5).intValue());
                                        return C10786q.f26013a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(LazyItemScope lazyItemScope, int i14, Composer composer3, int i15) {
                                        int i16;
                                        SelectedRangeInfo selectedRangeInfo;
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
                                            ComposerKt.traceEventStart(-1413501381, i16, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:810)");
                                        }
                                        final CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i14);
                                        Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                                        Long l22 = l20;
                                        Long l23 = l21;
                                        InterfaceC9540l interfaceC9540l4 = interfaceC9540l3;
                                        CalendarDate calendarDate3 = calendarDate2;
                                        final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                        SelectableDates selectableDates4 = selectableDates3;
                                        final DatePickerColors datePickerColors4 = datePickerColors3;
                                        final List<CustomAccessibilityAction> list2 = list;
                                        CalendarModel calendarModel4 = calendarModel3;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillParentMaxWidth$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                        InterfaceC9529a constructor = companion3.getConstructor();
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
                                        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer3, 6), ComposableLambdaKt.rememberComposableLambda(1622100276, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
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
                                            public final void invoke(Composer composer4, int i17) {
                                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1622100276, i17, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:813)");
                                                }
                                                String monthYear = datePickerFormatter4.formatMonthYear(Long.valueOf(calendarMonthPlusMonths.getStartUtcTimeMillis()), CalendarLocale_androidKt.defaultLocale(composer4, 0));
                                                if (monthYear == null) {
                                                    monthYear = "-";
                                                }
                                                Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding());
                                                boolean zChangedInstance2 = composer4.changedInstance(list2);
                                                final List<CustomAccessibilityAction> list3 = list2;
                                                Object objRememberedValue5 = composer4.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1
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
                                                            SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list3);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue5);
                                                }
                                                TextKt.m29301Text4IGK_g(monthYear, SemanticsModifierKt.semantics$default(modifierPadding, false, (InterfaceC9540l) objRememberedValue5, 1, null), datePickerColors4.m28597getSubheadContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer4, 0, 0, 131064);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 48);
                                        composer3.startReplaceGroup(2125334733);
                                        if (l22 == null || l23 == null) {
                                            selectedRangeInfo = null;
                                        } else {
                                            boolean zChanged3 = composer3.changed(l22) | composer3.changed(l23);
                                            Object objRememberedValue5 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                                objRememberedValue5 = SelectedRangeInfo.Companion.calculateRangeInfo(calendarMonthPlusMonths, calendarModel4.getCanonicalDate(l22.longValue()), calendarModel4.getCanonicalDate(l23.longValue()));
                                                composer3.updateRememberedValue(objRememberedValue5);
                                            }
                                            selectedRangeInfo = (SelectedRangeInfo) objRememberedValue5;
                                        }
                                        composer3.endReplaceGroup();
                                        DatePickerKt.Month(calendarMonthPlusMonths, interfaceC9540l4, calendarDate3.getUtcTimeMillis(), l22, l23, selectedRangeInfo, datePickerFormatter4, selectableDates4, datePickerColors4, composer3, 0);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue4 = obj;
                    }
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState3, null, false, null, null, null, false, (InterfaceC9540l) objRememberedValue4, composer2, 0, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i13 = i12 & 14;
            boolean zChangedInstance = (i13 == 4) | ((57344 & i12) == 16384) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(c10405j);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, interfaceC9540l, calendarModel, c10405j, null);
                composerStartRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (InterfaceC9544p) dateRangePickerKt$VerticalMonthsList$2$1, composerStartRestartGroup, i13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
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
                    DateRangePickerKt.VerticalMonthsList(lazyListState2, l10, l11, interfaceC9544p, interfaceC9540l, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final InterfaceC11122i0 interfaceC11122i0, String str, String str2) {
        return AbstractC10978w.m24139q(new CustomAccessibilityAction(str, new InterfaceC9529a() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

            @InterfaceC11829d(m26210c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", m26211f = "DateRangePicker.kt", m26212l = {1046}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1 */
            public static final class C21561 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21561(LazyListState lazyListState, InterfaceC11588c<? super C21561> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C21561(this.$state, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
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
                    return ((C21561) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                boolean z10;
                if (lazyListState.getCanScrollBackward()) {
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C21561(lazyListState, null), 3, null);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }), new CustomAccessibilityAction(str2, new InterfaceC9529a() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

            @InterfaceC11829d(m26210c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", m26211f = "DateRangePicker.kt", m26212l = {1054}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1 */
            public static final class C21551 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21551(LazyListState lazyListState, InterfaceC11588c<? super C21551> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C21551(this.$state, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == objM25952f) {
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
                    return ((C21551) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                boolean z10;
                if (lazyListState.getCanScrollForward()) {
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C21551(lazyListState, null), 3, null);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }));
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m28636drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j10) {
        float fMo27099toPx0680j_4 = contentDrawScope.mo27099toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo27099toPx0680j_42 = contentDrawScope.mo27099toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo27099toPx0680j_43 = contentDrawScope.mo27099toPx0680j_4(DatePickerModalTokens.INSTANCE.m29758getDateStateLayerHeightD9Ej5fM());
        float f10 = 2;
        float f11 = (fMo27099toPx0680j_42 - fMo27099toPx0680j_43) / f10;
        float f12 = 7;
        float fM30706getWidthimpl = (Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - (f12 * fMo27099toPx0680j_4)) / f12;
        long jM29074getGridStartCoordinatesnOccac = selectedRangeInfo.m29074getGridStartCoordinatesnOccac();
        int iM33629getXimpl = IntOffset.m33629getXimpl(jM29074getGridStartCoordinatesnOccac);
        int iM33630getYimpl = IntOffset.m33630getYimpl(jM29074getGridStartCoordinatesnOccac);
        long jM29073getGridEndCoordinatesnOccac = selectedRangeInfo.m29073getGridEndCoordinatesnOccac();
        int iM33629getXimpl2 = IntOffset.m33629getXimpl(jM29073getGridEndCoordinatesnOccac);
        int iM33630getYimpl2 = IntOffset.m33630getYimpl(jM29073getGridEndCoordinatesnOccac);
        float f13 = iM33629getXimpl;
        float f14 = fMo27099toPx0680j_4 + fM30706getWidthimpl;
        float f15 = fM30706getWidthimpl / f10;
        float fM30706getWidthimpl2 = (f13 * f14) + (selectedRangeInfo.getFirstIsSelectionStart() ? fMo27099toPx0680j_4 / f10 : 0.0f) + f15;
        float f16 = (iM33630getYimpl * fMo27099toPx0680j_42) + f11;
        float f17 = iM33629getXimpl2 * f14;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fMo27099toPx0680j_4 /= f10;
        }
        float fM30706getWidthimpl3 = f17 + fMo27099toPx0680j_4 + f15;
        float f18 = (iM33630getYimpl2 * fMo27099toPx0680j_42) + f11;
        boolean z10 = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z10) {
            fM30706getWidthimpl2 = Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - fM30706getWidthimpl2;
            fM30706getWidthimpl3 = Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - fM30706getWidthimpl3;
        }
        float fM30706getWidthimpl4 = fM30706getWidthimpl3;
        DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, j10, OffsetKt.Offset(fM30706getWidthimpl2, f16), SizeKt.Size(iM33630getYimpl == iM33630getYimpl2 ? fM30706getWidthimpl4 - fM30706getWidthimpl2 : z10 ? -fM30706getWidthimpl2 : Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - fM30706getWidthimpl2, fMo27099toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        if (iM33630getYimpl != iM33630getYimpl2) {
            for (int i10 = (iM33630getYimpl2 - iM33630getYimpl) - 1; i10 > 0; i10--) {
                DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, j10, OffsetKt.Offset(0.0f, f16 + (i10 * fMo27099toPx0680j_42)), SizeKt.Size(Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()), fMo27099toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            long jOffset = OffsetKt.Offset(contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()), f18);
            if (z10) {
                fM30706getWidthimpl4 -= Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc());
            }
            DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, j10, jOffset, SizeKt.Size(fM30706getWidthimpl4, fMo27099toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m28637rememberDateRangePickerStateIlFM19s(Long l10, Long l11, Long l12, C10405j c10405j, int i10, SelectableDates selectableDates, Composer composer, int i11, int i12) {
        final Long l13 = (i12 & 1) != 0 ? null : l10;
        final Long l14 = (i12 & 2) != 0 ? null : l11;
        final Long l15 = (i12 & 4) != 0 ? l13 : l12;
        final C10405j yearRange = (i12 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : c10405j;
        final int iM28660getPickerjFl4v0 = (i12 & 16) != 0 ? DisplayMode.Companion.m28660getPickerjFl4v0() : i10;
        final SelectableDates allDates = (i12 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i11, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.Companion.Saver(allDates, localeDefaultLocale);
        boolean zChangedInstance = ((((i11 & 112) ^ 48) > 32 && composer.changed(l14)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && composer.changed(l13)) || (i11 & 6) == 4) | ((((i11 & 896) ^ 384) > 256 && composer.changed(l15)) || (i11 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i11) ^ 24576) > 16384 && composer.changed(iM28660getPickerjFl4v0)) || (i11 & 24576) == 16384) | ((((458752 & i11) ^ ProfileVerifier.CompilationStatus.f1974xf2722a21) > 131072 && composer.changed(allDates)) || (i11 & ProfileVerifier.CompilationStatus.f1974xf2722a21) == 131072) | composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new InterfaceC9529a() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l13, l14, l15, yearRange, iM28660getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j10, Long l10, Long l11, InterfaceC9544p interfaceC9544p) {
        if ((l10 == null && l11 == null) || (l10 != null && l11 != null)) {
            interfaceC9544p.invoke(Long.valueOf(j10), null);
        } else if (l10 == null || j10 < l10.longValue()) {
            interfaceC9544p.invoke(Long.valueOf(j10), null);
        } else {
            interfaceC9544p.invoke(l10, Long.valueOf(j10));
        }
    }
}

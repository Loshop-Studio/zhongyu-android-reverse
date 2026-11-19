package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
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
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.android.material.internal.ViewUtils;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.C10405j;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = C3186Dp.m33501constructorimpl(8);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangeInputContent(final Long l10, final Long l11, final InterfaceC9544p interfaceC9544p, final CalendarModel calendarModel, final C10405j c10405j, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        C10405j c10405j2;
        SelectableDates selectableDates2;
        DateInputFormat dateInputFormat;
        Composer composerStartRestartGroup = composer.startRestartGroup(-607499086);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(l11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            c10405j2 = c10405j;
            i11 |= composerStartRestartGroup.changedInstance(c10405j2) ? 16384 : 8192;
        } else {
            c10405j2 = c10405j;
        }
        if ((196608 & i10) == 0) {
            i11 |= (i10 & 262144) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            selectableDates2 = selectableDates;
            i11 |= composerStartRestartGroup.changed(selectableDates2) ? 1048576 : 524288;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 8388608 : 4194304;
        }
        if ((i11 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607499086, i11, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:43)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.Companion;
            String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_input_invalid_for_pattern), composerStartRestartGroup, 0);
            String strM29589getString2EP1pXo2 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_input_invalid_year_range), composerStartRestartGroup, 0);
            String strM29589getString2EP1pXo3 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_input_invalid_not_allowed), composerStartRestartGroup, 0);
            String strM29589getString2EP1pXo4 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_input_invalid_range_input), composerStartRestartGroup, 0);
            boolean zChanged2 = ((i11 & 458752) == 131072 || ((i11 & 262144) != 0 && composerStartRestartGroup.changed(datePickerFormatter))) | composerStartRestartGroup.changed(dateInputFormat2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                dateInputFormat = dateInputFormat2;
                objRememberedValue2 = new DateInputValidator(c10405j2, selectableDates2, dateInputFormat, datePickerFormatter, strM29589getString2EP1pXo, strM29589getString2EP1pXo2, strM29589getString2EP1pXo3, strM29589getString2EP1pXo4, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                dateInputFormat = dateInputFormat2;
            }
            DateInputValidator dateInputValidator = (DateInputValidator) objRememberedValue2;
            dateInputValidator.setCurrentStartDateMillis$material3_release(l10);
            dateInputValidator.setCurrentEndDateMillis$material3_release(l11);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierPadding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m27339spacedBy0680j_4(TextFieldSpacing), Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            AbstractC9979u.m20293f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM29589getString2EP1pXo5 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_start_headline), composerStartRestartGroup, 0);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            InputIdentifier.Companion companion4 = InputIdentifier.Companion;
            int iM28772getStartDateInputJ2x2o4M = companion4.m28772getStartDateInputJ2x2o4M();
            int i12 = i11 & 896;
            int i13 = i11 & 112;
            boolean z10 = (i13 == 32) | (i12 == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Long) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Long l12) {
                        interfaceC9544p.invoke(l12, l11);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i14 = i11 & 7168;
            int i15 = (i11 >> 21) & 14;
            int i16 = i11;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            DateInputKt.m28575DateInputTextFieldtQNruF0(modifierWeight$default, l10, (InterfaceC9540l) objRememberedValue3, calendarModel, ComposableLambdaKt.rememberComposableLambda(801434508, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2
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
                public final void invoke(Composer composer2, int i17) {
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(801434508, i17, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:80)");
                    }
                    String str = strM29589getString2EP1pXo5;
                    Modifier.Companion companion5 = Modifier.Companion;
                    boolean zChanged3 = composer2.changed(str) | composer2.changed(upperCase);
                    final String str2 = strM29589getString2EP1pXo5;
                    final String str3 = upperCase;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    TextKt.m29301Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion5, false, (InterfaceC9540l) objRememberedValue4, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer2, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(665407211, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3
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
                public final void invoke(Composer composer2, int i17) {
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(665407211, i17, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:86)");
                    }
                    TextKt.m29301Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer2, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), iM28772getStartDateInputJ2x2o4M, dateInputValidator, dateInputFormat3, localeDefaultLocale, datePickerColors, composerStartRestartGroup, ((i11 << 3) & 112) | 1794048 | i14, i15);
            final String strM29589getString2EP1pXo6 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_date_range_picker_end_headline), composerStartRestartGroup, 0);
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            int iM28770getEndDateInputJ2x2o4M = companion4.m28770getEndDateInputJ2x2o4M();
            boolean z11 = (i12 == 256) | ((i16 & 14) == 4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Long) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Long l12) {
                        interfaceC9544p.invoke(l10, l12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            DateInputKt.m28575DateInputTextFieldtQNruF0(modifierWeight$default2, l11, (InterfaceC9540l) objRememberedValue4, calendarModel, ComposableLambdaKt.rememberComposableLambda(911487285, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5
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
                public final void invoke(Composer composer2, int i17) {
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911487285, i17, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:103)");
                    }
                    String str = strM29589getString2EP1pXo6;
                    Modifier.Companion companion5 = Modifier.Companion;
                    boolean zChanged3 = composer2.changed(str) | composer2.changed(upperCase);
                    final String str2 = strM29589getString2EP1pXo6;
                    final String str3 = upperCase;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    TextKt.m29301Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion5, false, (InterfaceC9540l) objRememberedValue5, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer2, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-961726252, true, new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6
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
                public final void invoke(Composer composer2, int i17) {
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-961726252, i17, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:108)");
                    }
                    TextKt.m29301Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer2, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), iM28770getEndDateInputJ2x2o4M, dateInputValidator, dateInputFormat3, localeDefaultLocale, datePickerColors, composerStartRestartGroup, i13 | 1794048 | i14, i15);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.DateRangeInputKt.DateRangeInputContent.3
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
                    DateRangeInputKt.DateRangeInputContent(l10, l11, interfaceC9544p, calendarModel, c10405j, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}

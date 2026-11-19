package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.internal.ViewUtils;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = C3156Dp.m26899constructorimpl(16);

    static {
        float f10 = 24;
        InputTextFieldPadding = PaddingKt.m20853PaddingValuesa9UjIt4$default(C3156Dp.m26899constructorimpl(f10), C3156Dp.m26899constructorimpl(10), C3156Dp.m26899constructorimpl(f10), 0.0f, 8, null);
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(final Long l10, final InterfaceC10570l interfaceC10570l, final CalendarModel calendarModel, final C8321f c8321f, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        DateInputFormat dateInputFormat;
        int i12;
        ?? r02;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(643325609);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10570l) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(calendarModel) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(c8321f) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (i10 & 32768) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(selectableDates) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i11, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
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
            String strM22987getString2EP1pXo = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_invalid_for_pattern), composerStartRestartGroup, 0);
            String strM22987getString2EP1pXo2 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_invalid_year_range), composerStartRestartGroup, 0);
            String strM22987getString2EP1pXo3 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_invalid_not_allowed), composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | ((i11 & 57344) == 16384 || ((i11 & 32768) != 0 && composerStartRestartGroup.changed(datePickerFormatter)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                composer2 = composerStartRestartGroup;
                dateInputFormat = dateInputFormat2;
                i12 = i11;
                r02 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(c8321f, selectableDates, dateInputFormat, datePickerFormatter, strM22987getString2EP1pXo, strM22987getString2EP1pXo2, strM22987getString2EP1pXo3, "", null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                composer2.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                composer2 = composerStartRestartGroup;
                i12 = i11;
                dateInputFormat = dateInputFormat2;
                r02 = 1;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            AbstractC9133u.m16132f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM22987getString2EP1pXo4 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_label), composer2, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, r02, null), InputTextFieldPadding);
            int iM22169getSingleDateInputJ2x2o4M = InputIdentifier.Companion.m22169getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l10);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1819015125, r02, new InterfaceC10574p() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer4, int i13) {
                    if ((i13 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1819015125, i13, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                    }
                    String str = strM22987getString2EP1pXo4;
                    Modifier.Companion companion2 = Modifier.Companion;
                    boolean zChanged3 = composer4.changed(str) | composer4.changed(upperCase);
                    final String str2 = strM22987getString2EP1pXo4;
                    final String str3 = upperCase;
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC10570l() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p300x7.InterfaceC10570l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C8736p.f16368a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m22699Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC10570l) objRememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-564233108, r02, new InterfaceC10574p() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer4, int i13) {
                    if ((i13 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564233108, i13, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.m22699Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new InterfaceC10570l() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C8736p.f16368a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            int i13 = i12 << 3;
            Composer composer4 = composer2;
            m21973DateInputTextFieldtQNruF0(modifierPadding, l10, interfaceC10570l, calendarModel, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, iM22169getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, localeDefaultLocale, datePickerColors, composer4, (i13 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | 1794054 | (i13 & 896) | (i13 & 7168), (i12 >> 18) & 14);
            composer3 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer5, int i14) {
                    DateInputKt.DateInputContent(l10, interfaceC10570l, calendarModel, c8321f, datePickerFormatter, selectableDates, datePickerColors, composer5, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m21973DateInputTextFieldtQNruF0(final Modifier modifier, final Long l10, final InterfaceC10570l interfaceC10570l, final CalendarModel calendarModel, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, final int i10, final DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i11, final int i12) {
        int i13;
        InterfaceC10570l interfaceC10570l2;
        int i14;
        final MutableState mutableState;
        int i15;
        Composer composer2;
        final DateInputFormat dateInputFormat2 = dateInputFormat;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857008589);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(l10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            interfaceC10570l2 = interfaceC10570l;
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10570l2) ? 256 : 128;
        } else {
            interfaceC10570l2 = interfaceC10570l;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(dateInputFormat2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(locale) ? 536870912 : 268435456;
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
                ComposerKt.traceEventStart(-857008589, i13, i14, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m23818rememberSaveable(new Object[0], (Saver) null, (String) null, (InterfaceC10559a) new InterfaceC10559a() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                @Override // p300x7.InterfaceC10559a
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            boolean zChangedInstance = ((i13 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) == 32) | composerStartRestartGroup.changedInstance(calendarModel);
            int i16 = 234881024 & i13;
            boolean zChangedInstance2 = zChangedInstance | (i16 == 67108864) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10559a() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                    @Override // p300x7.InterfaceC10559a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final androidx.compose.runtime.MutableState<androidx.compose.p013ui.text.input.TextFieldValue> invoke() {
                        /*
                            r8 = this;
                            java.lang.Long r0 = r1
                            if (r0 == 0) goto L1b
                            androidx.compose.material3.internal.CalendarModel r1 = r2
                            androidx.compose.material3.internal.DateInputFormat r2 = r3
                            java.util.Locale r3 = r4
                            long r4 = r0.longValue()
                            java.lang.String r0 = r2.getPatternWithoutDelimiters()
                            java.lang.String r0 = r1.formatWithPattern(r4, r0, r3)
                            if (r0 != 0) goto L19
                            goto L1b
                        L19:
                            r2 = r0
                            goto L1e
                        L1b:
                            java.lang.String r0 = ""
                            goto L19
                        L1e:
                            r0 = 0
                            long r3 = androidx.compose.p013ui.text.TextRangeKt.TextRange(r0, r0)
                            androidx.compose.ui.text.input.TextFieldValue r1 = new androidx.compose.ui.text.input.TextFieldValue
                            r5 = 0
                            r6 = 4
                            r7 = 0
                            r1.<init>(r2, r3, r5, r6, r7)
                            r0 = 2
                            r2 = 0
                            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r1, r2, r0, r2)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1.invoke():androidx.compose.runtime.MutableState");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC10559a) objRememberedValue, composerStartRestartGroup, 0, 4);
            TextFieldValue textFieldValueDateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(mutableStateRememberSaveable);
            boolean zChanged = (i16 == 67108864) | composerStartRestartGroup.changed(mutableStateRememberSaveable) | composerStartRestartGroup.changed(mutableState2) | ((i13 & 896) == 256) | composerStartRestartGroup.changedInstance(calendarModel) | ((29360128 & i13) == 8388608) | ((3670016 & i13) == 1048576) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                mutableState = mutableState2;
                i15 = i13;
                final InterfaceC10570l interfaceC10570l3 = interfaceC10570l2;
                InterfaceC10570l interfaceC10570l4 = new InterfaceC10570l() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextFieldValue) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(TextFieldValue textFieldValue) {
                        if (textFieldValue.getText().length() <= dateInputFormat2.getPatternWithoutDelimiters().length()) {
                            String text = textFieldValue.getText();
                            for (int i17 = 0; i17 < text.length(); i17++) {
                                if (!Character.isDigit(text.charAt(i17))) {
                                    return;
                                }
                            }
                            mutableStateRememberSaveable.setValue(textFieldValue);
                            String string = AbstractC8661c0.m13982W0(textFieldValue.getText()).toString();
                            Long lValueOf = null;
                            if (string.length() == 0 || string.length() < dateInputFormat2.getPatternWithoutDelimiters().length()) {
                                mutableState.setValue("");
                                interfaceC10570l3.invoke(null);
                                return;
                            }
                            CalendarDate calendarDate = calendarModel.parse(string, dateInputFormat2.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.m21974validateXivgLIo(calendarDate, i10, locale));
                            InterfaceC10570l interfaceC10570l5 = interfaceC10570l3;
                            if (mutableState.getValue().length() == 0 && calendarDate != null) {
                                lValueOf = Long.valueOf(calendarDate.getUtcTimeMillis());
                            }
                            interfaceC10570l5.invoke(lValueOf);
                        }
                    }
                };
                dateInputFormat2 = dateInputFormat2;
                composerStartRestartGroup.updateRememberedValue(interfaceC10570l4);
                objRememberedValue2 = interfaceC10570l4;
            } else {
                mutableState = mutableState2;
                i15 = i13;
            }
            InterfaceC10570l interfaceC10570l5 = (InterfaceC10570l) objRememberedValue2;
            Modifier modifierM20860paddingqDBjuR0$default = PaddingKt.m20860paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, !AbstractC8661c0.m13993h0((CharSequence) mutableState.getValue()) ? C3156Dp.m26899constructorimpl(0) : InputTextNonErroneousBottomPadding, 7, null);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC10570l() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        if (AbstractC8661c0.m13993h0(mutableState.getValue())) {
                            return;
                        }
                        SemanticsPropertiesKt.error(semanticsPropertyReceiver, mutableState.getValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            OutlinedTextFieldKt.OutlinedTextField(textFieldValueDateInputTextField_tQNruF0$lambda$4, interfaceC10570l5, SemanticsModifierKt.semantics$default(modifierM20860paddingqDBjuR0$default, false, (InterfaceC10570l) objRememberedValue3, 1, null), false, false, (TextStyle) null, interfaceC10574p, interfaceC10574p2, (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) ComposableLambdaKt.rememberComposableLambda(-591991974, true, new InterfaceC10574p() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i17) {
                    if ((i17 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-591991974, i17, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!AbstractC8661c0.m13993h0(mutableState.getValue())) {
                        TextKt.m22699Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer3, 0, 0, 131070);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), !AbstractC8661c0.m13993h0((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m26600getNumberPjHm6EE(), ImeAction.Companion.m26544getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, (AbstractC9126n) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), composerStartRestartGroup, (i15 << 6) & 33030144, 12779904, 0, 4001592);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i17) {
                    DateInputKt.m21973DateInputTextFieldtQNruF0(modifier, l10, interfaceC10570l, calendarModel, interfaceC10574p, interfaceC10574p2, i10, dateInputValidator, dateInputFormat2, locale, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}

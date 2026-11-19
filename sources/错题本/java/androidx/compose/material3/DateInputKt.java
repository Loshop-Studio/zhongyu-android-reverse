package androidx.compose.material3;

import androidx.autofill.HintConstants;
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
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.PlatformImeOptions;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0012\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0098\u0001\u0010&\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "Ld6/s;", "onDateSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lx6/f;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateInputContent", "(Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "InputTextNonErroneousBottomPadding", "F", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,386:1\n1223#2,6:387\n1223#2,6:396\n1223#2,6:403\n1223#2,6:409\n1223#2,6:416\n141#3:393\n144#3:394\n138#3:395\n129#3:402\n148#4:415\n148#4:425\n148#4:426\n81#5:422\n107#5,2:423\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n65#1:387,6\n70#1:396,6\n125#1:403,6\n143#1:409,6\n189#1:416,6\n66#1:393\n67#1:394\n68#1:395\n83#1:402\n184#1:415\n381#1:425\n385#1:426\n125#1:422\n125#1:423,2\n*E\n"})
/* loaded from: classes.dex */
public final class DateInputKt {

    @NotNull
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = C2331Dp.m13305constructorimpl(16);

    static {
        float f = 24;
        InputTextFieldPadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(10), C2331Dp.m13305constructorimpl(f), 0.0f, 8, null);
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(@Nullable final Long l, @NotNull final InterfaceC6471c interfaceC6471c, @NotNull final CalendarModel calendarModel, @NotNull final C6756f c6756f, @NotNull final DatePickerFormatter datePickerFormatter, @NotNull final SelectableDates selectableDates, @NotNull final DatePickerColors datePickerColors, @Nullable Composer composer, final int i) {
        int i8;
        Composer composer2;
        DateInputFormat dateInputFormat;
        int i9;
        ?? r02;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(643325609);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(calendarModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(c6756f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(selectableDates) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((599187 & i8) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i8, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.INSTANCE;
            String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_input_invalid_for_pattern), composerStartRestartGroup, 0);
            String strM9393getString2EP1pXo2 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_input_invalid_year_range), composerStartRestartGroup, 0);
            String strM9393getString2EP1pXo3 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_input_invalid_not_allowed), composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | ((i8 & 57344) == 16384 || ((i8 & 32768) != 0 && composerStartRestartGroup.changed(datePickerFormatter)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                dateInputFormat = dateInputFormat2;
                i9 = i8;
                r02 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(c6756f, selectableDates, dateInputFormat, datePickerFormatter, strM9393getString2EP1pXo, strM9393getString2EP1pXo2, strM9393getString2EP1pXo3, "", null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                composer2.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                composer2 = composerStartRestartGroup;
                i9 = i8;
                dateInputFormat = dateInputFormat2;
                r02 = 1;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            AbstractC5830k.m5329f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM9393getString2EP1pXo4 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_input_label), composer2, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r02, null), InputTextFieldPadding);
            int iM8575getSingleDateInputJ2x2o4M = InputIdentifier.INSTANCE.m8575getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1819015125, r02, new InterfaceC6473e() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i10) {
                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1819015125, i10, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                    }
                    String str = strM9393getString2EP1pXo4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    boolean zChanged3 = composer4.changed(str) | composer4.changed(upperCase);
                    final String str2 = strM9393getString2EP1pXo4;
                    final String str3 = upperCase;
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m9105Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC6471c) objRememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-564233108, r02, new InterfaceC6473e() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i10) {
                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564233108, i10, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.m9105Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new InterfaceC6471c() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3.1
                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            int i10 = i9 << 3;
            Composer composer4 = composer2;
            m8379DateInputTextFieldtQNruF0(modifierPadding, l, interfaceC6471c, calendarModel, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, iM8575getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, localeDefaultLocale, datePickerColors, composer4, (i10 & 112) | 1794054 | (i10 & 896) | (i10 & 7168), (i9 >> 18) & 14);
            composer3 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer5, int i11) {
                    DateInputKt.DateInputContent(l, interfaceC6471c, calendarModel, c6756f, datePickerFormatter, selectableDates, datePickerColors, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m8379DateInputTextFieldtQNruF0(@NotNull final Modifier modifier, @Nullable final Long l, @NotNull final InterfaceC6471c interfaceC6471c, @NotNull final CalendarModel calendarModel, @Nullable final InterfaceC6473e interfaceC6473e, @Nullable final InterfaceC6473e interfaceC6473e2, final int i, @NotNull final DateInputValidator dateInputValidator, @NotNull DateInputFormat dateInputFormat, @NotNull final Locale locale, @NotNull final DatePickerColors datePickerColors, @Nullable Composer composer, final int i8, final int i9) {
        int i10;
        InterfaceC6471c interfaceC6471c2;
        int i11;
        final MutableState mutableState;
        int i12;
        Composer composer2;
        final DateInputFormat dateInputFormat2 = dateInputFormat;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857008589);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            interfaceC6471c2 = interfaceC6471c;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6471c2) ? 256 : 128;
        } else {
            interfaceC6471c2 = interfaceC6471c;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i10 |= composerStartRestartGroup.changed(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= composerStartRestartGroup.changed(dateInputFormat2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(locale) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i10 & 306783379) == 306783378 && (i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, i10, i11, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m10224rememberSaveable(new Object[0], (Saver) null, (String) null, (InterfaceC6469a) new InterfaceC6469a() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            boolean zChangedInstance = ((i10 & 112) == 32) | composerStartRestartGroup.changedInstance(calendarModel);
            int i13 = 234881024 & i10;
            boolean zChangedInstance2 = zChangedInstance | (i13 == 67108864) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                    @Override // p152r6.InterfaceC6469a
                    @org.jetbrains.annotations.NotNull
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final androidx.compose.runtime.MutableState<androidx.compose.p011ui.text.input.TextFieldValue> invoke() {
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
                            long r3 = androidx.compose.p011ui.text.TextRangeKt.TextRange(r0, r0)
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
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0, 4);
            TextFieldValue textFieldValueDateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(mutableStateRememberSaveable);
            boolean zChanged = (i13 == 67108864) | composerStartRestartGroup.changed(mutableStateRememberSaveable) | composerStartRestartGroup.changed(mutableState2) | ((i10 & 896) == 256) | composerStartRestartGroup.changedInstance(calendarModel) | ((29360128 & i10) == 8388608) | ((3670016 & i10) == 1048576) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                i12 = i10;
                final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
                InterfaceC6471c interfaceC6471c4 = new InterfaceC6471c() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextFieldValue) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull TextFieldValue textFieldValue) {
                        if (textFieldValue.getText().length() <= dateInputFormat2.getPatternWithoutDelimiters().length()) {
                            String text = textFieldValue.getText();
                            for (int i14 = 0; i14 < text.length(); i14++) {
                                if (!Character.isDigit(text.charAt(i14))) {
                                    return;
                                }
                            }
                            mutableStateRememberSaveable.setValue(textFieldValue);
                            String string = AbstractC5855p.m5403k0(textFieldValue.getText()).toString();
                            Long lValueOf = null;
                            if (string.length() == 0 || string.length() < dateInputFormat2.getPatternWithoutDelimiters().length()) {
                                mutableState.setValue("");
                                interfaceC6471c3.invoke(null);
                                return;
                            }
                            CalendarDate calendarDate = calendarModel.parse(string, dateInputFormat2.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.m8380validateXivgLIo(calendarDate, i, locale));
                            InterfaceC6471c interfaceC6471c5 = interfaceC6471c3;
                            if (mutableState.getValue().length() == 0 && calendarDate != null) {
                                lValueOf = Long.valueOf(calendarDate.getUtcTimeMillis());
                            }
                            interfaceC6471c5.invoke(lValueOf);
                        }
                    }
                };
                dateInputFormat2 = dateInputFormat2;
                composerStartRestartGroup.updateRememberedValue(interfaceC6471c4);
                objRememberedValue2 = interfaceC6471c4;
            } else {
                mutableState = mutableState2;
                i12 = i10;
            }
            InterfaceC6471c interfaceC6471c5 = (InterfaceC6471c) objRememberedValue2;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, !AbstractC5855p.m5382P((CharSequence) mutableState.getValue()) ? C2331Dp.m13305constructorimpl(0) : InputTextNonErroneousBottomPadding, 7, null);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        if (AbstractC5855p.m5382P(mutableState.getValue())) {
                            return;
                        }
                        SemanticsPropertiesKt.error(semanticsPropertyReceiver, mutableState.getValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            OutlinedTextFieldKt.OutlinedTextField(textFieldValueDateInputTextField_tQNruF0$lambda$4, interfaceC6471c5, SemanticsModifierKt.semantics$default(modifierM7266paddingqDBjuR0$default, false, (InterfaceC6471c) objRememberedValue3, 1, null), false, false, (TextStyle) null, interfaceC6473e, interfaceC6473e2, (InterfaceC6473e) null, (InterfaceC6473e) null, (InterfaceC6473e) null, (InterfaceC6473e) null, (InterfaceC6473e) ComposableLambdaKt.rememberComposableLambda(-591991974, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i14) {
                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-591991974, i14, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!AbstractC5855p.m5382P(mutableState.getValue())) {
                        TextKt.m9105Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 0, 0, 131070);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), !AbstractC5855p.m5382P((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m13006getNumberPjHm6EE(), ImeAction.INSTANCE.m12950getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (AbstractC5824e) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), composerStartRestartGroup, (i12 << 6) & 33030144, 12779904, 0, 4001592);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    DateInputKt.m8379DateInputTextFieldtQNruF0(modifier, l, interfaceC6471c, calendarModel, interfaceC6473e, interfaceC6473e2, i, dateInputValidator, dateInputFormat2, locale, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9));
                }
            });
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    @NotNull
    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}

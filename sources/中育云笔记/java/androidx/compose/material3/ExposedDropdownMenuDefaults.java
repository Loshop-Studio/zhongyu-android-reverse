package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.MenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.RotateKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding = PaddingKt.m27452PaddingValuesYgX7TsA(ExposedDropdownMenu_androidKt.ExposedDropdownMenuItemHorizontalPadding, C3186Dp.m33501constructorimpl(0));

    private ExposedDropdownMenuDefaults() {
    }

    private static final boolean popupProperties_pR6Bxps$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public final void TrailingIcon(final boolean z10, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1987096744);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1987096744, i12, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
            }
            IconKt.m28746Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), (String) null, RotateKt.rotate(modifier, z10 ? 180.0f : 0.0f), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.1
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
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z10, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m28676outlinedTextFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM30877copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        int i16;
        long value;
        long jM30877copywmQWz5c$default2;
        int i17;
        long value2;
        long jM30877copywmQWz5c$default3;
        long j48;
        int i18;
        long value3;
        long jM30877copywmQWz5c$default4;
        long j49;
        int i19;
        long value4;
        long jM30877copywmQWz5c$default5;
        int i20;
        long value5;
        long jM30877copywmQWz5c$default6;
        int i21;
        long value6;
        long jM30877copywmQWz5c$default7;
        int i22;
        long value7;
        long jM30877copywmQWz5c$default8;
        long value8 = (i14 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value9 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j12;
        }
        long value10 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM30913getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j14;
        long jM30913getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j15;
        long jM30913getTransparent0d7_KjU3 = (i14 & 64) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j16;
        long jM30913getTransparent0d7_KjU4 = (i14 & 128) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j17;
        long value11 = (i14 & 256) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long value12 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        TextSelectionColors textSelectionColors3 = (i14 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i14 & 2048) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i16 = 6;
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i16 = 6;
            value = j20;
        }
        long value13 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, i16) : j21;
        if ((i14 & 8192) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, i16), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j22;
        }
        long j50 = jM30877copywmQWz5c$default2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        } else {
            i17 = 6;
            value2 = j23;
        }
        long value14 = (32768 & i14) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i17) : j24;
        long value15 = (65536 & i14) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i17) : j25;
        if ((131072 & i14) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i17), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j26;
        }
        if ((i14 & 262144) != 0) {
            j48 = jM30877copywmQWz5c$default3;
            i18 = 6;
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j48 = jM30877copywmQWz5c$default3;
            i18 = 6;
            value3 = j27;
        }
        long value16 = (i14 & 524288) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i18) : j28;
        long value17 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i18) : j29;
        if ((i14 & 2097152) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i18), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            j49 = jM30877copywmQWz5c$default4;
            i19 = 6;
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j49 = jM30877copywmQWz5c$default4;
            i19 = 6;
            value4 = j31;
        }
        long value18 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i19) : j32;
        long value19 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i19) : j33;
        if ((i14 & 33554432) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, i19), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j34;
        }
        if ((i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            i20 = 6;
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        } else {
            i20 = 6;
            value5 = j35;
        }
        long value20 = (i14 & 134217728) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j36;
        long value21 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j37;
        if ((i14 & 536870912) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i20), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default6 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i21 = 6;
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i21 = 6;
            value6 = j39;
        }
        long value22 = (i15 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j40;
        long value23 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j41;
        if ((i15 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i21), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default7 = j42;
        }
        if ((i15 & 8) != 0) {
            i22 = 6;
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i22 = 6;
            value7 = j43;
        }
        long value24 = (i15 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i22) : j44;
        long value25 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i22) : j45;
        if ((i15 & 64) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default8 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, i22), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default8 = j46;
        }
        long value26 = (i15 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1567195085, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
        }
        int i23 = i13 << 12;
        int i24 = i13 >> 18;
        int i25 = (i24 & 14) | 3072 | (i24 & 112) | (i24 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        long j51 = j48;
        TextFieldColors textFieldColorsM28945colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m28945colors0hiis_0(value8, value9, jM30877copywmQWz5c$default, value10, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU2, jM30913getTransparent0d7_KjU3, jM30913getTransparent0d7_KjU4, value11, value12, textSelectionColors4, value, value13, j50, value2, value14, value15, j51, value3, value16, value17, j49, value4, value18, value19, jM30877copywmQWz5c$default5, value5, value20, value21, jM30877copywmQWz5c$default6, value6, 0L, 0L, 0L, 0L, value22, value23, jM30877copywmQWz5c$default7, value7, value24, value25, jM30877copywmQWz5c$default8, value26, composer, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i23) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), i25, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM28945colors0hiis_0;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m28677outlinedTextFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        long jM30877copywmQWz5c$default;
        long jM30877copywmQWz5c$default2;
        long jM30877copywmQWz5c$default3;
        long jM30877copywmQWz5c$default4;
        long jM30877copywmQWz5c$default5;
        long jM30877copywmQWz5c$default6;
        long value = (i13 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        if ((i13 & 2) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j11;
        }
        long jM30913getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j12;
        long value2 = (i13 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value3 = (i13 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i13 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i13 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j15;
        long value5 = (i13 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j16;
        if ((i13 & 256) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j17;
        }
        long value6 = (i13 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j18;
        long value7 = (i13 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value8 = (i13 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        if ((i13 & 4096) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j21;
        }
        long value9 = (i13 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value10 = (i13 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value11 = (32768 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        if ((65536 & i13) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j25;
        }
        long value12 = (131072 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value13 = (262144 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value14 = (524288 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        if ((1048576 & i13) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j29;
        }
        long value15 = (2097152 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value16 = (4194304 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i13 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default6 = j32;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-836383316, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
        long value17 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM30877copywmQWz5c$default8 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = i12 << 15;
        int i22 = i12 << 18;
        int i23 = ((i11 >> 15) & 65534) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = ((i12 >> 6) & 14) | (i21 & 1879048192);
        long j33 = value;
        TextFieldColors textFieldColorsM28676outlinedTextFieldColorsFD9MK7s = m28676outlinedTextFieldColorsFD9MK7s(j33, value, jM30877copywmQWz5c$default, j33, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU, value2, value3, textSelectionColors2, value4, value5, jM30877copywmQWz5c$default2, value6, value7, value8, jM30877copywmQWz5c$default3, value9, value10, value11, jM30877copywmQWz5c$default4, value12, value13, value14, jM30877copywmQWz5c$default5, value15, value16, value16, jM30877copywmQWz5c$default6, value16, value17, value18, jM30877copywmQWz5c$default7, value19, value20, value21, jM30877copywmQWz5c$default8, value22, composer, i19, ((i10 >> 15) & 65534) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), i23, i24, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM28676outlinedTextFieldColorsFD9MK7s;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m28678outlinedTextFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, TextSelectionColors textSelectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM30877copywmQWz5c$default;
        long jM30877copywmQWz5c$default2;
        long jM30877copywmQWz5c$default3;
        long jM30877copywmQWz5c$default4;
        long jM30877copywmQWz5c$default5;
        long jM30877copywmQWz5c$default6;
        long jM30877copywmQWz5c$default7;
        long jM30877copywmQWz5c$default8;
        long value = (i14 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value2 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j12;
        }
        long value3 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM30913getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j14;
        long jM30913getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j15;
        long value4 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long value5 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        TextSelectionColors textSelectionColors2 = (i14 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j18;
        long value7 = (i14 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j19;
        if ((i14 & 2048) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j20;
        }
        long value8 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j21;
        long value9 = (i14 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long value10 = (i14 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        if ((32768 & i14) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j24;
        }
        long value11 = (i14 & 65536) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long value12 = (i14 & 131072) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long value13 = (i14 & 262144) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        if ((i14 & 524288) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j28;
        }
        long value14 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long value15 = (i14 & 2097152) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long value16 = (i14 & 4194304) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        if ((i14 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j32;
        }
        long value17 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long value18 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value19 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i14 & 134217728) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default6 = j36;
        }
        long value20 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value21 = (i14 & 536870912) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value22 = (i14 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if ((i15 & 1) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default7 = j40;
        }
        long value23 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long value24 = (i15 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long value25 = (i15 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        if ((i15 & 16) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default8 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default8 = j44;
        }
        long value26 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388128543, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & Opcodes.IAND) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        TextFieldColors textFieldColorsM28676outlinedTextFieldColorsFD9MK7s = m28676outlinedTextFieldColorsFD9MK7s(value, value2, jM30877copywmQWz5c$default, value3, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU, jM30913getTransparent0d7_KjU2, value4, value5, textSelectionColors2, value6, value7, jM30877copywmQWz5c$default2, value8, value9, value10, jM30877copywmQWz5c$default3, value11, value12, value13, jM30877copywmQWz5c$default4, value14, value15, value16, jM30877copywmQWz5c$default5, value17, value18, value19, jM30877copywmQWz5c$default6, value20, value21, value22, jM30877copywmQWz5c$default7, value23, value24, value25, jM30877copywmQWz5c$default8, value26, composer, i17, i19, ((i11 >> 24) & Opcodes.IAND) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & Opcodes.IAND) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM28676outlinedTextFieldColorsFD9MK7s;
    }

    @Composable
    /* renamed from: popupProperties-pR6Bxps$material3_release, reason: not valid java name */
    public final PopupProperties m28679popupPropertiespR6Bxps$material3_release(String str, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1724259382, i10, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer, 0, 3);
        int i11 = !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState) ? 393248 : 393216;
        MenuAnchorType.Companion companion = MenuAnchorType.Companion;
        if (MenuAnchorType.m28816equalsimpl0(str, companion.m28820getPrimaryEditableMg6Rgbw()) || (MenuAnchorType.m28816equalsimpl0(str, companion.m28822getSecondaryEditableMg6Rgbw()) && !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState))) {
            i11 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i11, false, false, false, false, false, 62, (AbstractC9972n) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    @Composable
    /* renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m28680textFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM30877copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        int i16;
        long value;
        long jM30877copywmQWz5c$default2;
        int i17;
        long value2;
        long jM30877copywmQWz5c$default3;
        long j48;
        int i18;
        long value3;
        long jM30877copywmQWz5c$default4;
        long j49;
        int i19;
        long value4;
        long jM30877copywmQWz5c$default5;
        int i20;
        long value5;
        long jM30877copywmQWz5c$default6;
        int i21;
        long value6;
        long jM30877copywmQWz5c$default7;
        long value7 = (i14 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value8 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j12;
        }
        long value9 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long value10 = (i14 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long value11 = (i14 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long value12 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j16;
        long value13 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j17;
        long value14 = (i14 & 256) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long value15 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        TextSelectionColors textSelectionColors3 = (i14 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i14 & 2048) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i16 = 6;
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i16 = 6;
            value = j20;
        }
        long value16 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, i16) : j21;
        if ((i14 & 8192) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, i16), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j22;
        }
        long j50 = jM30877copywmQWz5c$default2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        } else {
            i17 = 6;
            value2 = j23;
        }
        long value17 = (32768 & i14) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i17) : j24;
        long value18 = (65536 & i14) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i17) : j25;
        if ((131072 & i14) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i17), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j26;
        }
        if ((i14 & 262144) != 0) {
            j48 = jM30877copywmQWz5c$default3;
            i18 = 6;
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j48 = jM30877copywmQWz5c$default3;
            i18 = 6;
            value3 = j27;
        }
        long value19 = (i14 & 524288) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i18) : j28;
        long value20 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i18) : j29;
        if ((i14 & 2097152) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i18), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            j49 = jM30877copywmQWz5c$default4;
            i19 = 6;
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j49 = jM30877copywmQWz5c$default4;
            i19 = 6;
            value4 = j31;
        }
        long value21 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i19) : j32;
        long value22 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i19) : j33;
        long value23 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i19) : j34;
        long value24 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, i19) : j35;
        long value25 = (i14 & 134217728) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i19) : j36;
        long value26 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i19) : j37;
        if ((i14 & 536870912) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, i19), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i20 = 6;
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i20 = 6;
            value5 = j39;
        }
        long value27 = (i15 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j40;
        long value28 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j41;
        if ((i15 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i20), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default6 = j42;
        }
        if ((i15 & 8) != 0) {
            i21 = 6;
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i21 = 6;
            value6 = j43;
        }
        long value29 = (i15 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j44;
        long value30 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j45;
        if ((i15 & 64) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i21), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default7 = j46;
        }
        long value31 = (i15 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(768358577, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
        }
        int i22 = i13 << 12;
        int i23 = i13 >> 18;
        int i24 = (i23 & 14) | 3072 | (i23 & 112) | (i23 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        long j51 = j48;
        TextFieldColors textFieldColorsM29282colors0hiis_0 = TextFieldDefaults.INSTANCE.m29282colors0hiis_0(value7, value8, jM30877copywmQWz5c$default, value9, value10, value11, value12, value13, value14, value15, textSelectionColors4, value, value16, j50, value2, value17, value18, j51, value3, value19, value20, j49, value4, value21, value22, value23, value24, value25, value26, jM30877copywmQWz5c$default5, value5, 0L, 0L, 0L, 0L, value27, value28, jM30877copywmQWz5c$default6, value6, value29, value30, jM30877copywmQWz5c$default7, value31, composer, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i24, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM29282colors0hiis_0;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m28681textFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        long jM30877copywmQWz5c$default;
        long jM30877copywmQWz5c$default2;
        long jM30877copywmQWz5c$default3;
        long jM30877copywmQWz5c$default4;
        long jM30877copywmQWz5c$default5;
        long value = (i13 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        if ((i13 & 2) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j11;
        }
        long value2 = (i13 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j12;
        long value3 = (i13 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value4 = (i13 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        TextSelectionColors textSelectionColors2 = (i13 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value5 = (i13 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j15;
        long value6 = (i13 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j16;
        if ((i13 & 256) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j17;
        }
        long value7 = (i13 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j18;
        long value8 = (i13 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value9 = (i13 & 2048) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        if ((i13 & 4096) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j21;
        }
        long value10 = (i13 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value11 = (i13 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value12 = (32768 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        if ((65536 & i13) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j25;
        }
        long value13 = (131072 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value14 = (262144 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value15 = (524288 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long value16 = (1048576 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j29;
        long value17 = (2097152 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value18 = (4194304 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i13 & 8388608) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j32;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343678550, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = i12 << 15;
        int i22 = i12 << 18;
        int i23 = ((i11 >> 15) & 65534) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = ((i12 >> 6) & 14) | (i21 & 1879048192);
        long j33 = value;
        TextFieldColors textFieldColorsM28680textFieldColorsFD9MK7s = m28680textFieldColorsFD9MK7s(j33, value, jM30877copywmQWz5c$default, j33, value2, value2, value2, value2, value3, value4, textSelectionColors2, value5, value6, jM30877copywmQWz5c$default2, value7, value8, value9, jM30877copywmQWz5c$default3, value10, value11, value12, jM30877copywmQWz5c$default4, value13, value14, value15, value16, value17, value18, value18, jM30877copywmQWz5c$default5, value18, value19, value20, jM30877copywmQWz5c$default6, value21, value22, value23, jM30877copywmQWz5c$default7, value24, composer, i19, ((i10 >> 15) & 65534) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), i23, i24, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM28680textFieldColorsFD9MK7s;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m28682textFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, TextSelectionColors textSelectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM30877copywmQWz5c$default;
        long jM30877copywmQWz5c$default2;
        long jM30877copywmQWz5c$default3;
        long jM30877copywmQWz5c$default4;
        long jM30877copywmQWz5c$default5;
        long jM30877copywmQWz5c$default6;
        long jM30877copywmQWz5c$default7;
        long value = (i14 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value2 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j12;
        }
        long value3 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long value4 = (i14 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long value5 = (i14 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long value6 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long value7 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        TextSelectionColors textSelectionColors2 = (i14 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value8 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j18;
        long value9 = (i14 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j19;
        if ((i14 & 2048) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j20;
        }
        long value10 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j21;
        long value11 = (i14 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long value12 = (i14 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        if ((32768 & i14) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j24;
        }
        long value13 = (i14 & 65536) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long value14 = (i14 & 131072) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long value15 = (i14 & 262144) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        if ((i14 & 524288) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default4 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default4 = j28;
        }
        long value16 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long value17 = (i14 & 2097152) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long value18 = (i14 & 4194304) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        long value19 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j32;
        long value20 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long value21 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value22 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i14 & 134217728) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default5 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default5 = j36;
        }
        long value23 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value24 = (i14 & 536870912) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value25 = (i14 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if ((i15 & 1) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default6 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default6 = j40;
        }
        long value26 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long value27 = (i15 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long value28 = (i15 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        if ((i15 & 16) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM30877copywmQWz5c$default7 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default7 = j44;
        }
        long value29 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & Opcodes.IAND) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        TextFieldColors textFieldColorsM28680textFieldColorsFD9MK7s = m28680textFieldColorsFD9MK7s(value, value2, jM30877copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, textSelectionColors2, value8, value9, jM30877copywmQWz5c$default2, value10, value11, value12, jM30877copywmQWz5c$default3, value13, value14, value15, jM30877copywmQWz5c$default4, value16, value17, value18, value19, value20, value21, value22, jM30877copywmQWz5c$default5, value23, value24, value25, jM30877copywmQWz5c$default6, value26, value27, value28, jM30877copywmQWz5c$default7, value29, composer, i17, i19, ((i11 >> 24) & Opcodes.IAND) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & Opcodes.IAND) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM28680textFieldColorsFD9MK7s;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterial3Api
    @Composable
    @InterfaceC10770a
    public final /* synthetic */ void TrailingIcon(boolean z10, Composer composer, final int i10) {
        int i11;
        final boolean z11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-473088613);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z11 = z10;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, i11, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
            }
            z11 = z10;
            TrailingIcon(z11, Modifier.Companion, composerStartRestartGroup, (i11 & 14) | 48 | ((i11 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.2
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
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}

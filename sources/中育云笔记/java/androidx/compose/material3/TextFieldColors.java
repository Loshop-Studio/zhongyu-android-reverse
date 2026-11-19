package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, textSelectionColors, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51);
    }

    /* renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m29217copyejIjP34$default(TextFieldColors textFieldColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, int i10, int i11, Object obj) {
        long j52;
        long j53;
        long j54 = (i10 & 1) != 0 ? textFieldColors.focusedTextColor : j10;
        long j55 = (i10 & 2) != 0 ? textFieldColors.unfocusedTextColor : j11;
        long j56 = (i10 & 4) != 0 ? textFieldColors.disabledTextColor : j12;
        long j57 = (i10 & 8) != 0 ? textFieldColors.errorTextColor : j13;
        long j58 = (i10 & 16) != 0 ? textFieldColors.focusedContainerColor : j14;
        long j59 = (i10 & 32) != 0 ? textFieldColors.unfocusedContainerColor : j15;
        if ((i10 & 64) != 0) {
            j52 = j54;
            j53 = textFieldColors.disabledContainerColor;
        } else {
            j52 = j54;
            j53 = j16;
        }
        return textFieldColors.m29219copyejIjP34(j52, j55, j56, j57, j58, j59, j53, (i10 & 128) != 0 ? textFieldColors.errorContainerColor : j17, (i10 & 256) != 0 ? textFieldColors.cursorColor : j18, (i10 & 512) != 0 ? textFieldColors.errorCursorColor : j19, (i10 & 1024) != 0 ? textFieldColors.textSelectionColors : textSelectionColors, (i10 & 2048) != 0 ? textFieldColors.focusedIndicatorColor : j20, (i10 & 4096) != 0 ? textFieldColors.unfocusedIndicatorColor : j21, (i10 & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j22, (i10 & 16384) != 0 ? textFieldColors.errorIndicatorColor : j23, (i10 & 32768) != 0 ? textFieldColors.focusedLeadingIconColor : j24, (i10 & 65536) != 0 ? textFieldColors.unfocusedLeadingIconColor : j25, (i10 & 131072) != 0 ? textFieldColors.disabledLeadingIconColor : j26, (i10 & 262144) != 0 ? textFieldColors.errorLeadingIconColor : j27, (i10 & 524288) != 0 ? textFieldColors.focusedTrailingIconColor : j28, (i10 & 1048576) != 0 ? textFieldColors.unfocusedTrailingIconColor : j29, (i10 & 2097152) != 0 ? textFieldColors.disabledTrailingIconColor : j30, (i10 & 4194304) != 0 ? textFieldColors.errorTrailingIconColor : j31, (i10 & 8388608) != 0 ? textFieldColors.focusedLabelColor : j32, (i10 & 16777216) != 0 ? textFieldColors.unfocusedLabelColor : j33, (i10 & 33554432) != 0 ? textFieldColors.disabledLabelColor : j34, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? textFieldColors.errorLabelColor : j35, (i10 & 134217728) != 0 ? textFieldColors.focusedPlaceholderColor : j36, (i10 & 268435456) != 0 ? textFieldColors.unfocusedPlaceholderColor : j37, (i10 & 536870912) != 0 ? textFieldColors.disabledPlaceholderColor : j38, (i10 & 1073741824) != 0 ? textFieldColors.errorPlaceholderColor : j39, (i10 & Integer.MIN_VALUE) != 0 ? textFieldColors.focusedSupportingTextColor : j40, (i11 & 1) != 0 ? textFieldColors.unfocusedSupportingTextColor : j41, (i11 & 2) != 0 ? textFieldColors.disabledSupportingTextColor : j42, (i11 & 4) != 0 ? textFieldColors.errorSupportingTextColor : j43, (i11 & 8) != 0 ? textFieldColors.focusedPrefixColor : j44, (i11 & 16) != 0 ? textFieldColors.unfocusedPrefixColor : j45, (i11 & 32) != 0 ? textFieldColors.disabledPrefixColor : j46, (i11 & 64) != 0 ? textFieldColors.errorPrefixColor : j47, (i11 & 128) != 0 ? textFieldColors.focusedSuffixColor : j48, (i11 & 256) != 0 ? textFieldColors.unfocusedSuffixColor : j49, (i11 & 512) != 0 ? textFieldColors.disabledSuffixColor : j50, (i11 & 1024) != 0 ? textFieldColors.errorSuffixColor : j51);
    }

    @Stable
    /* renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29218containerColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledContainerColor : z11 ? this.errorContainerColor : z12 ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m29219copyejIjP34(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51) {
        return new TextFieldColors(j10 != 16 ? j10 : this.focusedTextColor, j11 != 16 ? j11 : this.unfocusedTextColor, j12 != 16 ? j12 : this.disabledTextColor, j13 != 16 ? j13 : this.errorTextColor, j14 != 16 ? j14 : this.focusedContainerColor, j15 != 16 ? j15 : this.unfocusedContainerColor, j16 != 16 ? j16 : this.disabledContainerColor, j17 != 16 ? j17 : this.errorContainerColor, j18 != 16 ? j18 : this.cursorColor, j19 != 16 ? j19 : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new InterfaceC9529a() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final TextSelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        }), j20 != 16 ? j20 : this.focusedIndicatorColor, j21 != 16 ? j21 : this.unfocusedIndicatorColor, j22 != 16 ? j22 : this.disabledIndicatorColor, j23 != 16 ? j23 : this.errorIndicatorColor, j24 != 16 ? j24 : this.focusedLeadingIconColor, j25 != 16 ? j25 : this.unfocusedLeadingIconColor, j26 != 16 ? j26 : this.disabledLeadingIconColor, j27 != 16 ? j27 : this.errorLeadingIconColor, j28 != 16 ? j28 : this.focusedTrailingIconColor, j29 != 16 ? j29 : this.unfocusedTrailingIconColor, j30 != 16 ? j30 : this.disabledTrailingIconColor, j31 != 16 ? j31 : this.errorTrailingIconColor, j32 != 16 ? j32 : this.focusedLabelColor, j33 != 16 ? j33 : this.unfocusedLabelColor, j34 != 16 ? j34 : this.disabledLabelColor, j35 != 16 ? j35 : this.errorLabelColor, j36 != 16 ? j36 : this.focusedPlaceholderColor, j37 != 16 ? j37 : this.unfocusedPlaceholderColor, j38 != 16 ? j38 : this.disabledPlaceholderColor, j39 != 16 ? j39 : this.errorPlaceholderColor, j40 != 16 ? j40 : this.focusedSupportingTextColor, j41 != 16 ? j41 : this.unfocusedSupportingTextColor, j42 != 16 ? j42 : this.disabledSupportingTextColor, j43 != 16 ? j43 : this.errorSupportingTextColor, j44 != 16 ? j44 : this.focusedPrefixColor, j45 != 16 ? j45 : this.unfocusedPrefixColor, j46 != 16 ? j46 : this.disabledPrefixColor, j47 != 16 ? j47 : this.errorPrefixColor, j48 != 16 ? j48 : this.focusedSuffixColor, j49 != 16 ? j49 : this.unfocusedSuffixColor, j50 != 16 ? j50 : this.disabledSuffixColor, j51 != 16 ? j51 : this.errorSuffixColor, null);
    }

    @Stable
    /* renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29220cursorColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        return Color.m30879equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m30879equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m30879equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m30879equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m30879equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m30879equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m30879equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m30879equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m30879equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m30879equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && AbstractC9979u.m20289b(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m30879equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m30879equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m30879equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m30879equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m30879equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m30879equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m30879equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m30879equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m30879equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m30879equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m30879equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m30879equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m30879equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m30879equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m30879equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m30879equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m30879equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m30879equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m30879equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m30879equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m30879equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m30879equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m30879equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m30879equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m30879equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m30879equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m30879equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m30879equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m30879equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m30879equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m30879equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m30879equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m29221getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29222getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m29223getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m29224getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29225getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m29226getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m29227getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m29228getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m29229getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m29230getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29231getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29232getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m29233getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m29234getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m29235getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29236getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m29237getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m29238getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m29239getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m29240getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m29241getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29242getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29243getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m29244getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m29245getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29246getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m29247getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m29248getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m29249getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m29250getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m29251getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29252getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29253getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m29254getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m29255getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29256getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m29257getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m29258getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m29259getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m29260getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m29261getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m29262getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m30885hashCodeimpl(this.focusedTextColor) * 31) + Color.m30885hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTextColor)) * 31) + Color.m30885hashCodeimpl(this.errorTextColor)) * 31) + Color.m30885hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m30885hashCodeimpl(this.errorContainerColor)) * 31) + Color.m30885hashCodeimpl(this.cursorColor)) * 31) + Color.m30885hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m30885hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m30885hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m30885hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m30885hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m30885hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m30885hashCodeimpl(this.errorLabelColor)) * 31) + Color.m30885hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m30885hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m30885hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m30885hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m30885hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m30885hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m30885hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m30885hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m30885hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m30885hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m30885hashCodeimpl(this.errorSuffixColor);
    }

    @Stable
    /* renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29263indicatorColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledIndicatorColor : z11 ? this.errorIndicatorColor : z12 ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    @Stable
    /* renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29264labelColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledLabelColor : z11 ? this.errorLabelColor : z12 ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29265leadingIconColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledLeadingIconColor : z11 ? this.errorLeadingIconColor : z12 ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    @Stable
    /* renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29266placeholderColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledPlaceholderColor : z11 ? this.errorPlaceholderColor : z12 ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    @Stable
    /* renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29267prefixColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledPrefixColor : z11 ? this.errorPrefixColor : z12 ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    @Stable
    /* renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29268suffixColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledSuffixColor : z11 ? this.errorSuffixColor : z12 ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    @Stable
    /* renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29269supportingTextColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledSupportingTextColor : z11 ? this.errorSupportingTextColor : z12 ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final TextSelectionColors takeOrElse$material3_release(TextSelectionColors textSelectionColors, InterfaceC9529a interfaceC9529a) {
        return textSelectionColors == null ? (TextSelectionColors) interfaceC9529a.invoke() : textSelectionColors;
    }

    @Stable
    /* renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29270textColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledTextColor : z11 ? this.errorTextColor : z12 ? this.focusedTextColor : this.unfocusedTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m29271trailingIconColorXeAY9LY$material3_release(boolean z10, boolean z11, boolean z12) {
        return !z10 ? this.disabledTrailingIconColor : z11 ? this.errorTrailingIconColor : z12 ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private TextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51) {
        this.focusedTextColor = j10;
        this.unfocusedTextColor = j11;
        this.disabledTextColor = j12;
        this.errorTextColor = j13;
        this.focusedContainerColor = j14;
        this.unfocusedContainerColor = j15;
        this.disabledContainerColor = j16;
        this.errorContainerColor = j17;
        this.cursorColor = j18;
        this.errorCursorColor = j19;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j20;
        this.unfocusedIndicatorColor = j21;
        this.disabledIndicatorColor = j22;
        this.errorIndicatorColor = j23;
        this.focusedLeadingIconColor = j24;
        this.unfocusedLeadingIconColor = j25;
        this.disabledLeadingIconColor = j26;
        this.errorLeadingIconColor = j27;
        this.focusedTrailingIconColor = j28;
        this.unfocusedTrailingIconColor = j29;
        this.disabledTrailingIconColor = j30;
        this.errorTrailingIconColor = j31;
        this.focusedLabelColor = j32;
        this.unfocusedLabelColor = j33;
        this.disabledLabelColor = j34;
        this.errorLabelColor = j35;
        this.focusedPlaceholderColor = j36;
        this.unfocusedPlaceholderColor = j37;
        this.disabledPlaceholderColor = j38;
        this.errorPlaceholderColor = j39;
        this.focusedSupportingTextColor = j40;
        this.unfocusedSupportingTextColor = j41;
        this.disabledSupportingTextColor = j42;
        this.errorSupportingTextColor = j43;
        this.focusedPrefixColor = j44;
        this.unfocusedPrefixColor = j45;
        this.disabledPrefixColor = j46;
        this.errorPrefixColor = j47;
        this.focusedSuffixColor = j48;
        this.unfocusedSuffixColor = j49;
        this.disabledSuffixColor = j50;
        this.errorSuffixColor = j51;
    }
}

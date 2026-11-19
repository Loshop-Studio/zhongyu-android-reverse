package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m23306getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m23308getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m23304getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m22155getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached$material3_release = colorScheme.getDefaultInputChipColorsCached$material3_release();
        if (defaultInputChipColorsCached$material3_release != null) {
            return defaultInputChipColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM24311getTransparent0d7_KjU = companion.m24311getTransparent0d7_KjU();
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM24311getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedTrailingIconColor()), companion.m24311getTransparent0d7_KjU(), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedContainerColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m22156getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m22157getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i10, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    /* renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m22158inputChipBorder_7El2pE(boolean z10, boolean z11, long j10, long j11, long j12, long j13, float f10, float f11, Composer composer, int i10, int i11) {
        long value = (i11 & 4) != 0 ? ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j10;
        long jM24311getTransparent0d7_KjU = (i11 & 8) != 0 ? Color.Companion.m24311getTransparent0d7_KjU() : j11;
        long jM24275copywmQWz5c$default = (i11 & 16) != 0 ? Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM24311getTransparent0d7_KjU2 = (i11 & 32) != 0 ? Color.Companion.m24311getTransparent0d7_KjU() : j13;
        float fM23311getUnselectedOutlineWidthD9Ej5fM = (i11 & 64) != 0 ? InputChipTokens.INSTANCE.m23311getUnselectedOutlineWidthD9Ej5fM() : f10;
        float fM23309getSelectedOutlineWidthD9Ej5fM = (i11 & 128) != 0 ? InputChipTokens.INSTANCE.m23309getSelectedOutlineWidthD9Ej5fM() : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if (!z10) {
            value = z11 ? jM24311getTransparent0d7_KjU2 : jM24275copywmQWz5c$default;
        } else if (z11) {
            value = jM24311getTransparent0d7_KjU;
        }
        if (z11) {
            fM23311getUnselectedOutlineWidthD9Ej5fM = fM23309getSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM20377BorderStrokecXLIe8U = BorderStrokeKt.m20377BorderStrokecXLIe8U(fM23311getUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM20377BorderStrokecXLIe8U;
    }

    @Composable
    public final SelectableChipColors inputChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
        }
        SelectableChipColors defaultInputChipColors$material3_release = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultInputChipColors$material3_release;
    }

    @Composable
    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m22159inputChipColorskwJvTHA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i10, int i11, int i12) {
        long j23;
        long j24;
        long jM24312getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        long jM24312getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j16;
        long jM24312getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j17;
        long j25 = jM24312getUnspecified0d7_KjU;
        long jM24312getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j18;
        long jM24312getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j19;
        long jM24312getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j20;
        long jM24312getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j21;
        long jM24312getUnspecified0d7_KjU13 = (i12 & 4096) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j22;
        if (ComposerKt.isTraceInProgress()) {
            j23 = jM24312getUnspecified0d7_KjU12;
            j24 = jM24312getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1312840646, i10, i11, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
        } else {
            j23 = jM24312getUnspecified0d7_KjU12;
            j24 = jM24312getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM22461copydaRQuJA = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m22461copydaRQuJA(j25, j24, jM24312getUnspecified0d7_KjU3, jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, jM24312getUnspecified0d7_KjU7, jM24312getUnspecified0d7_KjU8, jM24312getUnspecified0d7_KjU9, jM24312getUnspecified0d7_KjU10, jM24312getUnspecified0d7_KjU11, j23, jM24312getUnspecified0d7_KjU13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM22461copydaRQuJA;
    }

    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m22160inputChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = InputChipTokens.INSTANCE.m23305getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = f10;
        }
        if ((i11 & 4) != 0) {
            f12 = f10;
        }
        if ((i11 & 8) != 0) {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            f14 = InputChipTokens.INSTANCE.m23307getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }
}

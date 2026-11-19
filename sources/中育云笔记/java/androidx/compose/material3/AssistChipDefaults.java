package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m29618getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m29627getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m28361assistChipBorderd_3_b6Q(long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM30877copywmQWz5c$default;
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 2) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j11;
        }
        float fM29626getFlatOutlineWidthD9Ej5fM = (i11 & 4) != 0 ? AssistChipTokens.INSTANCE.m29626getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM30877copywmQWz5c$default, fM29626getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    @Composable
    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m28362assistChipBorderh1eTWw(boolean z10, long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM30877copywmQWz5c$default;
        long value = (i11 & 2) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 4) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j11;
        }
        float fM29626getFlatOutlineWidthD9Ej5fM = (i11 & 8) != 0 ? AssistChipTokens.INSTANCE.m29626getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if (!z10) {
            value = jM30877copywmQWz5c$default;
        }
        BorderStroke borderStrokeM26979BorderStrokecXLIe8U = BorderStrokeKt.m26979BorderStrokecXLIe8U(fM29626getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM26979BorderStrokecXLIe8U;
    }

    @Composable
    public final ChipColors assistChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
        }
        ChipColors defaultAssistChipColors$material3_release = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultAssistChipColors$material3_release;
    }

    @Composable
    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m28363assistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i10, int i11) {
        long j18;
        long j19;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        if (ComposerKt.isTraceInProgress()) {
            j18 = jM30914getUnspecified0d7_KjU;
            j19 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-391745725, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
        } else {
            j18 = jM30914getUnspecified0d7_KjU;
            j19 = jM30914getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM28437copyFD3wquc = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28437copyFD3wquc(j18, j19, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM28437copyFD3wquc;
    }

    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m28364assistChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = AssistChipTokens.INSTANCE.m29625getFlatContainerElevationD9Ej5fM();
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
            f14 = AssistChipTokens.INSTANCE.m29619getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        ChipElevation chipElevation = new ChipElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    @Composable
    public final ChipColors elevatedAssistChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
        }
        ChipColors defaultElevatedAssistChipColors$material3_release = getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedAssistChipColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m28365elevatedAssistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i10, int i11) {
        long j18;
        long j19;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        if (ComposerKt.isTraceInProgress()) {
            j18 = jM30914getUnspecified0d7_KjU;
            j19 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-535762675, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
        } else {
            j18 = jM30914getUnspecified0d7_KjU;
            j19 = jM30914getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM28437copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28437copyFD3wquc(j18, j19, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM28437copyFD3wquc;
    }

    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m28366elevatedAssistChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = AssistChipTokens.INSTANCE.m29620getElevatedContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = AssistChipTokens.INSTANCE.m29624getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = AssistChipTokens.INSTANCE.m29622getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = AssistChipTokens.INSTANCE.m29623getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = AssistChipTokens.INSTANCE.m29619getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = AssistChipTokens.INSTANCE.m29621getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        ChipElevation chipElevation = new ChipElevation(f19, f11, f18, f13, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    public final ChipColors getDefaultAssistChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached$material3_release = colorScheme.getDefaultAssistChipColorsCached$material3_release();
        if (defaultAssistChipColorsCached$material3_release != null) {
            return defaultAssistChipColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM30913getTransparent0d7_KjU = companion.m30913getTransparent0d7_KjU();
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jM30913getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), companion.m30913getTransparent0d7_KjU(), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached$material3_release = colorScheme.getDefaultElevatedAssistChipColorsCached$material3_release();
        if (defaultElevatedAssistChipColorsCached$material3_release != null) {
            return defaultElevatedAssistChipColorsCached$material3_release;
        }
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedDisabledContainerColor()), assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m28367getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m28368getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i10, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}

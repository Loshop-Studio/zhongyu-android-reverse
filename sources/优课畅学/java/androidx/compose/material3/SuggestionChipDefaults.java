package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m23518getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m23527getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    @Composable
    public final ChipColors elevatedSuggestionChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedSuggestionChipColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m22541elevatedSuggestionChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long jM24312getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1879)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors chipColorsM21835copyFD3wquc = defaultElevatedSuggestionChipColors$material3_release.m21835copyFD3wquc(jM24312getUnspecified0d7_KjU, jM24312getUnspecified0d7_KjU2, jM24312getUnspecified0d7_KjU3, companion.m24312getUnspecified0d7_KjU(), jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, companion.m24312getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM21835copyFD3wquc;
    }

    @Composable
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m22542elevatedSuggestionChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = SuggestionChipTokens.INSTANCE.m23520getElevatedContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = SuggestionChipTokens.INSTANCE.m23524getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = SuggestionChipTokens.INSTANCE.m23522getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = SuggestionChipTokens.INSTANCE.m23523getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = SuggestionChipTokens.INSTANCE.m23519getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = SuggestionChipTokens.INSTANCE.m23521getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
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

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached$material3_release = colorScheme.getDefaultElevatedSuggestionChipColorsCached$material3_release();
        if (defaultElevatedSuggestionChipColorsCached$material3_release != null) {
            return defaultElevatedSuggestionChipColorsCached$material3_release;
        }
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedContainerColor());
        long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor());
        long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor());
        Color.Companion companion = Color.Companion;
        long jM24312getUnspecified0d7_KjU = companion.m24312getUnspecified0d7_KjU();
        long jFromToken4 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedDisabledContainerColor());
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jFromToken, jFromToken2, jFromToken3, jM24312getUnspecified0d7_KjU, Color.m24275copywmQWz5c$default(jFromToken4, assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), suggestionChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m24312getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m22543getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m22544getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m22545suggestionChipBorderd_3_b6Q(long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM24275copywmQWz5c$default;
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 2) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM24275copywmQWz5c$default = j11;
        }
        float fM23526getFlatOutlineWidthD9Ej5fM = (i11 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m23526getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM24275copywmQWz5c$default, fM23526getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    @Composable
    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m22546suggestionChipBorderh1eTWw(boolean z10, long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM24275copywmQWz5c$default;
        long value = (i11 & 2) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 4) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM24275copywmQWz5c$default = j11;
        }
        float fM23526getFlatOutlineWidthD9Ej5fM = (i11 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m23526getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
        }
        if (!z10) {
            value = jM24275copywmQWz5c$default;
        }
        BorderStroke borderStrokeM20377BorderStrokecXLIe8U = BorderStrokeKt.m20377BorderStrokecXLIe8U(fM23526getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM20377BorderStrokecXLIe8U;
    }

    @Composable
    public final ChipColors suggestionChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSuggestionChipColors;
    }

    @Composable
    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m22547suggestionChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long jM24312getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1761)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors chipColorsM21835copyFD3wquc = defaultSuggestionChipColors.m21835copyFD3wquc(jM24312getUnspecified0d7_KjU, jM24312getUnspecified0d7_KjU2, jM24312getUnspecified0d7_KjU3, companion.m24312getUnspecified0d7_KjU(), jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, companion.m24312getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM21835copyFD3wquc;
    }

    @Composable
    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m22548suggestionChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = SuggestionChipTokens.INSTANCE.m23525getFlatContainerElevationD9Ej5fM();
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
            f14 = SuggestionChipTokens.INSTANCE.m23519getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
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
}

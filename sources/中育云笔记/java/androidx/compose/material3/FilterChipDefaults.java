package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m29887getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m29903getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @Composable
    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i10, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedFilterChipColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m28704elevatedFilterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i10, int i11, int i12) {
        long j22;
        long j23;
        long jM30914getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        long j24 = jM30914getUnspecified0d7_KjU;
        long jM30914getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j18;
        long jM30914getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j19;
        long jM30914getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j20;
        long jM30914getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j21;
        if (ComposerKt.isTraceInProgress()) {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-915841711, i10, i11, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        } else {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM29063copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m29063copydaRQuJA(j24, j23, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8, jM30914getUnspecified0d7_KjU9, jM30914getUnspecified0d7_KjU10, j22, jM30914getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM29063copydaRQuJA;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m28705elevatedFilterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m29889getElevatedContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m29893getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m29891getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m29892getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m29888getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = FilterChipTokens.INSTANCE.m29890getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i10, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
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

    @Composable
    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m28706filterChipBorder_7El2pE(boolean z10, boolean z11, long j10, long j11, long j12, long j13, float f10, float f11, Composer composer, int i10, int i11) {
        long jM30877copywmQWz5c$default;
        long value = (i11 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j10;
        long jM30913getTransparent0d7_KjU = (i11 & 8) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j11;
        if ((i11 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(filterChipTokens.getFlatDisabledUnselectedOutlineColor(), composer, 6), filterChipTokens.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j12;
        }
        long jM30913getTransparent0d7_KjU2 = (i11 & 32) != 0 ? Color.Companion.m30913getTransparent0d7_KjU() : j13;
        float fM29901getFlatUnselectedOutlineWidthD9Ej5fM = (i11 & 64) != 0 ? FilterChipTokens.INSTANCE.m29901getFlatUnselectedOutlineWidthD9Ej5fM() : f10;
        float fM29897getFlatSelectedOutlineWidthD9Ej5fM = (i11 & 128) != 0 ? FilterChipTokens.INSTANCE.m29897getFlatSelectedOutlineWidthD9Ej5fM() : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z10) {
            value = z11 ? jM30913getTransparent0d7_KjU2 : jM30877copywmQWz5c$default;
        } else if (z11) {
            value = jM30913getTransparent0d7_KjU;
        }
        if (z11) {
            fM29901getFlatUnselectedOutlineWidthD9Ej5fM = fM29897getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM26979BorderStrokecXLIe8U = BorderStrokeKt.m26979BorderStrokecXLIe8U(fM29901getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM26979BorderStrokecXLIe8U;
    }

    @Composable
    public final SelectableChipColors filterChipColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilterChipColors$material3_release;
    }

    @Composable
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m28707filterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i10, int i11, int i12) {
        long j22;
        long j23;
        long jM30914getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        long j24 = jM30914getUnspecified0d7_KjU;
        long jM30914getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j18;
        long jM30914getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j19;
        long jM30914getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j20;
        long jM30914getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j21;
        if (ComposerKt.isTraceInProgress()) {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-1831479801, i10, i11, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        } else {
            j22 = jM30914getUnspecified0d7_KjU11;
            j23 = jM30914getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM29063copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m29063copydaRQuJA(j24, j23, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8, jM30914getUnspecified0d7_KjU9, jM30914getUnspecified0d7_KjU10, j22, jM30914getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM29063copydaRQuJA;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m28708filterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m29894getFlatContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m29898getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m29895getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m29896getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m29888getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
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

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached$material3_release = colorScheme.getDefaultElevatedFilterChipColorsCached$material3_release();
        if (defaultElevatedFilterChipColorsCached$material3_release != null) {
            return defaultElevatedFilterChipColorsCached$material3_release;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached$material3_release = colorScheme.getDefaultFilterChipColorsCached$material3_release();
        if (defaultFilterChipColorsCached$material3_release != null) {
            return defaultFilterChipColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM30913getTransparent0d7_KjU = companion.m30913getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM30913getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), companion.m30913getTransparent0d7_KjU(), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), filterChipTokens.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m28709getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m28710getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i10, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}

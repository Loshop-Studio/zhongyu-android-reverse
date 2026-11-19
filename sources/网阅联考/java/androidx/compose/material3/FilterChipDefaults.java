package androidx.compose.material3;

import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u008d\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(JQ\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020\u00112\b\b\u0002\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u008d\u0001\u00103\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u001eJQ\u00105\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010(R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, m5175d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "elevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/material3/SelectableChipBorder;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-gHcDVlo", "(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m8511getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m8527getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m7985elevatedFilterChipColorsXqyqHi0(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i4, int i5, int i6) {
        composer.startReplaceableGroup(-915841711);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor(), composer, 6) : j4;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j5;
        long color3 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j6;
        long jM9177copywmQWz5c$default = (i6 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM9177copywmQWz5c$default2 = (i6 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM9177copywmQWz5c$default3 = (i6 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long j16 = (i6 & 64) != 0 ? jM9177copywmQWz5c$default3 : j10;
        long color4 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor(), composer, 6) : j11;
        long j17 = (i6 & 256) != 0 ? jM9177copywmQWz5c$default : j12;
        long color5 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j13;
        long color6 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j14;
        long j18 = (i6 & 2048) != 0 ? color6 : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i4, i5, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:937)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(color, color2, color3, color3, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, jM9177copywmQWz5c$default3, j16, color4, j17, color5, color6, j18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m7986elevatedFilterChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(684803697);
        float fM8513getElevatedContainerElevationD9Ej5fM = (i5 & 1) != 0 ? FilterChipTokens.INSTANCE.m8513getElevatedContainerElevationD9Ej5fM() : f4;
        float fM8517getElevatedPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? FilterChipTokens.INSTANCE.m8517getElevatedPressedContainerElevationD9Ej5fM() : f5;
        float fM8515getElevatedFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? FilterChipTokens.INSTANCE.m8515getElevatedFocusContainerElevationD9Ej5fM() : f6;
        float fM8516getElevatedHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? FilterChipTokens.INSTANCE.m8516getElevatedHoverContainerElevationD9Ej5fM() : f7;
        float fM8512getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? FilterChipTokens.INSTANCE.m8512getDraggedContainerElevationD9Ej5fM() : f8;
        float fM8514getElevatedDisabledContainerElevationD9Ej5fM = (i5 & 32) != 0 ? FilterChipTokens.INSTANCE.m8514getElevatedDisabledContainerElevationD9Ej5fM() : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i4, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:982)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM8513getElevatedContainerElevationD9Ej5fM, fM8517getElevatedPressedContainerElevationD9Ej5fM, fM8515getElevatedFocusContainerElevationD9Ej5fM, fM8516getElevatedHoverContainerElevationD9Ej5fM, fM8512getDraggedContainerElevationD9Ej5fM, fM8514getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    /* renamed from: filterChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m7987filterChipBordergHcDVlo(long j4, long j5, long j6, long j7, float f4, float f5, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-1884534961);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j4;
        long jM9213getTransparent0d7_KjU = (i5 & 2) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j5;
        long jM9177copywmQWz5c$default = (i5 & 4) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM9213getTransparent0d7_KjU2 = (i5 & 8) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j7;
        float fM8525getFlatUnselectedOutlineWidthD9Ej5fM = (i5 & 16) != 0 ? FilterChipTokens.INSTANCE.m8525getFlatUnselectedOutlineWidthD9Ej5fM() : f4;
        float fM8521getFlatSelectedOutlineWidthD9Ej5fM = (i5 & 32) != 0 ? FilterChipTokens.INSTANCE.m8521getFlatSelectedOutlineWidthD9Ej5fM() : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1884534961, i4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:901)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(color, jM9213getTransparent0d7_KjU, jM9177copywmQWz5c$default, jM9213getTransparent0d7_KjU2, fM8525getFlatUnselectedOutlineWidthD9Ej5fM, fM8521getFlatSelectedOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m7988filterChipColorsXqyqHi0(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i4, int i5, int i6) {
        composer.startReplaceableGroup(-1831479801);
        long jM9213getTransparent0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j5;
        long color2 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j6;
        long jM9213getTransparent0d7_KjU2 = (i6 & 8) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j7;
        long jM9177copywmQWz5c$default = (i6 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM9177copywmQWz5c$default2 = (i6 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long j16 = (i6 & 64) != 0 ? jM9177copywmQWz5c$default2 : j10;
        long color3 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatSelectedContainerColor(), composer, 6) : j11;
        long jM9177copywmQWz5c$default3 = (i6 & 256) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color4 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j13;
        long color5 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j14;
        long j17 = (i6 & 2048) != 0 ? color5 : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i4, i5, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:825)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM9213getTransparent0d7_KjU, color, color2, color2, jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, j16, color3, jM9177copywmQWz5c$default3, color4, color5, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m7989filterChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-757972185);
        float fM8518getFlatContainerElevationD9Ej5fM = (i5 & 1) != 0 ? FilterChipTokens.INSTANCE.m8518getFlatContainerElevationD9Ej5fM() : f4;
        float fM8522getFlatSelectedPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? FilterChipTokens.INSTANCE.m8522getFlatSelectedPressedContainerElevationD9Ej5fM() : f5;
        float fM8519getFlatSelectedFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? FilterChipTokens.INSTANCE.m8519getFlatSelectedFocusContainerElevationD9Ej5fM() : f6;
        float fM8520getFlatSelectedHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? FilterChipTokens.INSTANCE.m8520getFlatSelectedHoverContainerElevationD9Ej5fM() : f7;
        float fM8512getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? FilterChipTokens.INSTANCE.m8512getDraggedContainerElevationD9Ej5fM() : f8;
        float f10 = (i5 & 32) != 0 ? fM8518getFlatContainerElevationD9Ej5fM : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:871)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM8518getFlatContainerElevationD9Ej5fM, fM8522getFlatSelectedPressedContainerElevationD9Ej5fM, fM8519getFlatSelectedFocusContainerElevationD9Ej5fM, fM8520getFlatSelectedHoverContainerElevationD9Ej5fM, fM8512getDraggedContainerElevationD9Ej5fM, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m7990getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m7991getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i4, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:999)");
        }
        Shape shape = ShapesKt.toShape(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}

package androidx.compose.material3;

import androidx.compose.material3.tokens.SuggestionChipTokens;
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
@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JQ\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0018JQ\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\"R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m5175d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "elevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m8708getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m8717getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m8135elevatedSuggestionChipColors5tl4gsc(long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1269423125);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long jM7869getOnSurfaceVariant0d7_KjU = (i5 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7869getOnSurfaceVariant0d7_KjU() : j6;
        long jM9177copywmQWz5c$default = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM9177copywmQWz5c$default2 = (i5 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM9177copywmQWz5c$default3 = (i5 & 32) != 0 ? Color.m9177copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7868getOnSurface0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1249)");
        }
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColors = new ChipColors(color, color2, jM7869getOnSurfaceVariant0d7_KjU, companion.m9214getUnspecified0d7_KjU(), jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, jM9177copywmQWz5c$default3, companion.m9214getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m8136elevatedSuggestionChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1118088467);
        float fM8710getElevatedContainerElevationD9Ej5fM = (i5 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m8710getElevatedContainerElevationD9Ej5fM() : f4;
        float fM8714getElevatedPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? SuggestionChipTokens.INSTANCE.m8714getElevatedPressedContainerElevationD9Ej5fM() : f5;
        float fM8712getElevatedFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m8712getElevatedFocusContainerElevationD9Ej5fM() : f6;
        float fM8713getElevatedHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m8713getElevatedHoverContainerElevationD9Ej5fM() : f7;
        float fM8709getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m8709getDraggedContainerElevationD9Ej5fM() : f8;
        float fM8711getElevatedDisabledContainerElevationD9Ej5fM = (i5 & 32) != 0 ? SuggestionChipTokens.INSTANCE.m8711getElevatedDisabledContainerElevationD9Ej5fM() : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1286)");
        }
        ChipElevation chipElevation = new ChipElevation(fM8710getElevatedContainerElevationD9Ej5fM, fM8714getElevatedPressedContainerElevationD9Ej5fM, fM8712getElevatedFocusContainerElevationD9Ej5fM, fM8713getElevatedHoverContainerElevationD9Ej5fM, fM8709getDraggedContainerElevationD9Ej5fM, fM8711getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m8137getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8138getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1303)");
        }
        Shape shape = ShapesKt.toShape(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m8139suggestionChipBorderd_3_b6Q(long j4, long j5, float f4, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(439283919);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j4;
        long jM9177copywmQWz5c$default = (i5 & 2) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float fM8716getFlatOutlineWidthD9Ej5fM = (i5 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m8716getFlatOutlineWidthD9Ej5fM() : f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1226)");
        }
        ChipBorder chipBorder = new ChipBorder(color, jM9177copywmQWz5c$default, fM8716getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m8140suggestionChipColors5tl4gsc(long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1882647883);
        long jM9213getTransparent0d7_KjU = (i5 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i5 & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long color2 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long jM9213getTransparent0d7_KjU2 = (i5 & 8) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j7;
        long jM9177copywmQWz5c$default = (i5 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM9177copywmQWz5c$default2 = (i5 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1169)");
        }
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColors = new ChipColors(jM9213getTransparent0d7_KjU, color, color2, companion.m9214getUnspecified0d7_KjU(), jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, companion.m9214getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m8141suggestionChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1929994057);
        float fM8715getFlatContainerElevationD9Ej5fM = (i5 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m8715getFlatContainerElevationD9Ej5fM() : f4;
        float f10 = (i5 & 2) != 0 ? fM8715getFlatContainerElevationD9Ej5fM : f5;
        float f11 = (i5 & 4) != 0 ? fM8715getFlatContainerElevationD9Ej5fM : f6;
        float f12 = (i5 & 8) != 0 ? fM8715getFlatContainerElevationD9Ej5fM : f7;
        float fM8709getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m8709getDraggedContainerElevationD9Ej5fM() : f8;
        float f13 = (i5 & 32) != 0 ? fM8715getFlatContainerElevationD9Ej5fM : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1202)");
        }
        ChipElevation chipElevation = new ChipElevation(fM8715getFlatContainerElevationD9Ej5fM, f10, f11, f12, fM8709getDraggedContainerElevationD9Ej5fM, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }
}

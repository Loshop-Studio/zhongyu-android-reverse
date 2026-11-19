package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
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
@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!JQ\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+Je\u0010,\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010!JQ\u0010.\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010+R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m5175d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "assistChipColors", "Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m8298getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m8307getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Composable
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m7814assistChipBorderd_3_b6Q(long j4, long j5, float f4, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(382372847);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j4;
        long jM9177copywmQWz5c$default = (i5 & 2) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float fM8306getFlatOutlineWidthD9Ej5fM = (i5 & 4) != 0 ? AssistChipTokens.INSTANCE.m8306getFlatOutlineWidthD9Ej5fM() : f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:708)");
        }
        ChipBorder chipBorder = new ChipBorder(color, jM9177copywmQWz5c$default, fM8306getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m7815assistChipColorsoq7We08(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-391745725);
        long jM9213getTransparent0d7_KjU = (i5 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i5 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long color2 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j6;
        long j12 = (i5 & 8) != 0 ? color2 : j7;
        long jM9213getTransparent0d7_KjU2 = (i5 & 16) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j8;
        long jM9177copywmQWz5c$default = (i5 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long jM9177copywmQWz5c$default2 = (i5 & 64) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long j13 = (i5 & 128) != 0 ? jM9177copywmQWz5c$default2 : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:648)");
        }
        ChipColors chipColors = new ChipColors(jM9213getTransparent0d7_KjU, color, color2, j12, jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, j13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m7816assistChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(245366099);
        float fM8305getFlatContainerElevationD9Ej5fM = (i5 & 1) != 0 ? AssistChipTokens.INSTANCE.m8305getFlatContainerElevationD9Ej5fM() : f4;
        float f10 = (i5 & 2) != 0 ? fM8305getFlatContainerElevationD9Ej5fM : f5;
        float f11 = (i5 & 4) != 0 ? fM8305getFlatContainerElevationD9Ej5fM : f6;
        float f12 = (i5 & 8) != 0 ? fM8305getFlatContainerElevationD9Ej5fM : f7;
        float fM8299getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? AssistChipTokens.INSTANCE.m8299getDraggedContainerElevationD9Ej5fM() : f8;
        float f13 = (i5 & 32) != 0 ? fM8305getFlatContainerElevationD9Ej5fM : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:684)");
        }
        ChipElevation chipElevation = new ChipElevation(fM8305getFlatContainerElevationD9Ej5fM, f10, f11, f12, fM8299getDraggedContainerElevationD9Ej5fM, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m7817elevatedAssistChipColorsoq7We08(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-535762675);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j5;
        long color3 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j6;
        long j12 = (i5 & 8) != 0 ? color3 : j7;
        long jM9177copywmQWz5c$default = (i5 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM9177copywmQWz5c$default2 = (i5 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long jM9177copywmQWz5c$default3 = (i5 & 64) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long j13 = (i5 & 128) != 0 ? jM9177copywmQWz5c$default3 : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i4, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:733)");
        }
        ChipColors chipColors = new ChipColors(color, color2, color3, j12, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, jM9177copywmQWz5c$default3, j13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m7818elevatedAssistChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1457698077);
        float fM8300getElevatedContainerElevationD9Ej5fM = (i5 & 1) != 0 ? AssistChipTokens.INSTANCE.m8300getElevatedContainerElevationD9Ej5fM() : f4;
        float fM8304getElevatedPressedContainerElevationD9Ej5fM = (i5 & 2) != 0 ? AssistChipTokens.INSTANCE.m8304getElevatedPressedContainerElevationD9Ej5fM() : f5;
        float fM8302getElevatedFocusContainerElevationD9Ej5fM = (i5 & 4) != 0 ? AssistChipTokens.INSTANCE.m8302getElevatedFocusContainerElevationD9Ej5fM() : f6;
        float fM8303getElevatedHoverContainerElevationD9Ej5fM = (i5 & 8) != 0 ? AssistChipTokens.INSTANCE.m8303getElevatedHoverContainerElevationD9Ej5fM() : f7;
        float fM8299getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? AssistChipTokens.INSTANCE.m8299getDraggedContainerElevationD9Ej5fM() : f8;
        float fM8301getElevatedDisabledContainerElevationD9Ej5fM = (i5 & 32) != 0 ? AssistChipTokens.INSTANCE.m8301getElevatedDisabledContainerElevationD9Ej5fM() : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i4, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:770)");
        }
        ChipElevation chipElevation = new ChipElevation(fM8300getElevatedContainerElevationD9Ej5fM, fM8304getElevatedPressedContainerElevationD9Ej5fM, fM8302getElevatedFocusContainerElevationD9Ej5fM, fM8303getElevatedHoverContainerElevationD9Ej5fM, fM8299getDraggedContainerElevationD9Ej5fM, fM8301getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m7819getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m7820getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i4, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:787)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}

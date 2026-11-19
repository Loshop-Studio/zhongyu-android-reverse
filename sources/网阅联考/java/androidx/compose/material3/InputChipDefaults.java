package androidx.compose.material3;

import androidx.compose.material3.tokens.InputChipTokens;
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
@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0097\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u00132\b\b\u0002\u0010&\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u0013H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+JQ\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m5175d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "()V", "AvatarSize", "Landroidx/compose/ui/unit/Dp;", "getAvatarSize-D9Ej5fM", "()F", "F", "Height", "getHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputChipBorder", "Landroidx/compose/material3/SelectableChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "inputChipBorder-gHcDVlo", "(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;", "inputChipColors", "Landroidx/compose/material3/SelectableChipColors;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m8532getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m8534getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m8530getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m8017getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m8018getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8019getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(1052444143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i4, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1138)");
        }
        Shape shape = ShapesKt.toShape(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: inputChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m8020inputChipBordergHcDVlo(long j4, long j5, long j6, long j7, float f4, float f5, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-324924235);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j4;
        long jM9213getTransparent0d7_KjU = (i5 & 2) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j5;
        long jM9177copywmQWz5c$default = (i5 & 4) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM9213getTransparent0d7_KjU2 = (i5 & 8) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j7;
        float fM8537getUnselectedOutlineWidthD9Ej5fM = (i5 & 16) != 0 ? InputChipTokens.INSTANCE.m8537getUnselectedOutlineWidthD9Ej5fM() : f4;
        float fM8535getSelectedOutlineWidthD9Ej5fM = (i5 & 32) != 0 ? InputChipTokens.INSTANCE.m8535getSelectedOutlineWidthD9Ej5fM() : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324924235, i4, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1120)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(color, jM9213getTransparent0d7_KjU, jM9177copywmQWz5c$default, jM9213getTransparent0d7_KjU2, fM8537getUnselectedOutlineWidthD9Ej5fM, fM8535getSelectedOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m8021inputChipColorskwJvTHA(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i4, int i5, int i6) {
        composer.startReplaceableGroup(1312840646);
        long jM9213getTransparent0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j4;
        long color = (i6 & 2) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j5;
        long color2 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLeadingIconColor(), composer, 6) : j6;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedTrailingIconColor(), composer, 6) : j7;
        long jM9213getTransparent0d7_KjU2 = (i6 & 16) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j8;
        long jM9177copywmQWz5c$default = (i6 & 32) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long jM9177copywmQWz5c$default2 = (i6 & 64) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM9177copywmQWz5c$default3 = (i6 & 128) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color4 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j12;
        long jM9177copywmQWz5c$default4 = (i6 & 512) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color5 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j14;
        long color6 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer, 6) : j15;
        long color7 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedTrailingIconColor(), composer, 6) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i4, i5, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1043)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM9213getTransparent0d7_KjU, color, color2, color3, jM9213getTransparent0d7_KjU2, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, jM9177copywmQWz5c$default3, color4, jM9177copywmQWz5c$default4, color5, color6, color7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m8022inputChipElevationaqJV_2Y(float f4, float f5, float f6, float f7, float f8, float f9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1745270109);
        float fM8531getContainerElevationD9Ej5fM = (i5 & 1) != 0 ? InputChipTokens.INSTANCE.m8531getContainerElevationD9Ej5fM() : f4;
        float f10 = (i5 & 2) != 0 ? fM8531getContainerElevationD9Ej5fM : f5;
        float f11 = (i5 & 4) != 0 ? fM8531getContainerElevationD9Ej5fM : f6;
        float f12 = (i5 & 8) != 0 ? fM8531getContainerElevationD9Ej5fM : f7;
        float fM8533getDraggedContainerElevationD9Ej5fM = (i5 & 16) != 0 ? InputChipTokens.INSTANCE.m8533getDraggedContainerElevationD9Ej5fM() : f8;
        float f13 = (i5 & 32) != 0 ? fM8531getContainerElevationD9Ej5fM : f9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i4, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1091)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM8531getContainerElevationD9Ej5fM, f10, f11, f12, fM8533getDraggedContainerElevationD9Ej5fM, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }
}

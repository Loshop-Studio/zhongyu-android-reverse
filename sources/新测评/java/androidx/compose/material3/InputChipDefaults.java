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
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010$J\u0094\u0001\u0010#\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103JN\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, m13558d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "()V", "AvatarSize", "Landroidx/compose/ui/unit/Dp;", "getAvatarSize-D9Ej5fM", "()F", "F", "Height", "getHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultInputChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultInputChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "inputChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "inputChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "inputChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/InputChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
/* loaded from: classes2.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m20030getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m20032getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m20028getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m18898getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached = colorScheme.getDefaultInputChipColorsCached();
        if (defaultInputChipColorsCached != null) {
            return defaultInputChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM21011getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedTrailingIconColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedContainerColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m18899getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m18900getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
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
    public final BorderStroke m18901inputChipBorder_7El2pE(boolean z9, boolean z10, long j10, long j11, long j12, long j13, float f10, float f11, Composer composer, int i10, int i11) {
        long value = (i11 & 4) != 0 ? ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j10;
        long jM21011getTransparent0d7_KjU = (i11 & 8) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j11;
        long jM20975copywmQWz5c$default = (i11 & 16) != 0 ? Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM21011getTransparent0d7_KjU2 = (i11 & 32) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j13;
        float fM20035getUnselectedOutlineWidthD9Ej5fM = (i11 & 64) != 0 ? InputChipTokens.INSTANCE.m20035getUnselectedOutlineWidthD9Ej5fM() : f10;
        float fM20033getSelectedOutlineWidthD9Ej5fM = (i11 & 128) != 0 ? InputChipTokens.INSTANCE.m20033getSelectedOutlineWidthD9Ej5fM() : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if (!z9) {
            value = z10 ? jM21011getTransparent0d7_KjU2 : jM20975copywmQWz5c$default;
        } else if (z10) {
            value = jM21011getTransparent0d7_KjU;
        }
        if (z10) {
            fM20035getUnselectedOutlineWidthD9Ej5fM = fM20033getSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM17217BorderStrokecXLIe8U = BorderStrokeKt.m17217BorderStrokecXLIe8U(fM20035getUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17217BorderStrokecXLIe8U;
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
    public final SelectableChipColors m18902inputChipColorskwJvTHA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i10, int i11, int i12) {
        long j23;
        long j24;
        long jM21012getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        long jM21012getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j17;
        long j25 = jM21012getUnspecified0d7_KjU;
        long jM21012getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j18;
        long jM21012getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j19;
        long jM21012getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j20;
        long jM21012getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j21;
        long jM21012getUnspecified0d7_KjU13 = (i12 & 4096) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j22;
        if (ComposerKt.isTraceInProgress()) {
            j23 = jM21012getUnspecified0d7_KjU12;
            j24 = jM21012getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1312840646, i10, i11, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
        } else {
            j23 = jM21012getUnspecified0d7_KjU12;
            j24 = jM21012getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM19197copydaRQuJA = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19197copydaRQuJA(j25, j24, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7, jM21012getUnspecified0d7_KjU8, jM21012getUnspecified0d7_KjU9, jM21012getUnspecified0d7_KjU10, jM21012getUnspecified0d7_KjU11, j23, jM21012getUnspecified0d7_KjU13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM19197copydaRQuJA;
    }

    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m18903inputChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = InputChipTokens.INSTANCE.m20029getContainerElevationD9Ej5fM();
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
            f14 = InputChipTokens.INSTANCE.m20031getDraggedContainerElevationD9Ej5fM();
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

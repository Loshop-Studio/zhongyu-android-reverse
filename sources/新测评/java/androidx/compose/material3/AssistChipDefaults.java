package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u00108\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010-JN\u0010:\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00107R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m13558d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultAssistChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultAssistChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedAssistChipColors", "getDefaultElevatedAssistChipColors$material3_release", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "assistChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "assistChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/AssistChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
/* loaded from: classes2.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m19740getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m19749getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @ReplaceWith(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @Composable
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m18517assistChipBorderd_3_b6Q(long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM20975copywmQWz5c$default;
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 2) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j11;
        }
        float fM19748getFlatOutlineWidthD9Ej5fM = (i11 & 4) != 0 ? AssistChipTokens.INSTANCE.m19748getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM20975copywmQWz5c$default, fM19748getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    @Composable
    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m18518assistChipBorderh1eTWw(boolean z9, long j10, long j11, float f10, Composer composer, int i10, int i11) {
        long jM20975copywmQWz5c$default;
        long value = (i11 & 2) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        if ((i11 & 4) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j11;
        }
        float fM19748getFlatOutlineWidthD9Ej5fM = (i11 & 8) != 0 ? AssistChipTokens.INSTANCE.m19748getFlatOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if (!z9) {
            value = jM20975copywmQWz5c$default;
        }
        BorderStroke borderStrokeM17217BorderStrokecXLIe8U = BorderStrokeKt.m17217BorderStrokecXLIe8U(fM19748getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17217BorderStrokecXLIe8U;
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
    public final ChipColors m18519assistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i10, int i11) {
        long j18;
        long j19;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        long jM21012getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j17;
        if (ComposerKt.isTraceInProgress()) {
            j18 = jM21012getUnspecified0d7_KjU;
            j19 = jM21012getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-391745725, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
        } else {
            j18 = jM21012getUnspecified0d7_KjU;
            j19 = jM21012getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM18592copyFD3wquc = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18592copyFD3wquc(j18, j19, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7, jM21012getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM18592copyFD3wquc;
    }

    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m18520assistChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = AssistChipTokens.INSTANCE.m19747getFlatContainerElevationD9Ej5fM();
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
            f14 = AssistChipTokens.INSTANCE.m19741getDraggedContainerElevationD9Ej5fM();
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
    public final ChipColors m18521elevatedAssistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i10, int i11) {
        long j18;
        long j19;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        long jM21012getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j17;
        if (ComposerKt.isTraceInProgress()) {
            j18 = jM21012getUnspecified0d7_KjU;
            j19 = jM21012getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-535762675, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
        } else {
            j18 = jM21012getUnspecified0d7_KjU;
            j19 = jM21012getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM18592copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18592copyFD3wquc(j18, j19, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7, jM21012getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM18592copyFD3wquc;
    }

    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m18522elevatedAssistChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = AssistChipTokens.INSTANCE.m19742getElevatedContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = AssistChipTokens.INSTANCE.m19746getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = AssistChipTokens.INSTANCE.m19744getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = AssistChipTokens.INSTANCE.m19745getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = AssistChipTokens.INSTANCE.m19741getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = AssistChipTokens.INSTANCE.m19743getElevatedDisabledContainerElevationD9Ej5fM();
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
        ChipColors defaultAssistChipColorsCached = colorScheme.getDefaultAssistChipColorsCached();
        if (defaultAssistChipColorsCached != null) {
            return defaultAssistChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jM21011getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached = colorScheme.getDefaultElevatedAssistChipColorsCached();
        if (defaultElevatedAssistChipColorsCached != null) {
            return defaultElevatedAssistChipColorsCached;
        }
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedDisabledContainerColor()), assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m18523getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m18524getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
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

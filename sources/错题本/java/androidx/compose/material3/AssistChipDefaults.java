package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u00108\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010-JN\u0010:\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00107R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5110d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultAssistChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultAssistChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedAssistChipColors", "getDefaultElevatedAssistChipColors$material3_release", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "assistChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "assistChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/AssistChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @NotNull
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m9422getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m9431getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @ReplaceWith(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @Composable
    @NotNull
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m8165assistChipBorderd_3_b6Q(long j7, long j8, float f, @Nullable Composer composer, int i, int i8) {
        long jM10681copywmQWz5c$default;
        long value = (i8 & 1) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j7;
        if ((i8 & 2) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default = j8;
        }
        float fM9430getFlatOutlineWidthD9Ej5fM = (i8 & 4) != 0 ? AssistChipTokens.INSTANCE.m9430getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM10681copywmQWz5c$default, fM9430getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    @Composable
    @NotNull
    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m8166assistChipBorderh1eTWw(boolean z8, long j7, long j8, float f, @Nullable Composer composer, int i, int i8) {
        long jM10681copywmQWz5c$default;
        long value = (i8 & 2) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j7;
        if ((i8 & 4) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(assistChipTokens.getFlatDisabledOutlineColor(), composer, 6), assistChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default = j8;
        }
        float fM9430getFlatOutlineWidthD9Ej5fM = (i8 & 8) != 0 ? AssistChipTokens.INSTANCE.m9430getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if (!z8) {
            value = jM10681copywmQWz5c$default;
        }
        BorderStroke borderStrokeM6783BorderStrokecXLIe8U = BorderStrokeKt.m6783BorderStrokecXLIe8U(fM9430getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM6783BorderStrokecXLIe8U;
    }

    @Composable
    @NotNull
    public final ChipColors assistChipColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
        }
        ChipColors defaultAssistChipColors$material3_release = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultAssistChipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m8167assistChipColorsoq7We08(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i, int i8) {
        long j15;
        long j16;
        long jM10718getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM10718getUnspecified0d7_KjU2 = (i8 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j8;
        long jM10718getUnspecified0d7_KjU3 = (i8 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        long jM10718getUnspecified0d7_KjU4 = (i8 & 8) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        long jM10718getUnspecified0d7_KjU5 = (i8 & 16) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j11;
        long jM10718getUnspecified0d7_KjU6 = (i8 & 32) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j12;
        long jM10718getUnspecified0d7_KjU7 = (i8 & 64) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j13;
        long jM10718getUnspecified0d7_KjU8 = (i8 & 128) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j14;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM10718getUnspecified0d7_KjU;
            j16 = jM10718getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
        } else {
            j15 = jM10718getUnspecified0d7_KjU;
            j16 = jM10718getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM8241copyFD3wquc = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8241copyFD3wquc(j15, j16, jM10718getUnspecified0d7_KjU3, jM10718getUnspecified0d7_KjU4, jM10718getUnspecified0d7_KjU5, jM10718getUnspecified0d7_KjU6, jM10718getUnspecified0d7_KjU7, jM10718getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM8241copyFD3wquc;
    }

    @Composable
    @NotNull
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m8168assistChipElevationaqJV_2Y(float f, float f7, float f8, float f9, float f10, float f11, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = AssistChipTokens.INSTANCE.m9429getFlatContainerElevationD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f7 = f;
        }
        if ((i8 & 4) != 0) {
            f8 = f;
        }
        if ((i8 & 8) != 0) {
            f9 = f;
        }
        if ((i8 & 16) != 0) {
            f10 = AssistChipTokens.INSTANCE.m9423getDraggedContainerElevationD9Ej5fM();
        }
        float f12 = f10;
        if ((i8 & 32) != 0) {
            f11 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
        }
        float f13 = f11;
        float f14 = f8;
        float f15 = f;
        ChipElevation chipElevation = new ChipElevation(f15, f7, f14, f9, f12, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    @Composable
    @NotNull
    public final ChipColors elevatedAssistChipColors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
        }
        ChipColors defaultElevatedAssistChipColors$material3_release = getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedAssistChipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m8169elevatedAssistChipColorsoq7We08(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i, int i8) {
        long j15;
        long j16;
        long jM10718getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM10718getUnspecified0d7_KjU2 = (i8 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j8;
        long jM10718getUnspecified0d7_KjU3 = (i8 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        long jM10718getUnspecified0d7_KjU4 = (i8 & 8) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        long jM10718getUnspecified0d7_KjU5 = (i8 & 16) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j11;
        long jM10718getUnspecified0d7_KjU6 = (i8 & 32) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j12;
        long jM10718getUnspecified0d7_KjU7 = (i8 & 64) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j13;
        long jM10718getUnspecified0d7_KjU8 = (i8 & 128) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j14;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM10718getUnspecified0d7_KjU;
            j16 = jM10718getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
        } else {
            j15 = jM10718getUnspecified0d7_KjU;
            j16 = jM10718getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM8241copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m8241copyFD3wquc(j15, j16, jM10718getUnspecified0d7_KjU3, jM10718getUnspecified0d7_KjU4, jM10718getUnspecified0d7_KjU5, jM10718getUnspecified0d7_KjU6, jM10718getUnspecified0d7_KjU7, jM10718getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM8241copyFD3wquc;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m8170elevatedAssistChipElevationaqJV_2Y(float f, float f7, float f8, float f9, float f10, float f11, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            f = AssistChipTokens.INSTANCE.m9424getElevatedContainerElevationD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f7 = AssistChipTokens.INSTANCE.m9428getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f8 = AssistChipTokens.INSTANCE.m9426getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i8 & 8) != 0) {
            f9 = AssistChipTokens.INSTANCE.m9427getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i8 & 16) != 0) {
            f10 = AssistChipTokens.INSTANCE.m9423getDraggedContainerElevationD9Ej5fM();
        }
        float f12 = f10;
        if ((i8 & 32) != 0) {
            f11 = AssistChipTokens.INSTANCE.m9425getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
        }
        float f13 = f11;
        float f14 = f8;
        float f15 = f;
        ChipElevation chipElevation = new ChipElevation(f15, f7, f14, f9, f12, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    @NotNull
    public final ChipColors getDefaultAssistChipColors$material3_release(@NotNull ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached = colorScheme.getDefaultAssistChipColorsCached();
        if (defaultAssistChipColorsCached != null) {
            return defaultAssistChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM10717getTransparent0d7_KjU = companion.m10717getTransparent0d7_KjU();
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jM10717getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), companion.m10717getTransparent0d7_KjU(), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    @NotNull
    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(@NotNull ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached = colorScheme.getDefaultElevatedAssistChipColorsCached();
        if (defaultElevatedAssistChipColorsCached != null) {
            return defaultElevatedAssistChipColorsCached;
        }
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedDisabledContainerColor()), assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), assistChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m8171getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8172getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}

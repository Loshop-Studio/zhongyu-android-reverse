package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m13413d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/FilterChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
/* loaded from: classes2.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m20442getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m20458getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @Composable
    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i9, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedFilterChipColors$material3_release;
    }

    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m19278elevatedFilterChipColorsXqyqHi0(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, Composer composer, int i9, int i10, int i11) {
        long j21;
        long j22;
        long jM21445getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j9;
        long jM21445getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j10;
        long jM21445getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j11;
        long jM21445getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j12;
        long jM21445getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j13;
        long jM21445getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j14;
        long jM21445getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j15;
        long jM21445getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j16;
        long j23 = jM21445getUnspecified0d7_KjU;
        long jM21445getUnspecified0d7_KjU9 = (i11 & 256) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j17;
        long jM21445getUnspecified0d7_KjU10 = (i11 & 512) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j18;
        long jM21445getUnspecified0d7_KjU11 = (i11 & 1024) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j19;
        long jM21445getUnspecified0d7_KjU12 = (i11 & 2048) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j20;
        if (ComposerKt.isTraceInProgress()) {
            j21 = jM21445getUnspecified0d7_KjU11;
            j22 = jM21445getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-915841711, i9, i10, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        } else {
            j21 = jM21445getUnspecified0d7_KjU11;
            j22 = jM21445getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM19630copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19630copydaRQuJA(j23, j22, jM21445getUnspecified0d7_KjU3, jM21445getUnspecified0d7_KjU3, jM21445getUnspecified0d7_KjU4, jM21445getUnspecified0d7_KjU5, jM21445getUnspecified0d7_KjU6, jM21445getUnspecified0d7_KjU7, jM21445getUnspecified0d7_KjU8, jM21445getUnspecified0d7_KjU9, jM21445getUnspecified0d7_KjU10, j21, jM21445getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM19630copydaRQuJA;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m19279elevatedFilterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i9, int i10) {
        if ((i10 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m20444getElevatedContainerElevationD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m20448getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m20446getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m20447getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i10 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m20443getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i10 & 32) != 0) {
            f15 = FilterChipTokens.INSTANCE.m20445getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i9, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
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
    public final BorderStroke m19280filterChipBorder_7El2pE(boolean z9, boolean z10, long j9, long j10, long j11, long j12, float f10, float f11, Composer composer, int i9, int i10) {
        long jM21408copywmQWz5c$default;
        long value = (i10 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j9;
        long jM21444getTransparent0d7_KjU = (i10 & 8) != 0 ? Color.INSTANCE.m21444getTransparent0d7_KjU() : j10;
        if ((i10 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            jM21408copywmQWz5c$default = Color.m21408copywmQWz5c$default(ColorSchemeKt.getValue(filterChipTokens.getFlatDisabledUnselectedOutlineColor(), composer, 6), filterChipTokens.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM21408copywmQWz5c$default = j11;
        }
        long jM21444getTransparent0d7_KjU2 = (i10 & 32) != 0 ? Color.INSTANCE.m21444getTransparent0d7_KjU() : j12;
        float fM20456getFlatUnselectedOutlineWidthD9Ej5fM = (i10 & 64) != 0 ? FilterChipTokens.INSTANCE.m20456getFlatUnselectedOutlineWidthD9Ej5fM() : f10;
        float fM20452getFlatSelectedOutlineWidthD9Ej5fM = (i10 & 128) != 0 ? FilterChipTokens.INSTANCE.m20452getFlatSelectedOutlineWidthD9Ej5fM() : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i9, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z9) {
            value = z10 ? jM21444getTransparent0d7_KjU2 : jM21408copywmQWz5c$default;
        } else if (z10) {
            value = jM21444getTransparent0d7_KjU;
        }
        if (z10) {
            fM20456getFlatUnselectedOutlineWidthD9Ej5fM = fM20452getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM17650BorderStrokecXLIe8U = BorderStrokeKt.m17650BorderStrokecXLIe8U(fM20456getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17650BorderStrokecXLIe8U;
    }

    @Composable
    public final SelectableChipColors filterChipColors(Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i9, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilterChipColors$material3_release;
    }

    @Composable
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m19281filterChipColorsXqyqHi0(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, Composer composer, int i9, int i10, int i11) {
        long j21;
        long j22;
        long jM21445getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j9;
        long jM21445getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j10;
        long jM21445getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j11;
        long jM21445getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j12;
        long jM21445getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j13;
        long jM21445getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j14;
        long jM21445getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j15;
        long jM21445getUnspecified0d7_KjU8 = (i11 & 128) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j16;
        long j23 = jM21445getUnspecified0d7_KjU;
        long jM21445getUnspecified0d7_KjU9 = (i11 & 256) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j17;
        long jM21445getUnspecified0d7_KjU10 = (i11 & 512) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j18;
        long jM21445getUnspecified0d7_KjU11 = (i11 & 1024) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j19;
        long jM21445getUnspecified0d7_KjU12 = (i11 & 2048) != 0 ? Color.INSTANCE.m21445getUnspecified0d7_KjU() : j20;
        if (ComposerKt.isTraceInProgress()) {
            j21 = jM21445getUnspecified0d7_KjU11;
            j22 = jM21445getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-1831479801, i9, i10, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        } else {
            j21 = jM21445getUnspecified0d7_KjU11;
            j22 = jM21445getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM19630copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19630copydaRQuJA(j23, j22, jM21445getUnspecified0d7_KjU3, jM21445getUnspecified0d7_KjU3, jM21445getUnspecified0d7_KjU4, jM21445getUnspecified0d7_KjU5, jM21445getUnspecified0d7_KjU6, jM21445getUnspecified0d7_KjU7, jM21445getUnspecified0d7_KjU8, jM21445getUnspecified0d7_KjU9, jM21445getUnspecified0d7_KjU10, j21, jM21445getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM19630copydaRQuJA;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m19282filterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i9, int i10) {
        if ((i10 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m20449getFlatContainerElevationD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m20453getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m20450getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m20451getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i10 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m20443getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i10 & 32) != 0) {
            f15 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i9, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
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
        SelectableChipColors defaultElevatedFilterChipColorsCached = colorScheme.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached = colorScheme.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21444getTransparent0d7_KjU = companion.m21444getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM21444getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), companion.m21444getTransparent0d7_KjU(), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m21408copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), filterChipTokens.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m19283getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m19284getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i9, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}

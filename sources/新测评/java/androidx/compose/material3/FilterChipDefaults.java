package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
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
@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m13558d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/FilterChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
/* loaded from: classes2.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m20009getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m20025getIconSizeD9Ej5fM();
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
    public final SelectableChipColors m18845elevatedFilterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i10, int i11, int i12) {
        long j22;
        long j23;
        long jM21012getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        long jM21012getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j17;
        long j24 = jM21012getUnspecified0d7_KjU;
        long jM21012getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j18;
        long jM21012getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j19;
        long jM21012getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j20;
        long jM21012getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j21;
        if (ComposerKt.isTraceInProgress()) {
            j22 = jM21012getUnspecified0d7_KjU11;
            j23 = jM21012getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-915841711, i10, i11, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        } else {
            j22 = jM21012getUnspecified0d7_KjU11;
            j23 = jM21012getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM19197copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19197copydaRQuJA(j24, j23, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7, jM21012getUnspecified0d7_KjU8, jM21012getUnspecified0d7_KjU9, jM21012getUnspecified0d7_KjU10, j22, jM21012getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM19197copydaRQuJA;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m18846elevatedFilterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m20011getElevatedContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m20015getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m20013getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m20014getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m20010getDraggedContainerElevationD9Ej5fM();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = FilterChipTokens.INSTANCE.m20012getElevatedDisabledContainerElevationD9Ej5fM();
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
    public final BorderStroke m18847filterChipBorder_7El2pE(boolean z9, boolean z10, long j10, long j11, long j12, long j13, float f10, float f11, Composer composer, int i10, int i11) {
        long jM20975copywmQWz5c$default;
        long value = (i11 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j10;
        long jM21011getTransparent0d7_KjU = (i11 & 8) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j11;
        if ((i11 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filterChipTokens.getFlatDisabledUnselectedOutlineColor(), composer, 6), filterChipTokens.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j12;
        }
        long jM21011getTransparent0d7_KjU2 = (i11 & 32) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j13;
        float fM20023getFlatUnselectedOutlineWidthD9Ej5fM = (i11 & 64) != 0 ? FilterChipTokens.INSTANCE.m20023getFlatUnselectedOutlineWidthD9Ej5fM() : f10;
        float fM20019getFlatSelectedOutlineWidthD9Ej5fM = (i11 & 128) != 0 ? FilterChipTokens.INSTANCE.m20019getFlatSelectedOutlineWidthD9Ej5fM() : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z9) {
            value = z10 ? jM21011getTransparent0d7_KjU2 : jM20975copywmQWz5c$default;
        } else if (z10) {
            value = jM21011getTransparent0d7_KjU;
        }
        if (z10) {
            fM20023getFlatUnselectedOutlineWidthD9Ej5fM = fM20019getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM17217BorderStrokecXLIe8U = BorderStrokeKt.m17217BorderStrokecXLIe8U(fM20023getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM17217BorderStrokecXLIe8U;
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
    public final SelectableChipColors m18848filterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i10, int i11, int i12) {
        long j22;
        long j23;
        long jM21012getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        long jM21012getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j17;
        long j24 = jM21012getUnspecified0d7_KjU;
        long jM21012getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j18;
        long jM21012getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j19;
        long jM21012getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j20;
        long jM21012getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j21;
        if (ComposerKt.isTraceInProgress()) {
            j22 = jM21012getUnspecified0d7_KjU11;
            j23 = jM21012getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-1831479801, i10, i11, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        } else {
            j22 = jM21012getUnspecified0d7_KjU11;
            j23 = jM21012getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM19197copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19197copydaRQuJA(j24, j23, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7, jM21012getUnspecified0d7_KjU8, jM21012getUnspecified0d7_KjU9, jM21012getUnspecified0d7_KjU10, j22, jM21012getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM19197copydaRQuJA;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m18849filterChipElevationaqJV_2Y(float f10, float f11, float f12, float f13, float f14, float f15, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FilterChipTokens.INSTANCE.m20016getFlatContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FilterChipTokens.INSTANCE.m20020getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FilterChipTokens.INSTANCE.m20017getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f13 = FilterChipTokens.INSTANCE.m20018getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i11 & 16) != 0) {
            f14 = FilterChipTokens.INSTANCE.m20010getDraggedContainerElevationD9Ej5fM();
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
        SelectableChipColors defaultElevatedFilterChipColorsCached = colorScheme.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached = colorScheme.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM21011getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), filterChipTokens.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m18850getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m18851getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
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

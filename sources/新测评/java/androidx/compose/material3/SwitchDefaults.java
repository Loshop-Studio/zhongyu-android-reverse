package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000eJ²\u0001\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m13558d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "()V", "IconSize", "Landroidx/compose/ui/unit/Dp;", "getIconSize-D9Ej5fM", "()F", "F", "defaultSwitchColors", "Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,625:1\n1#2:626\n148#3:627\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n429#1:627\n*E\n"})
/* loaded from: classes2.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = C3127Dp.m23561constructorimpl(16);

    private SwitchDefaults() {
    }

    @Composable
    public final SwitchColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i10, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
        }
        SwitchColors defaultSwitchColors$material3_release = getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors$material3_release;
    }

    @Composable
    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m19312colorsV1nXRL4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, Composer composer, int i10, int i11, int i12) {
        long j26;
        long j27;
        long jM21021compositeOverOWjLjI;
        long j28;
        long jM21021compositeOverOWjLjI2;
        long j29;
        long jM21021compositeOverOWjLjI3;
        long j30;
        long jM21021compositeOverOWjLjI4;
        long j31;
        long jM21021compositeOverOWjLjI5;
        long j32;
        int i13;
        long jM21021compositeOverOWjLjI6;
        long j33;
        long jM21021compositeOverOWjLjI7;
        long value = (i12 & 1) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j10;
        long value2 = (i12 & 2) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j11;
        long jM21011getTransparent0d7_KjU = (i12 & 4) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j12;
        long value3 = (i12 & 8) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j13;
        long value4 = (i12 & 16) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j14;
        long value5 = (i12 & 32) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j15;
        long value6 = (i12 & 64) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j16;
        long value7 = (i12 & 128) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j17;
        if ((i12 & 256) != 0) {
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            j26 = value;
            j27 = value2;
            jM21021compositeOverOWjLjI = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens.getDisabledSelectedHandleColor(), composer, 6), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j26 = value;
            j27 = value2;
            jM21021compositeOverOWjLjI = j18;
        }
        if ((i12 & 512) != 0) {
            SwitchTokens switchTokens2 = SwitchTokens.INSTANCE;
            j28 = jM21021compositeOverOWjLjI;
            jM21021compositeOverOWjLjI2 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens2.getDisabledSelectedTrackColor(), composer, 6), switchTokens2.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j28 = jM21021compositeOverOWjLjI;
            jM21021compositeOverOWjLjI2 = j19;
        }
        long jM21011getTransparent0d7_KjU2 = (i12 & 1024) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j20;
        if ((i12 & 2048) != 0) {
            SwitchTokens switchTokens3 = SwitchTokens.INSTANCE;
            j29 = jM21021compositeOverOWjLjI2;
            jM21021compositeOverOWjLjI3 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens3.getDisabledSelectedIconColor(), composer, 6), switchTokens3.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j29 = jM21021compositeOverOWjLjI2;
            jM21021compositeOverOWjLjI3 = j21;
        }
        if ((i12 & 4096) != 0) {
            SwitchTokens switchTokens4 = SwitchTokens.INSTANCE;
            j30 = jM21021compositeOverOWjLjI3;
            jM21021compositeOverOWjLjI4 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens4.getDisabledUnselectedHandleColor(), composer, 6), switchTokens4.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j30 = jM21021compositeOverOWjLjI3;
            jM21021compositeOverOWjLjI4 = j22;
        }
        if ((i12 & 8192) != 0) {
            SwitchTokens switchTokens5 = SwitchTokens.INSTANCE;
            j31 = jM21021compositeOverOWjLjI4;
            jM21021compositeOverOWjLjI5 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens5.getDisabledUnselectedTrackColor(), composer, 6), switchTokens5.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j31 = jM21021compositeOverOWjLjI4;
            jM21021compositeOverOWjLjI5 = j23;
        }
        if ((i12 & 16384) != 0) {
            SwitchTokens switchTokens6 = SwitchTokens.INSTANCE;
            i13 = 6;
            j32 = jM21021compositeOverOWjLjI5;
            jM21021compositeOverOWjLjI6 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens6.getDisabledUnselectedTrackOutlineColor(), composer, 6), switchTokens6.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j32 = jM21021compositeOverOWjLjI5;
            i13 = 6;
            jM21021compositeOverOWjLjI6 = j24;
        }
        if ((i12 & 32768) != 0) {
            SwitchTokens switchTokens7 = SwitchTokens.INSTANCE;
            j33 = jM21021compositeOverOWjLjI6;
            jM21021compositeOverOWjLjI7 = ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens7.getDisabledUnselectedIconColor(), composer, i13), switchTokens7.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i13).getSurface());
        } else {
            j33 = jM21021compositeOverOWjLjI6;
            jM21021compositeOverOWjLjI7 = j25;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i10, i11, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        long j34 = j27;
        long j35 = j26;
        SwitchColors switchColors = new SwitchColors(j35, j34, jM21011getTransparent0d7_KjU, value3, value4, value5, value6, value7, j28, j29, jM21011getTransparent0d7_KjU2, j30, j31, j32, j33, jM21021compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3_release(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached != null) {
            return defaultSwitchColorsCached;
        }
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedHandleColor());
        long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedTrackColor());
        Color.Companion companion = Color.INSTANCE;
        SwitchColors switchColors = new SwitchColors(jFromToken, jFromToken2, companion.m21011getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedIconColor()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedHandleColor()), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), companion.m21011getTransparent0d7_KjU(), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedIconColor()), switchTokens.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedHandleColor()), switchTokens.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackOutlineColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.m21021compositeOverOWjLjI(Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedIconColor()), switchTokens.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.setDefaultSwitchColorsCached$material3_release(switchColors);
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m19313getIconSizeD9Ej5fM() {
        return IconSize;
    }
}

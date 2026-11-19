package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = C3156Dp.m26899constructorimpl(16);

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
    public final SwitchColors m22581colorsV1nXRL4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, Composer composer, int i10, int i11, int i12) {
        long j26;
        long j27;
        long jM24321compositeOverOWjLjI;
        long j28;
        long jM24321compositeOverOWjLjI2;
        long j29;
        long jM24321compositeOverOWjLjI3;
        long j30;
        long jM24321compositeOverOWjLjI4;
        long j31;
        long jM24321compositeOverOWjLjI5;
        long j32;
        int i13;
        long jM24321compositeOverOWjLjI6;
        long j33;
        long jM24321compositeOverOWjLjI7;
        long value = (i12 & 1) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j10;
        long value2 = (i12 & 2) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j11;
        long jM24311getTransparent0d7_KjU = (i12 & 4) != 0 ? Color.Companion.m24311getTransparent0d7_KjU() : j12;
        long value3 = (i12 & 8) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j13;
        long value4 = (i12 & 16) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j14;
        long value5 = (i12 & 32) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j15;
        long value6 = (i12 & 64) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j16;
        long value7 = (i12 & 128) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j17;
        if ((i12 & 256) != 0) {
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            j26 = value;
            j27 = value2;
            jM24321compositeOverOWjLjI = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens.getDisabledSelectedHandleColor(), composer, 6), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j26 = value;
            j27 = value2;
            jM24321compositeOverOWjLjI = j18;
        }
        if ((i12 & 512) != 0) {
            SwitchTokens switchTokens2 = SwitchTokens.INSTANCE;
            j28 = jM24321compositeOverOWjLjI;
            jM24321compositeOverOWjLjI2 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens2.getDisabledSelectedTrackColor(), composer, 6), switchTokens2.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j28 = jM24321compositeOverOWjLjI;
            jM24321compositeOverOWjLjI2 = j19;
        }
        long jM24311getTransparent0d7_KjU2 = (i12 & 1024) != 0 ? Color.Companion.m24311getTransparent0d7_KjU() : j20;
        if ((i12 & 2048) != 0) {
            SwitchTokens switchTokens3 = SwitchTokens.INSTANCE;
            j29 = jM24321compositeOverOWjLjI2;
            jM24321compositeOverOWjLjI3 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens3.getDisabledSelectedIconColor(), composer, 6), switchTokens3.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j29 = jM24321compositeOverOWjLjI2;
            jM24321compositeOverOWjLjI3 = j21;
        }
        if ((i12 & 4096) != 0) {
            SwitchTokens switchTokens4 = SwitchTokens.INSTANCE;
            j30 = jM24321compositeOverOWjLjI3;
            jM24321compositeOverOWjLjI4 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens4.getDisabledUnselectedHandleColor(), composer, 6), switchTokens4.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j30 = jM24321compositeOverOWjLjI3;
            jM24321compositeOverOWjLjI4 = j22;
        }
        if ((i12 & 8192) != 0) {
            SwitchTokens switchTokens5 = SwitchTokens.INSTANCE;
            j31 = jM24321compositeOverOWjLjI4;
            jM24321compositeOverOWjLjI5 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens5.getDisabledUnselectedTrackColor(), composer, 6), switchTokens5.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j31 = jM24321compositeOverOWjLjI4;
            jM24321compositeOverOWjLjI5 = j23;
        }
        if ((i12 & 16384) != 0) {
            SwitchTokens switchTokens6 = SwitchTokens.INSTANCE;
            i13 = 6;
            j32 = jM24321compositeOverOWjLjI5;
            jM24321compositeOverOWjLjI6 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens6.getDisabledUnselectedTrackOutlineColor(), composer, 6), switchTokens6.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU());
        } else {
            j32 = jM24321compositeOverOWjLjI5;
            i13 = 6;
            jM24321compositeOverOWjLjI6 = j24;
        }
        if ((i12 & 32768) != 0) {
            SwitchTokens switchTokens7 = SwitchTokens.INSTANCE;
            j33 = jM24321compositeOverOWjLjI6;
            jM24321compositeOverOWjLjI7 = ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.getValue(switchTokens7.getDisabledUnselectedIconColor(), composer, i13), switchTokens7.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i13).m21896getSurface0d7_KjU());
        } else {
            j33 = jM24321compositeOverOWjLjI6;
            jM24321compositeOverOWjLjI7 = j25;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i10, i11, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        long j34 = j27;
        long j35 = j26;
        SwitchColors switchColors = new SwitchColors(j35, j34, jM24311getTransparent0d7_KjU, value3, value4, value5, value6, value7, j28, j29, jM24311getTransparent0d7_KjU2, j30, j31, j32, j33, jM24321compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3_release(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3_release = colorScheme.getDefaultSwitchColorsCached$material3_release();
        if (defaultSwitchColorsCached$material3_release != null) {
            return defaultSwitchColorsCached$material3_release;
        }
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedHandleColor());
        long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedTrackColor());
        Color.Companion companion = Color.Companion;
        SwitchColors switchColors = new SwitchColors(jFromToken, jFromToken2, companion.m24311getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedIconColor()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedHandleColor()), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), companion.m24311getTransparent0d7_KjU(), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedIconColor()), switchTokens.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedHandleColor()), switchTokens.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackOutlineColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedIconColor()), switchTokens.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU()), null);
        colorScheme.setDefaultSwitchColorsCached$material3_release(switchColors);
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m22582getIconSizeD9Ej5fM() {
        return IconSize;
    }
}

package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    private TimePickerDefaults() {
    }

    @Composable
    public final TimePickerColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085808058, i10, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)");
        }
        TimePickerColors defaultTimePickerColors$material3_release = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerColors$material3_release;
    }

    @Composable
    /* renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m22723colorsu3YEpmA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i10, int i11, int i12) {
        long j24;
        long j25;
        long jM24312getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        long jM24312getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j16;
        long jM24312getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j17;
        long j26 = jM24312getUnspecified0d7_KjU;
        long jM24312getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j18;
        long jM24312getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j19;
        long jM24312getUnspecified0d7_KjU11 = (i12 & 1024) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j20;
        long jM24312getUnspecified0d7_KjU12 = (i12 & 2048) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j21;
        long jM24312getUnspecified0d7_KjU13 = (i12 & 4096) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j22;
        long jM24312getUnspecified0d7_KjU14 = (i12 & 8192) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j23;
        if (ComposerKt.isTraceInProgress()) {
            j24 = jM24312getUnspecified0d7_KjU13;
            j25 = jM24312getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-646352288, i10, i11, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:317)");
        } else {
            j24 = jM24312getUnspecified0d7_KjU13;
            j25 = jM24312getUnspecified0d7_KjU2;
        }
        TimePickerColors timePickerColorsM22704copydVHXu7A = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m22704copydVHXu7A(j26, jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, j25, jM24312getUnspecified0d7_KjU3, jM24312getUnspecified0d7_KjU7, jM24312getUnspecified0d7_KjU8, jM24312getUnspecified0d7_KjU9, jM24312getUnspecified0d7_KjU10, jM24312getUnspecified0d7_KjU11, jM24312getUnspecified0d7_KjU12, j24, jM24312getUnspecified0d7_KjU14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerColorsM22704copydVHXu7A;
    }

    public final TimePickerColors getDefaultTimePickerColors$material3_release(ColorScheme colorScheme) {
        TimePickerColors defaultTimePickerColorsCached$material3_release = colorScheme.getDefaultTimePickerColorsCached$material3_release();
        if (defaultTimePickerColorsCached$material3_release != null) {
            return defaultTimePickerColorsCached$material3_release;
        }
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        TimePickerColors timePickerColors = new TimePickerColors(ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorSelectedContainerColor()), Color.Companion.m24311getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorUnselectedLabelTextColor()), null);
        colorScheme.setDefaultTimePickerColorsCached$material3_release(timePickerColors);
        return timePickerColors;
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m22724layoutTypesDNSZnc(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i10, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}

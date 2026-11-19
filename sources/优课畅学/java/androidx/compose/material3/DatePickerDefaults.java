package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import com.tencent.smtt.sdk.TbsListener;
import p077d8.C8321f;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final C8321f YearRange = new C8321f(1900, 2100);
    private static final float TonalElevation = ElevationTokens.INSTANCE.m23185getLevel0D9Ej5fM();
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = YearMonthSkeleton;
        }
        if ((i10 & 2) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i10 & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DatePickerHeadline-3kbWawI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22001DatePickerHeadline3kbWawI(final java.lang.Long r34, final int r35, final androidx.compose.material3.DatePickerFormatter r36, androidx.compose.p013ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m22001DatePickerHeadline3kbWawI(java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DatePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22002DatePickerTitlehOD91z4(final int r29, androidx.compose.p013ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m22002DatePickerTitlehOD91z4(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public final DatePickerColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i10, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i10 << 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColors;
    }

    @Composable
    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m22003colorsbSRYm20(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, TextFieldColors textFieldColors, Composer composer, int i10, int i11, int i12, int i13) {
        long j34;
        long j35;
        long jM24312getUnspecified0d7_KjU = (i13 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i13 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i13 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i13 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i13 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i13 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        long jM24312getUnspecified0d7_KjU7 = (i13 & 64) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j16;
        long j36 = jM24312getUnspecified0d7_KjU;
        long jM24312getUnspecified0d7_KjU8 = (i13 & 128) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j17;
        long jM24312getUnspecified0d7_KjU9 = (i13 & 256) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j18;
        long jM24312getUnspecified0d7_KjU10 = (i13 & 512) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j19;
        long jM24312getUnspecified0d7_KjU11 = (i13 & 1024) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j20;
        long jM24312getUnspecified0d7_KjU12 = (i13 & 2048) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j21;
        long jM24312getUnspecified0d7_KjU13 = (i13 & 4096) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j22;
        long jM24312getUnspecified0d7_KjU14 = (i13 & 8192) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j23;
        long jM24312getUnspecified0d7_KjU15 = (i13 & 16384) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j24;
        long jM24312getUnspecified0d7_KjU16 = (i13 & 32768) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j25;
        long jM24312getUnspecified0d7_KjU17 = (i13 & 65536) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j26;
        long jM24312getUnspecified0d7_KjU18 = (i13 & 131072) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j27;
        long jM24312getUnspecified0d7_KjU19 = (i13 & 262144) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j28;
        long jM24312getUnspecified0d7_KjU20 = (i13 & 524288) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j29;
        long jM24312getUnspecified0d7_KjU21 = (i13 & 1048576) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j30;
        long jM24312getUnspecified0d7_KjU22 = (i13 & 2097152) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j31;
        long jM24312getUnspecified0d7_KjU23 = (i13 & 4194304) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j32;
        long jM24312getUnspecified0d7_KjU24 = (i13 & 8388608) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j33;
        TextFieldColors textFieldColors2 = (i13 & 16777216) != 0 ? null : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            j34 = jM24312getUnspecified0d7_KjU15;
            j35 = jM24312getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1991626358, i10, i11, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:501)");
        } else {
            j34 = jM24312getUnspecified0d7_KjU15;
            j35 = jM24312getUnspecified0d7_KjU2;
        }
        DatePickerColors datePickerColorsM21976copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i12 >> 12) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW).m21976copytNwlRmA(j36, j35, jM24312getUnspecified0d7_KjU3, jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, jM24312getUnspecified0d7_KjU7, jM24312getUnspecified0d7_KjU8, jM24312getUnspecified0d7_KjU9, jM24312getUnspecified0d7_KjU10, jM24312getUnspecified0d7_KjU11, jM24312getUnspecified0d7_KjU12, jM24312getUnspecified0d7_KjU13, jM24312getUnspecified0d7_KjU14, j34, jM24312getUnspecified0d7_KjU16, jM24312getUnspecified0d7_KjU17, jM24312getUnspecified0d7_KjU18, jM24312getUnspecified0d7_KjU19, jM24312getUnspecified0d7_KjU20, jM24312getUnspecified0d7_KjU21, jM24312getUnspecified0d7_KjU23, jM24312getUnspecified0d7_KjU22, jM24312getUnspecified0d7_KjU24, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerColorsM21976copytNwlRmA;
    }

    public final DatePickerFormatter dateFormatter(String str, String str2, String str3) {
        return new DatePickerFormatterImpl(str, str2, str3);
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }

    @Composable
    public final DatePickerColors getDefaultDatePickerColors(ColorScheme colorScheme, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i10, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        DatePickerColors defaultDatePickerColorsCached$material3_release = colorScheme.getDefaultDatePickerColorsCached$material3_release();
        composer.startReplaceGroup(-653681037);
        if (defaultDatePickerColorsCached$material3_release == null) {
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            DatePickerColors datePickerColors = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionMonthSubheadColor()), colorScheme.m21886getOnSurfaceVariant0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i10 & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3_release(datePickerColors);
            defaultDatePickerColorsCached$material3_release = datePickerColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColorsCached$material3_release;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i10, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m22004getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final C8321f getYearRange() {
        return YearRange;
    }

    @Composable
    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i10, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i10 & 6) == 4) | composer.changed(decayAnimationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            final SnapLayoutInfoProvider snapLayoutInfoProviderSnapLayoutInfoProvider$default = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            objRememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float f10, float f11) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f10) {
                    return snapLayoutInfoProviderSnapLayoutInfoProvider$default.calculateSnapOffset(f10);
                }
            }, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }
}

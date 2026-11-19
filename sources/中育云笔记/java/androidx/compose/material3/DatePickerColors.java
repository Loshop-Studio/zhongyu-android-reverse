package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    public /* synthetic */ DatePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, TextFieldColors textFieldColors, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, textFieldColors);
    }

    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m28578copytNwlRmA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, TextFieldColors textFieldColors) {
        return new DatePickerColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.titleContentColor, j12 != 16 ? j12 : this.headlineContentColor, j13 != 16 ? j13 : this.weekdayContentColor, j14 != 16 ? j14 : this.subheadContentColor, j15 != 16 ? j15 : this.navigationContentColor, j16 != 16 ? j16 : this.yearContentColor, j17 != 16 ? j17 : this.disabledYearContentColor, j18 != 16 ? j18 : this.currentYearContentColor, j19 != 16 ? j19 : this.selectedYearContentColor, j20 != 16 ? j20 : this.disabledSelectedYearContentColor, j21 != 16 ? j21 : this.selectedYearContainerColor, j22 != 16 ? j22 : this.disabledSelectedYearContainerColor, j23 != 16 ? j23 : this.dayContentColor, j24 != 16 ? j24 : this.disabledDayContentColor, j25 != 16 ? j25 : this.selectedDayContentColor, j26 != 16 ? j26 : this.disabledSelectedDayContentColor, j27 != 16 ? j27 : this.selectedDayContainerColor, j28 != 16 ? j28 : this.disabledSelectedDayContainerColor, j29 != 16 ? j29 : this.todayContentColor, j30 != 16 ? j30 : this.todayDateBorderColor, j31 != 16 ? j31 : this.dayInSelectionRangeContainerColor, j32 != 16 ? j32 : this.dayInSelectionRangeContentColor, j33 != 16 ? j33 : this.dividerColor, takeOrElse$material3_release(textFieldColors, new InterfaceC9529a() { // from class: androidx.compose.material3.DatePickerColors$copy$25
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final TextFieldColors invoke() {
                return this.this$0.getDateTextFieldColors();
            }
        }), null);
    }

    @Composable
    public final State<Color> dayContainerColor$material3_release(boolean z10, boolean z11, boolean z12, Composer composer, int i10) {
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i10, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)");
        }
        long jM30913getTransparent0d7_KjU = z10 ? z11 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor : Color.Companion.m30913getTransparent0d7_KjU();
        if (z12) {
            composer.startReplaceGroup(-217363149);
            stateRememberUpdatedState = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(jM30913getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-217247953);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(jM30913getTransparent0d7_KjU), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> dayContentColor$material3_release(boolean z10, boolean z11, boolean z12, boolean z13, Composer composer, int i10) {
        State<Color> stateM26823animateColorAsStateeuL9pac;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i10, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)");
        }
        long j10 = (z11 && z13) ? this.selectedDayContentColor : (!z11 || z13) ? (z12 && z13) ? this.dayInSelectionRangeContentColor : (!z12 || z13) ? z10 ? this.todayContentColor : z13 ? this.dayContentColor : this.disabledDayContentColor : this.disabledDayContentColor : this.disabledSelectedDayContentColor;
        if (z12) {
            composer.startReplaceGroup(-828303257);
            stateM26823animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(j10), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-828241443);
            stateM26823animateColorAsStateeuL9pac = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM26823animateColorAsStateeuL9pac;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m30879equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m30879equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m30879equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m30879equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m30879equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m30879equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m30879equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m30879equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m30879equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m30879equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m30879equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m30879equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m30879equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m30879equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m30879equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m30879equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m30879equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m30879equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m30879equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m30879equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m30879equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28579getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m28580getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28581getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28582getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m28583getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28584getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28585getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28586getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28587getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m28588getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m28589getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m28590getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m28591getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m28592getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28593getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28594getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28595getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m28596getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m28597getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m28598getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28599getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28600getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m28601getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m28602getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.titleContentColor)) * 31) + Color.m30885hashCodeimpl(this.headlineContentColor)) * 31) + Color.m30885hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m30885hashCodeimpl(this.subheadContentColor)) * 31) + Color.m30885hashCodeimpl(this.yearContentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m30885hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m30885hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m30885hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m30885hashCodeimpl(this.dayContentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m30885hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m30885hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m30885hashCodeimpl(this.todayContentColor)) * 31) + Color.m30885hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m30885hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m30885hashCodeimpl(this.dayInSelectionRangeContentColor);
    }

    public final TextFieldColors takeOrElse$material3_release(TextFieldColors textFieldColors, InterfaceC9529a interfaceC9529a) {
        return textFieldColors == null ? (TextFieldColors) interfaceC9529a.invoke() : textFieldColors;
    }

    @Composable
    public final State<Color> yearContainerColor$material3_release(boolean z10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i10, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)");
        }
        State<Color> stateM26823animateColorAsStateeuL9pac = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(z10 ? z11 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor : Color.Companion.m30913getTransparent0d7_KjU(), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM26823animateColorAsStateeuL9pac;
    }

    @Composable
    public final State<Color> yearContentColor$material3_release(boolean z10, boolean z11, boolean z12, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i10, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)");
        }
        State<Color> stateM26823animateColorAsStateeuL9pac = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac((z11 && z12) ? this.selectedYearContentColor : (!z11 || z12) ? z10 ? this.currentYearContentColor : z12 ? this.yearContentColor : this.disabledYearContentColor : this.disabledSelectedYearContentColor, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM26823animateColorAsStateeuL9pac;
    }

    private DatePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, TextFieldColors textFieldColors) {
        this.containerColor = j10;
        this.titleContentColor = j11;
        this.headlineContentColor = j12;
        this.weekdayContentColor = j13;
        this.subheadContentColor = j14;
        this.navigationContentColor = j15;
        this.yearContentColor = j16;
        this.disabledYearContentColor = j17;
        this.currentYearContentColor = j18;
        this.selectedYearContentColor = j19;
        this.disabledSelectedYearContentColor = j20;
        this.selectedYearContainerColor = j21;
        this.disabledSelectedYearContainerColor = j22;
        this.dayContentColor = j23;
        this.disabledDayContentColor = j24;
        this.selectedDayContentColor = j25;
        this.disabledSelectedDayContentColor = j26;
        this.selectedDayContainerColor = j27;
        this.disabledSelectedDayContainerColor = j28;
        this.todayContentColor = j29;
        this.todayDateBorderColor = j30;
        this.dayInSelectionRangeContainerColor = j31;
        this.dayInSelectionRangeContentColor = j32;
        this.dividerColor = j33;
        this.dateTextFieldColors = textFieldColors;
    }
}

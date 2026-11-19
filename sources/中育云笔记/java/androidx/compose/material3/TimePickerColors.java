package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ TimePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23);
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m29304copydVHXu7A$default(TimePickerColors timePickerColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, int i10, Object obj) {
        long j24;
        long j25;
        long j26 = (i10 & 1) != 0 ? timePickerColors.containerColor : j10;
        long j27 = (i10 & 2) != 0 ? timePickerColors.selectorColor : j11;
        long j28 = (i10 & 4) != 0 ? timePickerColors.containerColor : j12;
        long j29 = (i10 & 8) != 0 ? timePickerColors.periodSelectorBorderColor : j13;
        long j30 = (i10 & 16) != 0 ? timePickerColors.clockDialSelectedContentColor : j14;
        long j31 = (i10 & 32) != 0 ? timePickerColors.clockDialUnselectedContentColor : j15;
        long j32 = (i10 & 64) != 0 ? timePickerColors.periodSelectorSelectedContainerColor : j16;
        long j33 = j26;
        long j34 = (i10 & 128) != 0 ? timePickerColors.periodSelectorUnselectedContainerColor : j17;
        long j35 = (i10 & 256) != 0 ? timePickerColors.periodSelectorSelectedContentColor : j18;
        long j36 = (i10 & 512) != 0 ? timePickerColors.periodSelectorUnselectedContentColor : j19;
        long j37 = (i10 & 1024) != 0 ? timePickerColors.timeSelectorSelectedContainerColor : j20;
        long j38 = (i10 & 2048) != 0 ? timePickerColors.timeSelectorUnselectedContainerColor : j21;
        long j39 = (i10 & 4096) != 0 ? timePickerColors.timeSelectorSelectedContentColor : j22;
        if ((i10 & 8192) != 0) {
            j25 = j39;
            j24 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j24 = j23;
            j25 = j39;
        }
        return timePickerColors.m29306copydVHXu7A(j33, j27, j28, j29, j30, j31, j32, j34, j35, j36, j37, j38, j25, j24);
    }

    @Stable
    /* renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29305clockDialContentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m29306copydVHXu7A(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23) {
        return new TimePickerColors(j10 != 16 ? j10 : this.clockDialColor, j11 != 16 ? j11 : this.selectorColor, j12 != 16 ? j12 : this.containerColor, j13 != 16 ? j13 : this.periodSelectorBorderColor, j14 != 16 ? j14 : this.clockDialSelectedContentColor, j15 != 16 ? j15 : this.clockDialUnselectedContentColor, j16 != 16 ? j16 : this.periodSelectorSelectedContainerColor, j17 != 16 ? j17 : this.periodSelectorUnselectedContainerColor, j18 != 16 ? j18 : this.periodSelectorSelectedContentColor, j19 != 16 ? j19 : this.periodSelectorUnselectedContentColor, j20 != 16 ? j20 : this.timeSelectorSelectedContainerColor, j21 != 16 ? j21 : this.timeSelectorUnselectedContainerColor, j22 != 16 ? j22 : this.timeSelectorSelectedContentColor, j23 != 16 ? j23 : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerColors.class != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        return Color.m30879equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m30879equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m30879equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m30879equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m30879equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m30879equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m30879equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m30879equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m30879equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m30879equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m30879equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m30879equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m29307getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29308getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29309getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29310getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m29311getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29312getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29313getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29314getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29315getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m29316getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29317getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29318getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29319getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m29320getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m30885hashCodeimpl(this.clockDialColor) * 31) + Color.m30885hashCodeimpl(this.selectorColor)) * 31) + Color.m30885hashCodeimpl(this.containerColor)) * 31) + Color.m30885hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m30885hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m30885hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m30885hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m30885hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }

    @Stable
    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29321periodSelectorContainerColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29322periodSelectorContentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    @Stable
    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29323timeSelectorContainerColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29324timeSelectorContentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    private TimePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23) {
        this.clockDialColor = j10;
        this.selectorColor = j11;
        this.containerColor = j12;
        this.periodSelectorBorderColor = j13;
        this.clockDialSelectedContentColor = j14;
        this.clockDialUnselectedContentColor = j15;
        this.periodSelectorSelectedContainerColor = j16;
        this.periodSelectorUnselectedContainerColor = j17;
        this.periodSelectorSelectedContentColor = j18;
        this.periodSelectorUnselectedContentColor = j19;
        this.timeSelectorSelectedContainerColor = j20;
        this.timeSelectorUnselectedContainerColor = j21;
        this.timeSelectorSelectedContentColor = j22;
        this.timeSelectorUnselectedContentColor = j23;
    }
}

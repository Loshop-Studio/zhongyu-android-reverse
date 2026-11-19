package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalMaterial3Api
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010&J\u001d\u00100\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u001d\u00104\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010&R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m13558d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClockDialColor-0d7_KjU", "()J", "J", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getContainerColor-0d7_KjU", "getPeriodSelectorBorderColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorSelectedContentColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "getSelectorColor-0d7_KjU", "getTimeSelectorSelectedContainerColor-0d7_KjU", "getTimeSelectorSelectedContentColor-0d7_KjU", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "getTimeSelectorUnselectedContentColor-0d7_KjU", "clockDialContentColor", "selected", "", "clockDialContentColor-vNxB06k$material3_release", "(Z)J", "copy", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "equals", "other", "hashCode", "", "periodSelectorContainerColor", "periodSelectorContainerColor-vNxB06k$material3_release", "periodSelectorContentColor", "periodSelectorContentColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContentColor", "timeSelectorContentColor-vNxB06k$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2008:1\n708#2:2009\n696#2:2010\n708#2:2011\n696#2:2012\n708#2:2013\n696#2:2014\n708#2:2015\n696#2:2016\n708#2:2017\n696#2:2018\n708#2:2019\n696#2:2020\n708#2:2021\n696#2:2022\n708#2:2023\n696#2:2024\n708#2:2025\n696#2:2026\n708#2:2027\n696#2:2028\n708#2:2029\n696#2:2030\n708#2:2031\n696#2:2032\n708#2:2033\n696#2:2034\n708#2:2035\n696#2:2036\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n440#1:2009\n440#1:2010\n441#1:2011\n441#1:2012\n442#1:2013\n442#1:2014\n443#1:2015\n443#1:2016\n444#1:2017\n444#1:2018\n445#1:2019\n445#1:2020\n446#1:2021\n446#1:2022\n449#1:2023\n449#1:2024\n452#1:2025\n452#1:2026\n455#1:2027\n455#1:2028\n458#1:2029\n458#1:2030\n461#1:2031\n461#1:2032\n464#1:2033\n464#1:2034\n465#1:2035\n465#1:2036\n*E\n"})
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

    public /* synthetic */ TimePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23);
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m19433copydVHXu7A$default(TimePickerColors timePickerColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, int i10, Object obj) {
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
        return timePickerColors.m19435copydVHXu7A(j33, j27, j28, j29, j30, j31, j32, j34, j35, j36, j37, j38, j25, j24);
    }

    @Stable
    /* renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19434clockDialContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m19435copydVHXu7A(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        return new TimePickerColors(clockDialColor != 16 ? clockDialColor : this.clockDialColor, selectorColor != 16 ? selectorColor : this.selectorColor, containerColor != 16 ? containerColor : this.containerColor, periodSelectorBorderColor != 16 ? periodSelectorBorderColor : this.periodSelectorBorderColor, clockDialSelectedContentColor != 16 ? clockDialSelectedContentColor : this.clockDialSelectedContentColor, clockDialUnselectedContentColor != 16 ? clockDialUnselectedContentColor : this.clockDialUnselectedContentColor, periodSelectorSelectedContainerColor != 16 ? periodSelectorSelectedContainerColor : this.periodSelectorSelectedContainerColor, periodSelectorUnselectedContainerColor != 16 ? periodSelectorUnselectedContainerColor : this.periodSelectorUnselectedContainerColor, periodSelectorSelectedContentColor != 16 ? periodSelectorSelectedContentColor : this.periodSelectorSelectedContentColor, periodSelectorUnselectedContentColor != 16 ? periodSelectorUnselectedContentColor : this.periodSelectorUnselectedContentColor, timeSelectorSelectedContainerColor != 16 ? timeSelectorSelectedContainerColor : this.timeSelectorSelectedContainerColor, timeSelectorUnselectedContainerColor != 16 ? timeSelectorUnselectedContainerColor : this.timeSelectorUnselectedContainerColor, timeSelectorSelectedContentColor != 16 ? timeSelectorSelectedContentColor : this.timeSelectorSelectedContentColor, timeSelectorUnselectedContentColor != 16 ? timeSelectorUnselectedContentColor : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TimePickerColors.class != other.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) other;
        return Color.m20977equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m20977equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m20977equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m20977equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m20977equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m20977equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m20977equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m20977equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m20977equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m20977equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m20977equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m20977equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialSelectedContentColor() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialUnselectedContentColor() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContainerColor() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContentColor() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContainerColor() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContentColor() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContainerColor() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContentColor() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContainerColor() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContentColor() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m20983hashCodeimpl(this.clockDialColor) * 31) + Color.m20983hashCodeimpl(this.selectorColor)) * 31) + Color.m20983hashCodeimpl(this.containerColor)) * 31) + Color.m20983hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m20983hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m20983hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m20983hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m20983hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }

    @Stable
    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19450periodSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19451periodSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    @Stable
    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19452timeSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19453timeSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
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

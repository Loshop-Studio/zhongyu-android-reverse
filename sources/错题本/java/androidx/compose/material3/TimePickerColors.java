package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u009c\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0019J\u001d\u0010\"\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019J\u001a\u0010$\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b,\u0010+R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b.\u0010+R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b/\u0010+R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b0\u0010+R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b1\u0010+R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b2\u0010+R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b3\u0010+R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b4\u0010+R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b5\u0010+R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b6\u0010+R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b7\u0010+R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b8\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m5110d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "copy", "", "selected", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getClockDialColor-0d7_KjU", "()J", "getSelectorColor-0d7_KjU", "getContainerColor-0d7_KjU", "getPeriodSelectorBorderColor-0d7_KjU", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "getPeriodSelectorSelectedContentColor-0d7_KjU", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "getTimeSelectorSelectedContainerColor-0d7_KjU", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "getTimeSelectorSelectedContentColor-0d7_KjU", "getTimeSelectorUnselectedContentColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2008:1\n708#2:2009\n696#2:2010\n708#2:2011\n696#2:2012\n708#2:2013\n696#2:2014\n708#2:2015\n696#2:2016\n708#2:2017\n696#2:2018\n708#2:2019\n696#2:2020\n708#2:2021\n696#2:2022\n708#2:2023\n696#2:2024\n708#2:2025\n696#2:2026\n708#2:2027\n696#2:2028\n708#2:2029\n696#2:2030\n708#2:2031\n696#2:2032\n708#2:2033\n696#2:2034\n708#2:2035\n696#2:2036\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n440#1:2009\n440#1:2010\n441#1:2011\n441#1:2012\n442#1:2013\n442#1:2014\n443#1:2015\n443#1:2016\n444#1:2017\n444#1:2018\n445#1:2019\n445#1:2020\n446#1:2021\n446#1:2022\n449#1:2023\n449#1:2024\n452#1:2025\n452#1:2026\n455#1:2027\n455#1:2028\n458#1:2029\n458#1:2030\n461#1:2031\n461#1:2032\n464#1:2033\n464#1:2034\n465#1:2035\n465#1:2036\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ TimePickerColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m9108copydVHXu7A$default(TimePickerColors timePickerColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i, Object obj) {
        long j21;
        long j22;
        long j23 = (i & 1) != 0 ? timePickerColors.containerColor : j7;
        long j24 = (i & 2) != 0 ? timePickerColors.selectorColor : j8;
        long j25 = (i & 4) != 0 ? timePickerColors.containerColor : j9;
        long j26 = (i & 8) != 0 ? timePickerColors.periodSelectorBorderColor : j10;
        long j27 = (i & 16) != 0 ? timePickerColors.clockDialSelectedContentColor : j11;
        long j28 = (i & 32) != 0 ? timePickerColors.clockDialUnselectedContentColor : j12;
        long j29 = (i & 64) != 0 ? timePickerColors.periodSelectorSelectedContainerColor : j13;
        long j30 = j23;
        long j31 = (i & 128) != 0 ? timePickerColors.periodSelectorUnselectedContainerColor : j14;
        long j32 = (i & 256) != 0 ? timePickerColors.periodSelectorSelectedContentColor : j15;
        long j33 = (i & 512) != 0 ? timePickerColors.periodSelectorUnselectedContentColor : j16;
        long j34 = (i & 1024) != 0 ? timePickerColors.timeSelectorSelectedContainerColor : j17;
        long j35 = (i & 2048) != 0 ? timePickerColors.timeSelectorUnselectedContainerColor : j18;
        long j36 = (i & 4096) != 0 ? timePickerColors.timeSelectorSelectedContentColor : j19;
        if ((i & 8192) != 0) {
            j22 = j36;
            j21 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j21 = j20;
            j22 = j36;
        }
        return timePickerColors.m9110copydVHXu7A(j30, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34, j35, j22, j21);
    }

    @Stable
    /* renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9109clockDialContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    @NotNull
    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m9110copydVHXu7A(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        return new TimePickerColors(clockDialColor != 16 ? clockDialColor : this.clockDialColor, selectorColor != 16 ? selectorColor : this.selectorColor, containerColor != 16 ? containerColor : this.containerColor, periodSelectorBorderColor != 16 ? periodSelectorBorderColor : this.periodSelectorBorderColor, clockDialSelectedContentColor != 16 ? clockDialSelectedContentColor : this.clockDialSelectedContentColor, clockDialUnselectedContentColor != 16 ? clockDialUnselectedContentColor : this.clockDialUnselectedContentColor, periodSelectorSelectedContainerColor != 16 ? periodSelectorSelectedContainerColor : this.periodSelectorSelectedContainerColor, periodSelectorUnselectedContainerColor != 16 ? periodSelectorUnselectedContainerColor : this.periodSelectorUnselectedContainerColor, periodSelectorSelectedContentColor != 16 ? periodSelectorSelectedContentColor : this.periodSelectorSelectedContentColor, periodSelectorUnselectedContentColor != 16 ? periodSelectorUnselectedContentColor : this.periodSelectorUnselectedContentColor, timeSelectorSelectedContainerColor != 16 ? timeSelectorSelectedContainerColor : this.timeSelectorSelectedContainerColor, timeSelectorUnselectedContainerColor != 16 ? timeSelectorUnselectedContainerColor : this.timeSelectorUnselectedContainerColor, timeSelectorSelectedContentColor != 16 ? timeSelectorSelectedContentColor : this.timeSelectorSelectedContentColor, timeSelectorUnselectedContentColor != 16 ? timeSelectorUnselectedContentColor : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TimePickerColors.class != other.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) other;
        return Color.m10683equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m10683equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m10683equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m10683equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m10683equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m10683equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m10683equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m10683equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m10683equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m10683equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m10683equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m10683equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
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
        return Color.m10689hashCodeimpl(this.timeSelectorUnselectedContentColor) + AbstractC0584a.m904e(this.timeSelectorSelectedContentColor, AbstractC0584a.m904e(this.timeSelectorUnselectedContainerColor, AbstractC0584a.m904e(this.timeSelectorSelectedContainerColor, AbstractC0584a.m904e(this.periodSelectorUnselectedContentColor, AbstractC0584a.m904e(this.periodSelectorSelectedContentColor, AbstractC0584a.m904e(this.periodSelectorUnselectedContainerColor, AbstractC0584a.m904e(this.periodSelectorSelectedContainerColor, AbstractC0584a.m904e(this.periodSelectorBorderColor, AbstractC0584a.m904e(this.containerColor, AbstractC0584a.m904e(this.selectorColor, Color.m10689hashCodeimpl(this.clockDialColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9125periodSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9126periodSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    @Stable
    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9127timeSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    @Stable
    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9128timeSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    private TimePickerColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.clockDialColor = j7;
        this.selectorColor = j8;
        this.containerColor = j9;
        this.periodSelectorBorderColor = j10;
        this.clockDialSelectedContentColor = j11;
        this.clockDialUnselectedContentColor = j12;
        this.periodSelectorSelectedContainerColor = j13;
        this.periodSelectorUnselectedContainerColor = j14;
        this.periodSelectorSelectedContentColor = j15;
        this.periodSelectorUnselectedContentColor = j16;
        this.timeSelectorSelectedContainerColor = j17;
        this.timeSelectorUnselectedContainerColor = j18;
        this.timeSelectorSelectedContentColor = j19;
        this.timeSelectorUnselectedContentColor = j20;
    }
}

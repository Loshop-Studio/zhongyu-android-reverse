package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.C8321f;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i10, int i11, int i12, int i13, long j10) {
        this.year = i10;
        this.month = i11;
        this.numberOfDays = i12;
        this.daysFromStartOfWeekToFirstOfMonth = i13;
        this.startUtcTimeMillis = j10;
        this.endUtcTimeMillis = (j10 + (i12 * CalendarModelKt.MillisecondsIn24Hours)) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i10, int i11, int i12, int i13, long j10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = calendarMonth.year;
        }
        if ((i14 & 2) != 0) {
            i11 = calendarMonth.month;
        }
        if ((i14 & 4) != 0) {
            i12 = calendarMonth.numberOfDays;
        }
        if ((i14 & 8) != 0) {
            i13 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        if ((i14 & 16) != 0) {
            j10 = calendarMonth.startUtcTimeMillis;
        }
        long j11 = j10;
        return calendarMonth.copy(i10, i11, i12, i13, j11);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.numberOfDays;
    }

    public final int component4() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long component5() {
        return this.startUtcTimeMillis;
    }

    public final CalendarMonth copy(int i10, int i11, int i12, int i13, long j10) {
        return new CalendarMonth(i10, i11, i12, i13, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.numberOfDays)) * 31) + Integer.hashCode(this.daysFromStartOfWeekToFirstOfMonth)) * 31) + Long.hashCode(this.startUtcTimeMillis);
    }

    public final int indexIn(C8321f c8321f) {
        return (((this.year - c8321f.m13496b()) * 12) + this.month) - 1;
    }

    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }
}

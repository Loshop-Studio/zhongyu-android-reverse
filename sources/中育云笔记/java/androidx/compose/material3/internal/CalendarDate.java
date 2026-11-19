package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CalendarDate implements Comparable<CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public CalendarDate(int i10, int i11, int i12, long j10) {
        this.year = i10;
        this.month = i11;
        this.dayOfMonth = i12;
        this.utcTimeMillis = j10;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i10, int i11, int i12, long j10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = calendarDate.year;
        }
        if ((i13 & 2) != 0) {
            i11 = calendarDate.month;
        }
        if ((i13 & 4) != 0) {
            i12 = calendarDate.dayOfMonth;
        }
        if ((i13 & 8) != 0) {
            j10 = calendarDate.utcTimeMillis;
        }
        int i14 = i12;
        return calendarDate.copy(i10, i11, i14, j10);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.dayOfMonth;
    }

    public final long component4() {
        return this.utcTimeMillis;
    }

    public final CalendarDate copy(int i10, int i11, int i12, long j10) {
        return new CalendarDate(i10, i11, i12, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.dayOfMonth)) * 31) + Long.hashCode(this.utcTimeMillis);
    }

    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDate calendarDate) {
        return AbstractC9979u.m20297j(this.utcTimeMillis, calendarDate.utcTimeMillis);
    }
}

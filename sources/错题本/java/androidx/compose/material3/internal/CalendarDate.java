package androidx.compose.material3.internal;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m5110d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "year", "", "month", "dayOfMonth", "utcTimeMillis", "", "(IIIJ)V", "getDayOfMonth", "()I", "getMonth", "getUtcTimeMillis", "()J", "getYear", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "format", "", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "skeleton", "hashCode", "toString", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class CalendarDate implements Comparable<CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public CalendarDate(int i, int i8, int i9, long j7) {
        this.year = i;
        this.month = i8;
        this.dayOfMonth = i9;
        this.utcTimeMillis = j7;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i, int i8, int i9, long j7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = calendarDate.year;
        }
        if ((i10 & 2) != 0) {
            i8 = calendarDate.month;
        }
        if ((i10 & 4) != 0) {
            i9 = calendarDate.dayOfMonth;
        }
        if ((i10 & 8) != 0) {
            j7 = calendarDate.utcTimeMillis;
        }
        int i11 = i9;
        return calendarDate.copy(i, i8, i11, j7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    @NotNull
    public final CalendarDate copy(int year, int month, int dayOfMonth, long utcTimeMillis) {
        return new CalendarDate(year, month, dayOfMonth, utcTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) other;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel, @NotNull String skeleton) {
        return calendarModel.formatWithSkeleton(this, skeleton, calendarModel.getLocale());
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
        return Long.hashCode(this.utcTimeMillis) + AbstractC0584a.m902c(this.dayOfMonth, AbstractC0584a.m902c(this.month, Integer.hashCode(this.year) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull CalendarDate other) {
        return AbstractC5830k.m5333j(this.utcTimeMillis, other.utcTimeMillis);
    }
}

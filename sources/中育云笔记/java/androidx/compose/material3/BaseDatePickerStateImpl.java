package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;
import p265nd.C10405j;

@Stable
/* loaded from: classes2.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;
    private MutableState<CalendarMonth> _displayedMonth;
    private final CalendarModel calendarModel;
    private final MutableState selectableDates$delegate;
    private final C10405j yearRange;

    public BaseDatePickerStateImpl(Long l10, C10405j c10405j, SelectableDates selectableDates, Locale locale) {
        CalendarMonth month;
        this.yearRange = c10405j;
        CalendarModel calendarModelCreateCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = calendarModelCreateCalendarModel;
        this.selectableDates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l10 != null) {
            month = calendarModelCreateCalendarModel.getMonth(l10.longValue());
            if (!c10405j.m21739g(month.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + month.getYear() + ") is out of the years range of " + c10405j + '.').toString());
            }
        } else {
            month = calendarModelCreateCalendarModel.getMonth(calendarModelCreateCalendarModel.getToday());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    public final SelectableDates getSelectableDates() {
        return (SelectableDates) this.selectableDates$delegate.getValue();
    }

    public final C10405j getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayedMonthMillis(long j10) {
        CalendarMonth month = this.calendarModel.getMonth(j10);
        if (this.yearRange.m21739g(month.getYear())) {
            this._displayedMonth.setValue(month);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + month.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
    }

    public final void setSelectableDates(SelectableDates selectableDates) {
        this.selectableDates$delegate.setValue(selectableDates);
    }
}

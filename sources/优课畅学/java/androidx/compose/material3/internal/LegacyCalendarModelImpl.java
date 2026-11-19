package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LegacyCalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String str, Locale locale, Map<String, Object> map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3_release());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        public final String formatWithPattern(long j10, String str, Locale locale, Map<String, Object> map) {
            SimpleDateFormat cachedSimpleDateFormat = getCachedSimpleDateFormat(str, locale, map);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(j10);
            return cachedSimpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }

        private Companion() {
        }
    }

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        List listM14753c = AbstractC8807u.m14753c();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listM14727q0 = AbstractC8801r.m14727q0(weekdays, 2);
        int size = listM14727q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            listM14753c.add(new Pair((String) listM14727q0.get(i10), shortWeekdays[i10 + 2]));
        }
        listM14753c.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = AbstractC8807u.m14751a(listM14753c);
    }

    private final int dayInISO8601(int i10) {
        int i11 = (i10 + 6) % 7;
        if (i11 == 0) {
            return 7;
        }
        return i11;
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long j10, String str, Locale locale) {
        return Companion.formatWithPattern(j10, str, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long j10) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat getDateInputFormat(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        AbstractC9133u.m16131e(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate calendarDate) {
        return dayInISO8601(toCalendar(calendarDate, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long j10) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j10);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), 1 + calendar.get(2), calendar.get(5), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i10) {
        if (i10 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, -i10);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String str, String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i10) {
        if (i10 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, i10);
        return getMonth(calendar);
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        return calendar;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate calendarDate) {
        return getMonth(calendarDate.getYear(), calendarDate.getMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int i10, int i11) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, i11 - 1);
        calendar.set(5, 1);
        return getMonth(calendar);
    }

    private final CalendarMonth getMonth(Calendar calendar) {
        int iDayInISO8601 = dayInISO8601(calendar.get(7)) - getFirstDayOfWeek();
        if (iDayInISO8601 < 0) {
            iDayInISO8601 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), iDayInISO8601, calendar.getTimeInMillis());
    }
}

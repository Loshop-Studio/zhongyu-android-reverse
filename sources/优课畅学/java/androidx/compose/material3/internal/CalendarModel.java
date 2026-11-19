package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class CalendarModel {
    public static final int $stable = 8;
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final Locale locale;

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel calendarModel, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i10 & 1) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.getDateInputFormat(locale);
    }

    public abstract String formatWithPattern(long j10, String str, Locale locale);

    public final String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarMonth.getStartUtcTimeMillis(), str, locale, this.formatterCache);
    }

    public abstract CalendarDate getCanonicalDate(long j10);

    public abstract DateInputFormat getDateInputFormat(Locale locale);

    public abstract int getDayOfWeek(CalendarDate calendarDate);

    public abstract int getFirstDayOfWeek();

    public final Map<String, Object> getFormatterCache$material3_release() {
        return this.formatterCache;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public abstract CalendarMonth getMonth(int i10, int i11);

    public abstract CalendarMonth getMonth(long j10);

    public abstract CalendarMonth getMonth(CalendarDate calendarDate);

    public abstract CalendarDate getToday();

    public abstract List<Pair<String, String>> getWeekdayNames();

    public abstract CalendarMonth minusMonths(CalendarMonth calendarMonth, int i10);

    public abstract CalendarDate parse(String str, String str2);

    public abstract CalendarMonth plusMonths(CalendarMonth calendarMonth, int i10);

    public final String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarDate.getUtcTimeMillis(), str, locale, this.formatterCache);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }
}

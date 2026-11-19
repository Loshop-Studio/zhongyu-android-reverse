package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.C3457R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
class DateStrings {
    private DateStrings() {
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l, @Nullable Long l3) {
        return getDateRangeString(l, l3, null);
    }

    public static String getDateString(long j7) {
        return getDateString(j7, null);
    }

    public static String getDayContentDescription(Context context, long j7, boolean z8, boolean z9, boolean z10) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j7);
        if (z8) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(C3457R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        return z9 ? String.format(context.getString(C3457R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay) : z10 ? String.format(context.getString(C3457R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j7) {
        return getMonthDay(j7, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j7) {
        return getMonthDayOfWeekDay(j7, Locale.getDefault());
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j7) {
        return isDateWithinCurrentYear(j7) ? getMonthDayOfWeekDay(j7) : getYearMonthDayOfWeekDay(j7);
    }

    public static String getYearContentDescription(Context context, int i) {
        return UtcDates.getTodayCalendar().get(1) == i ? String.format(context.getString(C3457R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i)) : String.format(context.getString(C3457R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    public static String getYearMonth(long j7) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j7));
    }

    public static String getYearMonthDay(long j7) {
        return getYearMonthDay(j7, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j7) {
        return getYearMonthDayOfWeekDay(j7, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j7) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j7);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l, @Nullable Long l3, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l == null && l3 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return Pair.create(getDateString(l.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getYearMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j7, @Nullable SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j7)) : isDateWithinCurrentYear(j7) ? getMonthDay(j7) : getYearMonthDay(j7);
    }

    public static String getMonthDay(long j7, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j7));
    }

    public static String getMonthDayOfWeekDay(long j7, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j7));
    }

    public static String getYearMonthDay(long j7, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j7));
    }

    public static String getYearMonthDayOfWeekDay(long j7, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j7));
    }
}

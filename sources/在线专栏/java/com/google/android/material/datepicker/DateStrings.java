package com.google.android.material.datepicker;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p011b0.C1021d;

/* loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
    }

    static C1021d<String, String> getDateRangeString(Long l3, Long l4) {
        return getDateRangeString(l3, l4, null);
    }

    static String getDateString(long j4) {
        return getDateString(j4, null);
    }

    static String getMonthDay(long j4) {
        return getMonthDay(j4, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j4) {
        return getMonthDayOfWeekDay(j4, Locale.getDefault());
    }

    static String getYearMonthDay(long j4) {
        return getYearMonthDay(j4, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j4) {
        return getYearMonthDayOfWeekDay(j4, Locale.getDefault());
    }

    static C1021d<String, String> getDateRangeString(Long l3, Long l4, SimpleDateFormat simpleDateFormat) {
        if (l3 == null && l4 == null) {
            return C1021d.m4775a(null, null);
        }
        if (l3 == null) {
            return C1021d.m4775a(null, getDateString(l4.longValue(), simpleDateFormat));
        }
        if (l4 == null) {
            return C1021d.m4775a(getDateString(l3.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l3.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l4.longValue());
        if (simpleDateFormat != null) {
            return C1021d.m4775a(simpleDateFormat.format(new Date(l3.longValue())), simpleDateFormat.format(new Date(l4.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? C1021d.m4775a(getMonthDay(l3.longValue(), Locale.getDefault()), getMonthDay(l4.longValue(), Locale.getDefault())) : C1021d.m4775a(getMonthDay(l3.longValue(), Locale.getDefault()), getYearMonthDay(l4.longValue(), Locale.getDefault())) : C1021d.m4775a(getYearMonthDay(l3.longValue(), Locale.getDefault()), getYearMonthDay(l4.longValue(), Locale.getDefault()));
    }

    static String getDateString(long j4, SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j4);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j4)) : todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j4) : getYearMonthDay(j4);
    }

    static String getMonthDay(long j4, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j4)) : UtcDates.getMediumNoYear(locale).format(new Date(j4));
    }

    static String getMonthDayOfWeekDay(long j4, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j4)) : UtcDates.getFullFormat(locale).format(new Date(j4));
    }

    static String getYearMonthDay(long j4, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j4)) : UtcDates.getMediumFormat(locale).format(new Date(j4));
    }

    static String getYearMonthDayOfWeekDay(long j4, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j4)) : UtcDates.getFullFormat(locale).format(new Date(j4));
    }
}

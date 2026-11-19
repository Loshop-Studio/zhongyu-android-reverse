package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.C5733R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
class DateStrings {
    private DateStrings() {
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l9, @Nullable Long l10) {
        return getDateRangeString(l9, l10, null);
    }

    public static String getDateString(long j9) {
        return getDateString(j9, null);
    }

    public static String getDayContentDescription(Context context, long j9, boolean z9, boolean z10, boolean z11) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j9);
        if (z9) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(C5733R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        return z10 ? String.format(context.getString(C5733R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay) : z11 ? String.format(context.getString(C5733R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j9) {
        return getMonthDay(j9, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j9) {
        return getMonthDayOfWeekDay(j9, Locale.getDefault());
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j9) {
        return isDateWithinCurrentYear(j9) ? getMonthDayOfWeekDay(j9) : getYearMonthDayOfWeekDay(j9);
    }

    public static String getYearContentDescription(Context context, int i9) {
        return UtcDates.getTodayCalendar().get(1) == i9 ? String.format(context.getString(C5733R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i9)) : String.format(context.getString(C5733R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i9));
    }

    public static String getYearMonth(long j9) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j9));
    }

    public static String getYearMonthDay(long j9) {
        return getYearMonthDay(j9, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j9) {
        return getYearMonthDayOfWeekDay(j9, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j9) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j9);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l9, @Nullable Long l10, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l9 == null && l10 == null) {
            return Pair.create(null, null);
        }
        if (l9 == null) {
            return Pair.create(null, getDateString(l10.longValue(), simpleDateFormat));
        }
        if (l10 == null) {
            return Pair.create(getDateString(l9.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l9.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l10.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l9.longValue())), simpleDateFormat.format(new Date(l10.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l9.longValue(), Locale.getDefault()), getMonthDay(l10.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l9.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault())) : Pair.create(getYearMonthDay(l9.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j9, @Nullable SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j9)) : isDateWithinCurrentYear(j9) ? getMonthDay(j9) : getYearMonthDay(j9);
    }

    public static String getMonthDay(long j9, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j9));
    }

    public static String getMonthDayOfWeekDay(long j9, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j9));
    }

    public static String getYearMonthDay(long j9, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j9));
    }

    public static String getYearMonthDayOfWeekDay(long j9, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j9));
    }
}

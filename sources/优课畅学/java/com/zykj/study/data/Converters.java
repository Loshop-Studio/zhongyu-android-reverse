package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import com.zykj.study.bean.course.CourseType;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class Converters {
    public static final int $stable = 0;

    @TypeConverter
    public final long calendarToDateStamp(Calendar calendar) {
        AbstractC9133u.m16133g(calendar, "calendar");
        return calendar.getTimeInMillis();
    }

    @TypeConverter
    public final Calendar dateStampToCalendar(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        AbstractC9133u.m16132f(calendar, "apply(...)");
        return calendar;
    }

    @TypeConverter
    public final Long dateToLong(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    @TypeConverter
    public final Date longToDate(Long l10) {
        if (l10 != null) {
            return new Date(l10.longValue());
        }
        return null;
    }

    @TypeConverter
    public final String sessionOrderTypeToString(CourseType enumValue) {
        AbstractC9133u.m16133g(enumValue, "enumValue");
        return enumValue.name();
    }

    @TypeConverter
    public final CourseType stringToSessionOrderType(String value) {
        AbstractC9133u.m16133g(value, "value");
        return CourseType.valueOf(value);
    }
}

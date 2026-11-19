package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    private final Long fixedTimeMs;
    private final TimeZone fixedTimeZone;

    private TimeSource(Long l3, TimeZone timeZone) {
        this.fixedTimeMs = l3;
        this.fixedTimeZone = timeZone;
    }

    static TimeSource fixed(long j4, TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j4), timeZone);
    }

    static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    Calendar now() {
        return now(this.fixedTimeZone);
    }

    static TimeSource fixed(long j4) {
        return new TimeSource(Long.valueOf(j4), null);
    }

    Calendar now(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l3 = this.fixedTimeMs;
        if (l3 != null) {
            calendar.setTimeInMillis(l3.longValue());
        }
        return calendar;
    }
}

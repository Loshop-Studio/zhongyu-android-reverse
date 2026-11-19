package androidx.compose.material3.internal;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;

@StabilityInferred(parameters = 0)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class CalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ZoneId utcTimeZoneId = ZoneId.of("UTC");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final DateTimeFormatter getCachedDateTimeFormatter(String str, Locale locale, Map<String, Object> map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            AbstractC9133u.m16131e(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return AbstractC2487n0.m958a(objWithDecimalStyle);
        }

        public final String formatWithPattern(long j10, String str, Locale locale, Map<String, Object> map) {
            return Instant.ofEpochMilli(j10).atZone(getUtcTimeZoneId$material3_release()).toLocalDate().format(getCachedDateTimeFormatter(str, locale, map));
        }

        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.utcTimeZoneId;
        }

        private Companion() {
        }
    }

    public CalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(AbstractC8726f.m14230a(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.weekdayNames = arrayList;
    }

    private final LocalDate toLocalDate(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis()).atZone(utcTimeZoneId).toLocalDate();
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long j10, String str, Locale locale) {
        return Companion.formatWithPattern(j10, str, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long j10) {
        LocalDate localDate = Instant.ofEpochMilli(j10).atZone(utcTimeZoneId).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat getDateInputFormat(Locale locale) {
        return CalendarModelKt.datePatternAsInputFormat(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate calendarDate) {
        return toLocalDate(calendarDate).getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long j10) {
        return getMonth(Instant.ofEpochMilli(j10).atZone(utcTimeZoneId).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i10) {
        return i10 <= 0 ? calendarMonth : getMonth(toLocalDate(calendarMonth).minusMonths(i10));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i10) {
        return i10 <= 0 ? calendarMonth : getMonth(toLocalDate(calendarMonth).plusMonths(i10));
    }

    public String toString() {
        return "CalendarModel";
    }

    private final LocalDate toLocalDate(CalendarDate calendarDate) {
        return LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate calendarDate) {
        return getMonth(LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int i10, int i11) {
        return getMonth(LocalDate.of(i10, i11, 1));
    }

    private final CalendarMonth getMonth(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }
}

package androidx.compose.material3.internal;

import android.os.Build;
import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CalendarModel_androidKt {
    public static final CalendarModel createCalendarModel(Locale locale) {
        return Build.VERSION.SDK_INT >= 26 ? new CalendarModelImpl(locale) : new LegacyCalendarModelImpl(locale);
    }

    public static final String formatWithSkeleton(long j10, String str, Locale locale, Map<String, Object> map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = map.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            map.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        return Build.VERSION.SDK_INT >= 26 ? CalendarModelImpl.Companion.formatWithPattern(j10, string, locale, map) : LegacyCalendarModelImpl.Companion.formatWithPattern(j10, string, locale, map);
    }
}

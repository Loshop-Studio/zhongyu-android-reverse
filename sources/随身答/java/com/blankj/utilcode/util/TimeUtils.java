package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.constant.TimeConstants;
import com.zykj.student.dialogue.bean.resp.CollectSessionRespKt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class TimeUtils {
    private static final ThreadLocal<Map<String, SimpleDateFormat>> SDF_THREAD_LOCAL = new ThreadLocal<Map<String, SimpleDateFormat>>() { // from class: com.blankj.utilcode.util.TimeUtils.1
        @Override // java.lang.ThreadLocal
        public Map<String, SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    };
    private static final String[] CHINESE_ZODIAC = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};
    private static final int[] ZODIAC_FLAGS = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};
    private static final String[] ZODIAC = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    private TimeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long date2Millis(Date date) {
        return date.getTime();
    }

    public static String date2String(Date date) {
        return date2String(date, getDefaultFormat());
    }

    public static String getChineseWeek(String str) {
        return getChineseWeek(string2Date(str, getDefaultFormat()));
    }

    public static String getChineseZodiac(String str) {
        return getChineseZodiac(string2Date(str, getDefaultFormat()));
    }

    public static Date getDate(long j9, long j10, int i9) {
        return millis2Date(j9 + timeSpan2Millis(j10, i9));
    }

    public static Date getDateByNow(long j9, int i9) {
        return getDate(getNowMills(), j9, i9);
    }

    private static SimpleDateFormat getDefaultFormat() {
        return getSafeDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS);
    }

    public static String getFitTimeSpan(String str, String str2, int i9) {
        return millis2FitTimeSpan(string2Millis(str, getDefaultFormat()) - string2Millis(str2, getDefaultFormat()), i9);
    }

    public static String getFitTimeSpanByNow(String str, int i9) {
        return getFitTimeSpan(str, getNowString(), getDefaultFormat(), i9);
    }

    public static String getFriendlyTimeSpanByNow(String str) {
        return getFriendlyTimeSpanByNow(str, getDefaultFormat());
    }

    public static long getMillis(long j9, long j10, int i9) {
        return j9 + timeSpan2Millis(j10, i9);
    }

    public static long getMillisByNow(long j9, int i9) {
        return getMillis(getNowMills(), j9, i9);
    }

    public static Date getNowDate() {
        return new Date();
    }

    public static long getNowMills() {
        return System.currentTimeMillis();
    }

    public static String getNowString() {
        return millis2String(System.currentTimeMillis(), getDefaultFormat());
    }

    @SuppressLint({"SimpleDateFormat"})
    public static SimpleDateFormat getSafeDateFormat(String str) {
        Map<String, SimpleDateFormat> map = SDF_THREAD_LOCAL.get();
        SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String getString(long j9, long j10, int i9) {
        return getString(j9, getDefaultFormat(), j10, i9);
    }

    public static String getStringByNow(long j9, int i9) {
        return getStringByNow(j9, getDefaultFormat(), i9);
    }

    public static long getTimeSpan(String str, String str2, int i9) {
        return getTimeSpan(str, str2, getDefaultFormat(), i9);
    }

    public static long getTimeSpanByNow(String str, int i9) {
        return getTimeSpan(str, getNowString(), getDefaultFormat(), i9);
    }

    public static String getUSWeek(String str) {
        return getUSWeek(string2Date(str, getDefaultFormat()));
    }

    public static int getValueByCalendarField(int i9) {
        return Calendar.getInstance().get(i9);
    }

    private static long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String getZodiac(String str) {
        return getZodiac(string2Date(str, getDefaultFormat()));
    }

    public static boolean isAm() {
        return Calendar.getInstance().get(9) == 0;
    }

    public static boolean isLeapYear(String str) {
        return isLeapYear(string2Date(str, getDefaultFormat()));
    }

    public static boolean isPm() {
        return !isAm();
    }

    public static boolean isToday(String str) {
        return isToday(string2Millis(str, getDefaultFormat()));
    }

    public static boolean isUsingNetworkProvidedTime() {
        return Settings.Global.getInt(Utils.getApp().getContentResolver(), "auto_time", 0) == 1;
    }

    public static Date millis2Date(long j9) {
        return new Date(j9);
    }

    public static String millis2FitTimeSpan(long j9, int i9) {
        if (i9 <= 0) {
            return null;
        }
        int iMin = Math.min(i9, 5);
        String[] strArr = {"天", "小时", "分钟", "秒", "毫秒"};
        if (j9 == 0) {
            return 0 + strArr[iMin - 1];
        }
        StringBuilder sb = new StringBuilder();
        if (j9 < 0) {
            sb.append("-");
            j9 = -j9;
        }
        int[] iArr = {TimeConstants.DAY, TimeConstants.HOUR, TimeConstants.MIN, 1000, 1};
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            if (j9 >= i11) {
                long j10 = j9 / i11;
                j9 -= i11 * j10;
                sb.append(j10);
                sb.append(strArr[i10]);
            }
        }
        return sb.toString();
    }

    public static String millis2String(long j9) {
        return millis2String(j9, getDefaultFormat());
    }

    private static long millis2TimeSpan(long j9, int i9) {
        return j9 / i9;
    }

    public static Date string2Date(String str) {
        return string2Date(str, getDefaultFormat());
    }

    public static long string2Millis(String str) {
        return string2Millis(str, getDefaultFormat());
    }

    private static long timeSpan2Millis(long j9, int i9) {
        return j9 * i9;
    }

    public static String date2String(Date date, @NonNull String str) {
        return getSafeDateFormat(str).format(date);
    }

    public static String getChineseWeek(String str, @NonNull DateFormat dateFormat) {
        return getChineseWeek(string2Date(str, dateFormat));
    }

    public static String getChineseZodiac(String str, @NonNull DateFormat dateFormat) {
        return getChineseZodiac(string2Date(str, dateFormat));
    }

    public static Date getDate(String str, long j9, int i9) {
        return getDate(str, getDefaultFormat(), j9, i9);
    }

    public static String getFitTimeSpanByNow(String str, @NonNull DateFormat dateFormat, int i9) {
        return getFitTimeSpan(str, getNowString(dateFormat), dateFormat, i9);
    }

    public static String getFriendlyTimeSpanByNow(String str, @NonNull DateFormat dateFormat) {
        return getFriendlyTimeSpanByNow(string2Millis(str, dateFormat));
    }

    public static long getMillis(String str, long j9, int i9) {
        return getMillis(str, getDefaultFormat(), j9, i9);
    }

    public static String getNowString(@NonNull DateFormat dateFormat) {
        return millis2String(System.currentTimeMillis(), dateFormat);
    }

    public static String getString(long j9, @NonNull DateFormat dateFormat, long j10, int i9) {
        return millis2String(j9 + timeSpan2Millis(j10, i9), dateFormat);
    }

    public static String getStringByNow(long j9, @NonNull DateFormat dateFormat, int i9) {
        return getString(getNowMills(), dateFormat, j9, i9);
    }

    public static long getTimeSpan(String str, String str2, @NonNull DateFormat dateFormat, int i9) {
        return millis2TimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i9);
    }

    public static long getTimeSpanByNow(String str, @NonNull DateFormat dateFormat, int i9) {
        return getTimeSpan(str, getNowString(dateFormat), dateFormat, i9);
    }

    public static String getUSWeek(String str, @NonNull DateFormat dateFormat) {
        return getUSWeek(string2Date(str, dateFormat));
    }

    public static String getZodiac(String str, @NonNull DateFormat dateFormat) {
        return getZodiac(string2Date(str, dateFormat));
    }

    public static boolean isLeapYear(String str, @NonNull DateFormat dateFormat) {
        return isLeapYear(string2Date(str, dateFormat));
    }

    public static boolean isPm(String str) {
        return !isAm(str);
    }

    public static boolean isToday(String str, @NonNull DateFormat dateFormat) {
        return isToday(string2Millis(str, dateFormat));
    }

    public static String millis2String(long j9, @NonNull String str) {
        return millis2String(j9, getSafeDateFormat(str));
    }

    public static Date string2Date(String str, @NonNull String str2) {
        return string2Date(str, getSafeDateFormat(str2));
    }

    public static long string2Millis(String str, @NonNull String str2) {
        return string2Millis(str, getSafeDateFormat(str2));
    }

    public static String date2String(Date date, @NonNull DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static String getChineseWeek(Date date) {
        return new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, Locale.CHINA).format(date);
    }

    public static String getChineseZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return CHINESE_ZODIAC[calendar.get(1) % 12];
    }

    public static Date getDate(String str, @NonNull DateFormat dateFormat, long j9, int i9) {
        return millis2Date(string2Millis(str, dateFormat) + timeSpan2Millis(j9, i9));
    }

    public static String getFitTimeSpan(String str, String str2, @NonNull DateFormat dateFormat, int i9) {
        return millis2FitTimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i9);
    }

    public static String getFitTimeSpanByNow(Date date, int i9) {
        return getFitTimeSpan(date, getNowDate(), i9);
    }

    public static String getFriendlyTimeSpanByNow(Date date) {
        return getFriendlyTimeSpanByNow(date.getTime());
    }

    public static long getMillis(String str, @NonNull DateFormat dateFormat, long j9, int i9) {
        return string2Millis(str, dateFormat) + timeSpan2Millis(j9, i9);
    }

    public static String getString(String str, long j9, int i9) {
        return getString(str, getDefaultFormat(), j9, i9);
    }

    public static long getTimeSpan(Date date, Date date2, int i9) {
        return millis2TimeSpan(date2Millis(date) - date2Millis(date2), i9);
    }

    public static long getTimeSpanByNow(Date date, int i9) {
        return getTimeSpan(date, new Date(), i9);
    }

    public static String getUSWeek(Date date) {
        return new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public static int getValueByCalendarField(String str, int i9) {
        return getValueByCalendarField(string2Date(str, getDefaultFormat()), i9);
    }

    public static String getZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getZodiac(calendar.get(2) + 1, calendar.get(5));
    }

    public static boolean isAm(String str) {
        return getValueByCalendarField(str, getDefaultFormat(), 9) == 0;
    }

    public static boolean isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isPm(String str, @NonNull DateFormat dateFormat) {
        return !isAm(str, dateFormat);
    }

    public static boolean isToday(Date date) {
        return isToday(date.getTime());
    }

    public static String millis2String(long j9, @NonNull DateFormat dateFormat) {
        return dateFormat.format(new Date(j9));
    }

    public static Date string2Date(String str, @NonNull DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static long string2Millis(String str, @NonNull DateFormat dateFormat) {
        try {
            return dateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static String getChineseWeek(long j9) {
        return getChineseWeek(new Date(j9));
    }

    public static Date getDate(Date date, long j9, int i9) {
        return millis2Date(date2Millis(date) + timeSpan2Millis(j9, i9));
    }

    public static String getFitTimeSpanByNow(long j9, int i9) {
        return getFitTimeSpan(j9, System.currentTimeMillis(), i9);
    }

    public static String getFriendlyTimeSpanByNow(long j9) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j9;
        if (jCurrentTimeMillis < 0) {
            return String.format("%tc", Long.valueOf(j9));
        }
        if (jCurrentTimeMillis < 1000) {
            return "刚刚";
        }
        if (jCurrentTimeMillis < 60000) {
            return String.format(Locale.getDefault(), "%d秒前", Long.valueOf(jCurrentTimeMillis / 1000));
        }
        if (jCurrentTimeMillis < 3600000) {
            return String.format(Locale.getDefault(), "%d分钟前", Long.valueOf(jCurrentTimeMillis / 60000));
        }
        long weeOfToday = getWeeOfToday();
        if (j9 >= weeOfToday) {
            return String.format("今天%tR", Long.valueOf(j9));
        }
        if (j9 >= weeOfToday - CalendarModelKt.MillisecondsIn24Hours) {
            return String.format("昨天%tR", Long.valueOf(j9));
        }
        return String.format("%tF", Long.valueOf(j9));
    }

    public static long getMillis(Date date, long j9, int i9) {
        return date2Millis(date) + timeSpan2Millis(j9, i9);
    }

    public static String getString(String str, @NonNull DateFormat dateFormat, long j9, int i9) {
        return millis2String(string2Millis(str, dateFormat) + timeSpan2Millis(j9, i9), dateFormat);
    }

    public static long getTimeSpan(long j9, long j10, int i9) {
        return millis2TimeSpan(j9 - j10, i9);
    }

    public static long getTimeSpanByNow(long j9, int i9) {
        return getTimeSpan(j9, System.currentTimeMillis(), i9);
    }

    public static String getUSWeek(long j9) {
        return getUSWeek(new Date(j9));
    }

    public static int getValueByCalendarField(String str, @NonNull DateFormat dateFormat, int i9) {
        return getValueByCalendarField(string2Date(str, dateFormat), i9);
    }

    public static boolean isAm(String str, @NonNull DateFormat dateFormat) {
        return getValueByCalendarField(str, dateFormat, 9) == 0;
    }

    public static boolean isPm(Date date) {
        return !isAm(date);
    }

    public static boolean isToday(long j9) {
        long weeOfToday = getWeeOfToday();
        return j9 >= weeOfToday && j9 < weeOfToday + CalendarModelKt.MillisecondsIn24Hours;
    }

    public static String getFitTimeSpan(Date date, Date date2, int i9) {
        return millis2FitTimeSpan(date2Millis(date) - date2Millis(date2), i9);
    }

    public static String getString(Date date, long j9, int i9) {
        return getString(date, getDefaultFormat(), j9, i9);
    }

    public static int getValueByCalendarField(Date date, int i9) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i9);
    }

    public static boolean isAm(Date date) {
        return getValueByCalendarField(date, 9) == 0;
    }

    public static boolean isPm(long j9) {
        return !isAm(j9);
    }

    public static String getChineseZodiac(long j9) {
        return getChineseZodiac(millis2Date(j9));
    }

    public static String getFitTimeSpan(long j9, long j10, int i9) {
        return millis2FitTimeSpan(j9 - j10, i9);
    }

    public static String getString(Date date, @NonNull DateFormat dateFormat, long j9, int i9) {
        return millis2String(date2Millis(date) + timeSpan2Millis(j9, i9), dateFormat);
    }

    public static boolean isAm(long j9) {
        return getValueByCalendarField(j9, 9) == 0;
    }

    public static String getChineseZodiac(int i9) {
        return CHINESE_ZODIAC[i9 % 12];
    }

    public static boolean isLeapYear(long j9) {
        return isLeapYear(millis2Date(j9));
    }

    public static int getValueByCalendarField(long j9, int i9) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        return calendar.get(i9);
    }

    public static String getZodiac(long j9) {
        return getZodiac(millis2Date(j9));
    }

    public static boolean isLeapYear(int i9) {
        return (i9 % 4 == 0 && i9 % 100 != 0) || i9 % 400 == 0;
    }

    public static String getZodiac(int i9, int i10) {
        String[] strArr = ZODIAC;
        int i11 = i9 - 1;
        if (i10 < ZODIAC_FLAGS[i11]) {
            i11 = (i9 + 10) % 12;
        }
        return strArr[i11];
    }
}

package com.zykj.paint.util;

import com.google.android.material.timepicker.TimeModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class TimeUtils {
    public static String formatPhotoDate(long j7) {
        return timeFormat(j7, "yyyy-MM-dd");
    }

    public static String formatTime(int i) {
        int i8 = i / 60000;
        int i9 = (i - (60000 * i8)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (i8 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i8)).concat(":"));
        }
        if (i9 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i9)));
        }
        return stringBuffer.toString();
    }

    public static String getNowTimeString() {
        return new SimpleDateFormat("yyyy-MM-dd_hhmmss").format(new Date());
    }

    public static String timeFormat(long j7, String str) {
        return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j7));
    }

    public static String formatPhotoDate(String str) {
        File file = new File(str);
        return file.exists() ? formatPhotoDate(file.lastModified()) : "1970-01-01";
    }
}

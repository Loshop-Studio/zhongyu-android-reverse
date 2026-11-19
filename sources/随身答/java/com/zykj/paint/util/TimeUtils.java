package com.zykj.paint.util;

import com.blankj.utilcode.constant.TimeConstants;
import com.google.android.material.timepicker.TimeModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class TimeUtils {
    public static String formatPhotoDate(long j9) {
        return timeFormat(j9, "yyyy-MM-dd");
    }

    public static String formatTime(int i9) {
        int i10 = i9 / TimeConstants.MIN;
        int i11 = (i9 - (TimeConstants.MIN * i10)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10)) + ":");
        }
        if (i11 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i11)));
        }
        return stringBuffer.toString();
    }

    public static String getNowTimeString() {
        return new SimpleDateFormat("yyyy-MM-dd_hhmmss").format(new Date());
    }

    public static String timeFormat(long j9, String str) {
        return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j9));
    }

    public static String formatPhotoDate(String str) {
        File file = new File(str);
        return file.exists() ? formatPhotoDate(file.lastModified()) : "1970-01-01";
    }
}

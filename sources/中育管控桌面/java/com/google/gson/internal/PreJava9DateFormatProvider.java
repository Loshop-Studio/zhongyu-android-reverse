package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i6) {
        if (i6 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i6 == 1) {
            return "MMMM d, yyyy";
        }
        if (i6 == 2) {
            return "MMM d, yyyy";
        }
        if (i6 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i6);
    }

    private static String getTimePartOfDateTimePattern(int i6) {
        if (i6 == 0 || i6 == 1) {
            return "h:mm:ss a z";
        }
        if (i6 == 2) {
            return "h:mm:ss a";
        }
        if (i6 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i6);
    }

    public static DateFormat getUsDateTimeFormat(int i6, int i7) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i6) + " " + getTimePartOfDateTimePattern(i7), Locale.US);
    }
}

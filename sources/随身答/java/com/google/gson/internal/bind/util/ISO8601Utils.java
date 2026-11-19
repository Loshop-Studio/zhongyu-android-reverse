package com.google.gson.internal.bind.util;

import com.blankj.utilcode.constant.TimeConstants;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i9, char c10) {
        return i9 < str.length() && str.charAt(i9) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i9) {
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                return i9;
            }
            i9++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i9, int i10) {
        String string = Integer.toString(i9);
        for (int length = i10 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00de A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i9, int i10) throws NumberFormatException {
        int i11;
        int i12;
        if (i9 < 0 || i10 > str.length() || i9 > i10) {
            throw new NumberFormatException(str);
        }
        if (i9 < i10) {
            i12 = i9 + 1;
            int iDigit = Character.digit(str.charAt(i9), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = -iDigit;
        } else {
            i11 = 0;
            i12 = i9;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int iDigit2 = Character.digit(str.charAt(i12), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = (i11 * 10) - iDigit2;
            i12 = i13;
        }
        return -i11;
    }

    public static String format(Date date, boolean z9) {
        return format(date, z9, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z9, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z9 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z9) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i9 = offset / TimeConstants.MIN;
            int iAbs = Math.abs(i9 / 60);
            int iAbs2 = Math.abs(i9 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}

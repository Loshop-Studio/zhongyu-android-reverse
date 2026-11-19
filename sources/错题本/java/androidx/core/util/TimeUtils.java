package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i, int i8, boolean z8, int i9) {
        if (i > 99 || (z8 && i9 >= 3)) {
            return i8 + 3;
        }
        if (i > 9 || (z8 && i9 >= 2)) {
            return i8 + 2;
        }
        if (z8 || i > 0) {
            return i8 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j7, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j7, 0));
        }
    }

    private static int formatDurationLocked(long j7, int i) {
        char c;
        int i8;
        int i9;
        int i10;
        int i11;
        long j8 = j7;
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        if (j8 == 0) {
            int i12 = i - 1;
            while (i12 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j8 > 0) {
            c = '+';
        } else {
            j8 = -j8;
            c = '-';
        }
        int i13 = (int) (j8 % 1000);
        int iFloor = (int) Math.floor(j8 / 1000);
        if (iFloor > SECONDS_PER_DAY) {
            i8 = iFloor / SECONDS_PER_DAY;
            iFloor -= SECONDS_PER_DAY * i8;
        } else {
            i8 = 0;
        }
        if (iFloor > SECONDS_PER_HOUR) {
            i9 = iFloor / SECONDS_PER_HOUR;
            iFloor -= i9 * SECONDS_PER_HOUR;
        } else {
            i9 = 0;
        }
        if (iFloor > SECONDS_PER_MINUTE) {
            int i14 = iFloor / SECONDS_PER_MINUTE;
            iFloor -= i14 * SECONDS_PER_MINUTE;
            i10 = i14;
        } else {
            i10 = 0;
        }
        if (i != 0) {
            int iAccumField = accumField(i8, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i9, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i10, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(iFloor, 1, iAccumField3 > 0, 2);
            i11 = 0;
            for (int iAccumField5 = accumField(i13, 2, true, iAccumField4 > 0 ? 3 : 0) + 1 + iAccumField4; iAccumField5 < i; iAccumField5++) {
                cArr[i11] = ' ';
                i11++;
            }
        } else {
            i11 = 0;
        }
        cArr[i11] = c;
        int i15 = i11 + 1;
        boolean z8 = i != 0;
        int iPrintField = printField(cArr, i8, 'd', i15, false, 0);
        int iPrintField2 = printField(cArr, i9, 'h', iPrintField, iPrintField != i15, z8 ? 2 : 0);
        int iPrintField3 = printField(cArr, i10, 'm', iPrintField2, iPrintField2 != i15, z8 ? 2 : 0);
        int iPrintField4 = printField(cArr, iFloor, 's', iPrintField3, iPrintField3 != i15, z8 ? 2 : 0);
        int iPrintField5 = printField(cArr, i13, 'm', iPrintField4, true, (!z8 || iPrintField4 == i15) ? 0 : 3);
        cArr[iPrintField5] = 's';
        return iPrintField5 + 1;
    }

    private static int printField(char[] cArr, int i, char c, int i8, boolean z8, int i9) {
        int i10;
        if (!z8 && i <= 0) {
            return i8;
        }
        if ((!z8 || i9 < 3) && i <= 99) {
            i10 = i8;
        } else {
            int i11 = i / 100;
            cArr[i8] = (char) (i11 + 48);
            i10 = i8 + 1;
            i -= i11 * 100;
        }
        if ((z8 && i9 >= 2) || i > 9 || i8 != i10) {
            int i12 = i / 10;
            cArr[i10] = (char) (i12 + 48);
            i10++;
            i -= i12 * 10;
        }
        cArr[i10] = (char) (i + 48);
        cArr[i10 + 1] = c;
        return i10 + 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j7, PrintWriter printWriter, int i) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j7, i)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j7, PrintWriter printWriter) {
        formatDuration(j7, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j7, long j8, PrintWriter printWriter) {
        if (j7 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j7 - j8, printWriter, 0);
        }
    }
}

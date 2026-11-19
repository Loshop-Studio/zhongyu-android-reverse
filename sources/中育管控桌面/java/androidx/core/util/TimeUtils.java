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

    private static int accumField(int i6, int i7, boolean z6, int i8) {
        if (i6 > 99 || (z6 && i8 >= 3)) {
            return i7 + 3;
        }
        if (i6 > 9 || (z6 && i8 >= 2)) {
            return i7 + 2;
        }
        if (z6 || i6 > 0) {
            return i7 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j6, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j6, 0));
        }
    }

    private static int formatDurationLocked(long j6, int i6) {
        char c7;
        int i7;
        int i8;
        int i9;
        int i10;
        long j7 = j6;
        if (sFormatStr.length < i6) {
            sFormatStr = new char[i6];
        }
        char[] cArr = sFormatStr;
        if (j7 == 0) {
            int i11 = i6 - 1;
            while (i11 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j7 > 0) {
            c7 = '+';
        } else {
            j7 = -j7;
            c7 = '-';
        }
        int i12 = (int) (j7 % 1000);
        int iFloor = (int) Math.floor(j7 / 1000);
        if (iFloor > SECONDS_PER_DAY) {
            i7 = iFloor / SECONDS_PER_DAY;
            iFloor -= SECONDS_PER_DAY * i7;
        } else {
            i7 = 0;
        }
        if (iFloor > SECONDS_PER_HOUR) {
            i8 = iFloor / SECONDS_PER_HOUR;
            iFloor -= i8 * SECONDS_PER_HOUR;
        } else {
            i8 = 0;
        }
        if (iFloor > 60) {
            int i13 = iFloor / 60;
            iFloor -= i13 * 60;
            i9 = i13;
        } else {
            i9 = 0;
        }
        if (i6 != 0) {
            int iAccumField = accumField(i7, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i8, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i9, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(iFloor, 1, iAccumField3 > 0, 2);
            i10 = 0;
            for (int iAccumField5 = iAccumField4 + accumField(i12, 2, true, iAccumField4 > 0 ? 3 : 0) + 1; iAccumField5 < i6; iAccumField5++) {
                cArr[i10] = ' ';
                i10++;
            }
        } else {
            i10 = 0;
        }
        cArr[i10] = c7;
        int i14 = i10 + 1;
        boolean z6 = i6 != 0;
        int iPrintField = printField(cArr, i7, 'd', i14, false, 0);
        int iPrintField2 = printField(cArr, i8, 'h', iPrintField, iPrintField != i14, z6 ? 2 : 0);
        int iPrintField3 = printField(cArr, i9, 'm', iPrintField2, iPrintField2 != i14, z6 ? 2 : 0);
        int iPrintField4 = printField(cArr, iFloor, 's', iPrintField3, iPrintField3 != i14, z6 ? 2 : 0);
        int iPrintField5 = printField(cArr, i12, 'm', iPrintField4, true, (!z6 || iPrintField4 == i14) ? 0 : 3);
        cArr[iPrintField5] = 's';
        return iPrintField5 + 1;
    }

    private static int printField(char[] cArr, int i6, char c7, int i7, boolean z6, int i8) {
        int i9;
        if (!z6 && i6 <= 0) {
            return i7;
        }
        if ((!z6 || i8 < 3) && i6 <= 99) {
            i9 = i7;
        } else {
            int i10 = i6 / 100;
            cArr[i7] = (char) (i10 + 48);
            i9 = i7 + 1;
            i6 -= i10 * 100;
        }
        if ((z6 && i8 >= 2) || i6 > 9 || i7 != i9) {
            int i11 = i6 / 10;
            cArr[i9] = (char) (i11 + 48);
            i9++;
            i6 -= i11 * 10;
        }
        cArr[i9] = (char) (i6 + 48);
        cArr[i9 + 1] = c7;
        return i9 + 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j6, PrintWriter printWriter, int i6) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j6, i6)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j6, PrintWriter printWriter) {
        formatDuration(j6, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j6, long j7, PrintWriter printWriter) {
        if (j6 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j6 - j7, printWriter, 0);
        }
    }
}

package androidx.camera.core;

import android.os.Build;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    /* renamed from: d */
    public static void m479d(@NonNull String str, @NonNull String str2) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    /* renamed from: e */
    public static void m481e(@NonNull String str, @NonNull String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2);
        }
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    /* renamed from: i */
    public static void m483i(@NonNull String str, @NonNull String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2);
        }
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(@NonNull String str, int i10) {
        return sMinLogLevel <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean isVerboseEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(@IntRange(from = 3, m244to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i10) {
        sMinLogLevel = i10;
    }

    @NonNull
    private static String truncateTag(@NonNull String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: w */
    public static void m485w(@NonNull String str, @NonNull String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2);
        }
    }

    /* renamed from: d */
    public static void m480d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    /* renamed from: e */
    public static void m482e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2, th);
        }
    }

    /* renamed from: i */
    public static void m484i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2, th);
        }
    }

    /* renamed from: w */
    public static void m486w(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2, th);
        }
    }
}

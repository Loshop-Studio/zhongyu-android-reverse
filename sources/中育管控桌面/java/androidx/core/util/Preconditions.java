package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f6, String str) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f6)) {
            return f6;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i6, int i7, int i8, String str) {
        if (i6 < i7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        if (i6 <= i8) {
            return i6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i6, String str) {
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i6, int i7) {
        if ((i6 & i7) == i6) {
            return i6;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i6) + ", but only 0x" + Integer.toHexString(i7) + " are allowed");
    }

    public static <T> T checkNotNull(T t6) {
        t6.getClass();
        return t6;
    }

    public static void checkState(boolean z6, String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t6) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException();
        }
        return t6;
    }

    public static void checkArgument(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i6) {
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z6) {
        checkState(z6, null);
    }

    public static void checkArgument(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t6, Object obj) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t6;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t6, String str, Object... objArr) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t6;
    }

    public static long checkArgumentInRange(long j6, long j7, long j8, String str) {
        if (j6 < j7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j7), Long.valueOf(j8)));
        }
        if (j6 <= j8) {
            return j6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j7), Long.valueOf(j8)));
    }

    public static float checkArgumentInRange(float f6, float f7, float f8, String str) {
        if (f6 < f7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f7), Float.valueOf(f8)));
        }
        if (f6 <= f8) {
            return f6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f7), Float.valueOf(f8)));
    }

    public static double checkArgumentInRange(double d6, double d7, double d8, String str) {
        if (d6 < d7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d7), Double.valueOf(d8)));
        }
        if (d6 <= d8) {
            return d6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d7), Double.valueOf(d8)));
    }
}

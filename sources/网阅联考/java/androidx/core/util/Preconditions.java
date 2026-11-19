package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f4, @NonNull String str) {
        if (Float.isNaN(f4)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f4)) {
            return f4;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i4, int i5, int i6, @NonNull String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i4 <= i6) {
            return i4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i4, @Nullable String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t3) {
        t3.getClass();
        return t3;
    }

    public static void checkState(boolean z3, @Nullable String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t3) {
        if (TextUtils.isEmpty(t3)) {
            throw new IllegalArgumentException();
        }
        return t3;
    }

    public static void checkArgument(boolean z3, @NonNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t3, @NonNull Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z3) {
        checkState(z3, null);
    }

    public static void checkArgument(boolean z3, @NonNull String str, @NonNull Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t3, @NonNull Object obj) {
        if (TextUtils.isEmpty(t3)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t3;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t3, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t3)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t3;
    }

    public static long checkArgumentInRange(long j4, long j5, long j6, @NonNull String str) {
        if (j4 < j5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j5), Long.valueOf(j6)));
        }
        if (j4 <= j6) {
            return j4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j5), Long.valueOf(j6)));
    }

    public static float checkArgumentInRange(float f4, float f5, float f6, @NonNull String str) {
        if (f4 < f5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f5), Float.valueOf(f6)));
        }
        if (f4 <= f6) {
            return f4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f5), Float.valueOf(f6)));
    }

    public static double checkArgumentInRange(double d4, double d5, double d6, @NonNull String str) {
        if (d4 < d5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d5), Double.valueOf(d6)));
        }
        if (d4 <= d6) {
            return d4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d5), Double.valueOf(d6)));
    }
}

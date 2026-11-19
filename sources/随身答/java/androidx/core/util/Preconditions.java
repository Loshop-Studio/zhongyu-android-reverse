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

    public static void checkArgument(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f10)) {
            return f10;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i9, int i10, int i11, String str) {
        if (i9 < i10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i9 <= i11) {
            return i9;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i9, String str) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i9, int i10) {
        if ((i9 & i10) == i9) {
            return i9;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(i10) + " are allowed");
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static void checkState(boolean z9, String str) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t9) {
        if (TextUtils.isEmpty(t9)) {
            throw new IllegalArgumentException();
        }
        return t9;
    }

    public static void checkArgument(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i9) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t9, Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z9) {
        checkState(z9, null);
    }

    public static void checkArgument(boolean z9, String str, Object... objArr) {
        if (!z9) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t9, Object obj) {
        if (TextUtils.isEmpty(t9)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t9;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t9, String str, Object... objArr) {
        if (TextUtils.isEmpty(t9)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t9;
    }

    public static long checkArgumentInRange(long j9, long j10, long j11, String str) {
        if (j9 < j10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
        if (j9 <= j11) {
            return j9;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    public static float checkArgumentInRange(float f10, float f11, float f12, String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static double checkArgumentInRange(double d10, double d11, double d12, String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
        if (d10 <= d12) {
            return d10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
    }
}

package androidx.core.util;

import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f, String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(AbstractC0037f.m74C(str, " must not be NaN"));
        }
        if (Float.isInfinite(f)) {
            throw new IllegalArgumentException(AbstractC0037f.m74C(str, " must not be infinite"));
        }
        return f;
    }

    public static int checkArgumentInRange(int i, int i8, int i9, String str) {
        if (i < i8) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too low)");
        }
        if (i <= i9) {
            return i;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too high)");
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public static int checkArgumentNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i, int i8) {
        if ((i & i8) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i8) + " are allowed");
    }

    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static void checkState(boolean z8, String str) {
        if (!z8) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException();
        }
        return t8;
    }

    public static void checkArgument(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z8) {
        checkState(z8, null);
    }

    public static void checkArgument(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8, Object obj) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t8;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8, String str, Object... objArr) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t8;
    }

    public static long checkArgumentInRange(long j7, long j8, long j9, String str) {
        if (j7 < j8) {
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is out of range of [");
            sb.append(j8);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0037f.m83h(j9, "] (too low)", sb));
        }
        if (j7 <= j9) {
            return j7;
        }
        Locale locale2 = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" is out of range of [");
        sb2.append(j8);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0037f.m83h(j9, "] (too high)", sb2));
    }

    public static float checkArgumentInRange(float f, float f7, float f8, String str) {
        if (f < f7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f7), Float.valueOf(f8)));
        }
        if (f <= f8) {
            return f;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f7), Float.valueOf(f8)));
    }

    public static double checkArgumentInRange(double d9, double d10, double d11, String str) {
        if (d9 < d10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d10), Double.valueOf(d11)));
        }
        if (d9 <= d11) {
            return d9;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d10), Double.valueOf(d11)));
    }
}

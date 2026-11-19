package p011b0;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

/* renamed from: b0.h */
/* loaded from: classes.dex */
public final class C1025h {
    /* renamed from: a */
    public static void m4777a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m4778b(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m4779c(int i4, int i5, int i6, String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i4 <= i6) {
            return i4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    /* renamed from: d */
    public static int m4780d(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m4781e(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    /* renamed from: f */
    public static <T> T m4782f(T t3) {
        Objects.requireNonNull(t3);
        return t3;
    }

    /* renamed from: g */
    public static <T> T m4783g(T t3, Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static <T extends CharSequence> T m4784h(T t3, Object obj) {
        if (TextUtils.isEmpty(t3)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t3;
    }
}

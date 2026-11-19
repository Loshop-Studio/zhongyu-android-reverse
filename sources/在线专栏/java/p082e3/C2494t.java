package p082e3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.t */
/* loaded from: classes.dex */
public class C2494t extends C2493s {
    @Nullable
    /* renamed from: i */
    public static Integer m8334i(@NotNull String str) {
        C2769l.m9241e(str, "<this>");
        return m8335j(str, 10);
    }

    @Nullable
    /* renamed from: j */
    public static final Integer m8335j(@NotNull String str, int i4) {
        boolean z3;
        int i5;
        C2769l.m9241e(str, "<this>");
        C2476b.m8260a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char cCharAt = str.charAt(0);
        int i7 = -2147483647;
        int i8 = 1;
        if (C2769l.m9243g(cCharAt, 48) >= 0) {
            z3 = false;
            i8 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i7 = Integer.MIN_VALUE;
                z3 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z3 = false;
            }
        }
        int i9 = -59652323;
        while (i8 < length) {
            int i10 = i8 + 1;
            int iM8261b = C2476b.m8261b(str.charAt(i8), i4);
            if (iM8261b < 0) {
                return null;
            }
            if ((i6 < i9 && (i9 != -59652323 || i6 < (i9 = i7 / i4))) || (i5 = i6 * i4) < i7 + iM8261b) {
                return null;
            }
            i6 = i5 - iM8261b;
            i8 = i10;
        }
        return z3 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    @Nullable
    /* renamed from: k */
    public static Long m8336k(@NotNull String str) {
        C2769l.m9241e(str, "<this>");
        return m8337l(str, 10);
    }

    @Nullable
    /* renamed from: l */
    public static final Long m8337l(@NotNull String str, int i4) {
        C2769l.m9241e(str, "<this>");
        C2476b.m8260a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        boolean z3 = true;
        if (C2769l.m9243g(cCharAt, 48) >= 0) {
            z3 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j4 = Long.MIN_VALUE;
                i5 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i5 = 1;
                z3 = false;
            }
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i5 < length) {
            int i6 = i5 + 1;
            int iM8261b = C2476b.m8261b(str.charAt(i5), i4);
            if (iM8261b < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 == j5) {
                    j7 = j4 / i4;
                    if (j6 < j7) {
                    }
                }
                return null;
            }
            long j8 = j6 * i4;
            long j9 = iM8261b;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i5 = i6;
            j5 = -256204778801521550L;
        }
        return z3 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}

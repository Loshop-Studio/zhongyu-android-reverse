package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import p082e3.C2494t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C2808w {
    /* renamed from: a */
    public static final int m9352a(@NotNull String str, int i4, int i5, int i6) {
        return (int) C2806u.m9345c(str, i4, i5, i6);
    }

    /* renamed from: b */
    public static final long m9353b(@NotNull String str, long j4, long j5, long j6) {
        String strM9346d = C2806u.m9346d(str);
        if (strM9346d == null) {
            return j4;
        }
        Long lM8336k = C2494t.m8336k(strM9346d);
        if (lM8336k == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM9346d + '\'').toString());
        }
        long jLongValue = lM8336k.longValue();
        boolean z3 = false;
        if (j5 <= jLongValue && jLongValue <= j6) {
            z3 = true;
        }
        if (z3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m9354c(@NotNull String str, boolean z3) {
        String strM9346d = C2806u.m9346d(str);
        return strM9346d == null ? z3 : Boolean.parseBoolean(strM9346d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m9355d(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return C2806u.m9344b(str, i4, i5, i6);
    }

    /* renamed from: e */
    public static /* synthetic */ long m9356e(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return C2806u.m9345c(str, j4, j7, j6);
    }
}

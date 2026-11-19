package p151s2;

/* renamed from: s2.c */
/* loaded from: classes.dex */
public final class C3381c {
    /* renamed from: a */
    private static final int m10294a(int i4, int i5, int i6) {
        return m10296c(m10296c(i4, i6) - m10296c(i5, i6), i6);
    }

    /* renamed from: b */
    public static final int m10295b(int i4, int i5, int i6) {
        if (i6 > 0) {
            return i4 >= i5 ? i5 : i5 - m10294a(i5, i4, i6);
        }
        if (i6 < 0) {
            return i4 <= i5 ? i5 : i5 + m10294a(i4, i5, -i6);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m10296c(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 >= 0 ? i6 : i6 + i5;
    }
}

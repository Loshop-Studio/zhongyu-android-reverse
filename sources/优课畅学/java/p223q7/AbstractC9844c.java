package p223q7;

/* renamed from: q7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9844c {
    /* renamed from: a */
    public static final int m18366a(int i10, int i11, int i12) {
        return m18368c(m18368c(i10, i12) - m18368c(i11, i12), i12);
    }

    /* renamed from: b */
    public static final int m18367b(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - m18366a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                return i11 + m18366a(i10, i11, -i12);
            }
        }
        return i11;
    }

    /* renamed from: c */
    public static final int m18368c(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }
}

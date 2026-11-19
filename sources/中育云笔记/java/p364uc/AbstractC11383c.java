package p364uc;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: uc.c */
/* loaded from: classes6.dex */
public abstract class AbstractC11383c extends AbstractC11382b {
    /* renamed from: h */
    public static float m25334h(float f10, float... other) {
        AbstractC9979u.m20294g(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    /* renamed from: i */
    public static int m25335i(int i10, int... other) {
        AbstractC9979u.m20294g(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    /* renamed from: j */
    public static Comparable m25336j(Comparable a10, Comparable b10) {
        AbstractC9979u.m20294g(a10, "a");
        AbstractC9979u.m20294g(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    /* renamed from: k */
    public static float m25337k(float f10, float... other) {
        AbstractC9979u.m20294g(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}

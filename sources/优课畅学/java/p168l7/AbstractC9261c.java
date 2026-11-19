package p168l7;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: l7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9261c extends AbstractC9260b {
    /* renamed from: g */
    public static float m16980g(float f10, float... other) {
        AbstractC9133u.m16133g(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    /* renamed from: h */
    public static int m16981h(int i10, int... other) {
        AbstractC9133u.m16133g(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    /* renamed from: i */
    public static Comparable m16982i(Comparable a10, Comparable b10) {
        AbstractC9133u.m16133g(a10, "a");
        AbstractC9133u.m16133g(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    /* renamed from: j */
    public static float m16983j(float f10, float... other) {
        AbstractC9133u.m16133g(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}

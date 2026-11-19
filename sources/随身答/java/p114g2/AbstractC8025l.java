package p114g2;

/* renamed from: g2.l */
/* loaded from: classes4.dex */
public abstract class AbstractC8025l {
    /* renamed from: a */
    public static final byte m12675a(byte b10, int i9, boolean z9) {
        return (byte) m12676b(b10, i9, z9);
    }

    /* renamed from: b */
    public static final int m12676b(int i9, int i10, boolean z9) {
        return z9 ? i9 | (1 << i10) : m12679e(i9, i10);
    }

    /* renamed from: c */
    public static final boolean m12677c(byte b10, int i9) {
        return m12678d(b10, i9);
    }

    /* renamed from: d */
    public static final boolean m12678d(int i9, int i10) {
        return (i9 & (1 << i10)) != 0;
    }

    /* renamed from: e */
    public static final int m12679e(int i9, int i10) {
        return i9 & (~(1 << i10));
    }
}

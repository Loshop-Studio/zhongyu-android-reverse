package p110n;

import coil3.size.Scale;
import coil3.util.AbstractC4594c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;
import p023c0.AbstractC4470o;
import p194z.AbstractC7924f;
import p194z.C7923e;
import p194z.InterfaceC7919a;

/* renamed from: n.h */
/* loaded from: classes3.dex */
public final class C7422h {

    /* renamed from: a */
    public static final C7422h f9477a = new C7422h();

    /* renamed from: n.h$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9478a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f1919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f1920b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9478a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m8455a(int i6, int i7, int i8, int i9, Scale scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i6 / i8);
        int iHighestOneBit2 = Integer.highestOneBit(i7 / i9);
        int i10 = a.f9478a[scale.ordinal()];
        if (i10 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.coerceAtLeast(iMin, 1);
    }

    /* renamed from: b */
    public static final long m8456b(int i6, int i7, C7923e c7923e, Scale scale, C7923e c7923e2) {
        if (!AbstractC7924f.m9722b(c7923e)) {
            C7422h c7422h = f9477a;
            int iM8459e = c7422h.m8459e(c7923e.m9720b(), scale);
            i7 = c7422h.m8459e(c7923e.m9719a(), scale);
            i6 = iM8459e;
        }
        if ((c7923e2.m9720b() instanceof InterfaceC7919a.a) && !AbstractC4594c.m2046n(i6)) {
            i6 = RangesKt.coerceAtMost(i6, ((InterfaceC7919a.a) c7923e2.m9720b()).m9716f());
        }
        if ((c7923e2.m9719a() instanceof InterfaceC7919a.a) && !AbstractC4594c.m2046n(i7)) {
            i7 = RangesKt.coerceAtMost(i7, ((InterfaceC7919a.a) c7923e2.m9719a()).m9716f());
        }
        return AbstractC4470o.m1549a(i6, i7);
    }

    /* renamed from: c */
    public static final double m8457c(double d6, double d7, double d8, double d9, Scale scale) {
        double d10 = d8 / d6;
        double d11 = d9 / d7;
        int i6 = a.f9478a[scale.ordinal()];
        if (i6 == 1) {
            return Math.max(d10, d11);
        }
        if (i6 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final double m8458d(int i6, int i7, int i8, int i9, Scale scale) {
        double d6 = i8 / i6;
        double d7 = i9 / i7;
        int i10 = a.f9478a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d6, d7);
        }
        if (i10 == 2) {
            return Math.min(d6, d7);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final int m8459e(InterfaceC7919a interfaceC7919a, Scale scale) {
        if (interfaceC7919a instanceof InterfaceC7919a.a) {
            return ((InterfaceC7919a.a) interfaceC7919a).m9716f();
        }
        int i6 = a.f9478a[scale.ordinal()];
        if (i6 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i6 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

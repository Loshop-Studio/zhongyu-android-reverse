package p183n;

import coil3.size.Scale;
import coil3.util.AbstractC5348c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;
import p090e0.AbstractC7816n;
import p307z.AbstractC9976f;
import p307z.C9975e;
import p307z.InterfaceC9971a;

/* renamed from: n.h */
/* loaded from: classes3.dex */
public final class C9060h {

    /* renamed from: a */
    public static final C9060h f15240a = new C9060h();

    /* renamed from: n.h$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15241a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3123a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3124b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15241a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m14524a(int i9, int i10, int i11, int i12, Scale scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i9 / i11);
        int iHighestOneBit2 = Integer.highestOneBit(i10 / i12);
        int i13 = a.f15241a[scale.ordinal()];
        if (i13 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.coerceAtLeast(iMin, 1);
    }

    /* renamed from: b */
    public static final long m14525b(int i9, int i10, C9975e c9975e, Scale scale, C9975e c9975e2) {
        if (!AbstractC9976f.m17261b(c9975e)) {
            C9060h c9060h = f15240a;
            int iM14529f = c9060h.m14529f(c9975e.m17259b(), scale);
            i10 = c9060h.m14529f(c9975e.m17258a(), scale);
            i9 = iM14529f;
        }
        if ((c9975e2.m17259b() instanceof InterfaceC9971a.a) && !AbstractC5348c.m2937n(i9)) {
            i9 = RangesKt.coerceAtMost(i9, ((InterfaceC9971a.a) c9975e2.m17259b()).m17255f());
        }
        if ((c9975e2.m17258a() instanceof InterfaceC9971a.a) && !AbstractC5348c.m2937n(i10)) {
            i10 = RangesKt.coerceAtMost(i10, ((InterfaceC9971a.a) c9975e2.m17258a()).m17255f());
        }
        return AbstractC7816n.m12199a(i9, i10);
    }

    /* renamed from: c */
    public static final double m14526c(double d10, double d11, double d12, double d13, Scale scale) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i9 = a.f15241a[scale.ordinal()];
        if (i9 == 1) {
            return Math.max(d14, d15);
        }
        if (i9 == 2) {
            return Math.min(d14, d15);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final double m14527d(int i9, int i10, int i11, int i12, Scale scale) {
        double d10 = i11 / i9;
        double d11 = i12 / i10;
        int i13 = a.f15241a[scale.ordinal()];
        if (i13 == 1) {
            return Math.max(d10, d11);
        }
        if (i13 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public static final float m14528e(float f10, float f11, float f12, float f13, Scale scale) {
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        int i9 = a.f15241a[scale.ordinal()];
        if (i9 == 1) {
            return Math.max(f14, f15);
        }
        if (i9 == 2) {
            return Math.min(f14, f15);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public final int m14529f(InterfaceC9971a interfaceC9971a, Scale scale) {
        if (interfaceC9971a instanceof InterfaceC9971a.a) {
            return ((InterfaceC9971a.a) interfaceC9971a).m17255f();
        }
        int i9 = a.f15241a[scale.ordinal()];
        if (i9 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i9 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

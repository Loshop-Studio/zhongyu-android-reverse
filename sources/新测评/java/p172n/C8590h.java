package p172n;

import coil3.size.Scale;
import coil3.util.AbstractC5213c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;
import p030c0.AbstractC5090o;
import p300z.AbstractC9959f;
import p300z.C9958e;
import p300z.InterfaceC9954a;

/* renamed from: n.h */
/* loaded from: classes3.dex */
public final class C8590h {

    /* renamed from: a */
    public static final C8590h f14224a = new C8590h();

    /* renamed from: n.h$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14225a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3235a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3236b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14225a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m14134a(int i10, int i11, int i12, int i13, Scale scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f14225a[scale.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.coerceAtLeast(iMin, 1);
    }

    /* renamed from: b */
    public static final long m14135b(int i10, int i11, C9958e c9958e, Scale scale, C9958e c9958e2) {
        if (!AbstractC9959f.m16774b(c9958e)) {
            C8590h c8590h = f14224a;
            int iM14138e = c8590h.m14138e(c9958e.m16772b(), scale);
            i11 = c8590h.m14138e(c9958e.m16771a(), scale);
            i10 = iM14138e;
        }
        if ((c9958e2.m16772b() instanceof InterfaceC9954a.a) && !AbstractC5213c.m3220n(i10)) {
            i10 = RangesKt.coerceAtMost(i10, ((InterfaceC9954a.a) c9958e2.m16772b()).m16768f());
        }
        if ((c9958e2.m16771a() instanceof InterfaceC9954a.a) && !AbstractC5213c.m3220n(i11)) {
            i11 = RangesKt.coerceAtMost(i11, ((InterfaceC9954a.a) c9958e2.m16771a()).m16768f());
        }
        return AbstractC5090o.m2691a(i10, i11);
    }

    /* renamed from: c */
    public static final double m14136c(double d10, double d11, double d12, double d13, Scale scale) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f14225a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final double m14137d(int i10, int i11, int i12, int i13, Scale scale) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int i14 = a.f14225a[scale.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final int m14138e(InterfaceC9954a interfaceC9954a, Scale scale) {
        if (interfaceC9954a instanceof InterfaceC9954a.a) {
            return ((InterfaceC9954a.a) interfaceC9954a).m16768f();
        }
        int i10 = a.f14225a[scale.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

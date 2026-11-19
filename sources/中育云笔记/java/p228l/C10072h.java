package p228l;

import coil3.size.Scale;
import coil3.util.AbstractC5490c;
import kotlin.NoWhenBranchMatchedException;
import p001a0.AbstractC0018o;
import p265nd.AbstractC10410o;
import p396x.AbstractC11750f;
import p396x.C11749e;
import p396x.InterfaceC11745a;

/* renamed from: l.h */
/* loaded from: classes3.dex */
public final class C10072h {

    /* renamed from: a */
    public static final C10072h f24082a = new C10072h();

    /* renamed from: l.h$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24083a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3910c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3911d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24083a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m21067a(int i10, int i11, int i12, int i13, Scale scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f24083a[scale.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return AbstractC10410o.m21752e(iMin, 1);
    }

    /* renamed from: b */
    public static final long m21068b(int i10, int i11, C11749e c11749e, Scale scale, C11749e c11749e2) {
        if (!AbstractC11750f.m26002b(c11749e)) {
            C10072h c10072h = f24082a;
            int iM21071e = c10072h.m21071e(c11749e.m26000b(), scale);
            i11 = c10072h.m21071e(c11749e.m25999a(), scale);
            i10 = iM21071e;
        }
        if ((c11749e2.m26000b() instanceof InterfaceC11745a.a) && !AbstractC5490c.m3314n(i10)) {
            i10 = AbstractC10410o.m21756i(i10, ((InterfaceC11745a.a) c11749e2.m26000b()).m25995f());
        }
        if ((c11749e2.m25999a() instanceof InterfaceC11745a.a) && !AbstractC5490c.m3314n(i11)) {
            i11 = AbstractC10410o.m21756i(i11, ((InterfaceC11745a.a) c11749e2.m25999a()).m25995f());
        }
        return AbstractC0018o.m32a(i10, i11);
    }

    /* renamed from: c */
    public static final double m21069c(double d10, double d11, double d12, double d13, Scale scale) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f24083a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final double m21070d(int i10, int i11, int i12, int i13, Scale scale) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int i14 = a.f24083a[scale.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final int m21071e(InterfaceC11745a interfaceC11745a, Scale scale) {
        if (interfaceC11745a instanceof InterfaceC11745a.a) {
            return ((InterfaceC11745a.a) interfaceC11745a).m25995f();
        }
        int i10 = a.f24083a[scale.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package p178f;

import java.util.List;
import java.util.RandomAccess;
import p160d.p161e.AbstractC0996b;
import p160d.p162f.p164b.C1010c;

/* renamed from: f.c */
/* loaded from: classes.dex */
public final class C1079c extends AbstractC0996b<C1078b> implements RandomAccess {

    /* renamed from: b */
    public static final a f5652b = new a(null);

    /* renamed from: f.c$a */
    public static final class a {
        public a(C1010c c1010c) {
        }

        /* renamed from: a */
        public final void m2871a(long j, C1077a c1077a, int i, List<? extends C1078b> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C1077a c1077a2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(list.get(i9).mo2865b() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C1078b c1078b = list.get(i2);
            C1078b c1078b2 = list.get(i3 - 1);
            int i10 = -1;
            if (i8 == c1078b.mo2865b()) {
                int iIntValue = list2.get(i2).intValue();
                int i11 = i2 + 1;
                C1078b c1078b3 = list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                c1078b = c1078b3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (c1078b.mo2868e(i8) == c1078b2.mo2868e(i8)) {
                int iMin = Math.min(c1078b.mo2865b(), c1078b2.mo2865b());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && c1078b.mo2868e(i13) == c1078b2.mo2868e(i13); i13++) {
                    i12++;
                }
                long jM2872b = m2872b(c1077a) + j + 2 + i12 + 1;
                c1077a.m2863e(-i12);
                c1077a.m2863e(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    c1077a.m2863e(c1078b.mo2868e(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == list.get(i4).mo2865b())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c1077a.m2863e(list2.get(i4).intValue());
                    return;
                } else {
                    C1077a c1077a3 = new C1077a();
                    c1077a.m2863e(((int) (m2872b(c1077a3) + jM2872b)) * (-1));
                    m2871a(jM2872b, c1077a3, i14, list, i4, i3, list2);
                    c1077a.m2862d(c1077a3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (list.get(i16 - 1).mo2868e(i8) != list.get(i16).mo2868e(i8)) {
                    i15++;
                }
            }
            long jM2872b2 = m2872b(c1077a) + j + 2 + (i15 * 2);
            c1077a.m2863e(i15);
            c1077a.m2863e(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte bMo2868e = list.get(i17).mo2868e(i8);
                if (i17 == i4 || bMo2868e != list.get(i17 - 1).mo2868e(i8)) {
                    c1077a.m2863e(bMo2868e & 255);
                }
            }
            C1077a c1077a4 = new C1077a();
            while (i4 < i3) {
                byte bMo2868e2 = list.get(i4).mo2868e(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bMo2868e2 != list.get(i19).mo2868e(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == list.get(i4).mo2865b()) {
                    c1077a.m2863e(list2.get(i4).intValue());
                    i7 = i6;
                    c1077a2 = c1077a4;
                } else {
                    c1077a.m2863e(((int) (m2872b(c1077a4) + jM2872b2)) * i10);
                    i7 = i6;
                    c1077a2 = c1077a4;
                    m2871a(jM2872b2, c1077a4, i8 + 1, list, i4, i6, list2);
                }
                c1077a4 = c1077a2;
                i4 = i7;
                i10 = -1;
            }
            c1077a.m2862d(c1077a4);
        }

        /* renamed from: b */
        public final long m2872b(C1077a c1077a) {
            return c1077a.f5646c / 4;
        }
    }
}

package p102f9;

import android.text.TextUtils;
import p010a9.C0054e;
import p010a9.C0055f;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10732c;
import p323z8.InterfaceC10742m;

/* renamed from: f9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8485b {
    /* renamed from: a */
    public static C0054e m13871a(AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, C0054e c0054e) {
        if (c0054e == null) {
            c0054e = new C0054e();
        }
        c0054e.m197h((int) Math.ceil(abstractC10732c.f21308o), (int) Math.ceil(abstractC10732c.f21309p), interfaceC10742m.mo129f(), false);
        C0055f c0055f = c0054e.get();
        if (c0055f != null) {
            ((AbstractC10730a) interfaceC10742m).mo137n(abstractC10732c, c0055f.f187a, 0.0f, 0.0f, true);
            if (interfaceC10742m.isHardwareAccelerated()) {
                c0055f.m206e(interfaceC10742m.getWidth(), interfaceC10742m.getHeight(), interfaceC10742m.mo131h(), interfaceC10742m.mo134k());
            }
        }
        return c0054e;
    }

    /* renamed from: b */
    public static boolean m13872b(int i10, int i11, float[] fArr, float[] fArr2) {
        if (i10 != i11) {
            return false;
        }
        return i10 == 1 ? fArr2[0] < fArr[2] : i10 == 6 && fArr2[2] > fArr[0];
    }

    /* renamed from: c */
    public static boolean m13873c(InterfaceC10742m interfaceC10742m, AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2, long j10) {
        float[] fArrMo20049h = abstractC10732c.mo20049h(interfaceC10742m, j10);
        float[] fArrMo20049h2 = abstractC10732c2.mo20049h(interfaceC10742m, j10);
        if (fArrMo20049h == null || fArrMo20049h2 == null) {
            return false;
        }
        return m13872b(abstractC10732c.mo20054m(), abstractC10732c2.mo20054m(), fArrMo20049h, fArrMo20049h2);
    }

    /* renamed from: d */
    public static final int m13874d(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
        CharSequence charSequence;
        if (abstractC10732c == abstractC10732c2) {
            return 0;
        }
        if (abstractC10732c == null) {
            return -1;
        }
        if (abstractC10732c2 == null) {
            return 1;
        }
        long jM20051j = abstractC10732c.m20051j() - abstractC10732c2.m20051j();
        if (jM20051j > 0) {
            return 1;
        }
        if (jM20051j < 0) {
            return -1;
        }
        int iMo20054m = abstractC10732c.mo20054m() - abstractC10732c2.mo20054m();
        if (iMo20054m > 0) {
            return 1;
        }
        if (iMo20054m < 0 || (charSequence = abstractC10732c.f21296c) == null) {
            return -1;
        }
        if (abstractC10732c2.f21296c == null) {
            return 1;
        }
        int iCompareTo = charSequence.toString().compareTo(abstractC10732c2.f21296c.toString());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i10 = abstractC10732c.f21299f - abstractC10732c2.f21299f;
        if (i10 != 0) {
            return i10 < 0 ? -1 : 1;
        }
        int i11 = abstractC10732c.f21311r - abstractC10732c2.f21311r;
        return i11 != 0 ? i11 < 0 ? -1 : 1 : abstractC10732c.hashCode() - abstractC10732c.hashCode();
    }

    /* renamed from: e */
    public static void m13875e(AbstractC10732c abstractC10732c, CharSequence charSequence) {
        abstractC10732c.f21296c = charSequence;
        if (TextUtils.isEmpty(charSequence) || !charSequence.toString().contains("/n")) {
            return;
        }
        String[] strArrSplit = String.valueOf(abstractC10732c.f21296c).split("/n", -1);
        if (strArrSplit.length > 1) {
            abstractC10732c.f21297d = strArrSplit;
        }
    }

    /* renamed from: f */
    public static int m13876f(int i10, int i11) {
        return i10 * i11 * 4;
    }

    /* renamed from: g */
    public static final boolean m13877g(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
        if (abstractC10732c == abstractC10732c2) {
            return false;
        }
        CharSequence charSequence = abstractC10732c.f21296c;
        CharSequence charSequence2 = abstractC10732c2.f21296c;
        if (charSequence == charSequence2) {
            return true;
        }
        return charSequence != null && charSequence.equals(charSequence2);
    }

    /* renamed from: h */
    public static boolean m13878h(InterfaceC10742m interfaceC10742m, AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2, long j10, long j11) {
        int iMo20054m = abstractC10732c.mo20054m();
        if (iMo20054m != abstractC10732c2.mo20054m() || abstractC10732c.m20060s()) {
            return false;
        }
        long jM20043b = abstractC10732c2.m20043b() - abstractC10732c.m20043b();
        if (jM20043b <= 0) {
            return true;
        }
        if (Math.abs(jM20043b) >= j10 || abstractC10732c.m20064w() || abstractC10732c2.m20064w()) {
            return false;
        }
        return iMo20054m == 5 || iMo20054m == 4 || m13873c(interfaceC10742m, abstractC10732c, abstractC10732c2, j11) || m13873c(interfaceC10742m, abstractC10732c, abstractC10732c2, abstractC10732c.m20043b() + abstractC10732c.m20047f());
    }
}

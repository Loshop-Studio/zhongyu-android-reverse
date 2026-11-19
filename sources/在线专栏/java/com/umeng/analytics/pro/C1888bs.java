package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C1879bj;

/* renamed from: com.umeng.analytics.pro.bs */
/* loaded from: classes.dex */
public class C1888bs {

    /* renamed from: a */
    private static int f8522a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m7032a(int i4) {
        f8522a = i4;
    }

    /* renamed from: a */
    public static void m7033a(AbstractC1885bp abstractC1885bp, byte b4) throws C1865aw {
        m7034a(abstractC1885bp, b4, f8522a);
    }

    /* renamed from: a */
    public static void m7034a(AbstractC1885bp abstractC1885bp, byte b4, int i4) throws C1865aw {
        if (i4 > 0) {
            int i5 = 0;
            switch (b4) {
                case 2:
                    abstractC1885bp.mo6997t();
                    return;
                case 3:
                    abstractC1885bp.mo6998u();
                    return;
                case 4:
                    abstractC1885bp.mo7002y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    abstractC1885bp.mo6999v();
                    return;
                case 8:
                    abstractC1885bp.mo7000w();
                    return;
                case 10:
                    abstractC1885bp.mo7001x();
                    return;
                case 11:
                    abstractC1885bp.mo6960A();
                    return;
                case 12:
                    abstractC1885bp.mo6987j();
                    while (true) {
                        byte b5 = abstractC1885bp.mo6989l().f8499b;
                        if (b5 == 0) {
                            abstractC1885bp.mo6988k();
                            return;
                        } else {
                            m7034a(abstractC1885bp, b5, i4 - 1);
                            abstractC1885bp.mo6990m();
                        }
                    }
                case 13:
                    C1882bm c1882bmMo6991n = abstractC1885bp.mo6991n();
                    while (i5 < c1882bmMo6991n.f8505c) {
                        int i6 = i4 - 1;
                        m7034a(abstractC1885bp, c1882bmMo6991n.f8503a, i6);
                        m7034a(abstractC1885bp, c1882bmMo6991n.f8504b, i6);
                        i5++;
                    }
                    abstractC1885bp.mo6992o();
                    return;
                case 14:
                    C1889bt c1889btMo6995r = abstractC1885bp.mo6995r();
                    while (i5 < c1889btMo6995r.f8524b) {
                        m7034a(abstractC1885bp, c1889btMo6995r.f8523a, i4 - 1);
                        i5++;
                    }
                    abstractC1885bp.mo6996s();
                    return;
                case 15:
                    C1881bl c1881blMo6993p = abstractC1885bp.mo6993p();
                    while (i5 < c1881blMo6993p.f8502b) {
                        m7034a(abstractC1885bp, c1881blMo6993p.f8501a, i4 - 1);
                        i5++;
                    }
                    abstractC1885bp.mo6994q();
                    return;
            }
        } else {
            throw new C1865aw("Maximum skip depth exceeded");
        }
    }

    /* renamed from: a */
    public static InterfaceC1887br m7031a(byte[] bArr, InterfaceC1887br interfaceC1887br) {
        if (bArr[0] > 16) {
            return new C1879bj.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? interfaceC1887br : new C1879bj.a();
    }
}

package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3363bj;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.umeng.analytics.pro.bs */
/* loaded from: classes2.dex */
public class C3372bs {

    /* renamed from: a */
    private static int f1930a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m3109a(int i4) {
        f1930a = i4;
    }

    /* renamed from: a */
    public static void m3110a(AbstractC3369bp abstractC3369bp, byte b4) throws C3349aw {
        m3111a(abstractC3369bp, b4, f1930a);
    }

    /* renamed from: a */
    public static void m3111a(AbstractC3369bp abstractC3369bp, byte b4, int i4) throws C3349aw {
        if (i4 > 0) {
            int i5 = 0;
            switch (b4) {
                case 2:
                    abstractC3369bp.mo3074t();
                    return;
                case 3:
                    abstractC3369bp.mo3075u();
                    return;
                case 4:
                    abstractC3369bp.mo3079y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    abstractC3369bp.mo3076v();
                    return;
                case 8:
                    abstractC3369bp.mo3077w();
                    return;
                case 10:
                    abstractC3369bp.mo3078x();
                    return;
                case 11:
                    abstractC3369bp.mo3037A();
                    return;
                case 12:
                    abstractC3369bp.mo3064j();
                    while (true) {
                        byte b5 = abstractC3369bp.mo3066l().f1907b;
                        if (b5 == 0) {
                            abstractC3369bp.mo3065k();
                            return;
                        } else {
                            m3111a(abstractC3369bp, b5, i4 - 1);
                            abstractC3369bp.mo3067m();
                        }
                    }
                case 13:
                    C3366bm c3366bmMo3068n = abstractC3369bp.mo3068n();
                    while (i5 < c3366bmMo3068n.f1913c) {
                        int i6 = i4 - 1;
                        m3111a(abstractC3369bp, c3366bmMo3068n.f1911a, i6);
                        m3111a(abstractC3369bp, c3366bmMo3068n.f1912b, i6);
                        i5++;
                    }
                    abstractC3369bp.mo3069o();
                    return;
                case 14:
                    C3373bt c3373btMo3072r = abstractC3369bp.mo3072r();
                    while (i5 < c3373btMo3072r.f1932b) {
                        m3111a(abstractC3369bp, c3373btMo3072r.f1931a, i4 - 1);
                        i5++;
                    }
                    abstractC3369bp.mo3073s();
                    return;
                case 15:
                    C3365bl c3365blMo3070p = abstractC3369bp.mo3070p();
                    while (i5 < c3365blMo3070p.f1910b) {
                        m3111a(abstractC3369bp, c3365blMo3070p.f1909a, i4 - 1);
                        i5++;
                    }
                    abstractC3369bp.mo3071q();
                    return;
            }
        } else {
            throw new C3349aw("Maximum skip depth exceeded");
        }
    }

    /* renamed from: a */
    public static InterfaceC3371br m3108a(byte[] bArr, InterfaceC3371br interfaceC3371br) {
        if (bArr[0] > 16) {
            return new C3363bj.a();
        }
        return (bArr.length <= 1 || (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) ? interfaceC3371br : new C3363bj.a();
    }
}

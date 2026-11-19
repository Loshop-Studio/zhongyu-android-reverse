package com.umeng.analytics.pro;

import p114g2.AbstractC8039s;
import p114g2.C8035q;
import p114g2.C8037r;
import p114g2.C8041t;

/* renamed from: com.umeng.analytics.pro.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6767c {

    /* renamed from: a */
    public static int f6655a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m6129a(AbstractC8039s abstractC8039s, byte b10) {
        m6130b(abstractC8039s, b10, f6655a);
    }

    /* renamed from: b */
    public static void m6130b(AbstractC8039s abstractC8039s, byte b10, int i9) throws C6756aw {
        if (i9 <= 0) {
            throw new C6756aw("Maximum skip depth exceeded");
        }
        int i10 = 0;
        switch (b10) {
            case 2:
                abstractC8039s.mo6070A();
                return;
            case 3:
                abstractC8039s.mo6071B();
                return;
            case 4:
                abstractC8039s.mo6075F();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                abstractC8039s.mo6072C();
                return;
            case 8:
                abstractC8039s.mo6073D();
                return;
            case 10:
                abstractC8039s.mo6074E();
                return;
            case 11:
                abstractC8039s.mo6083a();
                return;
            case 12:
                abstractC8039s.mo6097q();
                while (true) {
                    byte b11 = abstractC8039s.mo6099s().f13622b;
                    if (b11 == 0) {
                        abstractC8039s.mo6098r();
                        return;
                    } else {
                        m6130b(abstractC8039s, b11, i9 - 1);
                        abstractC8039s.mo6100t();
                    }
                }
            case 13:
                C8037r c8037rMo6101u = abstractC8039s.mo6101u();
                while (i10 < c8037rMo6101u.f13628c) {
                    int i11 = i9 - 1;
                    m6130b(abstractC8039s, c8037rMo6101u.f13626a, i11);
                    m6130b(abstractC8039s, c8037rMo6101u.f13627b, i11);
                    i10++;
                }
                abstractC8039s.mo6102v();
                return;
            case 14:
                C8041t c8041tMo6105y = abstractC8039s.mo6105y();
                while (i10 < c8041tMo6105y.f13632b) {
                    m6130b(abstractC8039s, c8041tMo6105y.f13631a, i9 - 1);
                    i10++;
                }
                abstractC8039s.mo6106z();
                return;
            case 15:
                C8035q c8035qMo6103w = abstractC8039s.mo6103w();
                while (i10 < c8035qMo6103w.f13625b) {
                    m6130b(abstractC8039s, c8035qMo6103w.f13624a, i9 - 1);
                    i10++;
                }
                abstractC8039s.mo6104x();
                return;
        }
    }
}

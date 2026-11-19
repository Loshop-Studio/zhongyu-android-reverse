package p121n;

import p117m.C2852d;
import p121n.C2869e;

/* renamed from: n.k */
/* loaded from: classes.dex */
public class C2875k {

    /* renamed from: a */
    static boolean[] f11272a = new boolean[3];

    /* renamed from: a */
    static void m9862a(C2870f c2870f, C2852d c2852d, C2869e c2869e) {
        c2869e.f11156j = -1;
        c2869e.f11158k = -1;
        C2869e.b bVar = c2870f.f11126O[0];
        C2869e.b bVar2 = C2869e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c2869e.f11126O[0] == C2869e.b.MATCH_PARENT) {
            int i4 = c2869e.f11113D.f11092e;
            int iM9718Q = c2870f.m9718Q() - c2869e.f11117F.f11092e;
            C2868d c2868d = c2869e.f11113D;
            c2868d.f11094g = c2852d.m9619q(c2868d);
            C2868d c2868d2 = c2869e.f11117F;
            c2868d2.f11094g = c2852d.m9619q(c2868d2);
            c2852d.m9610f(c2869e.f11113D.f11094g, i4);
            c2852d.m9610f(c2869e.f11117F.f11094g, iM9718Q);
            c2869e.f11156j = 2;
            c2869e.m9742l0(i4, iM9718Q);
        }
        if (c2870f.f11126O[1] == bVar2 || c2869e.f11126O[1] != C2869e.b.MATCH_PARENT) {
            return;
        }
        int i5 = c2869e.f11115E.f11092e;
        int iM9763w = c2870f.m9763w() - c2869e.f11118G.f11092e;
        C2868d c2868d3 = c2869e.f11115E;
        c2868d3.f11094g = c2852d.m9619q(c2868d3);
        C2868d c2868d4 = c2869e.f11118G;
        c2868d4.f11094g = c2852d.m9619q(c2868d4);
        c2852d.m9610f(c2869e.f11115E.f11094g, i5);
        c2852d.m9610f(c2869e.f11118G.f11094g, iM9763w);
        if (c2869e.f11139a0 > 0 || c2869e.m9717P() == 8) {
            C2868d c2868d5 = c2869e.f11119H;
            c2868d5.f11094g = c2852d.m9619q(c2868d5);
            c2852d.m9610f(c2869e.f11119H.f11094g, c2869e.f11139a0 + i5);
        }
        c2869e.f11158k = 2;
        c2869e.m9692A0(i5, iM9763w);
    }

    /* renamed from: b */
    public static final boolean m9863b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}

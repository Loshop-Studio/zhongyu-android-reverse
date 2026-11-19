package p000a.p022f.p025b.p026i;

import p000a.p022f.p025b.C0140b;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.C0145g;
import p000a.p022f.p025b.p026i.C0150d;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.i.a */
/* loaded from: classes.dex */
public class C0147a extends C0154h {

    /* renamed from: g0 */
    public int f1032g0 = 0;

    /* renamed from: h0 */
    public boolean f1033h0 = true;

    /* renamed from: i0 */
    public int f1034i0 = 0;

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: b */
    public void mo581b(C0142d c0142d) {
        C0149c[] c0149cArr;
        boolean z;
        C0145g c0145g;
        C0149c c0149c;
        int i;
        int i2;
        int i3;
        C0150d.a aVar = C0150d.a.MATCH_CONSTRAINT;
        C0149c[] c0149cArr2 = this.f1078G;
        c0149cArr2[0] = this.f1126y;
        c0149cArr2[2] = this.f1127z;
        c0149cArr2[1] = this.f1072A;
        c0149cArr2[3] = this.f1073B;
        int i4 = 0;
        while (true) {
            c0149cArr = this.f1078G;
            if (i4 >= c0149cArr.length) {
                break;
            }
            c0149cArr[i4].f1061g = c0142d.m560l(c0149cArr[i4]);
            i4++;
        }
        int i5 = this.f1032g0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C0149c c0149c2 = c0149cArr[i5];
        for (int i6 = 0; i6 < this.f1153f0; i6++) {
            C0150d c0150d = this.f1152e0[i6];
            if ((this.f1033h0 || c0150d.mo582c()) && ((((i2 = this.f1032g0) == 0 || i2 == 1) && c0150d.m599j() == aVar && c0150d.f1126y.f1058d != null && c0150d.f1072A.f1058d != null) || (((i3 = this.f1032g0) == 2 || i3 == 3) && c0150d.m603n() == aVar && c0150d.f1127z.f1058d != null && c0150d.f1073B.f1058d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.f1126y.m585c() || this.f1072A.m585c();
        boolean z3 = this.f1127z.m585c() || this.f1073B.m585c();
        int i7 = !z && (((i = this.f1032g0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.f1153f0; i8++) {
            C0150d c0150d2 = this.f1152e0[i8];
            if (this.f1033h0 || c0150d2.mo582c()) {
                C0145g c0145gM560l = c0142d.m560l(c0150d2.f1078G[this.f1032g0]);
                C0149c[] c0149cArr3 = c0150d2.f1078G;
                int i9 = this.f1032g0;
                c0149cArr3[i9].f1061g = c0145gM560l;
                int i10 = (c0149cArr3[i9].f1058d == null || c0149cArr3[i9].f1058d.f1056b != this) ? 0 : c0149cArr3[i9].f1059e + 0;
                if (i9 == 0 || i9 == 2) {
                    C0145g c0145g2 = c0149c2.f1061g;
                    int i11 = this.f1034i0 - i10;
                    C0140b c0140bM561m = c0142d.m561m();
                    C0145g c0145gM562n = c0142d.m562n();
                    c0145gM562n.f1006d = 0;
                    c0140bM561m.m542f(c0145g2, c0145gM560l, c0145gM562n, i11);
                    c0142d.m551c(c0140bM561m);
                } else {
                    C0145g c0145g3 = c0149c2.f1061g;
                    int i12 = this.f1034i0 + i10;
                    C0140b c0140bM561m2 = c0142d.m561m();
                    C0145g c0145gM562n2 = c0142d.m562n();
                    c0145gM562n2.f1006d = 0;
                    c0140bM561m2.m541e(c0145g3, c0145gM560l, c0145gM562n2, i12);
                    c0142d.m551c(c0140bM561m2);
                }
                c0142d.m552d(c0149c2.f1061g, c0145gM560l, this.f1034i0 + i10, i7);
            }
        }
        int i13 = this.f1032g0;
        if (i13 == 0) {
            c0142d.m552d(this.f1072A.f1061g, this.f1126y.f1061g, 0, 8);
            c0142d.m552d(this.f1126y.f1061g, this.f1082K.f1072A.f1061g, 0, 4);
            c0145g = this.f1126y.f1061g;
            c0149c = this.f1082K.f1126y;
        } else if (i13 == 1) {
            c0142d.m552d(this.f1126y.f1061g, this.f1072A.f1061g, 0, 8);
            c0142d.m552d(this.f1126y.f1061g, this.f1082K.f1126y.f1061g, 0, 4);
            c0145g = this.f1126y.f1061g;
            c0149c = this.f1082K.f1072A;
        } else if (i13 == 2) {
            c0142d.m552d(this.f1073B.f1061g, this.f1127z.f1061g, 0, 8);
            c0142d.m552d(this.f1127z.f1061g, this.f1082K.f1073B.f1061g, 0, 4);
            c0145g = this.f1127z.f1061g;
            c0149c = this.f1082K.f1127z;
        } else {
            if (i13 != 3) {
                return;
            }
            c0142d.m552d(this.f1127z.f1061g, this.f1073B.f1061g, 0, 8);
            c0142d.m552d(this.f1127z.f1061g, this.f1082K.f1127z.f1061g, 0, 4);
            c0145g = this.f1127z.f1061g;
            c0149c = this.f1082K.f1073B;
        }
        c0142d.m552d(c0145g, c0149c.f1061g, 0, 0);
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: c */
    public boolean mo582c() {
        return true;
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("[Barrier] ");
        sbM2079g.append(this.f1096Y);
        sbM2079g.append(" {");
        String string = sbM2079g.toString();
        for (int i = 0; i < this.f1153f0; i++) {
            C0150d c0150d = this.f1152e0[i];
            if (i > 0) {
                string = C0561a.m2076d(string, ", ");
            }
            StringBuilder sbM2079g2 = C0561a.m2079g(string);
            sbM2079g2.append(c0150d.f1096Y);
            string = sbM2079g2.toString();
        }
        return C0561a.m2076d(string, "}");
    }
}

package p000a.p022f.p025b.p026i;

import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.ArrayList;
import p000a.p022f.p025b.C0141c;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.p026i.C0149c;
import p000a.p022f.p025b.p026i.p027l.C0160c;
import p000a.p022f.p025b.p026i.p027l.C0163f;
import p000a.p022f.p025b.p026i.p027l.C0167j;
import p000a.p022f.p025b.p026i.p027l.C0169l;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.i.d */
/* loaded from: classes.dex */
public class C0150d {

    /* renamed from: A */
    public C0149c f1072A;

    /* renamed from: B */
    public C0149c f1073B;

    /* renamed from: C */
    public C0149c f1074C;

    /* renamed from: D */
    public C0149c f1075D;

    /* renamed from: E */
    public C0149c f1076E;

    /* renamed from: F */
    public C0149c f1077F;

    /* renamed from: G */
    public C0149c[] f1078G;

    /* renamed from: H */
    public ArrayList<C0149c> f1079H;

    /* renamed from: I */
    public boolean[] f1080I;

    /* renamed from: J */
    public a[] f1081J;

    /* renamed from: K */
    public C0150d f1082K;

    /* renamed from: L */
    public int f1083L;

    /* renamed from: M */
    public int f1084M;

    /* renamed from: N */
    public float f1085N;

    /* renamed from: O */
    public int f1086O;

    /* renamed from: P */
    public int f1087P;

    /* renamed from: Q */
    public int f1088Q;

    /* renamed from: R */
    public int f1089R;

    /* renamed from: S */
    public int f1090S;

    /* renamed from: T */
    public int f1091T;

    /* renamed from: U */
    public float f1092U;

    /* renamed from: V */
    public float f1093V;

    /* renamed from: W */
    public Object f1094W;

    /* renamed from: X */
    public int f1095X;

    /* renamed from: Y */
    public String f1096Y;

    /* renamed from: Z */
    public int f1097Z;

    /* renamed from: a0 */
    public int f1099a0;

    /* renamed from: b */
    public C0160c f1100b;

    /* renamed from: b0 */
    public float[] f1101b0;

    /* renamed from: c */
    public C0160c f1102c;

    /* renamed from: c0 */
    public C0150d[] f1103c0;

    /* renamed from: d0 */
    public C0150d[] f1105d0;

    /* renamed from: x */
    public boolean f1125x;

    /* renamed from: y */
    public C0149c f1126y;

    /* renamed from: z */
    public C0149c f1127z;

    /* renamed from: a */
    public boolean f1098a = false;

    /* renamed from: d */
    public C0167j f1104d = new C0167j(this);

    /* renamed from: e */
    public C0169l f1106e = new C0169l(this);

    /* renamed from: f */
    public boolean[] f1107f = {true, true};

    /* renamed from: g */
    public int[] f1108g = {0, 0, 0, 0};

    /* renamed from: h */
    public int f1109h = -1;

    /* renamed from: i */
    public int f1110i = -1;

    /* renamed from: j */
    public int f1111j = 0;

    /* renamed from: k */
    public int f1112k = 0;

    /* renamed from: l */
    public int[] f1113l = new int[2];

    /* renamed from: m */
    public int f1114m = 0;

    /* renamed from: n */
    public int f1115n = 0;

    /* renamed from: o */
    public float f1116o = 1.0f;

    /* renamed from: p */
    public int f1117p = 0;

    /* renamed from: q */
    public int f1118q = 0;

    /* renamed from: r */
    public float f1119r = 1.0f;

    /* renamed from: s */
    public int f1120s = -1;

    /* renamed from: t */
    public float f1121t = 1.0f;

    /* renamed from: u */
    public int[] f1122u = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: v */
    public float f1123v = 0.0f;

    /* renamed from: w */
    public boolean f1124w = false;

    /* renamed from: a.f.b.i.d$a */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0150d() {
        C0149c c0149c = new C0149c(this, C0149c.a.LEFT);
        this.f1126y = c0149c;
        C0149c c0149c2 = new C0149c(this, C0149c.a.TOP);
        this.f1127z = c0149c2;
        C0149c c0149c3 = new C0149c(this, C0149c.a.RIGHT);
        this.f1072A = c0149c3;
        C0149c c0149c4 = new C0149c(this, C0149c.a.BOTTOM);
        this.f1073B = c0149c4;
        C0149c c0149c5 = new C0149c(this, C0149c.a.BASELINE);
        this.f1074C = c0149c5;
        this.f1075D = new C0149c(this, C0149c.a.CENTER_X);
        this.f1076E = new C0149c(this, C0149c.a.CENTER_Y);
        C0149c c0149c6 = new C0149c(this, C0149c.a.CENTER);
        this.f1077F = c0149c6;
        this.f1078G = new C0149c[]{c0149c, c0149c3, c0149c2, c0149c4, c0149c5, c0149c6};
        ArrayList<C0149c> arrayList = new ArrayList<>();
        this.f1079H = arrayList;
        this.f1080I = new boolean[2];
        a aVar = a.FIXED;
        this.f1081J = new a[]{aVar, aVar};
        this.f1082K = null;
        this.f1083L = 0;
        this.f1084M = 0;
        this.f1085N = 0.0f;
        this.f1086O = -1;
        this.f1087P = 0;
        this.f1088Q = 0;
        this.f1089R = 0;
        this.f1092U = 0.5f;
        this.f1093V = 0.5f;
        this.f1095X = 0;
        this.f1096Y = null;
        this.f1097Z = 0;
        this.f1099a0 = 0;
        this.f1101b0 = new float[]{-1.0f, -1.0f};
        this.f1103c0 = new C0150d[]{null, null};
        this.f1105d0 = new C0150d[]{null, null};
        arrayList.add(this.f1126y);
        this.f1079H.add(this.f1127z);
        this.f1079H.add(this.f1072A);
        this.f1079H.add(this.f1073B);
        this.f1079H.add(this.f1075D);
        this.f1079H.add(this.f1076E);
        this.f1079H.add(this.f1077F);
        this.f1079H.add(this.f1074C);
    }

    /* renamed from: A */
    public void m589A(a aVar) {
        this.f1081J[1] = aVar;
    }

    /* renamed from: B */
    public void m590B(int i) {
        this.f1083L = i;
        int i2 = this.f1090S;
        if (i < i2) {
            this.f1083L = i2;
        }
    }

    /* renamed from: C */
    public void mo591C(boolean z, boolean z2) {
        int i;
        int i2;
        a aVar = a.FIXED;
        C0167j c0167j = this.f1104d;
        boolean z3 = z & c0167j.f1213g;
        C0169l c0169l = this.f1106e;
        boolean z4 = z2 & c0169l.f1213g;
        int i3 = c0167j.f1214h.f1185g;
        int i4 = c0169l.f1214h.f1185g;
        int i5 = c0167j.f1215i.f1185g;
        int i6 = c0169l.f1215i.f1185g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f1087P = i3;
        }
        if (z4) {
            this.f1088Q = i4;
        }
        if (this.f1095X == 8) {
            this.f1083L = 0;
            this.f1084M = 0;
            return;
        }
        if (z3) {
            if (this.f1081J[0] == aVar && i8 < (i2 = this.f1083L)) {
                i8 = i2;
            }
            this.f1083L = i8;
            int i10 = this.f1090S;
            if (i8 < i10) {
                this.f1083L = i10;
            }
        }
        if (z4) {
            if (this.f1081J[1] == aVar && i9 < (i = this.f1084M)) {
                i9 = i;
            }
            this.f1084M = i9;
            int i11 = this.f1091T;
            if (i9 < i11) {
                this.f1084M = i11;
            }
        }
    }

    /* renamed from: D */
    public void mo592D(C0142d c0142d) {
        int i;
        int i2;
        int iM563o = c0142d.m563o(this.f1126y);
        int iM563o2 = c0142d.m563o(this.f1127z);
        int iM563o3 = c0142d.m563o(this.f1072A);
        int iM563o4 = c0142d.m563o(this.f1073B);
        C0167j c0167j = this.f1104d;
        C0163f c0163f = c0167j.f1214h;
        if (c0163f.f1188j) {
            C0163f c0163f2 = c0167j.f1215i;
            if (c0163f2.f1188j) {
                iM563o = c0163f.f1185g;
                iM563o3 = c0163f2.f1185g;
            }
        }
        C0169l c0169l = this.f1106e;
        C0163f c0163f3 = c0169l.f1214h;
        if (c0163f3.f1188j) {
            C0163f c0163f4 = c0169l.f1215i;
            if (c0163f4.f1188j) {
                iM563o2 = c0163f3.f1185g;
                iM563o4 = c0163f4.f1185g;
            }
        }
        int i3 = iM563o4 - iM563o2;
        if (iM563o3 - iM563o < 0 || i3 < 0 || iM563o == Integer.MIN_VALUE || iM563o == Integer.MAX_VALUE || iM563o2 == Integer.MIN_VALUE || iM563o2 == Integer.MAX_VALUE || iM563o3 == Integer.MIN_VALUE || iM563o3 == Integer.MAX_VALUE || iM563o4 == Integer.MIN_VALUE || iM563o4 == Integer.MAX_VALUE) {
            iM563o4 = 0;
            iM563o = 0;
            iM563o2 = 0;
            iM563o3 = 0;
        }
        int i4 = iM563o3 - iM563o;
        int i5 = iM563o4 - iM563o2;
        this.f1087P = iM563o;
        this.f1088Q = iM563o2;
        if (this.f1095X == 8) {
            this.f1083L = 0;
            this.f1084M = 0;
            return;
        }
        a[] aVarArr = this.f1081J;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i4 < (i2 = this.f1083L)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.f1084M)) {
            i5 = i;
        }
        this.f1083L = i4;
        this.f1084M = i5;
        int i6 = this.f1091T;
        if (i5 < i6) {
            this.f1084M = i6;
        }
        int i7 = this.f1090S;
        if (i4 < i7) {
            this.f1083L = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo581b(p000a.p022f.p025b.C0142d r48) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.C0150d.mo581b(a.f.b.d):void");
    }

    /* renamed from: c */
    public boolean mo582c() {
        return this.f1095X != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m593d(p000a.p022f.p025b.C0142d r29, boolean r30, boolean r31, boolean r32, boolean r33, p000a.p022f.p025b.C0145g r34, p000a.p022f.p025b.C0145g r35, p000a.p022f.p025b.p026i.C0150d.a r36, boolean r37, p000a.p022f.p025b.p026i.C0149c r38, p000a.p022f.p025b.p026i.C0149c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, int r49, int r50, int r51, int r52, float r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.C0150d.m593d(a.f.b.d, boolean, boolean, boolean, boolean, a.f.b.g, a.f.b.g, a.f.b.i.d$a, boolean, a.f.b.i.c, a.f.b.i.c, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: e */
    public void m594e(C0142d c0142d) {
        c0142d.m560l(this.f1126y);
        c0142d.m560l(this.f1127z);
        c0142d.m560l(this.f1072A);
        c0142d.m560l(this.f1073B);
        if (this.f1089R > 0) {
            c0142d.m560l(this.f1074C);
        }
    }

    /* renamed from: f */
    public C0149c mo595f(C0149c.a aVar) {
        switch (aVar.ordinal()) {
            case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                return null;
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                return this.f1126y;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                return this.f1127z;
            case 3:
                return this.f1072A;
            case 4:
                return this.f1073B;
            case 5:
                return this.f1074C;
            case 6:
                return this.f1077F;
            case 7:
                return this.f1075D;
            case 8:
                return this.f1076E;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* renamed from: g */
    public int m596g() {
        return m606q() + this.f1084M;
    }

    /* renamed from: h */
    public a m597h(int i) {
        if (i == 0) {
            return m599j();
        }
        if (i == 1) {
            return m603n();
        }
        return null;
    }

    /* renamed from: i */
    public int m598i() {
        if (this.f1095X == 8) {
            return 0;
        }
        return this.f1084M;
    }

    /* renamed from: j */
    public a m599j() {
        return this.f1081J[0];
    }

    /* renamed from: k */
    public C0150d m600k(int i) {
        C0149c c0149c;
        C0149c c0149c2;
        if (i != 0) {
            if (i == 1 && (c0149c2 = (c0149c = this.f1073B).f1058d) != null && c0149c2.f1058d == c0149c) {
                return c0149c2.f1056b;
            }
            return null;
        }
        C0149c c0149c3 = this.f1072A;
        C0149c c0149c4 = c0149c3.f1058d;
        if (c0149c4 == null || c0149c4.f1058d != c0149c3) {
            return null;
        }
        return c0149c4.f1056b;
    }

    /* renamed from: l */
    public C0150d m601l(int i) {
        C0149c c0149c;
        C0149c c0149c2;
        if (i != 0) {
            if (i == 1 && (c0149c2 = (c0149c = this.f1127z).f1058d) != null && c0149c2.f1058d == c0149c) {
                return c0149c2.f1056b;
            }
            return null;
        }
        C0149c c0149c3 = this.f1126y;
        C0149c c0149c4 = c0149c3.f1058d;
        if (c0149c4 == null || c0149c4.f1058d != c0149c3) {
            return null;
        }
        return c0149c4.f1056b;
    }

    /* renamed from: m */
    public int m602m() {
        return m605p() + this.f1083L;
    }

    /* renamed from: n */
    public a m603n() {
        return this.f1081J[1];
    }

    /* renamed from: o */
    public int m604o() {
        if (this.f1095X == 8) {
            return 0;
        }
        return this.f1083L;
    }

    /* renamed from: p */
    public int m605p() {
        C0150d c0150d = this.f1082K;
        return (c0150d == null || !(c0150d instanceof C0151e)) ? this.f1087P : ((C0151e) c0150d).f1138k0 + this.f1087P;
    }

    /* renamed from: q */
    public int m606q() {
        C0150d c0150d = this.f1082K;
        return (c0150d == null || !(c0150d instanceof C0151e)) ? this.f1088Q : ((C0151e) c0150d).f1139l0 + this.f1088Q;
    }

    /* renamed from: r */
    public final boolean m607r(int i) {
        int i2 = i * 2;
        C0149c[] c0149cArr = this.f1078G;
        if (c0149cArr[i2].f1058d != null && c0149cArr[i2].f1058d.f1058d != c0149cArr[i2]) {
            int i3 = i2 + 1;
            if (c0149cArr[i3].f1058d != null && c0149cArr[i3].f1058d.f1058d == c0149cArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public boolean m608s() {
        C0149c c0149c = this.f1126y;
        C0149c c0149c2 = c0149c.f1058d;
        if (c0149c2 != null && c0149c2.f1058d == c0149c) {
            return true;
        }
        C0149c c0149c3 = this.f1072A;
        C0149c c0149c4 = c0149c3.f1058d;
        return c0149c4 != null && c0149c4.f1058d == c0149c3;
    }

    /* renamed from: t */
    public boolean m609t() {
        C0149c c0149c = this.f1127z;
        C0149c c0149c2 = c0149c.f1058d;
        if (c0149c2 != null && c0149c2.f1058d == c0149c) {
            return true;
        }
        C0149c c0149c3 = this.f1073B;
        C0149c c0149c4 = c0149c3.f1058d;
        return c0149c4 != null && c0149c4.f1058d == c0149c3;
    }

    public String toString() {
        String string = BuildConfig.FLAVOR;
        StringBuilder sbM2079g = C0561a.m2079g(BuildConfig.FLAVOR);
        if (this.f1096Y != null) {
            StringBuilder sbM2079g2 = C0561a.m2079g("id: ");
            sbM2079g2.append(this.f1096Y);
            sbM2079g2.append(" ");
            string = sbM2079g2.toString();
        }
        sbM2079g.append(string);
        sbM2079g.append("(");
        sbM2079g.append(this.f1087P);
        sbM2079g.append(", ");
        sbM2079g.append(this.f1088Q);
        sbM2079g.append(") - (");
        sbM2079g.append(this.f1083L);
        sbM2079g.append(" x ");
        sbM2079g.append(this.f1084M);
        sbM2079g.append(")");
        return sbM2079g.toString();
    }

    /* renamed from: u */
    public void mo610u() {
        this.f1126y.m587e();
        this.f1127z.m587e();
        this.f1072A.m587e();
        this.f1073B.m587e();
        this.f1074C.m587e();
        this.f1075D.m587e();
        this.f1076E.m587e();
        this.f1077F.m587e();
        this.f1082K = null;
        this.f1123v = 0.0f;
        this.f1083L = 0;
        this.f1084M = 0;
        this.f1085N = 0.0f;
        this.f1086O = -1;
        this.f1087P = 0;
        this.f1088Q = 0;
        this.f1089R = 0;
        this.f1090S = 0;
        this.f1091T = 0;
        this.f1092U = 0.5f;
        this.f1093V = 0.5f;
        a[] aVarArr = this.f1081J;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f1094W = null;
        this.f1095X = 0;
        this.f1097Z = 0;
        this.f1099a0 = 0;
        float[] fArr = this.f1101b0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1109h = -1;
        this.f1110i = -1;
        int[] iArr = this.f1122u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1111j = 0;
        this.f1112k = 0;
        this.f1116o = 1.0f;
        this.f1119r = 1.0f;
        this.f1115n = Integer.MAX_VALUE;
        this.f1118q = Integer.MAX_VALUE;
        this.f1114m = 0;
        this.f1117p = 0;
        this.f1120s = -1;
        this.f1121t = 1.0f;
        boolean[] zArr = this.f1107f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f1080I;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    /* renamed from: v */
    public void mo611v(C0141c c0141c) {
        this.f1126y.m588f();
        this.f1127z.m588f();
        this.f1072A.m588f();
        this.f1073B.m588f();
        this.f1074C.m588f();
        this.f1077F.m588f();
        this.f1075D.m588f();
        this.f1076E.m588f();
    }

    /* renamed from: w */
    public void m612w(int i) {
        this.f1084M = i;
        int i2 = this.f1091T;
        if (i < i2) {
            this.f1084M = i2;
        }
    }

    /* renamed from: x */
    public void m613x(a aVar) {
        this.f1081J[0] = aVar;
    }

    /* renamed from: y */
    public void m614y(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f1091T = i;
    }

    /* renamed from: z */
    public void m615z(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f1090S = i;
    }
}

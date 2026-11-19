package p000a.p022f.p025b;

import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import p000a.p022f.p025b.C0140b;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.f */
/* loaded from: classes.dex */
public class C0144f extends C0140b {

    /* renamed from: f */
    public int f995f;

    /* renamed from: g */
    public C0145g[] f996g;

    /* renamed from: h */
    public C0145g[] f997h;

    /* renamed from: i */
    public int f998i;

    /* renamed from: j */
    public b f999j;

    /* renamed from: a.f.b.f$a */
    public class a implements Comparator<C0145g> {
        public a(C0144f c0144f) {
        }

        @Override // java.util.Comparator
        public int compare(C0145g c0145g, C0145g c0145g2) {
            return c0145g.f1004b - c0145g2.f1004b;
        }
    }

    /* renamed from: a.f.b.f$b */
    public class b implements Comparable {

        /* renamed from: b */
        public C0145g f1000b;

        public b(C0144f c0144f) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1000b.f1004b - ((C0145g) obj).f1004b;
        }

        public String toString() {
            String string = "[ ";
            if (this.f1000b != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbM2079g = C0561a.m2079g(string);
                    sbM2079g.append(this.f1000b.f1010h[i]);
                    sbM2079g.append(" ");
                    string = sbM2079g.toString();
                }
            }
            return string + "] " + this.f1000b;
        }
    }

    public C0144f(C0141c c0141c) {
        super(c0141c);
        this.f995f = 128;
        this.f996g = new C0145g[128];
        this.f997h = new C0145g[128];
        this.f998i = 0;
        this.f999j = new b(this);
    }

    @Override // p000a.p022f.p025b.C0140b, p000a.p022f.p025b.C0142d.a
    /* renamed from: a */
    public void mo537a(C0145g c0145g) {
        this.f999j.f1000b = c0145g;
        Arrays.fill(c0145g.f1010h, 0.0f);
        c0145g.f1010h[c0145g.f1006d] = 1.0f;
        m571m(c0145g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    @Override // p000a.p022f.p025b.C0140b, p000a.p022f.p025b.C0142d.a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p022f.p025b.C0145g mo538b(p000a.p022f.p025b.C0142d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = r11
            r2 = r0
        L4:
            int r3 = r10.f998i
            if (r1 >= r3) goto L5d
            a.f.b.g[] r3 = r10.f996g
            r4 = r3[r1]
            int r5 = r4.f1004b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L5a
        L13:
            a.f.b.f$b r5 = r10.f999j
            r5.f1000b = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L39
            java.util.Objects.requireNonNull(r5)
        L1f:
            if (r4 < 0) goto L35
            a.f.b.g r3 = r5.f1000b
            float[] r3 = r3.f1010h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L35
        L2d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L36
        L32:
            int r4 = r4 + (-1)
            goto L1f
        L35:
            r6 = r11
        L36:
            if (r6 == 0) goto L5a
            goto L59
        L39:
            r3 = r3[r2]
            java.util.Objects.requireNonNull(r5)
        L3e:
            if (r4 < 0) goto L56
            float[] r7 = r3.f1010h
            r7 = r7[r4]
            a.f.b.g r8 = r5.f1000b
            float[] r8 = r8.f1010h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r4 = r4 + (-1)
            goto L3e
        L51:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            goto L57
        L56:
            r6 = r11
        L57:
            if (r6 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            int r1 = r1 + 1
            goto L4
        L5d:
            if (r2 != r0) goto L61
            r11 = 0
            return r11
        L61:
            a.f.b.g[] r11 = r10.f996g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.C0144f.mo538b(a.f.b.d, boolean[]):a.f.b.g");
    }

    @Override // p000a.p022f.p025b.C0140b, p000a.p022f.p025b.C0142d.a
    public void clear() {
        this.f998i = 0;
        this.f967b = 0.0f;
    }

    @Override // p000a.p022f.p025b.C0140b
    /* renamed from: l */
    public void mo548l(C0140b c0140b, boolean z) {
        C0145g c0145g = c0140b.f966a;
        if (c0145g == null) {
            return;
        }
        C0140b.a aVar = c0140b.f969d;
        int iMo536k = aVar.mo536k();
        for (int i = 0; i < iMo536k; i++) {
            C0145g c0145gMo529d = aVar.mo529d(i);
            float fMo526a = aVar.mo526a(i);
            b bVar = this.f999j;
            bVar.f1000b = c0145gMo529d;
            boolean z2 = true;
            if (c0145gMo529d.f1003a) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = bVar.f1000b.f1010h;
                    fArr[i2] = (c0145g.f1010h[i2] * fMo526a) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        bVar.f1000b.f1010h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    C0144f.this.m572n(bVar.f1000b);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = c0145g.f1010h[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo526a;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.f1000b.f1010h[i3] = f3;
                    } else {
                        bVar.f1000b.f1010h[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                m571m(c0145gMo529d);
            }
            this.f967b = (c0140b.f967b * fMo526a) + this.f967b;
        }
        m572n(c0145g);
    }

    /* renamed from: m */
    public final void m571m(C0145g c0145g) {
        int i;
        int i2 = this.f998i + 1;
        C0145g[] c0145gArr = this.f996g;
        if (i2 > c0145gArr.length) {
            C0145g[] c0145gArr2 = (C0145g[]) Arrays.copyOf(c0145gArr, c0145gArr.length * 2);
            this.f996g = c0145gArr2;
            this.f997h = (C0145g[]) Arrays.copyOf(c0145gArr2, c0145gArr2.length * 2);
        }
        C0145g[] c0145gArr3 = this.f996g;
        int i3 = this.f998i;
        c0145gArr3[i3] = c0145g;
        int i4 = i3 + 1;
        this.f998i = i4;
        if (i4 > 1 && c0145gArr3[i4 - 1].f1004b > c0145g.f1004b) {
            int i5 = 0;
            while (true) {
                i = this.f998i;
                if (i5 >= i) {
                    break;
                }
                this.f997h[i5] = this.f996g[i5];
                i5++;
            }
            Arrays.sort(this.f997h, 0, i, new a(this));
            for (int i6 = 0; i6 < this.f998i; i6++) {
                this.f996g[i6] = this.f997h[i6];
            }
        }
        c0145g.f1003a = true;
        c0145g.m573a(this);
    }

    /* renamed from: n */
    public final void m572n(C0145g c0145g) {
        int i = 0;
        while (i < this.f998i) {
            if (this.f996g[i] == c0145g) {
                while (true) {
                    int i2 = this.f998i;
                    if (i >= i2 - 1) {
                        this.f998i = i2 - 1;
                        c0145g.f1003a = false;
                        return;
                    } else {
                        C0145g[] c0145gArr = this.f996g;
                        int i3 = i + 1;
                        c0145gArr[i] = c0145gArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000a.p022f.p025b.C0140b
    public String toString() {
        String string = BuildConfig.FLAVOR + " goal -> (" + this.f967b + ") : ";
        for (int i = 0; i < this.f998i; i++) {
            this.f999j.f1000b = this.f996g[i];
            StringBuilder sbM2079g = C0561a.m2079g(string);
            sbM2079g.append(this.f999j);
            sbM2079g.append(" ");
            string = sbM2079g.toString();
        }
        return string;
    }
}

package p117m;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import java.util.Comparator;
import p117m.C2850b;

/* renamed from: m.h */
/* loaded from: classes.dex */
public class C2856h extends C2850b {

    /* renamed from: g */
    private int f11003g;

    /* renamed from: h */
    private C2857i[] f11004h;

    /* renamed from: i */
    private C2857i[] f11005i;

    /* renamed from: j */
    private int f11006j;

    /* renamed from: k */
    b f11007k;

    /* renamed from: l */
    C2851c f11008l;

    /* renamed from: m.h$a */
    class a implements Comparator<C2857i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2857i c2857i, C2857i c2857i2) {
            return c2857i.f11016c - c2857i2.f11016c;
        }
    }

    /* renamed from: m.h$b */
    class b implements Comparable {

        /* renamed from: a */
        C2857i f11010a;

        /* renamed from: b */
        C2856h f11011b;

        public b(C2856h c2856h) {
            this.f11011b = c2856h;
        }

        /* renamed from: a */
        public boolean m9630a(C2857i c2857i, float f4) {
            boolean z3 = true;
            if (!this.f11010a.f11014a) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f5 = c2857i.f11022i[i4];
                    if (f5 != IGoodView.DEFAULT_TO_ALPHA) {
                        float f6 = f5 * f4;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = IGoodView.DEFAULT_TO_ALPHA;
                        }
                        this.f11010a.f11022i[i4] = f6;
                    } else {
                        this.f11010a.f11022i[i4] = 0.0f;
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f11010a.f11022i;
                fArr[i5] = fArr[i5] + (c2857i.f11022i[i5] * f4);
                if (Math.abs(fArr[i5]) < 1.0E-4f) {
                    this.f11010a.f11022i[i5] = 0.0f;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                C2856h.this.m9628G(this.f11010a);
            }
            return false;
        }

        /* renamed from: b */
        public void m9631b(C2857i c2857i) {
            this.f11010a = c2857i;
        }

        /* renamed from: c */
        public final boolean m9632c() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f11010a.f11022i[i4];
                if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                    return false;
                }
                if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f11010a.f11016c - ((C2857i) obj).f11016c;
        }

        /* renamed from: d */
        public final boolean m9633d(C2857i c2857i) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = c2857i.f11022i[i4];
                float f5 = this.f11010a.f11022i[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m9634e() {
            Arrays.fill(this.f11010a.f11022i, IGoodView.DEFAULT_TO_ALPHA);
        }

        public String toString() {
            String str = "[ ";
            if (this.f11010a != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f11010a.f11022i[i4] + " ";
                }
            }
            return str + "] " + this.f11010a;
        }
    }

    public C2856h(C2851c c2851c) {
        super(c2851c);
        this.f11003g = 128;
        this.f11004h = new C2857i[128];
        this.f11005i = new C2857i[128];
        this.f11006j = 0;
        this.f11007k = new b(this);
        this.f11008l = c2851c;
    }

    /* renamed from: F */
    private final void m9627F(C2857i c2857i) {
        int i4;
        int i5 = this.f11006j + 1;
        C2857i[] c2857iArr = this.f11004h;
        if (i5 > c2857iArr.length) {
            C2857i[] c2857iArr2 = (C2857i[]) Arrays.copyOf(c2857iArr, c2857iArr.length * 2);
            this.f11004h = c2857iArr2;
            this.f11005i = (C2857i[]) Arrays.copyOf(c2857iArr2, c2857iArr2.length * 2);
        }
        C2857i[] c2857iArr3 = this.f11004h;
        int i6 = this.f11006j;
        c2857iArr3[i6] = c2857i;
        int i7 = i6 + 1;
        this.f11006j = i7;
        if (i7 > 1 && c2857iArr3[i7 - 1].f11016c > c2857i.f11016c) {
            int i8 = 0;
            while (true) {
                i4 = this.f11006j;
                if (i8 >= i4) {
                    break;
                }
                this.f11005i[i8] = this.f11004h[i8];
                i8++;
            }
            Arrays.sort(this.f11005i, 0, i4, new a());
            for (int i9 = 0; i9 < this.f11006j; i9++) {
                this.f11004h[i9] = this.f11005i[i9];
            }
        }
        c2857i.f11014a = true;
        c2857i.m9636a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m9628G(C2857i c2857i) {
        int i4 = 0;
        while (i4 < this.f11006j) {
            if (this.f11004h[i4] == c2857i) {
                while (true) {
                    int i5 = this.f11006j;
                    if (i4 >= i5 - 1) {
                        this.f11006j = i5 - 1;
                        c2857i.f11014a = false;
                        return;
                    } else {
                        C2857i[] c2857iArr = this.f11004h;
                        int i6 = i4 + 1;
                        c2857iArr[i4] = c2857iArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // p117m.C2850b
    /* renamed from: C */
    public void mo9569C(C2850b c2850b, boolean z3) {
        C2857i c2857i = c2850b.f10970a;
        if (c2857i == null) {
            return;
        }
        C2850b.a aVar = c2850b.f10974e;
        int currentSize = aVar.getCurrentSize();
        for (int i4 = 0; i4 < currentSize; i4++) {
            C2857i c2857iMo9560f = aVar.mo9560f(i4);
            float fMo9555a = aVar.mo9555a(i4);
            this.f11007k.m9631b(c2857iMo9560f);
            if (this.f11007k.m9630a(c2857i, fMo9555a)) {
                m9627F(c2857iMo9560f);
            }
            this.f10971b += c2850b.f10971b * fMo9555a;
        }
        m9628G(c2857i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // p117m.C2850b, p117m.C2852d.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p117m.C2857i mo9571a(p117m.C2852d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f11006j
            if (r0 >= r2) goto L32
            m.i[] r2 = r4.f11004h
            r2 = r2[r0]
            int r3 = r2.f11016c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            m.h$b r3 = r4.f11007k
            r3.m9631b(r2)
            if (r1 != r5) goto L22
            m.h$b r2 = r4.f11007k
            boolean r2 = r2.m9632c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            m.h$b r2 = r4.f11007k
            m.i[] r3 = r4.f11004h
            r3 = r3[r1]
            boolean r2 = r2.m9633d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            m.i[] r5 = r4.f11004h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p117m.C2856h.mo9571a(m.d, boolean[]):m.i");
    }

    @Override // p117m.C2850b, p117m.C2852d.a
    /* renamed from: b */
    public void mo9572b(C2857i c2857i) {
        this.f11007k.m9631b(c2857i);
        this.f11007k.m9634e();
        c2857i.f11022i[c2857i.f11018e] = 1.0f;
        m9627F(c2857i);
    }

    @Override // p117m.C2850b, p117m.C2852d.a
    public void clear() {
        this.f11006j = 0;
        this.f10971b = IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b
    public String toString() {
        String str = " goal -> (" + this.f10971b + ") : ";
        for (int i4 = 0; i4 < this.f11006j; i4++) {
            this.f11007k.m9631b(this.f11004h[i4]);
            str = str + this.f11007k + " ";
        }
        return str;
    }
}

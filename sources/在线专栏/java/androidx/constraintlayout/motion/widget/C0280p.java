package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.C0293a;
import androidx.constraintlayout.widget.C0295c;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p113l.C2827c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* loaded from: classes.dex */
class C0280p implements Comparable<C0280p> {

    /* renamed from: p */
    static String[] f1658p = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a */
    C2827c f1659a;

    /* renamed from: b */
    int f1660b;

    /* renamed from: c */
    float f1661c;

    /* renamed from: d */
    float f1662d;

    /* renamed from: e */
    float f1663e;

    /* renamed from: f */
    float f1664f;

    /* renamed from: g */
    float f1665g;

    /* renamed from: h */
    float f1666h;

    /* renamed from: i */
    float f1667i;

    /* renamed from: j */
    float f1668j;

    /* renamed from: k */
    int f1669k;

    /* renamed from: l */
    LinkedHashMap<String, C0293a> f1670l;

    /* renamed from: m */
    int f1671m;

    /* renamed from: n */
    double[] f1672n;

    /* renamed from: o */
    double[] f1673o;

    public C0280p() {
        this.f1660b = 0;
        this.f1667i = Float.NaN;
        this.f1668j = Float.NaN;
        this.f1669k = AbstractC0267c.f1475f;
        this.f1670l = new LinkedHashMap<>();
        this.f1671m = 0;
        this.f1672n = new double[18];
        this.f1673o = new double[18];
    }

    /* renamed from: c */
    private boolean m1438c(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    /* renamed from: a */
    public void m1439a(C0295c.a aVar) {
        this.f1659a = C2827c.m9454c(aVar.f1986c.f2056c);
        C0295c.c cVar = aVar.f1986c;
        this.f1669k = cVar.f2057d;
        this.f1667i = cVar.f2060g;
        this.f1660b = cVar.f2058e;
        this.f1668j = aVar.f1985b.f2065e;
        for (String str : aVar.f1989f.keySet()) {
            C0293a c0293a = aVar.f1989f.get(str);
            if (c0293a.m1634c() != C0293a.b.STRING_TYPE) {
                this.f1670l.put(str, c0293a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0280p c0280p) {
        return Float.compare(this.f1662d, c0280p.f1662d);
    }

    /* renamed from: d */
    void m1441d(C0280p c0280p, boolean[] zArr, String[] strArr, boolean z3) {
        zArr[0] = zArr[0] | m1438c(this.f1662d, c0280p.f1662d);
        zArr[1] = zArr[1] | m1438c(this.f1663e, c0280p.f1663e) | z3;
        zArr[2] = z3 | m1438c(this.f1664f, c0280p.f1664f) | zArr[2];
        zArr[3] = zArr[3] | m1438c(this.f1665g, c0280p.f1665g);
        zArr[4] = m1438c(this.f1666h, c0280p.f1666h) | zArr[4];
    }

    /* renamed from: e */
    void m1442e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1662d, this.f1663e, this.f1664f, this.f1665g, this.f1666h, this.f1667i};
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (iArr[i5] < 6) {
                dArr[i4] = fArr[iArr[i5]];
                i4++;
            }
        }
    }

    /* renamed from: f */
    void m1443f(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f1663e;
        float f5 = this.f1664f;
        float f6 = this.f1665g;
        float f7 = this.f1666h;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        fArr[i4] = f4 + (f6 / 2.0f) + IGoodView.DEFAULT_TO_ALPHA;
        fArr[i4 + 1] = f5 + (f7 / 2.0f) + IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: g */
    int m1444g(String str, double[] dArr, int i4) {
        C0293a c0293a = this.f1670l.get(str);
        if (c0293a.m1637f() == 1) {
            dArr[i4] = c0293a.m1635d();
            return 1;
        }
        int iM1637f = c0293a.m1637f();
        c0293a.m1636e(new float[iM1637f]);
        int i5 = 0;
        while (i5 < iM1637f) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return iM1637f;
    }

    /* renamed from: h */
    int m1445h(String str) {
        return this.f1670l.get(str).m1637f();
    }

    /* renamed from: i */
    void m1446i(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f1663e;
        float f5 = this.f1664f;
        float f6 = this.f1665g;
        float f7 = this.f1666h;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        float f9 = f6 + f4;
        float f10 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f11 = f4 + IGoodView.DEFAULT_TO_ALPHA;
        float f12 = f5 + IGoodView.DEFAULT_TO_ALPHA;
        float f13 = f9 + IGoodView.DEFAULT_TO_ALPHA;
        float f14 = f5 + IGoodView.DEFAULT_TO_ALPHA;
        float f15 = f9 + IGoodView.DEFAULT_TO_ALPHA;
        float f16 = f10 + IGoodView.DEFAULT_TO_ALPHA;
        float f17 = f4 + IGoodView.DEFAULT_TO_ALPHA;
        float f18 = f10 + IGoodView.DEFAULT_TO_ALPHA;
        int i7 = i4 + 1;
        fArr[i4] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        int i10 = i9 + 1;
        fArr[i9] = f14;
        int i11 = i10 + 1;
        fArr[i10] = f15;
        int i12 = i11 + 1;
        fArr[i11] = f16;
        fArr[i12] = f17;
        fArr[i12 + 1] = f18;
    }

    /* renamed from: j */
    boolean m1447j(String str) {
        return this.f1670l.containsKey(str);
    }

    /* renamed from: k */
    void m1448k(C0273i c0273i, C0280p c0280p, C0280p c0280p2) {
        float f4 = c0273i.f1476a / 100.0f;
        this.f1661c = f4;
        this.f1660b = c0273i.f1550j;
        float f5 = Float.isNaN(c0273i.f1551k) ? f4 : c0273i.f1551k;
        float f6 = Float.isNaN(c0273i.f1552l) ? f4 : c0273i.f1552l;
        float f7 = c0280p2.f1665g;
        float f8 = c0280p.f1665g;
        float f9 = c0280p2.f1666h;
        float f10 = c0280p.f1666h;
        this.f1662d = this.f1661c;
        float f11 = c0280p.f1663e;
        float f12 = c0280p.f1664f;
        float f13 = (c0280p2.f1663e + (f7 / 2.0f)) - ((f8 / 2.0f) + f11);
        float f14 = (c0280p2.f1664f + (f9 / 2.0f)) - (f12 + (f10 / 2.0f));
        float f15 = ((f7 - f8) * f5) / 2.0f;
        this.f1663e = (int) ((f11 + (f13 * f4)) - f15);
        float f16 = ((f9 - f10) * f6) / 2.0f;
        this.f1664f = (int) ((f12 + (f14 * f4)) - f16);
        this.f1665g = (int) (f8 + r9);
        this.f1666h = (int) (f10 + r12);
        float f17 = Float.isNaN(c0273i.f1553m) ? f4 : c0273i.f1553m;
        boolean zIsNaN = Float.isNaN(c0273i.f1556p);
        float f18 = IGoodView.DEFAULT_TO_ALPHA;
        float f19 = zIsNaN ? IGoodView.DEFAULT_TO_ALPHA : c0273i.f1556p;
        if (!Float.isNaN(c0273i.f1554n)) {
            f4 = c0273i.f1554n;
        }
        if (!Float.isNaN(c0273i.f1555o)) {
            f18 = c0273i.f1555o;
        }
        this.f1671m = 2;
        this.f1663e = (int) (((c0280p.f1663e + (f17 * f13)) + (f18 * f14)) - f15);
        this.f1664f = (int) (((c0280p.f1664f + (f13 * f19)) + (f14 * f4)) - f16);
        this.f1659a = C2827c.m9454c(c0273i.f1548h);
        this.f1669k = c0273i.f1549i;
    }

    /* renamed from: l */
    void m1449l(C0273i c0273i, C0280p c0280p, C0280p c0280p2) {
        float f4 = c0273i.f1476a / 100.0f;
        this.f1661c = f4;
        this.f1660b = c0273i.f1550j;
        float f5 = Float.isNaN(c0273i.f1551k) ? f4 : c0273i.f1551k;
        float f6 = Float.isNaN(c0273i.f1552l) ? f4 : c0273i.f1552l;
        float f7 = c0280p2.f1665g - c0280p.f1665g;
        float f8 = c0280p2.f1666h - c0280p.f1666h;
        this.f1662d = this.f1661c;
        if (!Float.isNaN(c0273i.f1553m)) {
            f4 = c0273i.f1553m;
        }
        float f9 = c0280p.f1663e;
        float f10 = c0280p.f1665g;
        float f11 = c0280p.f1664f;
        float f12 = c0280p.f1666h;
        float f13 = (c0280p2.f1663e + (c0280p2.f1665g / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (c0280p2.f1664f + (c0280p2.f1666h / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f4;
        float f16 = (f7 * f5) / 2.0f;
        this.f1663e = (int) ((f9 + f15) - f16);
        float f17 = f4 * f14;
        float f18 = (f8 * f6) / 2.0f;
        this.f1664f = (int) ((f11 + f17) - f18);
        this.f1665g = (int) (f10 + r7);
        this.f1666h = (int) (f12 + r8);
        float f19 = Float.isNaN(c0273i.f1554n) ? IGoodView.DEFAULT_TO_ALPHA : c0273i.f1554n;
        this.f1671m = 1;
        float f20 = (int) ((c0280p.f1663e + f15) - f16);
        float f21 = (int) ((c0280p.f1664f + f17) - f18);
        this.f1663e = f20 + ((-f14) * f19);
        this.f1664f = f21 + (f13 * f19);
        this.f1659a = C2827c.m9454c(c0273i.f1548h);
        this.f1669k = c0273i.f1549i;
    }

    /* renamed from: m */
    void m1450m(int i4, int i5, C0273i c0273i, C0280p c0280p, C0280p c0280p2) {
        float f4 = c0273i.f1476a / 100.0f;
        this.f1661c = f4;
        this.f1660b = c0273i.f1550j;
        float f5 = Float.isNaN(c0273i.f1551k) ? f4 : c0273i.f1551k;
        float f6 = Float.isNaN(c0273i.f1552l) ? f4 : c0273i.f1552l;
        float f7 = c0280p2.f1665g;
        float f8 = c0280p.f1665g;
        float f9 = c0280p2.f1666h;
        float f10 = c0280p.f1666h;
        this.f1662d = this.f1661c;
        float f11 = c0280p.f1663e;
        float f12 = c0280p.f1664f;
        float f13 = c0280p2.f1663e + (f7 / 2.0f);
        float f14 = c0280p2.f1664f + (f9 / 2.0f);
        float f15 = (f7 - f8) * f5;
        this.f1663e = (int) ((f11 + ((f13 - ((f8 / 2.0f) + f11)) * f4)) - (f15 / 2.0f));
        float f16 = (f9 - f10) * f6;
        this.f1664f = (int) ((f12 + ((f14 - (f12 + (f10 / 2.0f))) * f4)) - (f16 / 2.0f));
        this.f1665g = (int) (f8 + f15);
        this.f1666h = (int) (f10 + f16);
        this.f1671m = 3;
        if (!Float.isNaN(c0273i.f1553m)) {
            this.f1663e = (int) (c0273i.f1553m * ((int) (i4 - this.f1665g)));
        }
        if (!Float.isNaN(c0273i.f1554n)) {
            this.f1664f = (int) (c0273i.f1554n * ((int) (i5 - this.f1666h)));
        }
        this.f1659a = C2827c.m9454c(c0273i.f1548h);
        this.f1669k = c0273i.f1549i;
    }

    /* renamed from: n */
    void m1451n(float f4, float f5, float f6, float f7) {
        this.f1663e = f4;
        this.f1664f = f5;
        this.f1665g = f6;
        this.f1666h = f7;
    }

    /* renamed from: o */
    void m1452o(float f4, float f5, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f6 = IGoodView.DEFAULT_TO_ALPHA;
        float f7 = IGoodView.DEFAULT_TO_ALPHA;
        float f8 = IGoodView.DEFAULT_TO_ALPHA;
        float f9 = IGoodView.DEFAULT_TO_ALPHA;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f10 = (float) dArr[i4];
            double d4 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f6 = f10;
            } else if (i5 == 2) {
                f8 = f10;
            } else if (i5 == 3) {
                f7 = f10;
            } else if (i5 == 4) {
                f9 = f10;
            }
        }
        float f11 = f6 - ((IGoodView.DEFAULT_TO_ALPHA * f7) / 2.0f);
        float f12 = f8 - ((IGoodView.DEFAULT_TO_ALPHA * f9) / 2.0f);
        fArr[0] = (f11 * (1.0f - f4)) + (((f7 * 1.0f) + f11) * f4) + IGoodView.DEFAULT_TO_ALPHA;
        fArr[1] = (f12 * (1.0f - f5)) + (((f9 * 1.0f) + f12) * f5) + IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: p */
    void m1453p(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f4;
        float f5 = this.f1663e;
        float f6 = this.f1664f;
        float f7 = this.f1665g;
        float f8 = this.f1666h;
        if (iArr.length != 0 && this.f1672n.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.f1672n = new double[i4];
            this.f1673o = new double[i4];
        }
        Arrays.fill(this.f1672n, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f1672n[iArr[i5]] = dArr[i5];
            this.f1673o[iArr[i5]] = dArr2[i5];
        }
        int i6 = 0;
        float f9 = Float.NaN;
        float f10 = IGoodView.DEFAULT_TO_ALPHA;
        float f11 = IGoodView.DEFAULT_TO_ALPHA;
        float f12 = IGoodView.DEFAULT_TO_ALPHA;
        float f13 = IGoodView.DEFAULT_TO_ALPHA;
        while (true) {
            double[] dArr4 = this.f1672n;
            if (i6 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i6]) && (dArr3 == null || dArr3[i6] == 0.0d)) {
                f4 = f5;
            } else {
                double d4 = dArr3 != null ? dArr3[i6] : 0.0d;
                if (!Double.isNaN(this.f1672n[i6])) {
                    d4 = this.f1672n[i6] + d4;
                }
                f4 = f5;
                float f14 = (float) d4;
                float f15 = (float) this.f1673o[i6];
                if (i6 == 1) {
                    f10 = f15;
                    f5 = f14;
                } else if (i6 == 2) {
                    f6 = f14;
                    f12 = f15;
                } else if (i6 == 3) {
                    f7 = f14;
                    f11 = f15;
                } else if (i6 == 4) {
                    f8 = f14;
                    f13 = f15;
                } else if (i6 == 5) {
                    f5 = f4;
                    f9 = f14;
                }
                i6++;
            }
            f5 = f4;
            i6++;
        }
        float f16 = f5;
        if (!Float.isNaN(f9)) {
            view.setRotation((float) ((Float.isNaN(Float.NaN) ? IGoodView.DEFAULT_TO_ALPHA : Float.NaN) + f9 + Math.toDegrees(Math.atan2(f12 + (f13 / 2.0f), f10 + (f11 / 2.0f)))));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f17 = f16 + 0.5f;
        int i7 = (int) f17;
        float f18 = f6 + 0.5f;
        int i8 = (int) f18;
        int i9 = (int) (f17 + f7);
        int i10 = (int) (f18 + f8);
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if ((i11 == view.getMeasuredWidth() && i12 == view.getMeasuredHeight()) ? false : true) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        }
        view.layout(i7, i8, i9, i10);
    }

    public C0280p(int i4, int i5, C0273i c0273i, C0280p c0280p, C0280p c0280p2) {
        this.f1660b = 0;
        this.f1667i = Float.NaN;
        this.f1668j = Float.NaN;
        this.f1669k = AbstractC0267c.f1475f;
        this.f1670l = new LinkedHashMap<>();
        this.f1671m = 0;
        this.f1672n = new double[18];
        this.f1673o = new double[18];
        int i6 = c0273i.f1557q;
        if (i6 == 1) {
            m1449l(c0273i, c0280p, c0280p2);
        } else if (i6 != 2) {
            m1448k(c0273i, c0280p, c0280p2);
        } else {
            m1450m(i4, i5, c0273i, c0280p, c0280p2);
        }
    }
}

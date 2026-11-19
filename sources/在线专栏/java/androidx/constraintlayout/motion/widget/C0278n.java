package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.AbstractC0271g;
import androidx.constraintlayout.motion.widget.AbstractC0282r;
import androidx.constraintlayout.motion.widget.AbstractC0283s;
import androidx.constraintlayout.widget.C0293a;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p113l.AbstractC2826b;
import p113l.C2827c;
import p113l.C2832h;
import p121n.C2869e;

/* renamed from: androidx.constraintlayout.motion.widget.n */
/* loaded from: classes.dex */
public class C0278n {

    /* renamed from: A */
    private C0276l[] f1630A;

    /* renamed from: a */
    View f1632a;

    /* renamed from: b */
    int f1633b;

    /* renamed from: c */
    String f1634c;

    /* renamed from: i */
    private AbstractC2826b[] f1640i;

    /* renamed from: j */
    private AbstractC2826b f1641j;

    /* renamed from: n */
    private int[] f1645n;

    /* renamed from: o */
    private double[] f1646o;

    /* renamed from: p */
    private double[] f1647p;

    /* renamed from: q */
    private String[] f1648q;

    /* renamed from: r */
    private int[] f1649r;

    /* renamed from: x */
    private HashMap<String, AbstractC0283s> f1655x;

    /* renamed from: y */
    private HashMap<String, AbstractC0282r> f1656y;

    /* renamed from: z */
    private HashMap<String, AbstractC0271g> f1657z;

    /* renamed from: d */
    private int f1635d = -1;

    /* renamed from: e */
    private C0280p f1636e = new C0280p();

    /* renamed from: f */
    private C0280p f1637f = new C0280p();

    /* renamed from: g */
    private C0277m f1638g = new C0277m();

    /* renamed from: h */
    private C0277m f1639h = new C0277m();

    /* renamed from: k */
    float f1642k = Float.NaN;

    /* renamed from: l */
    float f1643l = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: m */
    float f1644m = 1.0f;

    /* renamed from: s */
    private int f1650s = 4;

    /* renamed from: t */
    private float[] f1651t = new float[4];

    /* renamed from: u */
    private ArrayList<C0280p> f1652u = new ArrayList<>();

    /* renamed from: v */
    private float[] f1653v = new float[1];

    /* renamed from: w */
    private ArrayList<AbstractC0267c> f1654w = new ArrayList<>();

    /* renamed from: B */
    private int f1631B = AbstractC0267c.f1475f;

    C0278n(View view) {
        m1436u(view);
    }

    /* renamed from: f */
    private float m1416f(float f4, float[] fArr) {
        float f5 = IGoodView.DEFAULT_TO_ALPHA;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f6 = this.f1644m;
            if (f6 != 1.0d) {
                float f7 = this.f1643l;
                if (f4 < f7) {
                    f4 = IGoodView.DEFAULT_TO_ALPHA;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = (f4 - f7) * f6;
                }
            }
        }
        C2827c c2827c = this.f1636e.f1659a;
        float f8 = Float.NaN;
        Iterator<C0280p> it = this.f1652u.iterator();
        while (it.hasNext()) {
            C0280p next = it.next();
            C2827c c2827c2 = next.f1659a;
            if (c2827c2 != null) {
                float f9 = next.f1661c;
                if (f9 < f4) {
                    c2827c = c2827c2;
                    f5 = f9;
                } else if (Float.isNaN(f8)) {
                    f8 = next.f1661c;
                }
            }
        }
        if (c2827c != null) {
            float f10 = (Float.isNaN(f8) ? 1.0f : f8) - f5;
            double d4 = (f4 - f5) / f10;
            f4 = (((float) c2827c.mo9455a(d4)) * f10) + f5;
            if (fArr != null) {
                fArr[0] = (float) c2827c.mo9456b(d4);
            }
        }
        return f4;
    }

    /* renamed from: m */
    private float m1417m() {
        float[] fArr = new float[2];
        float f4 = 1.0f / 99;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i4 = 0;
        float fHypot = IGoodView.DEFAULT_TO_ALPHA;
        while (i4 < 100) {
            float f5 = i4 * f4;
            double dMo9455a = f5;
            C2827c c2827c = this.f1636e.f1659a;
            float f6 = Float.NaN;
            Iterator<C0280p> it = this.f1652u.iterator();
            float f7 = IGoodView.DEFAULT_TO_ALPHA;
            while (it.hasNext()) {
                C0280p next = it.next();
                C2827c c2827c2 = next.f1659a;
                float f8 = f4;
                if (c2827c2 != null) {
                    float f9 = next.f1661c;
                    if (f9 < f5) {
                        f7 = f9;
                        c2827c = c2827c2;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f1661c;
                    }
                }
                f4 = f8;
            }
            float f10 = f4;
            if (c2827c != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo9455a = (((float) c2827c.mo9455a((f5 - f7) / r16)) * (f6 - f7)) + f7;
            }
            this.f1640i[0].mo9436d(dMo9455a, this.f1646o);
            this.f1636e.m1443f(this.f1645n, this.f1646o, fArr, 0);
            if (i4 > 0) {
                fHypot = (float) (fHypot + Math.hypot(d5 - fArr[1], d4 - fArr[0]));
            }
            d4 = fArr[0];
            d5 = fArr[1];
            i4++;
            f4 = f10;
        }
        return fHypot;
    }

    /* renamed from: n */
    private void m1418n(C0280p c0280p) {
        if (Collections.binarySearch(this.f1652u, c0280p) == 0) {
            Log.e("MotionController", " KeyPath positon \"" + c0280p.f1662d + "\" outside of range");
        }
        this.f1652u.add((-r0) - 1, c0280p);
    }

    /* renamed from: p */
    private void m1419p(C0280p c0280p) {
        c0280p.m1451n((int) this.f1632a.getX(), (int) this.f1632a.getY(), this.f1632a.getWidth(), this.f1632a.getHeight());
    }

    /* renamed from: a */
    void m1420a(AbstractC0267c abstractC0267c) {
        this.f1654w.add(abstractC0267c);
    }

    /* renamed from: b */
    void m1421b(ArrayList<AbstractC0267c> arrayList) {
        this.f1654w.addAll(arrayList);
    }

    /* renamed from: c */
    int m1422c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo9440h = this.f1640i[0].mo9440h();
        if (iArr != null) {
            Iterator<C0280p> it = this.f1652u.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f1671m;
                i4++;
            }
        }
        int i5 = 0;
        for (double d4 : dArrMo9440h) {
            this.f1640i[0].mo9436d(d4, this.f1646o);
            this.f1636e.m1443f(this.f1645n, this.f1646o, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[PHI: r11
      0x0065: PHI (r11v2 float) = (r11v1 float), (r11v4 float) binds: [B:21:0x004b, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1423d(float[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0278n.m1423d(float[], int):void");
    }

    /* renamed from: e */
    void m1424e(float f4, float[] fArr, int i4) {
        this.f1640i[0].mo9436d(m1416f(f4, null), this.f1646o);
        this.f1636e.m1446i(this.f1645n, this.f1646o, fArr, i4);
    }

    /* renamed from: g */
    void m1425g(float f4, float f5, float f6, float[] fArr) {
        double[] dArr;
        float fM1416f = m1416f(f4, this.f1653v);
        AbstractC2826b[] abstractC2826bArr = this.f1640i;
        int i4 = 0;
        if (abstractC2826bArr == null) {
            C0280p c0280p = this.f1637f;
            float f7 = c0280p.f1663e;
            C0280p c0280p2 = this.f1636e;
            float f8 = f7 - c0280p2.f1663e;
            float f9 = c0280p.f1664f - c0280p2.f1664f;
            float f10 = (c0280p.f1665g - c0280p2.f1665g) + f8;
            float f11 = (c0280p.f1666h - c0280p2.f1666h) + f9;
            fArr[0] = (f8 * (1.0f - f5)) + (f10 * f5);
            fArr[1] = (f9 * (1.0f - f6)) + (f11 * f6);
            return;
        }
        double d4 = fM1416f;
        abstractC2826bArr[0].mo9439g(d4, this.f1647p);
        this.f1640i[0].mo9436d(d4, this.f1646o);
        float f12 = this.f1653v[0];
        while (true) {
            dArr = this.f1647p;
            if (i4 >= dArr.length) {
                break;
            }
            dArr[i4] = dArr[i4] * f12;
            i4++;
        }
        AbstractC2826b abstractC2826b = this.f1641j;
        if (abstractC2826b == null) {
            this.f1636e.m1452o(f5, f6, fArr, this.f1645n, dArr, this.f1646o);
            return;
        }
        double[] dArr2 = this.f1646o;
        if (dArr2.length > 0) {
            abstractC2826b.mo9436d(d4, dArr2);
            this.f1641j.mo9439g(d4, this.f1647p);
            this.f1636e.m1452o(f5, f6, fArr, this.f1645n, this.f1647p, this.f1646o);
        }
    }

    /* renamed from: h */
    public int m1426h() {
        int iMax = this.f1636e.f1660b;
        Iterator<C0280p> it = this.f1652u.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f1660b);
        }
        return Math.max(iMax, this.f1637f.f1660b);
    }

    /* renamed from: i */
    float m1427i() {
        return this.f1637f.f1663e;
    }

    /* renamed from: j */
    float m1428j() {
        return this.f1637f.f1664f;
    }

    /* renamed from: k */
    C0280p m1429k(int i4) {
        return this.f1652u.get(i4);
    }

    /* renamed from: l */
    void m1430l(float f4, int i4, int i5, float f5, float f6, float[] fArr) {
        float fM1416f = m1416f(f4, this.f1653v);
        HashMap<String, AbstractC0282r> map = this.f1656y;
        AbstractC0282r abstractC0282r = map == null ? null : map.get("translationX");
        HashMap<String, AbstractC0282r> map2 = this.f1656y;
        AbstractC0282r abstractC0282r2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, AbstractC0282r> map3 = this.f1656y;
        AbstractC0282r abstractC0282r3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, AbstractC0282r> map4 = this.f1656y;
        AbstractC0282r abstractC0282r4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, AbstractC0282r> map5 = this.f1656y;
        AbstractC0282r abstractC0282r5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, AbstractC0271g> map6 = this.f1657z;
        AbstractC0271g abstractC0271g = map6 == null ? null : map6.get("translationX");
        HashMap<String, AbstractC0271g> map7 = this.f1657z;
        AbstractC0271g abstractC0271g2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, AbstractC0271g> map8 = this.f1657z;
        AbstractC0271g abstractC0271g3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, AbstractC0271g> map9 = this.f1657z;
        AbstractC0271g abstractC0271g4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, AbstractC0271g> map10 = this.f1657z;
        AbstractC0271g abstractC0271g5 = map10 != null ? map10.get("scaleY") : null;
        C2832h c2832h = new C2832h();
        c2832h.m9473b();
        c2832h.m9475d(abstractC0282r3, fM1416f);
        c2832h.m9479h(abstractC0282r, abstractC0282r2, fM1416f);
        c2832h.m9477f(abstractC0282r4, abstractC0282r5, fM1416f);
        c2832h.m9474c(abstractC0271g3, fM1416f);
        c2832h.m9478g(abstractC0271g, abstractC0271g2, fM1416f);
        c2832h.m9476e(abstractC0271g4, abstractC0271g5, fM1416f);
        AbstractC2826b abstractC2826b = this.f1641j;
        if (abstractC2826b != null) {
            double[] dArr = this.f1646o;
            if (dArr.length > 0) {
                double d4 = fM1416f;
                abstractC2826b.mo9436d(d4, dArr);
                this.f1641j.mo9439g(d4, this.f1647p);
                this.f1636e.m1452o(f5, f6, fArr, this.f1645n, this.f1647p, this.f1646o);
            }
            c2832h.m9472a(f5, f6, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.f1640i == null) {
            C0280p c0280p = this.f1637f;
            float f7 = c0280p.f1663e;
            C0280p c0280p2 = this.f1636e;
            float f8 = f7 - c0280p2.f1663e;
            AbstractC0271g abstractC0271g6 = abstractC0271g5;
            float f9 = c0280p.f1664f - c0280p2.f1664f;
            AbstractC0271g abstractC0271g7 = abstractC0271g4;
            float f10 = (c0280p.f1665g - c0280p2.f1665g) + f8;
            float f11 = (c0280p.f1666h - c0280p2.f1666h) + f9;
            fArr[0] = (f8 * (1.0f - f5)) + (f10 * f5);
            fArr[1] = (f9 * (1.0f - f6)) + (f11 * f6);
            c2832h.m9473b();
            c2832h.m9475d(abstractC0282r3, fM1416f);
            c2832h.m9479h(abstractC0282r, abstractC0282r2, fM1416f);
            c2832h.m9477f(abstractC0282r4, abstractC0282r5, fM1416f);
            c2832h.m9474c(abstractC0271g3, fM1416f);
            c2832h.m9478g(abstractC0271g, abstractC0271g2, fM1416f);
            c2832h.m9476e(abstractC0271g7, abstractC0271g6, fM1416f);
            c2832h.m9472a(f5, f6, i4, i5, fArr);
            return;
        }
        double dM1416f = m1416f(fM1416f, this.f1653v);
        this.f1640i[0].mo9439g(dM1416f, this.f1647p);
        this.f1640i[0].mo9436d(dM1416f, this.f1646o);
        float f12 = this.f1653v[0];
        while (true) {
            double[] dArr2 = this.f1647p;
            if (i6 >= dArr2.length) {
                this.f1636e.m1452o(f5, f6, fArr, this.f1645n, dArr2, this.f1646o);
                c2832h.m9472a(f5, f6, i4, i5, fArr);
                return;
            } else {
                dArr2[i6] = dArr2[i6] * f12;
                i6++;
            }
        }
    }

    /* renamed from: o */
    boolean m1431o(View view, float f4, long j4, C0269e c0269e) {
        AbstractC0283s.d dVar;
        boolean zM1554j;
        double d4;
        float fM1416f = m1416f(f4, null);
        HashMap<String, AbstractC0282r> map = this.f1656y;
        if (map != null) {
            Iterator<AbstractC0282r> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo1536f(view, fM1416f);
            }
        }
        HashMap<String, AbstractC0283s> map2 = this.f1655x;
        if (map2 != null) {
            dVar = null;
            boolean zMo1549f = false;
            for (AbstractC0283s abstractC0283s : map2.values()) {
                if (abstractC0283s instanceof AbstractC0283s.d) {
                    dVar = (AbstractC0283s.d) abstractC0283s;
                } else {
                    zMo1549f |= abstractC0283s.mo1549f(view, fM1416f, j4, c0269e);
                }
            }
            zM1554j = zMo1549f;
        } else {
            dVar = null;
            zM1554j = false;
        }
        AbstractC2826b[] abstractC2826bArr = this.f1640i;
        if (abstractC2826bArr != null) {
            double d5 = fM1416f;
            abstractC2826bArr[0].mo9436d(d5, this.f1646o);
            this.f1640i[0].mo9439g(d5, this.f1647p);
            AbstractC2826b abstractC2826b = this.f1641j;
            if (abstractC2826b != null) {
                double[] dArr = this.f1646o;
                if (dArr.length > 0) {
                    abstractC2826b.mo9436d(d5, dArr);
                    this.f1641j.mo9439g(d5, this.f1647p);
                }
            }
            this.f1636e.m1453p(view, this.f1645n, this.f1646o, this.f1647p, null);
            HashMap<String, AbstractC0282r> map3 = this.f1656y;
            if (map3 != null) {
                for (AbstractC0282r abstractC0282r : map3.values()) {
                    if (abstractC0282r instanceof AbstractC0282r.d) {
                        double[] dArr2 = this.f1647p;
                        ((AbstractC0282r.d) abstractC0282r).m1540i(view, fM1416f, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f1647p;
                d4 = d5;
                zM1554j = dVar.m1554j(view, c0269e, fM1416f, j4, dArr3[0], dArr3[1]) | zM1554j;
            } else {
                d4 = d5;
            }
            int i4 = 1;
            while (true) {
                AbstractC2826b[] abstractC2826bArr2 = this.f1640i;
                if (i4 >= abstractC2826bArr2.length) {
                    break;
                }
                abstractC2826bArr2[i4].mo9437e(d4, this.f1651t);
                this.f1636e.f1670l.get(this.f1648q[i4 - 1]).m1638i(view, this.f1651t);
                i4++;
            }
            C0277m c0277m = this.f1638g;
            if (c0277m.f1605b == 0) {
                if (fM1416f <= IGoodView.DEFAULT_TO_ALPHA) {
                    view.setVisibility(c0277m.f1606c);
                } else if (fM1416f >= 1.0f) {
                    view.setVisibility(this.f1639h.f1606c);
                } else if (this.f1639h.f1606c != c0277m.f1606c) {
                    view.setVisibility(0);
                }
            }
            if (this.f1630A != null) {
                int i5 = 0;
                while (true) {
                    C0276l[] c0276lArr = this.f1630A;
                    if (i5 >= c0276lArr.length) {
                        break;
                    }
                    c0276lArr[i5].m1405r(fM1416f, view);
                    i5++;
                }
            }
        } else {
            C0280p c0280p = this.f1636e;
            float f5 = c0280p.f1663e;
            C0280p c0280p2 = this.f1637f;
            float f6 = f5 + ((c0280p2.f1663e - f5) * fM1416f);
            float f7 = c0280p.f1664f;
            float f8 = f7 + ((c0280p2.f1664f - f7) * fM1416f);
            float f9 = c0280p.f1665g;
            float f10 = c0280p2.f1665g;
            float f11 = c0280p.f1666h;
            float f12 = c0280p2.f1666h;
            float f13 = f6 + 0.5f;
            int i6 = (int) f13;
            float f14 = f8 + 0.5f;
            int i7 = (int) f14;
            int i8 = (int) (f13 + ((f10 - f9) * fM1416f) + f9);
            int i9 = (int) (f14 + ((f12 - f11) * fM1416f) + f11);
            int i10 = i8 - i6;
            int i11 = i9 - i7;
            if (f10 != f9 || f12 != f11) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            }
            view.layout(i6, i7, i8, i9);
        }
        HashMap<String, AbstractC0271g> map4 = this.f1657z;
        if (map4 != null) {
            for (AbstractC0271g abstractC0271g : map4.values()) {
                if (abstractC0271g instanceof AbstractC0271g.f) {
                    double[] dArr4 = this.f1647p;
                    ((AbstractC0271g.f) abstractC0271g).m1352j(view, fM1416f, dArr4[0], dArr4[1]);
                } else {
                    abstractC0271g.mo1343f(view, fM1416f);
                }
            }
        }
        return zM1554j;
    }

    /* renamed from: q */
    void m1432q(C2869e c2869e, C0295c c0295c) {
        C0280p c0280p = this.f1637f;
        c0280p.f1661c = 1.0f;
        c0280p.f1662d = 1.0f;
        m1419p(c0280p);
        this.f1637f.m1451n(c2869e.m9719R(), c2869e.m9720S(), c2869e.m9718Q(), c2869e.m9763w());
        this.f1637f.m1439a(c0295c.m1667q(this.f1633b));
        this.f1639h.m1415i(c2869e, c0295c, this.f1633b);
    }

    /* renamed from: r */
    public void m1433r(int i4) {
        this.f1631B = i4;
    }

    /* renamed from: s */
    void m1434s(View view) {
        C0280p c0280p = this.f1636e;
        c0280p.f1661c = IGoodView.DEFAULT_TO_ALPHA;
        c0280p.f1662d = IGoodView.DEFAULT_TO_ALPHA;
        c0280p.m1451n(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f1638g.m1414h(view);
    }

    /* renamed from: t */
    void m1435t(C2869e c2869e, C0295c c0295c) {
        C0280p c0280p = this.f1636e;
        c0280p.f1661c = IGoodView.DEFAULT_TO_ALPHA;
        c0280p.f1662d = IGoodView.DEFAULT_TO_ALPHA;
        m1419p(c0280p);
        this.f1636e.m1451n(c2869e.m9719R(), c2869e.m9720S(), c2869e.m9718Q(), c2869e.m9763w());
        C0295c.a aVarM1667q = c0295c.m1667q(this.f1633b);
        this.f1636e.m1439a(aVarM1667q);
        this.f1642k = aVarM1667q.f1986c.f2059f;
        this.f1638g.m1415i(c2869e, c0295c, this.f1633b);
    }

    public String toString() {
        return " start: x: " + this.f1636e.f1663e + " y: " + this.f1636e.f1664f + " end: x: " + this.f1637f.f1663e + " y: " + this.f1637f.f1664f;
    }

    /* renamed from: u */
    public void m1436u(View view) {
        this.f1632a = view;
        this.f1633b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f1634c = ((ConstraintLayout.LayoutParams) layoutParams).m1618a();
        }
    }

    /* renamed from: v */
    public void m1437v(int i4, int i5, float f4, long j4) {
        ArrayList arrayList;
        String[] strArr;
        AbstractC0283s abstractC0283sM1545d;
        C0293a c0293a;
        AbstractC0282r abstractC0282rM1532d;
        C0293a c0293a2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i6 = this.f1631B;
        if (i6 != AbstractC0267c.f1475f) {
            this.f1636e.f1669k = i6;
        }
        this.f1638g.m1412f(this.f1639h, hashSet2);
        ArrayList<AbstractC0267c> arrayList2 = this.f1654w;
        if (arrayList2 != null) {
            Iterator<AbstractC0267c> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                AbstractC0267c next = it.next();
                if (next instanceof C0273i) {
                    C0273i c0273i = (C0273i) next;
                    m1418n(new C0280p(i4, i5, c0273i, this.f1636e, this.f1637f));
                    int i7 = c0273i.f1561g;
                    if (i7 != AbstractC0267c.f1475f) {
                        this.f1635d = i7;
                    }
                } else if (next instanceof C0270f) {
                    next.mo1261b(hashSet3);
                } else if (next instanceof C0275k) {
                    next.mo1261b(hashSet);
                } else if (next instanceof C0276l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C0276l) next);
                } else {
                    next.mo1264e(map);
                    next.mo1261b(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c4 = 0;
        if (arrayList != null) {
            this.f1630A = (C0276l[]) arrayList.toArray(new C0276l[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.f1656y = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c5];
                    Iterator<AbstractC0267c> it3 = this.f1654w.iterator();
                    while (it3.hasNext()) {
                        AbstractC0267c next3 = it3.next();
                        HashMap<String, C0293a> map2 = next3.f1480e;
                        if (map2 != null && (c0293a2 = map2.get(str)) != null) {
                            sparseArray.append(next3.f1476a, c0293a2);
                        }
                    }
                    abstractC0282rM1532d = AbstractC0282r.m1531c(next2, sparseArray);
                } else {
                    abstractC0282rM1532d = AbstractC0282r.m1532d(next2);
                }
                if (abstractC0282rM1532d != null) {
                    abstractC0282rM1532d.m1537g(next2);
                    this.f1656y.put(next2, abstractC0282rM1532d);
                }
                c5 = 1;
            }
            ArrayList<AbstractC0267c> arrayList3 = this.f1654w;
            if (arrayList3 != null) {
                Iterator<AbstractC0267c> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC0267c next4 = it4.next();
                    if (next4 instanceof C0268d) {
                        next4.mo1260a(this.f1656y);
                    }
                }
            }
            this.f1638g.m1408a(this.f1656y, 0);
            this.f1639h.m1408a(this.f1656y, 100);
            for (String str2 : this.f1656y.keySet()) {
                this.f1656y.get(str2).mo1538h(map.containsKey(str2) ? map.get(str2).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f1655x == null) {
                this.f1655x = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f1655x.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<AbstractC0267c> it6 = this.f1654w.iterator();
                        while (it6.hasNext()) {
                            AbstractC0267c next6 = it6.next();
                            HashMap<String, C0293a> map3 = next6.f1480e;
                            if (map3 != null && (c0293a = map3.get(str3)) != null) {
                                sparseArray2.append(next6.f1476a, c0293a);
                            }
                        }
                        abstractC0283sM1545d = AbstractC0283s.m1544c(next5, sparseArray2);
                    } else {
                        abstractC0283sM1545d = AbstractC0283s.m1545d(next5, j4);
                    }
                    if (abstractC0283sM1545d != null) {
                        abstractC0283sM1545d.m1551h(next5);
                        this.f1655x.put(next5, abstractC0283sM1545d);
                    }
                }
            }
            ArrayList<AbstractC0267c> arrayList4 = this.f1654w;
            if (arrayList4 != null) {
                Iterator<AbstractC0267c> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    AbstractC0267c next7 = it7.next();
                    if (next7 instanceof C0275k) {
                        ((C0275k) next7).m1390M(this.f1655x);
                    }
                }
            }
            for (String str4 : this.f1655x.keySet()) {
                this.f1655x.get(str4).mo1552i(map.containsKey(str4) ? map.get(str4).intValue() : 0);
            }
        }
        int i8 = 2;
        int size = this.f1652u.size() + 2;
        C0280p[] c0280pArr = new C0280p[size];
        c0280pArr[0] = this.f1636e;
        c0280pArr[size - 1] = this.f1637f;
        if (this.f1652u.size() > 0 && this.f1635d == -1) {
            this.f1635d = 0;
        }
        Iterator<C0280p> it8 = this.f1652u.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            c0280pArr[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f1637f.f1670l.keySet()) {
            if (this.f1636e.f1670l.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f1648q = strArr2;
        this.f1649r = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.f1648q;
            if (i10 >= strArr.length) {
                break;
            }
            String str6 = strArr[i10];
            this.f1649r[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (c0280pArr[i11].f1670l.containsKey(str6)) {
                    int[] iArr = this.f1649r;
                    iArr[i10] = iArr[i10] + c0280pArr[i11].f1670l.get(str6).m1637f();
                    break;
                }
                i11++;
            }
            i10++;
        }
        boolean z3 = c0280pArr[0].f1669k != AbstractC0267c.f1475f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            c0280pArr[i12].m1441d(c0280pArr[i12 - 1], zArr, this.f1648q, z3);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        int[] iArr2 = new int[i13];
        this.f1645n = iArr2;
        this.f1646o = new double[iArr2.length];
        this.f1647p = new double[iArr2.length];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f1645n[i15] = i16;
                i15++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, size, this.f1645n.length);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            c0280pArr[i17].m1442e(dArr[i17], this.f1645n);
            dArr2[i17] = c0280pArr[i17].f1661c;
        }
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.f1645n;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < C0280p.f1658p.length) {
                String str7 = C0280p.f1658p[this.f1645n[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str7 = str7 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f1640i = new AbstractC2826b[this.f1648q.length + 1];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f1648q;
            if (i20 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i20];
            int i21 = 0;
            double[] dArr3 = null;
            int i22 = 0;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (c0280pArr[i21].m1447j(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr4 = new int[i8];
                        iArr4[1] = c0280pArr[i21].m1445h(str8);
                        iArr4[c4] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, iArr4);
                    }
                    dArr3[i22] = c0280pArr[i21].f1661c;
                    c0280pArr[i21].m1444g(str8, dArr4[i22], 0);
                    i22++;
                }
                i21++;
                i8 = 2;
                c4 = 0;
            }
            i20++;
            this.f1640i[i20] = AbstractC2826b.m9452a(this.f1635d, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i8 = 2;
            c4 = 0;
        }
        this.f1640i[0] = AbstractC2826b.m9452a(this.f1635d, dArr2, dArr);
        if (c0280pArr[0].f1669k != AbstractC0267c.f1475f) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
            for (int i23 = 0; i23 < size; i23++) {
                iArr5[i23] = c0280pArr[i23].f1669k;
                dArr5[i23] = c0280pArr[i23].f1661c;
                dArr6[i23][0] = c0280pArr[i23].f1663e;
                dArr6[i23][1] = c0280pArr[i23].f1664f;
            }
            this.f1641j = AbstractC2826b.m9453b(iArr5, dArr5, dArr6);
        }
        float fM1417m = Float.NaN;
        this.f1657z = new HashMap<>();
        if (this.f1654w != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                AbstractC0271g abstractC0271gM1338c = AbstractC0271g.m1338c(next8);
                if (abstractC0271gM1338c != null) {
                    if (abstractC0271gM1338c.m1346i() && Float.isNaN(fM1417m)) {
                        fM1417m = m1417m();
                    }
                    abstractC0271gM1338c.m1344g(next8);
                    this.f1657z.put(next8, abstractC0271gM1338c);
                }
            }
            Iterator<AbstractC0267c> it10 = this.f1654w.iterator();
            while (it10.hasNext()) {
                AbstractC0267c next9 = it10.next();
                if (next9 instanceof C0270f) {
                    ((C0270f) next9).m1334O(this.f1657z);
                }
            }
            Iterator<AbstractC0271g> it11 = this.f1657z.values().iterator();
            while (it11.hasNext()) {
                it11.next().m1345h(fM1417m);
            }
        }
    }
}

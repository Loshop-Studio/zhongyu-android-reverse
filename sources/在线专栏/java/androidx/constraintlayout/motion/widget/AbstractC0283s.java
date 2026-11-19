package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0293a;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import p113l.AbstractC2826b;

/* renamed from: androidx.constraintlayout.motion.widget.s */
/* loaded from: classes.dex */
public abstract class AbstractC0283s {

    /* renamed from: k */
    private static float f1725k = 6.2831855f;

    /* renamed from: a */
    protected AbstractC2826b f1726a;

    /* renamed from: e */
    private int f1730e;

    /* renamed from: f */
    private String f1731f;

    /* renamed from: i */
    long f1734i;

    /* renamed from: b */
    protected int f1727b = 0;

    /* renamed from: c */
    protected int[] f1728c = new int[10];

    /* renamed from: d */
    protected float[][] f1729d = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);

    /* renamed from: g */
    private float[] f1732g = new float[3];

    /* renamed from: h */
    protected boolean f1733h = false;

    /* renamed from: j */
    float f1735j = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    static class a extends AbstractC0283s {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setAlpha(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    static class b extends AbstractC0283s {

        /* renamed from: l */
        String f1736l;

        /* renamed from: m */
        SparseArray<C0293a> f1737m;

        /* renamed from: n */
        SparseArray<float[]> f1738n = new SparseArray<>();

        /* renamed from: o */
        float[] f1739o;

        /* renamed from: p */
        float[] f1740p;

        public b(String str, SparseArray<C0293a> sparseArray) {
            this.f1736l = str.split(",")[1];
            this.f1737m = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: e */
        public void mo1548e(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            this.f1726a.mo9437e(f4, this.f1739o);
            float[] fArr = this.f1739o;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float f7 = (float) ((this.f1735j + (((j4 - this.f1734i) * 1.0E-9d) * f5)) % 1.0d);
            this.f1735j = f7;
            this.f1734i = j4;
            float fM1546a = m1546a(f7);
            this.f1733h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f1740p;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z3 = this.f1733h;
                float[] fArr3 = this.f1739o;
                this.f1733h = z3 | (((double) fArr3[i4]) != 0.0d);
                fArr2[i4] = (fArr3[i4] * fM1546a) + f6;
                i4++;
            }
            this.f1737m.valueAt(0).m1638i(view, this.f1740p);
            if (f5 != IGoodView.DEFAULT_TO_ALPHA) {
                this.f1733h = true;
            }
            return this.f1733h;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: i */
        public void mo1552i(int i4) {
            int size = this.f1737m.size();
            int iM1637f = this.f1737m.valueAt(0).m1637f();
            double[] dArr = new double[size];
            int i5 = iM1637f + 2;
            this.f1739o = new float[i5];
            this.f1740p = new float[iM1637f];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.f1737m.keyAt(i6);
                C0293a c0293aValueAt = this.f1737m.valueAt(i6);
                float[] fArrValueAt = this.f1738n.valueAt(i6);
                dArr[i6] = iKeyAt * 0.01d;
                c0293aValueAt.m1636e(this.f1739o);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f1739o.length) {
                        dArr2[i6][i7] = r8[i7];
                        i7++;
                    }
                }
                dArr2[i6][iM1637f] = fArrValueAt[0];
                dArr2[i6][iM1637f + 1] = fArrValueAt[1];
            }
            this.f1726a = AbstractC2826b.m9452a(i4, dArr, dArr2);
        }

        /* renamed from: j */
        public void m1553j(int i4, C0293a c0293a, float f4, int i5, float f5) {
            this.f1737m.append(i4, c0293a);
            this.f1738n.append(i4, new float[]{f4, f5});
            this.f1727b = Math.max(this.f1727b, i5);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$c */
    static class c extends AbstractC0283s {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setElevation(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$d */
    static class d extends AbstractC0283s {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            return this.f1733h;
        }

        /* renamed from: j */
        public boolean m1554j(View view, C0269e c0269e, float f4, long j4, double d4, double d5) {
            view.setRotation(m1547b(f4, j4, view, c0269e) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$e */
    static class e extends AbstractC0283s {

        /* renamed from: l */
        boolean f1741l = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m1547b(f4, j4, view, c0269e));
            } else {
                if (this.f1741l) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f1741l = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(m1547b(f4, j4, view, c0269e)));
                    } catch (IllegalAccessException e4) {
                        Log.e("SplineSet", "unable to setProgress", e4);
                    } catch (InvocationTargetException e5) {
                        Log.e("SplineSet", "unable to setProgress", e5);
                    }
                }
            }
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$f */
    static class f extends AbstractC0283s {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setRotation(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$g */
    static class g extends AbstractC0283s {
        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setRotationX(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$h */
    static class h extends AbstractC0283s {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setRotationY(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$i */
    static class i extends AbstractC0283s {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setScaleX(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$j */
    static class j extends AbstractC0283s {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setScaleY(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$k */
    private static class k {
        /* renamed from: a */
        static void m1555a(int[] iArr, float[][] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = i6 - 1;
                int i8 = iArr2[i7];
                i6 = i7 - 1;
                int i9 = iArr2[i6];
                if (i8 < i9) {
                    int iM1556b = m1556b(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iM1556b - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iM1556b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m1556b(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    m1557c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            m1557c(iArr, fArr, i7, i5);
            return i7;
        }

        /* renamed from: c */
        private static void m1557c(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$l */
    static class l extends AbstractC0283s {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setTranslationX(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$m */
    static class m extends AbstractC0283s {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setTranslationY(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$n */
    static class n extends AbstractC0283s {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0283s
        /* renamed from: f */
        public boolean mo1549f(View view, float f4, long j4, C0269e c0269e) {
            view.setTranslationZ(m1547b(f4, j4, view, c0269e));
            return this.f1733h;
        }
    }

    /* renamed from: c */
    static AbstractC0283s m1544c(String str, SparseArray<C0293a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* renamed from: d */
    static AbstractC0283s m1545d(String str, long j4) {
        AbstractC0283s gVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new l();
                break;
            case "translationY":
                gVar = new m();
                break;
            case "translationZ":
                gVar = new n();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.m1550g(j4);
        return gVar;
    }

    /* renamed from: a */
    protected float m1546a(float f4) {
        float fAbs;
        switch (this.f1727b) {
            case 1:
                return Math.signum(f4 * f1725k);
            case 2:
                fAbs = Math.abs(f4);
                break;
            case 3:
                return (((f4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f4 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f4 * f1725k);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f4 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f4 * f1725k);
        }
        return 1.0f - fAbs;
    }

    /* renamed from: b */
    public float m1547b(float f4, long j4, View view, C0269e c0269e) {
        this.f1726a.mo9437e(f4, this.f1732g);
        float[] fArr = this.f1732g;
        float f5 = fArr[1];
        if (f5 == IGoodView.DEFAULT_TO_ALPHA) {
            this.f1733h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f1735j)) {
            float fM1297a = c0269e.m1297a(view, this.f1731f, 0);
            this.f1735j = fM1297a;
            if (Float.isNaN(fM1297a)) {
                this.f1735j = IGoodView.DEFAULT_TO_ALPHA;
            }
        }
        float f6 = (float) ((this.f1735j + (((j4 - this.f1734i) * 1.0E-9d) * f5)) % 1.0d);
        this.f1735j = f6;
        c0269e.m1298b(view, this.f1731f, 0, f6);
        this.f1734i = j4;
        float f7 = this.f1732g[0];
        float fM1546a = (m1546a(this.f1735j) * f7) + this.f1732g[2];
        this.f1733h = (f7 == IGoodView.DEFAULT_TO_ALPHA && f5 == IGoodView.DEFAULT_TO_ALPHA) ? false : true;
        return fM1546a;
    }

    /* renamed from: e */
    public void mo1548e(int i4, float f4, float f5, int i5, float f6) {
        int[] iArr = this.f1728c;
        int i6 = this.f1730e;
        iArr[i6] = i4;
        float[][] fArr = this.f1729d;
        fArr[i6][0] = f4;
        fArr[i6][1] = f5;
        fArr[i6][2] = f6;
        this.f1727b = Math.max(this.f1727b, i5);
        this.f1730e++;
    }

    /* renamed from: f */
    public abstract boolean mo1549f(View view, float f4, long j4, C0269e c0269e);

    /* renamed from: g */
    protected void m1550g(long j4) {
        this.f1734i = j4;
    }

    /* renamed from: h */
    public void m1551h(String str) {
        this.f1731f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1552i(int r12) {
        /*
            r11 = this;
            int r0 = r11.f1730e
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Error no points added to "
            r12.append(r0)
            java.lang.String r0 = r11.f1731f
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r12)
            return
        L1d:
            int[] r1 = r11.f1728c
            float[][] r2 = r11.f1729d
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.AbstractC0283s.k.m1555a(r1, r2, r4, r0)
            r0 = 1
            r1 = 0
        L29:
            int[] r2 = r11.f1728c
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = 1
        L3e:
            double[] r0 = new double[r1]
            r2 = 3
            r5 = 2
            int[] r6 = new int[r5]
            r6[r3] = r2
            r6[r4] = r1
            java.lang.Class<double> r1 = double.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
            double[][] r1 = (double[][]) r1
            r2 = 0
            r6 = 0
        L52:
            int r7 = r11.f1730e
            if (r2 >= r7) goto L93
            if (r2 <= 0) goto L63
            int[] r7 = r11.f1728c
            r8 = r7[r2]
            int r9 = r2 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L90
        L63:
            int[] r7 = r11.f1728c
            r7 = r7[r2]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f1729d
            r9 = r8[r2]
            r9 = r9[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r7 = r1[r6]
            r9 = r8[r2]
            r9 = r9[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r7 = r1[r6]
            r8 = r8[r2]
            r8 = r8[r5]
            double r8 = (double) r8
            r7[r5] = r8
            int r6 = r6 + 1
        L90:
            int r2 = r2 + 1
            goto L52
        L93:
            l.b r12 = p113l.AbstractC2826b.m9452a(r12, r0, r1)
            r11.f1726a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.AbstractC0283s.mo1552i(int):void");
    }

    public String toString() {
        String str = this.f1731f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f1730e; i4++) {
            str = str + "[" + this.f1728c[i4] + " , " + decimalFormat.format(this.f1729d[i4]) + "] ";
        }
        return str;
    }
}

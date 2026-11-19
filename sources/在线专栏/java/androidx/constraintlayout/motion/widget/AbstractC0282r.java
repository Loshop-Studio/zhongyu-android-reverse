package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0293a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import p113l.AbstractC2826b;

/* renamed from: androidx.constraintlayout.motion.widget.r */
/* loaded from: classes.dex */
public abstract class AbstractC0282r {

    /* renamed from: a */
    protected AbstractC2826b f1716a;

    /* renamed from: b */
    protected int[] f1717b = new int[10];

    /* renamed from: c */
    protected float[] f1718c = new float[10];

    /* renamed from: d */
    private int f1719d;

    /* renamed from: e */
    private String f1720e;

    /* renamed from: androidx.constraintlayout.motion.widget.r$a */
    static class a extends AbstractC0282r {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setAlpha(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$b */
    static class b extends AbstractC0282r {

        /* renamed from: f */
        String f1721f;

        /* renamed from: g */
        SparseArray<C0293a> f1722g;

        /* renamed from: h */
        float[] f1723h;

        public b(String str, SparseArray<C0293a> sparseArray) {
            this.f1721f = str.split(",")[1];
            this.f1722g = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: e */
        public void mo1535e(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            this.f1716a.mo9437e(f4, this.f1723h);
            this.f1722g.valueAt(0).m1638i(view, this.f1723h);
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: h */
        public void mo1538h(int i4) {
            int size = this.f1722g.size();
            int iM1637f = this.f1722g.valueAt(0).m1637f();
            double[] dArr = new double[size];
            this.f1723h = new float[iM1637f];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, iM1637f);
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f1722g.keyAt(i5);
                C0293a c0293aValueAt = this.f1722g.valueAt(i5);
                dArr[i5] = iKeyAt * 0.01d;
                c0293aValueAt.m1636e(this.f1723h);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f1723h.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f1716a = AbstractC2826b.m9452a(i4, dArr, dArr2);
        }

        /* renamed from: i */
        public void m1539i(int i4, C0293a c0293a) {
            this.f1722g.append(i4, c0293a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$c */
    static class c extends AbstractC0282r {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setElevation(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$d */
    static class d extends AbstractC0282r {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
        }

        /* renamed from: i */
        public void m1540i(View view, float f4, double d4, double d5) {
            view.setRotation(m1533a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$e */
    static class e extends AbstractC0282r {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setPivotX(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$f */
    static class f extends AbstractC0282r {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setPivotY(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$g */
    static class g extends AbstractC0282r {

        /* renamed from: f */
        boolean f1724f = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m1533a(f4));
                return;
            }
            if (this.f1724f) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f1724f = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m1533a(f4)));
                } catch (IllegalAccessException e4) {
                    Log.e("SplineSet", "unable to setProgress", e4);
                } catch (InvocationTargetException e5) {
                    Log.e("SplineSet", "unable to setProgress", e5);
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$h */
    static class h extends AbstractC0282r {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setRotation(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$i */
    static class i extends AbstractC0282r {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setRotationX(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$j */
    static class j extends AbstractC0282r {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setRotationY(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$k */
    static class k extends AbstractC0282r {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setScaleX(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$l */
    static class l extends AbstractC0282r {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setScaleY(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$m */
    private static class m {
        /* renamed from: a */
        static void m1541a(int[] iArr, float[] fArr, int i4, int i5) {
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
                    int iM1542b = m1542b(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iM1542b - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iM1542b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m1542b(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    m1543c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            m1543c(iArr, fArr, i7, i5);
            return i7;
        }

        /* renamed from: c */
        private static void m1543c(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$n */
    static class n extends AbstractC0282r {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setTranslationX(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$o */
    static class o extends AbstractC0282r {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setTranslationY(m1533a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$p */
    static class p extends AbstractC0282r {
        p() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0282r
        /* renamed from: f */
        public void mo1536f(View view, float f4) {
            view.setTranslationZ(m1533a(f4));
        }
    }

    /* renamed from: c */
    static AbstractC0282r m1531c(String str, SparseArray<C0293a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* renamed from: d */
    static AbstractC0282r m1532d(String str) {
        str.hashCode();
        switch (str) {
        }
        return new a();
    }

    /* renamed from: a */
    public float m1533a(float f4) {
        return (float) this.f1716a.mo9435c(f4, 0);
    }

    /* renamed from: b */
    public float m1534b(float f4) {
        return (float) this.f1716a.mo9438f(f4, 0);
    }

    /* renamed from: e */
    public void mo1535e(int i4, float f4) {
        int[] iArr = this.f1717b;
        if (iArr.length < this.f1719d + 1) {
            this.f1717b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1718c;
            this.f1718c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1717b;
        int i5 = this.f1719d;
        iArr2[i5] = i4;
        this.f1718c[i5] = f4;
        this.f1719d = i5 + 1;
    }

    /* renamed from: f */
    public abstract void mo1536f(View view, float f4);

    /* renamed from: g */
    public void m1537g(String str) {
        this.f1720e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1538h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1719d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f1717b
            float[] r2 = r9.f1718c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.AbstractC0282r.m.m1541a(r1, r2, r4, r0)
            r0 = 1
            r1 = 1
        L11:
            int r2 = r9.f1719d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f1717b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class<double> r1 = double.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = 0
            r3 = 0
        L37:
            int r5 = r9.f1719d
            if (r2 >= r5) goto L64
            if (r2 <= 0) goto L48
            int[] r5 = r9.f1717b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L61
        L48:
            int[] r5 = r9.f1717b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f1718c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L61:
            int r2 = r2 + 1
            goto L37
        L64:
            l.b r10 = p113l.AbstractC2826b.m9452a(r10, r0, r1)
            r9.f1716a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.AbstractC0282r.mo1538h(int):void");
    }

    public String toString() {
        String str = this.f1720e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f1719d; i4++) {
            str = str + "[" + this.f1717b[i4] + " , " + decimalFormat.format(this.f1718c[i4]) + "] ";
        }
        return str;
    }
}

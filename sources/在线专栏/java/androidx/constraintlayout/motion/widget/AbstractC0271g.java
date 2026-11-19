package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0293a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p113l.AbstractC2826b;
import p113l.C2830f;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* loaded from: classes.dex */
public abstract class AbstractC0271g {

    /* renamed from: a */
    private AbstractC2826b f1519a;

    /* renamed from: b */
    private d f1520b;

    /* renamed from: c */
    protected C0293a f1521c;

    /* renamed from: d */
    private String f1522d;

    /* renamed from: e */
    private int f1523e = 0;

    /* renamed from: f */
    public int f1524f = 0;

    /* renamed from: g */
    ArrayList<p> f1525g = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    class a implements Comparator<p> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p pVar, p pVar2) {
            return Integer.compare(pVar.f1542a, pVar2.f1542a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$b */
    static class b extends AbstractC0271g {
        b() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setAlpha(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$c */
    static class c extends AbstractC0271g {

        /* renamed from: h */
        float[] f1527h = new float[1];

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            this.f1527h[0] = m1339a(f4);
            this.f1521c.m1638i(view, this.f1527h);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$d */
    static class d {

        /* renamed from: a */
        private final int f1528a;

        /* renamed from: c */
        float[] f1530c;

        /* renamed from: d */
        double[] f1531d;

        /* renamed from: e */
        float[] f1532e;

        /* renamed from: f */
        float[] f1533f;

        /* renamed from: g */
        float[] f1534g;

        /* renamed from: h */
        int f1535h;

        /* renamed from: i */
        AbstractC2826b f1536i;

        /* renamed from: j */
        double[] f1537j;

        /* renamed from: k */
        double[] f1538k;

        /* renamed from: l */
        float f1539l;

        /* renamed from: b */
        C2830f f1529b = new C2830f();

        /* renamed from: m */
        public HashMap<String, C0293a> f1540m = new HashMap<>();

        d(int i4, int i5, int i6) {
            this.f1535h = i4;
            this.f1528a = i5;
            this.f1529b.m9467g(i4);
            this.f1530c = new float[i6];
            this.f1531d = new double[i6];
            this.f1532e = new float[i6];
            this.f1533f = new float[i6];
            this.f1534g = new float[i6];
        }

        /* renamed from: a */
        public double m1348a(float f4) {
            AbstractC2826b abstractC2826b = this.f1536i;
            if (abstractC2826b != null) {
                double d4 = f4;
                abstractC2826b.mo9439g(d4, this.f1538k);
                this.f1536i.mo9436d(d4, this.f1537j);
            } else {
                double[] dArr = this.f1538k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d5 = f4;
            double dM9465e = this.f1529b.m9465e(d5);
            double dM9464d = this.f1529b.m9464d(d5);
            double[] dArr2 = this.f1538k;
            return dArr2[0] + (dM9465e * dArr2[1]) + (dM9464d * this.f1537j[1]);
        }

        /* renamed from: b */
        public double m1349b(float f4) {
            AbstractC2826b abstractC2826b = this.f1536i;
            if (abstractC2826b != null) {
                abstractC2826b.mo9436d(f4, this.f1537j);
            } else {
                double[] dArr = this.f1537j;
                dArr[0] = this.f1533f[0];
                dArr[1] = this.f1530c[0];
            }
            return this.f1537j[0] + (this.f1529b.m9465e(f4) * this.f1537j[1]);
        }

        /* renamed from: c */
        public void m1350c(int i4, int i5, float f4, float f5, float f6) {
            this.f1531d[i4] = i5 / 100.0d;
            this.f1532e[i4] = f4;
            this.f1533f[i4] = f5;
            this.f1530c[i4] = f6;
        }

        /* renamed from: d */
        public void m1351d(float f4) {
            this.f1539l = f4;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, this.f1531d.length, 2);
            float[] fArr = this.f1530c;
            this.f1537j = new double[fArr.length + 1];
            this.f1538k = new double[fArr.length + 1];
            if (this.f1531d[0] > 0.0d) {
                this.f1529b.m9461a(0.0d, this.f1532e[0]);
            }
            double[] dArr2 = this.f1531d;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1529b.m9461a(1.0d, this.f1532e[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                dArr[i4][0] = this.f1533f[i4];
                int i5 = 0;
                while (true) {
                    if (i5 < this.f1530c.length) {
                        dArr[i5][1] = r4[i5];
                        i5++;
                    }
                }
                this.f1529b.m9461a(this.f1531d[i4], this.f1532e[i4]);
            }
            this.f1529b.m9466f();
            double[] dArr3 = this.f1531d;
            if (dArr3.length > 1) {
                this.f1536i = AbstractC2826b.m9452a(0, dArr3, dArr);
            } else {
                this.f1536i = null;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$e */
    static class e extends AbstractC0271g {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setElevation(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$f */
    static class f extends AbstractC0271g {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
        }

        /* renamed from: j */
        public void m1352j(View view, float f4, double d4, double d5) {
            view.setRotation(m1339a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$g */
    static class g extends AbstractC0271g {

        /* renamed from: h */
        boolean f1541h = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m1339a(f4));
                return;
            }
            if (this.f1541h) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f1541h = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m1339a(f4)));
                } catch (IllegalAccessException e4) {
                    Log.e("KeyCycleOscillator", "unable to setProgress", e4);
                } catch (InvocationTargetException e5) {
                    Log.e("KeyCycleOscillator", "unable to setProgress", e5);
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$h */
    static class h extends AbstractC0271g {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setRotation(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$i */
    static class i extends AbstractC0271g {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setRotationX(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$j */
    static class j extends AbstractC0271g {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setRotationY(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$k */
    static class k extends AbstractC0271g {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setScaleX(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$l */
    static class l extends AbstractC0271g {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setScaleY(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$m */
    static class m extends AbstractC0271g {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setTranslationX(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$n */
    static class n extends AbstractC0271g {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setTranslationY(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$o */
    static class o extends AbstractC0271g {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0271g
        /* renamed from: f */
        public void mo1343f(View view, float f4) {
            view.setTranslationZ(m1339a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$p */
    static class p {

        /* renamed from: a */
        int f1542a;

        /* renamed from: b */
        float f1543b;

        /* renamed from: c */
        float f1544c;

        /* renamed from: d */
        float f1545d;

        public p(int i4, float f4, float f5, float f6) {
            this.f1542a = i4;
            this.f1543b = f6;
            this.f1544c = f5;
            this.f1545d = f4;
        }
    }

    /* renamed from: c */
    static AbstractC0271g m1338c(String str) {
        if (str.startsWith("CUSTOM")) {
            return new c();
        }
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                return new g();
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new b();
            case "rotation":
                return new h();
            case "elevation":
                return new e();
            case "transitionPathRotate":
                return new f();
            case "alpha":
                return new b();
            case "waveOffset":
                return new b();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public float m1339a(float f4) {
        return (float) this.f1520b.m1349b(f4);
    }

    /* renamed from: b */
    public float m1340b(float f4) {
        return (float) this.f1520b.m1348a(f4);
    }

    /* renamed from: d */
    public void m1341d(int i4, int i5, int i6, float f4, float f5, float f6) {
        this.f1525g.add(new p(i4, f4, f5, f6));
        if (i6 != -1) {
            this.f1524f = i6;
        }
        this.f1523e = i5;
    }

    /* renamed from: e */
    public void m1342e(int i4, int i5, int i6, float f4, float f5, float f6, C0293a c0293a) {
        this.f1525g.add(new p(i4, f4, f5, f6));
        if (i6 != -1) {
            this.f1524f = i6;
        }
        this.f1523e = i5;
        this.f1521c = c0293a;
    }

    /* renamed from: f */
    public abstract void mo1343f(View view, float f4);

    /* renamed from: g */
    public void m1344g(String str) {
        this.f1522d = str;
    }

    @TargetApi(19)
    /* renamed from: h */
    public void m1345h(float f4) {
        int size = this.f1525g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f1525g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
        this.f1520b = new d(this.f1523e, this.f1524f, size);
        Iterator<p> it = this.f1525g.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            p next = it.next();
            float f5 = next.f1545d;
            dArr[i4] = f5 * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f6 = next.f1543b;
            dArr3[0] = f6;
            double[] dArr4 = dArr2[i4];
            float f7 = next.f1544c;
            dArr4[1] = f7;
            this.f1520b.m1350c(i4, next.f1542a, f5, f7, f6);
            i4++;
        }
        this.f1520b.m1351d(f4);
        this.f1519a = AbstractC2826b.m9452a(0, dArr, dArr2);
    }

    /* renamed from: i */
    public boolean m1346i() {
        return this.f1524f == 1;
    }

    public String toString() {
        String str = this.f1522d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<p> it = this.f1525g.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f1542a + " , " + decimalFormat.format(r3.f1543b) + "] ";
        }
        return str;
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0281q;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0294b;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.C0298f;
import androidx.constraintlayout.widget.C0299g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.InterfaceC0351n;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p113l.C2831g;
import p121n.C2865a;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2871g;
import p121n.C2872h;
import p121n.C2874j;
import p121n.C2876l;
import p121n.InterfaceC2873i;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC0351n {

    /* renamed from: R0 */
    public static boolean f1351R0;

    /* renamed from: A */
    private int f1352A;

    /* renamed from: A0 */
    protected boolean f1353A0;

    /* renamed from: B */
    int f1354B;

    /* renamed from: B0 */
    int f1355B0;

    /* renamed from: C */
    private int f1356C;

    /* renamed from: C0 */
    int f1357C0;

    /* renamed from: D */
    private int f1358D;

    /* renamed from: D0 */
    int f1359D0;

    /* renamed from: E */
    private int f1360E;

    /* renamed from: E0 */
    int f1361E0;

    /* renamed from: F */
    private boolean f1362F;

    /* renamed from: F0 */
    int f1363F0;

    /* renamed from: G */
    HashMap<View, C0278n> f1364G;

    /* renamed from: G0 */
    int f1365G0;

    /* renamed from: H */
    private long f1366H;

    /* renamed from: H0 */
    float f1367H0;

    /* renamed from: I */
    private float f1368I;

    /* renamed from: I0 */
    private C0269e f1369I0;

    /* renamed from: J */
    float f1370J;

    /* renamed from: J0 */
    private boolean f1371J0;

    /* renamed from: K */
    float f1372K;

    /* renamed from: K0 */
    private C0262h f1373K0;

    /* renamed from: L */
    private long f1374L;

    /* renamed from: L0 */
    EnumC0264j f1375L0;

    /* renamed from: M */
    float f1376M;

    /* renamed from: M0 */
    C0259e f1377M0;

    /* renamed from: N */
    private boolean f1378N;

    /* renamed from: N0 */
    private boolean f1379N0;

    /* renamed from: O0 */
    private RectF f1380O0;

    /* renamed from: P0 */
    private View f1381P0;

    /* renamed from: Q0 */
    ArrayList<Integer> f1382Q0;

    /* renamed from: S */
    boolean f1383S;

    /* renamed from: T */
    boolean f1384T;

    /* renamed from: U */
    private InterfaceC0263i f1385U;

    /* renamed from: V */
    private float f1386V;

    /* renamed from: W */
    private float f1387W;

    /* renamed from: a0 */
    int f1388a0;

    /* renamed from: b0 */
    C0258d f1389b0;

    /* renamed from: c0 */
    private boolean f1390c0;

    /* renamed from: d0 */
    private C2831g f1391d0;

    /* renamed from: e0 */
    private C0257c f1392e0;

    /* renamed from: f0 */
    private C0266b f1393f0;

    /* renamed from: g0 */
    boolean f1394g0;

    /* renamed from: h0 */
    int f1395h0;

    /* renamed from: i0 */
    int f1396i0;

    /* renamed from: j0 */
    int f1397j0;

    /* renamed from: k0 */
    int f1398k0;

    /* renamed from: l0 */
    boolean f1399l0;

    /* renamed from: m0 */
    float f1400m0;

    /* renamed from: n0 */
    float f1401n0;

    /* renamed from: o0 */
    long f1402o0;

    /* renamed from: p0 */
    float f1403p0;

    /* renamed from: q0 */
    private boolean f1404q0;

    /* renamed from: r0 */
    private ArrayList<MotionHelper> f1405r0;

    /* renamed from: s0 */
    private ArrayList<MotionHelper> f1406s0;

    /* renamed from: t0 */
    private ArrayList<InterfaceC0263i> f1407t0;

    /* renamed from: u0 */
    private int f1408u0;

    /* renamed from: v0 */
    private long f1409v0;

    /* renamed from: w0 */
    private float f1410w0;

    /* renamed from: x */
    C0281q f1411x;

    /* renamed from: x0 */
    private int f1412x0;

    /* renamed from: y */
    Interpolator f1413y;

    /* renamed from: y0 */
    private float f1414y0;

    /* renamed from: z */
    float f1415z;

    /* renamed from: z0 */
    boolean f1416z0;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class RunnableC0255a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1417a;

        RunnableC0255a(View view) {
            this.f1417a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1417a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    static /* synthetic */ class C0256b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1419a;

        static {
            int[] iArr = new int[EnumC0264j.values().length];
            f1419a = iArr;
            try {
                iArr[EnumC0264j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1419a[EnumC0264j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1419a[EnumC0264j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1419a[EnumC0264j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    class C0257c extends AbstractInterpolatorC0279o {

        /* renamed from: a */
        float f1420a = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: b */
        float f1421b = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: c */
        float f1422c;

        C0257c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractInterpolatorC0279o
        /* renamed from: a */
        public float mo1219a() {
            return MotionLayout.this.f1415z;
        }

        /* renamed from: b */
        public void m1220b(float f4, float f5, float f6) {
            this.f1420a = f4;
            this.f1421b = f5;
            this.f1422c = f6;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            float f6;
            float f7 = this.f1420a;
            if (f7 > IGoodView.DEFAULT_TO_ALPHA) {
                float f8 = this.f1422c;
                if (f7 / f8 < f4) {
                    f4 = f7 / f8;
                }
                MotionLayout.this.f1415z = f7 - (f8 * f4);
                f5 = (f7 * f4) - (((f8 * f4) * f4) / 2.0f);
                f6 = this.f1421b;
            } else {
                float f9 = this.f1422c;
                if ((-f7) / f9 < f4) {
                    f4 = (-f7) / f9;
                }
                MotionLayout.this.f1415z = (f9 * f4) + f7;
                f5 = (f7 * f4) + (((f9 * f4) * f4) / 2.0f);
                f6 = this.f1421b;
            }
            return f5 + f6;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    private class C0258d {

        /* renamed from: a */
        float[] f1424a;

        /* renamed from: b */
        int[] f1425b;

        /* renamed from: c */
        float[] f1426c;

        /* renamed from: d */
        Path f1427d;

        /* renamed from: e */
        Paint f1428e;

        /* renamed from: f */
        Paint f1429f;

        /* renamed from: g */
        Paint f1430g;

        /* renamed from: h */
        Paint f1431h;

        /* renamed from: i */
        Paint f1432i;

        /* renamed from: j */
        private float[] f1433j;

        /* renamed from: p */
        DashPathEffect f1439p;

        /* renamed from: q */
        int f1440q;

        /* renamed from: t */
        int f1443t;

        /* renamed from: k */
        final int f1434k = -21965;

        /* renamed from: l */
        final int f1435l = -2067046;

        /* renamed from: m */
        final int f1436m = -13391360;

        /* renamed from: n */
        final int f1437n = 1996488704;

        /* renamed from: o */
        final int f1438o = 10;

        /* renamed from: r */
        Rect f1441r = new Rect();

        /* renamed from: s */
        boolean f1442s = false;

        public C0258d() {
            this.f1443t = 1;
            Paint paint = new Paint();
            this.f1428e = paint;
            paint.setAntiAlias(true);
            this.f1428e.setColor(-21965);
            this.f1428e.setStrokeWidth(2.0f);
            this.f1428e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1429f = paint2;
            paint2.setAntiAlias(true);
            this.f1429f.setColor(-2067046);
            this.f1429f.setStrokeWidth(2.0f);
            this.f1429f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1430g = paint3;
            paint3.setAntiAlias(true);
            this.f1430g.setColor(-13391360);
            this.f1430g.setStrokeWidth(2.0f);
            this.f1430g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1431h = paint4;
            paint4.setAntiAlias(true);
            this.f1431h.setColor(-13391360);
            this.f1431h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1433j = new float[8];
            Paint paint5 = new Paint();
            this.f1432i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, IGoodView.DEFAULT_TO_ALPHA);
            this.f1439p = dashPathEffect;
            this.f1430g.setPathEffect(dashPathEffect);
            this.f1426c = new float[100];
            this.f1425b = new int[50];
            if (this.f1442s) {
                this.f1428e.setStrokeWidth(8.0f);
                this.f1432i.setStrokeWidth(8.0f);
                this.f1429f.setStrokeWidth(8.0f);
                this.f1443t = 4;
            }
        }

        /* renamed from: c */
        private void m1221c(Canvas canvas) {
            canvas.drawLines(this.f1424a, this.f1428e);
        }

        /* renamed from: d */
        private void m1222d(Canvas canvas) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f1440q; i4++) {
                int[] iArr = this.f1425b;
                if (iArr[i4] == 1) {
                    z3 = true;
                }
                if (iArr[i4] == 2) {
                    z4 = true;
                }
            }
            if (z3) {
                m1225g(canvas);
            }
            if (z4) {
                m1223e(canvas);
            }
        }

        /* renamed from: e */
        private void m1223e(Canvas canvas) {
            float[] fArr = this.f1424a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f4, f6), Math.max(f5, f7), Math.max(f4, f6), Math.max(f5, f7), this.f1430g);
            canvas.drawLine(Math.min(f4, f6), Math.min(f5, f7), Math.min(f4, f6), Math.max(f5, f7), this.f1430g);
        }

        /* renamed from: f */
        private void m1224f(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f1424a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float fMin = Math.min(f6, f8);
            float fMax = Math.max(f7, f9);
            float fMin2 = f4 - Math.min(f6, f8);
            float fMax2 = Math.max(f7, f9) - f5;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f8 - f6)) + 0.5d)) / 100.0f);
            m1232l(str, this.f1431h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f1441r.width() / 2)) + fMin, f5 - 20.0f, this.f1431h);
            canvas.drawLine(f4, f5, Math.min(f6, f8), f5, this.f1430g);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
            m1232l(str2, this.f1431h);
            canvas.drawText(str2, f4 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f1441r.height() / 2)), this.f1431h);
            canvas.drawLine(f4, f5, f4, Math.max(f7, f9), this.f1430g);
        }

        /* renamed from: g */
        private void m1225g(Canvas canvas) {
            float[] fArr = this.f1424a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1430g);
        }

        /* renamed from: h */
        private void m1226h(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f1424a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f6 - f8, f7 - f9);
            float f10 = f8 - f6;
            float f11 = f9 - f7;
            float f12 = (((f4 - f6) * f10) + ((f5 - f7) * f11)) / (fHypot * fHypot);
            float f13 = f6 + (f10 * f12);
            float f14 = f7 + (f12 * f11);
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f13, f14);
            float fHypot2 = (float) Math.hypot(f13 - f4, f14 - f5);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m1232l(str, this.f1431h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f1441r.width() / 2), -20.0f, this.f1431h);
            canvas.drawLine(f4, f5, f13, f14, this.f1430g);
        }

        /* renamed from: i */
        private void m1227i(Canvas canvas, float f4, float f5, int i4, int i5) {
            String str = "" + (((int) ((((f4 - (i4 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i4)) + 0.5d)) / 100.0f);
            m1232l(str, this.f1431h);
            canvas.drawText(str, ((f4 / 2.0f) - (this.f1441r.width() / 2)) + IGoodView.DEFAULT_TO_ALPHA, f5 - 20.0f, this.f1431h);
            canvas.drawLine(f4, f5, Math.min(IGoodView.DEFAULT_TO_ALPHA, 1.0f), f5, this.f1430g);
            String str2 = "" + (((int) ((((f5 - (i5 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i5)) + 0.5d)) / 100.0f);
            m1232l(str2, this.f1431h);
            canvas.drawText(str2, f4 + 5.0f, IGoodView.DEFAULT_TO_ALPHA - ((f5 / 2.0f) - (this.f1441r.height() / 2)), this.f1431h);
            canvas.drawLine(f4, f5, f4, Math.max(IGoodView.DEFAULT_TO_ALPHA, 1.0f), this.f1430g);
        }

        /* renamed from: j */
        private void m1228j(Canvas canvas, C0278n c0278n) {
            this.f1427d.reset();
            for (int i4 = 0; i4 <= 50; i4++) {
                c0278n.m1424e(i4 / 50, this.f1433j, 0);
                Path path = this.f1427d;
                float[] fArr = this.f1433j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1427d;
                float[] fArr2 = this.f1433j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1427d;
                float[] fArr3 = this.f1433j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1427d;
                float[] fArr4 = this.f1433j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1427d.close();
            }
            this.f1428e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1427d, this.f1428e);
            canvas.translate(-2.0f, -2.0f);
            this.f1428e.setColor(-65536);
            canvas.drawPath(this.f1427d, this.f1428e);
        }

        /* renamed from: k */
        private void m1229k(Canvas canvas, int i4, int i5, C0278n c0278n) {
            int width;
            int height;
            float f4;
            float f5;
            int i6;
            View view = c0278n.f1632a;
            if (view != null) {
                width = view.getWidth();
                height = c0278n.f1632a.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i7 = 1; i7 < i5 - 1; i7++) {
                if (i4 != 4 || this.f1425b[i7 - 1] != 0) {
                    float[] fArr = this.f1426c;
                    int i8 = i7 * 2;
                    float f6 = fArr[i8];
                    float f7 = fArr[i8 + 1];
                    this.f1427d.reset();
                    this.f1427d.moveTo(f6, f7 + 10.0f);
                    this.f1427d.lineTo(f6 + 10.0f, f7);
                    this.f1427d.lineTo(f6, f7 - 10.0f);
                    this.f1427d.lineTo(f6 - 10.0f, f7);
                    this.f1427d.close();
                    int i9 = i7 - 1;
                    c0278n.m1429k(i9);
                    if (i4 == 4) {
                        int[] iArr = this.f1425b;
                        if (iArr[i9] == 1) {
                            m1226h(canvas, f6 - IGoodView.DEFAULT_TO_ALPHA, f7 - IGoodView.DEFAULT_TO_ALPHA);
                        } else if (iArr[i9] == 2) {
                            m1224f(canvas, f6 - IGoodView.DEFAULT_TO_ALPHA, f7 - IGoodView.DEFAULT_TO_ALPHA);
                        } else {
                            if (iArr[i9] == 3) {
                                i6 = 3;
                                f4 = f7;
                                f5 = f6;
                                m1227i(canvas, f6 - IGoodView.DEFAULT_TO_ALPHA, f7 - IGoodView.DEFAULT_TO_ALPHA, width, height);
                            }
                            canvas.drawPath(this.f1427d, this.f1432i);
                        }
                        f4 = f7;
                        f5 = f6;
                        i6 = 3;
                        canvas.drawPath(this.f1427d, this.f1432i);
                    } else {
                        f4 = f7;
                        f5 = f6;
                        i6 = 3;
                    }
                    if (i4 == 2) {
                        m1226h(canvas, f5 - IGoodView.DEFAULT_TO_ALPHA, f4 - IGoodView.DEFAULT_TO_ALPHA);
                    }
                    if (i4 == i6) {
                        m1224f(canvas, f5 - IGoodView.DEFAULT_TO_ALPHA, f4 - IGoodView.DEFAULT_TO_ALPHA);
                    }
                    if (i4 == 6) {
                        m1227i(canvas, f5 - IGoodView.DEFAULT_TO_ALPHA, f4 - IGoodView.DEFAULT_TO_ALPHA, width, height);
                    }
                    canvas.drawPath(this.f1427d, this.f1432i);
                }
            }
            float[] fArr2 = this.f1424a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1429f);
                float[] fArr3 = this.f1424a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1429f);
            }
        }

        /* renamed from: a */
        public void m1230a(Canvas canvas, HashMap<View, C0278n> map, int i4, int i5) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i5 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1356C) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f1431h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f1428e);
            }
            for (C0278n c0278n : map.values()) {
                int iM1426h = c0278n.m1426h();
                if (i5 > 0 && iM1426h == 0) {
                    iM1426h = 1;
                }
                if (iM1426h != 0) {
                    this.f1440q = c0278n.m1422c(this.f1426c, this.f1425b);
                    if (iM1426h >= 1) {
                        int i6 = i4 / 16;
                        float[] fArr = this.f1424a;
                        if (fArr == null || fArr.length != i6 * 2) {
                            this.f1424a = new float[i6 * 2];
                            this.f1427d = new Path();
                        }
                        int i7 = this.f1443t;
                        canvas.translate(i7, i7);
                        this.f1428e.setColor(1996488704);
                        this.f1432i.setColor(1996488704);
                        this.f1429f.setColor(1996488704);
                        this.f1430g.setColor(1996488704);
                        c0278n.m1423d(this.f1424a, i6);
                        m1231b(canvas, iM1426h, this.f1440q, c0278n);
                        this.f1428e.setColor(-21965);
                        this.f1429f.setColor(-2067046);
                        this.f1432i.setColor(-2067046);
                        this.f1430g.setColor(-13391360);
                        int i8 = this.f1443t;
                        canvas.translate(-i8, -i8);
                        m1231b(canvas, iM1426h, this.f1440q, c0278n);
                        if (iM1426h == 5) {
                            m1228j(canvas, c0278n);
                        }
                    }
                }
            }
            canvas.restore();
        }

        /* renamed from: b */
        public void m1231b(Canvas canvas, int i4, int i5, C0278n c0278n) {
            if (i4 == 4) {
                m1222d(canvas);
            }
            if (i4 == 2) {
                m1225g(canvas);
            }
            if (i4 == 3) {
                m1223e(canvas);
            }
            m1221c(canvas);
            m1229k(canvas, i4, i5, c0278n);
        }

        /* renamed from: l */
        void m1232l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1441r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    class C0259e {

        /* renamed from: a */
        C2870f f1445a = new C2870f();

        /* renamed from: b */
        C2870f f1446b = new C2870f();

        /* renamed from: c */
        C0295c f1447c = null;

        /* renamed from: d */
        C0295c f1448d = null;

        /* renamed from: e */
        int f1449e;

        /* renamed from: f */
        int f1450f;

        C0259e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i */
        private void m1233i(C2870f c2870f, C0295c c0295c) {
            SparseArray<C2869e> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, c2870f);
            sparseArray.put(MotionLayout.this.getId(), c2870f);
            Iterator<C2869e> it = c2870f.m9884L0().iterator();
            while (it.hasNext()) {
                C2869e next = it.next();
                sparseArray.put(((View) next.m9753r()).getId(), next);
            }
            Iterator<C2869e> it2 = c2870f.m9884L0().iterator();
            while (it2.hasNext()) {
                C2869e next2 = it2.next();
                View view = (View) next2.m9753r();
                c0295c.m1660g(view.getId(), layoutParams);
                next2.m9702F0(c0295c.m1670t(view.getId()));
                next2.m9737i0(c0295c.m1665o(view.getId()));
                if (view instanceof ConstraintHelper) {
                    c0295c.m1658e((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).m1600u();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.m1607b(false, view, next2, layoutParams, sparseArray);
                if (c0295c.m1669s(view.getId()) == 1) {
                    next2.m9700E0(view.getVisibility());
                } else {
                    next2.m9700E0(c0295c.m1668r(view.getId()));
                }
            }
            Iterator<C2869e> it3 = c2870f.m9884L0().iterator();
            while (it3.hasNext()) {
                C2869e next3 = it3.next();
                if (next3 instanceof C2876l) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) next3.m9753r();
                    InterfaceC2873i interfaceC2873i = (InterfaceC2873i) next3;
                    constraintHelper.m1599t(c2870f, interfaceC2873i, sparseArray);
                    ((C2876l) interfaceC2873i).m9865M0();
                }
            }
        }

        /* renamed from: a */
        public void m1234a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1364G.clear();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = MotionLayout.this.getChildAt(i4);
                MotionLayout.this.f1364G.put(childAt, new C0278n(childAt));
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = MotionLayout.this.getChildAt(i5);
                C0278n c0278n = MotionLayout.this.f1364G.get(childAt2);
                if (c0278n != null) {
                    if (this.f1447c != null) {
                        C2869e c2869eM1236c = m1236c(this.f1445a, childAt2);
                        if (c2869eM1236c != null) {
                            c0278n.m1435t(c2869eM1236c, this.f1447c);
                        } else if (MotionLayout.this.f1388a0 != 0) {
                            Log.e("MotionLayout", C0265a.m1255a() + "no widget for  " + C0265a.m1257c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f1448d != null) {
                        C2869e c2869eM1236c2 = m1236c(this.f1446b, childAt2);
                        if (c2869eM1236c2 != null) {
                            c0278n.m1432q(c2869eM1236c2, this.f1448d);
                        } else if (MotionLayout.this.f1388a0 != 0) {
                            Log.e("MotionLayout", C0265a.m1255a() + "no widget for  " + C0265a.m1257c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        void m1235b(C2870f c2870f, C2870f c2870f2) {
            ArrayList<C2869e> arrayListM9884L0 = c2870f.m9884L0();
            HashMap<C2869e, C2869e> map = new HashMap<>();
            map.put(c2870f, c2870f2);
            c2870f2.m9884L0().clear();
            c2870f2.mo9668l(c2870f, map);
            Iterator<C2869e> it = arrayListM9884L0.iterator();
            while (it.hasNext()) {
                C2869e next = it.next();
                C2869e c2865a = next instanceof C2865a ? new C2865a() : next instanceof C2872h ? new C2872h() : next instanceof C2871g ? new C2871g() : next instanceof InterfaceC2873i ? new C2874j() : new C2869e();
                c2870f2.m9887b(c2865a);
                map.put(next, c2865a);
            }
            Iterator<C2869e> it2 = arrayListM9884L0.iterator();
            while (it2.hasNext()) {
                C2869e next2 = it2.next();
                map.get(next2).mo9668l(next2, map);
            }
        }

        /* renamed from: c */
        C2869e m1236c(C2870f c2870f, View view) {
            if (c2870f.m9753r() == view) {
                return c2870f;
            }
            ArrayList<C2869e> arrayListM9884L0 = c2870f.m9884L0();
            int size = arrayListM9884L0.size();
            for (int i4 = 0; i4 < size; i4++) {
                C2869e c2869e = arrayListM9884L0.get(i4);
                if (c2869e.m9753r() == view) {
                    return c2869e;
                }
            }
            return null;
        }

        /* renamed from: d */
        void m1237d(C2870f c2870f, C0295c c0295c, C0295c c0295c2) {
            this.f1447c = c0295c;
            this.f1448d = c0295c2;
            this.f1445a = new C2870f();
            this.f1446b = new C2870f();
            this.f1445a.m9790h1(((ConstraintLayout) MotionLayout.this).f1829c.m9780W0());
            this.f1446b.m9790h1(((ConstraintLayout) MotionLayout.this).f1829c.m9780W0());
            this.f1445a.m9886O0();
            this.f1446b.m9886O0();
            m1235b(((ConstraintLayout) MotionLayout.this).f1829c, this.f1445a);
            m1235b(((ConstraintLayout) MotionLayout.this).f1829c, this.f1446b);
            if (MotionLayout.this.f1372K > 0.5d) {
                if (c0295c != null) {
                    m1233i(this.f1445a, c0295c);
                }
                m1233i(this.f1446b, c0295c2);
            } else {
                m1233i(this.f1446b, c0295c2);
                if (c0295c != null) {
                    m1233i(this.f1445a, c0295c);
                }
            }
            this.f1445a.m9792j1(MotionLayout.this.m1613j());
            this.f1445a.m9794l1();
            this.f1446b.m9792j1(MotionLayout.this.m1613j());
            this.f1446b.m9794l1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C2870f c2870f2 = this.f1445a;
                    C2869e.b bVar = C2869e.b.WRAP_CONTENT;
                    c2870f2.m9744m0(bVar);
                    this.f1446b.m9744m0(bVar);
                }
                if (layoutParams.height == -2) {
                    C2870f c2870f3 = this.f1445a;
                    C2869e.b bVar2 = C2869e.b.WRAP_CONTENT;
                    c2870f3.m9694B0(bVar2);
                    this.f1446b.m9694B0(bVar2);
                }
            }
        }

        /* renamed from: e */
        public boolean m1238e(int i4, int i5) {
            return (i4 == this.f1449e && i5 == this.f1450f) ? false : true;
        }

        /* renamed from: f */
        public void m1239f(int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f1363F0 = mode;
            motionLayout.f1365G0 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.f1354B == motionLayout2.getStartState()) {
                MotionLayout.this.m1615n(this.f1446b, optimizationLevel, i4, i5);
                if (this.f1447c != null) {
                    MotionLayout.this.m1615n(this.f1445a, optimizationLevel, i4, i5);
                }
            } else {
                if (this.f1447c != null) {
                    MotionLayout.this.m1615n(this.f1445a, optimizationLevel, i4, i5);
                }
                MotionLayout.this.m1615n(this.f1446b, optimizationLevel, i4, i5);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.f1363F0 = mode;
                motionLayout3.f1365G0 = mode2;
                if (motionLayout3.f1354B == motionLayout3.getStartState()) {
                    MotionLayout.this.m1615n(this.f1446b, optimizationLevel, i4, i5);
                    if (this.f1447c != null) {
                        MotionLayout.this.m1615n(this.f1445a, optimizationLevel, i4, i5);
                    }
                } else {
                    if (this.f1447c != null) {
                        MotionLayout.this.m1615n(this.f1445a, optimizationLevel, i4, i5);
                    }
                    MotionLayout.this.m1615n(this.f1446b, optimizationLevel, i4, i5);
                }
                MotionLayout.this.f1355B0 = this.f1445a.m9718Q();
                MotionLayout.this.f1357C0 = this.f1445a.m9763w();
                MotionLayout.this.f1359D0 = this.f1446b.m9718Q();
                MotionLayout.this.f1361E0 = this.f1446b.m9763w();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.f1353A0 = (motionLayout4.f1355B0 == motionLayout4.f1359D0 && motionLayout4.f1357C0 == motionLayout4.f1361E0) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i6 = motionLayout5.f1355B0;
            int i7 = motionLayout5.f1357C0;
            int i8 = motionLayout5.f1363F0;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                i6 = (int) (i6 + (motionLayout5.f1367H0 * (motionLayout5.f1359D0 - i6)));
            }
            int i9 = motionLayout5.f1365G0;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) (i7 + (motionLayout5.f1367H0 * (motionLayout5.f1361E0 - i7)));
            }
            MotionLayout.this.m1614m(i4, i5, i6, i7, this.f1445a.m9787d1() || this.f1446b.m9787d1(), this.f1445a.m9785b1() || this.f1446b.m9785b1());
        }

        /* renamed from: g */
        public void m1240g() {
            m1239f(MotionLayout.this.f1358D, MotionLayout.this.f1360E);
            MotionLayout.this.m1190k0();
        }

        /* renamed from: h */
        public void m1241h(int i4, int i5) {
            this.f1449e = i4;
            this.f1450f = i5;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    protected interface InterfaceC0260f {
        /* renamed from: a */
        void mo1242a(MotionEvent motionEvent);

        /* renamed from: b */
        float mo1243b();

        /* renamed from: c */
        float mo1244c();

        /* renamed from: d */
        void mo1245d(int i4);

        void recycle();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    private static class C0261g implements InterfaceC0260f {

        /* renamed from: b */
        private static C0261g f1452b = new C0261g();

        /* renamed from: a */
        VelocityTracker f1453a;

        private C0261g() {
        }

        /* renamed from: e */
        public static C0261g m1246e() {
            f1452b.f1453a = VelocityTracker.obtain();
            return f1452b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0260f
        /* renamed from: a */
        public void mo1242a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1453a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0260f
        /* renamed from: b */
        public float mo1243b() {
            return this.f1453a.getYVelocity();
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0260f
        /* renamed from: c */
        public float mo1244c() {
            return this.f1453a.getXVelocity();
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0260f
        /* renamed from: d */
        public void mo1245d(int i4) {
            this.f1453a.computeCurrentVelocity(i4);
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0260f
        public void recycle() {
            this.f1453a.recycle();
            this.f1453a = null;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    class C0262h {

        /* renamed from: a */
        float f1454a = Float.NaN;

        /* renamed from: b */
        float f1455b = Float.NaN;

        /* renamed from: c */
        int f1456c = -1;

        /* renamed from: d */
        int f1457d = -1;

        /* renamed from: e */
        final String f1458e = "motion.progress";

        /* renamed from: f */
        final String f1459f = "motion.velocity";

        /* renamed from: g */
        final String f1460g = "motion.StartState";

        /* renamed from: h */
        final String f1461h = "motion.EndState";

        C0262h() {
        }

        /* renamed from: a */
        void m1247a() {
            int i4 = this.f1456c;
            if (i4 != -1 || this.f1457d != -1) {
                if (i4 == -1) {
                    MotionLayout.this.m1217o0(this.f1457d);
                } else {
                    int i5 = this.f1457d;
                    if (i5 == -1) {
                        MotionLayout.this.m1211i0(i4, -1, -1);
                    } else {
                        MotionLayout.this.m1212j0(i4, i5);
                    }
                }
                MotionLayout.this.setState(EnumC0264j.SETUP);
            }
            if (Float.isNaN(this.f1455b)) {
                if (Float.isNaN(this.f1454a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f1454a);
            } else {
                MotionLayout.this.m1210h0(this.f1454a, this.f1455b);
                this.f1454a = Float.NaN;
                this.f1455b = Float.NaN;
                this.f1456c = -1;
                this.f1457d = -1;
            }
        }

        /* renamed from: b */
        public Bundle m1248b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1454a);
            bundle.putFloat("motion.velocity", this.f1455b);
            bundle.putInt("motion.StartState", this.f1456c);
            bundle.putInt("motion.EndState", this.f1457d);
            return bundle;
        }

        /* renamed from: c */
        public void m1249c() {
            this.f1457d = MotionLayout.this.f1356C;
            this.f1456c = MotionLayout.this.f1352A;
            this.f1455b = MotionLayout.this.getVelocity();
            this.f1454a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void m1250d(int i4) {
            this.f1457d = i4;
        }

        /* renamed from: e */
        public void m1251e(float f4) {
            this.f1454a = f4;
        }

        /* renamed from: f */
        public void m1252f(int i4) {
            this.f1456c = i4;
        }

        /* renamed from: g */
        public void m1253g(Bundle bundle) {
            this.f1454a = bundle.getFloat("motion.progress");
            this.f1455b = bundle.getFloat("motion.velocity");
            this.f1456c = bundle.getInt("motion.StartState");
            this.f1457d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void m1254h(float f4) {
            this.f1455b = f4;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface InterfaceC0263i {
        /* renamed from: a */
        void mo1160a(MotionLayout motionLayout, int i4, int i5, float f4);

        /* renamed from: b */
        void mo1161b(MotionLayout motionLayout, int i4, int i5);

        /* renamed from: c */
        void mo1162c(MotionLayout motionLayout, int i4, boolean z3, float f4);

        /* renamed from: d */
        void mo1163d(MotionLayout motionLayout, int i4);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    enum EnumC0264j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1415z = IGoodView.DEFAULT_TO_ALPHA;
        this.f1352A = -1;
        this.f1354B = -1;
        this.f1356C = -1;
        this.f1358D = 0;
        this.f1360E = 0;
        this.f1362F = true;
        this.f1364G = new HashMap<>();
        this.f1366H = 0L;
        this.f1368I = 1.0f;
        this.f1370J = IGoodView.DEFAULT_TO_ALPHA;
        this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
        this.f1376M = IGoodView.DEFAULT_TO_ALPHA;
        this.f1383S = false;
        this.f1384T = false;
        this.f1388a0 = 0;
        this.f1390c0 = false;
        this.f1391d0 = new C2831g();
        this.f1392e0 = new C0257c();
        this.f1394g0 = true;
        this.f1399l0 = false;
        this.f1404q0 = false;
        this.f1405r0 = null;
        this.f1406s0 = null;
        this.f1407t0 = null;
        this.f1408u0 = 0;
        this.f1409v0 = -1L;
        this.f1410w0 = IGoodView.DEFAULT_TO_ALPHA;
        this.f1412x0 = 0;
        this.f1414y0 = IGoodView.DEFAULT_TO_ALPHA;
        this.f1416z0 = false;
        this.f1353A0 = false;
        this.f1369I0 = new C0269e();
        this.f1371J0 = false;
        this.f1375L0 = EnumC0264j.UNDEFINED;
        this.f1377M0 = new C0259e();
        this.f1379N0 = false;
        this.f1380O0 = new RectF();
        this.f1381P0 = null;
        this.f1382Q0 = new ArrayList<>();
        m1187b0(attributeSet);
    }

    /* renamed from: O */
    private void m1180O() {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iM1494x = c0281q.m1494x();
        C0281q c0281q2 = this.f1411x;
        m1181P(iM1494x, c0281q2.m1481i(c0281q2.m1494x()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C0281q.b> it = this.f1411x.m1484l().iterator();
        while (it.hasNext()) {
            C0281q.b next = it.next();
            if (next == this.f1411x.f1676c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            m1182Q(next);
            int iM1518A = next.m1518A();
            int iM1526y = next.m1526y();
            String strM1256b = C0265a.m1256b(getContext(), iM1518A);
            String strM1256b2 = C0265a.m1256b(getContext(), iM1526y);
            if (sparseIntArray.get(iM1518A) == iM1526y) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strM1256b + "->" + strM1256b2);
            }
            if (sparseIntArray2.get(iM1526y) == iM1518A) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strM1256b + "->" + strM1256b2);
            }
            sparseIntArray.put(iM1518A, iM1526y);
            sparseIntArray2.put(iM1526y, iM1518A);
            if (this.f1411x.m1481i(iM1518A) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + strM1256b);
            }
            if (this.f1411x.m1481i(iM1526y) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + strM1256b);
            }
        }
    }

    /* renamed from: P */
    private void m1181P(int i4, C0295c c0295c) {
        String strM1256b = C0265a.m1256b(getContext(), i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + strM1256b + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (c0295c.m1664n(id) == null) {
                Log.w("MotionLayout", "CHECK: " + strM1256b + " NO CONSTRAINTS for " + C0265a.m1257c(childAt));
            }
        }
        int[] iArrM1666p = c0295c.m1666p();
        for (int i6 = 0; i6 < iArrM1666p.length; i6++) {
            int i7 = iArrM1666p[i6];
            String strM1256b2 = C0265a.m1256b(getContext(), i7);
            if (findViewById(iArrM1666p[i6]) == null) {
                Log.w("MotionLayout", "CHECK: " + strM1256b + " NO View matches id " + strM1256b2);
            }
            if (c0295c.m1665o(i7) == -1) {
                Log.w("MotionLayout", "CHECK: " + strM1256b + "(" + strM1256b2 + ") no LAYOUT_HEIGHT");
            }
            if (c0295c.m1670t(i7) == -1) {
                Log.w("MotionLayout", "CHECK: " + strM1256b + "(" + strM1256b2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: Q */
    private void m1182Q(C0281q.b bVar) {
        Log.v("MotionLayout", "CHECK: transition = " + bVar.m1524u(getContext()));
        Log.v("MotionLayout", "CHECK: transition.setDuration = " + bVar.m1525x());
        if (bVar.m1518A() == bVar.m1526y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* renamed from: R */
    private void m1183R() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0278n c0278n = this.f1364G.get(childAt);
            if (c0278n != null) {
                c0278n.m1434s(childAt);
            }
        }
    }

    /* renamed from: T */
    private void m1184T() {
        boolean z3;
        float fSignum = Math.signum(this.f1376M - this.f1372K);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1413y;
        float interpolation = this.f1372K + (!(interpolator instanceof C2831g) ? (((nanoTime - this.f1374L) * fSignum) * 1.0E-9f) / this.f1368I : IGoodView.DEFAULT_TO_ALPHA);
        if (this.f1378N) {
            interpolation = this.f1376M;
        }
        if ((fSignum <= IGoodView.DEFAULT_TO_ALPHA || interpolation < this.f1376M) && (fSignum > IGoodView.DEFAULT_TO_ALPHA || interpolation > this.f1376M)) {
            z3 = false;
        } else {
            interpolation = this.f1376M;
            z3 = true;
        }
        if (interpolator != null && !z3) {
            interpolation = this.f1390c0 ? interpolator.getInterpolation((nanoTime - this.f1366H) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > IGoodView.DEFAULT_TO_ALPHA && interpolation >= this.f1376M) || (fSignum <= IGoodView.DEFAULT_TO_ALPHA && interpolation <= this.f1376M)) {
            interpolation = this.f1376M;
        }
        this.f1367H0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0278n c0278n = this.f1364G.get(childAt);
            if (c0278n != null) {
                c0278n.m1431o(childAt, interpolation, nanoTime2, this.f1369I0);
            }
        }
        if (this.f1353A0) {
            requestLayout();
        }
    }

    /* renamed from: U */
    private void m1185U() {
        ArrayList<InterfaceC0263i> arrayList;
        if ((this.f1385U == null && ((arrayList = this.f1407t0) == null || arrayList.isEmpty())) || this.f1414y0 == this.f1370J) {
            return;
        }
        if (this.f1412x0 != -1) {
            InterfaceC0263i interfaceC0263i = this.f1385U;
            if (interfaceC0263i != null) {
                interfaceC0263i.mo1161b(this, this.f1352A, this.f1356C);
            }
            ArrayList<InterfaceC0263i> arrayList2 = this.f1407t0;
            if (arrayList2 != null) {
                Iterator<InterfaceC0263i> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo1161b(this, this.f1352A, this.f1356C);
                }
            }
            this.f1416z0 = true;
        }
        this.f1412x0 = -1;
        float f4 = this.f1370J;
        this.f1414y0 = f4;
        InterfaceC0263i interfaceC0263i2 = this.f1385U;
        if (interfaceC0263i2 != null) {
            interfaceC0263i2.mo1160a(this, this.f1352A, this.f1356C, f4);
        }
        ArrayList<InterfaceC0263i> arrayList3 = this.f1407t0;
        if (arrayList3 != null) {
            Iterator<InterfaceC0263i> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo1160a(this, this.f1352A, this.f1356C, this.f1370J);
            }
        }
        this.f1416z0 = true;
    }

    /* renamed from: a0 */
    private boolean m1186a0(float f4, float f5, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (m1186a0(view.getLeft() + f4, view.getTop() + f5, viewGroup.getChildAt(i4), motionEvent)) {
                    return true;
                }
            }
        }
        this.f1380O0.set(view.getLeft() + f4, view.getTop() + f5, f4 + view.getRight(), f5 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f1380O0.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private void m1187b0(AttributeSet attributeSet) {
        C0281q c0281q;
        f1351R0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2151H6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z3 = true;
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2178K6) {
                    this.f1411x = new C0281q(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0298f.f2169J6) {
                    this.f1354B = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0298f.f2196M6) {
                    this.f1376M = typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA);
                    this.f1383S = true;
                } else if (index == C0298f.f2160I6) {
                    z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                } else if (index == C0298f.f2205N6) {
                    if (this.f1388a0 == 0) {
                        this.f1388a0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0298f.f2187L6) {
                    this.f1388a0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f1411x == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z3) {
                this.f1411x = null;
            }
        }
        if (this.f1388a0 != 0) {
            m1180O();
        }
        if (this.f1354B != -1 || (c0281q = this.f1411x) == null) {
            return;
        }
        this.f1354B = c0281q.m1494x();
        this.f1352A = this.f1411x.m1494x();
        this.f1356C = this.f1411x.m1486n();
    }

    /* renamed from: e0 */
    private void m1188e0() {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            return;
        }
        if (c0281q.m1478f(this, this.f1354B)) {
            requestLayout();
            return;
        }
        int i4 = this.f1354B;
        if (i4 != -1) {
            this.f1411x.m1477e(this, i4);
        }
        if (this.f1411x.m1476Q()) {
            this.f1411x.m1475O();
        }
    }

    /* renamed from: f0 */
    private void m1189f0() {
        ArrayList<InterfaceC0263i> arrayList;
        if (this.f1385U == null && ((arrayList = this.f1407t0) == null || arrayList.isEmpty())) {
            return;
        }
        this.f1416z0 = false;
        Iterator<Integer> it = this.f1382Q0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            InterfaceC0263i interfaceC0263i = this.f1385U;
            if (interfaceC0263i != null) {
                interfaceC0263i.mo1163d(this, next.intValue());
            }
            ArrayList<InterfaceC0263i> arrayList2 = this.f1407t0;
            if (arrayList2 != null) {
                Iterator<InterfaceC0263i> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo1163d(this, next.intValue());
                }
            }
        }
        this.f1382Q0.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m1190k0() {
        int childCount = getChildCount();
        this.f1377M0.m1234a();
        boolean z3 = true;
        this.f1383S = true;
        int width = getWidth();
        int height = getHeight();
        int iM1480h = this.f1411x.m1480h();
        int i4 = 0;
        if (iM1480h != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                C0278n c0278n = this.f1364G.get(getChildAt(i5));
                if (c0278n != null) {
                    c0278n.m1433r(iM1480h);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            C0278n c0278n2 = this.f1364G.get(getChildAt(i6));
            if (c0278n2 != null) {
                this.f1411x.m1488q(c0278n2);
                c0278n2.m1437v(width, height, this.f1368I, getNanoTime());
            }
        }
        float fM1493w = this.f1411x.m1493w();
        if (fM1493w != IGoodView.DEFAULT_TO_ALPHA) {
            boolean z4 = ((double) fM1493w) < 0.0d;
            float fAbs = Math.abs(fM1493w);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            int i7 = 0;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            while (true) {
                if (i7 >= childCount) {
                    z3 = false;
                    break;
                }
                C0278n c0278n3 = this.f1364G.get(getChildAt(i7));
                if (!Float.isNaN(c0278n3.f1642k)) {
                    break;
                }
                float fM1427i = c0278n3.m1427i();
                float fM1428j = c0278n3.m1428j();
                float f4 = z4 ? fM1428j - fM1427i : fM1428j + fM1427i;
                fMin2 = Math.min(fMin2, f4);
                fMax2 = Math.max(fMax2, f4);
                i7++;
            }
            if (!z3) {
                while (i4 < childCount) {
                    C0278n c0278n4 = this.f1364G.get(getChildAt(i4));
                    float fM1427i2 = c0278n4.m1427i();
                    float fM1428j2 = c0278n4.m1428j();
                    float f5 = z4 ? fM1428j2 - fM1427i2 : fM1428j2 + fM1427i2;
                    c0278n4.f1644m = 1.0f / (1.0f - fAbs);
                    c0278n4.f1643l = fAbs - (((f5 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i4++;
                }
                return;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                C0278n c0278n5 = this.f1364G.get(getChildAt(i8));
                if (!Float.isNaN(c0278n5.f1642k)) {
                    fMin = Math.min(fMin, c0278n5.f1642k);
                    fMax = Math.max(fMax, c0278n5.f1642k);
                }
            }
            while (i4 < childCount) {
                C0278n c0278n6 = this.f1364G.get(getChildAt(i4));
                if (!Float.isNaN(c0278n6.f1642k)) {
                    c0278n6.f1644m = 1.0f / (1.0f - fAbs);
                    if (z4) {
                        c0278n6.f1643l = fAbs - (((fMax - c0278n6.f1642k) / (fMax - fMin)) * fAbs);
                    } else {
                        c0278n6.f1643l = fAbs - (((c0278n6.f1642k - fMin) * fAbs) / (fMax - fMin));
                    }
                }
                i4++;
            }
        }
    }

    /* renamed from: q0 */
    private static boolean m1191q0(float f4, float f5, float f6) {
        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
            float f7 = f4 / f6;
            return f5 + ((f4 * f7) - (((f6 * f7) * f7) / 2.0f)) > 1.0f;
        }
        float f8 = (-f4) / f6;
        return f5 + ((f4 * f8) + (((f6 * f8) * f8) / 2.0f)) < IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: N */
    void m1200N(float f4) {
        if (this.f1411x == null) {
            return;
        }
        float f5 = this.f1372K;
        float f6 = this.f1370J;
        if (f5 != f6 && this.f1378N) {
            this.f1372K = f6;
        }
        float f7 = this.f1372K;
        if (f7 == f4) {
            return;
        }
        this.f1390c0 = false;
        this.f1376M = f4;
        this.f1368I = r0.m1485m() / 1000.0f;
        setProgress(this.f1376M);
        this.f1413y = this.f1411x.m1487p();
        this.f1378N = false;
        this.f1366H = getNanoTime();
        this.f1383S = true;
        this.f1370J = f7;
        this.f1372K = f7;
        invalidate();
    }

    /* renamed from: S */
    void m1201S(boolean z3) {
        float f4;
        boolean z4;
        int i4;
        float interpolation;
        boolean z5;
        if (this.f1374L == -1) {
            this.f1374L = getNanoTime();
        }
        float f5 = this.f1372K;
        if (f5 > IGoodView.DEFAULT_TO_ALPHA && f5 < 1.0f) {
            this.f1354B = -1;
        }
        boolean z6 = false;
        if (this.f1404q0 || (this.f1383S && (z3 || this.f1376M != f5))) {
            float fSignum = Math.signum(this.f1376M - f5);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f1413y;
            if (interpolator instanceof AbstractInterpolatorC0279o) {
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            } else {
                f4 = (((nanoTime - this.f1374L) * fSignum) * 1.0E-9f) / this.f1368I;
                this.f1415z = f4;
            }
            float f6 = this.f1372K + f4;
            if (this.f1378N) {
                f6 = this.f1376M;
            }
            if ((fSignum <= IGoodView.DEFAULT_TO_ALPHA || f6 < this.f1376M) && (fSignum > IGoodView.DEFAULT_TO_ALPHA || f6 > this.f1376M)) {
                z4 = false;
            } else {
                f6 = this.f1376M;
                this.f1383S = false;
                z4 = true;
            }
            this.f1372K = f6;
            this.f1370J = f6;
            this.f1374L = nanoTime;
            if (interpolator != null && !z4) {
                if (this.f1390c0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f1366H) * 1.0E-9f);
                    this.f1372K = interpolation;
                    this.f1374L = nanoTime;
                    Interpolator interpolator2 = this.f1413y;
                    if (interpolator2 instanceof AbstractInterpolatorC0279o) {
                        float fMo1219a = ((AbstractInterpolatorC0279o) interpolator2).mo1219a();
                        this.f1415z = fMo1219a;
                        if (Math.abs(fMo1219a) * this.f1368I <= 1.0E-5f) {
                            this.f1383S = false;
                        }
                        if (fMo1219a > IGoodView.DEFAULT_TO_ALPHA && interpolation >= 1.0f) {
                            this.f1372K = 1.0f;
                            this.f1383S = false;
                            interpolation = 1.0f;
                        }
                        if (fMo1219a < IGoodView.DEFAULT_TO_ALPHA && interpolation <= IGoodView.DEFAULT_TO_ALPHA) {
                            this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
                            this.f1383S = false;
                            f6 = IGoodView.DEFAULT_TO_ALPHA;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f6);
                    Interpolator interpolator3 = this.f1413y;
                    if (interpolator3 instanceof AbstractInterpolatorC0279o) {
                        this.f1415z = ((AbstractInterpolatorC0279o) interpolator3).mo1219a();
                    } else {
                        this.f1415z = ((interpolator3.getInterpolation(f6 + f4) - interpolation) * fSignum) / f4;
                    }
                }
                f6 = interpolation;
            }
            if (Math.abs(this.f1415z) > 1.0E-5f) {
                setState(EnumC0264j.MOVING);
            }
            if ((fSignum > IGoodView.DEFAULT_TO_ALPHA && f6 >= this.f1376M) || (fSignum <= IGoodView.DEFAULT_TO_ALPHA && f6 <= this.f1376M)) {
                f6 = this.f1376M;
                this.f1383S = false;
            }
            if (f6 >= 1.0f || f6 <= IGoodView.DEFAULT_TO_ALPHA) {
                this.f1383S = false;
                setState(EnumC0264j.FINISHED);
            }
            int childCount = getChildCount();
            this.f1404q0 = false;
            long nanoTime2 = getNanoTime();
            this.f1367H0 = f6;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C0278n c0278n = this.f1364G.get(childAt);
                if (c0278n != null) {
                    this.f1404q0 = c0278n.m1431o(childAt, f6, nanoTime2, this.f1369I0) | this.f1404q0;
                }
            }
            boolean z7 = (fSignum > IGoodView.DEFAULT_TO_ALPHA && f6 >= this.f1376M) || (fSignum <= IGoodView.DEFAULT_TO_ALPHA && f6 <= this.f1376M);
            if (!this.f1404q0 && !this.f1383S && z7) {
                setState(EnumC0264j.FINISHED);
            }
            if (this.f1353A0) {
                requestLayout();
            }
            this.f1404q0 = (!z7) | this.f1404q0;
            if (f6 <= IGoodView.DEFAULT_TO_ALPHA && (i4 = this.f1352A) != -1 && this.f1354B != i4) {
                this.f1354B = i4;
                this.f1411x.m1481i(i4).m1656c(this);
                setState(EnumC0264j.FINISHED);
                z6 = true;
            }
            if (f6 >= 1.0d) {
                int i6 = this.f1354B;
                int i7 = this.f1356C;
                if (i6 != i7) {
                    this.f1354B = i7;
                    this.f1411x.m1481i(i7).m1656c(this);
                    setState(EnumC0264j.FINISHED);
                    z6 = true;
                }
            }
            if (this.f1404q0 || this.f1383S) {
                invalidate();
            } else if ((fSignum > IGoodView.DEFAULT_TO_ALPHA && f6 == 1.0f) || (fSignum < IGoodView.DEFAULT_TO_ALPHA && f6 == IGoodView.DEFAULT_TO_ALPHA)) {
                setState(EnumC0264j.FINISHED);
            }
            if ((!this.f1404q0 && this.f1383S && fSignum > IGoodView.DEFAULT_TO_ALPHA && f6 == 1.0f) || (fSignum < IGoodView.DEFAULT_TO_ALPHA && f6 == IGoodView.DEFAULT_TO_ALPHA)) {
                m1188e0();
            }
        }
        float f7 = this.f1372K;
        if (f7 < 1.0f) {
            if (f7 <= IGoodView.DEFAULT_TO_ALPHA) {
                int i8 = this.f1354B;
                int i9 = this.f1352A;
                z5 = i8 == i9 ? z6 : true;
                this.f1354B = i9;
            }
            this.f1379N0 |= z6;
            if (z6 && !this.f1371J0) {
                requestLayout();
            }
            this.f1370J = this.f1372K;
        }
        int i10 = this.f1354B;
        int i11 = this.f1356C;
        z5 = i10 == i11 ? z6 : true;
        this.f1354B = i11;
        z6 = z5;
        this.f1379N0 |= z6;
        if (z6) {
            requestLayout();
        }
        this.f1370J = this.f1372K;
    }

    /* renamed from: V */
    protected void m1202V() {
        int iIntValue;
        ArrayList<InterfaceC0263i> arrayList;
        if ((this.f1385U != null || ((arrayList = this.f1407t0) != null && !arrayList.isEmpty())) && this.f1412x0 == -1) {
            this.f1412x0 = this.f1354B;
            if (this.f1382Q0.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = this.f1382Q0.get(r0.size() - 1).intValue();
            }
            int i4 = this.f1354B;
            if (iIntValue != i4 && i4 != -1) {
                this.f1382Q0.add(Integer.valueOf(i4));
            }
        }
        m1189f0();
    }

    /* renamed from: W */
    public void m1203W(int i4, boolean z3, float f4) {
        InterfaceC0263i interfaceC0263i = this.f1385U;
        if (interfaceC0263i != null) {
            interfaceC0263i.mo1162c(this, i4, z3, f4);
        }
        ArrayList<InterfaceC0263i> arrayList = this.f1407t0;
        if (arrayList != null) {
            Iterator<InterfaceC0263i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo1162c(this, i4, z3, f4);
            }
        }
    }

    /* renamed from: X */
    void m1204X(int i4, float f4, float f5, float f6, float[] fArr) throws Resources.NotFoundException {
        String resourceName;
        HashMap<View, C0278n> map = this.f1364G;
        View viewM1611g = m1611g(i4);
        C0278n c0278n = map.get(viewM1611g);
        if (c0278n != null) {
            c0278n.m1425g(f4, f5, f6, fArr);
            float y3 = viewM1611g.getY();
            this.f1386V = f4;
            this.f1387W = y3;
            return;
        }
        if (viewM1611g == null) {
            resourceName = "" + i4;
        } else {
            resourceName = viewM1611g.getContext().getResources().getResourceName(i4);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    /* renamed from: Y */
    public C0281q.b m1205Y(int i4) {
        return this.f1411x.m1495y(i4);
    }

    /* renamed from: Z */
    public void m1206Z(View view, float f4, float f5, float[] fArr, int i4) {
        float f6;
        float fMo1219a = this.f1415z;
        float f7 = this.f1372K;
        if (this.f1413y != null) {
            float fSignum = Math.signum(this.f1376M - f7);
            float interpolation = this.f1413y.getInterpolation(this.f1372K + 1.0E-5f);
            float interpolation2 = this.f1413y.getInterpolation(this.f1372K);
            fMo1219a = (fSignum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f1368I;
            f6 = interpolation2;
        } else {
            f6 = f7;
        }
        Interpolator interpolator = this.f1413y;
        if (interpolator instanceof AbstractInterpolatorC0279o) {
            fMo1219a = ((AbstractInterpolatorC0279o) interpolator).mo1219a();
        }
        C0278n c0278n = this.f1364G.get(view);
        if ((i4 & 1) == 0) {
            c0278n.m1430l(f6, view.getWidth(), view.getHeight(), f4, f5, fArr);
        } else {
            c0278n.m1425g(f6, f4, f5, fArr);
        }
        if (i4 < 2) {
            fArr[0] = fArr[0] * fMo1219a;
            fArr[1] = fArr[1] * fMo1219a;
        }
    }

    /* renamed from: c0 */
    public boolean m1207c0() {
        return this.f1362F;
    }

    /* renamed from: d0 */
    protected InterfaceC0260f m1208d0() {
        return C0261g.m1246e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1201S(false);
        super.dispatchDraw(canvas);
        if (this.f1411x == null) {
            return;
        }
        if ((this.f1388a0 & 1) == 1 && !isInEditMode()) {
            this.f1408u0++;
            long nanoTime = getNanoTime();
            long j4 = this.f1409v0;
            if (j4 != -1) {
                if (nanoTime - j4 > 200000000) {
                    this.f1410w0 = ((int) ((this.f1408u0 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f1408u0 = 0;
                    this.f1409v0 = nanoTime;
                }
            } else {
                this.f1409v0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f1410w0 + " fps " + C0265a.m1258d(this, this.f1352A) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C0265a.m1258d(this, this.f1356C));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i4 = this.f1354B;
            sb.append(i4 == -1 ? "undefined" : C0265a.m1258d(this, i4));
            String string = sb.toString();
            paint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f1388a0 > 1) {
            if (this.f1389b0 == null) {
                this.f1389b0 = new C0258d();
            }
            this.f1389b0.m1230a(canvas, this.f1364G, this.f1411x.m1485m(), this.f1388a0);
        }
    }

    /* renamed from: g0 */
    public void m1209g0() {
        this.f1377M0.m1240g();
        invalidate();
    }

    public int[] getConstraintSetIds() {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            return null;
        }
        return c0281q.m1483k();
    }

    public int getCurrentState() {
        return this.f1354B;
    }

    public ArrayList<C0281q.b> getDefinedTransitions() {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            return null;
        }
        return c0281q.m1484l();
    }

    public C0266b getDesignTool() {
        if (this.f1393f0 == null) {
            this.f1393f0 = new C0266b(this);
        }
        return this.f1393f0;
    }

    public int getEndState() {
        return this.f1356C;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1372K;
    }

    public int getStartState() {
        return this.f1352A;
    }

    public float getTargetPosition() {
        return this.f1376M;
    }

    public Bundle getTransitionState() {
        if (this.f1373K0 == null) {
            this.f1373K0 = new C0262h();
        }
        this.f1373K0.m1249c();
        return this.f1373K0.m1248b();
    }

    public long getTransitionTimeMs() {
        if (this.f1411x != null) {
            this.f1368I = r0.m1485m() / 1000.0f;
        }
        return (long) (this.f1368I * 1000.0f);
    }

    public float getVelocity() {
        return this.f1415z;
    }

    /* renamed from: h0 */
    public void m1210h0(float f4, float f5) {
        if (isAttachedToWindow()) {
            setProgress(f4);
            setState(EnumC0264j.MOVING);
            this.f1415z = f5;
            m1200N(1.0f);
            return;
        }
        if (this.f1373K0 == null) {
            this.f1373K0 = new C0262h();
        }
        this.f1373K0.m1251e(f4);
        this.f1373K0.m1254h(f5);
    }

    /* renamed from: i0 */
    public void m1211i0(int i4, int i5, int i6) {
        setState(EnumC0264j.SETUP);
        this.f1354B = i4;
        this.f1352A = -1;
        this.f1356C = -1;
        C0294b c0294b = this.f1837k;
        if (c0294b != null) {
            c0294b.m1643d(i4, i5, i6);
            return;
        }
        C0281q c0281q = this.f1411x;
        if (c0281q != null) {
            c0281q.m1481i(i4).m1657d(this);
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j0 */
    public void m1212j0(int i4, int i5) {
        if (!isAttachedToWindow()) {
            if (this.f1373K0 == null) {
                this.f1373K0 = new C0262h();
            }
            this.f1373K0.m1252f(i4);
            this.f1373K0.m1250d(i5);
            return;
        }
        C0281q c0281q = this.f1411x;
        if (c0281q != null) {
            this.f1352A = i4;
            this.f1356C = i5;
            c0281q.m1473M(i4, i5);
            this.f1377M0.m1237d(this.f1829c, this.f1411x.m1481i(i4), this.f1411x.m1481i(i5));
            m1209g0();
            this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
            m1216n0();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: l */
    protected void mo1213l(int i4) {
        this.f1837k = null;
    }

    /* renamed from: l0 */
    public void m1214l0(int i4, float f4, float f5) {
        if (this.f1411x == null || this.f1372K == f4) {
            return;
        }
        this.f1390c0 = true;
        this.f1366H = getNanoTime();
        float fM1485m = this.f1411x.m1485m() / 1000.0f;
        this.f1368I = fM1485m;
        this.f1376M = f4;
        this.f1383S = true;
        if (i4 == 0 || i4 == 1 || i4 == 2) {
            if (i4 == 1) {
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            } else if (i4 == 2) {
                f4 = 1.0f;
            }
            this.f1391d0.m9470c(this.f1372K, f4, f5, fM1485m, this.f1411x.m1489r(), this.f1411x.m1490s());
            int i5 = this.f1354B;
            this.f1376M = f4;
            this.f1354B = i5;
            this.f1413y = this.f1391d0;
        } else if (i4 == 4) {
            this.f1392e0.m1220b(f5, this.f1372K, this.f1411x.m1489r());
            this.f1413y = this.f1392e0;
        } else if (i4 == 5) {
            if (m1191q0(f5, this.f1372K, this.f1411x.m1489r())) {
                this.f1392e0.m1220b(f5, this.f1372K, this.f1411x.m1489r());
                this.f1413y = this.f1392e0;
            } else {
                this.f1391d0.m9470c(this.f1372K, f4, f5, this.f1368I, this.f1411x.m1489r(), this.f1411x.m1490s());
                this.f1415z = IGoodView.DEFAULT_TO_ALPHA;
                int i6 = this.f1354B;
                this.f1376M = f4;
                this.f1354B = i6;
                this.f1413y = this.f1391d0;
            }
        }
        this.f1378N = false;
        this.f1366H = getNanoTime();
        invalidate();
    }

    /* renamed from: m0 */
    public void m1215m0() {
        m1200N(1.0f);
    }

    /* renamed from: n0 */
    public void m1216n0() {
        m1200N(IGoodView.DEFAULT_TO_ALPHA);
    }

    /* renamed from: o0 */
    public void m1217o0(int i4) {
        if (isAttachedToWindow()) {
            m1218p0(i4, -1, -1);
            return;
        }
        if (this.f1373K0 == null) {
            this.f1373K0 = new C0262h();
        }
        this.f1373K0.m1250d(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i4;
        super.onAttachedToWindow();
        C0281q c0281q = this.f1411x;
        if (c0281q != null && (i4 = this.f1354B) != -1) {
            C0295c c0295cM1481i = c0281q.m1481i(i4);
            this.f1411x.m1470J(this);
            if (c0295cM1481i != null) {
                c0295cM1481i.m1657d(this);
            }
            this.f1352A = this.f1354B;
        }
        m1188e0();
        C0262h c0262h = this.f1373K0;
        if (c0262h != null) {
            c0262h.m1247a();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0281q.b bVar;
        C0284t c0284tM1519B;
        int iM1568k;
        RectF rectFM1567j;
        C0281q c0281q = this.f1411x;
        if (c0281q != null && this.f1362F && (bVar = c0281q.f1676c) != null && bVar.m1520C() && (c0284tM1519B = bVar.m1519B()) != null && ((motionEvent.getAction() != 0 || (rectFM1567j = c0284tM1519B.m1567j(this, new RectF())) == null || rectFM1567j.contains(motionEvent.getX(), motionEvent.getY())) && (iM1568k = c0284tM1519B.m1568k()) != -1)) {
            View view = this.f1381P0;
            if (view == null || view.getId() != iM1568k) {
                this.f1381P0 = findViewById(iM1568k);
            }
            if (this.f1381P0 != null) {
                this.f1380O0.set(r0.getLeft(), this.f1381P0.getTop(), this.f1381P0.getRight(), this.f1381P0.getBottom());
                if (this.f1380O0.contains(motionEvent.getX(), motionEvent.getY()) && !m1186a0(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.f1381P0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.f1371J0 = true;
        try {
            if (this.f1411x == null) {
                super.onLayout(z3, i4, i5, i6, i7);
                return;
            }
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.f1397j0 != i8 || this.f1398k0 != i9) {
                m1209g0();
                m1201S(true);
            }
            this.f1397j0 = i8;
            this.f1398k0 = i9;
            this.f1395h0 = i8;
            this.f1396i0 = i9;
        } finally {
            this.f1371J0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f1411x == null) {
            super.onMeasure(i4, i5);
            return;
        }
        boolean z3 = false;
        boolean z4 = (this.f1358D == i4 && this.f1360E == i5) ? false : true;
        if (this.f1379N0) {
            this.f1379N0 = false;
            m1188e0();
            m1189f0();
            z4 = true;
        }
        if (this.f1834h) {
            z4 = true;
        }
        this.f1358D = i4;
        this.f1360E = i5;
        int iM1494x = this.f1411x.m1494x();
        int iM1486n = this.f1411x.m1486n();
        if ((z4 || this.f1377M0.m1238e(iM1494x, iM1486n)) && this.f1352A != -1) {
            super.onMeasure(i4, i5);
            this.f1377M0.m1237d(this.f1829c, this.f1411x.m1481i(iM1494x), this.f1411x.m1481i(iM1486n));
            this.f1377M0.m1240g();
            this.f1377M0.m1241h(iM1494x, iM1486n);
        } else {
            z3 = true;
        }
        if (this.f1353A0 || z3) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iM9718Q = this.f1829c.m9718Q() + getPaddingLeft() + getPaddingRight();
            int iM9763w = this.f1829c.m9763w() + paddingTop;
            int i6 = this.f1363F0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                iM9718Q = (int) (this.f1355B0 + (this.f1367H0 * (this.f1359D0 - r7)));
                requestLayout();
            }
            int i7 = this.f1365G0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                iM9763w = (int) (this.f1357C0 + (this.f1367H0 * (this.f1361E0 - r7)));
                requestLayout();
            }
            setMeasuredDimension(iM9718Q, iM9763w);
        }
        m1184T();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        C0281q.b bVar;
        C0284t c0284tM1519B;
        int iM1568k;
        C0281q c0281q = this.f1411x;
        if (c0281q == null || (bVar = c0281q.f1676c) == null || !bVar.m1520C()) {
            return;
        }
        C0281q.b bVar2 = this.f1411x.f1676c;
        if (bVar2 == null || !bVar2.m1520C() || (c0284tM1519B = bVar2.m1519B()) == null || (iM1568k = c0284tM1519B.m1568k()) == -1 || view.getId() == iM1568k) {
            C0281q c0281q2 = this.f1411x;
            if (c0281q2 != null && c0281q2.m1491t()) {
                float f4 = this.f1370J;
                if ((f4 == 1.0f || f4 == IGoodView.DEFAULT_TO_ALPHA) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (bVar2.m1519B() != null && (this.f1411x.f1676c.m1519B().m1561d() & 1) != 0) {
                float fM1492u = this.f1411x.m1492u(i4, i5);
                float f5 = this.f1372K;
                if ((f5 <= IGoodView.DEFAULT_TO_ALPHA && fM1492u < IGoodView.DEFAULT_TO_ALPHA) || (f5 >= 1.0f && fM1492u > IGoodView.DEFAULT_TO_ALPHA)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0255a(view));
                    return;
                }
            }
            float f6 = this.f1370J;
            long nanoTime = getNanoTime();
            float f7 = i4;
            this.f1400m0 = f7;
            float f8 = i5;
            this.f1401n0 = f8;
            this.f1403p0 = (float) ((nanoTime - this.f1402o0) * 1.0E-9d);
            this.f1402o0 = nanoTime;
            this.f1411x.m1467F(f7, f8);
            if (f6 != this.f1370J) {
                iArr[0] = i4;
                iArr[1] = i5;
            }
            m1201S(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f1399l0 = true;
        }
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
    }

    @Override // androidx.core.view.InterfaceC0351n
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (this.f1399l0 || i4 != 0 || i5 != 0) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
        }
        this.f1399l0 = false;
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        C0281q c0281q = this.f1411x;
        if (c0281q != null) {
            c0281q.m1472L(m1613j());
        }
    }

    @Override // androidx.core.view.InterfaceC0350m
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        C0281q.b bVar;
        C0281q c0281q = this.f1411x;
        return (c0281q == null || (bVar = c0281q.f1676c) == null || bVar.m1519B() == null || (this.f1411x.f1676c.m1519B().m1561d() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onStopNestedScroll(View view, int i4) {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            return;
        }
        float f4 = this.f1400m0;
        float f5 = this.f1403p0;
        c0281q.m1468G(f4 / f5, this.f1401n0 / f5);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0281q c0281q = this.f1411x;
        if (c0281q == null || !this.f1362F || !c0281q.m1476Q()) {
            return super.onTouchEvent(motionEvent);
        }
        C0281q.b bVar = this.f1411x.f1676c;
        if (bVar != null && !bVar.m1520C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1411x.m1469H(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1407t0 == null) {
                this.f1407t0 = new ArrayList<>();
            }
            this.f1407t0.add(motionHelper);
            if (motionHelper.m1165w()) {
                if (this.f1405r0 == null) {
                    this.f1405r0 = new ArrayList<>();
                }
                this.f1405r0.add(motionHelper);
            }
            if (motionHelper.m1164v()) {
                if (this.f1406s0 == null) {
                    this.f1406s0 = new ArrayList<>();
                }
                this.f1406s0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1405r0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1406s0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void m1218p0(int i4, int i5, int i6) {
        C0299g c0299g;
        int iM1692a;
        C0281q c0281q = this.f1411x;
        if (c0281q != null && (c0299g = c0281q.f1675b) != null && (iM1692a = c0299g.m1692a(this.f1354B, i4, i5, i6)) != -1) {
            i4 = iM1692a;
        }
        int i7 = this.f1354B;
        if (i7 == i4) {
            return;
        }
        if (this.f1352A == i4) {
            m1200N(IGoodView.DEFAULT_TO_ALPHA);
            return;
        }
        if (this.f1356C == i4) {
            m1200N(1.0f);
            return;
        }
        this.f1356C = i4;
        if (i7 != -1) {
            m1212j0(i7, i4);
            m1200N(1.0f);
            this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
            m1215m0();
            return;
        }
        this.f1390c0 = false;
        this.f1376M = 1.0f;
        this.f1370J = IGoodView.DEFAULT_TO_ALPHA;
        this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
        this.f1374L = getNanoTime();
        this.f1366H = getNanoTime();
        this.f1378N = false;
        this.f1413y = null;
        this.f1368I = this.f1411x.m1485m() / 1000.0f;
        this.f1352A = -1;
        this.f1411x.m1473M(-1, this.f1356C);
        this.f1411x.m1494x();
        int childCount = getChildCount();
        this.f1364G.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            this.f1364G.put(childAt, new C0278n(childAt));
        }
        this.f1383S = true;
        this.f1377M0.m1237d(this.f1829c, null, this.f1411x.m1481i(i4));
        m1209g0();
        this.f1377M0.m1234a();
        m1183R();
        int width = getWidth();
        int height = getHeight();
        for (int i9 = 0; i9 < childCount; i9++) {
            C0278n c0278n = this.f1364G.get(getChildAt(i9));
            this.f1411x.m1488q(c0278n);
            c0278n.m1437v(width, height, this.f1368I, getNanoTime());
        }
        float fM1493w = this.f1411x.m1493w();
        if (fM1493w != IGoodView.DEFAULT_TO_ALPHA) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                C0278n c0278n2 = this.f1364G.get(getChildAt(i10));
                float fM1428j = c0278n2.m1428j() + c0278n2.m1427i();
                fMin = Math.min(fMin, fM1428j);
                fMax = Math.max(fMax, fM1428j);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                C0278n c0278n3 = this.f1364G.get(getChildAt(i11));
                float fM1427i = c0278n3.m1427i();
                float fM1428j2 = c0278n3.m1428j();
                c0278n3.f1644m = 1.0f / (1.0f - fM1493w);
                c0278n3.f1643l = fM1493w - ((((fM1427i + fM1428j2) - fMin) * fM1493w) / (fMax - fMin));
            }
        }
        this.f1370J = IGoodView.DEFAULT_TO_ALPHA;
        this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
        this.f1383S = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C0281q c0281q;
        C0281q.b bVar;
        if (this.f1353A0 || this.f1354B != -1 || (c0281q = this.f1411x) == null || (bVar = c0281q.f1676c) == null || bVar.m1527z() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i4) {
        this.f1388a0 = i4;
        invalidate();
    }

    public void setInteractionEnabled(boolean z3) {
        this.f1362F = z3;
    }

    public void setInterpolatedProgress(float f4) {
        if (this.f1411x != null) {
            setState(EnumC0264j.MOVING);
            Interpolator interpolatorM1487p = this.f1411x.m1487p();
            if (interpolatorM1487p != null) {
                setProgress(interpolatorM1487p.getInterpolation(f4));
                return;
            }
        }
        setProgress(f4);
    }

    public void setOnHide(float f4) {
        ArrayList<MotionHelper> arrayList = this.f1406s0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f1406s0.get(i4).setProgress(f4);
            }
        }
    }

    public void setOnShow(float f4) {
        ArrayList<MotionHelper> arrayList = this.f1405r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f1405r0.get(i4).setProgress(f4);
            }
        }
    }

    public void setProgress(float f4) {
        if (!isAttachedToWindow()) {
            if (this.f1373K0 == null) {
                this.f1373K0 = new C0262h();
            }
            this.f1373K0.m1251e(f4);
            return;
        }
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            this.f1354B = this.f1352A;
            if (this.f1372K == IGoodView.DEFAULT_TO_ALPHA) {
                setState(EnumC0264j.FINISHED);
            }
        } else if (f4 >= 1.0f) {
            this.f1354B = this.f1356C;
            if (this.f1372K == 1.0f) {
                setState(EnumC0264j.FINISHED);
            }
        } else {
            this.f1354B = -1;
            setState(EnumC0264j.MOVING);
        }
        if (this.f1411x == null) {
            return;
        }
        this.f1378N = true;
        this.f1376M = f4;
        this.f1370J = f4;
        this.f1374L = -1L;
        this.f1366H = -1L;
        this.f1413y = null;
        this.f1383S = true;
        invalidate();
    }

    public void setScene(C0281q c0281q) {
        this.f1411x = c0281q;
        c0281q.m1472L(m1613j());
        m1209g0();
    }

    void setState(EnumC0264j enumC0264j) {
        EnumC0264j enumC0264j2 = EnumC0264j.FINISHED;
        if (enumC0264j == enumC0264j2 && this.f1354B == -1) {
            return;
        }
        EnumC0264j enumC0264j3 = this.f1375L0;
        this.f1375L0 = enumC0264j;
        EnumC0264j enumC0264j4 = EnumC0264j.MOVING;
        if (enumC0264j3 == enumC0264j4 && enumC0264j == enumC0264j4) {
            m1185U();
        }
        int i4 = C0256b.f1419a[enumC0264j3.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3 && enumC0264j == enumC0264j2) {
                m1202V();
                return;
            }
            return;
        }
        if (enumC0264j == enumC0264j4) {
            m1185U();
        }
        if (enumC0264j == enumC0264j2) {
            m1202V();
        }
    }

    public void setTransition(int i4) {
        if (this.f1411x != null) {
            C0281q.b bVarM1205Y = m1205Y(i4);
            this.f1352A = bVarM1205Y.m1518A();
            this.f1356C = bVarM1205Y.m1526y();
            if (!isAttachedToWindow()) {
                if (this.f1373K0 == null) {
                    this.f1373K0 = new C0262h();
                }
                this.f1373K0.m1252f(this.f1352A);
                this.f1373K0.m1250d(this.f1356C);
                return;
            }
            float f4 = Float.NaN;
            int i5 = this.f1354B;
            int i6 = this.f1352A;
            float f5 = IGoodView.DEFAULT_TO_ALPHA;
            if (i5 == i6) {
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            } else if (i5 == this.f1356C) {
                f4 = 1.0f;
            }
            this.f1411x.m1474N(bVarM1205Y);
            this.f1377M0.m1237d(this.f1829c, this.f1411x.m1481i(this.f1352A), this.f1411x.m1481i(this.f1356C));
            m1209g0();
            if (!Float.isNaN(f4)) {
                f5 = f4;
            }
            this.f1372K = f5;
            if (!Float.isNaN(f4)) {
                setProgress(f4);
                return;
            }
            Log.v("MotionLayout", C0265a.m1255a() + " transitionToStart ");
            m1216n0();
        }
    }

    public void setTransitionDuration(int i4) {
        C0281q c0281q = this.f1411x;
        if (c0281q == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            c0281q.m1471K(i4);
        }
    }

    public void setTransitionListener(InterfaceC0263i interfaceC0263i) {
        this.f1385U = interfaceC0263i;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1373K0 == null) {
            this.f1373K0 = new C0262h();
        }
        this.f1373K0.m1253g(bundle);
        if (isAttachedToWindow()) {
            this.f1373K0.m1247a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C0265a.m1256b(context, this.f1352A) + "->" + C0265a.m1256b(context, this.f1356C) + " (pos:" + this.f1372K + " Dpos/Dt:" + this.f1415z;
    }

    protected void setTransition(C0281q.b bVar) {
        this.f1411x.m1474N(bVar);
        setState(EnumC0264j.SETUP);
        if (this.f1354B == this.f1411x.m1486n()) {
            this.f1372K = 1.0f;
            this.f1370J = 1.0f;
            this.f1376M = 1.0f;
        } else {
            this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
            this.f1370J = IGoodView.DEFAULT_TO_ALPHA;
            this.f1376M = IGoodView.DEFAULT_TO_ALPHA;
        }
        this.f1374L = bVar.m1521D(1) ? -1L : getNanoTime();
        int iM1494x = this.f1411x.m1494x();
        int iM1486n = this.f1411x.m1486n();
        if (iM1494x == this.f1352A && iM1486n == this.f1356C) {
            return;
        }
        this.f1352A = iM1494x;
        this.f1356C = iM1486n;
        this.f1411x.m1473M(iM1494x, iM1486n);
        this.f1377M0.m1237d(this.f1829c, this.f1411x.m1481i(this.f1352A), this.f1411x.m1481i(this.f1356C));
        this.f1377M0.m1241h(this.f1352A, this.f1356C);
        this.f1377M0.m1240g();
        m1209g0();
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1415z = IGoodView.DEFAULT_TO_ALPHA;
        this.f1352A = -1;
        this.f1354B = -1;
        this.f1356C = -1;
        this.f1358D = 0;
        this.f1360E = 0;
        this.f1362F = true;
        this.f1364G = new HashMap<>();
        this.f1366H = 0L;
        this.f1368I = 1.0f;
        this.f1370J = IGoodView.DEFAULT_TO_ALPHA;
        this.f1372K = IGoodView.DEFAULT_TO_ALPHA;
        this.f1376M = IGoodView.DEFAULT_TO_ALPHA;
        this.f1383S = false;
        this.f1384T = false;
        this.f1388a0 = 0;
        this.f1390c0 = false;
        this.f1391d0 = new C2831g();
        this.f1392e0 = new C0257c();
        this.f1394g0 = true;
        this.f1399l0 = false;
        this.f1404q0 = false;
        this.f1405r0 = null;
        this.f1406s0 = null;
        this.f1407t0 = null;
        this.f1408u0 = 0;
        this.f1409v0 = -1L;
        this.f1410w0 = IGoodView.DEFAULT_TO_ALPHA;
        this.f1412x0 = 0;
        this.f1414y0 = IGoodView.DEFAULT_TO_ALPHA;
        this.f1416z0 = false;
        this.f1353A0 = false;
        this.f1369I0 = new C0269e();
        this.f1371J0 = false;
        this.f1375L0 = EnumC0264j.UNDEFINED;
        this.f1377M0 = new C0259e();
        this.f1379N0 = false;
        this.f1380O0 = new RectF();
        this.f1381P0 = null;
        this.f1382Q0 = new ArrayList<>();
        m1187b0(attributeSet);
    }
}

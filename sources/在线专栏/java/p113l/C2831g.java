package p113l;

import androidx.constraintlayout.motion.widget.AbstractInterpolatorC0279o;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: l.g */
/* loaded from: classes.dex */
public class C2831g extends AbstractInterpolatorC0279o {

    /* renamed from: a */
    private float f10898a;

    /* renamed from: b */
    private float f10899b;

    /* renamed from: c */
    private float f10900c;

    /* renamed from: d */
    private float f10901d;

    /* renamed from: e */
    private float f10902e;

    /* renamed from: f */
    private float f10903f;

    /* renamed from: g */
    private float f10904g;

    /* renamed from: h */
    private float f10905h;

    /* renamed from: i */
    private float f10906i;

    /* renamed from: j */
    private int f10907j;

    /* renamed from: k */
    private String f10908k;

    /* renamed from: l */
    private boolean f10909l = false;

    /* renamed from: m */
    private float f10910m;

    /* renamed from: n */
    private float f10911n;

    /* renamed from: b */
    private float m9468b(float f4) {
        float f5 = this.f10901d;
        if (f4 <= f5) {
            float f6 = this.f10898a;
            return (f6 * f4) + ((((this.f10899b - f6) * f4) * f4) / (f5 * 2.0f));
        }
        int i4 = this.f10907j;
        if (i4 == 1) {
            return this.f10904g;
        }
        float f7 = f4 - f5;
        float f8 = this.f10902e;
        if (f7 < f8) {
            float f9 = this.f10904g;
            float f10 = this.f10899b;
            return f9 + (f10 * f7) + ((((this.f10900c - f10) * f7) * f7) / (f8 * 2.0f));
        }
        if (i4 == 2) {
            return this.f10905h;
        }
        float f11 = f7 - f8;
        float f12 = this.f10903f;
        if (f11 >= f12) {
            return this.f10906i;
        }
        float f13 = this.f10905h;
        float f14 = this.f10900c;
        return (f13 + (f14 * f11)) - (((f14 * f11) * f11) / (f12 * 2.0f));
    }

    /* renamed from: e */
    private void m9469e(float f4, float f5, float f6, float f7, float f8) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            f4 = 1.0E-4f;
        }
        this.f10898a = f4;
        float f9 = f4 / f6;
        float f10 = (f9 * f4) / 2.0f;
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            float fSqrt = (float) Math.sqrt((f5 - ((((-f4) / f6) * f4) / 2.0f)) * f6);
            if (fSqrt < f7) {
                this.f10908k = "backward accelerate, decelerate";
                this.f10907j = 2;
                this.f10898a = f4;
                this.f10899b = fSqrt;
                this.f10900c = IGoodView.DEFAULT_TO_ALPHA;
                float f11 = (fSqrt - f4) / f6;
                this.f10901d = f11;
                this.f10902e = fSqrt / f6;
                this.f10904g = ((f4 + fSqrt) * f11) / 2.0f;
                this.f10905h = f5;
                this.f10906i = f5;
                return;
            }
            this.f10908k = "backward accelerate cruse decelerate";
            this.f10907j = 3;
            this.f10898a = f4;
            this.f10899b = f7;
            this.f10900c = f7;
            float f12 = (f7 - f4) / f6;
            this.f10901d = f12;
            float f13 = f7 / f6;
            this.f10903f = f13;
            float f14 = ((f4 + f7) * f12) / 2.0f;
            float f15 = (f13 * f7) / 2.0f;
            this.f10902e = ((f5 - f14) - f15) / f7;
            this.f10904g = f14;
            this.f10905h = f5 - f15;
            this.f10906i = f5;
            return;
        }
        if (f10 >= f5) {
            this.f10908k = "hard stop";
            this.f10907j = 1;
            this.f10898a = f4;
            this.f10899b = IGoodView.DEFAULT_TO_ALPHA;
            this.f10904g = f5;
            this.f10901d = (2.0f * f5) / f4;
            return;
        }
        float f16 = f5 - f10;
        float f17 = f16 / f4;
        if (f17 + f9 < f8) {
            this.f10908k = "cruse decelerate";
            this.f10907j = 2;
            this.f10898a = f4;
            this.f10899b = f4;
            this.f10900c = IGoodView.DEFAULT_TO_ALPHA;
            this.f10904g = f16;
            this.f10905h = f5;
            this.f10901d = f17;
            this.f10902e = f9;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f6 * f5) + ((f4 * f4) / 2.0f));
        float f18 = (fSqrt2 - f4) / f6;
        this.f10901d = f18;
        float f19 = fSqrt2 / f6;
        this.f10902e = f19;
        if (fSqrt2 < f7) {
            this.f10908k = "accelerate decelerate";
            this.f10907j = 2;
            this.f10898a = f4;
            this.f10899b = fSqrt2;
            this.f10900c = IGoodView.DEFAULT_TO_ALPHA;
            this.f10901d = f18;
            this.f10902e = f19;
            this.f10904g = ((f4 + fSqrt2) * f18) / 2.0f;
            this.f10905h = f5;
            return;
        }
        this.f10908k = "accelerate cruse decelerate";
        this.f10907j = 3;
        this.f10898a = f4;
        this.f10899b = f7;
        this.f10900c = f7;
        float f20 = (f7 - f4) / f6;
        this.f10901d = f20;
        float f21 = f7 / f6;
        this.f10903f = f21;
        float f22 = ((f4 + f7) * f20) / 2.0f;
        float f23 = (f21 * f7) / 2.0f;
        this.f10902e = ((f5 - f22) - f23) / f7;
        this.f10904g = f22;
        this.f10905h = f5 - f23;
        this.f10906i = f5;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractInterpolatorC0279o
    /* renamed from: a */
    public float mo1219a() {
        return this.f10909l ? -m9471d(this.f10911n) : m9471d(this.f10911n);
    }

    /* renamed from: c */
    public void m9470c(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f10910m = f4;
        boolean z3 = f4 > f5;
        this.f10909l = z3;
        if (z3) {
            m9469e(-f6, f4 - f5, f8, f9, f7);
        } else {
            m9469e(f6, f5 - f4, f8, f9, f7);
        }
    }

    /* renamed from: d */
    public float m9471d(float f4) {
        float f5 = this.f10901d;
        if (f4 <= f5) {
            float f6 = this.f10898a;
            return f6 + (((this.f10899b - f6) * f4) / f5);
        }
        int i4 = this.f10907j;
        if (i4 == 1) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        float f7 = f4 - f5;
        float f8 = this.f10902e;
        if (f7 < f8) {
            float f9 = this.f10899b;
            return f9 + (((this.f10900c - f9) * f7) / f8);
        }
        if (i4 == 2) {
            return this.f10905h;
        }
        float f10 = f7 - f8;
        float f11 = this.f10903f;
        if (f10 >= f11) {
            return this.f10906i;
        }
        float f12 = this.f10900c;
        return f12 - ((f10 * f12) / f11);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        float fM9468b = m9468b(f4);
        this.f10911n = f4;
        return this.f10909l ? this.f10910m - fM9468b : this.f10910m + fM9468b;
    }
}

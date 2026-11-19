package p421y8;

import android.graphics.PointF;

/* renamed from: y8.e */
/* loaded from: classes5.dex */
public class C11921e {

    /* renamed from: r */
    public static int f28237r = -1;

    /* renamed from: s */
    public static int f28238s = 0;

    /* renamed from: t */
    public static int f28239t = 1;

    /* renamed from: f */
    public int f28245f;

    /* renamed from: g */
    public int f28246g;

    /* renamed from: h */
    public int f28247h;

    /* renamed from: i */
    public float f28248i;

    /* renamed from: j */
    public float f28249j;

    /* renamed from: k */
    public float f28250k;

    /* renamed from: l */
    public float f28251l;

    /* renamed from: m */
    public boolean f28252m;

    /* renamed from: o */
    public int f28254o;

    /* renamed from: p */
    public boolean f28255p;

    /* renamed from: a */
    public int f28240a = 0;

    /* renamed from: b */
    public int f28241b = 0;

    /* renamed from: c */
    public PointF f28242c = new PointF();

    /* renamed from: d */
    public PointF f28243d = new PointF();

    /* renamed from: e */
    public PointF f28244e = new PointF();

    /* renamed from: n */
    public int f28253n = -1;

    /* renamed from: q */
    public int f28256q = f28237r;

    /* renamed from: a */
    public float m26465a() {
        return this.f28249j;
    }

    /* renamed from: b */
    public boolean m26466b() {
        return this.f28255p;
    }

    /* renamed from: c */
    public boolean m26467c() {
        return this.f28245f == this.f28241b;
    }

    /* renamed from: d */
    public boolean m26468d() {
        return this.f28245f == this.f28240a;
    }

    /* renamed from: e */
    public void m26469e(float f10, float f11) {
        this.f28252m = true;
        this.f28247h = this.f28245f;
        this.f28242c.set(f10, f11);
        this.f28243d.set(f10, f11);
        this.f28253n = 0;
    }

    /* renamed from: f */
    public void m26470f(float f10, float f11) {
        PointF pointF = this.f28242c;
        float f12 = f10 - pointF.x;
        float f13 = f11 - pointF.y;
        if (!this.f28255p) {
            float fAbs = Math.abs(f13);
            int i10 = this.f28254o;
            if (fAbs > i10) {
                this.f28255p = true;
                f13 = f13 < 0.0f ? f13 + i10 : f13 - i10;
                this.f28256q = f28238s;
            }
        }
        if (!this.f28255p) {
            float fAbs2 = Math.abs(f12);
            int i11 = this.f28254o;
            if (fAbs2 > i11) {
                this.f28255p = true;
                f12 = f12 < 0.0f ? f12 + i11 : f12 - i11;
                this.f28256q = f28239t;
            }
        }
        if (this.f28255p) {
            m26473i(f12, f13);
            m26472h(f10, f11);
            this.f28242c.set(f10, f11);
            this.f28253n = 2;
        }
    }

    /* renamed from: g */
    public void m26471g(float f10, float f11) {
        this.f28252m = false;
        this.f28255p = false;
        this.f28244e.set(f10, f11);
        this.f28253n = 1;
        this.f28256q = f28237r;
    }

    /* renamed from: h */
    public final void m26472h(float f10, float f11) {
        PointF pointF = this.f28243d;
        this.f28250k = f10 - pointF.x;
        this.f28251l = f11 - pointF.y;
    }

    /* renamed from: i */
    public final void m26473i(float f10, float f11) {
        this.f28248i = f10;
        this.f28249j = f11;
    }

    /* renamed from: j */
    public void m26474j(int i10) {
        this.f28254o = i10;
    }

    public String toString() {
        return "mCurrentPos: " + this.f28245f + ", mLastPos: " + this.f28246g + ", mPressedPos: " + this.f28247h + ", isInStartPos: " + m26468d() + ", isInEndPos: " + m26467c();
    }
}

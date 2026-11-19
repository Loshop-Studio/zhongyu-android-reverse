package p019b3;

import android.graphics.PointF;

/* renamed from: b3.e */
/* loaded from: classes3.dex */
public final class C3109e {

    /* renamed from: a */
    public final PointF f1545a = new PointF();

    /* renamed from: b */
    public final PointF f1546b = new PointF();

    /* renamed from: c */
    public final PointF f1547c = new PointF();

    /* renamed from: d */
    public float f1548d;

    /* renamed from: e */
    public int f1549e;

    /* renamed from: f */
    public boolean f1550f;

    /* renamed from: a */
    public final void m2069a(float f, float f7) {
        PointF pointF = this.f1545a;
        float f8 = f - pointF.x;
        float f9 = f7 - pointF.y;
        if (!this.f1550f) {
            float fAbs = Math.abs(f9);
            float f10 = this.f1549e;
            if (fAbs > f10) {
                this.f1550f = true;
                f9 = f9 < 0.0f ? f9 + f10 : f9 - f10;
            }
        }
        if (!this.f1550f && Math.abs(f8) > this.f1549e) {
            this.f1550f = true;
        }
        if (this.f1550f) {
            this.f1548d = f9;
            float f11 = this.f1546b.x;
            pointF.set(f, f7);
        }
    }

    public final String toString() {
        return "mCurrentPos: 0, mLastPos: 0, mPressedPos: 0, isInStartPos: true, isInEndPos: true";
    }
}

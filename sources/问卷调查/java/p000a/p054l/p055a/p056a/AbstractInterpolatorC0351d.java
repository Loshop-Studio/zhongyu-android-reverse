package p000a.p054l.p055a.p056a;

import android.view.animation.Interpolator;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.l.a.a.d */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0351d implements Interpolator {

    /* renamed from: a */
    public final float[] f2155a;

    /* renamed from: b */
    public final float f2156b;

    public AbstractInterpolatorC0351d(float[] fArr) {
        this.f2155a = fArr;
        this.f2156b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2155a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2156b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float[] fArr2 = this.f2155a;
        return C0561a.m2073a(fArr2[iMin + 1], fArr2[iMin], f4, fArr2[iMin]);
    }
}

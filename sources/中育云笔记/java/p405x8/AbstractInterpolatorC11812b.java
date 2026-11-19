package p405x8;

import android.view.animation.Interpolator;

/* renamed from: x8.b */
/* loaded from: classes5.dex */
public abstract class AbstractInterpolatorC11812b implements Interpolator {

    /* renamed from: a */
    public final float[] f28044a;

    /* renamed from: b */
    public final float f28045b;

    public AbstractInterpolatorC11812b(float[] fArr) {
        this.f28044a = fArr;
        this.f28045b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f28044a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f28045b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f28044a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }
}

package androidx.interpolator.view.animation;

import android.support.v4.media.AbstractC0037f;
import android.view.animation.Interpolator;
import androidx.compose.material3.AbstractC1923c;

/* loaded from: classes2.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f7 = this.mStepSize;
        float fM1037a = AbstractC1923c.m1037a(iMin, f7, f, f7);
        float[] fArr2 = this.mValues;
        float f8 = fArr2[iMin];
        return AbstractC0037f.m77b(fArr2[iMin + 1], f8, fM1037a, f8);
    }
}

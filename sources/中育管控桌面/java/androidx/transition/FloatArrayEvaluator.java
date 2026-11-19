package androidx.transition;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f6, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i6 = 0; i6 < fArr3.length; i6++) {
            float f7 = fArr[i6];
            fArr3[i6] = f7 + ((fArr2[i6] - f7) * f6);
        }
        return fArr3;
    }
}

package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.d */
/* loaded from: classes.dex */
class C0720d implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private float[] f4399a;

    C0720d(float[] fArr) {
        this.f4399a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f4, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f4399a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i4 = 0; i4 < fArr3.length; i4++) {
            float f5 = fArr[i4];
            fArr3[i4] = f5 + ((fArr2[i4] - f5) * f4);
        }
        return fArr3;
    }
}

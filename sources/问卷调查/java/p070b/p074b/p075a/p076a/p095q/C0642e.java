package p070b.p074b.p075a.p076a.p095q;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: b.b.a.a.q.e */
/* loaded from: classes.dex */
public class C0642e implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f3874a = new FloatEvaluator();

    public C0642e(C0641d c0641d) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f2, Float f3, Float f4) {
        float fFloatValue = this.f3874a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}

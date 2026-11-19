package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: androidx.transition.p */
/* loaded from: classes.dex */
class C0744p implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f4453a;

    C0744p() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f4, Rect rect, Rect rect2) {
        int i4 = rect.left + ((int) ((rect2.left - r0) * f4));
        int i5 = rect.top + ((int) ((rect2.top - r1) * f4));
        int i6 = rect.right + ((int) ((rect2.right - r2) * f4));
        int i7 = rect.bottom + ((int) ((rect2.bottom - r6) * f4));
        Rect rect3 = this.f4453a;
        if (rect3 == null) {
            return new Rect(i4, i5, i6, i7);
        }
        rect3.set(i4, i5, i6, i7);
        return this.f4453a;
    }

    C0744p(Rect rect) {
        this.f4453a = rect;
    }
}

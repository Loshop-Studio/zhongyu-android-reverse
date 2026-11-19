package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes3.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i9 = rect.left + ((int) ((rect2.left - r0) * f10));
        int i10 = rect.top + ((int) ((rect2.top - r1) * f10));
        int i11 = rect.right + ((int) ((rect2.right - r2) * f10));
        int i12 = rect.bottom + ((int) ((rect2.bottom - r6) * f10));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i9, i10, i11, i12);
        }
        rect3.set(i9, i10, i11, i12);
        return this.mRect;
    }
}

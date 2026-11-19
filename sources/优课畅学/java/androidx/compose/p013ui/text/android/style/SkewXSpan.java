package androidx.compose.p013ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public class SkewXSpan extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float skewX;

    public SkewXSpan(float f10) {
        this.skewX = f10;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.skewX + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.skewX + textPaint.getTextSkewX());
    }
}

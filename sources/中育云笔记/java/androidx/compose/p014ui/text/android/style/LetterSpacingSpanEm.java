package androidx.compose.p014ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LetterSpacingSpanEm extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float letterSpacing;

    public LetterSpacingSpanEm(float f10) {
        this.letterSpacing = f10;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }
}

package androidx.compose.p013ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.FloatRange;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LineHeightStyleSpan implements LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final boolean preserveMinimumHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f10, int i10, int i11, boolean z10, boolean z11, @FloatRange(from = -1.0d, m243to = Contrast.RATIO_MIN) float f11, boolean z12) {
        this.lineHeight = f10;
        this.startIndex = i10;
        this.endIndex = i11;
        this.trimFirstLineTop = z10;
        this.trimLastLineBottom = z11;
        this.topRatio = f11;
        this.preserveMinimumHeight = z12;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iLineHeight = iCeil - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        if (this.preserveMinimumHeight && iLineHeight <= 0) {
            int i10 = fontMetricsInt.ascent;
            this.ascent = i10;
            int i11 = fontMetricsInt.descent;
            this.descent = i11;
            this.firstAscent = i10;
            this.lastDescent = i11;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        int iCeil2 = (int) (iLineHeight <= 0 ? Math.ceil(iLineHeight * fAbs) : Math.ceil(iLineHeight * (1.0f - fAbs)));
        int i12 = fontMetricsInt.descent;
        int i13 = iCeil2 + i12;
        this.descent = i13;
        int i14 = i13 - iCeil;
        this.ascent = i14;
        if (this.trimFirstLineTop) {
            i14 = fontMetricsInt.ascent;
        }
        this.firstAscent = i14;
        if (this.trimLastLineBottom) {
            i13 = i12;
        }
        this.lastDescent = i13;
        this.firstAscentDiff = fontMetricsInt.ascent - i14;
        this.lastDescentDiff = i13 - i12;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i10, i11, z10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.startIndex;
        boolean z11 = i11 == this.endIndex;
        if (z10 && z11 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z11 ? this.lastDescent : this.descent;
    }

    public final LineHeightStyleSpan copy$ui_text_release(int i10, int i11, boolean z10) {
        return new LineHeightStyleSpan(this.lineHeight, i10, i11, z10, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}

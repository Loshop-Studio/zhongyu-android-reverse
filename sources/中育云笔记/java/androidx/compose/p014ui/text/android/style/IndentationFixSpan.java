package androidx.compose.p014ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p014ui.text.android.TextLayout_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1 || !TextLayout_androidKt.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        AbstractC9979u.m20291d(canvas);
        canvas.translate(ellipsizedLeftPadding, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}

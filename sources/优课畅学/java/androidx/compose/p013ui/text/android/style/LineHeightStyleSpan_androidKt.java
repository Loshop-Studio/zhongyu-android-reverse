package androidx.compose.p013ui.text.android.style;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class LineHeightStyleSpan_androidKt {
    public static final int lineHeight(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}

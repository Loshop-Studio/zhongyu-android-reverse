package androidx.compose.p006ui.text;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.RectKt;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.AbstractC1291c1;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.graphics.drawscope.Fill;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextForegroundStyle;
import androidx.compose.p006ui.text.style.TextOverflow;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m5175d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        boolean z3 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m11471equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m11480getVisiblegIe3tQ8());
        if (z3) {
            Rect rectM8985Recttz77jQw = RectKt.m8985Recttz77jQw(Offset.INSTANCE.m8961getZeroF1C5BW0(), SizeKt.Size(IntSize.m11685getWidthimpl(textLayoutResult.getSize()), IntSize.m11684getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            AbstractC1291c1.m389o(canvas, rectM8985Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle.getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().m10974painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getAlpha() : 1.0f, (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : 0);
            } else {
                textLayoutResult.getMultiParagraph().m10972paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m9214getUnspecified0d7_KjU() : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().mo11334getColor0d7_KjU() : Color.INSTANCE.m9204getBlack0d7_KjU(), (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z3) {
                canvas.restore();
            }
        }
    }
}

package androidx.compose.p014ui.text;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.DrawTransform;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextDrawStyleKt;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.ConstraintsKt;
import java.util.List;

/* loaded from: classes2.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m33427equalsimpl0(textLayoutResult.getLayoutInput().m32933getOverflowgIe3tQ8(), TextOverflow.Companion.m33440getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m31486clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (int) (textLayoutResult.m32937getSizeYbymL2g() >> 32), (int) (textLayoutResult.m32937getSizeYbymL2g() & 4294967295L), 0, 16, null);
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m32945drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j10, TextStyle textStyle, int i10, boolean z10, int i11, List<AnnotatedString.Range<Placeholder>> list, long j11, int i12) {
        TextLayoutResult textLayoutResultM32940measurexDpz5zY$default = TextMeasurer.m32940measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i10, z10, i11, list, m32953textLayoutConstraintsv_w8tDc(drawScope, j11, j10), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            clip(transform, textLayoutResultM32940measurexDpz5zY$default);
            textLayoutResultM32940measurexDpz5zY$default.getMultiParagraph().m32820paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i12);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m32947drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j10, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (4294967295L & j10)));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m32822painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f10) ? f10 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i10);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m32949drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j10, TextStyle textStyle, int i10, boolean z10, int i11, long j11, int i12) {
        TextLayoutResult textLayoutResultM32940measurexDpz5zY$default = TextMeasurer.m32940measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, i10, z10, i11, null, m32953textLayoutConstraintsv_w8tDc(drawScope, j11, j10), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            clip(transform, textLayoutResultM32940measurexDpz5zY$default);
            textLayoutResultM32940measurexDpz5zY$default.getMultiParagraph().m32820paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i12);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m32951drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j10, long j11, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        float alpha;
        int i11;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Canvas canvas;
        MultiParagraph multiParagraph;
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11)));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j10 != 16) {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (j10 == 16) {
                    j10 = textLayoutResult.getLayoutInput().getStyle().m32996getColor0d7_KjU();
                }
                multiParagraph2.m32820paintLG529CI(canvas2, TextDrawStyleKt.m33405modulateDxMtmZc(j10, f10), shadow3, textDecoration3, drawStyle3, i10);
            } else {
                MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
                Canvas canvas3 = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(f10)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                    i11 = i10;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                } else {
                    alpha = f10;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                    i11 = i10;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                }
                multiParagraph.m32822painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i11);
            }
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            throw th;
        }
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m32953textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j10, long j11) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j10 >> 32)))) {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (j11 >> 32))));
            iRound2 = 0;
        } else {
            iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 >> 32))));
            iRound = iRound2;
        }
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j10 & 4294967295L)))) {
            iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L))));
        } else {
            iRound4 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            iRound3 = iRound4;
        }
        return ConstraintsKt.Constraints(iRound2, iRound, iRound4, iRound3);
    }
}

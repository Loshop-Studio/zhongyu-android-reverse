package androidx.compose.p013ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.BrushKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.ParagraphInfo;
import androidx.compose.p013ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes2.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m26617drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1 || (brush instanceof SolidColor)) {
            m26619drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i11);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderMo24245createShaderuvyYCjk = ((ShaderBrush) brush).mo24245createShaderuvyYCjk(Size.m24095constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(height) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderMo24245createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i12);
                paragraphInfo2.getParagraph().mo26180painthn5TExg(canvas, BrushKt.ShaderBrush(shaderMo24245createShaderuvyYCjk), f10, shadow, textDecoration, drawStyle, i10);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderMo24245createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m26618drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        m26617drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? BlendMode.Companion.m24218getSrcOver0nO6VwU() : i10);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m26619drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i11);
            paragraphInfo.getParagraph().mo26180painthn5TExg(canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}

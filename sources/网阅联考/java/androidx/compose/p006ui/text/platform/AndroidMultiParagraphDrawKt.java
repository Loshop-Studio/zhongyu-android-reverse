package androidx.compose.p006ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.BrushKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.ShaderBrush;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.SolidColor;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.text.MultiParagraph;
import androidx.compose.p006ui.text.ParagraphInfo;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m5175d2 = {"drawMultiParagraph", "", "Landroidx/compose/ui/text/MultiParagraph;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawParagraphs", "drawParagraphs-7AXcY_I", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidMultiParagraphDrawKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m11288drawMultiParagraph7AXcY_I(MultiParagraph drawMultiParagraph, Canvas canvas, Brush brush, float f4, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i4) {
        Intrinsics.checkNotNullParameter(drawMultiParagraph, "$this$drawMultiParagraph");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        canvas.save();
        if (drawMultiParagraph.getParagraphInfoList$ui_text_release().size() <= 1 || (brush instanceof SolidColor)) {
            m11290drawParagraphs7AXcY_I(drawMultiParagraph, canvas, brush, f4, shadow, textDecoration, drawStyle, i4);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = drawMultiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i5);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderMo9153createShaderuvyYCjk = ((ShaderBrush) brush).mo9153createShaderuvyYCjk(SizeKt.Size(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo9153createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = drawMultiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i6);
                paragraphInfo2.getParagraph().mo10946painthn5TExg(canvas, BrushKt.ShaderBrush(shaderMo9153createShaderuvyYCjk), f4, shadow, textDecoration, drawStyle, i4);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderMo9153createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m11290drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f4, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i4) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i5);
            paragraphInfo.getParagraph().mo10946painthn5TExg(canvas, brush, f4, shadow, textDecoration, drawStyle, i4);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}

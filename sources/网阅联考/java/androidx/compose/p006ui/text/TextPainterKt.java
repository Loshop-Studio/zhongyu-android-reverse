package androidx.compose.p006ui.text;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.BlendMode;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.drawscope.AbstractC1313c;
import androidx.compose.p006ui.graphics.drawscope.DrawContext;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.graphics.drawscope.DrawTransform;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextOverflow;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001ak\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0085\u0001\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0014\b\u0002\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ao\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u0002032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a)\u00106\u001a\u000207*\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m5175d2 = {"DefaultTextBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTextBlendMode", "()I", "I", "clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,405:1\n261#2,11:406\n261#2,11:417\n261#2,8:428\n269#2,3:439\n261#2,11:442\n652#3:436\n658#3:437\n646#3:438\n159#4:453\n159#4:454\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n171#1:406,11\n237#1:417,11\n281#1:428,8\n281#1:439,3\n344#1:442,11\n288#1:436\n301#1:437\n301#1:438\n382#1:453\n394#1:454\n*E\n"})
/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final int DefaultTextBlendMode = BlendMode.INSTANCE.m9128getSrcOver0nO6VwU();

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m11471equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m11480getVisiblegIe3tQ8())) {
            return;
        }
        AbstractC1313c.m468d(drawTransform, 0.0f, 0.0f, IntSize.m11685getWidthimpl(textLayoutResult.getSize()), IntSize.m11684getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m11056drawTextJFhB2K4(DrawScope drawText, TextMeasurer textMeasurer, AnnotatedString text, long j4, TextStyle style, int i4, boolean z3, int i5, List<AnnotatedString.Range<Placeholder>> placeholders, long j5, int i6) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        TextLayoutResult textLayoutResultM11053measurexDpz5zY$default = TextMeasurer.m11053measurexDpz5zY$default(textMeasurer, text, style, i4, z3, i5, placeholders, m11064textLayoutConstraintsv_w8tDc(drawText, j5, j4), drawText.getLayoutDirection(), drawText, null, false, 1536, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4));
        clip(transform, textLayoutResultM11053measurexDpz5zY$default);
        textLayoutResultM11053measurexDpz5zY$default.getMultiParagraph().m10972paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m9214getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i6);
        drawContext.getCanvas().restore();
        drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m11058drawTextLVfH_YU(DrawScope drawText, TextLayoutResult textLayoutResult, Brush brush, long j4, float f4, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i4) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m10974painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f4) ? f4 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i4);
        drawContext.getCanvas().restore();
        drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m11060drawTextTPWCCtM(DrawScope drawText, TextMeasurer textMeasurer, String text, long j4, TextStyle style, int i4, boolean z3, int i5, long j5, int i6) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        TextLayoutResult textLayoutResultM11053measurexDpz5zY$default = TextMeasurer.m11053measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, i4, z3, i5, null, m11064textLayoutConstraintsv_w8tDc(drawText, j5, j4), drawText.getLayoutDirection(), drawText, null, false, 1568, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4));
        clip(transform, textLayoutResultM11053measurexDpz5zY$default);
        textLayoutResultM11053measurexDpz5zY$default.getMultiParagraph().m10972paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m9214getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i6);
        drawContext.getCanvas().restore();
        drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @androidx.compose.p006ui.text.ExperimentalTextApi
    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11062drawTextd8rzKo(androidx.compose.p006ui.graphics.drawscope.DrawScope r13, androidx.compose.p006ui.text.TextLayoutResult r14, long r15, long r17, float r19, androidx.compose.p006ui.graphics.Shadow r20, androidx.compose.p006ui.text.style.TextDecoration r21, androidx.compose.p006ui.graphics.drawscope.DrawStyle r22, int r23) {
        /*
            r0 = r14
            java.lang.String r1 = "$this$drawText"
            r2 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "textLayoutResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            if (r20 != 0) goto L1c
            androidx.compose.ui.text.TextLayoutInput r1 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r1 = r1.getStyle()
            androidx.compose.ui.graphics.Shadow r1 = r1.getShadow()
            goto L1e
        L1c:
            r1 = r20
        L1e:
            if (r21 != 0) goto L2d
            androidx.compose.ui.text.TextLayoutInput r3 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r3 = r3.getStyle()
            androidx.compose.ui.text.style.TextDecoration r3 = r3.getTextDecoration()
            goto L2f
        L2d:
            r3 = r21
        L2f:
            if (r22 != 0) goto L3e
            androidx.compose.ui.text.TextLayoutInput r4 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r4 = r4.getStyle()
            androidx.compose.ui.graphics.drawscope.DrawStyle r4 = r4.getDrawStyle()
            goto L40
        L3e:
            r4 = r22
        L40:
            androidx.compose.ui.graphics.drawscope.DrawContext r5 = r13.getDrawContext()
            long r6 = r5.mo9620getSizeNHjbRc()
            androidx.compose.ui.graphics.Canvas r8 = r5.getCanvas()
            r8.save()
            androidx.compose.ui.graphics.drawscope.DrawTransform r8 = r5.getTransform()
            float r9 = androidx.compose.p006ui.geometry.Offset.m8945getXimpl(r17)
            float r10 = androidx.compose.p006ui.geometry.Offset.m8946getYimpl(r17)
            r8.translate(r9, r10)
            clip(r8, r14)
            androidx.compose.ui.text.TextLayoutInput r8 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r8 = r8.getStyle()
            androidx.compose.ui.graphics.Brush r8 = r8.getBrush()
            r9 = 1
            r10 = 0
            if (r8 == 0) goto Lb2
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.p006ui.graphics.Color.INSTANCE
            long r11 = r11.m9214getUnspecified0d7_KjU()
            int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r11 != 0) goto L7d
            r11 = r9
            goto L7e
        L7d:
            r11 = r10
        L7e:
            if (r11 == 0) goto Lb2
            androidx.compose.ui.text.MultiParagraph r9 = r14.getMultiParagraph()
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r13.getDrawContext()
            androidx.compose.ui.graphics.Canvas r2 = r2.getCanvas()
            boolean r10 = java.lang.Float.isNaN(r19)
            if (r10 != 0) goto L95
            r0 = r19
            goto La1
        L95:
            androidx.compose.ui.text.TextLayoutInput r0 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r0 = r0.getStyle()
            float r0 = r0.getAlpha()
        La1:
            r13 = r9
            r14 = r2
            r15 = r8
            r16 = r0
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r23
            r13.m10974painthn5TExg(r14, r15, r16, r17, r18, r19, r20)
            goto Lee
        Lb2:
            androidx.compose.ui.text.MultiParagraph r8 = r14.getMultiParagraph()
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r13.getDrawContext()
            androidx.compose.ui.graphics.Canvas r2 = r2.getCanvas()
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.p006ui.graphics.Color.INSTANCE
            long r11 = r11.m9214getUnspecified0d7_KjU()
            int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r11 == 0) goto Lc9
            goto Lca
        Lc9:
            r9 = r10
        Lca:
            if (r9 == 0) goto Lce
            r9 = r15
            goto Lda
        Lce:
            androidx.compose.ui.text.TextLayoutInput r0 = r14.getLayoutInput()
            androidx.compose.ui.text.TextStyle r0 = r0.getStyle()
            long r9 = r0.m11097getColor0d7_KjU()
        Lda:
            r0 = r19
            long r9 = androidx.compose.p006ui.text.style.TextDrawStyleKt.m11449modulateDxMtmZc(r9, r0)
            r13 = r8
            r14 = r2
            r15 = r9
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r23
            r13.m10972paintLG529CI(r14, r15, r17, r18, r19, r20)
        Lee:
            androidx.compose.ui.graphics.Canvas r0 = r5.getCanvas()
            r0.restore()
            r5.mo9621setSizeuvyYCjk(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.TextPainterKt.m11062drawTextd8rzKo(androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.text.TextLayoutResult, long, long, float, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle, int):void");
    }

    public static final int getDefaultTextBlendMode() {
        return DefaultTextBlendMode;
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m11064textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j4, long j5) {
        int iRoundToInt;
        int iRoundToInt2;
        int iRoundToInt3;
        Size.Companion companion = Size.INSTANCE;
        boolean z3 = true;
        int iRoundToInt4 = 0;
        if (((j4 > companion.m9022getUnspecifiedNHjbRc() ? 1 : (j4 == companion.m9022getUnspecifiedNHjbRc() ? 0 : -1)) == 0) || Float.isNaN(Size.m9014getWidthimpl(j4))) {
            iRoundToInt2 = MathKt__MathJVMKt.roundToInt((float) Math.ceil(Size.m9014getWidthimpl(drawScope.mo9614getSizeNHjbRc()) - Offset.m8945getXimpl(j5)));
            iRoundToInt = 0;
        } else {
            iRoundToInt = MathKt__MathJVMKt.roundToInt((float) Math.ceil(Size.m9014getWidthimpl(j4)));
            iRoundToInt2 = iRoundToInt;
        }
        if (!(j4 == companion.m9022getUnspecifiedNHjbRc()) && !Float.isNaN(Size.m9011getHeightimpl(j4))) {
            z3 = false;
        }
        if (z3) {
            iRoundToInt3 = MathKt__MathJVMKt.roundToInt((float) Math.ceil(Size.m9011getHeightimpl(drawScope.mo9614getSizeNHjbRc()) - Offset.m8946getYimpl(j5)));
        } else {
            iRoundToInt4 = MathKt__MathJVMKt.roundToInt((float) Math.ceil(Size.m9011getHeightimpl(j4)));
            iRoundToInt3 = iRoundToInt4;
        }
        return ConstraintsKt.Constraints(iRoundToInt, iRoundToInt2, iRoundToInt4, iRoundToInt3);
    }
}

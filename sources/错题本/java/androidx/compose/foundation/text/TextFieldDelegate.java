package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextPainter;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.EditCommand;
import androidx.compose.p011ui.text.input.EditProcessor;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TextInputService;
import androidx.compose.p011ui.text.input.TextInputSession;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m5109d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010'\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&JG\u00100\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b.\u0010/J/\u00105\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000202H\u0001¢\u0006\u0004\b3\u00104JC\u0010@\u001a\u00020\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010:\u001a\u0002092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0;2\b\u0010=\u001a\u0004\u0018\u00010*H\u0001¢\u0006\u0004\b>\u0010?JF\u0010E\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020A2\u0006\u0010\u000b\u001a\u0002022\u0006\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u00020\b2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0;H\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJW\u0010N\u001a\u00020*2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010:\u001a\u0002092\u0006\u0010I\u001a\u00020H2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0;2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u000e0;H\u0001¢\u0006\u0004\bL\u0010MJW\u0010P\u001a\u00020*2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010:\u001a\u0002092\u0006\u0010I\u001a\u00020H2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0;2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u000e0;H\u0001¢\u0006\u0004\bO\u0010MJ3\u0010S\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u0010:\u001a\u0002092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0;H\u0001¢\u0006\u0004\bQ\u0010RJ \u0010Y\u001a\u00020U2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010V\u001a\u00020Uø\u0001\u0000¢\u0006\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, m5110d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextRange;", "range", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "paint", "Ld6/s;", "drawHighlight-Le-punE", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", "drawHighlight", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "prevResultText", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "layout", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "draw-Q1vqE60$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V", "draw", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "hasFocus", "notifyFocusedRect$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "notifyFocusedRect", "textFieldValue", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "updateTextLayoutResult$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "updateTextLayoutResult", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "onEditCommand$foundation_release", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lr6/c;Landroidx/compose/ui/text/input/TextInputSession;)V", "onEditCommand", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lr6/c;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "restartInput$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lr6/c;Lr6/c;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput", "onFocus$foundation_release", "onFocus", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lr6/c;)V", "onBlur", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,440:1\n54#2:441\n59#2:443\n59#2:447\n85#3:442\n90#3:444\n90#3:448\n53#3,3:450\n60#3:454\n70#3:457\n53#3,3:459\n1#4:445\n640#5:446\n30#6:449\n30#6:458\n65#7:453\n69#7:456\n22#8:455\n56#9,6:462\n33#10:468\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n*L\n111#1:441\n111#1:443\n228#1:447\n111#1:442\n111#1:444\n228#1:448\n231#1:450,3\n234#1:454\n234#1:457\n234#1:459,3\n150#1:446\n231#1:449\n234#1:458\n234#1:453\n234#1:456\n234#1:455\n234#1:462,6\n234#1:468\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m7698drawHighlightLepunE(Canvas canvas, long range, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m12768getMinimpl(range));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m12767getMaximpl(range));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m7699layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j7, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m7702layout_EkL_Y$foundation_release(textDelegate, j7, layoutDirection, textLayoutResult);
        }

        @NotNull
        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m7700applyCompositionDecoration72CqOWE(long compositionRange, @NotNull TransformedText transformed) {
            int iOriginalToTransformed = transformed.getOffsetMapping().originalToTransformed(TextRange.m12770getStartimpl(compositionRange));
            int iOriginalToTransformed2 = transformed.getOffsetMapping().originalToTransformed(TextRange.m12765getEndimpl(compositionRange));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC5824e) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        @JvmStatic
        /* renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m7701drawQ1vqE60$foundation_release(@NotNull Canvas canvas, @NotNull TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull Paint highlightPaint, long selectionBackgroundColor) {
            if (!TextRange.m12764getCollapsedimpl(selectionPreviewHighlightRange)) {
                highlightPaint.mo10561setColor8_81llA(selectionBackgroundColor);
                m7698drawHighlightLepunE(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!TextRange.m12764getCollapsedimpl(deletionPreviewHighlightRange)) {
                Color colorM10672boximpl = Color.m10672boximpl(textLayoutResult.getLayoutInput().getStyle().m12800getColor0d7_KjU());
                if (colorM10672boximpl.m10692unboximpl() == 16) {
                    colorM10672boximpl = null;
                }
                long jM10692unboximpl = colorM10672boximpl != null ? colorM10672boximpl.m10692unboximpl() : Color.INSTANCE.m10708getBlack0d7_KjU();
                highlightPaint.mo10561setColor8_81llA(Color.m10681copywmQWz5c$default(jM10692unboximpl, Color.m10684getAlphaimpl(jM10692unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m7698drawHighlightLepunE(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!TextRange.m12764getCollapsedimpl(value.getSelection())) {
                highlightPaint.mo10561setColor8_81llA(selectionBackgroundColor);
                m7698drawHighlightLepunE(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @JvmStatic
        @NotNull
        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m7702layout_EkL_Y$foundation_release(@NotNull TextDelegate textDelegate, long constraints, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult prevResultText) {
            TextLayoutResult textLayoutResultM7689layoutNN6EwU = textDelegate.m7689layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf((int) (textLayoutResultM7689layoutNN6EwU.getSize() >> 32)), Integer.valueOf((int) (textLayoutResultM7689layoutNN6EwU.getSize() & 4294967295L)), textLayoutResultM7689layoutNN6EwU);
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(@NotNull TextFieldValue value, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull LayoutCoordinates layoutCoordinates, @NotNull TextInputSession textInputSession, boolean hasFocus, @NotNull OffsetMapping offsetMapping) {
            if (hasFocus) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m12767getMaximpl(value.getSelection()));
                Rect boundingBox = iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
                long jMo12044localToRootMKHz9U = layoutCoordinates.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32)));
                textInputSession.notifyFocusedRect(RectKt.m10481Recttz77jQw(Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U >> 32))) << 32)), Size.m10501constructorimpl((Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32))));
            }
        }

        @JvmStatic
        public final void onBlur$foundation_release(@NotNull TextInputSession textInputSession, @NotNull EditProcessor editProcessor, @NotNull InterfaceC6471c onValueChange) {
            onValueChange.invoke(TextFieldValue.m13013copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(@NotNull List<? extends EditCommand> ops, @NotNull EditProcessor editProcessor, @NotNull InterfaceC6471c onValueChange, @Nullable TextInputSession session) {
            TextFieldValue textFieldValueApply = editProcessor.apply(ops);
            if (session != null) {
                session.updateState(null, textFieldValueApply);
            }
            onValueChange.invoke(textFieldValueApply);
        }

        @JvmStatic
        @NotNull
        public final TextInputSession onFocus$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull InterfaceC6471c onValueChange, @NotNull InterfaceC6471c onImeActionPerformed) {
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @JvmStatic
        @NotNull
        public final TextInputSession restartInput$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull final EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull final InterfaceC6471c onValueChange, @NotNull InterfaceC6471c onImeActionPerformed) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? StartInput = textInputService.startInput(value, imeOptions, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends EditCommand>) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(List<? extends EditCommand> list) {
                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(list, editProcessor, onValueChange, ref$ObjectRef.element);
                }
            }, onImeActionPerformed);
            ref$ObjectRef.element = StartInput;
            return StartInput;
        }

        @JvmStatic
        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m7703setCursorOffsetULxng0E$foundation_release(long position, @NotNull TextLayoutResultProxy textLayoutResult, @NotNull EditProcessor editProcessor, @NotNull OffsetMapping offsetMapping, @NotNull InterfaceC6471c onValueChange) {
            onValueChange.invoke(TextFieldValue.m13013copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m7725getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        @JvmStatic
        public final void updateTextLayoutResult$foundation_release(@NotNull TextInputSession textInputSession, @NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResultProxy textLayoutResult) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult.getValue(), new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7704invoke58bKbWc(((Matrix) obj).m10935unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m7704invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(innerTextFieldCoordinates).mo12048transformFromEL8BTi8(innerTextFieldCoordinates, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.PlatformSpanStyle;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextPainter;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.EditProcessor;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.p014ui.text.input.TextInputSession;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m27894drawHighlightLepunE(Canvas canvas, long j10, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m32964getMinimpl(j10));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m32963getMaximpl(j10));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m27895layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m27898layout_EkL_Y$foundation_release(textDelegate, j10, layoutDirection, textLayoutResult);
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m27896applyCompositionDecoration72CqOWE(long j10, TransformedText transformedText) {
            int iOriginalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m32966getStartimpl(j10));
            int iOriginalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m32961getEndimpl(j10));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9972n) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        /* renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m27897drawQ1vqE60$foundation_release(Canvas canvas, TextFieldValue textFieldValue, long j10, long j11, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j12) {
            if (!TextRange.m32960getCollapsedimpl(j10)) {
                paint.mo30757setColor8_81llA(j12);
                m27894drawHighlightLepunE(canvas, j10, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m32960getCollapsedimpl(j11)) {
                Color colorM30868boximpl = Color.m30868boximpl(textLayoutResult.getLayoutInput().getStyle().m32996getColor0d7_KjU());
                if (colorM30868boximpl.m30888unboximpl() == 16) {
                    colorM30868boximpl = null;
                }
                long jM30888unboximpl = colorM30868boximpl != null ? colorM30868boximpl.m30888unboximpl() : Color.Companion.m30904getBlack0d7_KjU();
                paint.mo30757setColor8_81llA(Color.m30877copywmQWz5c$default(jM30888unboximpl, Color.m30880getAlphaimpl(jM30888unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m27894drawHighlightLepunE(canvas, j11, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m32960getCollapsedimpl(textFieldValue.m33214getSelectiond9O1mEE())) {
                paint.mo30757setColor8_81llA(j12);
                m27894drawHighlightLepunE(canvas, textFieldValue.m33214getSelectiond9O1mEE(), offsetMapping, textLayoutResult, paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m27898layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResultM27885layoutNN6EwU = textDelegate.m27885layoutNN6EwU(j10, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf((int) (textLayoutResultM27885layoutNN6EwU.m32937getSizeYbymL2g() >> 32)), Integer.valueOf((int) (textLayoutResultM27885layoutNN6EwU.m32937getSizeYbymL2g() & 4294967295L)), textLayoutResultM27885layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z10, OffsetMapping offsetMapping) {
            if (z10) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()));
                Rect boundingBox = iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
                long jMo32240localToRootMKHz9U = layoutCoordinates.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32)));
                textInputSession.notifyFocusedRect(RectKt.m30677Recttz77jQw(Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo32240localToRootMKHz9U & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo32240localToRootMKHz9U >> 32))) << 32)), Size.m30697constructorimpl((Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32))));
            }
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, InterfaceC9540l interfaceC9540l) {
            interfaceC9540l.invoke(TextFieldValue.m33209copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, InterfaceC9540l interfaceC9540l, TextInputSession textInputSession) {
            TextFieldValue textFieldValueApply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, textFieldValueApply);
            }
            interfaceC9540l.invoke(textFieldValueApply);
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, interfaceC9540l, interfaceC9540l2);
        }

        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, final EditProcessor editProcessor, ImeOptions imeOptions, final InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            TextInputSession textInputSessionStartInput = textInputService.startInput(textFieldValue, imeOptions, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends EditCommand>) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(List<? extends EditCommand> list) {
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(list, editProcessor, interfaceC9540l, (TextInputSession) ref$ObjectRef.f23402c);
                }
            }, interfaceC9540l2);
            ref$ObjectRef.f23402c = textInputSessionStartInput;
            return textInputSessionStartInput;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m27899setCursorOffsetULxng0E$foundation_release(long j10, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, InterfaceC9540l interfaceC9540l) {
            interfaceC9540l.invoke(TextFieldValue.m33209copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j10, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        public final void updateTextLayoutResult$foundation_release(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m27900invoke58bKbWc(((Matrix) obj).m31131unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m27900invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(innerTextFieldCoordinates).mo32244transformFromEL8BTi8(innerTextFieldCoordinates, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextPainter;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.EditCommand;
import androidx.compose.p013ui.text.input.EditProcessor;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.p013ui.text.input.TextInputSession;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m21292drawHighlightLepunE(Canvas canvas, long j10, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m26362getMinimpl(j10));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m26361getMaximpl(j10));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m21293layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m21296layout_EkL_Y$foundation_release(textDelegate, j10, layoutDirection, textLayoutResult);
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m21294applyCompositionDecoration72CqOWE(long j10, TransformedText transformedText) {
            int iOriginalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m26364getStartimpl(j10));
            int iOriginalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m26359getEndimpl(j10));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9126n) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        /* renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m21295drawQ1vqE60$foundation_release(Canvas canvas, TextFieldValue textFieldValue, long j10, long j11, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j12) {
            if (!TextRange.m26358getCollapsedimpl(j10)) {
                paint.mo24155setColor8_81llA(j12);
                m21292drawHighlightLepunE(canvas, j10, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m26358getCollapsedimpl(j11)) {
                Color colorM24266boximpl = Color.m24266boximpl(textLayoutResult.getLayoutInput().getStyle().m26394getColor0d7_KjU());
                if (colorM24266boximpl.m24286unboximpl() == 16) {
                    colorM24266boximpl = null;
                }
                long jM24286unboximpl = colorM24266boximpl != null ? colorM24266boximpl.m24286unboximpl() : Color.Companion.m24302getBlack0d7_KjU();
                paint.mo24155setColor8_81llA(Color.m24275copywmQWz5c$default(jM24286unboximpl, Color.m24278getAlphaimpl(jM24286unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m21292drawHighlightLepunE(canvas, j11, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m26358getCollapsedimpl(textFieldValue.m26612getSelectiond9O1mEE())) {
                paint.mo24155setColor8_81llA(j12);
                m21292drawHighlightLepunE(canvas, textFieldValue.m26612getSelectiond9O1mEE(), offsetMapping, textLayoutResult, paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m21296layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResultM21283layoutNN6EwU = textDelegate.m21283layoutNN6EwU(j10, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf((int) (textLayoutResultM21283layoutNN6EwU.m26335getSizeYbymL2g() >> 32)), Integer.valueOf((int) (textLayoutResultM21283layoutNN6EwU.m26335getSizeYbymL2g() & 4294967295L)), textLayoutResultM21283layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z10, OffsetMapping offsetMapping) {
            if (z10) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE()));
                Rect boundingBox = iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
                long jMo25638localToRootMKHz9U = layoutCoordinates.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32)));
                textInputSession.notifyFocusedRect(RectKt.m24075Recttz77jQw(Offset.m24027constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo25638localToRootMKHz9U >> 32))) << 32)), Size.m24095constructorimpl((Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32))));
            }
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, InterfaceC10570l interfaceC10570l) {
            interfaceC10570l.invoke(TextFieldValue.m26607copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, InterfaceC10570l interfaceC10570l, TextInputSession textInputSession) {
            TextFieldValue textFieldValueApply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, textFieldValueApply);
            }
            interfaceC10570l.invoke(textFieldValueApply);
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, interfaceC10570l, interfaceC10570l2);
        }

        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, final EditProcessor editProcessor, ImeOptions imeOptions, final InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            TextInputSession textInputSessionStartInput = textInputService.startInput(textFieldValue, imeOptions, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends EditCommand>) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(List<? extends EditCommand> list) {
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(list, editProcessor, interfaceC10570l, (TextInputSession) ref$ObjectRef.f17473a);
                }
            }, interfaceC10570l2);
            ref$ObjectRef.f17473a = textInputSessionStartInput;
            return textInputSessionStartInput;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m21297setCursorOffsetULxng0E$foundation_release(long j10, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, InterfaceC10570l interfaceC10570l) {
            interfaceC10570l.invoke(TextFieldValue.m26607copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m21319getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j10, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        public final void updateTextLayoutResult$foundation_release(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m21298invoke58bKbWc(((Matrix) obj).m24529unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m21298invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(innerTextFieldCoordinates).mo25642transformFromEL8BTi8(innerTextFieldCoordinates, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}

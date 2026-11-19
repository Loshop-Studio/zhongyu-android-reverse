package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\f\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0001\u001a$\u0010\u0015\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0016H\u0001\u001a\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a8\u0010\u0018\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001c0\u001bj\u0002`\u001d\u0018\u00010\u001aH\u0000\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¨\u0006\u001f"}, m13413d2 = {"isSurrogatePair", "", "high", "", "low", "commitText", "", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "text", "", "newCursorPosition", "", "deleteSurroundingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingTextInCodePoints", "finishComposingText", "imeDelete", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "imeReplace", "", "setComposingRegion", "setComposingText", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "setSelection", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i9) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m23460getStartimpl(composition.getPackedValue()), TextRange.m23455getEndimpl(composition.getPackedValue()), str);
                } else {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()), TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()), str);
                }
                int iM23460getStartimpl = TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars());
                int i10 = i9;
                textFieldBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i10 > 0 ? (iM23460getStartimpl + i10) - 1 : (iM23460getStartimpl + i10) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, final int i9, final int i10) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                int i11 = i9;
                boolean z9 = i11 >= 0 && i10 >= 0;
                int i12 = i10;
                if (!z9) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
                }
                int iM23455getEndimpl = TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars());
                int i13 = i10;
                int length = iM23455getEndimpl + i13;
                if (((iM23455getEndimpl ^ length) & (i13 ^ length)) < 0) {
                    length = textFieldBuffer.getLength();
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()), Math.min(length, textFieldBuffer.getLength()));
                int iM23460getStartimpl = TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars());
                int i14 = i9;
                int i15 = iM23460getStartimpl - i14;
                if (((iM23460getStartimpl ^ i15) & (i14 ^ iM23460getStartimpl)) < 0) {
                    i15 = 0;
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, Math.max(0, i15), TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i9, final int i10) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                int i11 = i9;
                int i12 = 0;
                boolean z9 = i11 >= 0 && i10 >= 0;
                int i13 = i10;
                if (!z9) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i13 + " respectively.");
                }
                int i14 = 0;
                int iM23460getStartimpl = 0;
                while (true) {
                    if (i14 < i9) {
                        int i15 = iM23460getStartimpl + 1;
                        if (TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()) <= i15) {
                            iM23460getStartimpl = TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars());
                            break;
                        } else {
                            iM23460getStartimpl = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()) - i15) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()) - i15)) ? iM23460getStartimpl + 2 : i15;
                            i14++;
                        }
                    } else {
                        break;
                    }
                }
                int length = 0;
                while (true) {
                    if (i12 >= i10) {
                        break;
                    }
                    int i16 = length + 1;
                    if (TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()) + i16 >= textFieldBuffer.getLength()) {
                        length = textFieldBuffer.getLength() - TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars());
                        break;
                    } else {
                        length = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()) + i16) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()) + i16)) ? length + 2 : i16;
                        i12++;
                    }
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()), TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()) + length);
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()) - iM23460getStartimpl, TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.commitComposition$foundation_release();
            }
        });
    }

    @VisibleForTesting
    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i9, int i10) {
        TextRange composition = textFieldBuffer.getComposition();
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        TextFieldBufferKt.delete(textFieldBuffer, iMin, iMax);
        if (composition != null) {
            composition.getPackedValue();
            long jM18575adjustTextRangevJH6DeI = TextFieldBufferKt.m18575adjustTextRangevJH6DeI(composition.getPackedValue(), iMin, iMax, 0);
            if (TextRange.m23454getCollapsedimpl(jM18575adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m23458getMinimpl(jM18575adjustTextRangevJH6DeI), TextRange.m23457getMaximpl(jM18575adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    @VisibleForTesting
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i9, int i10, CharSequence charSequence) {
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        int i11 = 0;
        int i12 = iMin;
        while (i12 < iMax && i11 < charSequence.length() && charSequence.charAt(i11) == textFieldBuffer.asCharSequence().charAt(i12)) {
            i11++;
            i12++;
        }
        int length = charSequence.length();
        while (iMax > i12 && length > i11 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i12 == iMax && i11 == length) {
            textFieldBuffer.commitComposition$foundation_release();
            textFieldBuffer.clearHighlight$foundation_release();
        } else {
            textFieldBuffer.replace(i12, iMax, charSequence.subSequence(i11, length));
        }
        textFieldBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(iMin + charSequence.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, final int i9, final int i10) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.hasComposition$foundation_release()) {
                    textFieldBuffer.commitComposition$foundation_release();
                }
                int iCoerceIn = RangesKt.coerceIn(i9, 0, textFieldBuffer.getLength());
                int iCoerceIn2 = RangesKt.coerceIn(i10, 0, textFieldBuffer.getLength());
                if (iCoerceIn != iCoerceIn2) {
                    if (iCoerceIn < iCoerceIn2) {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iCoerceIn, iCoerceIn2, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iCoerceIn2, iCoerceIn, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i9, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m23460getStartimpl(composition.getPackedValue()), TextRange.m23455getEndimpl(composition.getPackedValue()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(TextRange.m23460getStartimpl(composition.getPackedValue()), TextRange.m23460getStartimpl(composition.getPackedValue()) + str.length(), list);
                    }
                } else {
                    int iM23460getStartimpl = TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars());
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, iM23460getStartimpl, TextRange.m23455getEndimpl(textFieldBuffer.getSelectionInChars()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(iM23460getStartimpl, str.length() + iM23460getStartimpl, list);
                    }
                }
                int iM23460getStartimpl2 = TextRange.m23460getStartimpl(textFieldBuffer.getSelectionInChars());
                int i10 = i9;
                textFieldBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i10 > 0 ? (iM23460getStartimpl2 + i10) - 1 : (iM23460getStartimpl2 + i10) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i9, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i9, list);
    }

    public static final void setSelection(final ImeEditCommandScope imeEditCommandScope, final int i9, final int i10) {
        imeEditCommandScope.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                long jMo18606mapToTransformedGEjPoXI = imeEditCommandScope.mo18606mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
                int i11 = i9;
                int iM23458getMinimpl = TextRange.m23458getMinimpl(jMo18606mapToTransformedGEjPoXI);
                int iM23457getMaximpl = TextRange.m23457getMaximpl(jMo18606mapToTransformedGEjPoXI);
                if (i11 < iM23458getMinimpl) {
                    i11 = iM23458getMinimpl;
                }
                if (i11 <= iM23457getMaximpl) {
                    iM23457getMaximpl = i11;
                }
                int i12 = i10;
                int iM23458getMinimpl2 = TextRange.m23458getMinimpl(jMo18606mapToTransformedGEjPoXI);
                int iM23457getMaximpl2 = TextRange.m23457getMaximpl(jMo18606mapToTransformedGEjPoXI);
                if (i12 < iM23458getMinimpl2) {
                    i12 = iM23458getMinimpl2;
                }
                if (i12 <= iM23457getMaximpl2) {
                    iM23457getMaximpl2 = i12;
                }
                textFieldBuffer.m18571setSelection5zctL8(imeEditCommandScope.mo18605mapFromTransformedGEjPoXI(TextRangeKt.TextRange(iM23457getMaximpl, iM23457getMaximpl2)));
            }
        });
    }
}

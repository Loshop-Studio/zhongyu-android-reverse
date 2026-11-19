package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import java.util.List;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i10) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange textRangeM27937getCompositionMzsxiRA$foundation_release = textFieldBuffer.m27937getCompositionMzsxiRA$foundation_release();
                if (textRangeM27937getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m32966getStartimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()), TextRange.m32961getEndimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()), str);
                } else {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), str);
                }
                int iM32966getStartimpl = TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                int i11 = i10;
                textFieldBuffer.m27941setSelection5zctL8(TextRangeKt.TextRange(AbstractC10410o.m21761n(i11 > 0 ? (iM32966getStartimpl + i11) - 1 : (iM32966getStartimpl + i11) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                int i12 = i10;
                boolean z10 = i12 >= 0 && i11 >= 0;
                int i13 = i11;
                if (!z10) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i13 + " respectively.");
                }
                int iM32961getEndimpl = TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                int i14 = i11;
                int length = iM32961getEndimpl + i14;
                if (((iM32961getEndimpl ^ length) & (i14 ^ length)) < 0) {
                    length = textFieldBuffer.getLength();
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), Math.min(length, textFieldBuffer.getLength()));
                int iM32966getStartimpl = TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                int i15 = i10;
                int i16 = iM32966getStartimpl - i15;
                if (((iM32966getStartimpl ^ i16) & (i15 ^ iM32966getStartimpl)) < 0) {
                    i16 = 0;
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, Math.max(0, i16), TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                int i12 = i10;
                int i13 = 0;
                boolean z10 = i12 >= 0 && i11 >= 0;
                int i14 = i11;
                if (!z10) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i14 + " respectively.");
                }
                int i15 = 0;
                int iM32966getStartimpl = 0;
                while (true) {
                    if (i15 < i10) {
                        int i16 = iM32966getStartimpl + 1;
                        if (TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) <= i16) {
                            iM32966getStartimpl = TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                            break;
                        } else {
                            iM32966getStartimpl = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) - i16) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) - i16)) ? iM32966getStartimpl + 2 : i16;
                            i15++;
                        }
                    } else {
                        break;
                    }
                }
                int length = 0;
                while (true) {
                    if (i13 >= i11) {
                        break;
                    }
                    int i17 = length + 1;
                    if (TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) + i17 >= textFieldBuffer.getLength()) {
                        length = textFieldBuffer.getLength() - TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                        break;
                    } else {
                        length = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) + i17) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) + i17)) ? length + 2 : i17;
                        i13++;
                    }
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) + length);
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()) - iM32966getStartimpl, TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()));
            }
        });
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.commitComposition$foundation_release();
            }
        });
    }

    @VisibleForTesting
    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i10, int i11) {
        TextRange textRangeM27937getCompositionMzsxiRA$foundation_release = textFieldBuffer.m27937getCompositionMzsxiRA$foundation_release();
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        TextFieldBufferKt.delete(textFieldBuffer, iMin, iMax);
        if (textRangeM27937getCompositionMzsxiRA$foundation_release != null) {
            textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl();
            long jM27945adjustTextRangevJH6DeI = TextFieldBufferKt.m27945adjustTextRangevJH6DeI(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl(), iMin, iMax, 0);
            if (TextRange.m32960getCollapsedimpl(jM27945adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m32964getMinimpl(jM27945adjustTextRangevJH6DeI), TextRange.m32963getMaximpl(jM27945adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    @VisibleForTesting
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i10, int i11, CharSequence charSequence) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (i13 < iMax && i12 < charSequence.length() && charSequence.charAt(i12) == textFieldBuffer.asCharSequence().charAt(i13)) {
            i12++;
            i13++;
        }
        int length = charSequence.length();
        while (iMax > i13 && length > i12 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i13 == iMax && i12 == length) {
            textFieldBuffer.commitComposition$foundation_release();
            textFieldBuffer.clearHighlight$foundation_release();
        } else {
            textFieldBuffer.replace(i13, iMax, charSequence.subSequence(i12, length));
        }
        textFieldBuffer.m27941setSelection5zctL8(TextRangeKt.TextRange(iMin + charSequence.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.hasComposition$foundation_release()) {
                    textFieldBuffer.commitComposition$foundation_release();
                }
                int iM21761n = AbstractC10410o.m21761n(i10, 0, textFieldBuffer.getLength());
                int iM21761n2 = AbstractC10410o.m21761n(i11, 0, textFieldBuffer.getLength());
                if (iM21761n != iM21761n2) {
                    if (iM21761n < iM21761n2) {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM21761n, iM21761n2, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM21761n2, iM21761n, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i10, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange textRangeM27937getCompositionMzsxiRA$foundation_release = textFieldBuffer.m27937getCompositionMzsxiRA$foundation_release();
                if (textRangeM27937getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m32966getStartimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()), TextRange.m32961getEndimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(TextRange.m32966getStartimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()), TextRange.m32966getStartimpl(textRangeM27937getCompositionMzsxiRA$foundation_release.m32970unboximpl()) + str.length(), list);
                    }
                } else {
                    int iM32966getStartimpl = TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, iM32966getStartimpl, TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(iM32966getStartimpl, str.length() + iM32966getStartimpl, list);
                    }
                }
                int iM32966getStartimpl2 = TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE());
                int i11 = i10;
                textFieldBuffer.m27941setSelection5zctL8(TextRangeKt.TextRange(AbstractC10410o.m21761n(i11 > 0 ? (iM32966getStartimpl2 + i11) - 1 : (iM32966getStartimpl2 + i11) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i10, list);
    }

    public static final void setSelection(final ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                long jMo27976mapToTransformedGEjPoXI = imeEditCommandScope.mo27976mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
                int i12 = i10;
                int iM32964getMinimpl = TextRange.m32964getMinimpl(jMo27976mapToTransformedGEjPoXI);
                int iM32963getMaximpl = TextRange.m32963getMaximpl(jMo27976mapToTransformedGEjPoXI);
                if (i12 < iM32964getMinimpl) {
                    i12 = iM32964getMinimpl;
                }
                if (i12 <= iM32963getMaximpl) {
                    iM32963getMaximpl = i12;
                }
                int i13 = i11;
                int iM32964getMinimpl2 = TextRange.m32964getMinimpl(jMo27976mapToTransformedGEjPoXI);
                int iM32963getMaximpl2 = TextRange.m32963getMaximpl(jMo27976mapToTransformedGEjPoXI);
                if (i13 < iM32964getMinimpl2) {
                    i13 = iM32964getMinimpl2;
                }
                if (i13 <= iM32963getMaximpl2) {
                    iM32963getMaximpl2 = i13;
                }
                textFieldBuffer.m27941setSelection5zctL8(imeEditCommandScope.mo27975mapFromTransformedGEjPoXI(TextRangeKt.TextRange(iM32963getMaximpl, iM32963getMaximpl2)));
            }
        });
    }
}

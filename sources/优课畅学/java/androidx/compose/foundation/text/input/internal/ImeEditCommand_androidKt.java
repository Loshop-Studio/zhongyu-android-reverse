package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import java.util.List;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i10) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange textRangeM21335getCompositionMzsxiRA$foundation_release = textFieldBuffer.m21335getCompositionMzsxiRA$foundation_release();
                if (textRangeM21335getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m26364getStartimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()), TextRange.m26359getEndimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()), str);
                } else {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()), TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()), str);
                }
                int iM26364getStartimpl = TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                int i11 = i10;
                textFieldBuffer.m21339setSelection5zctL8(TextRangeKt.TextRange(AbstractC8323h.m13518m(i11 > 0 ? (iM26364getStartimpl + i11) - 1 : (iM26364getStartimpl + i11) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                int i12 = i10;
                boolean z10 = i12 >= 0 && i11 >= 0;
                int i13 = i11;
                if (!z10) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i13 + " respectively.");
                }
                int iM26359getEndimpl = TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                int i14 = i11;
                int length = iM26359getEndimpl + i14;
                if (((iM26359getEndimpl ^ length) & (i14 ^ length)) < 0) {
                    length = textFieldBuffer.getLength();
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()), Math.min(length, textFieldBuffer.getLength()));
                int iM26364getStartimpl = TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                int i15 = i10;
                int i16 = iM26364getStartimpl - i15;
                if (((iM26364getStartimpl ^ i16) & (i15 ^ iM26364getStartimpl)) < 0) {
                    i16 = 0;
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, Math.max(0, i16), TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
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
                int iM26364getStartimpl = 0;
                while (true) {
                    if (i15 < i10) {
                        int i16 = iM26364getStartimpl + 1;
                        if (TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) <= i16) {
                            iM26364getStartimpl = TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                            break;
                        } else {
                            iM26364getStartimpl = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) - i16) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) - i16)) ? iM26364getStartimpl + 2 : i16;
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
                    if (TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) + i17 >= textFieldBuffer.getLength()) {
                        length = textFieldBuffer.getLength() - TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                        break;
                    } else {
                        length = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) + i17) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) + i17)) ? length + 2 : i17;
                        i13++;
                    }
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()), TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) + length);
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()) - iM26364getStartimpl, TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE()));
            }
        });
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText.1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.commitComposition$foundation_release();
            }
        });
    }

    @VisibleForTesting
    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i10, int i11) {
        TextRange textRangeM21335getCompositionMzsxiRA$foundation_release = textFieldBuffer.m21335getCompositionMzsxiRA$foundation_release();
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        TextFieldBufferKt.delete(textFieldBuffer, iMin, iMax);
        if (textRangeM21335getCompositionMzsxiRA$foundation_release != null) {
            textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl();
            long jM21343adjustTextRangevJH6DeI = TextFieldBufferKt.m21343adjustTextRangevJH6DeI(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl(), iMin, iMax, 0);
            if (TextRange.m26358getCollapsedimpl(jM21343adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m26362getMinimpl(jM21343adjustTextRangevJH6DeI), TextRange.m26361getMaximpl(jM21343adjustTextRangevJH6DeI), null, 4, null);
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
        textFieldBuffer.m21339setSelection5zctL8(TextRangeKt.TextRange(iMin + charSequence.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, final int i10, final int i11) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.hasComposition$foundation_release()) {
                    textFieldBuffer.commitComposition$foundation_release();
                }
                int iM13518m = AbstractC8323h.m13518m(i10, 0, textFieldBuffer.getLength());
                int iM13518m2 = AbstractC8323h.m13518m(i11, 0, textFieldBuffer.getLength());
                if (iM13518m != iM13518m2) {
                    if (iM13518m < iM13518m2) {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM13518m, iM13518m2, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM13518m2, iM13518m, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i10, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange textRangeM21335getCompositionMzsxiRA$foundation_release = textFieldBuffer.m21335getCompositionMzsxiRA$foundation_release();
                if (textRangeM21335getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m26364getStartimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()), TextRange.m26359getEndimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(TextRange.m26364getStartimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()), TextRange.m26364getStartimpl(textRangeM21335getCompositionMzsxiRA$foundation_release.m26368unboximpl()) + str.length(), list);
                    }
                } else {
                    int iM26364getStartimpl = TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, iM26364getStartimpl, TextRange.m26359getEndimpl(textFieldBuffer.m21337getSelectiond9O1mEE()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(iM26364getStartimpl, str.length() + iM26364getStartimpl, list);
                    }
                }
                int iM26364getStartimpl2 = TextRange.m26364getStartimpl(textFieldBuffer.m21337getSelectiond9O1mEE());
                int i11 = i10;
                textFieldBuffer.m21339setSelection5zctL8(TextRangeKt.TextRange(AbstractC8323h.m13518m(i11 > 0 ? (iM26364getStartimpl2 + i11) - 1 : (iM26364getStartimpl2 + i11) - str.length(), 0, textFieldBuffer.getLength())));
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
        imeEditCommandScope.edit(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C8736p.f16368a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                long jMo21374mapToTransformedGEjPoXI = imeEditCommandScope.mo21374mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
                int i12 = i10;
                int iM26362getMinimpl = TextRange.m26362getMinimpl(jMo21374mapToTransformedGEjPoXI);
                int iM26361getMaximpl = TextRange.m26361getMaximpl(jMo21374mapToTransformedGEjPoXI);
                if (i12 < iM26362getMinimpl) {
                    i12 = iM26362getMinimpl;
                }
                if (i12 <= iM26361getMaximpl) {
                    iM26361getMaximpl = i12;
                }
                int i13 = i11;
                int iM26362getMinimpl2 = TextRange.m26362getMinimpl(jMo21374mapToTransformedGEjPoXI);
                int iM26361getMaximpl2 = TextRange.m26361getMaximpl(jMo21374mapToTransformedGEjPoXI);
                if (i13 < iM26362getMinimpl2) {
                    i13 = iM26362getMinimpl2;
                }
                if (i13 <= iM26361getMaximpl2) {
                    iM26361getMaximpl2 = i13;
                }
                textFieldBuffer.m21339setSelection5zctL8(imeEditCommandScope.mo21373mapFromTransformedGEjPoXI(TextRangeKt.TextRange(iM26361getMaximpl, iM26361getMaximpl2)));
            }
        });
    }
}

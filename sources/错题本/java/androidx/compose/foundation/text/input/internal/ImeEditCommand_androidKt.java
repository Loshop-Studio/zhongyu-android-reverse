package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a#\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0019\u0010\u000b\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\"\u001a\u00020\u0005*\u00020 2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020!H\u0001¢\u0006\u0004\b\"\u0010#\u001a#\u0010$\u001a\u00020\u0005*\u00020 2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "text", "", "newCursorPosition", "Ld6/s;", "commitText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;I)V", "start", "end", "setComposingRegion", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotations", "setComposingText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;ILjava/util/List;)V", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "finishComposingText", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;)V", "setSelection", "", "high", "low", "", "isSurrogatePair", "(CC)Z", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "imeReplace", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/lang/CharSequence;)V", "imeDelete", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(@NotNull ImeEditCommandScope imeEditCommandScope, @NotNull final String str, final int i) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m12770getStartimpl(composition.getPackedValue()), TextRange.m12765getEndimpl(composition.getPackedValue()), str);
                } else {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()), TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()), str);
                }
                int iM12770getStartimpl = TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars());
                int i8 = i;
                textFieldBuffer.m7745setSelection5zctL8(TextRangeKt.TextRange(AbstractC5806u.m5274m(i8 > 0 ? (iM12770getStartimpl + i8) - 1 : (iM12770getStartimpl + i8) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(@NotNull ImeEditCommandScope imeEditCommandScope, final int i, final int i8) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                int i9 = i;
                boolean z8 = i9 >= 0 && i8 >= 0;
                int i10 = i8;
                if (!z8) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i9 + " and " + i10 + " respectively.");
                }
                int iM12765getEndimpl = TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars());
                int i11 = i8;
                int length = iM12765getEndimpl + i11;
                if (((iM12765getEndimpl ^ length) & (i11 ^ length)) < 0) {
                    length = textFieldBuffer.getLength();
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()), Math.min(length, textFieldBuffer.getLength()));
                int iM12770getStartimpl = TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars());
                int i12 = i;
                int i13 = iM12770getStartimpl - i12;
                if (((iM12770getStartimpl ^ i13) & (i12 ^ iM12770getStartimpl)) < 0) {
                    i13 = 0;
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, Math.max(0, i13), TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(@NotNull ImeEditCommandScope imeEditCommandScope, final int i, final int i8) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                int i9 = i;
                int i10 = 0;
                boolean z8 = i9 >= 0 && i8 >= 0;
                int i11 = i8;
                if (!z8) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i9 + " and " + i11 + " respectively.");
                }
                int i12 = 0;
                int iM12770getStartimpl = 0;
                while (true) {
                    if (i12 < i) {
                        int i13 = iM12770getStartimpl + 1;
                        if (TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()) <= i13) {
                            iM12770getStartimpl = TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars());
                            break;
                        } else {
                            iM12770getStartimpl = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()) - i13) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()) - i13)) ? iM12770getStartimpl + 2 : i13;
                            i12++;
                        }
                    } else {
                        break;
                    }
                }
                int length = 0;
                while (true) {
                    if (i10 >= i8) {
                        break;
                    }
                    int i14 = length + 1;
                    if (TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()) + i14 >= textFieldBuffer.getLength()) {
                        length = textFieldBuffer.getLength() - TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars());
                        break;
                    } else {
                        length = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()) + i14) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()) + i14)) ? length + 2 : i14;
                        i10++;
                    }
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()), TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()) + length);
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()) - iM12770getStartimpl, TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void finishComposingText(@NotNull ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText.1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.commitComposition$foundation_release();
            }
        });
    }

    @VisibleForTesting
    public static final void imeDelete(@NotNull TextFieldBuffer textFieldBuffer, int i, int i8) {
        TextRange composition = textFieldBuffer.getComposition();
        int iMin = Math.min(i, i8);
        int iMax = Math.max(i, i8);
        TextFieldBufferKt.delete(textFieldBuffer, iMin, iMax);
        if (composition != null) {
            composition.getPackedValue();
            long jM7749adjustTextRangevJH6DeI = TextFieldBufferKt.m7749adjustTextRangevJH6DeI(composition.getPackedValue(), iMin, iMax, 0);
            if (TextRange.m12764getCollapsedimpl(jM7749adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m12768getMinimpl(jM7749adjustTextRangevJH6DeI), TextRange.m12767getMaximpl(jM7749adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    @VisibleForTesting
    public static final void imeReplace(@NotNull TextFieldBuffer textFieldBuffer, int i, int i8, @NotNull CharSequence charSequence) {
        int iMin = Math.min(i, i8);
        int iMax = Math.max(i, i8);
        int i9 = 0;
        int i10 = iMin;
        while (i10 < iMax && i9 < charSequence.length() && charSequence.charAt(i9) == textFieldBuffer.asCharSequence().charAt(i10)) {
            i9++;
            i10++;
        }
        int length = charSequence.length();
        while (iMax > i10 && length > i9 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i10 == iMax && i9 == length) {
            textFieldBuffer.commitComposition$foundation_release();
            textFieldBuffer.clearHighlight$foundation_release();
        } else {
            textFieldBuffer.replace(i10, iMax, charSequence.subSequence(i9, length));
        }
        textFieldBuffer.m7745setSelection5zctL8(TextRangeKt.TextRange(charSequence.length() + iMin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c, char c9) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c9);
    }

    public static final void setComposingRegion(@NotNull ImeEditCommandScope imeEditCommandScope, final int i, final int i8) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.hasComposition$foundation_release()) {
                    textFieldBuffer.commitComposition$foundation_release();
                }
                int iM5274m = AbstractC5806u.m5274m(i, 0, textFieldBuffer.getLength());
                int iM5274m2 = AbstractC5806u.m5274m(i8, 0, textFieldBuffer.getLength());
                if (iM5274m != iM5274m2) {
                    if (iM5274m < iM5274m2) {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM5274m, iM5274m2, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, iM5274m2, iM5274m, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void setComposingText(@NotNull ImeEditCommandScope imeEditCommandScope, @NotNull final String str, final int i, @Nullable final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m12770getStartimpl(composition.getPackedValue()), TextRange.m12765getEndimpl(composition.getPackedValue()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(TextRange.m12770getStartimpl(composition.getPackedValue()), str.length() + TextRange.m12770getStartimpl(composition.getPackedValue()), list);
                    }
                } else {
                    int iM12770getStartimpl = TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars());
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, iM12770getStartimpl, TextRange.m12765getEndimpl(textFieldBuffer.getSelectionInChars()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(iM12770getStartimpl, str.length() + iM12770getStartimpl, list);
                    }
                }
                int iM12770getStartimpl2 = TextRange.m12770getStartimpl(textFieldBuffer.getSelectionInChars());
                int i8 = i;
                textFieldBuffer.m7745setSelection5zctL8(TextRangeKt.TextRange(AbstractC5806u.m5274m(i8 > 0 ? (iM12770getStartimpl2 + i8) - 1 : (iM12770getStartimpl2 + i8) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i, List list, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    public static final void setSelection(@NotNull final ImeEditCommandScope imeEditCommandScope, final int i, final int i8) {
        imeEditCommandScope.edit(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldBuffer) obj);
                return C5443s.f8405a;
            }

            public final void invoke(TextFieldBuffer textFieldBuffer) {
                long jMo7780mapToTransformedGEjPoXI = imeEditCommandScope.mo7780mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
                int i9 = i;
                int iM12768getMinimpl = TextRange.m12768getMinimpl(jMo7780mapToTransformedGEjPoXI);
                int iM12767getMaximpl = TextRange.m12767getMaximpl(jMo7780mapToTransformedGEjPoXI);
                if (i9 < iM12768getMinimpl) {
                    i9 = iM12768getMinimpl;
                }
                if (i9 <= iM12767getMaximpl) {
                    iM12767getMaximpl = i9;
                }
                int i10 = i8;
                int iM12768getMinimpl2 = TextRange.m12768getMinimpl(jMo7780mapToTransformedGEjPoXI);
                int iM12767getMaximpl2 = TextRange.m12767getMaximpl(jMo7780mapToTransformedGEjPoXI);
                if (i10 < iM12768getMinimpl2) {
                    i10 = iM12768getMinimpl2;
                }
                if (i10 <= iM12767getMaximpl2) {
                    iM12767getMaximpl2 = i10;
                }
                textFieldBuffer.m7745setSelection5zctL8(imeEditCommandScope.mo7779mapFromTransformedGEjPoXI(TextRangeKt.TextRange(iM12767getMaximpl, iM12767getMaximpl2)));
            }
        });
    }
}

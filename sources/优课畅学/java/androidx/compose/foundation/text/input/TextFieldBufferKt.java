package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m21343adjustTextRangevJH6DeI(long j10, int i10, int i11, int i12) {
        int i13;
        int iM26362getMinimpl = TextRange.m26362getMinimpl(j10);
        int iM26361getMaximpl = TextRange.m26361getMaximpl(j10);
        if (iM26361getMaximpl < i10) {
            return j10;
        }
        if (iM26362getMinimpl <= i10 && i11 <= iM26361getMaximpl) {
            i13 = i12 - (i11 - i10);
            if (iM26362getMinimpl == iM26361getMaximpl) {
                iM26362getMinimpl += i13;
            }
            i10 = iM26361getMaximpl + i13;
        } else if (iM26362getMinimpl > i10 && iM26361getMaximpl < i11) {
            i10 += i12;
            iM26362getMinimpl = i10;
        } else if (iM26362getMinimpl >= i11) {
            i13 = i12 - (i11 - i10);
            iM26362getMinimpl += i13;
            i10 = iM26361getMaximpl + i13;
        } else if (i10 < iM26362getMinimpl) {
            iM26362getMinimpl = i10 + i12;
            i13 = i12 - (i11 - i10);
            i10 = iM26361getMaximpl + i13;
        }
        return TextRangeKt.TextRange(iM26362getMinimpl, i10);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i10, int i11) {
        textFieldBuffer.replace(i10, i11, "");
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, InterfaceC10576r interfaceC10576r) {
        int i10;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i11 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i10 = 0;
        } else {
            int i12 = 0;
            i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i11 == 0) {
                    if (charSequence.charAt(i12) == charSequence2.charAt(i10)) {
                        i12++;
                        i10++;
                    } else {
                        i11 = 1;
                    }
                }
                if (!z10) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z10 = true;
                    }
                }
                if (i12 >= length || i10 >= length2 || (i11 != 0 && z10)) {
                    break;
                }
            }
            i11 = i12;
        }
        if (i11 < length || i10 < length2) {
            interfaceC10576r.invoke(Integer.valueOf(i11), Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(length2));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, InterfaceC10574p interfaceC10574p) {
        for (int i10 = 0; i10 < changeList.getChangeCount(); i10++) {
            interfaceC10574p.invoke(TextRange.m26352boximpl(changeList.mo21342getRangejx7JFs(i10)), TextRange.m26352boximpl(changeList.mo21341getOriginalRangejx7JFs(i10)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, InterfaceC10574p interfaceC10574p) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            interfaceC10574p.invoke(TextRange.m26352boximpl(changeList.mo21342getRangejx7JFs(changeCount)), TextRange.m26352boximpl(changeList.mo21341getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i10, String str) {
        textFieldBuffer.replace(i10, i10, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m21339setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i10, int i11) {
        textFieldBuffer.m21339setSelection5zctL8(TextRangeKt.TextRange(AbstractC8323h.m13518m(i10, 0, textFieldBuffer.getLength()), AbstractC8323h.m13518m(i11, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = i10;
        }
        setSelectionCoerced(textFieldBuffer, i10, i11);
    }
}

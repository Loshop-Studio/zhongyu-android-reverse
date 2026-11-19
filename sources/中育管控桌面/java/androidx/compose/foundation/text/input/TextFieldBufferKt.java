package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p009ui.text.TextRange;
import androidx.compose.p009ui.text.TextRangeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a{\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2`\u0010\u000e\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u000fH\u0080\b\u001a\u001a\u0010\u0016\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004\u001aE\u0010\u001a\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001aE\u0010\u001f\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001a\u001a\u0010 \u001a\u00020\n*\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#\u001a\n\u0010$\u001a\u00020\n*\u00020\u0017\u001a\n\u0010%\u001a\u00020\n*\u00020\u0017\u001a\u001e\u0010&\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m7880d2 = {"adjustTextRange", "Landroidx/compose/ui/text/TextRange;", "originalRange", "replaceStart", "", "replaceEnd", "insertedTextLength", "adjustTextRange-vJH6DeI", "(JIII)J", "findCommonPrefixAndSuffix", "", "a", "", "b", "onFound", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", RequestParameters.SUBRESOURCE_DELETE, "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "forEachChange", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "block", "Lkotlin/Function2;", "range", "forEachChangeReversed", "insert", "index", "text", "", "placeCursorAtEnd", "selectAll", "setSelectionCoerced", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m11065adjustTextRangevJH6DeI(long j6, int i6, int i7, int i8) {
        int i9;
        int iM15948getMinimpl = TextRange.m15948getMinimpl(j6);
        int iM15947getMaximpl = TextRange.m15947getMaximpl(j6);
        if (iM15947getMaximpl < i6) {
            return j6;
        }
        if (iM15948getMinimpl <= i6 && i7 <= iM15947getMaximpl) {
            i9 = i8 - (i7 - i6);
            if (iM15948getMinimpl == iM15947getMaximpl) {
                iM15948getMinimpl += i9;
            }
            i6 = iM15947getMaximpl + i9;
        } else if (iM15948getMinimpl > i6 && iM15947getMaximpl < i7) {
            i6 += i8;
            iM15948getMinimpl = i6;
        } else if (iM15948getMinimpl >= i7) {
            i9 = i8 - (i7 - i6);
            iM15948getMinimpl += i9;
            i6 = iM15947getMaximpl + i9;
        } else if (i6 < iM15948getMinimpl) {
            iM15948getMinimpl = i6 + i8;
            i9 = i8 - (i7 - i6);
            i6 = iM15947getMaximpl + i9;
        }
        return TextRangeKt.TextRange(iM15948getMinimpl, i6);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i6, int i7) {
        textFieldBuffer.replace(i6, i7, "");
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        int i6;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i7 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i6 = 0;
        } else {
            int i8 = 0;
            i6 = 0;
            boolean z6 = false;
            while (true) {
                if (i7 == 0) {
                    if (charSequence.charAt(i8) == charSequence2.charAt(i6)) {
                        i8++;
                        i6++;
                    } else {
                        i7 = 1;
                    }
                }
                if (!z6) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z6 = true;
                    }
                }
                if (i8 >= length || i6 >= length2 || (i7 != 0 && z6)) {
                    break;
                }
            }
            i7 = i8;
        }
        if (i7 < length || i6 < length2) {
            function4.invoke(Integer.valueOf(i7), Integer.valueOf(length), Integer.valueOf(i6), Integer.valueOf(length2));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int i6 = 0; i6 < changeList.getChangeCount(); i6++) {
            function2.invoke(TextRange.m15938boximpl(changeList.mo11064getRangejx7JFs(i6)), TextRange.m15938boximpl(changeList.mo11063getOriginalRangejx7JFs(i6)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            function2.invoke(TextRange.m15938boximpl(changeList.mo11064getRangejx7JFs(changeCount)), TextRange.m15938boximpl(changeList.mo11063getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i6, String str) {
        textFieldBuffer.replace(i6, i6, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m11061setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i6, int i7) {
        textFieldBuffer.m11061setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i6, 0, textFieldBuffer.getLength()), RangesKt.coerceIn(i7, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = i6;
        }
        setSelectionCoerced(textFieldBuffer, i6, i7);
    }
}

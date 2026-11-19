package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a{\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2`\u0010\u000e\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u000fH\u0080\b\u001a\u001a\u0010\u0016\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004\u001aE\u0010\u001a\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001aE\u0010\u001f\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001a\u001a\u0010 \u001a\u00020\n*\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#\u001a\n\u0010$\u001a\u00020\n*\u00020\u0017\u001a\n\u0010%\u001a\u00020\n*\u00020\u0017\u001a\u001e\u0010&\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m13413d2 = {"adjustTextRange", "Landroidx/compose/ui/text/TextRange;", "originalRange", "replaceStart", "", "replaceEnd", "insertedTextLength", "adjustTextRange-vJH6DeI", "(JIII)J", "findCommonPrefixAndSuffix", "", "a", "", "b", "onFound", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", RequestParameters.SUBRESOURCE_DELETE, "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "forEachChange", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "block", "Lkotlin/Function2;", "range", "forEachChangeReversed", "insert", "index", "text", "", "placeCursorAtEnd", "selectAll", "setSelectionCoerced", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m18575adjustTextRangevJH6DeI(long j9, int i9, int i10, int i11) {
        int i12;
        int iM23458getMinimpl = TextRange.m23458getMinimpl(j9);
        int iM23457getMaximpl = TextRange.m23457getMaximpl(j9);
        if (iM23457getMaximpl < i9) {
            return j9;
        }
        if (iM23458getMinimpl <= i9 && i10 <= iM23457getMaximpl) {
            i12 = i11 - (i10 - i9);
            if (iM23458getMinimpl == iM23457getMaximpl) {
                iM23458getMinimpl += i12;
            }
            i9 = iM23457getMaximpl + i12;
        } else if (iM23458getMinimpl > i9 && iM23457getMaximpl < i10) {
            i9 += i11;
            iM23458getMinimpl = i9;
        } else if (iM23458getMinimpl >= i10) {
            i12 = i11 - (i10 - i9);
            iM23458getMinimpl += i12;
            i9 = iM23457getMaximpl + i12;
        } else if (i9 < iM23458getMinimpl) {
            iM23458getMinimpl = i9 + i11;
            i12 = i11 - (i10 - i9);
            i9 = iM23457getMaximpl + i12;
        }
        return TextRangeKt.TextRange(iM23458getMinimpl, i9);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i9, int i10) {
        textFieldBuffer.replace(i9, i10, "");
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        int i9;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i10 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i9 = 0;
        } else {
            int i11 = 0;
            i9 = 0;
            boolean z9 = false;
            while (true) {
                if (i10 == 0) {
                    if (charSequence.charAt(i11) == charSequence2.charAt(i9)) {
                        i11++;
                        i9++;
                    } else {
                        i10 = 1;
                    }
                }
                if (!z9) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z9 = true;
                    }
                }
                if (i11 >= length || i9 >= length2 || (i10 != 0 && z9)) {
                    break;
                }
            }
            i10 = i11;
        }
        if (i10 < length || i9 < length2) {
            function4.invoke(Integer.valueOf(i10), Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(length2));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int i9 = 0; i9 < changeList.getChangeCount(); i9++) {
            function2.invoke(TextRange.m23448boximpl(changeList.mo18574getRangejx7JFs(i9)), TextRange.m23448boximpl(changeList.mo18573getOriginalRangejx7JFs(i9)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            function2.invoke(TextRange.m23448boximpl(changeList.mo18574getRangejx7JFs(changeCount)), TextRange.m23448boximpl(changeList.mo18573getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i9, String str) {
        textFieldBuffer.replace(i9, i9, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i9, int i10) {
        textFieldBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i9, 0, textFieldBuffer.getLength()), RangesKt.coerceIn(i10, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i9;
        }
        setSelectionCoerced(textFieldBuffer, i9, i10);
    }
}

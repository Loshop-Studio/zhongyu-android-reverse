package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u00020\r*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u0016\u0010\u0015\u001aL\u0010\u001d\u001a\u00020\r*\u00020\u001726\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\r0\u0018H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001aL\u0010\u001f\u001a\u00020\r*\u00020\u001726\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\r0\u0018H\u0087\b¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0082\u0001\u0010)\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2`\u0010(\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\r0#H\u0080\b¢\u0006\u0004\b)\u0010*\u001a%\u0010+\u001a\u00020\r*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/text/TextRange;", "originalRange", "", "replaceStart", "replaceEnd", "insertedTextLength", "adjustTextRange-vJH6DeI", "(JIII)J", "adjustTextRange", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "index", "", "text", "Ld6/s;", "insert", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;ILjava/lang/String;)V", "start", "end", RequestParameters.SUBRESOURCE_DELETE, "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "placeCursorAtEnd", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "selectAll", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "range", "block", "forEachChange", "(Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Lr6/e;)V", "forEachChangeReversed", "", "a", "b", "Lkotlin/Function4;", "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", "onFound", "findCommonPrefixAndSuffix", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lr6/g;)V", "setSelectionCoerced", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m7749adjustTextRangevJH6DeI(long j7, int i, int i8, int i9) {
        int i10;
        int iM12768getMinimpl = TextRange.m12768getMinimpl(j7);
        int iM12767getMaximpl = TextRange.m12767getMaximpl(j7);
        if (iM12767getMaximpl < i) {
            return j7;
        }
        if (iM12768getMinimpl <= i && i8 <= iM12767getMaximpl) {
            i10 = i9 - (i8 - i);
            if (iM12768getMinimpl == iM12767getMaximpl) {
            }
            i = iM12767getMaximpl + i10;
            return TextRangeKt.TextRange(iM12768getMinimpl, i);
        }
        if (iM12768getMinimpl > i && iM12767getMaximpl < i8) {
            i += i9;
            iM12768getMinimpl = i;
        } else if (iM12768getMinimpl >= i8) {
            i10 = i9 - (i8 - i);
        } else if (i < iM12768getMinimpl) {
            iM12768getMinimpl = i + i9;
            i = (i9 - (i8 - i)) + iM12767getMaximpl;
        }
        return TextRangeKt.TextRange(iM12768getMinimpl, i);
        iM12768getMinimpl += i10;
        i = iM12767getMaximpl + i10;
        return TextRangeKt.TextRange(iM12768getMinimpl, i);
    }

    public static final void delete(@NotNull TextFieldBuffer textFieldBuffer, int i, int i8) {
        textFieldBuffer.replace(i, i8, "");
    }

    public static final void findCommonPrefixAndSuffix(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull InterfaceC6475g interfaceC6475g) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i8 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i = 0;
        } else {
            int i9 = 0;
            i = 0;
            boolean z8 = false;
            while (true) {
                if (i8 == 0) {
                    if (charSequence.charAt(i9) == charSequence2.charAt(i)) {
                        i9++;
                        i++;
                    } else {
                        i8 = 1;
                    }
                }
                if (!z8) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z8 = true;
                    }
                }
                if (i9 >= length || i >= length2 || (i8 != 0 && z8)) {
                    break;
                }
            }
            i8 = i9;
        }
        if (i8 < length || i < length2) {
            interfaceC6475g.invoke(Integer.valueOf(i8), Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(length2));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(@NotNull TextFieldBuffer.ChangeList changeList, @NotNull InterfaceC6473e interfaceC6473e) {
        for (int i = 0; i < changeList.getChangeCount(); i++) {
            interfaceC6473e.invoke(TextRange.m12758boximpl(changeList.mo7748getRangejx7JFs(i)), TextRange.m12758boximpl(changeList.mo7747getOriginalRangejx7JFs(i)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(@NotNull TextFieldBuffer.ChangeList changeList, @NotNull InterfaceC6473e interfaceC6473e) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            interfaceC6473e.invoke(TextRange.m12758boximpl(changeList.mo7748getRangejx7JFs(changeCount)), TextRange.m12758boximpl(changeList.mo7747getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(@NotNull TextFieldBuffer textFieldBuffer, int i, @NotNull String str) {
        textFieldBuffer.replace(i, i, str);
    }

    public static final void placeCursorAtEnd(@NotNull TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(@NotNull TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m7745setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(@NotNull TextFieldBuffer textFieldBuffer, int i, int i8) {
        textFieldBuffer.m7745setSelection5zctL8(TextRangeKt.TextRange(AbstractC5806u.m5274m(i, 0, textFieldBuffer.getLength()), AbstractC5806u.m5274m(i8, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = i;
        }
        setSelectionCoerced(textFieldBuffer, i, i8);
    }
}

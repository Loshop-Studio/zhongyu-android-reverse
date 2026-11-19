package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.util.ListUtilsKt;
import java.util.List;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iIntValue = ((Number) interfaceC10570l.invoke(list.get(i11))).intValue();
            if (iIntValue < 0) {
                i10 = i11 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i10) {
        int i11;
        int endIndex = ((ParagraphInfo) AbstractC8778f0.m14578x0(list)).getEndIndex();
        boolean z10 = false;
        if (!(i10 <= ((ParagraphInfo) AbstractC8778f0.m14578x0(list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i10 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i11 = -(i12 + 1);
                break;
            }
            i11 = (i12 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i11);
            char c10 = paragraphInfo.getStartIndex() > i10 ? (char) 1 : paragraphInfo.getEndIndex() <= i10 ? (char) 65535 : (char) 0;
            if (c10 >= 0) {
                if (c10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i12 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new InterfaceC10570l() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // p300x7.InterfaceC10570l
                public final CharSequence invoke(ParagraphInfo paragraphInfo2) {
                    return '[' + paragraphInfo2.getStartIndex() + ", " + paragraphInfo2.getEndIndex() + ')';
                }
            }, 31, null) + ']');
        }
        return i11;
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i12);
            char c10 = paragraphInfo.getStartLineIndex() > i10 ? (char) 1 : paragraphInfo.getEndLineIndex() <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((ParagraphInfo) AbstractC8778f0.m14578x0(list)).getBottom()) {
            return AbstractC8809v.m14773p(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i11);
            char c10 = paragraphInfo.getTop() > f10 ? (char) 1 : paragraphInfo.getBottom() <= f10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m26221findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j10, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m26362getMinimpl(j10)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m26361getMaximpl(j10)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                interfaceC10570l.invoke(paragraphInfo);
            }
        }
    }
}

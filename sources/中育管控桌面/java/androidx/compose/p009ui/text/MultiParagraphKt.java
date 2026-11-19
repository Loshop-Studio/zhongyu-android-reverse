package androidx.compose.p009ui.text;

import androidx.compose.p009ui.text.internal.InlineClassHelperKt;
import androidx.compose.p009ui.util.ListUtilsKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a<\u0010\u000b\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u00020\u00010\u0010H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m7880d2 = {"findParagraphByIndex", "", "paragraphInfoList", "", "Landroidx/compose/ui/text/ParagraphInfo;", "index", "findParagraphByLineIndex", "lineIndex", "findParagraphByY", "y", "", "findParagraphsByRange", "", "range", "Landroidx/compose/ui/text/TextRange;", "action", "Lkotlin/Function1;", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "fastBinarySearch", ExifInterface.GPS_DIRECTION_TRUE, "comparison", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1227:1\n1092#1,11:1236\n1092#1,11:1255\n1092#1,11:1266\n114#2,8:1228\n114#2,8:1247\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1022#1:1236,11\n1048#1:1255,11\n1082#1:1266,11\n1018#1:1228,8\n1029#1:1247,8\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int iIntValue = function1.invoke(list.get(i7)).intValue();
            if (iIntValue < 0) {
                i6 = i7 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i6) {
        int i7;
        int endIndex = ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex();
        boolean z6 = false;
        if (!(i6 <= ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i6 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i8 = 0;
        while (true) {
            if (i8 > size) {
                i7 = -(i8 + 1);
                break;
            }
            i7 = (i8 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i7);
            char c7 = paragraphInfo.getStartIndex() > i6 ? (char) 1 : paragraphInfo.getEndIndex() <= i6 ? (char) 65535 : (char) 0;
            if (c7 >= 0) {
                if (c7 <= 0) {
                    break;
                }
                size = i7 - 1;
            } else {
                i8 = i7 + 1;
            }
        }
        if (i7 >= 0 && i7 < list.size()) {
            z6 = true;
        }
        if (!z6) {
            InlineClassHelperKt.throwIllegalArgumentException("Found paragraph index " + i7 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i6 + ", paragraphs=[" + ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new Function1<ParagraphInfo, CharSequence>() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ParagraphInfo paragraphInfo2) {
                    return '[' + paragraphInfo2.getStartIndex() + ", " + paragraphInfo2.getEndIndex() + ')';
                }
            }, 31, null) + ']');
        }
        return i7;
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i6) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i8);
            char c7 = paragraphInfo.getStartLineIndex() > i6 ? (char) 1 : paragraphInfo.getEndLineIndex() <= i6 ? (char) 65535 : (char) 0;
            if (c7 < 0) {
                i7 = i8 + 1;
            } else {
                if (c7 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f6) {
        if (f6 <= 0.0f) {
            return 0;
        }
        if (f6 >= ((ParagraphInfo) CollectionsKt.last((List) list)).getBottom()) {
            return CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i7);
            char c7 = paragraphInfo.getTop() > f6 ? (char) 1 : paragraphInfo.getBottom() <= f6 ? (char) 65535 : (char) 0;
            if (c7 < 0) {
                i6 = i7 + 1;
            } else {
                if (c7 <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m15807findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j6, Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m15948getMinimpl(j6)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m15947getMaximpl(j6)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }
}

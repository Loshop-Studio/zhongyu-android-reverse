package androidx.compose.p006ui.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a-\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u000eH\u0082\b¨\u0006\u000f"}, m5175d2 = {"findParagraphByIndex", "", "paragraphInfoList", "", "Landroidx/compose/ui/text/ParagraphInfo;", "index", "findParagraphByLineIndex", "lineIndex", "findParagraphByY", "y", "", "fastBinarySearch", ExifInterface.GPS_DIRECTION_TRUE, "comparison", "Lkotlin/Function1;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,980:1\n850#1,16:981\n850#1,16:997\n850#1,16:1013\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n800#1:981,16\n820#1:997,16\n840#1:1013,16\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int iIntValue = function1.invoke(list.get(i5)).intValue();
            if (iIntValue < 0) {
                i4 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> paragraphInfoList, int i4) {
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i6);
            char c4 = paragraphInfo.getStartIndex() > i4 ? (char) 1 : paragraphInfo.getEndIndex() <= i4 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i5 = i6 + 1;
            } else {
                if (c4 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> paragraphInfoList, int i4) {
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i6);
            char c4 = paragraphInfo.getStartLineIndex() > i4 ? (char) 1 : paragraphInfo.getEndLineIndex() <= i4 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i5 = i6 + 1;
            } else {
                if (c4 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> paragraphInfoList, float f4) {
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i5);
            char c4 = paragraphInfo.getTop() > f4 ? (char) 1 : paragraphInfo.getBottom() <= f4 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i4 = i5 + 1;
            } else {
                if (c4 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }
}

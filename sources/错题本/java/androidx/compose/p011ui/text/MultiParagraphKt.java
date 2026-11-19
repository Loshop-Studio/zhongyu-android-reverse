package androidx.compose.p011ui.text;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.p011ui.util.ListUtilsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u001a4\u0010\u0017\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\rH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m5110d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "(Ljava/util/List;I)I", "", "y", "findParagraphByY", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "Ld6/s;", "action", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLr6/c;)V", "findParagraphsByRange", "lineIndex", "findParagraphByLineIndex", ExifInterface.GPS_DIRECTION_TRUE, "comparison", "fastBinarySearch", "(Ljava/util/List;Lr6/c;)I", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1227:1\n1092#1,11:1236\n1092#1,11:1255\n1092#1,11:1266\n114#2,8:1228\n114#2,8:1247\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1022#1:1236,11\n1048#1:1255,11\n1082#1:1266,11\n1018#1:1228,8\n1029#1:1247,8\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, InterfaceC6471c interfaceC6471c) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i8 = (i + size) >>> 1;
            int iIntValue = ((Number) interfaceC6471c.invoke(list.get(i8))).intValue();
            if (iIntValue < 0) {
                i = i8 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int findParagraphByIndex(@NotNull List<ParagraphInfo> list, int i) {
        int i8;
        int endIndex = ((ParagraphInfo) AbstractC5805t.m5235o0(list)).getEndIndex();
        boolean z8 = false;
        if (!(i <= ((ParagraphInfo) AbstractC5805t.m5235o0(list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i9 = 0;
        while (true) {
            if (i9 > size) {
                i8 = -(i9 + 1);
                break;
            }
            i8 = (i9 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i8);
            char c = paragraphInfo.getStartIndex() > i ? (char) 1 : paragraphInfo.getEndIndex() <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i8 - 1;
            } else {
                i9 = i8 + 1;
            }
        }
        if (i8 >= 0 && i8 < list.size()) {
            z8 = true;
        }
        if (!z8) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i8, "Found paragraph index ", " should be in range [0, ");
            sbM94s.append(list.size());
            sbM94s.append(").\nDebug info: index=");
            sbM94s.append(i);
            sbM94s.append(", paragraphs=[");
            sbM94s.append(ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new InterfaceC6471c() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // p152r6.InterfaceC6471c
                public final CharSequence invoke(ParagraphInfo paragraphInfo2) {
                    return "[" + paragraphInfo2.getStartIndex() + ", " + paragraphInfo2.getEndIndex() + ')';
                }
            }, 31, null));
            sbM94s.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
        }
        return i8;
    }

    public static final int findParagraphByLineIndex(@NotNull List<ParagraphInfo> list, int i) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i9);
            char c = paragraphInfo.getStartLineIndex() > i ? (char) 1 : paragraphInfo.getEndLineIndex() <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i8 = i9 + 1;
            } else {
                if (c <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int findParagraphByY(@NotNull List<ParagraphInfo> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ParagraphInfo) AbstractC5805t.m5235o0(list)).getBottom()) {
            return AbstractC5806u.m5282u(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i8 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i8);
            char c = paragraphInfo.getTop() > f ? (char) 1 : paragraphInfo.getBottom() <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i8 + 1;
            } else {
                if (c <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m12627findParagraphsByRangeSbBc2M(@NotNull List<ParagraphInfo> list, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m12768getMinimpl(j7)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m12767getMaximpl(j7)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                interfaceC6471c.invoke(paragraphInfo);
            }
        }
    }
}

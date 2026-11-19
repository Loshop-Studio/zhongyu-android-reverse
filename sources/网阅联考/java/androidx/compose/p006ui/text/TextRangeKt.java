package androidx.compose.p006ui.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a)\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m5175d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "constrain", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i4, int i5) {
        return TextRange.m11066constructorimpl(packWithCheck(i4, i5));
    }

    /* renamed from: constrain-8ffj60Q, reason: not valid java name */
    public static final long m11083constrain8ffj60Q(long j4, int i4, int i5) {
        int iCoerceIn = RangesKt___RangesKt.coerceIn(TextRange.m11077getStartimpl(j4), i4, i5);
        int iCoerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m11072getEndimpl(j4), i4, i5);
        return (iCoerceIn == TextRange.m11077getStartimpl(j4) && iCoerceIn2 == TextRange.m11072getEndimpl(j4)) ? j4 : TextRange(iCoerceIn, iCoerceIn2);
    }

    private static final long packWithCheck(int i4, int i5) {
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i4 + ", end: " + i5 + ']').toString());
        }
        if (i5 >= 0) {
            return (i5 & 4294967295L) | (i4 << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i4 + ", end: " + i5 + ']').toString());
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m11084substringFDrldGo(CharSequence substring, long j4) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(TextRange.m11075getMinimpl(j4), TextRange.m11074getMaximpl(j4)).toString();
    }

    public static final long TextRange(int i4) {
        return TextRange(i4, i4);
    }
}

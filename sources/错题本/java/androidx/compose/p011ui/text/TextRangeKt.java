package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0013\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m5110d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n101#2,10:124\n101#2,10:134\n114#3,8:144\n80#4:152\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n109#1:124,10\n110#1:134,10\n118#1:144,8\n121#1:152\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i8) {
        return TextRange.m12759constructorimpl(packWithCheck(i, i8));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m12776coerceIn8ffj60Q(long j7, int i, int i8) {
        int iM12770getStartimpl = TextRange.m12770getStartimpl(j7);
        if (iM12770getStartimpl < i) {
            iM12770getStartimpl = i;
        }
        if (iM12770getStartimpl > i8) {
            iM12770getStartimpl = i8;
        }
        int iM12765getEndimpl = TextRange.m12765getEndimpl(j7);
        if (iM12765getEndimpl >= i) {
            i = iM12765getEndimpl;
        }
        if (i <= i8) {
            i8 = i;
        }
        return (iM12770getStartimpl == TextRange.m12770getStartimpl(j7) && i8 == TextRange.m12765getEndimpl(j7)) ? j7 : TextRange(iM12770getStartimpl, i8);
    }

    private static final long packWithCheck(int i, int i8) {
        if (!(i >= 0 && i8 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i8 + ']');
        }
        return (i8 & 4294967295L) | (i << 32);
    }

    @NotNull
    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m12777substringFDrldGo(@NotNull CharSequence charSequence, long j7) {
        return charSequence.subSequence(TextRange.m12768getMinimpl(j7), TextRange.m12767getMaximpl(j7)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}

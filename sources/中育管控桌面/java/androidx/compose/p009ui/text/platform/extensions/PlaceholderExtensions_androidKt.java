package androidx.compose.p009ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.p009ui.text.AnnotatedString;
import androidx.compose.p009ui.text.Placeholder;
import androidx.compose.p009ui.text.PlaceholderVerticalAlign;
import androidx.compose.p009ui.text.android.style.PlaceholderSpan;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.TextUnit;
import androidx.compose.p009ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a(\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\b8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m7880d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n34#2,6:94\n13309#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m16220getSpanUnitR2X_6o(long j6) {
        long jM16677getTypeUIouoOA = TextUnit.m16677getTypeUIouoOA(j6);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m16706equalsimpl0(jM16677getTypeUIouoOA, companion.m16711getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m16706equalsimpl0(jM16677getTypeUIouoOA, companion.m16710getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m16221getSpanUnitR2X_6o$annotations(long j6) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m16222getSpanVerticalAligndo9XGg(int i6) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.INSTANCE;
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15861getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15867getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15862getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15863getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15866getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15864getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m15857equalsimpl0(i6, companion.m15865getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m16223getSpanVerticalAligndo9XGg$annotations(int i6) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i6, int i7, Density density) {
        for (Object obj : spannable.getSpans(i6, i7, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m16678getValueimpl(placeholder.getWidth()), m16220getSpanUnitR2X_6o(placeholder.getWidth()), TextUnit.m16678getValueimpl(placeholder.getHeight()), m16220getSpanUnitR2X_6o(placeholder.getHeight()), density.getFontScale() * density.getDensity(), m16222getSpanVerticalAligndo9XGg(placeholder.getPlaceholderVerticalAlign())), i6, i7);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AnnotatedString.Range<Placeholder> range = list.get(i6);
            setPlaceholder(spannable, range.component1(), range.getStart(), range.getEnd(), density);
        }
    }
}

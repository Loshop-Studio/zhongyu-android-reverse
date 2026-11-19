package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.text.SpanStyleKt;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m13558d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", "start", "stop", "fraction", "", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f10) {
        return new TextIndent(SpanStyleKt.m22974lerpTextUnitInheritableC3pnCVY(textIndent.getFirstLine(), textIndent2.getFirstLine(), f10), SpanStyleKt.m22974lerpTextUnitInheritableC3pnCVY(textIndent.getRestLine(), textIndent2.getRestLine(), f10), null);
    }
}

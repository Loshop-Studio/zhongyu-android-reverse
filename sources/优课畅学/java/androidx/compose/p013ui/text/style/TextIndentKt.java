package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.text.SpanStyleKt;

/* loaded from: classes2.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f10) {
        return new TextIndent(SpanStyleKt.m26311lerpTextUnitInheritableC3pnCVY(textIndent.m26807getFirstLineXSAIIZE(), textIndent2.m26807getFirstLineXSAIIZE(), f10), SpanStyleKt.m26311lerpTextUnitInheritableC3pnCVY(textIndent.m26808getRestLineXSAIIZE(), textIndent2.m26808getRestLineXSAIIZE(), f10), null);
    }
}

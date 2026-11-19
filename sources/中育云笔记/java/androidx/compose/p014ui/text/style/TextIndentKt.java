package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.text.SpanStyleKt;

/* loaded from: classes2.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f10) {
        return new TextIndent(SpanStyleKt.m32913lerpTextUnitInheritableC3pnCVY(textIndent.m33409getFirstLineXSAIIZE(), textIndent2.m33409getFirstLineXSAIIZE(), f10), SpanStyleKt.m32913lerpTextUnitInheritableC3pnCVY(textIndent.m33410getRestLineXSAIIZE(), textIndent2.m33410getRestLineXSAIIZE(), f10), null);
    }
}

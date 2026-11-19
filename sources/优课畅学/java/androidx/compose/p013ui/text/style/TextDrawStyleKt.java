package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.text.SpanStyleKt;
import androidx.compose.p013ui.util.MathHelpersKt;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f10) {
        boolean z10 = textForegroundStyle instanceof BrushStyle;
        return (z10 || (textForegroundStyle2 instanceof BrushStyle)) ? (z10 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f10), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f10)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f10) : TextForegroundStyle.Companion.m26804from8_81llA(ColorKt.m24327lerpjxsXWHM(textForegroundStyle.mo26669getColor0d7_KjU(), textForegroundStyle2.mo26669getColor0d7_KjU(), f10));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m26803modulateDxMtmZc(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : Color.m24275copywmQWz5c$default(j10, Color.m24278getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f10, InterfaceC10559a interfaceC10559a) {
        return Float.isNaN(f10) ? ((Number) interfaceC10559a.invoke()).floatValue() : f10;
    }
}

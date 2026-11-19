package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.text.SpanStyleKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f10) {
        boolean z10 = textForegroundStyle instanceof BrushStyle;
        return (z10 || (textForegroundStyle2 instanceof BrushStyle)) ? (z10 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f10), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f10)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f10) : TextForegroundStyle.Companion.m33406from8_81llA(ColorKt.m30929lerpjxsXWHM(textForegroundStyle.mo33271getColor0d7_KjU(), textForegroundStyle2.mo33271getColor0d7_KjU(), f10));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m33405modulateDxMtmZc(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : Color.m30877copywmQWz5c$default(j10, Color.m30880getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f10, InterfaceC9529a interfaceC9529a) {
        return Float.isNaN(f10) ? ((Number) interfaceC9529a.invoke()).floatValue() : f10;
    }
}

package androidx.compose.p009ui.text.style;

import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.text.SpanStyleKt;
import androidx.compose.p009ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;

@Metadata(m7879d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7880d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmName(name = "TextDrawStyleKt")
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f6) {
        boolean z6 = textForegroundStyle instanceof BrushStyle;
        return (z6 || (textForegroundStyle2 instanceof BrushStyle)) ? (z6 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f6), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f6)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f6) : TextForegroundStyle.INSTANCE.m16389from8_81llA(ColorKt.m13950lerpjxsXWHM(textForegroundStyle.mo16254getColor0d7_KjU(), textForegroundStyle2.mo16254getColor0d7_KjU(), f6));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m16388modulateDxMtmZc(long j6, float f6) {
        return (Float.isNaN(f6) || f6 >= 1.0f) ? j6 : Color.m13898copywmQWz5c$default(j6, Color.m13901getAlphaimpl(j6) * f6, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f6, Function0<Float> function0) {
        return Float.isNaN(f6) ? function0.invoke().floatValue() : f6;
    }
}

package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.text.SpanStyleKt;
import androidx.compose.p013ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13558d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmName(name = "TextDrawStyleKt")
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f10) {
        boolean z9 = textForegroundStyle instanceof BrushStyle;
        return (z9 || (textForegroundStyle2 instanceof BrushStyle)) ? (z9 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f10), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f10)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f10) : TextForegroundStyle.INSTANCE.m23466from8_81llA(ColorKt.m21027lerpjxsXWHM(textForegroundStyle.mo23331getColor0d7_KjU(), textForegroundStyle2.mo23331getColor0d7_KjU(), f10));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m23465modulateDxMtmZc(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : Color.m20975copywmQWz5c$default(j10, Color.m20978getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f10, Function0<Float> function0) {
        return Float.isNaN(f10) ? function0.invoke().floatValue() : f10;
    }
}

package androidx.compose.p011ui.text.style;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.text.SpanStyleKt;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "modulate", "Lkotlin/Function0;", "block", "takeOrElse", "(FLr6/a;)F", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "TextDrawStyleKt")
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    @NotNull
    public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle textForegroundStyle, @NotNull TextForegroundStyle textForegroundStyle2, float f) {
        boolean z8 = textForegroundStyle instanceof BrushStyle;
        return (z8 || (textForegroundStyle2 instanceof BrushStyle)) ? (z8 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f) : TextForegroundStyle.INSTANCE.m13210from8_81llA(ColorKt.m10733lerpjxsXWHM(textForegroundStyle.mo13075getColor0d7_KjU(), textForegroundStyle2.mo13075getColor0d7_KjU(), f));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m13209modulateDxMtmZc(long j7, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j7 : Color.m10681copywmQWz5c$default(j7, Color.m10684getAlphaimpl(j7) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f, InterfaceC6469a interfaceC6469a) {
        return Float.isNaN(f) ? ((Number) interfaceC6469a.invoke()).floatValue() : f;
    }
}

package androidx.compose.p006ui.text.style;

import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.text.SpanStyleKt;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a!\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m5175d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "TextDrawStyleKt")
/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle start, TextForegroundStyle stop, float f4) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        boolean z3 = start instanceof BrushStyle;
        return (z3 || (stop instanceof BrushStyle)) ? (z3 && (stop instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) start).getBrush(), ((BrushStyle) stop).getBrush(), f4), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), f4)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(start, stop, f4) : TextForegroundStyle.INSTANCE.m11450from8_81llA(ColorKt.m9229lerpjxsXWHM(start.mo11334getColor0d7_KjU(), stop.mo11334getColor0d7_KjU(), f4));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m11449modulateDxMtmZc(long j4, float f4) {
        return (Float.isNaN(f4) || f4 >= 1.0f) ? j4 : Color.m9177copywmQWz5c$default(j4, Color.m9180getAlphaimpl(j4) * f4, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f4, Function0<Float> function0) {
        return Float.isNaN(f4) ? function0.invoke().floatValue() : f4;
    }
}

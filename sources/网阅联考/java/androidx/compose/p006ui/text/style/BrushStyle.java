package androidx.compose.p006ui.text.style;

import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ShaderBrush;
import androidx.compose.p006ui.text.style.TextForegroundStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5175d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "value", "Landroidx/compose/ui/graphics/ShaderBrush;", "alpha", "", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "getValue", "()Landroidx/compose/ui/graphics/ShaderBrush;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public BrushStyle(ShaderBrush value, float f4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.alpha = f4;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i4 & 2) != 0) {
            f4 = brushStyle.getAlpha();
        }
        return brushStyle.copy(shaderBrush, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final ShaderBrush getValue() {
        return this.value;
    }

    public final float component2() {
        return getAlpha();
    }

    public final BrushStyle copy(ShaderBrush value, float alpha) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new BrushStyle(value, alpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return Intrinsics.areEqual(this.value, brushStyle.value) && Float.compare(getAlpha(), brushStyle.getAlpha()) == 0;
    }

    @Override // androidx.compose.p006ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p006ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.value;
    }

    @Override // androidx.compose.p006ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo11334getColor0d7_KjU() {
        return Color.INSTANCE.m9214getUnspecified0d7_KjU();
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.floatToIntBits(getAlpha());
    }

    @Override // androidx.compose.p006ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.m904a(this, textForegroundStyle);
    }

    @Override // androidx.compose.p006ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return TextForegroundStyle.CC.m905b(this, function0);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + getAlpha() + ')';
    }
}

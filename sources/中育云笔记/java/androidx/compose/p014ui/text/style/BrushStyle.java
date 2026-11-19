package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ShaderBrush;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public BrushStyle(ShaderBrush shaderBrush, float f10) {
        this.value = shaderBrush;
        this.alpha = f10;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i10 & 2) != 0) {
            f10 = brushStyle.alpha;
        }
        return brushStyle.copy(shaderBrush, f10);
    }

    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return this.alpha;
    }

    public final BrushStyle copy(ShaderBrush shaderBrush, float f10) {
        return new BrushStyle(shaderBrush, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return AbstractC9979u.m20289b(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.value;
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo33271getColor0d7_KjU() {
        return Color.Companion.m30914getUnspecified0d7_KjU();
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }
}

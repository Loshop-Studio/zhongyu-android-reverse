package androidx.compose.p014ui.graphics.painter;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class BrushPainter extends Painter {
    private float alpha = 1.0f;
    private final Brush brush;
    private ColorFilter colorFilter;

    public BrushPainter(Brush brush) {
        this.brush = brush;
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public boolean applyAlpha(float f10) {
        this.alpha = f10;
        return true;
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrushPainter) && AbstractC9979u.m20289b(this.brush, ((BrushPainter) obj).brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo31549getIntrinsicSizeNHjbRc() {
        return this.brush.mo30826getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m31422drawRectAsUm42w$default(drawScope, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}

package androidx.compose.p014ui.graphics.painter;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    public /* synthetic */ ColorPainter(long j10, AbstractC9972n abstractC9972n) {
        this(j10);
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
        return (obj instanceof ColorPainter) && Color.m30879equalsimpl0(this.color, ((ColorPainter) obj).color);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m31553getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo31549getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m30885hashCodeimpl(this.color);
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m31423drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m30886toStringimpl(this.color)) + ')';
    }

    private ColorPainter(long j10) {
        this.color = j10;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m30714getUnspecifiedNHjbRc();
    }
}

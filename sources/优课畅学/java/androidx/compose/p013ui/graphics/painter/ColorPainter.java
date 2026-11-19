package androidx.compose.p013ui.graphics.painter;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    public /* synthetic */ ColorPainter(long j10, AbstractC9126n abstractC9126n) {
        this(j10);
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyAlpha(float f10) {
        this.alpha = f10;
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorPainter) && Color.m24277equalsimpl0(this.color, ((ColorPainter) obj).color);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m24951getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo24947getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m24283hashCodeimpl(this.color);
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m24821drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m24284toStringimpl(this.color)) + ')';
    }

    private ColorPainter(long j10) {
        this.color = j10;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m24112getUnspecifiedNHjbRc();
    }
}

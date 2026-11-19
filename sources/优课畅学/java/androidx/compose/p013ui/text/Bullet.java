package androidx.compose.p013ui.text;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {
    public static final int $stable = 8;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long padding;
    private final Shape shape;
    private final long size;

    public /* synthetic */ Bullet(Shape shape, long j10, long j11, Brush brush, float f10, DrawStyle drawStyle, AbstractC9126n abstractC9126n) {
        this(shape, j10, j11, brush, f10, drawStyle);
    }

    /* renamed from: copy-1XB3EBo$default, reason: not valid java name */
    public static /* synthetic */ Bullet m26197copy1XB3EBo$default(Bullet bullet, Shape shape, long j10, long j11, Brush brush, float f10, DrawStyle drawStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i10 & 2) != 0) {
            j10 = bullet.size;
        }
        if ((i10 & 4) != 0) {
            j11 = bullet.padding;
        }
        if ((i10 & 8) != 0) {
            brush = bullet.brush;
        }
        if ((i10 & 16) != 0) {
            f10 = bullet.alpha;
        }
        if ((i10 & 32) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j12 = j11;
        return bullet.m26198copy1XB3EBo(shape, j10, j12, brush2, f10, drawStyle2);
    }

    /* renamed from: copy-1XB3EBo, reason: not valid java name */
    public final Bullet m26198copy1XB3EBo(Shape shape, long j10, long j11, Brush brush, float f10, DrawStyle drawStyle) {
        return new Bullet(shape, j10, j11, brush, f10, drawStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return AbstractC9133u.m16128b(this.shape, bullet.shape) && TextUnit.m27090equalsimpl0(this.size, bullet.size) && TextUnit.m27090equalsimpl0(this.padding, bullet.padding) && AbstractC9133u.m16128b(this.brush, bullet.brush) && this.alpha == bullet.alpha && AbstractC9133u.m16128b(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m26199getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-XSAIIZE, reason: not valid java name */
    public final long m26200getSizeXSAIIZE() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((this.shape.hashCode() * 31) + TextUnit.m27094hashCodeimpl(this.size)) * 31) + TextUnit.m27094hashCodeimpl(this.padding)) * 31;
        Brush brush = this.brush;
        return ((((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) TextUnit.m27100toStringimpl(this.size)) + ", padding=" + ((Object) TextUnit.m27100toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    private Bullet(Shape shape, long j10, long j11, Brush brush, float f10, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = j10;
        this.padding = j11;
        this.brush = brush;
        this.alpha = f10;
        this.drawStyle = drawStyle;
    }
}

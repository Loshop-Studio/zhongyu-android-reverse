package androidx.compose.p012ui.text;

import androidx.compose.p012ui.graphics.Brush;
import androidx.compose.p012ui.graphics.Shape;
import androidx.compose.p012ui.graphics.drawscope.DrawStyle;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m13413d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "Landroidx/compose/ui/unit/TextUnit;", "padding", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getPadding-XSAIIZE", "()J", "J", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSize-XSAIIZE", "copy", "copy-1XB3EBo", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/Bullet;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {
    public static final int $stable = 8;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long padding;
    private final Shape shape;
    private final long size;

    public /* synthetic */ Bullet(Shape shape, long j9, long j10, Brush brush, float f10, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j9, j10, brush, f10, drawStyle);
    }

    /* renamed from: copy-1XB3EBo$default, reason: not valid java name */
    public static /* synthetic */ Bullet m23293copy1XB3EBo$default(Bullet bullet, Shape shape, long j9, long j10, Brush brush, float f10, DrawStyle drawStyle, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i9 & 2) != 0) {
            j9 = bullet.size;
        }
        if ((i9 & 4) != 0) {
            j10 = bullet.padding;
        }
        if ((i9 & 8) != 0) {
            brush = bullet.brush;
        }
        if ((i9 & 16) != 0) {
            f10 = bullet.alpha;
        }
        if ((i9 & 32) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j11 = j10;
        return bullet.m23294copy1XB3EBo(shape, j9, j11, brush2, f10, drawStyle2);
    }

    /* renamed from: copy-1XB3EBo, reason: not valid java name */
    public final Bullet m23294copy1XB3EBo(Shape shape, long size, long padding, Brush brush, float alpha, DrawStyle drawStyle) {
        return new Bullet(shape, size, padding, brush, alpha, drawStyle, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Bullet)) {
            Bullet bullet = (Bullet) other;
            return Intrinsics.areEqual(this.shape, bullet.shape) && TextUnit.m24185equalsimpl0(this.size, bullet.size) && TextUnit.m24185equalsimpl0(this.padding, bullet.padding) && Intrinsics.areEqual(this.brush, bullet.brush) && this.alpha == bullet.alpha && Intrinsics.areEqual(this.drawStyle, bullet.drawStyle);
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

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name and from getter */
    public final long getPadding() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((this.shape.hashCode() * 31) + TextUnit.m24189hashCodeimpl(this.size)) * 31) + TextUnit.m24189hashCodeimpl(this.padding)) * 31;
        Brush brush = this.brush;
        return ((((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) TextUnit.m24195toStringimpl(this.size)) + ", padding=" + ((Object) TextUnit.m24195toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    private Bullet(Shape shape, long j9, long j10, Brush brush, float f10, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = j9;
        this.padding = j10;
        this.brush = brush;
        this.alpha = f10;
        this.drawStyle = drawStyle;
    }
}
